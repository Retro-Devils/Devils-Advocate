package com.bumptech.glide.load.p128q.p129d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.p144t.C2082k;

/* renamed from: com.bumptech.glide.load.q.d.f */
public abstract class AbstractC1911f implements AbstractC1651m<Bitmap> {
    @Override // com.bumptech.glide.load.AbstractC1651m
    /* renamed from: b */
    public final AbstractC1794v<Bitmap> mo7091b(Context context, AbstractC1794v<Bitmap> vVar, int i, int i2) {
        if (C2082k.m9451r(i, i2)) {
            AbstractC1695e f = ComponentCallbacks2C1610c.m7749c(context).mo6980f();
            Bitmap c = vVar.mo7358c();
            if (i == Integer.MIN_VALUE) {
                i = c.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = c.getHeight();
            }
            Bitmap c2 = mo7501c(f, c, i, i2);
            return c.equals(c2) ? vVar : C1910e.m8673g(c2, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo7501c(AbstractC1695e eVar, Bitmap bitmap, int i, int i2);
}
