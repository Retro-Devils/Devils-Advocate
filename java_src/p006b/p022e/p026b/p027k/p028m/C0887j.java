package p006b.p022e.p026b.p027k.p028m;

import java.util.List;
import p006b.p022e.p026b.p027k.AbstractC0870h;
import p006b.p022e.p026b.p027k.C0861d;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.p028m.AbstractC0892m;
import p006b.p022e.p026b.p027k.p028m.C0882f;

/* renamed from: b.e.b.k.m.j */
public class C0887j extends AbstractC0892m {

    /* renamed from: k */
    private static int[] f4440k = new int[2];

    /* renamed from: b.e.b.k.m.j$a */
    static /* synthetic */ class C0888a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4441a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                b.e.b.k.m.m$b[] r0 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p006b.p022e.p026b.p027k.p028m.C0887j.C0888a.f4441a = r0
                b.e.b.k.m.m$b r1 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.C0887j.C0888a.f4441a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.m.m$b r1 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.C0887j.C0888a.f4441a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.m.m$b r1 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0887j.C0888a.<clinit>():void");
        }
    }

    public C0887j(C0864e eVar) {
        super(eVar);
        this.f4460h.f4422e = C0882f.EnumC0883a.LEFT;
        this.f4461i.f4422e = C0882f.EnumC0883a.RIGHT;
        this.f4458f = 0;
    }

    /* renamed from: q */
    private void m5260q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0295, code lost:
        if (r14 != 1) goto L_0x02ed;
     */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5265a(p006b.p022e.p026b.p027k.p028m.AbstractC0880d r17) {
        /*
        // Method dump skipped, instructions count: 1040
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0887j.mo5265a(b.e.b.k.m.d):void");
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    public void mo5266d() {
        C0861d dVar;
        C0882f fVar;
        int i;
        C0882f fVar2;
        C0882f fVar3;
        AbstractC0880d dVar2;
        List<AbstractC0880d> list;
        C0882f fVar4;
        int i2;
        C0882f fVar5;
        C0882f fVar6;
        int i3;
        C0882f fVar7;
        C0882f fVar8;
        C0864e E;
        C0864e E2;
        C0864e eVar = this.f4454b;
        if (eVar.f4293b) {
            this.f4457e.mo5283d(eVar.mo5170N());
        }
        if (!this.f4457e.f4427j) {
            C0864e.EnumC0866b w = this.f4454b.mo5219w();
            this.f4456d = w;
            if (w != C0864e.EnumC0866b.MATCH_CONSTRAINT) {
                C0864e.EnumC0866b bVar = C0864e.EnumC0866b.MATCH_PARENT;
                if (w == bVar && (((E2 = this.f4454b.mo5158E()) != null && E2.mo5219w() == C0864e.EnumC0866b.FIXED) || E2.mo5219w() == bVar)) {
                    int N = (E2.mo5170N() - this.f4454b.f4268C.mo5138b()) - this.f4454b.f4270E.mo5138b();
                    mo5291b(this.f4460h, E2.f4301f.f4460h, this.f4454b.f4268C.mo5138b());
                    mo5291b(this.f4461i, E2.f4301f.f4461i, -this.f4454b.f4270E.mo5138b());
                    this.f4457e.mo5283d(N);
                    return;
                } else if (this.f4456d == C0864e.EnumC0866b.FIXED) {
                    this.f4457e.mo5283d(this.f4454b.mo5170N());
                }
            }
        } else {
            C0864e.EnumC0866b bVar2 = this.f4456d;
            C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((E = this.f4454b.mo5158E()) != null && E.mo5219w() == C0864e.EnumC0866b.FIXED) || E.mo5219w() == bVar3)) {
                mo5291b(this.f4460h, E.f4301f.f4460h, this.f4454b.f4268C.mo5138b());
                mo5291b(this.f4461i, E.f4301f.f4461i, -this.f4454b.f4270E.mo5138b());
                return;
            }
        }
        C0884g gVar = this.f4457e;
        if (gVar.f4427j) {
            C0864e eVar2 = this.f4454b;
            if (eVar2.f4293b) {
                C0861d[] dVarArr = eVar2.f4276K;
                if (dVarArr[0].f4250d == null || dVarArr[1].f4250d == null) {
                    if (dVarArr[0].f4250d != null) {
                        fVar8 = mo5294h(dVarArr[0]);
                        if (fVar8 != null) {
                            fVar7 = this.f4460h;
                            i3 = this.f4454b.f4276K[0].mo5138b();
                        } else {
                            return;
                        }
                    } else if (dVarArr[1].f4250d != null) {
                        C0882f h = mo5294h(dVarArr[1]);
                        if (h != null) {
                            mo5291b(this.f4461i, h, -this.f4454b.f4276K[1].mo5138b());
                            fVar6 = this.f4460h;
                            fVar5 = this.f4461i;
                            i2 = -this.f4457e.f4424g;
                            mo5291b(fVar6, fVar5, i2);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof AbstractC0870h) && eVar2.mo5158E() != null && this.f4454b.mo5195k(C0861d.EnumC0863b.CENTER).f4250d == null) {
                        fVar8 = this.f4454b.mo5158E().f4301f.f4460h;
                        fVar7 = this.f4460h;
                        i3 = this.f4454b.mo5171O();
                    } else {
                        return;
                    }
                    mo5291b(fVar7, fVar8, i3);
                    fVar6 = this.f4461i;
                    fVar5 = this.f4460h;
                    i2 = this.f4457e.f4424g;
                    mo5291b(fVar6, fVar5, i2);
                    return;
                } else if (eVar2.mo5175T()) {
                    this.f4460h.f4423f = this.f4454b.f4276K[0].mo5138b();
                    fVar = this.f4461i;
                    dVar = this.f4454b.f4276K[1];
                    fVar.f4423f = -dVar.mo5138b();
                } else {
                    C0882f h2 = mo5294h(this.f4454b.f4276K[0]);
                    if (h2 != null) {
                        mo5291b(this.f4460h, h2, this.f4454b.f4276K[0].mo5138b());
                    }
                    C0882f h3 = mo5294h(this.f4454b.f4276K[1]);
                    if (h3 != null) {
                        mo5291b(this.f4461i, h3, -this.f4454b.f4276K[1].mo5138b());
                    }
                    this.f4460h.f4419b = true;
                    this.f4461i.f4419b = true;
                    return;
                }
            }
        }
        if (this.f4456d == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
            C0864e eVar3 = this.f4454b;
            int i4 = eVar3.f4315m;
            if (i4 == 2) {
                C0864e E3 = eVar3.mo5158E();
                if (E3 != null) {
                    C0884g gVar2 = E3.f4303g.f4457e;
                    this.f4457e.f4429l.add(gVar2);
                    gVar2.f4428k.add(this.f4457e);
                    C0884g gVar3 = this.f4457e;
                    gVar3.f4419b = true;
                    gVar3.f4428k.add(this.f4460h);
                    list = this.f4457e.f4428k;
                    dVar2 = this.f4461i;
                }
            } else if (i4 == 3) {
                if (eVar3.f4317n == 3) {
                    this.f4460h.f4418a = this;
                    this.f4461i.f4418a = this;
                    C0890l lVar = eVar3.f4303g;
                    lVar.f4460h.f4418a = this;
                    lVar.f4461i.f4418a = this;
                    gVar.f4418a = this;
                    if (eVar3.mo5177V()) {
                        this.f4457e.f4429l.add(this.f4454b.f4303g.f4457e);
                        this.f4454b.f4303g.f4457e.f4428k.add(this.f4457e);
                        C0890l lVar2 = this.f4454b.f4303g;
                        lVar2.f4457e.f4418a = this;
                        this.f4457e.f4429l.add(lVar2.f4460h);
                        this.f4457e.f4429l.add(this.f4454b.f4303g.f4461i);
                        this.f4454b.f4303g.f4460h.f4428k.add(this.f4457e);
                        list = this.f4454b.f4303g.f4461i.f4428k;
                        dVar2 = this.f4457e;
                    } else if (this.f4454b.mo5175T()) {
                        this.f4454b.f4303g.f4457e.f4429l.add(this.f4457e);
                        list = this.f4457e.f4428k;
                        dVar2 = this.f4454b.f4303g.f4457e;
                    } else {
                        fVar4 = this.f4454b.f4303g.f4457e;
                    }
                } else {
                    C0884g gVar4 = eVar3.f4303g.f4457e;
                    gVar.f4429l.add(gVar4);
                    gVar4.f4428k.add(this.f4457e);
                    this.f4454b.f4303g.f4460h.f4428k.add(this.f4457e);
                    this.f4454b.f4303g.f4461i.f4428k.add(this.f4457e);
                    C0884g gVar5 = this.f4457e;
                    gVar5.f4419b = true;
                    gVar5.f4428k.add(this.f4460h);
                    this.f4457e.f4428k.add(this.f4461i);
                    this.f4460h.f4429l.add(this.f4457e);
                    fVar4 = this.f4461i;
                }
                list = fVar4.f4429l;
                dVar2 = this.f4457e;
            }
            list.add(dVar2);
        }
        C0864e eVar4 = this.f4454b;
        C0861d[] dVarArr2 = eVar4.f4276K;
        if (dVarArr2[0].f4250d == null || dVarArr2[1].f4250d == null) {
            if (dVarArr2[0].f4250d != null) {
                fVar3 = mo5294h(dVarArr2[0]);
                if (fVar3 != null) {
                    fVar2 = this.f4460h;
                    i = this.f4454b.f4276K[0].mo5138b();
                } else {
                    return;
                }
            } else if (dVarArr2[1].f4250d != null) {
                C0882f h4 = mo5294h(dVarArr2[1]);
                if (h4 != null) {
                    mo5291b(this.f4461i, h4, -this.f4454b.f4276K[1].mo5138b());
                    mo5292c(this.f4460h, this.f4461i, -1, this.f4457e);
                    return;
                }
                return;
            } else if (!(eVar4 instanceof AbstractC0870h) && eVar4.mo5158E() != null) {
                fVar3 = this.f4454b.mo5158E().f4301f.f4460h;
                fVar2 = this.f4460h;
                i = this.f4454b.mo5171O();
            } else {
                return;
            }
            mo5291b(fVar2, fVar3, i);
            mo5292c(this.f4461i, this.f4460h, 1, this.f4457e);
        } else if (eVar4.mo5175T()) {
            this.f4460h.f4423f = this.f4454b.f4276K[0].mo5138b();
            fVar = this.f4461i;
            dVar = this.f4454b.f4276K[1];
            fVar.f4423f = -dVar.mo5138b();
        } else {
            C0882f h5 = mo5294h(this.f4454b.f4276K[0]);
            C0882f h6 = mo5294h(this.f4454b.f4276K[1]);
            h5.mo5281b(this);
            h6.mo5281b(this);
            this.f4462j = AbstractC0892m.EnumC0894b.CENTER;
        }
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        C0882f fVar = this.f4460h;
        if (fVar.f4427j) {
            this.f4454b.mo5155C0(fVar.f4424g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4455c = null;
        this.f4460h.mo5282c();
        this.f4461i.mo5282c();
        this.f4457e.mo5282c();
        this.f4459g = false;
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        return this.f4456d != C0864e.EnumC0866b.MATCH_CONSTRAINT || this.f4454b.f4315m == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5285r() {
        this.f4459g = false;
        this.f4460h.mo5282c();
        this.f4460h.f4427j = false;
        this.f4461i.mo5282c();
        this.f4461i.f4427j = false;
        this.f4457e.f4427j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f4454b.mo5205p();
    }
}
