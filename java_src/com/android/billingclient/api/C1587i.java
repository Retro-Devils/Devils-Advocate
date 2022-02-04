package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.i */
public class C1587i {

    /* renamed from: a */
    private String f6480a;

    /* renamed from: b */
    private String f6481b;

    /* renamed from: c */
    private List<String> f6482c;

    /* renamed from: com.android.billingclient.api.i$a */
    public static class C1588a {

        /* renamed from: a */
        private String f6483a;

        /* renamed from: b */
        private List<String> f6484b;

        private C1588a() {
        }

        /* renamed from: a */
        public C1587i mo6952a() {
            if (this.f6483a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f6484b != null) {
                C1587i iVar = new C1587i();
                iVar.f6480a = this.f6483a;
                iVar.f6482c = this.f6484b;
                iVar.f6481b = null;
                return iVar;
            } else {
                throw new IllegalArgumentException("SKUs list must be set");
            }
        }

        /* renamed from: b */
        public C1588a mo6953b(List<String> list) {
            this.f6484b = new ArrayList(list);
            return this;
        }

        /* renamed from: c */
        public C1588a mo6954c(String str) {
            this.f6483a = str;
            return this;
        }
    }

    /* renamed from: c */
    public static C1588a m7719c() {
        return new C1588a();
    }

    /* renamed from: a */
    public String mo6949a() {
        return this.f6480a;
    }

    /* renamed from: b */
    public List<String> mo6950b() {
        return this.f6482c;
    }

    /* renamed from: d */
    public final String mo6951d() {
        return this.f6481b;
    }
}
