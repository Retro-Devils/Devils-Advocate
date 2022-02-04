package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.a */
public final class C1566a {

    /* renamed from: a */
    private String f6415a;

    /* renamed from: com.android.billingclient.api.a$a */
    public static final class C1567a {

        /* renamed from: a */
        private String f6416a;

        private C1567a() {
        }

        /* renamed from: a */
        public final C1566a mo6907a() {
            if (this.f6416a != null) {
                C1566a aVar = new C1566a();
                aVar.f6415a = this.f6416a;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public final C1567a mo6908b(String str) {
            this.f6416a = str;
            return this;
        }
    }

    private C1566a() {
    }

    /* renamed from: b */
    public static C1567a m7632b() {
        return new C1567a();
    }

    /* renamed from: a */
    public final String mo6906a() {
        return this.f6415a;
    }
}
