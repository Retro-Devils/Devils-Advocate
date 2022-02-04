package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0398a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C3202o;
import com.google.android.material.internal.C3203p;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C3240b;
import com.google.android.material.theme.p148a.C3288a;
import java.util.List;
import p006b.p030g.p039k.AbstractC1010p;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1397h;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p098q.C1428a;
import p069c.p073b.p074a.p090b.p104w.C1437c;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f10736a = new Handler(Looper.getMainLooper(), new C3222i());

    /* renamed from: b */
    private static final boolean f10737b;

    /* renamed from: c */
    private static final int[] f10738c = {C1391b.snackbarStyle};

    /* renamed from: d */
    private static final String f10739d = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: e */
    private final ViewGroup f10740e;

    /* renamed from: f */
    private final Context f10741f;

    /* renamed from: g */
    protected final C3236v f10742g;

    /* renamed from: h */
    private final AbstractC3239a f10743h;

    /* renamed from: i */
    private int f10744i;

    /* renamed from: j */
    private boolean f10745j;

    /* renamed from: k */
    private View f10746k;

    /* renamed from: l */
    private final Runnable f10747l = new RunnableC3223j();

    /* renamed from: m */
    private Rect f10748m;

    /* renamed from: n */
    private int f10749n;

    /* renamed from: o */
    private int f10750o;

    /* renamed from: p */
    private int f10751p;

    /* renamed from: q */
    private int f10752q;

    /* renamed from: r */
    private int f10753r;

    /* renamed from: s */
    private List<AbstractC3232r<B>> f10754s;

    /* renamed from: t */
    private Behavior f10755t;

    /* renamed from: u */
    private final AccessibilityManager f10756u;

    /* renamed from: v */
    C3240b.AbstractC3242b f10757v = new C3226m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C3233s f10758k = new C3233s(this);

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: P */
        private void m13504P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10758k.mo10880c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo9919E(View view) {
            return this.f10758k.mo10878a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: k */
        public boolean mo2097k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f10758k.mo10879b(coordinatorLayout, view, motionEvent);
            return super.mo2097k(coordinatorLayout, view, motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C3214a extends AnimatorListenerAdapter {
        C3214a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo10846I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C3215b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10760a;

        C3215b(int i) {
            this.f10760a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo10845H(this.f10760a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C3216c implements ValueAnimator.AnimatorUpdateListener {
        C3216c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f10742g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C3217d implements ValueAnimator.AnimatorUpdateListener {
        C3217d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f10742g.setScaleX(floatValue);
            BaseTransientBottomBar.this.f10742g.setScaleY(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public class C3218e extends AnimatorListenerAdapter {
        C3218e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo10846I();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10743h.mo10902b(70, 180);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C3219f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f10765a;

        /* renamed from: b */
        final /* synthetic */ int f10766b;

        C3219f(int i) {
            this.f10766b = i;
            this.f10765a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10737b) {
                C1013s.m5743U(BaseTransientBottomBar.this.f10742g, intValue - this.f10765a);
            } else {
                BaseTransientBottomBar.this.f10742g.setTranslationY((float) intValue);
            }
            this.f10765a = intValue;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C3220g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10768a;

        C3220g(int i) {
            this.f10768a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo10845H(this.f10768a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10743h.mo10901a(0, 180);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C3221h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f10770a = 0;

        C3221h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10737b) {
                C1013s.m5743U(BaseTransientBottomBar.this.f10742g, intValue - this.f10770a);
            } else {
                BaseTransientBottomBar.this.f10742g.setTranslationY((float) intValue);
            }
            this.f10770a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C3222i implements Handler.Callback {
        C3222i() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo10850O();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo10843E(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class RunnableC3223j implements Runnable {
        RunnableC3223j() {
        }

        public void run() {
            int z;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f10742g != null && baseTransientBottomBar.f10741f != null && (z = (BaseTransientBottomBar.this.m13486z() - BaseTransientBottomBar.this.m13457C()) + ((int) BaseTransientBottomBar.this.f10742g.getTranslationY())) < BaseTransientBottomBar.this.f10752q) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f10742g.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f10739d, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f10752q - z;
                BaseTransientBottomBar.this.f10742g.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C3224k implements AbstractC1010p {
        C3224k() {
        }

        @Override // p006b.p030g.p039k.AbstractC1010p
        /* renamed from: a */
        public C0964a0 mo340a(View view, C0964a0 a0Var) {
            BaseTransientBottomBar.this.f10749n = a0Var.mo5414e();
            BaseTransientBottomBar.this.f10750o = a0Var.mo5416f();
            BaseTransientBottomBar.this.f10751p = a0Var.mo5417g();
            BaseTransientBottomBar.this.m13466U();
            return a0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C3225l extends C0962a {
        C3225l() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            cVar.mo5469a(1048576);
            cVar.mo5480f0(true);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: j */
        public boolean mo2363j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo2363j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo10852s();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C3226m implements C3240b.AbstractC3242b {
        C3226m() {
        }

        @Override // com.google.android.material.snackbar.C3240b.AbstractC3242b
        /* renamed from: a */
        public void mo10869a() {
            Handler handler = BaseTransientBottomBar.f10736a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C3240b.AbstractC3242b
        /* renamed from: b */
        public void mo10870b(int i) {
            Handler handler = BaseTransientBottomBar.f10736a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    public class C3227n implements AbstractC3234t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class RunnableC3228a implements Runnable {
            RunnableC3228a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo10845H(3);
            }
        }

        C3227n() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC3234t
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f10742g.getRootWindowInsets()) != null) {
                BaseTransientBottomBar.this.f10752q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m13466U();
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC3234t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo10844F()) {
                BaseTransientBottomBar.f10736a.post(new RunnableC3228a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    public class C3229o implements AbstractC3235u {
        C3229o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC3235u
        /* renamed from: a */
        public void mo10874a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f10742g.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.m13461P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    public class C3230p implements SwipeDismissBehavior.AbstractC3065c {
        C3230p() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC3065c
        /* renamed from: a */
        public void mo9924a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo10853t(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC3065c
        /* renamed from: b */
        public void mo9925b(int i) {
            if (i == 0) {
                C3240b.m13540c().mo10915k(BaseTransientBottomBar.this.f10757v);
            } else if (i == 1 || i == 2) {
                C3240b.m13540c().mo10914j(BaseTransientBottomBar.this.f10757v);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public class RunnableC3231q implements Runnable {
        RunnableC3231q() {
        }

        public void run() {
            C3236v vVar = BaseTransientBottomBar.this.f10742g;
            if (vVar != null) {
                vVar.setVisibility(0);
                if (BaseTransientBottomBar.this.f10742g.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.m13462Q();
                } else {
                    BaseTransientBottomBar.this.m13464S();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class AbstractC3232r<B> {
        /* renamed from: a */
        public void mo10876a(B b, int i) {
        }

        /* renamed from: b */
        public void mo10877b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C3233s {

        /* renamed from: a */
        private C3240b.AbstractC3242b f10781a;

        public C3233s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo9922L(0.1f);
            swipeDismissBehavior.mo9920J(0.6f);
            swipeDismissBehavior.mo9923M(0);
        }

        /* renamed from: a */
        public boolean mo10878a(View view) {
            return view instanceof C3236v;
        }

        /* renamed from: b */
        public void mo10879b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C3240b.m13540c().mo10915k(this.f10781a);
                }
            } else if (coordinatorLayout.mo2031B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C3240b.m13540c().mo10914j(this.f10781a);
            }
        }

        /* renamed from: c */
        public void mo10880c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10781a = baseTransientBottomBar.f10757v;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    public interface AbstractC3234t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    public interface AbstractC3235u {
        /* renamed from: a */
        void mo10874a(View view, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    public static class C3236v extends FrameLayout {

        /* renamed from: b */
        private static final View.OnTouchListener f10782b = new View$OnTouchListenerC3237a();

        /* renamed from: c */
        private AbstractC3235u f10783c;

        /* renamed from: d */
        private AbstractC3234t f10784d;

        /* renamed from: e */
        private int f10785e;

        /* renamed from: f */
        private final float f10786f;

        /* renamed from: g */
        private final float f10787g;

        /* renamed from: h */
        private ColorStateList f10788h;

        /* renamed from: i */
        private PorterDuff.Mode f10789i;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class View$OnTouchListenerC3237a implements View.OnTouchListener {
            View$OnTouchListenerC3237a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C3236v(Context context, AttributeSet attributeSet) {
            super(C3288a.m13767c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1400k.f5968t3);
            int i = C1400k.f5680A3;
            if (obtainStyledAttributes.hasValue(i)) {
                C1013s.m5780p0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f10785e = obtainStyledAttributes.getInt(C1400k.f5986w3, 0);
            this.f10786f = obtainStyledAttributes.getFloat(C1400k.f5992x3, 1.0f);
            setBackgroundTintList(C1437c.m7077a(context2, obtainStyledAttributes, C1400k.f5998y3));
            setBackgroundTintMode(C3203p.m13436e(obtainStyledAttributes.getInt(C1400k.f6004z3, -1), PorterDuff.Mode.SRC_IN));
            this.f10787g = obtainStyledAttributes.getFloat(C1400k.f5980v3, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f10782b);
            setFocusable(true);
            if (getBackground() == null) {
                C1013s.m5772l0(this, m13521a());
            }
        }

        /* renamed from: a */
        private Drawable m13521a() {
            float dimension = getResources().getDimension(C1393d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C1428a.m7056g(this, C1391b.colorSurface, C1391b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f10788h == null) {
                return C0398a.m1981r(gradientDrawable);
            }
            Drawable r = C0398a.m1981r(gradientDrawable);
            C0398a.m1978o(r, this.f10788h);
            return r;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f10787g;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f10785e;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f10786f;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AbstractC3234t tVar = this.f10784d;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C1013s.m5760f0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AbstractC3234t tVar = this.f10784d;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AbstractC3235u uVar = this.f10783c;
            if (uVar != null) {
                uVar.mo10874a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f10785e = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f10788h == null)) {
                drawable = C0398a.m1981r(drawable.mutate());
                C0398a.m1978o(drawable, this.f10788h);
                C0398a.m1979p(drawable, this.f10789i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f10788h = colorStateList;
            if (getBackground() != null) {
                Drawable r = C0398a.m1981r(getBackground().mutate());
                C0398a.m1978o(r, colorStateList);
                C0398a.m1979p(r, this.f10789i);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f10789i = mode;
            if (getBackground() != null) {
                Drawable r = C0398a.m1981r(getBackground().mutate());
                C0398a.m1979p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(AbstractC3234t tVar) {
            this.f10784d = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f10782b);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(AbstractC3235u uVar) {
            this.f10783c = uVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f10737b = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, AbstractC3239a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f10740e = viewGroup;
            this.f10743h = aVar;
            Context context = viewGroup.getContext();
            this.f10741f = context;
            C3202o.m13423a(context);
            C3236v vVar = (C3236v) LayoutInflater.from(context).inflate(mo10841A(), viewGroup, false);
            this.f10742g = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo10903c(vVar.getActionTextColorAlpha());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f10748m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C1013s.m5770k0(vVar, 1);
            C1013s.m5786s0(vVar, 1);
            C1013s.m5782q0(vVar, true);
            C1013s.m5790u0(vVar, new C3224k());
            C1013s.m5766i0(vVar, new C3225l());
            this.f10756u = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: B */
    private int m13456B() {
        int height = this.f10742g.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f10742g.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: C */
    private int m13457C() {
        int[] iArr = new int[2];
        this.f10742g.getLocationOnScreen(iArr);
        return iArr[1] + this.f10742g.getHeight();
    }

    /* renamed from: G */
    private boolean m13458G() {
        ViewGroup.LayoutParams layoutParams = this.f10742g.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0340f) && (((CoordinatorLayout.C0340f) layoutParams).mo2121f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m13459K(CoordinatorLayout.C0340f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f10755t;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo10856x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m13504P(this);
        }
        swipeDismissBehavior.mo9921K(new C3230p());
        fVar.mo2129o(swipeDismissBehavior);
        if (this.f10746k == null) {
            fVar.f1929g = 80;
        }
    }

    /* renamed from: M */
    private boolean m13460M() {
        return this.f10752q > 0 && !this.f10745j && m13458G();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: P */
    private void m13461P() {
        if (mo10848L()) {
            mo10851p();
            return;
        }
        this.f10742g.setVisibility(0);
        mo10846I();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Q */
    private void m13462Q() {
        ValueAnimator u = m13484u(0.0f, 1.0f);
        ValueAnimator y = m13485y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(u, y);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C3214a());
        animatorSet.start();
    }

    /* renamed from: R */
    private void m13463R(int i) {
        ValueAnimator u = m13484u(1.0f, 0.0f);
        u.setDuration(75L);
        u.addListener(new C3215b(i));
        u.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: S */
    private void m13464S() {
        int B = m13456B();
        if (f10737b) {
            C1013s.m5743U(this.f10742g, B);
        } else {
            this.f10742g.setTranslationY((float) B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(B, 0);
        valueAnimator.setInterpolator(C1401a.f6007b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C3218e());
        valueAnimator.addUpdateListener(new C3219f(B));
        valueAnimator.start();
    }

    /* renamed from: T */
    private void m13465T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m13456B());
        valueAnimator.setInterpolator(C1401a.f6007b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C3220g(i));
        valueAnimator.addUpdateListener(new C3221h());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: U */
    private void m13466U() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f10742g.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f10748m) == null) {
            Log.w(f10739d, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f10746k != null ? this.f10753r : this.f10749n);
        marginLayoutParams.leftMargin = rect.left + this.f10750o;
        marginLayoutParams.rightMargin = rect.right + this.f10751p;
        this.f10742g.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m13460M()) {
            this.f10742g.removeCallbacks(this.f10747l);
            this.f10742g.post(this.f10747l);
        }
    }

    /* renamed from: q */
    private void m13482q(int i) {
        if (this.f10742g.getAnimationMode() == 1) {
            m13463R(i);
        } else {
            m13465T(i);
        }
    }

    /* renamed from: r */
    private int m13483r() {
        View view = this.f10746k;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f10740e.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f10740e.getHeight()) - i;
    }

    /* renamed from: u */
    private ValueAnimator m13484u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1401a.f6006a);
        ofFloat.addUpdateListener(new C3216c());
        return ofFloat;
    }

    /* renamed from: y */
    private ValueAnimator m13485y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1401a.f6009d);
        ofFloat.addUpdateListener(new C3217d());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private int m13486z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f10741f.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo10841A() {
        return mo10842D() ? C1397h.mtrl_layout_snackbar : C1397h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo10842D() {
        TypedArray obtainStyledAttributes = this.f10741f.obtainStyledAttributes(f10738c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo10843E(int i) {
        if (!mo10848L() || this.f10742g.getVisibility() != 0) {
            mo10845H(i);
        } else {
            m13482q(i);
        }
    }

    /* renamed from: F */
    public boolean mo10844F() {
        return C3240b.m13540c().mo10911e(this.f10757v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo10845H(int i) {
        C3240b.m13540c().mo10912h(this.f10757v);
        List<AbstractC3232r<B>> list = this.f10754s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10754s.get(size).mo10876a(this, i);
            }
        }
        ViewParent parent = this.f10742g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10742g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo10846I() {
        C3240b.m13540c().mo10913i(this.f10757v);
        List<AbstractC3232r<B>> list = this.f10754s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10754s.get(size).mo10877b(this);
            }
        }
    }

    /* renamed from: J */
    public B mo10847J(int i) {
        this.f10744i = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo10848L() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f10756u.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: N */
    public void mo10849N() {
        C3240b.m13540c().mo10916m(mo10855w(), this.f10757v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo10850O() {
        this.f10742g.setOnAttachStateChangeListener(new C3227n());
        if (this.f10742g.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f10742g.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0340f) {
                m13459K((CoordinatorLayout.C0340f) layoutParams);
            }
            this.f10753r = m13483r();
            m13466U();
            this.f10742g.setVisibility(4);
            this.f10740e.addView(this.f10742g);
        }
        if (C1013s.m5737O(this.f10742g)) {
            m13461P();
        } else {
            this.f10742g.setOnLayoutChangeListener(new C3229o());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo10851p() {
        this.f10742g.post(new RunnableC3231q());
    }

    /* renamed from: s */
    public void mo10852s() {
        mo10853t(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo10853t(int i) {
        C3240b.m13540c().mo10909b(this.f10757v, i);
    }

    /* renamed from: v */
    public Context mo10854v() {
        return this.f10741f;
    }

    /* renamed from: w */
    public int mo10855w() {
        return this.f10744i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public SwipeDismissBehavior<? extends View> mo10856x() {
        return new Behavior();
    }
}
