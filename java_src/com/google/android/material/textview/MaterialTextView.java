package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0302y;
import com.google.android.material.theme.p148a.C3288a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p104w.C1436b;
import p069c.p073b.p074a.p090b.p104w.C1437c;

public class MaterialTextView extends C0302y {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C3288a.m13767c(context, attributeSet, i, i2), attributeSet, i);
        int h;
        Context context2 = getContext();
        if (m13756g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m13759j(context2, theme, attributeSet, i, i2) && (h = m13757h(theme, attributeSet, i, i2)) != -1) {
                m13755f(theme, h);
            }
        }
    }

    /* renamed from: f */
    private void m13755f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C1400k.f5940p2);
        int i2 = m13758i(getContext(), obtainStyledAttributes, C1400k.f5947q2, C1400k.f5954r2);
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    /* renamed from: g */
    private static boolean m13756g(Context context) {
        return C1436b.m7074b(context, C1391b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m13757h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1400k.f5961s2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1400k.f5967t2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m13758i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C1437c.m7079c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m13759j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1400k.f5961s2, i, i2);
        int i3 = m13758i(context, obtainStyledAttributes, C1400k.f5973u2, C1400k.f5979v2);
        obtainStyledAttributes.recycle();
        return i3 != -1;
    }

    @Override // androidx.appcompat.widget.C0302y
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m13756g(context)) {
            m13755f(context.getTheme(), i);
        }
    }
}
