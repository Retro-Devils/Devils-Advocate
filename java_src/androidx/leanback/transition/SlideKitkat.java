package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import p006b.p053m.C1074f;
import p006b.p053m.C1080l;

class SlideKitkat extends Visibility {

    /* renamed from: b */
    private static final TimeInterpolator f2564b = new DecelerateInterpolator();

    /* renamed from: c */
    private static final TimeInterpolator f2565c = new AccelerateInterpolator();

    /* renamed from: d */
    private static final AbstractC0510g f2566d = new C0504a();

    /* renamed from: e */
    private static final AbstractC0510g f2567e = new C0505b();

    /* renamed from: f */
    private static final AbstractC0510g f2568f = new C0506c();

    /* renamed from: g */
    private static final AbstractC0510g f2569g = new C0507d();

    /* renamed from: h */
    private static final AbstractC0510g f2570h = new C0508e();

    /* renamed from: i */
    private static final AbstractC0510g f2571i = new C0509f();

    /* renamed from: j */
    private int f2572j;

    /* renamed from: k */
    private AbstractC0510g f2573k;

    /* renamed from: androidx.leanback.transition.SlideKitkat$a */
    static class C0504a extends AbstractC0511h {
        C0504a() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: a */
        public float mo2939a(View view) {
            return view.getTranslationX() - ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$b */
    static class C0505b extends AbstractC0512i {
        C0505b() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: a */
        public float mo2939a(View view) {
            return view.getTranslationY() - ((float) view.getHeight());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$c */
    static class C0506c extends AbstractC0511h {
        C0506c() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: a */
        public float mo2939a(View view) {
            return view.getTranslationX() + ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$d */
    static class C0507d extends AbstractC0512i {
        C0507d() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: a */
        public float mo2939a(View view) {
            return view.getTranslationY() + ((float) view.getHeight());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$e */
    static class C0508e extends AbstractC0511h {
        C0508e() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: a */
        public float mo2939a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() + ((float) view.getWidth()) : view.getTranslationX() - ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$f */
    static class C0509f extends AbstractC0511h {
        C0509f() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: a */
        public float mo2939a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() - ((float) view.getWidth()) : view.getTranslationX() + ((float) view.getWidth());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.leanback.transition.SlideKitkat$g */
    public interface AbstractC0510g {
        /* renamed from: a */
        float mo2939a(View view);

        /* renamed from: b */
        float mo2940b(View view);

        /* renamed from: c */
        Property<View, Float> mo2941c();
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$h */
    private static abstract class AbstractC0511h implements AbstractC0510g {
        AbstractC0511h() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: b */
        public float mo2940b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: c */
        public Property<View, Float> mo2941c() {
            return View.TRANSLATION_X;
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$i */
    private static abstract class AbstractC0512i implements AbstractC0510g {
        AbstractC0512i() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: b */
        public float mo2940b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.leanback.transition.SlideKitkat.AbstractC0510g
        /* renamed from: c */
        public Property<View, Float> mo2941c() {
            return View.TRANSLATION_Y;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.leanback.transition.SlideKitkat$j */
    public static class C0513j extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2574a = false;

        /* renamed from: b */
        private float f2575b;

        /* renamed from: c */
        private final View f2576c;

        /* renamed from: d */
        private final float f2577d;

        /* renamed from: e */
        private final float f2578e;

        /* renamed from: f */
        private final int f2579f;

        /* renamed from: g */
        private final Property<View, Float> f2580g;

        public C0513j(View view, Property<View, Float> property, float f, float f2, int i) {
            this.f2580g = property;
            this.f2576c = view;
            this.f2578e = f;
            this.f2577d = f2;
            this.f2579f = i;
            view.setVisibility(0);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2576c.setTag(C1074f.lb_slide_transition_value, new float[]{this.f2576c.getTranslationX(), this.f2576c.getTranslationY()});
            this.f2580g.set(this.f2576c, Float.valueOf(this.f2578e));
            this.f2574a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2574a) {
                this.f2580g.set(this.f2576c, Float.valueOf(this.f2578e));
            }
            this.f2576c.setVisibility(this.f2579f);
        }

        public void onAnimationPause(Animator animator) {
            this.f2575b = this.f2580g.get(this.f2576c).floatValue();
            this.f2580g.set(this.f2576c, Float.valueOf(this.f2577d));
            this.f2576c.setVisibility(this.f2579f);
        }

        public void onAnimationResume(Animator animator) {
            this.f2580g.set(this.f2576c, Float.valueOf(this.f2575b));
            this.f2576c.setVisibility(0);
        }
    }

    public SlideKitkat() {
        mo2936b(80);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4955a0);
        mo2936b(obtainStyledAttributes.getInt(C1080l.f4963e0, 80));
        long j = (long) obtainStyledAttributes.getInt(C1080l.f4959c0, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = (long) obtainStyledAttributes.getInt(C1080l.f4961d0, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C1080l.f4957b0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animator m2691a(View view, Property<View, Float> property, float f, float f2, float f3, TimeInterpolator timeInterpolator, int i) {
        int i2 = C1074f.lb_slide_transition_value;
        float[] fArr = (float[]) view.getTag(i2);
        if (fArr != null) {
            f = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(i2, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f, f2);
        C0513j jVar = new C0513j(view, property, f3, f2, i);
        ofFloat.addListener(jVar);
        ofFloat.addPauseListener(jVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    /* renamed from: b */
    public void mo2936b(int i) {
        AbstractC0510g gVar;
        if (i == 3) {
            gVar = f2566d;
        } else if (i == 5) {
            gVar = f2568f;
        } else if (i == 48) {
            gVar = f2567e;
        } else if (i == 80) {
            gVar = f2569g;
        } else if (i == 8388611) {
            gVar = f2570h;
        } else if (i == 8388613) {
            gVar = f2571i;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f2573k = gVar;
        this.f2572j = i;
    }

    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b = this.f2573k.mo2940b(view);
        return m2691a(view, this.f2573k.mo2941c(), this.f2573k.mo2939a(view), b, b, f2564b, 0);
    }

    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b = this.f2573k.mo2940b(view);
        return m2691a(view, this.f2573k.mo2941c(), b, this.f2573k.mo2939a(view), b, f2565c, 4);
    }
}
