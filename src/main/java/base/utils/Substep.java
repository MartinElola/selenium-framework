package base.utils;

import dev.failsafe.function.CheckedRunnable;

public class Substep {

    public final CheckedRunnable runnable;

    public Substep(CheckedRunnable runnable){
        this.runnable = runnable;
    }

}
