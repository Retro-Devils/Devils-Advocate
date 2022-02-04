package com.bumptech.glide.p137o;

import com.bumptech.glide.p140r.p141j.AbstractC2055h;
import com.bumptech.glide.p144t.C2082k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.p */
public final class C2023p implements AbstractC2012i {

    /* renamed from: b */
    private final Set<AbstractC2055h<?>> f7449b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: a */
    public void mo7041a() {
        for (AbstractC2055h hVar : C2082k.m9442i(this.f7449b)) {
            hVar.mo7041a();
        }
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: f */
    public void mo7042f() {
        for (AbstractC2055h hVar : C2082k.m9442i(this.f7449b)) {
            hVar.mo7042f();
        }
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: k */
    public void mo7043k() {
        for (AbstractC2055h hVar : C2082k.m9442i(this.f7449b)) {
            hVar.mo7043k();
        }
    }

    /* renamed from: l */
    public void mo7711l() {
        this.f7449b.clear();
    }

    /* renamed from: m */
    public List<AbstractC2055h<?>> mo7712m() {
        return C2082k.m9442i(this.f7449b);
    }

    /* renamed from: n */
    public void mo7713n(AbstractC2055h<?> hVar) {
        this.f7449b.add(hVar);
    }

    /* renamed from: o */
    public void mo7714o(AbstractC2055h<?> hVar) {
        this.f7449b.remove(hVar);
    }
}
