package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.p144t.C2078g;
import com.bumptech.glide.p144t.C2082k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.x */
final class C1796x implements AbstractC1643g {

    /* renamed from: b */
    private static final C2078g<Class<?>, byte[]> f7019b = new C2078g<>(50);

    /* renamed from: c */
    private final AbstractC1690b f7020c;

    /* renamed from: d */
    private final AbstractC1643g f7021d;

    /* renamed from: e */
    private final AbstractC1643g f7022e;

    /* renamed from: f */
    private final int f7023f;

    /* renamed from: g */
    private final int f7024g;

    /* renamed from: h */
    private final Class<?> f7025h;

    /* renamed from: i */
    private final C1647i f7026i;

    /* renamed from: j */
    private final AbstractC1651m<?> f7027j;

    C1796x(AbstractC1690b bVar, AbstractC1643g gVar, AbstractC1643g gVar2, int i, int i2, AbstractC1651m<?> mVar, Class<?> cls, C1647i iVar) {
        this.f7020c = bVar;
        this.f7021d = gVar;
        this.f7022e = gVar2;
        this.f7023f = i;
        this.f7024g = i2;
        this.f7027j = mVar;
        this.f7025h = cls;
        this.f7026i = iVar;
    }

    /* renamed from: c */
    private byte[] m8383c() {
        C2078g<Class<?>, byte[]> gVar = f7019b;
        byte[] g = gVar.mo7856g(this.f7025h);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f7025h.getName().getBytes(AbstractC1643g.f6656a);
        gVar.mo7858k(this.f7025h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f7020c.mo7160c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f7023f).putInt(this.f7024g).array();
        this.f7022e.mo7075a(messageDigest);
        this.f7021d.mo7075a(messageDigest);
        messageDigest.update(bArr);
        AbstractC1651m<?> mVar = this.f7027j;
        if (mVar != null) {
            mVar.mo7075a(messageDigest);
        }
        this.f7026i.mo7075a(messageDigest);
        messageDigest.update(m8383c());
        this.f7020c.mo7161d(bArr);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (!(obj instanceof C1796x)) {
            return false;
        }
        C1796x xVar = (C1796x) obj;
        return this.f7024g == xVar.f7024g && this.f7023f == xVar.f7023f && C2082k.m9436c(this.f7027j, xVar.f7027j) && this.f7025h.equals(xVar.f7025h) && this.f7021d.equals(xVar.f7021d) && this.f7022e.equals(xVar.f7022e) && this.f7026i.equals(xVar.f7026i);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        int hashCode = (((((this.f7021d.hashCode() * 31) + this.f7022e.hashCode()) * 31) + this.f7023f) * 31) + this.f7024g;
        AbstractC1651m<?> mVar = this.f7027j;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f7025h.hashCode()) * 31) + this.f7026i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f7021d + ", signature=" + this.f7022e + ", width=" + this.f7023f + ", height=" + this.f7024g + ", decodedResourceClass=" + this.f7025h + ", transformation='" + this.f7027j + '\'' + ", options=" + this.f7026i + '}';
    }
}
