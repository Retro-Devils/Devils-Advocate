package p069c.p073b.p074a.p075a.p089g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: c.b.a.a.g.f */
public final class C1378f {

    /* renamed from: a */
    public static final Executor f5653a = new ExecutorC1379a();

    /* renamed from: b */
    static final Executor f5654b = new ExecutorC1386m();

    /* renamed from: c.b.a.a.g.f$a */
    private static final class ExecutorC1379a implements Executor {

        /* renamed from: a */
        private final Handler f5655a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f5655a.post(runnable);
        }
    }
}
