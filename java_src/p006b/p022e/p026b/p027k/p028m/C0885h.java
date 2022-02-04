package p006b.p022e.p026b.p027k.p028m;

import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.C0868g;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.k.m.h */
public class C0885h extends AbstractC0892m {
    public C0885h(C0864e eVar) {
        super(eVar);
        eVar.f4301f.mo5268f();
        eVar.f4303g.mo5268f();
        this.f4458f = ((C0868g) eVar).mo5247H0();
    }

    /* renamed from: q */
    private void m5248q(C0882f fVar) {
        this.f4460h.f4428k.add(fVar);
        fVar.f4429l.add(this.f4460h);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        C0882f fVar = this.f4460h;
        if (fVar.f4420c && !fVar.f4427j) {
            this.f4460h.mo5283d((int) ((((float) fVar.f4429l.get(0).f4424g) * ((C0868g) this.f4454b).mo5250K0()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    public void mo5266d() {
        AbstractC0892m mVar;
        C0882f fVar;
        C0882f fVar2;
        C0868g gVar = (C0868g) this.f4454b;
        int I0 = gVar.mo5248I0();
        int J0 = gVar.mo5249J0();
        gVar.mo5250K0();
        if (gVar.mo5247H0() == 1) {
            C0882f fVar3 = this.f4460h;
            if (I0 != -1) {
                fVar3.f4429l.add(this.f4454b.f4280O.f4301f.f4460h);
                this.f4454b.f4280O.f4301f.f4460h.f4428k.add(this.f4460h);
                fVar2 = this.f4460h;
            } else if (J0 != -1) {
                fVar3.f4429l.add(this.f4454b.f4280O.f4301f.f4461i);
                this.f4454b.f4280O.f4301f.f4461i.f4428k.add(this.f4460h);
                fVar2 = this.f4460h;
                I0 = -J0;
            } else {
                fVar3.f4419b = true;
                fVar3.f4429l.add(this.f4454b.f4280O.f4301f.f4461i);
                this.f4454b.f4280O.f4301f.f4461i.f4428k.add(this.f4460h);
                m5248q(this.f4454b.f4301f.f4460h);
                mVar = this.f4454b.f4301f;
            }
            fVar2.f4423f = I0;
            m5248q(this.f4454b.f4301f.f4460h);
            mVar = this.f4454b.f4301f;
        } else {
            C0882f fVar4 = this.f4460h;
            if (I0 != -1) {
                fVar4.f4429l.add(this.f4454b.f4280O.f4303g.f4460h);
                this.f4454b.f4280O.f4303g.f4460h.f4428k.add(this.f4460h);
                fVar = this.f4460h;
            } else if (J0 != -1) {
                fVar4.f4429l.add(this.f4454b.f4280O.f4303g.f4461i);
                this.f4454b.f4280O.f4303g.f4461i.f4428k.add(this.f4460h);
                fVar = this.f4460h;
                I0 = -J0;
            } else {
                fVar4.f4419b = true;
                fVar4.f4429l.add(this.f4454b.f4280O.f4303g.f4461i);
                this.f4454b.f4280O.f4303g.f4461i.f4428k.add(this.f4460h);
                m5248q(this.f4454b.f4303g.f4460h);
                mVar = this.f4454b.f4303g;
            }
            fVar.f4423f = I0;
            m5248q(this.f4454b.f4303g.f4460h);
            mVar = this.f4454b.f4303g;
        }
        m5248q(mVar.f4461i);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        if (((C0868g) this.f4454b).mo5247H0() == 1) {
            this.f4454b.mo5155C0(this.f4460h.f4424g);
        } else {
            this.f4454b.mo5157D0(this.f4460h.f4424g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4460h.mo5282c();
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        return false;
    }
}
