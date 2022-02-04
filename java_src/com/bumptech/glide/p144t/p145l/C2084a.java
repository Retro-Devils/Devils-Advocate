package com.bumptech.glide.p144t.p145l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p038j.AbstractC0958f;
import p006b.p030g.p038j.C0960h;

/* renamed from: com.bumptech.glide.t.l.a */
public final class C2084a {

    /* renamed from: a */
    private static final AbstractC2091g<Object> f7602a = new C2085a();

    /* renamed from: com.bumptech.glide.t.l.a$a */
    class C2085a implements AbstractC2091g<Object> {
        C2085a() {
        }

        @Override // com.bumptech.glide.p144t.p145l.C2084a.AbstractC2091g
        /* renamed from: a */
        public void mo7871a(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.t.l.a$b */
    public class C2086b implements AbstractC2088d<List<T>> {
        C2086b() {
        }

        /* renamed from: b */
        public List<T> mo7238a() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.t.l.a$c */
    public class C2087c implements AbstractC2091g<List<T>> {
        C2087c() {
        }

        /* renamed from: b */
        public void mo7871a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$d */
    public interface AbstractC2088d<T> {
        /* renamed from: a */
        T mo7238a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.t.l.a$e */
    public static final class C2089e<T> implements AbstractC0958f<T> {

        /* renamed from: a */
        private final AbstractC2088d<T> f7603a;

        /* renamed from: b */
        private final AbstractC2091g<T> f7604b;

        /* renamed from: c */
        private final AbstractC0958f<T> f7605c;

        C2089e(AbstractC0958f<T> fVar, AbstractC2088d<T> dVar, AbstractC2091g<T> gVar) {
            this.f7605c = fVar;
            this.f7603a = dVar;
            this.f7604b = gVar;
        }

        @Override // p006b.p030g.p038j.AbstractC0958f
        /* renamed from: a */
        public boolean mo5398a(T t) {
            if (t instanceof AbstractC2090f) {
                t.mo7240e().mo7874b(true);
            }
            this.f7604b.mo7871a(t);
            return this.f7605c.mo5398a(t);
        }

        @Override // p006b.p030g.p038j.AbstractC0958f
        /* renamed from: b */
        public T mo5399b() {
            T b = this.f7605c.mo5399b();
            if (b == null) {
                b = this.f7603a.mo7238a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof AbstractC2090f) {
                b.mo7240e().mo7874b(false);
            }
            return b;
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$f */
    public interface AbstractC2090f {
        /* renamed from: e */
        AbstractC2093c mo7240e();
    }

    /* renamed from: com.bumptech.glide.t.l.a$g */
    public interface AbstractC2091g<T> {
        /* renamed from: a */
        void mo7871a(T t);
    }

    /* renamed from: a */
    private static <T extends AbstractC2090f> AbstractC0958f<T> m9453a(AbstractC0958f<T> fVar, AbstractC2088d<T> dVar) {
        return m9454b(fVar, dVar, m9455c());
    }

    /* renamed from: b */
    private static <T> AbstractC0958f<T> m9454b(AbstractC0958f<T> fVar, AbstractC2088d<T> dVar, AbstractC2091g<T> gVar) {
        return new C2089e(fVar, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> AbstractC2091g<T> m9455c() {
        return (AbstractC2091g<T>) f7602a;
    }

    /* renamed from: d */
    public static <T extends AbstractC2090f> AbstractC0958f<T> m9456d(int i, AbstractC2088d<T> dVar) {
        return m9453a(new C0960h(i), dVar);
    }

    /* renamed from: e */
    public static <T> AbstractC0958f<List<T>> m9457e() {
        return m9458f(20);
    }

    /* renamed from: f */
    public static <T> AbstractC0958f<List<T>> m9458f(int i) {
        return m9454b(new C0960h(i), new C2086b(), new C2087c());
    }
}
