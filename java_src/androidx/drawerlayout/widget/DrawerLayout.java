package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0378a;
import androidx.core.graphics.drawable.C0398a;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C0997d;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;
import p006b.p043i.p045b.C1052c;

public class DrawerLayout extends ViewGroup {

    /* renamed from: b */
    private static final int[] f2184b = {16843828};

    /* renamed from: c */
    static final int[] f2185c = {16842931};

    /* renamed from: d */
    static final boolean f2186d;

    /* renamed from: e */
    private static final boolean f2187e;

    /* renamed from: A */
    private float f2188A;

    /* renamed from: B */
    private float f2189B;

    /* renamed from: C */
    private Drawable f2190C;

    /* renamed from: D */
    private Drawable f2191D;

    /* renamed from: E */
    private Drawable f2192E;

    /* renamed from: F */
    private CharSequence f2193F;

    /* renamed from: G */
    private CharSequence f2194G;

    /* renamed from: H */
    private Object f2195H;

    /* renamed from: I */
    private boolean f2196I;

    /* renamed from: J */
    private Drawable f2197J;

    /* renamed from: K */
    private Drawable f2198K;

    /* renamed from: L */
    private Drawable f2199L;

    /* renamed from: M */
    private Drawable f2200M;

    /* renamed from: N */
    private final ArrayList<View> f2201N;

    /* renamed from: O */
    private Rect f2202O;

    /* renamed from: P */
    private Matrix f2203P;

    /* renamed from: f */
    private final C0425c f2204f;

    /* renamed from: g */
    private float f2205g;

    /* renamed from: h */
    private int f2206h;

    /* renamed from: i */
    private int f2207i;

    /* renamed from: j */
    private float f2208j;

    /* renamed from: k */
    private Paint f2209k;

    /* renamed from: l */
    private final C1052c f2210l;

    /* renamed from: m */
    private final C1052c f2211m;

    /* renamed from: n */
    private final C0431h f2212n;

    /* renamed from: o */
    private final C0431h f2213o;

    /* renamed from: p */
    private int f2214p;

    /* renamed from: q */
    private boolean f2215q;

    /* renamed from: r */
    private boolean f2216r;

    /* renamed from: s */
    private int f2217s;

    /* renamed from: t */
    private int f2218t;

    /* renamed from: u */
    private int f2219u;

    /* renamed from: v */
    private int f2220v;

    /* renamed from: w */
    private boolean f2221w;

    /* renamed from: x */
    private boolean f2222x;

    /* renamed from: y */
    private AbstractC0426d f2223y;

