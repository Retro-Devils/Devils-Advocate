package com.google.android.material.bottomappbar;

import p069c.p073b.p074a.p090b.p107z.C1454f;
import p069c.p073b.p074a.p090b.p107z.C1469m;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C3077a extends C1454f implements Cloneable {

    /* renamed from: b */
    private float f10172b;

    /* renamed from: c */
    private float f10173c;

    /* renamed from: d */
    private float f10174d;

    /* renamed from: e */
    private float f10175e;

    /* renamed from: f */
    private float f10176f;

    @Override // p069c.p073b.p074a.p090b.p107z.C1454f
    /* renamed from: b */
    public void mo6594b(float f, float f2, float f3, C1469m mVar) {
        float f4 = this.f10174d;
        if (f4 == 0.0f) {
            mVar.mo6690m(f, 0.0f);
            return;
        }
        float f5 = ((this.f10173c * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f10172b;
        float f7 = f2 + this.f10176f;
        float f8 = (this.f10175e * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            mVar.mo6690m(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        mVar.mo6690m(f11, 0.0f);
        float f14 = f6 * 2.0f;
        mVar.mo6682a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        mVar.mo6682a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        mVar.mo6682a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        mVar.mo6690m(f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo9966c() {
        return this.f10175e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo9967d() {
        return this.f10173c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo9968e() {
        return this.f10172b;
    }

    /* renamed from: f */
    public float mo9969f() {
        return this.f10174d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9970g(float f) {
        if (f >= 0.0f) {
            this.f10175e = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9971h(float f) {
        this.f10173c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9972i(float f) {
        this.f10172b = f;
    }

    /* renamed from: j */
    public void mo9973j(float f) {
        this.f10174d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9974k(float f) {
        this.f10176f = f;
    }
}
