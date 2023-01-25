//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.script;

import java.io.File;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import org.im4java.core.ImageCommand;
import org.im4java.core.Operation;

public abstract class AbstractScriptGenerator implements ScriptGenerator {
    protected static final int LINE_SIZE = 78;
    protected char ESC_EOL;
    protected char ESC_SPECIAL;
    protected String iIndent = "";
    protected StringBuilder iLineBuffer = null;
    protected int iArgIndex = 0;
    private Properties iProps = null;
    private PrintWriter iWriter = null;
    private ImageCommand iCmd = null;
    private Operation iOp = null;

    public AbstractScriptGenerator() {
    }

    public void createScript() {
        this.iIndent = "";
        this.iArgIndex = 0;
        this.writeHeader();
        this.writeCommand();
        this.writeOperation();
        this.getWriter().flush();
    }

    protected void writeHeader() {
    }

    protected String getSearchPath() {
        String var1 = this.getProperties().getProperty("im4java.globalSearchPath");
        String var2 = this.getProperties().getProperty("im4java.localSearchPath");
        String var3 = null;
        if (var2.length() > 0 && var1.length() > 0) {
            var3 = var2 + File.pathSeparator + var1;
        } else if (var2.length() > 0 && var1.length() == 0) {
            var3 = var2;
        } else if (var1.length() > 0) {
            var3 = var1;
        }

        return var3;
    }

    protected void writeCommand() {
        PrintWriter var1 = this.getWriter();
        var1.print(this.iProps.getProperty("im4java.cmd"));
        var1.println(this.ESC_EOL);
        this.iIndent = this.iIndent + "  ";
    }

    protected String getScriptArg(String var1) {
        return null;
    }

    protected String quote(String var1) {
        return null;
    }

    protected void writeOperation() {
        LinkedList var1 = this.getOperation().getCmdArgs();
        this.iLineBuffer = new StringBuilder();
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();

        while(true) {
            while(var3.hasNext()) {
                String var4 = (String)var3.next();
                char var5 = var4.charAt(0);
                if (var5 != '-' && var5 != '+') {
                    if (var2.length() > 0) {
                        var2.append(" ");
                    }

                    if (var4.startsWith("?img?")) {
                        var2.append(this.getScriptArg(var4));
                    } else if (var5 == '(') {
                        this.flushBuffer(var2);
                        this.flushLine(false);
                        var2 = new StringBuilder("\"(\"");
                        this.flushBuffer(var2);
                        this.flushLine(false);
                        var2 = new StringBuilder();
                        this.iIndent = this.iIndent + "  ";
                    } else if (var5 == ')') {
                        this.flushBuffer(var2);
                        this.flushLine(false);
                        this.iIndent = this.iIndent.substring(0, this.iIndent.length() - 2);
                        var2 = new StringBuilder("\")\"");
                        this.flushBuffer(var2);
                        this.flushLine(false);
                        var2 = new StringBuilder();
                    } else {
                        var2.append(this.quote(var4));
                    }
                } else {
                    this.flushBuffer(var2);
                    var2 = new StringBuilder(var4);
                }
            }

            this.flushBuffer(var2);
            this.flushLine(true);
            return;
        }
    }

    private void flushBuffer(StringBuilder var1) {
        if (this.iIndent.length() + this.iLineBuffer.length() + var1.length() + 2 > 78) {
            this.flushLine(false);
            this.iLineBuffer.append(var1);
        } else {
            this.iLineBuffer.append(var1);
            this.iLineBuffer.append(" ");
        }

    }

    private void flushLine(boolean var1) {
        PrintWriter var2 = this.getWriter();
        var2.print(this.iIndent);
        var2.print(this.iLineBuffer.toString());
        if (var1) {
            var2.println("\n");
        } else {
            var2.println(this.ESC_EOL);
            this.iLineBuffer = new StringBuilder();
        }

    }

    public void init(PrintWriter var1, Operation var2, Properties var3) {
        this.iWriter = var1;
        this.iOp = var2;
        this.iProps = var3;
    }

    public PrintWriter getWriter() {
        return this.iWriter;
    }

    public Operation getOperation() {
        return this.iOp;
    }

    public Properties getProperties() {
        return this.iProps;
    }
}
