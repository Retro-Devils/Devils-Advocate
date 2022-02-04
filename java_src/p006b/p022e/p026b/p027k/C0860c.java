package p006b.p022e.p026b.p027k;

import java.util.ArrayList;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.c */
public class C0860c {

    /* renamed from: a */
    protected C0864e f4229a;

    /* renamed from: b */
    protected C0864e f4230b;

    /* renamed from: c */
    protected C0864e f4231c;

    /* renamed from: d */
    protected C0864e f4232d;

    /* renamed from: e */
    protected C0864e f4233e;

    /* renamed from: f */
    protected C0864e f4234f;

    /* renamed from: g */
    protected C0864e f4235g;

    /* renamed from: h */
    protected ArrayList<C0864e> f4236h;

    /* renamed from: i */
    protected int f4237i;

    /* renamed from: j */
    protected int f4238j;

    /* renamed from: k */
    protected float f4239k = 0.0f;

    /* renamed from: l */
    int f4240l;

    /* renamed from: m */
    int f4241m;

    /* renamed from: n */
    int f4242n;

    /* renamed from: o */
    boolean f4243o;

    /* renamed from: p */
    private int f4244p;

    /* renamed from: q */
    private boolean f4245q = false;

    /* renamed from: r */
    protected boolean f4246r;

    /* renamed from: s */
    protected boolean f4247s;

    /* renamed from: t */
    protected boolean f4248t;

    /* renamed from: u */
    protected boolean f4249u;

    /* renamed from: v */
    private boolean f4250v;

    public C0860c(C0864e eVar, int i, boolean z) {
        this.f4229a = eVar;
        this.f4244p = i;
        this.f4245q = z;
    }

    /* renamed from: b */
    private void m5061b() {
        int i = this.f4244p * 2;
        C0864e eVar = this.f4229a;
        boolean z = true;
        this.f4243o = true;
        C0864e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f4237i++;
            C0864e[] eVarArr = eVar.f4334t0;
            int i2 = this.f4244p;
            C0864e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f4332s0[i2] = null;
            if (eVar.mo5169M() != 8) {
                this.f4240l++;
                C0864e.EnumC0866b q = eVar.mo5207q(this.f4244p);
                C0864e.EnumC0866b bVar = C0864e.EnumC0866b.MATCH_CONSTRAINT;
                if (q != bVar) {
                    this.f4241m += eVar.mo5223y(this.f4244p);
                }
                int b = this.f4241m + eVar.f4280K[i].mo5138b();
                this.f4241m = b;
                int i3 = i + 1;
                this.f4241m = b + eVar.f4280K[i3].mo5138b();
                int b2 = this.f4242n + eVar.f4280K[i].mo5138b();
                this.f4242n = b2;
                this.f4242n = b2 + eVar.f4280K[i3].mo5138b();
                if (this.f4230b == null) {
                    this.f4230b = eVar;
                }
                this.f4232d = eVar;
                C0864e.EnumC0866b[] bVarArr = eVar.f4283N;
                int i4 = this.f4244p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.f4323o;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f4238j++;
                        float[] fArr = eVar.f4330r0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f4239k += fArr[i4];
                        }
                        if (m5062c(eVar, i4)) {
                            if (f < 0.0f) {
                                this.f4246r = true;
                            } else {
                                this.f4247s = true;
                            }
                            if (this.f4236h == null) {
                                this.f4236h = new ArrayList<>();
                            }
                            this.f4236h.add(eVar);
                        }
                        if (this.f4234f == null) {
                            this.f4234f = eVar;
                        }
                        C0864e eVar4 = this.f4235g;
                        if (eVar4 != null) {
                            eVar4.f4332s0[this.f4244p] = eVar;
                        }
                        this.f4235g = eVar;
                    }
                    if (this.f4244p != 0 ? !(eVar.f4321n == 0 && eVar.f4331s == 0 && eVar.f4333t == 0) : !(eVar.f4319m == 0 && eVar.f4325p == 0 && eVar.f4327q == 0)) {
                        this.f4243o = false;
                    }
                    if (eVar.f4287R != 0.0f) {
                        this.f4243o = false;
                        this.f4249u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f4334t0[this.f4244p] = eVar;
            }
            C0861d dVar = eVar.f4280K[i + 1].f4254d;
            if (dVar != null) {
                C0864e eVar5 = dVar.f4252b;
                C0861d[] dVarArr = eVar5.f4280K;
                if (dVarArr[i].f4254d != null && dVarArr[i].f4254d.f4252b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C0864e eVar6 = this.f4230b;
        if (eVar6 != null) {
            this.f4241m -= eVar6.f4280K[i].mo5138b();
        }
        C0864e eVar7 = this.f4232d;
        if (eVar7 != null) {
            this.f4241m -= eVar7.f4280K[i + 1].mo5138b();
        }
        this.f4231c = eVar;
        if (this.f4244p != 0 || !this.f4245q) {
            this.f4233e = this.f4229a;
        } else {
            this.f4233e = eVar;
        }
        if (!this.f4247s || !this.f4246r) {
            z = false;
        }
        this.f4248t = z;
    }

    /* renamed from: c */
    private static boolean m5062c(C0864e eVar, int i) {
        if (eVar.mo5169M() != 8 && eVar.f4283N[i] == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f4323o;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5136a() {
        if (!this.f4250v) {
            m5061b();
        }
        this.f4250v = true;
    }
}
