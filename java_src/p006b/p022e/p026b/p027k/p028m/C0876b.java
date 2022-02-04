package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.p027k.AbstractC0870h;
import p006b.p022e.p026b.p027k.C0861d;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.C0867f;
import p006b.p022e.p026b.p027k.C0868g;
import p006b.p022e.p026b.p027k.C0872j;
import p006b.p022e.p026b.p027k.C0873k;

/* renamed from: b.e.b.k.m.b */
public class C0876b {

    /* renamed from: a */
    private final ArrayList<C0864e> f4398a = new ArrayList<>();

    /* renamed from: b */
    private C0877a f4399b = new C0877a();

    /* renamed from: c */
    private C0867f f4400c;

    /* renamed from: b.e.b.k.m.b$a */
    public static class C0877a {

        /* renamed from: a */
        public C0864e.EnumC0866b f4401a;

        /* renamed from: b */
        public C0864e.EnumC0866b f4402b;

        /* renamed from: c */
        public int f4403c;

        /* renamed from: d */
        public int f4404d;

        /* renamed from: e */
        public int f4405e;

        /* renamed from: f */
        public int f4406f;

        /* renamed from: g */
        public int f4407g;

        /* renamed from: h */
        public boolean f4408h;

        /* renamed from: i */
        public boolean f4409i;

        /* renamed from: j */
        public boolean f4410j;
    }

    /* renamed from: b.e.b.k.m.b$b */
    public interface AbstractC0878b {
        /* renamed from: a */
        void mo1969a(C0864e eVar, C0877a aVar);

        /* renamed from: b */
        void mo1970b();
    }

    public C0876b(C0867f fVar) {
        this.f4400c = fVar;
    }

    /* renamed from: a */
    private boolean m5212a(AbstractC0878b bVar, C0864e eVar, boolean z) {
        this.f4399b.f4401a = eVar.mo5219w();
        this.f4399b.f4402b = eVar.mo5167K();
        this.f4399b.f4403c = eVar.mo5170N();
        this.f4399b.f4404d = eVar.mo5213t();
        C0877a aVar = this.f4399b;
        aVar.f4409i = false;
        aVar.f4410j = z;
        C0864e.EnumC0866b bVar2 = aVar.f4401a;
        C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.f4402b == bVar3;
        boolean z4 = z2 && eVar.f4287R > 0.0f;
        boolean z5 = z3 && eVar.f4287R > 0.0f;
        if (z4 && eVar.f4323o[0] == 4) {
            aVar.f4401a = C0864e.EnumC0866b.FIXED;
        }
        if (z5 && eVar.f4323o[1] == 4) {
            aVar.f4402b = C0864e.EnumC0866b.FIXED;
        }
        bVar.mo1969a(eVar, aVar);
        eVar.mo5153B0(this.f4399b.f4405e);
        eVar.mo5187e0(this.f4399b.f4406f);
        eVar.mo5185d0(this.f4399b.f4408h);
        eVar.mo5180Y(this.f4399b.f4407g);
        C0877a aVar2 = this.f4399b;
        aVar2.f4410j = false;
        return aVar2.f4409i;
    }

    /* renamed from: b */
    private void m5213b(C0867f fVar) {
        int size = fVar.f4397w0.size();
        AbstractC0878b R0 = fVar.mo5233R0();
        for (int i = 0; i < size; i++) {
            C0864e eVar = fVar.f4397w0.get(i);
            if (!(eVar instanceof C0868g) && (!eVar.f4305f.f4461e.f4431j || !eVar.f4307g.f4461e.f4431j)) {
                C0864e.EnumC0866b q = eVar.mo5207q(0);
                boolean z = true;
                C0864e.EnumC0866b q2 = eVar.mo5207q(1);
                C0864e.EnumC0866b bVar = C0864e.EnumC0866b.MATCH_CONSTRAINT;
                if (q != bVar || eVar.f4319m == 1 || q2 != bVar || eVar.f4321n == 1) {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    m5212a(R0, eVar, false);
                    if (fVar.f4351B0 != null) {
                        throw null;
                    }
                }
            }
        }
        R0.mo1970b();
    }

