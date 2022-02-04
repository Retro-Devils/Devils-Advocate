package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0241j;
import androidx.appcompat.widget.C0261n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0398a;
import androidx.core.widget.AbstractC0422l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C3149b;
import com.google.android.material.internal.C3171c;
import com.google.android.material.internal.C3208q;
import java.util.List;
import p006b.p030g.p038j.C0961i;
import p006b.p030g.p039k.AbstractC1012r;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p091a0.C1389a;
import p069c.p073b.p074a.p090b.p092l.AbstractC1411k;
import p069c.p073b.p074a.p090b.p092l.C1408h;
import p069c.p073b.p074a.p090b.p101t.AbstractC1431a;
import p069c.p073b.p074a.p090b.p106y.AbstractC1448b;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1462k;

public class FloatingActionButton extends C3208q implements AbstractC1012r, AbstractC0422l, AbstractC1431a, AbstractC1477n, CoordinatorLayout.AbstractC0336b {

    /* renamed from: c */
    private static final int f10492c = C1399j.Widget_Design_FloatingActionButton;

    /* renamed from: d */
    private ColorStateList f10493d;

    /* renamed from: e */
    private PorterDuff.Mode f10494e;

    /* renamed from: f */
    private ColorStateList f10495f;

    /* renamed from: g */
    private PorterDuff.Mode f10496g;

    /* renamed from: h */
    private ColorStateList f10497h;

    /* renamed from: i */
    private int f10498i;

    /* renamed from: j */
    private int f10499j;

    /* renamed from: k */
    private int f10500k;

    /* renamed from: l */
    private int f10501l;

    /* renamed from: m */
    boolean f10502m;

    /* renamed from: n */
    final Rect f10503n;

    /* renamed from: o */
    private final Rect f10504o;

    /* renamed from: p */
    private final C0261n f10505p;

