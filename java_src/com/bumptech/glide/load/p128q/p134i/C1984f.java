package com.bumptech.glide.load.p128q.p134i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.i.f */
public class C1984f {

    /* renamed from: a */
    private final List<C1985a<?, ?>> f7320a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.q.i.f$a */
    public static final class C1985a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f7321a;

        /* renamed from: b */
        private final Class<R> f7322b;

        /* renamed from: c */
        final AbstractC1983e<Z, R> f7323c;

        C1985a(Class<Z> cls, Class<R> cls2, AbstractC1983e<Z, R> eVar) {
            this.f7321a = cls;
            this.f7322b = cls2;
            this.f7323c = eVar;
        }

        /* renamed from: a */
        public boolean mo7628a(Class<?> cls, Class<?> cls2) {
            return this.f7321a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7322b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> AbstractC1983e<Z, R> mo7625a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1986g.m8958b();
        }
        for (C1985a<?, ?> aVar : this.f7320a) {
            if (aVar.mo7628a(cls, cls2)) {
                return aVar.f7323c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo7626b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1985a<?, ?> aVar : this.f7320a) {
            if (aVar.mo7628a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo7627c(Class<Z> cls, Class<R> cls2, AbstractC1983e<Z, R> eVar) {
        this.f7320a.add(new C1985a<>(cls, cls2, eVar));
    }
}
