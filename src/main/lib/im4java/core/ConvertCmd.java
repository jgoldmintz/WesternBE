package org.im4java.core;

public class ConvertCmd extends ImageCommand {
    public ConvertCmd() {
        if (!Boolean.getBoolean("im4java.useGM")) {
            this.setCommand("convert");
        } else {
            this.setCommand("gm", "convert");
        }

    }

    public ConvertCmd(boolean var1) {
        if (var1) {
            this.setCommand("gm", "convert");
        } else {
            this.setCommand("convert");
        }

    }
}
