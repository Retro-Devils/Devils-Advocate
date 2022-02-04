package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p122o.p123a0.C1696f;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.q.d.n */
public final class C1933n {

    /* renamed from: a */
    private static final AbstractC1695e f7218a = new C1934a();

    /* renamed from: com.bumptech.glide.load.q.d.n$a */
    class C1934a extends C1696f {
        C1934a() {
        }

        @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e, com.bumptech.glide.load.p122o.p123a0.C1696f
        /* renamed from: d */
        public void mo7183d(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static AbstractC1794v<Bitmap> m8766a(AbstractC1695e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m8767b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f7218a;
        }
        return C1910e.m8673g(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m8767b(AbstractC1695e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock f = C1950z.m8829f();
            f.lock();
            Bitmap c = eVar.mo7182c(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(c);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return c;
            } finally {
                f.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
