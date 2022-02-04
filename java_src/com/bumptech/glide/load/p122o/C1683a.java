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
    private final boolean f6709a;

    /* renamed from: b */
    private final Executor f6710b;

    /* renamed from: c */
    final Map<AbstractC1643g, C1688d> f6711c;

    /* renamed from: d */
    private final ReferenceQueue<C1785p<?>> f6712d;

    /* renamed from: e */
    private C1785p.AbstractC1786a f6713e;

    /* renamed from: f */
    private volatile boolean f6714f;

    /* renamed from: g */
    private volatile AbstractC1687c f6715g;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    class ThreadFactoryC1684a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.o.a$a$a */
        class RunnableC1685a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Runnable f6716b;

            RunnableC1685a(Runnable runnable) {
                this.f6716b = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f6716b.run();
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
        final AbstractC1643g f6719a;

        /* renamed from: b */
        final boolean f6720b;

        /* renamed from: c */
        AbstractC1794v<?> f6721c;

        C1688d(AbstractC1643g gVar, C1785p<?> pVar, ReferenceQueue<? super C1785p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            this.f6719a = (AbstractC1643g) C2081j.m9432d(gVar);
            this.f6721c = (!pVar.mo7362g() || !z) ? null : (AbstractC1794v) C2081j.m9432d(pVar.mo7360e());
            this.f6720b = pVar.mo7362g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7153a() {
            this.f6721c = null;
            clear();
        }
    }

    C1683a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC1684a()));
    }

    C1683a(boolean z, Executor executor) {
        this.f6711c = new HashMap();
        this.f6712d = new ReferenceQueue<>();
        this.f6709a = z;
        this.f6710b = executor;
        executor.execute(new RunnableC1686b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7143a(AbstractC1643g gVar, C1785p<?> pVar) {
        C1688d put = this.f6711c.put(gVar, new C1688d(gVar, pVar, this.f6712d, this.f6709a));
        if (put != null) {
            put.mo7153a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7144b() {
        while (!this.f6714f) {
            try {
                mo7145c((C1688d) this.f6712d.remove());
                AbstractC1687c cVar = this.f6715g;
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
            this.f6711c.remove(dVar.f6719a);
            if (dVar.f6720b) {
                AbstractC1794v<?> vVar = dVar.f6721c;
                if (vVar != null) {
                    this.f6713e.mo7319a(dVar.f6719a, new C1785p<>(vVar, true, false, dVar.f6719a, this.f6713e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo7146d(AbstractC1643g gVar) {
        C1688d remove = this.f6711c.remove(gVar);
        if (remove != null) {
            remove.mo7153a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized C1785p<?> mo7147e(AbstractC1643g gVar) {
        C1688d dVar = this.f6711c.get(gVar);
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
                this.f6713e = aVar;
            }
        }
    }
}
