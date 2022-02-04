package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0150p;

/* renamed from: androidx.appcompat.widget.g0 */
public abstract class AbstractView$OnTouchListenerC0226g0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final float f1002b;

    /* renamed from: c */
    private final int f1003c;

    /* renamed from: d */
    private final int f1004d;

    /* renamed from: e */
    final View f1005e;

    /* renamed from: f */
    private Runnable f1006f;

    /* renamed from: g */
    private Runnable f1007g;

    /* renamed from: h */
    private boolean f1008h;

    /* renamed from: i */
    private int f1009i;

    /* renamed from: j */
    private final int[] f1010j = new int[2];

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$a */
    public class RunnableC0227a implements Runnable {
        RunnableC0227a() {
        }

        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0226g0.this.f1005e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$b */
    public class RunnableC0228b implements Runnable {
        RunnableC0228b() {
        }

        public void run() {
            AbstractView$OnTouchListenerC0226g0.this.mo1447e();
        }
    }

    public AbstractView$OnTouchListenerC0226g0(View view) {
        this.f1005e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1002b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1003c = tapTimeout;
        this.f1004d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1166a() {
        Runnable runnable = this.f1007g;
        if (runnable != null) {
            this.f1005e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1006f;
        if (runnable2 != null) {
            this.f1005e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1167f(MotionEvent motionEvent) {
        C0219e0 e0Var;
        View view = this.f1005e;
        AbstractC0150p b = mo466b();
        if (b == null || !b.mo566c() || (e0Var = (C0219e0) b.mo571l()) == null || !e0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1170i(view, obtainNoHistory);
        m1171j(e0Var, obtainNoHistory);
        boolean e = e0Var.mo1395e(obtainNoHistory, this.f1009i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1168g(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0.m1168g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1169h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m1170i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1010j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1171j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1010j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract AbstractC0150p mo466b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo467c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1334d() {
        AbstractC0150p b = mo466b();
        if (b == null || !b.mo566c()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1447e() {
        m1166a();
        View view = this.f1005e;
        if (view.isEnabled() && !view.isLongClickable() && mo467c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1008h = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1008h;
        if (z2) {
            z = m1167f(motionEvent) || !mo1334d();
        } else {
            z = m1168g(motionEvent) && mo467c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1005e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1008h = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1008h = false;
        this.f1009i = -1;
        Runnable runnable = this.f1006f;
        if (runnable != null) {
            this.f1005e.removeCallbacks(runnable);
        }
    }
}
