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
    private final List<AbstractC1843n.C1844a<?>> f6834a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC1643g> f6835b = new ArrayList();

    /* renamed from: c */
    private C1614e f6836c;

    /* renamed from: d */
    private Object f6837d;

    /* renamed from: e */
    private int f6838e;

    /* renamed from: f */
    private int f6839f;

    /* renamed from: g */
    private Class<?> f6840g;

    /* renamed from: h */
    private RunnableC1752h.AbstractC1757e f6841h;

    /* renamed from: i */
    private C1647i f6842i;

    /* renamed from: j */
    private Map<Class<?>, AbstractC1651m<?>> f6843j;

    /* renamed from: k */
    private Class<Transcode> f6844k;

    /* renamed from: l */
    private boolean f6845l;

    /* renamed from: m */
    private boolean f6846m;

    /* renamed from: n */
    private AbstractC1643g f6847n;

    /* renamed from: o */
    private EnumC1616g f6848o;

    /* renamed from: p */
    private AbstractC1763j f6849p;

    /* renamed from: q */
    private boolean f6850q;

    /* renamed from: r */
    private boolean f6851r;

    C1751g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7268a() {
        this.f6836c = null;
        this.f6837d = null;
        this.f6847n = null;
        this.f6840g = null;
        this.f6844k = null;
        this.f6842i = null;
        this.f6848o = null;
        this.f6843j = null;
        this.f6849p = null;
        this.f6834a.clear();
        this.f6845l = false;
        this.f6835b.clear();
        this.f6846m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC1690b mo7269b() {
        return this.f6836c.mo6997b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<AbstractC1643g> mo7270c() {
        if (!this.f6846m) {
            this.f6846m = true;
            this.f6835b.clear();
            List<AbstractC1843n.C1844a<?>> g = mo7274g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                AbstractC1843n.C1844a<?> aVar = g.get(i);
                if (!this.f6835b.contains(aVar.f7089a)) {
                    this.f6835b.add(aVar.f7089a);
                }
                for (int i2 = 0; i2 < aVar.f7090b.size(); i2++) {
                    if (!this.f6835b.contains(aVar.f7090b.get(i2))) {
                        this.f6835b.add(aVar.f7090b.get(i2));
                    }
                }
            }
        }
        return this.f6835b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC1714a mo7271d() {
        return this.f6841h.mo7308a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC1763j mo7272e() {
        return this.f6849p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo7273f() {
        return this.f6839f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<AbstractC1843n.C1844a<?>> mo7274g() {
        if (!this.f6845l) {
            this.f6845l = true;
            this.f6834a.clear();
            List i = this.f6836c.mo7003h().mo7012i(this.f6837d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1843n.C1844a<?> a = ((AbstractC1843n) i.get(i2)).mo7393a(this.f6837d, this.f6838e, this.f6839f, this.f6842i);
                if (a != null) {
                    this.f6834a.add(a);
                }
            }
        }
        return this.f6834a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C1791t<Data, ?, Transcode> mo7275h(Class<Data> cls) {
        return this.f6836c.mo7003h().mo7011h(cls, this.f6840g, this.f6844k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo7276i() {
        return this.f6837d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<AbstractC1843n<File, ?>> mo7277j(File file) {
        return this.f6836c.mo7003h().mo7012i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1647i mo7278k() {
        return this.f6842i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public EnumC1616g mo7279l() {
        return this.f6848o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo7280m() {
        return this.f6836c.mo7003h().mo7013j(this.f6837d.getClass(), this.f6840g, this.f6844k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> AbstractC1650l<Z> mo7281n(AbstractC1794v<Z> vVar) {
        return this.f6836c.mo7003h().mo7014k(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public AbstractC1643g mo7282o() {
        return this.f6847n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> AbstractC1633d<X> mo7283p(X x) {
        return this.f6836c.mo7003h().mo7016m(x);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.lang.Class<Transcode>, java.lang.Class<?> */
    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo7284q() {
        return (Class<Transcode>) this.f6844k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> AbstractC1651m<Z> mo7285r(Class<Z> cls) {
        AbstractC1651m<Z> mVar = (AbstractC1651m<Z>) this.f6843j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, AbstractC1651m<?>>> it = this.f6843j.entrySet().iterator();
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
        if (!this.f6843j.isEmpty() || !this.f6850q) {
            return C1894c.m8631c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo7286s() {
        return this.f6838e;
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
        this.f6836c = eVar;
        this.f6837d = obj;
        this.f6847n = gVar;
        this.f6838e = i;
        this.f6839f = i2;
        this.f6849p = jVar;
        this.f6840g = cls;
        this.f6841h = eVar2;
        this.f6844k = cls2;
        this.f6848o = gVar2;
        this.f6842i = iVar;
        this.f6843j = map;
        this.f6850q = z;
        this.f6851r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo7289v(AbstractC1794v<?> vVar) {
        return this.f6836c.mo7003h().mo7017n(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo7290w() {
        return this.f6851r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo7291x(AbstractC1643g gVar) {
        List<AbstractC1843n.C1844a<?>> g = mo7274g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f7089a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
