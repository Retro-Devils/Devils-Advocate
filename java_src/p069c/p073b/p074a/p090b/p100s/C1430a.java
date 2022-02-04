package p069c.p073b.p074a.p090b.p100s;

import android.content.Context;
import android.graphics.Color;
import p006b.p030g.p031d.C0901a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.p098q.C1428a;
import p069c.p073b.p074a.p090b.p104w.C1436b;

/* renamed from: c.b.a.b.s.a */
public class C1430a {

    /* renamed from: a */
    private final boolean f6061a;

    /* renamed from: b */
    private final int f6062b;

    /* renamed from: c */
    private final int f6063c;

    /* renamed from: d */
    private final float f6064d;

    public C1430a(Context context) {
        this.f6061a = C1436b.m7074b(context, C1391b.elevationOverlayEnabled, false);
        this.f6062b = C1428a.m7050a(context, C1391b.elevationOverlayColor, 0);
        this.f6063c = C1428a.m7050a(context, C1391b.colorSurface, 0);
        this.f6064d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m7058e(int i) {
        return C0901a.m5300h(i, 255) == this.f6063c;
    }

    /* renamed from: a */
    public float mo6548a(float f) {
        float f2 = this.f6064d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo6549b(int i, float f) {
        float a = mo6548a(f);
        return C0901a.m5300h(C1428a.m7055f(C0901a.m5300h(i, 255), this.f6062b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo6550c(int i, float f) {
        return (!this.f6061a || !m7058e(i)) ? i : mo6549b(i, f);
    }

    /* renamed from: d */
    public boolean mo6551d() {
        return this.f6061a;
    }
}
