package p069c.p073b.p074a.p090b.p106y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p006b.p030g.p031d.C0901a;

/* renamed from: c.b.a.b.y.a */
public class C1447a {

    /* renamed from: a */
    private static final int[] f6108a = new int[3];

    /* renamed from: b */
    private static final float[] f6109b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c */
    private static final int[] f6110c = new int[4];

    /* renamed from: d */
    private static final float[] f6111d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private final Paint f6112e;

    /* renamed from: f */
    private final Paint f6113f;

    /* renamed from: g */
    private final Paint f6114g;

    /* renamed from: h */
    private int f6115h;

    /* renamed from: i */
    private int f6116i;

    /* renamed from: j */
    private int f6117j;

    /* renamed from: k */
    private final Path f6118k;

    /* renamed from: l */
    private Paint f6119l;

    public C1447a() {
        this(-16777216);
    }

    public C1447a(int i) {
        this.f6118k = new Path();
        this.f6119l = new Paint();
        this.f6112e = new Paint();
        mo6582d(i);
        this.f6119l.setColor(0);
        Paint paint = new Paint(4);
        this.f6113f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6114g = new Paint(paint);
    }

    /* renamed from: a */
    public void mo6579a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f6118k;
        if (z) {
            int[] iArr = f6110c;
            iArr[0] = 0;
            iArr[1] = this.f6117j;
            iArr[2] = this.f6116i;
            iArr[3] = this.f6115h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i);
            rectF.inset(f3, f3);
            int[] iArr2 = f6110c;
            iArr2[0] = 0;
            iArr2[1] = this.f6115h;
            iArr2[2] = this.f6116i;
            iArr2[3] = this.f6117j;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i) / width);
            float[] fArr = f6111d;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            this.f6113f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f6110c, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, this.f6119l);
            }
            canvas.drawArc(rectF, f, f2, true, this.f6113f);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo6580b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f6108a;
        iArr[0] = this.f6117j;
        iArr[1] = this.f6116i;
        iArr[2] = this.f6115h;
        Paint paint = this.f6114g;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f6109b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f6114g);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo6581c() {
        return this.f6112e;
    }

    /* renamed from: d */
    public void mo6582d(int i) {
        this.f6115h = C0901a.m5300h(i, 68);
        this.f6116i = C0901a.m5300h(i, 20);
        this.f6117j = C0901a.m5300h(i, 0);
        this.f6112e.setColor(this.f6115h);
    }
}
