//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Operation {
    public static final String IMG_PLACEHOLDER = "?img?";
    static final String DOP_PLACEHOLDER = "?dop?";
    LinkedList<String> iCmdArgs = null;
    private LinkedList<DynamicOperation> iDynamicOperations = null;

    public Operation() {
        this.iCmdArgs = new LinkedList();
        this.iDynamicOperations = new LinkedList();
    }

    public String toString() {
        StringBuffer var1 = new StringBuffer();
        Iterator var2 = this.iCmdArgs.iterator();

        while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.append(var3).append(" ");
        }

        return var1.toString();
    }

    public Operation cloneObject() {
        Operation var1 = new Operation();
        var1.getCmdArgs().addAll(this.iCmdArgs);
        return var1;
    }

    public Operation addRawArgs(String... var1) {
        String[] var2 = var1;
        int var3 = var1.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            this.iCmdArgs.add(var5);
        }

        return this;
    }

    public Operation addRawArgs(List<String> var1) {
        this.iCmdArgs.addAll(var1);
        return this;
    }

    public LinkedList<String> getCmdArgs() {
        return this.iCmdArgs;
    }

    public Operation addImage(String... var1) {
        String[] var2 = var1;
        int var3 = var1.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            if (var5 != null) {
                if (var5.charAt(0) == '[' && var5.charAt(var5.length() - 1) == ']') {
                    this.iCmdArgs.add("?img?" + var5);
                } else {
                    this.iCmdArgs.add(var5);
                }
            }
        }

        return this;
    }

    public Operation addImage() {
        return this.addImage(1);
    }

    public Operation addImage(int var1) {
        for(int var2 = 0; var2 < var1; ++var2) {
            this.iCmdArgs.add("?img?");
        }

        return this;
    }

    public Operation addOperation(Operation var1) {
        return this.addRawArgs((List)var1.getCmdArgs());
    }

    public Operation addDynamicOperation(DynamicOperation var1) {
        this.iDynamicOperations.add(var1);
        this.iCmdArgs.add("?dop?");
        return this;
    }

    public LinkedList<DynamicOperation> getDynamicOperations() {
        return this.iDynamicOperations;
    }
}
