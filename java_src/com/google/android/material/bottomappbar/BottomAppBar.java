package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0398a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C3203p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p030g.p039k.C1013s;
import p006b.p043i.p044a.AbstractC1041a;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p092l.AbstractC1411k;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1459h;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.AbstractC0336b {

    /* renamed from: Q */
    private static final int f10145Q = C1399j.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: R */
    private final int f10146R;

    /* renamed from: S */
    private final C1455g f10147S;

    /* renamed from: T */
    private Animator f10148T;

    /* renamed from: U */
    private Animator f10149U;

    /* renamed from: V */
    private int f10150V;

    /* renamed from: W */
    private int f10151W;

    /* renamed from: a0 */
    private boolean f10152a0;

    /* renamed from: b0 */
    private int f10153b0;

    /* renamed from: c0 */
    private ArrayList<AbstractC3074f> f10154c0;

    /* renamed from: d0 */
    private boolean f10155d0;

    /* renamed from: e0 */
    private Behavior f10156e0;

    /* renamed from: f0 */
    private int f10157f0;

    /* renamed from: g0 */
    private int f10158g0;

    /* renamed from: h0 */
    private int f10159h0;

    /* renamed from: i0 */
    AnimatorListenerAdapter f10160i0;

    /* renamed from: j0 */
    AbstractC1411k<FloatingActionButton> f10161j0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f10162e = new Rect();

        /* renamed from: f */
        private WeakReference<BottomAppBar> f10163f;

        /* renamed from: g */
        private int f10164g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f10165h = new View$OnLayoutChangeListenerC3067a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class View$OnLayoutChangeListenerC3067a implements View.OnLayoutChangeListener {
            View$OnLayoutChangeListenerC3067a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f10163f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo10526j(Behavior.this.f10162e);
                int height = Behavior.this.f10162e.height();
                bottomAppBar.mo9945t0(height);
                CoordinatorLayout.C0340f fVar = (CoordinatorLayout.C0340f) view.getLayoutParams();
                if (Behavior.this.f10164g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C1393d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (C3203p.m13435d(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f10146R;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f10146R;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: M */
        public boolean mo2098l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f10163f = new WeakReference<>(bottomAppBar);
            View l0 = bottomAppBar.m12635l0();
            if (l0 != null && !C1013s.m5737O(l0)) {
                CoordinatorLayout.C0340f fVar = (CoordinatorLayout.C0340f) l0.getLayoutParams();
                fVar.f1926d = 49;
                this.f10164g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (l0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) l0;
                    floatingActionButton.addOnLayoutChangeListener(this.f10165h);
                    bottomAppBar.m12628d0(floatingActionButton);
                }
                bottomAppBar.m12641s0();
            }
            coordinatorLayout.mo2034I(bottomAppBar, i);
            return super.mo2098l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo2083A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2083A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C3068a extends AnimatorListenerAdapter {
        C3068a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m12632i0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m12633j0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C3069b extends FloatingActionButton.AbstractC3145b {

        /* renamed from: a */
        final /* synthetic */ int f10168a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C3070a extends FloatingActionButton.AbstractC3145b {
            C3070a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC3145b
            /* renamed from: b */
            public void mo9952b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m12632i0();
            }
        }

        C3069b(int i) {
            this.f10168a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC3145b
        /* renamed from: a */
        public void mo9951a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m12636n0(this.f10168a));
            floatingActionButton.mo10538s(new C3070a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C3071c extends AnimatorListenerAdapter {
        C3071c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m12632i0();
            BottomAppBar.this.f10149U = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m12633j0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C3072d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f10172a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f10173b;

        /* renamed from: c */
        final /* synthetic */ int f10174c;

        /* renamed from: d */
        final /* synthetic */ boolean f10175d;

        C3072d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f10173b = actionMenuView;
            this.f10174c = i;
            this.f10175d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10172a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f10172a) {
                BottomAppBar.this.m12642u0(this.f10173b, this.f10174c, this.f10175d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C3073e extends AnimatorListenerAdapter {
        C3073e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f10160i0.onAnimationStart(animator);
            FloatingActionButton k0 = BottomAppBar.this.m12634k0();
            if (k0 != null) {
                k0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public interface AbstractC3074f {
        /* renamed from: a */
        void mo9958a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo9959b(BottomAppBar bottomAppBar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public static class C3075g extends AbstractC1041a {
        public static final Parcelable.Creator<C3075g> CREATOR = new C3076a();

        /* renamed from: d */
        int f10178d;

        /* renamed from: e */
        boolean f10179e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        static class C3076a implements Parcelable.ClassLoaderCreator<C3075g> {
            C3076a() {
            }

            /* renamed from: a */
            public C3075g createFromParcel(Parcel parcel) {
                return new C3075g(parcel, null);
            }

            /* renamed from: b */
            public C3075g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3075g(parcel, classLoader);
            }

            /* renamed from: c */
            public C3075g[] newArray(int i) {
                return new C3075g[i];
            }
        }

        public C3075g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10178d = parcel.readInt();
            this.f10179e = parcel.readInt() != 0;
        }

        public C3075g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10178d);
            parcel.writeInt(this.f10179e ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d0 */
    private void m12628d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo10506e(this.f10160i0);
        floatingActionButton.mo10507f(new C3073e());
        floatingActionButton.mo10508g(this.f10161j0);
    }

    /* renamed from: e0 */
    private void m12629e0() {
        Animator animator = this.f10149U;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f10148T;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: g0 */
    private void m12630g0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m12634k0(), "translationX", m12636n0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getBottomInset() {
        return this.f10157f0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationX() {
        return m12636n0(this.f10150V);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo9966c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getLeftInset() {
        return this.f10159h0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getRightInset() {
        return this.f10158g0;
    }

    private C3077a getTopEdgeTreatment() {
        return (C3077a) this.f10147S.mo6597C().mo6653p();
    }

    /* renamed from: h0 */
    private void m12631h0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo9935m0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new C3072d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i0 */
    private void m12632i0() {
        ArrayList<AbstractC3074f> arrayList;
        int i = this.f10153b0 - 1;
        this.f10153b0 = i;
        if (i == 0 && (arrayList = this.f10154c0) != null) {
            Iterator<AbstractC3074f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo9958a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j0 */
    private void m12633j0() {
        ArrayList<AbstractC3074f> arrayList;
        int i = this.f10153b0;
        this.f10153b0 = i + 1;
        if (i == 0 && (arrayList = this.f10154c0) != null) {
            Iterator<AbstractC3074f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo9959b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k0 */
    private FloatingActionButton m12634k0() {
        View l0 = m12635l0();
        if (l0 instanceof FloatingActionButton) {
            return (FloatingActionButton) l0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m12635l0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo2070s(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m12635l0():android.view.View");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n0 */
    private float m12636n0(int i) {
        boolean d = C3203p.m13435d(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f10146R + (d ? this.f10159h0 : this.f10158g0));
        if (d) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: o0 */
    private boolean m12637o0() {
        FloatingActionButton k0 = m12634k0();
        return k0 != null && k0.mo10531o();
    }

    /* renamed from: p0 */
    private void m12638p0(int i, boolean z) {
        if (C1013s.m5737O(this)) {
            Animator animator = this.f10149U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m12637o0()) {
                i = 0;
                z = false;
            }
            m12631h0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f10149U = animatorSet;
            animatorSet.addListener(new C3071c());
            this.f10149U.start();
        }
    }

    /* renamed from: q0 */
    private void m12639q0(int i) {
        if (this.f10150V != i && C1013s.m5737O(this)) {
            Animator animator = this.f10148T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f10151W == 1) {
                m12630g0(i, arrayList);
            } else {
                mo9927f0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f10148T = animatorSet;
            animatorSet.addListener(new C3068a());
            this.f10148T.start();
        }
    }

    /* renamed from: r0 */
    private void m12640r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m12637o0()) {
                m12642u0(actionMenuView, 0, false);
            } else {
                m12642u0(actionMenuView, this.f10150V, this.f10155d0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s0 */
    private void m12641s0() {
        getTopEdgeTreatment().mo9974k(getFabTranslationX());
        View l0 = m12635l0();
        this.f10147S.mo6609W((!this.f10155d0 || !m12637o0()) ? 0.0f : 1.0f);
        if (l0 != null) {
            l0.setTranslationY(getFabTranslationY());
            l0.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: u0 */
    private void m12642u0(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo9935m0(actionMenuView, i, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo9927f0(int i, List<Animator> list) {
        FloatingActionButton k0 = m12634k0();
        if (k0 != null && !k0.mo10530n()) {
            m12633j0();
            k0.mo10528l(new C3069b(i));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f10147S.mo6598E();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0336b
    public Behavior getBehavior() {
        if (this.f10156e0 == null) {
            this.f10156e0 = new Behavior();
        }
        return this.f10156e0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo9966c();
    }

    public int getFabAlignmentMode() {
        return this.f10150V;
    }

    public int getFabAnimationMode() {
        return this.f10151W;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo9967d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo9968e();
    }

    public boolean getHideOnScroll() {
        return this.f10152a0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public int mo9935m0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean d = C3203p.m13435d(this);
        int measuredWidth = d ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0191e) && (((Toolbar.C0191e) childAt.getLayoutParams()).f223a & 8388615) == 8388611) {
                measuredWidth = d ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d ? this.f10158g0 : -this.f10159h0));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1459h.m7186f(this, this.f10147S);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m12629e0();
            m12641s0();
        }
        m12640r0();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3075g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3075g gVar = (C3075g) parcelable;
        super.onRestoreInstanceState(gVar.mo5608b());
        this.f10150V = gVar.f10178d;
        this.f10155d0 = gVar.f10179e;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        C3075g gVar = new C3075g(super.onSaveInstanceState());
        gVar.f10178d = this.f10150V;
        gVar.f10179e = this.f10155d0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0398a.m1978o(this.f10147S, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo9970g(f);
            this.f10147S.invalidateSelf();
            m12641s0();
        }
    }

    public void setElevation(float f) {
        this.f10147S.mo6607U(f);
        getBehavior().mo9915G(this, this.f10147S.mo6596B() - this.f10147S.mo6595A());
    }

    public void setFabAlignmentMode(int i) {
        m12639q0(i);
        m12638p0(i, this.f10155d0);
        this.f10150V = i;
    }

    public void setFabAnimationMode(int i) {
        this.f10151W = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo9971h(f);
            this.f10147S.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo9972i(f);
            this.f10147S.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f10152a0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo9945t0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo9969f()) {
            return false;
        }
        getTopEdgeTreatment().mo9973j(f);
        this.f10147S.invalidateSelf();
        return true;
    }
}
