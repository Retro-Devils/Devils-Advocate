package p069c.p073b.p074a.p090b.p107z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.b.a.b.z.i */
public final class C1460i implements AbstractC1451c {

    /* renamed from: a */
    private final float f6173a;

    public C1460i(float f) {
        this.f6173a = f;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1451c
    /* renamed from: a */
    public float mo6586a(RectF rectF) {
        return this.f6173a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1460i) && this.f6173a == ((C1460i) obj).f6173a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6173a)});
    }
}
