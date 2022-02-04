package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.AbstractC0145m;
import p006b.p007a.C0754a;
import p006b.p007a.C0759f;
import p006b.p030g.p039k.AbstractC1006l;
import p006b.p030g.p039k.AbstractC1007m;
import p006b.p030g.p039k.AbstractC1008n;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1009o;
import p006b.p030g.p039k.C1013s;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements AbstractC0201b0, AbstractC1008n, AbstractC1006l, AbstractC1007m {

    /* renamed from: b */
    static final int[] f674b = {C0754a.actionBarSize, 16842841};

    /* renamed from: A */
    private AbstractC0160d f675A;

    /* renamed from: B */
    private OverScroller f676B;

    /* renamed from: C */
    ViewPropertyAnimator f677C;

    /* renamed from: D */
    final AnimatorListenerAdapter f678D;

    /* renamed from: E */
    private final Runnable f679E;

    /* renamed from: F */
    private final Runnable f680F;

    /* renamed from: G */
    private final C1009o f681G;

    /* renamed from: c */
    private int f682c;

    /* renamed from: d */
    private int f683d = 0;

    /* renamed from: e */
    private ContentFrameLayout f684e;

    /* renamed from: f */
    ActionBarContainer f685f;

    /* renamed from: g */
    private AbstractC0213c0 f686g;

    /* renamed from: h */
    private Drawable f687h;

    /* renamed from: i */
    private boolean f688i;

    /* renamed from: j */
    private boolean f689j;

    /* renamed from: k */
    private boolean f690k;

    /* renamed from: l */
    private boolean f691l;

    /* renamed from: m */
    boolean f692m;

    /* renamed from: n */
    private int f693n;

    /* renamed from: o */
    private int f694o;

    /* renamed from: p */
    private final Rect f695p = new Rect();

    /* renamed from: q */
    private final Rect f696q = new Rect();

    /* renamed from: r */
    private final Rect f697r = new Rect();

    /* renamed from: s */
    private final Rect f698s = new Rect();

    /* renamed from: t */
    private final Rect f699t = new Rect();

    /* renamed from: u */
    private final Rect f700u = new Rect();

    /* renamed from: v */
    private final Rect f701v = new Rect();

    /* renamed from: w */
    private C0964a0 f702w;

    /* renamed from: x */
    private C0964a0 f703x;

    /* renamed from: y */
    private C0964a0 f704y;

    /* renamed from: z */
    private C0964a0 f705z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0157a extends AnimatorListenerAdapter {
        C0157a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f677C = null;
            actionBarOverlayLayout.f692m = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f677C = null;
            actionBarOverlayLayout.f692m = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class RunnableC0158b implements Runnable {
        RunnableC0158b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo981u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f677C = actionBarOverlayLayout.f685f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f678D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class RunnableC0159c implements Runnable {
        RunnableC0159c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo981u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f677C = actionBarOverlayLayout.f685f.animate().translationY((float) (-ActionBarOverlayLayout.this.f685f.getHeight())).setListener(ActionBarOverlayLayout.this.f678D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface AbstractC0160d {
        /* renamed from: a */
        void mo423a(boolean z);

        /* renamed from: b */
        void mo424b();

        /* renamed from: c */
        void mo425c();

        /* renamed from: d */
        void mo426d(int i);

        /* renamed from: e */
        void mo427e();

        /* renamed from: f */
        void mo428f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0161e extends ViewGroup.MarginLayoutParams {
        public C0161e(int i, int i2) {
            super(i, i2);
        }

        public C0161e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0161e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0964a0 a0Var = C0964a0.f4667a;
        this.f702w = a0Var;
        this.f703x = a0Var;
        this.f704y = a0Var;
        this.f705z = a0Var;
        this.f678D = new C0157a();
        this.f679E = new RunnableC0158b();
        this.f680F = new RunnableC0159c();
        m844v(context);
        this.f681G = new C1009o(this);
    }

    /* renamed from: A */
    private void m839A() {
        mo981u();
        this.f679E.run();
    }

    /* renamed from: B */
    private boolean m840B(float f) {
        this.f676B.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f676B.getFinalY() > this.f685f.getHeight();
    }

    /* renamed from: p */
    private void m841p() {
        mo981u();
        this.f680F.run();
    }

    /* renamed from: q */
    private boolean m842q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0161e eVar = (C0161e) view.getLayoutParams();
        if (!z || ((ViewGroup.MarginLayoutParams) eVar).leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i4;
            z5 = true;
        }
        if (z2 && ((ViewGroup.MarginLayoutParams) eVar).topMargin != (i3 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i3;
            z5 = true;
        }
        if (z4 && ((ViewGroup.MarginLayoutParams) eVar).rightMargin != (i2 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i2;
            z5 = true;
        }
        if (!z3 || ((ViewGroup.MarginLayoutParams) eVar).bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private AbstractC0213c0 m843t(View view) {
        if (view instanceof AbstractC0213c0) {
            return (AbstractC0213c0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m844v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f674b);
        boolean z = false;
        this.f682c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f687h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f688i = z;
        this.f676B = new OverScroller(context);
    }

    /* renamed from: x */
    private void m845x() {
        mo981u();
        postDelayed(this.f680F, 600);
    }

    /* renamed from: y */
    private void m846y() {
        mo981u();
        postDelayed(this.f679E, 600);
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: a */
    public void mo928a(Menu menu, AbstractC0145m.AbstractC0146a aVar) {
        mo983z();
        this.f686g.mo1341a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: b */
    public boolean mo929b() {
        mo983z();
        return this.f686g.mo1342b();
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: c */
    public boolean mo930c() {
        mo983z();
        return this.f686g.mo1343c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0161e;
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: d */
    public boolean mo932d() {
        mo983z();
        return this.f686g.mo1345d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f687h != null && !this.f688i) {
            int bottom = this.f685f.getVisibility() == 0 ? (int) (((float) this.f685f.getBottom()) + this.f685f.getTranslationY() + 0.5f) : 0;
            this.f687h.setBounds(0, bottom, getWidth(), this.f687h.getIntrinsicHeight() + bottom);
            this.f687h.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: e */
    public boolean mo934e() {
        mo983z();
        return this.f686g.mo1346e();
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: f */
    public void mo935f() {
        mo983z();
        this.f686g.mo1347f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo983z();
        boolean q = m842q(this.f685f, rect, true, true, false, true);
        this.f698s.set(rect);
        C0214c1.m1131a(this, this.f698s, this.f695p);
        if (!this.f699t.equals(this.f698s)) {
            this.f699t.set(this.f698s);
            q = true;
        }
        if (!this.f696q.equals(this.f695p)) {
            this.f696q.set(this.f695p);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: g */
    public boolean mo937g() {
        mo983z();
        return this.f686g.mo1348g();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0161e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f685f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f681G.mo5548a();
    }

    public CharSequence getTitle() {
        mo983z();
        return this.f686g.getTitle();
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: h */
    public void mo944h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: i */
    public void mo945i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: j */
    public void mo946j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: k */
    public void mo947k(int i) {
        mo983z();
        if (i == 2) {
            this.f686g.mo1366t();
        } else if (i == 5) {
            this.f686g.mo1368v();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    /* renamed from: l */
    public void mo948l() {
        mo983z();
        this.f686g.mo1350h();
    }

    @Override // p006b.p030g.p039k.AbstractC1007m
    /* renamed from: m */
    public void mo949m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo950n(view, i, i2, i3, i4, i5);
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: n */
    public void mo950n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: o */
    public boolean mo951o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo983z();
        C0964a0 p = C0964a0.m5510p(windowInsets);
        boolean q = m842q(this.f685f, new Rect(p.mo5416f(), p.mo5418h(), p.mo5417g(), p.mo5414e()), true, true, false, true);
        C1013s.m5759f(this, p, this.f695p);
        Rect rect = this.f695p;
        C0964a0 k = p.mo5422k(rect.left, rect.top, rect.right, rect.bottom);
        this.f702w = k;
        boolean z = true;
        if (!this.f703x.equals(k)) {
            this.f703x = this.f702w;
            q = true;
        }
        if (!this.f696q.equals(this.f695p)) {
            this.f696q.set(this.f695p);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return p.mo5410a().mo5412c().mo5411b().mo5425o();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m844v(getContext());
        C1013s.m5760f0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo981u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0161e eVar = (C0161e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f691l || !z) {
            return false;
        }
        if (m840B(f2)) {
            m841p();
        } else {
            m839A();
        }
        this.f692m = true;
        return true;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f693n + i2;
        this.f693n = i5;
        setActionBarHideOffset(i5);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f681G.mo5549b(view, view2, i);
        this.f693n = getActionBarHideOffset();
        mo981u();
        AbstractC0160d dVar = this.f675A;
        if (dVar != null) {
            dVar.mo425c();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f685f.getVisibility() != 0) {
            return false;
        }
        return this.f691l;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onStopNestedScroll(View view) {
        if (this.f691l && !this.f692m) {
            if (this.f693n <= this.f685f.getHeight()) {
                m846y();
            } else {
                m845x();
            }
        }
        AbstractC0160d dVar = this.f675A;
        if (dVar != null) {
            dVar.mo428f();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo983z();
        int i2 = this.f694o ^ i;
        this.f694o = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        AbstractC0160d dVar = this.f675A;
        if (dVar != null) {
            dVar.mo423a(!z);
            if (z2 || !z) {
                this.f675A.mo424b();
            } else {
                this.f675A.mo427e();
            }
        }
        if ((i2 & 256) != 0 && this.f675A != null) {
            C1013s.m5760f0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f683d = i;
        AbstractC0160d dVar = this.f675A;
        if (dVar != null) {
            dVar.mo426d(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0161e generateDefaultLayoutParams() {
        return new C0161e(-1, -1);
    }

    /* renamed from: s */
    public C0161e generateLayoutParams(AttributeSet attributeSet) {
        return new C0161e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo981u();
        this.f685f.setTranslationY((float) (-Math.max(0, Math.min(i, this.f685f.getHeight()))));
    }

    public void setActionBarVisibilityCallback(AbstractC0160d dVar) {
        this.f675A = dVar;
        if (getWindowToken() != null) {
            this.f675A.mo426d(this.f683d);
            int i = this.f694o;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1013s.m5760f0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f690k = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f691l) {
            this.f691l = z;
            if (!z) {
                mo981u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo983z();
        this.f686g.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo983z();
        this.f686g.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo983z();
        this.f686g.mo1355m(i);
    }

    public void setOverlayMode(boolean z) {
        this.f689j = z;
        this.f688i = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    public void setWindowCallback(Window.Callback callback) {
        mo983z();
        this.f686g.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.AbstractC0201b0
    public void setWindowTitle(CharSequence charSequence) {
        mo983z();
        this.f686g.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo981u() {
        removeCallbacks(this.f679E);
        removeCallbacks(this.f680F);
        ViewPropertyAnimator viewPropertyAnimator = this.f677C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo982w() {
        return this.f689j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo983z() {
        if (this.f684e == null) {
            this.f684e = (ContentFrameLayout) findViewById(C0759f.action_bar_activity_content);
            this.f685f = (ActionBarContainer) findViewById(C0759f.action_bar_container);
            this.f686g = m843t(findViewById(C0759f.action_bar));
        }
    }
}
