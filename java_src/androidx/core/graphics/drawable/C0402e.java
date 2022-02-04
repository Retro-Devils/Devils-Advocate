package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.e */
public class C0402e extends C0401d {

    /* renamed from: i */
    private static Method f2106i;

    C0402e(Drawable drawable) {
        super(drawable);
        m1990g();
    }

    C0402e(C0403f fVar, Resources resources) {
        super(fVar, resources);
        m1990g();
    }

    /* renamed from: g */
    private void m1990g() {
        if (f2106i == null) {
            try {
                f2106i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.drawable.C0401d
    /* renamed from: c */
    public boolean mo2257c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2105h;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f2105h.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2105h.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2105h;
        if (!(drawable == null || (method = f2106i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f2105h.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2105h.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.C0401d
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0401d, androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        if (mo2257c()) {
            super.setTint(i);
        } else {
            this.f2105h.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0401d, androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        if (mo2257c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2105h.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0401d, androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2257c()) {
            super.setTintMode(mode);
        } else {
            this.f2105h.setTintMode(mode);
        }
    }
}
