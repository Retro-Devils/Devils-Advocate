package p069c.p073b.p074a.p090b.p096p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p069c.p073b.p074a.p090b.p102u.C1432a;

/* renamed from: c.b.a.b.p.d */
public interface AbstractC1421d {

    /* renamed from: c.b.a.b.p.d$b */
    public static class C1423b implements TypeEvaluator<C1426e> {

        /* renamed from: a */
        public static final TypeEvaluator<C1426e> f6053a = new C1423b();

        /* renamed from: b */
        private final C1426e f6054b = new C1426e();

        /* renamed from: a */
        public C1426e evaluate(float f, C1426e eVar, C1426e eVar2) {
            this.f6054b.mo6544a(C1432a.m7066c(eVar.f6057a, eVar2.f6057a, f), C1432a.m7066c(eVar.f6058b, eVar2.f6058b, f), C1432a.m7066c(eVar.f6059c, eVar2.f6059c, f));
            return this.f6054b;
        }
    }

    /* renamed from: c.b.a.b.p.d$c */
    public static class C1424c extends Property<AbstractC1421d, C1426e> {

        /* renamed from: a */
        public static final Property<AbstractC1421d, C1426e> f6055a = new C1424c("circularReveal");

        private C1424c(String str) {
            super(C1426e.class, str);
        }

        /* renamed from: a */
        public C1426e get(AbstractC1421d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(AbstractC1421d dVar, C1426e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: c.b.a.b.p.d$d */
    public static class C1425d extends Property<AbstractC1421d, Integer> {

        /* renamed from: a */
        public static final Property<AbstractC1421d, Integer> f6056a = new C1425d("circularRevealScrimColor");

        private C1425d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(AbstractC1421d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(AbstractC1421d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: c.b.a.b.p.d$e */
    public static class C1426e {

        /* renamed from: a */
        public float f6057a;

        /* renamed from: b */
        public float f6058b;

        /* renamed from: c */
        public float f6059c;

        private C1426e() {
        }

        public C1426e(float f, float f2, float f3) {
            this.f6057a = f;
            this.f6058b = f2;
            this.f6059c = f3;
        }

        /* renamed from: a */
        public void mo6544a(float f, float f2, float f3) {
            this.f6057a = f;
            this.f6058b = f2;
            this.f6059c = f3;
        }
    }

    /* renamed from: a */
    void mo6524a();

    /* renamed from: b */
    void mo6525b();

    int getCircularRevealScrimColor();

    C1426e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1426e eVar);
}
