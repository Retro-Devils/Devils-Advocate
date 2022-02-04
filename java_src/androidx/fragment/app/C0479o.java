package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC0373l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p006b.p021d.C0823a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.ViewTreeObserver$OnPreDrawListenerC1011q;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o */
public class C0479o {

    /* renamed from: a */
    private static final int[] f2484a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final AbstractC0490q f2485b = (Build.VERSION.SDK_INT >= 21 ? new C0485p() : null);

    /* renamed from: c */
    private static final AbstractC0490q f2486c = m2626w();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$a */
    public static class RunnableC0480a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2487b;

        RunnableC0480a(ArrayList arrayList) {
            this.f2487b = arrayList;
        }

        public void run() {
            C0479o.m2602A(this.f2487b, 4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$b */
    public static class RunnableC0481b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f2488b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0490q f2489c;

        /* renamed from: d */
        final /* synthetic */ View f2490d;

        /* renamed from: e */
        final /* synthetic */ Fragment f2491e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2492f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2493g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f2494h;

        /* renamed from: i */
        final /* synthetic */ Object f2495i;

        RunnableC0481b(Object obj, AbstractC0490q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2488b = obj;
            this.f2489c = qVar;
            this.f2490d = view;
            this.f2491e = fragment;
            this.f2492f = arrayList;
            this.f2493g = arrayList2;
            this.f2494h = arrayList3;
            this.f2495i = obj2;
        }

        public void run() {
            Object obj = this.f2488b;
            if (obj != null) {
                this.f2489c.mo2885p(obj, this.f2490d);
                this.f2493g.addAll(C0479o.m2614k(this.f2489c, this.f2488b, this.f2491e, this.f2492f, this.f2490d));
            }
            if (this.f2494h != null) {
                if (this.f2495i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2490d);
                    this.f2489c.mo2886q(this.f2495i, this.f2494h, arrayList);
                }
                this.f2494h.clear();
                this.f2494h.add(this.f2490d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$c */
    public static class RunnableC0482c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Fragment f2496b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2497c;

        /* renamed from: d */
        final /* synthetic */ boolean f2498d;

        /* renamed from: e */
        final /* synthetic */ C0823a f2499e;

        /* renamed from: f */
        final /* synthetic */ View f2500f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0490q f2501g;

        /* renamed from: h */
        final /* synthetic */ Rect f2502h;

        RunnableC0482c(Fragment fragment, Fragment fragment2, boolean z, C0823a aVar, View view, AbstractC0490q qVar, Rect rect) {
            this.f2496b = fragment;
            this.f2497c = fragment2;
            this.f2498d = z;
            this.f2499e = aVar;
            this.f2500f = view;
            this.f2501g = qVar;
            this.f2502h = rect;
        }

        public void run() {
            C0479o.m2609f(this.f2496b, this.f2497c, this.f2498d, this.f2499e, false);
            View view = this.f2500f;
            if (view != null) {
                this.f2501g.mo2907k(view, this.f2502h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$d */
    public static class RunnableC0483d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AbstractC0490q f2503b;

        /* renamed from: c */
        final /* synthetic */ C0823a f2504c;

        /* renamed from: d */
        final /* synthetic */ Object f2505d;

        /* renamed from: e */
        final /* synthetic */ C0484e f2506e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2507f;

        /* renamed from: g */
        final /* synthetic */ View f2508g;

        /* renamed from: h */
        final /* synthetic */ Fragment f2509h;

        /* renamed from: i */
        final /* synthetic */ Fragment f2510i;

        /* renamed from: j */
        final /* synthetic */ boolean f2511j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f2512k;

        /* renamed from: l */
        final /* synthetic */ Object f2513l;

        /* renamed from: m */
        final /* synthetic */ Rect f2514m;

        RunnableC0483d(AbstractC0490q qVar, C0823a aVar, Object obj, C0484e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2503b = qVar;
            this.f2504c = aVar;
            this.f2505d = obj;
            this.f2506e = eVar;
            this.f2507f = arrayList;
            this.f2508g = view;
            this.f2509h = fragment;
            this.f2510i = fragment2;
            this.f2511j = z;
            this.f2512k = arrayList2;
            this.f2513l = obj2;
            this.f2514m = rect;
        }

        public void run() {
            C0823a<String, View> h = C0479o.m2611h(this.f2503b, this.f2504c, this.f2505d, this.f2506e);
            if (h != null) {
                this.f2507f.addAll(h.values());
                this.f2507f.add(this.f2508g);
            }
            C0479o.m2609f(this.f2509h, this.f2510i, this.f2511j, h, false);
            Object obj = this.f2505d;
            if (obj != null) {
                this.f2503b.mo2892z(obj, this.f2512k, this.f2507f);
                View s = C0479o.m2622s(h, this.f2506e, this.f2513l, this.f2511j);
                if (s != null) {
                    this.f2503b.mo2907k(s, this.f2514m);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$e */
    public static class C0484e {

        /* renamed from: a */
        public Fragment f2515a;

        /* renamed from: b */
        public boolean f2516b;

        /* renamed from: c */
        public C0442a f2517c;

        /* renamed from: d */
        public Fragment f2518d;

        /* renamed from: e */
        public boolean f2519e;

        /* renamed from: f */
        public C0442a f2520f;

        C0484e() {
        }
    }

    /* renamed from: A */
    static void m2602A(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: B */
    static void m2603B(LayoutInflater$Factory2C0456j jVar, ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (jVar.f2393t >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0442a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m2608e(aVar, sparseArray, z);
                } else {
                    m2606c(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(jVar.f2394u.mo2727e());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0823a<String, String> d = m2607d(keyAt, arrayList, arrayList2, i, i2);
                    C0484e eVar = (C0484e) sparseArray.valueAt(i4);
                    if (z) {
                        m2618o(jVar, keyAt, eVar, view, d);
                    } else {
                        m2617n(jVar, keyAt, eVar, view, d);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2604a(ArrayList<View> arrayList, C0823a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.mo5016m(size);
            if (collection.contains(C1013s.m5729G(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.f2278m != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0090, code lost:
        if (r10.f2243A == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2605b(androidx.fragment.app.C0442a r16, androidx.fragment.app.AbstractC0477n.C0478a r17, android.util.SparseArray<androidx.fragment.app.C0479o.C0484e> r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0479o.m2605b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m2606c(C0442a aVar, SparseArray<C0484e> sparseArray, boolean z) {
        int size = aVar.f2458a.size();
        for (int i = 0; i < size; i++) {
            m2605b(aVar, aVar.f2458a.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C0823a<String, String> m2607d(int i, ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0823a<String, String> aVar = new C0823a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0442a aVar2 = arrayList.get(i4);
            if (aVar2.mo2646s(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2472o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2472o;
                        arrayList4 = aVar2.f2473p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2472o;
                        arrayList3 = aVar2.f2473p;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m2608e(C0442a aVar, SparseArray<C0484e> sparseArray, boolean z) {
        if (aVar.f2316s.f2395v.mo2622c()) {
            for (int size = aVar.f2458a.size() - 1; size >= 0; size--) {
                m2605b(aVar, aVar.f2458a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m2609f(Fragment fragment, Fragment fragment2, boolean z, C0823a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.mo2581l0() : fragment.mo2581l0()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo5011i(i));
                arrayList.add(aVar.mo5016m(i));
            }
            throw null;
        }
    }

    /* renamed from: g */
    private static boolean m2610g(AbstractC0490q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.mo2881e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C0823a<String, View> m2611h(AbstractC0490q qVar, C0823a<String, String> aVar, Object obj, C0484e eVar) {
        AbstractC0373l lVar;
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f2515a;
        View F0 = fragment.mo2505F0();
        if (aVar.isEmpty() || obj == null || F0 == null) {
            aVar.clear();
            return null;
        }
        C0823a<String, View> aVar2 = new C0823a<>();
        qVar.mo2906j(aVar2, F0);
        C0442a aVar3 = eVar.f2517c;
        if (eVar.f2516b) {
            lVar = fragment.mo2587n0();
            arrayList = aVar3.f2472o;
        } else {
            lVar = fragment.mo2581l0();
            arrayList = aVar3.f2473p;
        }
        if (arrayList != null) {
            aVar2.mo4866o(arrayList);
            aVar2.mo4866o(aVar.values());
        }
        if (lVar == null) {
            m2627x(aVar, aVar2);
            return aVar2;
        }
        throw null;
    }

    /* renamed from: i */
    private static C0823a<String, View> m2612i(AbstractC0490q qVar, C0823a<String, String> aVar, Object obj, C0484e eVar) {
        AbstractC0373l lVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f2518d;
        C0823a<String, View> aVar2 = new C0823a<>();
        qVar.mo2906j(aVar2, fragment.mo2541X1());
        C0442a aVar3 = eVar.f2520f;
        if (eVar.f2519e) {
            lVar = fragment.mo2581l0();
            arrayList = aVar3.f2473p;
        } else {
            lVar = fragment.mo2587n0();
            arrayList = aVar3.f2472o;
        }
        aVar2.mo4866o(arrayList);
        if (lVar == null) {
            aVar.mo4866o(aVar2.keySet());
            return aVar2;
        }
        throw null;
    }

    /* renamed from: j */
    private static AbstractC0490q m2613j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m0 = fragment.mo2584m0();
            if (m0 != null) {
                arrayList.add(m0);
            }
            Object z0 = fragment.mo2617z0();
            if (z0 != null) {
                arrayList.add(z0);
            }
            Object B0 = fragment.mo2497B0();
            if (B0 != null) {
                arrayList.add(B0);
            }
        }
        if (fragment2 != null) {
            Object k0 = fragment2.mo2578k0();
            if (k0 != null) {
                arrayList.add(k0);
            }
            Object w0 = fragment2.mo2611w0();
            if (w0 != null) {
                arrayList.add(w0);
            }
            Object A0 = fragment2.mo2495A0();
            if (A0 != null) {
                arrayList.add(A0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0490q qVar = f2485b;
        if (qVar != null && m2610g(qVar, arrayList)) {
            return qVar;
        }
        AbstractC0490q qVar2 = f2486c;
        if (qVar2 != null && m2610g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m2614k(AbstractC0490q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View F0 = fragment.mo2505F0();
        if (F0 != null) {
            qVar.mo2905f(arrayList2, F0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.mo2879b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m2615l(AbstractC0490q qVar, ViewGroup viewGroup, View view, C0823a<String, String> aVar, C0484e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0823a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = eVar.f2515a;
        Fragment fragment2 = eVar.f2518d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f2516b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m2623t(qVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C0823a<String, View> i = m2612i(qVar, aVar2, obj3, eVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(i.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2609f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            qVar.mo2891y(obj4, view, arrayList);
            m2629z(qVar, obj4, obj2, i, eVar.f2519e, eVar.f2520f);
            if (obj != null) {
                qVar.mo2889u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(viewGroup, new RunnableC0483d(qVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    /* renamed from: m */
    private static Object m2616m(AbstractC0490q qVar, ViewGroup viewGroup, View view, C0823a<String, String> aVar, C0484e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        Fragment fragment = eVar.f2515a;
        Fragment fragment2 = eVar.f2518d;
        if (fragment != null) {
            fragment.mo2541X1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f2516b;
        Object t = aVar.isEmpty() ? null : m2623t(qVar, fragment, fragment2, z);
        C0823a<String, View> i = m2612i(qVar, aVar, t, eVar);
        C0823a<String, View> h = m2611h(qVar, aVar, t, eVar);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            m2604a(arrayList, i, aVar.keySet());
            m2604a(arrayList2, h, aVar.values());
            obj3 = t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2609f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.mo2891y(obj3, view, arrayList);
            m2629z(qVar, obj3, obj2, i, eVar.f2519e, eVar.f2520f);
            Rect rect2 = new Rect();
            View s = m2622s(h, eVar, obj, z);
            if (s != null) {
                qVar.mo2889u(obj, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(viewGroup, new RunnableC0482c(fragment, fragment2, z, h, view2, qVar, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m2617n(LayoutInflater$Factory2C0456j jVar, int i, C0484e eVar, View view, C0823a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC0490q j;
        Object obj;
        ViewGroup viewGroup = jVar.f2395v.mo2622c() ? (ViewGroup) jVar.f2395v.mo2621b(i) : null;
        if (viewGroup != null && (j = m2613j((fragment2 = eVar.f2518d), (fragment = eVar.f2515a))) != null) {
            boolean z = eVar.f2516b;
            boolean z2 = eVar.f2519e;
            Object q = m2620q(j, fragment, z);
            Object r = m2621r(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object l = m2615l(j, viewGroup, view, aVar, eVar, arrayList, arrayList2, q, r);
            if (q == null && l == null) {
                obj = r;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r;
            }
            ArrayList<View> k = m2614k(j, obj, fragment2, arrayList, view);
            Object obj2 = (k == null || k.isEmpty()) ? null : obj;
            j.mo2878a(q, view);
            Object u = m2624u(j, q, obj2, l, fragment, eVar.f2516b);
            if (u != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                j.mo2888t(u, q, arrayList3, obj2, k, l, arrayList2);
                m2628y(j, viewGroup, fragment, view, arrayList2, q, arrayList3, obj2, k);
                j.mo2910w(viewGroup, arrayList2, aVar);
                j.mo2880c(viewGroup, u);
                j.mo2909s(viewGroup, arrayList2, aVar);
            }
        }
    }

    /* renamed from: o */
    private static void m2618o(LayoutInflater$Factory2C0456j jVar, int i, C0484e eVar, View view, C0823a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC0490q j;
        Object obj;
        ViewGroup viewGroup = jVar.f2395v.mo2622c() ? (ViewGroup) jVar.f2395v.mo2621b(i) : null;
        if (viewGroup != null && (j = m2613j((fragment2 = eVar.f2518d), (fragment = eVar.f2515a))) != null) {
            boolean z = eVar.f2516b;
            boolean z2 = eVar.f2519e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object q = m2620q(j, fragment, z);
            Object r = m2621r(j, fragment2, z2);
            Object m = m2616m(j, viewGroup, view, aVar, eVar, arrayList2, arrayList, q, r);
            if (q == null && m == null) {
                obj = r;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r;
            }
            ArrayList<View> k = m2614k(j, obj, fragment2, arrayList2, view);
            ArrayList<View> k2 = m2614k(j, q, fragment, arrayList, view);
            m2602A(k2, 4);
            Object u = m2624u(j, q, obj, m, fragment, z);
            if (u != null) {
                m2625v(j, obj, fragment2, k);
                ArrayList<String> o = j.mo2908o(arrayList);
                j.mo2888t(u, q, k2, obj, k, m, arrayList);
                j.mo2880c(viewGroup, u);
                j.mo2911x(viewGroup, arrayList2, arrayList, o, aVar);
                m2602A(k2, 0);
                j.mo2892z(m, arrayList2, arrayList);
            }
        }
    }

    /* renamed from: p */
    private static C0484e m2619p(C0484e eVar, SparseArray<C0484e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        C0484e eVar2 = new C0484e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    /* renamed from: q */
    private static Object m2620q(AbstractC0490q qVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return qVar.mo2882g(z ? fragment.mo2611w0() : fragment.mo2578k0());
    }

    /* renamed from: r */
    private static Object m2621r(AbstractC0490q qVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return qVar.mo2882g(z ? fragment.mo2617z0() : fragment.mo2584m0());
    }

    /* renamed from: s */
    static View m2622s(C0823a<String, View> aVar, C0484e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0442a aVar2 = eVar.f2517c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2472o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f2472o : aVar2.f2473p).get(0));
    }

    /* renamed from: t */
    private static Object m2623t(AbstractC0490q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.mo2877A(qVar.mo2882g(z ? fragment2.mo2497B0() : fragment.mo2495A0()));
    }

    /* renamed from: u */
    private static Object m2624u(AbstractC0490q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo2558e0() : fragment.mo2555d0() ? qVar.mo2884n(obj2, obj, obj3) : qVar.mo2883m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m2625v(AbstractC0490q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2278m && fragment.f2243A && fragment.f2258P) {
            fragment.mo2560e2(true);
            qVar.mo2887r(obj, fragment.mo2505F0(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(fragment.f2250H, new RunnableC0480a(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC0490q m2626w() {
        try {
            return (AbstractC0490q) Class.forName("b.q.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    private static void m2627x(C0823a<String, String> aVar, C0823a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo5016m(size))) {
                aVar.mo5014k(size);
            }
        }
    }

    /* renamed from: y */
    private static void m2628y(AbstractC0490q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(viewGroup, new RunnableC0481b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m2629z(AbstractC0490q qVar, Object obj, Object obj2, C0823a<String, View> aVar, boolean z, C0442a aVar2) {
        ArrayList<String> arrayList = aVar2.f2472o;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f2473p : aVar2.f2472o).get(0));
            qVar.mo2890v(obj, view);
            if (obj2 != null) {
                qVar.mo2890v(obj2, view);
            }
        }
    }
}
