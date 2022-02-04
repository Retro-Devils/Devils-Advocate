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
    private final Context f7417b;

    /* renamed from: c */
    final AbstractC2004c.AbstractC2005a f7418c;

    /* renamed from: d */
    boolean f7419d;

    /* renamed from: e */
    private boolean f7420e;

    /* renamed from: f */
    private final BroadcastReceiver f7421f = new C2008a();

    /* renamed from: com.bumptech.glide.o.e$a */
    class C2008a extends BroadcastReceiver {
        C2008a() {
        }

        public void onReceive(Context context, Intent intent) {
            C2007e eVar = C2007e.this;
            boolean z = eVar.f7419d;
            eVar.f7419d = eVar.mo7674l(context);
            if (z != C2007e.this.f7419d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C2007e.this.f7419d);
                }
                C2007e eVar2 = C2007e.this;
                eVar2.f7418c.mo7064a(eVar2.f7419d);
            }
        }
    }

    C2007e(Context context, AbstractC2004c.AbstractC2005a aVar) {
        this.f7417b = context.getApplicationContext();
        this.f7418c = aVar;
    }

    /* renamed from: m */
    private void m9079m() {
        if (!this.f7420e) {
            this.f7419d = mo7674l(this.f7417b);
            try {
                this.f7417b.registerReceiver(this.f7421f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f7420e = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: n */
    private void m9080n() {
        if (this.f7420e) {
            this.f7417b.unregisterReceiver(this.f7421f);
            this.f7420e = false;
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
