package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p069c.p073b.p074a.p090b.p105x.C1446b;
import p069c.p073b.p074a.p090b.p106y.AbstractC1448b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.c */
public class C3162c extends C3149b {
    C3162c(FloatingActionButton floatingActionButton, AbstractC1448b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: e0 */
    private Animator m13232e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f10527F, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f10527F, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C3149b.f10515a);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: A */
    public void mo10581A() {
        mo10607b0();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: C */
    public void mo10583C(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f10527F.isEnabled()) {
                this.f10527F.setElevation(this.f10541o);
                if (this.f10527F.isPressed()) {
                    floatingActionButton = this.f10527F;
                    f = this.f10543q;
                } else if (this.f10527F.isFocused() || this.f10527F.isHovered()) {
                    floatingActionButton = this.f10527F;
                    f = this.f10542p;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f10527F.setElevation(0.0f);
            floatingActionButton = this.f10527F;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: D */
    public void mo10584D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f10527F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C3149b.f10516b, m13232e0(f, f3));
            stateListAnimator.addState(C3149b.f10517c, m13232e0(f, f2));
            stateListAnimator.addState(C3149b.f10518d, m13232e0(f, f2));
            stateListAnimator.addState(C3149b.f10519e, m13232e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f10527F, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f10527F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f10527F, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C3149b.f10515a);
            stateListAnimator.addState(C3149b.f10520f, animatorSet);
            stateListAnimator.addState(C3149b.f10521g, m13232e0(0.0f, 0.0f));
            this.f10527F.setStateListAnimator(stateListAnimator);
        }
        if (mo10602V()) {
            mo10607b0();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: I */
    public boolean mo10589I() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: R */
    public void mo10598R(ColorStateList colorStateList) {
        Drawable drawable = this.f10536j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C1446b.m7103a(colorStateList));
        } else {
            super.mo10598R(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: V */
    public boolean mo10602V() {
        return this.f10528G.mo6585c() || !mo10603X();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: Z */
    public void mo10605Z() {
    }

    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: m */
    public float mo10613m() {
        return this.f10527F.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: r */
    public void mo10617r(Rect rect) {
        if (this.f10528G.mo6585c()) {
            super.mo10617r(rect);
            return;
        }
        int sizeDimension = !mo10603X() ? (this.f10544r - this.f10527F.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C3149b
    /* renamed from: y */
    public void mo10624y() {
    }
}
