package com.bumptech.glide.p137o;

import com.bumptech.glide.p144t.C2082k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.o.a */
public class C2002a implements AbstractC2011h {

    /* renamed from: a */
    private final Set<AbstractC2012i> f7422a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f7423b;

    /* renamed from: c */
    private boolean f7424c;

    C2002a() {
    }

    @Override // com.bumptech.glide.p137o.AbstractC2011h
    /* renamed from: a */
    public void mo7668a(AbstractC2012i iVar) {
        this.f7422a.add(iVar);
        if (this.f7424c) {
            iVar.mo7043k();
        } else if (this.f7423b) {
            iVar.mo7041a();
        } else {
            iVar.mo7042f();
        }
    }

    @Override // com.bumptech.glide.p137o.AbstractC2011h
    /* renamed from: b */
    public void mo7669b(AbstractC2012i iVar) {
        this.f7422a.remove(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7670c() {
        this.f7424c = true;
        for (AbstractC2012i iVar : C2082k.m9442i(this.f7422a)) {
            iVar.mo7043k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7671d() {
        this.f7423b = true;
        for (AbstractC2012i iVar : C2082k.m9442i(this.f7422a)) {
            iVar.mo7041a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7672e() {
        this.f7423b = false;
        for (AbstractC2012i iVar : C2082k.m9442i(this.f7422a)) {
            iVar.mo7042f();
        }
    }
}
