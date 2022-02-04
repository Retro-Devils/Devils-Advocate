package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;

/* renamed from: com.android.billingclient.api.c */
public abstract class AbstractC1571c {

    /* renamed from: com.android.billingclient.api.c$a */
    public static final class C1572a {

        /* renamed from: a */
        private boolean f6414a;

        /* renamed from: b */
        private final Context f6415b;

        /* renamed from: c */
        private AbstractC1585h f6416c;

        private C1572a(Context context) {
            this.f6415b = context;
        }

        /* renamed from: a */
        public final AbstractC1571c mo6918a() {
            Context context = this.f6415b;
            if (context != null) {
                AbstractC1585h hVar = this.f6416c;
                if (hVar != null) {
                    boolean z = this.f6414a;
                    if (z) {
                        return new C1574d(null, z, context, hVar);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        /* renamed from: b */
        public final C1572a mo6919b() {
            this.f6414a = true;
            return this;
        }

        /* renamed from: c */
        public final C1572a mo6920c(AbstractC1585h hVar) {
            this.f6416c = hVar;
            return this;
        }
    }

    /* renamed from: e */
    public static C1572a m7638e(Context context) {
        return new C1572a(context);
    }

    /* renamed from: a */
    public abstract void mo6911a(C1566a aVar, AbstractC1569b bVar);

    /* renamed from: b */
    public abstract void mo6912b();

    /* renamed from: c */
    public abstract boolean mo6913c();

    /* renamed from: d */
    public abstract C1582g mo6914d(Activity activity, C1579f fVar);

    /* renamed from: f */
    public abstract Purchase.C1564a mo6915f(String str);

    /* renamed from: g */
    public abstract void mo6916g(C1587i iVar, AbstractC1590j jVar);

    /* renamed from: h */
    public abstract void mo6917h(AbstractC1577e eVar);
}
