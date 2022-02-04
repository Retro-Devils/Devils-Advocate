package com.bumptech.glide.p139q;

import com.bumptech.glide.p144t.C2080i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p006b.p021d.C0823a;

/* renamed from: com.bumptech.glide.q.d */
public class C2032d {

    /* renamed from: a */
    private final AtomicReference<C2080i> f7458a = new AtomicReference<>();

    /* renamed from: b */
    private final C0823a<C2080i, List<Class<?>>> f7459b = new C0823a<>();

    /* renamed from: a */
    public List<Class<?>> mo7726a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C2080i andSet = this.f7458a.getAndSet(null);
        if (andSet == null) {
            andSet = new C2080i(cls, cls2, cls3);
        } else {
            andSet.mo7867a(cls, cls2, cls3);
        }
        synchronized (this.f7459b) {
            list = this.f7459b.get(andSet);
        }
        this.f7458a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo7727b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f7459b) {
            this.f7459b.put(new C2080i(cls, cls2, cls3), list);
        }
    }
}
