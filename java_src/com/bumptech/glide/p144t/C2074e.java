package com.bumptech.glide.p144t;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.t.e */
public final class C2074e {

    /* renamed from: a */
    private static final Executor f7587a = new ExecutorC2075a();

    /* renamed from: b */
    private static final Executor f7588b = new ExecutorC2076b();

    /* renamed from: com.bumptech.glide.t.e$a */
    class ExecutorC2075a implements Executor {

        /* renamed from: a */
        private final Handler f7589a = new Handler(Looper.getMainLooper());

        ExecutorC2075a() {
        }

        public void execute(Runnable runnable) {
            this.f7589a.post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.t.e$b */
    class ExecutorC2076b implements Executor {
        ExecutorC2076b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m9413a() {
        return f7588b;
    }

    /* renamed from: b */
    public static Executor m9414b() {
        return f7587a;
    }
}
