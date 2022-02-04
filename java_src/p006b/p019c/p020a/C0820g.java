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
    private float f4039a;

    /* renamed from: b */
    private final Paint f4040b;

    /* renamed from: c */
    private final RectF f4041c;

    /* renamed from: d */
    private final Rect f4042d;

    /* renamed from: e */
    private float f4043e;

    /* renamed from: f */
    private boolean f4044f;

    /* renamed from: g */
    private boolean f4045g;

    /* renamed from: h */
    private ColorStateList f4046h;

    /* renamed from: i */
    private PorterDuffColorFilter f4047i;

    /* renamed from: j */
    private ColorStateList f4048j;

    /* renamed from: k */
    private PorterDuff.Mode f4049k;

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
        this.f4046h = colorStateList;
        this.f4040b.setColor(colorStateList.getColorForState(getState(), this.f4046h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m4772i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f4041c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f4042d.set(rect);
        if (this.f4044f) {
            float d = C0821h.m4782d(this.f4043e, this.f4039a, this.f4045g);
            this.f4042d.inset((int) Math.ceil((double) C0821h.m4781c(this.f4043e, this.f4039a, this.f4045g)), (int) Math.ceil((double) d));
            this.f4041c.set(this.f4042d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo4828b() {
        return this.f4046h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo4829c() {
        return this.f4043e;
    }

    /* renamed from: d */
    public float mo4830d() {
        return this.f4039a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f4040b;
        if (this.f4047i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f4047i);
            z = true;
        }
        RectF rectF = this.f4041c;
        float f = this.f4039a;
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
        if (f != this.f4043e || this.f4044f != z || this.f4045g != z2) {
            this.f4043e = f;
            this.f4044f = z;
            this.f4045g = z2;
            m4772i(null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f4042d, this.f4039a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4836h(float f) {
        if (f != this.f4039a) {
            this.f4039a = f;
            m4772i(null);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4048j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f4046h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4772i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4046h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f4040b.getColor();
        if (z) {
            this.f4040b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4048j;
        if (colorStateList2 == null || (mode = this.f4049k) == null) {
            return z;
        }
        this.f4047i = m4770a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f4040b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4040b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4048j = colorStateList;
        this.f4047i = m4770a(colorStateList, this.f4049k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f4049k = mode;
        this.f4047i = m4770a(this.f4048j, mode);
        invalidateSelf();
    }
}
