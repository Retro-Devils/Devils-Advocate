package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0698a;
import androidx.recyclerview.widget.C0701b;
import androidx.recyclerview.widget.C0732k;
import androidx.recyclerview.widget.C0739o;
import androidx.recyclerview.widget.C0742p;
import androidx.recyclerview.widget.RunnableC0720e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p006b.p030g.p035g.C0921a;
import p006b.p030g.p038j.C0961i;
import p006b.p030g.p039k.AbstractC1004j;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1003i;
import p006b.p030g.p039k.C1005k;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1025t;
import p006b.p030g.p039k.p040b0.C0978b;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;
import p006b.p059p.C1092a;
import p006b.p059p.C1093b;
import p006b.p059p.C1094c;

public class RecyclerView extends ViewGroup implements AbstractC1004j {

    /* renamed from: b */
    private static final int[] f3118b = {16843830};

    /* renamed from: c */
    static final boolean f3119c;

    /* renamed from: d */
    static final boolean f3120d;

    /* renamed from: e */
    static final boolean f3121e;

    /* renamed from: f */
    static final boolean f3122f;

    /* renamed from: g */
    private static final boolean f3123g;

    /* renamed from: h */
    private static final boolean f3124h;

    /* renamed from: i */
    private static final Class<?>[] f3125i;

    /* renamed from: j */
    static final Interpolator f3126j = new animationInterpolatorC0652c();

    /* renamed from: A */
    private AbstractC0677s f3127A;

    /* renamed from: A0 */
    private final int[] f3128A0;

    /* renamed from: B */
    boolean f3129B;

    /* renamed from: B0 */
    private C1005k f3130B0;

    /* renamed from: C */
    boolean f3131C;

    /* renamed from: C0 */
    private final int[] f3132C0;

    /* renamed from: D */
    boolean f3133D;

    /* renamed from: D0 */
    private final int[] f3134D0;

    /* renamed from: E */
    boolean f3135E;

    /* renamed from: E0 */
    final int[] f3136E0;

    /* renamed from: F */
    private int f3137F;

    /* renamed from: F0 */
    final List<AbstractC0655d0> f3138F0;

    /* renamed from: G */
    boolean f3139G;

    /* renamed from: G0 */
    private Runnable f3140G0;

    /* renamed from: H */
    boolean f3141H;

    /* renamed from: H0 */
    private final C0742p.AbstractC0744b f3142H0;

    /* renamed from: I */
    private boolean f3143I;

    /* renamed from: J */
    private int f3144J;

    /* renamed from: K */
    boolean f3145K;

    /* renamed from: L */
    private final AccessibilityManager f3146L;

    /* renamed from: M */
    private List<AbstractC0675q> f3147M;

    /* renamed from: N */
    boolean f3148N;

    /* renamed from: O */
    boolean f3149O;

    /* renamed from: P */
    private int f3150P;

    /* renamed from: Q */
    private int f3151Q;

    /* renamed from: R */
    private C0662k f3152R;

    /* renamed from: S */
    private EdgeEffect f3153S;

    /* renamed from: T */
    private EdgeEffect f3154T;

    /* renamed from: U */
    private EdgeEffect f3155U;

    /* renamed from: V */
    private EdgeEffect f3156V;

    /* renamed from: W */
    AbstractC0663l f3157W;

    /* renamed from: a0 */
    private int f3158a0;

    /* renamed from: b0 */
    private int f3159b0;

    /* renamed from: c0 */
    private VelocityTracker f3160c0;

    /* renamed from: d0 */
    private int f3161d0;

    /* renamed from: e0 */
    private int f3162e0;

    /* renamed from: f0 */
    private int f3163f0;

    /* renamed from: g0 */
    private int f3164g0;

    /* renamed from: h0 */
    private int f3165h0;

    /* renamed from: i0 */
    private AbstractC0676r f3166i0;

    /* renamed from: j0 */
    private final int f3167j0;

    /* renamed from: k */
    private final C0683x f3168k;

    /* renamed from: k0 */
    private final int f3169k0;

    /* renamed from: l */
    final C0681v f3170l;

    /* renamed from: l0 */
    private float f3171l0;

    /* renamed from: m */
    private C0684y f3172m;

    /* renamed from: m0 */
    private float f3173m0;

    /* renamed from: n */
    C0698a f3174n;

    /* renamed from: n0 */
    private boolean f3175n0;

    /* renamed from: o */
    C0701b f3176o;

    /* renamed from: o0 */
    final RunnableC0653c0 f3177o0;

    /* renamed from: p */
    final C0742p f3178p;

    /* renamed from: p0 */
    RunnableC0720e f3179p0;

    /* renamed from: q */
    boolean f3180q;

    /* renamed from: q0 */
    RunnableC0720e.C0722b f3181q0;

    /* renamed from: r */
    final Runnable f3182r;

    /* renamed from: r0 */
    final C0649a0 f3183r0;

    /* renamed from: s */
    final Rect f3184s;

    /* renamed from: s0 */
    private AbstractC0678t f3185s0;

    /* renamed from: t */
    private final Rect f3186t;

    /* renamed from: t0 */
    private List<AbstractC0678t> f3187t0;

    /* renamed from: u */
    final RectF f3188u;

    /* renamed from: u0 */
    boolean f3189u0;

    /* renamed from: v */
    AbstractC0658g f3190v;

    /* renamed from: v0 */
    boolean f3191v0;

    /* renamed from: w */
    AbstractC0669o f3192w;

    /* renamed from: w0 */
    private AbstractC0663l.AbstractC0665b f3193w0;

    /* renamed from: x */
    AbstractC0682w f3194x;

    /* renamed from: x0 */
    boolean f3195x0;

    /* renamed from: y */
    final ArrayList<AbstractC0668n> f3196y;

    /* renamed from: y0 */
    C0732k f3197y0;

    /* renamed from: z */
    private final ArrayList<AbstractC0677s> f3198z;

