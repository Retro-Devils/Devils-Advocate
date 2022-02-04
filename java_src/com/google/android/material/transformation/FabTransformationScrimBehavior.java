package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p069c.p073b.p074a.p090b.p092l.C1402b;
import p069c.p073b.p074a.p090b.p092l.C1409i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C1409i f11024c = new C1409i(75, 150);

    /* renamed from: d */
    private final C1409i f11025d = new C1409i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C3296a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f11026a;

        /* renamed from: b */
        final /* synthetic */ View f11027b;

        C3296a(boolean z, View view) {
            this.f11026a = z;
            this.f11027b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f11026a) {
                this.f11027b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f11026a) {
                this.f11027b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: K */
    private void m13802K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C1409i iVar = z ? this.f11024c : this.f11025d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        iVar.mo6471a(objectAnimator);
        list.add(objectAnimator);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: D */
    public boolean mo2086D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2086D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    public AnimatorSet mo11157J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m13802K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C1402b.m7001a(animatorSet, arrayList);
        animatorSet.addListener(new C3296a(z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: e */
    public boolean mo2091e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
