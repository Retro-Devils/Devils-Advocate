package com.bumptech.glide.p137o;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0378a;
import com.bumptech.glide.p137o.AbstractC2004c;

/* renamed from: com.bumptech.glide.o.f */
public class C2009f implements AbstractC2006d {
    @Override // com.bumptech.glide.p137o.AbstractC2006d
    /* renamed from: a */
    public AbstractC2004c mo7673a(Context context, AbstractC2004c.AbstractC2005a aVar) {
        boolean z = C0378a.m1871a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C2007e(context, aVar) : new C2013j();
    }
}
