package org.im4java.core;

public class IMOperation extends IMOps {
    public IMOperation() {
    }

    public IMOperation openOperation() {
        return (IMOperation)this.addRawArgs(new String[]{"("});
    }

    public IMOperation closeOperation() {
        return (IMOperation)this.addRawArgs(new String[]{")"});
    }

    public IMOperation addSubOperation(Operation var1) {
        this.openOperation();
        this.addRawArgs(var1.getCmdArgs());
        return this.closeOperation();
    }

    public IMOperation appendHorizontally() {
        this.p_append();
        return this;
    }

    public IMOperation appendVertically() {
        this.append();
        return this;
    }

    public IMOperation haldClut(String var1) {
        this.addImage(var1);
        return (IMOperation)this.haldClut();
    }
}
