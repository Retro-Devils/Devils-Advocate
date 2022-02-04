package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.C3197m;
import p006b.p030g.p034f.C0920a;
import p006b.p030g.p037i.C0945e;
import p006b.p030g.p038j.C0961i;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p104w.C1434a;
import p069c.p073b.p074a.p090b.p104w.C1438d;

/* renamed from: com.google.android.material.internal.a */
public final class C3168a {

    /* renamed from: a */
    private static final boolean f10591a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: b */
    private static final Paint f10592b = null;

    /* renamed from: A */
    private CharSequence f10593A;

    /* renamed from: B */
    private boolean f10594B;

    /* renamed from: C */
    private boolean f10595C;

    /* renamed from: D */
    private Bitmap f10596D;

    /* renamed from: E */
    private Paint f10597E;

    /* renamed from: F */
    private float f10598F;

    /* renamed from: G */
    private float f10599G;

    /* renamed from: H */
    private int[] f10600H;

    /* renamed from: I */
    private boolean f10601I;

    /* renamed from: J */
    private final TextPaint f10602J;

    /* renamed from: K */
    private final TextPaint f10603K;

    /* renamed from: L */
    private TimeInterpolator f10604L;

    /* renamed from: M */
    private TimeInterpolator f10605M;

    /* renamed from: N */
    private float f10606N;

    /* renamed from: O */
    private float f10607O;

    /* renamed from: P */
    private float f10608P;

    /* renamed from: Q */
    private ColorStateList f10609Q;

    /* renamed from: R */
    private float f10610R;

    /* renamed from: S */
    private float f10611S;

    /* renamed from: T */
    private float f10612T;

    /* renamed from: U */
    private ColorStateList f10613U;

    /* renamed from: V */
    private StaticLayout f10614V;

    /* renamed from: W */
    private float f10615W;

    /* renamed from: X */
    private float f10616X;

    /* renamed from: Y */
    private float f10617Y;

    /* renamed from: Z */
    private CharSequence f10618Z;

    /* renamed from: a0 */
    private int f10619a0 = 1;

    /* renamed from: c */
    private final View f10620c;

    /* renamed from: d */
    private boolean f10621d;

    /* renamed from: e */
    private float f10622e;

    /* renamed from: f */
    private final Rect f10623f;

    /* renamed from: g */
    private final Rect f10624g;

    /* renamed from: h */
    private final RectF f10625h;

    /* renamed from: i */
    private int f10626i = 16;

    /* renamed from: j */
    private int f10627j = 16;

    /* renamed from: k */
    private float f10628k = 15.0f;

    /* renamed from: l */
    private float f10629l = 15.0f;

    /* renamed from: m */
    private ColorStateList f10630m;

    /* renamed from: n */
    private ColorStateList f10631n;

    /* renamed from: o */
    private float f10632o;

    /* renamed from: p */
    private float f10633p;

    /* renamed from: q */
    private float f10634q;

    /* renamed from: r */
    private float f10635r;

    /* renamed from: s */
    private float f10636s;

    /* renamed from: t */
    private float f10637t;

    /* renamed from: u */
    private Typeface f10638u;

    /* renamed from: v */
    private Typeface f10639v;

    /* renamed from: w */
    private Typeface f10640w;

    /* renamed from: x */
    private C1434a f10641x;

    /* renamed from: y */
    private C1434a f10642y;

    /* renamed from: z */
    private CharSequence f10643z;

    /* renamed from: com.google.android.material.internal.a$a */
    class C3169a implements C1434a.AbstractC1435a {
        C3169a() {
        }

        @Override // p069c.p073b.p074a.p090b.p104w.C1434a.AbstractC1435a
        /* renamed from: a */
        public void mo6558a(Typeface typeface) {
            C3168a.this.mo10690M(typeface);
        }
    }

