package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

public class ProxyBillingActivity extends Activity {

    /* renamed from: b */
    private ResultReceiver f6396b;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int a = C1314b.m6844a(intent, "ProxyBillingActivity");
            if (!(i2 == -1 && a == 0)) {
                StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(i2);
                sb.append(" and billing's responseCode: ");
                sb.append(a);
                C1314b.m6854k("ProxyBillingActivity", sb.toString());
            }
            this.f6396b.send(a, intent == null ? null : intent.getExtras());
        } else {
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("Got onActivityResult with wrong requestCode: ");
            sb2.append(i);
            sb2.append("; skipping...");
            C1314b.m6854k("ProxyBillingActivity", sb2.toString());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            C1314b.m6851h("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f6396b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            String str = "BUY_INTENT";
            if (!getIntent().hasExtra(str)) {
                str = "SUBS_MANAGEMENT_INTENT";
                if (!getIntent().hasExtra(str)) {
                    pendingIntent = null;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
                }
            }
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra(str);
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 53);
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(valueOf);
                C1314b.m6854k("ProxyBillingActivity", sb.toString());
                this.f6396b.send(6, null);
                finish();
            }
        } else {
            C1314b.m6851h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f6396b = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f6396b);
    }
}
