package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p122o.AbstractC1789r;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;

/* renamed from: com.bumptech.glide.load.q.d.e */
public class C1910e implements AbstractC1794v<Bitmap>, AbstractC1789r {

    /* renamed from: b */
    private final Bitmap f7181b;

    /* renamed from: c */
    private final AbstractC1695e f7182c;

    public C1910e(Bitmap bitmap, AbstractC1695e eVar) {
        this.f7181b = (Bitmap) C2081j.m9433e(bitmap, "Bitmap must not be null");
        this.f7182c = (AbstractC1695e) C2081j.m9433e(eVar, "BitmapPool must not be null");
    }

    /* renamed from: g */
    public static C1910e m8673g(Bitmap bitmap, AbstractC1695e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1910e(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1789r
    /* renamed from: a */
    public void mo7379a() {
        this.f7181b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: b */
    public int mo7357b() {
        return C2082k.m9440g(this.f7181b);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: d */
    public Class<Bitmap> mo7359d() {
        return Bitmap.class;
    }

    /* renamed from: e */
    public Bitmap mo7358c() {
        return this.f7181b;
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: f */
    public void mo7361f() {
        this.f7182c.mo7183d(this.f7181b);
    }
}
