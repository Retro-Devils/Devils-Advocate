package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.d */
final class C1747d implements AbstractC1643g {

    /* renamed from: b */
    private final AbstractC1643g f6829b;

    /* renamed from: c */
    private final AbstractC1643g f6830c;

    C1747d(AbstractC1643g gVar, AbstractC1643g gVar2) {
        this.f6829b = gVar;
        this.f6830c = gVar2;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        this.f6829b.mo7075a(messageDigest);
        this.f6830c.mo7075a(messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (!(obj instanceof C1747d)) {
            return false;
        }
        C1747d dVar = (C1747d) obj;
        return this.f6829b.equals(dVar.f6829b) && this.f6830c.equals(dVar.f6830c);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return (this.f6829b.hashCode() * 31) + this.f6830c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f6829b + ", signature=" + this.f6830c + '}';
    }
}
