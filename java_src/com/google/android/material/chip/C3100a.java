package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.AbstractC0399b;
import androidx.core.graphics.drawable.C0398a;
import com.google.android.material.internal.C3199n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p031d.C0901a;
import p006b.p030g.p037i.C0937a;
import p069c.p073b.p074a.p090b.p092l.C1408h;
import p069c.p073b.p074a.p090b.p093m.C1412a;
import p069c.p073b.p074a.p090b.p099r.C1429a;
import p069c.p073b.p074a.p090b.p104w.C1438d;
import p069c.p073b.p074a.p090b.p105x.C1446b;
import p069c.p073b.p074a.p090b.p107z.C1455g;

/* renamed from: com.google.android.material.chip.a */
public class C3100a extends C1455g implements AbstractC0399b, Drawable.Callback, C3199n.AbstractC3201b {

    /* renamed from: A */
    private static final ShapeDrawable f10316A = new ShapeDrawable(new OvalShape());

    /* renamed from: z */
    private static final int[] f10317z = {16842910};

    /* renamed from: A0 */
    private PorterDuffColorFilter f10318A0;

    /* renamed from: B */
    private ColorStateList f10319B;

    /* renamed from: B0 */
    private ColorStateList f10320B0;

    /* renamed from: C */
    private ColorStateList f10321C;

    /* renamed from: C0 */
    private PorterDuff.Mode f10322C0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: D */
    private float f10323D;

    /* renamed from: D0 */
    private int[] f10324D0;

    /* renamed from: E */
    private float f10325E = -1.0f;

    /* renamed from: E0 */
    private boolean f10326E0;

    /* renamed from: F */
    private ColorStateList f10327F;

    /* renamed from: F0 */
    private ColorStateList f10328F0;

    /* renamed from: G */
    private float f10329G;

    /* renamed from: G0 */
    private WeakReference<AbstractC3101a> f10330G0 = new WeakReference<>(null);

    /* renamed from: H */
    private ColorStateList f10331H;

    /* renamed from: H0 */
    private TextUtils.TruncateAt f10332H0;

    /* renamed from: I */
    private CharSequence f10333I;

    /* renamed from: I0 */
    private boolean f10334I0;

    /* renamed from: J */
    private boolean f10335J;

    /* renamed from: J0 */
    private int f10336J0;

    /* renamed from: K */
    private Drawable f10337K;

    /* renamed from: K0 */
    private boolean f10338K0;

    /* renamed from: L */
    private ColorStateList f10339L;

    /* renamed from: M */
    private float f10340M;

    /* renamed from: N */
    private boolean f10341N;

    /* renamed from: O */
    private boolean f10342O;

    /* renamed from: P */
    private Drawable f10343P;

    /* renamed from: Q */
    private Drawable f10344Q;

    /* renamed from: R */
    private ColorStateList f10345R;

    /* renamed from: S */
    private float f10346S;

    /* renamed from: T */
    private CharSequence f10347T;

    /* renamed from: U */
    private boolean f10348U;

    /* renamed from: V */
    private boolean f10349V;

    /* renamed from: W */
    private Drawable f10350W;

    /* renamed from: X */
    private ColorStateList f10351X;

    /* renamed from: Y */
    private C1408h f10352Y;

    /* renamed from: Z */
    private C1408h f10353Z;

    /* renamed from: a0 */
    private float f10354a0;

    /* renamed from: b0 */
    private float f10355b0;

    /* renamed from: c0 */
    private float f10356c0;

    /* renamed from: d0 */
    private float f10357d0;

    /* renamed from: e0 */
    private float f10358e0;

    /* renamed from: f0 */
    private float f10359f0;

    /* renamed from: g0 */
    private float f10360g0;

    /* renamed from: h0 */
    private float f10361h0;

    /* renamed from: i0 */
    private final Context f10362i0;

    /* renamed from: j0 */
    private final Paint f10363j0 = new Paint(1);

    /* renamed from: k0 */
    private final Paint f10364k0;

    /* renamed from: l0 */
    private final Paint.FontMetrics f10365l0 = new Paint.FontMetrics();

    /* renamed from: m0 */
    private final RectF f10366m0 = new RectF();

    /* renamed from: n0 */
    private final PointF f10367n0 = new PointF();

