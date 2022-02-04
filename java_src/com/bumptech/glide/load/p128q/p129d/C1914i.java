package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.i */
public class C1914i extends AbstractC1911f {

    /* renamed from: b */
    private static final byte[] f7193b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(AbstractC1643g.f6656a);

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        messageDigest.update(f7193b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1911f
    /* renamed from: c */
    public Bitmap mo7501c(AbstractC1695e eVar, Bitmap bitmap, int i, int i2) {
        return C1950z.m8825b(eVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        return obj instanceof C1914i;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return -599754482;
    }
}
