package p006b.p022e.p026b.p027k;

import java.util.Arrays;
import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.C0849e;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.p028m.C0876b;
import p006b.p022e.p026b.p027k.p028m.C0881e;

/* renamed from: b.e.b.k.f */
public class C0867f extends C0874l {

    /* renamed from: A0 */
    private boolean f4350A0 = false;

    /* renamed from: B0 */
    public C0849e f4351B0;

    /* renamed from: C0 */
    protected C0846d f4352C0 = new C0846d();

    /* renamed from: D0 */
    int f4353D0;

    /* renamed from: E0 */
    int f4354E0;

    /* renamed from: F0 */
    int f4355F0;

    /* renamed from: G0 */
    int f4356G0;

    /* renamed from: H0 */
    int f4357H0 = 0;

    /* renamed from: I0 */
    int f4358I0 = 0;

    /* renamed from: J0 */
    C0860c[] f4359J0 = new C0860c[4];

    /* renamed from: K0 */
    C0860c[] f4360K0 = new C0860c[4];

    /* renamed from: L0 */
    public boolean f4361L0 = false;

    /* renamed from: M0 */
    public boolean f4362M0 = false;

    /* renamed from: N0 */
    public boolean f4363N0 = false;

    /* renamed from: O0 */
    public int f4364O0 = 0;

    /* renamed from: P0 */
    public int f4365P0 = 0;

    /* renamed from: Q0 */
    private int f4366Q0 = 263;

    /* renamed from: R0 */
    public boolean f4367R0 = false;

    /* renamed from: S0 */
    private boolean f4368S0 = false;

    /* renamed from: T0 */
    private boolean f4369T0 = false;

    /* renamed from: U0 */
    int f4370U0 = 0;

    /* renamed from: x0 */
    C0876b f4371x0 = new C0876b(this);

    /* renamed from: y0 */
    public C0881e f4372y0 = new C0881e(this);

    /* renamed from: z0 */
    protected C0876b.AbstractC0878b f4373z0 = null;

