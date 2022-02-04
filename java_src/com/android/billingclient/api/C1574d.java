package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import p069c.p073b.p074a.p075a.p081d.p084c.AbstractBinderC1316d;
import p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.d */
public class C1574d extends AbstractC1571c {

    /* renamed from: a */
    private int f6418a;

    /* renamed from: b */
    private final String f6419b;

    /* renamed from: c */
    private final Handler f6420c;

    /* renamed from: d */
    private C1606y f6421d;

    /* renamed from: e */
    private Context f6422e;

    /* renamed from: f */
    private Context f6423f;

    /* renamed from: g */
    private AbstractC1313a f6424g;

    /* renamed from: h */
    private ServiceConnectionC1575a f6425h;

    /* renamed from: i */
    private boolean f6426i;

    /* renamed from: j */
    private boolean f6427j;

    /* renamed from: k */
    private boolean f6428k;

    /* renamed from: l */
    private boolean f6429l;

    /* renamed from: m */
    private boolean f6430m;

    /* renamed from: n */
    private boolean f6431n;

    /* renamed from: o */
    private boolean f6432o;

    /* renamed from: p */
    private boolean f6433p;

    /* renamed from: q */
    private boolean f6434q;

    /* renamed from: r */
    private ExecutorService f6435r;

    /* renamed from: s */
    private String f6436s;

    /* renamed from: t */
    private final ResultReceiver f6437t;

    /* access modifiers changed from: private */
    /* renamed from: com.android.billingclient.api.d$a */
    public final class ServiceConnectionC1575a implements ServiceConnection {

        /* renamed from: a */
        private final Object f6438a;

        /* renamed from: b */
        private boolean f6439b;

        /* renamed from: c */
        private AbstractC1577e f6440c;

        private ServiceConnectionC1575a(AbstractC1577e eVar) {
            this.f6438a = new Object();
            this.f6439b = false;
            this.f6440c = eVar;
        }

