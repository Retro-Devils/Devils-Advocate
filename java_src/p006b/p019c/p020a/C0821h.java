package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: b.c.a.h */
public class C0821h extends Drawable {

    /* renamed from: a */
    private static final double f4046a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    static AbstractC0822a f4047b;

    /* renamed from: c */
    private final int f4048c;

    /* renamed from: d */
    private Paint f4049d;

    /* renamed from: e */
    private Paint f4050e;

    /* renamed from: f */
    private Paint f4051f;

    /* renamed from: g */
    private final RectF f4052g;

    /* renamed from: h */
    private float f4053h;

    /* renamed from: i */
    private Path f4054i;

    /* renamed from: j */
    private float f4055j;

    /* renamed from: k */
    private float f4056k;

    /* renamed from: l */
    private float f4057l;

    /* renamed from: m */
    private ColorStateList f4058m;

    /* renamed from: n */
    private boolean f4059n;

    /* renamed from: o */
    private final int f4060o;

    /* renamed from: p */
    private final int f4061p;

    /* renamed from: q */
    private boolean f4062q;

    /* renamed from: r */
    private boolean f4063r;

    /* renamed from: b.c.a.h$a */
    interface AbstractC0822a {
        /* renamed from: a */
        void mo4807a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: a */
    private void m4779a(Rect rect) {
        float f = this.f4055j;
        float f2 = 1.5f * f;
        this.f4052g.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m4780b();
    }

    /* renamed from: b */
    private void m4780b() {
        float f = this.f4053h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f4056k;
        rectF2.inset(-f2, -f2);
        Path path = this.f4054i;
        if (path == null) {
            this.f4054i = new Path();
        } else {
            path.reset();
        }
        this.f4054i.setFillType(Path.FillType.EVEN_ODD);
        this.f4054i.moveTo(-this.f4053h, 0.0f);
        this.f4054i.rLineTo(-this.f4056k, 0.0f);
        this.f4054i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f4054i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f4054i.close();
        float f3 = this.f4053h;
        float f4 = f3 / (this.f4056k + f3);
        Paint paint = this.f4050e;
        float f5 = this.f4053h + this.f4056k;
        int i = this.f4060o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f4061p}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f4051f;
        float f6 = this.f4053h;
        float f7 = this.f4056k;
        int i2 = this.f4060o;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f4061p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f4051f.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m4781c(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f4046a) * d2));
    }

    /* renamed from: d */
    static float m4782d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = (double) f3;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f4046a) * d2));
    }

    /* renamed from: e */
    private void m4783e(Canvas canvas) {
        float f = this.f4053h;
        float f2 = (-f) - this.f4056k;
        float f3 = f + ((float) this.f4048c) + (this.f4057l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f4052g.width() - f4 > 0.0f;
        boolean z2 = this.f4052g.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f4052g;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f4054i, this.f4050e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f4052g.width() - f4, -this.f4053h, this.f4051f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f4052g;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f4054i, this.f4050e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f4052g.width() - f4, (-this.f4053h) + this.f4056k, this.f4051f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f4052g;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f4054i, this.f4050e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f4052g.height() - f4, -this.f4053h, this.f4051f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f4052g;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f4054i, this.f4050e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f4052g.height() - f4, -this.f4053h, this.f4051f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m4784n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4058m = colorStateList;
        this.f4049d.setColor(colorStateList.getColorForState(getState(), this.f4058m.getDefaultColor()));
    }

    /* renamed from: s */
    private void m4785s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) m4786t(f);
            float t2 = (float) m4786t(f2);
            if (t > t2) {
                if (!this.f4063r) {
                    this.f4063r = true;
                }
                t = t2;
            }
            if (this.f4057l != t || this.f4055j != t2) {
                this.f4057l = t;
                this.f4055j = t2;
                this.f4056k = (float) ((int) ((t * 1.5f) + ((float) this.f4048c) + 0.5f));
                this.f4059n = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m4786t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f4059n) {
            m4779a(getBounds());
            this.f4059n = false;
        }
        canvas.translate(0.0f, this.f4057l / 2.0f);
        m4783e(canvas);
        canvas.translate(0.0f, (-this.f4057l) / 2.0f);
        f4047b.mo4807a(canvas, this.f4052g, this.f4053h, this.f4049d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo4845f() {
        return this.f4058m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo4846g() {
        return this.f4053h;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m4782d(this.f4055j, this.f4053h, this.f4062q));
        int ceil2 = (int) Math.ceil((double) m4781c(this.f4055j, this.f4053h, this.f4062q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4849h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo4850i() {
        return this.f4055j;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f4058m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo4852j() {
        float f = this.f4055j;
        return (Math.max(f, this.f4053h + ((float) this.f4048c) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f4055j * 1.5f) + ((float) this.f4048c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo4853k() {
        float f = this.f4055j;
        return (Math.max(f, this.f4053h + ((float) this.f4048c) + (f / 2.0f)) * 2.0f) + ((this.f4055j + ((float) this.f4048c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo4854l() {
        return this.f4057l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4855m(boolean z) {
        this.f4062q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4856o(ColorStateList colorStateList) {
        m4784n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4059n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f4058m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f4049d.getColor() == colorForState) {
            return false;
        }
        this.f4049d.setColor(colorForState);
        this.f4059n = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4859p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f4053h != f2) {
                this.f4053h = f2;
                this.f4059n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4860q(float f) {
        m4785s(this.f4057l, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4861r(float f) {
        m4785s(f, this.f4055j);
    }

    public void setAlpha(int i) {
        this.f4049d.setAlpha(i);
        this.f4050e.setAlpha(i);
        this.f4051f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4049d.setColorFilter(colorFilter);
    }
}
