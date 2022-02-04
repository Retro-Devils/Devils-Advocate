package p069c.p073b.p074a.p075a.p077b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C3019n0;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.util.C3043e;
import com.google.android.gms.common.util.C3044f;
import com.google.android.gms.common.util.C3045g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c.b.a.a.b.g */
public class C1286g {
    @Deprecated

    /* renamed from: a */
    public static final int f5547a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f5548b = new AtomicBoolean();

    /* renamed from: c */
    private static final AtomicBoolean f5549c = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m6790a(int i) {
        return C1279a.m6755m(i);
    }

    /* renamed from: b */
    public static Resources m6791b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static int m6792c(Context context, int i) {
        try {
            context.getResources().getString(C1288i.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f5549c.get()) {
            int a = C3019n0.m12358a(context);
            if (a != 0) {
                int i2 = f5547a;
                if (a != i2) {
                    StringBuilder sb = new StringBuilder(320);
                    sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                    sb.append(i2);
                    sb.append(" but found ");
                    sb.append(a);
                    sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        return m6797h(context, !C3043e.m12440c(context) && !C3043e.m12441d(context), i);
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m6793d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m6795f(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: e */
    public static boolean m6794e(Context context) {
        Bundle applicationRestrictions;
        return C3044f.m12445d() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @TargetApi(21)
    /* renamed from: f */
    static boolean m6795f(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C3044f.m12447f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m6794e(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m6796g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* renamed from: h */
    private static int m6797h(Context context, boolean z, int i) {
        String str;
        C3027r.m12369a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Google Play Store is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1287h.m6798a(context);
            if (!C1287h.m6800c(packageInfo2, true)) {
                str = "Google Play services signature invalid.";
            } else if (z && (!C1287h.m6800c(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                str = "Google Play Store signature invalid.";
            } else if (C3045g.m12450a(packageInfo2.versionCode) < C3045g.m12450a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            Log.w("GooglePlayServicesUtil", str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }
}
