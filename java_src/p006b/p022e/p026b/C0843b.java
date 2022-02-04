package p006b.p022e.p026b;

import java.util.ArrayList;
import java.util.Iterator;
import p006b.p022e.p026b.C0846d;
import p006b.p022e.p026b.C0855i;

/* renamed from: b.e.b.b */
public class C0843b implements C0846d.AbstractC0847a {

    /* renamed from: a */
    C0855i f4143a = null;

    /* renamed from: b */
    float f4144b = 0.0f;

    /* renamed from: c */
    boolean f4145c = false;

    /* renamed from: d */
    ArrayList<C0855i> f4146d = new ArrayList<>();

    /* renamed from: e */
    public AbstractC0844a f4147e;

    /* renamed from: f */
    boolean f4148f = false;

    /* renamed from: b.e.b.b$a */
    public interface AbstractC0844a {
        /* renamed from: a */
        float mo5040a(int i);

        /* renamed from: b */
        float mo5041b(C0843b bVar, boolean z);

        /* renamed from: c */
        void mo5042c(C0855i iVar, float f);

        void clear();

        /* renamed from: d */
        float mo5044d(C0855i iVar, boolean z);

        /* renamed from: e */
        void mo5045e(C0855i iVar, float f, boolean z);

        /* renamed from: f */
        C0855i mo5046f(int i);

        /* renamed from: g */
        float mo5047g(C0855i iVar);

        /* renamed from: h */
        boolean mo5048h(C0855i iVar);

        /* renamed from: i */
        void mo5049i(float f);

        /* renamed from: j */
        void mo5050j();

        /* renamed from: k */
        int mo5051k();
    }

    public C0843b() {
    }

    public C0843b(C0845c cVar) {
        this.f4147e = new C0842a(this, cVar);
    }

    /* renamed from: v */
    private boolean m4933v(C0855i iVar, C0846d dVar) {
        return iVar.f4200n <= 1;
    }

