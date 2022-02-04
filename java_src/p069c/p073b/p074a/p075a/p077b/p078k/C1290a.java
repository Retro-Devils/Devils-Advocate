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
    private static final Object f5554a = new Object();

    /* renamed from: b */
    private static volatile C1290a f5555b;

    /* renamed from: c */
    private final List<String> f5556c;

    /* renamed from: d */
    private final List<String> f5557d;

    /* renamed from: e */
    private final List<String> f5558e;

    /* renamed from: f */
    private final List<String> f5559f;

    private C1290a() {
        List<String> list = Collections.EMPTY_LIST;
        this.f5556c = list;
        this.f5557d = list;
        this.f5558e = list;
        this.f5559f = list;
    }

    /* renamed from: a */
    public static C1290a m6804a() {
        if (f5555b == null) {
            synchronized (f5554a) {
                if (f5555b == null) {
                    f5555b = new C1290a();
                }
            }
        }
        return f5555b;
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
