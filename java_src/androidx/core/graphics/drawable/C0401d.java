package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.d */
public class C0401d extends Drawable implements Drawable.Callback, AbstractC0400c, AbstractC0399b {

    /* renamed from: b */
    static final PorterDuff.Mode f2099b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private int f2100c;

    /* renamed from: d */
    private PorterDuff.Mode f2101d;

    /* renamed from: e */
    private boolean f2102e;

    /* renamed from: f */
    C0403f f2103f;

    /* renamed from: g */
    private boolean f2104g;

    /* renamed from: h */
    Drawable f2105h;

    C0401d(Drawable drawable) {
        this.f2103f = m1984d();
        mo2256b(drawable);
    }

    C0401d(C0403f fVar, Resources resources) {
        this.f2103f = fVar;
        m1985e(resources);
    }

    /* renamed from: d */
    private C0403f m1984d() {
        return new C0403f(this.f2103f);
    }

    /* renamed from: e */
    private void m1985e(Resources resources) {
        Drawable.ConstantState constantState;
        C0403f fVar = this.f2103f;
        if (fVar != null && (constantState = fVar.f2108b) != null) {
            mo2256b(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m1986f(int[] iArr) {
        if (!mo2257c()) {
            return false;
        }
        C0403f fVar = this.f2103f;
        ColorStateList colorStateList = fVar.f2109c;
        PorterDuff.Mode mode = fVar.f2110d;
        if (colorStateList == null || mode == null) {
            this.f2102e = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2102e && colorForState == this.f2100c && mode == this.f2101d)) {
                setColorFilter(colorForState, mode);
                this.f2100c = colorForState;
                this.f2101d = mode;
                this.f2102e = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0400c
    /* renamed from: a */
    public final Drawable mo2255a() {
        return this.f2105h;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0400c
    /* renamed from: b */
    public final void mo2256b(Drawable drawable) {
        Drawable drawable2 = this.f2105h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2105h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0403f fVar = this.f2103f;
            if (fVar != null) {
                fVar.f2108b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2257c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2105h.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0403f fVar = this.f2103f;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2105h.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0403f fVar = this.f2103f;
        if (fVar == null || !fVar.mo2292a()) {
            return null;
        }
        this.f2103f.f2107a = getChangingConfigurations();
        return this.f2103f;
    }

    public Drawable getCurrent() {
        return this.f2105h.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2105h.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2105h.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2105h.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2105h.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2105h.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2105h.getPadding(rect);
    }

    public int[] getState() {
        return this.f2105h.getState();
    }

    public Region getTransparentRegion() {
        return this.f2105h.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2105h.isAutoMirrored();
    }

    public boolean isStateful() {
        C0403f fVar;
        ColorStateList colorStateList = (!mo2257c() || (fVar = this.f2103f) == null) ? null : fVar.f2109c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2105h.isStateful();
    }

    public void jumpToCurrentState() {
        this.f2105h.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2104g && super.mutate() == this) {
            this.f2103f = m1984d();
            Drawable drawable = this.f2105h;
            if (drawable != null) {
                drawable.mutate();
            }
            C0403f fVar = this.f2103f;
            if (fVar != null) {
                Drawable drawable2 = this.f2105h;
                fVar.f2108b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2104g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2105h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2105h.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2105h.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2105h.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2105h.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2105h.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2105h.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2105h.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1986f(iArr) || this.f2105h.setState(iArr);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        this.f2103f.f2109c = colorStateList;
        m1986f(getState());
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2103f.f2110d = mode;
        m1986f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2105h.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
