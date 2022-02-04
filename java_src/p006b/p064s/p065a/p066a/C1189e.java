package p006b.p064s.p065a.p066a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.p005c.C0397g;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p030g.p031d.C0903c;

/* renamed from: b.s.a.a.e */
public class C1189e {

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.e$a */
    public static class C1190a implements TypeEvaluator<C0903c.C0905b[]> {

        /* renamed from: a */
        private C0903c.C0905b[] f5243a;

        C1190a() {
        }

        /* renamed from: a */
        public C0903c.C0905b[] evaluate(float f, C0903c.C0905b[] bVarArr, C0903c.C0905b[] bVarArr2) {
            if (C0903c.m5305b(bVarArr, bVarArr2)) {
                if (!C0903c.m5305b(this.f5243a, bVarArr)) {
                    this.f5243a = C0903c.m5309f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f5243a[i].mo5304d(bVarArr[i], bVarArr2[i], f);
                }
                return this.f5243a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m6435a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m6436b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m6436b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p064s.p065a.p066a.C1189e.m6436b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m6437c(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m6438d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m6439e(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m6442h(i4)) && (!z2 || !m6442h(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0903c.C0905b[] d = C0903c.m5307d(string);
            C0903c.C0905b[] d2 = C0903c.m5307d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d != null) {
                C1190a aVar = new C1190a();
                if (d2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d);
                } else if (C0903c.m5305b(d, d2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d, d2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (d2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C1190a(), d2);
            }
        } else {
            C1191f a = i == 3 ? C1191f.m6455a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m6442h(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m6442h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m6442h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder3 == null || a == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a);
            return propertyValuesHolder3;
        }
    }

    /* renamed from: f */
    private static int m6440f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !m6442h(i3)) && (!z || !m6442h(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: g */
    private static int m6441g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5227j);
        int i = 0;
        TypedValue l = C0397g.m1947l(k, xmlPullParser, "value", 0);
        if ((l != null) && m6442h(l.type)) {
            i = 3;
        }
        k.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m6442h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m6443i(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m6444j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m6444j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m6445k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m6445k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = m6435a(context, resources, theme, xmlResourceParser, f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    private static ValueAnimator m6446l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5224g);
        TypedArray k2 = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5228k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m6451q(valueAnimator, k, k2, f, xmlPullParser);
        int h = C0397g.m1943h(k, xmlPullParser, "interpolator", 0, 0);
        if (h > 0) {
            valueAnimator.setInterpolator(C1188d.m6434b(context, h));
        }
        k.recycle();
        if (k2 != null) {
            k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m6447m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5227j);
        float f = C0397g.m1941f(k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l = C0397g.m1947l(k, xmlPullParser, "value", 0);
        boolean z = l != null;
        if (i == 4) {
            i = (!z || !m6442h(l.type)) ? 0 : 3;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(f, C0397g.m1942g(k, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(f, C0397g.m1941f(k, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(f) : Keyframe.ofInt(f);
        int h = C0397g.m1943h(k, xmlPullParser, "interpolator", 1, 0);
        if (h > 0) {
            ofInt.setInterpolator(C1188d.m6434b(context, h));
        }
        k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m6448n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m6446l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m6449o(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p064s.p065a.p066a.C1189e.m6449o(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m6450p(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p064s.p065a.p066a.C1189e.m6450p(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* renamed from: q */
    private static void m6451q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long g = (long) C0397g.m1942g(typedArray, xmlPullParser, "duration", 1, 300);
        long g2 = (long) C0397g.m1942g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g3 = C0397g.m1942g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0397g.m1945j(xmlPullParser, "valueFrom") && C0397g.m1945j(xmlPullParser, "valueTo")) {
            if (g3 == 4) {
                g3 = m6440f(typedArray, 5, 6);
            }
            PropertyValuesHolder e = m6439e(typedArray, g3, 5, 6, "");
            if (e != null) {
                valueAnimator.setValues(e);
            }
        }
        valueAnimator.setDuration(g);
        valueAnimator.setStartDelay(g2);
        valueAnimator.setRepeatCount(C0397g.m1942g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0397g.m1942g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m6452r(valueAnimator, typedArray2, g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m6452r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i2 = C0397g.m1944i(typedArray, xmlPullParser, "pathData", 1);
        if (i2 != null) {
            String i3 = C0397g.m1944i(typedArray, xmlPullParser, "propertyXName", 2);
            String i4 = C0397g.m1944i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (i3 == null && i4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m6453s(C0903c.m5308e(i2), objectAnimator, f * 0.5f, i3, i4);
            return;
        }
        objectAnimator.setPropertyName(C0397g.m1944i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m6453s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }
}
