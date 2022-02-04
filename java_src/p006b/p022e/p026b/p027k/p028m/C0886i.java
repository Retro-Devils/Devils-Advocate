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
        this.f4460h.f4428k.add(fVar);
        fVar.f4429l.add(this.f4460h);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        C0858a aVar = (C0858a) this.f4454b;
        int I0 = aVar.mo5127I0();
        int i = 0;
        int i2 = -1;
        for (C0882f fVar : this.f4460h.f4429l) {
            int i3 = fVar.f4424g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (I0 == 0 || I0 == 2) {
            this.f4460h.mo5283d(i2 + aVar.mo5128J0());
        } else {
            this.f4460h.mo5283d(i + aVar.mo5128J0());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    public void mo5266d() {
        AbstractC0892m mVar;
        C0864e eVar = this.f4454b;
        if (eVar instanceof C0858a) {
            this.f4460h.f4419b = true;
            C0858a aVar = (C0858a) eVar;
            int I0 = aVar.mo5127I0();
            boolean H0 = aVar.mo5126H0();
            int i = 0;
            if (I0 == 0) {
                this.f4460h.f4422e = C0882f.EnumC0883a.LEFT;
                while (i < aVar.f4378x0) {
                    C0864e eVar2 = aVar.f4377w0[i];
                    if (H0 || eVar2.mo5169M() != 8) {
                        C0882f fVar = eVar2.f4301f.f4460h;
                        fVar.f4428k.add(this.f4460h);
                        this.f4460h.f4429l.add(fVar);
                    }
                    i++;
                }
            } else if (I0 != 1) {
                if (I0 == 2) {
                    this.f4460h.f4422e = C0882f.EnumC0883a.TOP;
                    while (i < aVar.f4378x0) {
                        C0864e eVar3 = aVar.f4377w0[i];
                        if (H0 || eVar3.mo5169M() != 8) {
                            C0882f fVar2 = eVar3.f4303g.f4460h;
                            fVar2.f4428k.add(this.f4460h);
                            this.f4460h.f4429l.add(fVar2);
                        }
                        i++;
                    }
                } else if (I0 == 3) {
                    this.f4460h.f4422e = C0882f.EnumC0883a.BOTTOM;
                    while (i < aVar.f4378x0) {
                        C0864e eVar4 = aVar.f4377w0[i];
                        if (H0 || eVar4.mo5169M() != 8) {
                            C0882f fVar3 = eVar4.f4303g.f4461i;
                            fVar3.f4428k.add(this.f4460h);
                            this.f4460h.f4429l.add(fVar3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                m5254q(this.f4454b.f4303g.f4460h);
                mVar = this.f4454b.f4303g;
                m5254q(mVar.f4461i);
            } else {
                this.f4460h.f4422e = C0882f.EnumC0883a.RIGHT;
                while (i < aVar.f4378x0) {
                    C0864e eVar5 = aVar.f4377w0[i];
                    if (H0 || eVar5.mo5169M() != 8) {
                        C0882f fVar4 = eVar5.f4301f.f4461i;
                        fVar4.f4428k.add(this.f4460h);
                        this.f4460h.f4429l.add(fVar4);
                    }
                    i++;
                }
            }
            m5254q(this.f4454b.f4301f.f4460h);
            mVar = this.f4454b.f4301f;
            m5254q(mVar.f4461i);
        }
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        C0864e eVar = this.f4454b;
        if (eVar instanceof C0858a) {
            int I0 = ((C0858a) eVar).mo5127I0();
            if (I0 == 0 || I0 == 1) {
                this.f4454b.mo5155C0(this.f4460h.f4424g);
            } else {
                this.f4454b.mo5157D0(this.f4460h.f4424g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4455c = null;
        this.f4460h.mo5282c();
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        return false;
    }
}
