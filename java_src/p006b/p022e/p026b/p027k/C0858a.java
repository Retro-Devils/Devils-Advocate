package p006b.p022e.p026b.p027k;

import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.C0855i;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.a */
public class C0858a extends C0871i {

    /* renamed from: A0 */
    private int f4222A0 = 0;

    /* renamed from: y0 */
    private int f4223y0 = 0;

    /* renamed from: z0 */
    private boolean f4224z0 = true;

    /* renamed from: H0 */
    public boolean mo5126H0() {
        return this.f4224z0;
    }

    /* renamed from: I0 */
    public int mo5127I0() {
        return this.f4223y0;
    }

    /* renamed from: J0 */
    public int mo5128J0() {
        return this.f4222A0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo5129K0() {
        for (int i = 0; i < this.f4378x0; i++) {
            C0864e eVar = this.f4377w0[i];
            int i2 = this.f4223y0;
            if (i2 == 0 || i2 == 1) {
                eVar.mo5198l0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.mo5198l0(1, true);
            }
        }
    }

    /* renamed from: L0 */
    public void mo5130L0(boolean z) {
        this.f4224z0 = z;
    }

    /* renamed from: M0 */
    public void mo5131M0(int i) {
        this.f4223y0 = i;
    }

    /* renamed from: N0 */
    public void mo5132N0(int i) {
        this.f4222A0 = i;
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: f */
    public void mo5133f(C0846d dVar) {
        Object[] objArr;
        boolean z;
        C0855i iVar;
        C0861d dVar2;
        int i;
        int i2;
        int i3;
        C0861d[] dVarArr = this.f4276K;
        dVarArr[0] = this.f4268C;
        dVarArr[2] = this.f4269D;
        dVarArr[1] = this.f4270E;
        dVarArr[3] = this.f4271F;
        int i4 = 0;
        while (true) {
            objArr = this.f4276K;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].f4253g = dVar.mo5099q(objArr[i4]);
            i4++;
        }
        int i5 = this.f4223y0;
        if (i5 >= 0 && i5 < 4) {
            C0861d dVar3 = objArr[i5];
            int i6 = 0;
            while (true) {
                if (i6 >= this.f4378x0) {
                    z = false;
                    break;
                }
                C0864e eVar = this.f4377w0[i6];
                if ((this.f4224z0 || eVar.mo5134g()) && ((((i2 = this.f4223y0) == 0 || i2 == 1) && eVar.mo5219w() == C0864e.EnumC0866b.MATCH_CONSTRAINT && eVar.f4268C.f4250d != null && eVar.f4270E.f4250d != null) || (((i3 = this.f4223y0) == 2 || i3 == 3) && eVar.mo5167K() == C0864e.EnumC0866b.MATCH_CONSTRAINT && eVar.f4269D.f4250d != null && eVar.f4271F.f4250d != null))) {
                    z = true;
                } else {
                    i6++;
                }
            }
            z = true;
            boolean z2 = this.f4268C.mo5144h() || this.f4270E.mo5144h();
            boolean z3 = this.f4269D.mo5144h() || this.f4271F.mo5144h();
            boolean z4 = !z && (((i = this.f4223y0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))));
            int i7 = 5;
            if (!z4) {
                i7 = 4;
            }
            for (int i8 = 0; i8 < this.f4378x0; i8++) {
                C0864e eVar2 = this.f4377w0[i8];
                if (this.f4224z0 || eVar2.mo5134g()) {
                    C0855i q = dVar.mo5099q(eVar2.f4276K[this.f4223y0]);
                    C0861d[] dVarArr2 = eVar2.f4276K;
                    int i9 = this.f4223y0;
                    dVarArr2[i9].f4253g = q;
                    int i10 = (dVarArr2[i9].f4250d == null || dVarArr2[i9].f4250d.f4248b != this) ? 0 : dVarArr2[i9].f4251e + 0;
                    if (i9 == 0 || i9 == 2) {
                        dVar.mo5093i(dVar3.f4253g, q, this.f4222A0 - i10, z);
                    } else {
                        dVar.mo5091g(dVar3.f4253g, q, this.f4222A0 + i10, z);
                    }
                    dVar.mo5089e(dVar3.f4253g, q, this.f4222A0 + i10, i7);
                }
            }
            int i11 = this.f4223y0;
            if (i11 == 0) {
                dVar.mo5089e(this.f4270E.f4253g, this.f4268C.f4253g, 0, 8);
                dVar.mo5089e(this.f4268C.f4253g, this.f4280O.f4270E.f4253g, 0, 4);
                iVar = this.f4268C.f4253g;
                dVar2 = this.f4280O.f4268C;
            } else if (i11 == 1) {
                dVar.mo5089e(this.f4268C.f4253g, this.f4270E.f4253g, 0, 8);
                dVar.mo5089e(this.f4268C.f4253g, this.f4280O.f4268C.f4253g, 0, 4);
                iVar = this.f4268C.f4253g;
                dVar2 = this.f4280O.f4270E;
            } else if (i11 == 2) {
                dVar.mo5089e(this.f4271F.f4253g, this.f4269D.f4253g, 0, 8);
                dVar.mo5089e(this.f4269D.f4253g, this.f4280O.f4271F.f4253g, 0, 4);
                iVar = this.f4269D.f4253g;
                dVar2 = this.f4280O.f4269D;
            } else if (i11 == 3) {
                dVar.mo5089e(this.f4269D.f4253g, this.f4271F.f4253g, 0, 8);
                dVar.mo5089e(this.f4269D.f4253g, this.f4280O.f4269D.f4253g, 0, 4);
                iVar = this.f4269D.f4253g;
                dVar2 = this.f4280O.f4271F;
            } else {
                return;
            }
            dVar.mo5089e(iVar, dVar2.f4253g, 0, 0);
        }
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: g */
    public boolean mo5134g() {
        return true;
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    public String toString() {
        String str = "[Barrier] " + mo5205p() + " {";
        for (int i = 0; i < this.f4378x0; i++) {
            C0864e eVar = this.f4377w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo5205p();
        }
        return str + "}";
    }
}
