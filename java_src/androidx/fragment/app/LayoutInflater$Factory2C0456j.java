package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.AbstractC0049b;
import androidx.activity.AbstractC0050c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.AbstractC0453i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0619g;
import androidx.lifecycle.AbstractC0636s;
import androidx.lifecycle.C0635r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p006b.p021d.C0825b;
import p006b.p030g.p038j.C0953a;
import p006b.p030g.p038j.C0954b;
import p006b.p030g.p039k.ViewTreeObserver$OnPreDrawListenerC1011q;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.j */
public final class LayoutInflater$Factory2C0456j extends AbstractC0453i implements LayoutInflater.Factory2 {

    /* renamed from: d */
    static boolean f2366d = false;

    /* renamed from: e */
    static final Interpolator f2367e = new DecelerateInterpolator(2.5f);

    /* renamed from: f */
    static final Interpolator f2368f = new DecelerateInterpolator(1.5f);

    /* renamed from: A */
    boolean f2369A;

    /* renamed from: B */
    boolean f2370B;

    /* renamed from: C */
    boolean f2371C;

    /* renamed from: D */
    ArrayList<C0442a> f2372D;

    /* renamed from: E */
    ArrayList<Boolean> f2373E;

    /* renamed from: F */
    ArrayList<Fragment> f2374F;

    /* renamed from: G */
    Bundle f2375G = null;

    /* renamed from: H */
    SparseArray<Parcelable> f2376H = null;

    /* renamed from: I */
    ArrayList<C0470m> f2377I;

    /* renamed from: J */
    private C0473l f2378J;

    /* renamed from: K */
    Runnable f2379K = new RunnableC0458b();

    /* renamed from: g */
    ArrayList<AbstractC0468k> f2380g;

    /* renamed from: h */
    boolean f2381h;

    /* renamed from: i */
    int f2382i = 0;

    /* renamed from: j */
    final ArrayList<Fragment> f2383j = new ArrayList<>();

    /* renamed from: k */
    final HashMap<String, Fragment> f2384k = new HashMap<>();

    /* renamed from: l */
    ArrayList<C0442a> f2385l;

    /* renamed from: m */
    ArrayList<Fragment> f2386m;

    /* renamed from: n */
    private OnBackPressedDispatcher f2387n;

    /* renamed from: o */
    private final AbstractC0049b f2388o = new C0457a(false);

    /* renamed from: p */
    ArrayList<C0442a> f2389p;

    /* renamed from: q */
    ArrayList<Integer> f2390q;

    /* renamed from: r */
    ArrayList<AbstractC0453i.AbstractC0455b> f2391r;

    /* renamed from: s */
    private final CopyOnWriteArrayList<C0466i> f2392s = new CopyOnWriteArrayList<>();

    /* renamed from: t */
    int f2393t = 0;

    /* renamed from: u */
    AbstractC0452h f2394u;

    /* renamed from: v */
    AbstractC0449e f2395v;

    /* renamed from: w */
    Fragment f2396w;

    /* renamed from: x */
    Fragment f2397x;

    /* renamed from: y */
    boolean f2398y;

    /* renamed from: z */
    boolean f2399z;

    /* renamed from: androidx.fragment.app.j$a */
    class C0457a extends AbstractC0049b {
        C0457a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0049b
        /* renamed from: b */
        public void mo155b() {
            LayoutInflater$Factory2C0456j.this.mo2749D0();
        }
    }

    /* renamed from: androidx.fragment.app.j$b */
    class RunnableC0458b implements Runnable {
        RunnableC0458b() {
        }

