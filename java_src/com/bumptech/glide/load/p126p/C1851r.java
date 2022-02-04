package com.bumptech.glide.load.p126p;

import com.bumptech.glide.C1618i;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p144t.C2081j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.load.p.r */
public class C1851r {

    /* renamed from: a */
    private static final C1854c f7105a = new C1854c();

    /* renamed from: b */
    private static final AbstractC1843n<Object, Object> f7106b = new C1852a();

    /* renamed from: c */
    private final List<C1853b<?, ?>> f7107c;

    /* renamed from: d */
    private final C1854c f7108d;

    /* renamed from: e */
    private final Set<C1853b<?, ?>> f7109e;

    /* renamed from: f */
    private final AbstractC0958f<List<Throwable>> f7110f;

    /* renamed from: com.bumptech.glide.load.p.r$a */
    private static class C1852a implements AbstractC1843n<Object, Object> {
        C1852a() {
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1843n
        /* renamed from: a */
        public AbstractC1843n.C1844a<Object> mo7393a(Object obj, int i, int i2, C1647i iVar) {
            return null;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1843n
        /* renamed from: b */
        public boolean mo7394b(Object obj) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.r$b */
    public static class C1853b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f7111a;

        /* renamed from: b */
        final Class<Data> f7112b;

        /* renamed from: c */
        final AbstractC1845o<? extends Model, ? extends Data> f7113c;

        public C1853b(Class<Model> cls, Class<Data> cls2, AbstractC1845o<? extends Model, ? extends Data> oVar) {
            this.f7111a = cls;
            this.f7112b = cls2;
            this.f7113c = oVar;
        }

        /* renamed from: a */
        public boolean mo7455a(Class<?> cls) {
            return this.f7111a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo7456b(Class<?> cls, Class<?> cls2) {
            return mo7455a(cls) && this.f7112b.isAssignableFrom(cls2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.p.r$c */
    public static class C1854c {
        C1854c() {
        }

        /* renamed from: a */
        public <Model, Data> C1849q<Model, Data> mo7457a(List<AbstractC1843n<Model, Data>> list, AbstractC0958f<List<Throwable>> fVar) {
            return new C1849q<>(list, fVar);
        }
    }

    public C1851r(AbstractC0958f<List<Throwable>> fVar) {
        this(fVar, f7105a);
    }

    C1851r(AbstractC0958f<List<Throwable>> fVar, C1854c cVar) {
        this.f7107c = new ArrayList();
        this.f7109e = new HashSet();
        this.f7110f = fVar;
        this.f7108d = cVar;
    }

    /* renamed from: a */
    private <Model, Data> void m8526a(Class<Model> cls, Class<Data> cls2, AbstractC1845o<? extends Model, ? extends Data> oVar, boolean z) {
        C1853b<?, ?> bVar = new C1853b<>(cls, cls2, oVar);
        List<C1853b<?, ?>> list = this.f7107c;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: c */
    private <Model, Data> AbstractC1843n<Model, Data> m8527c(C1853b<?, ?> bVar) {
        return (AbstractC1843n) C2081j.m9432d(bVar.f7113c.mo7398b(this));
    }

    /* renamed from: f */
    private static <Model, Data> AbstractC1843n<Model, Data> m8528f() {
        return (AbstractC1843n<Model, Data>) f7106b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo7451b(Class<Model> cls, Class<Data> cls2, AbstractC1845o<? extends Model, ? extends Data> oVar) {
        m8526a(cls, cls2, oVar, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> AbstractC1843n<Model, Data> mo7452d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1853b<?, ?> bVar : this.f7107c) {
                if (this.f7109e.contains(bVar)) {
                    z = true;
                } else if (bVar.mo7456b(cls, cls2)) {
                    this.f7109e.add(bVar);
                    arrayList.add(m8527c(bVar));
                    this.f7109e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f7108d.mo7457a(arrayList, this.f7110f);
            } else if (arrayList.size() == 1) {
                return (AbstractC1843n) arrayList.get(0);
            } else if (z) {
                return m8528f();
            } else {
                throw new C1618i.C1621c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f7109e.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <Model> List<AbstractC1843n<Model, ?>> mo7453e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1853b<?, ?> bVar : this.f7107c) {
                if (!this.f7109e.contains(bVar)) {
                    if (bVar.mo7455a(cls)) {
                        this.f7109e.add(bVar);
                        arrayList.add(m8527c(bVar));
                        this.f7109e.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f7109e.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> mo7454g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1853b<?, ?> bVar : this.f7107c) {
            if (!arrayList.contains(bVar.f7112b) && bVar.mo7455a(cls)) {
                arrayList.add(bVar.f7112b);
            }
        }
        return arrayList;
    }
}
