//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.process;

import java.io.IOException;
import java.io.InputStream;

public interface ErrorConsumer {
    void consumeError(InputStream var1) throws IOException;
}