    /* renamed from: o0 */
    private final Path f10368o0 = new Path();

    /* renamed from: p0 */
    private final C3199n f10369p0;

    /* renamed from: q0 */
    private int f10370q0;

    /* renamed from: r0 */
    private int f10371r0;

    /* renamed from: s0 */
    private int f10372s0;

    /* renamed from: t0 */
    private int f10373t0;

    /* renamed from: u0 */
    private int f10374u0;

    /* renamed from: v0 */
    private int f10375v0;

    /* renamed from: w0 */
    private boolean f10376w0;

    /* renamed from: x0 */
    private int f10377x0;

    /* renamed from: y0 */
    private int f10378y0 = 255;

    /* renamed from: z0 */
    private ColorFilter f10379z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface AbstractC3101a {
        /* renamed from: a */
        void mo10087a();
    }

    private C3100a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo6603M(context);
        this.f10362i0 = context;
        C3199n nVar = new C3199n(this);
        this.f10369p0 = nVar;
        this.f10333I = "";
        nVar.mo10793e().density = context.getResources().getDisplayMetrics().density;
        this.f10364k0 = null;
        int[] iArr = f10317z;
        setState(iArr);
        mo10335g2(iArr);
        this.f10334I0 = true;
        if (C1446b.f6096a) {
            f10316A.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m12836A0(Canvas canvas, Rect rect) {
        Paint paint = this.f10364k0;
        if (paint != null) {
            paint.setColor(C0901a.m5300h(-16777216, 127));
            canvas.drawRect(rect, this.f10364k0);
            if (m12839I2() || m12838H2()) {
                m12847i0(rect, this.f10366m0);
                canvas.drawRect(this.f10366m0, this.f10364k0);
            }
            if (this.f10333I != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f10364k0);
            }
            if (m12840J2()) {
                m12850l0(rect, this.f10366m0);
                canvas.drawRect(this.f10366m0, this.f10364k0);
            }
            this.f10364k0.setColor(C0901a.m5300h(-65536, 127));
            m12849k0(rect, this.f10366m0);
            canvas.drawRect(this.f10366m0, this.f10364k0);
            this.f10364k0.setColor(C0901a.m5300h(-16711936, 127));
            m12851m0(rect, this.f10366m0);
            canvas.drawRect(this.f10366m0, this.f10364k0);
        }
    }

    /* renamed from: B0 */
    private void m12837B0(Canvas canvas, Rect rect) {
        if (this.f10333I != null) {
            Paint.Align q0 = mo10358q0(rect, this.f10367n0);
            m12854o0(rect, this.f10366m0);
            if (this.f10369p0.mo10792d() != null) {
                this.f10369p0.mo10793e().drawableState = getState();
                this.f10369p0.mo10798j(this.f10362i0);
            }
            this.f10369p0.mo10793e().setTextAlign(q0);
            int i = 0;
            boolean z = Math.round(this.f10369p0.mo10794f(mo10327c1().toString())) > Math.round(this.f10366m0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f10366m0);
            }
            CharSequence charSequence = this.f10333I;
            if (z && this.f10332H0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f10369p0.mo10793e(), this.f10366m0.width(), this.f10332H0);
            }
            int length = charSequence.length();
            PointF pointF = this.f10367n0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f10369p0.mo10793e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: H2 */
    private boolean m12838H2() {
        return this.f10349V && this.f10350W != null && this.f10376w0;
    }

    /* renamed from: I2 */
    private boolean m12839I2() {
        return this.f10335J && this.f10337K != null;
    }

    /* renamed from: J2 */
    private boolean m12840J2() {
        return this.f10342O && this.f10343P != null;
    }

    /* renamed from: K2 */
    private void m12841K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: L2 */
    private void m12842L2() {
        this.f10328F0 = this.f10326E0 ? C1446b.m7103a(this.f10331H) : null;
    }

    @TargetApi(21)
    /* renamed from: M2 */
    private void m12843M2() {
        this.f10344Q = new RippleDrawable(C1446b.m7103a(mo10323a1()), this.f10343P, f10316A);
    }

