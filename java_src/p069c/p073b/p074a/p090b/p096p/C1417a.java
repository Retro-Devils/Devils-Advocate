package p069c.p073b.p074a.p090b.p096p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p069c.p073b.p074a.p090b.p096p.AbstractC1421d;

/* renamed from: c.b.a.b.p.a */
public final class C1417a {

    /* renamed from: c.b.a.b.p.a$a */
    static class C1418a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC1421d f6042a;

        C1418a(AbstractC1421d dVar) {
            this.f6042a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6042a.mo6525b();
        }

        public void onAnimationStart(Animator animator) {
            this.f6042a.mo6524a();
        }
    }

    /* renamed from: a */
    public static Animator m7036a(AbstractC1421d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, AbstractC1421d.C1424c.f6047a, AbstractC1421d.C1423b.f6045a, new AbstractC1421d.C1426e(f, f2, f3));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        AbstractC1421d.C1426e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f6051c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m7037b(AbstractC1421d dVar) {
        return new C1418a(dVar);
    }
}
