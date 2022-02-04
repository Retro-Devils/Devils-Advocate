package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.i */
public class C1587i {

    /* renamed from: a */
    private String f6472a;

    /* renamed from: b */
    private String f6473b;

    /* renamed from: c */
    private List<String> f6474c;

    /* renamed from: com.android.billingclient.api.i$a */
    public static class C1588a {

        /* renamed from: a */
        private String f6475a;

        /* renamed from: b */
        private List<String> f6476b;

        private C1588a() {
        }

        /* renamed from: a */
        public C1587i mo6952a() {
            if (this.f6475a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f6476b != null) {
                C1587i iVar = new C1587i();
                iVar.f6472a = this.f6475a;
                iVar.f6474c = this.f6476b;
                iVar.f6473b = null;
                return iVar;
            } else {
                throw new IllegalArgumentException("SKUs list must be set");
            }
        }

        /* renamed from: b */
        public C1588a mo6953b(List<String> list) {
            this.f6476b = new ArrayList(list);
            return this;
        }

        /* renamed from: c */
        public C1588a mo6954c(String str) {
            this.f6475a = str;
            return this;
        }
    }

    /* renamed from: c */
    public static C1588a m7719c() {
        return new C1588a();
    }

    /* renamed from: a */
    public String mo6949a() {
        return this.f6472a;
    }

    /* renamed from: b */
    public List<String> mo6950b() {
        return this.f6474c;
    }

    /* renamed from: d */
    public final String mo6951d() {
        return this.f6473b;
    }
}
