package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.d */
public final class C0359d {

    /* renamed from: androidx.core.app.d$a */
    static class C0360a {

        /* renamed from: a */
        private static Method f1977a;

        /* renamed from: b */
        private static boolean f1978b;

        /* renamed from: a */
        public static IBinder m1797a(Bundle bundle, String str) {
            if (!f1978b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f1977a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1978b = true;
            }
            Method method2 = f1977a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f1977a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m1796a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0360a.m1797a(bundle, str);
    }
}
