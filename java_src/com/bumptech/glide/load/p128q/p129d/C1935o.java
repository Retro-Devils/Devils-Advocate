package com.bumptech.glide.load.p128q.p129d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.o */
public class C1935o implements AbstractC1651m<Drawable> {

    /* renamed from: b */
    private final AbstractC1651m<Bitmap> f7227b;

    /* renamed from: c */
    private final boolean f7228c;

    public C1935o(AbstractC1651m<Bitmap> mVar, boolean z) {
        this.f7227b = mVar;
        this.f7228c = z;
    }

    /* renamed from: d */
    private AbstractC1794v<Drawable> m8769d(Context context, AbstractC1794v<Bitmap> vVar) {
        return C1943u.m8799g(context.getResources(), vVar);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        this.f7227b.mo7075a(messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC1651m
    /* renamed from: b */
    public AbstractC1794v<Drawable> mo7091b(Context context, AbstractC1794v<Drawable> vVar, int i, int i2) {
        AbstractC1695e f = ComponentCallbacks2C1610c.m7749c(context).mo6980f();
        Drawable c = vVar.mo7358c();
        AbstractC1794v<Bitmap> a = C1933n.m8766a(f, c, i, i2);
        if (a != null) {
            AbstractC1794v<Bitmap> b = this.f7227b.mo7091b(context, a, i, i2);
            if (!b.equals(a)) {
                return m8769d(context, b);
            }
            b.mo7361f();
            return vVar;
        } else if (!this.f7228c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + c + " to a Bitmap");
        }
    }

    /* renamed from: c */
    public AbstractC1651m<BitmapDrawable> mo7524c() {
        return this;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (obj instanceof C1935o) {
            return this.f7227b.equals(((C1935o) obj).f7227b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return this.f7227b.hashCode();
    }
}
