package com.google.android.material.theme.p148a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p006b.p007a.p014o.C0788d;
import p069c.p073b.p074a.p090b.C1391b;

/* renamed from: com.google.android.material.theme.a.a */
public class C3288a {

    /* renamed from: a */
    private static final int[] f10988a = {16842752, C1391b.theme};

    /* renamed from: b */
    private static final int[] f10989b = {C1391b.materialThemeOverlay};

    /* renamed from: a */
    private static int m13765a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10988a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m13766b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10989b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m13767c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b = m13766b(context, attributeSet, i, i2);
        boolean z = (context instanceof C0788d) && ((C0788d) context).mo4690c() == b;
        if (b == 0 || z) {
            return context;
        }
        C0788d dVar = new C0788d(context, b);
        int a = m13765a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
