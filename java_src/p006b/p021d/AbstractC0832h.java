package p006b.p021d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: b.d.h */
public abstract class AbstractC0832h<K, V> {

    /* renamed from: a */
    AbstractC0832h<K, V>.C0834b f4105a;

    /* renamed from: b */
    AbstractC0832h<K, V>.C0835c f4106b;

    /* renamed from: c */
    AbstractC0832h<K, V>.C0837e f4107c;

    /* renamed from: b.d.h$a */
    final class C0833a<T> implements Iterator<T> {

        /* renamed from: b */
        final int f4108b;

        /* renamed from: c */
        int f4109c;

        /* renamed from: d */
        int f4110d;

        /* renamed from: e */
        boolean f4111e = false;

        C0833a(int i) {
            this.f4108b = i;
            this.f4109c = AbstractC0832h.this.mo4872d();
        }

        public boolean hasNext() {
            return this.f4110d < this.f4109c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0832h.this.mo4870b(this.f4110d, this.f4108b);
                this.f4110d++;
                this.f4111e = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f4111e) {
                int i = this.f4110d - 1;
                this.f4110d = i;
                this.f4109c--;
                this.f4111e = false;
                AbstractC0832h.this.mo4876h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.h$b */
    public final class C0834b implements Set<Map.Entry<K, V>> {
        C0834b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: b.d.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = AbstractC0832h.this.mo4872d();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC0832h.this.mo4875g(entry.getKey(), entry.getValue());
            }
            return d != AbstractC0832h.this.mo4872d();
        }

        public void clear() {
            AbstractC0832h.this.mo4869a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = AbstractC0832h.this.mo4873e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C0829e.m4846c(AbstractC0832h.this.mo4870b(e, 1), entry.getValue());
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return AbstractC0832h.m4876k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = AbstractC0832h.this.mo4872d() - 1; d >= 0; d--) {
                Object b = AbstractC0832h.this.mo4870b(d, 0);
                Object b2 = AbstractC0832h.this.mo4870b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return AbstractC0832h.this.mo4872d() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0836d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return AbstractC0832h.this.mo4872d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.h$c */
    public final class C0835c implements Set<K> {
        C0835c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            AbstractC0832h.this.mo4869a();
        }

        public boolean contains(Object obj) {
            return AbstractC0832h.this.mo4873e(obj) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0832h.m4875j(AbstractC0832h.this.mo4871c(), collection);
        }

        public boolean equals(Object obj) {
            return AbstractC0832h.m4876k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = AbstractC0832h.this.mo4872d() - 1; d >= 0; d--) {
                Object b = AbstractC0832h.this.mo4870b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return AbstractC0832h.this.mo4872d() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0833a(0);
        }

        public boolean remove(Object obj) {
            int e = AbstractC0832h.this.mo4873e(obj);
            if (e < 0) {
                return false;
            }
            AbstractC0832h.this.mo4876h(e);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0832h.m4877o(AbstractC0832h.this.mo4871c(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0832h.m4878p(AbstractC0832h.this.mo4871c(), collection);
        }

        public int size() {
            return AbstractC0832h.this.mo4872d();
        }

        public Object[] toArray() {
            return AbstractC0832h.this.mo4940q(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0832h.this.mo4941r(tArr, 0);
        }
    }

    /* renamed from: b.d.h$d */
    final class C0836d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        int f4115b;

        /* renamed from: c */
        int f4116c;

        /* renamed from: d */
        boolean f4117d = false;

        C0836d() {
            this.f4115b = AbstractC0832h.this.mo4872d() - 1;
            this.f4116c = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f4116c++;
                this.f4117d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f4117d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0829e.m4846c(entry.getKey(), AbstractC0832h.this.mo4870b(this.f4116c, 0)) && C0829e.m4846c(entry.getValue(), AbstractC0832h.this.mo4870b(this.f4116c, 1));
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f4117d) {
                return (K) AbstractC0832h.this.mo4870b(this.f4116c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f4117d) {
                return (V) AbstractC0832h.this.mo4870b(this.f4116c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f4116c < this.f4115b;
        }

        public int hashCode() {
            if (this.f4117d) {
                int i = 0;
                Object b = AbstractC0832h.this.mo4870b(this.f4116c, 0);
                Object b2 = AbstractC0832h.this.mo4870b(this.f4116c, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f4117d) {
                AbstractC0832h.this.mo4876h(this.f4116c);
                this.f4116c--;
                this.f4115b--;
                this.f4117d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f4117d) {
                return (V) AbstractC0832h.this.mo4877i(this.f4116c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.h$e */
    public final class C0837e implements Collection<V> {
        C0837e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            AbstractC0832h.this.mo4869a();
        }

        public boolean contains(Object obj) {
            return AbstractC0832h.this.mo4874f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return AbstractC0832h.this.mo4872d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0833a(1);
        }

        public boolean remove(Object obj) {
            int f = AbstractC0832h.this.mo4874f(obj);
            if (f < 0) {
                return false;
            }
            AbstractC0832h.this.mo4876h(f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d = AbstractC0832h.this.mo4872d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(AbstractC0832h.this.mo4870b(i, 1))) {
                    AbstractC0832h.this.mo4876h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d = AbstractC0832h.this.mo4872d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(AbstractC0832h.this.mo4870b(i, 1))) {
                    AbstractC0832h.this.mo4876h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return AbstractC0832h.this.mo4872d();
        }

        public Object[] toArray() {
            return AbstractC0832h.this.mo4940q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0832h.this.mo4941r(tArr, 1);
        }
    }

    AbstractC0832h() {
    }

    /* renamed from: j */
    public static <K, V> boolean m4875j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m4876k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m4877o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m4878p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4869a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo4870b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo4871c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo4872d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo4873e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo4874f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo4875g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo4876h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo4877i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo4937l() {
        if (this.f4105a == null) {
            this.f4105a = new C0834b();
        }
        return this.f4105a;
    }

    /* renamed from: m */
    public Set<K> mo4938m() {
        if (this.f4106b == null) {
            this.f4106b = new C0835c();
        }
        return this.f4106b;
    }

    /* renamed from: n */
    public Collection<V> mo4939n() {
        if (this.f4107c == null) {
            this.f4107c = new C0837e();
        }
        return this.f4107c;
    }

    /* renamed from: q */
    public Object[] mo4940q(int i) {
        int d = mo4872d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo4870b(i2, i);
        }
        return objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] mo4941r(T[] tArr, int i) {
        int d = mo4872d();
        if (tArr.length < d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d));
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo4870b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
