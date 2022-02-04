package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.d.h */
public final class C1913h implements AbstractC1649k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C1909d f7184a = new C1909d();

    /* renamed from: c */
    public AbstractC1794v<Bitmap> mo7088a(ByteBuffer byteBuffer, int i, int i2, C1647i iVar) {
        return this.f7184a.mo7088a(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7089b(ByteBuffer byteBuffer, C1647i iVar) {
        return true;
    }
}
