package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.C0867f;
import p006b.p022e.p026b.p027k.C0868g;
import p006b.p022e.p026b.p027k.C0871i;
import p006b.p022e.p026b.p027k.p028m.C0876b;

/* renamed from: b.e.b.k.m.e */
public class C0881e {

    /* renamed from: a */
    private C0867f f4409a;

    /* renamed from: b */
    private boolean f4410b = true;

    /* renamed from: c */
    private boolean f4411c = true;

    /* renamed from: d */
    private C0867f f4412d;

    /* renamed from: e */
    private ArrayList<AbstractC0892m> f4413e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C0889k> f4414f = new ArrayList<>();

    /* renamed from: g */
    private C0876b.AbstractC0878b f4415g = null;

    /* renamed from: h */
    private C0876b.C0877a f4416h = new C0876b.C0877a();

    /* renamed from: i */
    ArrayList<C0889k> f4417i = new ArrayList<>();

    public C0881e(C0867f fVar) {
        this.f4409a = fVar;
        this.f4412d = fVar;
    }

    /* renamed from: a */
    private void m5229a(C0882f fVar, int i, int i2, C0882f fVar2, ArrayList<C0889k> arrayList, C0889k kVar) {
        AbstractC0892m mVar = fVar.f4421d;
        if (mVar.f4455c == null) {
            C0867f fVar3 = this.f4409a;
            if (!(mVar == fVar3.f4301f || mVar == fVar3.f4303g)) {
                if (kVar == null) {
                    kVar = new C0889k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f4455c = kVar;
                kVar.mo5287a(mVar);
                for (AbstractC0880d dVar : mVar.f4460h.f4428k) {
                    if (dVar instanceof C0882f) {
                        m5229a((C0882f) dVar, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (AbstractC0880d dVar2 : mVar.f4461i.f4428k) {
                    if (dVar2 instanceof C0882f) {
                        m5229a((C0882f) dVar2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C0890l)) {
                    for (AbstractC0880d dVar3 : ((C0890l) mVar).f4450k.f4428k) {
                        if (dVar3 instanceof C0882f) {
                            m5229a((C0882f) dVar3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C0882f fVar4 : mVar.f4460h.f4429l) {
                    if (fVar4 == fVar2) {
                        kVar.f4444c = true;
                    }
                    m5229a(fVar4, i, 0, fVar2, arrayList, kVar);
                }
                for (C0882f fVar5 : mVar.f4461i.f4429l) {
                    if (fVar5 == fVar2) {
                        kVar.f4444c = true;
                    }
                    m5229a(fVar5, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C0890l)) {
                    for (C0882f fVar6 : ((C0890l) mVar).f4450k.f4429l) {
                        m5229a(fVar6, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f4317n == 0) goto L_0x0065;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5230b(p006b.p022e.p026b.p027k.C0867f r17) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0881e.m5230b(b.e.b.k.f):boolean");
    }

    /* renamed from: e */
    private int m5231e(C0867f fVar, int i) {
        int size = this.f4417i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f4417i.get(i2).mo5288b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m5232i(AbstractC0892m mVar, int i, ArrayList<C0889k> arrayList) {
        for (AbstractC0880d dVar : mVar.f4460h.f4428k) {
            if (dVar instanceof C0882f) {
                m5229a((C0882f) dVar, i, 0, mVar.f4461i, arrayList, null);
            } else if (dVar instanceof AbstractC0892m) {
                m5229a(((AbstractC0892m) dVar).f4460h, i, 0, mVar.f4461i, arrayList, null);
            }
        }
        for (AbstractC0880d dVar2 : mVar.f4461i.f4428k) {
            if (dVar2 instanceof C0882f) {
                m5229a((C0882f) dVar2, i, 1, mVar.f4460h, arrayList, null);
            } else if (dVar2 instanceof AbstractC0892m) {
                m5229a(((AbstractC0892m) dVar2).f4461i, i, 1, mVar.f4460h, arrayList, null);
            }
        }
        if (i == 1) {
            for (AbstractC0880d dVar3 : ((C0890l) mVar).f4450k.f4428k) {
                if (dVar3 instanceof C0882f) {
                    m5229a((C0882f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m5233l(C0864e eVar, C0864e.EnumC0866b bVar, int i, C0864e.EnumC0866b bVar2, int i2) {
        C0876b.C0877a aVar = this.f4416h;
        aVar.f4397a = bVar;
        aVar.f4398b = bVar2;
        aVar.f4399c = i;
        aVar.f4400d = i2;
        this.f4415g.mo1969a(eVar, aVar);
        eVar.mo5153B0(this.f4416h.f4401e);
        eVar.mo5187e0(this.f4416h.f4402f);
        eVar.mo5185d0(this.f4416h.f4404h);
        eVar.mo5180Y(this.f4416h.f4403g);
    }

    /* renamed from: c */
    public void mo5272c() {
        mo5273d(this.f4413e);
        this.f4417i.clear();
        C0889k.f4442a = 0;
        m5232i(this.f4409a.f4301f, 0, this.f4417i);
        m5232i(this.f4409a.f4303g, 1, this.f4417i);
        this.f4410b = false;
    }

    /* renamed from: d */
    public void mo5273d(ArrayList<AbstractC0892m> arrayList) {
        AbstractC0892m iVar;
        arrayList.clear();
        this.f4412d.f4301f.mo5268f();
        this.f4412d.f4303g.mo5268f();
        arrayList.add(this.f4412d.f4301f);
        arrayList.add(this.f4412d.f4303g);
        Iterator<C0864e> it = this.f4412d.f4393w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0864e next = it.next();
            if (next instanceof C0868g) {
                iVar = new C0885h(next);
            } else {
                if (next.mo5175T()) {
                    if (next.f4297d == null) {
                        next.f4297d = new C0879c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4297d);
                } else {
                    arrayList.add(next.f4301f);
                }
                if (next.mo5177V()) {
                    if (next.f4299e == null) {
                        next.f4299e = new C0879c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4299e);
                } else {
                    arrayList.add(next.f4303g);
                }
                if (next instanceof C0871i) {
                    iVar = new C0886i(next);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0892m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo5268f();
        }
        Iterator<AbstractC0892m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0892m next2 = it3.next();
            if (next2.f4454b != this.f4412d) {
                next2.mo5266d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo5274f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f4410b || this.f4411c) {
            Iterator<C0864e> it = this.f4409a.f4393w0.iterator();
            while (it.hasNext()) {
                C0864e next = it.next();
                next.f4293b = false;
                next.f4301f.mo5285r();
                next.f4303g.mo5289q();
            }
            C0867f fVar = this.f4409a;
            fVar.f4293b = false;
            fVar.f4301f.mo5285r();
            this.f4409a.f4303g.mo5289q();
            this.f4411c = false;
        }
        if (m5230b(this.f4412d)) {
            return false;
        }
        this.f4409a.mo5155C0(0);
        this.f4409a.mo5157D0(0);
        C0864e.EnumC0866b q = this.f4409a.mo5207q(0);
        C0864e.EnumC0866b q2 = this.f4409a.mo5207q(1);
        if (this.f4410b) {
            mo5272c();
        }
        int O = this.f4409a.mo5171O();
        int P = this.f4409a.mo5172P();
        this.f4409a.f4301f.f4460h.mo5283d(O);
        this.f4409a.f4303g.f4460h.mo5283d(P);
        mo5279m();
        C0864e.EnumC0866b bVar = C0864e.EnumC0866b.WRAP_CONTENT;
        if (q == bVar || q2 == bVar) {
            if (z4) {
                Iterator<AbstractC0892m> it2 = this.f4413e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo5270m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && q == C0864e.EnumC0866b.WRAP_CONTENT) {
                this.f4409a.mo5192i0(C0864e.EnumC0866b.FIXED);
                C0867f fVar2 = this.f4409a;
                fVar2.mo5153B0(m5231e(fVar2, 0));
                C0867f fVar3 = this.f4409a;
                fVar3.f4301f.f4457e.mo5283d(fVar3.mo5170N());
            }
            if (z4 && q2 == C0864e.EnumC0866b.WRAP_CONTENT) {
                this.f4409a.mo5222x0(C0864e.EnumC0866b.FIXED);
                C0867f fVar4 = this.f4409a;
                fVar4.mo5187e0(m5231e(fVar4, 1));
                C0867f fVar5 = this.f4409a;
                fVar5.f4303g.f4457e.mo5283d(fVar5.mo5213t());
            }
        }
        C0867f fVar6 = this.f4409a;
        C0864e.EnumC0866b[] bVarArr = fVar6.f4279N;
        C0864e.EnumC0866b bVar2 = bVarArr[0];
        C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C0864e.EnumC0866b.MATCH_PARENT) {
            int N = fVar6.mo5170N() + O;
            this.f4409a.f4301f.f4461i.mo5283d(N);
            this.f4409a.f4301f.f4457e.mo5283d(N - O);
            mo5279m();
            C0867f fVar7 = this.f4409a;
            C0864e.EnumC0866b[] bVarArr2 = fVar7.f4279N;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C0864e.EnumC0866b.MATCH_PARENT) {
                int t = fVar7.mo5213t() + P;
                this.f4409a.f4303g.f4461i.mo5283d(t);
                this.f4409a.f4303g.f4457e.mo5283d(t - P);
            }
            mo5279m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<AbstractC0892m> it3 = this.f4413e.iterator();
        while (it3.hasNext()) {
            AbstractC0892m next2 = it3.next();
            if (next2.f4454b != this.f4409a || next2.f4459g) {
                next2.mo5267e();
            }
        }
        Iterator<AbstractC0892m> it4 = this.f4413e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            AbstractC0892m next3 = it4.next();
            if ((z2 || next3.f4454b != this.f4409a) && (!next3.f4460h.f4427j || ((!next3.f4461i.f4427j && !(next3 instanceof C0885h)) || (!next3.f4457e.f4427j && !(next3 instanceof C0879c) && !(next3 instanceof C0885h))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f4409a.mo5192i0(q);
        this.f4409a.mo5222x0(q2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo5275g(boolean z) {
        if (this.f4410b) {
            Iterator<C0864e> it = this.f4409a.f4393w0.iterator();
            while (it.hasNext()) {
                C0864e next = it.next();
                next.f4293b = false;
                C0887j jVar = next.f4301f;
                jVar.f4457e.f4427j = false;
                jVar.f4459g = false;
                jVar.mo5285r();
                C0890l lVar = next.f4303g;
                lVar.f4457e.f4427j = false;
                lVar.f4459g = false;
                lVar.mo5289q();
            }
            C0867f fVar = this.f4409a;
            fVar.f4293b = false;
            C0887j jVar2 = fVar.f4301f;
            jVar2.f4457e.f4427j = false;
            jVar2.f4459g = false;
            jVar2.mo5285r();
            C0890l lVar2 = this.f4409a.f4303g;
            lVar2.f4457e.f4427j = false;
            lVar2.f4459g = false;
            lVar2.mo5289q();
            mo5272c();
        }
        if (m5230b(this.f4412d)) {
            return false;
        }
        this.f4409a.mo5155C0(0);
        this.f4409a.mo5157D0(0);
        this.f4409a.f4301f.f4460h.mo5283d(0);
        this.f4409a.f4303g.f4460h.mo5283d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e A[EDGE_INSN: B:78:0x013e->B:64:0x013e ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5276h(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0881e.mo5276h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo5277j() {
        this.f4410b = true;
    }

    /* renamed from: k */
    public void mo5278k() {
        this.f4411c = true;
    }

    /* renamed from: m */
    public void mo5279m() {
        C0884g gVar;
        C0884g gVar2;
        int N;
        C0884g gVar3;
        int N2;
        Iterator<C0864e> it = this.f4409a.f4393w0.iterator();
        while (it.hasNext()) {
            C0864e next = it.next();
            if (!next.f4293b) {
                C0864e.EnumC0866b[] bVarArr = next.f4279N;
                boolean z = false;
                C0864e.EnumC0866b bVar = bVarArr[0];
                C0864e.EnumC0866b bVar2 = bVarArr[1];
                int i = next.f4315m;
                int i2 = next.f4317n;
                C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C0864e.EnumC0866b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C0864e.EnumC0866b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C0884g gVar4 = next.f4301f.f4457e;
                boolean z3 = gVar4.f4427j;
                C0884g gVar5 = next.f4303g.f4457e;
                boolean z4 = gVar5.f4427j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            m5233l(next, bVar3, gVar4.f4424g, C0864e.EnumC0866b.FIXED, gVar5.f4424g);
                            if (bVar == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
                                gVar3 = next.f4301f.f4457e;
                                N2 = next.mo5170N();
                            } else {
                                gVar2 = next.f4301f.f4457e;
                                N = next.mo5170N();
                                gVar2.mo5283d(N);
                            }
                        }
                        if (next.f4293b && (gVar = next.f4303g.f4451l) != null) {
                            gVar.mo5283d(next.mo5197l());
                        }
                    } else {
                        m5233l(next, C0864e.EnumC0866b.FIXED, gVar4.f4424g, bVar3, gVar5.f4424g);
                        if (bVar2 == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
                            gVar3 = next.f4303g.f4457e;
                            N2 = next.mo5213t();
                        } else {
                            gVar2 = next.f4303g.f4457e;
                            N = next.mo5213t();
                            gVar2.mo5283d(N);
                        }
                    }
                    gVar3.f4439m = N2;
                    gVar.mo5283d(next.mo5197l());
                } else {
                    C0864e.EnumC0866b bVar4 = C0864e.EnumC0866b.FIXED;
                    m5233l(next, bVar4, gVar4.f4424g, bVar4, gVar5.f4424g);
                }
                next.f4293b = true;
                gVar.mo5283d(next.mo5197l());
            }
        }
    }

    /* renamed from: n */
    public void mo5280n(C0876b.AbstractC0878b bVar) {
        this.f4415g = bVar;
    }
}
