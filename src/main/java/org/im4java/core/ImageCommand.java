//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.core;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import org.im4java.process.ErrorConsumer;
import org.im4java.process.ProcessStarter;
import org.im4java.process.ProcessTask;
import org.im4java.process.StandardStream;
import org.im4java.script.BashScriptGenerator;
import org.im4java.script.CmdScriptGenerator;
import org.im4java.script.ScriptGenerator;

public class ImageCommand extends ProcessStarter implements ErrorConsumer {
    private LinkedList<String> iCommands;
    private ArrayList<String> iErrorText;
    private LinkedList<String> iTmpFiles;
    private static ScriptGenerator iDefaultScriptGenerator;
    private ScriptGenerator iScriptGenerator;

    public ImageCommand() {
        this.iScriptGenerator = null;
        this.iCommands = new LinkedList();
        this.iTmpFiles = new LinkedList();
        this.setOutputConsumer(StandardStream.STDOUT);
        this.setErrorConsumer(this);
    }

    public ImageCommand(String... var1) {
        this();
        this.setCommand(var1);
    }

    public void setCommand(String... var1) {
        String[] var2 = var1;
        int var3 = var1.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            this.iCommands.add(var5);
        }

    }

    public LinkedList<String> getCommand() {
        return this.iCommands;
    }

    public ArrayList<String> getErrorText() {
        return this.iErrorText;
    }

    private LinkedList<String> prepareArguments(Operation var1, Object... var2) throws IOException, IM4JavaException {
        LinkedList var3 = new LinkedList(var1.getCmdArgs());
        var3.addAll(0, this.iCommands);
        this.resolveImages(var3, var2);
        this.resolveDynamicOperations(var1, var3, var2);
        return var3;
    }

    public void run(Operation var1, Object... var2) throws IOException, InterruptedException, IM4JavaException {
        LinkedList var3 = this.prepareArguments(var1, var2);

        try {
            this.run(var3);
        } catch (Exception var6) {
            this.removeTmpFiles();
            CommandException var5 = new CommandException(var6);
            var5.fillInStackTrace();
            throw var5;
        }
    }

    public ProcessTask getProcessTask(Operation var1, Object... var2) throws IOException, IM4JavaException {
        LinkedList var3 = this.prepareArguments(var1, var2);
        return this.getProcessTask(var3);
    }

    protected void finished(int var1) throws Exception {
        if (var1 > 0) {
            CommandException var2;
            if (this.iErrorText.size() > 0) {
                var2 = new CommandException((String)this.iErrorText.get(0));
            } else {
                var2 = new CommandException("return code: " + var1);
            }

            var2.setErrorText(this.iErrorText);
            var2.setReturnCode(var1);
            throw var2;
        } else {
            this.removeTmpFiles();
        }
    }

    private void resolveImages(LinkedList<String> var1, Object... var2) throws IOException {
        ListIterator var3 = var1.listIterator();
        int var4 = 0;
        boolean var5 = false;
        String var6 = null;
        Object[] var7 = var2;
        int var8 = var2.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            Object var10 = var7[var9];
            var5 = false;

            while(var3.hasNext()) {
                var6 = (String)var3.next();
                if (var6.startsWith("?img?")) {
                    var5 = true;
                    break;
                }
            }

            if (!var5) {
                throw new IllegalArgumentException("more argument images than placeholders!");
            }

            String var11;
            if (var10 instanceof String) {
                if (var6.length() == "?img?".length()) {
                    var3.set((String)var10);
                } else {
                    var11 = var6.substring("?img?".length());
                    var3.set((String)var10 + var11);
                }
            } else {
                if (!(var10 instanceof BufferedImage)) {
                    throw new IllegalArgumentException(var10.getClass().getName() + " is an unsupported image-type");
                }

                var11 = this.convert2TmpFile((BufferedImage)var10);
                var3.set(var11);
                this.iTmpFiles.add(var11);
            }

            ++var4;
        }

    }

    private void resolveDynamicOperations(Operation var1, LinkedList<String> var2, Object... var3) throws IM4JavaException {
        ListIterator var4 = var2.listIterator();
        ListIterator var5 = var1.getDynamicOperations().listIterator();

        while(true) {
            while(var5.hasNext()) {
                DynamicOperation var6 = (DynamicOperation)var5.next();
                Operation var7 = var6.resolveOperation(var3);

                while(var4.hasNext() && !((String)var4.next()).equals("?dop?")) {
                }

                if (var7 == null) {
                    var4.remove();
                } else {
                    LinkedList var8 = var6.resolveOperation(var3).getCmdArgs();
                    if (var8 == null) {
                        var4.remove();
                    } else {
                        var4.remove();
                        Iterator var9 = var8.iterator();

                        while(var9.hasNext()) {
                            String var10 = (String)var9.next();
                            var4.add(var10);
                        }
                    }
                }
            }

            return;
        }
    }

    public void consumeError(InputStream var1) throws IOException {
        InputStreamReader var2 = new InputStreamReader(var1);
        BufferedReader var3 = new BufferedReader(var2);
        this.iErrorText = new ArrayList();

        String var4;
        while((var4 = var3.readLine()) != null) {
            this.iErrorText.add(var4);
        }

        var3.close();
        var2.close();
    }

    private String getTmpFile() throws IOException {
        File var1 = File.createTempFile("im4java-", ".png");
        var1.deleteOnExit();
        return var1.getAbsolutePath();
    }

    private String convert2TmpFile(BufferedImage var1) throws IOException {
        String var2 = this.getTmpFile();
        ImageTypeSpecifier var3 = ImageTypeSpecifier.createFromRenderedImage(var1);
        Iterator var4 = ImageIO.getImageWriters(var3, "TIFF");
        if (!var4.hasNext()) {
            var4 = ImageIO.getImageWriters(var3, "PNG");
        }

        if (var4.hasNext()) {
            ImageWriter var5 = (ImageWriter)var4.next();
            FileImageOutputStream var6 = new FileImageOutputStream(new File(var2));
            var5.setOutput(var6);
            var5.write(var1);
            var6.close();
            var5.dispose();
        }

        return var2;
    }

    private void removeTmpFiles() {
        Iterator var1 = this.iTmpFiles.iterator();

        while(var1.hasNext()) {
            String var2 = (String)var1.next();

            try {
                (new File(var2)).delete();
            } catch (Exception var4) {
            }
        }

    }

    public static void setDefaultScriptGenerator(ScriptGenerator var0) {
        iDefaultScriptGenerator = var0;
    }

    public void setScriptGenerator(ScriptGenerator var1) {
        this.iScriptGenerator = var1;
    }

    public void createScript(PrintWriter var1, Operation var2, Properties var3) {
        ScriptGenerator var4 = this.iScriptGenerator;
        if (var4 == null) {
            var4 = iDefaultScriptGenerator;
        }

        StringBuilder var5 = new StringBuilder();
        Iterator var6 = this.getCommand().iterator();

        String var7;
        while(var6.hasNext()) {
            var7 = (String)var6.next();
            var5.append(var7).append(' ');
        }

        var3.setProperty("im4java.cmd", var5.toString());
        String var8 = getGlobalSearchPath();
        if (var8 == null) {
            var8 = "";
        }

        var7 = this.getSearchPath();
        if (var7 == null) {
            var7 = "";
        }

        var3.setProperty("im4java.globalSearchPath", var8);
        var3.setProperty("im4java.localSearchPath", var7);
        var4.init(var1, var2, var3);
        var4.createScript();
    }

    public void createScript(String var1, Operation var2, Properties var3) throws FileNotFoundException {
        if (System.getProperty("os.name").startsWith("Windows")) {
            var1 = var1 + ".cmd";
        }

        PrintWriter var4 = new PrintWriter(var1);
        this.createScript(var4, var2, var3);
        var4.close();
    }

    public void createScript(String var1, Operation var2) throws FileNotFoundException {
        this.createScript(var1, var2, new Properties());
    }

    static {
        if (System.getProperty("os.name").startsWith("Windows")) {
            iDefaultScriptGenerator = new CmdScriptGenerator();
        } else {
            iDefaultScriptGenerator = new BashScriptGenerator();
        }

    }
}
