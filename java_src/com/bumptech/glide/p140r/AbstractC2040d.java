package com.bumptech.glide.p140r;

/* renamed from: com.bumptech.glide.r.d */
public interface AbstractC2040d {

    /* renamed from: com.bumptech.glide.r.d$a */
    public enum EnumC2041a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: h */
        private final boolean f7514h;

        private EnumC2041a(boolean z) {
            this.f7514h = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7801a() {
            return this.f7514h;
        }
    }

    /* renamed from: a */
    boolean mo7786a(AbstractC2039c cVar);

    /* renamed from: c */
    boolean mo7788c();

    /* renamed from: d */
    AbstractC2040d mo7790d();

    /* renamed from: e */
    void mo7791e(AbstractC2039c cVar);

    /* renamed from: g */
    void mo7793g(AbstractC2039c cVar);

    /* renamed from: k */
    boolean mo7798k(AbstractC2039c cVar);

    /* renamed from: l */
    boolean mo7799l(AbstractC2039c cVar);
}
