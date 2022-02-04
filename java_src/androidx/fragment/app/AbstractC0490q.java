package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1026u;
import p006b.p030g.p039k.ViewTreeObserver$OnPreDrawListenerC1011q;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.q */
public abstract class AbstractC0490q {

    /* renamed from: androidx.fragment.app.q$a */
    class RunnableC0491a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f2535b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f2536c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2537d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f2538e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2539f;

        RunnableC0491a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2535b = i;
            this.f2536c = arrayList;
            this.f2537d = arrayList2;
            this.f2538e = arrayList3;
            this.f2539f = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2535b; i++) {
                C1013s.m5796x0((View) this.f2536c.get(i), (String) this.f2537d.get(i));
                C1013s.m5796x0((View) this.f2538e.get(i), (String) this.f2539f.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    class RunnableC0492b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2541b;

        /* renamed from: c */
        final /* synthetic */ Map f2542c;

        RunnableC0492b(ArrayList arrayList, Map map) {
            this.f2541b = arrayList;
            this.f2542c = map;
        }

        public void run() {
            int size = this.f2541b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2541b.get(i);
                String G = C1013s.m5729G(view);
                if (G != null) {
                    C1013s.m5796x0(view, AbstractC0490q.m2649i(this.f2542c, G));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    class RunnableC0493c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2544b;

        /* renamed from: c */
        final /* synthetic */ Map f2545c;

        RunnableC0493c(ArrayList arrayList, Map map) {
            this.f2544b = arrayList;
            this.f2545c = map;
        }

        public void run() {
            int size = this.f2544b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2544b.get(i);
                C1013s.m5796x0(view, (String) this.f2545c.get(C1013s.m5729G(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m2647d(List<View> list, View view) {
        int size = list.size();
        if (!m2648h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2648h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m2648h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m2649i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m2650l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract Object mo2877A(Object obj);

    /* renamed from: a */
    public abstract void mo2878a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2879b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo2880c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo2881e(Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.ArrayList<android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2905f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a = C1026u.m5845a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo2905f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup == 1 ? 1 : 0);
        }
    }

    /* renamed from: g */
    public abstract Object mo2882g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2906j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String G = C1013s.m5729G(view);
            if (G != null) {
                map.put(G, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2906j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo2907k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: m */
    public abstract Object mo2883m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo2884n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> mo2908o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C1013s.m5729G(view));
            C1013s.m5796x0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo2885p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo2886q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo2887r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2909s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(viewGroup, new RunnableC0493c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo2888t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo2889u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo2890v(Object obj, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2910w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(view, new RunnableC0492b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2911x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String G = C1013s.m5729G(view2);
            arrayList4.add(G);
            if (G != null) {
                C1013s.m5796x0(view2, null);
                String str = map.get(G);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C1013s.m5796x0(arrayList2.get(i2), G);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(view, new RunnableC0491a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: y */
    public abstract void mo2891y(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: z */
    public abstract void mo2892z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
