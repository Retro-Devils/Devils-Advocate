package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p006b.p030g.p039k.AbstractC1004j;
import p006b.p030g.p039k.AbstractC1007m;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1005k;
import p006b.p030g.p039k.C1009o;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p030g.p039k.p040b0.C0986e;

public class NestedScrollView extends FrameLayout implements AbstractC1007m, AbstractC1004j {

    /* renamed from: b */
    private static final C0404a f2111b = new C0404a();

    /* renamed from: c */
    private static final int[] f2112c = {16843130};

    /* renamed from: A */
    private final C1005k f2113A;

    /* renamed from: B */
    private float f2114B;

    /* renamed from: C */
    private AbstractC0405b f2115C;

    /* renamed from: d */
    private long f2116d;

    /* renamed from: e */
    private final Rect f2117e;

    /* renamed from: f */
    private OverScroller f2118f;

    /* renamed from: g */
    private EdgeEffect f2119g;

    /* renamed from: h */
    private EdgeEffect f2120h;

    /* renamed from: i */
    private int f2121i;

    /* renamed from: j */
    private boolean f2122j;

    /* renamed from: k */
    private boolean f2123k;

    /* renamed from: l */
    private View f2124l;

    /* renamed from: m */
    private boolean f2125m;

    /* renamed from: n */
    private VelocityTracker f2126n;

    /* renamed from: o */
    private boolean f2127o;

    /* renamed from: p */
    private boolean f2128p;

    /* renamed from: q */
    private int f2129q;

    /* renamed from: r */
    private int f2130r;

    /* renamed from: s */
    private int f2131s;

    /* renamed from: t */
    private int f2132t;

    /* renamed from: u */
    private final int[] f2133u;

    /* renamed from: v */
    private final int[] f2134v;

    /* renamed from: w */
    private int f2135w;

    /* renamed from: x */
    private int f2136x;

    /* renamed from: y */
    private C0406c f2137y;

