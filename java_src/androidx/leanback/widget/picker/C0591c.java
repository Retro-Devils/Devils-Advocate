package androidx.leanback.widget.picker;

import android.content.res.Resources;
import android.os.Build;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: androidx.leanback.widget.picker.c */
class C0591c {

    /* renamed from: a */
    static final boolean f2966a = (Build.VERSION.SDK_INT >= 18);

    /* renamed from: androidx.leanback.widget.picker.c$a */
    public static class C0592a {

        /* renamed from: a */
        public final Locale f2967a;

        /* renamed from: b */
        public final String[] f2968b;

        /* renamed from: c */
        public final String[] f2969c;

        C0592a(Locale locale, Resources resources) {
            this.f2967a = locale;
            this.f2968b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar instance = Calendar.getInstance(locale);
            this.f2969c = C0591c.m3143a(instance.getMinimum(5), instance.getMaximum(5), "%02d");
        }
    }

    /* renamed from: a */
    public static String[] m3143a(int i, int i2, String str) {
        String[] strArr = new String[((i2 - i) + 1)];
        for (int i3 = i; i3 <= i2; i3++) {
            int i4 = i3 - i;
            if (str != null) {
                strArr[i4] = String.format(str, Integer.valueOf(i3));
            } else {
                strArr[i4] = String.valueOf(i3);
            }
        }
        return strArr;
    }

    /* renamed from: b */
    public static Calendar m3144b(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar instance = Calendar.getInstance(locale);
        instance.setTimeInMillis(timeInMillis);
        return instance;
    }

    /* renamed from: c */
    public static C0592a m3145c(Locale locale, Resources resources) {
        return new C0592a(locale, resources);
    }
}
