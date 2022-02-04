package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.j */
public class C0624j {

    /* renamed from: a */
    private static Map<Class, Integer> f3044a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends AbstractC0613c>>> f3045b = new HashMap();

    /* renamed from: a */
    private static AbstractC0613c m3271a(Constructor<? extends AbstractC0613c> constructor, Object obj) {
        try {
            return (AbstractC0613c) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends AbstractC0613c> m3272b(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m3273c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor declaredConstructor = Class.forName(c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m3273c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m3274d(Class<?> cls) {
        Integer num = f3044a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m3277g(cls);
        f3044a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m3275e(Class<?> cls) {
        return cls != null && AbstractC0618f.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static AbstractC0617e m3276f(Object obj) {
        boolean z = obj instanceof AbstractC0617e;
        boolean z2 = obj instanceof AbstractC0612b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((AbstractC0612b) obj, (AbstractC0617e) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((AbstractC0612b) obj, null);
        }
        if (z) {
            return (AbstractC0617e) obj;
        }
        Class<?> cls = obj.getClass();
        if (m3274d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends AbstractC0613c>> list = f3045b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m3271a(list.get(0), obj));
        }
        AbstractC0613c[] cVarArr = new AbstractC0613c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m3271a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: g */
    private static int m3277g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends AbstractC0613c> b = m3272b(cls);
        if (b != null) {
            f3045b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C0609a.f3019a.mo3652d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m3275e(superclass)) {
                if (m3274d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3045b.get(superclass));
            }
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (m3275e(cls2)) {
                    if (m3274d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3045b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3045b.put(cls, arrayList);
            return 2;
        }
    }
}
