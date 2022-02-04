package com.bumptech.glide.load.p126p;

import com.bumptech.glide.p144t.C2078g;
import com.bumptech.glide.p144t.C2082k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.p.m */
public class C1840m<A, B> {

    /* renamed from: a */
    private final C2078g<C1842b<A>, B> f7083a;

    /* renamed from: com.bumptech.glide.load.p.m$a */
    class C1841a extends C2078g<C1842b<A>, B> {
        C1841a(long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo7226j(C1842b<A> bVar, B b) {
            bVar.mo7441c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.p.m$b */
    public static final class C1842b<A> {

        /* renamed from: a */
        private static final Queue<C1842b<?>> f7085a = C2082k.m9438e(0);

        /* renamed from: b */
        private int f7086b;

        /* renamed from: c */
        private int f7087c;

        /* renamed from: d */
        private A f7088d;

        private C1842b() {
        }

        /* renamed from: a */
        static <A> C1842b<A> m8503a(A a, int i, int i2) {
            C1842b<A> bVar;
            Queue<C1842b<?>> queue = f7085a;
            synchronized (queue) {
                bVar = (C1842b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new C1842b<>();
            }
            bVar.m8504b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m8504b(A a, int i, int i2) {
            this.f7088d = a;
            this.f7087c = i;
            this.f7086b = i2;
        }

        /* renamed from: c */
        public void mo7441c() {
            Queue<C1842b<?>> queue = f7085a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1842b)) {
                return false;
            }
            C1842b bVar = (C1842b) obj;
            return this.f7087c == bVar.f7087c && this.f7086b == bVar.f7086b && this.f7088d.equals(bVar.f7088d);
        }

        public int hashCode() {
            return (((this.f7086b * 31) + this.f7087c) * 31) + this.f7088d.hashCode();
        }
    }

    public C1840m(long j) {
        this.f7083a = new C1841a(j);
    }

    /* renamed from: a */
    public B mo7438a(A a, int i, int i2) {
        C1842b<A> a2 = C1842b.m8503a(a, i, i2);
        B g = this.f7083a.mo7856g(a2);
        a2.mo7441c();
        return g;
    }

    /* renamed from: b */
    public void mo7439b(A a, int i, int i2, B b) {
        this.f7083a.mo7858k(C1842b.m8503a(a, i, i2), b);
    }
}
