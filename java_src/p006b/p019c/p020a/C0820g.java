package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: b.c.a.g */
public class C0820g extends Drawable {

    /* renamed from: a */
    private float f4035a;

    /* renamed from: b */
    private final Paint f4036b;

    /* renamed from: c */
    private final RectF f4037c;

    /* renamed from: d */
    private final Rect f4038d;

    /* renamed from: e */
    private float f4039e;

    /* renamed from: f */
    private boolean f4040f;

    /* renamed from: g */
    private boolean f4041g;

    /* renamed from: h */
    private ColorStateList f4042h;

    /* renamed from: i */
    private PorterDuffColorFilter f4043i;

    /* renamed from: j */
    private ColorStateList f4044j;

    /* renamed from: k */
    private PorterDuff.Mode f4045k;

    /* renamed from: a */
    private PorterDuffColorFilter m4770a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m4771e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4042h = colorStateList;
        this.f4036b.setColor(colorStateList.getColorForState(getState(), this.f4042h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m4772i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f4037c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f4038d.set(rect);
        if (this.f4040f) {
            float d = C0821h.m4782d(this.f4039e, this.f4035a, this.f4041g);
            this.f4038d.inset((int) Math.ceil((double) C0821h.m4781c(this.f4039e, this.f4035a, this.f4041g)), (int) Math.ceil((double) d));
            this.f4037c.set(this.f4038d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo4828b() {
        return this.f4042h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo4829c() {
        return this.f4039e;
    }

    /* renamed from: d */
    public float mo4830d() {
        return this.f4035a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f4036b;
        if (this.f4043i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f4043i);
            z = true;
        }
        RectF rectF = this.f4037c;
        float f = this.f4035a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void mo4832f(ColorStateList colorStateList) {
        m4771e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4833g(float f, boolean z, boolean z2) {
        if (f != this.f4039e || this.f4040f != z || this.f4041g != z2) {
            this.f4039e = f;
            this.f4040f = z;
            this.f4041g = z2;
            m4772i(null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f4038d, this.f4035a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4836h(float f) {
        if (f != this.f4035a) {
            this.f4035a = f;
            m4772i(null);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4044j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f4042h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4772i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4042h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f4036b.getColor();
        if (z) {
            this.f4036b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4044j;
        if (colorStateList2 == null || (mode = this.f4045k) == null) {
            return z;
        }
        this.f4043i = m4770a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f4036b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4036b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4044j = colorStateList;
        this.f4043i = m4770a(colorStateList, this.f4045k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f4045k = mode;
        this.f4043i = m4770a(this.f4044j, mode);
        invalidateSelf();
    }
}
