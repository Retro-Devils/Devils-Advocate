package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1025t;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.z0 */
public class View$OnLongClickListenerC0308z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private static View$OnLongClickListenerC0308z0 f1300b;

    /* renamed from: c */
    private static View$OnLongClickListenerC0308z0 f1301c;

    /* renamed from: d */
    private final View f1302d;

    /* renamed from: e */
    private final CharSequence f1303e;

    /* renamed from: f */
    private final int f1304f;

    /* renamed from: g */
    private final Runnable f1305g = new RunnableC0309a();

    /* renamed from: h */
    private final Runnable f1306h = new RunnableC0310b();

    /* renamed from: i */
    private int f1307i;

    /* renamed from: j */
    private int f1308j;

    /* renamed from: k */
    private C0199a1 f1309k;

    /* renamed from: l */
    private boolean f1310l;

    /* renamed from: androidx.appcompat.widget.z0$a */
    class RunnableC0309a implements Runnable {
        RunnableC0309a() {
        }

        public void run() {
            View$OnLongClickListenerC0308z0.this.mo1912g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$b */
    class RunnableC0310b implements Runnable {
        RunnableC0310b() {
        }

        public void run() {
            View$OnLongClickListenerC0308z0.this.mo1911c();
        }
    }

    private View$OnLongClickListenerC0308z0(View view, CharSequence charSequence) {
        this.f1302d = view;
        this.f1303e = charSequence;
        this.f1304f = C1025t.m5842c(ViewConfiguration.get(view.getContext()));
        m1563b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1562a() {
        this.f1302d.removeCallbacks(this.f1305g);
    }

    /* renamed from: b */
    private void m1563b() {
        this.f1307i = Integer.MAX_VALUE;
        this.f1308j = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1564d() {
        this.f1302d.postDelayed(this.f1305g, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m1565e(View$OnLongClickListenerC0308z0 z0Var) {
        View$OnLongClickListenerC0308z0 z0Var2 = f1300b;
        if (z0Var2 != null) {
            z0Var2.m1562a();
        }
        f1300b = z0Var;
        if (z0Var != null) {
            z0Var.m1564d();
        }
    }

    /* renamed from: f */
    public static void m1566f(View view, CharSequence charSequence) {
        View$OnLongClickListenerC0308z0 z0Var = f1300b;
        if (z0Var != null && z0Var.f1302d == view) {
            m1565e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC0308z0 z0Var2 = f1301c;
            if (z0Var2 != null && z0Var2.f1302d == view) {
                z0Var2.mo1911c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC0308z0(view, charSequence);
    }

    /* renamed from: h */
    private boolean m1567h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1307i) <= this.f1304f && Math.abs(y - this.f1308j) <= this.f1304f) {
            return false;
        }
        this.f1307i = x;
        this.f1308j = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1911c() {
        if (f1301c == this) {
            f1301c = null;
            C0199a1 a1Var = this.f1309k;
            if (a1Var != null) {
                a1Var.mo1309c();
                this.f1309k = null;
                m1563b();
                this.f1302d.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1300b == this) {
            m1565e(null);
        }
        this.f1302d.removeCallbacks(this.f1306h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1912g(boolean z) {
        long j;
        if (C1013s.m5736N(this.f1302d)) {
            m1565e(null);
            View$OnLongClickListenerC0308z0 z0Var = f1301c;
            if (z0Var != null) {
                z0Var.mo1911c();
            }
            f1301c = this;
            this.f1310l = z;
            C0199a1 a1Var = new C0199a1(this.f1302d.getContext());
            this.f1309k = a1Var;
            a1Var.mo1311e(this.f1302d, this.f1307i, this.f1308j, this.f1310l, this.f1303e);
            this.f1302d.addOnAttachStateChangeListener(this);
            if (this.f1310l) {
                j = 2500;
            } else {
                j = ((C1013s.m5730H(this.f1302d) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1302d.removeCallbacks(this.f1306h);
            this.f1302d.postDelayed(this.f1306h, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1309k != null && this.f1310l) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1302d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1563b();
                mo1911c();
            }
        } else if (this.f1302d.isEnabled() && this.f1309k == null && m1567h(motionEvent)) {
            m1565e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1307i = view.getWidth() / 2;
        this.f1308j = view.getHeight() / 2;
        mo1912g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1911c();
    }
}
