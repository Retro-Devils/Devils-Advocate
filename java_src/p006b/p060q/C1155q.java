package p006b.p060q;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p060q.AbstractC1142m;

/* renamed from: b.q.q */
public class C1155q extends AbstractC1142m {

    /* renamed from: L */
    private ArrayList<AbstractC1142m> f5174L = new ArrayList<>();

    /* renamed from: M */
    private boolean f5175M = true;

    /* renamed from: N */
    int f5176N;

    /* renamed from: O */
    boolean f5177O = false;

    /* renamed from: P */
    private int f5178P = 0;

    /* renamed from: b.q.q$a */
    class C1156a extends C1150n {

        /* renamed from: a */
        final /* synthetic */ AbstractC1142m f5179a;

        C1156a(AbstractC1142m mVar) {
            this.f5179a = mVar;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            this.f5179a.mo5819T();
            mVar.mo5816P(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.q.q$b */
    public static class C1157b extends C1150n {

        /* renamed from: a */
        C1155q f5181a;

        C1157b(C1155q qVar) {
            this.f5181a = qVar;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: c */
        public void mo5784c(AbstractC1142m mVar) {
            C1155q qVar = this.f5181a;
            if (!qVar.f5177O) {
                qVar.mo5827a0();
                this.f5181a.f5177O = true;
            }
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            C1155q qVar = this.f5181a;
            int i = qVar.f5176N - 1;
            qVar.f5176N = i;
            if (i == 0) {
                qVar.f5177O = false;
                qVar.mo5838p();
            }
            mVar.mo5816P(this);
        }
    }

    /* renamed from: f0 */
    private void m6336f0(AbstractC1142m mVar) {
        this.f5174L.add(mVar);
        mVar.f5154v = this;
    }

    /* renamed from: o0 */
    private void m6337o0() {
        C1157b bVar = new C1157b(this);
        Iterator<AbstractC1142m> it = this.f5174L.iterator();
        while (it.hasNext()) {
            it.next().mo5826a(bVar);
        }
        this.f5176N = this.f5174L.size();
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: N */
    public void mo5814N(View view) {
        super.mo5814N(view);
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            this.f5174L.get(i).mo5814N(view);
        }
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: R */
    public void mo5818R(View view) {
        super.mo5818R(view);
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            this.f5174L.get(i).mo5818R(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: T */
    public void mo5819T() {
        if (this.f5174L.isEmpty()) {
            mo5827a0();
            mo5838p();
            return;
        }
        m6337o0();
        if (!this.f5175M) {
            for (int i = 1; i < this.f5174L.size(); i++) {
                this.f5174L.get(i - 1).mo5826a(new C1156a(this.f5174L.get(i)));
            }
            AbstractC1142m mVar = this.f5174L.get(0);
            if (mVar != null) {
                mVar.mo5819T();
                return;
            }
            return;
        }
        Iterator<AbstractC1142m> it = this.f5174L.iterator();
        while (it.hasNext()) {
            it.next().mo5819T();
        }
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: V */
    public void mo5821V(AbstractC1142m.AbstractC1147e eVar) {
        super.mo5821V(eVar);
        this.f5178P |= 8;
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            this.f5174L.get(i).mo5821V(eVar);
        }
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: X */
    public void mo5823X(AbstractC1127g gVar) {
        super.mo5823X(gVar);
        this.f5178P |= 4;
        if (this.f5174L != null) {
            for (int i = 0; i < this.f5174L.size(); i++) {
                this.f5174L.get(i).mo5823X(gVar);
            }
        }
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: Y */
    public void mo5824Y(AbstractC1154p pVar) {
        super.mo5824Y(pVar);
        this.f5178P |= 2;
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            this.f5174L.get(i).mo5824Y(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: b0 */
    public String mo5829b0(String str) {
        String b0 = super.mo5829b0(str);
        for (int i = 0; i < this.f5174L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(b0);
            sb.append("\n");
            sb.append(this.f5174L.get(i).mo5829b0(str + "  "));
            b0 = sb.toString();
        }
        return b0;
    }

    /* renamed from: c0 */
    public C1155q mo5826a(AbstractC1142m.AbstractC1148f fVar) {
        return (C1155q) super.mo5826a(fVar);
    }

    /* renamed from: d0 */
    public C1155q mo5828b(View view) {
        for (int i = 0; i < this.f5174L.size(); i++) {
            this.f5174L.get(i).mo5828b(view);
        }
        return (C1155q) super.mo5828b(view);
    }

    /* renamed from: e0 */
    public C1155q mo5857e0(AbstractC1142m mVar) {
        m6336f0(mVar);
        long j = this.f5139g;
        if (j >= 0) {
            mVar.mo5820U(j);
        }
        if ((this.f5178P & 1) != 0) {
            mVar.mo5822W(mo5841s());
        }
        if ((this.f5178P & 2) != 0) {
            mVar.mo5824Y(mo5846w());
        }
        if ((this.f5178P & 4) != 0) {
            mVar.mo5823X(mo5845v());
        }
        if ((this.f5178P & 8) != 0) {
            mVar.mo5821V(mo5840r());
        }
        return this;
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: g */
    public void mo5732g(C1159s sVar) {
        if (mo5813G(sVar.f5186b)) {
            Iterator<AbstractC1142m> it = this.f5174L.iterator();
            while (it.hasNext()) {
                AbstractC1142m next = it.next();
                if (next.mo5813G(sVar.f5186b)) {
                    next.mo5732g(sVar);
                    sVar.f5187c.add(next);
                }
            }
        }
    }

    /* renamed from: g0 */
    public AbstractC1142m mo5858g0(int i) {
        if (i < 0 || i >= this.f5174L.size()) {
            return null;
        }
        return this.f5174L.get(i);
    }

    /* renamed from: h0 */
    public int mo5859h0() {
        return this.f5174L.size();
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: i */
    public void mo5833i(C1159s sVar) {
        super.mo5833i(sVar);
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            this.f5174L.get(i).mo5833i(sVar);
        }
    }

    /* renamed from: i0 */
    public C1155q mo5816P(AbstractC1142m.AbstractC1148f fVar) {
        return (C1155q) super.mo5816P(fVar);
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: j */
    public void mo5733j(C1159s sVar) {
        if (mo5813G(sVar.f5186b)) {
            Iterator<AbstractC1142m> it = this.f5174L.iterator();
            while (it.hasNext()) {
                AbstractC1142m next = it.next();
                if (next.mo5813G(sVar.f5186b)) {
                    next.mo5733j(sVar);
                    sVar.f5187c.add(next);
                }
            }
        }
    }

    /* renamed from: j0 */
    public C1155q mo5817Q(View view) {
        for (int i = 0; i < this.f5174L.size(); i++) {
            this.f5174L.get(i).mo5817Q(view);
        }
        return (C1155q) super.mo5817Q(view);
    }

    /* renamed from: k0 */
    public C1155q mo5820U(long j) {
        ArrayList<AbstractC1142m> arrayList;
        super.mo5820U(j);
        if (this.f5139g >= 0 && (arrayList = this.f5174L) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5174L.get(i).mo5820U(j);
            }
        }
        return this;
    }

    /* renamed from: l0 */
    public C1155q mo5822W(TimeInterpolator timeInterpolator) {
        this.f5178P |= 1;
        ArrayList<AbstractC1142m> arrayList = this.f5174L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5174L.get(i).mo5822W(timeInterpolator);
            }
        }
        return (C1155q) super.mo5822W(timeInterpolator);
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: m */
    public AbstractC1142m clone() {
        C1155q qVar = (C1155q) super.clone();
        qVar.f5174L = new ArrayList<>();
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            qVar.m6336f0(this.f5174L.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: m0 */
    public C1155q mo5864m0(int i) {
        if (i == 0) {
            this.f5175M = true;
        } else if (i == 1) {
            this.f5175M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: n0 */
    public C1155q mo5825Z(long j) {
        return (C1155q) super.mo5825Z(j);
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: o */
    public void mo5837o(ViewGroup viewGroup, C1160t tVar, C1160t tVar2, ArrayList<C1159s> arrayList, ArrayList<C1159s> arrayList2) {
        long y = mo5847y();
        int size = this.f5174L.size();
        for (int i = 0; i < size; i++) {
            AbstractC1142m mVar = this.f5174L.get(i);
            if (y > 0 && (this.f5175M || i == 0)) {
                long y2 = mVar.mo5847y();
                if (y2 > 0) {
                    mVar.mo5825Z(y2 + y);
                } else {
                    mVar.mo5825Z(y);
                }
            }
            mVar.mo5837o(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
