package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.y0 */
public class C0303y0 {
    /* renamed from: a */
    public static void m1525a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC0308z0.m1566f(view, charSequence);
        }
    }
}
