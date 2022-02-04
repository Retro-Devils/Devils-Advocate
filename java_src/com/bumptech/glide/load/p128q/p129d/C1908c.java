package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC1650l;
import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1632c;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;

/* renamed from: com.bumptech.glide.load.q.d.c */
public class C1908c implements AbstractC1650l<Bitmap> {

    /* renamed from: a */
    public static final C1644h<Integer> f7177a = C1644h.m7873f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b */
    public static final C1644h<Bitmap.CompressFormat> f7178b = C1644h.m7872e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: c */
    private final AbstractC1690b f7179c;

    public C1908c(AbstractC1690b bVar) {
        this.f7179c = bVar;
    }

    /* renamed from: d */
    private Bitmap.CompressFormat m8668d(Bitmap bitmap, C1647i iVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.mo7084c(f7178b);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.AbstractC1650l
    /* renamed from: b */
    public EnumC1632c mo7090b(C1647i iVar) {
        return EnumC1632c.TRANSFORMED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc A[SYNTHETIC, Splitter:B:34:0x00bc] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7072a(com.bumptech.glide.load.p122o.AbstractC1794v<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.C1647i r11) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p128q.p129d.C1908c.mo7072a(com.bumptech.glide.load.o.v, java.io.File, com.bumptech.glide.load.i):boolean");
    }
}
