package p069c.p073b.p074a.p090b.p107z;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.AbstractC0399b;
import java.util.BitSet;
import p006b.p030g.p038j.C0956d;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.p098q.C1428a;
import p069c.p073b.p074a.p090b.p100s.C1430a;
import p069c.p073b.p074a.p090b.p106y.C1447a;
import p069c.p073b.p074a.p090b.p107z.C1462k;
import p069c.p073b.p074a.p090b.p107z.C1466l;
import p069c.p073b.p074a.p090b.p107z.C1469m;

/* renamed from: c.b.a.b.z.g */
public class C1455g extends Drawable implements AbstractC0399b, AbstractC1477n {

    /* renamed from: b */
    private static final String f6124b = C1455g.class.getSimpleName();

    /* renamed from: c */
    private static final Paint f6125c = new Paint(1);

    /* renamed from: d */
    private C1458c f6126d;

    /* renamed from: e */
    private final C1469m.AbstractC1476g[] f6127e;

    /* renamed from: f */
    private final C1469m.AbstractC1476g[] f6128f;

    /* renamed from: g */
    private final BitSet f6129g;

    /* renamed from: h */
    private boolean f6130h;

    /* renamed from: i */
    private final Matrix f6131i;

    /* renamed from: j */
    private final Path f6132j;

    /* renamed from: k */
    private final Path f6133k;

    /* renamed from: l */
    private final RectF f6134l;

    /* renamed from: m */
    private final RectF f6135m;

    /* renamed from: n */
    private final Region f6136n;

    /* renamed from: o */
    private final Region f6137o;

    /* renamed from: p */
    private C1462k f6138p;

    /* renamed from: q */
    private final Paint f6139q;

    /* renamed from: r */
    private final Paint f6140r;

    /* renamed from: s */
    private final C1447a f6141s;

    /* renamed from: t */
    private final C1466l.AbstractC1467a f6142t;

    /* renamed from: u */
    private final C1466l f6143u;

    /* renamed from: v */
    private PorterDuffColorFilter f6144v;

    /* renamed from: w */
    private PorterDuffColorFilter f6145w;

    /* renamed from: x */
    private final RectF f6146x;

    /* renamed from: y */
    private boolean f6147y;

