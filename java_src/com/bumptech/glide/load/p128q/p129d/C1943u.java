package com.bumptech.glide.load.p128q.p129d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p122o.AbstractC1789r;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.p144t.C2081j;

/* renamed from: com.bumptech.glide.load.q.d.u */
public final class C1943u implements AbstractC1794v<BitmapDrawable>, AbstractC1789r {

    /* renamed from: b */
    private final Resources f7244b;

    /* renamed from: c */
    private final AbstractC1794v<Bitmap> f7245c;

    private C1943u(Resources resources, AbstractC1794v<Bitmap> vVar) {
        this.f7244b = (Resources) C2081j.m9432d(resources);
        this.f7245c = (AbstractC1794v) C2081j.m9432d(vVar);
    }

    /* renamed from: g */
    public static AbstractC1794v<BitmapDrawable> m8799g(Resources resources, AbstractC1794v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new C1943u(resources, vVar);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1789r
    /* renamed from: a */
    public void mo7379a() {
        AbstractC1794v<Bitmap> vVar = this.f7245c;
        if (vVar instanceof AbstractC1789r) {
            ((AbstractC1789r) vVar).mo7379a();
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: b */
    public int mo7357b() {
        return this.f7245c.mo7357b();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: d */
    public Class<BitmapDrawable> mo7359d() {
        return BitmapDrawable.class;
    }

    /* renamed from: e */
    public BitmapDrawable mo7358c() {
        return new BitmapDrawable(this.f7244b, this.f7245c.mo7358c());
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: f */
    public void mo7361f() {
        this.f7245c.mo7361f();
    }
}
