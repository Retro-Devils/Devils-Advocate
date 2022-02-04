package com.bumptech.glide.p139q;

import com.bumptech.glide.load.AbstractC1649k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.q.e */
public class C2033e {

    /* renamed from: a */
    private final List<String> f7460a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C2034a<?, ?>>> f7461b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.q.e$a */
    public static class C2034a<T, R> {

        /* renamed from: a */
        private final Class<T> f7462a;

        /* renamed from: b */
        final Class<R> f7463b;

        /* renamed from: c */
        final AbstractC1649k<T, R> f7464c;

        public C2034a(Class<T> cls, Class<R> cls2, AbstractC1649k<T, R> kVar) {
            this.f7462a = cls;
            this.f7463b = cls2;
            this.f7464c = kVar;
        }

        /* renamed from: a */
        public boolean mo7732a(Class<?> cls, Class<?> cls2) {
            return this.f7462a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7463b);
        }
    }

    /* renamed from: c */
    private synchronized List<C2034a<?, ?>> m9176c(String str) {
        List<C2034a<?, ?>> list;
        if (!this.f7460a.contains(str)) {
            this.f7460a.add(str);
        }
        list = this.f7461b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f7461b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo7728a(String str, AbstractC1649k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        m9176c(str).add(new C2034a<>(cls, cls2, kVar));
    }

    /* renamed from: b */
    public synchronized <T, R> List<AbstractC1649k<T, R>> mo7729b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f7460a) {
            List<C2034a<?, ?>> list = this.f7461b.get(str);
            if (list != null) {
                for (C2034a<?, ?> aVar : list) {
                    if (aVar.mo7732a(cls, cls2)) {
                        arrayList.add(aVar.f7464c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo7730d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f7460a) {
            List<C2034a<?, ?>> list = this.f7461b.get(str);
            if (list != null) {
                for (C2034a<?, ?> aVar : list) {
                    if (aVar.mo7732a(cls, cls2) && !arrayList.contains(aVar.f7463b)) {
                        arrayList.add(aVar.f7463b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo7731e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f7460a);
        this.f7460a.clear();
        for (String str : list) {
            this.f7460a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f7460a.add(str2);
            }
        }
    }
}
