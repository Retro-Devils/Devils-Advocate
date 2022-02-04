package com.bumptech.glide.p137o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p137o.AbstractC2004c;
import com.bumptech.glide.p144t.C2081j;

/* renamed from: com.bumptech.glide.o.e */
final class C2007e implements AbstractC2004c {

    /* renamed from: b */
    private final Context f7425b;

    /* renamed from: c */
    final AbstractC2004c.AbstractC2005a f7426c;

    /* renamed from: d */
    boolean f7427d;

    /* renamed from: e */
    private boolean f7428e;

    /* renamed from: f */
    private final BroadcastReceiver f7429f = new C2008a();

    /* renamed from: com.bumptech.glide.o.e$a */
    class C2008a extends BroadcastReceiver {
        C2008a() {
        }

        public void onReceive(Context context, Intent intent) {
            C2007e eVar = C2007e.this;
            boolean z = eVar.f7427d;
            eVar.f7427d = eVar.mo7674l(context);
            if (z != C2007e.this.f7427d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C2007e.this.f7427d);
                }
                C2007e eVar2 = C2007e.this;
                eVar2.f7426c.mo7064a(eVar2.f7427d);
            }
        }
    }

    C2007e(Context context, AbstractC2004c.AbstractC2005a aVar) {
        this.f7425b = context.getApplicationContext();
        this.f7426c = aVar;
    }

    /* renamed from: m */
    private void m9079m() {
        if (!this.f7428e) {
            this.f7427d = mo7674l(this.f7425b);
            try {
                this.f7425b.registerReceiver(this.f7429f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f7428e = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: n */
    private void m9080n() {
        if (this.f7428e) {
            this.f7425b.unregisterReceiver(this.f7429f);
            this.f7428e = false;
        }
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: a */
    public void mo7041a() {
        m9079m();
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: f */
    public void mo7042f() {
        m9080n();
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: k */
    public void mo7043k() {
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: l */
    public boolean mo7674l(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C2081j.m9432d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