    /* renamed from: c */
    private void m5214c(C0867f fVar, String str, int i, int i2) {
        int C = fVar.mo5154C();
        int B = fVar.mo5152B();
        fVar.mo5210r0(0);
        fVar.mo5208q0(0);
        fVar.mo5153B0(i);
        fVar.mo5187e0(i2);
        fVar.mo5210r0(C);
        fVar.mo5208q0(B);
        this.f4400c.mo5227H0();
    }

    /* renamed from: d */
    public long mo5263d(C0867f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC0878b bVar;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        AbstractC0878b R0 = fVar.mo5233R0();
        int size = fVar.f4397w0.size();
        int N = fVar.mo5170N();
        int t = fVar.mo5213t();
        boolean b = C0872j.m5202b(i, 128);
        boolean z6 = b || C0872j.m5202b(i, 64);
        if (z6) {
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                C0864e eVar = fVar.f4397w0.get(i15);
                C0864e.EnumC0866b w = eVar.mo5219w();
                C0864e.EnumC0866b bVar2 = C0864e.EnumC0866b.MATCH_CONSTRAINT;
                boolean z7 = (w == bVar2) && (eVar.mo5167K() == bVar2) && eVar.mo5209r() > 0.0f;
                if ((!eVar.mo5175T() || !z7) && ((!eVar.mo5177V() || !z7) && !(eVar instanceof C0873k) && !eVar.mo5175T() && !eVar.mo5177V())) {
                    i15++;
                }
            }
            z6 = false;
        }
        if (!z6 || C0846d.f4158b == null) {
            if (z6 && ((i4 == 1073741824 && i6 == 1073741824) || b)) {
                int min = Math.min(fVar.mo5150A(), i5);
                int min2 = Math.min(fVar.mo5225z(), i7);
                if (i4 == 1073741824 && fVar.mo5170N() != min) {
                    fVar.mo5153B0(min);
                    fVar.mo5235T0();
                }
                if (i6 == 1073741824 && fVar.mo5213t() != min2) {
                    fVar.mo5187e0(min2);
                    fVar.mo5235T0();
                }
                if (i4 == 1073741824 && i6 == 1073741824) {
                    z = fVar.mo5230O0(b);
                    i10 = 2;
                } else {
                    boolean P0 = fVar.mo5231P0(b);
                    if (i4 == 1073741824) {
                        z5 = P0 & fVar.mo5232Q0(b, 0);
                        i14 = 1;
                    } else {
                        z5 = P0;
                        i14 = 0;
                    }
                    if (i6 == 1073741824) {
                        boolean Q0 = fVar.mo5232Q0(b, 1) & z5;
                        i10 = i14 + 1;
                        z = Q0;
                    } else {
                        i10 = i14;
                        z = z5;
                    }
                }
                if (z) {
                    fVar.mo5161F0(i4 == 1073741824, i6 == 1073741824);
                }
            } else {
                z = false;
                i10 = 0;
            }
            if (z && i10 == 2) {
                return 0;
            }
            if (size > 0) {
                m5213b(fVar);
            }
            int S0 = fVar.mo5234S0();
            int size2 = this.f4398a.size();
            if (size > 0) {
                m5214c(fVar, "First pass", N, t);
            }
            if (size2 > 0) {
                C0864e.EnumC0866b w2 = fVar.mo5219w();
                C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.WRAP_CONTENT;
                boolean z8 = w2 == bVar3;
                boolean z9 = fVar.mo5167K() == bVar3;
                int max = Math.max(fVar.mo5170N(), this.f4400c.mo5154C());
                int max2 = Math.max(fVar.mo5213t(), this.f4400c.mo5152B());
                int i16 = 0;
                boolean z10 = false;
                while (i16 < size2) {
                    C0864e eVar2 = this.f4398a.get(i16);
                    if (!(eVar2 instanceof C0873k)) {
                        i13 = S0;
                    } else {
                        int N2 = eVar2.mo5170N();
                        int t2 = eVar2.mo5213t();
                        i13 = S0;
                        boolean a = z10 | m5212a(R0, eVar2, true);
                        if (fVar.f4351B0 == null) {
                            int N3 = eVar2.mo5170N();
                            int t3 = eVar2.mo5213t();
                            if (N3 != N2) {
                                eVar2.mo5153B0(N3);
                                if (z8 && eVar2.mo5162G() > max) {
                                    max = Math.max(max, eVar2.mo5162G() + eVar2.mo5195k(C0861d.EnumC0863b.RIGHT).mo5138b());
                                }
                                z4 = true;
                            } else {
                                z4 = a;
                            }
                            if (t3 != t2) {
                                eVar2.mo5187e0(t3);
                                if (z9 && eVar2.mo5201n() > max2) {
                                    max2 = Math.max(max2, eVar2.mo5201n() + eVar2.mo5195k(C0861d.EnumC0863b.BOTTOM).mo5138b());
                                }
                                z4 = true;
                            }
                            z10 = z4 | ((C0873k) eVar2).mo5259I0();
                        } else {
                            throw null;
                        }
                    }
                    i16++;
                    S0 = i13;
                }
                int i17 = 0;
                int i18 = 2;
                while (i17 < i18) {
                    int i19 = 0;
                    while (i19 < size2) {
                        C0864e eVar3 = this.f4398a.get(i19);
                        if ((!(eVar3 instanceof AbstractC0870h) || (eVar3 instanceof C0873k)) && !(eVar3 instanceof C0868g) && eVar3.mo5169M() != 8 && ((!eVar3.f4305f.f4461e.f4431j || !eVar3.f4307g.f4461e.f4431j) && !(eVar3 instanceof C0873k))) {
                            int N4 = eVar3.mo5170N();
                            int t4 = eVar3.mo5213t();
                            i11 = size2;
                            int l = eVar3.mo5197l();
                            i12 = i17;
                            z10 |= m5212a(R0, eVar3, true);
                            if (fVar.f4351B0 == null) {
                                int N5 = eVar3.mo5170N();
                                bVar = R0;
                                int t5 = eVar3.mo5213t();
                                if (N5 != N4) {
                                    eVar3.mo5153B0(N5);
                                    if (z8 && eVar3.mo5162G() > max) {
                                        max = Math.max(max, eVar3.mo5162G() + eVar3.mo5195k(C0861d.EnumC0863b.RIGHT).mo5138b());
                                    }
                                    z10 = true;
                                }
                                if (t5 != t4) {
                                    eVar3.mo5187e0(t5);
                                    if (z9 && eVar3.mo5201n() > max2) {
                                        max2 = Math.max(max2, eVar3.mo5201n() + eVar3.mo5195k(C0861d.EnumC0863b.BOTTOM).mo5138b());
                                    }
                                    z10 = true;
                                }
                                if (eVar3.mo5173Q() && l != eVar3.mo5197l()) {
                                    z10 = true;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            i12 = i17;
                            i11 = size2;
                            bVar = R0;
                        }
                        i19++;
                        size2 = i11;
                        R0 = bVar;
                        i17 = i12;
                    }
                    if (z10) {
                        m5214c(fVar, "intermediate pass", N, t);
                        z10 = false;
                    }
                    R0 = R0;
                    i17++;
                    i18 = 2;
                    size2 = size2;
                }
                if (z10) {
                    m5214c(fVar, "2nd pass", N, t);
                    if (fVar.mo5170N() < max) {
                        fVar.mo5153B0(max);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fVar.mo5213t() < max2) {
                        fVar.mo5187e0(max2);
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        m5214c(fVar, "3rd pass", N, t);
                    }
                }
                S0 = S0;
            }
            fVar.mo5243c1(S0);
            return 0;
        }
        throw null;
    }

    /* renamed from: e */
    public void mo5264e(C0867f fVar) {
        C0864e.EnumC0866b bVar;
        this.f4398a.clear();
        int size = fVar.f4397w0.size();
        for (int i = 0; i < size; i++) {
            C0864e eVar = fVar.f4397w0.get(i);
            C0864e.EnumC0866b w = eVar.mo5219w();
            C0864e.EnumC0866b bVar2 = C0864e.EnumC0866b.MATCH_CONSTRAINT;
            if (w == bVar2 || eVar.mo5219w() == (bVar = C0864e.EnumC0866b.MATCH_PARENT) || eVar.mo5167K() == bVar2 || eVar.mo5167K() == bVar) {
                this.f4398a.add(eVar);
            }
        }
        fVar.mo5235T0();
    }
}
