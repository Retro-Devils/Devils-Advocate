package p006b.p022e.p026b.p027k;

import java.util.Arrays;

/* renamed from: b.e.b.k.i */
public class C0871i extends C0864e implements AbstractC0870h {

    /* renamed from: w0 */
    public C0864e[] f4377w0 = new C0864e[4];

    /* renamed from: x0 */
    public int f4378x0 = 0;

    @Override // p006b.p022e.p026b.p027k.AbstractC0870h
    /* renamed from: a */
    public void mo5255a(C0864e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f4378x0 + 1;
            C0864e[] eVarArr = this.f4377w0;
            if (i > eVarArr.length) {
                this.f4377w0 = (C0864e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C0864e[] eVarArr2 = this.f4377w0;
            int i2 = this.f4378x0;
            eVarArr2[i2] = eVar;
            this.f4378x0 = i2 + 1;
        }
    }

    @Override // p006b.p022e.p026b.p027k.AbstractC0870h
    /* renamed from: b */
    public void mo5256b(C0867f fVar) {
    }

    @Override // p006b.p022e.p026b.p027k.AbstractC0870h
    /* renamed from: c */
    public void mo5257c() {
        this.f4378x0 = 0;
        Arrays.fill(this.f4377w0, (Object) null);
    }
}
