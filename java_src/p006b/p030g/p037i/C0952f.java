package p006b.p030g.p037i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: b.g.i.f */
public final class C0952f {

    /* renamed from: a */
    private static final Locale f4651a = new Locale("", "");

    /* renamed from: a */
    private static int m5478a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m5479b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f4651a)) {
            return 0;
        }
        String c = C0940b.m5455c(locale);
        return c == null ? m5478a(locale) : (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
