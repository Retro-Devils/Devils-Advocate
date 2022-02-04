package com.bumptech.glide.load.p122o;

import android.os.Process;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.p122o.C1785p;
import com.bumptech.glide.p144t.C2081j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.a */
public final class C1683a {

    /* renamed from: a */
    private final boolean f6701a;

    /* renamed from: b */
    private final Executor f6702b;

    /* renamed from: c */
    final Map<AbstractC1643g, C1688d> f6703c;

    /* renamed from: d */
    private final ReferenceQueue<C1785p<?>> f6704d;

    /* renamed from: e */
    private C1785p.AbstractC1786a f6705e;

    /* renamed from: f */
    private volatile boolean f6706f;

    /* renamed from: g */
    private volatile AbstractC1687c f6707g;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    class ThreadFactoryC1684a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.o.a$a$a */
        class RunnableC1685a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Runnable f6708b;

            RunnableC1685a(Runnable runnable) {
                this.f6708b = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f6708b.run();
            }
        }

        ThreadFactoryC1684a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC1685a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$b */
    class RunnableC1686b implements Runnable {
        RunnableC1686b() {
        }

        public void run() {
            C1683a.this.mo7144b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.a$c */
    public interface AbstractC1687c {
        /* renamed from: a */
        void mo7152a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.a$d */
    public static final class C1688d extends WeakReference<C1785p<?>> {

        /* renamed from: a */
        final AbstractC1643g f6711a;

        /* renamed from: b */
        final boolean f6712b;

        /* renamed from: c */
        AbstractC1794v<?> f6713c;

        C1688d(AbstractC1643g gVar, C1785p<?> pVar, ReferenceQueue<? super C1785p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            this.f6711a = (AbstractC1643g) C2081j.m9432d(gVar);
            this.f6713c = (!pVar.mo7362g() || !z) ? null : (AbstractC1794v) C2081j.m9432d(pVar.mo7360e());
            this.f6712b = pVar.mo7362g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7153a() {
            this.f6713c = null;
            clear();
        }
    }

    C1683a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC1684a()));
    }

    C1683a(boolean z, Executor executor) {
        this.f6703c = new HashMap();
        this.f6704d = new ReferenceQueue<>();
        this.f6701a = z;
        this.f6702b = executor;
        executor.execute(new RunnableC1686b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7143a(AbstractC1643g gVar, C1785p<?> pVar) {
        C1688d put = this.f6703c.put(gVar, new C1688d(gVar, pVar, this.f6704d, this.f6701a));
        if (put != null) {
            put.mo7153a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7144b() {
        while (!this.f6706f) {
            try {
                mo7145c((C1688d) this.f6704d.remove());
                AbstractC1687c cVar = this.f6707g;
                if (cVar != null) {
                    cVar.mo7152a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7145c(C1688d dVar) {
        synchronized (this) {
            this.f6703c.remove(dVar.f6711a);
            if (dVar.f6712b) {
                AbstractC1794v<?> vVar = dVar.f6713c;
                if (vVar != null) {
                    this.f6705e.mo7319a(dVar.f6711a, new C1785p<>(vVar, true, false, dVar.f6711a, this.f6705e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo7146d(AbstractC1643g gVar) {
        C1688d remove = this.f6703c.remove(gVar);
        if (remove != null) {
            remove.mo7153a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized C1785p<?> mo7147e(AbstractC1643g gVar) {
        C1688d dVar = this.f6703c.get(gVar);
        if (dVar == null) {
            return null;
        }
        C1785p<?> pVar = (C1785p) dVar.get();
        if (pVar == null) {
            mo7145c(dVar);
        }
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7148f(C1785p.AbstractC1786a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f6705e = aVar;
            }
        }
    }
}
