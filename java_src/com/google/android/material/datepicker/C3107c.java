package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p104w.C1436b;
import p069c.p073b.p074a.p090b.p104w.C1437c;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.c */
public final class C3107c {

    /* renamed from: a */
    final C3106b f10386a;

    /* renamed from: b */
    final C3106b f10387b;

    /* renamed from: c */
    final C3106b f10388c;

    /* renamed from: d */
    final C3106b f10389d;

    /* renamed from: e */
    final C3106b f10390e;

    /* renamed from: f */
    final C3106b f10391f;

    /* renamed from: g */
    final C3106b f10392g;

    /* renamed from: h */
    final Paint f10393h;

    C3107c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1436b.m7075c(context, C1391b.materialCalendarStyle, C3111g.class.getCanonicalName()), C1400k.f5744L1);
        this.f10386a = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5762O1, 0));
        this.f10392g = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5750M1, 0));
        this.f10387b = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5756N1, 0));
        this.f10388c = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5768P1, 0));
        ColorStateList a = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5774Q1);
        this.f10389d = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5786S1, 0));
        this.f10390e = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5780R1, 0));
        this.f10391f = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5792T1, 0));
        Paint paint = new Paint();
        this.f10393h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
