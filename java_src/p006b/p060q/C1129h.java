package p006b.p060q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
/* renamed from: b.q.h */
public class C1129h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f5090a;

    /* renamed from: b */
    private final PathMeasure f5091b;

    /* renamed from: c */
    private final float f5092c;

    /* renamed from: d */
    private final float[] f5093d = new float[2];

    /* renamed from: e */
    private final PointF f5094e = new PointF();

    /* renamed from: f */
    private float f5095f;

    C1129h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5090a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5091b = pathMeasure;
        this.f5092c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f5095f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f5095f = f.floatValue();
        this.f5091b.getPosTan(this.f5092c * f.floatValue(), this.f5093d, null);
        PointF pointF = this.f5094e;
        float[] fArr = this.f5093d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f5090a.set(t, pointF);
    }
}
