package p006b.p022e.p026b.p027k;

import java.util.ArrayList;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.c */
public class C0860c {

    /* renamed from: a */
    protected C0864e f4225a;

    /* renamed from: b */
    protected C0864e f4226b;

    /* renamed from: c */
    protected C0864e f4227c;

    /* renamed from: d */
    protected C0864e f4228d;

    /* renamed from: e */
    protected C0864e f4229e;

    /* renamed from: f */
    protected C0864e f4230f;

    /* renamed from: g */
    protected C0864e f4231g;

    /* renamed from: h */
    protected ArrayList<C0864e> f4232h;

    /* renamed from: i */
    protected int f4233i;

    /* renamed from: j */
    protected int f4234j;

    /* renamed from: k */
    protected float f4235k = 0.0f;

    /* renamed from: l */
    int f4236l;

    /* renamed from: m */
    int f4237m;

    /* renamed from: n */
    int f4238n;

    /* renamed from: o */
    boolean f4239o;

    /* renamed from: p */
    private int f4240p;

    /* renamed from: q */
    private boolean f4241q = false;

    /* renamed from: r */
    protected boolean f4242r;

    /* renamed from: s */
    protected boolean f4243s;

    /* renamed from: t */
    protected boolean f4244t;

    /* renamed from: u */
    protected boolean f4245u;

    /* renamed from: v */
    private boolean f4246v;

    public C0860c(C0864e eVar, int i, boolean z) {
        this.f4225a = eVar;
        this.f4240p = i;
        this.f4241q = z;
    }

    /* renamed from: b */
    private void m5061b() {
        int i = this.f4240p * 2;
        C0864e eVar = this.f4225a;
        boolean z = true;
        this.f4239o = true;
        C0864e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f4233i++;
            C0864e[] eVarArr = eVar.f4330t0;
            int i2 = this.f4240p;
            C0864e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f4328s0[i2] = null;
            if (eVar.mo5169M() != 8) {
                this.f4236l++;
                C0864e.EnumC0866b q = eVar.mo5207q(this.f4240p);
                C0864e.EnumC0866b bVar = C0864e.EnumC0866b.MATCH_CONSTRAINT;
                if (q != bVar) {
                    this.f4237m += eVar.mo5223y(this.f4240p);
                }
                int b = this.f4237m + eVar.f4276K[i].mo5138b();
                this.f4237m = b;
                int i3 = i + 1;
                this.f4237m = b + eVar.f4276K[i3].mo5138b();
                int b2 = this.f4238n + eVar.f4276K[i].mo5138b();
                this.f4238n = b2;
                this.f4238n = b2 + eVar.f4276K[i3].mo5138b();
                if (this.f4226b == null) {
                    this.f4226b = eVar;
                }
                this.f4228d = eVar;
                C0864e.EnumC0866b[] bVarArr = eVar.f4279N;
                int i4 = this.f4240p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.f4319o;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f4234j++;
                        float[] fArr = eVar.f4326r0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f4235k += fArr[i4];
                        }
                        if (m5062c(eVar, i4)) {
                            if (f < 0.0f) {
                                this.f4242r = true;
                            } else {
                                this.f4243s = true;
                            }
                            if (this.f4232h == null) {
                                this.f4232h = new ArrayList<>();
                            }
                            this.f4232h.add(eVar);
                        }
                        if (this.f4230f == null) {
                            this.f4230f = eVar;
                        }
                        C0864e eVar4 = this.f4231g;
                        if (eVar4 != null) {
                            eVar4.f4328s0[this.f4240p] = eVar;
                        }
                        this.f4231g = eVar;
                    }
                    if (this.f4240p != 0 ? !(eVar.f4317n == 0 && eVar.f4327s == 0 && eVar.f4329t == 0) : !(eVar.f4315m == 0 && eVar.f4321p == 0 && eVar.f4323q == 0)) {
                        this.f4239o = false;
                    }
                    if (eVar.f4283R != 0.0f) {
                        this.f4239o = false;
                        this.f4245u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f4330t0[this.f4240p] = eVar;
            }
            C0861d dVar = eVar.f4276K[i + 1].f4250d;
            if (dVar != null) {
                C0864e eVar5 = dVar.f4248b;
                C0861d[] dVarArr = eVar5.f4276K;
                if (dVarArr[i].f4250d != null && dVarArr[i].f4250d.f4248b == eVar) {
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
        C0864e eVar6 = this.f4226b;
        if (eVar6 != null) {
            this.f4237m -= eVar6.f4276K[i].mo5138b();
        }
        C0864e eVar7 = this.f4228d;
        if (eVar7 != null) {
            this.f4237m -= eVar7.f4276K[i + 1].mo5138b();
        }
        this.f4227c = eVar;
        if (this.f4240p != 0 || !this.f4241q) {
            this.f4229e = this.f4225a;
        } else {
            this.f4229e = eVar;
        }
        if (!this.f4243s || !this.f4242r) {
            z = false;
        }
        this.f4244t = z;
    }

    /* renamed from: c */
    private static boolean m5062c(C0864e eVar, int i) {
        if (eVar.mo5169M() != 8 && eVar.f4279N[i] == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f4319o;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5136a() {
        if (!this.f4246v) {
            m5061b();
        }
        this.f4246v = true;
    }
}
