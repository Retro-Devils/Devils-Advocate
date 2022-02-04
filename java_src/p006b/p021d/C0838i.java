package p006b.p021d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: b.d.i */
public class C0838i<K, V> {

    /* renamed from: b */
    static Object[] f4120b;

    /* renamed from: c */
    static int f4121c;

    /* renamed from: d */
    static Object[] f4122d;

    /* renamed from: e */
    static int f4123e;

    /* renamed from: f */
    int[] f4124f;

    /* renamed from: g */
    Object[] f4125g;

    /* renamed from: h */
    int f4126h;

    public C0838i() {
        this.f4124f = C0829e.f4089a;
        this.f4125g = C0829e.f4091c;
        this.f4126h = 0;
    }

    public C0838i(int i) {
        if (i == 0) {
            this.f4124f = C0829e.f4089a;
            this.f4125g = C0829e.f4091c;
        } else {
            m4895a(i);
        }
        this.f4126h = 0;
    }

    public C0838i(C0838i<K, V> iVar) {
        this();
        if (iVar != null) {
            mo5013j(iVar);
        }
    }

    /* renamed from: a */
    private void m4895a(int i) {
        if (i == 8) {
            synchronized (C0838i.class) {
                Object[] objArr = f4122d;
                if (objArr != null) {
                    this.f4125g = objArr;
                    f4122d = (Object[]) objArr[0];
                    this.f4124f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4123e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0838i.class) {
                Object[] objArr2 = f4120b;
                if (objArr2 != null) {
                    this.f4125g = objArr2;
                    f4120b = (Object[]) objArr2[0];
                    this.f4124f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4121c--;
                    return;
                }
            }
        }
        this.f4124f = new int[i];
        this.f4125g = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m4896b(int[] iArr, int i, int i2) {
        try {
            return C0829e.m4844a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m4897d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0838i.class) {
                if (f4123e < 10) {
                    objArr[0] = f4122d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4122d = objArr;
                    f4123e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0838i.class) {
                if (f4121c < 10) {
                    objArr[0] = f4120b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4120b = objArr;
                    f4121c++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4999c(int i) {
        int i2 = this.f4126h;
        int[] iArr = this.f4124f;
        if (iArr.length < i) {
            Object[] objArr = this.f4125g;
            m4895a(i);
            if (this.f4126h > 0) {
                System.arraycopy(iArr, 0, this.f4124f, 0, i2);
                System.arraycopy(objArr, 0, this.f4125g, 0, i2 << 1);
            }
            m4897d(iArr, objArr, i2);
        }
        if (this.f4126h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f4126h;
        if (i > 0) {
            int[] iArr = this.f4124f;
            Object[] objArr = this.f4125g;
            this.f4124f = C0829e.f4089a;
            this.f4125g = C0829e.f4091c;
            this.f4126h = 0;
            m4897d(iArr, objArr, i);
        }
        if (this.f4126h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo5005f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo5009h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo5003e(Object obj, int i) {
        int i2 = this.f4126h;
        if (i2 == 0) {
            return -1;
        }
        int b = m4896b(this.f4124f, i2, i);
        if (b < 0 || obj.equals(this.f4125g[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f4124f[i3] == i) {
            if (obj.equals(this.f4125g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f4124f[i4] == i) {
            if (obj.equals(this.f4125g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0838i) {
            C0838i iVar = (C0838i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f4126h; i++) {
                try {
                    K i2 = mo5011i(i);
                    V m = mo5016m(i);
                    Object obj2 = iVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !iVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f4126h; i3++) {
                try {
                    K i4 = mo5011i(i3);
                    V m2 = mo5016m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo5005f(Object obj) {
        return obj == null ? mo5006g() : mo5003e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5006g() {
        int i = this.f4126h;
        if (i == 0) {
            return -1;
        }
        int b = m4896b(this.f4124f, i, 0);
        if (b < 0 || this.f4125g[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f4124f[i2] == 0) {
            if (this.f4125g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f4124f[i3] == 0) {
            if (this.f4125g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo5005f(obj);
        return f >= 0 ? (V) this.f4125g[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo5009h(Object obj) {
        int i = this.f4126h * 2;
        Object[] objArr = this.f4125g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f4124f;
        Object[] objArr = this.f4125g;
        int i = this.f4126h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo5011i(int i) {
        return (K) this.f4125g[i << 1];
    }

    public boolean isEmpty() {
        return this.f4126h <= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: b.d.i<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void mo5013j(C0838i<? extends K, ? extends V> iVar) {
        int i = iVar.f4126h;
        mo4999c(this.f4126h + i);
        if (this.f4126h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(iVar.mo5011i(i2), iVar.mo5016m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(iVar.f4124f, 0, this.f4124f, 0, i);
            System.arraycopy(iVar.f4125g, 0, this.f4125g, 0, i << 1);
            this.f4126h = i;
        }
    }

    /* renamed from: k */
    public V mo5014k(int i) {
        Object[] objArr = this.f4125g;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f4126h;
        int i4 = 0;
        if (i3 <= 1) {
            m4897d(this.f4124f, objArr, i3);
            this.f4124f = C0829e.f4089a;
            this.f4125g = C0829e.f4091c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f4124f;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f4125g;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f4125g;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m4895a(i6);
                if (i3 == this.f4126h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f4124f, 0, i);
                        System.arraycopy(objArr, 0, this.f4125g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f4124f, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f4125g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f4126h) {
            this.f4126h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo5015l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f4125g;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo5016m(int i) {
        return (V) this.f4125g[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f4126h;
        if (k == null) {
            i2 = mo5006g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo5003e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f4125g;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f4124f;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f4125g;
            m4895a(i6);
            if (i3 == this.f4126h) {
                int[] iArr2 = this.f4124f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f4125g, 0, objArr2.length);
                }
                m4897d(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f4124f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f4125g;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f4126h - i5) << 1);
        }
        int i8 = this.f4126h;
        if (i3 == i8) {
            int[] iArr4 = this.f4124f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f4125g;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f4126h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo5005f(obj);
        if (f >= 0) {
            return mo5014k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo5005f(obj);
        if (f < 0) {
            return false;
        }
        V m = mo5016m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo5014k(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo5005f(k);
        if (f >= 0) {
            return mo5015l(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo5005f(k);
        if (f < 0) {
            return false;
        }
        V m = mo5016m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo5015l(f, v2);
        return true;
    }

    public int size() {
        return this.f4126h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4126h * 28);
        sb.append('{');
        for (int i = 0; i < this.f4126h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K i2 = mo5011i(i);
            if (i2 != this) {
                sb.append((Object) i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m = mo5016m(i);
            if (m != this) {
                sb.append((Object) m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
