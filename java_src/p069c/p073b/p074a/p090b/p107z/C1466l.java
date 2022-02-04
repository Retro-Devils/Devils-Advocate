package p069c.p073b.p074a.p090b.p107z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: c.b.a.b.z.l */
public class C1466l {

    /* renamed from: a */
    private final C1469m[] f6192a = new C1469m[4];

    /* renamed from: b */
    private final Matrix[] f6193b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f6194c = new Matrix[4];

    /* renamed from: d */
    private final PointF f6195d = new PointF();

    /* renamed from: e */
    private final Path f6196e = new Path();

    /* renamed from: f */
    private final Path f6197f = new Path();

    /* renamed from: g */
    private final C1469m f6198g = new C1469m();

    /* renamed from: h */
    private final float[] f6199h = new float[2];

    /* renamed from: i */
    private final float[] f6200i = new float[2];

    /* renamed from: j */
    private boolean f6201j = true;

    /* renamed from: c.b.a.b.z.l$a */
    public interface AbstractC1467a {
        /* renamed from: a */
        void mo6639a(C1469m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo6640b(C1469m mVar, Matrix matrix, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.z.l$b */
    public static final class C1468b {

        /* renamed from: a */
        public final C1462k f6202a;

        /* renamed from: b */
        public final Path f6203b;

        /* renamed from: c */
        public final RectF f6204c;

        /* renamed from: d */
        public final AbstractC1467a f6205d;

        /* renamed from: e */
        public final float f6206e;

        C1468b(C1462k kVar, float f, RectF rectF, AbstractC1467a aVar, Path path) {
            this.f6205d = aVar;
            this.f6202a = kVar;
            this.f6206e = f;
            this.f6204c = rectF;
            this.f6203b = path;
        }
    }

    public C1466l() {
        for (int i = 0; i < 4; i++) {
            this.f6192a[i] = new C1469m();
            this.f6193b[i] = new Matrix();
            this.f6194c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m7245a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m7246b(C1468b bVar, int i) {
        this.f6199h[0] = this.f6192a[i].mo6688k();
        this.f6199h[1] = this.f6192a[i].mo6689l();
        this.f6193b[i].mapPoints(this.f6199h);
        Path path = bVar.f6203b;
        float[] fArr = this.f6199h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f6192a[i].mo6683d(this.f6193b[i], bVar.f6203b);
        AbstractC1467a aVar = bVar.f6205d;
        if (aVar != null) {
            aVar.mo6640b(this.f6192a[i], this.f6193b[i], i);
        }
    }

    /* renamed from: c */
    private void m7247c(C1468b bVar, int i) {
        Path path;
        Matrix matrix;
        C1469m mVar;
        int i2 = (i + 1) % 4;
        this.f6199h[0] = this.f6192a[i].mo6686i();
        this.f6199h[1] = this.f6192a[i].mo6687j();
        this.f6193b[i].mapPoints(this.f6199h);
        this.f6200i[0] = this.f6192a[i2].mo6688k();
        this.f6200i[1] = this.f6192a[i2].mo6689l();
        this.f6193b[i2].mapPoints(this.f6200i);
        float[] fArr = this.f6199h;
        float f = fArr[0];
        float[] fArr2 = this.f6200i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m7251i(bVar.f6204c, i);
        this.f6198g.mo6691n(0.0f, 0.0f);
        C1454f j = m7252j(i, bVar.f6202a);
        j.mo6594b(max, i3, bVar.f6206e, this.f6198g);
        Path path2 = new Path();
        this.f6198g.mo6683d(this.f6194c[i], path2);
        if (!this.f6201j || Build.VERSION.SDK_INT < 19 || (!j.mo6593a() && !m7253k(path2, i) && !m7253k(path2, i2))) {
            mVar = this.f6198g;
            matrix = this.f6194c[i];
            path = bVar.f6203b;
        } else {
            path2.op(path2, this.f6197f, Path.Op.DIFFERENCE);
            this.f6199h[0] = this.f6198g.mo6688k();
            this.f6199h[1] = this.f6198g.mo6689l();
            this.f6194c[i].mapPoints(this.f6199h);
            Path path3 = this.f6196e;
            float[] fArr3 = this.f6199h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f6198g;
            matrix = this.f6194c[i];
            path = this.f6196e;
        }
        mVar.mo6683d(matrix, path);
        AbstractC1467a aVar = bVar.f6205d;
        if (aVar != null) {
            aVar.mo6639a(this.f6198g, this.f6194c[i], i);
        }
    }

    /* renamed from: f */
    private void m7248f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        if (i == 1) {
            f = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: g */
    private AbstractC1451c m7249g(int i, C1462k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo6657t() : kVar.mo6655r() : kVar.mo6648j() : kVar.mo6650l();
    }

    /* renamed from: h */
    private C1452d m7250h(int i, C1462k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo6656s() : kVar.mo6654q() : kVar.mo6647i() : kVar.mo6649k();
    }

    /* renamed from: i */
    private float m7251i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f6199h;
        C1469m[] mVarArr = this.f6192a;
        fArr[0] = mVarArr[i].f6209c;
        fArr[1] = mVarArr[i].f6210d;
        this.f6193b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f6199h[0];
        } else {
            centerX = rectF.centerY();
            f = this.f6199h[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    private C1454f m7252j(int i, C1462k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo6652o() : kVar.mo6653p() : kVar.mo6651n() : kVar.mo6646h();
    }

    /* renamed from: k */
    private boolean m7253k(Path path, int i) {
        Path path2 = new Path();
        this.f6192a[i].mo6683d(this.f6193b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: l */
    private void m7254l(C1468b bVar, int i) {
        m7250h(i, bVar.f6202a).mo6592b(this.f6192a[i], 90.0f, bVar.f6206e, bVar.f6204c, m7249g(i, bVar.f6202a));
        float a = m7245a(i);
        this.f6193b[i].reset();
        m7248f(i, bVar.f6204c, this.f6195d);
        Matrix matrix = this.f6193b[i];
        PointF pointF = this.f6195d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f6193b[i].preRotate(a);
    }

    /* renamed from: m */
    private void m7255m(int i) {
        this.f6199h[0] = this.f6192a[i].mo6686i();
        this.f6199h[1] = this.f6192a[i].mo6687j();
        this.f6193b[i].mapPoints(this.f6199h);
        float a = m7245a(i);
        this.f6194c[i].reset();
        Matrix matrix = this.f6194c[i];
        float[] fArr = this.f6199h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f6194c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo6680d(C1462k kVar, float f, RectF rectF, Path path) {
        mo6681e(kVar, f, rectF, null, path);
    }

    /* renamed from: e */
    public void mo6681e(C1462k kVar, float f, RectF rectF, AbstractC1467a aVar, Path path) {
        path.rewind();
        this.f6196e.rewind();
        this.f6197f.rewind();
        this.f6197f.addRect(rectF, Path.Direction.CW);
        C1468b bVar = new C1468b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m7254l(bVar, i);
            m7255m(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m7246b(bVar, i2);
            m7247c(bVar, i2);
        }
        path.close();
        this.f6196e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f6196e.isEmpty()) {
            path.op(this.f6196e, Path.Op.UNION);
        }
    }
}
