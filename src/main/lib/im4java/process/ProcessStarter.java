//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.process;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcessStarter {
    public static final int BUFFER_SIZE = 65536;
    private static String iGlobalSearchPath = null;
    private String iSearchPath = null;
    private static AtomicInteger iPIDCounter = new AtomicInteger(0);
    private int iPID;
    private InputProvider iInputProvider = null;
    private OutputConsumer iOutputConsumer = null;
    private ErrorConsumer iErrorConsumer = null;
    private boolean iAsyncMode = false;
    private LinkedList<ProcessListener> iProcessListener = new LinkedList();
    private LinkedList<ProcessEventListener> iProcessEventListener = new LinkedList();

    protected ProcessStarter() {
        this.iPID = iPIDCounter.getAndAdd(1);
    }

    public void setInputProvider(InputProvider var1) {
        this.iInputProvider = var1;
    }

    public void setOutputConsumer(OutputConsumer var1) {
        this.iOutputConsumer = var1;
    }

    public void setErrorConsumer(ErrorConsumer var1) {
        this.iErrorConsumer = var1;
    }

    public void addProcessEventListener(ProcessEventListener var1) {
        this.iProcessEventListener.add(var1);
    }

    public void removeProcessEventListener(ProcessEventListener var1) {
        this.iProcessEventListener.remove(var1);
    }

    /** @deprecated */
    public void addProcessListener(ProcessListener var1) {
        this.iProcessListener.add(var1);
    }

    private void processInput(OutputStream var1) throws IOException {
        final BufferedOutputStream var2 = new BufferedOutputStream(var1, 65536);
        (new Thread() {
            public void run() {
                try {
                    ProcessStarter.this.iInputProvider.provideInput(var2);
                } catch (IOException var2x) {
                }

            }
        }).run();
        var2.close();
        if (var1 != null) {
            var1.close();
        }

    }

    private void processOutput(InputStream var1, OutputConsumer var2) throws IOException {
        BufferedInputStream var3 = new BufferedInputStream(var1, 65536);
        var2.consumeOutput(var3);
        var3.close();
        if (var1 != null) {
            var1.close();
        }

    }

    private void processError(InputStream var1, ErrorConsumer var2) throws IOException {
        BufferedInputStream var3 = new BufferedInputStream(var1, 65536);
        var2.consumeError(var3);
        var3.close();
        if (var1 != null) {
            var1.close();
        }

    }

    protected int run(LinkedList<String> var1) throws IOException, InterruptedException, Exception {
        if (!this.iAsyncMode) {
            Process var4 = this.startProcess(var1);
            int var3 = this.waitForProcess(var4);
            this.finished(var3);
            return var3;
        } else {
            ProcessTask var2 = this.getProcessTask(var1);
            (new Thread(var2)).start();
            return 0;
        }
    }

    protected ProcessTask getProcessTask(LinkedList<String> var1) {
        ProcessEvent var2 = new ProcessEvent(this.iPID, this);
        var2.setReturnCode(-1);
        Iterator var3 = this.iProcessEventListener.iterator();

        while(var3.hasNext()) {
            ProcessEventListener var4 = (ProcessEventListener)var3.next();
            var4.processInitiated(var2);
        }

        return new ProcessTask(this, var1, var2);
    }

    void runAndNotify(LinkedList<String> var1, ProcessEvent var2) {
        try {
            Process var9 = this.startProcess(var1);
            var2.setProcess(var9);
            Iterator var5 = this.iProcessEventListener.iterator();

            while(var5.hasNext()) {
                ProcessEventListener var6 = (ProcessEventListener)var5.next();
                var6.processStarted(var2);
            }

            var5 = this.iProcessListener.iterator();

            while(var5.hasNext()) {
                ProcessListener var13 = (ProcessListener)var5.next();
                var13.processStarted(var9);
            }

            int var3 = this.waitForProcess(var9);
            var2.setReturnCode(var3);
            this.finished(var3);
        } catch (Exception var8) {
            Exception var4 = var8;
            var2.setException(var8);

            try {
                this.finished(var4);
            } catch (Exception var7) {
                var2.setException(var7);
            }
        }

        Iterator var10 = this.iProcessEventListener.iterator();

        while(var10.hasNext()) {
            ProcessEventListener var11 = (ProcessEventListener)var10.next();
            var11.processTerminated(var2);
        }

        var10 = this.iProcessListener.iterator();

        while(var10.hasNext()) {
            ProcessListener var12 = (ProcessListener)var10.next();
            var12.processTerminated(var2);
        }

    }

    private Process startProcess(LinkedList<String> var1) throws IOException, InterruptedException {
        String var2;
        if (this.iSearchPath != null) {
            var2 = (String)var1.getFirst();
            var2 = this.searchForCmd(var2, this.iSearchPath);
            var1.set(0, var2);
        } else if (iGlobalSearchPath != null) {
            var2 = (String)var1.getFirst();
            var2 = this.searchForCmd(var2, iGlobalSearchPath);
            var1.set(0, var2);
        }

        ProcessBuilder var3 = new ProcessBuilder(var1);
        return var3.start();
    }

    private int waitForProcess(final Process var1) throws IOException, InterruptedException {
        FutureTask var2 = null;
        FutureTask var3 = null;
        if (this.iInputProvider != null) {
            this.processInput(var1.getOutputStream());
        }

        if (this.iOutputConsumer != null) {
            var2 = new FutureTask(new Callable<Object>() {
                public Object call() throws IOException {
                    ProcessStarter.this.processOutput(var1.getInputStream(), ProcessStarter.this.iOutputConsumer);
                    return null;
                }
            });
            (new Thread(var2)).start();
        }

        if (this.iErrorConsumer != null) {
            var3 = new FutureTask(new Callable<Object>() {
                public Object call() throws IOException {
                    ProcessStarter.this.processError(var1.getErrorStream(), ProcessStarter.this.iErrorConsumer);
                    return null;
                }
            });
            (new Thread(var3)).start();
        }

        try {
            if (var2 != null) {
                var2.get();
            }

            if (var3 != null) {
                var3.get();
            }
        } catch (ExecutionException var7) {
            Throwable var5 = var7.getCause();
            if (var5 instanceof IOException) {
                throw (IOException)var5;
            }

            if (var5 instanceof RuntimeException) {
                throw (RuntimeException)var5;
            }

            throw new IllegalStateException(var7);
        }

        var1.waitFor();
        int var4 = var1.exitValue();

        try {
            var1.getInputStream().close();
            var1.getOutputStream().close();
            var1.getErrorStream().close();
        } catch (Exception var6) {
        }

        return var4;
    }

    public void setAsyncMode(boolean var1) {
        this.iAsyncMode = var1;
    }

    public boolean isAsyncMode() {
        return this.iAsyncMode;
    }

    public static void setGlobalSearchPath(String var0) {
        iGlobalSearchPath = var0;
    }

    public static String getGlobalSearchPath() {
        return iGlobalSearchPath;
    }

    public void setSearchPath(String var1) {
        this.iSearchPath = var1;
    }

    public String getSearchPath() {
        return this.iSearchPath;
    }

    public static void setPIDCounter(int var0) {
        iPIDCounter.set(var0);
    }

    public void setPID(int var1) {
        this.iPID = var1;
    }

    public int getPID() {
        return this.iPID;
    }

    protected void finished(int var1) throws Exception {
    }

    protected void finished(Exception var1) throws Exception {
    }

    public String searchForCmd(String var1, String var2) throws IOException, FileNotFoundException {
        if ((new File(var1)).isAbsolute()) {
            return var1;
        } else {
            boolean var3 = File.pathSeparator.equals(";");
            String[] var4 = var2.split(File.pathSeparator);

            for(int var5 = 0; var5 < var4.length; ++var5) {
                File var6;
                if (var3) {
                    var6 = new File(var4[var5], var1 + ".exe");
                    if (var6.exists()) {
                        return var6.getCanonicalPath();
                    }

                    var6 = new File(var4[var5], var1 + ".cmd");
                    if (var6.exists()) {
                        return var6.getCanonicalPath();
                    }

                    var6 = new File(var4[var5], var1 + ".bat");
                    if (var6.exists()) {
                        return var6.getCanonicalPath();
                    }
                } else {
                    var6 = new File(var4[var5], var1);
                    if (var6.exists()) {
                        return var6.getCanonicalPath();
                    }
                }
            }

            throw new FileNotFoundException(var1);
        }
    }

    static {
        iGlobalSearchPath = System.getenv("IM4JAVA_TOOLPATH");
    }
}
