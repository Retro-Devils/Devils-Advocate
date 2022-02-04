package p006b.p015b.p016a.p017a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.b.a.a.b */
public class C0801b extends AbstractC0803c {

    /* renamed from: a */
    private final Object f4009a = new Object();

    /* renamed from: b */
    private final ExecutorService f4010b = Executors.newFixedThreadPool(2, new ThreadFactoryC0802a());

    /* renamed from: c */
    private volatile Handler f4011c;

    /* renamed from: b.b.a.a.b$a */
    class ThreadFactoryC0802a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f4012a = new AtomicInteger(0);

        ThreadFactoryC0802a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f4012a.getAndIncrement())));
            return thread;
        }
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: a */
    public void mo4748a(Runnable runnable) {
        this.f4010b.execute(runnable);
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: b */
    public boolean mo4749b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: c */
    public void mo4750c(Runnable runnable) {
        if (this.f4011c == null) {
            synchronized (this.f4009a) {
                if (this.f4011c == null) {
                    this.f4011c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f4011c.post(runnable);
    }
}
