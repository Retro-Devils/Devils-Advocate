package com.bumptech.glide.p140r.p141j;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.r.j.f */
public class C2053f {
    /* renamed from: a */
    public <Z> AbstractC2056i<ImageView, Z> mo7819a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C2049b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2051d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
