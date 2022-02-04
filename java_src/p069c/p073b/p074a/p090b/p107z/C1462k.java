package p069c.p073b.p074a.p090b.p107z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p069c.p073b.p074a.p090b.C1400k;

/* renamed from: c.b.a.b.z.k */
public class C1462k {

    /* renamed from: a */
    public static final AbstractC1451c f6167a = new C1460i(0.5f);

    /* renamed from: b */
    C1452d f6168b;

    /* renamed from: c */
    C1452d f6169c;

    /* renamed from: d */
    C1452d f6170d;

    /* renamed from: e */
    C1452d f6171e;

    /* renamed from: f */
    AbstractC1451c f6172f;

    /* renamed from: g */
    AbstractC1451c f6173g;

    /* renamed from: h */
    AbstractC1451c f6174h;

    /* renamed from: i */
    AbstractC1451c f6175i;

    /* renamed from: j */
    C1454f f6176j;

    /* renamed from: k */
    C1454f f6177k;

    /* renamed from: l */
    C1454f f6178l;

    /* renamed from: m */
    C1454f f6179m;

    /* renamed from: c.b.a.b.z.k$b */
    public static final class C1464b {

        /* renamed from: a */
        private C1452d f6180a = C1459h.m7182b();

        /* renamed from: b */
        private C1452d f6181b = C1459h.m7182b();

        /* renamed from: c */
        private C1452d f6182c = C1459h.m7182b();

        /* renamed from: d */
        private C1452d f6183d = C1459h.m7182b();

        /* renamed from: e */
        private AbstractC1451c f6184e = new C1449a(0.0f);

        /* renamed from: f */
        private AbstractC1451c f6185f = new C1449a(0.0f);

        /* renamed from: g */
        private AbstractC1451c f6186g = new C1449a(0.0f);

        /* renamed from: h */
        private AbstractC1451c f6187h = new C1449a(0.0f);

        /* renamed from: i */
        private C1454f f6188i = C1459h.m7183c();

        /* renamed from: j */
        private C1454f f6189j = C1459h.m7183c();

        /* renamed from: k */
        private C1454f f6190k = C1459h.m7183c();

        /* renamed from: l */
        private C1454f f6191l = C1459h.m7183c();

        public C1464b() {
        }

        public C1464b(C1462k kVar) {
            this.f6180a = kVar.f6168b;
            this.f6181b = kVar.f6169c;
            this.f6182c = kVar.f6170d;
            this.f6183d = kVar.f6171e;
            this.f6184e = kVar.f6172f;
            this.f6185f = kVar.f6173g;
            this.f6186g = kVar.f6174h;
            this.f6187h = kVar.f6175i;
            this.f6188i = kVar.f6176j;
            this.f6189j = kVar.f6177k;
            this.f6190k = kVar.f6178l;
            this.f6191l = kVar.f6179m;
        }

