package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import p006b.p053m.C1074f;

/* renamed from: androidx.leanback.transition.a */
class C0514a {

    /* renamed from: androidx.leanback.transition.a$a */
    private static class C0515a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a */
        private final View f2581a;

        /* renamed from: b */
        private final View f2582b;

        /* renamed from: c */
        private final int f2583c;

        /* renamed from: d */
        private final int f2584d;

        /* renamed from: e */
        private int[] f2585e;

        /* renamed from: f */
        private float f2586f;

        /* renamed from: g */
        private float f2587g;

        /* renamed from: h */
        private final float f2588h;

        /* renamed from: i */
        private final float f2589i;

        C0515a(View view, View view2, int i, int i2, float f, float f2) {
            this.f2582b = view;
            this.f2581a = view2;
            this.f2583c = i - Math.round(view.getTranslationX());
            this.f2584d = i2 - Math.round(view.getTranslationY());
            this.f2588h = f;
            this.f2589i = f2;
            int i3 = C1074f.transitionPosition;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f2585e = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2585e == null) {
                this.f2585e = new int[2];
            }
            this.f2585e[0] = Math.round(((float) this.f2583c) + this.f2582b.getTranslationX());
            this.f2585e[1] = Math.round(((float) this.f2584d) + this.f2582b.getTranslationY());
            this.f2581a.setTag(C1074f.transitionPosition, this.f2585e);
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationPause(Animator animator) {
            this.f2586f = this.f2582b.getTranslationX();
            this.f2587g = this.f2582b.getTranslationY();
            this.f2582b.setTranslationX(this.f2588h);
            this.f2582b.setTranslationY(this.f2589i);
        }

        public void onAnimationResume(Animator animator) {
            this.f2582b.setTranslationX(this.f2586f);
            this.f2582b.setTranslationY(this.f2587g);
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2582b.setTranslationX(this.f2588h);
            this.f2582b.setTranslationY(this.f2589i);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    static Animator m2706a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(C1074f.transitionPosition);
        if (iArr != null) {
            f = ((float) (iArr[0] - i)) + translationX;
            f2 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = Math.round(f - translationX) + i;
        int round2 = i2 + Math.round(f2 - translationY);
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        C0515a aVar = new C0515a(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(aVar);
        ofFloat.addListener(aVar);
        ofFloat.addPauseListener(aVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }
}
