package p006b.p030g.p037i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: b.g.i.b */
public final class C0940b {

    /* renamed from: a */
    private static Method f4624a;

    /* renamed from: b */
    private static Method f4625b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                f4624a = cls.getMethod("getScript", String.class);
                f4625b = cls.getMethod("addLikelySubtags", String.class);
            } catch (Exception e) {
                f4624a = null;
                f4625b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f4625b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m5453a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f4625b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m5454b(String str) {
        try {
            Method method = f4624a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m5455c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f4625b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String a = m5453a(locale);
            if (a != null) {
                return m5454b(a);
            }
            return null;
        }
    }
}
