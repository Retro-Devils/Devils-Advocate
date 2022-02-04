package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p069c.p073b.p074a.p090b.p092l.C1401a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0337c<V> {

    /* renamed from: a */
    private int f10123a = 0;

    /* renamed from: b */
    private int f10124b = 2;

    /* renamed from: c */
    private int f10125c = 0;

    /* renamed from: d */
    private ViewPropertyAnimator f10126d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C3062a extends AnimatorListenerAdapter {
        C3062a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f10126d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private void m12582F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f10126d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C3062a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: A */
    public boolean mo2083A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void mo9915G(V v, int i) {
        this.f10125c = i;
        if (this.f10124b == 1) {
            v.setTranslationY((float) (this.f10123a + i));
        }
    }

    /* renamed from: H */
    public void mo9916H(V v) {
        if (this.f10124b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10126d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10124b = 1;
            m12582F(v, this.f10123a + this.f10125c, 175, C1401a.f6016c);
        }
    }

    /* renamed from: I */
    public void mo9917I(V v) {
        if (this.f10124b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10126d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10124b = 2;
            m12582F(v, 0, 225, C1401a.f6017d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: l */
    public boolean mo2098l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f10123a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2098l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: t */
    public void mo2106t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo9916H(v);
        } else if (i2 < 0) {
            mo9917I(v);
        }
    }
}
