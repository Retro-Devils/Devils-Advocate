package com.bumptech.glide.load.p122o;

import android.util.Log;
import com.bumptech.glide.C1614e;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p122o.C1785p;
import com.bumptech.glide.load.p122o.RunnableC1752h;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1727h;
import com.bumptech.glide.load.p122o.p124b0.C1717b;
import com.bumptech.glide.load.p122o.p125c0.ExecutorServiceC1737a;
import com.bumptech.glide.p140r.AbstractC2044g;
import com.bumptech.glide.p144t.C2077f;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.p145l.C2084a;
import java.util.Map;
import java.util.concurrent.Executor;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.load.o.k */
public class C1769k implements AbstractC1782m, AbstractC1727h.AbstractC1728a, C1785p.AbstractC1786a {

    /* renamed from: a */
    private static final boolean f6907a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final C1790s f6908b;

    /* renamed from: c */
    private final C1784o f6909c;

    /* renamed from: d */
    private final AbstractC1727h f6910d;

    /* renamed from: e */
    private final C1772b f6911e;

    /* renamed from: f */
    private final C1797y f6912f;

    /* renamed from: g */
    private final C1774c f6913g;

    /* renamed from: h */
    private final C1770a f6914h;

    /* renamed from: i */
    private final C1683a f6915i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.k$a */
    public static class C1770a {

        /* renamed from: a */
        final RunnableC1752h.AbstractC1757e f6916a;

        /* renamed from: b */
        final AbstractC0958f<RunnableC1752h<?>> f6917b = C2084a.m9456d(150, new C1771a());

        /* renamed from: c */
        private int f6918c;

        /* renamed from: com.bumptech.glide.load.o.k$a$a */
        class C1771a implements C2084a.AbstractC2088d<RunnableC1752h<?>> {
            C1771a() {
            }

            /* renamed from: b */
            public RunnableC1752h<?> mo7238a() {
                C1770a aVar = C1770a.this;
                return new RunnableC1752h<>(aVar.f6916a, aVar.f6917b);
            }
        }

