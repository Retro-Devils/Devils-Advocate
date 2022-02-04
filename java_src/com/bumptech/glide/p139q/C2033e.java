package com.bumptech.glide.p139q;

import com.bumptech.glide.load.AbstractC1649k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.q.e */
public class C2033e {

    /* renamed from: a */
    private final List<String> f7468a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C2034a<?, ?>>> f7469b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.q.e$a */
    public static class C2034a<T, R> {

        /* renamed from: a */
        private final Class<T> f7470a;

        /* renamed from: b */
        final Class<R> f7471b;

        /* renamed from: c */
        final AbstractC1649k<T, R> f7472c;

        public C2034a(Class<T> cls, Class<R> cls2, AbstractC1649k<T, R> kVar) {
            this.f7470a = cls;
            this.f7471b = cls2;
            this.f7472c = kVar;
        }

        /* renamed from: a */
        public boolean mo7732a(Class<?> cls, Class<?> cls2) {
            return this.f7470a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7471b);
        }
    }

    /* renamed from: c */
    private synchronized List<C2034a<?, ?>> m9176c(String str) {
        List<C2034a<?, ?>> list;
        if (!this.f7468a.contains(str)) {
            this.f7468a.add(str);
        }
        list = this.f7469b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f7469b.put(str, list);
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
        for (String str : this.f7468a) {
            List<C2034a<?, ?>> list = this.f7469b.get(str);
            if (list != null) {
                for (C2034a<?, ?> aVar : list) {
                    if (aVar.mo7732a(cls, cls2)) {
                        arrayList.add(aVar.f7472c);
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
        for (String str : this.f7468a) {
            List<C2034a<?, ?>> list = this.f7469b.get(str);
            if (list != null) {
                for (C2034a<?, ?> aVar : list) {
                    if (aVar.mo7732a(cls, cls2) && !arrayList.contains(aVar.f7471b)) {
                        arrayList.add(aVar.f7471b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo7731e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f7468a);
        this.f7468a.clear();
        for (String str : list) {
            this.f7468a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f7468a.add(str2);
            }
        }
    }
}
