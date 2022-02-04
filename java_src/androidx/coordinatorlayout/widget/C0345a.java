package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p006b.p021d.C0838i;
import p006b.p030g.p038j.AbstractC0958f;
import p006b.p030g.p038j.C0959g;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0345a<T> {

    /* renamed from: a */
    private final AbstractC0958f<ArrayList<T>> f1943a = new C0959g(10);

    /* renamed from: b */
    private final C0838i<T, ArrayList<T>> f1944b = new C0838i<>();

    /* renamed from: c */
    private final ArrayList<T> f1945c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1946d = new HashSet<>();

    /* renamed from: e */
    private void m1760e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f1944b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m1760e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m1761f() {
        ArrayList<T> b = this.f1943a.mo5399b();
        return b == null ? new ArrayList<>() : b;
    }

    /* renamed from: k */
    private void m1762k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1943a.mo5398a(arrayList);
    }

    /* renamed from: a */
    public void mo2142a(T t, T t2) {
        if (!this.f1944b.containsKey(t) || !this.f1944b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f1944b.get(t);
        if (arrayList == null) {
            arrayList = m1761f();
            this.f1944b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo2143b(T t) {
        if (!this.f1944b.containsKey(t)) {
            this.f1944b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo2144c() {
        int size = this.f1944b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.f1944b.mo5016m(i);
            if (m != null) {
                m1762k(m);
            }
        }
        this.f1944b.clear();
    }

    /* renamed from: d */
    public boolean mo2145d(T t) {
        return this.f1944b.containsKey(t);
    }

    /* renamed from: g */
    public List mo2146g(T t) {
        return this.f1944b.get(t);
    }

    /* renamed from: h */
    public List<T> mo2147h(T t) {
        int size = this.f1944b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.f1944b.mo5016m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1944b.mo5011i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo2148i() {
        this.f1945c.clear();
        this.f1946d.clear();
        int size = this.f1944b.size();
        for (int i = 0; i < size; i++) {
            m1760e(this.f1944b.mo5011i(i), this.f1945c, this.f1946d);
        }
        return this.f1945c;
    }

    /* renamed from: j */
    public boolean mo2149j(T t) {
        int size = this.f1944b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.f1944b.mo5016m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