        C1770a(RunnableC1752h.AbstractC1757e eVar) {
            this.f6916a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> RunnableC1752h<R> mo7324a(C1614e eVar, Object obj, C1783n nVar, AbstractC1643g gVar, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1616g gVar2, AbstractC1763j jVar, Map<Class<?>, AbstractC1651m<?>> map, boolean z, boolean z2, boolean z3, C1647i iVar, RunnableC1752h.AbstractC1754b<R> bVar) {
            RunnableC1752h hVar = (RunnableC1752h) C2081j.m9432d(this.f6917b.mo5399b());
            int i3 = this.f6918c;
            this.f6918c = i3 + 1;
            return hVar.mo7296n(eVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z3, iVar, bVar, i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.k$b */
    public static class C1772b {

        /* renamed from: a */
        final ExecutorServiceC1737a f6920a;

        /* renamed from: b */
        final ExecutorServiceC1737a f6921b;

        /* renamed from: c */
        final ExecutorServiceC1737a f6922c;

        /* renamed from: d */
        final ExecutorServiceC1737a f6923d;

        /* renamed from: e */
        final AbstractC1782m f6924e;

        /* renamed from: f */
        final C1785p.AbstractC1786a f6925f;

        /* renamed from: g */
        final AbstractC0958f<C1776l<?>> f6926g = C2084a.m9456d(150, new C1773a());

        /* renamed from: com.bumptech.glide.load.o.k$b$a */
        class C1773a implements C2084a.AbstractC2088d<C1776l<?>> {
            C1773a() {
            }

            /* renamed from: b */
            public C1776l<?> mo7238a() {
                C1772b bVar = C1772b.this;
                return new C1776l<>(bVar.f6920a, bVar.f6921b, bVar.f6922c, bVar.f6923d, bVar.f6924e, bVar.f6925f, bVar.f6926g);
            }
        }

        C1772b(ExecutorServiceC1737a aVar, ExecutorServiceC1737a aVar2, ExecutorServiceC1737a aVar3, ExecutorServiceC1737a aVar4, AbstractC1782m mVar, C1785p.AbstractC1786a aVar5) {
            this.f6920a = aVar;
            this.f6921b = aVar2;
            this.f6922c = aVar3;
            this.f6923d = aVar4;
            this.f6924e = mVar;
            this.f6925f = aVar5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C1776l<R> mo7326a(AbstractC1643g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C1776l) C2081j.m9432d(this.f6926g.mo5399b())).mo7335l(gVar, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$c */
    private static class C1774c implements RunnableC1752h.AbstractC1757e {

        /* renamed from: a */
        private final AbstractC1714a.AbstractC1715a f6928a;

        /* renamed from: b */
        private volatile AbstractC1714a f6929b;

        C1774c(AbstractC1714a.AbstractC1715a aVar) {
            this.f6928a = aVar;
        }

        @Override // com.bumptech.glide.load.p122o.RunnableC1752h.AbstractC1757e
        /* renamed from: a */
        public AbstractC1714a mo7308a() {
            if (this.f6929b == null) {
                synchronized (this) {
                    if (this.f6929b == null) {
                        this.f6929b = this.f6928a.mo7214a();
                    }
                    if (this.f6929b == null) {
                        this.f6929b = new C1717b();
                    }
                }
            }
            return this.f6929b;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$d */
    public class C1775d {

        /* renamed from: a */
        private final C1776l<?> f6930a;

        /* renamed from: b */
        private final AbstractC2044g f6931b;

        C1775d(AbstractC2044g gVar, C1776l<?> lVar) {
            this.f6931b = gVar;
            this.f6930a = lVar;
        }

        /* renamed from: a */
        public void mo7328a() {
            synchronized (C1769k.this) {
                this.f6930a.mo7339r(this.f6931b);
            }
        }
    }

    C1769k(AbstractC1727h hVar, AbstractC1714a.AbstractC1715a aVar, ExecutorServiceC1737a aVar2, ExecutorServiceC1737a aVar3, ExecutorServiceC1737a aVar4, ExecutorServiceC1737a aVar5, C1790s sVar, C1784o oVar, C1683a aVar6, C1772b bVar, C1770a aVar7, C1797y yVar, boolean z) {
        this.f6910d = hVar;
        C1774c cVar = new C1774c(aVar);
        this.f6913g = cVar;
        C1683a aVar8 = aVar6 == null ? new C1683a(z) : aVar6;
        this.f6915i = aVar8;
        aVar8.mo7148f(this);
        this.f6909c = oVar == null ? new C1784o() : oVar;
        this.f6908b = sVar == null ? new C1790s() : sVar;
        this.f6911e = bVar == null ? new C1772b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f6914h = aVar7 == null ? new C1770a(cVar) : aVar7;
        this.f6912f = yVar == null ? new C1797y() : yVar;
        hVar.mo7224e(this);
    }

    public C1769k(AbstractC1727h hVar, AbstractC1714a.AbstractC1715a aVar, ExecutorServiceC1737a aVar2, ExecutorServiceC1737a aVar3, ExecutorServiceC1737a aVar4, ExecutorServiceC1737a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    private C1785p<?> m8287e(AbstractC1643g gVar) {
        AbstractC1794v<?> d = this.f6910d.mo7223d(gVar);
        if (d == null) {
            return null;
        }
        return d instanceof C1785p ? (C1785p) d : new C1785p<>(d, true, true, gVar, this);
    }

    /* renamed from: g */
    private C1785p<?> m8288g(AbstractC1643g gVar) {
        C1785p<?> e = this.f6915i.mo7147e(gVar);
        if (e != null) {
            e.mo7356a();
        }
        return e;
    }

    /* renamed from: h */
    private C1785p<?> m8289h(AbstractC1643g gVar) {
        C1785p<?> e = m8287e(gVar);
        if (e != null) {
            e.mo7356a();
            this.f6915i.mo7143a(gVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private C1785p<?> m8290i(C1783n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1785p<?> g = m8288g(nVar);
        if (g != null) {
            if (f6907a) {
                m8291j("Loaded resource from active resources", j, nVar);
            }
            return g;
        }
        C1785p<?> h = m8289h(nVar);
        if (h == null) {
            return null;
        }
        if (f6907a) {
            m8291j("Loaded resource from cache", j, nVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m8291j(String str, long j, AbstractC1643g gVar) {
        Log.v("Engine", str + " in " + C2077f.m9415a(j) + "ms, key: " + gVar);
    }

    /* renamed from: l */
    private <R> C1775d m8292l(C1614e eVar, Object obj, AbstractC1643g gVar, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1616g gVar2, AbstractC1763j jVar, Map<Class<?>, AbstractC1651m<?>> map, boolean z, boolean z2, C1647i iVar, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC2044g gVar3, Executor executor, C1783n nVar, long j) {
        C1776l<?> a = this.f6908b.mo7380a(nVar, z6);
        if (a != null) {
            a.mo7329b(gVar3, executor);
            if (f6907a) {
                m8291j("Added to existing load", j, nVar);
            }
            return new C1775d(gVar3, a);
        }
        C1776l<R> a2 = this.f6911e.mo7326a(nVar, z3, z4, z5, z6);
        RunnableC1752h<R> a3 = this.f6914h.mo7324a(eVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z6, iVar, a2);
        this.f6908b.mo7381c(nVar, a2);
        a2.mo7329b(gVar3, executor);
        a2.mo7340s(a3);
        if (f6907a) {
            m8291j("Started new load", j, nVar);
        }
        return new C1775d(gVar3, a2);
    }

    @Override // com.bumptech.glide.load.p122o.C1785p.AbstractC1786a
    /* renamed from: a */
    public void mo7319a(AbstractC1643g gVar, C1785p<?> pVar) {
        this.f6915i.mo7146d(gVar);
        if (pVar.mo7362g()) {
            this.f6910d.mo7222c(gVar, pVar);
        } else {
            this.f6912f.mo7388a(pVar, false);
        }
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1727h.AbstractC1728a
    /* renamed from: b */
    public void mo7230b(AbstractC1794v<?> vVar) {
        this.f6912f.mo7388a(vVar, true);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1782m
    /* renamed from: c */
    public synchronized void mo7320c(C1776l<?> lVar, AbstractC1643g gVar, C1785p<?> pVar) {
        if (pVar != null) {
            if (pVar.mo7362g()) {
                this.f6915i.mo7143a(gVar, pVar);
            }
        }
        this.f6908b.mo7382d(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1782m
    /* renamed from: d */
    public synchronized void mo7321d(C1776l<?> lVar, AbstractC1643g gVar) {
        this.f6908b.mo7382d(gVar, lVar);
    }

    /* renamed from: f */
    public <R> C1775d mo7322f(C1614e eVar, Object obj, AbstractC1643g gVar, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1616g gVar2, AbstractC1763j jVar, Map<Class<?>, AbstractC1651m<?>> map, boolean z, boolean z2, C1647i iVar, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC2044g gVar3, Executor executor) {
        long b = f6907a ? C2077f.m9416b() : 0;
        C1783n a = this.f6909c.mo7355a(obj, gVar, i, i2, map, cls, cls2, iVar);
        synchronized (this) {
            C1785p<?> i3 = m8290i(a, z3, b);
            if (i3 == null) {
                return m8292l(eVar, obj, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, iVar, z3, z4, z5, z6, gVar3, executor, a, b);
            }
            gVar3.mo7805d(i3, EnumC1630a.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: k */
    public void mo7323k(AbstractC1794v<?> vVar) {
        if (vVar instanceof C1785p) {
            ((C1785p) vVar).mo7363h();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