    static {
        Paint paint = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public C3168a(View view) {
        this.f10620c = view;
        TextPaint textPaint = new TextPaint(129);
        this.f10602J = textPaint;
        this.f10603K = new TextPaint(textPaint);
        this.f10624g = new Rect();
        this.f10623f = new Rect();
        this.f10625h = new RectF();
    }

    /* renamed from: A */
    private boolean m13267A() {
        return C1013s.m5797y(this.f10620c) == 1;
    }

    /* renamed from: C */
    private static float m13268C(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C1401a.m7000a(f, f2, f3);
    }

    /* renamed from: F */
    private static boolean m13269F(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: J */
    private void m13270J(float f) {
        this.f10615W = f;
        C1013s.m5748Z(this.f10620c);
    }

    /* renamed from: N */
    private boolean m13271N(Typeface typeface) {
        C1434a aVar = this.f10642y;
        if (aVar != null) {
            aVar.mo6557c();
        }
        if (this.f10638u == typeface) {
            return false;
        }
        this.f10638u = typeface;
        return true;
    }

    /* renamed from: Q */
    private void m13272Q(float f) {
        this.f10616X = f;
        C1013s.m5748Z(this.f10620c);
    }

    /* renamed from: U */
    private boolean m13273U(Typeface typeface) {
        C1434a aVar = this.f10641x;
        if (aVar != null) {
            aVar.mo6557c();
        }
        if (this.f10639v == typeface) {
            return false;
        }
        this.f10639v = typeface;
        return true;
    }

    /* renamed from: W */
    private void m13274W(float f) {
        m13281g(f);
        boolean z = f10591a && this.f10598F != 1.0f;
        this.f10595C = z;
        if (z) {
            m13285l();
        }
        C1013s.m5748Z(this.f10620c);
    }

    /* renamed from: a */
    private static int m13275a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13276b() {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C3168a.m13276b():void");
    }

    /* renamed from: c0 */
    private boolean m13277c0() {
        return this.f10619a0 > 1 && !this.f10594B && !this.f10595C;
    }

    /* renamed from: d */
    private void m13278d() {
        m13280f(this.f10622e);
    }

    /* renamed from: e */
    private boolean m13279e(CharSequence charSequence) {
        return (m13267A() ? C0945e.f4646d : C0945e.f4645c).mo5389a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m13280f(float f) {
        int i;
        TextPaint textPaint;
        m13292y(f);
        this.f10636s = m13268C(this.f10634q, this.f10635r, f, this.f10604L);
        this.f10637t = m13268C(this.f10632o, this.f10633p, f, this.f10604L);
        m13274W(m13268C(this.f10628k, this.f10629l, f, this.f10605M));
        TimeInterpolator timeInterpolator = C1401a.f6015b;
        m13270J(1.0f - m13268C(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m13272Q(m13268C(1.0f, 0.0f, f, timeInterpolator));
        if (this.f10631n != this.f10630m) {
            textPaint = this.f10602J;
            i = m13275a(m13289t(), mo10707r(), f);
        } else {
            textPaint = this.f10602J;
            i = mo10707r();
        }
        textPaint.setColor(i);
        this.f10602J.setShadowLayer(m13268C(this.f10610R, this.f10606N, f, null), m13268C(this.f10611S, this.f10607O, f, null), m13268C(this.f10612T, this.f10608P, f, null), m13275a(m13288s(this.f10613U), m13288s(this.f10609Q), f));
        C1013s.m5748Z(this.f10620c);
    }

    /* renamed from: g */
    private void m13281g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f10643z != null) {
            float width = (float) this.f10624g.width();
            float width2 = (float) this.f10623f.width();
            boolean z3 = false;
            int i = 1;
            if (m13293z(f, this.f10629l)) {
                f2 = this.f10629l;
                this.f10598F = 1.0f;
                Typeface typeface = this.f10640w;
                Typeface typeface2 = this.f10638u;
                if (typeface != typeface2) {
                    this.f10640w = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f10628k;
                Typeface typeface3 = this.f10640w;
                Typeface typeface4 = this.f10639v;
                if (typeface3 != typeface4) {
                    this.f10640w = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m13293z(f, f3)) {
                    this.f10598F = 1.0f;
                } else {
                    this.f10598F = f / this.f10628k;
                }
                float f4 = this.f10629l / this.f10628k;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f10599G != f2 || this.f10601I || z;
                this.f10599G = f2;
                this.f10601I = false;
            }
            if (this.f10593A == null || z) {
                this.f10602J.setTextSize(this.f10599G);
                this.f10602J.setTypeface(this.f10640w);
                TextPaint textPaint = this.f10602J;
                if (this.f10598F != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.f10594B = m13279e(this.f10643z);
                if (m13277c0()) {
                    i = this.f10619a0;
                }
                StaticLayout i2 = m13283i(i, width, this.f10594B);
                this.f10614V = i2;
                this.f10593A = i2.getText();
            }
        }
    }

    /* renamed from: h */
    private void m13282h() {
        Bitmap bitmap = this.f10596D;
        if (bitmap != null) {
            bitmap.recycle();
            this.f10596D = null;
        }
    }

    /* renamed from: i */
    private StaticLayout m13283i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = C3197m.m13403c(this.f10643z, this.f10602J, (int) f).mo10788e(TextUtils.TruncateAt.END).mo10790g(z).mo10787d(Layout.Alignment.ALIGN_NORMAL).mo10789f(false).mo10791h(i).mo10786a();
        } catch (C3197m.C3198a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C0961i.m5494c(staticLayout);
    }

    /* renamed from: k */
    private void m13284k(Canvas canvas, float f, float f2) {
        int alpha = this.f10602J.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f10602J.setAlpha((int) (this.f10616X * f3));
        this.f10614V.draw(canvas);
        this.f10602J.setAlpha((int) (this.f10615W * f3));
        int lineBaseline = this.f10614V.getLineBaseline(0);
        CharSequence charSequence = this.f10618Z;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f10602J);
        String trim = this.f10618Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        this.f10602J.setAlpha(alpha);
        canvas.drawText(trim, 0, Math.min(this.f10614V.getLineEnd(0), trim.length()), 0.0f, f4, (Paint) this.f10602J);
    }

    /* renamed from: l */
    private void m13285l() {
        if (this.f10596D == null && !this.f10623f.isEmpty() && !TextUtils.isEmpty(this.f10593A)) {
            m13280f(0.0f);
            int width = this.f10614V.getWidth();
            int height = this.f10614V.getHeight();
            if (width > 0 && height > 0) {
                this.f10596D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f10614V.draw(new Canvas(this.f10596D));
                if (this.f10597E == null) {
                    this.f10597E = new Paint(3);
                }
            }
        }
    }

    /* renamed from: p */
    private float m13286p(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) - (mo10702c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f10594B ? (float) this.f10624g.left : ((float) this.f10624g.right) - mo10702c() : this.f10594B ? ((float) this.f10624g.right) - mo10702c() : (float) this.f10624g.left;
    }

    /* renamed from: q */
    private float m13287q(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) + (mo10702c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f10594B ? rectF.left + mo10702c() : (float) this.f10624g.right : this.f10594B ? (float) this.f10624g.right : rectF.left + mo10702c();
    }

    /* renamed from: s */
    private int m13288s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10600H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: t */
    private int m13289t() {
        return m13288s(this.f10630m);
    }

    /* renamed from: w */
    private void m13290w(TextPaint textPaint) {
        textPaint.setTextSize(this.f10629l);
        textPaint.setTypeface(this.f10638u);
    }

    /* renamed from: x */
    private void m13291x(TextPaint textPaint) {
        textPaint.setTextSize(this.f10628k);
        textPaint.setTypeface(this.f10639v);
    }

    /* renamed from: y */
    private void m13292y(float f) {
        this.f10625h.left = m13268C((float) this.f10623f.left, (float) this.f10624g.left, f, this.f10604L);
        this.f10625h.top = m13268C(this.f10632o, this.f10633p, f, this.f10604L);
        this.f10625h.right = m13268C((float) this.f10623f.right, (float) this.f10624g.right, f, this.f10604L);
        this.f10625h.bottom = m13268C((float) this.f10623f.bottom, (float) this.f10624g.bottom, f, this.f10604L);
    }

    /* renamed from: z */
    private static boolean m13293z(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: B */
    public final boolean mo10682B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f10631n;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f10630m) != null && colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo10683D() {
        this.f10621d = this.f10624g.width() > 0 && this.f10624g.height() > 0 && this.f10623f.width() > 0 && this.f10623f.height() > 0;
    }

    /* renamed from: E */
    public void mo10684E() {
        if (this.f10620c.getHeight() > 0 && this.f10620c.getWidth() > 0) {
            m13276b();
            m13278d();
        }
    }

    /* renamed from: G */
    public void mo10685G(int i, int i2, int i3, int i4) {
        if (!m13269F(this.f10624g, i, i2, i3, i4)) {
            this.f10624g.set(i, i2, i3, i4);
            this.f10601I = true;
            mo10683D();
        }
    }

    /* renamed from: H */
    public void mo10686H(Rect rect) {
        mo10685G(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: I */
    public void mo10687I(int i) {
        C1438d dVar = new C1438d(this.f10620c.getContext(), i);
        ColorStateList colorStateList = dVar.f6073b;
        if (colorStateList != null) {
            this.f10631n = colorStateList;
        }
        float f = dVar.f6072a;
        if (f != 0.0f) {
            this.f10629l = f;
        }
        ColorStateList colorStateList2 = dVar.f6080i;
        if (colorStateList2 != null) {
            this.f10609Q = colorStateList2;
        }
        this.f10607O = dVar.f6081j;
        this.f10608P = dVar.f6082k;
        this.f10606N = dVar.f6083l;
        C1434a aVar = this.f10642y;
        if (aVar != null) {
            aVar.mo6557c();
        }
        this.f10642y = new C1434a(new C3169a(), dVar.mo6559e());
        dVar.mo6562h(this.f10620c.getContext(), this.f10642y);
        mo10684E();
    }

    /* renamed from: K */
    public void mo10688K(ColorStateList colorStateList) {
        if (this.f10631n != colorStateList) {
            this.f10631n = colorStateList;
            mo10684E();
        }
    }

    /* renamed from: L */
    public void mo10689L(int i) {
        if (this.f10627j != i) {
            this.f10627j = i;
            mo10684E();
        }
    }

    /* renamed from: M */
    public void mo10690M(Typeface typeface) {
        if (m13271N(typeface)) {
            mo10684E();
        }
    }

    /* renamed from: O */
    public void mo10691O(int i, int i2, int i3, int i4) {
        if (!m13269F(this.f10623f, i, i2, i3, i4)) {
            this.f10623f.set(i, i2, i3, i4);
            this.f10601I = true;
            mo10683D();
        }
    }

    /* renamed from: P */
    public void mo10692P(Rect rect) {
        mo10691O(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: R */
    public void mo10693R(ColorStateList colorStateList) {
        if (this.f10630m != colorStateList) {
            this.f10630m = colorStateList;
            mo10684E();
        }
    }

    /* renamed from: S */
    public void mo10694S(int i) {
        if (this.f10626i != i) {
            this.f10626i = i;
            mo10684E();
        }
    }

    /* renamed from: T */
    public void mo10695T(float f) {
        if (this.f10628k != f) {
            this.f10628k = f;
            mo10684E();
        }
    }

    /* renamed from: V */
    public void mo10696V(float f) {
        float a = C0920a.m5392a(f, 0.0f, 1.0f);
        if (a != this.f10622e) {
            this.f10622e = a;
            m13278d();
        }
    }

    /* renamed from: X */
    public void mo10697X(TimeInterpolator timeInterpolator) {
        this.f10604L = timeInterpolator;
        mo10684E();
    }

    /* renamed from: Y */
    public final boolean mo10698Y(int[] iArr) {
        this.f10600H = iArr;
        if (!mo10682B()) {
            return false;
        }
        mo10684E();
        return true;
    }

    /* renamed from: Z */
    public void mo10699Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f10643z, charSequence)) {
            this.f10643z = charSequence;
            this.f10593A = null;
            m13282h();
            mo10684E();
        }
    }

    /* renamed from: a0 */
    public void mo10700a0(TimeInterpolator timeInterpolator) {
        this.f10605M = timeInterpolator;
        mo10684E();
    }

    /* renamed from: b0 */
    public void mo10701b0(Typeface typeface) {
        boolean N = m13271N(typeface);
        boolean U = m13273U(typeface);
        if (N || U) {
            mo10684E();
        }
    }

    /* renamed from: c */
    public float mo10702c() {
        if (this.f10643z == null) {
            return 0.0f;
        }
        m13290w(this.f10603K);
        TextPaint textPaint = this.f10603K;
        CharSequence charSequence = this.f10643z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: j */
    public void mo10703j(Canvas canvas) {
        int save = canvas.save();
        if (this.f10593A != null && this.f10621d) {
            boolean z = false;
            float lineLeft = (this.f10636s + this.f10614V.getLineLeft(0)) - (this.f10617Y * 2.0f);
            this.f10602J.setTextSize(this.f10599G);
            float f = this.f10636s;
            float f2 = this.f10637t;
            if (this.f10595C && this.f10596D != null) {
                z = true;
            }
            float f3 = this.f10598F;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f10596D, f, f2, this.f10597E);
                canvas.restoreToCount(save);
                return;
            }
            if (m13277c0()) {
                m13284k(canvas, lineLeft, f2);
            } else {
                canvas.translate(f, f2);
                this.f10614V.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m */
    public void mo10704m(RectF rectF, int i, int i2) {
        this.f10594B = m13279e(this.f10643z);
        rectF.left = m13286p(i, i2);
        rectF.top = (float) this.f10624g.top;
        rectF.right = m13287q(rectF, i, i2);
        rectF.bottom = ((float) this.f10624g.top) + mo10706o();
    }

    /* renamed from: n */
    public ColorStateList mo10705n() {
        return this.f10631n;
    }

    /* renamed from: o */
    public float mo10706o() {
        m13290w(this.f10603K);
        return -this.f10603K.ascent();
    }

    /* renamed from: r */
    public int mo10707r() {
        return m13288s(this.f10631n);
    }

    /* renamed from: u */
    public float mo10708u() {
        m13291x(this.f10603K);
        return -this.f10603K.ascent();
    }

    /* renamed from: v */
    public float mo10709v() {
        return this.f10622e;
    }
}
