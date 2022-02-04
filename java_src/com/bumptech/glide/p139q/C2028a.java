package com.bumptech.glide.p139q;

import com.bumptech.glide.load.AbstractC1633d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.a */
public class C2028a {

    /* renamed from: a */
    private final List<C2029a<?>> f7459a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.q.a$a */
    public static final class C2029a<T> {

        /* renamed from: a */
        private final Class<T> f7460a;

        /* renamed from: b */
        final AbstractC1633d<T> f7461b;

        C2029a(Class<T> cls, AbstractC1633d<T> dVar) {
            this.f7460a = cls;
            this.f7461b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7720a(Class<?> cls) {
            return this.f7460a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo7718a(Class<T> cls, AbstractC1633d<T> dVar) {
        this.f7459a.add(new C2029a<>(cls, dVar));
    }

    /* renamed from: b */
    public synchronized <T> AbstractC1633d<T> mo7719b(Class<T> cls) {
        for (C2029a<?> aVar : this.f7459a) {
            if (aVar.mo7720a(cls)) {
                return aVar.f7461b;
            }
        }
        return null;
    }
}
