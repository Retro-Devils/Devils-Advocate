package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p006b.p030g.p038j.C0961i;

/* renamed from: com.google.android.material.internal.m */
final class C3197m {

    /* renamed from: a */
    private static boolean f10694a;

    /* renamed from: b */
    private static Constructor<StaticLayout> f10695b;

    /* renamed from: c */
    private static Object f10696c;

    /* renamed from: d */
    private CharSequence f10697d;

    /* renamed from: e */
    private final TextPaint f10698e;

    /* renamed from: f */
    private final int f10699f;

    /* renamed from: g */
    private int f10700g = 0;

    /* renamed from: h */
    private int f10701h;

    /* renamed from: i */
    private Layout.Alignment f10702i;

    /* renamed from: j */
    private int f10703j;

    /* renamed from: k */
    private boolean f10704k;

    /* renamed from: l */
    private boolean f10705l;

    /* renamed from: m */
    private TextUtils.TruncateAt f10706m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.m$a */
    public static class C3198a extends Exception {
        C3198a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C3197m(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f10697d = charSequence;
        this.f10698e = textPaint;
        this.f10699f = i;
        this.f10701h = charSequence.length();
        this.f10702i = Layout.Alignment.ALIGN_NORMAL;
        this.f10703j = Integer.MAX_VALUE;
        this.f10704k = true;
        this.f10706m = null;
    }

    /* renamed from: b */
    private void m13402b() {
        Class<?> cls;
        if (!f10694a) {
            try {
                boolean z = this.f10705l && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f10696c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C3197m.class.getClassLoader();
                    String str = this.f10705l ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f10696c = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
                f10695b = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f10694a = true;
            } catch (Exception e) {
                throw new C3198a(e);
            }
        }
    }

    /* renamed from: c */
    public static C3197m m13403c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C3197m(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo10786a() {
        if (this.f10697d == null) {
            this.f10697d = "";
        }
        int max = Math.max(0, this.f10699f);
        CharSequence charSequence = this.f10697d;
        if (this.f10703j == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f10698e, (float) max, this.f10706m);
        }
        int min = Math.min(charSequence.length(), this.f10701h);
        this.f10701h = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f10705l) {
                this.f10702i = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f10700g, min, this.f10698e, max);
            obtain.setAlignment(this.f10702i);
            obtain.setIncludePad(this.f10704k);
            obtain.setTextDirection(this.f10705l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f10706m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f10703j);
            return obtain.build();
        }
        m13402b();
        try {
            return (StaticLayout) ((Constructor) C0961i.m5494c(f10695b)).newInstance(charSequence, Integer.valueOf(this.f10700g), Integer.valueOf(this.f10701h), this.f10698e, Integer.valueOf(max), this.f10702i, C0961i.m5494c(f10696c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f10704k), null, Integer.valueOf(max), Integer.valueOf(this.f10703j));
        } catch (Exception e) {
            throw new C3198a(e);
        }
    }

    /* renamed from: d */
    public C3197m mo10787d(Layout.Alignment alignment) {
        this.f10702i = alignment;
        return this;
    }

    /* renamed from: e */
    public C3197m mo10788e(TextUtils.TruncateAt truncateAt) {
        this.f10706m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C3197m mo10789f(boolean z) {
        this.f10704k = z;
        return this;
    }

    /* renamed from: g */
    public C3197m mo10790g(boolean z) {
        this.f10705l = z;
        return this;
    }

    /* renamed from: h */
    public C3197m mo10791h(int i) {
        this.f10703j = i;
        return this;
    }
}
