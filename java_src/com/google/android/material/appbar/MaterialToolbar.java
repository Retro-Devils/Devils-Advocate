package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.theme.p148a.C3288a;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1459h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: Q */
    private static final int f10089Q = C1399j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.f5668F);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C3288a.m13767c(context, attributeSet, i, f10089Q), attributeSet, i);
        m12547P(getContext());
    }

    /* renamed from: P */
    private void m12547P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1455g gVar = new C1455g();
            gVar.mo6608V(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo6603M(context);
            gVar.mo6607U(C1013s.m5787t(this));
            C1013s.m5772l0(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1459h.m7185e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C1459h.m7184d(this, f);
    }
}
