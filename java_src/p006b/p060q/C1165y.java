package p006b.p060q;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: b.q.y */
public class C1165y {

    /* renamed from: a */
    private static LayoutTransition f5194a;

    /* renamed from: b */
    private static Field f5195b;

    /* renamed from: c */
    private static boolean f5196c;

    /* renamed from: d */
    private static Method f5197d;

    /* renamed from: e */
    private static boolean f5198e;

    /* access modifiers changed from: package-private */
    /* renamed from: b.q.y$a */
    public static class C1166a extends LayoutTransition {
        C1166a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m6386a(LayoutTransition layoutTransition) {
        if (!f5198e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f5197d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f5198e = true;
        }
        Method method = f5197d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m6387b(android.view.ViewGroup r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p060q.C1165y.m6387b(android.view.ViewGroup, boolean):void");
    }
}
