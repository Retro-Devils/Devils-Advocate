package p069c.p073b.p074a.p075a.p077b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C3027r;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: c.b.a.a.b.h */
public class C1287h {

    /* renamed from: a */
    private static C1287h f5550a;

    /* renamed from: b */
    private final Context f5551b;

    private C1287h(Context context) {
        this.f5551b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1287h m6798a(Context context) {
        C3027r.m12376h(context);
        synchronized (C1287h.class) {
            if (f5550a == null) {
                C1295o.m6812a(context);
                f5550a = new C1287h(context);
            }
        }
        return f5550a;
    }

    /* renamed from: b */
    private static AbstractBinderC1296p m6799b(PackageInfo packageInfo, AbstractBinderC1296p... pVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC1297q qVar = new BinderC1297q(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < pVarArr.length; i++) {
            if (pVarArr[i].equals(qVar)) {
                return pVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m6800c(PackageInfo packageInfo, boolean z) {
        AbstractBinderC1296p pVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                pVar = m6799b(packageInfo, C1299s.f5569a);
            } else {
                pVar = m6799b(packageInfo, C1299s.f5569a[0]);
            }
            if (pVar != null) {
                return true;
            }
        }
        return false;
    }
}
