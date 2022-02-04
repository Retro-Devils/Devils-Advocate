package p006b.p060q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p021d.C0823a;
import p006b.p030g.p039k.C1013s;

/* renamed from: b.q.o */
public class C1151o {

    /* renamed from: a */
    private static AbstractC1142m f5174a = new C1098b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0823a<ViewGroup, ArrayList<AbstractC1142m>>>> f5175b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f5176c = new ArrayList<>();

    /* access modifiers changed from: private */
    /* renamed from: b.q.o$a */
    public static class ViewTreeObserver$OnPreDrawListenerC1152a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        AbstractC1142m f5177b;

        /* renamed from: c */
        ViewGroup f5178c;

        /* renamed from: b.q.o$a$a */
        class C1153a extends C1150n {

            /* renamed from: a */
            final /* synthetic */ C0823a f5179a;

            C1153a(C0823a aVar) {
                this.f5179a = aVar;
            }

            @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
            /* renamed from: e */
            public void mo5765e(AbstractC1142m mVar) {
                ((ArrayList) this.f5179a.get(ViewTreeObserver$OnPreDrawListenerC1152a.this.f5178c)).remove(mVar);
                mVar.mo5816P(this);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC1152a(AbstractC1142m mVar, ViewGroup viewGroup) {
            this.f5177b = mVar;
            this.f5178c = viewGroup;
        }

        /* renamed from: a */
        private void m6334a() {
            this.f5178c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5178c.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m6334a();
            if (!C1151o.f5176c.remove(this.f5178c)) {
                return true;
            }
            C0823a<ViewGroup, ArrayList<AbstractC1142m>> c = C1151o.m6331c();
            ArrayList<AbstractC1142m> arrayList = c.get(this.f5178c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c.put(this.f5178c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f5177b);
            this.f5177b.mo5826a(new C1153a(c));
            this.f5177b.mo5834k(this.f5178c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1142m) it.next()).mo5818R(this.f5178c);
                }
            }
            this.f5177b.mo5815O(this.f5178c);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m6334a();
            C1151o.f5176c.remove(this.f5178c);
            ArrayList<AbstractC1142m> arrayList = C1151o.m6331c().get(this.f5178c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC1142m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo5818R(this.f5178c);
                }
            }
            this.f5177b.mo5835l(true);
        }
    }

    /* renamed from: a */
    public static void m6329a(ViewGroup viewGroup) {
        m6330b(viewGroup, null);
    }

    /* renamed from: b */
    public static void m6330b(ViewGroup viewGroup, AbstractC1142m mVar) {
        if (!f5176c.contains(viewGroup) && C1013s.m5737O(viewGroup)) {
            f5176c.add(viewGroup);
            if (mVar == null) {
                mVar = f5174a;
            }
            AbstractC1142m m = mVar.clone();
            m6333e(viewGroup, m);
            C1140l.m6263c(viewGroup, null);
            m6332d(viewGroup, m);
        }
    }

    /* renamed from: c */
    static C0823a<ViewGroup, ArrayList<AbstractC1142m>> m6331c() {
        C0823a<ViewGroup, ArrayList<AbstractC1142m>> aVar;
        WeakReference<C0823a<ViewGroup, ArrayList<AbstractC1142m>>> weakReference = f5175b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        C0823a<ViewGroup, ArrayList<AbstractC1142m>> aVar2 = new C0823a<>();
        f5175b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* renamed from: d */
    private static void m6332d(ViewGroup viewGroup, AbstractC1142m mVar) {
        if (mVar != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC1152a aVar = new ViewTreeObserver$OnPreDrawListenerC1152a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: e */
    private static void m6333e(ViewGroup viewGroup, AbstractC1142m mVar) {
        ArrayList<AbstractC1142m> arrayList = m6331c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1142m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo5814N(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo5834k(viewGroup, true);
        }
        C1140l b = C1140l.m6262b(viewGroup);
        if (b != null) {
            b.mo5806a();
        }
    }
}
