package com.bumptech.glide.load.p128q.p133h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p128q.p129d.C1910e;
import com.bumptech.glide.p144t.C2081j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.h.f */
public class C1970f implements AbstractC1651m<C1966c> {

    /* renamed from: b */
    private final AbstractC1651m<Bitmap> f7291b;

    public C1970f(AbstractC1651m<Bitmap> mVar) {
        this.f7291b = (AbstractC1651m) C2081j.m9432d(mVar);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        this.f7291b.mo7075a(messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC1651m
    /* renamed from: b */
    public AbstractC1794v<C1966c> mo7091b(Context context, AbstractC1794v<C1966c> vVar, int i, int i2) {
        C1966c c = vVar.mo7358c();
        AbstractC1794v<Bitmap> eVar = new C1910e(c.mo7580e(), ComponentCallbacks2C1610c.m7749c(context).mo6980f());
        AbstractC1794v<Bitmap> b = this.f7291b.mo7091b(context, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.mo7361f();
        }
        c.mo7590m(this.f7291b, b.mo7358c());
        return vVar;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (obj instanceof C1970f) {
            return this.f7291b.equals(((C1970f) obj).f7291b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return this.f7291b.hashCode();
    }
}
