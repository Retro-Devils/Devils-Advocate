package p006b.p060q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
/* renamed from: b.q.h */
public class C1129h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f5097a;

    /* renamed from: b */
    private final PathMeasure f5098b;

    /* renamed from: c */
    private final float f5099c;

    /* renamed from: d */
    private final float[] f5100d = new float[2];

    /* renamed from: e */
    private final PointF f5101e = new PointF();

    /* renamed from: f */
    private float f5102f;

    C1129h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5097a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5098b = pathMeasure;
        this.f5099c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f5102f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f5102f = f.floatValue();
        this.f5098b.getPosTan(this.f5099c * f.floatValue(), this.f5100d, null);
        PointF pointF = this.f5101e;
        float[] fArr = this.f5100d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f5097a.set(t, pointF);
    }
}
