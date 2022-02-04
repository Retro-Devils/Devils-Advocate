package p006b.p022e.p026b.p027k.p028m;

import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.p028m.C0882f;

/* renamed from: b.e.b.k.m.l */
public class C0890l extends AbstractC0892m {

    /* renamed from: k */
    public C0882f f4450k;

    /* renamed from: l */
    C0884g f4451l = null;

    /* renamed from: b.e.b.k.m.l$a */
    static /* synthetic */ class C0891a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4452a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                b.e.b.k.m.m$b[] r0 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p006b.p022e.p026b.p027k.p028m.C0890l.C0891a.f4452a = r0
                b.e.b.k.m.m$b r1 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.C0890l.C0891a.f4452a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.m.m$b r1 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.C0890l.C0891a.f4452a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.m.m$b r1 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.EnumC0894b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0890l.C0891a.<clinit>():void");
        }
    }

    public C0890l(C0864e eVar) {
        super(eVar);
        C0882f fVar = new C0882f(this);
        this.f4450k = fVar;
        this.f4460h.f4422e = C0882f.EnumC0883a.TOP;
        this.f4461i.f4422e = C0882f.EnumC0883a.BOTTOM;
        fVar.f4422e = C0882f.EnumC0883a.BASELINE;
        this.f4458f = 1;
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        int i;
        float f;
        int i2 = C0891a.f4452a[this.f4462j.ordinal()];
        if (i2 == 1) {
            mo5299p(dVar);
        } else if (i2 == 2) {
            mo5298o(dVar);
        } else if (i2 == 3) {
            C0864e eVar = this.f4454b;
            mo5297n(dVar, eVar.f4269D, eVar.f4271F, 1);
            return;
        }
        C0884g gVar = this.f4457e;
        if (gVar.f4420c && !gVar.f4427j && this.f4456d == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
            C0864e eVar2 = this.f4454b;
            int i3 = eVar2.f4317n;
            if (i3 == 2) {
                C0864e E = eVar2.mo5158E();
                if (E != null) {
                    C0884g gVar2 = E.f4303g.f4457e;
                    if (gVar2.f4427j) {
                        i = (int) ((((float) gVar2.f4424g) * this.f4454b.f4331u) + 0.5f);
                    }
                }
            } else if (i3 == 3 && eVar2.f4301f.f4457e.f4427j) {
                int s = eVar2.mo5211s();
                if (s != -1) {
                    if (s == 0) {
                        C0864e eVar3 = this.f4454b;
                        f = ((float) eVar3.f4301f.f4457e.f4424g) * eVar3.mo5209r();
                        i = (int) (f + 0.5f);
                    } else if (s != 1) {
                        i = 0;
                    }
                }
                C0864e eVar4 = this.f4454b;
                f = ((float) eVar4.f4301f.f4457e.f4424g) / eVar4.mo5209r();
                i = (int) (f + 0.5f);
            }
            this.f4457e.mo5283d(i);
        }
        C0882f fVar = this.f4460h;
        if (fVar.f4420c) {
            C0882f fVar2 = this.f4461i;
            if (fVar2.f4420c) {
                if (!fVar.f4427j || !fVar2.f4427j || !this.f4457e.f4427j) {
                    if (!this.f4457e.f4427j && this.f4456d == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
                        C0864e eVar5 = this.f4454b;
                        if (eVar5.f4315m == 0 && !eVar5.mo5177V()) {
                            int i4 = this.f4460h.f4429l.get(0).f4424g;
                            C0882f fVar3 = this.f4460h;
                            int i5 = i4 + fVar3.f4423f;
                            int i6 = this.f4461i.f4429l.get(0).f4424g + this.f4461i.f4423f;
                            fVar3.mo5283d(i5);
                            this.f4461i.mo5283d(i6);
                            this.f4457e.mo5283d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f4457e.f4427j && this.f4456d == C0864e.EnumC0866b.MATCH_CONSTRAINT && this.f4453a == 1 && this.f4460h.f4429l.size() > 0 && this.f4461i.f4429l.size() > 0) {
                        int i7 = (this.f4461i.f4429l.get(0).f4424g + this.f4461i.f4423f) - (this.f4460h.f4429l.get(0).f4424g + this.f4460h.f4423f);
                        C0884g gVar3 = this.f4457e;
                        int i8 = gVar3.f4439m;
                        if (i7 < i8) {
                            gVar3.mo5283d(i7);
                        } else {
                            gVar3.mo5283d(i8);
                        }
                    }
                    if (this.f4457e.f4427j && this.f4460h.f4429l.size() > 0 && this.f4461i.f4429l.size() > 0) {
                        C0882f fVar4 = this.f4460h.f4429l.get(0);
                        C0882f fVar5 = this.f4461i.f4429l.get(0);
                        int i9 = fVar4.f4424g + this.f4460h.f4423f;
                        int i10 = fVar5.f4424g + this.f4461i.f4423f;
                        float I = this.f4454b.mo5165I();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f4424g;
                            i10 = fVar5.f4424g;
                            I = 0.5f;
                        }
                        this.f4460h.mo5283d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f4457e.f4424g)) * I)));
                        this.f4461i.mo5283d(this.f4460h.f4424g + this.f4457e.f4424g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e3, code lost:
        if (r9.f4454b.mo5173Q() != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x033e, code lost:
        if (r0.f4456d == r1) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0370, code lost:
        if (r9.f4454b.mo5173Q() != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03e7, code lost:
        if (r0.f4456d == r1) goto L_0x03e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5266d() {
        /*
        // Method dump skipped, instructions count: 1042
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0890l.mo5266d():void");
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        C0882f fVar = this.f4460h;
        if (fVar.f4427j) {
            this.f4454b.mo5157D0(fVar.f4424g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4455c = null;
        this.f4460h.mo5282c();
        this.f4461i.mo5282c();
        this.f4450k.mo5282c();
        this.f4457e.mo5282c();
        this.f4459g = false;
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        return this.f4456d != C0864e.EnumC0866b.MATCH_CONSTRAINT || this.f4454b.f4317n == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5289q() {
        this.f4459g = false;
        this.f4460h.mo5282c();
        this.f4460h.f4427j = false;
        this.f4461i.mo5282c();
        this.f4461i.f4427j = false;
        this.f4450k.mo5282c();
        this.f4450k.f4427j = false;
        this.f4457e.f4427j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f4454b.mo5205p();
    }
}
