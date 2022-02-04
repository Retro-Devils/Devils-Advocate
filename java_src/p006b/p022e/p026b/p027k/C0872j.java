package p006b.p022e.p026b.p027k;

import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.j */
public class C0872j {

    /* renamed from: a */
    static boolean[] f4383a = new boolean[3];

    /* renamed from: a */
    static void m5201a(C0867f fVar, C0846d dVar, C0864e eVar) {
        eVar.f4315k = -1;
        eVar.f4317l = -1;
        C0864e.EnumC0866b bVar = fVar.f4283N[0];
        C0864e.EnumC0866b bVar2 = C0864e.EnumC0866b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f4283N[0] == C0864e.EnumC0866b.MATCH_PARENT) {
            int i = eVar.f4272C.f4255e;
            int N = fVar.mo5170N() - eVar.f4274E.f4255e;
            C0861d dVar2 = eVar.f4272C;
            dVar2.f4257g = dVar.mo5099q(dVar2);
            C0861d dVar3 = eVar.f4274E;
            dVar3.f4257g = dVar.mo5099q(dVar3);
            dVar.mo5090f(eVar.f4272C.f4257g, i);
            dVar.mo5090f(eVar.f4274E.f4257g, N);
            eVar.f4315k = 2;
            eVar.mo5190h0(i, N);
        }
        if (fVar.f4283N[1] != bVar2 && eVar.f4283N[1] == C0864e.EnumC0866b.MATCH_PARENT) {
            int i2 = eVar.f4273D.f4255e;
            int t = fVar.mo5213t() - eVar.f4275F.f4255e;
            C0861d dVar4 = eVar.f4273D;
            dVar4.f4257g = dVar.mo5099q(dVar4);
            C0861d dVar5 = eVar.f4275F;
            dVar5.f4257g = dVar.mo5099q(dVar5);
            dVar.mo5090f(eVar.f4273D.f4257g, i2);
            dVar.mo5090f(eVar.f4275F.f4257g, t);
            if (eVar.f4295Z > 0 || eVar.mo5169M() == 8) {
                C0861d dVar6 = eVar.f4276G;
                dVar6.f4257g = dVar.mo5099q(dVar6);
                dVar.mo5090f(eVar.f4276G.f4257g, eVar.f4295Z + i2);
            }
            eVar.f4317l = 2;
            eVar.mo5220w0(i2, t);
        }
    }

    /* renamed from: b */
    public static final boolean m5202b(int i, int i2) {
        return (i & i2) == i2;
    }
}
