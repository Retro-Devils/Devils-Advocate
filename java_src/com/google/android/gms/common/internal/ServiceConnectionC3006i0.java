package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3004i;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.i0 */
public final class ServiceConnectionC3006i0 implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f10011a = new HashSet();

    /* renamed from: b */
    private int f10012b = 2;

    /* renamed from: c */
    private boolean f10013c;

    /* renamed from: d */
    private IBinder f10014d;

    /* renamed from: e */
    private final AbstractC3004i.C3005a f10015e;

    /* renamed from: f */
    private ComponentName f10016f;

    /* renamed from: g */
    private final /* synthetic */ C3003h0 f10017g;

    public ServiceConnectionC3006i0(C3003h0 h0Var, AbstractC3004i.C3005a aVar) {
        this.f10017g = h0Var;
        this.f10015e = aVar;
    }

    /* renamed from: a */
    public final IBinder mo9782a() {
        return this.f10014d;
    }

    /* renamed from: b */
    public final ComponentName mo9783b() {
        return this.f10016f;
    }

    /* renamed from: c */
    public final int mo9784c() {
        return this.f10012b;
    }

    /* renamed from: d */
    public final boolean mo9785d() {
        return this.f10013c;
    }

    /* renamed from: e */
    public final void mo9786e(ServiceConnection serviceConnection, String str) {
        C3003h0.m12317h(this.f10017g);
        C3003h0.m12316g(this.f10017g);
        this.f10015e.mo9777c(C3003h0.m12316g(this.f10017g));
        this.f10011a.add(serviceConnection);
    }

    /* renamed from: f */
    public final boolean mo9787f(ServiceConnection serviceConnection) {
        return this.f10011a.contains(serviceConnection);
    }

    /* renamed from: g */
    public final void mo9788g(ServiceConnection serviceConnection, String str) {
        C3003h0.m12317h(this.f10017g);
        C3003h0.m12316g(this.f10017g);
        this.f10011a.remove(serviceConnection);
    }

    /* renamed from: h */
    public final void mo9789h(String str) {
        this.f10012b = 3;
        boolean c = C3003h0.m12317h(this.f10017g).mo6294c(C3003h0.m12316g(this.f10017g), str, this.f10015e.mo9777c(C3003h0.m12316g(this.f10017g)), this, this.f10015e.mo9778d());
        this.f10013c = c;
        if (c) {
            C3003h0.m12315f(this.f10017g).sendMessageDelayed(C3003h0.m12315f(this.f10017g).obtainMessage(1, this.f10015e), C3003h0.m12318i(this.f10017g));
            return;
        }
        this.f10012b = 2;
        try {
            C3003h0.m12317h(this.f10017g).mo6293b(C3003h0.m12316g(this.f10017g), this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: i */
    public final void mo9790i(String str) {
        C3003h0.m12315f(this.f10017g).removeMessages(1, this.f10015e);
        C3003h0.m12317h(this.f10017g).mo6293b(C3003h0.m12316g(this.f10017g), this);
        this.f10013c = false;
        this.f10012b = 2;
    }

    /* renamed from: j */
    public final boolean mo9791j() {
        return this.f10011a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (C3003h0.m12314e(this.f10017g)) {
            C3003h0.m12315f(this.f10017g).removeMessages(1, this.f10015e);
            this.f10014d = iBinder;
            this.f10016f = componentName;
            for (ServiceConnection serviceConnection : this.f10011a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f10012b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (C3003h0.m12314e(this.f10017g)) {
            C3003h0.m12315f(this.f10017g).removeMessages(1, this.f10015e);
            this.f10014d = null;
            this.f10016f = componentName;
            for (ServiceConnection serviceConnection : this.f10011a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f10012b = 2;
        }
    }
}