    /* renamed from: z */
    private List<AbstractC0426d> f2224z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class View$OnApplyWindowInsetsListenerC0423a implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC0423a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).mo2412P(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class C0424b extends C0962a {

        /* renamed from: d */
        private final Rect f2226d = new Rect();

        C0424b() {
        }

        /* renamed from: n */
        private void m2161n(C0979c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2127y(childAt)) {
                    cVar.mo5473c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m2162o(C0979c cVar, C0979c cVar2) {
            Rect rect = this.f2226d;
            cVar2.mo5490m(rect);
            cVar.mo5465W(rect);
            cVar2.mo5492n(rect);
            cVar.mo5466X(rect);
            cVar.mo5513z0(cVar2.mo5460M());
            cVar.mo5495o0(cVar2.mo5505u());
            cVar.mo5470a0(cVar2.mo5496p());
            cVar.mo5477e0(cVar2.mo5499r());
            cVar.mo5481g0(cVar2.mo5452E());
            cVar.mo5472b0(cVar2.mo5451D());
            cVar.mo5485i0(cVar2.mo5453F());
            cVar.mo5486j0(cVar2.mo5454G());
            cVar.mo5464U(cVar2.mo5447A());
            cVar.mo5506u0(cVar2.mo5458K());
            cVar.mo5491m0(cVar2.mo5455H());
            cVar.mo5469a(cVar2.mo5487k());
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: a */
        public boolean mo2468a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence q;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo2468a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View n = DrawerLayout.this.mo2439n();
            if (n == null || (q = DrawerLayout.this.mo2454q(DrawerLayout.this.mo2455r(n))) == null) {
                return true;
            }
            text.add(q);
            return true;
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: f */
        public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2361f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            if (DrawerLayout.f2186d) {
                super.mo2362g(view, cVar);
            } else {
                C0979c P = C0979c.m5573P(cVar);
                super.mo2362g(view, P);
                cVar.mo5509w0(view);
                ViewParent E = C1013s.m5727E(view);
                if (E instanceof View) {
                    cVar.mo5498q0((View) E);
                }
                m2162o(cVar, P);
                P.mo5462R();
                m2161n(cVar, (ViewGroup) view);
            }
            cVar.mo5470a0(DrawerLayout.class.getName());
            cVar.mo5485i0(false);
            cVar.mo5486j0(false);
            cVar.mo5463S(C0979c.C0980a.f4701a);
            cVar.mo5463S(C0979c.C0980a.f4702b);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: i */
        public boolean mo2469i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f2186d || DrawerLayout.m2127y(view)) {
                return super.mo2469i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C0425c extends C0962a {
        C0425c() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            if (!DrawerLayout.m2127y(view)) {
                cVar.mo5498q0(null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface AbstractC0426d {
        /* renamed from: a */
        void mo2470a(int i);

        /* renamed from: b */
        void mo2471b(View view);

        /* renamed from: c */
        void mo2472c(View view, float f);

        /* renamed from: d */
        void mo2473d(View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C0427e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2228a = 0;

        /* renamed from: b */
        float f2229b;

        /* renamed from: c */
        boolean f2230c;

        /* renamed from: d */
        int f2231d;

        public C0427e(int i, int i2) {
            super(i, i2);
        }

        public C0427e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2185c);
            this.f2228a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0427e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0427e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0427e(C0427e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f2228a = eVar.f2228a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static class C0428f extends AbstractC1041a {
        public static final Parcelable.Creator<C0428f> CREATOR = new C0429a();

        /* renamed from: d */
        int f2232d = 0;

        /* renamed from: e */
        int f2233e;

        /* renamed from: f */
        int f2234f;

        /* renamed from: g */
        int f2235g;

        /* renamed from: h */
        int f2236h;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        static class C0429a implements Parcelable.ClassLoaderCreator<C0428f> {
            C0429a() {
            }

            /* renamed from: a */
            public C0428f createFromParcel(Parcel parcel) {
                return new C0428f(parcel, null);
            }

            /* renamed from: b */
            public C0428f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0428f(parcel, classLoader);
            }

            /* renamed from: c */
            public C0428f[] newArray(int i) {
                return new C0428f[i];
            }
        }

        public C0428f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2232d = parcel.readInt();
            this.f2233e = parcel.readInt();
            this.f2234f = parcel.readInt();
            this.f2235g = parcel.readInt();
            this.f2236h = parcel.readInt();
        }

        public C0428f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2232d);
            parcel.writeInt(this.f2233e);
            parcel.writeInt(this.f2234f);
            parcel.writeInt(this.f2235g);
            parcel.writeInt(this.f2236h);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public static abstract class AbstractC0430g implements AbstractC0426d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0426d
        /* renamed from: a */
        public void mo2470a(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0426d
        /* renamed from: c */
        public void mo2472c(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0426d
        /* renamed from: d */
        public void mo2473d(View view) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h */
    public class C0431h extends C1052c.AbstractC1055c {

        /* renamed from: a */
        private final int f2237a;

        /* renamed from: b */
        private C1052c f2238b;

        /* renamed from: c */
        private final Runnable f2239c = new RunnableC0432a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h$a */
        class RunnableC0432a implements Runnable {
            RunnableC0432a() {
            }

            public void run() {
                C0431h.this.mo2491o();
            }
        }

        C0431h(int i) {
            this.f2237a = i;
        }

        /* renamed from: n */
        private void m2178n() {
            int i = 3;
            if (this.f2237a == 3) {
                i = 5;
            }
            View l = DrawerLayout.this.mo2437l(i);
            if (l != null) {
                DrawerLayout.this.mo2423d(l);
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: a */
        public int mo2480a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.mo2420c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: b */
        public int mo2481b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: d */
        public int mo2482d(View view) {
            if (DrawerLayout.this.mo2404C(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: f */
        public void mo2483f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View l = drawerLayout.mo2437l(i3);
            if (l != null && DrawerLayout.this.mo2453p(l) == 0) {
                this.f2238b.mo5653b(l, i2);
            }
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: g */
        public boolean mo2484g(int i) {
            return false;
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: h */
        public void mo2485h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f2239c, 160);
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: i */
        public void mo2486i(View view, int i) {
            ((C0427e) view.getLayoutParams()).f2230c = false;
            m2178n();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: j */
        public void mo2487j(int i) {
            DrawerLayout.this.mo2415T(this.f2237a, i, this.f2238b.mo5658v());
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: k */
        public void mo2488k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo2420c(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo2414R(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: l */
        public void mo2489l(View view, float f, float f2) {
            int i;
            float s = DrawerLayout.this.mo2458s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo2420c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && s > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f2238b.mo5648M(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p006b.p043i.p045b.C1052c.AbstractC1055c
        /* renamed from: m */
        public boolean mo2490m(View view, int i) {
            return DrawerLayout.this.mo2404C(view) && DrawerLayout.this.mo2420c(view, this.f2237a) && DrawerLayout.this.mo2453p(view) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo2491o() {
            View view;
            int i;
            int w = this.f2238b.mo5659w();
            int i2 = 0;
            boolean z = this.f2237a == 3;
            if (z) {
                view = DrawerLayout.this.mo2437l(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + w;
            } else {
                view = DrawerLayout.this.mo2437l(5);
                i = DrawerLayout.this.getWidth() - w;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo2453p(view) == 0) {
                this.f2238b.mo5650O(view, i, view.getTop());
                ((C0427e) view.getLayoutParams()).f2230c = true;
                DrawerLayout.this.invalidate();
                m2178n();
                DrawerLayout.this.mo2419b();
            }
        }

        /* renamed from: p */
        public void mo2492p() {
            DrawerLayout.this.removeCallbacks(this.f2239c);
        }

        /* renamed from: q */
        public void mo2493q(C1052c cVar) {
            this.f2238b = cVar;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        f2186d = i >= 19;
        if (i < 21) {
            z = false;
        }
        f2187e = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2204f = new C0425c();
        this.f2207i = -1728053248;
        this.f2209k = new Paint();
        this.f2216r = true;
        this.f2217s = 3;
        this.f2218t = 3;
        this.f2219u = 3;
        this.f2220v = 3;
        this.f2197J = null;
        this.f2198K = null;
        this.f2199L = null;
        this.f2200M = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2206h = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0431h hVar = new C0431h(3);
        this.f2212n = hVar;
        C0431h hVar2 = new C0431h(5);
        this.f2213o = hVar2;
        C1052c n = C1052c.m5971n(this, 1.0f, hVar);
        this.f2210l = n;
        n.mo5646K(1);
        n.mo5647L(f2);
        hVar.mo2493q(n);
        C1052c n2 = C1052c.m5971n(this, 1.0f, hVar2);
        this.f2211m = n2;
        n2.mo5646K(2);
        n2.mo5647L(f2);
        hVar2.mo2493q(n2);
        setFocusableInTouchMode(true);
        C1013s.m5786s0(this, 1);
        C1013s.m5766i0(this, new C0424b());
        setMotionEventSplittingEnabled(false);
        if (C1013s.m5791v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0423a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2184b);
                try {
                    this.f2190C = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2190C = null;
            }
        }
        this.f2205g = f * 10.0f;
        this.f2201N = new ArrayList<>();
    }

    /* renamed from: E */
    private boolean m2115E(float f, float f2, View view) {
        if (this.f2202O == null) {
            this.f2202O = new Rect();
        }
        view.getHitRect(this.f2202O);
        return this.f2202O.contains((int) f, (int) f2);
    }

    /* renamed from: F */
    private boolean m2116F(Drawable drawable, int i) {
        if (drawable == null || !C0398a.m1971h(drawable)) {
            return false;
        }
        C0398a.m1976m(drawable, i);
        return true;
    }

    /* renamed from: M */
    private Drawable m2117M() {
        int y = C1013s.m5797y(this);
        if (y == 0) {
            Drawable drawable = this.f2197J;
            if (drawable != null) {
                m2116F(drawable, y);
                return this.f2197J;
            }
        } else {
            Drawable drawable2 = this.f2198K;
            if (drawable2 != null) {
                m2116F(drawable2, y);
                return this.f2198K;
            }
        }
        return this.f2199L;
    }

    /* renamed from: N */
    private Drawable m2118N() {
        int y = C1013s.m5797y(this);
        if (y == 0) {
            Drawable drawable = this.f2198K;
            if (drawable != null) {
                m2116F(drawable, y);
                return this.f2198K;
            }
        } else {
            Drawable drawable2 = this.f2197J;
            if (drawable2 != null) {
                m2116F(drawable2, y);
                return this.f2197J;
            }
        }
        return this.f2200M;
    }

    /* renamed from: O */
    private void m2119O() {
        if (!f2187e) {
            this.f2191D = m2117M();
            this.f2192E = m2118N();
        }
    }

    /* renamed from: S */
    private void m2120S(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1013s.m5786s0(childAt, ((z || mo2404C(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: k */
    private boolean m2121k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent t = m2122t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(t);
            t.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: t */
    private MotionEvent m2122t(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f2203P == null) {
                this.f2203P = new Matrix();
            }
            matrix.invert(this.f2203P);
            obtain.transform(this.f2203P);
        }
        return obtain;
    }

    /* renamed from: u */
    static String m2123u(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: v */
    private static boolean m2124v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: w */
    private boolean m2125w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0427e) getChildAt(i).getLayoutParams()).f2230c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    private boolean m2126x() {
        return mo2439n() != null;
    }

    /* renamed from: y */
    static boolean m2127y(View view) {
        return (C1013s.m5793w(view) == 4 || C1013s.m5793w(view) == 2) ? false : true;
    }

    /* renamed from: A */
    public boolean mo2402A(int i) {
        View l = mo2437l(i);
        if (l != null) {
            return mo2403B(l);
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo2403B(View view) {
        if (mo2404C(view)) {
            return (((C0427e) view.getLayoutParams()).f2231d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo2404C(View view) {
        int b = C0997d.m5669b(((C0427e) view.getLayoutParams()).f2228a, C1013s.m5797y(view));
        return ((b & 3) == 0 && (b & 5) == 0) ? false : true;
    }

    /* renamed from: D */
    public boolean mo2405D(View view) {
        if (mo2404C(view)) {
            return ((C0427e) view.getLayoutParams()).f2229b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo2406G(View view, float f) {
        float s = mo2458s(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (s * width));
        if (!mo2420c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo2414R(view, f);
    }

    /* renamed from: H */
    public void mo2407H(int i) {
        mo2408I(i, true);
    }

    /* renamed from: I */
    public void mo2408I(int i, boolean z) {
        View l = mo2437l(i);
        if (l != null) {
            mo2410K(l, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2123u(i));
    }

    /* renamed from: J */
    public void mo2409J(View view) {
        mo2410K(view, true);
    }

    /* renamed from: K */
    public void mo2410K(View view, boolean z) {
        if (mo2404C(view)) {
            C0427e eVar = (C0427e) view.getLayoutParams();
            if (this.f2216r) {
                eVar.f2229b = 1.0f;
                eVar.f2231d = 1;
                m2120S(view, true);
            } else if (z) {
                eVar.f2231d |= 2;
                if (mo2420c(view, 3)) {
                    this.f2210l.mo5650O(view, 0, view.getTop());
                } else {
                    this.f2211m.mo5650O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo2406G(view, 1.0f);
                mo2415T(eVar.f2228a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: L */
    public void mo2411L(AbstractC0426d dVar) {
        List<AbstractC0426d> list;
        if (dVar != null && (list = this.f2224z) != null) {
            list.remove(dVar);
        }
    }

    /* renamed from: P */
    public void mo2412P(Object obj, boolean z) {
        this.f2195H = obj;
        this.f2196I = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: Q */
    public void mo2413Q(int i, int i2) {
        View l;
        int b = C0997d.m5669b(i2, C1013s.m5797y(this));
        if (i2 == 3) {
            this.f2217s = i;
        } else if (i2 == 5) {
            this.f2218t = i;
        } else if (i2 == 8388611) {
            this.f2219u = i;
        } else if (i2 == 8388613) {
            this.f2220v = i;
        }
        if (i != 0) {
            (b == 3 ? this.f2210l : this.f2211m).mo5652a();
        }
        if (i == 1) {
            View l2 = mo2437l(b);
            if (l2 != null) {
                mo2423d(l2);
            }
        } else if (i == 2 && (l = mo2437l(b)) != null) {
            mo2409J(l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo2414R(View view, float f) {
        C0427e eVar = (C0427e) view.getLayoutParams();
        if (f != eVar.f2229b) {
            eVar.f2229b = f;
            mo2436j(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo2415T(int i, int i2, View view) {
        int z = this.f2210l.mo5661z();
        int z2 = this.f2211m.mo5661z();
        int i3 = 2;
        if (z == 1 || z2 == 1) {
            i3 = 1;
        } else if (!(z == 2 || z2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C0427e) view.getLayoutParams()).f2229b;
            if (f == 0.0f) {
                mo2434h(view);
            } else if (f == 1.0f) {
                mo2435i(view);
            }
        }
        if (i3 != this.f2214p) {
            this.f2214p = i3;
            List<AbstractC0426d> list = this.f2224z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2224z.get(size).mo2470a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2416a(AbstractC0426d dVar) {
        if (dVar != null) {
            if (this.f2224z == null) {
                this.f2224z = new ArrayList();
            }
            this.f2224z.add(dVar);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo2404C(childAt)) {
                    this.f2201N.add(childAt);
                } else if (mo2403B(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f2201N.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f2201N.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f2201N.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C1013s.m5786s0(view, (mo2438m() != null || mo2404C(view)) ? 4 : 1);
        if (!f2186d) {
            C1013s.m5766i0(view, this.f2204f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2419b() {
        if (!this.f2222x) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f2222x = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2420c(View view, int i) {
        return (mo2455r(view) & i) == i;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0427e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0427e) getChildAt(i).getLayoutParams()).f2229b);
        }
        this.f2208j = f;
        boolean m = this.f2210l.mo5656m(true);
        boolean m2 = this.f2211m.mo5656m(true);
        if (m || m2) {
            C1013s.m5748Z(this);
        }
    }

    /* renamed from: d */
    public void mo2423d(View view) {
        mo2426e(view, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2208j <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m2115E(x, y, childAt) && !mo2466z(childAt) && m2121k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int height = getHeight();
        boolean z = mo2466z(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m2124v(childAt) && mo2404C(childAt) && childAt.getHeight() >= height) {
                    if (mo2420c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f2208j;
        if (f <= 0.0f || !z) {
            if (this.f2191D != null && mo2420c(view, 3)) {
                int intrinsicWidth = this.f2191D.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f2210l.mo5659w()), 1.0f));
                this.f2191D.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f2191D.setAlpha((int) (max * 255.0f));
                drawable = this.f2191D;
            } else if (this.f2192E != null && mo2420c(view, 5)) {
                int intrinsicWidth2 = this.f2192E.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f2211m.mo5659w()), 1.0f));
                this.f2192E.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f2192E.setAlpha((int) (max2 * 255.0f));
                drawable = this.f2192E;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.f2207i;
            this.f2209k.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f2209k);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo2426e(View view, boolean z) {
        C1052c cVar;
        int i;
        if (mo2404C(view)) {
            C0427e eVar = (C0427e) view.getLayoutParams();
            if (this.f2216r) {
                eVar.f2229b = 0.0f;
                eVar.f2231d = 0;
            } else if (z) {
                eVar.f2231d |= 4;
                if (mo2420c(view, 3)) {
                    cVar = this.f2210l;
                    i = -view.getWidth();
                } else {
                    cVar = this.f2211m;
                    i = getWidth();
                }
                cVar.mo5650O(view, i, view.getTop());
            } else {
                mo2406G(view, 0.0f);
                mo2415T(eVar.f2228a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: f */
    public void mo2427f() {
        mo2428g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2428g(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0427e eVar = (C0427e) childAt.getLayoutParams();
            if (mo2404C(childAt) && (!z || eVar.f2230c)) {
                z2 |= mo2420c(childAt, 3) ? this.f2210l.mo5650O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2211m.mo5650O(childAt, getWidth(), childAt.getTop());
                eVar.f2230c = false;
            }
        }
        this.f2212n.mo2492p();
        this.f2213o.mo2492p();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0427e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0427e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0427e ? new C0427e((C0427e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0427e((ViewGroup.MarginLayoutParams) layoutParams) : new C0427e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f2187e) {
            return this.f2205g;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2190C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2434h(View view) {
        View rootView;
        C0427e eVar = (C0427e) view.getLayoutParams();
        if ((eVar.f2231d & 1) == 1) {
            eVar.f2231d = 0;
            List<AbstractC0426d> list = this.f2224z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2224z.get(size).mo2473d(view);
                }
            }
            m2120S(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2435i(View view) {
        C0427e eVar = (C0427e) view.getLayoutParams();
        if ((eVar.f2231d & 1) == 0) {
            eVar.f2231d = 1;
            List<AbstractC0426d> list = this.f2224z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2224z.get(size).mo2471b(view);
                }
            }
            m2120S(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2436j(View view, float f) {
        List<AbstractC0426d> list = this.f2224z;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2224z.get(size).mo2472c(view, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public View mo2437l(int i) {
        int b = C0997d.m5669b(i, C1013s.m5797y(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo2455r(childAt) & 7) == b) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public View mo2438m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0427e) childAt.getLayoutParams()).f2231d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public View mo2439n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo2404C(childAt) && mo2405D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public int mo2440o(int i) {
        int y = C1013s.m5797y(this);
        if (i == 3) {
            int i2 = this.f2217s;
            if (i2 != 3) {
                return i2;
            }
            int i3 = y == 0 ? this.f2219u : this.f2220v;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f2218t;
            if (i4 != 3) {
                return i4;
            }
            int i5 = y == 0 ? this.f2220v : this.f2219u;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f2219u;
            if (i6 != 3) {
                return i6;
            }
            int i7 = y == 0 ? this.f2217s : this.f2218t;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f2220v;
            if (i8 != 3) {
                return i8;
            }
            int i9 = y == 0 ? this.f2218t : this.f2217s;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2216r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2216r = true;
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (this.f2196I && this.f2190C != null) {
            int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f2195H) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f2190C.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f2190C.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2126x()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View n = mo2439n();
        if (n != null && mo2453p(n) == 0) {
            mo2427f();
        }
        return n != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f2215q = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0427e eVar = (C0427e) childAt.getLayoutParams();
                if (mo2466z(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (mo2420c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.f2229b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i8 - ((int) (eVar.f2229b * f3));
                        f = ((float) (i8 - i11)) / f3;
                        i5 = i11;
                    }
                    boolean z2 = f != eVar.f2229b;
                    int i12 = eVar.f2228a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        mo2414R(childAt, f);
                    }
                    int i19 = eVar.f2229b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f2215q = false;
        this.f2216r = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f2195H != null && C1013s.m5791v(this);
        int y = C1013s.m5797y(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0427e eVar = (C0427e) childAt.getLayoutParams();
                if (z) {
                    int b = C0997d.m5669b(eVar.f2228a, y);
                    boolean v = C1013s.m5791v(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (v) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f2195H;
                            if (b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f2195H;
                        if (b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo2466z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (mo2404C(childAt)) {
                    if (f2187e) {
                        float t = C1013s.m5787t(childAt);
                        float f = this.f2205g;
                        if (t != f) {
                            C1013s.m5780p0(childAt, f);
                        }
                    }
                    int r = mo2455r(childAt) & 7;
                    boolean z4 = r == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f2206h + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m2123u(r) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View l;
        if (!(parcelable instanceof C0428f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0428f fVar = (C0428f) parcelable;
        super.onRestoreInstanceState(fVar.mo5608b());
        int i = fVar.f2232d;
        if (!(i == 0 || (l = mo2437l(i)) == null)) {
            mo2409J(l);
        }
        int i2 = fVar.f2233e;
        if (i2 != 3) {
            mo2413Q(i2, 3);
        }
        int i3 = fVar.f2234f;
        if (i3 != 3) {
            mo2413Q(i3, 5);
        }
        int i4 = fVar.f2235g;
        if (i4 != 3) {
            mo2413Q(i4, 8388611);
        }
        int i5 = fVar.f2236h;
        if (i5 != 3) {
            mo2413Q(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m2119O();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0428f fVar = new C0428f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0427e eVar = (C0427e) getChildAt(i).getLayoutParams();
            int i2 = eVar.f2231d;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f2232d = eVar.f2228a;
            } else {
                i++;
            }
        }
        fVar.f2233e = this.f2217s;
        fVar.f2234f = this.f2218t;
        fVar.f2235g = this.f2219u;
        fVar.f2236h = this.f2220v;
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m;
        this.f2210l.mo5644E(motionEvent);
        this.f2211m.mo5644E(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View t = this.f2210l.mo5657t((int) x, (int) y);
                if (t != null && mo2466z(t)) {
                    float f = x - this.f2188A;
                    float f2 = y - this.f2189B;
                    int y2 = this.f2210l.mo5660y();
                    if (!((f * f) + (f2 * f2) >= ((float) (y2 * y2)) || (m = mo2438m()) == null || mo2453p(m) == 2)) {
                        z = false;
                        mo2428g(z);
                        this.f2221w = false;
                    }
                }
                z = true;
                mo2428g(z);
                this.f2221w = false;
            } else if (action == 3) {
                mo2428g(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.f2188A = x2;
        this.f2189B = y3;
        this.f2221w = false;
        this.f2222x = false;
        return true;
    }

    /* renamed from: p */
    public int mo2453p(View view) {
        if (mo2404C(view)) {
            return mo2440o(((C0427e) view.getLayoutParams()).f2228a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: q */
    public CharSequence mo2454q(int i) {
        int b = C0997d.m5669b(i, C1013s.m5797y(this));
        if (b == 3) {
            return this.f2193F;
        }
        if (b == 5) {
            return this.f2194G;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo2455r(View view) {
        return C0997d.m5669b(((C0427e) view.getLayoutParams()).f2228a, C1013s.m5797y(this));
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f2221w = z;
        if (z) {
            mo2428g(true);
        }
    }

    public void requestLayout() {
        if (!this.f2215q) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo2458s(View view) {
        return ((C0427e) view.getLayoutParams()).f2229b;
    }

    public void setDrawerElevation(float f) {
        this.f2205g = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo2404C(childAt)) {
                C1013s.m5780p0(childAt, this.f2205g);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(AbstractC0426d dVar) {
        AbstractC0426d dVar2 = this.f2223y;
        if (dVar2 != null) {
            mo2411L(dVar2);
        }
        if (dVar != null) {
            mo2416a(dVar);
        }
        this.f2223y = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo2413Q(i, 3);
        mo2413Q(i, 5);
    }

    public void setScrimColor(int i) {
        this.f2207i = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f2190C = i != 0 ? C0378a.m1874d(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2190C = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2190C = new ColorDrawable(i);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo2466z(View view) {
        return ((C0427e) view.getLayoutParams()).f2228a == 0;
    }
}
