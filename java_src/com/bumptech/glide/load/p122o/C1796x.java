package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.p144t.C2078g;
import com.bumptech.glide.p144t.C2082k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.x */
public final class C1796x implements AbstractC1643g {

    /* renamed from: b */
    private static final C2078g<Class<?>, byte[]> f7011b = new C2078g<>(50);

    /* renamed from: c */
    private final AbstractC1690b f7012c;

    /* renamed from: d */
    private final AbstractC1643g f7013d;

    /* renamed from: e */
    private final AbstractC1643g f7014e;

    /* renamed from: f */
    private final int f7015f;

    /* renamed from: g */
    private final int f7016g;

    /* renamed from: h */
    private final Class<?> f7017h;

    /* renamed from: i */
    private final C1647i f7018i;

    /* renamed from: j */
    private final AbstractC1651m<?> f7019j;

    C1796x(AbstractC1690b bVar, AbstractC1643g gVar, AbstractC1643g gVar2, int i, int i2, AbstractC1651m<?> mVar, Class<?> cls, C1647i iVar) {
        this.f7012c = bVar;
        this.f7013d = gVar;
        this.f7014e = gVar2;
        this.f7015f = i;
        this.f7016g = i2;
        this.f7019j = mVar;
        this.f7017h = cls;
        this.f7018i = iVar;
    }

    /* renamed from: c */
    private byte[] m8383c() {
        C2078g<Class<?>, byte[]> gVar = f7011b;
        byte[] g = gVar.mo7856g(this.f7017h);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f7017h.getName().getBytes(AbstractC1643g.f6648a);
        gVar.mo7858k(this.f7017h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f7012c.mo7160c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f7015f).putInt(this.f7016g).array();
        this.f7014e.mo7075a(messageDigest);
        this.f7013d.mo7075a(messageDigest);
        messageDigest.update(bArr);
        AbstractC1651m<?> mVar = this.f7019j;
        if (mVar != null) {
            mVar.mo7075a(messageDigest);
        }
        this.f7018i.mo7075a(messageDigest);
        messageDigest.update(m8383c());
        this.f7012c.mo7161d(bArr);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (!(obj instanceof C1796x)) {
            return false;
        }
        C1796x xVar = (C1796x) obj;
        return this.f7016g == xVar.f7016g && this.f7015f == xVar.f7015f && C2082k.m9436c(this.f7019j, xVar.f7019j) && this.f7017h.equals(xVar.f7017h) && this.f7013d.equals(xVar.f7013d) && this.f7014e.equals(xVar.f7014e) && this.f7018i.equals(xVar.f7018i);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        int hashCode = (((((this.f7013d.hashCode() * 31) + this.f7014e.hashCode()) * 31) + this.f7015f) * 31) + this.f7016g;
        AbstractC1651m<?> mVar = this.f7019j;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f7017h.hashCode()) * 31) + this.f7018i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f7013d + ", signature=" + this.f7014e + ", width=" + this.f7015f + ", height=" + this.f7016g + ", decodedResourceClass=" + this.f7017h + ", transformation='" + this.f7019j + '\'' + ", options=" + this.f7018i + '}';
    }
}
