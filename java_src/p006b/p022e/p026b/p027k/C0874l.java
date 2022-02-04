package p006b.p022e.p026b.p027k;

import java.util.ArrayList;
import p006b.p022e.p026b.C0845c;

/* renamed from: b.e.b.k.l */
public class C0874l extends C0864e {

    /* renamed from: w0 */
    public ArrayList<C0864e> f4397w0 = new ArrayList<>();

    /* renamed from: H0 */
    public void mo5227H0() {
        ArrayList<C0864e> arrayList = this.f4397w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0864e eVar = this.f4397w0.get(i);
                if (eVar instanceof C0874l) {
                    ((C0874l) eVar).mo5227H0();
                }
            }
        }
    }

    /* renamed from: I0 */
    public void mo5260I0(C0864e eVar) {
        this.f4397w0.remove(eVar);
        eVar.mo5214t0(null);
    }

    /* renamed from: J0 */
    public void mo5261J0() {
        this.f4397w0.clear();
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: W */
    public void mo5178W() {
        this.f4397w0.clear();
        super.mo5178W();
    }

    @Override // p006b.p022e.p026b.p027k.C0864e
    /* renamed from: X */
    public void mo5179X(C0845c cVar) {
        super.mo5179X(cVar);
        int size = this.f4397w0.size();
        for (int i = 0; i < size; i++) {
            this.f4397w0.get(i).mo5179X(cVar);
        }
    }

    /* renamed from: a */
    public void mo5262a(C0864e eVar) {
        this.f4397w0.add(eVar);
        if (eVar.mo5158E() != null) {
            ((C0874l) eVar.mo5158E()).mo5260I0(eVar);
        }
        eVar.mo5214t0(this);
    }
}
