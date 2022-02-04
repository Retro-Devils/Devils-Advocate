package com.bumptech.glide.load.p122o;

import com.bumptech.glide.C1614e;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.AbstractC1633d;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1650l;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.RunnableC1752h;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p128q.C1894c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.g */
public final class C1751g<Transcode> {

    /* renamed from: a */
    private final List<AbstractC1843n.C1844a<?>> f6826a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC1643g> f6827b = new ArrayList();

    /* renamed from: c */
    private C1614e f6828c;

    /* renamed from: d */
    private Object f6829d;

    /* renamed from: e */
    private int f6830e;

    /* renamed from: f */
    private int f6831f;

    /* renamed from: g */
    private Class<?> f6832g;

    /* renamed from: h */
    private RunnableC1752h.AbstractC1757e f6833h;

    /* renamed from: i */
    private C1647i f6834i;

    /* renamed from: j */
    private Map<Class<?>, AbstractC1651m<?>> f6835j;

    /* renamed from: k */
    private Class<Transcode> f6836k;

    /* renamed from: l */
    private boolean f6837l;

    /* renamed from: m */
    private boolean f6838m;

    /* renamed from: n */
    private AbstractC1643g f6839n;

    /* renamed from: o */
    private EnumC1616g f6840o;

    /* renamed from: p */
    private AbstractC1763j f6841p;

    /* renamed from: q */
    private boolean f6842q;

    /* renamed from: r */
    private boolean f6843r;

    C1751g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7268a() {
        this.f6828c = null;
        this.f6829d = null;
        this.f6839n = null;
        this.f6832g = null;
        this.f6836k = null;
        this.f6834i = null;
        this.f6840o = null;
        this.f6835j = null;
        this.f6841p = null;
        this.f6826a.clear();
        this.f6837l = false;
        this.f6827b.clear();
        this.f6838m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC1690b mo7269b() {
        return this.f6828c.mo6997b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<AbstractC1643g> mo7270c() {
        if (!this.f6838m) {
            this.f6838m = true;
            this.f6827b.clear();
            List<AbstractC1843n.C1844a<?>> g = mo7274g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                AbstractC1843n.C1844a<?> aVar = g.get(i);
                if (!this.f6827b.contains(aVar.f7081a)) {
                    this.f6827b.add(aVar.f7081a);
                }
                for (int i2 = 0; i2 < aVar.f7082b.size(); i2++) {
                    if (!this.f6827b.contains(aVar.f7082b.get(i2))) {
                        this.f6827b.add(aVar.f7082b.get(i2));
                    }
                }
            }
        }
        return this.f6827b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC1714a mo7271d() {
        return this.f6833h.mo7308a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC1763j mo7272e() {
        return this.f6841p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo7273f() {
        return this.f6831f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<AbstractC1843n.C1844a<?>> mo7274g() {
        if (!this.f6837l) {
            this.f6837l = true;
            this.f6826a.clear();
            List i = this.f6828c.mo7003h().mo7012i(this.f6829d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1843n.C1844a<?> a = ((AbstractC1843n) i.get(i2)).mo7393a(this.f6829d, this.f6830e, this.f6831f, this.f6834i);
                if (a != null) {
                    this.f6826a.add(a);
                }
            }
        }
        return this.f6826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C1791t<Data, ?, Transcode> mo7275h(Class<Data> cls) {
        return this.f6828c.mo7003h().mo7011h(cls, this.f6832g, this.f6836k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo7276i() {
        return this.f6829d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<AbstractC1843n<File, ?>> mo7277j(File file) {
        return this.f6828c.mo7003h().mo7012i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1647i mo7278k() {
        return this.f6834i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public EnumC1616g mo7279l() {
        return this.f6840o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo7280m() {
        return this.f6828c.mo7003h().mo7013j(this.f6829d.getClass(), this.f6832g, this.f6836k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> AbstractC1650l<Z> mo7281n(AbstractC1794v<Z> vVar) {
        return this.f6828c.mo7003h().mo7014k(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public AbstractC1643g mo7282o() {
        return this.f6839n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> AbstractC1633d<X> mo7283p(X x) {
        return this.f6828c.mo7003h().mo7016m(x);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.lang.Class<Transcode>, java.lang.Class<?> */
    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo7284q() {
        return (Class<Transcode>) this.f6836k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> AbstractC1651m<Z> mo7285r(Class<Z> cls) {
        AbstractC1651m<Z> mVar = (AbstractC1651m<Z>) this.f6835j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, AbstractC1651m<?>>> it = this.f6835j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, AbstractC1651m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mVar = (AbstractC1651m<Z>) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f6835j.isEmpty() || !this.f6842q) {
            return C1894c.m8631c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo7286s() {
        return this.f6830e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo7287t(Class<?> cls) {
        return mo7275h(cls) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <R> void mo7288u(C1614e eVar, Object obj, AbstractC1643g gVar, int i, int i2, AbstractC1763j jVar, Class<?> cls, Class<R> cls2, EnumC1616g gVar2, C1647i iVar, Map<Class<?>, AbstractC1651m<?>> map, boolean z, boolean z2, RunnableC1752h.AbstractC1757e eVar2) {
        this.f6828c = eVar;
        this.f6829d = obj;
        this.f6839n = gVar;
        this.f6830e = i;
        this.f6831f = i2;
        this.f6841p = jVar;
        this.f6832g = cls;
        this.f6833h = eVar2;
        this.f6836k = cls2;
        this.f6840o = gVar2;
        this.f6834i = iVar;
        this.f6835j = map;
        this.f6842q = z;
        this.f6843r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo7289v(AbstractC1794v<?> vVar) {
        return this.f6828c.mo7003h().mo7017n(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo7290w() {
        return this.f6843r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo7291x(AbstractC1643g gVar) {
        List<AbstractC1843n.C1844a<?>> g = mo7274g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f7081a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
