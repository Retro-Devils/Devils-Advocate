package p006b.p030g.p039k.p040b0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: b.g.k.b0.b */
public final class C0978b {
    /* renamed from: a */
    public static int m5568a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m5569b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
