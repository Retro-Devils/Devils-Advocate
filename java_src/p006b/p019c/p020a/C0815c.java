package p006b.p019c.p020a;

import android.content.res.ColorStateList;

/* renamed from: b.c.a.c */
class C0815c implements AbstractC0819f {
    C0815c() {
    }

    /* renamed from: n */
    private C0820g m4720n(AbstractC0818e eVar) {
        return (C0820g) eVar.mo4825d();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: a */
    public float mo4808a(AbstractC0818e eVar) {
        return m4720n(eVar).mo4829c();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: b */
    public float mo4809b(AbstractC0818e eVar) {
        return m4720n(eVar).mo4830d();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: c */
    public float mo4810c(AbstractC0818e eVar) {
        return mo4809b(eVar) * 2.0f;
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: d */
    public float mo4811d(AbstractC0818e eVar) {
        return mo4809b(eVar) * 2.0f;
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: e */
    public void mo4812e(AbstractC0818e eVar) {
        mo4819l(eVar, mo4808a(eVar));
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: f */
    public ColorStateList mo4813f(AbstractC0818e eVar) {
        return m4720n(eVar).mo4828b();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: g */
    public void mo4814g(AbstractC0818e eVar, float f) {
        eVar.mo4823b().setElevation(f);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: h */
    public void mo4815h(AbstractC0818e eVar, float f) {
        m4720n(eVar).mo4836h(f);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: i */
    public void mo4816i(AbstractC0818e eVar) {
        mo4819l(eVar, mo4808a(eVar));
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: j */
    public void mo4817j(AbstractC0818e eVar, ColorStateList colorStateList) {
        m4720n(eVar).mo4832f(colorStateList);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: k */
    public float mo4818k(AbstractC0818e eVar) {
        return eVar.mo4823b().getElevation();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: l */
    public void mo4819l(AbstractC0818e eVar, float f) {
        m4720n(eVar).mo4833g(f, eVar.mo4824c(), eVar.mo4827f());
        mo4820o(eVar);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: m */
    public void mo4806m() {
    }

    /* renamed from: o */
    public void mo4820o(AbstractC0818e eVar) {
        if (!eVar.mo4824c()) {
            eVar.mo4822a(0, 0, 0, 0);
            return;
        }
        float a = mo4808a(eVar);
        float b = mo4809b(eVar);
        int ceil = (int) Math.ceil((double) C0821h.m4781c(a, b, eVar.mo4827f()));
        int ceil2 = (int) Math.ceil((double) C0821h.m4782d(a, b, eVar.mo4827f()));
        eVar.mo4822a(ceil, ceil2, ceil, ceil2);
    }
}
