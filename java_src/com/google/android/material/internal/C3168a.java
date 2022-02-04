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
    private static final boolean f10583a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: b */
    private static final Paint f10584b = null;

    /* renamed from: A */
    private CharSequence f10585A;

    /* renamed from: B */
    private boolean f10586B;

    /* renamed from: C */
    private boolean f10587C;

    /* renamed from: D */
    private Bitmap f10588D;

    /* renamed from: E */
    private Paint f10589E;

    /* renamed from: F */
    private float f10590F;

    /* renamed from: G */
    private float f10591G;

    /* renamed from: H */
    private int[] f10592H;

    /* renamed from: I */
    private boolean f10593I;

    /* renamed from: J */
    private final TextPaint f10594J;

    /* renamed from: K */
    private final TextPaint f10595K;

    /* renamed from: L */
    private TimeInterpolator f10596L;

    /* renamed from: M */
    private TimeInterpolator f10597M;

    /* renamed from: N */
    private float f10598N;

    /* renamed from: O */
    private float f10599O;

    /* renamed from: P */
    private float f10600P;

    /* renamed from: Q */
    private ColorStateList f10601Q;

    /* renamed from: R */
    private float f10602R;

    /* renamed from: S */
    private float f10603S;

    /* renamed from: T */
    private float f10604T;

    /* renamed from: U */
    private ColorStateList f10605U;

    /* renamed from: V */
    private StaticLayout f10606V;

    /* renamed from: W */
    private float f10607W;

    /* renamed from: X */
    private float f10608X;

    /* renamed from: Y */
    private float f10609Y;

    /* renamed from: Z */
    private CharSequence f10610Z;

    /* renamed from: a0 */
    private int f10611a0 = 1;

    /* renamed from: c */
    private final View f10612c;

    /* renamed from: d */
    private boolean f10613d;

    /* renamed from: e */
    private float f10614e;

    /* renamed from: f */
    private final Rect f10615f;

    /* renamed from: g */
    private final Rect f10616g;

    /* renamed from: h */
    private final RectF f10617h;

    /* renamed from: i */
    private int f10618i = 16;

    /* renamed from: j */
    private int f10619j = 16;

    /* renamed from: k */
    private float f10620k = 15.0f;

    /* renamed from: l */
    private float f10621l = 15.0f;

    /* renamed from: m */
    private ColorStateList f10622m;

    /* renamed from: n */
    private ColorStateList f10623n;

    /* renamed from: o */
    private float f10624o;

    /* renamed from: p */
    private float f10625p;

    /* renamed from: q */
    private float f10626q;

    /* renamed from: r */
    private float f10627r;

    /* renamed from: s */
    private float f10628s;

    /* renamed from: t */
    private float f10629t;

    /* renamed from: u */
    private Typeface f10630u;

    /* renamed from: v */
    private Typeface f10631v;

    /* renamed from: w */
    private Typeface f10632w;

    /* renamed from: x */
    private C1434a f10633x;

    /* renamed from: y */
    private C1434a f10634y;

    /* renamed from: z */
    private CharSequence f10635z;

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
        this.f10612c = view;
        TextPaint textPaint = new TextPaint(129);
        this.f10594J = textPaint;
        this.f10595K = new TextPaint(textPaint);
        this.f10616g = new Rect();
        this.f10615f = new Rect();
        this.f10617h = new RectF();
    }

    /* renamed from: A */
    private boolean m13267A() {
        return C1013s.m5797y(this.f10612c) == 1;
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
        this.f10607W = f;
        C1013s.m5748Z(this.f10612c);
    }

    /* renamed from: N */
    private boolean m13271N(Typeface typeface) {
        C1434a aVar = this.f10634y;
        if (aVar != null) {
            aVar.mo6557c();
        }
        if (this.f10630u == typeface) {
            return false;
        }
        this.f10630u = typeface;
        return true;
    }

    /* renamed from: Q */
    private void m13272Q(float f) {
        this.f10608X = f;
        C1013s.m5748Z(this.f10612c);
    }

    /* renamed from: U */
    private boolean m13273U(Typeface typeface) {
        C1434a aVar = this.f10633x;
        if (aVar != null) {
            aVar.mo6557c();
        }
        if (this.f10631v == typeface) {
            return false;
        }
        this.f10631v = typeface;
        return true;
    }

    /* renamed from: W */
    private void m13274W(float f) {
        m13281g(f);
        boolean z = f10583a && this.f10590F != 1.0f;
        this.f10587C = z;
        if (z) {
            m13285l();
        }
        C1013s.m5748Z(this.f10612c);
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
        return this.f10611a0 > 1 && !this.f10586B && !this.f10587C;
    }

    /* renamed from: d */
    private void m13278d() {
        m13280f(this.f10614e);
    }

    /* renamed from: e */
    private boolean m13279e(CharSequence charSequence) {
        return (m13267A() ? C0945e.f4642d : C0945e.f4641c).mo5389a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m13280f(float f) {
        int i;
        TextPaint textPaint;
        m13292y(f);
        this.f10628s = m13268C(this.f10626q, this.f10627r, f, this.f10596L);
        this.f10629t = m13268C(this.f10624o, this.f10625p, f, this.f10596L);
        m13274W(m13268C(this.f10620k, this.f10621l, f, this.f10597M));
        TimeInterpolator timeInterpolator = C1401a.f6007b;
        m13270J(1.0f - m13268C(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m13272Q(m13268C(1.0f, 0.0f, f, timeInterpolator));
        if (this.f10623n != this.f10622m) {
            textPaint = this.f10594J;
            i = m13275a(m13289t(), mo10707r(), f);
        } else {
            textPaint = this.f10594J;
            i = mo10707r();
        }
        textPaint.setColor(i);
        this.f10594J.setShadowLayer(m13268C(this.f10602R, this.f10598N, f, null), m13268C(this.f10603S, this.f10599O, f, null), m13268C(this.f10604T, this.f10600P, f, null), m13275a(m13288s(this.f10605U), m13288s(this.f10601Q), f));
        C1013s.m5748Z(this.f10612c);
    }

    /* renamed from: g */
    private void m13281g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f10635z != null) {
            float width = (float) this.f10616g.width();
            float width2 = (float) this.f10615f.width();
            boolean z3 = false;
            int i = 1;
            if (m13293z(f, this.f10621l)) {
                f2 = this.f10621l;
                this.f10590F = 1.0f;
                Typeface typeface = this.f10632w;
                Typeface typeface2 = this.f10630u;
                if (typeface != typeface2) {
                    this.f10632w = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f10620k;
                Typeface typeface3 = this.f10632w;
                Typeface typeface4 = this.f10631v;
                if (typeface3 != typeface4) {
                    this.f10632w = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m13293z(f, f3)) {
                    this.f10590F = 1.0f;
                } else {
                    this.f10590F = f / this.f10620k;
                }
                float f4 = this.f10621l / this.f10620k;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f10591G != f2 || this.f10593I || z;
                this.f10591G = f2;
                this.f10593I = false;
            }
            if (this.f10585A == null || z) {
                this.f10594J.setTextSize(this.f10591G);
                this.f10594J.setTypeface(this.f10632w);
                TextPaint textPaint = this.f10594J;
                if (this.f10590F != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.f10586B = m13279e(this.f10635z);
                if (m13277c0()) {
                    i = this.f10611a0;
                }
                StaticLayout i2 = m13283i(i, width, this.f10586B);
                this.f10606V = i2;
                this.f10585A = i2.getText();
            }
        }
    }

    /* renamed from: h */
    private void m13282h() {
        Bitmap bitmap = this.f10588D;
        if (bitmap != null) {
            bitmap.recycle();
            this.f10588D = null;
        }
    }

    /* renamed from: i */
    private StaticLayout m13283i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = C3197m.m13403c(this.f10635z, this.f10594J, (int) f).mo10788e(TextUtils.TruncateAt.END).mo10790g(z).mo10787d(Layout.Alignment.ALIGN_NORMAL).mo10789f(false).mo10791h(i).mo10786a();
        } catch (C3197m.C3198a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C0961i.m5494c(staticLayout);
    }

    /* renamed from: k */
    private void m13284k(Canvas canvas, float f, float f2) {
        int alpha = this.f10594J.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f10594J.setAlpha((int) (this.f10608X * f3));
        this.f10606V.draw(canvas);
        this.f10594J.setAlpha((int) (this.f10607W * f3));
        int lineBaseline = this.f10606V.getLineBaseline(0);
        CharSequence charSequence = this.f10610Z;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f10594J);
        String trim = this.f10610Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        this.f10594J.setAlpha(alpha);
        canvas.drawText(trim, 0, Math.min(this.f10606V.getLineEnd(0), trim.length()), 0.0f, f4, (Paint) this.f10594J);
    }

    /* renamed from: l */
    private void m13285l() {
        if (this.f10588D == null && !this.f10615f.isEmpty() && !TextUtils.isEmpty(this.f10585A)) {
            m13280f(0.0f);
            int width = this.f10606V.getWidth();
            int height = this.f10606V.getHeight();
            if (width > 0 && height > 0) {
                this.f10588D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f10606V.draw(new Canvas(this.f10588D));
                if (this.f10589E == null) {
                    this.f10589E = new Paint(3);
                }
            }
        }
    }

    /* renamed from: p */
    private float m13286p(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) - (mo10702c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f10586B ? (float) this.f10616g.left : ((float) this.f10616g.right) - mo10702c() : this.f10586B ? ((float) this.f10616g.right) - mo10702c() : (float) this.f10616g.left;
    }

    /* renamed from: q */
    private float m13287q(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (((float) i) / 2.0f) + (mo10702c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f10586B ? rectF.left + mo10702c() : (float) this.f10616g.right : this.f10586B ? (float) this.f10616g.right : rectF.left + mo10702c();
    }

    /* renamed from: s */
    private int m13288s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10592H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: t */
    private int m13289t() {
        return m13288s(this.f10622m);
    }

    /* renamed from: w */
    private void m13290w(TextPaint textPaint) {
        textPaint.setTextSize(this.f10621l);
        textPaint.setTypeface(this.f10630u);
    }

    /* renamed from: x */
    private void m13291x(TextPaint textPaint) {
        textPaint.setTextSize(this.f10620k);
        textPaint.setTypeface(this.f10631v);
    }

    /* renamed from: y */
    private void m13292y(float f) {
        this.f10617h.left = m13268C((float) this.f10615f.left, (float) this.f10616g.left, f, this.f10596L);
        this.f10617h.top = m13268C(this.f10624o, this.f10625p, f, this.f10596L);
        this.f10617h.right = m13268C((float) this.f10615f.right, (float) this.f10616g.right, f, this.f10596L);
        this.f10617h.bottom = m13268C((float) this.f10615f.bottom, (float) this.f10616g.bottom, f, this.f10596L);
    }

    /* renamed from: z */
    private static boolean m13293z(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: B */
    public final boolean mo10682B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f10623n;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f10622m) != null && colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo10683D() {
        this.f10613d = this.f10616g.width() > 0 && this.f10616g.height() > 0 && this.f10615f.width() > 0 && this.f10615f.height() > 0;
    }

    /* renamed from: E */
    public void mo10684E() {
        if (this.f10612c.getHeight() > 0 && this.f10612c.getWidth() > 0) {
            m13276b();
            m13278d();
        }
    }

    /* renamed from: G */
    public void mo10685G(int i, int i2, int i3, int i4) {
        if (!m13269F(this.f10616g, i, i2, i3, i4)) {
            this.f10616g.set(i, i2, i3, i4);
            this.f10593I = true;
            mo10683D();
        }
    }

    /* renamed from: H */
    public void mo10686H(Rect rect) {
        mo10685G(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: I */
    public void mo10687I(int i) {
        C1438d dVar = new C1438d(this.f10612c.getContext(), i);
        ColorStateList colorStateList = dVar.f6065b;
        if (colorStateList != null) {
            this.f10623n = colorStateList;
        }
        float f = dVar.f6064a;
        if (f != 0.0f) {
            this.f10621l = f;
        }
        ColorStateList colorStateList2 = dVar.f6072i;
        if (colorStateList2 != null) {
            this.f10601Q = colorStateList2;
        }
        this.f10599O = dVar.f6073j;
        this.f10600P = dVar.f6074k;
        this.f10598N = dVar.f6075l;
        C1434a aVar = this.f10634y;
        if (aVar != null) {
            aVar.mo6557c();
        }
        this.f10634y = new C1434a(new C3169a(), dVar.mo6559e());
        dVar.mo6562h(this.f10612c.getContext(), this.f10634y);
        mo10684E();
    }

    /* renamed from: K */
    public void mo10688K(ColorStateList colorStateList) {
        if (this.f10623n != colorStateList) {
            this.f10623n = colorStateList;
            mo10684E();
        }
    }

    /* renamed from: L */
    public void mo10689L(int i) {
        if (this.f10619j != i) {
            this.f10619j = i;
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
        if (!m13269F(this.f10615f, i, i2, i3, i4)) {
            this.f10615f.set(i, i2, i3, i4);
            this.f10593I = true;
            mo10683D();
        }
    }

    /* renamed from: P */
    public void mo10692P(Rect rect) {
        mo10691O(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: R */
    public void mo10693R(ColorStateList colorStateList) {
        if (this.f10622m != colorStateList) {
            this.f10622m = colorStateList;
            mo10684E();
        }
    }

    /* renamed from: S */
    public void mo10694S(int i) {
        if (this.f10618i != i) {
            this.f10618i = i;
            mo10684E();
        }
    }

    /* renamed from: T */
    public void mo10695T(float f) {
        if (this.f10620k != f) {
            this.f10620k = f;
            mo10684E();
        }
    }

    /* renamed from: V */
    public void mo10696V(float f) {
        float a = C0920a.m5392a(f, 0.0f, 1.0f);
        if (a != this.f10614e) {
            this.f10614e = a;
            m13278d();
        }
    }

    /* renamed from: X */
    public void mo10697X(TimeInterpolator timeInterpolator) {
        this.f10596L = timeInterpolator;
        mo10684E();
    }

    /* renamed from: Y */
    public final boolean mo10698Y(int[] iArr) {
        this.f10592H = iArr;
        if (!mo10682B()) {
            return false;
        }
        mo10684E();
        return true;
    }

    /* renamed from: Z */
    public void mo10699Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f10635z, charSequence)) {
            this.f10635z = charSequence;
            this.f10585A = null;
            m13282h();
            mo10684E();
        }
    }

    /* renamed from: a0 */
    public void mo10700a0(TimeInterpolator timeInterpolator) {
        this.f10597M = timeInterpolator;
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
        if (this.f10635z == null) {
            return 0.0f;
        }
        m13290w(this.f10595K);
        TextPaint textPaint = this.f10595K;
        CharSequence charSequence = this.f10635z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: j */
    public void mo10703j(Canvas canvas) {
        int save = canvas.save();
        if (this.f10585A != null && this.f10613d) {
            boolean z = false;
            float lineLeft = (this.f10628s + this.f10606V.getLineLeft(0)) - (this.f10609Y * 2.0f);
            this.f10594J.setTextSize(this.f10591G);
            float f = this.f10628s;
            float f2 = this.f10629t;
            if (this.f10587C && this.f10588D != null) {
                z = true;
            }
            float f3 = this.f10590F;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f10588D, f, f2, this.f10589E);
                canvas.restoreToCount(save);
                return;
            }
            if (m13277c0()) {
                m13284k(canvas, lineLeft, f2);
            } else {
                canvas.translate(f, f2);
                this.f10606V.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m */
    public void mo10704m(RectF rectF, int i, int i2) {
        this.f10586B = m13279e(this.f10635z);
        rectF.left = m13286p(i, i2);
        rectF.top = (float) this.f10616g.top;
        rectF.right = m13287q(rectF, i, i2);
        rectF.bottom = ((float) this.f10616g.top) + mo10706o();
    }

    /* renamed from: n */
    public ColorStateList mo10705n() {
        return this.f10623n;
    }

    /* renamed from: o */
    public float mo10706o() {
        m13290w(this.f10595K);
        return -this.f10595K.ascent();
    }

    /* renamed from: r */
    public int mo10707r() {
        return m13288s(this.f10623n);
    }

    /* renamed from: u */
    public float mo10708u() {
        m13291x(this.f10595K);
        return -this.f10595K.ascent();
    }

    /* renamed from: v */
    public float mo10709v() {
        return this.f10614e;
    }
}
