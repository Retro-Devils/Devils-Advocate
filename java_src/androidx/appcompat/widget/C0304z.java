package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.z */
public class C0304z {

    /* renamed from: a */
    private static final RectF f1286a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1287b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, Field> f1288c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private int f1289d = 0;

    /* renamed from: e */
    private boolean f1290e = false;

    /* renamed from: f */
    private float f1291f = -1.0f;

    /* renamed from: g */
    private float f1292g = -1.0f;

    /* renamed from: h */
    private float f1293h = -1.0f;

    /* renamed from: i */
    private int[] f1294i = new int[0];

    /* renamed from: j */
    private boolean f1295j = false;

    /* renamed from: k */
    private TextPaint f1296k;

    /* renamed from: l */
    private final TextView f1297l;

    /* renamed from: m */
    private final Context f1298m;

    /* renamed from: n */
    private final C0307c f1299n;

    /* renamed from: androidx.appcompat.widget.z$a */
    private static class C0305a extends C0307c {
        C0305a() {
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.C0304z.C0307c
        /* renamed from: a */
        public void mo1909a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0304z.m1540r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    private static class C0306b extends C0305a {
        C0306b() {
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.C0304z.C0305a, androidx.appcompat.widget.C0304z.C0307c
        /* renamed from: a */
        public void mo1909a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.C0304z.C0307c
        /* renamed from: b */
        public boolean mo1910b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z$c */
    public static class C0307c {
        C0307c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1909a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1910b(TextView textView) {
            return ((Boolean) C0304z.m1540r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0304z(TextView textView) {
        this.f1297l = textView;
        this.f1298m = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f1299n = i >= 29 ? new C0306b() : i >= 23 ? new C0305a() : new C0307c();
    }

    /* renamed from: A */
    private void m1526A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1294i = m1532c(iArr);
            m1527B();
        }
    }

    /* renamed from: B */
    private boolean m1527B() {
        int[] iArr = this.f1294i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1295j = z;
        if (z) {
            this.f1289d = 1;
            this.f1292g = (float) iArr[0];
            this.f1293h = (float) iArr[length - 1];
            this.f1291f = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m1528C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1297l.getText();
        TransformationMethod transformationMethod = this.f1297l.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1297l)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1297l.getMaxLines() : -1;
        mo1902q(i);
        StaticLayout e = mo1896e(text, (Layout.Alignment) m1540r(this.f1297l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m1529D() {
        return !(this.f1297l instanceof C0244k);
    }

    /* renamed from: E */
    private void m1530E(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1289d = 1;
            this.f1292g = f;
            this.f1293h = f2;
            this.f1291f = f3;
            this.f1295j = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m1531a(Object obj, String str, T t) {
        try {
            Field o = m1538o(str);
            return o == null ? t : (T) o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m1532c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m1533d() {
        this.f1289d = 0;
        this.f1292g = -1.0f;
        this.f1293h = -1.0f;
        this.f1291f = -1.0f;
        this.f1294i = new int[0];
        this.f1290e = false;
    }

    /* renamed from: f */
    private StaticLayout m1534f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1296k, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1297l.getLineSpacingExtra(), this.f1297l.getLineSpacingMultiplier()).setIncludePad(this.f1297l.getIncludeFontPadding()).setBreakStrategy(this.f1297l.getBreakStrategy()).setHyphenationFrequency(this.f1297l.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1299n.mo1909a(obtain, this.f1297l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m1535g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1296k, i, alignment, ((Float) m1531a(this.f1297l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1531a(this.f1297l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m1531a(this.f1297l, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m1536h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1296k, i, alignment, this.f1297l.getLineSpacingMultiplier(), this.f1297l.getLineSpacingExtra(), this.f1297l.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m1537i(RectF rectF) {
        int length = this.f1294i.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1528C(this.f1294i[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1294i[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m1538o(String str) {
        try {
            Field field = f1288c.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1288c.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m1539p(String str) {
        try {
            Method method = f1287b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1287b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m1540r(Object obj, String str, T t) {
        try {
            return (T) m1539p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m1541x(float f) {
        if (f != this.f1297l.getPaint().getTextSize()) {
            this.f1297l.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1297l.isInLayout() : false;
            if (this.f1297l.getLayout() != null) {
                this.f1290e = false;
                try {
                    Method p = m1539p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f1297l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1297l.requestLayout();
                } else {
                    this.f1297l.forceLayout();
                }
                this.f1297l.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m1542z() {
        if (!m1529D() || this.f1289d != 1) {
            this.f1290e = false;
        } else {
            if (!this.f1295j || this.f1294i.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1293h - this.f1292g) / this.f1291f))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1292g + (((float) i) * this.f1291f));
                }
                this.f1294i = m1532c(iArr);
            }
            this.f1290e = true;
        }
        return this.f1290e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1895b() {
        if (mo1903s()) {
            if (this.f1290e) {
                if (this.f1297l.getMeasuredHeight() > 0 && this.f1297l.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1299n.mo1910b(this.f1297l) ? 1048576 : (this.f1297l.getMeasuredWidth() - this.f1297l.getTotalPaddingLeft()) - this.f1297l.getTotalPaddingRight();
                    int height = (this.f1297l.getHeight() - this.f1297l.getCompoundPaddingBottom()) - this.f1297l.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1286a;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float i = (float) m1537i(rectF);
                            if (i != this.f1297l.getTextSize()) {
                                mo1908y(0, i);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1290e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo1896e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? m1534f(charSequence, alignment, i, i2) : i3 >= 16 ? m1536h(charSequence, alignment, i) : m1535g(charSequence, alignment, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo1897j() {
        return Math.round(this.f1293h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo1898k() {
        return Math.round(this.f1292g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo1899l() {
        return Math.round(this.f1291f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] mo1900m() {
        return this.f1294i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo1901n() {
        return this.f1289d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1902q(int i) {
        TextPaint textPaint = this.f1296k;
        if (textPaint == null) {
            this.f1296k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1296k.set(this.f1297l.getPaint());
        this.f1296k.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo1903s() {
        return m1529D() && this.f1289d != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1904t(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1298m;
        int[] iArr = C0763j.f3747i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1297l;
        C1013s.m5762g0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C0763j.f3772n0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1289d = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C0763j.f3767m0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C0763j.f3757k0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C0763j.f3752j0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C0763j.f3762l0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1526A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1529D()) {
            this.f1289d = 0;
        } else if (this.f1289d == 1) {
            if (!this.f1295j) {
                DisplayMetrics displayMetrics = this.f1298m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1530E(dimension2, dimension3, dimension);
            }
            m1542z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1905u(int i, int i2, int i3, int i4) {
        if (m1529D()) {
            DisplayMetrics displayMetrics = this.f1298m.getResources().getDisplayMetrics();
            m1530E(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1542z()) {
                mo1895b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1906v(int[] iArr, int i) {
        if (m1529D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1298m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1294i = m1532c(iArr2);
                if (!m1527B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1295j = false;
            }
            if (m1542z()) {
                mo1895b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1907w(int i) {
        if (!m1529D()) {
            return;
        }
        if (i == 0) {
            m1533d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1298m.getResources().getDisplayMetrics();
            m1530E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1542z()) {
                mo1895b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo1908y(int i, float f) {
        Context context = this.f1298m;
        m1541x(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