        /* synthetic */ ServiceConnectionC1575a(C1574d dVar, AbstractC1577e eVar, ResultReceiverC1573c0 c0Var) {
            this(eVar);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d */
        private final void m7684d(C1582g gVar) {
            C1574d.this.m7667t(new RunnableC1597p(this, gVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo6923b() {
            synchronized (this.f6438a) {
                this.f6440c = null;
                this.f6439b = true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1314b.m6851h("BillingClient", "Billing service connected.");
            C1574d.this.f6424g = AbstractBinderC1316d.m6865i(iBinder);
            if (C1574d.this.m7665r(new CallableC1599r(this), 30000, new RunnableC1598q(this)) == null) {
                m7684d(C1574d.this.m7671x());
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C1314b.m6854k("BillingClient", "Billing service disconnected.");
            C1574d.this.f6424g = null;
            C1574d.this.f6418a = 0;
            synchronized (this.f6438a) {
                AbstractC1577e eVar = this.f6440c;
                if (eVar != null) {
                    eVar.mo6927a();
                }
            }
        }
    }

    private C1574d(Context context, boolean z, AbstractC1585h hVar, String str, String str2) {
        this.f6418a = 0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6420c = handler;
        this.f6437t = new ResultReceiverC1573c0(this, handler);
        this.f6436s = str2;
        this.f6419b = str;
        m7657i(context, hVar, z);
    }

    C1574d(String str, boolean z, Context context, AbstractC1585h hVar) {
        this(context, z, hVar, m7663p(), null);
    }

    /* renamed from: i */
    private void m7657i(Context context, AbstractC1585h hVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.f6423f = applicationContext;
        this.f6421d = new C1606y(applicationContext, hVar);
        this.f6422e = context;
        this.f6434q = z;
    }

    /* renamed from: k */
    private final C1582g m7659k(C1582g gVar) {
        this.f6421d.mo6966c().mo6947a(gVar, null);
        return gVar;
    }

    /* renamed from: p */
    private static String m7663p() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "3.0.0";
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private final <T> Future<T> m7665r(Callable<T> callable, long j, Runnable runnable) {
        double d = (double) j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.f6435r == null) {
            this.f6435r = Executors.newFixedThreadPool(C1314b.f5577a);
        }
        try {
            Future<T> submit = this.f6435r.submit(callable);
            this.f6420c.postDelayed(new RunnableC1589i0(this, submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            C1314b.m6854k("BillingClient", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: t */
    private final void m7667t(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.f6420c.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: x */
    private final C1582g m7671x() {
        int i = this.f6418a;
        return (i == 0 || i == 3) ? C1602u.f6514q : C1602u.f6509l;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: y */
    private final Purchase.C1564a m7672y(String str) {
        String valueOf = String.valueOf(str);
        C1314b.m6851h("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle e = C1314b.m6848e(this.f6430m, this.f6434q, this.f6419b);
        String str2 = null;
        do {
            try {
                Bundle E = this.f6430m ? this.f6424g.mo6322E(9, this.f6423f.getPackageName(), str, str2, e) : this.f6424g.mo6327X(3, this.f6423f.getPackageName(), str, str2);
                C1582g a = C1603v.m7731a(E, "BillingClient", "getPurchase()");
                if (a != C1602u.f6513p) {
                    return new Purchase.C1564a(a, null);
                }
                ArrayList<String> stringArrayList = E.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = E.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = E.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    String valueOf2 = String.valueOf(stringArrayList.get(i));
                    C1314b.m6851h("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.mo6885d())) {
                            C1314b.m6854k("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        String valueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(valueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        C1314b.m6854k("BillingClient", sb.toString());
                        return new Purchase.C1564a(C1602u.f6509l, null);
                    }
                }
                str2 = E.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                C1314b.m6851h("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
            } catch (Exception e3) {
                String valueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(valueOf5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                C1314b.m6854k("BillingClient", sb2.toString());
                return new Purchase.C1564a(C1602u.f6514q, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.C1564a(C1602u.f6513p, arrayList);
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: a */
    public void mo6911a(C1566a aVar, AbstractC1569b bVar) {
        C1582g gVar;
        if (!mo6913c()) {
            gVar = C1602u.f6514q;
        } else if (TextUtils.isEmpty(aVar.mo6906a())) {
            C1314b.m6854k("BillingClient", "Please provide a valid purchase token.");
            gVar = C1602u.f6508k;
        } else if (!this.f6430m) {
            gVar = C1602u.f6499b;
        } else if (m7665r(new CallableC1581f0(this, aVar, bVar), 30000, new RunnableC1591j0(this, bVar)) == null) {
            bVar.mo6909a(m7671x());
            return;
        } else {
            return;
        }
        bVar.mo6909a(gVar);
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: b */
    public void mo6912b() {
        try {
            this.f6421d.mo6967d();
            ServiceConnectionC1575a aVar = this.f6425h;
            if (aVar != null) {
                aVar.mo6923b();
            }
            if (!(this.f6425h == null || this.f6424g == null)) {
                C1314b.m6851h("BillingClient", "Unbinding from service.");
                this.f6423f.unbindService(this.f6425h);
                this.f6425h = null;
            }
            this.f6424g = null;
            ExecutorService executorService = this.f6435r;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f6435r = null;
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(valueOf);
            C1314b.m6854k("BillingClient", sb.toString());
        } finally {
            this.f6418a = 3;
        }
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: c */
    public boolean mo6913c() {
        return (this.f6418a != 2 || this.f6424g == null || this.f6425h == null) ? false : true;
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: d */
    public C1582g mo6914d(Activity activity, C1579f fVar) {
        long j;
        Future future;
        C1582g gVar;
        if (mo6913c()) {
            ArrayList<SkuDetails> h = fVar.mo6934h();
            SkuDetails skuDetails = h.get(0);
            String c = skuDetails.mo6897c();
            if (!c.equals("subs") || this.f6426i) {
                boolean z = fVar.mo6930a() != null;
                if (z && !this.f6427j) {
                    C1314b.m6854k("BillingClient", "Current client doesn't support subscriptions update.");
                    gVar = C1602u.f6517t;
                    return m7659k(gVar);
                } else if (!fVar.mo6936n() || this.f6428k) {
                    String str = "";
                    for (int i = 0; i < h.size(); i++) {
                        String valueOf = String.valueOf(str);
                        String valueOf2 = String.valueOf(h.get(i));
                        StringBuilder sb = new StringBuilder(valueOf.length() + valueOf2.length());
                        sb.append(valueOf);
                        sb.append(valueOf2);
                        str = sb.toString();
                        if (i < h.size() - 1) {
                            str = String.valueOf(str).concat(", ");
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 41 + c.length());
                    sb2.append("Constructing buy intent for ");
                    sb2.append(str);
                    sb2.append(", item type: ");
                    sb2.append(c);
                    C1314b.m6851h("BillingClient", sb2.toString());
                    if (this.f6428k) {
                        Bundle d = C1314b.m6847d(fVar, this.f6430m, this.f6434q, this.f6419b);
                        if (!skuDetails.mo6899e().isEmpty()) {
                            d.putString("skuDetailsToken", skuDetails.mo6899e());
                        }
                        if (!TextUtils.isEmpty(skuDetails.mo6898d())) {
                            d.putString("skuPackageName", skuDetails.mo6898d());
                        }
                        if (!TextUtils.isEmpty(this.f6436s)) {
                            d.putString("accountName", this.f6436s);
                        }
                        if (h.size() > 1) {
                            ArrayList<String> arrayList = new ArrayList<>(h.size() - 1);
                            for (int i2 = 1; i2 < h.size(); i2++) {
                                arrayList.add(h.get(i2).mo6896b());
                            }
                            d.putStringArrayList("additionalSkus", arrayList);
                        }
                        future = m7665r(new CallableC1594m(this, this.f6430m ? 9 : fVar.mo6933d() ? 7 : 6, skuDetails, c, fVar, d), 5000, null);
                        j = 5000;
                    } else {
                        j = 5000;
                        future = m7665r(z ? new CallableC1593l(this, fVar, skuDetails) : new CallableC1596o(this, skuDetails, c), 5000, null);
                    }
                    try {
                        Bundle bundle = (Bundle) future.get(j, TimeUnit.MILLISECONDS);
                        int b = C1314b.m6845b(bundle, "BillingClient");
                        String j2 = C1314b.m6853j(bundle, "BillingClient");
                        if (b != 0) {
                            StringBuilder sb3 = new StringBuilder(52);
                            sb3.append("Unable to buy item, Error response code: ");
                            sb3.append(b);
                            C1314b.m6854k("BillingClient", sb3.toString());
                            return m7659k(C1582g.m7711b().mo6945c(b).mo6944b(j2).mo6943a());
                        }
                        Intent intent = new Intent(activity, ProxyBillingActivity.class);
                        intent.putExtra("result_receiver", this.f6437t);
                        intent.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                        activity.startActivity(intent);
                        return C1602u.f6513p;
                    } catch (CancellationException | TimeoutException unused) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 68);
                        sb4.append("Time out while launching billing flow: ; for sku: ");
                        sb4.append(str);
                        sb4.append("; try to reconnect");
                        C1314b.m6854k("BillingClient", sb4.toString());
                        gVar = C1602u.f6515r;
                    } catch (Exception unused2) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 69);
                        sb5.append("Exception while launching billing flow: ; for sku: ");
                        sb5.append(str);
                        sb5.append("; try to reconnect");
                        C1314b.m6854k("BillingClient", sb5.toString());
                    }
                } else {
                    C1314b.m6854k("BillingClient", "Current client doesn't support extra params for buy intent.");
                    gVar = C1602u.f6505h;
                    return m7659k(gVar);
                }
            } else {
                C1314b.m6854k("BillingClient", "Current client doesn't support subscriptions.");
                gVar = C1602u.f6516s;
                return m7659k(gVar);
            }
        }
        gVar = C1602u.f6514q;
        return m7659k(gVar);
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: f */
    public Purchase.C1564a mo6915f(String str) {
        if (!mo6913c()) {
            return new Purchase.C1564a(C1602u.f6514q, null);
        }
        if (TextUtils.isEmpty(str)) {
            C1314b.m6854k("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.C1564a(C1602u.f6504g, null);
        }
        try {
            return (Purchase.C1564a) m7665r(new CallableC1595n(this, str), 5000, null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.C1564a(C1602u.f6515r, null);
        } catch (Exception unused2) {
            return new Purchase.C1564a(C1602u.f6509l, null);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: g */
    public void mo6916g(C1587i iVar, AbstractC1590j jVar) {
        C1582g gVar;
        if (!mo6913c()) {
            gVar = C1602u.f6514q;
        } else {
            String a = iVar.mo6949a();
            List<String> b = iVar.mo6950b();
            String d = iVar.mo6951d();
            if (TextUtils.isEmpty(a)) {
                C1314b.m6854k("BillingClient", "Please fix the input params. SKU type can't be empty.");
                gVar = C1602u.f6504g;
            } else if (b == null) {
                C1314b.m6854k("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                gVar = C1602u.f6503f;
            } else if (!this.f6433p && d != null) {
                C1314b.m6854k("BillingClient", "The user's client is too old to handle skuPackageName from SkuDetails.");
                gVar = C1602u.f6502e;
            } else if (m7665r(new CallableC1570b0(this, a, b, d, jVar), 30000, new RunnableC1576d0(this, jVar)) == null) {
                jVar.mo6956a(m7671x(), null);
                return;
            } else {
                return;
            }
        }
        jVar.mo6956a(gVar, null);
    }

    @Override // com.android.billingclient.api.AbstractC1571c
    /* renamed from: h */
    public void mo6917h(AbstractC1577e eVar) {
        ServiceInfo serviceInfo;
        String str;
        if (mo6913c()) {
            C1314b.m6851h("BillingClient", "Service connection is valid. No need to re-initialize.");
            eVar.mo6928b(C1602u.f6513p);
            return;
        }
        int i = this.f6418a;
        if (i == 1) {
            C1314b.m6854k("BillingClient", "Client is already in the process of connecting to billing service.");
            eVar.mo6928b(C1602u.f6501d);
        } else if (i == 3) {
            C1314b.m6854k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            eVar.mo6928b(C1602u.f6514q);
        } else {
            this.f6418a = 1;
            this.f6421d.mo6965b();
            C1314b.m6851h("BillingClient", "Starting in-app billing setup.");
            this.f6425h = new ServiceConnectionC1575a(this, eVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f6423f.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f6419b);
                    if (this.f6423f.bindService(intent2, this.f6425h, 1)) {
                        C1314b.m6851h("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                C1314b.m6854k("BillingClient", str);
            }
            this.f6418a = 0;
            C1314b.m6851h("BillingClient", "Billing service unavailable on device.");
            eVar.mo6928b(C1602u.f6500c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final SkuDetails.C1565a mo6922m(String str, List<String> list, String str2) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i, i2 > size ? size : i2));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f6419b);
            try {
                Bundle z = this.f6431n ? this.f6424g.mo6330z(10, this.f6423f.getPackageName(), str, bundle, C1314b.m6849f(this.f6430m, this.f6433p, this.f6434q, this.f6419b, str2)) : this.f6424g.mo6323F(3, this.f6423f.getPackageName(), str, bundle);
                if (z == null) {
                    C1314b.m6854k("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new SkuDetails.C1565a(4, "Null sku details list", null);
                } else if (!z.containsKey("DETAILS_LIST")) {
                    int b = C1314b.m6845b(z, "BillingClient");
                    String j = C1314b.m6853j(z, "BillingClient");
                    if (b != 0) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append("getSkuDetails() failed. Response code: ");
                        sb.append(b);
                        C1314b.m6854k("BillingClient", sb.toString());
                        return new SkuDetails.C1565a(b, j, arrayList);
                    }
                    C1314b.m6854k("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new SkuDetails.C1565a(6, j, arrayList);
                } else {
                    ArrayList<String> stringArrayList = z.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        C1314b.m6854k("BillingClient", "querySkuDetailsAsync got null response list");
                        return new SkuDetails.C1565a(4, "querySkuDetailsAsync got null response list", null);
                    }
                    for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i3));
                            String valueOf = String.valueOf(skuDetails);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 17);
                            sb2.append("Got sku details: ");
                            sb2.append(valueOf);
                            C1314b.m6851h("BillingClient", sb2.toString());
                            arrayList.add(skuDetails);
                        } catch (JSONException unused) {
                            C1314b.m6854k("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                            return new SkuDetails.C1565a(6, "Error trying to decode SkuDetails.", null);
                        }
                    }
                    i = i2;
                }
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder("querySkuDetailsAsync got a remote exception (try to reconnect).".length() + valueOf2.length());
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(valueOf2);
                C1314b.m6854k("BillingClient", sb3.toString());
                return new SkuDetails.C1565a(-1, "Service connection is disconnected.", null);
            }
        }
        return new SkuDetails.C1565a(0, "", arrayList);
    }
}
