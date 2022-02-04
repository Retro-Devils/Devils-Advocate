package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.l */
public final class C3194l {

    /* renamed from: a */
    private final ArrayList<C3196b> f10695a = new ArrayList<>();

    /* renamed from: b */
    private C3196b f10696b = null;

    /* renamed from: c */
    ValueAnimator f10697c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f10698d = new C3195a();

    /* renamed from: com.google.android.material.internal.l$a */
    class C3195a extends AnimatorListenerAdapter {
        C3195a() {
        }

        public void onAnimationEnd(Animator animator) {
            C3194l lVar = C3194l.this;
            if (lVar.f10697c == animator) {
                lVar.f10697c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.l$b */
    public static class C3196b {

        /* renamed from: a */
        final int[] f10700a;

        /* renamed from: b */
        final ValueAnimator f10701b;

        C3196b(int[] iArr, ValueAnimator valueAnimator) {
            this.f10700a = iArr;
            this.f10701b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m13397b() {
        ValueAnimator valueAnimator = this.f10697c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10697c = null;
        }
    }

    /* renamed from: e */
    private void m13398e(C3196b bVar) {
        ValueAnimator valueAnimator = bVar.f10701b;
        this.f10697c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo10782a(int[] iArr, ValueAnimator valueAnimator) {
        C3196b bVar = new C3196b(iArr, valueAnimator);
        valueAnimator.addListener(this.f10698d);
        this.f10695a.add(bVar);
    }

    /* renamed from: c */
    public void mo10783c() {
        ValueAnimator valueAnimator = this.f10697c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f10697c = null;
        }
    }

    /* renamed from: d */
    public void mo10784d(int[] iArr) {
        C3196b bVar;
        int size = this.f10695a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f10695a.get(i);
            if (StateSet.stateSetMatches(bVar.f10700a, iArr)) {
                break;
            }
            i++;
        }
        C3196b bVar2 = this.f10696b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m13397b();
            }
            this.f10696b = bVar;
            if (bVar != null) {
                m13398e(bVar);
            }
        }
    }
}
