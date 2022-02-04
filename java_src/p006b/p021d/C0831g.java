package p006b.p021d;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: b.d.g */
public class C0831g<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f4093a;

    /* renamed from: b */
    private int f4094b;

    /* renamed from: c */
    private int f4095c;

    /* renamed from: d */
    private int f4096d;

    /* renamed from: e */
    private int f4097e;

    /* renamed from: f */
    private int f4098f;

    /* renamed from: g */
    private int f4099g;

    /* renamed from: h */
    private int f4100h;

    public C0831g(int i) {
        if (i > 0) {
            this.f4095c = i;
            this.f4093a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: h */
    private int m4863h(K k, V v) {
        int j = mo4933j(k, v);
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k) + "=" + ((Object) v));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo4925a(K k) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4926b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final void mo4927c() {
        mo4935l(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = mo4925a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f4097e++;
        r1 = r4.f4093a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4.f4093a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.f4094b += m4863h(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        mo4926b(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        mo4935l(r4.f4095c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo4928d(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f4093a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f4099g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f4099g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f4100h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f4100h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.mo4925a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f4097e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f4097e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.f4093a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f4093a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f4094b     // Catch:{ all -> 0x004e }
            int r3 = r4.m4863h(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f4094b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.mo4926b(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f4095c
            r4.mo4935l(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p021d.C0831g.mo4928d(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public final synchronized int mo4929e() {
        return this.f4095c;
    }

    /* renamed from: f */
    public final V mo4930f(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4096d++;
            this.f4094b += m4863h(k, v);
            put = this.f4093a.put(k, v);
            if (put != null) {
                this.f4094b -= m4863h(k, put);
            }
        }
        if (put != null) {
            mo4926b(false, k, put, v);
        }
        mo4935l(this.f4095c);
        return put;
    }

    /* renamed from: g */
    public final V mo4931g(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f4093a.remove(k);
                if (remove != null) {
                    this.f4094b -= m4863h(k, remove);
                }
            }
            if (remove != null) {
                mo4926b(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: i */
    public final synchronized int mo4932i() {
        return this.f4094b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo4933j(K k, V v) {
        return 1;
    }

    /* renamed from: k */
    public final synchronized Map<K, V> mo4934k() {
        return new LinkedHashMap(this.f4093a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4935l(int r5) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p021d.C0831g.mo4935l(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f4099g;
        i2 = this.f4100h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f4095c), Integer.valueOf(this.f4099g), Integer.valueOf(this.f4100h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
