//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.process;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Pipe implements InputProvider, OutputConsumer, ErrorConsumer {
    public static final int BUFFER_SIZE = 65536;
    private InputStream iSource;
    private OutputStream iSink;

    public Pipe(InputStream var1, OutputStream var2) {
        this.iSource = var1;
        this.iSink = var2;
    }

    public void provideInput(OutputStream var1) throws IOException {
        this.copyBytes(this.iSource, var1);
    }

    public void consumeOutput(InputStream var1) throws IOException {
        if (this.iSink != null) {
            this.copyBytes(var1, this.iSink);
        }

    }

    public void consumeError(InputStream var1) throws IOException {
        if (this.iSink != null) {
            this.copyBytes(var1, this.iSink);
        }

    }

    private void copyBytes(InputStream var1, OutputStream var2) throws IOException {
        byte[] var3 = new byte[65536];

        while(true) {
            int var4 = var1.read(var3);
            if (var4 == -1) {
                var2.flush();
                return;
            }

            synchronized(var2) {
                var2.write(var3, 0, var4);
            }
        }
    }
}
