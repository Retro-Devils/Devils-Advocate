package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.e.b.k.m.f */
public class C0882f implements AbstractC0880d {

    /* renamed from: a */
    public AbstractC0880d f4422a = null;

    /* renamed from: b */
    public boolean f4423b = false;

    /* renamed from: c */
    public boolean f4424c = false;

    /* renamed from: d */
    AbstractC0892m f4425d;

    /* renamed from: e */
    EnumC0883a f4426e = EnumC0883a.UNKNOWN;

    /* renamed from: f */
    int f4427f;

    /* renamed from: g */
    public int f4428g;

    /* renamed from: h */
    int f4429h = 1;

    /* renamed from: i */
    C0884g f4430i = null;

    /* renamed from: j */
    public boolean f4431j = false;

    /* renamed from: k */
    List<AbstractC0880d> f4432k = new ArrayList();

    /* renamed from: l */
    List<C0882f> f4433l = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: b.e.b.k.m.f$a */
    public enum EnumC0883a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C0882f(AbstractC0892m mVar) {
        this.f4425d = mVar;
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        for (C0882f fVar : this.f4433l) {
            if (!fVar.f4431j) {
                return;
            }
        }
        this.f4424c = true;
        AbstractC0880d dVar2 = this.f4422a;
        if (dVar2 != null) {
            dVar2.mo5265a(this);
        }
        if (this.f4423b) {
            this.f4425d.mo5265a(this);
            return;
        }
        C0882f fVar2 = null;
        int i = 0;
        for (C0882f fVar3 : this.f4433l) {
            if (!(fVar3 instanceof C0884g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f4431j) {
            C0884g gVar = this.f4430i;
            if (gVar != null) {
                if (gVar.f4431j) {
                    this.f4427f = this.f4429h * gVar.f4428g;
                } else {
                    return;
                }
            }
            mo5283d(fVar2.f4428g + this.f4427f);
        }
        AbstractC0880d dVar3 = this.f4422a;
        if (dVar3 != null) {
            dVar3.mo5265a(this);
        }
    }

    /* renamed from: b */
    public void mo5281b(AbstractC0880d dVar) {
        this.f4432k.add(dVar);
        if (this.f4431j) {
            dVar.mo5265a(dVar);
        }
    }

    /* renamed from: c */
    public void mo5282c() {
        this.f4433l.clear();
        this.f4432k.clear();
        this.f4431j = false;
        this.f4428g = 0;
        this.f4424c = false;
        this.f4423b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4425d.f4458b.mo5205p());
        sb.append(":");
        sb.append(this.f4426e);
        sb.append("(");
        sb.append(this.f4431j ? Integer.valueOf(this.f4428g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4433l.size());
        sb.append(":d=");
        sb.append(this.f4432k.size());
        sb.append(">");
        return sb.toString();
    }
}
