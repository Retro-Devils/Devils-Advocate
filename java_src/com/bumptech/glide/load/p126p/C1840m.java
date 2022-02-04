package com.bumptech.glide.load.p126p;

import com.bumptech.glide.p144t.C2078g;
import com.bumptech.glide.p144t.C2082k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.p.m */
public class C1840m<A, B> {

    /* renamed from: a */
    private final C2078g<C1842b<A>, B> f7075a;

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
        private static final Queue<C1842b<?>> f7077a = C2082k.m9438e(0);

        /* renamed from: b */
        private int f7078b;

        /* renamed from: c */
        private int f7079c;

        /* renamed from: d */
        private A f7080d;

        private C1842b() {
        }

        /* renamed from: a */
        static <A> C1842b<A> m8503a(A a, int i, int i2) {
            C1842b<A> bVar;
            Queue<C1842b<?>> queue = f7077a;
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
            this.f7080d = a;
            this.f7079c = i;
            this.f7078b = i2;
        }

        /* renamed from: c */
        public void mo7441c() {
            Queue<C1842b<?>> queue = f7077a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1842b)) {
                return false;
            }
            C1842b bVar = (C1842b) obj;
            return this.f7079c == bVar.f7079c && this.f7078b == bVar.f7078b && this.f7080d.equals(bVar.f7080d);
        }

        public int hashCode() {
            return (((this.f7078b * 31) + this.f7079c) * 31) + this.f7080d.hashCode();
        }
    }

    public C1840m(long j) {
        this.f7075a = new C1841a(j);
    }

    /* renamed from: a */
    public B mo7438a(A a, int i, int i2) {
        C1842b<A> a2 = C1842b.m8503a(a, i, i2);
        B g = this.f7075a.mo7856g(a2);
        a2.mo7441c();
        return g;
    }

    /* renamed from: b */
    public void mo7439b(A a, int i, int i2, B b) {
        this.f7075a.mo7858k(C1842b.m8503a(a, i, i2), b);
    }
}
