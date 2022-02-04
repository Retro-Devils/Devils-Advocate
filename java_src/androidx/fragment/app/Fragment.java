package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0373l;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;
import androidx.lifecycle.AbstractC0636s;
import androidx.lifecycle.C0620h;
import androidx.lifecycle.C0626l;
import androidx.lifecycle.C0635r;
import androidx.savedstate.AbstractC0749b;
import androidx.savedstate.C0748a;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p006b.p030g.p038j.C0953a;
import p006b.p030g.p039k.C1000f;
import p006b.p054n.p055a.AbstractC1081a;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractC0619g, AbstractC0636s, AbstractC0749b {

    /* renamed from: b */
    static final Object f2242b = new Object();

    /* renamed from: A */
    boolean f2243A;

    /* renamed from: B */
    boolean f2244B;

    /* renamed from: C */
    boolean f2245C;

    /* renamed from: D */
    boolean f2246D;

    /* renamed from: E */
    boolean f2247E;

    /* renamed from: F */
    boolean f2248F = true;

    /* renamed from: G */
    private boolean f2249G;

    /* renamed from: H */
    ViewGroup f2250H;

    /* renamed from: I */
    View f2251I;

    /* renamed from: J */
    View f2252J;

    /* renamed from: K */
    boolean f2253K;

    /* renamed from: L */
    boolean f2254L = true;

    /* renamed from: M */
    C0437d f2255M;

    /* renamed from: N */
    Runnable f2256N = new RunnableC0434a();

    /* renamed from: O */
    boolean f2257O;

    /* renamed from: P */
    boolean f2258P;

    /* renamed from: Q */
    float f2259Q;

    /* renamed from: R */
    LayoutInflater f2260R;

    /* renamed from: S */
    boolean f2261S;

    /* renamed from: T */
    AbstractC0614d.EnumC0616b f2262T = AbstractC0614d.EnumC0616b.RESUMED;

    /* renamed from: U */
    C0620h f2263U;

    /* renamed from: V */
    C0494r f2264V;

    /* renamed from: W */
    C0626l<AbstractC0619g> f2265W = new C0626l<>();

    /* renamed from: X */
    C0748a f2266X;

    /* renamed from: Y */
    private int f2267Y;

    /* renamed from: c */
    int f2268c = 0;

    /* renamed from: d */
    Bundle f2269d;

    /* renamed from: e */
    SparseArray<Parcelable> f2270e;

    /* renamed from: f */
    Boolean f2271f;

    /* renamed from: g */
    String f2272g = UUID.randomUUID().toString();

    /* renamed from: h */
    Bundle f2273h;

    /* renamed from: i */
    Fragment f2274i;

    /* renamed from: j */
    String f2275j = null;

    /* renamed from: k */
    int f2276k;

    /* renamed from: l */
    private Boolean f2277l = null;

    /* renamed from: m */
    boolean f2278m;

    /* renamed from: n */
    boolean f2279n;

    /* renamed from: o */
    boolean f2280o;

    /* renamed from: p */
    boolean f2281p;

    /* renamed from: q */
    boolean f2282q;

    /* renamed from: r */
    boolean f2283r;

    /* renamed from: s */
    int f2284s;

    /* renamed from: t */
    LayoutInflater$Factory2C0456j f2285t;

    /* renamed from: u */
    AbstractC0452h f2286u;

    /* renamed from: v */
    LayoutInflater$Factory2C0456j f2287v = new LayoutInflater$Factory2C0456j();

    /* renamed from: w */
    Fragment f2288w;

    /* renamed from: x */
    int f2289x;

    /* renamed from: y */
    int f2290y;

    /* renamed from: z */
    String f2291z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class RunnableC0434a implements Runnable {
        RunnableC0434a() {
        }

        public void run() {
            Fragment.this.mo2592o2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$b */
    public class RunnableC0435b implements Runnable {
        RunnableC0435b() {
        }

        public void run() {
            Fragment.this.mo2539X();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0436c extends AbstractC0449e {
        C0436c() {
        }

        @Override // androidx.fragment.app.AbstractC0449e
        /* renamed from: b */
        public View mo2621b(int i) {
            View view = Fragment.this.f2251I;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0449e
        /* renamed from: c */
        public boolean mo2622c() {
            return Fragment.this.f2251I != null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$d */
    public static class C0437d {

        /* renamed from: a */
        View f2296a;

        /* renamed from: b */
        Animator f2297b;

        /* renamed from: c */
        int f2298c;

        /* renamed from: d */
        int f2299d;

        /* renamed from: e */
        int f2300e;

        /* renamed from: f */
        int f2301f;

        /* renamed from: g */
        Object f2302g = null;

        /* renamed from: h */
        Object f2303h;

        /* renamed from: i */
        Object f2304i;

        /* renamed from: j */
        Object f2305j;

        /* renamed from: k */
        Object f2306k;

        /* renamed from: l */
        Object f2307l;

        /* renamed from: m */
        Boolean f2308m;

        /* renamed from: n */
        Boolean f2309n;

        /* renamed from: o */
        AbstractC0373l f2310o;

        /* renamed from: p */
        AbstractC0373l f2311p;

        /* renamed from: q */
        boolean f2312q;

        /* renamed from: r */
        AbstractC0439f f2313r;

        /* renamed from: s */
        boolean f2314s;

        C0437d() {
            Object obj = Fragment.f2242b;
            this.f2303h = obj;
            this.f2304i = null;
            this.f2305j = obj;
            this.f2306k = null;
            this.f2307l = obj;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C0438e extends RuntimeException {
        public C0438e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$f */
    public interface AbstractC0439f {
        /* renamed from: a */
        void mo2623a();

        /* renamed from: b */
        void mo2624b();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.Fragment$g */
    public static class C0440g implements Parcelable {
        public static final Parcelable.Creator<C0440g> CREATOR = new C0441a();

        /* renamed from: b */
        final Bundle f2315b;

        /* renamed from: androidx.fragment.app.Fragment$g$a */
        static class C0441a implements Parcelable.ClassLoaderCreator<C0440g> {
            C0441a() {
            }

            /* renamed from: a */
            public C0440g createFromParcel(Parcel parcel) {
                return new C0440g(parcel, null);
            }

            /* renamed from: b */
            public C0440g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0440g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0440g[] newArray(int i) {
                return new C0440g[i];
            }
        }

        C0440g(Bundle bundle) {
            this.f2315b = bundle;
        }

        C0440g(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2315b = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2315b);
        }
    }

    public Fragment() {
        m2193G0();
    }

    /* renamed from: G0 */
    private void m2193G0() {
        this.f2263U = new C0620h(this);
        this.f2266X = C0748a.m4448a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2263U.mo3664a(new AbstractC0617e() {
                /* class androidx.fragment.app.Fragment.C04332 */

                @Override // androidx.lifecycle.AbstractC0617e
                /* renamed from: d */
                public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
                    View view;
                    if (aVar == AbstractC0614d.EnumC0615a.ON_STOP && (view = Fragment.this.f2251I) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: I0 */
    public static Fragment m2194I0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0451g.m2419d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo2554c2(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0438e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0438e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0438e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0438e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: a0 */
    private C0437d m2195a0() {
        if (this.f2255M == null) {
            this.f2255M = new C0437d();
        }
        return this.f2255M;
    }

    /* renamed from: A0 */
    public Object mo2495A0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2306k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public boolean mo2496A1(MenuItem menuItem) {
        if (!this.f2243A) {
            return mo2535V0(menuItem) || this.f2287v.mo2748D(menuItem);
        }
        return false;
    }

    /* renamed from: B0 */
    public Object mo2497B0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2307l;
        return obj == f2242b ? mo2495A0() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo2498B1(Bundle bundle) {
        this.f2287v.mo2779U0();
        this.f2268c = 1;
        this.f2249G = false;
        this.f2266X.mo4511c(bundle);
        mo2537W0(bundle);
        this.f2261S = true;
        if (this.f2249G) {
            this.f2263U.mo3668i(AbstractC0614d.EnumC0615a.ON_CREATE);
            return;
        }
        throw new C0495s("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public int mo2499C0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2298c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C1 */
    public boolean mo2500C1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2243A) {
            return false;
        }
        if (this.f2247E && this.f2248F) {
            z = true;
            mo2545Z0(menu, menuInflater);
        }
        return z | this.f2287v.mo2752F(menu, menuInflater);
    }

    /* renamed from: D0 */
    public final String mo2501D0(int i) {
        return mo2613x0().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public void mo2502D1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2287v.mo2779U0();
        this.f2283r = true;
        this.f2264V = new C0494r();
        View a1 = mo2547a1(layoutInflater, viewGroup, bundle);
        this.f2251I = a1;
        if (a1 != null) {
            this.f2264V.mo2916b();
            this.f2265W.mo3645h(this.f2264V);
        } else if (!this.f2264V.mo2917c()) {
            this.f2264V = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: E0 */
    public final Fragment mo2503E0() {
        String str;
        Fragment fragment = this.f2274i;
        if (fragment != null) {
            return fragment;
        }
        LayoutInflater$Factory2C0456j jVar = this.f2285t;
        if (jVar == null || (str = this.f2275j) == null) {
            return null;
        }
        return jVar.f2384k.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E1 */
    public void mo2504E1() {
        this.f2287v.mo2754G();
        this.f2263U.mo3668i(AbstractC0614d.EnumC0615a.ON_DESTROY);
        this.f2268c = 0;
        this.f2249G = false;
        this.f2261S = false;
        mo2550b1();
        if (!this.f2249G) {
            throw new C0495s("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* renamed from: F0 */
    public View mo2505F0() {
        return this.f2251I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public void mo2506F1() {
        this.f2287v.mo2755H();
        if (this.f2251I != null) {
            this.f2264V.mo2915a(AbstractC0614d.EnumC0615a.ON_DESTROY);
        }
        this.f2268c = 1;
        this.f2249G = false;
        mo2556d1();
        if (this.f2249G) {
            AbstractC1081a.m6112b(this).mo5713c();
            this.f2283r = false;
            return;
        }
        throw new C0495s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public void mo2507G1() {
        this.f2249G = false;
        mo2559e1();
        this.f2260R = null;
        if (!this.f2249G) {
            throw new C0495s("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2287v.mo2753F0()) {
            this.f2287v.mo2754G();
            this.f2287v = new LayoutInflater$Factory2C0456j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo2508H0() {
        m2193G0();
        this.f2272g = UUID.randomUUID().toString();
        this.f2278m = false;
        this.f2279n = false;
        this.f2280o = false;
        this.f2281p = false;
        this.f2282q = false;
        this.f2284s = 0;
        this.f2285t = null;
        this.f2287v = new LayoutInflater$Factory2C0456j();
        this.f2286u = null;
        this.f2289x = 0;
        this.f2290y = 0;
        this.f2291z = null;
        this.f2243A = false;
        this.f2244B = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public LayoutInflater mo2509H1(Bundle bundle) {
        LayoutInflater f1 = mo2563f1(bundle);
        this.f2260R = f1;
        return f1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public void mo2510I1() {
        onLowMemory();
        this.f2287v.mo2757I();
    }

    /* renamed from: J0 */
    public final boolean mo2511J0() {
        return this.f2286u != null && this.f2278m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void mo2512J1(boolean z) {
        mo2576j1(z);
        this.f2287v.mo2759J(z);
    }

    /* renamed from: K0 */
    public final boolean mo2513K0() {
        return this.f2243A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public boolean mo2514K1(MenuItem menuItem) {
        if (!this.f2243A) {
            return (this.f2247E && this.f2248F && mo2579k1(menuItem)) || this.f2287v.mo2785Y(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean mo2515L0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return false;
        }
        return dVar.f2314s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public void mo2516L1(Menu menu) {
        if (!this.f2243A) {
            if (this.f2247E && this.f2248F) {
                mo2582l1(menu);
            }
            this.f2287v.mo2786Z(menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public final boolean mo2517M0() {
        return this.f2284s > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public void mo2518M1() {
        this.f2287v.mo2788b0();
        if (this.f2251I != null) {
            this.f2264V.mo2915a(AbstractC0614d.EnumC0615a.ON_PAUSE);
        }
        this.f2263U.mo3668i(AbstractC0614d.EnumC0615a.ON_PAUSE);
        this.f2268c = 3;
        this.f2249G = false;
        mo2585m1();
        if (!this.f2249G) {
            throw new C0495s("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo2519N0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return false;
        }
        return dVar.f2312q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo2520N1(boolean z) {
        mo2588n1(z);
        this.f2287v.mo2790c0(z);
    }

    /* renamed from: O0 */
    public final boolean mo2521O0() {
        LayoutInflater$Factory2C0456j jVar = this.f2285t;
        if (jVar == null) {
            return false;
        }
        return jVar.mo2760J0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo2522O1(Menu menu) {
        boolean z = false;
        if (this.f2243A) {
            return false;
        }
        if (this.f2247E && this.f2248F) {
            z = true;
            mo2591o1(menu);
        }
        return z | this.f2287v.mo2792d0(menu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo2523P0() {
        this.f2287v.mo2779U0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public void mo2524P1() {
        boolean H0 = this.f2285t.mo2756H0(this);
        Boolean bool = this.f2277l;
        if (bool == null || bool.booleanValue() != H0) {
            this.f2277l = Boolean.valueOf(H0);
            mo2597p1(H0);
            this.f2287v.mo2794e0();
        }
    }

    /* renamed from: Q0 */
    public void mo2525Q0(Bundle bundle) {
        this.f2249G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public void mo2526Q1() {
        this.f2287v.mo2779U0();
        this.f2287v.mo2812o0();
        this.f2268c = 4;
        this.f2249G = false;
        mo2601r1();
        if (this.f2249G) {
            C0620h hVar = this.f2263U;
            AbstractC0614d.EnumC0615a aVar = AbstractC0614d.EnumC0615a.ON_RESUME;
            hVar.mo3668i(aVar);
            if (this.f2251I != null) {
                this.f2264V.mo2915a(aVar);
            }
            this.f2287v.mo2795f0();
            this.f2287v.mo2812o0();
            return;
        }
        throw new C0495s("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: R0 */
    public void mo2527R0(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public void mo2528R1(Bundle bundle) {
        mo2603s1(bundle);
        this.f2266X.mo4512d(bundle);
        Parcelable f1 = this.f2287v.mo2796f1();
        if (f1 != null) {
            bundle.putParcelable("android:support:fragments", f1);
        }
    }

    @Deprecated
    /* renamed from: S0 */
    public void mo2529S0(Activity activity) {
        this.f2249G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public void mo2530S1() {
        this.f2287v.mo2779U0();
        this.f2287v.mo2812o0();
        this.f2268c = 3;
        this.f2249G = false;
        mo2605t1();
        if (this.f2249G) {
            C0620h hVar = this.f2263U;
            AbstractC0614d.EnumC0615a aVar = AbstractC0614d.EnumC0615a.ON_START;
            hVar.mo3668i(aVar);
            if (this.f2251I != null) {
                this.f2264V.mo2915a(aVar);
            }
            this.f2287v.mo2797g0();
            return;
        }
        throw new C0495s("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: T0 */
    public void mo2531T0(Context context) {
        this.f2249G = true;
        AbstractC0452h hVar = this.f2286u;
        Activity d = hVar == null ? null : hVar.mo2726d();
        if (d != null) {
            this.f2249G = false;
            mo2529S0(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo2532T1() {
        this.f2287v.mo2800i0();
        if (this.f2251I != null) {
            this.f2264V.mo2915a(AbstractC0614d.EnumC0615a.ON_STOP);
        }
        this.f2263U.mo3668i(AbstractC0614d.EnumC0615a.ON_STOP);
        this.f2268c = 2;
        this.f2249G = false;
        mo2608u1();
        if (!this.f2249G) {
            throw new C0495s("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: U0 */
    public void mo2533U0(Fragment fragment) {
    }

    /* renamed from: U1 */
    public final ActivityC0447d mo2534U1() {
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null) {
            return c0;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: V0 */
    public boolean mo2535V0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: V1 */
    public final Context mo2536V1() {
        Context j0 = mo2575j0();
        if (j0 != null) {
            return j0;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        this.f2249G = true;
        mo2543Y1(bundle);
        if (!this.f2287v.mo2758I0(1)) {
            this.f2287v.mo2750E();
        }
    }

    /* renamed from: W1 */
    public final AbstractC0453i mo2538W1() {
        AbstractC0453i o0 = mo2590o0();
        if (o0 != null) {
            return o0;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo2539X() {
        C0437d dVar = this.f2255M;
        AbstractC0439f fVar = null;
        if (dVar != null) {
            dVar.f2312q = false;
            AbstractC0439f fVar2 = dVar.f2313r;
            dVar.f2313r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.mo2623a();
        }
    }

    /* renamed from: X0 */
    public Animation mo2540X0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: X1 */
    public final View mo2541X1() {
        View F0 = mo2505F0();
        if (F0 != null) {
            return F0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // androidx.lifecycle.AbstractC0636s
    /* renamed from: Y */
    public C0635r mo139Y() {
        LayoutInflater$Factory2C0456j jVar = this.f2285t;
        if (jVar != null) {
            return jVar.mo2747C0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: Y0 */
    public Animator mo2542Y0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void mo2543Y1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2287v.mo2793d1(parcelable);
            this.f2287v.mo2750E();
        }
    }

    /* renamed from: Z */
    public void mo2544Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2289x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2290y));
        printWriter.print(" mTag=");
        printWriter.println(this.f2291z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2268c);
        printWriter.print(" mWho=");
        printWriter.print(this.f2272g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2284s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2278m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2279n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2280o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2281p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2243A);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2244B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2248F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2247E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2245C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2254L);
        if (this.f2285t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2285t);
        }
        if (this.f2286u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2286u);
        }
        if (this.f2288w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2288w);
        }
        if (this.f2273h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2273h);
        }
        if (this.f2269d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2269d);
        }
        if (this.f2270e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2270e);
        }
        Fragment E0 = mo2503E0();
        if (E0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(E0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2276k);
        }
        if (mo2602s0() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo2602s0());
        }
        if (this.f2250H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2250H);
        }
        if (this.f2251I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2251I);
        }
        if (this.f2252J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f2251I);
        }
        if (mo2562f0() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo2562f0());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo2499C0());
        }
        if (mo2575j0() != null) {
            AbstractC1081a.m6112b(this).mo5712a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2287v + ":");
        LayoutInflater$Factory2C0456j jVar = this.f2287v;
        jVar.mo2730b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: Z0 */
    public void mo2545Z0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public final void mo2546Z1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2270e;
        if (sparseArray != null) {
            this.f2252J.restoreHierarchyState(sparseArray);
            this.f2270e = null;
        }
        this.f2249G = false;
        mo2612w1(bundle);
        if (!this.f2249G) {
            throw new C0495s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2251I != null) {
            this.f2264V.mo2915a(AbstractC0614d.EnumC0615a.ON_CREATE);
        }
    }

    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2267Y;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public void mo2548a2(View view) {
        m2195a0().f2296a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public Fragment mo2549b0(String str) {
        return str.equals(this.f2272g) ? this : this.f2287v.mo2820t0(str);
    }

    /* renamed from: b1 */
    public void mo2550b1() {
        this.f2249G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public void mo2551b2(Animator animator) {
        m2195a0().f2297b = animator;
    }

    /* renamed from: c0 */
    public final ActivityC0447d mo2552c0() {
        AbstractC0452h hVar = this.f2286u;
        if (hVar == null) {
            return null;
        }
        return (ActivityC0447d) hVar.mo2726d();
    }

    /* renamed from: c1 */
    public void mo2553c1() {
    }

    /* renamed from: c2 */
    public void mo2554c2(Bundle bundle) {
        if (this.f2285t == null || !mo2521O0()) {
            this.f2273h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* renamed from: d0 */
    public boolean mo2555d0() {
        Boolean bool;
        C0437d dVar = this.f2255M;
        if (dVar == null || (bool = dVar.f2309n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: d1 */
    public void mo2556d1() {
        this.f2249G = true;
    }

    /* renamed from: d2 */
    public void mo2557d2(boolean z) {
        if (this.f2247E != z) {
            this.f2247E = z;
            if (mo2511J0() && !mo2513K0()) {
                this.f2286u.mo2698p();
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo2558e0() {
        Boolean bool;
        C0437d dVar = this.f2255M;
        if (dVar == null || (bool = dVar.f2308m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: e1 */
    public void mo2559e1() {
        this.f2249G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public void mo2560e2(boolean z) {
        m2195a0().f2314s = z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public View mo2562f0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2296a;
    }

    /* renamed from: f1 */
    public LayoutInflater mo2563f1(Bundle bundle) {
        return mo2600r0(bundle);
    }

    /* renamed from: f2 */
    public void mo2564f2(C0440g gVar) {
        Bundle bundle;
        if (this.f2285t == null) {
            if (gVar == null || (bundle = gVar.f2315b) == null) {
                bundle = null;
            }
            this.f2269d = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public Animator mo2565g0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2297b;
    }

    /* renamed from: g1 */
    public void mo2566g1(boolean z) {
    }

    /* renamed from: g2 */
    public void mo2567g2(boolean z) {
        if (this.f2248F != z) {
            this.f2248F = z;
            if (this.f2247E && mo2511J0() && !mo2513K0()) {
                this.f2286u.mo2698p();
            }
        }
    }

    /* renamed from: h0 */
    public final Bundle mo2568h0() {
        return this.f2273h;
    }

    @Deprecated
    /* renamed from: h1 */
    public void mo2569h1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2249G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public void mo2570h2(int i) {
        if (this.f2255M != null || i != 0) {
            m2195a0().f2299d = i;
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public final AbstractC0453i mo2572i0() {
        if (this.f2286u != null) {
            return this.f2287v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: i1 */
    public void mo2573i1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2249G = true;
        AbstractC0452h hVar = this.f2286u;
        Activity d = hVar == null ? null : hVar.mo2726d();
        if (d != null) {
            this.f2249G = false;
            mo2569h1(d, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i2 */
    public void mo2574i2(int i, int i2) {
        if (this.f2255M != null || i != 0 || i2 != 0) {
            m2195a0();
            C0437d dVar = this.f2255M;
            dVar.f2300e = i;
            dVar.f2301f = i2;
        }
    }

    /* renamed from: j0 */
    public Context mo2575j0() {
        AbstractC0452h hVar = this.f2286u;
        if (hVar == null) {
            return null;
        }
        return hVar.mo2727e();
    }

    /* renamed from: j1 */
    public void mo2576j1(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public void mo2577j2(AbstractC0439f fVar) {
        m2195a0();
        C0437d dVar = this.f2255M;
        AbstractC0439f fVar2 = dVar.f2313r;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                if (dVar.f2312q) {
                    dVar.f2313r = fVar;
                }
                if (fVar != null) {
                    fVar.mo2624b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: k0 */
    public Object mo2578k0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2302g;
    }

    /* renamed from: k1 */
    public boolean mo2579k1(MenuItem menuItem) {
        return false;
    }

    /* renamed from: k2 */
    public void mo2580k2(boolean z) {
        this.f2245C = z;
        LayoutInflater$Factory2C0456j jVar = this.f2285t;
        if (jVar == null) {
            this.f2246D = true;
        } else if (z) {
            jVar.mo2815p(this);
        } else {
            jVar.mo2789b1(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public AbstractC0373l mo2581l0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2310o;
    }

    /* renamed from: l1 */
    public void mo2582l1(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public void mo2583l2(int i) {
        m2195a0().f2298c = i;
    }

    /* renamed from: m0 */
    public Object mo2584m0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2304i;
    }

    /* renamed from: m1 */
    public void mo2585m1() {
        this.f2249G = true;
    }

    /* renamed from: m2 */
    public void mo2586m2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo2589n2(intent, null);
    }

    @Override // androidx.lifecycle.AbstractC0619g
    /* renamed from: n */
    public AbstractC0614d mo140n() {
        return this.f2263U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public AbstractC0373l mo2587n0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        return dVar.f2311p;
    }

    /* renamed from: n1 */
    public void mo2588n1(boolean z) {
    }

    /* renamed from: n2 */
    public void mo2589n2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC0452h hVar = this.f2286u;
        if (hVar != null) {
            hVar.mo2697o(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: o0 */
    public final AbstractC0453i mo2590o0() {
        return this.f2285t;
    }

    /* renamed from: o1 */
    public void mo2591o1(Menu menu) {
    }

    /* renamed from: o2 */
    public void mo2592o2() {
        LayoutInflater$Factory2C0456j jVar = this.f2285t;
        if (jVar == null || jVar.f2394u == null) {
            m2195a0().f2312q = false;
        } else if (Looper.myLooper() != this.f2285t.f2394u.mo2728f().getLooper()) {
            this.f2285t.f2394u.mo2728f().postAtFrontOfQueue(new RunnableC0435b());
        } else {
            mo2539X();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2249G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo2534U1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2249G = true;
    }

    /* renamed from: p0 */
    public final Object mo2596p0() {
        AbstractC0452h hVar = this.f2286u;
        if (hVar == null) {
            return null;
        }
        return hVar.mo2692i();
    }

    /* renamed from: p1 */
    public void mo2597p1(boolean z) {
    }

    /* renamed from: q0 */
    public final LayoutInflater mo2598q0() {
        LayoutInflater layoutInflater = this.f2260R;
        return layoutInflater == null ? mo2509H1(null) : layoutInflater;
    }

    /* renamed from: q1 */
    public void mo2599q1(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    /* renamed from: r0 */
    public LayoutInflater mo2600r0(Bundle bundle) {
        AbstractC0452h hVar = this.f2286u;
        if (hVar != null) {
            LayoutInflater j = hVar.mo2693j();
            C1000f.m5678b(j, this.f2287v.mo2743A0());
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: r1 */
    public void mo2601r1() {
        this.f2249G = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public int mo2602s0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2299d;
    }

    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
    }

    @Override // androidx.savedstate.AbstractC0749b
    /* renamed from: t */
    public final SavedStateRegistry mo146t() {
        return this.f2266X.mo4510b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public int mo2604t0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2300e;
    }

    /* renamed from: t1 */
    public void mo2605t1() {
        this.f2249G = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0953a.m5480a(this, sb);
        sb.append(" (");
        sb.append(this.f2272g);
        sb.append(")");
        if (this.f2289x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2289x));
        }
        if (this.f2291z != null) {
            sb.append(" ");
            sb.append(this.f2291z);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public int mo2607u0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2301f;
    }

    /* renamed from: u1 */
    public void mo2608u1() {
        this.f2249G = true;
    }

    /* renamed from: v0 */
    public final Fragment mo2609v0() {
        return this.f2288w;
    }

    /* renamed from: v1 */
    public void mo2610v1(View view, Bundle bundle) {
    }

    /* renamed from: w0 */
    public Object mo2611w0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2305j;
        return obj == f2242b ? mo2584m0() : obj;
    }

    /* renamed from: w1 */
    public void mo2612w1(Bundle bundle) {
        this.f2249G = true;
    }

    /* renamed from: x0 */
    public final Resources mo2613x0() {
        return mo2536V1().getResources();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo2614x1(Bundle bundle) {
        this.f2287v.mo2779U0();
        this.f2268c = 2;
        this.f2249G = false;
        mo2525Q0(bundle);
        if (this.f2249G) {
            this.f2287v.mo2744B();
            return;
        }
        throw new C0495s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: y0 */
    public final boolean mo2615y0() {
        return this.f2245C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo2616y1() {
        this.f2287v.mo2817s(this.f2286u, new C0436c(), this);
        this.f2249G = false;
        mo2531T0(this.f2286u.mo2727e());
        if (!this.f2249G) {
            throw new C0495s("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: z0 */
    public Object mo2617z0() {
        C0437d dVar = this.f2255M;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2303h;
        return obj == f2242b ? mo2578k0() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo2618z1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2287v.mo2746C(configuration);
    }
}
