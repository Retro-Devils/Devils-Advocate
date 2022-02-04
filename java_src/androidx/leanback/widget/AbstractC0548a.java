package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0735m;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p053m.C1080l;

/* renamed from: androidx.leanback.widget.a */
public abstract class AbstractC0548a extends RecyclerView {

    /* renamed from: I0 */
    final C0562f f2793I0;

    /* renamed from: J0 */
    private boolean f2794J0 = true;

    /* renamed from: K0 */
    private boolean f2795K0 = true;

    /* renamed from: L0 */
    private RecyclerView.AbstractC0663l f2796L0;

    /* renamed from: M0 */
    private AbstractC0552d f2797M0;

    /* renamed from: N0 */
    private AbstractC0551c f2798N0;

    /* renamed from: O0 */
    private AbstractC0550b f2799O0;

    /* renamed from: P0 */
    RecyclerView.AbstractC0682w f2800P0;

    /* renamed from: Q0 */
    private AbstractC0553e f2801Q0;

    /* renamed from: R0 */
    int f2802R0 = 4;

    /* renamed from: androidx.leanback.widget.a$a */
    class C0549a implements RecyclerView.AbstractC0682w {
        C0549a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682w
        /* renamed from: a */
        public void mo3277a(RecyclerView.AbstractC0655d0 d0Var) {
            AbstractC0548a.this.f2793I0.mo3461o3(d0Var);
            RecyclerView.AbstractC0682w wVar = AbstractC0548a.this.f2800P0;
            if (wVar != null) {
                wVar.mo3277a(d0Var);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.a$b */
    public interface AbstractC0550b {
        /* renamed from: a */
        boolean mo3278a(KeyEvent keyEvent);
    }

    /* renamed from: androidx.leanback.widget.a$c */
    public interface AbstractC0551c {
        /* renamed from: a */
        boolean mo3279a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.leanback.widget.a$d */
    public interface AbstractC0552d {
        /* renamed from: a */
        boolean mo3280a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.leanback.widget.a$e */
    public interface AbstractC0553e {
        /* renamed from: a */
        boolean mo3281a(KeyEvent keyEvent);
    }

    AbstractC0548a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0562f fVar = new C0562f(this);
        this.f2793I0 = fVar;
        setLayoutManager(fVar);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((AbstractC0735m) getItemAnimator()).mo4476Q(false);
        super.setRecyclerListener(new C0549a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void mo3207A1(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4985w);
        this.f2793I0.mo3374J3(obtainStyledAttributes.getBoolean(C1080l.f4929B, false), obtainStyledAttributes.getBoolean(C1080l.f4928A, false));
        this.f2793I0.mo3377K3(obtainStyledAttributes.getBoolean(C1080l.f4931D, true), obtainStyledAttributes.getBoolean(C1080l.f4930C, true));
        this.f2793I0.mo3444h4(obtainStyledAttributes.getDimensionPixelSize(C1080l.f4988z, obtainStyledAttributes.getDimensionPixelSize(C1080l.f4933F, 0)));
        this.f2793I0.mo3382O3(obtainStyledAttributes.getDimensionPixelSize(C1080l.f4987y, obtainStyledAttributes.getDimensionPixelSize(C1080l.f4932E, 0)));
        int i = C1080l.f4986x;
        if (obtainStyledAttributes.hasValue(i)) {
            setGravity(obtainStyledAttributes.getInt(i, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public final boolean mo3208B1() {
        return isChildrenDrawingOrderEnabled();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        AbstractC0551c cVar = this.f2798N0;
        if (cVar == null || !cVar.mo3279a(motionEvent)) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0550b bVar = this.f2799O0;
        if ((bVar != null && bVar.mo3278a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC0553e eVar = this.f2801Q0;
        return eVar != null && eVar.mo3281a(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC0552d dVar = this.f2797M0;
        if (dVar == null || !dVar.mo3280a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public View focusSearch(int i) {
        if (isFocused()) {
            C0562f fVar = this.f2793I0;
            View F = fVar.mo3728F(fVar.mo3361E2());
            if (F != null) {
                return focusSearch(F, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getChildDrawingOrder(int i, int i2) {
        return this.f2793I0.mo3452l2(this, i, i2);
    }

    public int getExtraLayoutSpace() {
        return this.f2793I0.mo3460o2();
    }

    public int getFocusScrollStrategy() {
        return this.f2793I0.mo3467q2();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f2793I0.mo3471r2();
    }

    public int getHorizontalSpacing() {
        return this.f2793I0.mo3471r2();
    }

    public int getInitialPrefetchItemCount() {
        return this.f2802R0;
    }

    public int getItemAlignmentOffset() {
        return this.f2793I0.mo3472s2();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.f2793I0.mo3473t2();
    }

    public int getItemAlignmentViewId() {
        return this.f2793I0.mo3475u2();
    }

    public AbstractC0553e getOnUnhandledKeyListener() {
        return this.f2801Q0;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f2793I0.f2868i0.mo3629c();
    }

    public final int getSaveChildrenPolicy() {
        return this.f2793I0.f2868i0.mo3630d();
    }

    public int getSelectedPosition() {
        return this.f2793I0.mo3361E2();
    }

    public int getSelectedSubPosition() {
        return this.f2793I0.mo3371I2();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f2793I0.mo3376K2();
    }

    public int getVerticalSpacing() {
        return this.f2793I0.mo3376K2();
    }

    public int getWindowAlignment() {
        return this.f2793I0.mo3398T2();
    }

    public int getWindowAlignmentOffset() {
        return this.f2793I0.mo3401U2();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.f2793I0.mo3404V2();
    }

    public boolean hasOverlappingRendering() {
        return this.f2795K0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: k1 */
    public void mo3233k1(int i) {
        if (this.f2793I0.mo3441g3()) {
            this.f2793I0.mo3442g4(i, 0, 0);
        } else {
            super.mo3233k1(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f2793I0.mo3464p3(z, i, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        return this.f2793I0.mo3408W2(this, i, rect);
    }

    public void onRtlPropertiesChanged(int i) {
        this.f2793I0.mo3468q3(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: s1 */
    public void mo3237s1(int i) {
        if (this.f2793I0.mo3441g3()) {
            this.f2793I0.mo3442g4(i, 0, 0);
        } else {
            super.mo3237s1(i);
        }
    }

    public void setAnimateChildLayout(boolean z) {
        RecyclerView.AbstractC0663l lVar;
        if (this.f2794J0 != z) {
            this.f2794J0 = z;
            if (!z) {
                this.f2796L0 = getItemAnimator();
                lVar = null;
            } else {
                lVar = this.f2796L0;
            }
            super.setItemAnimator(lVar);
        }
    }

    public void setChildrenVisibility(int i) {
        this.f2793I0.mo3369H3(i);
    }

    public void setExtraLayoutSpace(int i) {
        this.f2793I0.mo3372I3(i);
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f2793I0.mo3379L3(i);
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid scrollStrategy");
    }

    public final void setFocusSearchDisabled(boolean z) {
        setDescendantFocusability(z ? 393216 : 262144);
        this.f2793I0.mo3380M3(z);
    }

    public void setGravity(int i) {
        this.f2793I0.mo3381N3(i);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.f2795K0 = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        this.f2793I0.mo3382O3(i);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.f2802R0 = i;
    }

    public void setItemAlignmentOffset(int i) {
        this.f2793I0.mo3384P3(i);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        this.f2793I0.mo3387Q3(f);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        this.f2793I0.mo3391R3(z);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        this.f2793I0.mo3394S3(i);
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        this.f2793I0.mo3399T3(i);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        this.f2793I0.mo3402U3(z);
    }

    public void setOnChildLaidOutListener(AbstractC0580m mVar) {
        this.f2793I0.mo3409W3(mVar);
    }

    public void setOnChildSelectedListener(AbstractC0581n nVar) {
        this.f2793I0.mo3412X3(nVar);
    }

    public void setOnChildViewHolderSelectedListener(AbstractC0582o oVar) {
        this.f2793I0.mo3416Y3(oVar);
    }

    public void setOnKeyInterceptListener(AbstractC0550b bVar) {
        this.f2799O0 = bVar;
    }

    public void setOnMotionInterceptListener(AbstractC0551c cVar) {
        this.f2798N0 = cVar;
    }

    public void setOnTouchInterceptListener(AbstractC0552d dVar) {
        this.f2797M0 = dVar;
    }

    public void setOnUnhandledKeyListener(AbstractC0553e eVar) {
        this.f2801Q0 = eVar;
    }

    public void setPruneChild(boolean z) {
        this.f2793I0.mo3423a4(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.AbstractC0682w wVar) {
        this.f2800P0 = wVar;
    }

    public final void setSaveChildrenLimitNumber(int i) {
        this.f2793I0.f2868i0.mo3638m(i);
    }

    public final void setSaveChildrenPolicy(int i) {
        this.f2793I0.f2868i0.mo3639n(i);
    }

    public void setScrollEnabled(boolean z) {
        this.f2793I0.mo3429c4(z);
    }

    public void setSelectedPosition(int i) {
        this.f2793I0.mo3432d4(i, 0);
    }

    public void setSelectedPositionSmooth(int i) {
        this.f2793I0.mo3439f4(i);
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        this.f2793I0.mo3444h4(i);
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        this.f2793I0.mo3446i4(i);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        this.f2793I0.mo3448j4(i);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        this.f2793I0.mo3450k4(f);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        this.f2793I0.f2863d0.mo3282a().mo3310u(z);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        this.f2793I0.f2863d0.mo3282a().mo3311v(z);
        requestLayout();
    }
}