    /* renamed from: c.b.a.b.z.g$a */
    class C1456a implements C1466l.AbstractC1467a {
        C1456a() {
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1466l.AbstractC1467a
        /* renamed from: a */
        public void mo6639a(C1469m mVar, Matrix matrix, int i) {
            C1455g.this.f6129g.set(i + 4, mVar.mo6684e());
            C1455g.this.f6128f[i] = mVar.mo6685f(matrix);
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1466l.AbstractC1467a
        /* renamed from: b */
        public void mo6640b(C1469m mVar, Matrix matrix, int i) {
            C1455g.this.f6129g.set(i, mVar.mo6684e());
            C1455g.this.f6127e[i] = mVar.mo6685f(matrix);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.z.g$b */
    public class C1457b implements C1462k.AbstractC1465c {

        /* renamed from: a */
        final /* synthetic */ float f6149a;

        C1457b(float f) {
            this.f6149a = f;
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1462k.AbstractC1465c
        /* renamed from: a */
        public AbstractC1451c mo6641a(AbstractC1451c cVar) {
            return cVar instanceof C1460i ? cVar : new C1450b(this.f6149a, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.z.g$c */
    public static final class C1458c extends Drawable.ConstantState {

        /* renamed from: a */
        public C1462k f6151a;

        /* renamed from: b */
        public C1430a f6152b;

        /* renamed from: c */
        public ColorFilter f6153c;

        /* renamed from: d */
        public ColorStateList f6154d = null;

        /* renamed from: e */
        public ColorStateList f6155e = null;

        /* renamed from: f */
        public ColorStateList f6156f = null;

        /* renamed from: g */
        public ColorStateList f6157g = null;

        /* renamed from: h */
        public PorterDuff.Mode f6158h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f6159i = null;

        /* renamed from: j */
        public float f6160j = 1.0f;

        /* renamed from: k */
        public float f6161k = 1.0f;

        /* renamed from: l */
        public float f6162l;

        /* renamed from: m */
        public int f6163m = 255;

        /* renamed from: n */
        public float f6164n = 0.0f;

        /* renamed from: o */
        public float f6165o = 0.0f;

        /* renamed from: p */
        public float f6166p = 0.0f;

        /* renamed from: q */
        public int f6167q = 0;

        /* renamed from: r */
        public int f6168r = 0;

        /* renamed from: s */
        public int f6169s = 0;

        /* renamed from: t */
        public int f6170t = 0;

        /* renamed from: u */
        public boolean f6171u = false;

        /* renamed from: v */
        public Paint.Style f6172v = Paint.Style.FILL_AND_STROKE;

        public C1458c(C1458c cVar) {
            this.f6151a = cVar.f6151a;
            this.f6152b = cVar.f6152b;
            this.f6162l = cVar.f6162l;
            this.f6153c = cVar.f6153c;
            this.f6154d = cVar.f6154d;
            this.f6155e = cVar.f6155e;
            this.f6158h = cVar.f6158h;
            this.f6157g = cVar.f6157g;
            this.f6163m = cVar.f6163m;
            this.f6160j = cVar.f6160j;
            this.f6169s = cVar.f6169s;
            this.f6167q = cVar.f6167q;
            this.f6171u = cVar.f6171u;
            this.f6161k = cVar.f6161k;
            this.f6164n = cVar.f6164n;
            this.f6165o = cVar.f6165o;
            this.f6166p = cVar.f6166p;
            this.f6168r = cVar.f6168r;
            this.f6170t = cVar.f6170t;
            this.f6156f = cVar.f6156f;
            this.f6172v = cVar.f6172v;
            if (cVar.f6159i != null) {
                this.f6159i = new Rect(cVar.f6159i);
            }
        }

        public C1458c(C1462k kVar, C1430a aVar) {
            this.f6151a = kVar;
            this.f6152b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C1455g gVar = new C1455g(this, null);
            gVar.f6130h = true;
            return gVar;
        }
    }

    public C1455g() {
        this(new C1462k());
    }

    public C1455g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1462k.m7193e(context, attributeSet, i, i2).mo6667m());
    }

    private C1455g(C1458c cVar) {
        this.f6127e = new C1469m.AbstractC1476g[4];
        this.f6128f = new C1469m.AbstractC1476g[4];
        this.f6129g = new BitSet(8);
        this.f6131i = new Matrix();
        this.f6132j = new Path();
        this.f6133k = new Path();
        this.f6134l = new RectF();
        this.f6135m = new RectF();
        this.f6136n = new Region();
        this.f6137o = new Region();
        Paint paint = new Paint(1);
        this.f6139q = paint;
        Paint paint2 = new Paint(1);
        this.f6140r = paint2;
        this.f6141s = new C1447a();
        this.f6143u = new C1466l();
        this.f6146x = new RectF();
        this.f6147y = true;
        this.f6126d = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f6125c;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m7134f0();
        m7132e0(getState());
        this.f6142t = new C1456a();
    }

    /* synthetic */ C1455g(C1458c cVar, C1456a aVar) {
        this(cVar);
    }

    public C1455g(C1462k kVar) {
        this(new C1458c(kVar, null));
    }

    /* renamed from: D */
    private float m7120D() {
        if (m7123L()) {
            return this.f6140r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    private boolean m7121J() {
        C1458c cVar = this.f6126d;
        int i = cVar.f6167q;
        return i != 1 && cVar.f6168r > 0 && (i == 2 || mo6606T());
    }

    /* renamed from: K */
    private boolean m7122K() {
        Paint.Style style = this.f6126d.f6172v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: L */
    private boolean m7123L() {
        Paint.Style style = this.f6126d.f6172v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6140r.getStrokeWidth() > 0.0f;
    }

    /* renamed from: N */
    private void m7124N() {
        super.invalidateSelf();
    }

    /* renamed from: Q */
    private void m7125Q(Canvas canvas) {
        if (m7121J()) {
            canvas.save();
            m7127S(canvas);
            if (!this.f6147y) {
                m7142n(canvas);
            } else {
                int width = (int) (this.f6146x.width() - ((float) getBounds().width()));
                int height = (int) (this.f6146x.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f6146x.width()) + (this.f6126d.f6168r * 2) + width, ((int) this.f6146x.height()) + (this.f6126d.f6168r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (float) ((getBounds().left - this.f6126d.f6168r) - width);
                float f2 = (float) ((getBounds().top - this.f6126d.f6168r) - height);
                canvas2.translate(-f, -f2);
                m7142n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    /* renamed from: R */
    private static int m7126R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: S */
    private void m7127S(Canvas canvas) {
        int z = mo6638z();
        int A = mo6595A();
        if (Build.VERSION.SDK_INT < 21 && this.f6147y) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f6126d.f6168r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(z, A);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) z, (float) A);
    }

    /* renamed from: e0 */
    private boolean m7132e0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f6126d.f6154d == null || color2 == (colorForState2 = this.f6126d.f6154d.getColorForState(iArr, (color2 = this.f6139q.getColor())))) {
            z = false;
        } else {
            this.f6139q.setColor(colorForState2);
            z = true;
        }
        if (this.f6126d.f6155e == null || color == (colorForState = this.f6126d.f6155e.getColorForState(iArr, (color = this.f6140r.getColor())))) {
            return z;
        }
        this.f6140r.setColor(colorForState);
        return true;
    }

    /* renamed from: f */
    private PorterDuffColorFilter m7133f(Paint paint, boolean z) {
        int color;
        int l;
        if (!z || (l = m7140l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: f0 */
    private boolean m7134f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f6144v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6145w;
        C1458c cVar = this.f6126d;
        this.f6144v = m7139k(cVar.f6157g, cVar.f6158h, this.f6139q, true);
        C1458c cVar2 = this.f6126d;
        this.f6145w = m7139k(cVar2.f6156f, cVar2.f6158h, this.f6140r, false);
        C1458c cVar3 = this.f6126d;
        if (cVar3.f6171u) {
            this.f6141s.mo6582d(cVar3.f6157g.getColorForState(getState(), 0));
        }
        return !C0956d.m5483a(porterDuffColorFilter, this.f6144v) || !C0956d.m5483a(porterDuffColorFilter2, this.f6145w);
    }

    /* renamed from: g */
    private void m7135g(RectF rectF, Path path) {
        mo6623h(rectF, path);
        if (this.f6126d.f6160j != 1.0f) {
            this.f6131i.reset();
            Matrix matrix = this.f6131i;
            float f = this.f6126d.f6160j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f6131i);
        }
        path.computeBounds(this.f6146x, true);
    }

    /* renamed from: g0 */
    private void m7136g0() {
        float I = mo6602I();
        this.f6126d.f6168r = (int) Math.ceil((double) (0.75f * I));
        this.f6126d.f6169s = (int) Math.ceil((double) (I * 0.25f));
        m7134f0();
        m7124N();
    }

    /* renamed from: i */
    private void m7137i() {
        C1462k x = mo6597C().mo6661x(new C1457b(-m7120D()));
        this.f6138p = x;
        this.f6143u.mo6680d(x, this.f6126d.f6161k, m7146v(), this.f6133k);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m7138j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m7140l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m7139k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m7133f(paint, z) : m7138j(colorStateList, mode, z);
    }

    /* renamed from: l */
    private int m7140l(int i) {
        float I = mo6602I() + mo6637y();
        C1430a aVar = this.f6126d.f6152b;
        return aVar != null ? aVar.mo6550c(i, I) : i;
    }

    /* renamed from: m */
    public static C1455g m7141m(Context context, float f) {
        int b = C1428a.m7051b(context, C1391b.colorSurface, C1455g.class.getSimpleName());
        C1455g gVar = new C1455g();
        gVar.mo6603M(context);
        gVar.mo6608V(ColorStateList.valueOf(b));
        gVar.mo6607U(f);
        return gVar;
    }

    /* renamed from: n */
    private void m7142n(Canvas canvas) {
        if (this.f6129g.cardinality() > 0) {
            Log.w(f6124b, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f6126d.f6169s != 0) {
            canvas.drawPath(this.f6132j, this.f6141s.mo6581c());
        }
        for (int i = 0; i < 4; i++) {
            this.f6127e[i].mo6696b(this.f6141s, this.f6126d.f6168r, canvas);
            this.f6128f[i].mo6696b(this.f6141s, this.f6126d.f6168r, canvas);
        }
        if (this.f6147y) {
            int z = mo6638z();
            int A = mo6595A();
            canvas.translate((float) (-z), (float) (-A));
            canvas.drawPath(this.f6132j, f6125c);
            canvas.translate((float) z, (float) A);
        }
    }

    /* renamed from: o */
    private void m7143o(Canvas canvas) {
        m7144q(canvas, this.f6139q, this.f6132j, this.f6126d.f6151a, mo6634u());
    }

    /* renamed from: q */
    private void m7144q(Canvas canvas, Paint paint, Path path, C1462k kVar, RectF rectF) {
        if (kVar.mo6658u(rectF)) {
            float a = kVar.mo6657t().mo6586a(rectF) * this.f6126d.f6161k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r */
    private void m7145r(Canvas canvas) {
        m7144q(canvas, this.f6140r, this.f6133k, this.f6138p, m7146v());
    }

    /* renamed from: v */
    private RectF m7146v() {
        this.f6135m.set(mo6634u());
        float D = m7120D();
        this.f6135m.inset(D, D);
        return this.f6135m;
    }

    /* renamed from: A */
    public int mo6595A() {
        C1458c cVar = this.f6126d;
        double d = (double) cVar.f6169s;
        double cos = Math.cos(Math.toRadians((double) cVar.f6170t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: B */
    public int mo6596B() {
        return this.f6126d.f6168r;
    }

    /* renamed from: C */
    public C1462k mo6597C() {
        return this.f6126d.f6151a;
    }

    /* renamed from: E */
    public ColorStateList mo6598E() {
        return this.f6126d.f6157g;
    }

    /* renamed from: F */
    public float mo6599F() {
        return this.f6126d.f6151a.mo6655r().mo6586a(mo6634u());
    }

    /* renamed from: G */
    public float mo6600G() {
        return this.f6126d.f6151a.mo6657t().mo6586a(mo6634u());
    }

    /* renamed from: H */
    public float mo6601H() {
        return this.f6126d.f6166p;
    }

    /* renamed from: I */
    public float mo6602I() {
        return mo6635w() + mo6601H();
    }

    /* renamed from: M */
    public void mo6603M(Context context) {
        this.f6126d.f6152b = new C1430a(context);
        m7136g0();
    }

    /* renamed from: O */
    public boolean mo6604O() {
        C1430a aVar = this.f6126d.f6152b;
        return aVar != null && aVar.mo6551d();
    }

    /* renamed from: P */
    public boolean mo6605P() {
        return this.f6126d.f6151a.mo6658u(mo6634u());
    }

    /* renamed from: T */
    public boolean mo6606T() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || (!mo6605P() && !this.f6132j.isConvex() && i < 29);
    }

    /* renamed from: U */
    public void mo6607U(float f) {
        C1458c cVar = this.f6126d;
        if (cVar.f6165o != f) {
            cVar.f6165o = f;
            m7136g0();
        }
    }

    /* renamed from: V */
    public void mo6608V(ColorStateList colorStateList) {
        C1458c cVar = this.f6126d;
        if (cVar.f6154d != colorStateList) {
            cVar.f6154d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: W */
    public void mo6609W(float f) {
        C1458c cVar = this.f6126d;
        if (cVar.f6161k != f) {
            cVar.f6161k = f;
            this.f6130h = true;
            invalidateSelf();
        }
    }

    /* renamed from: X */
    public void mo6610X(int i, int i2, int i3, int i4) {
        C1458c cVar = this.f6126d;
        if (cVar.f6159i == null) {
            cVar.f6159i = new Rect();
        }
        this.f6126d.f6159i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: Y */
    public void mo6611Y(float f) {
        C1458c cVar = this.f6126d;
        if (cVar.f6164n != f) {
            cVar.f6164n = f;
            m7136g0();
        }
    }

    /* renamed from: Z */
    public void mo6612Z(int i) {
        C1458c cVar = this.f6126d;
        if (cVar.f6170t != i) {
            cVar.f6170t = i;
            m7124N();
        }
    }

    /* renamed from: a0 */
    public void mo6613a0(float f, int i) {
        mo6616d0(f);
        mo6615c0(ColorStateList.valueOf(i));
    }

    /* renamed from: b0 */
    public void mo6614b0(float f, ColorStateList colorStateList) {
        mo6616d0(f);
        mo6615c0(colorStateList);
    }

    /* renamed from: c0 */
    public void mo6615c0(ColorStateList colorStateList) {
        C1458c cVar = this.f6126d;
        if (cVar.f6155e != colorStateList) {
            cVar.f6155e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d0 */
    public void mo6616d0(float f) {
        this.f6126d.f6162l = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f6139q.setColorFilter(this.f6144v);
        int alpha = this.f6139q.getAlpha();
        this.f6139q.setAlpha(m7126R(alpha, this.f6126d.f6163m));
        this.f6140r.setColorFilter(this.f6145w);
        this.f6140r.setStrokeWidth(this.f6126d.f6162l);
        int alpha2 = this.f6140r.getAlpha();
        this.f6140r.setAlpha(m7126R(alpha2, this.f6126d.f6163m));
        if (this.f6130h) {
            m7137i();
            m7135g(mo6634u(), this.f6132j);
            this.f6130h = false;
        }
        m7125Q(canvas);
        if (m7122K()) {
            m7143o(canvas);
        }
        if (m7123L()) {
            m7145r(canvas);
        }
        this.f6139q.setAlpha(alpha);
        this.f6140r.setAlpha(alpha2);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f6126d;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f6126d.f6167q != 2) {
            if (mo6605P()) {
                outline.setRoundRect(getBounds(), mo6599F() * this.f6126d.f6161k);
                return;
            }
            m7135g(mo6634u(), this.f6132j);
            if (this.f6132j.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f6132j);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f6126d.f6159i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f6136n.set(getBounds());
        m7135g(mo6634u(), this.f6132j);
        this.f6137o.setPath(this.f6132j, this.f6136n);
        this.f6136n.op(this.f6137o, Region.Op.DIFFERENCE);
        return this.f6136n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo6623h(RectF rectF, Path path) {
        C1466l lVar = this.f6143u;
        C1458c cVar = this.f6126d;
        lVar.mo6681e(cVar.f6151a, cVar.f6161k, rectF, this.f6142t, path);
    }

    public void invalidateSelf() {
        this.f6130h = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f6126d.f6157g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f6126d.f6156f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f6126d.f6155e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f6126d.f6154d) != null && colorStateList4.isStateful())));
    }

    public Drawable mutate() {
        this.f6126d = new C1458c(this.f6126d);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f6130h = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m7132e0(iArr) || m7134f0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo6629p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m7144q(canvas, paint, path, this.f6126d.f6151a, rectF);
    }

    /* renamed from: s */
    public float mo6630s() {
        return this.f6126d.f6151a.mo6648j().mo6586a(mo6634u());
    }

    public void setAlpha(int i) {
        C1458c cVar = this.f6126d;
        if (cVar.f6163m != i) {
            cVar.f6163m = i;
            m7124N();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6126d.f6153c = colorFilter;
        m7124N();
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        this.f6126d.f6151a = kVar;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        this.f6126d.f6157g = colorStateList;
        m7134f0();
        m7124N();
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        C1458c cVar = this.f6126d;
        if (cVar.f6158h != mode) {
            cVar.f6158h = mode;
            m7134f0();
            m7124N();
        }
    }

    /* renamed from: t */
    public float mo6633t() {
        return this.f6126d.f6151a.mo6650l().mo6586a(mo6634u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public RectF mo6634u() {
        this.f6134l.set(getBounds());
        return this.f6134l;
    }

    /* renamed from: w */
    public float mo6635w() {
        return this.f6126d.f6165o;
    }

    /* renamed from: x */
    public ColorStateList mo6636x() {
        return this.f6126d.f6154d;
    }

    /* renamed from: y */
    public float mo6637y() {
        return this.f6126d.f6164n;
    }

    /* renamed from: z */
    public int mo6638z() {
        C1458c cVar = this.f6126d;
        double d = (double) cVar.f6169s;
        double sin = Math.sin(Math.toRadians((double) cVar.f6170t));
        Double.isNaN(d);
        return (int) (d * sin);
    }
}
