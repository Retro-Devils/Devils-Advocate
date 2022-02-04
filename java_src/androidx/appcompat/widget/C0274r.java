package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.AbstractC0400c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.r */
public class C0274r {

    /* renamed from: a */
    private static final int[] f1177a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f1178b;

    /* renamed from: c */
    private Bitmap f1179c;

    C0274r(ProgressBar progressBar) {
        this.f1178b = progressBar;
    }

    /* renamed from: a */
    private Shape m1369a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: d */
    private Drawable m1370d(Drawable drawable, boolean z) {
        if (drawable instanceof AbstractC0400c) {
            AbstractC0400c cVar = (AbstractC0400c) drawable;
            Drawable a = cVar.mo2255a();
            if (a != null) {
                cVar.mo2256b(m1370d(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1370d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1179c == null) {
                this.f1179c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m1369a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1371e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = m1370d(animationDrawable.getFrame(i), true);
            d.setLevel(10000);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo1714b() {
        return this.f1179c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1715c(AttributeSet attributeSet, int i) {
        C0296w0 v = C0296w0.m1432v(this.f1178b.getContext(), attributeSet, f1177a, i, 0);
        Drawable h = v.mo1811h(0);
        if (h != null) {
            this.f1178b.setIndeterminateDrawable(m1371e(h));
        }
        Drawable h2 = v.mo1811h(1);
        if (h2 != null) {
            this.f1178b.setProgressDrawable(m1370d(h2, false));
        }
        v.mo1823w();
    }
}
