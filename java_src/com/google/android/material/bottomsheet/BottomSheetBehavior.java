package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.C3203p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p006b.p030g.p034f.C0920a;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.AbstractC0987f;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;
import p006b.p043i.p045b.C1052c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p104w.C1437c;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0337c<V> {

    /* renamed from: a */
    private static final int f10177a = C1399j.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f10178A = 4;

    /* renamed from: B */
    C1052c f10179B;

    /* renamed from: C */
    private boolean f10180C;

    /* renamed from: D */
    private int f10181D;

    /* renamed from: E */
    private boolean f10182E;

    /* renamed from: F */
    private int f10183F;

    /* renamed from: G */
    int f10184G;

    /* renamed from: H */
    int f10185H;

    /* renamed from: I */
    WeakReference<V> f10186I;

    /* renamed from: J */
    WeakReference<View> f10187J;

    /* renamed from: K */
    private final ArrayList<AbstractC3083f> f10188K = new ArrayList<>();

    /* renamed from: L */
    private VelocityTracker f10189L;

    /* renamed from: M */
    int f10190M;

    /* renamed from: N */
    private int f10191N;

    /* renamed from: O */
    boolean f10192O;

    /* renamed from: P */
    private Map<View, Integer> f10193P;

    /* renamed from: Q */
    private final C1052c.AbstractC1055c f10194Q = new C3081d();

    /* renamed from: b */
    private int f10195b = 0;

    /* renamed from: c */
    private boolean f10196c = true;

    /* renamed from: d */
    private boolean f10197d = false;

    /* renamed from: e */
    private float f10198e;

    /* renamed from: f */
    private int f10199f;

    /* renamed from: g */
    private boolean f10200g;

    /* renamed from: h */
    private int f10201h;

    /* renamed from: i */
    private int f10202i;

    /* renamed from: j */
    private boolean f10203j;

    /* renamed from: k */
    private C1455g f10204k;

    /* renamed from: l */
    private int f10205l;

    /* renamed from: m */
    private boolean f10206m;

    /* renamed from: n */
    private C1462k f10207n;

    /* renamed from: o */
    private boolean f10208o;

    /* renamed from: p */
    private BottomSheetBehavior<V>.RunnableC3086h f10209p = null;

    /* renamed from: q */
    private ValueAnimator f10210q;

    /* renamed from: r */
    int f10211r;

    /* renamed from: s */
    int f10212s;

    /* renamed from: t */
    int f10213t;

    /* renamed from: u */
    float f10214u = 0.5f;

    /* renamed from: v */
    int f10215v;

    /* renamed from: w */
    float f10216w = -1.0f;

    /* renamed from: x */
    boolean f10217x;

    /* renamed from: y */
    private boolean f10218y;

    /* renamed from: z */
    private boolean f10219z = true;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC3078a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f10220b;

        /* renamed from: c */
        final /* synthetic */ int f10221c;

        RunnableC3078a(View view, int i) {
            this.f10220b = view;
            this.f10221c = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo9991m0(this.f10220b, this.f10221c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C3079b implements ValueAnimator.AnimatorUpdateListener {
        C3079b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f10204k != null) {
                BottomSheetBehavior.this.f10204k.mo6609W(floatValue);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C3080c implements C3203p.AbstractC3206c {
        C3080c() {
        }

        @Override // com.google.android.material.internal.C3203p.AbstractC3206c
        /* renamed from: a */
        public C0964a0 mo9996a(View view, C0964a0 a0Var, C3203p.C3207d dVar) {
            BottomSheetBehavior.this.f10205l = a0Var.mo5413d().f4528e;
            BottomSheetBehavior.this.m12692t0(false);
            return a0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C3081d extends C1052c.AbstractC1055c {
        C3081d() {
        }

        /* renamed from: n */
        private boolean m12725n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f10185H + bottomSheetBehavior.mo9977U()) / 2;
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: a */
        public int mo2480a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: b */
        public int mo2481b(View view, int i, int i2) {
            int U = BottomSheetBehavior.this.mo9977U();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0920a.m5393b(i, U, bottomSheetBehavior.f10217x ? bottomSheetBehavior.f10185H : bottomSheetBehavior.f10215v);
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: e */
        public int mo5665e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f10217x ? bottomSheetBehavior.f10185H : bottomSheetBehavior.f10215v;
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: j */
        public void mo2487j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f10219z) {
                BottomSheetBehavior.this.mo9990k0(1);
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: k */
        public void mo2488k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo9975S(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.f10225a.f10211r) < java.lang.Math.abs(r7.getTop() - r6.f10225a.f10213t)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.f10225a.f10213t) < java.lang.Math.abs(r8 - r6.f10225a.f10215v)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.f10225a.f10212s) < java.lang.Math.abs(r8 - r6.f10225a.f10215v)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.f10215v)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f10225a.f10215v)) goto L_0x00b3;
         */
        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2489l(android.view.View r7, float r8, float r9) {
            /*
            // Method dump skipped, instructions count: 262
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C3081d.mo2489l(android.view.View, float, float):void");
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: m */
        public boolean mo2490m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f10178A;
            if (i2 == 1 || bottomSheetBehavior.f10192O) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f10190M == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f10187J;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f10186I;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C3082e implements AbstractC0987f {

        /* renamed from: a */
        final /* synthetic */ int f10226a;

        C3082e(int i) {
            this.f10226a = i;
        }

        @Override // p006b.p030g.p039k.p040b0.AbstractC0987f
        /* renamed from: a */
        public boolean mo5529a(View view, AbstractC0987f.AbstractC0988a aVar) {
            BottomSheetBehavior.this.mo9989j0(this.f10226a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class AbstractC3083f {
        /* renamed from: a */
        public abstract void mo9997a(View view, float f);

        /* renamed from: b */
        public abstract void mo9998b(View view, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static class C3084g extends AbstractC1041a {
        public static final Parcelable.Creator<C3084g> CREATOR = new C3085a();

        /* renamed from: d */
        final int f10228d;

        /* renamed from: e */
        int f10229e;

        /* renamed from: f */
        boolean f10230f;

        /* renamed from: g */
        boolean f10231g;

        /* renamed from: h */
        boolean f10232h;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        static class C3085a implements Parcelable.ClassLoaderCreator<C3084g> {
            C3085a() {
            }

            /* renamed from: a */
            public C3084g createFromParcel(Parcel parcel) {
                return new C3084g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C3084g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3084g(parcel, classLoader);
            }

            /* renamed from: c */
            public C3084g[] newArray(int i) {
                return new C3084g[i];
            }
        }

        public C3084g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10228d = parcel.readInt();
            this.f10229e = parcel.readInt();
            boolean z = false;
            this.f10230f = parcel.readInt() == 1;
            this.f10231g = parcel.readInt() == 1;
            this.f10232h = parcel.readInt() == 1 ? true : z;
        }

        public C3084g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f10228d = bottomSheetBehavior.f10178A;
            this.f10229e = ((BottomSheetBehavior) bottomSheetBehavior).f10199f;
            this.f10230f = ((BottomSheetBehavior) bottomSheetBehavior).f10196c;
            this.f10231g = bottomSheetBehavior.f10217x;
            this.f10232h = ((BottomSheetBehavior) bottomSheetBehavior).f10218y;
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10228d);
            parcel.writeInt(this.f10229e);
            parcel.writeInt(this.f10230f ? 1 : 0);
            parcel.writeInt(this.f10231g ? 1 : 0);
            parcel.writeInt(this.f10232h ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    public class RunnableC3086h implements Runnable {

        /* renamed from: b */
        private final View f10233b;

        /* renamed from: c */
        private boolean f10234c;

        /* renamed from: d */
        int f10235d;

        RunnableC3086h(View view, int i) {
            this.f10233b = view;
            this.f10235d = i;
        }

        public void run() {
            C1052c cVar = BottomSheetBehavior.this.f10179B;
            if (cVar == null || !cVar.mo5656m(true)) {
                BottomSheetBehavior.this.mo9990k0(this.f10235d);
            } else {
                C1013s.m5750a0(this.f10233b, this);
            }
            this.f10234c = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f10202i = context.getResources().getDimensionPixelSize(C1393d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5988x);
        this.f10203j = obtainStyledAttributes.hasValue(C1400k.f5730J);
        int i2 = C1400k.f6000z;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m12682Q(context, attributeSet, hasValue, C1437c.m7077a(context, obtainStyledAttributes, i2));
        } else {
            m12681P(context, attributeSet, hasValue);
        }
        m12683R();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10216w = obtainStyledAttributes.getDimension(C1400k.f5994y, -1.0f);
        }
        int i3 = C1400k.f5706F;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo9985f0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            mo9985f0(i);
        }
        mo9984e0(obtainStyledAttributes.getBoolean(C1400k.f5700E, false));
        mo9982c0(obtainStyledAttributes.getBoolean(C1400k.f5724I, false));
        mo9981b0(obtainStyledAttributes.getBoolean(C1400k.f5688C, true));
        mo9988i0(obtainStyledAttributes.getBoolean(C1400k.f5718H, false));
        mo9979Z(obtainStyledAttributes.getBoolean(C1400k.f5676A, true));
        mo9987h0(obtainStyledAttributes.getInt(C1400k.f5712G, 0));
        mo9983d0(obtainStyledAttributes.getFloat(C1400k.f5694D, 0.5f));
        int i4 = C1400k.f5682B;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
        mo9980a0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i4, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.f10198e = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: L */
    private void m12677L(V v, C0979c.C0980a aVar, int i) {
        C1013s.m5758e0(v, aVar, null, new C3082e(i));
    }

    /* renamed from: M */
    private void m12678M() {
        int O = m12680O();
        if (this.f10196c) {
            this.f10215v = Math.max(this.f10185H - O, this.f10212s);
        } else {
            this.f10215v = this.f10185H - O;
        }
    }

    /* renamed from: N */
    private void m12679N() {
        this.f10213t = (int) (((float) this.f10185H) * (1.0f - this.f10214u));
    }

    /* renamed from: O */
    private int m12680O() {
        int i;
        return this.f10200g ? Math.min(Math.max(this.f10201h, this.f10185H - ((this.f10184G * 9) / 16)), this.f10183F) : (this.f10206m || (i = this.f10205l) <= 0) ? this.f10199f : Math.max(this.f10199f, i + this.f10202i);
    }

    /* renamed from: P */
    private void m12681P(Context context, AttributeSet attributeSet, boolean z) {
        m12682Q(context, attributeSet, z, null);
    }

    /* renamed from: Q */
    private void m12682Q(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f10203j) {
            this.f10207n = C1462k.m7193e(context, attributeSet, C1391b.bottomSheetStyle, f10177a).mo6667m();
            C1455g gVar = new C1455g(this.f10207n);
            this.f10204k = gVar;
            gVar.mo6603M(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f10204k.setTint(typedValue.data);
                return;
            }
            this.f10204k.mo6608V(colorStateList);
        }
    }

    /* renamed from: R */
    private void m12683R() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10210q = ofFloat;
        ofFloat.setDuration(500L);
        this.f10210q.addUpdateListener(new C3079b());
    }

    /* renamed from: V */
    private float m12684V() {
        VelocityTracker velocityTracker = this.f10189L;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f10198e);
        return this.f10189L.getYVelocity(this.f10190M);
    }

    /* renamed from: X */
    private void m12685X() {
        this.f10190M = -1;
        VelocityTracker velocityTracker = this.f10189L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10189L = null;
        }
    }

    /* renamed from: Y */
    private void m12686Y(C3084g gVar) {
        int i = this.f10195b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f10199f = gVar.f10229e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f10196c = gVar.f10230f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f10217x = gVar.f10231g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f10218y = gVar.f10232h;
            }
        }
    }

    /* renamed from: l0 */
    private void m12687l0(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !mo9978W() && !this.f10200g) {
            C3203p.m13432a(view, new C3080c());
        }
    }

    /* renamed from: n0 */
    private void m12688n0(int i) {
        V v = this.f10186I.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C1013s.m5736N(v)) {
                mo9991m0(v, i);
            } else {
                v.post(new RunnableC3078a(v, i));
            }
        }
    }

    /* renamed from: q0 */
    private void m12689q0() {
        V v;
        C0979c.C0980a aVar;
        WeakReference<V> weakReference = this.f10186I;
        if (weakReference != null && (v = weakReference.get()) != null) {
            C1013s.m5754c0(v, 524288);
            C1013s.m5754c0(v, 262144);
            C1013s.m5754c0(v, 1048576);
            if (this.f10217x && this.f10178A != 5) {
                m12677L(v, C0979c.C0980a.f4721u, 5);
            }
            int i = this.f10178A;
            int i2 = 6;
            if (i == 3) {
                if (this.f10196c) {
                    i2 = 4;
                }
                aVar = C0979c.C0980a.f4720t;
            } else if (i == 4) {
                if (this.f10196c) {
                    i2 = 3;
                }
                aVar = C0979c.C0980a.f4719s;
            } else if (i == 6) {
                m12677L(v, C0979c.C0980a.f4720t, 4);
                m12677L(v, C0979c.C0980a.f4719s, 3);
                return;
            } else {
                return;
            }
            m12677L(v, aVar, i2);
        }
    }

    /* renamed from: r0 */
    private void m12690r0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f10208o != z) {
                this.f10208o = z;
                if (this.f10204k != null && (valueAnimator = this.f10210q) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f10210q.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f10210q.setFloatValues(1.0f - f, f);
                    this.f10210q.start();
                }
            }
        }
    }

    /* renamed from: s0 */
    private void m12691s0(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.f10186I;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f10193P == null) {
                        this.f10193P = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f10186I.get()) {
                        if (z) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f10193P.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f10197d) {
                                intValue = 4;
                            }
                        } else if (this.f10197d && (map = this.f10193P) != null && map.containsKey(childAt)) {
                            intValue = this.f10193P.get(childAt).intValue();
                        }
                        C1013s.m5786s0(childAt, intValue);
                    }
                }
                if (!z) {
                    this.f10193P = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: t0 */
    private void m12692t0(boolean z) {
        V v;
        if (this.f10186I != null) {
            m12678M();
            if (this.f10178A == 4 && (v = this.f10186I.get()) != null) {
                if (z) {
                    m12688n0(this.f10178A);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: A */
    public boolean mo2083A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f10181D = 0;
        this.f10182E = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.f10212s) < java.lang.Math.abs(r3 - r2.f10215v)) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.f10215v)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f10215v)) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.f10213t) < java.lang.Math.abs(r3 - r2.f10215v)) goto L_0x00a8;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2085C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2085C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: D */
    public boolean mo2086D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10178A == 1 && actionMasked == 0) {
            return true;
        }
        C1052c cVar = this.f10179B;
        if (cVar != null) {
            cVar.mo5644E(motionEvent);
        }
        if (actionMasked == 0) {
            m12685X();
        }
        if (this.f10189L == null) {
            this.f10189L = VelocityTracker.obtain();
        }
        this.f10189L.addMovement(motionEvent);
        if (this.f10179B != null && actionMasked == 2 && !this.f10180C && Math.abs(((float) this.f10191N) - motionEvent.getY()) > ((float) this.f10179B.mo5660y())) {
            this.f10179B.mo5653b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f10180C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo9975S(int i) {
        float f;
        float f2;
        V v = this.f10186I.get();
        if (!(v == null || this.f10188K.isEmpty())) {
            int i2 = this.f10215v;
            if (i > i2 || i2 == mo9977U()) {
                int i3 = this.f10215v;
                f = (float) (i3 - i);
                f2 = (float) (this.f10185H - i3);
            } else {
                int i4 = this.f10215v;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo9977U());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f10188K.size(); i5++) {
                this.f10188K.get(i5).mo9997a(v, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public View mo9976T(View view) {
        if (C1013s.m5738P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View T = mo9976T(viewGroup.getChildAt(i));
            if (T != null) {
                return T;
            }
        }
        return null;
    }

    /* renamed from: U */
    public int mo9977U() {
        return this.f10196c ? this.f10212s : this.f10211r;
    }

    /* renamed from: W */
    public boolean mo9978W() {
        return this.f10206m;
    }

    /* renamed from: Z */
    public void mo9979Z(boolean z) {
        this.f10219z = z;
    }

    /* renamed from: a0 */
    public void mo9980a0(int i) {
        if (i >= 0) {
            this.f10211r = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: b0 */
    public void mo9981b0(boolean z) {
        if (this.f10196c != z) {
            this.f10196c = z;
            if (this.f10186I != null) {
                m12678M();
            }
            mo9990k0((!this.f10196c || this.f10178A != 6) ? this.f10178A : 3);
            m12689q0();
        }
    }

    /* renamed from: c0 */
    public void mo9982c0(boolean z) {
        this.f10206m = z;
    }

    /* renamed from: d0 */
    public void mo9983d0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f10214u = f;
        if (this.f10186I != null) {
            m12679N();
        }
    }

    /* renamed from: e0 */
    public void mo9984e0(boolean z) {
        if (this.f10217x != z) {
            this.f10217x = z;
            if (!z && this.f10178A == 5) {
                mo9989j0(4);
            }
            m12689q0();
        }
    }

    /* renamed from: f0 */
    public void mo9985f0(int i) {
        mo9986g0(i, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: g */
    public void mo2093g(CoordinatorLayout.C0340f fVar) {
        super.mo2093g(fVar);
        this.f10186I = null;
        this.f10179B = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9986g0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f10200g
            if (r4 != 0) goto L_0x0015
            r3.f10200g = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f10200g
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f10199f
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f10200g = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f10199f = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.m12692t0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo9986g0(int, boolean):void");
    }

    /* renamed from: h0 */
    public void mo9987h0(int i) {
        this.f10195b = i;
    }

    /* renamed from: i0 */
    public void mo9988i0(boolean z) {
        this.f10218y = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: j */
    public void mo2096j() {
        super.mo2096j();
        this.f10186I = null;
        this.f10179B = null;
    }

    /* renamed from: j0 */
    public void mo9989j0(int i) {
        if (i != this.f10178A) {
            if (this.f10186I != null) {
                m12688n0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f10217x && i == 5)) {
                this.f10178A = i;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: k */
    public boolean mo2097k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1052c cVar;
        if (!v.isShown() || !this.f10219z) {
            this.f10180C = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m12685X();
        }
        if (this.f10189L == null) {
            this.f10189L = VelocityTracker.obtain();
        }
        this.f10189L.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f10191N = (int) motionEvent.getY();
            if (this.f10178A != 2) {
                WeakReference<View> weakReference = this.f10187J;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.mo2031B(view2, x, this.f10191N)) {
                    this.f10190M = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f10192O = true;
                }
            }
            this.f10180C = this.f10190M == -1 && !coordinatorLayout.mo2031B(v, x, this.f10191N);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10192O = false;
            this.f10190M = -1;
            if (this.f10180C) {
                this.f10180C = false;
                return false;
            }
        }
        if (!this.f10180C && (cVar = this.f10179B) != null && cVar.mo5649N(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f10187J;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.f10180C && this.f10178A != 1 && !coordinatorLayout.mo2031B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f10179B != null && Math.abs(((float) this.f10191N) - motionEvent.getY()) > ((float) this.f10179B.mo5660y());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo9990k0(int i) {
        V v;
        if (this.f10178A != i) {
            this.f10178A = i;
            WeakReference<V> weakReference = this.f10186I;
            if (!(weakReference == null || (v = weakReference.get()) == null)) {
                if (i == 3) {
                    m12691s0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m12691s0(false);
                }
                m12690r0(i);
                for (int i2 = 0; i2 < this.f10188K.size(); i2++) {
                    this.f10188K.get(i2).mo9998b(v, i);
                }
                m12689q0();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: l */
    public boolean mo2098l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C1455g gVar;
        if (C1013s.m5791v(coordinatorLayout) && !C1013s.m5791v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f10186I == null) {
            this.f10201h = coordinatorLayout.getResources().getDimensionPixelSize(C1393d.design_bottom_sheet_peek_height_min);
            m12687l0(v);
            this.f10186I = new WeakReference<>(v);
            if (this.f10203j && (gVar = this.f10204k) != null) {
                C1013s.m5772l0(v, gVar);
            }
            C1455g gVar2 = this.f10204k;
            if (gVar2 != null) {
                float f = this.f10216w;
                if (f == -1.0f) {
                    f = C1013s.m5787t(v);
                }
                gVar2.mo6607U(f);
                boolean z = this.f10178A == 3;
                this.f10208o = z;
                this.f10204k.mo6609W(z ? 0.0f : 1.0f);
            }
            m12689q0();
            if (C1013s.m5793w(v) == 0) {
                C1013s.m5786s0(v, 1);
            }
        }
        if (this.f10179B == null) {
            this.f10179B = C1052c.m5972o(coordinatorLayout, this.f10194Q);
        }
        int top = v.getTop();
        coordinatorLayout.mo2034I(v, i);
        this.f10184G = coordinatorLayout.getWidth();
        this.f10185H = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f10183F = height;
        this.f10212s = Math.max(0, this.f10185H - height);
        m12679N();
        m12678M();
        int i3 = this.f10178A;
        if (i3 == 3) {
            i2 = mo9977U();
        } else if (i3 == 6) {
            i2 = this.f10213t;
        } else if (this.f10217x && i3 == 5) {
            i2 = this.f10185H;
        } else if (i3 == 4) {
            i2 = this.f10215v;
        } else {
            if (i3 == 1 || i3 == 2) {
                C1013s.m5743U(v, top - v.getTop());
            }
            this.f10187J = new WeakReference<>(mo9976T(v));
            return true;
        }
        C1013s.m5743U(v, i2);
        this.f10187J = new WeakReference<>(mo9976T(v));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo9991m0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f10215v;
        } else if (i == 6) {
            int i4 = this.f10213t;
            if (!this.f10196c || i4 > (i3 = this.f10212s)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo9977U();
        } else if (!this.f10217x || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f10185H;
        }
        mo9993p0(view, i, i2, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: o */
    public boolean mo2101o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f10187J;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f10178A != 3 || super.mo2101o(coordinatorLayout, v, view, f, f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public boolean mo9992o0(View view, float f) {
        if (this.f10218y) {
            return true;
        }
        if (view.getTop() < this.f10215v) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f10215v)) / ((float) m12680O()) > 0.5f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo9993p0(View view, int i, int i2, boolean z) {
        C1052c cVar = this.f10179B;
        if (cVar != null && (!z ? cVar.mo5650O(view, view.getLeft(), i2) : cVar.mo5648M(view.getLeft(), i2))) {
            mo9990k0(2);
            m12690r0(i);
            if (this.f10209p == null) {
                this.f10209p = new RunnableC3086h(view, i);
            }
            if (!((RunnableC3086h) this.f10209p).f10234c) {
                BottomSheetBehavior<V>.RunnableC3086h hVar = this.f10209p;
                hVar.f10235d = i;
                C1013s.m5750a0(view, hVar);
                ((RunnableC3086h) this.f10209p).f10234c = true;
                return;
            }
            this.f10209p.f10235d = i;
            return;
        }
        mo9990k0(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: q */
    public void mo2103q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f10187J;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f10215v;
                        if (i5 > i6 && !this.f10217x) {
                            iArr[1] = top - i6;
                            C1013s.m5743U(v, -iArr[1]);
                            i4 = 4;
                        } else if (this.f10219z) {
                            iArr[1] = i2;
                            C1013s.m5743U(v, -i2);
                            mo9990k0(1);
                        } else {
                            return;
                        }
                    }
                    mo9975S(v.getTop());
                    this.f10181D = i2;
                    this.f10182E = true;
                } else if (i5 < mo9977U()) {
                    iArr[1] = top - mo9977U();
                    C1013s.m5743U(v, -iArr[1]);
                    i4 = 3;
                } else if (this.f10219z) {
                    iArr[1] = i2;
                    C1013s.m5743U(v, -i2);
                    mo9990k0(1);
                    mo9975S(v.getTop());
                    this.f10181D = i2;
                    this.f10182E = true;
                } else {
                    return;
                }
                mo9990k0(i4);
                mo9975S(v.getTop());
                this.f10181D = i2;
                this.f10182E = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: t */
    public void mo2106t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: x */
    public void mo2110x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C3084g gVar = (C3084g) parcelable;
        super.mo2110x(coordinatorLayout, v, gVar.mo5608b());
        m12686Y(gVar);
        int i = gVar.f10228d;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f10178A = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: y */
    public Parcelable mo2111y(CoordinatorLayout coordinatorLayout, V v) {
        return new C3084g(super.mo2111y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
