package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.app.b */
public final class C0353b {

    /* renamed from: a */
    protected static final Class<?> f1959a;

    /* renamed from: b */
    protected static final Field f1960b = m1786b();

    /* renamed from: c */
    protected static final Field f1961c = m1790f();

    /* renamed from: d */
    protected static final Method f1962d;

    /* renamed from: e */
    protected static final Method f1963e;

    /* renamed from: f */
    protected static final Method f1964f;

    /* renamed from: g */
    private static final Handler f1965g = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$a */
    public class RunnableC0354a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0357d f1966b;

        /* renamed from: c */
        final /* synthetic */ Object f1967c;

        RunnableC0354a(C0357d dVar, Object obj) {
            this.f1966b = dVar;
            this.f1967c = obj;
        }

        public void run() {
            this.f1966b.f1972b = this.f1967c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b */
    public class RunnableC0355b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Application f1968b;

        /* renamed from: c */
        final /* synthetic */ C0357d f1969c;

        RunnableC0355b(Application application, C0357d dVar) {
            this.f1968b = application;
            this.f1969c = dVar;
        }

        public void run() {
            this.f1968b.unregisterActivityLifecycleCallbacks(this.f1969c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$c */
    public class RunnableC0356c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f1970b;

        /* renamed from: c */
        final /* synthetic */ Object f1971c;

        RunnableC0356c(Object obj, Object obj2) {
            this.f1970b = obj;
            this.f1971c = obj2;
        }

        public void run() {
            try {
                Method method = C0353b.f1962d;
                if (method != null) {
                    method.invoke(this.f1970b, this.f1971c, Boolean.FALSE, "AppCompat recreation");
                    return;
                }
                C0353b.f1963e.invoke(this.f1970b, this.f1971c, Boolean.FALSE);
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.app.b$d */
    public static final class C0357d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        Object f1972b;

        /* renamed from: c */
        private Activity f1973c;

        /* renamed from: d */
        private boolean f1974d = false;

        /* renamed from: e */
        private boolean f1975e = false;

        /* renamed from: f */
        private boolean f1976f = false;

        C0357d(Activity activity) {
            this.f1973c = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1973c == activity) {
                this.f1973c = null;
                this.f1975e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1975e && !this.f1976f && !this.f1974d && C0353b.m1792h(this.f1972b, activity)) {
                this.f1976f = true;
                this.f1972b = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1973c == activity) {
                this.f1974d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m1785a();
        f1959a = a;
        f1962d = m1788d(a);
        f1963e = m1787c(a);
        f1964f = m1789e(a);
    }

    /* renamed from: a */
    private static Class<?> m1785a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m1786b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1787c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m1788d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m1789e(Class<?> cls) {
        if (m1791g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m1790f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m1791g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m1792h(Object obj, Activity activity) {
        try {
            Object obj2 = f1961c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f1965g.postAtFrontOfQueue(new RunnableC0356c(f1960b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m1793i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m1791g() && f1964f == null) {
            return false;
        } else {
            if (f1963e == null && f1962d == null) {
                return false;
            }
            try {
                Object obj2 = f1961c.get(activity);
                if (obj2 == null || (obj = f1960b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0357d dVar = new C0357d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f1965g;
                handler.post(new RunnableC0354a(dVar, obj2));
                try {
                    if (m1791g()) {
                        Method method = f1964f;
                        Boolean bool = Boolean.FALSE;
                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                    } else {
                        activity.recreate();
                    }
                    handler.post(new RunnableC0355b(application, dVar));
                    return true;
                } catch (Throwable th) {
                    f1965g.post(new RunnableC0355b(application, dVar));
                    throw th;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
