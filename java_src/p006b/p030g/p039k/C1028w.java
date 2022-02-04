package p006b.p030g.p039k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: b.g.k.w */
public final class C1028w {

    /* renamed from: a */
    private WeakReference<View> f4779a;

    /* renamed from: b */
    Runnable f4780b = null;

    /* renamed from: c */
    Runnable f4781c = null;

    /* renamed from: d */
    int f4782d = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.w$a */
    public class C1029a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC1032x f4783a;

        /* renamed from: b */
        final /* synthetic */ View f4784b;

        C1029a(AbstractC1032x xVar, View view) {
            this.f4783a = xVar;
            this.f4784b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4783a.mo1307c(this.f4784b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4783a.mo345a(this.f4784b);
        }

        public void onAnimationStart(Animator animator) {
            this.f4783a.mo346b(this.f4784b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.w$b */
    public class C1030b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC1034z f4786a;

        /* renamed from: b */
        final /* synthetic */ View f4787b;

        C1030b(AbstractC1034z zVar, View view) {
            this.f4786a = zVar;
            this.f4787b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4786a.mo431a(this.f4787b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.w$c */
    public static class C1031c implements AbstractC1032x {

        /* renamed from: a */
        C1028w f4789a;

        /* renamed from: b */
        boolean f4790b;

        C1031c(C1028w wVar) {
            this.f4789a = wVar;
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public void mo345a(View view) {
            int i = this.f4789a.f4782d;
            AbstractC1032x xVar = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f4789a.f4782d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f4790b) {
                C1028w wVar = this.f4789a;
                Runnable runnable = wVar.f4781c;
                if (runnable != null) {
                    wVar.f4781c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof AbstractC1032x) {
                    xVar = (AbstractC1032x) tag;
                }
                if (xVar != null) {
                    xVar.mo345a(view);
                }
                this.f4790b = true;
            }
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: b */
        public void mo346b(View view) {
            this.f4790b = false;
            AbstractC1032x xVar = null;
            if (this.f4789a.f4782d > -1) {
                view.setLayerType(2, null);
            }
            C1028w wVar = this.f4789a;
            Runnable runnable = wVar.f4780b;
            if (runnable != null) {
                wVar.f4780b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof AbstractC1032x) {
                xVar = (AbstractC1032x) tag;
            }
            if (xVar != null) {
                xVar.mo346b(view);
            }
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: c */
        public void mo1307c(View view) {
            Object tag = view.getTag(2113929216);
            AbstractC1032x xVar = tag instanceof AbstractC1032x ? (AbstractC1032x) tag : null;
            if (xVar != null) {
                xVar.mo1307c(view);
            }
        }
    }

    C1028w(View view) {
        this.f4779a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m5854g(View view, AbstractC1032x xVar) {
        if (xVar != null) {
            view.animate().setListener(new C1029a(xVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C1028w mo5578a(float f) {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo5579b() {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long mo5580c() {
        View view = this.f4779a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public C1028w mo5581d(long j) {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C1028w mo5582e(Interpolator interpolator) {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C1028w mo5583f(AbstractC1032x xVar) {
        View view = this.f4779a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, xVar);
                xVar = new C1031c(this);
            }
            m5854g(view, xVar);
        }
        return this;
    }

    /* renamed from: h */
    public C1028w mo5584h(long j) {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C1028w mo5585i(AbstractC1034z zVar) {
        View view = this.f4779a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C1030b bVar = null;
            if (zVar != null) {
                bVar = new C1030b(zVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: j */
    public void mo5586j() {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C1028w mo5587k(float f) {
        View view = this.f4779a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
