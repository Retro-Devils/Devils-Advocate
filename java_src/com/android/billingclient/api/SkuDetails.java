package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class SkuDetails {

    /* renamed from: a */
    private final String f6402a;

    /* renamed from: b */
    private final JSONObject f6403b;

    /* renamed from: com.android.billingclient.api.SkuDetails$a */
    static class C1565a {

        /* renamed from: a */
        private final List<SkuDetails> f6404a;

        /* renamed from: b */
        private final int f6405b;

        /* renamed from: c */
        private final String f6406c;

        public C1565a(int i, String str, List<SkuDetails> list) {
            this.f6405b = i;
            this.f6406c = str;
            this.f6404a = list;
        }

        /* renamed from: a */
        public final List<SkuDetails> mo6903a() {
            return this.f6404a;
        }

        /* renamed from: b */
        public final int mo6904b() {
            return this.f6405b;
        }

        /* renamed from: c */
        public final String mo6905c() {
            return this.f6406c;
        }
    }

    public SkuDetails(String str) {
        this.f6402a = str;
        this.f6403b = new JSONObject(str);
        if (TextUtils.isEmpty(mo6896b())) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(mo6897c())) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    /* renamed from: a */
    public String mo6895a() {
        return this.f6403b.optString("price");
    }

    /* renamed from: b */
    public String mo6896b() {
        return this.f6403b.optString("productId");
    }

    /* renamed from: c */
    public String mo6897c() {
        return this.f6403b.optString("type");
    }

    /* renamed from: d */
    public final String mo6898d() {
        return this.f6403b.optString("packageName");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo6899e() {
        return this.f6403b.optString("skuDetailsToken");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f6402a, ((SkuDetails) obj).f6402a);
    }

    public int hashCode() {
        return this.f6402a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6402a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
