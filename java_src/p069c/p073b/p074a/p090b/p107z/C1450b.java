package p069c.p073b.p074a.p090b.p107z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c.b.a.b.z.b */
public final class C1450b implements AbstractC1451c {

    /* renamed from: a */
    private final AbstractC1451c f6121a;

    /* renamed from: b */
    private final float f6122b;

    public C1450b(float f, AbstractC1451c cVar) {
        while (cVar instanceof C1450b) {
            cVar = ((C1450b) cVar).f6121a;
            f += ((C1450b) cVar).f6122b;
        }
        this.f6121a = cVar;
        this.f6122b = f;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1451c
    /* renamed from: a */
    public float mo6586a(RectF rectF) {
        return Math.max(0.0f, this.f6121a.mo6586a(rectF) + this.f6122b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1450b)) {
            return false;
        }
        C1450b bVar = (C1450b) obj;
        return this.f6121a.equals(bVar.f6121a) && this.f6122b == bVar.f6122b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6121a, Float.valueOf(this.f6122b)});
    }
}
