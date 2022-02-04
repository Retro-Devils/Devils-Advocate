package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.android.billingclient.api.f */
public class C1579f {

    /* renamed from: a */
    private String f6453a;

    /* renamed from: b */
    private String f6454b;

    /* renamed from: c */
    private String f6455c;

    /* renamed from: d */
    private String f6456d;

    /* renamed from: e */
    private String f6457e;

    /* renamed from: f */
    private int f6458f;

    /* renamed from: g */
    private ArrayList<SkuDetails> f6459g;

    /* renamed from: h */
    private boolean f6460h;

    /* renamed from: com.android.billingclient.api.f$a */
    public static class C1580a {

        /* renamed from: a */
        private String f6461a;

        /* renamed from: b */
        private String f6462b;

        /* renamed from: c */
        private String f6463c;

        /* renamed from: d */
        private String f6464d;

        /* renamed from: e */
        private int f6465e;

        /* renamed from: f */
        private ArrayList<SkuDetails> f6466f;

        /* renamed from: g */
        private boolean f6467g;

        private C1580a() {
            this.f6465e = 0;
        }

        /* renamed from: a */
        public C1579f mo6939a() {
            ArrayList<SkuDetails> arrayList = this.f6466f;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.f6466f;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                SkuDetails skuDetails = arrayList2.get(i2);
                i2++;
                if (skuDetails == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.f6466f.size() > 1) {
                SkuDetails skuDetails2 = this.f6466f.get(0);
                String c = skuDetails2.mo6897c();
                ArrayList<SkuDetails> arrayList3 = this.f6466f;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    SkuDetails skuDetails3 = arrayList3.get(i3);
                    i3++;
                    if (!c.equals(skuDetails3.mo6897c())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String d = skuDetails2.mo6898d();
                if (TextUtils.isEmpty(d)) {
                    ArrayList<SkuDetails> arrayList4 = this.f6466f;
                    int size3 = arrayList4.size();
                    while (i < size3) {
                        SkuDetails skuDetails4 = arrayList4.get(i);
                        i++;
                        if (!TextUtils.isEmpty(skuDetails4.mo6898d())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                } else {
                    ArrayList<SkuDetails> arrayList5 = this.f6466f;
                    int size4 = arrayList5.size();
                    while (i < size4) {
                        SkuDetails skuDetails5 = arrayList5.get(i);
                        i++;
                        if (!d.equals(skuDetails5.mo6898d())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            C1579f fVar = new C1579f();
            fVar.f6453a = null;
            fVar.f6454b = this.f6461a;
            fVar.f6457e = this.f6464d;
            fVar.f6455c = this.f6462b;
            fVar.f6456d = this.f6463c;
            fVar.f6458f = this.f6465e;
            fVar.f6459g = this.f6466f;
            fVar.f6460h = this.f6467g;
            return fVar;
        }

        /* renamed from: b */
        public C1580a mo6940b(SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.f6466f = arrayList;
            return this;
        }
    }

    private C1579f() {
        this.f6458f = 0;
    }

    /* renamed from: e */
    public static C1580a m7690e() {
        return new C1580a();
    }

    /* renamed from: a */
    public String mo6930a() {
        return this.f6455c;
    }

    /* renamed from: b */
    public String mo6931b() {
        return this.f6456d;
    }

    /* renamed from: c */
    public int mo6932c() {
        return this.f6458f;
    }

    /* renamed from: d */
    public boolean mo6933d() {
        return this.f6460h;
    }

    /* renamed from: h */
    public final ArrayList<SkuDetails> mo6934h() {
        ArrayList<SkuDetails> arrayList = new ArrayList<>();
        arrayList.addAll(this.f6459g);
        return arrayList;
    }

    /* renamed from: k */
    public final String mo6935k() {
        return this.f6454b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo6936n() {
        boolean z;
        ArrayList<SkuDetails> arrayList = this.f6459g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            SkuDetails skuDetails = arrayList.get(i);
            i++;
            if (skuDetails.mo6898d().isEmpty()) {
                z = false;
                break;
            }
        }
        return (!this.f6460h && this.f6454b == null && this.f6453a == null && this.f6457e == null && this.f6458f == 0 && !z) ? false : true;
    }

    /* renamed from: o */
    public final String mo6937o() {
        return this.f6457e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo6938q() {
        return this.f6453a;
    }
}
