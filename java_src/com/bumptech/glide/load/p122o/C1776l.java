package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p122o.C1785p;
import com.bumptech.glide.load.p122o.RunnableC1752h;
import com.bumptech.glide.load.p122o.p125c0.ExecutorServiceC1737a;
import com.bumptech.glide.p140r.AbstractC2044g;
import com.bumptech.glide.p144t.C2074e;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.p145l.AbstractC2093c;
import com.bumptech.glide.p144t.p145l.C2084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p030g.p038j.AbstractC0958f;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.l */
public class C1776l<R> implements RunnableC1752h.AbstractC1754b<R>, C2084a.AbstractC2090f {

    /* renamed from: b */
    private static final C1779c f6933b = new C1779c();

    /* renamed from: c */
    final C1781e f6934c;

    /* renamed from: d */
    private final AbstractC2093c f6935d;

    /* renamed from: e */
    private final C1785p.AbstractC1786a f6936e;

    /* renamed from: f */
    private final AbstractC0958f<C1776l<?>> f6937f;

    /* renamed from: g */
    private final C1779c f6938g;

    /* renamed from: h */
    private final AbstractC1782m f6939h;

    /* renamed from: i */
    private final ExecutorServiceC1737a f6940i;

    /* renamed from: j */
    private final ExecutorServiceC1737a f6941j;

    /* renamed from: k */
    private final ExecutorServiceC1737a f6942k;

    /* renamed from: l */
    private final ExecutorServiceC1737a f6943l;

    /* renamed from: m */
    private final AtomicInteger f6944m;

    /* renamed from: n */
    private AbstractC1643g f6945n;

    /* renamed from: o */
    private boolean f6946o;

    /* renamed from: p */
    private boolean f6947p;

    /* renamed from: q */
    private boolean f6948q;

    /* renamed from: r */
    private boolean f6949r;

    /* renamed from: s */
    private AbstractC1794v<?> f6950s;

    /* renamed from: t */
    EnumC1630a f6951t;

    /* renamed from: u */
    private boolean f6952u;

    /* renamed from: v */
    C1787q f6953v;

    /* renamed from: w */
    private boolean f6954w;

    /* renamed from: x */
    C1785p<?> f6955x;

    /* renamed from: y */
    private RunnableC1752h<R> f6956y;

    /* renamed from: z */
    private volatile boolean f6957z;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.l$a */
    public class RunnableC1777a implements Runnable {

        /* renamed from: b */
        private final AbstractC2044g f6958b;

        RunnableC1777a(AbstractC2044g gVar) {
            this.f6958b = gVar;
        }