    /* renamed from: x */
    private C0855i m4934x(boolean[] zArr, C0855i iVar) {
        C0855i.EnumC0856a aVar;
        int k = this.f4147e.mo5051k();
        C0855i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < k; i++) {
            float a = this.f4147e.mo5040a(i);
            if (a < 0.0f) {
                C0855i f2 = this.f4147e.mo5046f(i);
                if ((zArr == null || !zArr[f2.f4190d]) && f2 != iVar && (((aVar = f2.f4197k) == C0855i.EnumC0856a.SLACK || aVar == C0855i.EnumC0856a.ERROR) && a < f)) {
                    f = a;
                    iVar2 = f2;
                }
            }
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo5053A() {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.C0843b.mo5053A():java.lang.String");
    }

    /* renamed from: B */
    public void mo5054B(C0846d dVar, C0855i iVar, boolean z) {
        if (iVar.f4194h) {
            this.f4144b += iVar.f4193g * this.f4147e.mo5047g(iVar);
            this.f4147e.mo5044d(iVar, z);
            if (z) {
                iVar.mo5118c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo5055C(C0843b bVar, boolean z) {
        this.f4144b += bVar.f4144b * this.f4147e.mo5041b(bVar, z);
        if (z) {
            bVar.f4143a.mo5118c(this);
        }
    }

    /* renamed from: D */
    public void mo5056D(C0846d dVar) {
        if (dVar.f4163k.length != 0) {
            boolean z = false;
            while (!z) {
                int k = this.f4147e.mo5051k();
                for (int i = 0; i < k; i++) {
                    C0855i f = this.f4147e.mo5046f(i);
                    if (f.f4191e != -1 || f.f4194h) {
                        this.f4146d.add(f);
                    }
                }
                if (this.f4146d.size() > 0) {
                    Iterator<C0855i> it = this.f4146d.iterator();
                    while (it.hasNext()) {
                        C0855i next = it.next();
                        if (next.f4194h) {
                            mo5054B(dVar, next, true);
                        } else {
                            mo5055C(dVar.f4163k[next.f4191e], true);
                        }
                    }
                    this.f4146d.clear();
                } else {
                    z = true;
                }
            }
        }
    }

    @Override // p006b.p022e.p026b.C0846d.AbstractC0847a
    /* renamed from: a */
    public void mo5057a(C0846d.AbstractC0847a aVar) {
        if (aVar instanceof C0843b) {
            C0843b bVar = (C0843b) aVar;
            this.f4143a = null;
            this.f4147e.clear();
            for (int i = 0; i < bVar.f4147e.mo5051k(); i++) {
                this.f4147e.mo5045e(bVar.f4147e.mo5046f(i), bVar.f4147e.mo5040a(i), true);
            }
        }
    }

    @Override // p006b.p022e.p026b.C0846d.AbstractC0847a
    /* renamed from: b */
    public void mo5058b(C0855i iVar) {
        int i = iVar.f4192f;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f4147e.mo5042c(iVar, f);
    }

    @Override // p006b.p022e.p026b.C0846d.AbstractC0847a
    /* renamed from: c */
    public C0855i mo5059c(C0846d dVar, boolean[] zArr) {
        return m4934x(zArr, null);
    }

    @Override // p006b.p022e.p026b.C0846d.AbstractC0847a
    public void clear() {
        this.f4147e.clear();
        this.f4143a = null;
        this.f4144b = 0.0f;
    }

    /* renamed from: d */
    public C0843b mo5061d(C0846d dVar, int i) {
        this.f4147e.mo5042c(dVar.mo5097o(i, "ep"), 1.0f);
        this.f4147e.mo5042c(dVar.mo5097o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0843b mo5062e(C0855i iVar, int i) {
        this.f4147e.mo5042c(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo5063f(C0846d dVar) {
        boolean z;
        C0855i g = mo5064g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo5082y(g);
            z = false;
        }
        if (this.f4147e.mo5051k() == 0) {
            this.f4148f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0855i mo5064g(C0846d dVar) {
        int k = this.f4147e.mo5051k();
        C0855i iVar = null;
        C0855i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < k; i++) {
            float a = this.f4147e.mo5040a(i);
            C0855i f3 = this.f4147e.mo5046f(i);
            if (f3.f4197k == C0855i.EnumC0856a.UNRESTRICTED) {
                if (iVar == null || f > a) {
                    z = m4933v(f3, dVar);
                    f = a;
                    iVar = f3;
                } else if (!z && m4933v(f3, dVar)) {
                    f = a;
                    iVar = f3;
                    z = true;
                }
            } else if (iVar == null && a < 0.0f) {
                if (iVar2 == null || f2 > a) {
                    z2 = m4933v(f3, dVar);
                    f2 = a;
                    iVar2 = f3;
                } else if (!z2 && m4933v(f3, dVar)) {
                    f2 = a;
                    iVar2 = f3;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // p006b.p022e.p026b.C0846d.AbstractC0847a
    public C0855i getKey() {
        return this.f4143a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0843b mo5066h(C0855i iVar, C0855i iVar2, int i, float f, C0855i iVar3, C0855i iVar4, int i2) {
        float f2;
        int i3;
        if (iVar2 == iVar3) {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar4, 1.0f);
            this.f4147e.mo5042c(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
            this.f4147e.mo5042c(iVar3, -1.0f);
            this.f4147e.mo5042c(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
            }
            return this;
        }
        if (f <= 0.0f) {
            this.f4147e.mo5042c(iVar, -1.0f);
            this.f4147e.mo5042c(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f4147e.mo5042c(iVar4, -1.0f);
            this.f4147e.mo5042c(iVar3, 1.0f);
            i3 = -i2;
        } else {
            float f3 = 1.0f - f;
            this.f4147e.mo5042c(iVar, f3 * 1.0f);
            this.f4147e.mo5042c(iVar2, f3 * -1.0f);
            this.f4147e.mo5042c(iVar3, -1.0f * f);
            this.f4147e.mo5042c(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f4144b = f2;
        return this;
        f2 = (float) i3;
        this.f4144b = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0843b mo5067i(C0855i iVar, int i) {
        this.f4143a = iVar;
        float f = (float) i;
        iVar.f4193g = f;
        this.f4144b = f;
        this.f4148f = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0843b mo5068j(C0855i iVar, C0855i iVar2, float f) {
        this.f4147e.mo5042c(iVar, -1.0f);
        this.f4147e.mo5042c(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C0843b mo5069k(C0855i iVar, C0855i iVar2, C0855i iVar3, C0855i iVar4, float f) {
        this.f4147e.mo5042c(iVar, -1.0f);
        this.f4147e.mo5042c(iVar2, 1.0f);
        this.f4147e.mo5042c(iVar3, f);
        this.f4147e.mo5042c(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C0843b mo5070l(float f, float f2, float f3, C0855i iVar, C0855i iVar2, C0855i iVar3, C0855i iVar4) {
        this.f4144b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
            this.f4147e.mo5042c(iVar4, 1.0f);
            this.f4147e.mo5042c(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f4147e.mo5042c(iVar3, 1.0f);
            this.f4147e.mo5042c(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
            this.f4147e.mo5042c(iVar4, f4);
            this.f4147e.mo5042c(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C0843b mo5071m(C0855i iVar, int i) {
        AbstractC0844a aVar;
        float f;
        if (i < 0) {
            this.f4144b = (float) (i * -1);
            aVar = this.f4147e;
            f = 1.0f;
        } else {
            this.f4144b = (float) i;
            aVar = this.f4147e;
            f = -1.0f;
        }
        aVar.mo5042c(iVar, f);
        return this;
    }

    /* renamed from: n */
    public C0843b mo5072n(C0855i iVar, C0855i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4144b = (float) i;
        }
        if (!z) {
            this.f4147e.mo5042c(iVar, -1.0f);
            this.f4147e.mo5042c(iVar2, 1.0f);
        } else {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0843b mo5073o(C0855i iVar, C0855i iVar2, C0855i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4144b = (float) i;
        }
        if (!z) {
            this.f4147e.mo5042c(iVar, -1.0f);
            this.f4147e.mo5042c(iVar2, 1.0f);
            this.f4147e.mo5042c(iVar3, 1.0f);
        } else {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
            this.f4147e.mo5042c(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C0843b mo5074p(C0855i iVar, C0855i iVar2, C0855i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4144b = (float) i;
        }
        if (!z) {
            this.f4147e.mo5042c(iVar, -1.0f);
            this.f4147e.mo5042c(iVar2, 1.0f);
            this.f4147e.mo5042c(iVar3, -1.0f);
        } else {
            this.f4147e.mo5042c(iVar, 1.0f);
            this.f4147e.mo5042c(iVar2, -1.0f);
            this.f4147e.mo5042c(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C0843b mo5075q(C0855i iVar, C0855i iVar2, C0855i iVar3, C0855i iVar4, float f) {
        this.f4147e.mo5042c(iVar3, 0.5f);
        this.f4147e.mo5042c(iVar4, 0.5f);
        this.f4147e.mo5042c(iVar, -0.5f);
        this.f4147e.mo5042c(iVar2, -0.5f);
        this.f4144b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5076r() {
        float f = this.f4144b;
        if (f < 0.0f) {
            this.f4144b = f * -1.0f;
            this.f4147e.mo5050j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5077s() {
        C0855i iVar = this.f4143a;
        return iVar != null && (iVar.f4197k == C0855i.EnumC0856a.UNRESTRICTED || this.f4144b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5078t(C0855i iVar) {
        return this.f4147e.mo5048h(iVar);
    }

    public String toString() {
        return mo5053A();
    }

    /* renamed from: u */
    public boolean mo5080u() {
        return this.f4143a == null && this.f4144b == 0.0f && this.f4147e.mo5051k() == 0;
    }

    /* renamed from: w */
    public C0855i mo5081w(C0855i iVar) {
        return m4934x(null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5082y(C0855i iVar) {
        C0855i iVar2 = this.f4143a;
        if (iVar2 != null) {
            this.f4147e.mo5042c(iVar2, -1.0f);
            this.f4143a = null;
        }
        float d = this.f4147e.mo5044d(iVar, true) * -1.0f;
        this.f4143a = iVar;
        if (d != 1.0f) {
            this.f4144b /= d;
            this.f4147e.mo5049i(d);
        }
    }

    /* renamed from: z */
    public void mo5083z() {
        this.f4143a = null;
        this.f4147e.clear();
        this.f4144b = 0.0f;
        this.f4148f = false;
    }
}
