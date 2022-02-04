package p006b.p030g.p039k;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.g.k.q */
public final class ViewTreeObserver$OnPreDrawListenerC1011q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f4750b;

    /* renamed from: c */
    private ViewTreeObserver f4751c;

    /* renamed from: d */
    private final Runnable f4752d;

    private ViewTreeObserver$OnPreDrawListenerC1011q(View view, Runnable runnable) {
        this.f4750b = view;
        this.f4751c = view.getViewTreeObserver();
        this.f4752d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC1011q m5720a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            ViewTreeObserver$OnPreDrawListenerC1011q qVar = new ViewTreeObserver$OnPreDrawListenerC1011q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(qVar);
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo5552b() {
        (this.f4751c.isAlive() ? this.f4751c : this.f4750b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f4750b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo5552b();
        this.f4752d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f4751c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo5552b();
    }
}
