package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;

/* renamed from: c.b.a.c.a.f.v */
public final class C1534v {

    /* renamed from: a */
    private static final Uri f6340a = Uri.parse("http://play.google.com/store/apps/details");

    /* renamed from: b */
    private static final String[] f6341b = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    /* renamed from: a */
    public static String m7515a(Context context) {
        ServiceInfo serviceInfo;
        String str;
        PackageManager packageManager = context.getPackageManager();
        for (String str2 : f6341b) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str2), 0);
            if (!(resolveService == null || (serviceInfo = resolveService.serviceInfo) == null || (str = serviceInfo.packageName) == null)) {
                return str;
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    /* renamed from: b */
    public static boolean m7516b(Context context, String str) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (str.equals("com.google.android.youtube.googletvdev")) {
                str = "com.google.android.youtube.googletv";
            }
            int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", str);
            return identifier == 0 || 12 > resourcesForApplication.getInteger(identifier) / 100;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static Context m7517c(Context context) {
        try {
            return context.createPackageContext(m7515a(context), 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static int m7518d(Context context) {
        Context c = m7517c(context);
        int identifier = c != null ? c.getResources().getIdentifier("clientTheme", "style", m7515a(context)) : 0;
        if (identifier != 0) {
            return identifier;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            return 16974120;
        }
        return i >= 11 ? 16973931 : 16973829;
    }

    /* renamed from: e */
    public static String m7519e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }
}
