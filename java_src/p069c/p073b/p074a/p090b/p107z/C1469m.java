package p069c.p073b.p074a.p090b.p107z;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p069c.p073b.p074a.p090b.p106y.C1447a;

/* renamed from: c.b.a.b.z.m */
public class C1469m {
    @Deprecated

    /* renamed from: a */
    public float f6215a;
    @Deprecated

    /* renamed from: b */
    public float f6216b;
    @Deprecated

    /* renamed from: c */
    public float f6217c;
    @Deprecated

    /* renamed from: d */
    public float f6218d;
    @Deprecated

    /* renamed from: e */
    public float f6219e;
    @Deprecated

    /* renamed from: f */
    public float f6220f;

    /* renamed from: g */
    private final List<AbstractC1475f> f6221g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC1476g> f6222h = new ArrayList();

    /* renamed from: i */
    private boolean f6223i;

    /* renamed from: c.b.a.b.z.m$a */
    class C1470a extends AbstractC1476g {

        /* renamed from: b */
        final /* synthetic */ List f6224b;

        /* renamed from: c */
        final /* synthetic */ Matrix f6225c;

        C1470a(List list, Matrix matrix) {
            this.f6224b = list;
            this.f6225c = matrix;
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1469m.AbstractC1476g
        /* renamed from: a */
        public void mo6693a(Matrix matrix, C1447a aVar, int i, Canvas canvas) {
            for (AbstractC1476g gVar : this.f6224b) {
                gVar.mo6693a(this.f6225c, aVar, i, canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.z.m$b */
    public static class C1471b extends AbstractC1476g {

        /* renamed from: b */
        private final C1473d f6227b;

        public C1471b(C1473d dVar) {
            this.f6227b = dVar;
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1469m.AbstractC1476g
        /* renamed from: a */
        public void mo6693a(Matrix matrix, C1447a aVar, int i, Canvas canvas) {
            aVar.mo6579a(canvas, matrix, new RectF(this.f6227b.m7294k(), this.f6227b.m7298o(), this.f6227b.m7295l(), this.f6227b.m7293j()), i, this.f6227b.m7296m(), this.f6227b.m7297n());
        }
    }

    /* renamed from: c.b.a.b.z.m$c */
    static class C1472c extends AbstractC1476g {

        /* renamed from: b */
        private final C1474e f6228b;

        /* renamed from: c */
        private final float f6229c;

        /* renamed from: d */
        private final float f6230d;

        public C1472c(C1474e eVar, float f, float f2) {
            this.f6228b = eVar;
            this.f6229c = f;
            this.f6230d = f2;
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1469m.AbstractC1476g
        /* renamed from: a */
        public void mo6693a(Matrix matrix, C1447a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f6228b.f6239c - this.f6230d), (double) (this.f6228b.f6238b - this.f6229c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f6229c, this.f6230d);
            matrix2.preRotate(mo6694c());
            aVar.mo6580b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo6694c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f6228b.f6239c - this.f6230d) / (this.f6228b.f6238b - this.f6229c))));
        }
    }

    /* renamed from: c.b.a.b.z.m$d */
    public static class C1473d extends AbstractC1475f {

        /* renamed from: b */
        private static final RectF f6231b = new RectF();
        @Deprecated

        /* renamed from: c */
        public float f6232c;
        @Deprecated

        /* renamed from: d */
        public float f6233d;
        @Deprecated

        /* renamed from: e */
        public float f6234e;
        @Deprecated

        /* renamed from: f */
        public float f6235f;
        @Deprecated

        /* renamed from: g */
        public float f6236g;
        @Deprecated

        /* renamed from: h */
        public float f6237h;

        public C1473d(float f, float f2, float f3, float f4) {
            m7300q(f);
            m7304u(f2);
            m7301r(f3);
            m7299p(f4);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: j */
        private float m7293j() {
            return this.f6235f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: k */
        private float m7294k() {
            return this.f6232c;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: l */
        private float m7295l() {
            return this.f6234e;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: m */
        private float m7296m() {
            return this.f6236g;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: n */
        private float m7297n() {
            return this.f6237h;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: o */
        private float m7298o() {
            return this.f6233d;
        }

        /* renamed from: p */
        private void m7299p(float f) {
            this.f6235f = f;
        }

        /* renamed from: q */
        private void m7300q(float f) {
            this.f6232c = f;
        }

        /* renamed from: r */
        private void m7301r(float f) {
            this.f6234e = f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: s */
        private void m7302s(float f) {
            this.f6236g = f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: t */
        private void m7303t(float f) {
            this.f6237h = f;
        }

        /* renamed from: u */
        private void m7304u(float f) {
            this.f6233d = f;
        }

        @Override // p069c.p073b.p074a.p090b.p107z.C1469m.AbstractC1475f
        /* renamed from: a */
        public void mo6695a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6240a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f6231b;
            rectF.set(m7294k(), m7298o(), m7295l(), m7293j());
            path.arcTo(rectF, m7296m(), m7297n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: c.b.a.b.z.m$e */
    public static class C1474e extends AbstractC1475f {

        /* renamed from: b */
        private float f6238b;

        /* renamed from: c */
        private float f6239c;

        @Override // p069c.p073b.p074a.p090b.p107z.C1469m.AbstractC1475f
        /* renamed from: a */
        public void mo6695a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6240a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f6238b, this.f6239c);
            path.transform(matrix);
        }
    }

    /* renamed from: c.b.a.b.z.m$f */
    public static abstract class AbstractC1475f {

        /* renamed from: a */
        protected final Matrix f6240a = new Matrix();

        /* renamed from: a */
        public abstract void mo6695a(Matrix matrix, Path path);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.z.m$g */
    public static abstract class AbstractC1476g {

        /* renamed from: a */
        static final Matrix f6241a = new Matrix();

        AbstractC1476g() {
        }

        /* renamed from: a */
        public abstract void mo6693a(Matrix matrix, C1447a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo6696b(C1447a aVar, int i, Canvas canvas) {
            mo6693a(f6241a, aVar, i, canvas);
        }
    }

    public C1469m() {
        mo6691n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m7260b(float f) {
        if (m7262g() != f) {
            float g = ((f - m7262g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C1473d dVar = new C1473d(mo6686i(), mo6687j(), mo6686i(), mo6687j());
                dVar.m7302s(m7262g());
                dVar.m7303t(g);
                this.f6222h.add(new C1471b(dVar));
                m7264p(f);
            }
        }
    }

    /* renamed from: c */
    private void m7261c(AbstractC1476g gVar, float f, float f2) {
        m7260b(f);
        this.f6222h.add(gVar);
        m7264p(f2);
    }

    /* renamed from: g */
    private float m7262g() {
        return this.f6219e;
    }

    /* renamed from: h */
    private float m7263h() {
        return this.f6220f;
    }

    /* renamed from: p */
    private void m7264p(float f) {
        this.f6219e = f;
    }

    /* renamed from: q */
    private void m7265q(float f) {
        this.f6220f = f;
    }

    /* renamed from: r */
    private void m7266r(float f) {
        this.f6217c = f;
    }

    /* renamed from: s */
    private void m7267s(float f) {
        this.f6218d = f;
    }

    /* renamed from: t */
    private void m7268t(float f) {
        this.f6215a = f;
    }

    /* renamed from: u */
    private void m7269u(float f) {
        this.f6216b = f;
    }

    /* renamed from: a */
    public void mo6682a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1473d dVar = new C1473d(f, f2, f3, f4);
        dVar.m7302s(f5);
        dVar.m7303t(f6);
        this.f6221g.add(dVar);
        C1471b bVar = new C1471b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m7261c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m7266r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m7267s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo6683d(Matrix matrix, Path path) {
        int size = this.f6221g.size();
        for (int i = 0; i < size; i++) {
            this.f6221g.get(i).mo6695a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo6684e() {
        return this.f6223i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC1476g mo6685f(Matrix matrix) {
        m7260b(m7263h());
        return new C1470a(new ArrayList(this.f6222h), matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo6686i() {
        return this.f6217c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo6687j() {
        return this.f6218d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo6688k() {
        return this.f6215a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo6689l() {
        return this.f6216b;
    }

    /* renamed from: m */
    public void mo6690m(float f, float f2) {
        C1474e eVar = new C1474e();
        eVar.f6238b = f;
        eVar.f6239c = f2;
        this.f6221g.add(eVar);
        C1472c cVar = new C1472c(eVar, mo6686i(), mo6687j());
        m7261c(cVar, cVar.mo6694c() + 270.0f, cVar.mo6694c() + 270.0f);
        m7266r(f);
        m7267s(f2);
    }

    /* renamed from: n */
    public void mo6691n(float f, float f2) {
        mo6692o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo6692o(float f, float f2, float f3, float f4) {
        m7268t(f);
        m7269u(f2);
        m7266r(f);
        m7267s(f2);
        m7264p(f3);
        m7265q((f3 + f4) % 360.0f);
        this.f6221g.clear();
        this.f6222h.clear();
        this.f6223i = false;
    }
}
