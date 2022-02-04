package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p006b.p030g.p039k.C1013s;

/* renamed from: com.google.android.material.appbar.a */
abstract class AbstractC3056a<V extends View> extends C3059c<V> {

    /* renamed from: d */
    private Runnable f10098d;

    /* renamed from: e */
    OverScroller f10099e;

    /* renamed from: f */
    private boolean f10100f;

    /* renamed from: g */
    private int f10101g = -1;

    /* renamed from: h */
    private int f10102h;

    /* renamed from: i */
    private int f10103i = -1;

    /* renamed from: j */
    private VelocityTracker f10104j;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    public class RunnableC3057a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f10105b;

        /* renamed from: c */
        private final V f10106c;

        RunnableC3057a(CoordinatorLayout coordinatorLayout, V v) {
            this.f10105b = coordinatorLayout;
            this.f10106c = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.google.android.material.appbar.a */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.google.android.material.appbar.a */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f10106c != null && (overScroller = AbstractC3056a.this.f10099e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractC3056a aVar = AbstractC3056a.this;
                    aVar.mo9902P(this.f10105b, this.f10106c, aVar.f10099e.getCurrY());
                    C1013s.m5750a0(this.f10106c, this);
                    return;
                }
                AbstractC3056a.this.mo9865N(this.f10105b, this.f10106c);
            }
        }
    }

    public AbstractC3056a() {
    }

    public AbstractC3056a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: I */
    private void m12548I() {
        if (this.f10104j == null) {
            this.f10104j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2086D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC3056a.mo2086D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract boolean mo9861H(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo9900J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f10098d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f10098d = null;
        }
        if (this.f10099e == null) {
            this.f10099e = new OverScroller(v.getContext());
        }
        this.f10099e.fling(0, mo9887E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f10099e.computeScrollOffset()) {
            RunnableC3057a aVar = new RunnableC3057a(coordinatorLayout, v);
            this.f10098d = aVar;
            C1013s.m5750a0(v, aVar);
            return true;
        }
        mo9865N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract int mo9862K(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public abstract int mo9863L(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public abstract int mo9864M();

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public abstract void mo9865N(CoordinatorLayout coordinatorLayout, V v);

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo9901O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo9866Q(coordinatorLayout, v, mo9864M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo9902P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo9866Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract int mo9866Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: k */
    public boolean mo2097k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f10103i < 0) {
            this.f10103i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f10100f) {
            int i = this.f10101g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f10102h) > this.f10103i) {
                this.f10102h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f10101g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo9861H(v) && coordinatorLayout.mo2031B(v, x, y2);
            this.f10100f = z;
            if (z) {
                this.f10102h = y2;
                this.f10101g = motionEvent.getPointerId(0);
                m12548I();
                OverScroller overScroller = this.f10099e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f10099e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f10104j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
