package com.bumptech.glide.p139q;

import com.bumptech.glide.load.AbstractC1650l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.f */
public class C2035f {

    /* renamed from: a */
    private final List<C2036a<?>> f7473a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.q.f$a */
    public static final class C2036a<T> {

        /* renamed from: a */
        private final Class<T> f7474a;

        /* renamed from: b */
        final AbstractC1650l<T> f7475b;

        C2036a(Class<T> cls, AbstractC1650l<T> lVar) {
            this.f7474a = cls;
            this.f7475b = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7735a(Class<?> cls) {
            return this.f7474a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo7733a(Class<Z> cls, AbstractC1650l<Z> lVar) {
        this.f7473a.add(new C2036a<>(cls, lVar));
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: com.bumptech.glide.load.l<T>, com.bumptech.glide.load.l<Z> */
    /* renamed from: b */
    public synchronized <Z> AbstractC1650l<Z> mo7734b(Class<Z> cls) {
        int size = this.f7473a.size();
        for (int i = 0; i < size; i++) {
            C2036a<?> aVar = this.f7473a.get(i);
            if (aVar.mo7735a(cls)) {
                return (AbstractC1650l<T>) aVar.f7475b;
            }
        }
        return null;
    }
}
