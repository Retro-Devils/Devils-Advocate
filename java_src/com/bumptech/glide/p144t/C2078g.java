package com.bumptech.glide.p144t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.t.g */
public class C2078g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f7599a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f7600b;

    /* renamed from: c */
    private long f7601c;

    /* renamed from: d */
    private long f7602d;

    public C2078g(long j) {
        this.f7600b = j;
        this.f7601c = j;
    }

    /* renamed from: f */
    private void m9417f() {
        mo7860m(this.f7601c);
    }

    /* renamed from: b */
    public void mo7855b() {
        mo7860m(0);
    }

    /* renamed from: g */
    public synchronized Y mo7856g(T t) {
        return this.f7599a.get(t);
    }

    /* renamed from: h */
    public synchronized long mo7857h() {
        return this.f7601c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo7225i(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7226j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y mo7858k(T t, Y y) {
        long i = (long) mo7225i(y);
        if (i >= this.f7601c) {
            mo7226j(t, y);
            return null;
        }
        if (y != null) {
            this.f7602d += i;
        }
        Y put = this.f7599a.put(t, y);
        if (put != null) {
            this.f7602d -= (long) mo7225i(put);
            if (!put.equals(y)) {
                mo7226j(t, put);
            }
        }
        m9417f();
        return put;
    }

    /* renamed from: l */
    public synchronized Y mo7859l(T t) {
        Y remove;
        remove = this.f7599a.remove(t);
        if (remove != null) {
            this.f7602d -= (long) mo7225i(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo7860m(long j) {
        while (this.f7602d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f7599a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f7602d -= (long) mo7225i(value);
            T key = next.getKey();
            it.remove();
            mo7226j(key, value);
        }
    }
}
