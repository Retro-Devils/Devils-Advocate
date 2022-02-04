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
    final C3106b f10394a;

    /* renamed from: b */
    final C3106b f10395b;

    /* renamed from: c */
    final C3106b f10396c;

    /* renamed from: d */
    final C3106b f10397d;

    /* renamed from: e */
    final C3106b f10398e;

    /* renamed from: f */
    final C3106b f10399f;

    /* renamed from: g */
    final C3106b f10400g;

    /* renamed from: h */
    final Paint f10401h;

    C3107c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1436b.m7075c(context, C1391b.materialCalendarStyle, C3111g.class.getCanonicalName()), C1400k.f5752L1);
        this.f10394a = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5770O1, 0));
        this.f10400g = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5758M1, 0));
        this.f10395b = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5764N1, 0));
        this.f10396c = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5776P1, 0));
        ColorStateList a = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5782Q1);
        this.f10397d = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5794S1, 0));
        this.f10398e = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5788R1, 0));
        this.f10399f = C3106b.m12989a(context, obtainStyledAttributes.getResourceId(C1400k.f5800T1, 0));
        Paint paint = new Paint();
        this.f10401h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
