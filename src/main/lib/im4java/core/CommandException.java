//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.core;

import java.util.ArrayList;

public class CommandException extends IM4JavaException {
    private ArrayList<String> iErrorText = new ArrayList();
    private int iReturnCode = -1;

    public CommandException() {
    }

    public CommandException(String var1) {
        super(var1);
    }

    public CommandException(String var1, Throwable var2) {
        super(var1, var2);
    }

    public CommandException(Throwable var1) {
        super(var1);
    }

    public ArrayList<String> getErrorText() {
        return this.iErrorText;
    }

    public void setErrorText(ArrayList<String> var1) {
        this.iErrorText = var1;
    }

    public int getReturnCode() {
        return this.iReturnCode;
    }

    public void setReturnCode(int var1) {
        this.iReturnCode = var1;
    }
}
