package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.p101t.AbstractC1431a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0337c<View> {

    /* renamed from: a */
    private int f10990a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class ViewTreeObserver$OnPreDrawListenerC3289a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f10991b;

        /* renamed from: c */
        final /* synthetic */ int f10992c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1431a f10993d;

        ViewTreeObserver$OnPreDrawListenerC3289a(View view, int i, AbstractC1431a aVar) {
            this.f10991b = view;
            this.f10992c = i;
            this.f10993d = aVar;
        }

        public boolean onPreDraw() {
            this.f10991b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f10990a == this.f10992c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                AbstractC1431a aVar = this.f10993d;
                expandableBehavior.mo11155H((View) aVar, this.f10991b, aVar.mo6552a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private boolean m13769F(boolean z) {
        if (!z) {
            return this.f10990a == 1;
        }
        int i = this.f10990a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public AbstractC1431a mo11154G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.mo2067r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (mo2091e(coordinatorLayout, view, view2)) {
                return (AbstractC1431a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo11155H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: h */
    public boolean mo2094h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1431a aVar = (AbstractC1431a) view2;
        if (!m13769F(aVar.mo6552a())) {
            return false;
        }
        this.f10990a = aVar.mo6552a() ? 1 : 2;
        return mo11155H((View) aVar, view, aVar.mo6552a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: l */
    public boolean mo2098l(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1431a G;
        if (C1013s.m5737O(view) || (G = mo11154G(coordinatorLayout, view)) == null || !m13769F(G.mo6552a())) {
            return false;
        }
        int i2 = G.mo6552a() ? 1 : 2;
        this.f10990a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC3289a(view, i2, G));
        return false;
    }
}
