package p006b.p022e.p026b.p027k.p028m;

import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.C0868g;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.k.m.h */
public class C0885h extends AbstractC0892m {
    public C0885h(C0864e eVar) {
        super(eVar);
        eVar.f4305f.mo5268f();
        eVar.f4307g.mo5268f();
        this.f4462f = ((C0868g) eVar).mo5247H0();
    }

    /* renamed from: q */
    private void m5248q(C0882f fVar) {
        this.f4464h.f4432k.add(fVar);
        fVar.f4433l.add(this.f4464h);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        C0882f fVar = this.f4464h;
        if (fVar.f4424c && !fVar.f4431j) {
            this.f4464h.mo5283d((int) ((((float) fVar.f4433l.get(0).f4428g) * ((C0868g) this.f4458b).mo5250K0()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    public void mo5266d() {
        AbstractC0892m mVar;
        C0882f fVar;
        C0882f fVar2;
        C0868g gVar = (C0868g) this.f4458b;
        int I0 = gVar.mo5248I0();
        int J0 = gVar.mo5249J0();
        gVar.mo5250K0();
        if (gVar.mo5247H0() == 1) {
            C0882f fVar3 = this.f4464h;
            if (I0 != -1) {
                fVar3.f4433l.add(this.f4458b.f4284O.f4305f.f4464h);
                this.f4458b.f4284O.f4305f.f4464h.f4432k.add(this.f4464h);
                fVar2 = this.f4464h;
            } else if (J0 != -1) {
                fVar3.f4433l.add(this.f4458b.f4284O.f4305f.f4465i);
                this.f4458b.f4284O.f4305f.f4465i.f4432k.add(this.f4464h);
                fVar2 = this.f4464h;
                I0 = -J0;
            } else {
                fVar3.f4423b = true;
                fVar3.f4433l.add(this.f4458b.f4284O.f4305f.f4465i);
                this.f4458b.f4284O.f4305f.f4465i.f4432k.add(this.f4464h);
                m5248q(this.f4458b.f4305f.f4464h);
                mVar = this.f4458b.f4305f;
            }
            fVar2.f4427f = I0;
            m5248q(this.f4458b.f4305f.f4464h);
            mVar = this.f4458b.f4305f;
        } else {
            C0882f fVar4 = this.f4464h;
            if (I0 != -1) {
                fVar4.f4433l.add(this.f4458b.f4284O.f4307g.f4464h);
                this.f4458b.f4284O.f4307g.f4464h.f4432k.add(this.f4464h);
                fVar = this.f4464h;
            } else if (J0 != -1) {
                fVar4.f4433l.add(this.f4458b.f4284O.f4307g.f4465i);
                this.f4458b.f4284O.f4307g.f4465i.f4432k.add(this.f4464h);
                fVar = this.f4464h;
                I0 = -J0;
            } else {
                fVar4.f4423b = true;
                fVar4.f4433l.add(this.f4458b.f4284O.f4307g.f4465i);
                this.f4458b.f4284O.f4307g.f4465i.f4432k.add(this.f4464h);
                m5248q(this.f4458b.f4307g.f4464h);
                mVar = this.f4458b.f4307g;
            }
            fVar.f4427f = I0;
            m5248q(this.f4458b.f4307g.f4464h);
            mVar = this.f4458b.f4307g;
        }
        m5248q(mVar.f4465i);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        if (((C0868g) this.f4458b).mo5247H0() == 1) {
            this.f4458b.mo5155C0(this.f4464h.f4428g);
        } else {
            this.f4458b.mo5157D0(this.f4464h.f4428g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4464h.mo5282c();
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        return false;
    }
}