    /* renamed from: z0 */
    private AbstractC0661j f3199z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class RunnableC0648a implements Runnable {
        RunnableC0648a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3135E && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3129B) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3141H) {
                    recyclerView2.f3139G = true;
                } else {
                    recyclerView2.mo3928u();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0649a0 {

        /* renamed from: a */
        int f3201a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3202b;

        /* renamed from: c */
        int f3203c = 0;

        /* renamed from: d */
        int f3204d = 0;

        /* renamed from: e */
        int f3205e = 1;

        /* renamed from: f */
        int f3206f = 0;

        /* renamed from: g */
        boolean f3207g = false;

        /* renamed from: h */
        boolean f3208h = false;

        /* renamed from: i */
        boolean f3209i = false;

        /* renamed from: j */
        boolean f3210j = false;

        /* renamed from: k */
        boolean f3211k = false;

        /* renamed from: l */
        boolean f3212l = false;

        /* renamed from: m */
        int f3213m;

        /* renamed from: n */
        long f3214n;

        /* renamed from: o */
        int f3215o;

        /* renamed from: p */
        int f3216p;

        /* renamed from: q */
        int f3217q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3943a(int i) {
            if ((this.f3205e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3205e));
            }
        }

        /* renamed from: b */
        public boolean mo3944b() {
            return this.f3207g;
        }

        /* renamed from: c */
        public int mo3945c() {
            return this.f3208h ? this.f3203c - this.f3204d : this.f3206f;
        }

        /* renamed from: d */
        public int mo3946d() {
            return this.f3216p;
        }

        /* renamed from: e */
        public int mo3947e() {
            return this.f3217q;
        }

        /* renamed from: f */
        public int mo3948f() {
            return this.f3201a;
        }

        /* renamed from: g */
        public boolean mo3949g() {
            return this.f3201a != -1;
        }

        /* renamed from: h */
        public boolean mo3950h() {
            return this.f3208h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3951i(AbstractC0658g gVar) {
            this.f3205e = 1;
            this.f3206f = gVar.mo3580c();
            this.f3208h = false;
            this.f3209i = false;
            this.f3210j = false;
        }

        /* renamed from: j */
        public boolean mo3952j() {
            return this.f3212l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3201a + ", mData=" + this.f3202b + ", mItemCount=" + this.f3206f + ", mIsMeasuring=" + this.f3210j + ", mPreviousLayoutItemCount=" + this.f3203c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3204d + ", mStructureChanged=" + this.f3207g + ", mInPreLayout=" + this.f3208h + ", mRunSimpleAnimations=" + this.f3211k + ", mRunPredictiveAnimations=" + this.f3212l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class RunnableC0650b implements Runnable {
        RunnableC0650b() {
        }

        public void run() {
            AbstractC0663l lVar = RecyclerView.this.f3157W;
            if (lVar != null) {
                lVar.mo4063u();
            }
            RecyclerView.this.f3195x0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class AbstractC0651b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    static class animationInterpolatorC0652c implements Interpolator {
        animationInterpolatorC0652c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public class RunnableC0653c0 implements Runnable {

        /* renamed from: b */
        private int f3219b;

        /* renamed from: c */
        private int f3220c;

        /* renamed from: d */
        OverScroller f3221d;

        /* renamed from: e */
        Interpolator f3222e;

        /* renamed from: f */
        private boolean f3223f = false;

        /* renamed from: g */
        private boolean f3224g = false;

        RunnableC0653c0() {
            Interpolator interpolator = RecyclerView.f3126j;
            this.f3222e = interpolator;
            this.f3221d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m3601a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m3602b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m3602b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m3603d() {
            RecyclerView.this.removeCallbacks(this);
            C1013s.m5750a0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo3956c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3220c = 0;
            this.f3219b = 0;
            Interpolator interpolator = this.f3222e;
            Interpolator interpolator2 = RecyclerView.f3126j;
            if (interpolator != interpolator2) {
                this.f3222e = interpolator2;
                this.f3221d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3221d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo3957e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3957e() {
            if (this.f3223f) {
                this.f3224g = true;
            } else {
                m3603d();
            }
        }

        /* renamed from: f */
        public void mo3958f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m3601a(i, i2, 0, 0);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.f3126j;
            }
            if (this.f3222e != interpolator) {
                this.f3222e = interpolator;
                this.f3221d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3220c = 0;
            this.f3219b = 0;
            RecyclerView.this.setScrollState(2);
            this.f3221d.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3221d.computeScrollOffset();
            }
            mo3957e();
        }

        /* renamed from: g */
        public void mo3959g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3221d.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3192w == null) {
                mo3959g();
                return;
            }
            this.f3224g = false;
            this.f3223f = true;
            recyclerView.mo3928u();
            OverScroller overScroller = this.f3221d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3219b;
                int i4 = currY - this.f3220c;
                this.f3219b = currX;
                this.f3220c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3136E0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo3782F(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3136E0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo3925t(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3190v != null) {
                    int[] iArr3 = recyclerView3.f3136E0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo3867j1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3136E0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    AbstractC0686z zVar = recyclerView4.f3192w.f3267g;
                    if (zVar != null && !zVar.mo4237g() && zVar.mo4238h()) {
                        int c = RecyclerView.this.f3183r0.mo3945c();
                        if (c == 0) {
                            zVar.mo4246r();
                        } else {
                            if (zVar.mo4236f() >= c) {
                                zVar.mo4244p(c - 1);
                            }
                            zVar.mo4240j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f3196y.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3136E0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo3784G(i, i2, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3136E0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo3788I(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC0686z zVar2 = RecyclerView.this.f3192w.f3267g;
                if ((zVar2 != null && zVar2.mo4237g()) || !z) {
                    mo3957e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0720e eVar = recyclerView7.f3179p0;
                    if (eVar != null) {
                        eVar.mo4409f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo3813a(i7, currVelocity);
                    }
                    if (RecyclerView.f3122f) {
                        RecyclerView.this.f3181q0.mo4415b();
                    }
                }
            }
            AbstractC0686z zVar3 = RecyclerView.this.f3192w.f3267g;
            if (zVar3 != null && zVar3.mo4237g()) {
                zVar3.mo4240j(0, 0);
            }
            this.f3223f = false;
            if (this.f3224g) {
                m3603d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo3935w1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0654d implements C0742p.AbstractC0744b {
        C0654d() {
        }

        @Override // androidx.recyclerview.widget.C0742p.AbstractC0744b
        /* renamed from: a */
        public void mo3961a(AbstractC0655d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3192w.mo4146t1(d0Var.f3228b, recyclerView.f3170l);
        }

        @Override // androidx.recyclerview.widget.C0742p.AbstractC0744b
        /* renamed from: b */
        public void mo3962b(AbstractC0655d0 d0Var, AbstractC0663l.C0666c cVar, AbstractC0663l.C0666c cVar2) {
            RecyclerView.this.mo3870l(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0742p.AbstractC0744b
        /* renamed from: c */
        public void mo3963c(AbstractC0655d0 d0Var, AbstractC0663l.C0666c cVar, AbstractC0663l.C0666c cVar2) {
            RecyclerView.this.f3170l.mo4198J(d0Var);
            RecyclerView.this.mo3873n(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0742p.AbstractC0744b
        /* renamed from: d */
        public void mo3964d(AbstractC0655d0 d0Var, AbstractC0663l.C0666c cVar, AbstractC0663l.C0666c cVar2) {
            d0Var.mo3971G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f3148N;
            AbstractC0663l lVar = recyclerView.f3157W;
            if (z) {
                if (!lVar.mo4045b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo4047d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.mo3799O0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class AbstractC0655d0 {

        /* renamed from: a */
        private static final List<Object> f3227a = Collections.emptyList();

        /* renamed from: b */
        public final View f3228b;

        /* renamed from: c */
        WeakReference<RecyclerView> f3229c;

        /* renamed from: d */
        int f3230d = -1;

        /* renamed from: e */
        int f3231e = -1;

        /* renamed from: f */
        long f3232f = -1;

        /* renamed from: g */
        int f3233g = -1;

        /* renamed from: h */
        int f3234h = -1;

        /* renamed from: i */
        AbstractC0655d0 f3235i = null;

        /* renamed from: j */
        AbstractC0655d0 f3236j = null;

        /* renamed from: k */
        int f3237k;

        /* renamed from: l */
        List<Object> f3238l = null;

        /* renamed from: m */
        List<Object> f3239m = null;

        /* renamed from: n */
        private int f3240n = 0;

        /* renamed from: o */
        C0681v f3241o = null;

        /* renamed from: p */
        boolean f3242p = false;

        /* renamed from: q */
        private int f3243q = 0;

        /* renamed from: r */
        int f3244r = -1;

        /* renamed from: s */
        RecyclerView f3245s;

        public AbstractC0655d0(View view) {
            if (view != null) {
                this.f3228b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m3612g() {
            if (this.f3238l == null) {
                ArrayList arrayList = new ArrayList();
                this.f3238l = arrayList;
                this.f3239m = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo3965A(int i, boolean z) {
            if (this.f3231e == -1) {
                this.f3231e = this.f3230d;
            }
            if (this.f3234h == -1) {
                this.f3234h = this.f3230d;
            }
            if (z) {
                this.f3234h += i;
            }
            this.f3230d += i;
            if (this.f3228b.getLayoutParams() != null) {
                ((C0674p) this.f3228b.getLayoutParams()).f3287c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo3966B(RecyclerView recyclerView) {
            int i = this.f3244r;
            if (i == -1) {
                i = C1013s.m5793w(this.f3228b);
            }
            this.f3243q = i;
            recyclerView.mo3872m1(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo3967C(RecyclerView recyclerView) {
            recyclerView.mo3872m1(this, this.f3243q);
            this.f3243q = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo3968D() {
            this.f3237k = 0;
            this.f3230d = -1;
            this.f3231e = -1;
            this.f3232f = -1;
            this.f3234h = -1;
            this.f3240n = 0;
            this.f3235i = null;
            this.f3236j = null;
            mo3980d();
            this.f3243q = 0;
            this.f3244r = -1;
            RecyclerView.m3495r(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo3969E() {
            if (this.f3231e == -1) {
                this.f3231e = this.f3230d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo3970F(int i, int i2) {
            this.f3237k = (i & i2) | (this.f3237k & (i2 ^ -1));
        }

        /* renamed from: G */
        public final void mo3971G(boolean z) {
            int i;
            int i2 = this.f3240n;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f3240n = i3;
            if (i3 < 0) {
                this.f3240n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3237k | 16;
            } else if (z && i3 == 0) {
                i = this.f3237k & -17;
            } else {
                return;
            }
            this.f3237k = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo3972H(C0681v vVar, boolean z) {
            this.f3241o = vVar;
            this.f3242p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo3973I() {
            return (this.f3237k & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo3974J() {
            return (this.f3237k & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo3975K() {
            this.f3241o.mo4198J(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo3976L() {
            return (this.f3237k & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3977a(Object obj) {
            if (obj == null) {
                mo3978b(1024);
            } else if ((1024 & this.f3237k) == 0) {
                m3612g();
                this.f3238l.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3978b(int i) {
            this.f3237k = i | this.f3237k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3979c() {
            this.f3231e = -1;
            this.f3234h = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3980d() {
            List<Object> list = this.f3238l;
            if (list != null) {
                list.clear();
            }
            this.f3237k &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3981e() {
            this.f3237k &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3982f() {
            this.f3237k &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo3983h() {
            return (this.f3237k & 16) == 0 && C1013s.m5734L(this.f3228b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3984i(int i, int i2, boolean z) {
            mo3978b(8);
            mo3965A(i2, z);
            this.f3230d = i;
        }

        /* renamed from: j */
        public final int mo3985j() {
            RecyclerView recyclerView = this.f3245s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo3817b0(this);
        }

        /* renamed from: k */
        public final long mo3986k() {
            return this.f3232f;
        }

        /* renamed from: l */
        public final int mo3987l() {
            return this.f3233g;
        }

        /* renamed from: m */
        public final int mo3988m() {
            int i = this.f3234h;
            return i == -1 ? this.f3230d : i;
        }

        /* renamed from: n */
        public final int mo3989n() {
            return this.f3231e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public List<Object> mo3990o() {
            if ((this.f3237k & 1024) != 0) {
                return f3227a;
            }
            List<Object> list = this.f3238l;
            return (list == null || list.size() == 0) ? f3227a : this.f3239m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo3991p(int i) {
            return (i & this.f3237k) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo3992q() {
            return (this.f3237k & 512) != 0 || mo3995t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo3993r() {
            return (this.f3228b.getParent() == null || this.f3228b.getParent() == this.f3245s) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo3994s() {
            return (this.f3237k & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo3995t() {
            return (this.f3237k & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3230d + " id=" + this.f3232f + ", oldPos=" + this.f3231e + ", pLpos:" + this.f3234h);
            if (mo3999w()) {
                sb.append(" scrap ");
                sb.append(this.f3242p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo3995t()) {
                sb.append(" invalid");
            }
            if (!mo3994s()) {
                sb.append(" unbound");
            }
            if (mo4002z()) {
                sb.append(" update");
            }
            if (mo3998v()) {
                sb.append(" removed");
            }
            if (mo3974J()) {
                sb.append(" ignored");
            }
            if (mo4000x()) {
                sb.append(" tmpDetached");
            }
            if (!mo3997u()) {
                sb.append(" not recyclable(" + this.f3240n + ")");
            }
            if (mo3992q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3228b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo3997u() {
            return (this.f3237k & 16) == 0 && !C1013s.m5734L(this.f3228b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo3998v() {
            return (this.f3237k & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo3999w() {
            return this.f3241o != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4000x() {
            return (this.f3237k & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4001y() {
            return (this.f3237k & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo4002z() {
            return (this.f3237k & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C0656e implements C0701b.AbstractC0703b {
        C0656e() {
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: a */
        public View mo4003a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: b */
        public void mo4004b(View view) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (g0 != null) {
                g0.mo3966B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: c */
        public void mo4005c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo3939z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: d */
        public void mo4006d() {
            int k = mo4013k();
            for (int i = 0; i < k; i++) {
                View a = mo4003a(i);
                RecyclerView.this.mo3939z(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: e */
        public AbstractC0655d0 mo4007e(View view) {
            return RecyclerView.m3485g0(view);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: f */
        public void mo4008f(int i) {
            AbstractC0655d0 g0;
            View a = mo4003a(i);
            if (!(a == null || (g0 = RecyclerView.m3485g0(a)) == null)) {
                if (!g0.mo4000x() || g0.mo3974J()) {
                    g0.mo3978b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + g0 + RecyclerView.this.mo3800P());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) i);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: g */
        public void mo4009g(View view) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (g0 != null) {
                g0.mo3967C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: h */
        public void mo4010h(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (g0 != null) {
                if (g0.mo4000x() || g0.mo3974J()) {
                    g0.mo3982f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g0 + RecyclerView.this.mo3800P());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: i */
        public void mo4011i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo3937y(view);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: j */
        public int mo4012j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0701b.AbstractC0703b
        /* renamed from: k */
        public int mo4013k() {
            return RecyclerView.this.getChildCount();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C0657f implements C0698a.AbstractC0699a {
        C0657f() {
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: a */
        public void mo4014a(int i, int i2) {
            RecyclerView.this.mo3781E0(i, i2);
            RecyclerView.this.f3189u0 = true;
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: b */
        public void mo4015b(C0698a.C0700b bVar) {
            mo4022i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: c */
        public AbstractC0655d0 mo4016c(int i) {
            AbstractC0655d0 Z = RecyclerView.this.mo3811Z(i, true);
            if (Z != null && !RecyclerView.this.f3176o.mo4356n(Z.f3228b)) {
                return Z;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: d */
        public void mo4017d(int i, int i2) {
            RecyclerView.this.mo3783F0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3189u0 = true;
            recyclerView.f3183r0.f3204d += i2;
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: e */
        public void mo4018e(int i, int i2) {
            RecyclerView.this.mo3783F0(i, i2, false);
            RecyclerView.this.f3189u0 = true;
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: f */
        public void mo4019f(C0698a.C0700b bVar) {
            mo4022i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: g */
        public void mo4020g(int i, int i2) {
            RecyclerView.this.mo3780D0(i, i2);
            RecyclerView.this.f3189u0 = true;
        }

        @Override // androidx.recyclerview.widget.C0698a.AbstractC0699a
        /* renamed from: h */
        public void mo4021h(int i, int i2, Object obj) {
            RecyclerView.this.mo3941z1(i, i2, obj);
            RecyclerView.this.f3191v0 = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4022i(C0698a.C0700b bVar) {
            int i = bVar.f3385a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3192w.mo3411X0(recyclerView, bVar.f3386b, bVar.f3388d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3192w.mo3421a1(recyclerView2, bVar.f3386b, bVar.f3388d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3192w.mo3709c1(recyclerView3, bVar.f3386b, bVar.f3388d, bVar.f3387c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3192w.mo3417Z0(recyclerView4, bVar.f3386b, bVar.f3388d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC0658g<VH extends AbstractC0655d0> {

        /* renamed from: a */
        private final C0659h f3248a = new C0659h();

        /* renamed from: b */
        private boolean f3249b = false;

        /* renamed from: a */
        public final void mo4023a(VH vh, int i) {
            vh.f3230d = i;
            if (mo4028g()) {
                vh.f3232f = mo4025d(i);
            }
            vh.mo3970F(1, 519);
            C0921a.m5394a("RV OnBindView");
            mo4031k(vh, i, vh.mo3990o());
            vh.mo3980d();
            ViewGroup.LayoutParams layoutParams = vh.f3228b.getLayoutParams();
            if (layoutParams instanceof C0674p) {
                ((C0674p) layoutParams).f3287c = true;
            }
            C0921a.m5395b();
        }

        /* renamed from: b */
        public final VH mo4024b(ViewGroup viewGroup, int i) {
            try {
                C0921a.m5394a("RV CreateView");
                VH l = mo3582l(viewGroup, i);
                if (l.f3228b.getParent() == null) {
                    l.f3233g = i;
                    return l;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0921a.m5395b();
            }
        }

        /* renamed from: c */
        public abstract int mo3580c();

        /* renamed from: d */
        public long mo4025d(int i) {
            return -1;
        }

        /* renamed from: e */
        public int mo4026e(int i) {
            return 0;
        }

        /* renamed from: f */
        public final boolean mo4027f() {
            return this.f3248a.mo4039a();
        }

        /* renamed from: g */
        public final boolean mo4028g() {
            return this.f3249b;
        }

        /* renamed from: h */
        public final void mo4029h() {
            this.f3248a.mo4040b();
        }

        /* renamed from: i */
        public void mo4030i(RecyclerView recyclerView) {
        }

        /* renamed from: j */
        public abstract void mo3581j(VH vh, int i);

        /* renamed from: k */
        public void mo4031k(VH vh, int i, List<Object> list) {
            mo3581j(vh, i);
        }

        /* renamed from: l */
        public abstract VH mo3582l(ViewGroup viewGroup, int i);

        /* renamed from: m */
        public void mo4032m(RecyclerView recyclerView) {
        }

        /* renamed from: n */
        public boolean mo4033n(VH vh) {
            return false;
        }

        /* renamed from: o */
        public void mo3583o(VH vh) {
        }

        /* renamed from: p */
        public void mo4034p(VH vh) {
        }

        /* renamed from: q */
        public void mo4035q(VH vh) {
        }

        /* renamed from: r */
        public void mo4036r(AbstractC0660i iVar) {
            this.f3248a.registerObserver(iVar);
        }

        /* renamed from: s */
        public void mo4037s(boolean z) {
            if (!mo4027f()) {
                this.f3249b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: t */
        public void mo4038t(AbstractC0660i iVar) {
            this.f3248a.unregisterObserver(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0659h extends Observable<AbstractC0660i> {
        C0659h() {
        }

        /* renamed from: a */
        public boolean mo4039a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4040b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0660i) ((Observable) this).mObservers.get(size)).mo4041a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC0660i {
        /* renamed from: a */
        public void mo4041a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface AbstractC0661j {
        /* renamed from: a */
        int mo4042a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0662k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4043a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0663l {

        /* renamed from: a */
        private AbstractC0665b f3250a = null;

        /* renamed from: b */
        private ArrayList<AbstractC0664a> f3251b = new ArrayList<>();

        /* renamed from: c */
        private long f3252c = 120;

        /* renamed from: d */
        private long f3253d = 120;

        /* renamed from: e */
        private long f3254e = 250;

        /* renamed from: f */
        private long f3255f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface AbstractC0664a {
            /* renamed from: a */
            void mo4065a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface AbstractC0665b {
            /* renamed from: a */
            void mo4066a(AbstractC0655d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0666c {

            /* renamed from: a */
            public int f3256a;

            /* renamed from: b */
            public int f3257b;

            /* renamed from: c */
            public int f3258c;

            /* renamed from: d */
            public int f3259d;

            /* renamed from: a */
            public C0666c mo4067a(AbstractC0655d0 d0Var) {
                return mo4068b(d0Var, 0);
            }

            /* renamed from: b */
            public C0666c mo4068b(AbstractC0655d0 d0Var, int i) {
                View view = d0Var.f3228b;
                this.f3256a = view.getLeft();
                this.f3257b = view.getTop();
                this.f3258c = view.getRight();
                this.f3259d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m3695e(AbstractC0655d0 d0Var) {
            int i = d0Var.f3237k & 14;
            if (d0Var.mo3995t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.mo3989n();
            int j = d0Var.mo3985j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo4044a(AbstractC0655d0 d0Var, C0666c cVar, C0666c cVar2);

        /* renamed from: b */
        public abstract boolean mo4045b(AbstractC0655d0 d0Var, AbstractC0655d0 d0Var2, C0666c cVar, C0666c cVar2);

        /* renamed from: c */
        public abstract boolean mo4046c(AbstractC0655d0 d0Var, C0666c cVar, C0666c cVar2);

        /* renamed from: d */
        public abstract boolean mo4047d(AbstractC0655d0 d0Var, C0666c cVar, C0666c cVar2);

        /* renamed from: f */
        public abstract boolean mo4048f(AbstractC0655d0 d0Var);

        /* renamed from: g */
        public boolean mo4049g(AbstractC0655d0 d0Var, List<Object> list) {
            return mo4048f(d0Var);
        }

        /* renamed from: h */
        public final void mo4050h(AbstractC0655d0 d0Var) {
            mo4060r(d0Var);
            AbstractC0665b bVar = this.f3250a;
            if (bVar != null) {
                bVar.mo4066a(d0Var);
            }
        }

        /* renamed from: i */
        public final void mo4051i() {
            int size = this.f3251b.size();
            for (int i = 0; i < size; i++) {
                this.f3251b.get(i).mo4065a();
            }
            this.f3251b.clear();
        }

        /* renamed from: j */
        public abstract void mo4052j(AbstractC0655d0 d0Var);

        /* renamed from: k */
        public abstract void mo4053k();

        /* renamed from: l */
        public long mo4054l() {
            return this.f3252c;
        }

        /* renamed from: m */
        public long mo4055m() {
            return this.f3255f;
        }

        /* renamed from: n */
        public long mo4056n() {
            return this.f3254e;
        }

        /* renamed from: o */
        public long mo4057o() {
            return this.f3253d;
        }

        /* renamed from: p */
        public abstract boolean mo4058p();

        /* renamed from: q */
        public C0666c mo4059q() {
            return new C0666c();
        }

        /* renamed from: r */
        public void mo4060r(AbstractC0655d0 d0Var) {
        }

        /* renamed from: s */
        public C0666c mo4061s(C0649a0 a0Var, AbstractC0655d0 d0Var) {
            return mo4059q().mo4067a(d0Var);
        }

        /* renamed from: t */
        public C0666c mo4062t(C0649a0 a0Var, AbstractC0655d0 d0Var, int i, List<Object> list) {
            return mo4059q().mo4067a(d0Var);
        }

        /* renamed from: u */
        public abstract void mo4063u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4064v(AbstractC0665b bVar) {
            this.f3250a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0667m implements AbstractC0663l.AbstractC0665b {
        C0667m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l.AbstractC0665b
        /* renamed from: a */
        public void mo4066a(AbstractC0655d0 d0Var) {
            d0Var.mo3971G(true);
            if (d0Var.f3235i != null && d0Var.f3236j == null) {
                d0Var.f3235i = null;
            }
            d0Var.f3236j = null;
            if (!d0Var.mo3973I() && !RecyclerView.this.mo3808X0(d0Var.f3228b) && d0Var.mo4000x()) {
                RecyclerView.this.removeDetachedView(d0Var.f3228b, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC0668n {
        @Deprecated
        /* renamed from: d */
        public void mo4069d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo4070e(Rect rect, View view, RecyclerView recyclerView, C0649a0 a0Var) {
            mo4069d(rect, ((C0674p) view.getLayoutParams()).mo4166b(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo4071f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo4072g(Canvas canvas, RecyclerView recyclerView, C0649a0 a0Var) {
            mo4071f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo4073h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo4074i(Canvas canvas, RecyclerView recyclerView, C0649a0 a0Var) {
            mo4073h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC0669o {

        /* renamed from: a */
        C0701b f3261a;

        /* renamed from: b */
        RecyclerView f3262b;

        /* renamed from: c */
        private final C0739o.AbstractC0741b f3263c;

        /* renamed from: d */
        private final C0739o.AbstractC0741b f3264d;

        /* renamed from: e */
        C0739o f3265e;

        /* renamed from: f */
        C0739o f3266f;

        /* renamed from: g */
        AbstractC0686z f3267g;

        /* renamed from: h */
        boolean f3268h = false;

        /* renamed from: i */
        boolean f3269i = false;

        /* renamed from: j */
        boolean f3270j = false;

        /* renamed from: k */
        private boolean f3271k = true;

        /* renamed from: l */
        private boolean f3272l = true;

        /* renamed from: m */
        int f3273m;

        /* renamed from: n */
        boolean f3274n;

        /* renamed from: o */
        private int f3275o;

        /* renamed from: p */
        private int f3276p;

        /* renamed from: q */
        private int f3277q;

        /* renamed from: r */
        private int f3278r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C0670a implements C0739o.AbstractC0741b {
            C0670a() {
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: a */
            public View mo4159a(int i) {
                return AbstractC0669o.this.mo4096L(i);
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: b */
            public int mo4160b() {
                return AbstractC0669o.this.mo4143s0() - AbstractC0669o.this.mo4129j0();
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: c */
            public int mo4161c() {
                return AbstractC0669o.this.mo4127i0();
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: d */
            public int mo4162d(View view) {
                return AbstractC0669o.this.mo3410X(view) + ((ViewGroup.MarginLayoutParams) ((C0674p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: e */
            public int mo4163e(View view) {
                return AbstractC0669o.this.mo3400U(view) - ((ViewGroup.MarginLayoutParams) ((C0674p) view.getLayoutParams())).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C0671b implements C0739o.AbstractC0741b {
            C0671b() {
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: a */
            public View mo4159a(int i) {
                return AbstractC0669o.this.mo4096L(i);
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: b */
            public int mo4160b() {
                return AbstractC0669o.this.mo4112a0() - AbstractC0669o.this.mo4124h0();
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: c */
            public int mo4161c() {
                return AbstractC0669o.this.mo4131k0();
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: d */
            public int mo4162d(View view) {
                return AbstractC0669o.this.mo3392S(view) + ((ViewGroup.MarginLayoutParams) ((C0674p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.C0739o.AbstractC0741b
            /* renamed from: e */
            public int mo4163e(View view) {
                return AbstractC0669o.this.mo3413Y(view) - ((ViewGroup.MarginLayoutParams) ((C0674p) view.getLayoutParams())).topMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface AbstractC0672c {
            /* renamed from: a */
            void mo4164a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0673d {

            /* renamed from: a */
            public int f3281a;

            /* renamed from: b */
            public int f3282b;

            /* renamed from: c */
            public boolean f3283c;

            /* renamed from: d */
            public boolean f3284d;
        }

        public AbstractC0669o() {
            C0670a aVar = new C0670a();
            this.f3263c = aVar;
            C0671b bVar = new C0671b();
            this.f3264d = bVar;
            this.f3265e = new C0739o(aVar);
            this.f3266f = new C0739o(bVar);
        }

        /* renamed from: B */
        private void m3728B(int i, View view) {
            this.f3261a.mo4348d(i);
        }

        /* renamed from: B0 */
        private static boolean m3729B0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: C1 */
        private void m3730C1(C0681v vVar, int i, View view) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (!g0.mo3974J()) {
                if (!g0.mo3995t() || g0.mo3998v() || this.f3262b.f3190v.mo4028g()) {
                    mo4075A(i);
                    vVar.mo4193D(view);
                    this.f3262b.f3178p.mo4499k(g0);
                    return;
                }
                mo4154x1(i);
                vVar.mo4192C(g0);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m3731N(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0669o.m3731N(int, int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m3732O(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0669o.m3732O(int, int, int, boolean):int");
        }

        /* renamed from: P */
        private int[] m3733P(View view, Rect rect) {
            int[] iArr = new int[2];
            int i0 = mo4127i0();
            int k0 = mo4131k0();
            int s0 = mo4143s0() - mo4129j0();
            int a0 = mo4112a0() - mo4124h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - i0;
            int min = Math.min(0, i);
            int i2 = top - k0;
            int min2 = Math.min(0, i2);
            int i3 = width - s0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - a0);
            if (mo4118d0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m3734f(View view, int i, boolean z) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (z || g0.mo3998v()) {
                this.f3262b.f3178p.mo4490b(g0);
            } else {
                this.f3262b.f3178p.mo4503p(g0);
            }
            C0674p pVar = (C0674p) view.getLayoutParams();
            if (g0.mo3976L() || g0.mo3999w()) {
                if (g0.mo3999w()) {
                    g0.mo3975K();
                } else {
                    g0.mo3981e();
                }
                this.f3261a.mo4347c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3262b) {
                int m = this.f3261a.mo4355m(view);
                if (i == -1) {
                    i = this.f3261a.mo4351g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3262b.indexOfChild(view) + this.f3262b.mo3800P());
                } else if (m != i) {
                    this.f3262b.f3192w.mo4088H0(m, i);
                }
            } else {
                this.f3261a.mo4345a(view, i, false);
                pVar.f3287c = true;
                AbstractC0686z zVar = this.f3267g;
                if (zVar != null && zVar.mo4238h()) {
                    this.f3267g.mo4241k(view);
                }
            }
            if (pVar.f3288d) {
                g0.f3228b.invalidate();
                pVar.f3288d = false;
            }
        }

        /* renamed from: m0 */
        public static C0673d m3735m0(Context context, AttributeSet attributeSet, int i, int i2) {
            C0673d dVar = new C0673d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1094c.f5020f, i, i2);
            dVar.f3281a = obtainStyledAttributes.getInt(C1094c.f5021g, 1);
            dVar.f3282b = obtainStyledAttributes.getInt(C1094c.f5031q, 1);
            dVar.f3283c = obtainStyledAttributes.getBoolean(C1094c.f5030p, false);
            dVar.f3284d = obtainStyledAttributes.getBoolean(C1094c.f5032r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: o */
        public static int m3736o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: y0 */
        private boolean m3737y0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int i0 = mo4127i0();
            int k0 = mo4131k0();
            int s0 = mo4143s0() - mo4129j0();
            int a0 = mo4112a0() - mo4124h0();
            Rect rect = this.f3262b.f3184s;
            mo3395T(focusedChild, rect);
            return rect.left - i < s0 && rect.right - i > i0 && rect.top - i2 < a0 && rect.bottom - i2 > k0;
        }

        /* renamed from: A */
        public void mo4075A(int i) {
            m3728B(i, mo4096L(i));
        }

        /* renamed from: A0 */
        public boolean mo4076A0(C0681v vVar, C0649a0 a0Var) {
            return false;
        }

        /* renamed from: A1 */
        public void mo4077A1() {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: B1 */
        public void mo4078B1() {
            this.f3268h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4079C(RecyclerView recyclerView) {
            this.f3269i = true;
            mo4099M0(recyclerView);
        }

        /* renamed from: C0 */
        public boolean mo4080C0() {
            AbstractC0686z zVar = this.f3267g;
            return zVar != null && zVar.mo4238h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4081D(RecyclerView recyclerView, C0681v vVar) {
            this.f3269i = false;
            mo3733O0(recyclerView, vVar);
        }

        /* renamed from: D0 */
        public boolean mo4082D0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3265e.mo4483b(view, 24579) && this.f3266f.mo4483b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: D1 */
        public int mo3359D1(int i, C0681v vVar, C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: E */
        public View mo4083E(View view) {
            View R;
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView == null || (R = recyclerView.mo3802R(view)) == null || this.f3261a.mo4356n(R)) {
                return null;
            }
            return R;
        }

        /* renamed from: E0 */
        public void mo4084E0(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C0674p) view.getLayoutParams()).f3286b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: E1 */
        public void mo3360E1(int i) {
        }

        /* renamed from: F */
        public View mo3728F(int i) {
            int M = mo4098M();
            for (int i2 = 0; i2 < M; i2++) {
                View L = mo4096L(i2);
                AbstractC0655d0 g0 = RecyclerView.m3485g0(L);
                if (g0 != null && g0.mo3988m() == i && !g0.mo3974J() && (this.f3262b.f3183r0.mo3950h() || !g0.mo3998v())) {
                    return L;
                }
            }
            return null;
        }

        /* renamed from: F0 */
        public void mo4085F0(View view, int i, int i2, int i3, int i4) {
            C0674p pVar = (C0674p) view.getLayoutParams();
            Rect rect = pVar.f3286b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        /* renamed from: F1 */
        public int mo3362F1(int i, C0681v vVar, C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: G */
        public abstract C0674p mo3364G();

        /* renamed from: G0 */
        public void mo4086G0(View view, int i, int i2) {
            C0674p pVar = (C0674p) view.getLayoutParams();
            Rect k0 = this.f3262b.mo3869k0(view);
            int i3 = i + k0.left + k0.right;
            int i4 = i2 + k0.top + k0.bottom;
            int N = m3731N(mo4143s0(), mo4145t0(), mo4127i0() + mo4129j0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, mo3451l());
            int N2 = m3731N(mo4112a0(), mo4114b0(), mo4131k0() + mo4124h0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, mo3454m());
            if (mo4102N1(view, N, N2, pVar)) {
                view.measure(N, N2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public void mo4087G1(RecyclerView recyclerView) {
            mo4091I1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: H */
        public C0674p mo3367H(Context context, AttributeSet attributeSet) {
            return new C0674p(context, attributeSet);
        }

        /* renamed from: H0 */
        public void mo4088H0(int i, int i2) {
            View L = mo4096L(i);
            if (L != null) {
                mo4075A(i);
                mo4126i(L, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3262b.toString());
        }

        /* renamed from: H1 */
        public final void mo4089H1(boolean z) {
            if (z != this.f3272l) {
                this.f3272l = z;
                this.f3273m = 0;
                RecyclerView recyclerView = this.f3262b;
                if (recyclerView != null) {
                    recyclerView.f3170l.mo4199K();
                }
            }
        }

        /* renamed from: I */
        public C0674p mo3370I(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0674p ? new C0674p((C0674p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0674p((ViewGroup.MarginLayoutParams) layoutParams) : new C0674p(layoutParams);
        }

        /* renamed from: I0 */
        public void mo4090I0(int i) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                recyclerView.mo3778B0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I1 */
        public void mo4091I1(int i, int i2) {
            this.f3277q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3275o = mode;
            if (mode == 0 && !RecyclerView.f3120d) {
                this.f3277q = 0;
            }
            this.f3278r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3276p = mode2;
            if (mode2 == 0 && !RecyclerView.f3120d) {
                this.f3278r = 0;
            }
        }

        /* renamed from: J */
        public int mo4092J() {
            return -1;
        }

        /* renamed from: J0 */
        public void mo4093J0(int i) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                recyclerView.mo3779C0(i);
            }
        }

        /* renamed from: J1 */
        public void mo4094J1(int i, int i2) {
            this.f3262b.setMeasuredDimension(i, i2);
        }

        /* renamed from: K */
        public int mo4095K(View view) {
            return ((C0674p) view.getLayoutParams()).f3286b.bottom;
        }

        /* renamed from: K0 */
        public void mo3375K0(AbstractC0658g gVar, AbstractC0658g gVar2) {
        }

        /* renamed from: K1 */
        public void mo3705K1(Rect rect, int i, int i2) {
            mo4094J1(m3736o(i, rect.width() + mo4127i0() + mo4129j0(), mo4122g0()), m3736o(i2, rect.height() + mo4131k0() + mo4124h0(), mo4121f0()));
        }

        /* renamed from: L */
        public View mo4096L(int i) {
            C0701b bVar = this.f3261a;
            if (bVar != null) {
                return bVar.mo4350f(i);
            }
            return null;
        }

        /* renamed from: L0 */
        public boolean mo3378L0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L1 */
        public void mo4097L1(int i, int i2) {
            int M = mo4098M();
            if (M == 0) {
                this.f3262b.mo3933w(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < M; i7++) {
                View L = mo4096L(i7);
                Rect rect = this.f3262b.f3184s;
                mo3395T(L, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3262b.f3184s.set(i5, i6, i3, i4);
            mo3705K1(this.f3262b.f3184s, i, i2);
        }

        /* renamed from: M */
        public int mo4098M() {
            C0701b bVar = this.f3261a;
            if (bVar != null) {
                return bVar.mo4351g();
            }
            return 0;
        }

        /* renamed from: M0 */
        public void mo4099M0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M1 */
        public void mo4100M1(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f3262b = null;
                this.f3261a = null;
                i = 0;
                this.f3277q = 0;
            } else {
                this.f3262b = recyclerView;
                this.f3261a = recyclerView.f3176o;
                this.f3277q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f3278r = i;
            this.f3275o = 1073741824;
            this.f3276p = 1073741824;
        }

        @Deprecated
        /* renamed from: N0 */
        public void mo4101N0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N1 */
        public boolean mo4102N1(View view, int i, int i2, C0674p pVar) {
            return view.isLayoutRequested() || !this.f3271k || !m3729B0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !m3729B0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        /* renamed from: O0 */
        public void mo3733O0(RecyclerView recyclerView, C0681v vVar) {
            mo4101N0(recyclerView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O1 */
        public boolean mo3734O1() {
            return false;
        }

        /* renamed from: P0 */
        public View mo3707P0(View view, int i, C0681v vVar, C0649a0 a0Var) {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P1 */
        public boolean mo4103P1(View view, int i, int i2, C0674p pVar) {
            return !this.f3271k || !m3729B0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !m3729B0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        /* renamed from: Q */
        public boolean mo4104Q() {
            RecyclerView recyclerView = this.f3262b;
            return recyclerView != null && recyclerView.f3180q;
        }

        /* renamed from: Q0 */
        public void mo3735Q0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3262b;
            mo4105R0(recyclerView.f3170l, recyclerView.f3183r0, accessibilityEvent);
        }

        /* renamed from: Q1 */
        public void mo3385Q1(RecyclerView recyclerView, C0649a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: R */
        public int mo3388R(C0681v vVar, C0649a0 a0Var) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView == null || recyclerView.f3190v == null || !mo3451l()) {
                return 1;
            }
            return this.f3262b.f3190v.mo3580c();
        }

        /* renamed from: R0 */
        public void mo4105R0(C0681v vVar, C0649a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3262b.canScrollVertically(-1) && !this.f3262b.canScrollHorizontally(-1) && !this.f3262b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC0658g gVar = this.f3262b.f3190v;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo3580c());
                }
            }
        }

        /* renamed from: R1 */
        public void mo3389R1(AbstractC0686z zVar) {
            AbstractC0686z zVar2 = this.f3267g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo4238h())) {
                this.f3267g.mo4246r();
            }
            this.f3267g = zVar;
            zVar.mo4245q(this.f3262b, this);
        }

        /* renamed from: S */
        public int mo3392S(View view) {
            return view.getBottom() + mo4095K(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: S0 */
        public void mo4106S0(C0979c cVar) {
            RecyclerView recyclerView = this.f3262b;
            mo3396T0(recyclerView.f3170l, recyclerView.f3183r0, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: S1 */
        public void mo4107S1() {
            AbstractC0686z zVar = this.f3267g;
            if (zVar != null) {
                zVar.mo4246r();
            }
        }

        /* renamed from: T */
        public void mo3395T(View view, Rect rect) {
            RecyclerView.m3487h0(view, rect);
        }

        /* renamed from: T0 */
        public void mo3396T0(C0681v vVar, C0649a0 a0Var, C0979c cVar) {
            if (this.f3262b.canScrollVertically(-1) || this.f3262b.canScrollHorizontally(-1)) {
                cVar.mo5469a(8192);
                cVar.mo5503t0(true);
            }
            if (this.f3262b.canScrollVertically(1) || this.f3262b.canScrollHorizontally(1)) {
                cVar.mo5469a(4096);
                cVar.mo5503t0(true);
            }
            cVar.mo5474c0(C0979c.C0981b.m5655b(mo3459o0(vVar, a0Var), mo3388R(vVar, a0Var), mo4076A0(vVar, a0Var), mo4138p0(vVar, a0Var)));
        }

        /* renamed from: T1 */
        public boolean mo3397T1() {
            return false;
        }

        /* renamed from: U */
        public int mo3400U(View view) {
            return view.getLeft() - mo4120e0(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U0 */
        public void mo4108U0(View view, C0979c cVar) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (g0 != null && !g0.mo3998v() && !this.f3261a.mo4356n(g0.f3228b)) {
                RecyclerView recyclerView = this.f3262b;
                mo3403V0(recyclerView.f3170l, recyclerView.f3183r0, view, cVar);
            }
        }

        /* renamed from: V */
        public int mo4109V(View view) {
            Rect rect = ((C0674p) view.getLayoutParams()).f3286b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: V0 */
        public void mo3403V0(C0681v vVar, C0649a0 a0Var, View view, C0979c cVar) {
            cVar.mo5476d0(C0979c.C0982c.m5656a(mo3454m() ? mo4133l0(view) : 0, 1, mo3451l() ? mo4133l0(view) : 0, 1, false, false));
        }

        /* renamed from: W */
        public int mo4110W(View view) {
            Rect rect = ((C0674p) view.getLayoutParams()).f3286b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: W0 */
        public View mo3406W0(View view, int i) {
            return null;
        }

        /* renamed from: X */
        public int mo3410X(View view) {
            return view.getRight() + mo4136n0(view);
        }

        /* renamed from: X0 */
        public void mo3411X0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: Y */
        public int mo3413Y(View view) {
            return view.getTop() - mo4140q0(view);
        }

        /* renamed from: Y0 */
        public void mo3414Y0(RecyclerView recyclerView) {
        }

        /* renamed from: Z */
        public View mo4111Z() {
            View focusedChild;
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3261a.mo4356n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: Z0 */
        public void mo3417Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a0 */
        public int mo4112a0() {
            return this.f3278r;
        }

        /* renamed from: a1 */
        public void mo3421a1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public void mo4113b(View view) {
            mo4115c(view, -1);
        }

        /* renamed from: b0 */
        public int mo4114b0() {
            return this.f3276p;
        }

        /* renamed from: b1 */
        public void mo3424b1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: c */
        public void mo4115c(View view, int i) {
            m3734f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo4116c0() {
            RecyclerView recyclerView = this.f3262b;
            AbstractC0658g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo3580c();
            }
            return 0;
        }

        /* renamed from: c1 */
        public void mo3709c1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo3424b1(recyclerView, i, i2);
        }

        /* renamed from: d */
        public void mo4117d(View view) {
            mo4119e(view, -1);
        }

        /* renamed from: d0 */
        public int mo4118d0() {
            return C1013s.m5797y(this.f3262b);
        }

        /* renamed from: d1 */
        public void mo3430d1(C0681v vVar, C0649a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: e */
        public void mo4119e(View view, int i) {
            m3734f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo4120e0(View view) {
            return ((C0674p) view.getLayoutParams()).f3286b.left;
        }

        /* renamed from: e1 */
        public void mo3433e1(C0649a0 a0Var) {
        }

        /* renamed from: f0 */
        public int mo4121f0() {
            return C1013s.m5799z(this.f3262b);
        }

        /* renamed from: f1 */
        public void mo3437f1(C0681v vVar, C0649a0 a0Var, int i, int i2) {
            this.f3262b.mo3933w(i, i2);
        }

        /* renamed from: g */
        public void mo3743g(String str) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                recyclerView.mo3876o(str);
            }
        }

        /* renamed from: g0 */
        public int mo4122g0() {
            return C1013s.m5722A(this.f3262b);
        }

        @Deprecated
        /* renamed from: g1 */
        public boolean mo3440g1(RecyclerView recyclerView, View view, View view2) {
            return mo4080C0() || recyclerView.mo3934w0();
        }

        /* renamed from: h */
        public void mo4123h(View view) {
            mo4126i(view, -1);
        }

        /* renamed from: h0 */
        public int mo4124h0() {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: h1 */
        public boolean mo4125h1(RecyclerView recyclerView, C0649a0 a0Var, View view, View view2) {
            return mo3440g1(recyclerView, view, view2);
        }

        /* renamed from: i */
        public void mo4126i(View view, int i) {
            mo4128j(view, i, (C0674p) view.getLayoutParams());
        }

        /* renamed from: i0 */
        public int mo4127i0() {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: i1 */
        public void mo3445i1(Parcelable parcelable) {
        }

        /* renamed from: j */
        public void mo4128j(View view, int i, C0674p pVar) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (g0.mo3998v()) {
                this.f3262b.f3178p.mo4490b(g0);
            } else {
                this.f3262b.f3178p.mo4503p(g0);
            }
            this.f3261a.mo4347c(view, i, pVar, g0.mo3998v());
        }

        /* renamed from: j0 */
        public int mo4129j0() {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: j1 */
        public Parcelable mo3447j1() {
            return null;
        }

        /* renamed from: k */
        public void mo4130k(View view, Rect rect) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo3869k0(view));
            }
        }

        /* renamed from: k0 */
        public int mo4131k0() {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: k1 */
        public void mo4132k1(int i) {
        }

        /* renamed from: l */
        public boolean mo3451l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo4133l0(View view) {
            return ((C0674p) view.getLayoutParams()).mo4166b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1 */
        public void mo4134l1(AbstractC0686z zVar) {
            if (this.f3267g == zVar) {
                this.f3267g = null;
            }
        }

        /* renamed from: m */
        public boolean mo3454m() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m1 */
        public boolean mo4135m1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3262b;
            return mo3457n1(recyclerView.f3170l, recyclerView.f3183r0, i, bundle);
        }

        /* renamed from: n */
        public boolean mo3713n(C0674p pVar) {
            return pVar != null;
        }

        /* renamed from: n0 */
        public int mo4136n0(View view) {
            return ((C0674p) view.getLayoutParams()).f3286b.right;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: n1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3457n1(androidx.recyclerview.widget.RecyclerView.C0681v r8, androidx.recyclerview.widget.RecyclerView.C0649a0 r9, int r10, android.os.Bundle r11) {
            /*
            // Method dump skipped, instructions count: 130
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0669o.mo3457n1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: o0 */
        public int mo3459o0(C0681v vVar, C0649a0 a0Var) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView == null || recyclerView.f3190v == null || !mo3454m()) {
                return 1;
            }
            return this.f3262b.f3190v.mo3580c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o1 */
        public boolean mo4137o1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3262b;
            return mo4139p1(recyclerView.f3170l, recyclerView.f3183r0, view, i, bundle);
        }

        /* renamed from: p */
        public void mo3462p(int i, int i2, C0649a0 a0Var, AbstractC0672c cVar) {
        }

        /* renamed from: p0 */
        public int mo4138p0(C0681v vVar, C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: p1 */
        public boolean mo4139p1(C0681v vVar, C0649a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: q */
        public void mo3466q(int i, AbstractC0672c cVar) {
        }

        /* renamed from: q0 */
        public int mo4140q0(View view) {
            return ((C0674p) view.getLayoutParams()).f3286b.top;
        }

        /* renamed from: q1 */
        public void mo4141q1() {
            for (int M = mo4098M() - 1; M >= 0; M--) {
                this.f3261a.mo4359q(M);
            }
        }

        /* renamed from: r */
        public int mo3749r(C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public void mo4142r0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0674p) view.getLayoutParams()).f3286b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3262b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3262b.f3188u;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: r1 */
        public void mo3470r1(C0681v vVar) {
            for (int M = mo4098M() - 1; M >= 0; M--) {
                if (!RecyclerView.m3485g0(mo4096L(M)).mo3974J()) {
                    mo4148u1(M, vVar);
                }
            }
        }

        /* renamed from: s */
        public int mo3715s(C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: s0 */
        public int mo4143s0() {
            return this.f3277q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s1 */
        public void mo4144s1(C0681v vVar) {
            int j = vVar.mo4210j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo4214n(i);
                AbstractC0655d0 g0 = RecyclerView.m3485g0(n);
                if (!g0.mo3974J()) {
                    g0.mo3971G(false);
                    if (g0.mo4000x()) {
                        this.f3262b.removeDetachedView(n, false);
                    }
                    AbstractC0663l lVar = this.f3262b.f3157W;
                    if (lVar != null) {
                        lVar.mo4052j(g0);
                    }
                    g0.mo3971G(true);
                    vVar.mo4223y(n);
                }
            }
            vVar.mo4205e();
            if (j > 0) {
                this.f3262b.invalidate();
            }
        }

        /* renamed from: t */
        public int mo3716t(C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: t0 */
        public int mo4145t0() {
            return this.f3275o;
        }

        /* renamed from: t1 */
        public void mo4146t1(View view, C0681v vVar) {
            mo4152w1(view);
            vVar.mo4191B(view);
        }

        /* renamed from: u */
        public int mo3750u(C0649a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u0 */
        public boolean mo4147u0() {
            int M = mo4098M();
            for (int i = 0; i < M; i++) {
                ViewGroup.LayoutParams layoutParams = mo4096L(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: u1 */
        public void mo4148u1(int i, C0681v vVar) {
            View L = mo4096L(i);
            mo4154x1(i);
            vVar.mo4191B(L);
        }

        /* renamed from: v */
        public int mo3717v(C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo4149v0() {
            RecyclerView recyclerView = this.f3262b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        /* renamed from: v1 */
        public boolean mo4150v1(Runnable runnable) {
            RecyclerView recyclerView = this.f3262b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: w */
        public int mo3718w(C0649a0 a0Var) {
            return 0;
        }

        /* renamed from: w0 */
        public boolean mo4151w0() {
            return this.f3269i;
        }

        /* renamed from: w1 */
        public void mo4152w1(View view) {
            this.f3261a.mo4358p(view);
        }

        /* renamed from: x */
        public void mo4153x(C0681v vVar) {
            for (int M = mo4098M() - 1; M >= 0; M--) {
                m3730C1(vVar, M, mo4096L(M));
            }
        }

        /* renamed from: x0 */
        public boolean mo3752x0() {
            return this.f3270j;
        }

        /* renamed from: x1 */
        public void mo4154x1(int i) {
            if (mo4096L(i) != null) {
                this.f3261a.mo4359q(i);
            }
        }

        /* renamed from: y */
        public void mo4155y(View view, C0681v vVar) {
            m3730C1(vVar, this.f3261a.mo4355m(view), view);
        }

        /* renamed from: y1 */
        public boolean mo3478y1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4158z1(recyclerView, view, rect, z, false);
        }

        /* renamed from: z */
        public void mo4156z(View view) {
            int m = this.f3261a.mo4355m(view);
            if (m >= 0) {
                m3728B(m, view);
            }
        }

        /* renamed from: z0 */
        public final boolean mo4157z0() {
            return this.f3272l;
        }

        /* renamed from: z1 */
        public boolean mo4158z1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] P = m3733P(view, rect);
            int i = P[0];
            int i2 = P[1];
            if ((z2 && !m3737y0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo3878o1(i, i2);
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0674p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0655d0 f3285a;

        /* renamed from: b */
        final Rect f3286b = new Rect();

        /* renamed from: c */
        boolean f3287c = true;

        /* renamed from: d */
        boolean f3288d = false;

        public C0674p(int i, int i2) {
            super(i, i2);
        }

        public C0674p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0674p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0674p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0674p(C0674p pVar) {
            super((ViewGroup.LayoutParams) pVar);
        }

        /* renamed from: a */
        public int mo4165a() {
            return this.f3285a.mo3985j();
        }

        /* renamed from: b */
        public int mo4166b() {
            return this.f3285a.mo3988m();
        }

        /* renamed from: c */
        public boolean mo4167c() {
            return this.f3285a.mo4001y();
        }

        /* renamed from: d */
        public boolean mo4168d() {
            return this.f3285a.mo3998v();
        }

        /* renamed from: e */
        public boolean mo4169e() {
            return this.f3285a.mo3995t();
        }

        /* renamed from: f */
        public boolean mo4170f() {
            return this.f3285a.mo4002z();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface AbstractC0675q {
        /* renamed from: a */
        void mo4171a(View view);

        /* renamed from: b */
        void mo4172b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC0676r {
        /* renamed from: a */
        public abstract boolean mo4173a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface AbstractC0677s {
        /* renamed from: a */
        boolean mo4174a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4175b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo4176c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC0678t {
        /* renamed from: a */
        public void mo4177a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo4178b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0679u {

        /* renamed from: a */
        SparseArray<C0680a> f3289a = new SparseArray<>();

        /* renamed from: b */
        private int f3290b = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class C0680a {

            /* renamed from: a */
            final ArrayList<AbstractC0655d0> f3291a = new ArrayList<>();

            /* renamed from: b */
            int f3292b = 5;

            /* renamed from: c */
            long f3293c = 0;

            /* renamed from: d */
            long f3294d = 0;

            C0680a() {
            }
        }

        /* renamed from: g */
        private C0680a m3902g(int i) {
            C0680a aVar = this.f3289a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0680a aVar2 = new C0680a();
            this.f3289a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4179a() {
            this.f3290b++;
        }

        /* renamed from: b */
        public void mo4180b() {
            for (int i = 0; i < this.f3289a.size(); i++) {
                this.f3289a.valueAt(i).f3291a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4181c() {
            this.f3290b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4182d(int i, long j) {
            C0680a g = m3902g(i);
            g.f3294d = mo4187j(g.f3294d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4183e(int i, long j) {
            C0680a g = m3902g(i);
            g.f3293c = mo4187j(g.f3293c, j);
        }

        /* renamed from: f */
        public AbstractC0655d0 mo4184f(int i) {
            C0680a aVar = this.f3289a.get(i);
            if (aVar == null || aVar.f3291a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0655d0> arrayList = aVar.f3291a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo3993r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4185h(AbstractC0658g gVar, AbstractC0658g gVar2, boolean z) {
            if (gVar != null) {
                mo4181c();
            }
            if (!z && this.f3290b == 0) {
                mo4180b();
            }
            if (gVar2 != null) {
                mo4179a();
            }
        }

        /* renamed from: i */
        public void mo4186i(AbstractC0655d0 d0Var) {
            int l = d0Var.mo3987l();
            ArrayList<AbstractC0655d0> arrayList = m3902g(l).f3291a;
            if (this.f3289a.get(l).f3292b > arrayList.size()) {
                d0Var.mo3968D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo4187j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4188k(int i, long j, long j2) {
            long j3 = m3902g(i).f3294d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4189l(int i, long j, long j2) {
            long j3 = m3902g(i).f3293c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0681v {

        /* renamed from: a */
        final ArrayList<AbstractC0655d0> f3295a;

        /* renamed from: b */
        ArrayList<AbstractC0655d0> f3296b = null;

        /* renamed from: c */
        final ArrayList<AbstractC0655d0> f3297c = new ArrayList<>();

        /* renamed from: d */
        private final List<AbstractC0655d0> f3298d;

        /* renamed from: e */
        private int f3299e;

        /* renamed from: f */
        int f3300f;

        /* renamed from: g */
        C0679u f3301g;

        /* renamed from: h */
        private AbstractC0651b0 f3302h;

        public C0681v() {
            ArrayList<AbstractC0655d0> arrayList = new ArrayList<>();
            this.f3295a = arrayList;
            this.f3298d = Collections.unmodifiableList(arrayList);
            this.f3299e = 2;
            this.f3300f = 2;
        }

        /* renamed from: H */
        private boolean m3914H(AbstractC0655d0 d0Var, int i, int i2, long j) {
            d0Var.f3245s = RecyclerView.this;
            int l = d0Var.mo3987l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3301g.mo4188k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3190v.mo4023a(d0Var, i);
            this.f3301g.mo4182d(d0Var.mo3987l(), RecyclerView.this.getNanoTime() - nanoTime);
            m3915b(d0Var);
            if (!RecyclerView.this.f3183r0.mo3950h()) {
                return true;
            }
            d0Var.f3234h = i2;
            return true;
        }

        /* renamed from: b */
        private void m3915b(AbstractC0655d0 d0Var) {
            if (RecyclerView.this.mo3931v0()) {
                View view = d0Var.f3228b;
                if (C1013s.m5793w(view) == 0) {
                    C1013s.m5786s0(view, 1);
                }
                C0732k kVar = RecyclerView.this.f3197y0;
                if (kVar != null) {
                    C0962a n = kVar.mo4452n();
                    if (n instanceof C0732k.C0733a) {
                        ((C0732k.C0733a) n).mo4459o(view);
                    }
                    C1013s.m5766i0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m3916q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3916q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m3917r(AbstractC0655d0 d0Var) {
            View view = d0Var.f3228b;
            if (view instanceof ViewGroup) {
                m3916q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4190A(int i) {
            mo4202a(this.f3297c.get(i), true);
            this.f3297c.remove(i);
        }

        /* renamed from: B */
        public void mo4191B(View view) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (g0.mo4000x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g0.mo3999w()) {
                g0.mo3975K();
            } else if (g0.mo3976L()) {
                g0.mo3981e();
            }
            mo4192C(g0);
            if (RecyclerView.this.f3157W != null && !g0.mo3997u()) {
                RecyclerView.this.f3157W.mo4052j(g0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4192C(AbstractC0655d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo3999w() || d0Var.f3228b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo3999w());
                sb.append(" isAttached:");
                if (d0Var.f3228b.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo3800P());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo4000x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.mo3800P());
            } else if (!d0Var.mo3974J()) {
                boolean h = d0Var.mo3983h();
                AbstractC0658g gVar = RecyclerView.this.f3190v;
                if ((gVar != null && h && gVar.mo4033n(d0Var)) || d0Var.mo3997u()) {
                    if (this.f3300f <= 0 || d0Var.mo3991p(526)) {
                        z = false;
                    } else {
                        int size = this.f3297c.size();
                        if (size >= this.f3300f && size > 0) {
                            mo4190A(0);
                            size--;
                        }
                        if (RecyclerView.f3122f && size > 0 && !RecyclerView.this.f3181q0.mo4417d(d0Var.f3230d)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f3181q0.mo4417d(this.f3297c.get(i).f3230d)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3297c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo4202a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.f3178p.mo4504q(d0Var);
                        if (!z2 && !z3 && h) {
                            d0Var.f3245s = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f3178p.mo4504q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo3800P());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4193D(View view) {
            ArrayList<AbstractC0655d0> arrayList;
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            if (!g0.mo3991p(12) && g0.mo4001y() && !RecyclerView.this.mo3890p(g0)) {
                if (this.f3296b == null) {
                    this.f3296b = new ArrayList<>();
                }
                g0.mo3972H(this, true);
                arrayList = this.f3296b;
            } else if (!g0.mo3995t() || g0.mo3998v() || RecyclerView.this.f3190v.mo4028g()) {
                g0.mo3972H(this, false);
                arrayList = this.f3295a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo3800P());
            }
            arrayList.add(g0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4194E(C0679u uVar) {
            C0679u uVar2 = this.f3301g;
            if (uVar2 != null) {
                uVar2.mo4181c();
            }
            this.f3301g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3301g.mo4179a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4195F(AbstractC0651b0 b0Var) {
        }

        /* renamed from: G */
        public void mo4196G(int i) {
            this.f3299e = i;
            mo4199K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01bf  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0655d0 mo4197I(int r17, boolean r18, long r19) {
            /*
            // Method dump skipped, instructions count: 533
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0681v.mo4197I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo4198J(AbstractC0655d0 d0Var) {
            (d0Var.f3242p ? this.f3296b : this.f3295a).remove(d0Var);
            d0Var.f3241o = null;
            d0Var.f3242p = false;
            d0Var.mo3981e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4199K() {
            AbstractC0669o oVar = RecyclerView.this.f3192w;
            this.f3300f = this.f3299e + (oVar != null ? oVar.f3273m : 0);
            for (int size = this.f3297c.size() - 1; size >= 0 && this.f3297c.size() > this.f3300f; size--) {
                mo4190A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4200L(AbstractC0655d0 d0Var) {
            if (d0Var.mo3998v()) {
                return RecyclerView.this.f3183r0.mo3950h();
            }
            int i = d0Var.f3230d;
            if (i < 0 || i >= RecyclerView.this.f3190v.mo3580c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.mo3800P());
            } else if (RecyclerView.this.f3183r0.mo3950h() || RecyclerView.this.f3190v.mo4026e(d0Var.f3230d) == d0Var.mo3987l()) {
                return !RecyclerView.this.f3190v.mo4028g() || d0Var.mo3986k() == RecyclerView.this.f3190v.mo4025d(d0Var.f3230d);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo4201M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3297c.size() - 1; size >= 0; size--) {
                AbstractC0655d0 d0Var = this.f3297c.get(size);
                if (d0Var != null && (i3 = d0Var.f3230d) >= i && i3 < i4) {
                    d0Var.mo3978b(2);
                    mo4190A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4202a(AbstractC0655d0 d0Var, boolean z) {
            RecyclerView.m3495r(d0Var);
            View view = d0Var.f3228b;
            C0732k kVar = RecyclerView.this.f3197y0;
            if (kVar != null) {
                C0962a n = kVar.mo4452n();
                C1013s.m5766i0(view, n instanceof C0732k.C0733a ? ((C0732k.C0733a) n).mo4458n(view) : null);
            }
            if (z) {
                mo4207g(d0Var);
            }
            d0Var.f3245s = null;
            mo4209i().mo4186i(d0Var);
        }

        /* renamed from: c */
        public void mo4203c() {
            this.f3295a.clear();
            mo4224z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4204d() {
            int size = this.f3297c.size();
            for (int i = 0; i < size; i++) {
                this.f3297c.get(i).mo3979c();
            }
            int size2 = this.f3295a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3295a.get(i2).mo3979c();
            }
            ArrayList<AbstractC0655d0> arrayList = this.f3296b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3296b.get(i3).mo3979c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4205e() {
            this.f3295a.clear();
            ArrayList<AbstractC0655d0> arrayList = this.f3296b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo4206f(int i) {
            if (i >= 0 && i < RecyclerView.this.f3183r0.mo3945c()) {
                return !RecyclerView.this.f3183r0.mo3950h() ? i : RecyclerView.this.f3174n.mo4333m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f3183r0.mo3945c() + RecyclerView.this.mo3800P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4207g(AbstractC0655d0 d0Var) {
            AbstractC0682w wVar = RecyclerView.this.f3194x;
            if (wVar != null) {
                wVar.mo3277a(d0Var);
            }
            AbstractC0658g gVar = RecyclerView.this.f3190v;
            if (gVar != null) {
                gVar.mo4035q(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3183r0 != null) {
                recyclerView.f3178p.mo4504q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public AbstractC0655d0 mo4208h(int i) {
            int size;
            int m;
            ArrayList<AbstractC0655d0> arrayList = this.f3296b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0655d0 d0Var = this.f3296b.get(i2);
                    if (!d0Var.mo3976L() && d0Var.mo3988m() == i) {
                        d0Var.mo3978b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f3190v.mo4028g() && (m = RecyclerView.this.f3174n.mo4333m(i)) > 0 && m < RecyclerView.this.f3190v.mo3580c()) {
                    long d = RecyclerView.this.f3190v.mo4025d(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0655d0 d0Var2 = this.f3296b.get(i3);
                        if (!d0Var2.mo3976L() && d0Var2.mo3986k() == d) {
                            d0Var2.mo3978b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0679u mo4209i() {
            if (this.f3301g == null) {
                this.f3301g = new C0679u();
            }
            return this.f3301g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo4210j() {
            return this.f3295a.size();
        }

        /* renamed from: k */
        public List<AbstractC0655d0> mo4211k() {
            return this.f3298d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public AbstractC0655d0 mo4212l(long j, int i, boolean z) {
            for (int size = this.f3295a.size() - 1; size >= 0; size--) {
                AbstractC0655d0 d0Var = this.f3295a.get(size);
                if (d0Var.mo3986k() == j && !d0Var.mo3976L()) {
                    if (i == d0Var.mo3987l()) {
                        d0Var.mo3978b(32);
                        if (d0Var.mo3998v() && !RecyclerView.this.f3183r0.mo3950h()) {
                            d0Var.mo3970F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3295a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3228b, false);
                        mo4223y(d0Var.f3228b);
                    }
                }
            }
            int size2 = this.f3297c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0655d0 d0Var2 = this.f3297c.get(size2);
                if (d0Var2.mo3986k() == j && !d0Var2.mo3993r()) {
                    if (i == d0Var2.mo3987l()) {
                        if (!z) {
                            this.f3297c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo4190A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public AbstractC0655d0 mo4213m(int i, boolean z) {
            View e;
            int size = this.f3295a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0655d0 d0Var = this.f3295a.get(i2);
                if (!d0Var.mo3976L() && d0Var.mo3988m() == i && !d0Var.mo3995t() && (RecyclerView.this.f3183r0.f3208h || !d0Var.mo3998v())) {
                    d0Var.mo3978b(32);
                    return d0Var;
                }
            }
            if (z || (e = RecyclerView.this.f3176o.mo4349e(i)) == null) {
                int size2 = this.f3297c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0655d0 d0Var2 = this.f3297c.get(i3);
                    if (!d0Var2.mo3995t() && d0Var2.mo3988m() == i && !d0Var2.mo3993r()) {
                        if (!z) {
                            this.f3297c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            AbstractC0655d0 g0 = RecyclerView.m3485g0(e);
            RecyclerView.this.f3176o.mo4361s(e);
            int m = RecyclerView.this.f3176o.mo4355m(e);
            if (m != -1) {
                RecyclerView.this.f3176o.mo4348d(m);
                mo4193D(e);
                g0.mo3978b(8224);
                return g0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g0 + RecyclerView.this.mo3800P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo4214n(int i) {
            return this.f3295a.get(i).f3228b;
        }

        /* renamed from: o */
        public View mo4215o(int i) {
            return mo4216p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo4216p(int i, boolean z) {
            return mo4197I(i, z, Long.MAX_VALUE).f3228b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4217s() {
            int size = this.f3297c.size();
            for (int i = 0; i < size; i++) {
                C0674p pVar = (C0674p) this.f3297c.get(i).f3228b.getLayoutParams();
                if (pVar != null) {
                    pVar.f3287c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4218t() {
            int size = this.f3297c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0655d0 d0Var = this.f3297c.get(i);
                if (d0Var != null) {
                    d0Var.mo3978b(6);
                    d0Var.mo3977a(null);
                }
            }
            AbstractC0658g gVar = RecyclerView.this.f3190v;
            if (gVar == null || !gVar.mo4028g()) {
                mo4224z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4219u(int i, int i2) {
            int size = this.f3297c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0655d0 d0Var = this.f3297c.get(i3);
                if (d0Var != null && d0Var.f3230d >= i) {
                    d0Var.mo3965A(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4220v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f3297c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0655d0 d0Var = this.f3297c.get(i7);
                if (d0Var != null && (i6 = d0Var.f3230d) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.mo3965A(i2 - i, false);
                    } else {
                        d0Var.mo3965A(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4221w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3297c.size() - 1; size >= 0; size--) {
                AbstractC0655d0 d0Var = this.f3297c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f3230d;
                    if (i4 >= i3) {
                        d0Var.mo3965A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo3978b(8);
                        mo4190A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo4222x(AbstractC0658g gVar, AbstractC0658g gVar2, boolean z) {
            mo4203c();
            mo4209i().mo4185h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo4223y(View view) {
            AbstractC0655d0 g0 = RecyclerView.m3485g0(view);
            g0.f3241o = null;
            g0.f3242p = false;
            g0.mo3981e();
            mo4192C(g0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4224z() {
            for (int size = this.f3297c.size() - 1; size >= 0; size--) {
                mo4190A(size);
            }
            this.f3297c.clear();
            if (RecyclerView.f3122f) {
                RecyclerView.this.f3181q0.mo4415b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface AbstractC0682w {
        /* renamed from: a */
        void mo3277a(AbstractC0655d0 d0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public class C0683x extends AbstractC0660i {
        C0683x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0660i
        /* renamed from: a */
        public void mo4041a() {
            RecyclerView.this.mo3876o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3183r0.f3207g = true;
            recyclerView.mo3803R0(true);
            if (!RecyclerView.this.f3174n.mo4336p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0684y extends AbstractC1041a {
        public static final Parcelable.Creator<C0684y> CREATOR = new C0685a();

        /* renamed from: d */
        Parcelable f3305d;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C0685a implements Parcelable.ClassLoaderCreator<C0684y> {
            C0685a() {
            }

            /* renamed from: a */
            public C0684y createFromParcel(Parcel parcel) {
                return new C0684y(parcel, null);
            }

            /* renamed from: b */
            public C0684y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0684y(parcel, classLoader);
            }

            /* renamed from: c */
            public C0684y[] newArray(int i) {
                return new C0684y[i];
            }
        }

        C0684y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3305d = parcel.readParcelable(classLoader == null ? AbstractC0669o.class.getClassLoader() : classLoader);
        }

        C0684y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4225g(C0684y yVar) {
            this.f3305d = yVar.f3305d;
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3305d, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC0686z {

        /* renamed from: a */
        private int f3306a = -1;

        /* renamed from: b */
        private RecyclerView f3307b;

        /* renamed from: c */
        private AbstractC0669o f3308c;

        /* renamed from: d */
        private boolean f3309d;

        /* renamed from: e */
        private boolean f3310e;

        /* renamed from: f */
        private View f3311f;

        /* renamed from: g */
        private final C0687a f3312g = new C0687a(0, 0);

        /* renamed from: h */
        private boolean f3313h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0687a {

            /* renamed from: a */
            private int f3314a;

            /* renamed from: b */
            private int f3315b;

            /* renamed from: c */
            private int f3316c;

            /* renamed from: d */
            private int f3317d;

            /* renamed from: e */
            private Interpolator f3318e;

            /* renamed from: f */
            private boolean f3319f;

            /* renamed from: g */
            private int f3320g;

            public C0687a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public C0687a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3317d = -1;
                this.f3319f = false;
                this.f3320g = 0;
                this.f3314a = i;
                this.f3315b = i2;
                this.f3316c = i3;
                this.f3318e = interpolator;
            }

            /* renamed from: e */
            private void m3977e() {
                if (this.f3318e != null && this.f3316c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3316c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4247a() {
                return this.f3317d >= 0;
            }

            /* renamed from: b */
            public void mo4248b(int i) {
                this.f3317d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo4249c(RecyclerView recyclerView) {
                int i = this.f3317d;
                if (i >= 0) {
                    this.f3317d = -1;
                    recyclerView.mo3938y0(i);
                    this.f3319f = false;
                } else if (this.f3319f) {
                    m3977e();
                    recyclerView.f3177o0.mo3958f(this.f3314a, this.f3315b, this.f3316c, this.f3318e);
                    int i2 = this.f3320g + 1;
                    this.f3320g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3319f = false;
                } else {
                    this.f3320g = 0;
                }
            }

            /* renamed from: d */
            public void mo4250d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3314a = i;
                this.f3315b = i2;
                this.f3316c = i3;
                this.f3318e = interpolator;
                this.f3319f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface AbstractC0688b {
            /* renamed from: a */
            PointF mo3738a(int i);
        }

        /* renamed from: a */
        public PointF mo3481a(int i) {
            AbstractC0669o e = mo4235e();
            if (e instanceof AbstractC0688b) {
                return ((AbstractC0688b) e).mo3738a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + AbstractC0688b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo4232b(int i) {
            return this.f3307b.f3192w.mo3728F(i);
        }

        /* renamed from: c */
        public int mo4233c() {
            return this.f3307b.f3192w.mo4098M();
        }

        /* renamed from: d */
        public int mo4234d(View view) {
            return this.f3307b.mo3837e0(view);
        }

        /* renamed from: e */
        public AbstractC0669o mo4235e() {
            return this.f3308c;
        }

        /* renamed from: f */
        public int mo4236f() {
            return this.f3306a;
        }

        /* renamed from: g */
        public boolean mo4237g() {
            return this.f3309d;
        }

        /* renamed from: h */
        public boolean mo4238h() {
            return this.f3310e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4239i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4240j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f3307b;
            if (this.f3306a == -1 || recyclerView == null) {
                mo4246r();
            }
            if (this.f3309d && this.f3311f == null && this.f3308c != null && (a = mo3481a(this.f3306a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo3867j1((int) Math.signum(f), (int) Math.signum(a.y), null);
                }
            }
            this.f3309d = false;
            View view = this.f3311f;
            if (view != null) {
                if (mo4234d(view) == this.f3306a) {
                    mo3484o(this.f3311f, recyclerView.f3183r0, this.f3312g);
                    this.f3312g.mo4249c(recyclerView);
                    mo4246r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3311f = null;
                }
            }
            if (this.f3310e) {
                mo4242l(i, i2, recyclerView.f3183r0, this.f3312g);
                boolean a2 = this.f3312g.mo4247a();
                this.f3312g.mo4249c(recyclerView);
                if (a2 && this.f3310e) {
                    this.f3309d = true;
                    recyclerView.f3177o0.mo3957e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo4241k(View view) {
            if (mo4234d(view) == mo4236f()) {
                this.f3311f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo4242l(int i, int i2, C0649a0 a0Var, C0687a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo4243m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo3483n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo3484o(View view, C0649a0 a0Var, C0687a aVar);

        /* renamed from: p */
        public void mo4244p(int i) {
            this.f3306a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4245q(RecyclerView recyclerView, AbstractC0669o oVar) {
            recyclerView.f3177o0.mo3959g();
            if (this.f3313h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3307b = recyclerView;
            this.f3308c = oVar;
            int i = this.f3306a;
            if (i != -1) {
                recyclerView.f3183r0.f3201a = i;
                this.f3310e = true;
                this.f3309d = true;
                this.f3311f = mo4232b(mo4236f());
                mo4243m();
                this.f3307b.f3177o0.mo3957e();
                this.f3313h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo4246r() {
            if (this.f3310e) {
                this.f3310e = false;
                mo3483n();
                this.f3307b.f3183r0.f3201a = -1;
                this.f3311f = null;
                this.f3306a = -1;
                this.f3309d = false;
                this.f3308c.mo4134l1(this);
                this.f3308c = null;
                this.f3307b = null;
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3119c = i == 18 || i == 19 || i == 20;
        f3120d = i >= 23;
        f3121e = i >= 16;
        f3122f = i >= 21;
        f3123g = i <= 15;
        f3124h = i <= 15;
        Class<?> cls = Integer.TYPE;
        f3125i = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1092a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3168k = new C0683x();
        this.f3170l = new C0681v();
        this.f3178p = new C0742p();
        this.f3182r = new RunnableC0648a();
        this.f3184s = new Rect();
        this.f3186t = new Rect();
        this.f3188u = new RectF();
        this.f3196y = new ArrayList<>();
        this.f3198z = new ArrayList<>();
        this.f3137F = 0;
        this.f3148N = false;
        this.f3149O = false;
        this.f3150P = 0;
        this.f3151Q = 0;
        this.f3152R = new C0662k();
        this.f3157W = new C0704c();
        this.f3158a0 = 0;
        this.f3159b0 = -1;
        this.f3171l0 = Float.MIN_VALUE;
        this.f3173m0 = Float.MIN_VALUE;
        boolean z = true;
        this.f3175n0 = true;
        this.f3177o0 = new RunnableC0653c0();
        this.f3181q0 = f3122f ? new RunnableC0720e.C0722b() : null;
        this.f3183r0 = new C0649a0();
        this.f3189u0 = false;
        this.f3191v0 = false;
        this.f3193w0 = new C0667m();
        this.f3195x0 = false;
        this.f3128A0 = new int[2];
        this.f3132C0 = new int[2];
        this.f3134D0 = new int[2];
        this.f3136E0 = new int[2];
        this.f3138F0 = new ArrayList();
        this.f3140G0 = new RunnableC0650b();
        this.f3142H0 = new C0654d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3165h0 = viewConfiguration.getScaledTouchSlop();
        this.f3171l0 = C1025t.m5841b(viewConfiguration, context);
        this.f3173m0 = C1025t.m5843d(viewConfiguration, context);
        this.f3167j0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3169k0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3157W.mo4064v(this.f3193w0);
        mo3892q0();
        m3497s0();
        m3496r0();
        if (C1013s.m5793w(this) == 0) {
            C1013s.m5786s0(this, 1);
        }
        this.f3146L = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0732k(this));
        int[] iArr = C1094c.f5020f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C1094c.f5029o);
        if (obtainStyledAttributes.getInt(C1094c.f5023i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3180q = obtainStyledAttributes.getBoolean(C1094c.f5022h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C1094c.f5024j, false);
        this.f3133D = z2;
        if (z2) {
            mo3926t0((StateListDrawable) obtainStyledAttributes.getDrawable(C1094c.f5027m), obtainStyledAttributes.getDrawable(C1094c.f5028n), (StateListDrawable) obtainStyledAttributes.getDrawable(C1094c.f5025k), obtainStyledAttributes.getDrawable(C1094c.f5026l));
        }
        obtainStyledAttributes.recycle();
        m3498v(context, string, attributeSet, i, 0);
        if (i2 >= 21) {
            int[] iArr2 = f3118b;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            if (i2 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m3462A() {
        int i = this.f3144J;
        this.f3144J = 0;
        if (i != 0 && mo3931v0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0978b.m5569b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: C */
    private void m3463C() {
        boolean z = true;
        this.f3183r0.mo3943a(1);
        mo3801Q(this.f3183r0);
        this.f3183r0.f3210j = false;
        mo3927t1();
        this.f3178p.mo4494f();
        mo3789I0();
        m3469Q0();
        m3486g1();
        C0649a0 a0Var = this.f3183r0;
        if (!a0Var.f3211k || !this.f3191v0) {
            z = false;
        }
        a0Var.f3209i = z;
        this.f3191v0 = false;
        this.f3189u0 = false;
        a0Var.f3208h = a0Var.f3212l;
        a0Var.f3206f = this.f3190v.mo3580c();
        m3472U(this.f3128A0);
        if (this.f3183r0.f3211k) {
            int g = this.f3176o.mo4351g();
            for (int i = 0; i < g; i++) {
                AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4350f(i));
                if (!g0.mo3974J() && (!g0.mo3995t() || this.f3190v.mo4028g())) {
                    this.f3178p.mo4493e(g0, this.f3157W.mo4062t(this.f3183r0, g0, AbstractC0663l.m3695e(g0), g0.mo3990o()));
                    if (this.f3183r0.f3209i && g0.mo4001y() && !g0.mo3998v() && !g0.mo3974J() && !g0.mo3995t()) {
                        this.f3178p.mo4491c(mo3819c0(g0), g0);
                    }
                }
            }
        }
        if (this.f3183r0.f3212l) {
            mo3860h1();
            C0649a0 a0Var2 = this.f3183r0;
            boolean z2 = a0Var2.f3207g;
            a0Var2.f3207g = false;
            this.f3192w.mo3430d1(this.f3170l, a0Var2);
            this.f3183r0.f3207g = z2;
            for (int i2 = 0; i2 < this.f3176o.mo4351g(); i2++) {
                AbstractC0655d0 g02 = m3485g0(this.f3176o.mo4350f(i2));
                if (!g02.mo3974J() && !this.f3178p.mo4497i(g02)) {
                    int e = AbstractC0663l.m3695e(g02);
                    boolean p = g02.mo3991p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    AbstractC0663l.C0666c t = this.f3157W.mo4062t(this.f3183r0, g02, e, g02.mo3990o());
                    if (p) {
                        mo3805T0(g02, t);
                    } else {
                        this.f3178p.mo4489a(g02, t);
                    }
                }
            }
        }
        mo3900s();
        mo3791J0();
        mo3932v1(false);
        this.f3183r0.f3205e = 2;
    }

    /* renamed from: D */
    private void m3464D() {
        mo3927t1();
        mo3789I0();
        this.f3183r0.mo3943a(6);
        this.f3174n.mo4331j();
        this.f3183r0.f3206f = this.f3190v.mo3580c();
        C0649a0 a0Var = this.f3183r0;
        a0Var.f3204d = 0;
        a0Var.f3208h = false;
        this.f3192w.mo3430d1(this.f3170l, a0Var);
        C0649a0 a0Var2 = this.f3183r0;
        a0Var2.f3207g = false;
        this.f3172m = null;
        a0Var2.f3211k = a0Var2.f3211k && this.f3157W != null;
        a0Var2.f3205e = 4;
        mo3791J0();
        mo3932v1(false);
    }

    /* renamed from: E */
    private void m3465E() {
        this.f3183r0.mo3943a(4);
        mo3927t1();
        mo3789I0();
        C0649a0 a0Var = this.f3183r0;
        a0Var.f3205e = 1;
        if (a0Var.f3211k) {
            for (int g = this.f3176o.mo4351g() - 1; g >= 0; g--) {
                AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4350f(g));
                if (!g0.mo3974J()) {
                    long c0 = mo3819c0(g0);
                    AbstractC0663l.C0666c s = this.f3157W.mo4061s(this.f3183r0, g0);
                    AbstractC0655d0 g2 = this.f3178p.mo4495g(c0);
                    if (g2 != null && !g2.mo3974J()) {
                        boolean h = this.f3178p.mo4496h(g2);
                        boolean h2 = this.f3178p.mo4496h(g0);
                        if (!h || g2 != g0) {
                            AbstractC0663l.C0666c n = this.f3178p.mo4501n(g2);
                            this.f3178p.mo4492d(g0, s);
                            AbstractC0663l.C0666c m = this.f3178p.mo4500m(g0);
                            if (n == null) {
                                m3492m0(c0, g0, g2);
                            } else {
                                m3491m(g2, g0, n, m, h, h2);
                            }
                        }
                    }
                    this.f3178p.mo4492d(g0, s);
                }
            }
            this.f3178p.mo4502o(this.f3142H0);
        }
        this.f3192w.mo4144s1(this.f3170l);
        C0649a0 a0Var2 = this.f3183r0;
        a0Var2.f3203c = a0Var2.f3206f;
        this.f3148N = false;
        this.f3149O = false;
        a0Var2.f3211k = false;
        a0Var2.f3212l = false;
        this.f3192w.f3268h = false;
        ArrayList<AbstractC0655d0> arrayList = this.f3170l.f3296b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0669o oVar = this.f3192w;
        if (oVar.f3274n) {
            oVar.f3273m = 0;
            oVar.f3274n = false;
            this.f3170l.mo4199K();
        }
        this.f3192w.mo3433e1(this.f3183r0);
        mo3791J0();
        mo3932v1(false);
        this.f3178p.mo4494f();
        int[] iArr = this.f3128A0;
        if (m3499x(iArr[0], iArr[1])) {
            mo3788I(0, 0);
        }
        m3473U0();
        m3481e1();
    }

    /* renamed from: K */
    private boolean m3466K(MotionEvent motionEvent) {
        AbstractC0677s sVar = this.f3127A;
        if (sVar != null) {
            sVar.mo4175b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f3127A = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m3471T(motionEvent);
        }
    }

    /* renamed from: L0 */
    private void m3467L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3159b0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3159b0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3163f0 = x;
            this.f3161d0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3164g0 = y;
            this.f3162e0 = y;
        }
    }

    /* renamed from: P0 */
    private boolean m3468P0() {
        return this.f3157W != null && this.f3192w.mo3397T1();
    }

    /* renamed from: Q0 */
    private void m3469Q0() {
        boolean z;
        if (this.f3148N) {
            this.f3174n.mo4340u();
            if (this.f3149O) {
                this.f3192w.mo3414Y0(this);
            }
        }
        if (m3468P0()) {
            this.f3174n.mo4338s();
        } else {
            this.f3174n.mo4331j();
        }
        boolean z2 = false;
        boolean z3 = this.f3189u0 || this.f3191v0;
        this.f3183r0.f3211k = this.f3135E && this.f3157W != null && ((z = this.f3148N) || z3 || this.f3192w.f3268h) && (!z || this.f3190v.mo4028g());
        C0649a0 a0Var = this.f3183r0;
        if (a0Var.f3211k && z3 && !this.f3148N && m3468P0()) {
            z2 = true;
        }
        a0Var.f3212l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3470S0(float r7, float r8, float r9, float r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3470S0(float, float, float, float):void");
    }

    /* renamed from: T */
    private boolean m3471T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3198z.size();
        for (int i = 0; i < size; i++) {
            AbstractC0677s sVar = this.f3198z.get(i);
            if (sVar.mo4174a(this, motionEvent) && action != 3) {
                this.f3127A = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    private void m3472U(int[] iArr) {
        int g = this.f3176o.mo4351g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4350f(i3));
            if (!g0.mo3974J()) {
                int m = g0.mo3988m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: U0 */
    private void m3473U0() {
        View findViewById;
        if (this.f3175n0 && this.f3190v != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3124h || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3176o.mo4356n(focusedChild)) {
                            return;
                        }
                    } else if (this.f3176o.mo4351g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                AbstractC0655d0 Y = (this.f3183r0.f3214n == -1 || !this.f3190v.mo4028g()) ? null : mo3809Y(this.f3183r0.f3214n);
                if (Y != null && !this.f3176o.mo4356n(Y.f3228b) && Y.f3228b.hasFocusable()) {
                    view = Y.f3228b;
                } else if (this.f3176o.mo4351g() > 0) {
                    view = m3476W();
                }
                if (view != null) {
                    int i = this.f3183r0.f3215o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: V */
    static RecyclerView m3474V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView V = m3474V(viewGroup.getChildAt(i));
            if (V != null) {
                return V;
            }
        }
        return null;
    }

    /* renamed from: V0 */
    private void m3475V0() {
        boolean z;
        EdgeEffect edgeEffect = this.f3153S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3153S.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3154T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3154T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3155U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3155U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3156V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3156V.isFinished();
        }
        if (z) {
            C1013s.m5748Z(this);
        }
    }

    /* renamed from: W */
    private View m3476W() {
        AbstractC0655d0 X;
        C0649a0 a0Var = this.f3183r0;
        int i = a0Var.f3213m;
        if (i == -1) {
            i = 0;
        }
        int c = a0Var.mo3945c();
        for (int i2 = i; i2 < c; i2++) {
            AbstractC0655d0 X2 = mo3807X(i2);
            if (X2 == null) {
                break;
            } else if (X2.f3228b.hasFocusable()) {
                return X2.f3228b;
            }
        }
        int min = Math.min(c, i);
        while (true) {
            min--;
            if (min < 0 || (X = mo3807X(min)) == null) {
                return null;
            }
            if (X.f3228b.hasFocusable()) {
                return X.f3228b;
            }
        }
    }

    /* renamed from: d1 */
    private void m3479d1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3184s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0674p) {
            C0674p pVar = (C0674p) layoutParams;
            if (!pVar.f3287c) {
                Rect rect = pVar.f3286b;
                Rect rect2 = this.f3184s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3184s);
            offsetRectIntoDescendantCoords(view, this.f3184s);
        }
        this.f3192w.mo4158z1(this, view, this.f3184s, !this.f3135E, view2 == null);
    }

    /* renamed from: e1 */
    private void m3481e1() {
        C0649a0 a0Var = this.f3183r0;
        a0Var.f3214n = -1;
        a0Var.f3213m = -1;
        a0Var.f3215o = -1;
    }

    /* renamed from: f1 */
    private void m3483f1() {
        VelocityTracker velocityTracker = this.f3160c0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo3935w1(0);
        m3475V0();
    }

    /* renamed from: g */
    private void m3484g(AbstractC0655d0 d0Var) {
        View view = d0Var.f3228b;
        boolean z = view.getParent() == this;
        this.f3170l.mo4198J(mo3838f0(view));
        if (d0Var.mo4000x()) {
            this.f3176o.mo4347c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0701b bVar = this.f3176o;
        if (!z) {
            bVar.mo4346b(view, true);
        } else {
            bVar.mo4354k(view);
        }
    }

    /* renamed from: g0 */
    static AbstractC0655d0 m3485g0(View view) {
        if (view == null) {
            return null;
        }
        return ((C0674p) view.getLayoutParams()).f3285a;
    }

    /* renamed from: g1 */
    private void m3486g1() {
        AbstractC0655d0 d0Var = null;
        View focusedChild = (!this.f3175n0 || !hasFocus() || this.f3190v == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = mo3804S(focusedChild);
        }
        if (d0Var == null) {
            m3481e1();
            return;
        }
        this.f3183r0.f3214n = this.f3190v.mo4028g() ? d0Var.mo3986k() : -1;
        this.f3183r0.f3213m = this.f3148N ? -1 : d0Var.mo3998v() ? d0Var.f3231e : d0Var.mo3985j();
        this.f3183r0.f3215o = m3488i0(d0Var.f3228b);
    }

    private C1005k getScrollingChildHelper() {
        if (this.f3130B0 == null) {
            this.f3130B0 = new C1005k(this);
        }
        return this.f3130B0;
    }

    /* renamed from: h0 */
    static void m3487h0(View view, Rect rect) {
        C0674p pVar = (C0674p) view.getLayoutParams();
        Rect rect2 = pVar.f3286b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    /* renamed from: i0 */
    private int m3488i0(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: j0 */
    private String m3489j0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: l1 */
    private void m3490l1(AbstractC0658g gVar, boolean z, boolean z2) {
        AbstractC0658g gVar2 = this.f3190v;
        if (gVar2 != null) {
            gVar2.mo4038t(this.f3168k);
            this.f3190v.mo4032m(this);
        }
        if (!z || z2) {
            mo3806W0();
        }
        this.f3174n.mo4340u();
        AbstractC0658g gVar3 = this.f3190v;
        this.f3190v = gVar;
        if (gVar != null) {
            gVar.mo4036r(this.f3168k);
            gVar.mo4030i(this);
        }
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo3375K0(gVar3, this.f3190v);
        }
        this.f3170l.mo4222x(gVar3, this.f3190v, z);
        this.f3183r0.f3207g = true;
    }

    /* renamed from: m */
    private void m3491m(AbstractC0655d0 d0Var, AbstractC0655d0 d0Var2, AbstractC0663l.C0666c cVar, AbstractC0663l.C0666c cVar2, boolean z, boolean z2) {
        d0Var.mo3971G(false);
        if (z) {
            m3484g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m3484g(d0Var2);
            }
            d0Var.f3235i = d0Var2;
            m3484g(d0Var);
            this.f3170l.mo4198J(d0Var);
            d0Var2.mo3971G(false);
            d0Var2.f3236j = d0Var;
        }
        if (this.f3157W.mo4045b(d0Var, d0Var2, cVar, cVar2)) {
            mo3799O0();
        }
    }

    /* renamed from: m0 */
    private void m3492m0(long j, AbstractC0655d0 d0Var, AbstractC0655d0 d0Var2) {
        int g = this.f3176o.mo4351g();
        for (int i = 0; i < g; i++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4350f(i));
            if (g0 != d0Var && mo3819c0(g0) == j) {
                AbstractC0658g gVar = this.f3190v;
                if (gVar == null || !gVar.mo4028g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g0 + " \n View Holder 2:" + d0Var + mo3800P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g0 + " \n View Holder 2:" + d0Var + mo3800P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + mo3800P());
    }

    /* renamed from: p0 */
    private boolean m3493p0() {
        int g = this.f3176o.mo4351g();
        for (int i = 0; i < g; i++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4350f(i));
            if (!(g0 == null || g0.mo3974J() || !g0.mo4001y())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private void m3494q() {
        m3483f1();
        setScrollState(0);
    }

    /* renamed from: r */
    static void m3495r(AbstractC0655d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f3229c;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                View view = (View) viewParent;
                while (true) {
                    if (view == null) {
                        d0Var.f3229c = null;
                        return;
                    } else if (view != d0Var.f3228b) {
                        viewParent = view.getParent();
                        if (!(viewParent instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: r0 */
    private void m3496r0() {
        if (C1013s.m5795x(this) == 0) {
            C1013s.m5788t0(this, 8);
        }
    }

    /* renamed from: s0 */
    private void m3497s0() {
        this.f3176o = new C0701b(new C0656e());
    }

    /* renamed from: v */
    private void m3498v(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String j0 = m3489j0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(j0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0669o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3125i);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + j0, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0669o) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + j0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + j0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + j0, e7);
                }
            }
        }
    }

    /* renamed from: x */
    private boolean m3499x(int i, int i2) {
        m3472U(this.f3128A0);
        int[] iArr = this.f3128A0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: x0 */
    private boolean m3500x0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || mo3802R(view2) == null) {
            return false;
        }
        if (view == null || mo3802R(view) == null) {
            return true;
        }
        this.f3184s.set(0, 0, view.getWidth(), view.getHeight());
        this.f3186t.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3184s);
        offsetDescendantRectToMyCoords(view2, this.f3186t);
        char c = 65535;
        int i3 = this.f3192w.mo4118d0() == 1 ? -1 : 1;
        Rect rect = this.f3184s;
        int i4 = rect.left;
        Rect rect2 = this.f3186t;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + mo3800P());
    }

    /* renamed from: y1 */
    private void m3501y1() {
        this.f3177o0.mo3959g();
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo4107S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo3776A0() {
        int j = this.f3176o.mo4353j();
        for (int i = 0; i < j; i++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i));
            if (g0 != null && !g0.mo3974J()) {
                g0.mo3978b(6);
            }
        }
        mo3940z0();
        this.f3170l.mo4218t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo3777B() {
        String str;
        if (this.f3190v == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.f3192w == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0649a0 a0Var = this.f3183r0;
            a0Var.f3210j = false;
            if (a0Var.f3205e == 1) {
                m3463C();
            } else if (!this.f3174n.mo4337q() && this.f3192w.mo4143s0() == getWidth() && this.f3192w.mo4112a0() == getHeight()) {
                this.f3192w.mo4087G1(this);
                m3465E();
                return;
            }
            this.f3192w.mo4087G1(this);
            m3464D();
            m3465E();
            return;
        }
        Log.e("RecyclerView", str);
    }

    /* renamed from: B0 */
    public void mo3778B0(int i) {
        int g = this.f3176o.mo4351g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3176o.mo4350f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: C0 */
    public void mo3779C0(int i) {
        int g = this.f3176o.mo4351g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3176o.mo4350f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo3780D0(int i, int i2) {
        int j = this.f3176o.mo4353j();
        for (int i3 = 0; i3 < j; i3++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i3));
            if (g0 != null && !g0.mo3974J() && g0.f3230d >= i) {
                g0.mo3965A(i2, false);
                this.f3183r0.f3207g = true;
            }
        }
        this.f3170l.mo4219u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo3781E0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f3176o.mo4353j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i7));
            if (g0 != null && (i6 = g0.f3230d) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    g0.mo3965A(i2 - i, false);
                } else {
                    g0.mo3965A(i5, false);
                }
                this.f3183r0.f3207g = true;
            }
        }
        this.f3170l.mo4220v(i, i2);
        requestLayout();
    }

    /* renamed from: F */
    public boolean mo3782F(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo5537d(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo3783F0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f3176o.mo4353j();
        for (int i4 = 0; i4 < j; i4++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i4));
            if (g0 != null && !g0.mo3974J()) {
                int i5 = g0.f3230d;
                if (i5 >= i3) {
                    g0.mo3965A(-i2, z);
                } else if (i5 >= i) {
                    g0.mo3984i(i - 1, -i2, z);
                }
                this.f3183r0.f3207g = true;
            }
        }
        this.f3170l.mo4221w(i, i2, z);
        requestLayout();
    }

    /* renamed from: G */
    public final void mo3784G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo5538e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: G0 */
    public void mo3785G0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3786H(int i) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo4132k1(i);
        }
        mo3795M0(i);
        AbstractC0678t tVar = this.f3185s0;
        if (tVar != null) {
            tVar.mo4177a(this, i);
        }
        List<AbstractC0678t> list = this.f3187t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3187t0.get(size).mo4177a(this, i);
            }
        }
    }

    /* renamed from: H0 */
    public void mo3787H0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3788I(int i, int i2) {
        this.f3151Q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo3797N0(i, i2);
        AbstractC0678t tVar = this.f3185s0;
        if (tVar != null) {
            tVar.mo4178b(this, i, i2);
        }
        List<AbstractC0678t> list = this.f3187t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3187t0.get(size).mo4178b(this, i, i2);
            }
        }
        this.f3151Q--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo3789I0() {
        this.f3150P++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3790J() {
        int i;
        for (int size = this.f3138F0.size() - 1; size >= 0; size--) {
            AbstractC0655d0 d0Var = this.f3138F0.get(size);
            if (d0Var.f3228b.getParent() == this && !d0Var.mo3974J() && (i = d0Var.f3244r) != -1) {
                C1013s.m5786s0(d0Var.f3228b, i);
                d0Var.f3244r = -1;
            }
        }
        this.f3138F0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo3791J0() {
        mo3792K0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo3792K0(boolean z) {
        int i = this.f3150P - 1;
        this.f3150P = i;
        if (i < 1) {
            this.f3150P = 0;
            if (z) {
                m3462A();
                mo3790J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo3793L() {
        int i;
        int i2;
        if (this.f3156V == null) {
            EdgeEffect a = this.f3152R.mo4043a(this, 3);
            this.f3156V = a;
            if (this.f3180q) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo3794M() {
        int i;
        int i2;
        if (this.f3153S == null) {
            EdgeEffect a = this.f3152R.mo4043a(this, 0);
            this.f3153S = a;
            if (this.f3180q) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: M0 */
    public void mo3795M0(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3796N() {
        int i;
        int i2;
        if (this.f3155U == null) {
            EdgeEffect a = this.f3152R.mo4043a(this, 2);
            this.f3155U = a;
            if (this.f3180q) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: N0 */
    public void mo3797N0(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3798O() {
        int i;
        int i2;
        if (this.f3154T == null) {
            EdgeEffect a = this.f3152R.mo4043a(this, 1);
            this.f3154T = a;
            if (this.f3180q) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3799O0() {
        if (!this.f3195x0 && this.f3129B) {
            C1013s.m5750a0(this, this.f3140G0);
            this.f3195x0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public String mo3800P() {
        return " " + super.toString() + ", adapter:" + this.f3190v + ", layout:" + this.f3192w + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo3801Q(C0649a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3177o0.f3221d;
            a0Var.f3216p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3217q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3216p = 0;
        a0Var.f3217q = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3802R(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo3802R(android.view.View):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3803R0(boolean z) {
        this.f3149O = z | this.f3149O;
        this.f3148N = true;
        mo3776A0();
    }

    /* renamed from: S */
    public AbstractC0655d0 mo3804S(View view) {
        View R = mo3802R(view);
        if (R == null) {
            return null;
        }
        return mo3838f0(R);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3805T0(AbstractC0655d0 d0Var, AbstractC0663l.C0666c cVar) {
        d0Var.mo3970F(0, 8192);
        if (this.f3183r0.f3209i && d0Var.mo4001y() && !d0Var.mo3998v() && !d0Var.mo3974J()) {
            this.f3178p.mo4491c(mo3819c0(d0Var), d0Var);
        }
        this.f3178p.mo4493e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3806W0() {
        AbstractC0663l lVar = this.f3157W;
        if (lVar != null) {
            lVar.mo4053k();
        }
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo3470r1(this.f3170l);
            this.f3192w.mo4144s1(this.f3170l);
        }
        this.f3170l.mo4203c();
    }

    /* renamed from: X */
    public AbstractC0655d0 mo3807X(int i) {
        AbstractC0655d0 d0Var = null;
        if (this.f3148N) {
            return null;
        }
        int j = this.f3176o.mo4353j();
        for (int i2 = 0; i2 < j; i2++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i2));
            if (g0 != null && !g0.mo3998v() && mo3817b0(g0) == i) {
                if (!this.f3176o.mo4356n(g0.f3228b)) {
                    return g0;
                }
                d0Var = g0;
            }
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public boolean mo3808X0(View view) {
        mo3927t1();
        boolean r = this.f3176o.mo4360r(view);
        if (r) {
            AbstractC0655d0 g0 = m3485g0(view);
            this.f3170l.mo4198J(g0);
            this.f3170l.mo4192C(g0);
        }
        mo3932v1(!r);
        return r;
    }

    /* renamed from: Y */
    public AbstractC0655d0 mo3809Y(long j) {
        AbstractC0658g gVar = this.f3190v;
        AbstractC0655d0 d0Var = null;
        if (gVar != null && gVar.mo4028g()) {
            int j2 = this.f3176o.mo4353j();
            for (int i = 0; i < j2; i++) {
                AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i));
                if (g0 != null && !g0.mo3998v() && g0.mo3986k() == j) {
                    if (!this.f3176o.mo4356n(g0.f3228b)) {
                        return g0;
                    }
                    d0Var = g0;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: Y0 */
    public void mo3810Y0(AbstractC0668n nVar) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo3743g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3196y.remove(nVar);
        if (this.f3196y.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo3940z0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public AbstractC0655d0 mo3811Z(int i, boolean z) {
        int j = this.f3176o.mo4353j();
        AbstractC0655d0 d0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i2));
            if (g0 != null && !g0.mo3998v()) {
                if (z) {
                    if (g0.f3230d != i) {
                        continue;
                    }
                } else if (g0.mo3988m() != i) {
                    continue;
                }
                if (!this.f3176o.mo4356n(g0.f3228b)) {
                    return g0;
                }
                d0Var = g0;
            }
        }
        return d0Var;
    }

    /* renamed from: Z0 */
    public void mo3812Z0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo3810Y0(mo3871l0(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3813a(int i, int i2) {
        if (i < 0) {
            mo3794M();
            if (this.f3153S.isFinished()) {
                this.f3153S.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo3796N();
            if (this.f3155U.isFinished()) {
                this.f3155U.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo3798O();
            if (this.f3154T.isFinished()) {
                this.f3154T.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo3793L();
            if (this.f3156V.isFinished()) {
                this.f3156V.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C1013s.m5748Z(this);
        }
    }

    /* renamed from: a0 */
    public boolean mo3814a0(int i, int i2) {
        AbstractC0669o oVar = this.f3192w;
        int i3 = 0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3141H) {
            return false;
        } else {
            boolean l = oVar.mo3451l();
            boolean m = this.f3192w.mo3454m();
            if (!l || Math.abs(i) < this.f3167j0) {
                i = 0;
            }
            if (!m || Math.abs(i2) < this.f3167j0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = l || m;
                dispatchNestedFling(f, f2, z);
                AbstractC0676r rVar = this.f3166i0;
                if (rVar != null && rVar.mo4173a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (l) {
                        i3 = 1;
                    }
                    if (m) {
                        i3 |= 2;
                    }
                    mo3930u1(i3, 1);
                    int i4 = this.f3169k0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f3169k0;
                    this.f3177o0.mo3956c(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a1 */
    public void mo3815a1(AbstractC0677s sVar) {
        this.f3198z.remove(sVar);
        if (this.f3127A == sVar) {
            this.f3127A = null;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar == null || !oVar.mo3378L0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public int mo3817b0(AbstractC0655d0 d0Var) {
        if (d0Var.mo3991p(524) || !d0Var.mo3994s()) {
            return -1;
        }
        return this.f3174n.mo4329e(d0Var.f3230d);
    }

    /* renamed from: b1 */
    public void mo3818b1(AbstractC0678t tVar) {
        List<AbstractC0678t> list = this.f3187t0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public long mo3819c0(AbstractC0655d0 d0Var) {
        return this.f3190v.mo4028g() ? d0Var.mo3986k() : (long) d0Var.f3230d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3820c1() {
        AbstractC0655d0 d0Var;
        int g = this.f3176o.mo4351g();
        for (int i = 0; i < g; i++) {
            View f = this.f3176o.mo4350f(i);
            AbstractC0655d0 f0 = mo3838f0(f);
            if (!(f0 == null || (d0Var = f0.f3236j) == null)) {
                View view = d0Var.f3228b;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0674p) && this.f3192w.mo3713n((C0674p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && oVar.mo3451l()) {
            return this.f3192w.mo3749r(this.f3183r0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && oVar.mo3451l()) {
            return this.f3192w.mo3715s(this.f3183r0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && oVar.mo3451l()) {
            return this.f3192w.mo3716t(this.f3183r0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && oVar.mo3454m()) {
            return this.f3192w.mo3750u(this.f3183r0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && oVar.mo3454m()) {
            return this.f3192w.mo3717v(this.f3183r0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && oVar.mo3454m()) {
            return this.f3192w.mo3718w(this.f3183r0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public int mo3828d0(View view) {
        AbstractC0655d0 g0 = m3485g0(view);
        if (g0 != null) {
            return g0.mo3985j();
        }
        return -1;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo5534a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo5535b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo5536c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo5539f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f3196y.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f3196y.get(i2).mo4074i(canvas, this, this.f3183r0);
        }
        EdgeEffect edgeEffect = this.f3153S;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3180q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3153S;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3154T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3180q) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3154T;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3155U;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3180q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f3155U;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3156V;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3180q) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f3156V;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3157W == null || this.f3196y.size() <= 0 || !this.f3157W.mo4058p()) {
            z3 = z;
        }
        if (z3) {
            C1013s.m5748Z(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public int mo3837e0(View view) {
        AbstractC0655d0 g0 = m3485g0(view);
        if (g0 != null) {
            return g0.mo3988m();
        }
        return -1;
    }

    /* renamed from: f0 */
    public AbstractC0655d0 mo3838f0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3485g0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View W0 = this.f3192w.mo3406W0(view, i);
        if (W0 != null) {
            return W0;
        }
        boolean z2 = true;
        boolean z3 = this.f3190v != null && this.f3192w != null && !mo3934w0() && !this.f3141H;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo3928u();
                if (mo3802R(view) == null) {
                    return null;
                }
                mo3927t1();
                view2 = this.f3192w.mo3707P0(view, i, this.f3170l, this.f3183r0);
                mo3932v1(false);
            }
        } else {
            if (this.f3192w.mo3454m()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3123g) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3192w.mo3451l()) {
                int i3 = (this.f3192w.mo4118d0() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f3123g) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo3928u();
                if (mo3802R(view) == null) {
                    return null;
                }
                mo3927t1();
                this.f3192w.mo3707P0(view, i, this.f3170l, this.f3183r0);
                mo3932v1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m3500x0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m3479d1(view2, null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            return oVar.mo3364G();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3800P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            return oVar.mo3367H(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3800P());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            return oVar.mo3370I(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3800P());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0658g getAdapter() {
        return this.f3190v;
    }

    public int getBaseline() {
        AbstractC0669o oVar = this.f3192w;
        return oVar != null ? oVar.mo4092J() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        AbstractC0661j jVar = this.f3199z0;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo4042a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3180q;
    }

    public C0732k getCompatAccessibilityDelegate() {
        return this.f3197y0;
    }

    public C0662k getEdgeEffectFactory() {
        return this.f3152R;
    }

    public AbstractC0663l getItemAnimator() {
        return this.f3157W;
    }

    public int getItemDecorationCount() {
        return this.f3196y.size();
    }

    public AbstractC0669o getLayoutManager() {
        return this.f3192w;
    }

    public int getMaxFlingVelocity() {
        return this.f3169k0;
    }

    public int getMinFlingVelocity() {
        return this.f3167j0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3122f) {
            return System.nanoTime();
        }
        return 0;
    }

    public AbstractC0676r getOnFlingListener() {
        return this.f3166i0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3175n0;
    }

    public C0679u getRecycledViewPool() {
        return this.f3170l.mo4209i();
    }

    public int getScrollState() {
        return this.f3158a0;
    }

    /* renamed from: h */
    public void mo3859h(AbstractC0668n nVar) {
        mo3862i(nVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo3860h1() {
        int j = this.f3176o.mo4353j();
        for (int i = 0; i < j; i++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i));
            if (!g0.mo3974J()) {
                g0.mo3969E();
            }
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo5540j();
    }

    /* renamed from: i */
    public void mo3862i(AbstractC0668n nVar, int i) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo3743g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3196y.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3196y.add(nVar);
        } else {
            this.f3196y.add(i, nVar);
        }
        mo3940z0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public boolean mo3863i1(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        mo3928u();
        if (this.f3190v != null) {
            int[] iArr = this.f3136E0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo3867j1(i, i2, iArr);
            int[] iArr2 = this.f3136E0;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i6 = i8;
            i5 = i7;
            i4 = i - i7;
            i3 = i2 - i8;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3196y.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3136E0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo3784G(i5, i6, i4, i3, this.f3132C0, 0, iArr3);
        int[] iArr4 = this.f3136E0;
        int i9 = i4 - iArr4[0];
        int i10 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i11 = this.f3163f0;
        int[] iArr5 = this.f3132C0;
        this.f3163f0 = i11 - iArr5[0];
        this.f3164g0 -= iArr5[1];
        int[] iArr6 = this.f3134D0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C1003i.m5690b(motionEvent, 8194)) {
                m3470S0(motionEvent.getX(), (float) i9, motionEvent.getY(), (float) i10);
            }
            mo3925t(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            mo3788I(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    public boolean isAttachedToWindow() {
        return this.f3129B;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3141H;
    }

    @Override // p006b.p030g.p039k.AbstractC1004j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo5542l();
    }

    /* renamed from: j */
    public void mo3866j(AbstractC0677s sVar) {
        this.f3198z.add(sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3867j1(int i, int i2, int[] iArr) {
        mo3927t1();
        mo3789I0();
        C0921a.m5394a("RV Scroll");
        mo3801Q(this.f3183r0);
        int D1 = i != 0 ? this.f3192w.mo3359D1(i, this.f3170l, this.f3183r0) : 0;
        int F1 = i2 != 0 ? this.f3192w.mo3362F1(i2, this.f3170l, this.f3183r0) : 0;
        C0921a.m5395b();
        mo3820c1();
        mo3791J0();
        mo3932v1(false);
        if (iArr != null) {
            iArr[0] = D1;
            iArr[1] = F1;
        }
    }

    /* renamed from: k */
    public void mo3868k(AbstractC0678t tVar) {
        if (this.f3187t0 == null) {
            this.f3187t0 = new ArrayList();
        }
        this.f3187t0.add(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Rect mo3869k0(View view) {
        C0674p pVar = (C0674p) view.getLayoutParams();
        if (!pVar.f3287c) {
            return pVar.f3286b;
        }
        if (this.f3183r0.mo3950h() && (pVar.mo4167c() || pVar.mo4169e())) {
            return pVar.f3286b;
        }
        Rect rect = pVar.f3286b;
        rect.set(0, 0, 0, 0);
        int size = this.f3196y.size();
        for (int i = 0; i < size; i++) {
            this.f3184s.set(0, 0, 0, 0);
            this.f3196y.get(i).mo4070e(this.f3184s, view, this, this.f3183r0);
            int i2 = rect.left;
            Rect rect2 = this.f3184s;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3287c = false;
        return rect;
    }

    /* renamed from: k1 */
    public void mo3233k1(int i) {
        if (!this.f3141H) {
            mo3936x1();
            AbstractC0669o oVar = this.f3192w;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo3360E1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3870l(AbstractC0655d0 d0Var, AbstractC0663l.C0666c cVar, AbstractC0663l.C0666c cVar2) {
        d0Var.mo3971G(false);
        if (this.f3157W.mo4044a(d0Var, cVar, cVar2)) {
            mo3799O0();
        }
    }

    /* renamed from: l0 */
    public AbstractC0668n mo3871l0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f3196y.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public boolean mo3872m1(AbstractC0655d0 d0Var, int i) {
        if (mo3934w0()) {
            d0Var.f3244r = i;
            this.f3138F0.add(d0Var);
            return false;
        }
        C1013s.m5786s0(d0Var.f3228b, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3873n(AbstractC0655d0 d0Var, AbstractC0663l.C0666c cVar, AbstractC0663l.C0666c cVar2) {
        m3484g(d0Var);
        d0Var.mo3971G(false);
        if (this.f3157W.mo4046c(d0Var, cVar, cVar2)) {
            mo3799O0();
        }
    }

    /* renamed from: n0 */
    public boolean mo3874n0() {
        return this.f3131C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public boolean mo3875n1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo3934w0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0978b.m5568a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f3144J |= i;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3876o(String str) {
        if (mo3934w0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo3800P());
            }
            throw new IllegalStateException(str);
        } else if (this.f3151Q > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo3800P()));
        }
    }

    /* renamed from: o0 */
    public boolean mo3877o0() {
        return !this.f3135E || this.f3148N || this.f3174n.mo4336p();
    }

    /* renamed from: o1 */
    public void mo3878o1(int i, int i2) {
        mo3891p1(i, i2, null);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3150P = 0;
        boolean z = true;
        this.f3129B = true;
        if (!this.f3135E || isLayoutRequested()) {
            z = false;
        }
        this.f3135E = z;
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo4079C(this);
        }
        this.f3195x0 = false;
        if (f3122f) {
            ThreadLocal<RunnableC0720e> threadLocal = RunnableC0720e.f3481b;
            RunnableC0720e eVar = threadLocal.get();
            this.f3179p0 = eVar;
            if (eVar == null) {
                this.f3179p0 = new RunnableC0720e();
                Display s = C1013s.m5785s(this);
                float f = 60.0f;
                if (!isInEditMode() && s != null) {
                    float refreshRate = s.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC0720e eVar2 = this.f3179p0;
                eVar2.f3485f = (long) (1.0E9f / f);
                threadLocal.set(eVar2);
            }
            this.f3179p0.mo4408a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        RunnableC0720e eVar;
        super.onDetachedFromWindow();
        AbstractC0663l lVar = this.f3157W;
        if (lVar != null) {
            lVar.mo4053k();
        }
        mo3936x1();
        this.f3129B = false;
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null) {
            oVar.mo4081D(this, this.f3170l);
        }
        this.f3138F0.clear();
        removeCallbacks(this.f3140G0);
        this.f3178p.mo4498j();
        if (f3122f && (eVar = this.f3179p0) != null) {
            eVar.mo4411j(this);
            this.f3179p0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3196y.size();
        for (int i = 0; i < size; i++) {
            this.f3196y.get(i).mo4072g(canvas, this, this.f3183r0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3192w != null && !this.f3141H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3192w.mo3454m() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3192w.mo3451l()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo3863i1((int) (f * this.f3171l0), (int) (f2 * this.f3173m0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3192w.mo3454m()) {
                        f2 = -axisValue;
                    } else if (this.f3192w.mo3451l()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo3863i1((int) (f * this.f3171l0), (int) (f2 * this.f3173m0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo3863i1((int) (f * this.f3171l0), (int) (f2 * this.f3173m0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3141H) {
            return false;
        }
        this.f3127A = null;
        if (m3471T(motionEvent)) {
            m3494q();
            return true;
        }
        AbstractC0669o oVar = this.f3192w;
        if (oVar == null) {
            return false;
        }
        boolean l = oVar.mo3451l();
        boolean m = this.f3192w.mo3454m();
        if (this.f3160c0 == null) {
            this.f3160c0 = VelocityTracker.obtain();
        }
        this.f3160c0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3143I) {
                this.f3143I = false;
            }
            this.f3159b0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3163f0 = x;
            this.f3161d0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3164g0 = y;
            this.f3162e0 = y;
            if (this.f3158a0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo3935w1(1);
            }
            int[] iArr = this.f3134D0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (m) {
                boolean z2 = l ? 1 : 0;
                char c = l ? 1 : 0;
                l = z2 | true;
            }
            int i = l ? 1 : 0;
            int i2 = l ? 1 : 0;
            int i3 = l ? 1 : 0;
            mo3930u1(i, 0);
        } else if (actionMasked == 1) {
            this.f3160c0.clear();
            mo3935w1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3159b0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3159b0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3158a0 != 1) {
                int i4 = x2 - this.f3161d0;
                int i5 = y2 - this.f3162e0;
                if (!l || Math.abs(i4) <= this.f3165h0) {
                    z = false;
                } else {
                    this.f3163f0 = x2;
                    z = true;
                }
                if (m && Math.abs(i5) > this.f3165h0) {
                    this.f3164g0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3494q();
        } else if (actionMasked == 5) {
            this.f3159b0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3163f0 = x3;
            this.f3161d0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3164g0 = y3;
            this.f3162e0 = y3;
        } else if (actionMasked == 6) {
            m3467L0(motionEvent);
        }
        return this.f3158a0 == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0921a.m5394a("RV OnLayout");
        mo3777B();
        C0921a.m5395b();
        this.f3135E = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar == null) {
            mo3933w(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo3752x0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3192w.mo3437f1(this.f3170l, this.f3183r0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3190v != null) {
                if (this.f3183r0.f3205e == 1) {
                    m3463C();
                }
                this.f3192w.mo4091I1(i, i2);
                this.f3183r0.f3210j = true;
                m3464D();
                this.f3192w.mo4097L1(i, i2);
                if (this.f3192w.mo3734O1()) {
                    this.f3192w.mo4091I1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3183r0.f3210j = true;
                    m3464D();
                    this.f3192w.mo4097L1(i, i2);
                }
            }
        } else if (this.f3131C) {
            this.f3192w.mo3437f1(this.f3170l, this.f3183r0, i, i2);
        } else {
            if (this.f3145K) {
                mo3927t1();
                mo3789I0();
                m3469Q0();
                mo3791J0();
                C0649a0 a0Var = this.f3183r0;
                if (a0Var.f3212l) {
                    a0Var.f3208h = true;
                } else {
                    this.f3174n.mo4331j();
                    this.f3183r0.f3208h = false;
                }
                this.f3145K = false;
                mo3932v1(false);
            } else if (this.f3183r0.f3212l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0658g gVar = this.f3190v;
            if (gVar != null) {
                this.f3183r0.f3206f = gVar.mo3580c();
            } else {
                this.f3183r0.f3206f = 0;
            }
            mo3927t1();
            this.f3192w.mo3437f1(this.f3170l, this.f3183r0, i, i2);
            mo3932v1(false);
            this.f3183r0.f3208h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo3934w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0684y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0684y yVar = (C0684y) parcelable;
        this.f3172m = yVar;
        super.onRestoreInstanceState(yVar.mo5608b());
        AbstractC0669o oVar = this.f3192w;
        if (oVar != null && (parcelable2 = this.f3172m.f3305d) != null) {
            oVar.mo3445i1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0684y yVar = new C0684y(super.onSaveInstanceState());
        C0684y yVar2 = this.f3172m;
        if (yVar2 != null) {
            yVar.mo4225g(yVar2);
        } else {
            AbstractC0669o oVar = this.f3192w;
            yVar.f3305d = oVar != null ? oVar.mo3447j1() : null;
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo3929u0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo3890p(AbstractC0655d0 d0Var) {
        AbstractC0663l lVar = this.f3157W;
        return lVar == null || lVar.mo4049g(d0Var, d0Var.mo3990o());
    }

    /* renamed from: p1 */
    public void mo3891p1(int i, int i2, Interpolator interpolator) {
        mo3893q1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo3892q0() {
        this.f3174n = new C0698a(new C0657f());
    }

    /* renamed from: q1 */
    public void mo3893q1(int i, int i2, Interpolator interpolator, int i3) {
        mo3894r1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo3894r1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3141H) {
            int i4 = 0;
            if (!oVar.mo3451l()) {
                i = 0;
            }
            if (!this.f3192w.mo3454m()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo3930u1(i4, 1);
                    }
                    this.f3177o0.mo3958f(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        AbstractC0655d0 g0 = m3485g0(view);
        if (g0 != null) {
            if (g0.mo4000x()) {
                g0.mo3982f();
            } else if (!g0.mo3974J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g0 + mo3800P());
            }
        }
        view.clearAnimation();
        mo3939z(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3192w.mo4125h1(this, this.f3183r0, view, view2) && view2 != null) {
            m3479d1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3192w.mo3478y1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3198z.size();
        for (int i = 0; i < size; i++) {
            this.f3198z.get(i).mo4176c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f3137F != 0 || this.f3141H) {
            this.f3139G = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3900s() {
        int j = this.f3176o.mo4353j();
        for (int i = 0; i < j; i++) {
            AbstractC0655d0 g0 = m3485g0(this.f3176o.mo4352i(i));
            if (!g0.mo3974J()) {
                g0.mo3979c();
            }
        }
        this.f3170l.mo4204d();
    }

    /* renamed from: s1 */
    public void mo3237s1(int i) {
        if (!this.f3141H) {
            AbstractC0669o oVar = this.f3192w;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo3385Q1(this, this.f3183r0, i);
            }
        }
    }

    public void scrollBy(int i, int i2) {
        AbstractC0669o oVar = this.f3192w;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3141H) {
            boolean l = oVar.mo3451l();
            boolean m = this.f3192w.mo3454m();
            if (l || m) {
                if (!l) {
                    i = 0;
                }
                if (!m) {
                    i2 = 0;
                }
                mo3863i1(i, i2, null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo3875n1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0732k kVar) {
        this.f3197y0 = kVar;
        C1013s.m5766i0(this, kVar);
    }

    public void setAdapter(AbstractC0658g gVar) {
        setLayoutFrozen(false);
        m3490l1(gVar, false, true);
        mo3803R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AbstractC0661j jVar) {
        if (jVar != this.f3199z0) {
            this.f3199z0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3180q) {
            mo3929u0();
        }
        this.f3180q = z;
        super.setClipToPadding(z);
        if (this.f3135E) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0662k kVar) {
        C0961i.m5494c(kVar);
        this.f3152R = kVar;
        mo3929u0();
    }

    public void setHasFixedSize(boolean z) {
        this.f3131C = z;
    }

    public void setItemAnimator(AbstractC0663l lVar) {
        AbstractC0663l lVar2 = this.f3157W;
        if (lVar2 != null) {
            lVar2.mo4053k();
            this.f3157W.mo4064v(null);
        }
        this.f3157W = lVar;
        if (lVar != null) {
            lVar.mo4064v(this.f3193w0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3170l.mo4196G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0669o oVar) {
        if (oVar != this.f3192w) {
            mo3936x1();
            if (this.f3192w != null) {
                AbstractC0663l lVar = this.f3157W;
                if (lVar != null) {
                    lVar.mo4053k();
                }
                this.f3192w.mo3470r1(this.f3170l);
                this.f3192w.mo4144s1(this.f3170l);
                this.f3170l.mo4203c();
                if (this.f3129B) {
                    this.f3192w.mo4081D(this, this.f3170l);
                }
                this.f3192w.mo4100M1(null);
                this.f3192w = null;
            } else {
                this.f3170l.mo4203c();
            }
            this.f3176o.mo4357o();
            this.f3192w = oVar;
            if (oVar != null) {
                if (oVar.f3262b == null) {
                    oVar.mo4100M1(this);
                    if (this.f3129B) {
                        this.f3192w.mo4079C(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3262b.mo3800P());
                }
            }
            this.f3170l.mo4199K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo5543m(z);
    }

    public void setOnFlingListener(AbstractC0676r rVar) {
        this.f3166i0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0678t tVar) {
        this.f3185s0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3175n0 = z;
    }

    public void setRecycledViewPool(C0679u uVar) {
        this.f3170l.mo4194E(uVar);
    }

    public void setRecyclerListener(AbstractC0682w wVar) {
        this.f3194x = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f3158a0) {
            this.f3158a0 = i;
            if (i != 2) {
                m3501y1();
            }
            mo3786H(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f3165h0 = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f3165h0 = i2;
    }

    public void setViewCacheExtension(AbstractC0651b0 b0Var) {
        this.f3170l.mo4195F(b0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo5544o(i);
    }

    @Override // p006b.p030g.p039k.AbstractC1004j
    public void stopNestedScroll() {
        getScrollingChildHelper().mo5546q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f3141H) {
            mo3876o("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3141H = false;
                if (!(!this.f3139G || this.f3192w == null || this.f3190v == null)) {
                    requestLayout();
                }
                this.f3139G = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3141H = true;
            this.f3143I = true;
            mo3936x1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3925t(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3153S;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3153S.onRelease();
            z = this.f3153S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3155U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3155U.onRelease();
            z |= this.f3155U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3154T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3154T.onRelease();
            z |= this.f3154T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3156V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3156V.onRelease();
            z |= this.f3156V.isFinished();
        }
        if (z) {
            C1013s.m5748Z(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo3926t0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo3800P());
        }
        Resources resources = getContext().getResources();
        new C0715d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1093b.fastscroll_default_thickness), resources.getDimensionPixelSize(C1093b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C1093b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo3927t1() {
        int i = this.f3137F + 1;
        this.f3137F = i;
        if (i == 1 && !this.f3141H) {
            this.f3139G = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3928u() {
        if (!this.f3135E || this.f3148N) {
            C0921a.m5394a("RV FullInvalidate");
            mo3777B();
            C0921a.m5395b();
        } else if (this.f3174n.mo4336p()) {
            if (this.f3174n.mo4335o(4) && !this.f3174n.mo4335o(11)) {
                C0921a.m5394a("RV PartialInvalidate");
                mo3927t1();
                mo3789I0();
                this.f3174n.mo4338s();
                if (!this.f3139G) {
                    if (m3493p0()) {
                        mo3777B();
                    } else {
                        this.f3174n.mo4330i();
                    }
                }
                mo3932v1(true);
                mo3791J0();
            } else if (this.f3174n.mo4336p()) {
                C0921a.m5394a("RV FullInvalidate");
                mo3777B();
            } else {
                return;
            }
            C0921a.m5395b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo3929u0() {
        this.f3156V = null;
        this.f3154T = null;
        this.f3155U = null;
        this.f3153S = null;
    }

    /* renamed from: u1 */
    public boolean mo3930u1(int i, int i2) {
        return getScrollingChildHelper().mo5545p(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public boolean mo3931v0() {
        AccessibilityManager accessibilityManager = this.f3146L;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo3932v1(boolean z) {
        if (this.f3137F < 1) {
            this.f3137F = 1;
        }
        if (!z && !this.f3141H) {
            this.f3139G = false;
        }
        if (this.f3137F == 1) {
            if (z && this.f3139G && !this.f3141H && this.f3192w != null && this.f3190v != null) {
                mo3777B();
            }
            if (!this.f3141H) {
                this.f3139G = false;
            }
        }
        this.f3137F--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3933w(int i, int i2) {
        setMeasuredDimension(AbstractC0669o.m3736o(i, getPaddingLeft() + getPaddingRight(), C1013s.m5722A(this)), AbstractC0669o.m3736o(i2, getPaddingTop() + getPaddingBottom(), C1013s.m5799z(this)));
    }

    /* renamed from: w0 */
    public boolean mo3934w0() {
        return this.f3150P > 0;
    }

    /* renamed from: w1 */
    public void mo3935w1(int i) {
        getScrollingChildHelper().mo5547r(i);
    }

    /* renamed from: x1 */
    public void mo3936x1() {
        setScrollState(0);
        m3501y1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3937y(View view) {
        AbstractC0655d0 g0 = m3485g0(view);
        mo3785G0(view);
        AbstractC0658g gVar = this.f3190v;
        if (!(gVar == null || g0 == null)) {
            gVar.mo3583o(g0);
        }
        List<AbstractC0675q> list = this.f3147M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3147M.get(size).mo4171a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo3938y0(int i) {
        if (this.f3192w != null) {
            setScrollState(2);
            this.f3192w.mo3360E1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3939z(View view) {
        AbstractC0655d0 g0 = m3485g0(view);
        mo3787H0(view);
        AbstractC0658g gVar = this.f3190v;
        if (!(gVar == null || g0 == null)) {
            gVar.mo4034p(g0);
        }
        List<AbstractC0675q> list = this.f3147M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3147M.get(size).mo4172b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo3940z0() {
        int j = this.f3176o.mo4353j();
        for (int i = 0; i < j; i++) {
            ((C0674p) this.f3176o.mo4352i(i).getLayoutParams()).f3287c = true;
        }
        this.f3170l.mo4217s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo3941z1(int i, int i2, Object obj) {
        int i3;
        int j = this.f3176o.mo4353j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f3176o.mo4352i(i5);
            AbstractC0655d0 g0 = m3485g0(i6);
            if (g0 != null && !g0.mo3974J() && (i3 = g0.f3230d) >= i && i3 < i4) {
                g0.mo3978b(2);
                g0.mo3977a(obj);
                ((C0674p) i6.getLayoutParams()).f3287c = true;
            }
        }
        this.f3170l.mo4201M(i, i2);
    }
}
