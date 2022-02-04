package p069c.p073b.p074a.p090b.p104w;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: c.b.a.b.w.b */
public class C1436b {
    /* renamed from: a */
    public static TypedValue m7073a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m7074b(Context context, int i, boolean z) {
        TypedValue a = m7073a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    /* renamed from: c */
    public static int m7075c(Context context, int i, String str) {
        TypedValue a = m7073a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static int m7076d(View view, int i) {
        return m7075c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
