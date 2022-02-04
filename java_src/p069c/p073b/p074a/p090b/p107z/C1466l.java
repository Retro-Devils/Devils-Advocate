package p069c.p073b.p074a.p090b.p107z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: c.b.a.b.z.l */
public class C1466l {

    /* renamed from: a */
    private final C1469m[] f6200a = new C1469m[4];

    /* renamed from: b */
    private final Matrix[] f6201b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f6202c = new Matrix[4];

    /* renamed from: d */
    private final PointF f6203d = new PointF();

    /* renamed from: e */
    private final Path f6204e = new Path();

    /* renamed from: f */
    private final Path f6205f = new Path();

    /* renamed from: g */
    private final C1469m f6206g = new C1469m();

    /* renamed from: h */
    private final float[] f6207h = new float[2];

    /* renamed from: i */
    private final float[] f6208i = new float[2];

    /* renamed from: j */
    private boolean f6209j = true;

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
        public final C1462k f6210a;

        /* renamed from: b */
        public final Path f6211b;

        /* renamed from: c */
        public final RectF f6212c;

        /* renamed from: d */
        public final AbstractC1467a f6213d;

        /* renamed from: e */
        public final float f6214e;

        C1468b(C1462k kVar, float f, RectF rectF, AbstractC1467a aVar, Path path) {
            this.f6213d = aVar;
            this.f6210a = kVar;
            this.f6214e = f;
            this.f6212c = rectF;
            this.f6211b = path;
        }
    }

    public C1466l() {
        for (int i = 0; i < 4; i++) {
            this.f6200a[i] = new C1469m();
            this.f6201b[i] = new Matrix();
            this.f6202c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m7245a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m7246b(C1468b bVar, int i) {
        this.f6207h[0] = this.f6200a[i].mo6688k();
        this.f6207h[1] = this.f6200a[i].mo6689l();
        this.f6201b[i].mapPoints(this.f6207h);
        Path path = bVar.f6211b;
        float[] fArr = this.f6207h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f6200a[i].mo6683d(this.f6201b[i], bVar.f6211b);
        AbstractC1467a aVar = bVar.f6213d;
        if (aVar != null) {
            aVar.mo6640b(this.f6200a[i], this.f6201b[i], i);
        }
    }

    /* renamed from: c */
    private void m7247c(C1468b bVar, int i) {
        Path path;
        Matrix matrix;
        C1469m mVar;
        int i2 = (i + 1) % 4;
        this.f6207h[0] = this.f6200a[i].mo6686i();
        this.f6207h[1] = this.f6200a[i].mo6687j();
        this.f6201b[i].mapPoints(this.f6207h);
        this.f6208i[0] = this.f6200a[i2].mo6688k();
        this.f6208i[1] = this.f6200a[i2].mo6689l();
        this.f6201b[i2].mapPoints(this.f6208i);
        float[] fArr = this.f6207h;
        float f = fArr[0];
        float[] fArr2 = this.f6208i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m7251i(bVar.f6212c, i);
        this.f6206g.mo6691n(0.0f, 0.0f);
        C1454f j = m7252j(i, bVar.f6210a);
        j.mo6594b(max, i3, bVar.f6214e, this.f6206g);
        Path path2 = new Path();
        this.f6206g.mo6683d(this.f6202c[i], path2);
        if (!this.f6209j || Build.VERSION.SDK_INT < 19 || (!j.mo6593a() && !m7253k(path2, i) && !m7253k(path2, i2))) {
            mVar = this.f6206g;
            matrix = this.f6202c[i];
            path = bVar.f6211b;
        } else {
            path2.op(path2, this.f6205f, Path.Op.DIFFERENCE);
            this.f6207h[0] = this.f6206g.mo6688k();
            this.f6207h[1] = this.f6206g.mo6689l();
            this.f6202c[i].mapPoints(this.f6207h);
            Path path3 = this.f6204e;
            float[] fArr3 = this.f6207h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f6206g;
            matrix = this.f6202c[i];
            path = this.f6204e;
        }
        mVar.mo6683d(matrix, path);
        AbstractC1467a aVar = bVar.f6213d;
        if (aVar != null) {
            aVar.mo6639a(this.f6206g, this.f6202c[i], i);
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
        float[] fArr = this.f6207h;
        C1469m[] mVarArr = this.f6200a;
        fArr[0] = mVarArr[i].f6217c;
        fArr[1] = mVarArr[i].f6218d;
        this.f6201b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f6207h[0];
        } else {
            centerX = rectF.centerY();
            f = this.f6207h[1];
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
        this.f6200a[i].mo6683d(this.f6201b[i], path2);
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
        m7250h(i, bVar.f6210a).mo6592b(this.f6200a[i], 90.0f, bVar.f6214e, bVar.f6212c, m7249g(i, bVar.f6210a));
        float a = m7245a(i);
        this.f6201b[i].reset();
        m7248f(i, bVar.f6212c, this.f6203d);
        Matrix matrix = this.f6201b[i];
        PointF pointF = this.f6203d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f6201b[i].preRotate(a);
    }

    /* renamed from: m */
    private void m7255m(int i) {
        this.f6207h[0] = this.f6200a[i].mo6686i();
        this.f6207h[1] = this.f6200a[i].mo6687j();
        this.f6201b[i].mapPoints(this.f6207h);
        float a = m7245a(i);
        this.f6202c[i].reset();
        Matrix matrix = this.f6202c[i];
        float[] fArr = this.f6207h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f6202c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo6680d(C1462k kVar, float f, RectF rectF, Path path) {
        mo6681e(kVar, f, rectF, null, path);
    }

    /* renamed from: e */
    public void mo6681e(C1462k kVar, float f, RectF rectF, AbstractC1467a aVar, Path path) {
        path.rewind();
        this.f6204e.rewind();
        this.f6205f.rewind();
        this.f6205f.addRect(rectF, Path.Direction.CW);
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
        this.f6204e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f6204e.isEmpty()) {
            path.op(this.f6204e, Path.Op.UNION);
        }
    }
}
