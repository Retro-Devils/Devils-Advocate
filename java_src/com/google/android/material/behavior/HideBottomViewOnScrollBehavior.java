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
    private int f10115a = 0;

    /* renamed from: b */
    private int f10116b = 2;

    /* renamed from: c */
    private int f10117c = 0;

    /* renamed from: d */
    private ViewPropertyAnimator f10118d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C3062a extends AnimatorListenerAdapter {
        C3062a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f10118d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private void m12582F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f10118d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C3062a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: A */
    public boolean mo2083A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void mo9915G(V v, int i) {
        this.f10117c = i;
        if (this.f10116b == 1) {
            v.setTranslationY((float) (this.f10115a + i));
        }
    }

    /* renamed from: H */
    public void mo9916H(V v) {
        if (this.f10116b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10118d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10116b = 1;
            m12582F(v, this.f10115a + this.f10117c, 175, C1401a.f6008c);
        }
    }

    /* renamed from: I */
    public void mo9917I(V v) {
        if (this.f10116b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10118d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10116b = 2;
            m12582F(v, 0, 225, C1401a.f6009d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: l */
    public boolean mo2098l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f10115a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
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
