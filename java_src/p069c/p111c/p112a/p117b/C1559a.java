package p069c.p111c.p112a.p117b;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: c.c.a.b.a */
public class C1559a<E> {

    /* renamed from: a */
    SparseArray<ArrayList<E>> f6401a;

    /* renamed from: b */
    int f6402b = 0;

    public C1559a(int i) {
        this.f6401a = new SparseArray<>(i);
    }

    /* renamed from: a */
    public int mo6867a(int i) {
        return this.f6401a.keyAt(i);
    }

    /* renamed from: b */
    public E mo6868b(int i) {
        ArrayList<E> arrayList = this.f6401a.get(i);
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        E e = arrayList.get(0);
        arrayList.remove(0);
        this.f6402b--;
        return e;
    }

    /* renamed from: c */
    public void mo6869c(int i, E e) {
        ArrayList<E> arrayList = this.f6401a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(e);
        this.f6402b++;
        this.f6401a.put(i, arrayList);
    }

    /* renamed from: d */
    public int mo6870d() {
        return this.f6401a.size();
    }

    /* renamed from: e */
    public ArrayList<E> mo6871e(int i) {
        return this.f6401a.valueAt(i);
    }
}