        public void run() {
            LayoutInflater$Factory2C0456j.this.mo2812o0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$c  reason: invalid class name */
    public class animationAnimation$AnimationListenerC0459c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2402a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2403b;

        /* renamed from: androidx.fragment.app.j$c$a */
        class RunnableC0460a implements Runnable {
            RunnableC0460a() {
            }

            public void run() {
                if (animationAnimation$AnimationListenerC0459c.this.f2403b.mo2562f0() != null) {
                    animationAnimation$AnimationListenerC0459c.this.f2403b.mo2548a2(null);
                    animationAnimation$AnimationListenerC0459c cVar = animationAnimation$AnimationListenerC0459c.this;
                    LayoutInflater$Factory2C0456j jVar = LayoutInflater$Factory2C0456j.this;
                    Fragment fragment = cVar.f2403b;
                    jVar.mo2777T0(fragment, fragment.mo2499C0(), 0, 0, false);
                }
            }
        }

        animationAnimation$AnimationListenerC0459c(ViewGroup viewGroup, Fragment fragment) {
            this.f2402a = viewGroup;
            this.f2403b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2402a.post(new RunnableC0460a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$d */
    public class C0461d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2406a;

        /* renamed from: b */
        final /* synthetic */ View f2407b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2408c;

        C0461d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2406a = viewGroup;
            this.f2407b = view;
            this.f2408c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2406a.endViewTransition(this.f2407b);
            Animator g0 = this.f2408c.mo2565g0();
            this.f2408c.mo2551b2(null);
            if (g0 != null && this.f2406a.indexOfChild(this.f2407b) < 0) {
                LayoutInflater$Factory2C0456j jVar = LayoutInflater$Factory2C0456j.this;
                Fragment fragment = this.f2408c;
                jVar.mo2777T0(fragment, fragment.mo2499C0(), 0, 0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$e */
    public class C0462e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2410a;

        /* renamed from: b */
        final /* synthetic */ View f2411b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2412c;

        C0462e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2410a = viewGroup;
            this.f2411b = view;
            this.f2412c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2410a.endViewTransition(this.f2411b);
            animator.removeListener(this);
            Fragment fragment = this.f2412c;
            View view = fragment.f2251I;
            if (view != null && fragment.f2243A) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$f */
    public class C0463f extends C0451g {
        C0463f() {
        }

        @Override // androidx.fragment.app.C0451g
        /* renamed from: a */
        public Fragment mo2725a(ClassLoader classLoader, String str) {
            AbstractC0452h hVar = LayoutInflater$Factory2C0456j.this.f2394u;
            return hVar.mo2700a(hVar.mo2727e(), str, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.j$g */
    public static class C0464g {

        /* renamed from: a */
        public final Animation f2415a;

        /* renamed from: b */
        public final Animator f2416b;

        C0464g(Animator animator) {
            this.f2415a = null;
            this.f2416b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0464g(Animation animation) {
            this.f2415a = animation;
            this.f2416b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.j$h */
    public static class RunnableC0465h extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f2417b;

        /* renamed from: c */
        private final View f2418c;

        /* renamed from: d */
        private boolean f2419d;

        /* renamed from: e */
        private boolean f2420e;

        /* renamed from: f */
        private boolean f2421f = true;

        RunnableC0465h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2417b = viewGroup;
            this.f2418c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f2421f = true;
            if (this.f2419d) {
                return !this.f2420e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2419d = true;
                ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(this.f2417b, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2421f = true;
            if (this.f2419d) {
                return !this.f2420e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2419d = true;
                ViewTreeObserver$OnPreDrawListenerC1011q.m5720a(this.f2417b, this);
            }
            return true;
        }

        public void run() {
            if (this.f2419d || !this.f2421f) {
                this.f2417b.endViewTransition(this.f2418c);
                this.f2420e = true;
                return;
            }
            this.f2421f = false;
            this.f2417b.post(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.j$i */
    public static final class C0466i {

        /* renamed from: a */
        final AbstractC0453i.AbstractC0454a f2422a;

        /* renamed from: b */
        final boolean f2423b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$j */
    public static class C0467j {

        /* renamed from: a */
        public static final int[] f2424a = {16842755, 16842960, 16842961};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$k */
    public interface AbstractC0468k {
        /* renamed from: a */
        boolean mo2633a(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.j$l */
    private class C0469l implements AbstractC0468k {

        /* renamed from: a */
        final String f2425a;

        /* renamed from: b */
        final int f2426b;

        /* renamed from: c */
        final int f2427c;

        C0469l(String str, int i, int i2) {
            this.f2425a = str;
            this.f2426b = i;
            this.f2427c = i2;
        }

        @Override // androidx.fragment.app.LayoutInflater$Factory2C0456j.AbstractC0468k
        /* renamed from: a */
        public boolean mo2633a(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = LayoutInflater$Factory2C0456j.this.f2397x;
            if (fragment == null || this.f2426b >= 0 || this.f2425a != null || !fragment.mo2572i0().mo2737i()) {
                return LayoutInflater$Factory2C0456j.this.mo2784X0(arrayList, arrayList2, this.f2425a, this.f2426b, this.f2427c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$m */
    public static class C0470m implements Fragment.AbstractC0439f {

        /* renamed from: a */
        final boolean f2429a;

        /* renamed from: b */
        final C0442a f2430b;

        /* renamed from: c */
        private int f2431c;

        C0470m(C0442a aVar, boolean z) {
            this.f2429a = z;
            this.f2430b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0439f
        /* renamed from: a */
        public void mo2623a() {
            int i = this.f2431c - 1;
            this.f2431c = i;
            if (i == 0) {
                this.f2430b.f2316s.mo2801i1();
            }
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0439f
        /* renamed from: b */
        public void mo2624b() {
            this.f2431c++;
        }

        /* renamed from: c */
        public void mo2838c() {
            C0442a aVar = this.f2430b;
            aVar.f2316s.mo2824y(aVar, this.f2429a, false, false);
        }

        /* renamed from: d */
        public void mo2839d() {
            boolean z = this.f2431c > 0;
            LayoutInflater$Factory2C0456j jVar = this.f2430b.f2316s;
            int size = jVar.f2383j.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.f2383j.get(i);
                fragment.mo2577j2(null);
                if (z && fragment.mo2519N0()) {
                    fragment.mo2592o2();
                }
            }
            C0442a aVar = this.f2430b;
            aVar.f2316s.mo2824y(aVar, this.f2429a, !z, true);
        }

        /* renamed from: e */
        public boolean mo2840e() {
            return this.f2431c == 0;
        }
    }

    LayoutInflater$Factory2C0456j() {
    }

    /* renamed from: G0 */
    private boolean m2448G0(Fragment fragment) {
        return (fragment.f2247E && fragment.f2248F) || fragment.f2287v.mo2822v();
    }

    /* renamed from: M0 */
    static C0464g m2449M0(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f2368f);
        alphaAnimation.setDuration(220);
        return new C0464g(alphaAnimation);
    }

    /* renamed from: O0 */
    static C0464g m2450O0(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2367e);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f2368f);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0464g(animationSet);
    }

    /* renamed from: P0 */
    private void m2451P0(C0825b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment i2 = bVar.mo4888i(i);
            if (!i2.f2278m) {
                View X1 = i2.mo2541X1();
                i2.f2259Q = X1.getAlpha();
                X1.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: W0 */
    private boolean m2452W0(String str, int i, int i2) {
        mo2812o0();
        m2460m0(true);
        Fragment fragment = this.f2397x;
        if (fragment != null && i < 0 && str == null && fragment.mo2572i0().mo2737i()) {
            return true;
        }
        boolean X0 = mo2784X0(this.f2372D, this.f2373E, str, i, i2);
        if (X0) {
            this.f2381h = true;
            try {
                m2455a1(this.f2372D, this.f2373E);
            } finally {
                m2472x();
            }
        }
        m2465q1();
        mo2802j0();
        m2468u();
        return X0;
    }

    /* renamed from: Y0 */
    private int m2453Y0(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0825b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0442a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo2649v() && !aVar.mo2647t(arrayList, i4 + 1, i2)) {
                if (this.f2377I == null) {
                    this.f2377I = new ArrayList<>();
                }
                C0470m mVar = new C0470m(aVar, booleanValue);
                this.f2377I.add(mVar);
                aVar.mo2651x(mVar);
                if (booleanValue) {
                    aVar.mo2642o();
                } else {
                    aVar.mo2643p(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m2459m(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a0 */
    private void m2454a0(Fragment fragment) {
        if (fragment != null && this.f2384k.get(fragment.f2272g) == fragment) {
            fragment.mo2524P1();
        }
    }

    /* renamed from: a1 */
    private void m2455a1(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m2467r0(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f2474q) {
                    if (i2 != i) {
                        m2464q0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2474q) {
                            i2++;
                        }
                    }
                    m2464q0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m2464q0(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: e1 */
    public static int m2456e1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h0 */
    private void m2457h0(int i) {
        try {
            this.f2381h = true;
            mo2773R0(i, false);
            this.f2381h = false;
            mo2812o0();
        } catch (Throwable th) {
            this.f2381h = false;
            throw th;
        }
    }

    /* renamed from: k0 */
    private void m2458k0() {
        for (Fragment fragment : this.f2384k.values()) {
            if (fragment != null) {
                if (fragment.mo2562f0() != null) {
                    int C0 = fragment.mo2499C0();
                    View f0 = fragment.mo2562f0();
                    Animation animation = f0.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        f0.clearAnimation();
                    }
                    fragment.mo2548a2(null);
                    mo2777T0(fragment, C0, 0, 0, false);
                } else if (fragment.mo2565g0() != null) {
                    fragment.mo2565g0().end();
                }
            }
        }
    }

    /* renamed from: m */
    private void m2459m(C0825b<Fragment> bVar) {
        int i = this.f2393t;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f2383j.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f2383j.get(i2);
                if (fragment.f2268c < min) {
                    mo2777T0(fragment, min, fragment.mo2602s0(), fragment.mo2604t0(), false);
                    if (fragment.f2251I != null && !fragment.f2243A && fragment.f2257O) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: m0 */
    private void m2460m0(boolean z) {
        if (this.f2381h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2394u == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2394u.mo2728f().getLooper()) {
            if (!z) {
                m2471w();
            }
            if (this.f2372D == null) {
                this.f2372D = new ArrayList<>();
                this.f2373E = new ArrayList<>();
            }
            this.f2381h = true;
            try {
                m2467r0(null, null);
            } finally {
                this.f2381h = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: o1 */
    private void m2461o1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0954b("FragmentManager"));
        AbstractC0452h hVar = this.f2394u;
        if (hVar != null) {
            try {
                hVar.mo2691h("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo2730b("  ", null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: p0 */
    private static void m2462p0(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0442a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo2638k(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo2643p(z);
            } else {
                aVar.mo2638k(1);
                aVar.mo2642o();
            }
            i++;
        }
    }

    /* renamed from: p1 */
    public static int m2463p1(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: q0 */
    private void m2464q0(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        boolean z = arrayList.get(i5).f2474q;
        ArrayList<Fragment> arrayList3 = this.f2374F;
        if (arrayList3 == null) {
            this.f2374F = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f2374F.addAll(this.f2383j);
        Fragment B0 = mo2745B0();
        boolean z2 = false;
        for (int i6 = i5; i6 < i2; i6++) {
            C0442a aVar = arrayList.get(i6);
            B0 = !arrayList2.get(i6).booleanValue() ? aVar.mo2644q(this.f2374F, B0) : aVar.mo2652y(this.f2374F, B0);
            z2 = z2 || aVar.f2465h;
        }
        this.f2374F.clear();
        if (!z) {
            C0479o.m2603B(this, arrayList, arrayList2, i, i2, false);
        }
        m2462p0(arrayList, arrayList2, i, i2);
        if (z) {
            C0825b<Fragment> bVar = new C0825b<>();
            m2459m(bVar);
            int Y0 = m2453Y0(arrayList, arrayList2, i, i2, bVar);
            m2451P0(bVar);
            i3 = Y0;
        } else {
            i3 = i2;
        }
        if (i3 != i5 && z) {
            C0479o.m2603B(this, arrayList, arrayList2, i, i3, true);
            mo2773R0(this.f2393t, true);
        }
        while (i5 < i2) {
            C0442a aVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && (i4 = aVar2.f2318u) >= 0) {
                mo2823w0(i4);
                aVar2.f2318u = -1;
            }
            aVar2.mo2650w();
            i5++;
        }
        if (z2) {
            mo2791c1();
        }
    }

    /* renamed from: q1 */
    private void m2465q1() {
        ArrayList<AbstractC0468k> arrayList = this.f2380g;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            AbstractC0049b bVar = this.f2388o;
            if (mo2825y0() <= 0 || !mo2756H0(this.f2396w)) {
                z = false;
            }
            bVar.mo159f(z);
            return;
        }
        this.f2388o.mo159f(true);
    }

    /* renamed from: r */
    private void m2466r(Fragment fragment, C0464g gVar, int i) {
        View view = fragment.f2251I;
        ViewGroup viewGroup = fragment.f2250H;
        viewGroup.startViewTransition(view);
        fragment.mo2583l2(i);
        if (gVar.f2415a != null) {
            RunnableC0465h hVar = new RunnableC0465h(gVar.f2415a, viewGroup, view);
            fragment.mo2548a2(fragment.f2251I);
            hVar.setAnimationListener(new animationAnimation$AnimationListenerC0459c(viewGroup, fragment));
            fragment.f2251I.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f2416b;
        fragment.mo2551b2(animator);
        animator.addListener(new C0461d(viewGroup, view, fragment));
        animator.setTarget(fragment.f2251I);
        animator.start();
    }

    /* renamed from: r0 */
    private void m2467r0(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0470m> arrayList3 = this.f2377I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0470m mVar = this.f2377I.get(i);
            if (arrayList == null || mVar.f2429a || (indexOf2 = arrayList.indexOf(mVar.f2430b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.mo2840e() || (arrayList != null && mVar.f2430b.mo2647t(arrayList, 0, arrayList.size()))) {
                    this.f2377I.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || mVar.f2429a || (indexOf = arrayList.indexOf(mVar.f2430b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.mo2839d();
                    }
                }
                i++;
            } else {
                this.f2377I.remove(i);
                i--;
                size--;
            }
            mVar.mo2838c();
            i++;
        }
    }

    /* renamed from: u */
    private void m2468u() {
        this.f2384k.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: u0 */
    private Fragment m2469u0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2250H;
        View view = fragment.f2251I;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f2383j.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f2383j.get(indexOf);
                if (fragment2.f2250H == viewGroup && fragment2.f2251I != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: v0 */
    private void m2470v0() {
        if (this.f2377I != null) {
            while (!this.f2377I.isEmpty()) {
                this.f2377I.remove(0).mo2839d();
            }
        }
    }

    /* renamed from: w */
    private void m2471w() {
        if (mo2760J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: x */
    private void m2472x() {
        this.f2381h = false;
        this.f2373E.clear();
        this.f2372D.clear();
    }

    /* renamed from: x0 */
    private boolean m2473x0(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<AbstractC0468k> arrayList3 = this.f2380g;
            if (arrayList3 != null) {
                if (arrayList3.size() != 0) {
                    int size = this.f2380g.size();
                    boolean z = false;
                    for (int i = 0; i < size; i++) {
                        z |= this.f2380g.get(i).mo2633a(arrayList, arrayList2);
                    }
                    this.f2380g.clear();
                    this.f2394u.mo2728f().removeCallbacks(this.f2379K);
                    return z;
                }
            }
            return false;
        }
    }

    /* renamed from: A */
    public void mo2742A(Fragment fragment) {
        if (f2366d) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2244B) {
            fragment.f2244B = true;
            if (fragment.f2278m) {
                if (f2366d) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f2383j) {
                    this.f2383j.remove(fragment);
                }
                if (m2448G0(fragment)) {
                    this.f2398y = true;
                }
                fragment.f2278m = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public LayoutInflater.Factory2 mo2743A0() {
        return this;
    }

    /* renamed from: B */
    public void mo2744B() {
        this.f2399z = false;
        this.f2369A = false;
        m2457h0(2);
    }

    /* renamed from: B0 */
    public Fragment mo2745B0() {
        return this.f2397x;
    }

    /* renamed from: C */
    public void mo2746C(Configuration configuration) {
        for (int i = 0; i < this.f2383j.size(); i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null) {
                fragment.mo2618z1(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public C0635r mo2747C0(Fragment fragment) {
        return this.f2378J.mo2854i(fragment);
    }

    /* renamed from: D */
    public boolean mo2748D(MenuItem menuItem) {
        if (this.f2393t < 1) {
            return false;
        }
        for (int i = 0; i < this.f2383j.size(); i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null && fragment.mo2496A1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo2749D0() {
        mo2812o0();
        if (this.f2388o.mo156c()) {
            mo2737i();
        } else {
            this.f2387n.mo152c();
        }
    }

    /* renamed from: E */
    public void mo2750E() {
        this.f2399z = false;
        this.f2369A = false;
        m2457h0(1);
    }

    /* renamed from: E0 */
    public void mo2751E0(Fragment fragment) {
        if (f2366d) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2243A) {
            fragment.f2243A = true;
            fragment.f2258P = true ^ fragment.f2258P;
        }
    }

    /* renamed from: F */
    public boolean mo2752F(Menu menu, MenuInflater menuInflater) {
        if (this.f2393t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f2383j.size(); i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null && fragment.mo2500C1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2386m != null) {
            for (int i2 = 0; i2 < this.f2386m.size(); i2++) {
                Fragment fragment2 = this.f2386m.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.mo2553c1();
                }
            }
        }
        this.f2386m = arrayList;
        return z;
    }

    /* renamed from: F0 */
    public boolean mo2753F0() {
        return this.f2370B;
    }

    /* renamed from: G */
    public void mo2754G() {
        this.f2370B = true;
        mo2812o0();
        m2457h0(0);
        this.f2394u = null;
        this.f2395v = null;
        this.f2396w = null;
        if (this.f2387n != null) {
            this.f2388o.mo157d();
            this.f2387n = null;
        }
    }

    /* renamed from: H */
    public void mo2755H() {
        m2457h0(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean mo2756H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        LayoutInflater$Factory2C0456j jVar = fragment.f2285t;
        return fragment == jVar.mo2745B0() && mo2756H0(jVar.f2396w);
    }

    /* renamed from: I */
    public void mo2757I() {
        for (int i = 0; i < this.f2383j.size(); i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null) {
                fragment.mo2510I1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean mo2758I0(int i) {
        return this.f2393t >= i;
    }

    /* renamed from: J */
    public void mo2759J(boolean z) {
        for (int size = this.f2383j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2383j.get(size);
            if (fragment != null) {
                fragment.mo2512J1(z);
            }
        }
    }

    /* renamed from: J0 */
    public boolean mo2760J0() {
        return this.f2399z || this.f2369A;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2761K(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2761K(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f2423b
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2761K(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public C0464g mo2762K0(Fragment fragment, int i, boolean z, int i2) {
        int p1;
        int s0 = fragment.mo2602s0();
        boolean z2 = false;
        fragment.mo2570h2(0);
        ViewGroup viewGroup = fragment.f2250H;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation X0 = fragment.mo2540X0(i, z, s0);
        if (X0 != null) {
            return new C0464g(X0);
        }
        Animator Y0 = fragment.mo2542Y0(i, z, s0);
        if (Y0 != null) {
            return new C0464g(Y0);
        }
        if (s0 != 0) {
            boolean equals = "anim".equals(this.f2394u.mo2727e().getResources().getResourceTypeName(s0));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2394u.mo2727e(), s0);
                    if (loadAnimation != null) {
                        return new C0464g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2394u.mo2727e(), s0);
                    if (loadAnimator != null) {
                        return new C0464g(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2394u.mo2727e(), s0);
                        if (loadAnimation2 != null) {
                            return new C0464g(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (p1 = m2463p1(i, z)) < 0) {
            return null;
        }
        switch (p1) {
            case 1:
                return m2450O0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m2450O0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m2450O0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m2450O0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m2449M0(0.0f, 1.0f);
            case 6:
                return m2449M0(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f2394u.mo2695l()) {
                    this.f2394u.mo2694k();
                }
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2763L(androidx.fragment.app.Fragment r3, android.content.Context r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2763L(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f2423b
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2763L(androidx.fragment.app.Fragment, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo2764L0(Fragment fragment) {
        if (this.f2384k.get(fragment.f2272g) == null) {
            this.f2384k.put(fragment.f2272g, fragment);
            if (fragment.f2246D) {
                if (fragment.f2245C) {
                    mo2815p(fragment);
                } else {
                    mo2789b1(fragment);
                }
                fragment.f2246D = false;
            }
            if (f2366d) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2765M(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2765M(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f2423b
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2765M(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2766N(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2766N(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2766N(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo2767N0(Fragment fragment) {
        if (this.f2384k.get(fragment.f2272g) != null) {
            if (f2366d) {
                Log.v("FragmentManager", "Removed fragment from active set " + fragment);
            }
            for (Fragment fragment2 : this.f2384k.values()) {
                if (fragment2 != null && fragment.f2272g.equals(fragment2.f2275j)) {
                    fragment2.f2274i = fragment;
                    fragment2.f2275j = null;
                }
            }
            this.f2384k.put(fragment.f2272g, null);
            mo2789b1(fragment);
            String str = fragment.f2275j;
            if (str != null) {
                fragment.f2274i = this.f2384k.get(str);
            }
            fragment.mo2508H0();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2768O(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2768O(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2768O(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2769P(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2769P(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2769P(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2770Q(androidx.fragment.app.Fragment r3, android.content.Context r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2770Q(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f2423b
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2770Q(androidx.fragment.app.Fragment, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo2771Q0(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null) {
            if (this.f2384k.containsKey(fragment.f2272g)) {
                int i = this.f2393t;
                if (fragment.f2279n) {
                    i = fragment.mo2517M0() ? Math.min(i, 1) : Math.min(i, 0);
                }
                mo2777T0(fragment, i, fragment.mo2604t0(), fragment.mo2607u0(), false);
                if (fragment.f2251I != null) {
                    Fragment u0 = m2469u0(fragment);
                    if (u0 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.f2251I)) < (indexOfChild = (viewGroup = fragment.f2250H).indexOfChild(u0.f2251I))) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.f2251I, indexOfChild);
                    }
                    if (fragment.f2257O && fragment.f2250H != null) {
                        float f = fragment.f2259Q;
                        if (f > 0.0f) {
                            fragment.f2251I.setAlpha(f);
                        }
                        fragment.f2259Q = 0.0f;
                        fragment.f2257O = false;
                        C0464g K0 = mo2762K0(fragment, fragment.mo2604t0(), true, fragment.mo2607u0());
                        if (K0 != null) {
                            Animation animation = K0.f2415a;
                            if (animation != null) {
                                fragment.f2251I.startAnimation(animation);
                            } else {
                                K0.f2416b.setTarget(fragment.f2251I);
                                K0.f2416b.start();
                            }
                        }
                    }
                }
                if (fragment.f2258P) {
                    mo2826z(fragment);
                }
            } else if (f2366d) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2393t + "since it is not added to " + this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2772R(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2772R(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f2423b
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2772R(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo2773R0(int i, boolean z) {
        AbstractC0452h hVar;
        if (this.f2394u == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2393t) {
            this.f2393t = i;
            int size = this.f2383j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo2771Q0(this.f2383j.get(i2));
            }
            for (Fragment fragment : this.f2384k.values()) {
                if (fragment != null && ((fragment.f2279n || fragment.f2244B) && !fragment.f2257O)) {
                    mo2771Q0(fragment);
                }
            }
            mo2810n1();
            if (this.f2398y && (hVar = this.f2394u) != null && this.f2393t == 4) {
                hVar.mo2698p();
                this.f2398y = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2774S(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2774S(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2774S(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo2775S0(Fragment fragment) {
        mo2777T0(fragment, this.f2393t, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2776T(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2776T(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f2423b
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2776T(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2777T0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 1282
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2777T0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2778U(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2778U(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2778U(androidx.fragment.app.Fragment, boolean):void");
    }

    /* renamed from: U0 */
    public void mo2779U0() {
        this.f2399z = false;
        this.f2369A = false;
        int size = this.f2383j.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null) {
                fragment.mo2523P0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2780V(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2780V(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2780V(androidx.fragment.app.Fragment, boolean):void");
    }

    /* renamed from: V0 */
    public void mo2781V0(Fragment fragment) {
        if (!fragment.f2253K) {
            return;
        }
        if (this.f2381h) {
            this.f2371C = true;
            return;
        }
        fragment.f2253K = false;
        mo2777T0(fragment, this.f2393t, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2782W(androidx.fragment.app.Fragment r3, android.view.View r4, android.os.Bundle r5, boolean r6) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2782W(r3, r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r4
            if (r6 == 0) goto L_0x002b
            boolean r5 = r4.f2423b
            if (r5 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r4.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2782W(androidx.fragment.app.Fragment, android.view.View, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2783X(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f2396w
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.mo2590o0()
            boolean r1 = r0 instanceof androidx.fragment.app.LayoutInflater$Factory2C0456j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j) r0
            r1 = 1
            r0.mo2783X(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f2392s
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.LayoutInflater$Factory2C0456j.C0466i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f2423b
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            androidx.fragment.app.i$a r3 = r0.f2422a
            r3 = 0
            throw r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflater$Factory2C0456j.mo2783X(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public boolean mo2784X0(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0442a> arrayList3 = this.f2385l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2385l.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0442a aVar = this.f2385l.get(size2);
                    if ((str != null && str.equals(aVar.mo2645r())) || (i >= 0 && i == aVar.f2318u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0442a aVar2 = this.f2385l.get(size2);
                        if ((str == null || !str.equals(aVar2.mo2645r())) && (i < 0 || i != aVar2.f2318u)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f2385l.size() - 1) {
                return false;
            }
            for (int size3 = this.f2385l.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2385l.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: Y */
    public boolean mo2785Y(MenuItem menuItem) {
        if (this.f2393t < 1) {
            return false;
        }
        for (int i = 0; i < this.f2383j.size(); i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null && fragment.mo2514K1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Z */
    public void mo2786Z(Menu menu) {
        if (this.f2393t >= 1) {
            for (int i = 0; i < this.f2383j.size(); i++) {
                Fragment fragment = this.f2383j.get(i);
                if (fragment != null) {
                    fragment.mo2516L1(menu);
                }
            }
        }
    }

    /* renamed from: Z0 */
    public void mo2787Z0(Fragment fragment) {
        if (f2366d) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2284s);
        }
        boolean z = !fragment.mo2517M0();
        if (!fragment.f2244B || z) {
            synchronized (this.f2383j) {
                this.f2383j.remove(fragment);
            }
            if (m2448G0(fragment)) {
                this.f2398y = true;
            }
            fragment.f2278m = false;
            fragment.f2279n = true;
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: a */
    public AbstractC0477n mo2729a() {
        return new C0442a(this);
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: b */
    public void mo2730b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f2384k.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f2384k.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.mo2544Z(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f2383j.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size5; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2383j.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2386m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size4; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f2386m.get(i2).toString());
            }
        }
        ArrayList<C0442a> arrayList2 = this.f2385l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C0442a aVar = this.f2385l.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo2640m(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<C0442a> arrayList3 = this.f2389p;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size2; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((C0442a) this.f2389p.get(i4));
                }
            }
            ArrayList<Integer> arrayList4 = this.f2390q;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2390q.toArray()));
            }
        }
        ArrayList<AbstractC0468k> arrayList5 = this.f2380g;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i5 = 0; i5 < size; i5++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println((AbstractC0468k) this.f2380g.get(i5));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2394u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2395v);
        if (this.f2396w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2396w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2393t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2399z);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2369A);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2370B);
        if (this.f2398y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2398y);
        }
    }

    /* renamed from: b0 */
    public void mo2788b0() {
        m2457h0(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo2789b1(Fragment fragment) {
        if (mo2760J0()) {
            if (f2366d) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f2378J.mo2856k(fragment) && f2366d) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: c */
    public boolean mo2731c() {
        boolean o0 = mo2812o0();
        m2470v0();
        return o0;
    }

    /* renamed from: c0 */
    public void mo2790c0(boolean z) {
        for (int size = this.f2383j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2383j.get(size);
            if (fragment != null) {
                fragment.mo2520N1(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo2791c1() {
        if (this.f2391r != null) {
            for (int i = 0; i < this.f2391r.size(); i++) {
                this.f2391r.get(i).mo2741a();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: d */
    public Fragment mo2732d(String str) {
        if (str != null) {
            for (int size = this.f2383j.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2383j.get(size);
                if (fragment != null && str.equals(fragment.f2291z)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f2384k.values()) {
            if (fragment2 != null && str.equals(fragment2.f2291z)) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: d0 */
    public boolean mo2792d0(Menu menu) {
        if (this.f2393t < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f2383j.size(); i++) {
            Fragment fragment = this.f2383j.get(i);
            if (fragment != null && fragment.mo2522O1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo2793d1(Parcelable parcelable) {
        C0475m mVar;
        if (parcelable != null) {
            C0471k kVar = (C0471k) parcelable;
            if (kVar.f2432b != null) {
                for (Fragment fragment : this.f2378J.mo2852h()) {
                    if (f2366d) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    Iterator<C0475m> it = kVar.f2432b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar = null;
                            break;
                        }
                        mVar = it.next();
                        if (mVar.f2445c.equals(fragment.f2272g)) {
                            break;
                        }
                    }
                    if (mVar == null) {
                        if (f2366d) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f2432b);
                        }
                        mo2777T0(fragment, 1, 0, 0, false);
                        fragment.f2279n = true;
                        mo2777T0(fragment, 0, 0, 0, false);
                    } else {
                        mVar.f2457o = fragment;
                        fragment.f2270e = null;
                        fragment.f2284s = 0;
                        fragment.f2281p = false;
                        fragment.f2278m = false;
                        Fragment fragment2 = fragment.f2274i;
                        fragment.f2275j = fragment2 != null ? fragment2.f2272g : null;
                        fragment.f2274i = null;
                        Bundle bundle = mVar.f2456n;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f2394u.mo2727e().getClassLoader());
                            fragment.f2270e = mVar.f2456n.getSparseParcelableArray("android:view_state");
                            fragment.f2269d = mVar.f2456n;
                        }
                    }
                }
                this.f2384k.clear();
                Iterator<C0475m> it2 = kVar.f2432b.iterator();
                while (it2.hasNext()) {
                    C0475m next = it2.next();
                    if (next != null) {
                        Fragment b = next.mo2860b(this.f2394u.mo2727e().getClassLoader(), mo2734f());
                        b.f2285t = this;
                        if (f2366d) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + b.f2272g + "): " + b);
                        }
                        this.f2384k.put(b.f2272g, b);
                        next.f2457o = null;
                    }
                }
                this.f2383j.clear();
                ArrayList<String> arrayList = kVar.f2433c;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next2 = it3.next();
                        Fragment fragment3 = this.f2384k.get(next2);
                        if (fragment3 == null) {
                            m2461o1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                        }
                        fragment3.f2278m = true;
                        if (f2366d) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                        }
                        if (!this.f2383j.contains(fragment3)) {
                            synchronized (this.f2383j) {
                                this.f2383j.add(fragment3);
                            }
                        } else {
                            throw new IllegalStateException("Already added " + fragment3);
                        }
                    }
                }
                if (kVar.f2434d != null) {
                    this.f2385l = new ArrayList<>(kVar.f2434d.length);
                    int i = 0;
                    while (true) {
                        C0443b[] bVarArr = kVar.f2434d;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C0442a b2 = bVarArr[i].mo2653b(this);
                        if (f2366d) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + b2.f2318u + "): " + b2);
                            PrintWriter printWriter = new PrintWriter(new C0954b("FragmentManager"));
                            b2.mo2641n("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2385l.add(b2);
                        int i2 = b2.f2318u;
                        if (i2 >= 0) {
                            mo2803j1(i2, b2);
                        }
                        i++;
                    }
                } else {
                    this.f2385l = null;
                }
                String str = kVar.f2435e;
                if (str != null) {
                    Fragment fragment4 = this.f2384k.get(str);
                    this.f2397x = fragment4;
                    m2454a0(fragment4);
                }
                this.f2382i = kVar.f2436f;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: e */
    public Fragment mo2733e(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f2384k.get(string);
        if (fragment == null) {
            m2461o1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo2794e0() {
        m2465q1();
        m2454a0(this.f2397x);
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: f */
    public C0451g mo2734f() {
        if (super.mo2734f() == AbstractC0453i.f2364b) {
            Fragment fragment = this.f2396w;
            if (fragment != null) {
                return fragment.f2285t.mo2734f();
            }
            mo2740l(new C0463f());
        }
        return super.mo2734f();
    }

    /* renamed from: f0 */
    public void mo2795f0() {
        this.f2399z = false;
        this.f2369A = false;
        m2457h0(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public Parcelable mo2796f1() {
        ArrayList<String> arrayList;
        int size;
        m2470v0();
        m2458k0();
        mo2812o0();
        this.f2399z = true;
        C0443b[] bVarArr = null;
        if (this.f2384k.isEmpty()) {
            return null;
        }
        ArrayList<C0475m> arrayList2 = new ArrayList<>(this.f2384k.size());
        boolean z = false;
        for (Fragment fragment : this.f2384k.values()) {
            if (fragment != null) {
                if (fragment.f2285t != this) {
                    m2461o1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                C0475m mVar = new C0475m(fragment);
                arrayList2.add(mVar);
                if (fragment.f2268c <= 0 || mVar.f2456n != null) {
                    mVar.f2456n = fragment.f2269d;
                } else {
                    mVar.f2456n = mo2798g1(fragment);
                    String str = fragment.f2275j;
                    if (str != null) {
                        Fragment fragment2 = this.f2384k.get(str);
                        if (fragment2 == null) {
                            m2461o1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f2275j));
                        }
                        if (mVar.f2456n == null) {
                            mVar.f2456n = new Bundle();
                        }
                        mo2738j(mVar.f2456n, "android:target_state", fragment2);
                        int i = fragment.f2276k;
                        if (i != 0) {
                            mVar.f2456n.putInt("android:target_req_state", i);
                        }
                    }
                }
                if (f2366d) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f2456n);
                }
                z = true;
            }
        }
        if (!z) {
            if (f2366d) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f2383j.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f2383j.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2272g);
                if (next.f2285t != this) {
                    m2461o1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (f2366d) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2272g + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<C0442a> arrayList3 = this.f2385l;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new C0443b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new C0443b(this.f2385l.get(i2));
                if (f2366d) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f2385l.get(i2));
                }
            }
        }
        C0471k kVar = new C0471k();
        kVar.f2432b = arrayList2;
        kVar.f2433c = arrayList;
        kVar.f2434d = bVarArr;
        Fragment fragment3 = this.f2397x;
        if (fragment3 != null) {
            kVar.f2435e = fragment3.f2272g;
        }
        kVar.f2436f = this.f2382i;
        return kVar;
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: g */
    public List<Fragment> mo2735g() {
        List<Fragment> list;
        if (this.f2383j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2383j) {
            list = (List) this.f2383j.clone();
        }
        return list;
    }

    /* renamed from: g0 */
    public void mo2797g0() {
        this.f2399z = false;
        this.f2369A = false;
        m2457h0(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public Bundle mo2798g1(Fragment fragment) {
        if (this.f2375G == null) {
            this.f2375G = new Bundle();
        }
        fragment.mo2528R1(this.f2375G);
        mo2776T(fragment, this.f2375G, false);
        Bundle bundle = null;
        if (!this.f2375G.isEmpty()) {
            Bundle bundle2 = this.f2375G;
            this.f2375G = null;
            bundle = bundle2;
        }
        if (fragment.f2251I != null) {
            mo2799h1(fragment);
        }
        if (fragment.f2270e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f2270e);
        }
        if (!fragment.f2254L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f2254L);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: h */
    public void mo2736h(int i, int i2) {
        if (i >= 0) {
            mo2805l0(new C0469l(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo2799h1(Fragment fragment) {
        if (fragment.f2252J != null) {
            SparseArray<Parcelable> sparseArray = this.f2376H;
            if (sparseArray == null) {
                this.f2376H = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.f2252J.saveHierarchyState(this.f2376H);
            if (this.f2376H.size() > 0) {
                fragment.f2270e = this.f2376H;
                this.f2376H = null;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: i */
    public boolean mo2737i() {
        m2471w();
        return m2452W0(null, -1, 0);
    }

    /* renamed from: i0 */
    public void mo2800i0() {
        this.f2369A = true;
        m2457h0(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo2801i1() {
        synchronized (this) {
            ArrayList<C0470m> arrayList = this.f2377I;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            ArrayList<AbstractC0468k> arrayList2 = this.f2380g;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2394u.mo2728f().removeCallbacks(this.f2379K);
                this.f2394u.mo2728f().post(this.f2379K);
                m2465q1();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: j */
    public void mo2738j(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f2285t != this) {
            m2461o1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f2272g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo2802j0() {
        if (this.f2371C) {
            this.f2371C = false;
            mo2810n1();
        }
    }

    /* renamed from: j1 */
    public void mo2803j1(int i, C0442a aVar) {
        synchronized (this) {
            if (this.f2389p == null) {
                this.f2389p = new ArrayList<>();
            }
            int size = this.f2389p.size();
            if (i < size) {
                if (f2366d) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + aVar);
                }
                this.f2389p.set(i, aVar);
            } else {
                while (size < i) {
                    this.f2389p.add(null);
                    if (this.f2390q == null) {
                        this.f2390q = new ArrayList<>();
                    }
                    if (f2366d) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f2390q.add(Integer.valueOf(size));
                    size++;
                }
                if (f2366d) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + aVar);
                }
                this.f2389p.add(aVar);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0453i
    /* renamed from: k */
    public Fragment.C0440g mo2739k(Fragment fragment) {
        Bundle g1;
        if (fragment.f2285t != this) {
            m2461o1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.f2268c <= 0 || (g1 = mo2798g1(fragment)) == null) {
            return null;
        }
        return new Fragment.C0440g(g1);
    }

    /* renamed from: k1 */
    public void mo2804k1(Fragment fragment, AbstractC0614d.EnumC0616b bVar) {
        if (this.f2384k.get(fragment.f2272g) == fragment && (fragment.f2286u == null || fragment.mo2590o0() == this)) {
            fragment.f2262T = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: l0 */
    public void mo2805l0(AbstractC0468k kVar, boolean z) {
        if (!z) {
            m2471w();
        }
        synchronized (this) {
            if (!this.f2370B) {
                if (this.f2394u != null) {
                    if (this.f2380g == null) {
                        this.f2380g = new ArrayList<>();
                    }
                    this.f2380g.add(kVar);
                    mo2801i1();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: l1 */
    public void mo2806l1(Fragment fragment) {
        if (fragment == null || (this.f2384k.get(fragment.f2272g) == fragment && (fragment.f2286u == null || fragment.mo2590o0() == this))) {
            Fragment fragment2 = this.f2397x;
            this.f2397x = fragment;
            m2454a0(fragment2);
            m2454a0(this.f2397x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: m1 */
    public void mo2807m1(Fragment fragment) {
        if (f2366d) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2243A) {
            fragment.f2243A = false;
            fragment.f2258P = !fragment.f2258P;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2808n(C0442a aVar) {
        if (this.f2385l == null) {
            this.f2385l = new ArrayList<>();
        }
        this.f2385l.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo2809n0(Fragment fragment) {
        if (fragment.f2280o && !fragment.f2283r) {
            fragment.mo2502D1(fragment.mo2509H1(fragment.f2269d), null, fragment.f2269d);
            View view = fragment.f2251I;
            if (view != null) {
                fragment.f2252J = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.f2243A) {
                    fragment.f2251I.setVisibility(8);
                }
                fragment.mo2610v1(fragment.f2251I, fragment.f2269d);
                mo2782W(fragment, fragment.f2251I, fragment.f2269d, false);
                return;
            }
            fragment.f2252J = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo2810n1() {
        for (Fragment fragment : this.f2384k.values()) {
            if (fragment != null) {
                mo2781V0(fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo2811o(Fragment fragment, boolean z) {
        if (f2366d) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo2764L0(fragment);
        if (fragment.f2244B) {
            return;
        }
        if (!this.f2383j.contains(fragment)) {
            synchronized (this.f2383j) {
                this.f2383j.add(fragment);
            }
            fragment.f2278m = true;
            fragment.f2279n = false;
            if (fragment.f2251I == null) {
                fragment.f2258P = false;
            }
            if (m2448G0(fragment)) {
                this.f2398y = true;
            }
            if (z) {
                mo2775S0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o0 */
    public boolean mo2812o0() {
        m2460m0(true);
        boolean z = false;
        while (m2473x0(this.f2372D, this.f2373E)) {
            this.f2381h = true;
            try {
                m2455a1(this.f2372D, this.f2373E);
                m2472x();
                z = true;
            } catch (Throwable th) {
                m2472x();
                throw th;
            }
        }
        m2465q1();
        mo2802j0();
        m2468u();
        return z;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0467j.f2424a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0451g.m2417b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = mo2818s0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = mo2732d(string);
        }
        if (fragment == null && i != -1) {
            fragment = mo2818s0(i);
        }
        if (f2366d) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = mo2734f().mo2725a(context.getClassLoader(), attributeValue);
            fragment.f2280o = true;
            fragment.f2289x = resourceId != 0 ? resourceId : i;
            fragment.f2290y = i;
            fragment.f2291z = string;
            fragment.f2281p = true;
            fragment.f2285t = this;
            AbstractC0452h hVar = this.f2394u;
            fragment.f2286u = hVar;
            fragment.mo2573i1(hVar.mo2727e(), attributeSet, fragment.f2269d);
            mo2811o(fragment, true);
        } else if (!fragment.f2281p) {
            fragment.f2281p = true;
            AbstractC0452h hVar2 = this.f2394u;
            fragment.f2286u = hVar2;
            fragment.mo2573i1(hVar2.mo2727e(), attributeSet, fragment.f2269d);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        }
        if (this.f2393t >= 1 || !fragment.f2280o) {
            mo2775S0(fragment);
        } else {
            mo2777T0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.f2251I;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f2251I.getTag() == null) {
                fragment.f2251I.setTag(string);
            }
            return fragment.f2251I;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2815p(Fragment fragment) {
        if (mo2760J0()) {
            if (f2366d) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f2378J.mo2848d(fragment) && f2366d) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* renamed from: q */
    public int mo2816q(C0442a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f2390q;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    ArrayList<Integer> arrayList2 = this.f2390q;
                    int intValue = arrayList2.remove(arrayList2.size() - 1).intValue();
                    if (f2366d) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.f2389p.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.f2389p == null) {
                this.f2389p = new ArrayList<>();
            }
            int size = this.f2389p.size();
            if (f2366d) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f2389p.add(aVar);
            return size;
        }
    }

    /* renamed from: s */
    public void mo2817s(AbstractC0452h hVar, AbstractC0449e eVar, Fragment fragment) {
        if (this.f2394u == null) {
            this.f2394u = hVar;
            this.f2395v = eVar;
            this.f2396w = fragment;
            if (fragment != null) {
                m2465q1();
            }
            if (hVar instanceof AbstractC0050c) {
                AbstractC0050c cVar = (AbstractC0050c) hVar;
                OnBackPressedDispatcher s = cVar.mo145s();
                this.f2387n = s;
                AbstractC0619g gVar = cVar;
                if (fragment != null) {
                    gVar = fragment;
                }
                s.mo150a(gVar, this.f2388o);
            }
            this.f2378J = fragment != null ? fragment.f2285t.mo2827z0(fragment) : hVar instanceof AbstractC0636s ? C0473l.m2579g(((AbstractC0636s) hVar).mo139Y()) : new C0473l(false);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: s0 */
    public Fragment mo2818s0(int i) {
        for (int size = this.f2383j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2383j.get(size);
            if (fragment != null && fragment.f2289x == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f2384k.values()) {
            if (fragment2 != null && fragment2.f2289x == i) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: t */
    public void mo2819t(Fragment fragment) {
        if (f2366d) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2244B) {
            fragment.f2244B = false;
            if (fragment.f2278m) {
                return;
            }
            if (!this.f2383j.contains(fragment)) {
                if (f2366d) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f2383j) {
                    this.f2383j.add(fragment);
                }
                fragment.f2278m = true;
                if (m2448G0(fragment)) {
                    this.f2398y = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* renamed from: t0 */
    public Fragment mo2820t0(String str) {
        Fragment b0;
        for (Fragment fragment : this.f2384k.values()) {
            if (!(fragment == null || (b0 = fragment.mo2549b0(str)) == null)) {
                return b0;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f2396w;
        if (obj == null) {
            obj = this.f2394u;
        }
        C0953a.m5480a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo2822v() {
        boolean z = false;
        for (Fragment fragment : this.f2384k.values()) {
            if (fragment != null) {
                z = m2448G0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w0 */
    public void mo2823w0(int i) {
        synchronized (this) {
            this.f2389p.set(i, null);
            if (this.f2390q == null) {
                this.f2390q = new ArrayList<>();
            }
            if (f2366d) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f2390q.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2824y(C0442a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo2643p(z3);
        } else {
            aVar.mo2642o();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0479o.m2603B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo2773R0(this.f2393t, true);
        }
        for (Fragment fragment : this.f2384k.values()) {
            if (fragment != null && fragment.f2251I != null && fragment.f2257O && aVar.mo2646s(fragment.f2290y)) {
                float f = fragment.f2259Q;
                if (f > 0.0f) {
                    fragment.f2251I.setAlpha(f);
                }
                if (z3) {
                    fragment.f2259Q = 0.0f;
                } else {
                    fragment.f2259Q = -1.0f;
                    fragment.f2257O = false;
                }
            }
        }
    }

    /* renamed from: y0 */
    public int mo2825y0() {
        ArrayList<C0442a> arrayList = this.f2385l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2826z(Fragment fragment) {
        Animator animator;
        if (fragment.f2251I != null) {
            C0464g K0 = mo2762K0(fragment, fragment.mo2604t0(), !fragment.f2243A, fragment.mo2607u0());
            if (K0 == null || (animator = K0.f2416b) == null) {
                if (K0 != null) {
                    fragment.f2251I.startAnimation(K0.f2415a);
                    K0.f2415a.start();
                }
                fragment.f2251I.setVisibility((!fragment.f2243A || fragment.mo2515L0()) ? 0 : 8);
                if (fragment.mo2515L0()) {
                    fragment.mo2560e2(false);
                }
            } else {
                animator.setTarget(fragment.f2251I);
                if (!fragment.f2243A) {
                    fragment.f2251I.setVisibility(0);
                } else if (fragment.mo2515L0()) {
                    fragment.mo2560e2(false);
                } else {
                    ViewGroup viewGroup = fragment.f2250H;
                    View view = fragment.f2251I;
                    viewGroup.startViewTransition(view);
                    K0.f2416b.addListener(new C0462e(viewGroup, view, fragment));
                }
                K0.f2416b.start();
            }
        }
        if (fragment.f2278m && m2448G0(fragment)) {
            this.f2398y = true;
        }
        fragment.f2258P = false;
        fragment.mo2566g1(fragment.f2243A);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C0473l mo2827z0(Fragment fragment) {
        return this.f2378J.mo2851f(fragment);
    }
}
