package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p006b.p030g.p038j.C0961i;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p104w.C1437c;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* renamed from: com.google.android.material.datepicker.b */
final class C3106b {

    /* renamed from: a */
    private final Rect f10388a;

    /* renamed from: b */
    private final ColorStateList f10389b;

    /* renamed from: c */
    private final ColorStateList f10390c;

    /* renamed from: d */
    private final ColorStateList f10391d;

    /* renamed from: e */
    private final int f10392e;

    /* renamed from: f */
    private final C1462k f10393f;

    private C3106b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1462k kVar, Rect rect) {
        C0961i.m5493b(rect.left);
        C0961i.m5493b(rect.top);
        C0961i.m5493b(rect.right);
        C0961i.m5493b(rect.bottom);
        this.f10388a = rect;
        this.f10389b = colorStateList2;
        this.f10390c = colorStateList;
        this.f10391d = colorStateList3;
        this.f10392e = i;
        this.f10393f = kVar;
    }

    /* renamed from: a */
    static C3106b m12989a(Context context, int i) {
        C0961i.m5492a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1400k.f5806U1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5812V1, 0), obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5824X1, 0), obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5818W1, 0), obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5830Y1, 0));
        ColorStateList a = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5836Z1);
        ColorStateList a2 = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5871e2);
        ColorStateList a3 = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5857c2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1400k.f5864d2, 0);
        C1462k m = C1462k.m7190b(context, obtainStyledAttributes.getResourceId(C1400k.f5843a2, 0), obtainStyledAttributes.getResourceId(C1400k.f5850b2, 0)).mo6667m();
        obtainStyledAttributes.recycle();
        return new C3106b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10406b() {
        return this.f10388a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10407c() {
        return this.f10388a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10408d(TextView textView) {
        C1455g gVar = new C1455g();
        C1455g gVar2 = new C1455g();
        gVar.setShapeAppearanceModel(this.f10393f);
        gVar2.setShapeAppearanceModel(this.f10393f);
        gVar.mo6608V(this.f10390c);
        gVar.mo6614b0((float) this.f10392e, this.f10391d);
        textView.setTextColor(this.f10389b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f10389b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f10388a;
        C1013s.m5772l0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
