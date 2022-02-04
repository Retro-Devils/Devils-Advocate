package com.bumptech.glide.load.p122o.p123a0;

import android.util.Log;
import com.bumptech.glide.p144t.C2081j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.o.a0.j */
public final class C1701j implements AbstractC1690b {

    /* renamed from: a */
    private final C1698h<C1702a, Object> f6727a = new C1698h<>();

    /* renamed from: b */
    private final C1703b f6728b = new C1703b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f6729c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, AbstractC1689a<?>> f6730d = new HashMap();

    /* renamed from: e */
    private final int f6731e;

    /* renamed from: f */
    private int f6732f;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.a0.j$a */
    public static final class C1702a implements AbstractC1708m {

        /* renamed from: a */
        private final C1703b f6733a;

        /* renamed from: b */
        int f6734b;

        /* renamed from: c */
        private Class<?> f6735c;

        C1702a(C1703b bVar) {
            this.f6733a = bVar;
        }

        @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1708m
        /* renamed from: a */
        public void mo7170a() {
            this.f6733a.mo7179c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7196b(int i, Class<?> cls) {
            this.f6734b = i;
            this.f6735c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1702a)) {
                return false;
            }
            C1702a aVar = (C1702a) obj;
            return this.f6734b == aVar.f6734b && this.f6735c == aVar.f6735c;
        }

        public int hashCode() {
            int i = this.f6734b * 31;
            Class<?> cls = this.f6735c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f6734b + "array=" + this.f6735c + '}';
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.j$b */
    private static final class C1703b extends AbstractC1694d<C1702a> {
        C1703b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1702a mo7175a() {
            return new C1702a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1702a mo7201e(int i, Class<?> cls) {
            C1702a aVar = (C1702a) mo7178b();
            aVar.mo7196b(i, cls);
            return aVar;
        }
    }

    public C1701j(int i) {
        this.f6731e = i;
    }

    /* renamed from: f */
    private void m8053f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m = m8060m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                m.remove(valueOf);
            } else {
                m.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
    }

    /* renamed from: g */
    private void m8054g() {
        m8055h(this.f6731e);
    }

    /* renamed from: h */
    private void m8055h(int i) {
        while (this.f6732f > i) {
            Object f = this.f6727a.mo7189f();
            C2081j.m9432d(f);
            AbstractC1689a i2 = m8056i(f);
            this.f6732f -= i2.mo7155b(f) * i2.mo7156c();
            m8053f(i2.mo7155b(f), f.getClass());
            if (Log.isLoggable(i2.mo7154a(), 2)) {
                Log.v(i2.mo7154a(), "evicted: " + i2.mo7155b(f));
            }
        }
    }

    /* renamed from: i */
    private <T> AbstractC1689a<T> m8056i(T t) {
        return m8057j(t.getClass());
    }

    /* renamed from: j */
    private <T> AbstractC1689a<T> m8057j(Class<T> cls) {
        C1697g gVar = (AbstractC1689a<T>) this.f6730d.get(cls);
        if (gVar == null) {
            if (cls.equals(int[].class)) {
                gVar = new C1700i();
            } else if (cls.equals(byte[].class)) {
                gVar = new C1697g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f6730d.put(cls, gVar);
        }
        return gVar;
    }

    /* renamed from: k */
    private <T> T m8058k(C1702a aVar) {
        return (T) this.f6727a.mo7187a(aVar);
    }

    /* renamed from: l */
    private <T> T m8059l(C1702a aVar, Class<T> cls) {
        AbstractC1689a<T> j = m8057j(cls);
        T t = (T) m8058k(aVar);
        if (t != null) {
            this.f6732f -= j.mo7155b(t) * j.mo7156c();
            m8053f(j.mo7155b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(j.mo7154a(), 2)) {
            Log.v(j.mo7154a(), "Allocated " + aVar.f6734b + " bytes");
        }
        return j.newArray(aVar.f6734b);
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m8060m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f6729c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6729c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m8061n() {
        int i = this.f6732f;
        return i == 0 || this.f6731e / i >= 2;
    }

    /* renamed from: o */
    private boolean m8062o(int i) {
        return i <= this.f6731e / 2;
    }

    /* renamed from: p */
    private boolean m8063p(int i, Integer num) {
        return num != null && (m8061n() || num.intValue() <= i * 8);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1690b
    /* renamed from: a */
    public synchronized void mo7158a(int i) {
        if (i >= 40) {
            try {
                mo7159b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m8055h(this.f6731e / 2);
        }
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1690b
    /* renamed from: b */
    public synchronized void mo7159b() {
        m8055h(0);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1690b
    /* renamed from: c */
    public synchronized <T> T mo7160c(int i, Class<T> cls) {
        return (T) m8059l(this.f6728b.mo7201e(i, cls), cls);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1690b
    /* renamed from: d */
    public synchronized <T> void mo7161d(T t) {
        Class<?> cls = t.getClass();
        AbstractC1689a<T> j = m8057j(cls);
        int b = j.mo7155b(t);
        int c = j.mo7156c() * b;
        if (m8062o(c)) {
            C1702a e = this.f6728b.mo7201e(b, cls);
            this.f6727a.mo7188d(e, t);
            NavigableMap<Integer, Integer> m = m8060m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e.f6734b));
            Integer valueOf = Integer.valueOf(e.f6734b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f6732f += c;
            m8054g();
        }
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1690b
    /* renamed from: e */
    public synchronized <T> T mo7162e(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m8060m(cls).ceilingKey(Integer.valueOf(i));
        return (T) m8059l(m8063p(i, ceilingKey) ? this.f6728b.mo7201e(ceilingKey.intValue(), cls) : this.f6728b.mo7201e(i, cls), cls);
    }
}
