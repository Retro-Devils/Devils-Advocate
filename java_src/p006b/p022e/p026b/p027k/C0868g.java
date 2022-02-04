package p006b.p022e.p026b.p027k;

import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.C0855i;
import p006b.p022e.p026b.p027k.C0861d;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.g */
public class C0868g extends C0864e {

    /* renamed from: A0 */
    private int f4374A0;

    /* renamed from: B0 */
    private int f4375B0;

    /* renamed from: w0 */
    protected float f4376w0 = -1.0f;

    /* renamed from: x0 */
    protected int f4377x0 = -1;

    /* renamed from: y0 */
    protected int f4378y0 = -1;

    /* renamed from: z0 */
    private C0861d f4379z0 = this.f4273D;

    /* renamed from: b.e.b.k.g$a */
    static /* synthetic */ class C0869a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4380a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.C0868g.C0869a.<clinit>():void");
        }
    }

    public C0868g() {
        this.f4374A0 = 0;
        this.f4375B0 = 0;
        this.f4281L.clear();
        this.f4281L.add(this.f4379z0);
        int length = this.f4280K.length;
        for (int i = 0; i < length; i++) {
            this.f4280K[i] = this.f4379z0;
        }
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: G0 */
    public void mo5163G0(C0846d dVar) {
        if (mo5158E() != null) {
            int x = dVar.mo5103x(this.f4379z0);
            if (this.f4374A0 == 1) {
                mo5155C0(x);
                mo5157D0(0);
                mo5187e0(mo5158E().mo5213t());
                mo5153B0(0);
                return;
            }
            mo5155C0(0);
            mo5157D0(x);
            mo5153B0(mo5158E().mo5170N());
            mo5187e0(0);
        }
    }

    /* renamed from: H0 */
    public int mo5247H0() {
        return this.f4374A0;
    }

    /* renamed from: I0 */
    public int mo5248I0() {
        return this.f4377x0;
    }

    /* renamed from: J0 */
    public int mo5249J0() {
        return this.f4378y0;
    }

    /* renamed from: K0 */
    public float mo5250K0() {
        return this.f4376w0;
    }

    /* renamed from: L0 */
    public void mo5251L0(int i) {
        if (i > -1) {
            this.f4376w0 = -1.0f;
            this.f4377x0 = i;
            this.f4378y0 = -1;
        }
    }

    /* renamed from: M0 */
    public void mo5252M0(int i) {
        if (i > -1) {
            this.f4376w0 = -1.0f;
            this.f4377x0 = -1;
            this.f4378y0 = i;
        }
    }

    /* renamed from: N0 */
    public void mo5253N0(float f) {
        if (f > -1.0f) {
            this.f4376w0 = f;
            this.f4377x0 = -1;
            this.f4378y0 = -1;
        }
    }

    /* renamed from: O0 */
    public void mo5254O0(int i) {
        if (this.f4374A0 != i) {
            this.f4374A0 = i;
            this.f4281L.clear();
            this.f4379z0 = this.f4374A0 == 1 ? this.f4272C : this.f4273D;
            this.f4281L.add(this.f4379z0);
            int length = this.f4280K.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f4280K[i2] = this.f4379z0;
            }
        }
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: f */
    public void mo5133f(C0846d dVar) {
        C0867f fVar = (C0867f) mo5158E();
        if (fVar != null) {
            C0861d k = fVar.mo5195k(C0861d.EnumC0863b.LEFT);
            C0861d k2 = fVar.mo5195k(C0861d.EnumC0863b.RIGHT);
            C0864e eVar = this.f4284O;
            boolean z = true;
            boolean z2 = eVar != null && eVar.f4283N[0] == C0864e.EnumC0866b.WRAP_CONTENT;
            if (this.f4374A0 == 0) {
                k = fVar.mo5195k(C0861d.EnumC0863b.TOP);
                k2 = fVar.mo5195k(C0861d.EnumC0863b.BOTTOM);
                C0864e eVar2 = this.f4284O;
                if (eVar2 == null || eVar2.f4283N[1] != C0864e.EnumC0866b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f4377x0 != -1) {
                C0855i q = dVar.mo5099q(this.f4379z0);
                dVar.mo5089e(q, dVar.mo5099q(k), this.f4377x0, 8);
                if (z2) {
                    dVar.mo5092h(dVar.mo5099q(k2), q, 0, 5);
                }
            } else if (this.f4378y0 != -1) {
                C0855i q2 = dVar.mo5099q(this.f4379z0);
                C0855i q3 = dVar.mo5099q(k2);
                dVar.mo5089e(q2, q3, -this.f4378y0, 8);
                if (z2) {
                    dVar.mo5092h(q2, dVar.mo5099q(k), 0, 5);
                    dVar.mo5092h(q3, q2, 0, 5);
                }
            } else if (this.f4376w0 != -1.0f) {
                dVar.mo5088d(C0846d.m4979s(dVar, dVar.mo5099q(this.f4379z0), dVar.mo5099q(k2), this.f4376w0));
            }
        }
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: g */
    public boolean mo5134g() {
        return true;
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: k */
    public C0861d mo5195k(C0861d.EnumC0863b bVar) {
        switch (C0869a.f4380a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f4374A0 == 1) {
                    return this.f4379z0;
                }
                break;
            case 3:
            case 4:
                if (this.f4374A0 == 0) {
                    return this.f4379z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
