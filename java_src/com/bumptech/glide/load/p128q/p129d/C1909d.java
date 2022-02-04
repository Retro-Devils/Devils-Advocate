package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p122o.p123a0.C1696f;
import com.bumptech.glide.load.p128q.AbstractC1890a;

/* renamed from: com.bumptech.glide.load.q.d.d */
public final class C1909d extends AbstractC1890a<Bitmap> {

    /* renamed from: b */
    private final AbstractC1695e f7180b = new C1696f();

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p128q.AbstractC1890a
    /* renamed from: c */
    public AbstractC1794v<Bitmap> mo7480c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C1910e(decodeBitmap, this.f7180b);
    }
}
