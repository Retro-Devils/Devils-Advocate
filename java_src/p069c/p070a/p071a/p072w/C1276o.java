package p069c.p070a.p071a.p072w;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;
import p069c.p070a.p071a.AbstractC1233h;
import p069c.p070a.p071a.C1243o;

/* renamed from: c.a.a.w.o */
public class C1276o {
    /* renamed from: a */
    public static C1243o m6752a(Context context) {
        return m6754c(context, null);
    }

    /* renamed from: b */
    private static C1243o m6753b(Context context, AbstractC1233h hVar) {
        C1243o oVar = new C1243o(new C1261e(new File(context.getCacheDir(), "volley")), hVar);
        oVar.mo6221d();
        return oVar;
    }

    /* renamed from: c */
    public static C1243o m6754c(Context context, AbstractC1257b bVar) {
        C1258c cVar;
        C1258c cVar2;
        String str;
        if (bVar != null) {
            cVar2 = new C1258c(bVar);
        } else if (Build.VERSION.SDK_INT >= 9) {
            cVar = new C1258c((AbstractC1257b) new C1269j());
            return m6753b(context, cVar);
        } else {
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "volley/0";
            }
            cVar2 = new C1258c(new C1264f(AndroidHttpClient.newInstance(str)));
        }
        cVar = cVar2;
        return m6753b(context, cVar);
    }
}
