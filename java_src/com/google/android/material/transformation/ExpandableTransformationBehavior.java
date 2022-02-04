package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f10995b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C3290a extends AnimatorListenerAdapter {
        C3290a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f10995b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo11155H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f10995b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo11157J(view, view2, z, z3);
        this.f10995b = J;
        J.addListener(new C3290a());
        this.f10995b.start();
        if (!z2) {
            this.f10995b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo11157J(View view, View view2, boolean z, boolean z2);
}
