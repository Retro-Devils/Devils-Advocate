package p006b.p021d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b.d.b */
public final class C0825b<E> implements Collection<E>, Set<E> {

    /* renamed from: b */
    private static final int[] f4070b = new int[0];

    /* renamed from: c */
    private static final Object[] f4071c = new Object[0];

    /* renamed from: d */
    private static Object[] f4072d;

    /* renamed from: e */
    private static int f4073e;

    /* renamed from: f */
    private static Object[] f4074f;

    /* renamed from: g */
    private static int f4075g;

    /* renamed from: h */
    private int[] f4076h;

    /* renamed from: i */
    Object[] f4077i;

    /* renamed from: j */
    int f4078j;

    /* renamed from: k */
    private AbstractC0832h<E, E> f4079k;

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.b$a */
    public class C0826a extends AbstractC0832h<E, E> {
        C0826a() {
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: a */
        public void mo4869a() {
            C0825b.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: b */
        public Object mo4870b(int i, int i2) {
            return C0825b.this.f4077i[i];
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: c */
        public Map<E, E> mo4871c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: d */
        public int mo4872d() {
            return C0825b.this.f4078j;
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: e */
        public int mo4873e(Object obj) {
            return C0825b.this.mo4884e(obj);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: f */
        public int mo4874f(Object obj) {
            return C0825b.this.mo4884e(obj);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: g */
        public void mo4875g(E e, E e2) {
            C0825b.this.add(e);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: h */
        public void mo4876h(int i) {
            C0825b.this.mo4886h(i);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p021d.AbstractC0832h
        /* renamed from: i */
        public E mo4877i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0825b() {
        this(0);
    }

    public C0825b(int i) {
        if (i == 0) {
            this.f4076h = f4070b;
            this.f4077i = f4071c;
        } else {
            m4811a(i);
        }
        this.f4078j = 0;
    }

    /* renamed from: a */
    private void m4811a(int i) {
        if (i == 8) {
            synchronized (C0825b.class) {
                Object[] objArr = f4074f;
                if (objArr != null) {
                    this.f4077i = objArr;
                    f4074f = (Object[]) objArr[0];
                    this.f4076h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4075g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0825b.class) {
                Object[] objArr2 = f4072d;
                if (objArr2 != null) {
                    this.f4077i = objArr2;
                    f4072d = (Object[]) objArr2[0];
                    this.f4076h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4073e--;
                    return;
                }
            }
        }
        this.f4076h = new int[i];
        this.f4077i = new Object[i];
    }

    /* renamed from: c */
    private static void m4812c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0825b.class) {
                if (f4075g < 10) {
                    objArr[0] = f4074f;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4074f = objArr;
                    f4075g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0825b.class) {
                if (f4073e < 10) {
                    objArr[0] = f4072d;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4072d = objArr;
                    f4073e++;
                }
            }
        }
    }

    /* renamed from: d */
    private AbstractC0832h<E, E> m4813d() {
        if (this.f4079k == null) {
            this.f4079k = new C0826a();
        }
        return this.f4079k;
    }

    /* renamed from: f */
    private int m4814f(Object obj, int i) {
        int i2 = this.f4078j;
        if (i2 == 0) {
            return -1;
        }
        int a = C0829e.m4844a(this.f4076h, i2, i);
        if (a < 0 || obj.equals(this.f4077i[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f4076h[i3] == i) {
            if (obj.equals(this.f4077i[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f4076h[i4] == i) {
            if (obj.equals(this.f4077i[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: g */
    private int m4815g() {
        int i = this.f4078j;
        if (i == 0) {
            return -1;
        }
        int a = C0829e.m4844a(this.f4076h, i, 0);
        if (a < 0 || this.f4077i[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f4076h[i2] == 0) {
            if (this.f4077i[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f4076h[i3] == 0) {
            if (this.f4077i[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m4815g();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m4814f(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f4078j;
        int[] iArr = this.f4076h;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f4077i;
            m4811a(i5);
            int[] iArr2 = this.f4076h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4077i, 0, objArr.length);
            }
            m4812c(iArr, objArr, this.f4078j);
        }
        int i6 = this.f4078j;
        if (i3 < i6) {
            int[] iArr3 = this.f4076h;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f4077i;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f4078j - i3);
        }
        this.f4076h[i3] = i;
        this.f4077i[i3] = e;
        this.f4078j++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: b.d.b<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        mo4880b(this.f4078j + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public void mo4880b(int i) {
        int[] iArr = this.f4076h;
        if (iArr.length < i) {
            Object[] objArr = this.f4077i;
            m4811a(i);
            int i2 = this.f4078j;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f4076h, 0, i2);
                System.arraycopy(objArr, 0, this.f4077i, 0, this.f4078j);
            }
            m4812c(iArr, objArr, this.f4078j);
        }
    }

    public void clear() {
        int i = this.f4078j;
        if (i != 0) {
            m4812c(this.f4076h, this.f4077i, i);
            this.f4076h = f4070b;
            this.f4077i = f4071c;
            this.f4078j = 0;
        }
    }

    public boolean contains(Object obj) {
        return mo4884e(obj) >= 0;
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

    /* renamed from: e */
    public int mo4884e(Object obj) {
        return obj == null ? m4815g() : m4814f(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f4078j; i++) {
                try {
                    if (!set.contains(mo4888i(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public E mo4886h(int i) {
        Object[] objArr = this.f4077i;
        E e = (E) objArr[i];
        int i2 = this.f4078j;
        if (i2 <= 1) {
            m4812c(this.f4076h, objArr, i2);
            this.f4076h = f4070b;
            this.f4077i = f4071c;
            this.f4078j = 0;
        } else {
            int[] iArr = this.f4076h;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f4078j = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr2 = this.f4077i;
                    System.arraycopy(objArr2, i5, objArr2, i, this.f4078j - i);
                }
                this.f4077i[this.f4078j] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m4811a(i3);
                this.f4078j--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f4076h, 0, i);
                    System.arraycopy(objArr, 0, this.f4077i, 0, i);
                }
                int i6 = this.f4078j;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f4076h, i, i6 - i);
                    System.arraycopy(objArr, i7, this.f4077i, i, this.f4078j - i);
                }
            }
        }
        return e;
    }

    public int hashCode() {
        int[] iArr = this.f4076h;
        int i = this.f4078j;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public E mo4888i(int i) {
        return (E) this.f4077i[i];
    }

    public boolean isEmpty() {
        return this.f4078j <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return m4813d().mo4938m().iterator();
    }

    public boolean remove(Object obj) {
        int e = mo4884e(obj);
        if (e < 0) {
            return false;
        }
        mo4886h(e);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f4078j - 1; i >= 0; i--) {
            if (!collection.contains(this.f4077i[i])) {
                mo4886h(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f4078j;
    }

    public Object[] toArray() {
        int i = this.f4078j;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4077i, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f4078j) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f4078j));
        }
        System.arraycopy(this.f4077i, 0, tArr, 0, this.f4078j);
        int length = tArr.length;
        int i = this.f4078j;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4078j * 14);
        sb.append('{');
        for (int i = 0; i < this.f4078j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E i2 = mo4888i(i);
            if (i2 != this) {
                sb.append((Object) i2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
