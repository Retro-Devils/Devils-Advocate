package com.bumptech.glide.load.p128q.p134i;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p128q.p130e.C1954b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.q.i.a */
public class C1979a implements AbstractC1983e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f7322a;

    /* renamed from: b */
    private final int f7323b;

    public C1979a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C1979a(Bitmap.CompressFormat compressFormat, int i) {
        this.f7322a = compressFormat;
        this.f7323b = i;
    }

    @Override // com.bumptech.glide.load.p128q.p134i.AbstractC1983e
    /* renamed from: a */
    public AbstractC1794v<byte[]> mo7624a(AbstractC1794v<Bitmap> vVar, C1647i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.mo7358c().compress(this.f7322a, this.f7323b, byteArrayOutputStream);
        vVar.mo7361f();
        return new C1954b(byteArrayOutputStream.toByteArray());
    }
}
