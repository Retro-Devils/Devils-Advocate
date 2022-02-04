package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import java.util.Iterator;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.C0867f;

/* renamed from: b.e.b.k.m.c */
public class C0879c extends AbstractC0892m {

    /* renamed from: k */
    ArrayList<AbstractC0892m> f4411k = new ArrayList<>();

    /* renamed from: l */
    private int f4412l;

    public C0879c(C0864e eVar, int i) {
        super(eVar);
        this.f4462f = i;
        m5219q();
    }

    /* renamed from: q */
    private void m5219q() {
        C0864e eVar = this.f4458b;
        do {
            eVar = eVar.mo5160F(this.f4462f);
        } while (eVar != null);
        this.f4458b = eVar;
        this.f4411k.add(eVar.mo5164H(this.f4462f));
        C0864e D = eVar.mo5156D(this.f4462f);
        while (D != null) {
            this.f4411k.add(D.mo5164H(this.f4462f));
            D = D.mo5156D(this.f4462f);
        }
        Iterator<AbstractC0892m> it = this.f4411k.iterator();
        while (it.hasNext()) {
            AbstractC0892m next = it.next();
            int i = this.f4462f;
            if (i == 0) {
                next.f4458b.f4301d = this;
            } else if (i == 1) {
                next.f4458b.f4303e = this;
            }
        }
        if ((this.f4462f == 0 && ((C0867f) this.f4458b.mo5158E()).mo5238W0()) && this.f4411k.size() > 1) {
            ArrayList<AbstractC0892m> arrayList = this.f4411k;
            this.f4458b = arrayList.get(arrayList.size() - 1).f4458b;
        }
        this.f4412l = this.f4462f == 0 ? this.f4458b.mo5217v() : this.f4458b.mo5166J();
    }

    /* renamed from: r */
    private C0864e m5220r() {
        for (int i = 0; i < this.f4411k.size(); i++) {
            AbstractC0892m mVar = this.f4411k.get(i);
            if (mVar.f4458b.mo5169M() != 8) {
                return mVar.f4458b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C0864e m5221s() {
        for (int size = this.f4411k.size() - 1; size >= 0; size--) {
            AbstractC0892m mVar = this.f4411k.get(size);
            if (mVar.f4458b.mo5169M() != 8) {
                return mVar.f4458b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a0, code lost:
        if (r1 != r7) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c6, code lost:
        if (r1 != r7) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m, p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5265a(p006b.p022e.p026b.p027k.p028m.AbstractC0880d r26) {
        /*
        // Method dump skipped, instructions count: 1034
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0879c.mo5265a(b.e.b.k.m.d):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5266d() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.C0879c.mo5266d():void");
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: e */
    public void mo5267e() {
        for (int i = 0; i < this.f4411k.size(); i++) {
            this.f4411k.get(i).mo5267e();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: f */
    public void mo5268f() {
        this.f4459c = null;
        Iterator<AbstractC0892m> it = this.f4411k.iterator();
        while (it.hasNext()) {
            it.next().mo5268f();
        }
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: j */
    public long mo5269j() {
        int size = this.f4411k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0892m mVar = this.f4411k.get(i);
            j = j + ((long) mVar.f4464h.f4427f) + mVar.mo5269j() + ((long) mVar.f4465i.f4427f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0892m
    /* renamed from: m */
    public boolean mo5270m() {
        int size = this.f4411k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f4411k.get(i).mo5270m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f4462f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<AbstractC0892m> it = this.f4411k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
