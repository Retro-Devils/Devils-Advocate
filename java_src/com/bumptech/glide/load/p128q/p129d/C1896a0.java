package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.p144t.C2082k;

/* renamed from: com.bumptech.glide.load.q.d.a0 */
public final class C1896a0 implements AbstractC1649k<Bitmap, Bitmap> {

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.q.d.a0$a */
    public static final class C1897a implements AbstractC1794v<Bitmap> {

        /* renamed from: b */
        private final Bitmap f7164b;

        C1897a(Bitmap bitmap) {
            this.f7164b = bitmap;
        }

        /* renamed from: a */
        public Bitmap mo7358c() {
            return this.f7164b;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1794v
        /* renamed from: b */
        public int mo7357b() {
            return C2082k.m9440g(this.f7164b);
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1794v
        /* renamed from: d */
        public Class<Bitmap> mo7359d() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1794v
        /* renamed from: f */
        public void mo7361f() {
        }
    }

    /* renamed from: c */
    public AbstractC1794v<Bitmap> mo7088a(Bitmap bitmap, int i, int i2, C1647i iVar) {
        return new C1897a(bitmap);
    }

    /* renamed from: d */
    public boolean mo7089b(Bitmap bitmap, C1647i iVar) {
        return true;
    }
}
