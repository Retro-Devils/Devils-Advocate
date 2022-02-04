package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p006b.p007a.C0763j;
import p006b.p030g.p031d.C0901a;

/* renamed from: androidx.appcompat.widget.r0 */
public class C0275r0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1180a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1181b = {-16842910};

    /* renamed from: c */
    static final int[] f1182c = {16842908};

    /* renamed from: d */
    static final int[] f1183d = {16843518};

    /* renamed from: e */
    static final int[] f1184e = {16842919};

    /* renamed from: f */
    static final int[] f1185f = {16842912};

    /* renamed from: g */
    static final int[] f1186g = {16842913};

    /* renamed from: h */
    static final int[] f1187h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1188i = new int[0];

    /* renamed from: j */
    private static final int[] f1189j = new int[1];

    /* renamed from: a */
    public static void m1374a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0763j.f3828z0);
        try {
            if (!obtainStyledAttributes.hasValue(C0763j.f3594E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1375b(Context context, int i) {
        ColorStateList e = m1378e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1181b, e.getDefaultColor());
        }
        TypedValue f = m1379f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1377d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1376c(Context context, int i) {
        int[] iArr = f1189j;
        iArr[0] = i;
        C0296w0 u = C0296w0.m1431u(context, null, iArr);
        try {
            return u.mo1805b(0, 0);
        } finally {
            u.mo1823w();
        }
    }

    /* renamed from: d */
    static int m1377d(Context context, int i, float f) {
        int c = m1376c(context, i);
        return C0901a.m5300h(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1378e(Context context, int i) {
        int[] iArr = f1189j;
        iArr[0] = i;
        C0296w0 u = C0296w0.m1431u(context, null, iArr);
        try {
            return u.mo1806c(0);
        } finally {
            u.mo1823w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1379f() {
        ThreadLocal<TypedValue> threadLocal = f1180a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
