package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C3171c;
import java.util.List;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p092l.C1408h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AbstractC0336b {

    /* renamed from: s */
    private static final int f10474s = C1399j.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: t */
    static final Property<View, Float> f10475t = new C3141b(Float.class, "width");

    /* renamed from: u */
    static final Property<View, Float> f10476u = new C3142c(Float.class, "height");

    /* renamed from: A */
    private boolean f10477A;

    /* renamed from: v */
    private final AbstractC3163d f10478v;

    /* renamed from: w */
    private final AbstractC3163d f10479w;

    /* renamed from: x */
    private final AbstractC3163d f10480x;

    /* renamed from: y */
    private final AbstractC3163d f10481y;

    /* renamed from: z */
    private final CoordinatorLayout.AbstractC0337c<ExtendedFloatingActionButton> f10482z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0337c<T> {

        /* renamed from: a */
        private Rect f10483a;

        /* renamed from: b */
        private AbstractC3143d f10484b;

        /* renamed from: c */
        private AbstractC3143d f10485c;

        /* renamed from: d */
        private boolean f10486d;

        /* renamed from: e */
        private boolean f10487e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f10486d = false;
            this.f10487e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5787R0);
            this.f10486d = obtainStyledAttributes.getBoolean(C1400k.f5793S0, false);
            this.f10487e = obtainStyledAttributes.getBoolean(C1400k.f5799T0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: G */
        private static boolean m13103G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0340f) {
                return ((CoordinatorLayout.C0340f) layoutParams).mo2121f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m13104J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f10486d || this.f10487e) && ((CoordinatorLayout.C0340f) extendedFloatingActionButton.getLayoutParams()).mo2120e() == view.getId();
        }

        /* renamed from: L */
        private boolean m13105L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m13104J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f10483a == null) {
                this.f10483a = new Rect();
            }
            Rect rect = this.f10483a;
            C3171c.m13324a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo10493K(extendedFloatingActionButton);
                return true;
            }
            mo10489E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m13106M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m13104J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0340f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                mo10493K(extendedFloatingActionButton);
                return true;
            }
            mo10489E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo10489E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f10487e;
            extendedFloatingActionButton.m13101l(z ? extendedFloatingActionButton.f10479w : extendedFloatingActionButton.f10480x, z ? this.f10485c : this.f10484b);
        }

        /* renamed from: F */
        public boolean mo2088b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2088b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo2094h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m13105L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m13103G(view)) {
                return false;
            } else {
                m13106M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo2098l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> r = coordinatorLayout.mo2067r(extendedFloatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m13103G(view) && m13106M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m13105L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2034I(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void mo10493K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f10487e;
            extendedFloatingActionButton.m13101l(z ? extendedFloatingActionButton.f10478v : extendedFloatingActionButton.f10481y, z ? this.f10485c : this.f10484b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: g */
        public void mo2093g(CoordinatorLayout.C0340f fVar) {
            if (fVar.f1930h == 0) {
                fVar.f1930h = 80;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C3140a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10488a;

        /* renamed from: b */
        final /* synthetic */ AbstractC3163d f10489b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3143d f10490c;

        C3140a(AbstractC3163d dVar, AbstractC3143d dVar2) {
            this.f10489b = dVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10488a = true;
            this.f10489b.mo10641d();
        }

        public void onAnimationEnd(Animator animator) {
            this.f10489b.mo10640c();
            if (!this.f10488a) {
                this.f10489b.mo10643f(this.f10490c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f10489b.onAnimationStart(animator);
            this.f10488a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C3141b extends Property<View, Float> {
        C3141b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C3142c extends Property<View, Float> {
        C3142c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class AbstractC3143d {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private void m13101l(AbstractC3163d dVar, AbstractC3143d dVar2) {
        if (!dVar.mo10644g()) {
            if (!m13102m()) {
                dVar.mo10646i();
                dVar.mo10643f(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet b = dVar.mo10639b();
            b.addListener(new C3140a(dVar, dVar2));
            for (Animator.AnimatorListener animatorListener : dVar.mo10642e()) {
                b.addListener(animatorListener);
            }
            b.start();
        }
    }

    /* renamed from: m */
    private boolean m13102m() {
        return C1013s.m5737O(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0336b
    public CoordinatorLayout.AbstractC0337c<ExtendedFloatingActionButton> getBehavior() {
        return this.f10482z;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C1013s.m5726D(this), C1013s.m5725C(this)) * 2) + getIconSize();
    }

    public C1408h getExtendMotionSpec() {
        return this.f10479w.mo10638a();
    }

    public C1408h getHideMotionSpec() {
        return this.f10481y.mo10638a();
    }

    public C1408h getShowMotionSpec() {
        return this.f10480x.mo10638a();
    }

    public C1408h getShrinkMotionSpec() {
        return this.f10478v.mo10638a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10477A && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f10477A = false;
            this.f10478v.mo10646i();
        }
    }

    public void setExtendMotionSpec(C1408h hVar) {
        this.f10479w.mo10645h(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1408h.m7013c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f10477A != z) {
            AbstractC3163d dVar = z ? this.f10479w : this.f10478v;
            if (!dVar.mo10644g()) {
                dVar.mo10646i();
            }
        }
    }

    public void setHideMotionSpec(C1408h hVar) {
        this.f10481y.mo10645h(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1408h.m7013c(getContext(), i));
    }

    public void setShowMotionSpec(C1408h hVar) {
        this.f10480x.mo10645h(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1408h.m7013c(getContext(), i));
    }

    public void setShrinkMotionSpec(C1408h hVar) {
        this.f10478v.mo10645h(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1408h.m7013c(getContext(), i));
    }
}
