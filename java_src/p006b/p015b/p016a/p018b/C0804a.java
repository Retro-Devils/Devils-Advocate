package p006b.p015b.p016a.p018b;

import java.util.HashMap;
import java.util.Map;
import p006b.p015b.p016a.p018b.C0805b;

/* renamed from: b.b.a.b.a */
public class C0804a<K, V> extends C0805b<K, V> {

    /* renamed from: f */
    private HashMap<K, C0805b.C0808c<K, V>> f4010f = new HashMap<>();

    /* access modifiers changed from: protected */
    @Override // p006b.p015b.p016a.p018b.C0805b
    /* renamed from: c */
    public C0805b.C0808c<K, V> mo4754c(K k) {
        return this.f4010f.get(k);
    }

    public boolean contains(K k) {
        return this.f4010f.containsKey(k);
    }

    @Override // p006b.p015b.p016a.p018b.C0805b
    /* renamed from: g */
    public V mo4756g(K k, V v) {
        C0805b.C0808c<K, V> c = mo4754c(k);
        if (c != null) {
            return c.f4016c;
        }
        this.f4010f.put(k, mo4764f(k, v));
        return null;
    }

    @Override // p006b.p015b.p016a.p018b.C0805b
    /* renamed from: h */
    public V mo4757h(K k) {
        V v = (V) super.mo4757h(k);
        this.f4010f.remove(k);
        return v;
    }

    /* renamed from: i */
    public Map.Entry<K, V> mo4758i(K k) {
        if (contains(k)) {
            return this.f4010f.get(k).f4018e;
        }
        return null;
    }
}
