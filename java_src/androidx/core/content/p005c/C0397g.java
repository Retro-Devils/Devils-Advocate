package androidx.core.content.p005c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.c.g */
public class C0397g {
    /* renamed from: a */
    public static boolean m1936a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m1945j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m1937b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1945j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m1938c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m1945j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C0380a.m1882c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m1939d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* renamed from: d */
    private static ColorStateList m1939d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0381b m1940e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m1945j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0381b.m1887b(typedValue.data);
            }
            C0381b g = C0381b.m1890g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C0381b.m1887b(i2);
    }

    /* renamed from: f */
    public static float m1941f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m1945j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m1942g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1945j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m1943h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1945j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m1944i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1945j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m1945j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m1946k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m1947l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1945j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
