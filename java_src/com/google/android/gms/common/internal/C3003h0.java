package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3004i;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p069c.p073b.p074a.p075a.p077b.p078k.C1290a;
import p069c.p073b.p074a.p075a.p081d.p083b.HandlerC1312d;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.h0 */
public final class C3003h0 extends AbstractC3004i implements Handler.Callback {
    @GuardedBy("mConnectionStatus")

    /* renamed from: c */
    private final HashMap<AbstractC3004i.C3005a, ServiceConnectionC3006i0> f9999c = new HashMap<>();

    /* renamed from: d */
    private final Context f10000d;

    /* renamed from: e */
    private final Handler f10001e;

    /* renamed from: f */
    private final C1290a f10002f;

    /* renamed from: g */
    private final long f10003g;

    /* renamed from: h */
    private final long f10004h;

    C3003h0(Context context) {
        this.f10000d = context.getApplicationContext();
        this.f10001e = new HandlerC1312d(context.getMainLooper(), this);
        this.f10002f = C1290a.m6804a();
        this.f10003g = 5000;
        this.f10004h = 300000;
    }

    /* renamed from: e */
    static /* synthetic */ HashMap m12314e(C3003h0 h0Var) {
        return h0Var.f9999c;
    }

    /* renamed from: f */
    static /* synthetic */ Handler m12315f(C3003h0 h0Var) {
        return h0Var.f10001e;
    }

    /* renamed from: g */
    static /* synthetic */ Context m12316g(C3003h0 h0Var) {
        return h0Var.f10000d;
    }

    /* renamed from: h */
    static /* synthetic */ C1290a m12317h(C3003h0 h0Var) {
        return h0Var.f10002f;
    }

    /* renamed from: i */
    static /* synthetic */ long m12318i(C3003h0 h0Var) {
        return h0Var.f10004h;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC3004i
    /* renamed from: c */
    public final boolean mo9771c(AbstractC3004i.C3005a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C3027r.m12377i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9999c) {
            ServiceConnectionC3006i0 i0Var = this.f9999c.get(aVar);
            if (i0Var == null) {
                i0Var = new ServiceConnectionC3006i0(this, aVar);
                i0Var.mo9786e(serviceConnection, str);
                i0Var.mo9789h(str);
                this.f9999c.put(aVar, i0Var);
            } else {
                this.f10001e.removeMessages(0, aVar);
                if (!i0Var.mo9787f(serviceConnection)) {
                    i0Var.mo9786e(serviceConnection, str);
                    int c = i0Var.mo9784c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(i0Var.mo9783b(), i0Var.mo9782a());
                    } else if (c == 2) {
                        i0Var.mo9789h(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = i0Var.mo9785d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC3004i
    /* renamed from: d */
    public final void mo9772d(AbstractC3004i.C3005a aVar, ServiceConnection serviceConnection, String str) {
        C3027r.m12377i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9999c) {
            ServiceConnectionC3006i0 i0Var = this.f9999c.get(aVar);
            if (i0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (i0Var.mo9787f(serviceConnection)) {
                i0Var.mo9788g(serviceConnection, str);
                if (i0Var.mo9791j()) {
                    this.f10001e.sendMessageDelayed(this.f10001e.obtainMessage(0, aVar), this.f10003g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f9999c) {
                AbstractC3004i.C3005a aVar = (AbstractC3004i.C3005a) message.obj;
                ServiceConnectionC3006i0 i0Var = this.f9999c.get(aVar);
                if (i0Var != null && i0Var.mo9791j()) {
                    if (i0Var.mo9785d()) {
                        i0Var.mo9790i("GmsClientSupervisor");
                    }
                    this.f9999c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f9999c) {
                AbstractC3004i.C3005a aVar2 = (AbstractC3004i.C3005a) message.obj;
                ServiceConnectionC3006i0 i0Var2 = this.f9999c.get(aVar2);
                if (i0Var2 != null && i0Var2.mo9784c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = i0Var2.mo9783b();
                    if (b == null) {
                        b = aVar2.mo9775a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo9776b(), "unknown");
                    }
                    i0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
