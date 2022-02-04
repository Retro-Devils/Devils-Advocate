package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.C0378a;

/* renamed from: androidx.core.app.a */
public class C0348a extends C0378a {

    /* renamed from: c */
    private static AbstractC0351c f1955c;

    /* renamed from: androidx.core.app.a$a */
    class RunnableC0349a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String[] f1956b;

        /* renamed from: c */
        final /* synthetic */ Activity f1957c;

        /* renamed from: d */
        final /* synthetic */ int f1958d;

        RunnableC0349a(String[] strArr, Activity activity, int i) {
            this.f1956b = strArr;
            this.f1957c = activity;
            this.f1958d = i;
        }

        public void run() {
            int[] iArr = new int[this.f1956b.length];
            PackageManager packageManager = this.f1957c.getPackageManager();
            String packageName = this.f1957c.getPackageName();
            int length = this.f1956b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1956b[i], packageName);
            }
            ((AbstractC0350b) this.f1957c).onRequestPermissionsResult(this.f1958d, this.f1956b, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    public interface AbstractC0350b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    public interface AbstractC0351c {
        /* renamed from: a */
        boolean mo2158a(Activity activity, String[] strArr, int i);

        /* renamed from: b */
        boolean mo2159b(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: androidx.core.app.a$d */
    public interface AbstractC0352d {
        /* renamed from: a */
        void mo2160a(int i);
    }

    /* renamed from: h */
    public static void m1776h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: i */
    public static AbstractC0351c m1777i() {
        return f1955c;
    }

    /* renamed from: j */
    public static void m1778j(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !C0353b.m1793i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: k */
    public static void m1779k(Activity activity, String[] strArr, int i) {
        AbstractC0351c cVar = f1955c;
        if (cVar != null && cVar.mo2158a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof AbstractC0352d) {
                ((AbstractC0352d) activity).mo2160a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof AbstractC0350b) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0349a(strArr, activity, i));
        }
    }

    /* renamed from: l */
    public static boolean m1780l(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: m */
    public static void m1781m(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
