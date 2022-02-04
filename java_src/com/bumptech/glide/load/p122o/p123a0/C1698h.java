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
    private final C1699a<K, V> f6721a = new C1699a<>();

    /* renamed from: b */
    private final Map<K, C1699a<K, V>> f6722b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.a0.h$a */
    public static class C1699a<K, V> {

        /* renamed from: a */
        final K f6723a;

        /* renamed from: b */
        private List<V> f6724b;

        /* renamed from: c */
        C1699a<K, V> f6725c;

        /* renamed from: d */
        C1699a<K, V> f6726d;

        C1699a() {
            this(null);
        }

        C1699a(K k) {
            this.f6726d = this;
            this.f6725c = this;
            this.f6723a = k;
        }

        /* renamed from: a */
        public void mo7191a(V v) {
            if (this.f6724b == null) {
                this.f6724b = new ArrayList();
            }
            this.f6724b.add(v);
        }

        /* renamed from: b */
        public V mo7192b() {
            int c = mo7193c();
            if (c > 0) {
                return this.f6724b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo7193c() {
            List<V> list = this.f6724b;
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
        C1699a<K, V> aVar2 = this.f6721a;
        aVar.f6726d = aVar2;
        aVar.f6725c = aVar2.f6725c;
        m8041g(aVar);
    }

    /* renamed from: c */
    private void m8039c(C1699a<K, V> aVar) {
        m8040e(aVar);
        C1699a<K, V> aVar2 = this.f6721a;
        aVar.f6726d = aVar2.f6726d;
        aVar.f6725c = aVar2;
        m8041g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m8040e(C1699a<K, V> aVar) {
        C1699a<K, V> aVar2 = aVar.f6726d;
        aVar2.f6725c = aVar.f6725c;
        aVar.f6725c.f6726d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m8041g(C1699a<K, V> aVar) {
        aVar.f6725c.f6726d = aVar;
        aVar.f6726d.f6725c = aVar;
    }

    /* renamed from: a */
    public V mo7187a(K k) {
        C1699a<K, V> aVar = this.f6722b.get(k);
        if (aVar == null) {
            aVar = new C1699a<>(k);
            this.f6722b.put(k, aVar);
        } else {
            k.mo7170a();
        }
        m8038b(aVar);
        return aVar.mo7192b();
    }

    /* renamed from: d */
    public void mo7188d(K k, V v) {
        C1699a<K, V> aVar = this.f6722b.get(k);
        if (aVar == null) {
            aVar = new C1699a<>(k);
            m8039c(aVar);
            this.f6722b.put(k, aVar);
        } else {
            k.mo7170a();
        }
        aVar.mo7191a(v);
    }

    /* renamed from: f */
    public V mo7189f() {
        C1699a aVar = this.f6721a;
        while (true) {
            aVar = aVar.f6726d;
            if (aVar.equals(this.f6721a)) {
                return null;
            }
            V v = (V) aVar.mo7192b();
            if (v != null) {
                return v;
            }
            m8040e(aVar);
            this.f6722b.remove(aVar.f6723a);
            aVar.f6723a.mo7170a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1699a<K, V> aVar = this.f6721a.f6725c; !aVar.equals(this.f6721a); aVar = aVar.f6725c) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.f6723a);
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
