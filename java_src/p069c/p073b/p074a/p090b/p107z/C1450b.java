package p069c.p073b.p074a.p090b.p107z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.b.a.b.z.b */
public final class C1450b implements AbstractC1451c {

    /* renamed from: a */
    private final AbstractC1451c f6113a;

    /* renamed from: b */
    private final float f6114b;

    public C1450b(float f, AbstractC1451c cVar) {
        while (cVar instanceof C1450b) {
            cVar = ((C1450b) cVar).f6113a;
            f += ((C1450b) cVar).f6114b;
        }
        this.f6113a = cVar;
        this.f6114b = f;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1451c
    /* renamed from: a */
    public float mo6586a(RectF rectF) {
        return Math.max(0.0f, this.f6113a.mo6586a(rectF) + this.f6114b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1450b)) {
            return false;
        }
        C1450b bVar = (C1450b) obj;
        return this.f6113a.equals(bVar.f6113a) && this.f6114b == bVar.f6114b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6113a, Float.valueOf(this.f6114b)});
    }
}
