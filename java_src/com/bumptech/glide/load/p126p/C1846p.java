package com.bumptech.glide.load.p126p;

import com.bumptech.glide.C1618i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.load.p.p */
public class C1846p {

    /* renamed from: a */
    private final C1851r f7092a;

    /* renamed from: b */
    private final C1847a f7093b;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.p$a */
    public static class C1847a {

        /* renamed from: a */
        private final Map<Class<?>, C1848a<?>> f7094a = new HashMap();

        /* access modifiers changed from: private */
        /* renamed from: com.bumptech.glide.load.p.p$a$a */
        public static class C1848a<Model> {

            /* renamed from: a */
            final List<AbstractC1843n<Model, ?>> f7095a;

            public C1848a(List<AbstractC1843n<Model, ?>> list) {
                this.f7095a = list;
            }
        }

        C1847a() {
        }

        /* renamed from: a */
        public void mo7447a() {
            this.f7094a.clear();
        }

        /* renamed from: b */
        public <Model> List<AbstractC1843n<Model, ?>> mo7448b(Class<Model> cls) {
            C1848a<?> aVar = this.f7094a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f7095a;
        }

        /* renamed from: c */
        public <Model> void mo7449c(Class<Model> cls, List<AbstractC1843n<Model, ?>> list) {
            if (this.f7094a.put(cls, new C1848a<>(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C1846p(AbstractC0958f<List<Throwable>> fVar) {
        this(new C1851r(fVar));
    }

    private C1846p(C1851r rVar) {
        this.f7093b = new C1847a();
        this.f7092a = rVar;
    }

    /* renamed from: b */
    private static <A> Class<A> m8509b(A a) {
        return (Class<A>) a.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<AbstractC1843n<A, ?>> m8510e(Class<A> cls) {
        List<AbstractC1843n<A, ?>> b;
        b = this.f7093b.mo7448b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f7092a.mo7453e(cls));
            this.f7093b.mo7449c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo7444a(Class<Model> cls, Class<Data> cls2, AbstractC1845o<? extends Model, ? extends Data> oVar) {
        this.f7092a.mo7451b(cls, cls2, oVar);
        this.f7093b.mo7447a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> mo7445c(Class<?> cls) {
        return this.f7092a.mo7454g(cls);
    }

    /* renamed from: d */
    public <A> List<AbstractC1843n<A, ?>> mo7446d(A a) {
        List<AbstractC1843n<A, ?>> e = m8510e(m8509b(a));
        if (!e.isEmpty()) {
            int size = e.size();
            List<AbstractC1843n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                AbstractC1843n<A, ?> nVar = e.get(i);
                if (nVar.mo7394b(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C1618i.C1621c(a, e);
        }
        throw new C1618i.C1621c(a);
    }
}
