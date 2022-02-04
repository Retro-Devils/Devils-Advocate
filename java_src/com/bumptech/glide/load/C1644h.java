package com.bumptech.glide.load;

import com.bumptech.glide.p144t.C2081j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
public final class C1644h<T> {

    /* renamed from: a */
    private static final AbstractC1646b<Object> f6649a = new C1645a();

    /* renamed from: b */
    private final T f6650b;

    /* renamed from: c */
    private final AbstractC1646b<T> f6651c;

    /* renamed from: d */
    private final String f6652d;

    /* renamed from: e */
    private volatile byte[] f6653e;

    /* renamed from: com.bumptech.glide.load.h$a */
    class C1645a implements AbstractC1646b<Object> {
        C1645a() {
        }

        @Override // com.bumptech.glide.load.C1644h.AbstractC1646b
        /* renamed from: a */
        public void mo7083a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    public interface AbstractC1646b<T> {
        /* renamed from: a */
        void mo7083a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C1644h(String str, T t, AbstractC1646b<T> bVar) {
        this.f6652d = C2081j.m9430b(str);
        this.f6650b = t;
        this.f6651c = (AbstractC1646b) C2081j.m9432d(bVar);
    }

    /* renamed from: a */
    public static <T> C1644h<T> m7869a(String str, T t, AbstractC1646b<T> bVar) {
        return new C1644h<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> AbstractC1646b<T> m7870b() {
        return (AbstractC1646b<T>) f6649a;
    }

    /* renamed from: d */
    private byte[] m7871d() {
        if (this.f6653e == null) {
            this.f6653e = this.f6652d.getBytes(AbstractC1643g.f6648a);
        }
        return this.f6653e;
    }

    /* renamed from: e */
    public static <T> C1644h<T> m7872e(String str) {
        return new C1644h<>(str, null, m7870b());
    }

    /* renamed from: f */
    public static <T> C1644h<T> m7873f(String str, T t) {
        return new C1644h<>(str, t, m7870b());
    }

    /* renamed from: c */
    public T mo7078c() {
        return this.f6650b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1644h) {
            return this.f6652d.equals(((C1644h) obj).f6652d);
        }
        return false;
    }

    /* renamed from: g */
    public void mo7080g(T t, MessageDigest messageDigest) {
        this.f6651c.mo7083a(m7871d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f6652d.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f6652d + '\'' + '}';
    }
}
