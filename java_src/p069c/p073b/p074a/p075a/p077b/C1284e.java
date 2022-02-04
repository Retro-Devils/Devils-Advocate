package p069c.p073b.p074a.p075a.p077b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3008j0;
import com.google.android.gms.common.util.C3043e;
import p069c.p073b.p074a.p075a.p077b.p079l.C1292b;

/* renamed from: c.b.a.a.b.e */
public class C1284e {

    /* renamed from: a */
    public static final int f5552a = C1286g.f5555a;

    /* renamed from: b */
    private static final C1284e f5553b = new C1284e();

    C1284e() {
    }

    /* renamed from: h */
    private static String m6781h(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f5552a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C1292b.m6810a(context).mo6297c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public Intent mo6278a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !C3043e.m12440c(context)) ? C3008j0.m12341a("com.google.android.gms", m6781h(context, str)) : C3008j0.m12343c();
        }
        if (i != 3) {
            return null;
        }
        return C3008j0.m12342b("com.google.android.gms");
    }

    /* renamed from: b */
    public PendingIntent mo6279b(Context context, int i, int i2) {
        return mo6291c(context, i, i2, null);
    }

    /* renamed from: c */
    public PendingIntent mo6291c(Context context, int i, int i2, String str) {
        Intent a = mo6278a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: d */
    public String mo6280d(int i) {
        return C1286g.m6790a(i);
    }

    /* renamed from: e */
    public int mo6281e(Context context) {
        return mo6282f(context, f5552a);
    }

    /* renamed from: f */
    public int mo6282f(Context context, int i) {
        int c = C1286g.m6792c(context, i);
        if (C1286g.m6793d(context, c)) {
            return 18;
        }
        return c;
    }

    /* renamed from: g */
    public boolean mo6283g(int i) {
        return C1286g.m6796g(i);
    }
}
