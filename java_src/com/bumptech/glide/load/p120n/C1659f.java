package com.bumptech.glide.load.p120n;

import com.bumptech.glide.load.p120n.AbstractC1657e;
import com.bumptech.glide.p144t.C2081j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.f */
public class C1659f {

    /* renamed from: a */
    private static final AbstractC1657e.AbstractC1658a<?> f6665a = new C1660a();

    /* renamed from: b */
    private final Map<Class<?>, AbstractC1657e.AbstractC1658a<?>> f6666b = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.f$a */
    class C1660a implements AbstractC1657e.AbstractC1658a<Object> {
        C1660a() {
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1657e.AbstractC1658a
        /* renamed from: a */
        public Class<Object> mo7112a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1657e.AbstractC1658a
        /* renamed from: b */
        public AbstractC1657e<Object> mo7113b(Object obj) {
            return new C1661b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.f$b */
    private static final class C1661b implements AbstractC1657e<Object> {

        /* renamed from: a */
        private final Object f6667a;

        C1661b(Object obj) {
            this.f6667a = obj;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1657e
        /* renamed from: a */
        public Object mo7110a() {
            return this.f6667a;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1657e
        /* renamed from: b */
        public void mo7111b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> AbstractC1657e<T> mo7114a(T t) {
        AbstractC1657e.AbstractC1658a<?> aVar;
        C2081j.m9432d(t);
        aVar = this.f6666b.get(t.getClass());
        if (aVar == null) {
            Iterator<AbstractC1657e.AbstractC1658a<?>> it = this.f6666b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1657e.AbstractC1658a<?> next = it.next();
                if (next.mo7112a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f6665a;
        }
        return (AbstractC1657e<T>) aVar.mo7113b(t);
    }

    /* renamed from: b */
    public synchronized void mo7115b(AbstractC1657e.AbstractC1658a<?> aVar) {
        this.f6666b.put(aVar.mo7112a(), aVar);
    }
}
