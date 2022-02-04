package p006b.p050l.p051a.p052a;

import android.view.animation.Interpolator;

/* renamed from: b.l.a.a.d  reason: invalid class name */
abstract class AbstractanimationInterpolatorC1068d implements Interpolator {

    /* renamed from: a */
    private final float[] f4919a;

    /* renamed from: b */
    private final float f4920b;

    protected AbstractanimationInterpolatorC1068d(float[] fArr) {
        this.f4919a = fArr;
        this.f4920b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4919a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f4920b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f4919a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