        /* renamed from: n */
        private static float m7225n(C1452d dVar) {
            if (dVar instanceof C1461j) {
                return ((C1461j) dVar).f6166a;
            }
            if (dVar instanceof C1453e) {
                return ((C1453e) dVar).f6115a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C1464b mo6662A(AbstractC1451c cVar) {
            this.f6184e = cVar;
            return this;
        }

        /* renamed from: B */
        public C1464b mo6663B(int i, AbstractC1451c cVar) {
            return mo6664C(C1459h.m7181a(i)).mo6666E(cVar);
        }

        /* renamed from: C */
        public C1464b mo6664C(C1452d dVar) {
            this.f6181b = dVar;
            float n = m7225n(dVar);
            if (n != -1.0f) {
                mo6665D(n);
            }
            return this;
        }

        /* renamed from: D */
        public C1464b mo6665D(float f) {
            this.f6185f = new C1449a(f);
            return this;
        }

        /* renamed from: E */
        public C1464b mo6666E(AbstractC1451c cVar) {
            this.f6185f = cVar;
            return this;
        }

        /* renamed from: m */
        public C1462k mo6667m() {
            return new C1462k(this);
        }

        /* renamed from: o */
        public C1464b mo6668o(float f) {
            return mo6679z(f).mo6665D(f).mo6675v(f).mo6671r(f);
        }

        /* renamed from: p */
        public C1464b mo6669p(int i, AbstractC1451c cVar) {
            return mo6670q(C1459h.m7181a(i)).mo6672s(cVar);
        }

        /* renamed from: q */
        public C1464b mo6670q(C1452d dVar) {
            this.f6183d = dVar;
            float n = m7225n(dVar);
            if (n != -1.0f) {
                mo6671r(n);
            }
            return this;
        }

        /* renamed from: r */
        public C1464b mo6671r(float f) {
            this.f6187h = new C1449a(f);
            return this;
        }

        /* renamed from: s */
        public C1464b mo6672s(AbstractC1451c cVar) {
            this.f6187h = cVar;
            return this;
        }

        /* renamed from: t */
        public C1464b mo6673t(int i, AbstractC1451c cVar) {
            return mo6674u(C1459h.m7181a(i)).mo6676w(cVar);
        }

        /* renamed from: u */
        public C1464b mo6674u(C1452d dVar) {
            this.f6182c = dVar;
            float n = m7225n(dVar);
            if (n != -1.0f) {
                mo6675v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C1464b mo6675v(float f) {
            this.f6186g = new C1449a(f);
            return this;
        }

        /* renamed from: w */
        public C1464b mo6676w(AbstractC1451c cVar) {
            this.f6186g = cVar;
            return this;
        }

        /* renamed from: x */
        public C1464b mo6677x(int i, AbstractC1451c cVar) {
            return mo6678y(C1459h.m7181a(i)).mo6662A(cVar);
        }

        /* renamed from: y */
        public C1464b mo6678y(C1452d dVar) {
            this.f6180a = dVar;
            float n = m7225n(dVar);
            if (n != -1.0f) {
                mo6679z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C1464b mo6679z(float f) {
            this.f6184e = new C1449a(f);
            return this;
        }
    }

    /* renamed from: c.b.a.b.z.k$c */
    public interface AbstractC1465c {
        /* renamed from: a */
        AbstractC1451c mo6641a(AbstractC1451c cVar);
    }

    public C1462k() {
        this.f6168b = C1459h.m7182b();
        this.f6169c = C1459h.m7182b();
        this.f6170d = C1459h.m7182b();
        this.f6171e = C1459h.m7182b();
        this.f6172f = new C1449a(0.0f);
        this.f6173g = new C1449a(0.0f);
        this.f6174h = new C1449a(0.0f);
        this.f6175i = new C1449a(0.0f);
        this.f6176j = C1459h.m7183c();
        this.f6177k = C1459h.m7183c();
        this.f6178l = C1459h.m7183c();
        this.f6179m = C1459h.m7183c();
    }

    private C1462k(C1464b bVar) {
        this.f6168b = bVar.f6180a;
        this.f6169c = bVar.f6181b;
        this.f6170d = bVar.f6182c;
        this.f6171e = bVar.f6183d;
        this.f6172f = bVar.f6184e;
        this.f6173g = bVar.f6185f;
        this.f6174h = bVar.f6186g;
        this.f6175i = bVar.f6187h;
        this.f6176j = bVar.f6188i;
        this.f6177k = bVar.f6189j;
        this.f6178l = bVar.f6190k;
        this.f6179m = bVar.f6191l;
    }

    /* renamed from: a */
    public static C1464b m7189a() {
        return new C1464b();
    }

    /* renamed from: b */
    public static C1464b m7190b(Context context, int i, int i2) {
        return m7191c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C1464b m7191c(Context context, int i, int i2, int i3) {
        return m7192d(context, i, i2, new C1449a((float) i3));
    }

    /* renamed from: d */
    private static C1464b m7192d(Context context, int i, int i2, AbstractC1451c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1400k.f5871f3);
        try {
            int i3 = obtainStyledAttributes.getInt(C1400k.f5878g3, 0);
            int i4 = obtainStyledAttributes.getInt(C1400k.f5899j3, i3);
            int i5 = obtainStyledAttributes.getInt(C1400k.f5906k3, i3);
            int i6 = obtainStyledAttributes.getInt(C1400k.f5892i3, i3);
            int i7 = obtainStyledAttributes.getInt(C1400k.f5885h3, i3);
            AbstractC1451c m = m7196m(obtainStyledAttributes, C1400k.f5913l3, cVar);
            AbstractC1451c m2 = m7196m(obtainStyledAttributes, C1400k.f5934o3, m);
            AbstractC1451c m3 = m7196m(obtainStyledAttributes, C1400k.f5941p3, m);
            AbstractC1451c m4 = m7196m(obtainStyledAttributes, C1400k.f5927n3, m);
            return new C1464b().mo6677x(i4, m2).mo6663B(i5, m3).mo6673t(i6, m4).mo6669p(i7, m7196m(obtainStyledAttributes, C1400k.f5920m3, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C1464b m7193e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m7194f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C1464b m7194f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m7195g(context, attributeSet, i, i2, new C1449a((float) i3));
    }

    /* renamed from: g */
    public static C1464b m7195g(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1451c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5919m2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1400k.f5926n2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C1400k.f5933o2, 0);
        obtainStyledAttributes.recycle();
        return m7192d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static AbstractC1451c m7196m(TypedArray typedArray, int i, AbstractC1451c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C1449a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C1460i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C1454f mo6646h() {
        return this.f6178l;
    }

    /* renamed from: i */
    public C1452d mo6647i() {
        return this.f6171e;
    }

    /* renamed from: j */
    public AbstractC1451c mo6648j() {
        return this.f6175i;
    }

    /* renamed from: k */
    public C1452d mo6649k() {
        return this.f6170d;
    }

    /* renamed from: l */
    public AbstractC1451c mo6650l() {
        return this.f6174h;
    }

    /* renamed from: n */
    public C1454f mo6651n() {
        return this.f6179m;
    }

    /* renamed from: o */
    public C1454f mo6652o() {
        return this.f6177k;
    }

    /* renamed from: p */
    public C1454f mo6653p() {
        return this.f6176j;
    }

    /* renamed from: q */
    public C1452d mo6654q() {
        return this.f6168b;
    }

    /* renamed from: r */
    public AbstractC1451c mo6655r() {
        return this.f6172f;
    }

    /* renamed from: s */
    public C1452d mo6656s() {
        return this.f6169c;
    }

    /* renamed from: t */
    public AbstractC1451c mo6657t() {
        return this.f6173g;
    }

    /* renamed from: u */
    public boolean mo6658u(RectF rectF) {
        boolean z = this.f6179m.getClass().equals(C1454f.class) && this.f6177k.getClass().equals(C1454f.class) && this.f6176j.getClass().equals(C1454f.class) && this.f6178l.getClass().equals(C1454f.class);
        float a = this.f6172f.mo6586a(rectF);
        return z && ((this.f6173g.mo6586a(rectF) > a ? 1 : (this.f6173g.mo6586a(rectF) == a ? 0 : -1)) == 0 && (this.f6175i.mo6586a(rectF) > a ? 1 : (this.f6175i.mo6586a(rectF) == a ? 0 : -1)) == 0 && (this.f6174h.mo6586a(rectF) > a ? 1 : (this.f6174h.mo6586a(rectF) == a ? 0 : -1)) == 0) && ((this.f6169c instanceof C1461j) && (this.f6168b instanceof C1461j) && (this.f6170d instanceof C1461j) && (this.f6171e instanceof C1461j));
    }

    /* renamed from: v */
    public C1464b mo6659v() {
        return new C1464b(this);
    }

    /* renamed from: w */
    public C1462k mo6660w(float f) {
        return mo6659v().mo6668o(f).mo6667m();
    }

    /* renamed from: x */
    public C1462k mo6661x(AbstractC1465c cVar) {
        return mo6659v().mo6662A(cVar.mo6641a(mo6655r())).mo6666E(cVar.mo6641a(mo6657t())).mo6672s(cVar.mo6641a(mo6648j())).mo6676w(cVar.mo6641a(mo6650l())).mo6667m();
    }
}
