//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.script;

import java.io.PrintWriter;
import java.util.Properties;
import org.im4java.core.Operation;

public interface ScriptGenerator {
    void init(PrintWriter var1, Operation var2, Properties var3);

    void createScript();
}
