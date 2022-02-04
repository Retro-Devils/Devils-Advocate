package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p128q.p131f.C1958d;

/* renamed from: com.bumptech.glide.load.q.d.x */
public class C1947x implements AbstractC1649k<Uri, Bitmap> {

    /* renamed from: a */
    private final C1958d f7253a;

    /* renamed from: b */
    private final AbstractC1695e f7254b;

    public C1947x(C1958d dVar, AbstractC1695e eVar) {
        this.f7253a = dVar;
        this.f7254b = eVar;
    }

    /* renamed from: c */
    public AbstractC1794v<Bitmap> mo7088a(Uri uri, int i, int i2, C1647i iVar) {
        AbstractC1794v<Drawable> c = this.f7253a.mo7088a(uri, i, i2, iVar);
        if (c == null) {
            return null;
        }
        return C1933n.m8766a(this.f7254b, c.mo7358c(), i, i2);
    }

    /* renamed from: d */
    public boolean mo7089b(Uri uri, C1647i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