    /* renamed from: W1 */
    private void m12844W1(ColorStateList colorStateList) {
        if (this.f10319B != colorStateList) {
            this.f10319B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: g1 */
    private ColorFilter m12845g1() {
        ColorFilter colorFilter = this.f10379z0;
        return colorFilter != null ? colorFilter : this.f10318A0;
    }

    /* renamed from: h0 */
    private void m12846h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0398a.m1976m(drawable, C0398a.m1969f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f10343P) {
                if (drawable.isStateful()) {
                    drawable.setState(mo10309T0());
                }
                C0398a.m1978o(drawable, this.f10345R);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f10337K;
            if (drawable == drawable2 && this.f10341N) {
                C0398a.m1978o(drawable2, this.f10339L);
            }
        }
    }

    /* renamed from: i0 */
    private void m12847i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m12839I2() || m12838H2()) {
            float f = this.f10354a0 + this.f10355b0;
            if (C0398a.m1969f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f10340M;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f10340M;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f10340M;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: i1 */
    private static boolean m12848i1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    private void m12849k0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m12840J2()) {
            float f = this.f10361h0 + this.f10360g0 + this.f10346S + this.f10359f0 + this.f10358e0;
            if (C0398a.m1969f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: l0 */
    private void m12850l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m12840J2()) {
            float f = this.f10361h0 + this.f10360g0;
            if (C0398a.m1969f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f10346S;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f10346S;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f10346S;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: m0 */
    private void m12851m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m12840J2()) {
            float f = this.f10361h0 + this.f10360g0 + this.f10346S + this.f10359f0 + this.f10358e0;
            if (C0398a.m1969f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: m1 */
    private static boolean m12852m1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: n1 */
    private static boolean m12853n1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: o0 */
    private void m12854o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f10333I != null) {
            float j0 = this.f10354a0 + mo10344j0() + this.f10357d0;
            float n0 = this.f10361h0 + mo10352n0() + this.f10358e0;
            if (C0398a.m1969f(this) == 0) {
                rectF.left = ((float) rect.left) + j0;
                rectF.right = ((float) rect.right) - n0;
            } else {
                rectF.left = ((float) rect.left) + n0;
                rectF.right = ((float) rect.right) - j0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: o1 */
    private static boolean m12855o1(C1438d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f6073b) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: p0 */
    private float m12856p0() {
        this.f10369p0.mo10793e().getFontMetrics(this.f10365l0);
        Paint.FontMetrics fontMetrics = this.f10365l0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0161  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12857p1(android.util.AttributeSet r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C3100a.m12857p1(android.util.AttributeSet, int, int):void");
    }

    /* renamed from: r0 */
    private boolean m12858r0() {
        return this.f10349V && this.f10350W != null && this.f10348U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12859r1(int[] r7, int[] r8) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C3100a.m12859r1(int[], int[]):boolean");
    }

    /* renamed from: s0 */
    public static C3100a m12860s0(Context context, AttributeSet attributeSet, int i, int i2) {
        C3100a aVar = new C3100a(context, attributeSet, i, i2);
        aVar.m12857p1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: t0 */
    private void m12861t0(Canvas canvas, Rect rect) {
        if (m12838H2()) {
            m12847i0(rect, this.f10366m0);
            RectF rectF = this.f10366m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10350W.setBounds(0, 0, (int) this.f10366m0.width(), (int) this.f10366m0.height());
            this.f10350W.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: u0 */
    private void m12862u0(Canvas canvas, Rect rect) {
        if (!this.f10338K0) {
            this.f10363j0.setColor(this.f10371r0);
            this.f10363j0.setStyle(Paint.Style.FILL);
            this.f10363j0.setColorFilter(m12845g1());
            this.f10366m0.set(rect);
            canvas.drawRoundRect(this.f10366m0, mo10279F0(), mo10279F0(), this.f10363j0);
        }
    }

    /* renamed from: v0 */
    private void m12863v0(Canvas canvas, Rect rect) {
        if (m12839I2()) {
            m12847i0(rect, this.f10366m0);
            RectF rectF = this.f10366m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10337K.setBounds(0, 0, (int) this.f10366m0.width(), (int) this.f10366m0.height());
            this.f10337K.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: w0 */
    private void m12864w0(Canvas canvas, Rect rect) {
        if (this.f10329G > 0.0f && !this.f10338K0) {
            this.f10363j0.setColor(this.f10373t0);
            this.f10363j0.setStyle(Paint.Style.STROKE);
            if (!this.f10338K0) {
                this.f10363j0.setColorFilter(m12845g1());
            }
            RectF rectF = this.f10366m0;
            float f = this.f10329G;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f10325E - (this.f10329G / 2.0f);
            canvas.drawRoundRect(this.f10366m0, f2, f2, this.f10363j0);
        }
    }

    /* renamed from: x0 */
    private void m12865x0(Canvas canvas, Rect rect) {
        if (!this.f10338K0) {
            this.f10363j0.setColor(this.f10370q0);
            this.f10363j0.setStyle(Paint.Style.FILL);
            this.f10366m0.set(rect);
            canvas.drawRoundRect(this.f10366m0, mo10279F0(), mo10279F0(), this.f10363j0);
        }
    }

    /* renamed from: y0 */
    private void m12866y0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m12840J2()) {
            m12850l0(rect, this.f10366m0);
            RectF rectF = this.f10366m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10343P.setBounds(0, 0, (int) this.f10366m0.width(), (int) this.f10366m0.height());
            if (C1446b.f6096a) {
                this.f10344Q.setBounds(this.f10343P.getBounds());
                this.f10344Q.jumpToCurrentState();
                drawable = this.f10344Q;
            } else {
                drawable = this.f10343P;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: z0 */
    private void m12867z0(Canvas canvas, Rect rect) {
        this.f10363j0.setColor(this.f10374u0);
        this.f10363j0.setStyle(Paint.Style.FILL);
        this.f10366m0.set(rect);
        if (!this.f10338K0) {
            canvas.drawRoundRect(this.f10366m0, mo10279F0(), mo10279F0(), this.f10363j0);
            return;
        }
        mo6623h(new RectF(rect), this.f10368o0);
        super.mo6629p(canvas, this.f10363j0, this.f10368o0, mo6634u());
    }

    /* renamed from: A1 */
    public void mo10266A1(ColorStateList colorStateList) {
        if (this.f10321C != colorStateList) {
            this.f10321C = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: A2 */
    public void mo10267A2(int i) {
        mo10380z2(new C1438d(this.f10362i0, i));
    }

    /* renamed from: B1 */
    public void mo10268B1(int i) {
        mo10266A1(C0764a.m4516c(this.f10362i0, i));
    }

    /* renamed from: B2 */
    public void mo10269B2(float f) {
        if (this.f10358e0 != f) {
            this.f10358e0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: C0 */
    public Drawable mo10270C0() {
        return this.f10350W;
    }

    @Deprecated
    /* renamed from: C1 */
    public void mo10271C1(float f) {
        if (this.f10325E != f) {
            this.f10325E = f;
            setShapeAppearanceModel(mo6597C().mo6660w(f));
        }
    }

    /* renamed from: C2 */
    public void mo10272C2(int i) {
        mo10269B2(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: D0 */
    public ColorStateList mo10273D0() {
        return this.f10351X;
    }

    @Deprecated
    /* renamed from: D1 */
    public void mo10274D1(int i) {
        mo10271C1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: D2 */
    public void mo10275D2(float f) {
        if (this.f10357d0 != f) {
            this.f10357d0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: E0 */
    public ColorStateList mo10276E0() {
        return this.f10321C;
    }

    /* renamed from: E1 */
    public void mo10277E1(float f) {
        if (this.f10361h0 != f) {
            this.f10361h0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: E2 */
    public void mo10278E2(int i) {
        mo10275D2(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: F0 */
    public float mo10279F0() {
        return this.f10338K0 ? mo6599F() : this.f10325E;
    }

    /* renamed from: F1 */
    public void mo10280F1(int i) {
        mo10277E1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: F2 */
    public void mo10281F2(boolean z) {
        if (this.f10326E0 != z) {
            this.f10326E0 = z;
            m12842L2();
            onStateChange(getState());
        }
    }

    /* renamed from: G0 */
    public float mo10282G0() {
        return this.f10361h0;
    }

    /* renamed from: G1 */
    public void mo10283G1(Drawable drawable) {
        Drawable H0 = mo10285H0();
        if (H0 != drawable) {
            float j0 = mo10344j0();
            this.f10337K = drawable != null ? C0398a.m1981r(drawable).mutate() : null;
            float j02 = mo10344j0();
            m12841K2(H0);
            if (m12839I2()) {
                m12846h0(this.f10337K);
            }
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public boolean mo10284G2() {
        return this.f10334I0;
    }

    /* renamed from: H0 */
    public Drawable mo10285H0() {
        Drawable drawable = this.f10337K;
        if (drawable != null) {
            return C0398a.m1980q(drawable);
        }
        return null;
    }

    /* renamed from: H1 */
    public void mo10286H1(int i) {
        mo10283G1(C0764a.m4517d(this.f10362i0, i));
    }

    /* renamed from: I0 */
    public float mo10287I0() {
        return this.f10340M;
    }

    /* renamed from: I1 */
    public void mo10288I1(float f) {
        if (this.f10340M != f) {
            float j0 = mo10344j0();
            this.f10340M = f;
            float j02 = mo10344j0();
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: J0 */
    public ColorStateList mo10289J0() {
        return this.f10339L;
    }

    /* renamed from: J1 */
    public void mo10290J1(int i) {
        mo10288I1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: K0 */
    public float mo10291K0() {
        return this.f10323D;
    }

    /* renamed from: K1 */
    public void mo10292K1(ColorStateList colorStateList) {
        this.f10341N = true;
        if (this.f10339L != colorStateList) {
            this.f10339L = colorStateList;
            if (m12839I2()) {
                C0398a.m1978o(this.f10337K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: L0 */
    public float mo10293L0() {
        return this.f10354a0;
    }

    /* renamed from: L1 */
    public void mo10294L1(int i) {
        mo10292K1(C0764a.m4516c(this.f10362i0, i));
    }

    /* renamed from: M0 */
    public ColorStateList mo10295M0() {
        return this.f10327F;
    }

    /* renamed from: M1 */
    public void mo10296M1(int i) {
        mo10298N1(this.f10362i0.getResources().getBoolean(i));
    }

    /* renamed from: N0 */
    public float mo10297N0() {
        return this.f10329G;
    }

    /* renamed from: N1 */
    public void mo10298N1(boolean z) {
        if (this.f10335J != z) {
            boolean I2 = m12839I2();
            this.f10335J = z;
            boolean I22 = m12839I2();
            if (I2 != I22) {
                if (I22) {
                    m12846h0(this.f10337K);
                } else {
                    m12841K2(this.f10337K);
                }
                invalidateSelf();
                mo10359q1();
            }
        }
    }

    /* renamed from: O0 */
    public Drawable mo10299O0() {
        Drawable drawable = this.f10343P;
        if (drawable != null) {
            return C0398a.m1980q(drawable);
        }
        return null;
    }

    /* renamed from: O1 */
    public void mo10300O1(float f) {
        if (this.f10323D != f) {
            this.f10323D = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: P0 */
    public CharSequence mo10301P0() {
        return this.f10347T;
    }

    /* renamed from: P1 */
    public void mo10302P1(int i) {
        mo10300O1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: Q0 */
    public float mo10303Q0() {
        return this.f10360g0;
    }

    /* renamed from: Q1 */
    public void mo10304Q1(float f) {
        if (this.f10354a0 != f) {
            this.f10354a0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: R0 */
    public float mo10305R0() {
        return this.f10346S;
    }

    /* renamed from: R1 */
    public void mo10306R1(int i) {
        mo10304Q1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: S0 */
    public float mo10307S0() {
        return this.f10359f0;
    }

    /* renamed from: S1 */
    public void mo10308S1(ColorStateList colorStateList) {
        if (this.f10327F != colorStateList) {
            this.f10327F = colorStateList;
            if (this.f10338K0) {
                mo6615c0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: T0 */
    public int[] mo10309T0() {
        return this.f10324D0;
    }

    /* renamed from: T1 */
    public void mo10310T1(int i) {
        mo10308S1(C0764a.m4516c(this.f10362i0, i));
    }

    /* renamed from: U0 */
    public ColorStateList mo10311U0() {
        return this.f10345R;
    }

    /* renamed from: U1 */
    public void mo10312U1(float f) {
        if (this.f10329G != f) {
            this.f10329G = f;
            this.f10363j0.setStrokeWidth(f);
            if (this.f10338K0) {
                super.mo6616d0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: V0 */
    public void mo10313V0(RectF rectF) {
        m12851m0(getBounds(), rectF);
    }

    /* renamed from: V1 */
    public void mo10314V1(int i) {
        mo10312U1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public TextUtils.TruncateAt mo10315W0() {
        return this.f10332H0;
    }

    /* renamed from: X0 */
    public C1408h mo10316X0() {
        return this.f10353Z;
    }

    /* renamed from: X1 */
    public void mo10317X1(Drawable drawable) {
        Drawable O0 = mo10299O0();
        if (O0 != drawable) {
            float n0 = mo10352n0();
            this.f10343P = drawable != null ? C0398a.m1981r(drawable).mutate() : null;
            if (C1446b.f6096a) {
                m12843M2();
            }
            float n02 = mo10352n0();
            m12841K2(O0);
            if (m12840J2()) {
                m12846h0(this.f10343P);
            }
            invalidateSelf();
            if (n0 != n02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: Y0 */
    public float mo10318Y0() {
        return this.f10356c0;
    }

    /* renamed from: Y1 */
    public void mo10319Y1(CharSequence charSequence) {
        if (this.f10347T != charSequence) {
            this.f10347T = C0937a.m5432c().mo5355h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: Z0 */
    public float mo10320Z0() {
        return this.f10355b0;
    }

    /* renamed from: Z1 */
    public void mo10321Z1(float f) {
        if (this.f10360g0 != f) {
            this.f10360g0 = f;
            invalidateSelf();
            if (m12840J2()) {
                mo10359q1();
            }
        }
    }

    @Override // com.google.android.material.internal.C3199n.AbstractC3201b
    /* renamed from: a */
    public void mo10322a() {
        mo10359q1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public ColorStateList mo10323a1() {
        return this.f10331H;
    }

    /* renamed from: a2 */
    public void mo10324a2(int i) {
        mo10321Z1(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public C1408h mo10325b1() {
        return this.f10352Y;
    }

    /* renamed from: b2 */
    public void mo10326b2(int i) {
        mo10317X1(C0764a.m4517d(this.f10362i0, i));
    }

    /* renamed from: c1 */
    public CharSequence mo10327c1() {
        return this.f10333I;
    }

    /* renamed from: c2 */
    public void mo10328c2(float f) {
        if (this.f10346S != f) {
            this.f10346S = f;
            invalidateSelf();
            if (m12840J2()) {
                mo10359q1();
            }
        }
    }

    /* renamed from: d1 */
    public C1438d mo10329d1() {
        return this.f10369p0.mo10792d();
    }

    /* renamed from: d2 */
    public void mo10330d2(int i) {
        mo10328c2(this.f10362i0.getResources().getDimension(i));
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f10378y0;
            if (i2 < 255) {
                i = C1412a.m7030a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m12865x0(canvas, bounds);
            m12862u0(canvas, bounds);
            if (this.f10338K0) {
                super.draw(canvas);
            }
            m12864w0(canvas, bounds);
            m12867z0(canvas, bounds);
            m12863v0(canvas, bounds);
            m12861t0(canvas, bounds);
            if (this.f10334I0) {
                m12837B0(canvas, bounds);
            }
            m12866y0(canvas, bounds);
            m12836A0(canvas, bounds);
            if (this.f10378y0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public float mo10331e1() {
        return this.f10358e0;
    }

    /* renamed from: e2 */
    public void mo10332e2(float f) {
        if (this.f10359f0 != f) {
            this.f10359f0 = f;
            invalidateSelf();
            if (m12840J2()) {
                mo10359q1();
            }
        }
    }

    /* renamed from: f1 */
    public float mo10333f1() {
        return this.f10357d0;
    }

    /* renamed from: f2 */
    public void mo10334f2(int i) {
        mo10332e2(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: g2 */
    public boolean mo10335g2(int[] iArr) {
        if (Arrays.equals(this.f10324D0, iArr)) {
            return false;
        }
        this.f10324D0 = iArr;
        if (m12840J2()) {
            return m12859r1(getState(), iArr);
        }
        return false;
    }

    public int getAlpha() {
        return this.f10378y0;
    }

    public ColorFilter getColorFilter() {
        return this.f10379z0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f10323D;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f10354a0 + mo10344j0() + this.f10357d0 + this.f10369p0.mo10794f(mo10327c1().toString()) + this.f10358e0 + mo10352n0() + this.f10361h0), this.f10336J0);
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public int getOpacity() {
        return -3;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f10338K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f10325E);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f10325E);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public boolean mo10340h1() {
        return this.f10326E0;
    }

    /* renamed from: h2 */
    public void mo10341h2(ColorStateList colorStateList) {
        if (this.f10345R != colorStateList) {
            this.f10345R = colorStateList;
            if (m12840J2()) {
                C0398a.m1978o(this.f10343P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: i2 */
    public void mo10342i2(int i) {
        mo10341h2(C0764a.m4516c(this.f10362i0, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public boolean isStateful() {
        return m12852m1(this.f10319B) || m12852m1(this.f10321C) || m12852m1(this.f10327F) || (this.f10326E0 && m12852m1(this.f10328F0)) || m12855o1(this.f10369p0.mo10792d()) || m12858r0() || m12853n1(this.f10337K) || m12853n1(this.f10350W) || m12852m1(this.f10320B0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public float mo10344j0() {
        if (m12839I2() || m12838H2()) {
            return this.f10355b0 + this.f10340M + this.f10356c0;
        }
        return 0.0f;
    }

    /* renamed from: j1 */
    public boolean mo10345j1() {
        return this.f10348U;
    }

    /* renamed from: j2 */
    public void mo10346j2(boolean z) {
        if (this.f10342O != z) {
            boolean J2 = m12840J2();
            this.f10342O = z;
            boolean J22 = m12840J2();
            if (J2 != J22) {
                if (J22) {
                    m12846h0(this.f10343P);
                } else {
                    m12841K2(this.f10343P);
                }
                invalidateSelf();
                mo10359q1();
            }
        }
    }

    /* renamed from: k1 */
    public boolean mo10347k1() {
        return m12853n1(this.f10343P);
    }

    /* renamed from: k2 */
    public void mo10348k2(AbstractC3101a aVar) {
        this.f10330G0 = new WeakReference<>(aVar);
    }

    /* renamed from: l1 */
    public boolean mo10349l1() {
        return this.f10342O;
    }

    /* renamed from: l2 */
    public void mo10350l2(TextUtils.TruncateAt truncateAt) {
        this.f10332H0 = truncateAt;
    }

    /* renamed from: m2 */
    public void mo10351m2(C1408h hVar) {
        this.f10353Z = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public float mo10352n0() {
        if (m12840J2()) {
            return this.f10359f0 + this.f10346S + this.f10360g0;
        }
        return 0.0f;
    }

    /* renamed from: n2 */
    public void mo10353n2(int i) {
        mo10351m2(C1408h.m7013c(this.f10362i0, i));
    }

    /* renamed from: o2 */
    public void mo10354o2(float f) {
        if (this.f10356c0 != f) {
            float j0 = mo10344j0();
            this.f10356c0 = f;
            float j02 = mo10344j0();
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m12839I2()) {
            onLayoutDirectionChanged |= C0398a.m1976m(this.f10337K, i);
        }
        if (m12838H2()) {
            onLayoutDirectionChanged |= C0398a.m1976m(this.f10350W, i);
        }
        if (m12840J2()) {
            onLayoutDirectionChanged |= C0398a.m1976m(this.f10343P, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m12839I2()) {
            onLevelChange |= this.f10337K.setLevel(i);
        }
        if (m12838H2()) {
            onLevelChange |= this.f10350W.setLevel(i);
        }
        if (m12840J2()) {
            onLevelChange |= this.f10343P.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g, com.google.android.material.internal.C3199n.AbstractC3201b
    public boolean onStateChange(int[] iArr) {
        if (this.f10338K0) {
            super.onStateChange(iArr);
        }
        return m12859r1(iArr, mo10309T0());
    }

    /* renamed from: p2 */
    public void mo10357p2(int i) {
        mo10354o2(this.f10362i0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public Paint.Align mo10358q0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f10333I != null) {
            float j0 = this.f10354a0 + mo10344j0() + this.f10357d0;
            if (C0398a.m1969f(this) == 0) {
                pointF.x = ((float) rect.left) + j0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - j0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m12856p0();
        }
        return align;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public void mo10359q1() {
        AbstractC3101a aVar = this.f10330G0.get();
        if (aVar != null) {
            aVar.mo10087a();
        }
    }

    /* renamed from: q2 */
    public void mo10360q2(float f) {
        if (this.f10355b0 != f) {
            float j0 = mo10344j0();
            this.f10355b0 = f;
            float j02 = mo10344j0();
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: r2 */
    public void mo10361r2(int i) {
        mo10360q2(this.f10362i0.getResources().getDimension(i));
    }

    /* renamed from: s1 */
    public void mo10362s1(boolean z) {
        if (this.f10348U != z) {
            this.f10348U = z;
            float j0 = mo10344j0();
            if (!z && this.f10376w0) {
                this.f10376w0 = false;
            }
            float j02 = mo10344j0();
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: s2 */
    public void mo10363s2(int i) {
        this.f10336J0 = i;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void setAlpha(int i) {
        if (this.f10378y0 != i) {
            this.f10378y0 = i;
            invalidateSelf();
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f10379z0 != colorFilter) {
            this.f10379z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g, androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f10320B0 != colorStateList) {
            this.f10320B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g, androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f10322C0 != mode) {
            this.f10322C0 = mode;
            this.f10318A0 = C1429a.m7057a(this, this.f10320B0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m12839I2()) {
            visible |= this.f10337K.setVisible(z, z2);
        }
        if (m12838H2()) {
            visible |= this.f10350W.setVisible(z, z2);
        }
        if (m12840J2()) {
            visible |= this.f10343P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void mo10366t1(int i) {
        mo10362s1(this.f10362i0.getResources().getBoolean(i));
    }

    /* renamed from: t2 */
    public void mo10367t2(ColorStateList colorStateList) {
        if (this.f10331H != colorStateList) {
            this.f10331H = colorStateList;
            m12842L2();
            onStateChange(getState());
        }
    }

    /* renamed from: u1 */
    public void mo10368u1(Drawable drawable) {
        if (this.f10350W != drawable) {
            float j0 = mo10344j0();
            this.f10350W = drawable;
            float j02 = mo10344j0();
            m12841K2(this.f10350W);
            m12846h0(this.f10350W);
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: u2 */
    public void mo10369u2(int i) {
        mo10367t2(C0764a.m4516c(this.f10362i0, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void mo10371v1(int i) {
        mo10368u1(C0764a.m4517d(this.f10362i0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v2 */
    public void mo10372v2(boolean z) {
        this.f10334I0 = z;
    }

    /* renamed from: w1 */
    public void mo10373w1(ColorStateList colorStateList) {
        if (this.f10351X != colorStateList) {
            this.f10351X = colorStateList;
            if (m12858r0()) {
                C0398a.m1978o(this.f10350W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: w2 */
    public void mo10374w2(C1408h hVar) {
        this.f10352Y = hVar;
    }

    /* renamed from: x1 */
    public void mo10375x1(int i) {
        mo10373w1(C0764a.m4516c(this.f10362i0, i));
    }

    /* renamed from: x2 */
    public void mo10376x2(int i) {
        mo10374w2(C1408h.m7013c(this.f10362i0, i));
    }

    /* renamed from: y1 */
    public void mo10377y1(int i) {
        mo10379z1(this.f10362i0.getResources().getBoolean(i));
    }

    /* renamed from: y2 */
    public void mo10378y2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f10333I, charSequence)) {
            this.f10333I = charSequence;
            this.f10369p0.mo10797i(true);
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: z1 */
    public void mo10379z1(boolean z) {
        if (this.f10349V != z) {
            boolean H2 = m12838H2();
            this.f10349V = z;
            boolean H22 = m12838H2();
            if (H2 != H22) {
                if (H22) {
                    m12846h0(this.f10350W);
                } else {
                    m12841K2(this.f10350W);
                }
                invalidateSelf();
                mo10359q1();
            }
        }
    }

    /* renamed from: z2 */
    public void mo10380z2(C1438d dVar) {
        this.f10369p0.mo10796h(dVar, this.f10362i0);
    }
}
