package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0230h0;
import p006b.p007a.C0763j;
import p069c.p073b.p074a.p090b.C1400k;

/* renamed from: com.google.android.material.internal.e */
public class C3173e extends C0230h0 {

    /* renamed from: q */
    private Drawable f10643q;

    /* renamed from: r */
    private final Rect f10644r;

    /* renamed from: s */
    private final Rect f10645s;

    /* renamed from: t */
    private int f10646t;

    /* renamed from: u */
    protected boolean f10647u;

    /* renamed from: v */
    boolean f10648v;

    public C3173e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3173e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10644r = new Rect();
        this.f10645s = new Rect();
        this.f10646t = C0763j.f3614I0;
        this.f10647u = true;
        this.f10648v = false;
        TypedArray h = C3202o.m13430h(context, attributeSet, C1400k.f5848c1, i, 0, new int[0]);
        this.f10646t = h.getInt(C1400k.f5862e1, this.f10646t);
        Drawable drawable = h.getDrawable(C1400k.f5855d1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f10647u = h.getBoolean(C1400k.f5869f1, true);
        h.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f10643q;
        if (drawable != null) {
            if (this.f10648v) {
                this.f10648v = false;
                Rect rect = this.f10644r;
                Rect rect2 = this.f10645s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f10647u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f10646t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f10643q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10643q;
        if (drawable != null && drawable.isStateful()) {
            this.f10643q.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f10643q;
    }

    public int getForegroundGravity() {
        return this.f10646t;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10643q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0230h0
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f10648v = z | this.f10648v;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f10648v = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f10643q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f10643q);
            }
            this.f10643q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f10646t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f10646t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f10646t = i;
            if (i == 119 && this.f10643q != null) {
                this.f10643q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10643q;
    }
}
