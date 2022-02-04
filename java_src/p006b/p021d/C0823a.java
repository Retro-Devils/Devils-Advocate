package p006b.p021d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: b.d.a */
public class C0823a<K, V> extends C0838i<K, V> implements Map<K, V> {

    /* renamed from: i */
    AbstractC0832h<K, V> f4064i;

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a$a */
    public class C0824a extends AbstractC0832h<K, V> {
        C0824a() {
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: a */
        public void mo4869a() {
            C0823a.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: b */
        public Object mo4870b(int i, int i2) {
            return C0823a.this.f4121g[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: c */
        public Map<K, V> mo4871c() {
            return C0823a.this;
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: d */
        public int mo4872d() {
            return C0823a.this.f4122h;
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: e */
        public int mo4873e(Object obj) {
            return C0823a.this.mo5005f(obj);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: f */
        public int mo4874f(Object obj) {
            return C0823a.this.mo5009h(obj);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: g */
        public void mo4875g(K k, V v) {
            C0823a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: h */
        public void mo4876h(int i) {
            C0823a.this.mo5014k(i);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: i */
        public V mo4877i(int i, V v) {
            return (V) C0823a.this.mo5015l(i, v);
        }
    }

    public C0823a() {
    }

    public C0823a(int i) {
        super(i);
    }

    public C0823a(C0838i iVar) {
        super(iVar);
    }

    /* renamed from: n */
    private AbstractC0832h<K, V> m4800n() {
        if (this.f4064i == null) {
            this.f4064i = new C0824a();
        }
        return this.f4064i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m4800n().mo4937l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m4800n().mo4938m();
    }

    /* renamed from: o */
    public boolean mo4866o(Collection<?> collection) {
        return AbstractC0832h.m4878p(this, collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: b.d.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        mo4999c(this.f4122h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m4800n().mo4939n();
    }
}
