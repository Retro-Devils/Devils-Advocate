package p006b.p022e.p026b.p027k;

import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.j */
public class C0872j {

    /* renamed from: a */
    static boolean[] f4379a = new boolean[3];

    /* renamed from: a */
    static void m5201a(C0867f fVar, C0846d dVar, C0864e eVar) {
        eVar.f4311k = -1;
        eVar.f4313l = -1;
        C0864e.EnumC0866b bVar = fVar.f4279N[0];
        C0864e.EnumC0866b bVar2 = C0864e.EnumC0866b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f4279N[0] == C0864e.EnumC0866b.MATCH_PARENT) {
            int i = eVar.f4268C.f4251e;
            int N = fVar.mo5170N() - eVar.f4270E.f4251e;
            C0861d dVar2 = eVar.f4268C;
            dVar2.f4253g = dVar.mo5099q(dVar2);
            C0861d dVar3 = eVar.f4270E;
            dVar3.f4253g = dVar.mo5099q(dVar3);
            dVar.mo5090f(eVar.f4268C.f4253g, i);
            dVar.mo5090f(eVar.f4270E.f4253g, N);
            eVar.f4311k = 2;
            eVar.mo5190h0(i, N);
        }
        if (fVar.f4279N[1] != bVar2 && eVar.f4279N[1] == C0864e.EnumC0866b.MATCH_PARENT) {
            int i2 = eVar.f4269D.f4251e;
            int t = fVar.mo5213t() - eVar.f4271F.f4251e;
            C0861d dVar4 = eVar.f4269D;
            dVar4.f4253g = dVar.mo5099q(dVar4);
            C0861d dVar5 = eVar.f4271F;
            dVar5.f4253g = dVar.mo5099q(dVar5);
            dVar.mo5090f(eVar.f4269D.f4253g, i2);
            dVar.mo5090f(eVar.f4271F.f4253g, t);
            if (eVar.f4291Z > 0 || eVar.mo5169M() == 8) {
                C0861d dVar6 = eVar.f4272G;
                dVar6.f4253g = dVar.mo5099q(dVar6);
                dVar.mo5090f(eVar.f4272G.f4253g, eVar.f4291Z + i2);
            }
            eVar.f4313l = 2;
            eVar.mo5220w0(i2, t);
        }
    }

    /* renamed from: b */
    public static final boolean m5202b(int i, int i2) {
        return (i & i2) == i2;
    }
}
