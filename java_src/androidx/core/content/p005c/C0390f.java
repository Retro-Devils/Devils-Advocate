package androidx.core.content.p005c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p030g.p038j.C0961i;

/* renamed from: androidx.core.content.c.f */
public final class C0390f {

    /* renamed from: androidx.core.content.c.f$a */
    public static abstract class AbstractC0391a {

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.c.f$a$a */
        public class RunnableC0392a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Typeface f2078b;

            RunnableC0392a(Typeface typeface) {
                this.f2078b = typeface;
            }

            public void run() {
                AbstractC0391a.this.mo1847d(this.f2078b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.c.f$a$b */
        public class RunnableC0393b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f2080b;

            RunnableC0393b(int i) {
                this.f2080b = i;
            }

            public void run() {
                AbstractC0391a.this.mo1846c(this.f2080b);
            }
        }

        /* renamed from: a */
        public final void mo2239a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0393b(i));
        }

        /* renamed from: b */
        public final void mo2240b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0392a(typeface));
        }

        /* renamed from: c */
        public abstract void mo1846c(int i);

        /* renamed from: d */
        public abstract void mo1847d(Typeface typeface);
    }

    /* renamed from: androidx.core.content.c.f$b */
    public static final class C0394b {

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.c.f$b$a */
        public static class C0395a {

            /* renamed from: a */
            private static final Object f2082a = new Object();

            /* renamed from: b */
            private static Method f2083b;

            /* renamed from: c */
            private static boolean f2084c;

            /* renamed from: a */
            static void m1934a(Resources.Theme theme) {
                synchronized (f2082a) {
                    if (!f2084c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2083b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f2084c = true;
                    }
                    Method method = f2083b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f2083b = null;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.c.f$b$b */
        public static class C0396b {
            /* renamed from: a */
            static void m1935a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m1933a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0396b.m1935a(theme);
            } else if (i >= 23) {
                C0395a.m1934a(theme);
            }
        }
    }

    /* renamed from: a */
    public static Drawable m1923a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: b */
    public static Typeface m1924b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m1927e(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: c */
    public static Typeface m1925c(Context context, int i, TypedValue typedValue, int i2, AbstractC0391a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m1927e(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: d */
    public static void m1926d(Context context, int i, AbstractC0391a aVar, Handler handler) {
        C0961i.m5494c(aVar);
        if (context.isRestricted()) {
            aVar.mo2239a(-4, handler);
        } else {
            m1927e(context, i, new TypedValue(), 0, aVar, handler, false);
        }
    }

    /* renamed from: e */
    private static Typeface m1927e(Context context, int i, TypedValue typedValue, int i2, AbstractC0391a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface f = m1928f(context, resources, typedValue, i, i2, aVar, handler, z);
        if (f != null || aVar != null) {
            return f;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m1928f(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p005c.C0390f.AbstractC0391a r20, android.os.Handler r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p005c.C0390f.m1928f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
