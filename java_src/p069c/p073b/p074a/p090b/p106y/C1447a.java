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
    private static final int[] f6100a = new int[3];

    /* renamed from: b */
    private static final float[] f6101b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c */
    private static final int[] f6102c = new int[4];

    /* renamed from: d */
    private static final float[] f6103d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private final Paint f6104e;

    /* renamed from: f */
    private final Paint f6105f;

    /* renamed from: g */
    private final Paint f6106g;

    /* renamed from: h */
    private int f6107h;

    /* renamed from: i */
    private int f6108i;

    /* renamed from: j */
    private int f6109j;

    /* renamed from: k */
    private final Path f6110k;

    /* renamed from: l */
    private Paint f6111l;

    public C1447a() {
        this(-16777216);
    }

    public C1447a(int i) {
        this.f6110k = new Path();
        this.f6111l = new Paint();
        this.f6104e = new Paint();
        mo6582d(i);
        this.f6111l.setColor(0);
        Paint paint = new Paint(4);
        this.f6105f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6106g = new Paint(paint);
    }

    /* renamed from: a */
    public void mo6579a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f6110k;
        if (z) {
            int[] iArr = f6102c;
            iArr[0] = 0;
            iArr[1] = this.f6109j;
            iArr[2] = this.f6108i;
            iArr[3] = this.f6107h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i);
            rectF.inset(f3, f3);
            int[] iArr2 = f6102c;
            iArr2[0] = 0;
            iArr2[1] = this.f6107h;
            iArr2[2] = this.f6108i;
            iArr2[3] = this.f6109j;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i) / width);
            float[] fArr = f6103d;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            this.f6105f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f6102c, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, this.f6111l);
            }
            canvas.drawArc(rectF, f, f2, true, this.f6105f);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo6580b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f6100a;
        iArr[0] = this.f6109j;
        iArr[1] = this.f6108i;
        iArr[2] = this.f6107h;
        Paint paint = this.f6106g;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f6101b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f6106g);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo6581c() {
        return this.f6104e;
    }

    /* renamed from: d */
    public void mo6582d(int i) {
        this.f6107h = C0901a.m5300h(i, 68);
        this.f6108i = C0901a.m5300h(i, 20);
        this.f6109j = C0901a.m5300h(i, 0);
        this.f6104e.setColor(this.f6107h);
    }
}
