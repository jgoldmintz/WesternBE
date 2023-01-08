//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.im4java.process;

import java.util.LinkedList;
import java.util.concurrent.FutureTask;

public class ProcessTask extends FutureTask<ProcessEvent> {
    private ProcessStarter iProcessStarter;
    private ProcessEvent iProcessEvent;

    public ProcessTask(final ProcessStarter var1, final LinkedList<String> var2, final ProcessEvent var3) {
        super(new Runnable() {
            public void run() {
                var1.runAndNotify(var2, var3);
            }
        }, var3);
        this.iProcessStarter = var1;
        this.iProcessEvent = var3;
    }

    public ProcessStarter getProcessStarter() {
        return this.iProcessStarter;
    }

    public boolean cancel(boolean var1) {
        if (this.isDone()) {
            return super.cancel(var1);
        } else {
            Process var2 = this.iProcessEvent.getProcess();
            if (var2 != null) {
                var2.destroy();
            }

            return super.cancel(var1);
        }
    }
}
