package com.bumptech.glide.p144t.p145l;

/* renamed from: com.bumptech.glide.t.l.c */
public abstract class AbstractC2093c {

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.t.l.c$b */
    public static class C2095b extends AbstractC2093c {

        /* renamed from: a */
        private volatile boolean f7614a;

        C2095b() {
            super();
        }

        @Override // com.bumptech.glide.p144t.p145l.AbstractC2093c
        /* renamed from: b */
        public void mo7874b(boolean z) {
            this.f7614a = z;
        }

        @Override // com.bumptech.glide.p144t.p145l.AbstractC2093c
        /* renamed from: c */
        public void mo7875c() {
            if (this.f7614a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private AbstractC2093c() {
    }

    /* renamed from: a */
    public static AbstractC2093c m9473a() {
        return new C2095b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo7874b(boolean z);

    /* renamed from: c */
    public abstract void mo7875c();
}