    /* renamed from: q */
    private C3149b f10506q;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0337c<T> {

        /* renamed from: a */
        private Rect f10507a;

        /* renamed from: b */
        private AbstractC3145b f10508b;

        /* renamed from: c */
        private boolean f10509c;

        public BaseBehavior() {
            this.f10509c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5811V0);
            this.f10509c = obtainStyledAttributes.getBoolean(C1400k.f5817W0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        private static boolean m13140F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0340f) {
                return ((CoordinatorLayout.C0340f) layoutParams).mo2121f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m13141G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f10503n;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0340f fVar = (CoordinatorLayout.C0340f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C1013s.m5743U(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C1013s.m5742T(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: J */
        private boolean m13142J(View view, FloatingActionButton floatingActionButton) {
            return this.f10509c && ((CoordinatorLayout.C0340f) floatingActionButton.getLayoutParams()).mo2120e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m13143K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m13142J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10507a == null) {
                this.f10507a = new Rect();
            }
            Rect rect = this.f10507a;
            C3171c.m13324a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo10529m(this.f10508b, false);
                return true;
            }
            floatingActionButton.mo10571t(this.f10508b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m13144L(View view, FloatingActionButton floatingActionButton) {
            if (!m13142J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0340f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.mo10529m(this.f10508b, false);
                return true;
            }
            floatingActionButton.mo10571t(this.f10508b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo2088b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f10503n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo2094h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m13143K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m13140F(view)) {
                return false;
            } else {
                m13144L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo2098l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> r = coordinatorLayout.mo2067r(floatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m13140F(view) && m13144L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m13143K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2034I(floatingActionButton, i);
            m13141G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: g */
        public void mo2093g(CoordinatorLayout.C0340f fVar) {
            if (fVar.f1930h == 0) {
                fVar.f1930h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo10572E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo2088b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo10573H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo2094h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo10574I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo2098l(coordinatorLayout, floatingActionButton, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c, com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo2093g(CoordinatorLayout.C0340f fVar) {
            super.mo2093g(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C3144a implements C3149b.AbstractC3159j {

        /* renamed from: a */
        final /* synthetic */ AbstractC3145b f10510a;

        C3144a(AbstractC3145b bVar) {
            this.f10510a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3159j
        /* renamed from: a */
        public void mo10575a() {
            this.f10510a.mo9952b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3159j
        /* renamed from: b */
        public void mo10576b() {
            this.f10510a.mo9951a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class AbstractC3145b {
        /* renamed from: a */
        public void mo9951a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo9952b(FloatingActionButton floatingActionButton) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C3146c implements AbstractC1448b {
        C3146c() {
        }

        @Override // p069c.p073b.p074a.p090b.p106y.AbstractC1448b
        /* renamed from: a */
        public void mo6583a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f10503n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f10500k, i2 + FloatingActionButton.this.f10500k, i3 + FloatingActionButton.this.f10500k, i4 + FloatingActionButton.this.f10500k);
        }

        @Override // p069c.p073b.p074a.p090b.p106y.AbstractC1448b
        /* renamed from: b */
        public void mo6584b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p069c.p073b.p074a.p090b.p106y.AbstractC1448b
        /* renamed from: c */
        public boolean mo6585c() {
            return FloatingActionButton.this.f10502m;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C3147d<T extends FloatingActionButton> implements C3149b.AbstractC3158i {

        /* renamed from: a */
        private final AbstractC1411k<T> f10513a;

        C3147d(AbstractC1411k<T> kVar) {
            this.f10513a = kVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.b.a.b.l.k<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3158i
        /* renamed from: a */
        public void mo10577a() {
            this.f10513a.mo6480a(FloatingActionButton.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.b.a.b.l.k<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3158i
        /* renamed from: b */
        public void mo10578b() {
            this.f10513a.mo6481b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3147d) && ((C3147d) obj).f10513a.equals(this.f10513a);
        }

        public int hashCode() {
            return this.f10513a.hashCode();
        }
    }

    private C3149b getImpl() {
        if (this.f10506q == null) {
            this.f10506q = m13122h();
        }
        return this.f10506q;
    }

    /* renamed from: h */
    private C3149b m13122h() {
        return Build.VERSION.SDK_INT >= 21 ? new C3162c(this, new C3146c()) : new C3149b(this, new C3146c());
    }

    /* renamed from: k */
    private int m13123k(int i) {
        int i2 = this.f10499j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m13123k(1) : m13123k(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C1393d.design_fab_size_normal : C1393d.design_fab_size_mini);
    }

    /* renamed from: p */
    private void m13124p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f10503n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m13125q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f10495f;
            if (colorStateList == null) {
                C0398a.m1966c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f10496g;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0241j.m1244e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m13126r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C3149b.AbstractC3159j m13127u(AbstractC3145b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C3144a(bVar);
    }

    @Override // p069c.p073b.p074a.p090b.p101t.AbstractC1431a
    /* renamed from: a */
    public boolean mo6552a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo10583C(getDrawableState());
    }

    /* renamed from: e */
    public void mo10506e(Animator.AnimatorListener animatorListener) {
        getImpl().mo10609d(animatorListener);
    }

    /* renamed from: f */
    public void mo10507f(Animator.AnimatorListener animatorListener) {
        getImpl().mo10610e(animatorListener);
    }

    /* renamed from: g */
    public void mo10508g(AbstractC1411k<? extends FloatingActionButton> kVar) {
        getImpl().mo10611f(new C3147d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f10493d;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10494e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0336b
    public CoordinatorLayout.AbstractC0337c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo10613m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo10616p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo10618s();
    }

    public Drawable getContentBackground() {
        return getImpl().mo10612j();
    }

    public int getCustomSize() {
        return this.f10499j;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C1408h getHideMotionSpec() {
        return getImpl().mo10615o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f10497h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f10497h;
    }

    public C1462k getShapeAppearanceModel() {
        return (C1462k) C0961i.m5494c(getImpl().mo10619t());
    }

    public C1408h getShowMotionSpec() {
        return getImpl().mo10620u();
    }

    public int getSize() {
        return this.f10498i;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m13123k(this.f10498i);
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.AbstractC0422l
    public ColorStateList getSupportImageTintList() {
        return this.f10495f;
    }

    @Override // androidx.core.widget.AbstractC0422l
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10496g;
    }

    public boolean getUseCompatPadding() {
        return this.f10502m;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo10525i(Rect rect) {
        if (!C1013s.m5737O(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m13124p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo10526j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m13124p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo10624y();
    }

    /* renamed from: l */
    public void mo10528l(AbstractC3145b bVar) {
        mo10529m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo10529m(AbstractC3145b bVar, boolean z) {
        getImpl().mo10621v(m13127u(bVar), z);
    }

    /* renamed from: n */
    public boolean mo10530n() {
        return getImpl().mo10622w();
    }

    /* renamed from: o */
    public boolean mo10531o() {
        return getImpl().mo10623x();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo10625z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo10582B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f10500k = (sizeDimension - this.f10501l) / 2;
        getImpl().mo10607b0();
        int min = Math.min(m13126r(sizeDimension, i), m13126r(sizeDimension, i2));
        Rect rect = this.f10503n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1389a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1389a aVar = (C1389a) parcelable;
        super.onRestoreInstanceState(aVar.mo5608b());
        Bundle bundle = (Bundle) C0961i.m5494c(aVar.f5675d.get("expandableWidgetHelper"));
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C1389a(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo10525i(this.f10504o) || this.f10504o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo10538s(AbstractC3145b bVar) {
        mo10571t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10493d != colorStateList) {
            this.f10493d = colorStateList;
            getImpl().mo10590J(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f10494e != mode) {
            this.f10494e = mode;
            getImpl().mo10591K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo10592L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo10595O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo10597Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f10499j) {
            this.f10499j = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo10608c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo10614n()) {
            getImpl().mo10593M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C1408h hVar) {
        getImpl().mo10594N(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1408h.m7013c(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo10606a0();
            if (this.f10495f != null) {
                m13125q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f10505p.mo1605g(i);
        m13125q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f10497h != colorStateList) {
            this.f10497h = colorStateList;
            getImpl().mo10598R(this.f10497h);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo10587G();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo10587G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo10599S(z);
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        getImpl().mo10600T(kVar);
    }

    public void setShowMotionSpec(C1408h hVar) {
        getImpl().mo10601U(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1408h.m7013c(getContext(), i));
    }

    public void setSize(int i) {
        this.f10499j = 0;
        if (i != this.f10498i) {
            this.f10498i = i;
            requestLayout();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.AbstractC0422l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f10495f != colorStateList) {
            this.f10495f = colorStateList;
            m13125q();
        }
    }

    @Override // androidx.core.widget.AbstractC0422l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f10496g != mode) {
            this.f10496g = mode;
            m13125q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo10588H();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo10588H();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo10588H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f10502m != z) {
            this.f10502m = z;
            getImpl().mo10581A();
        }
    }

    @Override // com.google.android.material.internal.C3208q
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo10571t(AbstractC3145b bVar, boolean z) {
        getImpl().mo10604Y(m13127u(bVar), z);
    }
}
