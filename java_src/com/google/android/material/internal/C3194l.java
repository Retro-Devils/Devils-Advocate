package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.l */
public final class C3194l {

    /* renamed from: a */
    private final ArrayList<C3196b> f10687a = new ArrayList<>();

    /* renamed from: b */
    private C3196b f10688b = null;

    /* renamed from: c */
    ValueAnimator f10689c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f10690d = new C3195a();

    /* renamed from: com.google.android.material.internal.l$a */
    class C3195a extends AnimatorListenerAdapter {
        C3195a() {
        }

        public void onAnimationEnd(Animator animator) {
            C3194l lVar = C3194l.this;
            if (lVar.f10689c == animator) {
                lVar.f10689c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.l$b */
    public static class C3196b {

        /* renamed from: a */
        final int[] f10692a;

        /* renamed from: b */
        final ValueAnimator f10693b;

        C3196b(int[] iArr, ValueAnimator valueAnimator) {
            this.f10692a = iArr;
            this.f10693b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m13397b() {
        ValueAnimator valueAnimator = this.f10689c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10689c = null;
        }
    }

    /* renamed from: e */
    private void m13398e(C3196b bVar) {
        ValueAnimator valueAnimator = bVar.f10693b;
        this.f10689c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo10782a(int[] iArr, ValueAnimator valueAnimator) {
        C3196b bVar = new C3196b(iArr, valueAnimator);
        valueAnimator.addListener(this.f10690d);
        this.f10687a.add(bVar);
    }

    /* renamed from: c */
    public void mo10783c() {
        ValueAnimator valueAnimator = this.f10689c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f10689c = null;
        }
    }

    /* renamed from: d */
    public void mo10784d(int[] iArr) {
        C3196b bVar;
        int size = this.f10687a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f10687a.get(i);
            if (StateSet.stateSetMatches(bVar.f10692a, iArr)) {
                break;
            }
            i++;
        }
        C3196b bVar2 = this.f10688b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m13397b();
            }
            this.f10688b = bVar;
            if (bVar != null) {
                m13398e(bVar);
            }
        }
    }
}
