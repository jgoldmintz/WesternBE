//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.process;

import java.io.InputStream;
import java.io.OutputStream;

public class StandardStream {
    public static final InputProvider STDIN;
    public static final OutputConsumer STDOUT;
    public static final ErrorConsumer STDERR;

    private StandardStream() {
    }

    static {
        STDIN = new Pipe(System.in, (OutputStream)null);
        STDOUT = new Pipe((InputStream)null, System.out);
        STDERR = new Pipe((InputStream)null, System.err);
    }
}
