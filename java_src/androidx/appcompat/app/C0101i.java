package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.i */
public class C0101i {

    /* renamed from: a */
    private static Field f340a;

    /* renamed from: b */
    private static boolean f341b;

    /* renamed from: c */
    private static Class<?> f342c;

    /* renamed from: d */
    private static boolean f343d;

    /* renamed from: e */
    private static Field f344e;

    /* renamed from: f */
    private static boolean f345f;

    /* renamed from: g */
    private static Field f346g;

    /* renamed from: h */
    private static boolean f347h;

    /* renamed from: a */
    static void m453a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m456d(resources);
            } else if (i >= 23) {
                m455c(resources);
            } else if (i >= 21) {
                m454b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m454b(Resources resources) {
        if (!f341b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f340a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f341b = true;
        }
        Field field = f340a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m455c(Resources resources) {
        if (!f341b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f340a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f341b = true;
        }
        Object obj = null;
        Field field = f340a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m457e(obj);
        }
    }

    /* renamed from: d */
    private static void m456d(Resources resources) {
        Object obj;
        if (!f347h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f346g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f347h = true;
        }
        Field field = f346g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f341b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f340a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f341b = true;
                }
                Field field2 = f340a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m457e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m457e(Object obj) {
        if (!f343d) {
            try {
                f342c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f343d = true;
        }
        Class<?> cls = f342c;
        if (cls != null) {
            if (!f345f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f344e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f345f = true;
            }
            Field field = f344e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
