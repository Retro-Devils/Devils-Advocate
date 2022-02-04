package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.e.b.k.m.f */
public class C0882f implements AbstractC0880d {

    /* renamed from: a */
    public AbstractC0880d f4418a = null;

    /* renamed from: b */
    public boolean f4419b = false;

    /* renamed from: c */
    public boolean f4420c = false;

    /* renamed from: d */
    AbstractC0892m f4421d;

    /* renamed from: e */
    EnumC0883a f4422e = EnumC0883a.UNKNOWN;

    /* renamed from: f */
    int f4423f;

    /* renamed from: g */
    public int f4424g;

    /* renamed from: h */
    int f4425h = 1;

    /* renamed from: i */
    C0884g f4426i = null;

    /* renamed from: j */
    public boolean f4427j = false;

    /* renamed from: k */
    List<AbstractC0880d> f4428k = new ArrayList();

    /* renamed from: l */
    List<C0882f> f4429l = new ArrayList();

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
        this.f4421d = mVar;
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
        for (C0882f fVar : this.f4429l) {
            if (!fVar.f4427j) {
                return;
            }
        }
        this.f4420c = true;
        AbstractC0880d dVar2 = this.f4418a;
        if (dVar2 != null) {
            dVar2.mo5265a(this);
        }
        if (this.f4419b) {
            this.f4421d.mo5265a(this);
            return;
        }
        C0882f fVar2 = null;
        int i = 0;
        for (C0882f fVar3 : this.f4429l) {
            if (!(fVar3 instanceof C0884g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f4427j) {
            C0884g gVar = this.f4426i;
            if (gVar != null) {
                if (gVar.f4427j) {
                    this.f4423f = this.f4425h * gVar.f4424g;
                } else {
                    return;
                }
            }
            mo5283d(fVar2.f4424g + this.f4423f);
        }
        AbstractC0880d dVar3 = this.f4418a;
        if (dVar3 != null) {
            dVar3.mo5265a(this);
        }
    }

    /* renamed from: b */
    public void mo5281b(AbstractC0880d dVar) {
        this.f4428k.add(dVar);
        if (this.f4427j) {
            dVar.mo5265a(dVar);
        }
    }

    /* renamed from: c */
    public void mo5282c() {
        this.f4429l.clear();
        this.f4428k.clear();
        this.f4427j = false;
        this.f4424g = 0;
        this.f4420c = false;
        this.f4419b = false;
    }

    /* renamed from: d */
    public void mo5283d(int i) {
        if (!this.f4427j) {
            this.f4427j = true;
            this.f4424g = i;
            for (AbstractC0880d dVar : this.f4428k) {
                dVar.mo5265a(dVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4421d.f4454b.mo5205p());
        sb.append(":");
        sb.append(this.f4422e);
        sb.append("(");
        sb.append(this.f4427j ? Integer.valueOf(this.f4424g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4429l.size());
        sb.append(":d=");
        sb.append(this.f4428k.size());
        sb.append(">");
        return sb.toString();
    }
}
