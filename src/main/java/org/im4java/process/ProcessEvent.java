//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.process;

public class ProcessEvent {
    private Process iProcess;
    private int iPID;
    private ProcessStarter iProcessStarter;
    private int iReturnCode = Integer.MIN_VALUE;
    private Exception iException = null;

    public ProcessEvent(int var1, ProcessStarter var2) {
        this.iPID = var1;
        this.iProcessStarter = var2;
    }

    public void setReturnCode(int var1) {
        this.iReturnCode = var1;
    }

    public int getReturnCode() {
        return this.iReturnCode;
    }

    public void setProcess(Process var1) {
        this.iProcess = var1;
    }

    public Process getProcess() {
        return this.iProcess;
    }

    public void setException(Exception var1) {
        this.iException = var1;
    }

    public Exception getException() {
        return this.iException;
    }

    public int getPID() {
        return this.iPID;
    }

    public ProcessStarter getProcessStarter() {
        return this.iProcessStarter;
    }
}
