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
    static final Handler f10744a = new Handler(Looper.getMainLooper(), new C3222i());

    /* renamed from: b */
    private static final boolean f10745b;

    /* renamed from: c */
    private static final int[] f10746c = {C1391b.snackbarStyle};

    /* renamed from: d */
    private static final String f10747d = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: e */
    private final ViewGroup f10748e;

    /* renamed from: f */
    private final Context f10749f;

    /* renamed from: g */
    protected final C3236v f10750g;

    /* renamed from: h */
    private final AbstractC3239a f10751h;

    /* renamed from: i */
    private int f10752i;

    /* renamed from: j */
    private boolean f10753j;

    /* renamed from: k */
    private View f10754k;

    /* renamed from: l */
    private final Runnable f10755l = new RunnableC3223j();

    /* renamed from: m */
    private Rect f10756m;

    /* renamed from: n */
    private int f10757n;

    /* renamed from: o */
    private int f10758o;

    /* renamed from: p */
    private int f10759p;

    /* renamed from: q */
    private int f10760q;

    /* renamed from: r */
    private int f10761r;

    /* renamed from: s */
    private List<AbstractC3232r<B>> f10762s;

    /* renamed from: t */
    private Behavior f10763t;

    /* renamed from: u */
    private final AccessibilityManager f10764u;

    /* renamed from: v */
    C3240b.AbstractC3242b f10765v = new C3226m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C3233s f10766k = new C3233s(this);

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: P */
        private void m13504P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10766k.mo10880c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo9919E(View view) {
            return this.f10766k.mo10878a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: k */
        public boolean mo2097k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f10766k.mo10879b(coordinatorLayout, view, motionEvent);
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
        final /* synthetic */ int f10768a;

        C3215b(int i) {
            this.f10768a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo10845H(this.f10768a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C3216c implements ValueAnimator.AnimatorUpdateListener {
        C3216c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f10750g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C3217d implements ValueAnimator.AnimatorUpdateListener {
        C3217d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f10750g.setScaleX(floatValue);
            BaseTransientBottomBar.this.f10750g.setScaleY(floatValue);
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
            BaseTransientBottomBar.this.f10751h.mo10902b(70, 180);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C3219f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f10773a;

        /* renamed from: b */
        final /* synthetic */ int f10774b;

        C3219f(int i) {
            this.f10774b = i;
            this.f10773a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10745b) {
                C1013s.m5743U(BaseTransientBottomBar.this.f10750g, intValue - this.f10773a);
            } else {
                BaseTransientBottomBar.this.f10750g.setTranslationY((float) intValue);
            }
            this.f10773a = intValue;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C3220g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10776a;

        C3220g(int i) {
            this.f10776a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo10845H(this.f10776a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10751h.mo10901a(0, 180);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C3221h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f10778a = 0;

        C3221h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10745b) {
                C1013s.m5743U(BaseTransientBottomBar.this.f10750g, intValue - this.f10778a);
            } else {
                BaseTransientBottomBar.this.f10750g.setTranslationY((float) intValue);
            }
            this.f10778a = intValue;
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
            if (baseTransientBottomBar.f10750g != null && baseTransientBottomBar.f10749f != null && (z = (BaseTransientBottomBar.this.m13486z() - BaseTransientBottomBar.this.m13457C()) + ((int) BaseTransientBottomBar.this.f10750g.getTranslationY())) < BaseTransientBottomBar.this.f10760q) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f10750g.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f10747d, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f10760q - z;
                BaseTransientBottomBar.this.f10750g.requestLayout();
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
            BaseTransientBottomBar.this.f10757n = a0Var.mo5414e();
            BaseTransientBottomBar.this.f10758o = a0Var.mo5416f();
            BaseTransientBottomBar.this.f10759p = a0Var.mo5417g();
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
            Handler handler = BaseTransientBottomBar.f10744a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C3240b.AbstractC3242b
        /* renamed from: b */
        public void mo10870b(int i) {
            Handler handler = BaseTransientBottomBar.f10744a;
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
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f10750g.getRootWindowInsets()) != null) {
                BaseTransientBottomBar.this.f10760q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m13466U();
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC3234t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo10844F()) {
                BaseTransientBottomBar.f10744a.post(new RunnableC3228a());
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
            BaseTransientBottomBar.this.f10750g.setOnLayoutChangeListener(null);
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
                C3240b.m13540c().mo10915k(BaseTransientBottomBar.this.f10765v);
            } else if (i == 1 || i == 2) {
                C3240b.m13540c().mo10914j(BaseTransientBottomBar.this.f10765v);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public class RunnableC3231q implements Runnable {
        RunnableC3231q() {
        }

        public void run() {
            C3236v vVar = BaseTransientBottomBar.this.f10750g;
            if (vVar != null) {
                vVar.setVisibility(0);
                if (BaseTransientBottomBar.this.f10750g.getAnimationMode() == 1) {
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
        private C3240b.AbstractC3242b f10789a;

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
                    C3240b.m13540c().mo10915k(this.f10789a);
                }
            } else if (coordinatorLayout.mo2031B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C3240b.m13540c().mo10914j(this.f10789a);
            }
        }

        /* renamed from: c */
        public void mo10880c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10789a = baseTransientBottomBar.f10765v;
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
        private static final View.OnTouchListener f10790b = new View$OnTouchListenerC3237a();

        /* renamed from: c */
        private AbstractC3235u f10791c;

        /* renamed from: d */
        private AbstractC3234t f10792d;

        /* renamed from: e */
        private int f10793e;

        /* renamed from: f */
        private final float f10794f;

        /* renamed from: g */
        private final float f10795g;

        /* renamed from: h */
        private ColorStateList f10796h;

        /* renamed from: i */
        private PorterDuff.Mode f10797i;

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
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1400k.f5976t3);
            int i = C1400k.f5688A3;
            if (obtainStyledAttributes.hasValue(i)) {
                C1013s.m5780p0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f10793e = obtainStyledAttributes.getInt(C1400k.f5994w3, 0);
            this.f10794f = obtainStyledAttributes.getFloat(C1400k.f6000x3, 1.0f);
            setBackgroundTintList(C1437c.m7077a(context2, obtainStyledAttributes, C1400k.f6006y3));
            setBackgroundTintMode(C3203p.m13436e(obtainStyledAttributes.getInt(C1400k.f6012z3, -1), PorterDuff.Mode.SRC_IN));
            this.f10795g = obtainStyledAttributes.getFloat(C1400k.f5988v3, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f10790b);
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
            if (this.f10796h == null) {
                return C0398a.m1981r(gradientDrawable);
            }
            Drawable r = C0398a.m1981r(gradientDrawable);
            C0398a.m1978o(r, this.f10796h);
            return r;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f10795g;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f10793e;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f10794f;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AbstractC3234t tVar = this.f10792d;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C1013s.m5760f0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AbstractC3234t tVar = this.f10792d;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AbstractC3235u uVar = this.f10791c;
            if (uVar != null) {
                uVar.mo10874a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f10793e = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f10796h == null)) {
                drawable = C0398a.m1981r(drawable.mutate());
                C0398a.m1978o(drawable, this.f10796h);
                C0398a.m1979p(drawable, this.f10797i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f10796h = colorStateList;
            if (getBackground() != null) {
                Drawable r = C0398a.m1981r(getBackground().mutate());
                C0398a.m1978o(r, colorStateList);
                C0398a.m1979p(r, this.f10797i);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f10797i = mode;
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
            this.f10792d = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f10790b);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(AbstractC3235u uVar) {
            this.f10791c = uVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f10745b = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, AbstractC3239a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f10748e = viewGroup;
            this.f10751h = aVar;
            Context context = viewGroup.getContext();
            this.f10749f = context;
            C3202o.m13423a(context);
            C3236v vVar = (C3236v) LayoutInflater.from(context).inflate(mo10841A(), viewGroup, false);
            this.f10750g = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo10903c(vVar.getActionTextColorAlpha());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f10756m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C1013s.m5770k0(vVar, 1);
            C1013s.m5786s0(vVar, 1);
            C1013s.m5782q0(vVar, true);
            C1013s.m5790u0(vVar, new C3224k());
            C1013s.m5766i0(vVar, new C3225l());
            this.f10764u = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: B */
    private int m13456B() {
        int height = this.f10750g.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f10750g.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: C */
    private int m13457C() {
        int[] iArr = new int[2];
        this.f10750g.getLocationOnScreen(iArr);
        return iArr[1] + this.f10750g.getHeight();
    }

    /* renamed from: G */
    private boolean m13458G() {
        ViewGroup.LayoutParams layoutParams = this.f10750g.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0340f) && (((CoordinatorLayout.C0340f) layoutParams).mo2121f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m13459K(CoordinatorLayout.C0340f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f10763t;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo10856x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m13504P(this);
        }
        swipeDismissBehavior.mo9921K(new C3230p());
        fVar.mo2129o(swipeDismissBehavior);
        if (this.f10754k == null) {
            fVar.f1929g = 80;
        }
    }

    /* renamed from: M */
    private boolean m13460M() {
        return this.f10760q > 0 && !this.f10753j && m13458G();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: P */
    private void m13461P() {
        if (mo10848L()) {
            mo10851p();
            return;
        }
        this.f10750g.setVisibility(0);
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
        if (f10745b) {
            C1013s.m5743U(this.f10750g, B);
        } else {
            this.f10750g.setTranslationY((float) B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(B, 0);
        valueAnimator.setInterpolator(C1401a.f6015b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C3218e());
        valueAnimator.addUpdateListener(new C3219f(B));
        valueAnimator.start();
    }

    /* renamed from: T */
    private void m13465T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m13456B());
        valueAnimator.setInterpolator(C1401a.f6015b);
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
        ViewGroup.LayoutParams layoutParams = this.f10750g.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f10756m) == null) {
            Log.w(f10747d, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f10754k != null ? this.f10761r : this.f10757n);
        marginLayoutParams.leftMargin = rect.left + this.f10758o;
        marginLayoutParams.rightMargin = rect.right + this.f10759p;
        this.f10750g.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m13460M()) {
            this.f10750g.removeCallbacks(this.f10755l);
            this.f10750g.post(this.f10755l);
        }
    }

    /* renamed from: q */
    private void m13482q(int i) {
        if (this.f10750g.getAnimationMode() == 1) {
            m13463R(i);
        } else {
            m13465T(i);
        }
    }

    /* renamed from: r */
    private int m13483r() {
        View view = this.f10754k;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f10748e.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f10748e.getHeight()) - i;
    }

    /* renamed from: u */
    private ValueAnimator m13484u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1401a.f6014a);
        ofFloat.addUpdateListener(new C3216c());
        return ofFloat;
    }

    /* renamed from: y */
    private ValueAnimator m13485y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1401a.f6017d);
        ofFloat.addUpdateListener(new C3217d());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private int m13486z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f10749f.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
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
        TypedArray obtainStyledAttributes = this.f10749f.obtainStyledAttributes(f10746c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo10843E(int i) {
        if (!mo10848L() || this.f10750g.getVisibility() != 0) {
            mo10845H(i);
        } else {
            m13482q(i);
        }
    }

    /* renamed from: F */
    public boolean mo10844F() {
        return C3240b.m13540c().mo10911e(this.f10765v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo10845H(int i) {
        C3240b.m13540c().mo10912h(this.f10765v);
        List<AbstractC3232r<B>> list = this.f10762s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10762s.get(size).mo10876a(this, i);
            }
        }
        ViewParent parent = this.f10750g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10750g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo10846I() {
        C3240b.m13540c().mo10913i(this.f10765v);
        List<AbstractC3232r<B>> list = this.f10762s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10762s.get(size).mo10877b(this);
            }
        }
    }

    /* renamed from: J */
    public B mo10847J(int i) {
        this.f10752i = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo10848L() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f10764u.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: N */
    public void mo10849N() {
        C3240b.m13540c().mo10916m(mo10855w(), this.f10765v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo10850O() {
        this.f10750g.setOnAttachStateChangeListener(new C3227n());
        if (this.f10750g.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f10750g.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0340f) {
                m13459K((CoordinatorLayout.C0340f) layoutParams);
            }
            this.f10761r = m13483r();
            m13466U();
            this.f10750g.setVisibility(4);
            this.f10748e.addView(this.f10750g);
        }
        if (C1013s.m5737O(this.f10750g)) {
            m13461P();
        } else {
            this.f10750g.setOnLayoutChangeListener(new C3229o());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo10851p() {
        this.f10750g.post(new RunnableC3231q());
    }

    /* renamed from: s */
    public void mo10852s() {
        mo10853t(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo10853t(int i) {
        C3240b.m13540c().mo10909b(this.f10765v, i);
    }

    /* renamed from: v */
    public Context mo10854v() {
        return this.f10749f;
    }

    /* renamed from: w */
    public int mo10855w() {
        return this.f10752i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public SwipeDismissBehavior<? extends View> mo10856x() {
        return new Behavior();
    }
}