    /* renamed from: z */
    private final C1009o f2138z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0404a extends C0962a {
        C0404a() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: f */
        public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2361f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0986e.m5662a(accessibilityEvent, nestedScrollView.getScrollX());
            C0986e.m5663b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            int scrollRange;
            super.mo2362g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo5470a0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo5503t0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo5471b(C0979c.C0980a.f4714n);
                    cVar.mo5471b(C0979c.C0980a.f4725y);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo5471b(C0979c.C0980a.f4713m);
                    cVar.mo5471b(C0979c.C0980a.f4690A);
                }
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: j */
        public boolean mo2363j(View view, int i, Bundle bundle) {
            if (super.mo2363j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2300O(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2300O(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface AbstractC0405b {
        /* renamed from: a */
        void mo177a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0406c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0406c> CREATOR = new C0407a();

        /* renamed from: b */
        public int f2139b;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        class C0407a implements Parcelable.Creator<C0406c> {
            C0407a() {
            }

            /* renamed from: a */
            public C0406c createFromParcel(Parcel parcel) {
                return new C0406c(parcel);
            }

            /* renamed from: b */
            public C0406c[] newArray(int i) {
                return new C0406c[i];
            }
        }

        C0406c(Parcel parcel) {
            super(parcel);
            this.f2139b = parcel.readInt();
        }

        C0406c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2139b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2139b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2117e = new Rect();
        this.f2122j = true;
        this.f2123k = false;
        this.f2124l = null;
        this.f2125m = false;
        this.f2128p = true;
        this.f2132t = -1;
        this.f2133u = new int[2];
        this.f2134v = new int[2];
        m2012x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2112c, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2138z = new C1009o(this);
        this.f2113A = new C1005k(this);
        setNestedScrollingEnabled(true);
        C1013s.m5766i0(this, f2111b);
    }

    /* renamed from: A */
    private static boolean m1993A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m1993A((View) parent, view2);
    }

    /* renamed from: B */
    private boolean m1994B(View view, int i, int i2) {
        view.getDrawingRect(this.f2117e);
        offsetDescendantRectToMyCoords(view, this.f2117e);
        return this.f2117e.bottom + i >= getScrollY() && this.f2117e.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m1995C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2113A.mo5538e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: D */
    private void m1996D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2132t) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2121i = (int) motionEvent.getY(i);
            this.f2132t = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2126n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m1997G() {
        VelocityTracker velocityTracker = this.f2126n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2126n = null;
        }
    }

    /* renamed from: H */
    private void m1998H(boolean z) {
        if (z) {
            mo2301P(2, 1);
        } else {
            mo2302Q(1);
        }
        this.f2136x = getScrollY();
        C1013s.m5748Z(this);
    }

    /* renamed from: I */
    private boolean m1999I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View r = m2009r(z2, i2, i3);
        if (r == null) {
            r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2006k(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m2000J(View view) {
        view.getDrawingRect(this.f2117e);
        offsetDescendantRectToMyCoords(view, this.f2117e);
        int e = mo2321e(this.f2117e);
        if (e != 0) {
            scrollBy(0, e);
        }
    }

    /* renamed from: K */
    private boolean m2001K(Rect rect, boolean z) {
        int e = mo2321e(rect);
        boolean z2 = e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e);
            } else {
                mo2298L(0, e);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m2002M(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2116d > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2118f;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m1998H(z);
            } else {
                if (!this.f2118f.isFinished()) {
                    m2003a();
                }
                scrollBy(i, i2);
            }
            this.f2116d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m2003a() {
        this.f2118f.abortAnimation();
        mo2302Q(1);
    }

    /* renamed from: c */
    private boolean m2004c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: d */
    private static int m2005d(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2114B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2114B = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2114B;
    }

    /* renamed from: k */
    private void m2006k(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2128p) {
            mo2298L(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: l */
    private void m2007l() {
        this.f2125m = false;
        m1997G();
        mo2302Q(0);
        EdgeEffect edgeEffect = this.f2119g;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2120h.onRelease();
        }
    }

    /* renamed from: p */
    private void m2008p() {
        if (getOverScrollMode() == 2) {
            this.f2119g = null;
            this.f2120h = null;
        } else if (this.f2119g == null) {
            Context context = getContext();
            this.f2119g = new EdgeEffect(context);
            this.f2120h = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m2009r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m2010v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: w */
    private void m2011w() {
        VelocityTracker velocityTracker = this.f2126n;
        if (velocityTracker == null) {
            this.f2126n = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m2012x() {
        this.f2118f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2129q = viewConfiguration.getScaledTouchSlop();
        this.f2130r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2131s = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m2013y() {
        if (this.f2126n == null) {
            this.f2126n = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m2014z(View view) {
        return !m1994B(view, 0, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2296E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2296E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean mo2297F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2117e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2117e;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2117e.top = getScrollY() - height;
            Rect rect2 = this.f2117e;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2117e;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m1999I(i, i2, i3);
    }

    /* renamed from: L */
    public final void mo2298L(int i, int i2) {
        m2002M(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo2299N(int i, int i2, int i3, boolean z) {
        m2002M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo2300O(int i, int i2, boolean z) {
        mo2299N(i, i2, 250, z);
    }

    /* renamed from: P */
    public boolean mo2301P(int i, int i2) {
        return this.f2113A.mo5545p(i, i2);
    }

    /* renamed from: Q */
    public void mo2302Q(int i) {
        this.f2113A.mo5547r(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo2307b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1994B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2006k(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2117e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2117e);
            m2006k(mo2321e(this.f2117e));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2014z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f2118f.isFinished()) {
            this.f2118f.computeScrollOffset();
            int currY = this.f2118f.getCurrY();
            int i = currY - this.f2136x;
            this.f2136x = currY;
            int[] iArr = this.f2134v;
            boolean z = false;
            iArr[1] = 0;
            mo2322f(0, i, iArr, null, 1);
            int i2 = i - this.f2134v[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2296E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2134v;
                iArr2[1] = 0;
                mo2323g(0, scrollY2, 0, i3, this.f2133u, 1, iArr2);
                i2 = i3 - this.f2134v[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m2008p();
                    if (i2 < 0) {
                        if (this.f2119g.isFinished()) {
                            edgeEffect = this.f2119g;
                        }
                    } else if (this.f2120h.isFinished()) {
                        edgeEffect = this.f2120h;
                    }
                    edgeEffect.onAbsorb((int) this.f2118f.getCurrVelocity());
                }
                m2003a();
            }
            if (!this.f2118f.isFinished()) {
                C1013s.m5748Z(this);
            } else {
                mo2302Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2345q(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2113A.mo5534a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2113A.mo5535b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2322f(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2113A.mo5539f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2119g != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2119g.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2119g.setSize(width, height);
                if (this.f2119g.draw(canvas)) {
                    C1013s.m5748Z(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2120h.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2120h.setSize(width2, height2);
                if (this.f2120h.draw(canvas)) {
                    C1013s.m5748Z(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo2321e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: f */
    public boolean mo2322f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2113A.mo5537d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: g */
    public void mo2323g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2113A.mo5538e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2138z.mo5548a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: h */
    public void mo944h(View view, View view2, int i, int i2) {
        this.f2138z.mo5550c(view, view2, i, i2);
        mo2301P(2, i2);
    }

    public boolean hasNestedScrollingParent() {
        return mo2360u(0);
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: i */
    public void mo945i(View view, int i) {
        this.f2138z.mo5551d(view, i);
        mo2302Q(i);
    }

    @Override // p006b.p030g.p039k.AbstractC1004j
    public boolean isNestedScrollingEnabled() {
        return this.f2113A.mo5542l();
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: j */
    public void mo946j(View view, int i, int i2, int[] iArr, int i3) {
        mo2322f(i, i2, iArr, null, i3);
    }

    @Override // p006b.p030g.p039k.AbstractC1007m
    /* renamed from: m */
    public void mo949m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1995C(i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: n */
    public void mo950n(View view, int i, int i2, int i3, int i4, int i5) {
        m1995C(i4, i5, null);
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: o */
    public boolean mo951o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2123k = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2125m) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2125m) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2132t;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2121i) > this.f2129q && (2 & getNestedScrollAxes()) == 0) {
                                this.f2125m = true;
                                this.f2121i = y;
                                m2013y();
                                this.f2126n.addMovement(motionEvent);
                                this.f2135w = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1996D(motionEvent);
                    }
                }
            }
            this.f2125m = false;
            this.f2132t = -1;
            m1997G();
            if (this.f2118f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C1013s.m5748Z(this);
            }
            mo2302Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m2010v((int) motionEvent.getX(), y2)) {
                this.f2125m = false;
                m1997G();
            } else {
                this.f2121i = y2;
                this.f2132t = motionEvent.getPointerId(0);
                m2011w();
                this.f2126n.addMovement(motionEvent);
                this.f2118f.computeScrollOffset();
                this.f2125m = !this.f2118f.isFinished();
                mo2301P(2, 0);
            }
        }
        return this.f2125m;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2122j = false;
        View view = this.f2124l;
        if (view != null && m1993A(view, this)) {
            m2000J(this.f2124l);
        }
        this.f2124l = null;
        if (!this.f2123k) {
            if (this.f2137y != null) {
                scrollTo(getScrollX(), this.f2137y.f2139b);
                this.f2137y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d = m2005d(scrollY, paddingTop, i5);
            if (d != scrollY) {
                scrollTo(getScrollX(), d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2123k = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2127o && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2350s((int) f2);
        return true;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo946j(view, i, i2, iArr, 0);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1995C(i4, 0, null);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo944h(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m2014z(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0406c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0406c cVar = (C0406c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f2137y = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0406c cVar = new C0406c(super.onSaveInstanceState());
        cVar.f2139b = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC0405b bVar = this.f2115C;
        if (bVar != null) {
            bVar.mo177a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1994B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2117e);
            offsetDescendantRectToMyCoords(findFocus, this.f2117e);
            m2006k(mo2321e(this.f2117e));
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo951o(view, view2, i, 0);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onStopNestedScroll(View view) {
        mo945i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r23.f2118f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0210, code lost:
        if (r23.f2118f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
        // Method dump skipped, instructions count: 597
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean mo2345q(KeyEvent keyEvent) {
        this.f2117e.setEmpty();
        int i = 130;
        if (!m2004c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo2307b(33) : mo2359t(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo2307b(130) : mo2359t(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo2297F(i);
            return false;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2122j) {
            m2000J(view2);
        } else {
            this.f2124l = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2001K(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1997G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2122j = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void mo2350s(int i) {
        if (getChildCount() > 0) {
            this.f2118f.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1998H(true);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d = m2005d(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d2 = m2005d(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d != getScrollX() || d2 != getScrollY()) {
                super.scrollTo(d, d2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2127o) {
            this.f2127o = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2113A.mo5543m(z);
    }

    public void setOnScrollChangeListener(AbstractC0405b bVar) {
        this.f2115C = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2128p = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2301P(i, 0);
    }

    @Override // p006b.p030g.p039k.AbstractC1004j
    public void stopNestedScroll() {
        mo2302Q(0);
    }

    /* renamed from: t */
    public boolean mo2359t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2117e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2117e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2117e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2117e;
        return m1999I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean mo2360u(int i) {
        return this.f2113A.mo5541k(i);
    }
}
