package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.AbstractC0987f;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p045b.C1052c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0337c<V> {

    /* renamed from: a */
    C1052c f10128a;

    /* renamed from: b */
    AbstractC3065c f10129b;

    /* renamed from: c */
    private boolean f10130c;

    /* renamed from: d */
    private float f10131d = 0.0f;

    /* renamed from: e */
    private boolean f10132e;

    /* renamed from: f */
    int f10133f = 2;

    /* renamed from: g */
    float f10134g = 0.5f;

    /* renamed from: h */
    float f10135h = 0.0f;

    /* renamed from: i */
    float f10136i = 0.5f;

    /* renamed from: j */
    private final C1052c.AbstractC1055c f10137j = new C3063a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C3063a extends C1052c.AbstractC1055c {

        /* renamed from: a */
        private int f10138a;

        /* renamed from: b */
        private int f10139b = -1;

        C3063a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m12602n(android.view.View r6, float r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                int r6 = p006b.p030g.p039k.C1013s.m5797y(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r3 = r3.f10133f
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                if (r3 != 0) goto L_0x0027
                if (r6 == 0) goto L_0x0021
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0026
                goto L_0x0025
            L_0x0021:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                return r1
            L_0x0027:
                if (r3 != r2) goto L_0x0035
                if (r6 == 0) goto L_0x0030
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0035
                goto L_0x0034
            L_0x0030:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
            L_0x0034:
                r1 = 1
            L_0x0035:
                return r1
            L_0x0036:
                int r7 = r6.getLeft()
                int r0 = r5.f10138a
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f10134g
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x0053
                r1 = 1
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C3063a.m12602n(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f10138a;
            r3 = r3.getWidth() + r5;
         */
        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo2480a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p006b.p030g.p039k.C1013s.m5797y(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f10133f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f10138a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f10138a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f10138a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f10138a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f10138a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m12590G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C3063a.mo2480a(android.view.View, int, int):int");
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: b */
        public int mo2481b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: d */
        public int mo2482d(View view) {
            return view.getWidth();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: i */
        public void mo2486i(View view, int i) {
            this.f10139b = i;
            this.f10138a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: j */
        public void mo2487j(int i) {
            AbstractC3065c cVar = SwipeDismissBehavior.this.f10129b;
            if (cVar != null) {
                cVar.mo9925b(i);
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: k */
        public void mo2488k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f10138a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f10135h);
            float width2 = ((float) this.f10138a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f10136i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m12589F(0.0f, 1.0f - SwipeDismissBehavior.m12592I(width, width2, f), 1.0f));
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: l */
        public void mo2489l(View view, float f, float f2) {
            boolean z;
            int i;
            AbstractC3065c cVar;
            this.f10139b = -1;
            int width = view.getWidth();
            if (m12602n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f10138a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f10138a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f10128a.mo5648M(i, view.getTop())) {
                C1013s.m5750a0(view, new RunnableC3066d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f10129b) != null) {
                cVar.mo9924a(view);
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: m */
        public boolean mo2490m(View view, int i) {
            int i2 = this.f10139b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo9919E(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C3064b implements AbstractC0987f {
        C3064b() {
        }

        @Override // p006b.p030g.p039k.p040b0.AbstractC0987f
        /* renamed from: a */
        public boolean mo5529a(View view, AbstractC0987f.AbstractC0988a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo9919E(view)) {
                return false;
            }
            boolean z2 = C1013s.m5797y(view) == 1;
            int i = SwipeDismissBehavior.this.f10133f;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C1013s.m5742T(view, width);
            view.setAlpha(0.0f);
            AbstractC3065c cVar = SwipeDismissBehavior.this.f10129b;
            if (cVar != null) {
                cVar.mo9924a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface AbstractC3065c {
        /* renamed from: a */
        void mo9924a(View view);

        /* renamed from: b */
        void mo9925b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class RunnableC3066d implements Runnable {

        /* renamed from: b */
        private final View f10142b;

        /* renamed from: c */
        private final boolean f10143c;

        RunnableC3066d(View view, boolean z) {
            this.f10142b = view;
            this.f10143c = z;
        }

        public void run() {
            AbstractC3065c cVar;
            C1052c cVar2 = SwipeDismissBehavior.this.f10128a;
            if (cVar2 != null && cVar2.mo5656m(true)) {
                C1013s.m5750a0(this.f10142b, this);
            } else if (this.f10143c && (cVar = SwipeDismissBehavior.this.f10129b) != null) {
                cVar.mo9924a(this.f10142b);
            }
        }
    }

    /* renamed from: F */
    static float m12589F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m12590G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m12591H(ViewGroup viewGroup) {
        if (this.f10128a == null) {
            this.f10128a = this.f10132e ? C1052c.m5971n(viewGroup, this.f10131d, this.f10137j) : C1052c.m5972o(viewGroup, this.f10137j);
        }
    }

    /* renamed from: I */
    static float m12592I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m12593N(View view) {
        C1013s.m5754c0(view, 1048576);
        if (mo9919E(view)) {
            C1013s.m5758e0(view, C0979c.C0980a.f4725u, null, new C3064b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: D */
    public boolean mo2086D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1052c cVar = this.f10128a;
        if (cVar == null) {
            return false;
        }
        cVar.mo5644E(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo9919E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo9920J(float f) {
        this.f10136i = m12589F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo9921K(AbstractC3065c cVar) {
        this.f10129b = cVar;
    }

    /* renamed from: L */
    public void mo9922L(float f) {
        this.f10135h = m12589F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void mo9923M(int i) {
        this.f10133f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: k */
    public boolean mo2097k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f10130c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2031B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10130c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10130c = false;
        }
        if (!z) {
            return false;
        }
        m12591H(coordinatorLayout);
        return this.f10128a.mo5649N(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: l */
    public boolean mo2098l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.mo2098l(coordinatorLayout, v, i);
        if (C1013s.m5793w(v) == 0) {
            C1013s.m5786s0(v, 1);
            m12593N(v);
        }
        return l;
    }
}
