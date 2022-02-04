package p069c.p073b.p074a.p090b.p107z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.b.a.b.z.a */
public final class C1449a implements AbstractC1451c {

    /* renamed from: a */
    private final float f6112a;

    public C1449a(float f) {
        this.f6112a = f;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1451c
    /* renamed from: a */
    public float mo6586a(RectF rectF) {
        return this.f6112a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1449a) && this.f6112a == ((C1449a) obj).f6112a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6112a)});
    }
}
