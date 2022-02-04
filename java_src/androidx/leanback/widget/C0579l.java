package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: androidx.leanback.widget.l */
class C0579l extends LinearLayout {

    /* renamed from: b */
    private Drawable f2911b;

    /* renamed from: c */
    private boolean f2912c;

    /* renamed from: d */
    private final Rect f2913d;

    public C0579l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0579l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2913d = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                mo3529a(drawable);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo3529a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0558d.m2833a(this, drawable);
        } else if (this.f2911b != drawable) {
            this.f2911b = drawable;
            this.f2912c = true;
            setWillNotDraw(false);
            this.f2911b.setCallback(this);
            if (this.f2911b.isStateful()) {
                this.f2911b.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2911b;
        if (drawable != null) {
            if (this.f2912c) {
                this.f2912c = false;
                Rect rect = this.f2913d;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2911b;
        if (drawable != null && drawable.isStateful()) {
            this.f2911b.setState(getDrawableState());
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2911b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2912c = z | this.f2912c;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2911b;
    }
}
