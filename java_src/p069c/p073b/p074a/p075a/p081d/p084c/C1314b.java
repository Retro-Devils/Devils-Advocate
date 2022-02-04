package p069c.p073b.p074a.p075a.p081d.p084c;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C1566a;
import com.android.billingclient.api.C1579f;
import com.android.billingclient.api.C1582g;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: c.b.a.a.d.c.b */
public final class C1314b {

    /* renamed from: a */
    public static int f5585a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m6844a(Intent intent, String str) {
        return m6852i(intent, str).mo6942a();
    }

    /* renamed from: b */
    public static int m6845b(Bundle bundle, String str) {
        if (bundle == null) {
            m6854k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m6851h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            m6854k(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    /* renamed from: c */
    public static Bundle m6846c(C1566a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    /* renamed from: d */
    public static Bundle m6847d(C1579f fVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (fVar.mo6932c() != 0) {
            bundle.putInt("prorationMode", fVar.mo6932c());
        }
        if (!TextUtils.isEmpty(fVar.mo6935k())) {
            bundle.putString("accountId", fVar.mo6935k());
        }
        if (!TextUtils.isEmpty(fVar.mo6937o())) {
            bundle.putString("obfuscatedProfileId", fVar.mo6937o());
        }
        if (fVar.mo6933d()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(fVar.mo6930a())) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(fVar.mo6930a())));
        }
        if (!TextUtils.isEmpty(fVar.mo6931b())) {
            bundle.putString("oldSkuPurchaseToken", fVar.mo6931b());
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle m6848e(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: f */
    public static Bundle m6849f(boolean z, boolean z2, boolean z3, String str, String str2) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && str2 != null) {
            bundle.putString("SKU_PACKAGE_NAME", str2);
        }
        return bundle;
    }

    /* renamed from: g */
    public static List<Purchase> m6850g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            m6854k("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase l = m6855l(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (l == null) {
                m6854k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(l);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase l2 = m6855l(stringArrayList.get(i), stringArrayList2.get(i));
                if (l2 != null) {
                    arrayList.add(l2);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static void m6851h(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: i */
    public static C1582g m6852i(Intent intent, String str) {
        C1582g.C1583a b;
        if (intent == null) {
            m6854k("BillingHelper", "Got null intent!");
            b = C1582g.m7711b().mo6945c(6).mo6944b("An internal error occurred.");
        } else {
            b = C1582g.m7711b().mo6945c(m6845b(intent.getExtras(), str)).mo6944b(m6853j(intent.getExtras(), str));
        }
        return b.mo6943a();
    }

    /* renamed from: j */
    public static String m6853j(Bundle bundle, String str) {
        if (bundle == null) {
            m6854k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m6851h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            m6854k(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    /* renamed from: k */
    public static void m6854k(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: l */
    private static Purchase m6855l(String str, String str2) {
        if (str == null || str2 == null) {
            m6854k("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            m6854k("BillingHelper", sb.toString());
            return null;
        }
    }
}
