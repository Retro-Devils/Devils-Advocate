package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.j */
public class C1915j extends AbstractC1911f {

    /* renamed from: b */
    private static final byte[] f7186b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(AbstractC1643g.f6648a);

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        messageDigest.update(f7186b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1911f
    /* renamed from: c */
    public Bitmap mo7501c(AbstractC1695e eVar, Bitmap bitmap, int i, int i2) {
        return C1950z.m8826c(eVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        return obj instanceof C1915j;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return -670243078;
    }
}