    /* renamed from: M0 */
    private void m5158M0(C0864e eVar) {
        int i = this.f4357H0 + 1;
        C0860c[] cVarArr = this.f4360K0;
        if (i >= cVarArr.length) {
            this.f4360K0 = (C0860c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4360K0[this.f4357H0] = new C0860c(eVar, 0, mo5238W0());
        this.f4357H0++;
    }

    /* renamed from: N0 */
    private void m5159N0(C0864e eVar) {
        int i = this.f4358I0 + 1;
        C0860c[] cVarArr = this.f4359J0;
        if (i >= cVarArr.length) {
            this.f4359J0 = (C0860c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4359J0[this.f4358I0] = new C0860c(eVar, 1, mo5238W0());
        this.f4358I0++;
    }

    /* renamed from: a1 */
    private void m5160a1() {
        this.f4357H0 = 0;
        this.f4358I0 = 0;
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: F0 */
    public void mo5161F0(boolean z, boolean z2) {
        super.mo5161F0(z, z2);
        int size = this.f4397w0.size();
        for (int i = 0; i < size; i++) {
            this.f4397w0.get(i).mo5161F0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // p006b.p022e.p026b.p027k.C0874l
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5227H0() {
        /*
        // Method dump skipped, instructions count: 480
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.C0867f.mo5227H0():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo5228K0(C0864e eVar, int i) {
        if (i == 0) {
            m5158M0(eVar);
        } else if (i == 1) {
            m5159N0(eVar);
        }
    }

    /* renamed from: L0 */
    public boolean mo5229L0(C0846d dVar) {
        mo5133f(dVar);
        int size = this.f4397w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0864e eVar = this.f4397w0.get(i);
            eVar.mo5198l0(0, false);
            eVar.mo5198l0(1, false);
            if (eVar instanceof C0858a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0864e eVar2 = this.f4397w0.get(i2);
                if (eVar2 instanceof C0858a) {
                    ((C0858a) eVar2).mo5129K0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C0864e eVar3 = this.f4397w0.get(i3);
            if (eVar3.mo5186e()) {
                eVar3.mo5133f(dVar);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C0864e eVar4 = this.f4397w0.get(i4);
            if (eVar4 instanceof C0867f) {
                C0864e.EnumC0866b[] bVarArr = eVar4.f4283N;
                C0864e.EnumC0866b bVar = bVarArr[0];
                C0864e.EnumC0866b bVar2 = bVarArr[1];
                C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.mo5192i0(C0864e.EnumC0866b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.mo5222x0(C0864e.EnumC0866b.FIXED);
                }
                eVar4.mo5133f(dVar);
                if (bVar == bVar3) {
                    eVar4.mo5192i0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.mo5222x0(bVar2);
                }
            } else {
                C0872j.m5201a(this, dVar, eVar4);
                if (!eVar4.mo5186e()) {
                    eVar4.mo5133f(dVar);
                }
            }
        }
        if (this.f4357H0 > 0) {
            C0859b.m5059a(this, dVar, 0);
        }
        if (this.f4358I0 > 0) {
            C0859b.m5059a(this, dVar, 1);
        }
        return true;
    }

    /* renamed from: O0 */
    public boolean mo5230O0(boolean z) {
        return this.f4372y0.mo5274f(z);
    }

    /* renamed from: P0 */
    public boolean mo5231P0(boolean z) {
        return this.f4372y0.mo5275g(z);
    }

    /* renamed from: Q0 */
    public boolean mo5232Q0(boolean z, int i) {
        return this.f4372y0.mo5276h(z, i);
    }

    /* renamed from: R0 */
    public C0876b.AbstractC0878b mo5233R0() {
        return this.f4373z0;
    }

    /* renamed from: S0 */
    public int mo5234S0() {
        return this.f4366Q0;
    }

    /* renamed from: T0 */
    public void mo5235T0() {
        this.f4372y0.mo5277j();
    }

    /* renamed from: U0 */
    public void mo5236U0() {
        this.f4372y0.mo5278k();
    }

    /* renamed from: V0 */
    public boolean mo5237V0() {
        return this.f4369T0;
    }

    @Override // p006b.p022e.p026b.p027k.C0874l, p006b.p022e.p026b.p027k.C0864e
    /* renamed from: W */
    public void mo5178W() {
        this.f4352C0.mo5085D();
        this.f4353D0 = 0;
        this.f4355F0 = 0;
        this.f4354E0 = 0;
        this.f4356G0 = 0;
        this.f4367R0 = false;
        super.mo5178W();
    }

    /* renamed from: W0 */
    public boolean mo5238W0() {
        return this.f4350A0;
    }

    /* renamed from: X0 */
    public boolean mo5239X0() {
        return this.f4368S0;
    }

    /* renamed from: Y0 */
    public long mo5240Y0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f4353D0 = i8;
        this.f4354E0 = i9;
        return this.f4371x0.mo5263d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: Z0 */
    public boolean mo5241Z0(int i) {
        return (this.f4366Q0 & i) == i;
    }

    /* renamed from: b1 */
    public void mo5242b1(C0876b.AbstractC0878b bVar) {
        this.f4373z0 = bVar;
        this.f4372y0.mo5280n(bVar);
    }

    /* renamed from: c1 */
    public void mo5243c1(int i) {
        this.f4366Q0 = i;
        C0846d.f4159c = C0872j.m5202b(i, 256);
    }

    /* renamed from: d1 */
    public void mo5244d1(boolean z) {
        this.f4350A0 = z;
    }

    /* renamed from: e1 */
    public void mo5245e1(C0846d dVar, boolean[] zArr) {
        zArr[2] = false;
        mo5163G0(dVar);
        int size = this.f4397w0.size();
        for (int i = 0; i < size; i++) {
            this.f4397w0.get(i).mo5163G0(dVar);
        }
    }

    /* renamed from: f1 */
    public void mo5246f1() {
        this.f4371x0.mo5264e(this);
    }
}
