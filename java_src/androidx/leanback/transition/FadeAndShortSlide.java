package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import p006b.p053m.C1080l;

public class FadeAndShortSlide extends Visibility {

    /* renamed from: b */
    private static final TimeInterpolator f2550b = new DecelerateInterpolator();

    /* renamed from: c */
    static final AbstractC0502g f2551c = new C0496a();

    /* renamed from: d */
    static final AbstractC0502g f2552d = new C0497b();

    /* renamed from: e */
    static final AbstractC0502g f2553e = new C0498c();

    /* renamed from: f */
    static final AbstractC0502g f2554f = new C0499d();

    /* renamed from: g */
    static final AbstractC0502g f2555g = new C0500e();

    /* renamed from: h */
    private AbstractC0502g f2556h;

    /* renamed from: i */
    private Visibility f2557i;

    /* renamed from: j */
    private float f2558j;

    /* renamed from: k */
    final AbstractC0502g f2559k;

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$a */
    static class C0496a extends AbstractC0502g {
        C0496a() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0502g
        /* renamed from: a */
        public float mo2930a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float b = fadeAndShortSlide.mo2920b(viewGroup);
            return z ? translationX + b : translationX - b;
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$b */
    static class C0497b extends AbstractC0502g {
        C0497b() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0502g
        /* renamed from: a */
        public float mo2930a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float b = fadeAndShortSlide.mo2920b(viewGroup);
            return z ? translationX - b : translationX + b;
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$c */
    static class C0498c extends AbstractC0502g {
        C0498c() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0502g
        /* renamed from: a */
        public float mo2930a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int width = iArr[0] + (view.getWidth() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            int width2 = epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX();
            float translationX = view.getTranslationX();
            float b = fadeAndShortSlide.mo2920b(viewGroup);
            return width < width2 ? translationX - b : translationX + b;
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$d */
    static class C0499d extends AbstractC0502g {
        C0499d() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0502g
        /* renamed from: b */
        public float mo2931b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() + fadeAndShortSlide.mo2921c(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$e */
    static class C0500e extends AbstractC0502g {
        C0500e() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0502g
        /* renamed from: b */
        public float mo2931b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.mo2921c(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$f */
    class C0501f extends AbstractC0502g {
        C0501f() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0502g
        /* renamed from: b */
        public float mo2931b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int height = iArr[1] + (view.getHeight() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            int height2 = epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY();
            float translationY = view.getTranslationY();
            float c = fadeAndShortSlide.mo2921c(viewGroup);
            return height < height2 ? translationY - c : translationY + c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$g */
    public static abstract class AbstractC0502g {
        AbstractC0502g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo2930a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo2931b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        this(8388611);
    }

    public FadeAndShortSlide(int i) {
        this.f2557i = new Fade();
        this.f2558j = -1.0f;
        this.f2559k = new C0501f();
        mo2925d(i);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2557i = new Fade();
        this.f2558j = -1.0f;
        this.f2559k = new C0501f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4955a0);
        mo2925d(obtainStyledAttributes.getInt(C1080l.f4963e0, 8388611));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m2678a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public Transition addListener(Transition.TransitionListener transitionListener) {
        this.f2557i.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo2920b(ViewGroup viewGroup) {
        float f = this.f2558j;
        return f >= 0.0f ? f : (float) (viewGroup.getWidth() / 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2921c(ViewGroup viewGroup) {
        float f = this.f2558j;
        return f >= 0.0f ? f : (float) (viewGroup.getHeight() / 4);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        this.f2557i.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        m2678a(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        this.f2557i.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        m2678a(transitionValues);
    }

    @Override // java.lang.Object, android.transition.Transition, android.transition.Transition
    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f2557i = (Visibility) this.f2557i.clone();
        return fadeAndShortSlide;
    }

    /* renamed from: d */
    public void mo2925d(int i) {
        AbstractC0502g gVar;
        if (i == 48) {
            gVar = f2555g;
        } else if (i == 80) {
            gVar = f2554f;
        } else if (i == 112) {
            gVar = this.f2559k;
        } else if (i == 8388611) {
            gVar = f2551c;
        } else if (i == 8388613) {
            gVar = f2552d;
        } else if (i == 8388615) {
            gVar = f2553e;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f2556h = gVar;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        Animator a = C0514a.m2706a(view, transitionValues2, i, i2, this.f2556h.mo2930a(this, viewGroup, view, iArr), this.f2556h.mo2931b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f2550b, this);
        Animator onAppear = this.f2557i.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (a == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a).with(onAppear);
        return animatorSet;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        Animator a = C0514a.m2706a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f2556h.mo2930a(this, viewGroup, view, iArr), this.f2556h.mo2931b(this, viewGroup, view, iArr), f2550b, this);
        Animator onDisappear = this.f2557i.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (a == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a).with(onDisappear);
        return animatorSet;
    }

    public Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f2557i.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f2557i.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
