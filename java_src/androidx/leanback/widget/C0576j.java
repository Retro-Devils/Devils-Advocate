package androidx.leanback.widget;

/* renamed from: androidx.leanback.widget.j */
public final class C0576j {

    /* renamed from: a */
    private C0577a[] f2903a = {new C0577a()};

    /* renamed from: androidx.leanback.widget.j$a */
    public static class C0577a {

        /* renamed from: a */
        int f2904a = -1;

        /* renamed from: b */
        int f2905b = -1;

        /* renamed from: c */
        int f2906c = 0;

        /* renamed from: d */
        float f2907d = 50.0f;

        /* renamed from: e */
        boolean f2908e = false;

        /* renamed from: f */
        private boolean f2909f;

        /* renamed from: a */
        public final int mo3520a() {
            int i = this.f2905b;
            return i != -1 ? i : this.f2904a;
        }

        /* renamed from: b */
        public final int mo3521b() {
            return this.f2906c;
        }

        /* renamed from: c */
        public final float mo3522c() {
            return this.f2907d;
        }

        /* renamed from: d */
        public final int mo3523d() {
            return this.f2904a;
        }

        /* renamed from: e */
        public boolean mo3524e() {
            return this.f2909f;
        }

        /* renamed from: f */
        public final void mo3525f(int i) {
            this.f2906c = i;
        }

        /* renamed from: g */
        public final void mo3526g(float f) {
            if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f2907d = f;
        }

        /* renamed from: h */
        public final void mo3527h(boolean z) {
            this.f2908e = z;
        }

        /* renamed from: i */
        public final void mo3528i(int i) {
            this.f2904a = i;
        }
    }

    /* renamed from: a */
    public C0577a[] mo3519a() {
        return this.f2903a;
    }
}
