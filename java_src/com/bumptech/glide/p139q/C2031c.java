package com.bumptech.glide.p139q;

import com.bumptech.glide.load.p122o.C1761i;
import com.bumptech.glide.load.p122o.C1791t;
import com.bumptech.glide.load.p128q.p134i.C1986g;
import com.bumptech.glide.p144t.C2080i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p006b.p021d.C0823a;

/* renamed from: com.bumptech.glide.q.c */
public class C2031c {

    /* renamed from: a */
    private static final C1791t<?, ?, ?> f7455a = new C1791t<>(Object.class, Object.class, Object.class, Collections.singletonList(new C1761i(Object.class, Object.class, Object.class, Collections.emptyList(), new C1986g(), null)), null);

    /* renamed from: b */
    private final C0823a<C2080i, C1791t<?, ?, ?>> f7456b = new C0823a<>();

    /* renamed from: c */
    private final AtomicReference<C2080i> f7457c = new AtomicReference<>();

    /* renamed from: b */
    private C2080i m9170b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C2080i andSet = this.f7457c.getAndSet(null);
        if (andSet == null) {
            andSet = new C2080i();
        }
        andSet.mo7867a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1791t<Data, TResource, Transcode> mo7723a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1791t<Data, TResource, Transcode> tVar;
        C2080i b = m9170b(cls, cls2, cls3);
        synchronized (this.f7456b) {
            tVar = (C1791t<Data, TResource, Transcode>) this.f7456b.get(b);
        }
        this.f7457c.set(b);
        return tVar;
    }

    /* renamed from: c */
    public boolean mo7724c(C1791t<?, ?, ?> tVar) {
        return f7455a.equals(tVar);
    }

    /* renamed from: d */
    public void mo7725d(Class<?> cls, Class<?> cls2, Class<?> cls3, C1791t<?, ?, ?> tVar) {
        synchronized (this.f7456b) {
            C0823a<C2080i, C1791t<?, ?, ?>> aVar = this.f7456b;
            C2080i iVar = new C2080i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f7455a;
            }
            aVar.put(iVar, tVar);
        }
    }
}
