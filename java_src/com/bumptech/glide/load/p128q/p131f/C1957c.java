package com.bumptech.glide.load.p128q.p131f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p122o.AbstractC1794v;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.q.f.c */
public final class C1957c extends AbstractC1956b<Drawable> {
    private C1957c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: g */
    static AbstractC1794v<Drawable> m8855g(Drawable drawable) {
        if (drawable != null) {
            return new C1957c(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: b */
    public int mo7357b() {
        return Math.max(1, this.f7267b.getIntrinsicWidth() * this.f7267b.getIntrinsicHeight() * 4);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<android.graphics.drawable.Drawable> */
    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: d */
    public Class<Drawable> mo7359d() {
        return this.f7267b.getClass();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: f */
    public void mo7361f() {
    }
}
