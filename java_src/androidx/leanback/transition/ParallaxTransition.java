package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.leanback.widget.AbstractC0583p;
import p006b.p053m.C1074f;

public class ParallaxTransition extends Visibility {

    /* renamed from: b */
    static Interpolator f2561b = new LinearInterpolator();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.transition.ParallaxTransition$a */
    public class C0503a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC0583p f2562a;

        C0503a(AbstractC0583p pVar) {
            this.f2562a = pVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2562a.mo3541b();
        }
    }

    public ParallaxTransition() {
    }

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Animator mo2932a(View view) {
        AbstractC0583p pVar = (AbstractC0583p) view.getTag(C1074f.lb_parallax_source);
        if (pVar == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(f2561b);
        ofFloat.addUpdateListener(new C0503a(pVar));
        return ofFloat;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return mo2932a(view);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return mo2932a(view);
    }
}
