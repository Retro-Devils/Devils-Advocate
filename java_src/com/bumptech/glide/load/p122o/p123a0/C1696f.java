package com.bumptech.glide.load.p122o.p123a0;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.o.a0.f */
public class C1696f implements AbstractC1695e {
    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: a */
    public void mo7180a(int i) {
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: b */
    public void mo7181b() {
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: c */
    public Bitmap mo7182c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: d */
    public void mo7183d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: e */
    public Bitmap mo7184e(int i, int i2, Bitmap.Config config) {
        return mo7182c(i, i2, config);
    }
}
