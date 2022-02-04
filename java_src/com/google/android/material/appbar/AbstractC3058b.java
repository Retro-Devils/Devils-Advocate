package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p006b.p030g.p034f.C0920a;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C0997d;
import p006b.p030g.p039k.C1013s;

/* renamed from: com.google.android.material.appbar.b */
abstract class AbstractC3058b extends C3059c<View> {

    /* renamed from: d */
    final Rect f10100d = new Rect();

    /* renamed from: e */
    final Rect f10101e = new Rect();

    /* renamed from: f */
    private int f10102f = 0;

    /* renamed from: g */
    private int f10103g;

    public AbstractC3058b() {
    }

    public AbstractC3058b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: N */
    private static int m12560N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C3059c
    /* renamed from: F */
    public void mo9904F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View H = mo9889H(coordinatorLayout.mo2067r(view));
        if (H != null) {
            CoordinatorLayout.C0340f fVar = (CoordinatorLayout.C0340f) view.getLayoutParams();
            Rect rect = this.f10100d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            C0964a0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1013s.m5791v(coordinatorLayout) && !C1013s.m5791v(view)) {
                rect.left += lastWindowInsets.mo5416f();
                rect.right -= lastWindowInsets.mo5417g();
            }
            Rect rect2 = this.f10101e;
            C0997d.m5668a(m12560N(fVar.f1925c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo9905I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            i2 = rect2.top - H.getBottom();
        } else {
            super.mo9904F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f10102f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo9889H(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo9905I(View view) {
        if (this.f10103g == 0) {
            return 0;
        }
        float J = mo9890J(view);
        int i = this.f10103g;
        return C0920a.m5393b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract float mo9890J(View view);

    /* renamed from: K */
    public final int mo9906K() {
        return this.f10103g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo9891L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo9907M() {
        return this.f10102f;
    }

    /* renamed from: O */
    public final void mo9908O(int i) {
        this.f10103g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo9909P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: m */
    public boolean mo2099m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        C0964a0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = mo9889H(coordinatorLayout.mo2067r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C1013s.m5791v(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo5418h() + lastWindowInsets.mo5414e();
        }
        int L = size + mo9891L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo9909P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.mo2035J(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
