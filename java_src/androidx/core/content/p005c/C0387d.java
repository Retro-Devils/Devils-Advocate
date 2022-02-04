package androidx.core.content.p005c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p030g.C0900c;

/* renamed from: androidx.core.content.c.d */
final class C0387d {

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.c.d$a */
    public static final class C0388a {

        /* renamed from: a */
        final int[] f2076a;

        /* renamed from: b */
        final float[] f2077b;

        C0388a(int i, int i2) {
            this.f2076a = new int[]{i, i2};
            this.f2077b = new float[]{0.0f, 1.0f};
        }

        C0388a(int i, int i2, int i3) {
            this.f2076a = new int[]{i, i2, i3};
            this.f2077b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0388a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2076a = new int[size];
            this.f2077b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2076a[i] = list.get(i).intValue();
                this.f2077b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static C0388a m1916a(C0388a aVar, int i, int i2, boolean z, int i3) {
        C0388a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new C0388a(i, i2);
        return aVar2;
    }

    /* renamed from: b */
    static Shader m1917b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C0900c.f4523w);
            float f = C0397g.m1941f(k, xmlPullParser, "startX", C0900c.f4494F, 0.0f);
            float f2 = C0397g.m1941f(k, xmlPullParser, "startY", C0900c.f4495G, 0.0f);
            float f3 = C0397g.m1941f(k, xmlPullParser, "endX", C0900c.f4496H, 0.0f);
            float f4 = C0397g.m1941f(k, xmlPullParser, "endY", C0900c.f4497I, 0.0f);
            float f5 = C0397g.m1941f(k, xmlPullParser, "centerX", C0900c.f4489A, 0.0f);
            float f6 = C0397g.m1941f(k, xmlPullParser, "centerY", C0900c.f4490B, 0.0f);
            int g = C0397g.m1942g(k, xmlPullParser, "type", C0900c.f4526z, 0);
            int b = C0397g.m1937b(k, xmlPullParser, "startColor", C0900c.f4524x, 0);
            boolean j = C0397g.m1945j(xmlPullParser, "centerColor");
            int b2 = C0397g.m1937b(k, xmlPullParser, "centerColor", C0900c.f4493E, 0);
            int b3 = C0397g.m1937b(k, xmlPullParser, "endColor", C0900c.f4525y, 0);
            int g2 = C0397g.m1942g(k, xmlPullParser, "tileMode", C0900c.f4492D, 0);
            float f7 = C0397g.m1941f(k, xmlPullParser, "gradientRadius", C0900c.f4491C, 0.0f);
            k.recycle();
            C0388a a = m1916a(m1918c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g != 1) {
                return g != 2 ? new LinearGradient(f, f2, f3, f4, a.f2076a, a.f2077b, m1919d(g2)) : new SweepGradient(f5, f6, a.f2076a, a.f2077b);
            }
            if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, a.f2076a, a.f2077b, m1919d(g2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.p005c.C0387d.C0388a m1918c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p005c.C0387d.m1918c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.c.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m1919d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
