package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class Purchase {

    /* renamed from: a */
    private final String f6405a;

    /* renamed from: b */
    private final String f6406b;

    /* renamed from: c */
    private final JSONObject f6407c;

    /* renamed from: com.android.billingclient.api.Purchase$a */
    public static class C1564a {

        /* renamed from: a */
        private final List<Purchase> f6408a;

        /* renamed from: b */
        private final C1582g f6409b;

        public C1564a(C1582g gVar, List<Purchase> list) {
            this.f6408a = list;
            this.f6409b = gVar;
        }

        /* renamed from: a */
        public C1582g mo6892a() {
            return this.f6409b;
        }

        /* renamed from: b */
        public List<Purchase> mo6893b() {
            return this.f6408a;
        }

        /* renamed from: c */
        public int mo6894c() {
            return mo6892a().mo6942a();
        }
    }

    public Purchase(String str, String str2) {
        this.f6405a = str;
        this.f6406b = str2;
        this.f6407c = new JSONObject(str);
    }

    /* renamed from: a */
    public String mo6882a() {
        return this.f6407c.optString("developerPayload");
    }

    /* renamed from: b */
    public String mo6883b() {
        return this.f6405a;
    }

    /* renamed from: c */
    public int mo6884c() {
        return this.f6407c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: d */
    public String mo6885d() {
        JSONObject jSONObject = this.f6407c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: e */
    public String mo6886e() {
        return this.f6406b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f6405a, purchase.mo6883b()) && TextUtils.equals(this.f6406b, purchase.mo6886e());
    }

    /* renamed from: f */
    public String mo6888f() {
        return this.f6407c.optString("productId");
    }

    /* renamed from: g */
    public boolean mo6889g() {
        return this.f6407c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f6405a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6405a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
