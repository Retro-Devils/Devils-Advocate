package com.bumptech.glide.load;

import com.bumptech.glide.p144t.C2071b;
import java.security.MessageDigest;
import p006b.p021d.C0823a;

/* renamed from: com.bumptech.glide.load.i */
public final class C1647i implements AbstractC1643g {

    /* renamed from: b */
    private final C0823a<C1644h<?>, Object> f6662b = new C2071b();

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private static <T> void m7878f(C1644h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo7080g(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f6662b.size(); i++) {
            m7878f(this.f6662b.mo5011i(i), this.f6662b.mo5016m(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T mo7084c(C1644h<T> hVar) {
        return this.f6662b.containsKey(hVar) ? (T) this.f6662b.get(hVar) : hVar.mo7078c();
    }

    /* renamed from: d */
    public void mo7085d(C1647i iVar) {
        this.f6662b.mo5013j(iVar.f6662b);
    }

    /* renamed from: e */
    public <T> C1647i mo7086e(C1644h<T> hVar, T t) {
        this.f6662b.put(hVar, t);
        return this;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (obj instanceof C1647i) {
            return this.f6662b.equals(((C1647i) obj).f6662b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return this.f6662b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f6662b + '}';
    }
}
