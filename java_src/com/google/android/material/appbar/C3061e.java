package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1396g;

/* renamed from: com.google.android.material.appbar.e */
class C3061e {

    /* renamed from: a */
    private static final int[] f10114a = {16843848};

    /* renamed from: a */
    static void m12580a(View view, float f) {
        int integer = view.getResources().getInteger(C1396g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C1391b.state_liftable, -C1391b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
