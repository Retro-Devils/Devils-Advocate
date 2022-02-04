package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0315a {

    /* renamed from: a */
    String f1416a;

    /* renamed from: b */
    private EnumC0317b f1417b;

    /* renamed from: c */
    private int f1418c;

    /* renamed from: d */
    private float f1419d;

    /* renamed from: e */
    private String f1420e;

    /* renamed from: f */
    boolean f1421f;

    /* renamed from: g */
    private int f1422g;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static /* synthetic */ class C0316a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1423a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.C0315a.EnumC0317b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.C0315a.C0316a.f1423a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.widget.C0315a.C0316a.f1423a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.widget.C0315a.C0316a.f1423a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.constraintlayout.widget.C0315a.C0316a.f1423a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.constraintlayout.widget.C0315a.C0316a.f1423a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = androidx.constraintlayout.widget.C0315a.C0316a.f1423a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = androidx.constraintlayout.widget.C0315a.C0316a.f1423a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0315a.EnumC0317b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0315a.C0316a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public enum EnumC0317b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0315a(C0315a aVar, Object obj) {
        this.f1416a = aVar.f1416a;
        this.f1417b = aVar.f1417b;
        mo1978d(obj);
    }

    public C0315a(String str, EnumC0317b bVar, Object obj) {
        this.f1416a = str;
        this.f1417b = bVar;
        mo1978d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0315a> m1596a(HashMap<String, C0315a> hashMap, View view) {
        HashMap<String, C0315a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0315a aVar = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new C0315a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new C0315a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m1597b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0315a> hashMap) {
        EnumC0317b bVar;
        Object string;
        int integer;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0333i.f1582B2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0317b bVar2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0333i.f1588C2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0333i.f1594D2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = EnumC0317b.BOOLEAN_TYPE;
            } else {
                if (index == C0333i.f1606F2) {
                    bVar = EnumC0317b.COLOR_TYPE;
                } else if (index == C0333i.f1600E2) {
                    bVar = EnumC0317b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C0333i.f1630J2) {
                        bVar = EnumC0317b.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C0333i.f1612G2) {
                        bVar = EnumC0317b.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C0333i.f1618H2) {
                        bVar = EnumC0317b.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == C0333i.f1624I2) {
                        bVar = EnumC0317b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        bVar2 = bVar;
                        obj = string;
                    } else if (index == C0333i.f1636K2) {
                        bVar = EnumC0317b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        bVar2 = bVar;
                        obj = string;
                    }
                    string = Float.valueOf(f);
                    bVar2 = bVar;
                    obj = string;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                bVar2 = bVar;
                obj = string;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0315a(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m1598c(View view, HashMap<String, C0315a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0315a aVar = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0316a.f1423a[aVar.f1417b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1422g));
                        continue;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1422g);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1418c));
                        continue;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1419d));
                        continue;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f1420e);
                        continue;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1421f));
                        continue;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1419d));
                        continue;
                    default:
                        continue;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void mo1978d(Object obj) {
        switch (C0316a.f1423a[this.f1417b.ordinal()]) {
            case 1:
            case 2:
                this.f1422g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1418c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f1419d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f1420e = (String) obj;
                return;
            case 6:
                this.f1421f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
