package com.bumptech.glide.load.p122o.p123a0;

import com.bumptech.glide.load.p122o.p123a0.AbstractC1708m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.a0.h */
public class C1698h<K extends AbstractC1708m, V> {

    /* renamed from: a */
    private final C1699a<K, V> f6729a = new C1699a<>();

    /* renamed from: b */
    private final Map<K, C1699a<K, V>> f6730b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.a0.h$a */
    public static class C1699a<K, V> {

        /* renamed from: a */
        final K f6731a;

        /* renamed from: b */
        private List<V> f6732b;

        /* renamed from: c */
        C1699a<K, V> f6733c;

        /* renamed from: d */
        C1699a<K, V> f6734d;

        C1699a() {
            this(null);
        }

        C1699a(K k) {
            this.f6734d = this;
            this.f6733c = this;
            this.f6731a = k;
        }

        /* renamed from: a */
        public void mo7191a(V v) {
            if (this.f6732b == null) {
                this.f6732b = new ArrayList();
            }
            this.f6732b.add(v);
        }

        /* renamed from: b */
        public V mo7192b() {
            int c = mo7193c();
            if (c > 0) {
                return this.f6732b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo7193c() {
            List<V> list = this.f6732b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    C1698h() {
    }

    /* renamed from: b */
    private void m8038b(C1699a<K, V> aVar) {
        m8040e(aVar);
        C1699a<K, V> aVar2 = this.f6729a;
        aVar.f6734d = aVar2;
        aVar.f6733c = aVar2.f6733c;
        m8041g(aVar);
    }

    /* renamed from: c */
    private void m8039c(C1699a<K, V> aVar) {
        m8040e(aVar);
        C1699a<K, V> aVar2 = this.f6729a;
        aVar.f6734d = aVar2.f6734d;
        aVar.f6733c = aVar2;
        m8041g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m8040e(C1699a<K, V> aVar) {
        C1699a<K, V> aVar2 = aVar.f6734d;
        aVar2.f6733c = aVar.f6733c;
        aVar.f6733c.f6734d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m8041g(C1699a<K, V> aVar) {
        aVar.f6733c.f6734d = aVar;
        aVar.f6734d.f6733c = aVar;
    }

    /* renamed from: a */
    public V mo7187a(K k) {
        C1699a<K, V> aVar = this.f6730b.get(k);
        if (aVar == null) {
            aVar = new C1699a<>(k);
            this.f6730b.put(k, aVar);
        } else {
            k.mo7170a();
        }
        m8038b(aVar);
        return aVar.mo7192b();
    }

    /* renamed from: d */
    public void mo7188d(K k, V v) {
        C1699a<K, V> aVar = this.f6730b.get(k);
        if (aVar == null) {
            aVar = new C1699a<>(k);
            m8039c(aVar);
            this.f6730b.put(k, aVar);
        } else {
            k.mo7170a();
        }
        aVar.mo7191a(v);
    }

    /* renamed from: f */
    public V mo7189f() {
        C1699a aVar = this.f6729a;
        while (true) {
            aVar = aVar.f6734d;
            if (aVar.equals(this.f6729a)) {
                return null;
            }
            V v = (V) aVar.mo7192b();
            if (v != null) {
                return v;
            }
            m8040e(aVar);
            this.f6730b.remove(aVar.f6731a);
            aVar.f6731a.mo7170a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1699a<K, V> aVar = this.f6729a.f6733c; !aVar.equals(this.f6729a); aVar = aVar.f6733c) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.f6731a);
            sb.append(':');
            sb.append(aVar.mo7193c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
