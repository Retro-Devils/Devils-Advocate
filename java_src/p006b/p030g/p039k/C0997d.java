package p006b.p030g.p039k;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: b.g.k.d */
public final class C0997d {
    /* renamed from: a */
    public static void m5668a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: b */
    public static int m5669b(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
