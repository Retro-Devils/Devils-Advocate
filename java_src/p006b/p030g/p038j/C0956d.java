package p006b.p030g.p038j;

import android.os.Build;
import java.util.Arrays;

/* renamed from: b.g.j.d */
public class C0956d {
    /* renamed from: a */
    public static boolean m5483a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? C0955c.m5482a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m5484b(Object... objArr) {
        int i = Build.VERSION.SDK_INT;
        return Arrays.hashCode(objArr);
    }
}
