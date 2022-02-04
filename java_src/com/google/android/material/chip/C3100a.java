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
    private static final ShapeDrawable f10308A = new ShapeDrawable(new OvalShape());

    /* renamed from: z */
    private static final int[] f10309z = {16842910};

    /* renamed from: A0 */
    private PorterDuffColorFilter f10310A0;

    /* renamed from: B */
    private ColorStateList f10311B;

    /* renamed from: B0 */
    private ColorStateList f10312B0;

    /* renamed from: C */
    private ColorStateList f10313C;

    /* renamed from: C0 */
    private PorterDuff.Mode f10314C0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: D */
    private float f10315D;

    /* renamed from: D0 */
    private int[] f10316D0;

    /* renamed from: E */
    private float f10317E = -1.0f;

    /* renamed from: E0 */
    private boolean f10318E0;

    /* renamed from: F */
    private ColorStateList f10319F;

    /* renamed from: F0 */
    private ColorStateList f10320F0;

    /* renamed from: G */
    private float f10321G;

    /* renamed from: G0 */
    private WeakReference<AbstractC3101a> f10322G0 = new WeakReference<>(null);

    /* renamed from: H */
    private ColorStateList f10323H;

    /* renamed from: H0 */
    private TextUtils.TruncateAt f10324H0;

    /* renamed from: I */
    private CharSequence f10325I;

    /* renamed from: I0 */
    private boolean f10326I0;

    /* renamed from: J */
    private boolean f10327J;

    /* renamed from: J0 */
    private int f10328J0;

    /* renamed from: K */
    private Drawable f10329K;

    /* renamed from: K0 */
    private boolean f10330K0;

    /* renamed from: L */
    private ColorStateList f10331L;

    /* renamed from: M */
    private float f10332M;

    /* renamed from: N */
    private boolean f10333N;

    /* renamed from: O */
    private boolean f10334O;

    /* renamed from: P */
    private Drawable f10335P;

    /* renamed from: Q */
    private Drawable f10336Q;

    /* renamed from: R */
    private ColorStateList f10337R;

    /* renamed from: S */
    private float f10338S;

    /* renamed from: T */
    private CharSequence f10339T;

    /* renamed from: U */
    private boolean f10340U;

    /* renamed from: V */
    private boolean f10341V;

    /* renamed from: W */
    private Drawable f10342W;

    /* renamed from: X */
    private ColorStateList f10343X;

    /* renamed from: Y */
    private C1408h f10344Y;

    /* renamed from: Z */
    private C1408h f10345Z;

    /* renamed from: a0 */
    private float f10346a0;

    /* renamed from: b0 */
    private float f10347b0;

    /* renamed from: c0 */
    private float f10348c0;

    /* renamed from: d0 */
    private float f10349d0;

    /* renamed from: e0 */
    private float f10350e0;

    /* renamed from: f0 */
    private float f10351f0;

    /* renamed from: g0 */
    private float f10352g0;

    /* renamed from: h0 */
    private float f10353h0;

    /* renamed from: i0 */
    private final Context f10354i0;

    /* renamed from: j0 */
    private final Paint f10355j0 = new Paint(1);

    /* renamed from: k0 */
    private final Paint f10356k0;

    /* renamed from: l0 */
    private final Paint.FontMetrics f10357l0 = new Paint.FontMetrics();

    /* renamed from: m0 */
    private final RectF f10358m0 = new RectF();

    /* renamed from: n0 */
    private final PointF f10359n0 = new PointF();

    /* renamed from: o0 */
    private final Path f10360o0 = new Path();

    /* renamed from: p0 */
    private final C3199n f10361p0;

    /* renamed from: q0 */
    private int f10362q0;

    /* renamed from: r0 */
    private int f10363r0;

    /* renamed from: s0 */
    private int f10364s0;

    /* renamed from: t0 */
    private int f10365t0;

    /* renamed from: u0 */
    private int f10366u0;

    /* renamed from: v0 */
    private int f10367v0;

    /* renamed from: w0 */
    private boolean f10368w0;

    /* renamed from: x0 */
    private int f10369x0;

    /* renamed from: y0 */
    private int f10370y0 = 255;

    /* renamed from: z0 */
    private ColorFilter f10371z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface AbstractC3101a {
        /* renamed from: a */
        void mo10087a();
    }

    private C3100a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo6603M(context);
        this.f10354i0 = context;
        C3199n nVar = new C3199n(this);
        this.f10361p0 = nVar;
        this.f10325I = "";
        nVar.mo10793e().density = context.getResources().getDisplayMetrics().density;
        this.f10356k0 = null;
        int[] iArr = f10309z;
        setState(iArr);
        mo10335g2(iArr);
        this.f10326I0 = true;
        if (C1446b.f6088a) {
            f10308A.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m12836A0(Canvas canvas, Rect rect) {
        Paint paint = this.f10356k0;
        if (paint != null) {
            paint.setColor(C0901a.m5300h(-16777216, 127));
            canvas.drawRect(rect, this.f10356k0);
            if (m12839I2() || m12838H2()) {
                m12847i0(rect, this.f10358m0);
                canvas.drawRect(this.f10358m0, this.f10356k0);
            }
            if (this.f10325I != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f10356k0);
            }
            if (m12840J2()) {
                m12850l0(rect, this.f10358m0);
                canvas.drawRect(this.f10358m0, this.f10356k0);
            }
            this.f10356k0.setColor(C0901a.m5300h(-65536, 127));
            m12849k0(rect, this.f10358m0);
            canvas.drawRect(this.f10358m0, this.f10356k0);
            this.f10356k0.setColor(C0901a.m5300h(-16711936, 127));
            m12851m0(rect, this.f10358m0);
            canvas.drawRect(this.f10358m0, this.f10356k0);
        }
    }

    /* renamed from: B0 */
    private void m12837B0(Canvas canvas, Rect rect) {
        if (this.f10325I != null) {
            Paint.Align q0 = mo10358q0(rect, this.f10359n0);
            m12854o0(rect, this.f10358m0);
            if (this.f10361p0.mo10792d() != null) {
                this.f10361p0.mo10793e().drawableState = getState();
                this.f10361p0.mo10798j(this.f10354i0);
            }
            this.f10361p0.mo10793e().setTextAlign(q0);
            int i = 0;
            boolean z = Math.round(this.f10361p0.mo10794f(mo10327c1().toString())) > Math.round(this.f10358m0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f10358m0);
            }
            CharSequence charSequence = this.f10325I;
            if (z && this.f10324H0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f10361p0.mo10793e(), this.f10358m0.width(), this.f10324H0);
            }
            int length = charSequence.length();
            PointF pointF = this.f10359n0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f10361p0.mo10793e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: H2 */
    private boolean m12838H2() {
        return this.f10341V && this.f10342W != null && this.f10368w0;
    }

    /* renamed from: I2 */
    private boolean m12839I2() {
        return this.f10327J && this.f10329K != null;
    }

    /* renamed from: J2 */
    private boolean m12840J2() {
        return this.f10334O && this.f10335P != null;
    }

    /* renamed from: K2 */
    private void m12841K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: L2 */
    private void m12842L2() {
        this.f10320F0 = this.f10318E0 ? C1446b.m7103a(this.f10323H) : null;
    }

    @TargetApi(21)
    /* renamed from: M2 */
    private void m12843M2() {
        this.f10336Q = new RippleDrawable(C1446b.m7103a(mo10323a1()), this.f10335P, f10308A);
    }

    /* renamed from: W1 */
    private void m12844W1(ColorStateList colorStateList) {
        if (this.f10311B != colorStateList) {
            this.f10311B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: g1 */
    private ColorFilter m12845g1() {
        ColorFilter colorFilter = this.f10371z0;
        return colorFilter != null ? colorFilter : this.f10310A0;
    }

    /* renamed from: h0 */
    private void m12846h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0398a.m1976m(drawable, C0398a.m1969f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f10335P) {
                if (drawable.isStateful()) {
                    drawable.setState(mo10309T0());
                }
                C0398a.m1978o(drawable, this.f10337R);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f10329K;
            if (drawable == drawable2 && this.f10333N) {
                C0398a.m1978o(drawable2, this.f10331L);
            }
        }
    }

    /* renamed from: i0 */
    private void m12847i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m12839I2() || m12838H2()) {
            float f = this.f10346a0 + this.f10347b0;
            if (C0398a.m1969f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f10332M;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f10332M;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f10332M;
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
            float f = this.f10353h0 + this.f10352g0 + this.f10338S + this.f10351f0 + this.f10350e0;
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
            float f = this.f10353h0 + this.f10352g0;
            if (C0398a.m1969f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f10338S;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f10338S;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f10338S;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: m0 */
    private void m12851m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m12840J2()) {
            float f = this.f10353h0 + this.f10352g0 + this.f10338S + this.f10351f0 + this.f10350e0;
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
        if (this.f10325I != null) {
            float j0 = this.f10346a0 + mo10344j0() + this.f10349d0;
            float n0 = this.f10353h0 + mo10352n0() + this.f10350e0;
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
        return (dVar == null || (colorStateList = dVar.f6065b) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: p0 */
    private float m12856p0() {
        this.f10361p0.mo10793e().getFontMetrics(this.f10357l0);
        Paint.FontMetrics fontMetrics = this.f10357l0;
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
        return this.f10341V && this.f10342W != null && this.f10340U;
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
            m12847i0(rect, this.f10358m0);
            RectF rectF = this.f10358m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10342W.setBounds(0, 0, (int) this.f10358m0.width(), (int) this.f10358m0.height());
            this.f10342W.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: u0 */
    private void m12862u0(Canvas canvas, Rect rect) {
        if (!this.f10330K0) {
            this.f10355j0.setColor(this.f10363r0);
            this.f10355j0.setStyle(Paint.Style.FILL);
            this.f10355j0.setColorFilter(m12845g1());
            this.f10358m0.set(rect);
            canvas.drawRoundRect(this.f10358m0, mo10279F0(), mo10279F0(), this.f10355j0);
        }
    }

    /* renamed from: v0 */
    private void m12863v0(Canvas canvas, Rect rect) {
        if (m12839I2()) {
            m12847i0(rect, this.f10358m0);
            RectF rectF = this.f10358m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10329K.setBounds(0, 0, (int) this.f10358m0.width(), (int) this.f10358m0.height());
            this.f10329K.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: w0 */
    private void m12864w0(Canvas canvas, Rect rect) {
        if (this.f10321G > 0.0f && !this.f10330K0) {
            this.f10355j0.setColor(this.f10365t0);
            this.f10355j0.setStyle(Paint.Style.STROKE);
            if (!this.f10330K0) {
                this.f10355j0.setColorFilter(m12845g1());
            }
            RectF rectF = this.f10358m0;
            float f = this.f10321G;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f10317E - (this.f10321G / 2.0f);
            canvas.drawRoundRect(this.f10358m0, f2, f2, this.f10355j0);
        }
    }

    /* renamed from: x0 */
    private void m12865x0(Canvas canvas, Rect rect) {
        if (!this.f10330K0) {
            this.f10355j0.setColor(this.f10362q0);
            this.f10355j0.setStyle(Paint.Style.FILL);
            this.f10358m0.set(rect);
            canvas.drawRoundRect(this.f10358m0, mo10279F0(), mo10279F0(), this.f10355j0);
        }
    }

    /* renamed from: y0 */
    private void m12866y0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m12840J2()) {
            m12850l0(rect, this.f10358m0);
            RectF rectF = this.f10358m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f10335P.setBounds(0, 0, (int) this.f10358m0.width(), (int) this.f10358m0.height());
            if (C1446b.f6088a) {
                this.f10336Q.setBounds(this.f10335P.getBounds());
                this.f10336Q.jumpToCurrentState();
                drawable = this.f10336Q;
            } else {
                drawable = this.f10335P;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: z0 */
    private void m12867z0(Canvas canvas, Rect rect) {
        this.f10355j0.setColor(this.f10366u0);
        this.f10355j0.setStyle(Paint.Style.FILL);
        this.f10358m0.set(rect);
        if (!this.f10330K0) {
            canvas.drawRoundRect(this.f10358m0, mo10279F0(), mo10279F0(), this.f10355j0);
            return;
        }
        mo6623h(new RectF(rect), this.f10360o0);
        super.mo6629p(canvas, this.f10355j0, this.f10360o0, mo6634u());
    }

    /* renamed from: A1 */
    public void mo10266A1(ColorStateList colorStateList) {
        if (this.f10313C != colorStateList) {
            this.f10313C = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: A2 */
    public void mo10267A2(int i) {
        mo10380z2(new C1438d(this.f10354i0, i));
    }

    /* renamed from: B1 */
    public void mo10268B1(int i) {
        mo10266A1(C0764a.m4516c(this.f10354i0, i));
    }

    /* renamed from: B2 */
    public void mo10269B2(float f) {
        if (this.f10350e0 != f) {
            this.f10350e0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: C0 */
    public Drawable mo10270C0() {
        return this.f10342W;
    }

    @Deprecated
    /* renamed from: C1 */
    public void mo10271C1(float f) {
        if (this.f10317E != f) {
            this.f10317E = f;
            setShapeAppearanceModel(mo6597C().mo6660w(f));
        }
    }

    /* renamed from: C2 */
    public void mo10272C2(int i) {
        mo10269B2(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: D0 */
    public ColorStateList mo10273D0() {
        return this.f10343X;
    }

    @Deprecated
    /* renamed from: D1 */
    public void mo10274D1(int i) {
        mo10271C1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: D2 */
    public void mo10275D2(float f) {
        if (this.f10349d0 != f) {
            this.f10349d0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: E0 */
    public ColorStateList mo10276E0() {
        return this.f10313C;
    }

    /* renamed from: E1 */
    public void mo10277E1(float f) {
        if (this.f10353h0 != f) {
            this.f10353h0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: E2 */
    public void mo10278E2(int i) {
        mo10275D2(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: F0 */
    public float mo10279F0() {
        return this.f10330K0 ? mo6599F() : this.f10317E;
    }

    /* renamed from: F1 */
    public void mo10280F1(int i) {
        mo10277E1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: F2 */
    public void mo10281F2(boolean z) {
        if (this.f10318E0 != z) {
            this.f10318E0 = z;
            m12842L2();
            onStateChange(getState());
        }
    }

    /* renamed from: G0 */
    public float mo10282G0() {
        return this.f10353h0;
    }

    /* renamed from: G1 */
    public void mo10283G1(Drawable drawable) {
        Drawable H0 = mo10285H0();
        if (H0 != drawable) {
            float j0 = mo10344j0();
            this.f10329K = drawable != null ? C0398a.m1981r(drawable).mutate() : null;
            float j02 = mo10344j0();
            m12841K2(H0);
            if (m12839I2()) {
                m12846h0(this.f10329K);
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
        return this.f10326I0;
    }

    /* renamed from: H0 */
    public Drawable mo10285H0() {
        Drawable drawable = this.f10329K;
        if (drawable != null) {
            return C0398a.m1980q(drawable);
        }
        return null;
    }

    /* renamed from: H1 */
    public void mo10286H1(int i) {
        mo10283G1(C0764a.m4517d(this.f10354i0, i));
    }

    /* renamed from: I0 */
    public float mo10287I0() {
        return this.f10332M;
    }

    /* renamed from: I1 */
    public void mo10288I1(float f) {
        if (this.f10332M != f) {
            float j0 = mo10344j0();
            this.f10332M = f;
            float j02 = mo10344j0();
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: J0 */
    public ColorStateList mo10289J0() {
        return this.f10331L;
    }

    /* renamed from: J1 */
    public void mo10290J1(int i) {
        mo10288I1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: K0 */
    public float mo10291K0() {
        return this.f10315D;
    }

    /* renamed from: K1 */
    public void mo10292K1(ColorStateList colorStateList) {
        this.f10333N = true;
        if (this.f10331L != colorStateList) {
            this.f10331L = colorStateList;
            if (m12839I2()) {
                C0398a.m1978o(this.f10329K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: L0 */
    public float mo10293L0() {
        return this.f10346a0;
    }

    /* renamed from: L1 */
    public void mo10294L1(int i) {
        mo10292K1(C0764a.m4516c(this.f10354i0, i));
    }

    /* renamed from: M0 */
    public ColorStateList mo10295M0() {
        return this.f10319F;
    }

    /* renamed from: M1 */
    public void mo10296M1(int i) {
        mo10298N1(this.f10354i0.getResources().getBoolean(i));
    }

    /* renamed from: N0 */
    public float mo10297N0() {
        return this.f10321G;
    }

    /* renamed from: N1 */
    public void mo10298N1(boolean z) {
        if (this.f10327J != z) {
            boolean I2 = m12839I2();
            this.f10327J = z;
            boolean I22 = m12839I2();
            if (I2 != I22) {
                if (I22) {
                    m12846h0(this.f10329K);
                } else {
                    m12841K2(this.f10329K);
                }
                invalidateSelf();
                mo10359q1();
            }
        }
    }

    /* renamed from: O0 */
    public Drawable mo10299O0() {
        Drawable drawable = this.f10335P;
        if (drawable != null) {
            return C0398a.m1980q(drawable);
        }
        return null;
    }

    /* renamed from: O1 */
    public void mo10300O1(float f) {
        if (this.f10315D != f) {
            this.f10315D = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: P0 */
    public CharSequence mo10301P0() {
        return this.f10339T;
    }

    /* renamed from: P1 */
    public void mo10302P1(int i) {
        mo10300O1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: Q0 */
    public float mo10303Q0() {
        return this.f10352g0;
    }

    /* renamed from: Q1 */
    public void mo10304Q1(float f) {
        if (this.f10346a0 != f) {
            this.f10346a0 = f;
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: R0 */
    public float mo10305R0() {
        return this.f10338S;
    }

    /* renamed from: R1 */
    public void mo10306R1(int i) {
        mo10304Q1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: S0 */
    public float mo10307S0() {
        return this.f10351f0;
    }

    /* renamed from: S1 */
    public void mo10308S1(ColorStateList colorStateList) {
        if (this.f10319F != colorStateList) {
            this.f10319F = colorStateList;
            if (this.f10330K0) {
                mo6615c0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: T0 */
    public int[] mo10309T0() {
        return this.f10316D0;
    }

    /* renamed from: T1 */
    public void mo10310T1(int i) {
        mo10308S1(C0764a.m4516c(this.f10354i0, i));
    }

    /* renamed from: U0 */
    public ColorStateList mo10311U0() {
        return this.f10337R;
    }

    /* renamed from: U1 */
    public void mo10312U1(float f) {
        if (this.f10321G != f) {
            this.f10321G = f;
            this.f10355j0.setStrokeWidth(f);
            if (this.f10330K0) {
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
        mo10312U1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public TextUtils.TruncateAt mo10315W0() {
        return this.f10324H0;
    }

    /* renamed from: X0 */
    public C1408h mo10316X0() {
        return this.f10345Z;
    }

    /* renamed from: X1 */
    public void mo10317X1(Drawable drawable) {
        Drawable O0 = mo10299O0();
        if (O0 != drawable) {
            float n0 = mo10352n0();
            this.f10335P = drawable != null ? C0398a.m1981r(drawable).mutate() : null;
            if (C1446b.f6088a) {
                m12843M2();
            }
            float n02 = mo10352n0();
            m12841K2(O0);
            if (m12840J2()) {
                m12846h0(this.f10335P);
            }
            invalidateSelf();
            if (n0 != n02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: Y0 */
    public float mo10318Y0() {
        return this.f10348c0;
    }

    /* renamed from: Y1 */
    public void mo10319Y1(CharSequence charSequence) {
        if (this.f10339T != charSequence) {
            this.f10339T = C0937a.m5432c().mo5355h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: Z0 */
    public float mo10320Z0() {
        return this.f10347b0;
    }

    /* renamed from: Z1 */
    public void mo10321Z1(float f) {
        if (this.f10352g0 != f) {
            this.f10352g0 = f;
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
        return this.f10323H;
    }

    /* renamed from: a2 */
    public void mo10324a2(int i) {
        mo10321Z1(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public C1408h mo10325b1() {
        return this.f10344Y;
    }

    /* renamed from: b2 */
    public void mo10326b2(int i) {
        mo10317X1(C0764a.m4517d(this.f10354i0, i));
    }

    /* renamed from: c1 */
    public CharSequence mo10327c1() {
        return this.f10325I;
    }

    /* renamed from: c2 */
    public void mo10328c2(float f) {
        if (this.f10338S != f) {
            this.f10338S = f;
            invalidateSelf();
            if (m12840J2()) {
                mo10359q1();
            }
        }
    }

    /* renamed from: d1 */
    public C1438d mo10329d1() {
        return this.f10361p0.mo10792d();
    }

    /* renamed from: d2 */
    public void mo10330d2(int i) {
        mo10328c2(this.f10354i0.getResources().getDimension(i));
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f10370y0;
            if (i2 < 255) {
                i = C1412a.m7030a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m12865x0(canvas, bounds);
            m12862u0(canvas, bounds);
            if (this.f10330K0) {
                super.draw(canvas);
            }
            m12864w0(canvas, bounds);
            m12867z0(canvas, bounds);
            m12863v0(canvas, bounds);
            m12861t0(canvas, bounds);
            if (this.f10326I0) {
                m12837B0(canvas, bounds);
            }
            m12866y0(canvas, bounds);
            m12836A0(canvas, bounds);
            if (this.f10370y0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public float mo10331e1() {
        return this.f10350e0;
    }

    /* renamed from: e2 */
    public void mo10332e2(float f) {
        if (this.f10351f0 != f) {
            this.f10351f0 = f;
            invalidateSelf();
            if (m12840J2()) {
                mo10359q1();
            }
        }
    }

    /* renamed from: f1 */
    public float mo10333f1() {
        return this.f10349d0;
    }

    /* renamed from: f2 */
    public void mo10334f2(int i) {
        mo10332e2(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: g2 */
    public boolean mo10335g2(int[] iArr) {
        if (Arrays.equals(this.f10316D0, iArr)) {
            return false;
        }
        this.f10316D0 = iArr;
        if (m12840J2()) {
            return m12859r1(getState(), iArr);
        }
        return false;
    }

    public int getAlpha() {
        return this.f10370y0;
    }

    public ColorFilter getColorFilter() {
        return this.f10371z0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f10315D;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f10346a0 + mo10344j0() + this.f10349d0 + this.f10361p0.mo10794f(mo10327c1().toString()) + this.f10350e0 + mo10352n0() + this.f10353h0), this.f10328J0);
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public int getOpacity() {
        return -3;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f10330K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f10317E);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f10317E);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public boolean mo10340h1() {
        return this.f10318E0;
    }

    /* renamed from: h2 */
    public void mo10341h2(ColorStateList colorStateList) {
        if (this.f10337R != colorStateList) {
            this.f10337R = colorStateList;
            if (m12840J2()) {
                C0398a.m1978o(this.f10335P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: i2 */
    public void mo10342i2(int i) {
        mo10341h2(C0764a.m4516c(this.f10354i0, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public boolean isStateful() {
        return m12852m1(this.f10311B) || m12852m1(this.f10313C) || m12852m1(this.f10319F) || (this.f10318E0 && m12852m1(this.f10320F0)) || m12855o1(this.f10361p0.mo10792d()) || m12858r0() || m12853n1(this.f10329K) || m12853n1(this.f10342W) || m12852m1(this.f10312B0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public float mo10344j0() {
        if (m12839I2() || m12838H2()) {
            return this.f10347b0 + this.f10332M + this.f10348c0;
        }
        return 0.0f;
    }

    /* renamed from: j1 */
    public boolean mo10345j1() {
        return this.f10340U;
    }

    /* renamed from: j2 */
    public void mo10346j2(boolean z) {
        if (this.f10334O != z) {
            boolean J2 = m12840J2();
            this.f10334O = z;
            boolean J22 = m12840J2();
            if (J2 != J22) {
                if (J22) {
                    m12846h0(this.f10335P);
                } else {
                    m12841K2(this.f10335P);
                }
                invalidateSelf();
                mo10359q1();
            }
        }
    }

    /* renamed from: k1 */
    public boolean mo10347k1() {
        return m12853n1(this.f10335P);
    }

    /* renamed from: k2 */
    public void mo10348k2(AbstractC3101a aVar) {
        this.f10322G0 = new WeakReference<>(aVar);
    }

    /* renamed from: l1 */
    public boolean mo10349l1() {
        return this.f10334O;
    }

    /* renamed from: l2 */
    public void mo10350l2(TextUtils.TruncateAt truncateAt) {
        this.f10324H0 = truncateAt;
    }

    /* renamed from: m2 */
    public void mo10351m2(C1408h hVar) {
        this.f10345Z = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public float mo10352n0() {
        if (m12840J2()) {
            return this.f10351f0 + this.f10338S + this.f10352g0;
        }
        return 0.0f;
    }

    /* renamed from: n2 */
    public void mo10353n2(int i) {
        mo10351m2(C1408h.m7013c(this.f10354i0, i));
    }

    /* renamed from: o2 */
    public void mo10354o2(float f) {
        if (this.f10348c0 != f) {
            float j0 = mo10344j0();
            this.f10348c0 = f;
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
            onLayoutDirectionChanged |= C0398a.m1976m(this.f10329K, i);
        }
        if (m12838H2()) {
            onLayoutDirectionChanged |= C0398a.m1976m(this.f10342W, i);
        }
        if (m12840J2()) {
            onLayoutDirectionChanged |= C0398a.m1976m(this.f10335P, i);
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
            onLevelChange |= this.f10329K.setLevel(i);
        }
        if (m12838H2()) {
            onLevelChange |= this.f10342W.setLevel(i);
        }
        if (m12840J2()) {
            onLevelChange |= this.f10335P.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g, com.google.android.material.internal.C3199n.AbstractC3201b
    public boolean onStateChange(int[] iArr) {
        if (this.f10330K0) {
            super.onStateChange(iArr);
        }
        return m12859r1(iArr, mo10309T0());
    }

    /* renamed from: p2 */
    public void mo10357p2(int i) {
        mo10354o2(this.f10354i0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public Paint.Align mo10358q0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f10325I != null) {
            float j0 = this.f10346a0 + mo10344j0() + this.f10349d0;
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
        AbstractC3101a aVar = this.f10322G0.get();
        if (aVar != null) {
            aVar.mo10087a();
        }
    }

    /* renamed from: q2 */
    public void mo10360q2(float f) {
        if (this.f10347b0 != f) {
            float j0 = mo10344j0();
            this.f10347b0 = f;
            float j02 = mo10344j0();
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: r2 */
    public void mo10361r2(int i) {
        mo10360q2(this.f10354i0.getResources().getDimension(i));
    }

    /* renamed from: s1 */
    public void mo10362s1(boolean z) {
        if (this.f10340U != z) {
            this.f10340U = z;
            float j0 = mo10344j0();
            if (!z && this.f10368w0) {
                this.f10368w0 = false;
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
        this.f10328J0 = i;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void setAlpha(int i) {
        if (this.f10370y0 != i) {
            this.f10370y0 = i;
            invalidateSelf();
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f10371z0 != colorFilter) {
            this.f10371z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g, androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f10312B0 != colorStateList) {
            this.f10312B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g, androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f10314C0 != mode) {
            this.f10314C0 = mode;
            this.f10310A0 = C1429a.m7057a(this, this.f10312B0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m12839I2()) {
            visible |= this.f10329K.setVisible(z, z2);
        }
        if (m12838H2()) {
            visible |= this.f10342W.setVisible(z, z2);
        }
        if (m12840J2()) {
            visible |= this.f10335P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void mo10366t1(int i) {
        mo10362s1(this.f10354i0.getResources().getBoolean(i));
    }

    /* renamed from: t2 */
    public void mo10367t2(ColorStateList colorStateList) {
        if (this.f10323H != colorStateList) {
            this.f10323H = colorStateList;
            m12842L2();
            onStateChange(getState());
        }
    }

    /* renamed from: u1 */
    public void mo10368u1(Drawable drawable) {
        if (this.f10342W != drawable) {
            float j0 = mo10344j0();
            this.f10342W = drawable;
            float j02 = mo10344j0();
            m12841K2(this.f10342W);
            m12846h0(this.f10342W);
            invalidateSelf();
            if (j0 != j02) {
                mo10359q1();
            }
        }
    }

    /* renamed from: u2 */
    public void mo10369u2(int i) {
        mo10367t2(C0764a.m4516c(this.f10354i0, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void mo10371v1(int i) {
        mo10368u1(C0764a.m4517d(this.f10354i0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v2 */
    public void mo10372v2(boolean z) {
        this.f10326I0 = z;
    }

    /* renamed from: w1 */
    public void mo10373w1(ColorStateList colorStateList) {
        if (this.f10343X != colorStateList) {
            this.f10343X = colorStateList;
            if (m12858r0()) {
                C0398a.m1978o(this.f10342W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: w2 */
    public void mo10374w2(C1408h hVar) {
        this.f10344Y = hVar;
    }

    /* renamed from: x1 */
    public void mo10375x1(int i) {
        mo10373w1(C0764a.m4516c(this.f10354i0, i));
    }

    /* renamed from: x2 */
    public void mo10376x2(int i) {
        mo10374w2(C1408h.m7013c(this.f10354i0, i));
    }

    /* renamed from: y1 */
    public void mo10377y1(int i) {
        mo10379z1(this.f10354i0.getResources().getBoolean(i));
    }

    /* renamed from: y2 */
    public void mo10378y2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f10325I, charSequence)) {
            this.f10325I = charSequence;
            this.f10361p0.mo10797i(true);
            invalidateSelf();
            mo10359q1();
        }
    }

    /* renamed from: z1 */
    public void mo10379z1(boolean z) {
        if (this.f10341V != z) {
            boolean H2 = m12838H2();
            this.f10341V = z;
            boolean H22 = m12838H2();
            if (H2 != H22) {
                if (H22) {
                    m12846h0(this.f10342W);
                } else {
                    m12841K2(this.f10342W);
                }
                invalidateSelf();
                mo10359q1();
            }
        }
    }

    /* renamed from: z2 */
    public void mo10380z2(C1438d dVar) {
        this.f10361p0.mo10796h(dVar, this.f10354i0);
    }
}
