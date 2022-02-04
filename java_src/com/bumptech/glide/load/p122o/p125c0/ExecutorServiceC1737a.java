package com.bumptech.glide.load.p122o.p125c0;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.o.c0.a */
public final class ExecutorServiceC1737a implements ExecutorService {

    /* renamed from: a */
    private static final long f6810a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f6811b;

    /* renamed from: c */
    private final ExecutorService f6812c;

    /* renamed from: com.bumptech.glide.load.o.c0.a$a */
    public static final class C1738a {

        /* renamed from: a */
        private final boolean f6813a;

        /* renamed from: b */
        private int f6814b;

        /* renamed from: c */
        private int f6815c;

        /* renamed from: d */
        private AbstractC1741c f6816d = AbstractC1741c.f6827d;

        /* renamed from: e */
        private String f6817e;

        /* renamed from: f */
        private long f6818f;

        C1738a(boolean z) {
            this.f6813a = z;
        }

        /* renamed from: a */
        public ExecutorServiceC1737a mo7257a() {
            if (!TextUtils.isEmpty(this.f6817e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f6814b, this.f6815c, this.f6818f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC1739b(this.f6817e, this.f6816d, this.f6813a));
                if (this.f6818f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new ExecutorServiceC1737a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f6817e);
        }

        /* renamed from: b */
        public C1738a mo7258b(String str) {
            this.f6817e = str;
            return this;
        }

        /* renamed from: c */
        public C1738a mo7259c(int i) {
            this.f6814b = i;
            this.f6815c = i;
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.c0.a$b */
    public static final class ThreadFactoryC1739b implements ThreadFactory {

        /* renamed from: a */
        private final String f6819a;

        /* renamed from: b */
        final AbstractC1741c f6820b;

        /* renamed from: c */
        final boolean f6821c;

        /* renamed from: d */
        private int f6822d;

        /* renamed from: com.bumptech.glide.load.o.c0.a$b$a */
        class C1740a extends Thread {
            C1740a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC1739b.this.f6821c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    ThreadFactoryC1739b.this.f6820b.mo7262a(th);
                }
            }
        }

        ThreadFactoryC1739b(String str, AbstractC1741c cVar, boolean z) {
            this.f6819a = str;
            this.f6820b = cVar;
            this.f6821c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C1740a aVar;
            aVar = new C1740a(runnable, "glide-" + this.f6819a + "-thread-" + this.f6822d);
            this.f6822d = this.f6822d + 1;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c0.a$c */
    public interface AbstractC1741c {

        /* renamed from: a */
        public static final AbstractC1741c f6824a = new C1742a();

        /* renamed from: b */
        public static final AbstractC1741c f6825b;

        /* renamed from: c */
        public static final AbstractC1741c f6826c = new C1744c();

        /* renamed from: d */
        public static final AbstractC1741c f6827d;

        /* renamed from: com.bumptech.glide.load.o.c0.a$c$a */
        class C1742a implements AbstractC1741c {
            C1742a() {
            }

            @Override // com.bumptech.glide.load.p122o.p125c0.ExecutorServiceC1737a.AbstractC1741c
            /* renamed from: a */
            public void mo7262a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.o.c0.a$c$b */
        class C1743b implements AbstractC1741c {
            C1743b() {
            }

            @Override // com.bumptech.glide.load.p122o.p125c0.ExecutorServiceC1737a.AbstractC1741c
            /* renamed from: a */
            public void mo7262a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.o.c0.a$c$c */
        class C1744c implements AbstractC1741c {
            C1744c() {
            }

            @Override // com.bumptech.glide.load.p122o.p125c0.ExecutorServiceC1737a.AbstractC1741c
            /* renamed from: a */
            public void mo7262a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C1743b bVar = new C1743b();
            f6825b = bVar;
            f6827d = bVar;
        }

        /* renamed from: a */
        void mo7262a(Throwable th);
    }

    ExecutorServiceC1737a(ExecutorService executorService) {
        this.f6812c = executorService;
    }

    /* renamed from: a */
    public static int m8169a() {
        if (f6811b == 0) {
            f6811b = Math.min(4, C1745b.m8184a());
        }
        return f6811b;
    }

    /* renamed from: b */
    public static C1738a m8170b() {
        return new C1738a(true).mo7259c(m8169a() >= 4 ? 2 : 1).mo7258b("animation");
    }

    /* renamed from: c */
    public static ExecutorServiceC1737a m8171c() {
        return m8170b().mo7257a();
    }

    /* renamed from: d */
    public static C1738a m8172d() {
        return new C1738a(true).mo7259c(1).mo7258b("disk-cache");
    }

    /* renamed from: e */
    public static ExecutorServiceC1737a m8173e() {
        return m8172d().mo7257a();
    }

    /* renamed from: f */
    public static C1738a m8174f() {
        return new C1738a(false).mo7259c(m8169a()).mo7258b("source");
    }

    /* renamed from: g */
    public static ExecutorServiceC1737a m8175g() {
        return m8174f().mo7257a();
    }

    /* renamed from: h */
    public static ExecutorServiceC1737a m8176h() {
        return new ExecutorServiceC1737a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f6810a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC1739b("source-unlimited", AbstractC1741c.f6827d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f6812c.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f6812c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f6812c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f6812c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f6812c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.f6812c.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f6812c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f6812c.isTerminated();
    }

    public void shutdown() {
        this.f6812c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f6812c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f6812c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f6812c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f6812c.submit(callable);
    }

    public String toString() {
        return this.f6812c.toString();
    }
}