        public void run() {
            synchronized (this.f6958b.mo7806e()) {
                synchronized (C1776l.this) {
                    if (C1776l.this.f6934c.mo7347b(this.f6958b)) {
                        C1776l.this.mo7330c(this.f6958b);
                    }
                    C1776l.this.mo7333i();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.l$b */
    public class RunnableC1778b implements Runnable {

        /* renamed from: b */
        private final AbstractC2044g f6960b;

        RunnableC1778b(AbstractC2044g gVar) {
            this.f6960b = gVar;
        }

        public void run() {
            synchronized (this.f6960b.mo7806e()) {
                synchronized (C1776l.this) {
                    if (C1776l.this.f6934c.mo7347b(this.f6960b)) {
                        C1776l.this.f6955x.mo7356a();
                        C1776l.this.mo7331g(this.f6960b);
                        C1776l.this.mo7339r(this.f6960b);
                    }
                    C1776l.this.mo7333i();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.l$c */
    public static class C1779c {
        C1779c() {
        }

        /* renamed from: a */
        public <R> C1785p<R> mo7343a(AbstractC1794v<R> vVar, boolean z, AbstractC1643g gVar, C1785p.AbstractC1786a aVar) {
            return new C1785p<>(vVar, z, true, gVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.l$d */
    public static final class C1780d {

        /* renamed from: a */
        final AbstractC2044g f6962a;

        /* renamed from: b */
        final Executor f6963b;

        C1780d(AbstractC2044g gVar, Executor executor) {
            this.f6962a = gVar;
            this.f6963b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1780d) {
                return this.f6962a.equals(((C1780d) obj).f6962a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6962a.hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.l$e */
    public static final class C1781e implements Iterable<C1780d> {

        /* renamed from: b */
        private final List<C1780d> f6964b;

        C1781e() {
            this(new ArrayList(2));
        }

        C1781e(List<C1780d> list) {
            this.f6964b = list;
        }

        /* renamed from: d */
        private static C1780d m8327d(AbstractC2044g gVar) {
            return new C1780d(gVar, C2074e.m9413a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7346a(AbstractC2044g gVar, Executor executor) {
            this.f6964b.add(new C1780d(gVar, executor));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo7347b(AbstractC2044g gVar) {
            return this.f6964b.contains(m8327d(gVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1781e mo7348c() {
            return new C1781e(new ArrayList(this.f6964b));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f6964b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo7350e(AbstractC2044g gVar) {
            this.f6964b.remove(m8327d(gVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f6964b.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<C1780d> iterator() {
            return this.f6964b.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f6964b.size();
        }
    }

    C1776l(ExecutorServiceC1737a aVar, ExecutorServiceC1737a aVar2, ExecutorServiceC1737a aVar3, ExecutorServiceC1737a aVar4, AbstractC1782m mVar, C1785p.AbstractC1786a aVar5, AbstractC0958f<C1776l<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, fVar, f6933b);
    }

    C1776l(ExecutorServiceC1737a aVar, ExecutorServiceC1737a aVar2, ExecutorServiceC1737a aVar3, ExecutorServiceC1737a aVar4, AbstractC1782m mVar, C1785p.AbstractC1786a aVar5, AbstractC0958f<C1776l<?>> fVar, C1779c cVar) {
        this.f6934c = new C1781e();
        this.f6935d = AbstractC2093c.m9473a();
        this.f6944m = new AtomicInteger();
        this.f6940i = aVar;
        this.f6941j = aVar2;
        this.f6942k = aVar3;
        this.f6943l = aVar4;
        this.f6939h = mVar;
        this.f6936e = aVar5;
        this.f6937f = fVar;
        this.f6938g = cVar;
    }

    /* renamed from: j */
    private ExecutorServiceC1737a m8307j() {
        return this.f6947p ? this.f6942k : this.f6948q ? this.f6943l : this.f6941j;
    }

    /* renamed from: m */
    private boolean m8308m() {
        return this.f6954w || this.f6952u || this.f6957z;
    }

    /* renamed from: q */
    private synchronized void m8309q() {
        if (this.f6945n != null) {
            this.f6934c.clear();
            this.f6945n = null;
            this.f6955x = null;
            this.f6950s = null;
            this.f6954w = false;
            this.f6957z = false;
            this.f6952u = false;
            this.f6956y.mo7299w(false);
            this.f6956y = null;
            this.f6953v = null;
            this.f6951t = null;
            this.f6937f.mo5398a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bumptech.glide.load.p122o.RunnableC1752h.AbstractC1754b
    /* renamed from: a */
    public void mo7300a(C1787q qVar) {
        synchronized (this) {
            this.f6953v = qVar;
        }
        mo7336n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo7329b(AbstractC2044g gVar, Executor executor) {
        Runnable aVar;
        this.f6935d.mo7875c();
        this.f6934c.mo7346a(gVar, executor);
        boolean z = true;
        if (this.f6952u) {
            mo7334k(1);
            aVar = new RunnableC1778b(gVar);
        } else if (this.f6954w) {
            mo7334k(1);
            aVar = new RunnableC1777a(gVar);
        } else {
            if (this.f6957z) {
                z = false;
            }
            C2081j.m9429a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7330c(AbstractC2044g gVar) {
        try {
            gVar.mo7804a(this.f6953v);
        } catch (Throwable th) {
            throw new C1713b(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bumptech.glide.load.o.v<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.p122o.RunnableC1752h.AbstractC1754b
    /* renamed from: d */
    public void mo7301d(AbstractC1794v<R> vVar, EnumC1630a aVar) {
        synchronized (this) {
            this.f6950s = vVar;
            this.f6951t = aVar;
        }
        mo7337o();
    }

    @Override // com.bumptech.glide.p144t.p145l.C2084a.AbstractC2090f
    /* renamed from: e */
    public AbstractC2093c mo7240e() {
        return this.f6935d;
    }

    @Override // com.bumptech.glide.load.p122o.RunnableC1752h.AbstractC1754b
    /* renamed from: f */
    public void mo7302f(RunnableC1752h<?> hVar) {
        m8307j().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7331g(AbstractC2044g gVar) {
        try {
            gVar.mo7805d(this.f6955x, this.f6951t);
        } catch (Throwable th) {
            throw new C1713b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7332h() {
        if (!m8308m()) {
            this.f6957z = true;
            this.f6956y.mo7293a();
            this.f6939h.mo7321d(this, this.f6945n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7333i() {
        C1785p<?> pVar;
        synchronized (this) {
            this.f6935d.mo7875c();
            C2081j.m9429a(m8308m(), "Not yet complete!");
            int decrementAndGet = this.f6944m.decrementAndGet();
            C2081j.m9429a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f6955x;
                m8309q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo7363h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo7334k(int i) {
        C1785p<?> pVar;
        C2081j.m9429a(m8308m(), "Not yet complete!");
        if (this.f6944m.getAndAdd(i) == 0 && (pVar = this.f6955x) != null) {
            pVar.mo7356a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C1776l<R> mo7335l(AbstractC1643g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f6945n = gVar;
        this.f6946o = z;
        this.f6947p = z2;
        this.f6948q = z3;
        this.f6949r = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f6939h.mo7320c(r4, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f6963b.execute(new com.bumptech.glide.load.p122o.C1776l.RunnableC1777a(r4, r1.f6962a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo7333i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7336n() {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p122o.C1776l.mo7336n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f6939h.mo7320c(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f6963b.execute(new com.bumptech.glide.load.p122o.C1776l.RunnableC1778b(r5, r1.f6962a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo7333i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7337o() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p122o.C1776l.mo7337o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo7338p() {
        return this.f6949r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo7339r(AbstractC2044g gVar) {
        boolean z;
        this.f6935d.mo7875c();
        this.f6934c.mo7350e(gVar);
        if (this.f6934c.isEmpty()) {
            mo7332h();
            if (!this.f6952u) {
                if (!this.f6954w) {
                    z = false;
                    if (z && this.f6944m.get() == 0) {
                        m8309q();
                    }
                }
            }
            z = true;
            m8309q();
        }
    }

    /* renamed from: s */
    public synchronized void mo7340s(RunnableC1752h<R> hVar) {
        this.f6956y = hVar;
        (hVar.mo7292C() ? this.f6940i : m8307j()).execute(hVar);
    }
}
