package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.p144t.C2068a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.t */
public final class C1942t implements AbstractC1649k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1909d f7243a = new C1909d();

    /* renamed from: c */
    public AbstractC1794v<Bitmap> mo7088a(InputStream inputStream, int i, int i2, C1647i iVar) {
        return this.f7243a.mo7088a(ImageDecoder.createSource(C2068a.m9399b(inputStream)), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7089b(InputStream inputStream, C1647i iVar) {
        return true;
    }
}
