package p006b.p022e.p026b.p027k.p028m;

import p006b.p022e.p026b.p027k.p028m.C0882f;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.k.m.g */
public class C0884g extends C0882f {

    /* renamed from: m */
    public int f4443m;

    public C0884g(AbstractC0892m mVar) {
        super(mVar);
        this.f4426e = mVar instanceof C0887j ? C0882f.EnumC0883a.HORIZONTAL_DIMENSION : C0882f.EnumC0883a.VERTICAL_DIMENSION;
    }

    @Override // p006b.p022e.p026b.p027k.p028m.C0882f
    /* renamed from: d */
    public void mo5283d(int i) {
        if (!this.f4431j) {
            this.f4431j = true;
            this.f4428g = i;
            for (AbstractC0880d dVar : this.f4432k) {
                dVar.mo5265a(dVar);
            }
        }
    }
}
