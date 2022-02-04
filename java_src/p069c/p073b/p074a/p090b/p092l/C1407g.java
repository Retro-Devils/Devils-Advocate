package p069c.p073b.p074a.p090b.p092l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: c.b.a.b.l.g */
public class C1407g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f6016a = new float[9];

    /* renamed from: b */
    private final float[] f6017b = new float[9];

    /* renamed from: c */
    private final Matrix f6018c = new Matrix();

    /* renamed from: a */
    public Matrix mo6462a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f6016a);
        matrix2.getValues(this.f6017b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f6017b;
            float f2 = fArr[i];
            float[] fArr2 = this.f6016a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f6018c.setValues(this.f6017b);
        return this.f6018c;
    }
}
