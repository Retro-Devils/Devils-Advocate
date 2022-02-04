package p069c.p073b.p074a.p075a.p077b;

import android.content.Context;
import android.util.Log;
import javax.annotation.CheckReturnValue;

/* access modifiers changed from: package-private */
@CheckReturnValue
/* renamed from: c.b.a.a.b.o */
public final class C1295o {

    /* renamed from: a */
    private static final Object f5563a = new Object();

    /* renamed from: b */
    private static Context f5564b;

    /* renamed from: a */
    static synchronized void m6812a(Context context) {
        synchronized (C1295o.class) {
            if (f5564b != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f5564b = context.getApplicationContext();
            }
        }
    }
}
