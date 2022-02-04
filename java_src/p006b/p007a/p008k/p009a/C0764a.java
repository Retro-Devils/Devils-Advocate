package p006b.p007a.p008k.p009a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0254m0;
import androidx.core.content.C0378a;
import androidx.core.content.p005c.C0380a;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.k.a.a */
public final class C0764a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3832a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0765a>> f3833b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3834c = new Object();

    /* access modifiers changed from: private */
    /* renamed from: b.a.k.a.a$a */
    public static class C0765a {

        /* renamed from: a */
        final ColorStateList f3835a;

        /* renamed from: b */
        final Configuration f3836b;

        C0765a(ColorStateList colorStateList, Configuration configuration) {
            this.f3835a = colorStateList;
            this.f3836b = configuration;
        }
    }

    /* renamed from: a */
    private static void m4514a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f3834c) {
            WeakHashMap<Context, SparseArray<C0765a>> weakHashMap = f3833b;
            SparseArray<C0765a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C0765a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m4515b(Context context, int i) {
        C0765a aVar;
        synchronized (f3834c) {
            SparseArray<C0765a> sparseArray = f3833b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.f3836b.equals(context.getResources().getConfiguration())) {
                    return aVar.f3835a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m4516c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b = m4515b(context, i);
        if (b != null) {
            return b;
        }
        ColorStateList f = m4519f(context, i);
        if (f == null) {
            return C0378a.m1873c(context, i);
        }
        m4514a(context, i, f);
        return f;
    }

    /* renamed from: d */
    public static Drawable m4517d(Context context, int i) {
        return C0254m0.m1289h().mo1589j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m4518e() {
        ThreadLocal<TypedValue> threadLocal = f3832a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m4519f(Context context, int i) {
        if (m4520g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0380a.m1880a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m4520g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = m4518e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
