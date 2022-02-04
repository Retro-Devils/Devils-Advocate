package p006b.p015b.p016a.p018b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: b.b.a.b.b */
public class C0805b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    C0808c<K, V> f4011b;

    /* renamed from: c */
    private C0808c<K, V> f4012c;

    /* renamed from: d */
    private WeakHashMap<AbstractC0811f<K, V>, Boolean> f4013d = new WeakHashMap<>();

    /* renamed from: e */
    private int f4014e = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.b.b$a */
    public static class C0806a<K, V> extends AbstractC0810e<K, V> {
        C0806a(C0808c<K, V> cVar, C0808c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p015b.p016a.p018b.C0805b.AbstractC0810e
        /* renamed from: b */
        public C0808c<K, V> mo4769b(C0808c<K, V> cVar) {
            return cVar.f4018e;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p015b.p016a.p018b.C0805b.AbstractC0810e
        /* renamed from: c */
        public C0808c<K, V> mo4770c(C0808c<K, V> cVar) {
            return cVar.f4017d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.b.a.b.b$b */
    public static class C0807b<K, V> extends AbstractC0810e<K, V> {
        C0807b(C0808c<K, V> cVar, C0808c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p015b.p016a.p018b.C0805b.AbstractC0810e
        /* renamed from: b */
        public C0808c<K, V> mo4769b(C0808c<K, V> cVar) {
            return cVar.f4017d;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p015b.p016a.p018b.C0805b.AbstractC0810e
        /* renamed from: c */
        public C0808c<K, V> mo4770c(C0808c<K, V> cVar) {
            return cVar.f4018e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.b.b$c */
    public static class C0808c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f4015b;

        /* renamed from: c */
        final V f4016c;

        /* renamed from: d */
        C0808c<K, V> f4017d;

        /* renamed from: e */
        C0808c<K, V> f4018e;

        C0808c(K k, V v) {
            this.f4015b = k;
            this.f4016c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0808c)) {
                return false;
            }
            C0808c cVar = (C0808c) obj;
            return this.f4015b.equals(cVar.f4015b) && this.f4016c.equals(cVar.f4016c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4015b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4016c;
        }

        public int hashCode() {
            return this.f4015b.hashCode() ^ this.f4016c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f4015b) + "=" + ((Object) this.f4016c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.b.a.b.b$d */
    public class C0809d implements Iterator<Map.Entry<K, V>>, AbstractC0811f<K, V> {

        /* renamed from: b */
        private C0808c<K, V> f4019b;

        /* renamed from: c */
        private boolean f4020c = true;

        C0809d() {
        }

        @Override // p006b.p015b.p016a.p018b.C0805b.AbstractC0811f
        /* renamed from: a */
        public void mo4777a(C0808c<K, V> cVar) {
            C0808c<K, V> cVar2 = this.f4019b;
            if (cVar == cVar2) {
                C0808c<K, V> cVar3 = cVar2.f4018e;
                this.f4019b = cVar3;
                this.f4020c = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C0808c<K, V> cVar;
            if (this.f4020c) {
                this.f4020c = false;
                cVar = C0805b.this.f4011b;
            } else {
                C0808c<K, V> cVar2 = this.f4019b;
                cVar = cVar2 != null ? cVar2.f4017d : null;
            }
            this.f4019b = cVar;
            return this.f4019b;
        }

        public boolean hasNext() {
            if (this.f4020c) {
                return C0805b.this.f4011b != null;
            }
            C0808c<K, V> cVar = this.f4019b;
            return (cVar == null || cVar.f4017d == null) ? false : true;
        }
    }

    /* renamed from: b.b.a.b.b$e */
    private static abstract class AbstractC0810e<K, V> implements Iterator<Map.Entry<K, V>>, AbstractC0811f<K, V> {

        /* renamed from: b */
        C0808c<K, V> f4022b;

        /* renamed from: c */
        C0808c<K, V> f4023c;

        AbstractC0810e(C0808c<K, V> cVar, C0808c<K, V> cVar2) {
            this.f4022b = cVar2;
            this.f4023c = cVar;
        }

        /* renamed from: e */
        private C0808c<K, V> m4712e() {
            C0808c<K, V> cVar = this.f4023c;
            C0808c<K, V> cVar2 = this.f4022b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo4770c(cVar);
        }

        @Override // p006b.p015b.p016a.p018b.C0805b.AbstractC0811f
        /* renamed from: a */
        public void mo4777a(C0808c<K, V> cVar) {
            if (this.f4022b == cVar && cVar == this.f4023c) {
                this.f4023c = null;
                this.f4022b = null;
            }
            C0808c<K, V> cVar2 = this.f4022b;
            if (cVar2 == cVar) {
                this.f4022b = mo4769b(cVar2);
            }
            if (this.f4023c == cVar) {
                this.f4023c = m4712e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0808c<K, V> mo4769b(C0808c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0808c<K, V> mo4770c(C0808c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C0808c<K, V> cVar = this.f4023c;
            this.f4023c = m4712e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f4023c != null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.b.b$f */
    public interface AbstractC0811f<K, V> {
        /* renamed from: a */
        void mo4777a(C0808c<K, V> cVar);
    }

    /* renamed from: a */
    public Iterator<Map.Entry<K, V>> mo4759a() {
        C0807b bVar = new C0807b(this.f4012c, this.f4011b);
        this.f4013d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo4760b() {
        return this.f4011b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0808c<K, V> mo4754c(K k) {
        C0808c<K, V> cVar = this.f4011b;
        while (cVar != null && !cVar.f4015b.equals(k)) {
            cVar = cVar.f4017d;
        }
        return cVar;
    }

    /* renamed from: d */
    public C0805b<K, V>.C0809d mo4761d() {
        C0805b<K, V>.C0809d dVar = new C0809d();
        this.f4013d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo4762e() {
        return this.f4012c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0805b)) {
            return false;
        }
        C0805b bVar = (C0805b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0808c<K, V> mo4764f(K k, V v) {
        C0808c<K, V> cVar = new C0808c<>(k, v);
        this.f4014e++;
        C0808c<K, V> cVar2 = this.f4012c;
        if (cVar2 == null) {
            this.f4011b = cVar;
        } else {
            cVar2.f4017d = cVar;
            cVar.f4018e = cVar2;
        }
        this.f4012c = cVar;
        return cVar;
    }

    /* renamed from: g */
    public V mo4756g(K k, V v) {
        C0808c<K, V> c = mo4754c(k);
        if (c != null) {
            return c.f4016c;
        }
        mo4764f(k, v);
        return null;
    }

    /* renamed from: h */
    public V mo4757h(K k) {
        C0808c<K, V> c = mo4754c(k);
        if (c == null) {
            return null;
        }
        this.f4014e--;
        if (!this.f4013d.isEmpty()) {
            for (AbstractC0811f<K, V> fVar : this.f4013d.keySet()) {
                fVar.mo4777a(c);
            }
        }
        C0808c<K, V> cVar = c.f4018e;
        C0808c<K, V> cVar2 = c.f4017d;
        if (cVar != null) {
            cVar.f4017d = cVar2;
        } else {
            this.f4011b = cVar2;
        }
        C0808c<K, V> cVar3 = c.f4017d;
        if (cVar3 != null) {
            cVar3.f4018e = cVar;
        } else {
            this.f4012c = cVar;
        }
        c.f4017d = null;
        c.f4018e = null;
        return c.f4016c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0806a aVar = new C0806a(this.f4011b, this.f4012c);
        this.f4013d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f4014e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
