package p006b.p022e.p026b.p027k.p028m;

import p006b.p022e.p026b.p027k.C0858a;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.p028m.C0882f;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.k.m.i */
public class C0886i extends AbstractC0892m {
    public C0886i(C0864e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m5254q(C0882f fVar) {
        this.f4464h.f4432k.add(fVar);
        fVar.f4433l.add(this.f4464h);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        C0858a aVar = (C0858a) this.f4458b;
        int I0 = aVar.mo5127I0();
        int i = 0;
        int i2 = -1;
        for (C0882f fVar : this.f4464h.f4433l) {
            int i3 = fVar.f4428g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (I0 == 0 || I0 == 2) {
            this.f4464h.mo5283d(i2 + aVar.mo5128J0());
        } else {
            this.f4464h.mo5283d(i + aVar.mo5128J0());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    public void mo5266d() {
        AbstractC0892m mVar;
        C0864e eVar = this.f4458b;
        if (eVar instanceof C0858a) {
            this.f4464h.f4423b = true;
            C0858a aVar = (C0858a) eVar;
            int I0 = aVar.mo5127I0();
            boolean H0 = aVar.mo5126H0();
            int i = 0;
            if (I0 == 0) {
                this.f4464h.f4426e = C0882f.EnumC0883a.LEFT;
                while (i < aVar.f4382x0) {
                    C0864e eVar2 = aVar.f4381w0[i];
                    if (H0 || eVar2.mo5169M() != 8) {
                        C0882f fVar = eVar2.f4305f.f4464h;
                        fVar.f4432k.add(this.f4464h);
                        this.f4464h.f4433l.add(fVar);
                    }
                    i++;
                }
            } else if (I0 != 1) {
                if (I0 == 2) {
                    this.f4464h.f4426e = C0882f.EnumC0883a.TOP;
                    while (i < aVar.f4382x0) {
                        C0864e eVar3 = aVar.f4381w0[i];
                        if (H0 || eVar3.mo5169M() != 8) {
                            C0882f fVar2 = eVar3.f4307g.f4464h;
                            fVar2.f4432k.add(this.f4464h);
                            this.f4464h.f4433l.add(fVar2);
                        }
                        i++;
                    }
                } else if (I0 == 3) {
                    this.f4464h.f4426e = C0882f.EnumC0883a.BOTTOM;
                    while (i < aVar.f4382x0) {
                        C0864e eVar4 = aVar.f4381w0[i];
                        if (H0 || eVar4.mo5169M() != 8) {
                            C0882f fVar3 = eVar4.f4307g.f4465i;
                            fVar3.f4432k.add(this.f4464h);
                            this.f4464h.f4433l.add(fVar3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                m5254q(this.f4458b.f4307g.f4464h);
                mVar = this.f4458b.f4307g;
                m5254q(mVar.f4465i);
            } else {
                this.f4464h.f4426e = C0882f.EnumC0883a.RIGHT;
                while (i < aVar.f4382x0) {
                    C0864e eVar5 = aVar.f4381w0[i];
                    if (H0 || eVar5.mo5169M() != 8) {
                        C0882f fVar4 = eVar5.f4305f.f4465i;
                        fVar4.f4432k.add(this.f4464h);
                        this.f4464h.f4433l.add(fVar4);
                    }
                    i++;
                }
            }
            m5254q(this.f4458b.f4305f.f4464h);
            mVar = this.f4458b.f4305f;
            m5254q(mVar.f4465i);
        }
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        C0864e eVar = this.f4458b;
        if (eVar instanceof C0858a) {
            int I0 = ((C0858a) eVar).mo5127I0();
            if (I0 == 0 || I0 == 1) {
                this.f4458b.mo5155C0(this.f4464h.f4428g);
            } else {
                this.f4458b.mo5157D0(this.f4464h.f4428g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4459c = null;
        this.f4464h.mo5282c();
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        return false;
    }
}
