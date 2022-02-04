package com.bumptech.glide.p144t;

import p006b.p021d.C0823a;
import p006b.p021d.C0838i;

/* renamed from: com.bumptech.glide.t.b */
public final class C2071b<K, V> extends C0823a<K, V> {

    /* renamed from: j */
    private int f7581j;

    @Override // p006b.p021d.C0838i
    public void clear() {
        this.f7581j = 0;
        super.clear();
    }

    @Override // p006b.p021d.C0838i
    public int hashCode() {
        if (this.f7581j == 0) {
            this.f7581j = super.hashCode();
        }
        return this.f7581j;
    }

    @Override // p006b.p021d.C0838i
    /* renamed from: j */
    public void mo5013j(C0838i<? extends K, ? extends V> iVar) {
        this.f7581j = 0;
        super.mo5013j(iVar);
    }

    @Override // p006b.p021d.C0838i
    /* renamed from: k */
    public V mo5014k(int i) {
        this.f7581j = 0;
        return (V) super.mo5014k(i);
    }

    @Override // p006b.p021d.C0838i
    /* renamed from: l */
    public V mo5015l(int i, V v) {
        this.f7581j = 0;
        return (V) super.mo5015l(i, v);
    }

    @Override // java.util.Map, p006b.p021d.C0838i
    public V put(K k, V v) {
        this.f7581j = 0;
        return (V) super.put(k, v);
    }
}
