package p069c.p073b.p074a.p075a.p077b.p078k;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C3040b;
import java.util.Collections;
import java.util.List;

/* renamed from: c.b.a.a.b.k.a */
public class C1290a {

    /* renamed from: a */
    private static final Object f5562a = new Object();

    /* renamed from: b */
    private static volatile C1290a f5563b;

    /* renamed from: c */
    private final List<String> f5564c;

    /* renamed from: d */
    private final List<String> f5565d;

    /* renamed from: e */
    private final List<String> f5566e;

    /* renamed from: f */
    private final List<String> f5567f;

    private C1290a() {
        List<String> list = Collections.EMPTY_LIST;
        this.f5564c = list;
        this.f5565d = list;
        this.f5566e = list;
        this.f5567f = list;
    }

    /* renamed from: a */
    public static C1290a m6804a() {
        if (f5563b == null) {
            synchronized (f5562a) {
                if (f5563b == null) {
                    f5563b = new C1290a();
                }
            }
        }
        return f5563b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: b */
    public void mo6293b(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: c */
    public final boolean mo6294c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C3040b.m12434a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
