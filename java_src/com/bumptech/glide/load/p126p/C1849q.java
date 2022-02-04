package com.bumptech.glide.load.p126p;

import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p122o.C1787q;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p144t.C2081j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006b.p030g.p038j.AbstractC0958f;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.p.q */
public class C1849q<Model, Data> implements AbstractC1843n<Model, Data> {

    /* renamed from: a */
    private final List<AbstractC1843n<Model, Data>> f7096a;

    /* renamed from: b */
    private final AbstractC0958f<List<Throwable>> f7097b;

    /* renamed from: com.bumptech.glide.load.p.q$a */
    static class C1850a<Data> implements AbstractC1655d<Data>, AbstractC1655d.AbstractC1656a<Data> {

        /* renamed from: b */
        private final List<AbstractC1655d<Data>> f7098b;

        /* renamed from: c */
        private final AbstractC0958f<List<Throwable>> f7099c;

        /* renamed from: d */
        private int f7100d = 0;

        /* renamed from: e */
        private EnumC1616g f7101e;

        /* renamed from: f */
        private AbstractC1655d.AbstractC1656a<? super Data> f7102f;

        /* renamed from: g */
        private List<Throwable> f7103g;

        /* renamed from: h */
        private boolean f7104h;

        C1850a(List<AbstractC1655d<Data>> list, AbstractC0958f<List<Throwable>> fVar) {
            this.f7099c = fVar;
            C2081j.m9431c(list);
            this.f7098b = list;
        }

        /* renamed from: g */
        private void m8519g() {
            if (!this.f7104h) {
                if (this.f7100d < this.f7098b.size() - 1) {
                    this.f7100d++;
                    mo7101e(this.f7101e, this.f7102f);
                    return;
                }
                C2081j.m9432d(this.f7103g);
                this.f7102f.mo7108d(new C1787q("Fetch failed", new ArrayList(this.f7103g)));
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<Data> mo7092a() {
            return this.f7098b.get(0).mo7092a();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
            List<Throwable> list = this.f7103g;
            if (list != null) {
                this.f7099c.mo5398a(list);
            }
            this.f7103g = null;
            for (AbstractC1655d<Data> dVar : this.f7098b) {
                dVar.mo7097b();
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: c */
        public EnumC1630a mo7098c() {
            return this.f7098b.get(0).mo7098c();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        public void cancel() {
            this.f7104h = true;
            for (AbstractC1655d<Data> dVar : this.f7098b) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
        /* renamed from: d */
        public void mo7108d(Exception exc) {
            ((List) C2081j.m9432d(this.f7103g)).add(exc);
            m8519g();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: e */
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super Data> aVar) {
            this.f7101e = gVar;
            this.f7102f = aVar;
            this.f7103g = this.f7099c.mo5399b();
            this.f7098b.get(this.f7100d).mo7101e(gVar, this);
            if (this.f7104h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
        /* renamed from: f */
        public void mo7109f(Data data) {
            if (data != null) {
                this.f7102f.mo7109f(data);
            } else {
                m8519g();
            }
        }
    }

    C1849q(List<AbstractC1843n<Model, Data>> list, AbstractC0958f<List<Throwable>> fVar) {
        this.f7096a = list;
        this.f7097b = fVar;
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1843n
    /* renamed from: a */
    public AbstractC1843n.C1844a<Data> mo7393a(Model model, int i, int i2, C1647i iVar) {
        AbstractC1843n.C1844a<Data> a;
        int size = this.f7096a.size();
        ArrayList arrayList = new ArrayList(size);
        AbstractC1643g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1843n<Model, Data> nVar = this.f7096a.get(i3);
            if (nVar.mo7394b(model) && (a = nVar.mo7393a(model, i, i2, iVar)) != null) {
                gVar = a.f7089a;
                arrayList.add(a.f7091c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new AbstractC1843n.C1844a<>(gVar, new C1850a(arrayList, this.f7097b));
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1843n
    /* renamed from: b */
    public boolean mo7394b(Model model) {
        for (AbstractC1843n<Model, Data> nVar : this.f7096a) {
            if (nVar.mo7394b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f7096a.toArray()) + '}';
    }
}
