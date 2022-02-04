package p006b.p060q;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0490q;
import java.util.ArrayList;
import java.util.List;
import p006b.p060q.AbstractC1142m;

@SuppressLint({"RestrictedApi"})
/* renamed from: b.q.e */
public class C1119e extends AbstractC0490q {

    /* renamed from: b.q.e$a */
    class C1120a extends AbstractC1142m.AbstractC1147e {

        /* renamed from: a */
        final /* synthetic */ Rect f5079a;

        C1120a(Rect rect) {
            this.f5079a = rect;
        }
    }

    /* renamed from: b.q.e$b */
    class C1121b implements AbstractC1142m.AbstractC1148f {

        /* renamed from: a */
        final /* synthetic */ View f5081a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5082b;

        C1121b(View view, ArrayList arrayList) {
            this.f5081a = view;
            this.f5082b = arrayList;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: a */
        public void mo5762a(AbstractC1142m mVar) {
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: b */
        public void mo5763b(AbstractC1142m mVar) {
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: c */
        public void mo5784c(AbstractC1142m mVar) {
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: d */
        public void mo5764d(AbstractC1142m mVar) {
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            mVar.mo5816P(this);
            this.f5081a.setVisibility(8);
            int size = this.f5082b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5082b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: b.q.e$c */
    class C1122c extends C1150n {

        /* renamed from: a */
        final /* synthetic */ Object f5084a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5085b;

        /* renamed from: c */
        final /* synthetic */ Object f5086c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5087d;

        /* renamed from: e */
        final /* synthetic */ Object f5088e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5089f;

        C1122c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5084a = obj;
            this.f5085b = arrayList;
            this.f5086c = obj2;
            this.f5087d = arrayList2;
            this.f5088e = obj3;
            this.f5089f = arrayList3;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: c */
        public void mo5784c(AbstractC1142m mVar) {
            Object obj = this.f5084a;
            if (obj != null) {
                C1119e.this.mo2886q(obj, this.f5085b, null);
            }
            Object obj2 = this.f5086c;
            if (obj2 != null) {
                C1119e.this.mo2886q(obj2, this.f5087d, null);
            }
            Object obj3 = this.f5088e;
            if (obj3 != null) {
                C1119e.this.mo2886q(obj3, this.f5089f, null);
            }
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            mVar.mo5816P(this);
        }
    }

    /* renamed from: b.q.e$d */
    class C1123d extends AbstractC1142m.AbstractC1147e {

        /* renamed from: a */
        final /* synthetic */ Rect f5091a;

        C1123d(Rect rect) {
            this.f5091a = rect;
        }
    }

    /* renamed from: B */
    private static boolean m6191B(AbstractC1142m mVar) {
        return !AbstractC0490q.m2650l(mVar.mo5848z()) || !AbstractC0490q.m2650l(mVar.mo5809A()) || !AbstractC0490q.m2650l(mVar.mo5810B());
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: A */
    public Object mo2877A(Object obj) {
        if (obj == null) {
            return null;
        }
        C1155q qVar = new C1155q();
        qVar.mo5857e0((AbstractC1142m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: a */
    public void mo2878a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1142m) obj).mo5828b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: b */
    public void mo2879b(Object obj, ArrayList<View> arrayList) {
        AbstractC1142m mVar = (AbstractC1142m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C1155q) {
                C1155q qVar = (C1155q) mVar;
                int h0 = qVar.mo5859h0();
                while (i < h0) {
                    mo2879b(qVar.mo5858g0(i), arrayList);
                    i++;
                }
            } else if (!m6191B(mVar) && AbstractC0490q.m2650l(mVar.mo5811C())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo5828b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: c */
    public void mo2880c(ViewGroup viewGroup, Object obj) {
        C1151o.m6330b(viewGroup, (AbstractC1142m) obj);
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: e */
    public boolean mo2881e(Object obj) {
        return obj instanceof AbstractC1142m;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: g */
    public Object mo2882g(Object obj) {
        if (obj != null) {
            return ((AbstractC1142m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: m */
    public Object mo2883m(Object obj, Object obj2, Object obj3) {
        AbstractC1142m mVar = (AbstractC1142m) obj;
        AbstractC1142m mVar2 = (AbstractC1142m) obj2;
        AbstractC1142m mVar3 = (AbstractC1142m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new C1155q().mo5857e0(mVar).mo5857e0(mVar2).mo5864m0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C1155q qVar = new C1155q();
        if (mVar != null) {
            qVar.mo5857e0(mVar);
        }
        qVar.mo5857e0(mVar3);
        return qVar;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: n */
    public Object mo2884n(Object obj, Object obj2, Object obj3) {
        C1155q qVar = new C1155q();
        if (obj != null) {
            qVar.mo5857e0((AbstractC1142m) obj);
        }
        if (obj2 != null) {
            qVar.mo5857e0((AbstractC1142m) obj2);
        }
        if (obj3 != null) {
            qVar.mo5857e0((AbstractC1142m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: p */
    public void mo2885p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1142m) obj).mo5817Q(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: q */
    public void mo2886q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1142m mVar = (AbstractC1142m) obj;
        int i = 0;
        if (mVar instanceof C1155q) {
            C1155q qVar = (C1155q) mVar;
            int h0 = qVar.mo5859h0();
            while (i < h0) {
                mo2886q(qVar.mo5858g0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m6191B(mVar)) {
            List<View> C = mVar.mo5811C();
            if (C.size() == arrayList.size() && C.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.mo5828b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.mo5817Q(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: r */
    public void mo2887r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC1142m) obj).mo5826a(new C1121b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: t */
    public void mo2888t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC1142m) obj).mo5826a(new C1122c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: u */
    public void mo2889u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1142m) obj).mo5821V(new C1123d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: v */
    public void mo2890v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo2907k(view, rect);
            ((AbstractC1142m) obj).mo5821V(new C1120a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: y */
    public void mo2891y(Object obj, View view, ArrayList<View> arrayList) {
        C1155q qVar = (C1155q) obj;
        List<View> C = qVar.mo5811C();
        C.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0490q.m2647d(C, arrayList.get(i));
        }
        C.add(view);
        arrayList.add(view);
        mo2879b(qVar, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: z */
    public void mo2892z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1155q qVar = (C1155q) obj;
        if (qVar != null) {
            qVar.mo5811C().clear();
            qVar.mo5811C().addAll(arrayList2);
            mo2886q(qVar, arrayList, arrayList2);
        }
    }
}
