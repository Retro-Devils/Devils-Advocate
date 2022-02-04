package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0296w0;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1400k;

/* renamed from: com.google.android.material.internal.o */
public final class C3202o {

    /* renamed from: a */
    private static final int[] f10714a = {C1391b.f5673i};

    /* renamed from: b */
    private static final int[] f10715b = {C1391b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m13423a(Context context) {
        m13427e(context, f10714a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m13424b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5894i5, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C1400k.f5908k5, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1391b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m13425c(context);
            }
        }
        m13423a(context);
    }

    /* renamed from: c */
    public static void m13425c(Context context) {
        m13427e(context, f10715b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m13426d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5894i5, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C1400k.f5915l5, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C1400k.f5901j5, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m13428f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m13427e(Context context, int[] iArr, String str) {
        if (!m13429g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    private static boolean m13428f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m13429g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m13430h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m13424b(context, attributeSet, i, i2);
        m13426d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C0296w0 m13431i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m13424b(context, attributeSet, i, i2);
        m13426d(context, attributeSet, iArr, i, i2, iArr2);
        return C0296w0.m1432v(context, attributeSet, iArr, i, i2);
    }
}
