package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0398a;
import java.lang.ref.WeakReference;
import java.util.List;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p034f.C0920a;
import p006b.p030g.p039k.AbstractC1004j;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.AbstractC0987f;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1396g;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1459h;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AbstractC0336b {

    /* renamed from: b */
    private static final int f10053b = C1399j.Widget_Design_AppBarLayout;

    /* renamed from: c */
    private int f10054c;

    /* renamed from: d */
    private int f10055d;

    /* renamed from: e */
    private int f10056e;

    /* renamed from: f */
    private int f10057f;

    /* renamed from: g */
    private boolean f10058g;

    /* renamed from: h */
    private int f10059h;

    /* renamed from: i */
    private C0964a0 f10060i;

    /* renamed from: j */
    private List<AbstractC3054b> f10061j;

    /* renamed from: k */
    private boolean f10062k;

    /* renamed from: l */
    private boolean f10063l;

    /* renamed from: m */
    private boolean f10064m;

    /* renamed from: n */
    private boolean f10065n;

    /* renamed from: o */
    private int f10066o;

    /* renamed from: p */
    private WeakReference<View> f10067p;

    /* renamed from: q */
    private ValueAnimator f10068q;

    /* renamed from: r */
    private int[] f10069r;

    /* renamed from: s */
    private Drawable f10070s;

    /* access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC3056a<T> {

        /* renamed from: k */
        private int f10071k;

        /* renamed from: l */
        private int f10072l;

        /* renamed from: m */
        private ValueAnimator f10073m;

        /* renamed from: n */
        private int f10074n = -1;

        /* renamed from: o */
        private boolean f10075o;

        /* renamed from: p */
        private float f10076p;

        /* renamed from: q */
        private WeakReference<View> f10077q;

        /* renamed from: r */
        private AbstractC3050d f10078r;

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C3047a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f10079a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f10080b;

            C3047a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f10079a = coordinatorLayout;
                this.f10080b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo9902P(this.f10079a, this.f10080b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public class C3048b implements AbstractC0987f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f10082a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f10083b;

            /* renamed from: c */
            final /* synthetic */ View f10084c;

            /* renamed from: d */
            final /* synthetic */ int f10085d;

            C3048b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f10082a = coordinatorLayout;
                this.f10083b = appBarLayout;
                this.f10084c = view;
                this.f10085d = i;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p006b.p030g.p039k.p040b0.AbstractC0987f
            /* renamed from: a */
            public boolean mo5529a(View view, AbstractC0987f.AbstractC0988a aVar) {
                BaseBehavior.this.mo2103q(this.f10082a, this.f10083b, this.f10084c, 0, this.f10085d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        public class C3049c implements AbstractC0987f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f10087a;

            /* renamed from: b */
            final /* synthetic */ boolean f10088b;

            C3049c(AppBarLayout appBarLayout, boolean z) {
                this.f10087a = appBarLayout;
                this.f10088b = z;
            }

            @Override // p006b.p030g.p039k.p040b0.AbstractC0987f
            /* renamed from: a */
            public boolean mo5529a(View view, AbstractC0987f.AbstractC0988a aVar) {
                this.f10087a.setExpanded(this.f10088b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class AbstractC3050d<T extends AppBarLayout> {
        }

        /* access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        public static class C3051e extends AbstractC1041a {
            public static final Parcelable.Creator<C3051e> CREATOR = new C3052a();

            /* renamed from: d */
            int f10090d;

            /* renamed from: e */
            float f10091e;

            /* renamed from: f */
            boolean f10092f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e$a */
            static class C3052a implements Parcelable.ClassLoaderCreator<C3051e> {
                C3052a() {
                }

                /* renamed from: a */
                public C3051e createFromParcel(Parcel parcel) {
                    return new C3051e(parcel, null);
                }

                /* renamed from: b */
                public C3051e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C3051e(parcel, classLoader);
                }

                /* renamed from: c */
                public C3051e[] newArray(int i) {
                    return new C3051e[i];
                }
            }

            public C3051e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f10090d = parcel.readInt();
                this.f10091e = parcel.readFloat();
                this.f10092f = parcel.readByte() != 0;
            }

            public C3051e(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p006b.p043i.p044a.AbstractC1041a
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f10090d);
                parcel.writeFloat(this.f10091e);
                parcel.writeByte(this.f10092f ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: S */
        private void m12474S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo9864M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m12475T(coordinatorLayout, t, C0979c.C0980a.f4717m, false);
            }
            if (mo9864M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C1013s.m5758e0(coordinatorLayout, C0979c.C0980a.f4718n, null, new C3048b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            m12475T(coordinatorLayout, t, C0979c.C0980a.f4718n, true);
        }

        /* renamed from: T */
        private void m12475T(CoordinatorLayout coordinatorLayout, T t, C0979c.C0980a aVar, boolean z) {
            C1013s.m5758e0(coordinatorLayout, aVar, null, new C3049c(t, z));
        }

        /* renamed from: U */
        private void m12476U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo9864M() - i);
            float abs2 = Math.abs(f);
            m12477V(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: V */
        private void m12477V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo9864M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f10073m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10073m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f10073m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f10073m = valueAnimator3;
                valueAnimator3.setInterpolator(C1401a.f6018e);
                this.f10073m.addUpdateListener(new C3047a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f10073m.setDuration((long) Math.min(i2, 600));
            this.f10073m.setIntValues(M, i);
            this.f10073m.start();
        }

        /* renamed from: X */
        private boolean m12478X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo9838h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m12479Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: Z */
        private View m12480Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof AbstractC1004j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m12481a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m12482b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C3055c cVar = (C3055c) childAt.getLayoutParams();
                if (m12479Y(cVar.mo9895a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m12483e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C3055c cVar = (C3055c) childAt.getLayoutParams();
                Interpolator b = cVar.mo9896b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = cVar.mo9895a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C1013s.m5799z(childAt);
                        }
                    }
                    if (C1013s.m5791v(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: p0 */
        private boolean m12484p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> s = coordinatorLayout.mo2070s(t);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0337c f = ((CoordinatorLayout.C0340f) s.get(i).getLayoutParams()).mo2121f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).mo9906K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m12485q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo9864M();
            int b0 = m12482b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                C3055c cVar = (C3055c) childAt.getLayoutParams();
                int a = cVar.mo9895a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m12479Y(a, 2)) {
                        i2 += C1013s.m5799z(childAt);
                    } else if (m12479Y(a, 5)) {
                        int z = C1013s.m5799z(childAt) + i2;
                        if (M < z) {
                            i = z;
                        } else {
                            i2 = z;
                        }
                    }
                    if (m12479Y(a, 32)) {
                        i += ((LinearLayout.LayoutParams) cVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m12476U(coordinatorLayout, t, C0920a.m5393b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m12486r0(CoordinatorLayout coordinatorLayout, T t) {
            C1013s.m5754c0(coordinatorLayout, C0979c.C0980a.f4717m.mo5515b());
            C1013s.m5754c0(coordinatorLayout, C0979c.C0980a.f4718n.mo5515b());
            View Z = m12480Z(coordinatorLayout);
            if (Z != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0340f) Z.getLayoutParams()).mo2121f() instanceof ScrollingViewBehavior)) {
                m12474S(coordinatorLayout, t, Z);
            }
        }

        /* renamed from: s0 */
        private void m12487s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = m12481a0(t, i);
            if (a0 != null) {
                int a = ((C3055c) a0.getLayoutParams()).mo9895a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int z3 = C1013s.m5799z(a0);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (a0.getBottom() - z3) - t.getTopInset()) : (-i) >= (a0.getBottom() - z3) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo9839j()) {
                    z2 = t.mo9849r(m12480Z(coordinatorLayout));
                }
                boolean p = t.mo9848p(z2);
                if (z || (p && m12484p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3056a
        /* renamed from: M */
        public int mo9864M() {
            return mo9887E() + this.f10071k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public boolean mo9861H(T t) {
            if (this.f10078r == null) {
                WeakReference<View> weakReference = this.f10077q;
                if (weakReference == null) {
                    return true;
                }
                View view = weakReference.get();
                return view != null && view.isShown() && !view.canScrollVertically(-1);
            }
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int mo9862K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public int mo9863L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f0 */
        public void mo9865N(CoordinatorLayout coordinatorLayout, T t) {
            m12485q0(coordinatorLayout, t);
            if (t.mo9839j()) {
                t.mo9848p(t.mo9849r(m12480Z(coordinatorLayout)));
            }
        }

        /* renamed from: g0 */
        public boolean mo2098l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean l = super.mo2098l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f10074n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                mo9902P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f10075o ? C1013s.m5799z(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f10076p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m12476U(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        mo9902P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m12476U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo9902P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo9841l();
            this.f10074n = -1;
            mo9888G(C0920a.m5393b(mo9887E(), -t.getTotalScrollRange(), 0));
            m12487s0(coordinatorLayout, t, mo9887E(), 0, true);
            t.mo9840k(mo9887E());
            m12486r0(coordinatorLayout, t);
            return l;
        }

        /* renamed from: h0 */
        public boolean mo2099m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0340f) t.getLayoutParams())).height != -2) {
                return super.mo2099m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2035J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: i0 */
        public void mo2103q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo9901O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo9839j()) {
                t.mo9848p(t.mo9849r(view));
            }
        }

        /* renamed from: j0 */
        public void mo2106t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo9901O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m12486r0(coordinatorLayout, t);
            }
        }

        /* renamed from: k0 */
        public void mo2110x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C3051e) {
                C3051e eVar = (C3051e) parcelable;
                super.mo2110x(coordinatorLayout, t, eVar.mo5608b());
                this.f10074n = eVar.f10090d;
                this.f10076p = eVar.f10091e;
                this.f10075o = eVar.f10092f;
                return;
            }
            super.mo2110x(coordinatorLayout, t, parcelable);
            this.f10074n = -1;
        }

        /* renamed from: l0 */
        public Parcelable mo2111y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo2111y(coordinatorLayout, t);
            int E = mo9887E();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    C3051e eVar = new C3051e(y);
                    eVar.f10090d = i;
                    if (bottom == C1013s.m5799z(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    eVar.f10092f = z;
                    eVar.f10091e = ((float) bottom) / ((float) childAt.getHeight());
                    return eVar;
                }
            }
            return y;
        }

        /* renamed from: m0 */
        public boolean mo2083A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo9839j() || m12478X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f10073m) != null) {
                valueAnimator.cancel();
            }
            this.f10077q = null;
            this.f10072l = i2;
            return z;
        }

        /* renamed from: n0 */
        public void mo2085C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f10072l == 0 || i == 1) {
                m12485q0(coordinatorLayout, t);
                if (t.mo9839j()) {
                    t.mo9848p(t.mo9849r(view));
                }
            }
            this.f10077q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public int mo9866Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo9864M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f10071k = 0;
            } else {
                int b = C0920a.m5393b(i, i2, i3);
                if (M != b) {
                    int e0 = t.mo9824f() ? m12483e0(t, b) : b;
                    boolean G = mo9888G(e0);
                    i4 = M - b;
                    this.f10071k = b - e0;
                    if (!G && t.mo9824f()) {
                        coordinatorLayout.mo2043f(t);
                    }
                    t.mo9840k(mo9887E());
                    m12487s0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            m12486r0(coordinatorLayout, t);
            return i4;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.C3059c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo9887E() {
            return super.mo9887E();
        }

        @Override // com.google.android.material.appbar.C3059c
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo9888G(int i) {
            return super.mo9888G(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo9871g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo2098l(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo9872h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo2099m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo9873i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo2103q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo9874j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo2106t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo9875k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo2110x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo9876l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo2111y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo9877m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo2083A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo9878n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo2085C(coordinatorLayout, appBarLayout, view, i);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC3058b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5858c3);
            mo9908O(obtainStyledAttributes.getDimensionPixelSize(C1400k.f5865d3, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: R */
        private static int m12530R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0337c f = ((CoordinatorLayout.C0340f) appBarLayout.getLayoutParams()).mo2121f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo9864M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m12531S(View view, View view2) {
            CoordinatorLayout.AbstractC0337c f = ((CoordinatorLayout.C0340f) view2.getLayoutParams()).mo2121f();
            if (f instanceof BaseBehavior) {
                C1013s.m5743U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f10071k) + mo9907M()) - mo9905I(view2));
            }
        }

        /* renamed from: T */
        private void m12532T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo9839j()) {
                    appBarLayout.mo9848p(appBarLayout.mo9849r(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3058b
        /* renamed from: J */
        public float mo9890J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m12530R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3058b
        /* renamed from: L */
        public int mo9891L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo9891L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo9889H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: e */
        public boolean mo2091e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: h */
        public boolean mo2094h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m12531S(view, view2);
            m12532T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: i */
        public void mo2095i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1013s.m5754c0(coordinatorLayout, C0979c.C0980a.f4717m.mo5515b());
                C1013s.m5754c0(coordinatorLayout, C0979c.C0980a.f4718n.mo5515b());
            }
        }

        @Override // com.google.android.material.appbar.C3059c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2098l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo2098l(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AbstractC3058b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo2099m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2099m(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
        /* renamed from: w */
        public boolean mo2109w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo9889H(coordinatorLayout.mo2067r(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f10108d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo9842m(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C3053a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1455g f10093a;

        C3053a(C1455g gVar) {
            this.f10093a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10093a.mo6607U(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface AbstractC3054b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo9894a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C3055c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f10095a = 1;

        /* renamed from: b */
        Interpolator f10096b;

        public C3055c(int i, int i2) {
            super(i, i2);
        }

        public C3055c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5924m);
            this.f10095a = obtainStyledAttributes.getInt(C1400k.f5931n, 0);
            int i = C1400k.f5938o;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f10096b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C3055c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C3055c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C3055c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo9895a() {
            return this.f10095a;
        }

        /* renamed from: b */
        public Interpolator mo9896b() {
            return this.f10096b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo9897c() {
            int i = this.f10095a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: a */
    private void m12452a() {
        WeakReference<View> weakReference = this.f10067p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10067p = null;
    }

    /* renamed from: b */
    private View m12453b(View view) {
        int i;
        if (this.f10067p == null && (i = this.f10066o) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f10066o);
            }
            if (findViewById != null) {
                this.f10067p = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f10067p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m12454g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C3055c) getChildAt(i).getLayoutParams()).mo9897c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m12455i() {
        this.f10055d = -1;
        this.f10056e = -1;
        this.f10057f = -1;
    }

    /* renamed from: n */
    private void m12456n(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f10059h = i2 | i;
        requestLayout();
    }

    /* renamed from: o */
    private boolean m12457o(boolean z) {
        if (this.f10063l == z) {
            return false;
        }
        this.f10063l = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: q */
    private boolean m12458q() {
        return this.f10070s != null && getTopInset() > 0;
    }

    /* renamed from: s */
    private boolean m12459s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C1013s.m5791v(childAt);
    }

    /* renamed from: t */
    private void m12460t(C1455g gVar, boolean z) {
        float dimension = getResources().getDimension(C1393d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f10068q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f10068q = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C1396g.app_bar_elevation_anim_duration));
        this.f10068q.setInterpolator(C1401a.f6014a);
        this.f10068q.addUpdateListener(new C3053a(gVar));
        this.f10068q.start();
    }

    /* renamed from: u */
    private void m12461u() {
        setWillNotDraw(!m12458q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C3055c generateDefaultLayoutParams() {
        return new C3055c(-1, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3055c;
    }

    /* renamed from: d */
    public C3055c generateLayoutParams(AttributeSet attributeSet) {
        return new C3055c(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m12458q()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f10054c));
            this.f10070s.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10070s;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C3055c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3055c((ViewGroup.MarginLayoutParams) layoutParams) : new C3055c(layoutParams) : new C3055c((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9824f() {
        return this.f10058g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0336b
    public CoordinatorLayout.AbstractC0337c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int z;
        int i2 = this.f10056e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C3055c cVar = (C3055c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f10095a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    z = C1013s.m5799z(childAt);
                } else if ((i4 & 2) != 0) {
                    z = measuredHeight - C1013s.m5799z(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C1013s.m5791v(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + z;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f10056e = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f10057f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C3055c cVar = (C3055c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            int i4 = cVar.f10095a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1013s.m5799z(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f10057f = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f10066o;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int z = C1013s.m5799z(this);
        if (z == 0) {
            int childCount = getChildCount();
            z = childCount >= 1 ? C1013s.m5799z(getChildAt(childCount - 1)) : 0;
            if (z == 0) {
                return getHeight() / 3;
            }
        }
        return (z * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f10059h;
    }

    public Drawable getStatusBarForeground() {
        return this.f10070s;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0964a0 a0Var = this.f10060i;
        if (a0Var != null) {
            return a0Var.mo5418h();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f10055d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C3055c cVar = (C3055c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f10095a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            if (i2 == 0 && C1013s.m5791v(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C1013s.m5799z(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f10055d = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9838h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean mo9839j() {
        return this.f10065n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9840k(int i) {
        this.f10054c = i;
        if (!willNotDraw()) {
            C1013s.m5748Z(this);
        }
        List<AbstractC3054b> list = this.f10061j;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC3054b bVar = this.f10061j.get(i2);
                if (bVar != null) {
                    bVar.mo9894a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9841l() {
        this.f10059h = 0;
    }

    /* renamed from: m */
    public void mo9842m(boolean z, boolean z2) {
        m12456n(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1459h.m7185e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f10069r == null) {
            this.f10069r = new int[4];
        }
        int[] iArr = this.f10069r;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f10063l;
        int i2 = C1391b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f10064m) ? -C1391b.state_lifted : C1391b.state_lifted;
        int i3 = C1391b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f10064m) ? -C1391b.state_collapsed : C1391b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12452a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C1013s.m5791v(this) && m12459s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1013s.m5743U(getChildAt(childCount), topInset);
            }
        }
        m12455i();
        this.f10058g = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C3055c) getChildAt(i5).getLayoutParams()).mo9896b() != null) {
                this.f10058g = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f10070s;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f10062k) {
            if (!this.f10065n && !m12454g()) {
                z2 = false;
            }
            m12457o(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1013s.m5791v(this) && m12459s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0920a.m5393b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m12455i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo9848p(boolean z) {
        if (this.f10064m == z) {
            return false;
        }
        this.f10064m = z;
        refreshDrawableState();
        if (!this.f10065n || !(getBackground() instanceof C1455g)) {
            return true;
        }
        m12460t((C1455g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo9849r(View view) {
        View b = m12453b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C1459h.m7184d(this, f);
    }

    public void setExpanded(boolean z) {
        mo9842m(z, C1013s.m5737O(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f10065n = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f10066o = i;
        m12452a();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f10070s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f10070s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f10070s.setState(getDrawableState());
                }
                C0398a.m1976m(this.f10070s, C1013s.m5797y(this));
                this.f10070s.setVisible(getVisibility() == 0, false);
                this.f10070s.setCallback(this);
            }
            m12461u();
            C1013s.m5748Z(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0764a.m4517d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3061e.m12580a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f10070s;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10070s;
    }
}
