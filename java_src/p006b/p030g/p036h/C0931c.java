package p006b.p030g.p036h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: b.g.h.c */
public class C0931c {

    /* renamed from: a */
    private final Object f4590a = new Object();

    /* renamed from: b */
    private HandlerThread f4591b;

    /* renamed from: c */
    private Handler f4592c;

    /* renamed from: d */
    private int f4593d;

    /* renamed from: e */
    private Handler.Callback f4594e = new C0932a();

    /* renamed from: f */
    private final int f4595f;

    /* renamed from: g */
    private final int f4596g;

    /* renamed from: h */
    private final String f4597h;

    /* renamed from: b.g.h.c$a */
    class C0932a implements Handler.Callback {
        C0932a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0931c.this.mo5346a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0931c.this.mo5347b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.h.c$b */
    public class RunnableC0933b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f4599b;

        /* renamed from: c */
        final /* synthetic */ Handler f4600c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0936d f4601d;

        /* renamed from: b.g.h.c$b$a */
        class RunnableC0934a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f4603b;

            RunnableC0934a(Object obj) {
                this.f4603b = obj;
            }

            public void run() {
                RunnableC0933b.this.f4601d.mo5334a(this.f4603b);
            }
        }

        RunnableC0933b(Callable callable, Handler handler, AbstractC0936d dVar) {
            this.f4599b = callable;
            this.f4600c = handler;
            this.f4601d = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f4599b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f4600c.post(new RunnableC0934a(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.h.c$c */
    public class RunnableC0935c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f4605b;

        /* renamed from: c */
        final /* synthetic */ Callable f4606c;

        /* renamed from: d */
        final /* synthetic */ ReentrantLock f4607d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f4608e;

        /* renamed from: f */
        final /* synthetic */ Condition f4609f;

        RunnableC0935c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f4605b = atomicReference;
            this.f4606c = callable;
            this.f4607d = reentrantLock;
            this.f4608e = atomicBoolean;
            this.f4609f = condition;
        }

        public void run() {
            try {
                this.f4605b.set(this.f4606c.call());
            } catch (Exception unused) {
            }
            this.f4607d.lock();
            try {
                this.f4608e.set(false);
                this.f4609f.signal();
            } finally {
                this.f4607d.unlock();
            }
        }
    }

    /* renamed from: b.g.h.c$d */
    public interface AbstractC0936d<T> {
        /* renamed from: a */
        void mo5334a(T t);
    }

    public C0931c(String str, int i, int i2) {
        this.f4597h = str;
        this.f4596g = i;
        this.f4595f = i2;
        this.f4593d = 0;
    }

    /* renamed from: c */
    private void m5424c(Runnable runnable) {
        synchronized (this.f4590a) {
            if (this.f4591b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f4597h, this.f4596g);
                this.f4591b = handlerThread;
                handlerThread.start();
                this.f4592c = new Handler(this.f4591b.getLooper(), this.f4594e);
                this.f4593d++;
            }
            this.f4592c.removeMessages(0);
            Handler handler = this.f4592c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5346a() {
        synchronized (this.f4590a) {
            if (!this.f4592c.hasMessages(1)) {
                this.f4591b.quit();
                this.f4591b = null;
                this.f4592c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5347b(Runnable runnable) {
        runnable.run();
        synchronized (this.f4590a) {
            this.f4592c.removeMessages(0);
            Handler handler = this.f4592c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f4595f);
        }
    }

    /* renamed from: d */
    public <T> void mo5348d(Callable<T> callable, AbstractC0936d<T> dVar) {
        m5424c(new RunnableC0933b(callable, new Handler(), dVar));
    }

    /* renamed from: e */
    public <T> T mo5349e(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m5424c(new RunnableC0935c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
