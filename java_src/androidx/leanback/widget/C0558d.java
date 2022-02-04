package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.d */
public final class C0558d {
    /* renamed from: a */
    static void m2833a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(drawable);
        }
    }
}
