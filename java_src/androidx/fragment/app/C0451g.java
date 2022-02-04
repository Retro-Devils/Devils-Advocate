package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import p006b.p021d.C0838i;

/* renamed from: androidx.fragment.app.g */
public class C0451g {

    /* renamed from: a */
    private static final C0838i<String, Class<?>> f2358a = new C0838i<>();

    /* renamed from: b */
    static boolean m2417b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2418c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m2418c(ClassLoader classLoader, String str) {
        C0838i<String, Class<?>> iVar = f2358a;
        Class<?> cls = iVar.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar.put(str, cls2);
        return cls2;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.Fragment> */
    /* renamed from: d */
    public static Class<? extends Fragment> m2419d(ClassLoader classLoader, String str) {
        try {
            return m2418c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0438e("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0438e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo2725a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) m2419d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.C0438e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.C0438e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.C0438e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.C0438e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
