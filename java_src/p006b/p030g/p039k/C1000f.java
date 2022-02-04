package p006b.p030g.p039k;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: b.g.k.f */
public final class C1000f {

    /* renamed from: a */
    private static Field f4741a;

    /* renamed from: b */
    private static boolean f4742b;

    /* renamed from: a */
    private static void m5677a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f4742b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f4741a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f4742b = true;
        }
        Field field = f4741a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m5678b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m5677a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m5677a(layoutInflater, factory2);
            }
        }
    }
}
