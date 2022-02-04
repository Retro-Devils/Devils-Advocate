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
    private final Rect f10380a;

    /* renamed from: b */
    private final ColorStateList f10381b;

    /* renamed from: c */
    private final ColorStateList f10382c;

    /* renamed from: d */
    private final ColorStateList f10383d;

    /* renamed from: e */
    private final int f10384e;

    /* renamed from: f */
    private final C1462k f10385f;

    private C3106b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1462k kVar, Rect rect) {
        C0961i.m5493b(rect.left);
        C0961i.m5493b(rect.top);
        C0961i.m5493b(rect.right);
        C0961i.m5493b(rect.bottom);
        this.f10380a = rect;
        this.f10381b = colorStateList2;
        this.f10382c = colorStateList;
        this.f10383d = colorStateList3;
        this.f10384e = i;
        this.f10385f = kVar;
    }

    /* renamed from: a */
    static C3106b m12989a(Context context, int i) {
        C0961i.m5492a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1400k.f5798U1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5804V1, 0), obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5816X1, 0), obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5810W1, 0), obtainStyledAttributes.getDimensionPixelOffset(C1400k.f5822Y1, 0));
        ColorStateList a = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5828Z1);
        ColorStateList a2 = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5863e2);
        ColorStateList a3 = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5849c2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1400k.f5856d2, 0);
        C1462k m = C1462k.m7190b(context, obtainStyledAttributes.getResourceId(C1400k.f5835a2, 0), obtainStyledAttributes.getResourceId(C1400k.f5842b2, 0)).mo6667m();
        obtainStyledAttributes.recycle();
        return new C3106b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10406b() {
        return this.f10380a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10407c() {
        return this.f10380a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10408d(TextView textView) {
        C1455g gVar = new C1455g();
        C1455g gVar2 = new C1455g();
        gVar.setShapeAppearanceModel(this.f10385f);
        gVar2.setShapeAppearanceModel(this.f10385f);
        gVar.mo6608V(this.f10382c);
        gVar.mo6614b0((float) this.f10384e, this.f10383d);
        textView.setTextColor(this.f10381b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f10381b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f10380a;
        C1013s.m5772l0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
