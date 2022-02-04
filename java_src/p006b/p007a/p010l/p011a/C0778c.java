package p006b.p007a.p010l.p011a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0398a;

/* renamed from: b.a.l.a.c */
public class C0778c extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    private Drawable f3905b;

    public C0778c(Drawable drawable) {
        mo4645b(drawable);
    }

    /* renamed from: a */
    public Drawable mo4644a() {
        return this.f3905b;
    }

    /* renamed from: b */
    public void mo4645b(Drawable drawable) {
        Drawable drawable2 = this.f3905b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3905b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f3905b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f3905b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f3905b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3905b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3905b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3905b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3905b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3905b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3905b.getPadding(rect);
    }

    public int[] getState() {
        return this.f3905b.getState();
    }

    public Region getTransparentRegion() {
        return this.f3905b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0398a.m1971h(this.f3905b);
    }

    public boolean isStateful() {
        return this.f3905b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f3905b.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3905b.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3905b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f3905b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0398a.m1973j(this.f3905b, z);
    }

    public void setChangingConfigurations(int i) {
        this.f3905b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3905b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3905b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3905b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0398a.m1974k(this.f3905b, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0398a.m1975l(this.f3905b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f3905b.setState(iArr);
    }

    public void setTint(int i) {
        C0398a.m1977n(this.f3905b, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0398a.m1978o(this.f3905b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0398a.m1979p(this.f3905b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3905b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
