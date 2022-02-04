package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* renamed from: com.android.billingclient.api.v */
final class C1603v {
    /* renamed from: a */
    static C1582g m7731a(Bundle bundle, String str, String str2) {
        String format;
        C1582g gVar = C1602u.f6509l;
        if (bundle == null) {
            format = String.format("%s got null owned items list", str2);
        } else {
            int b = C1314b.m6845b(bundle, str);
            C1582g a = C1582g.m7711b().mo6945c(b).mo6944b(C1314b.m6853j(bundle, str)).mo6943a();
            if (b != 0) {
                C1314b.m6854k(str, String.format("%s failed. Response code: %s", str2, Integer.valueOf(b)));
                return a;
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                format = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else if (stringArrayList3 != null) {
                    return C1602u.f6513p;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            }
        }
        C1314b.m6854k(str, format);
        return gVar;
    }
}
