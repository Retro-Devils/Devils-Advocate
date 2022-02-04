package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0477n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.LayoutInflater$Factory2C0456j;
import java.io.PrintWriter;
import java.util.ArrayList;
import p006b.p030g.p038j.C0954b;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
public final class C0442a extends AbstractC0477n implements LayoutInflater$Factory2C0456j.AbstractC0468k {

    /* renamed from: s */
    final LayoutInflater$Factory2C0456j f2316s;

    /* renamed from: t */
    boolean f2317t;

    /* renamed from: u */
    int f2318u = -1;

    public C0442a(LayoutInflater$Factory2C0456j jVar) {
        this.f2316s = jVar;
    }

    /* renamed from: u */
    private static boolean m2325u(AbstractC0477n.C0478a aVar) {
        Fragment fragment = aVar.f2477b;
        return fragment != null && fragment.f2278m && fragment.f2251I != null && !fragment.f2244B && !fragment.f2243A && fragment.mo2519N0();
    }

    @Override // androidx.fragment.app.LayoutInflater$Factory2C0456j.AbstractC0468k
    /* renamed from: a */
    public boolean mo2633a(ArrayList<C0442a> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflater$Factory2C0456j.f2366d) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2465h) {
            return true;
        }
        this.f2316s.mo2808n(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0477n
    /* renamed from: e */
    public int mo2634e() {
        return mo2639l(false);
    }

    @Override // androidx.fragment.app.AbstractC0477n
    /* renamed from: f */
    public int mo2635f() {
        return mo2639l(true);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.AbstractC0477n
    /* renamed from: g */
    public void mo2636g(int i, Fragment fragment, String str, int i2) {
        super.mo2636g(i, fragment, str, i2);
        fragment.f2285t = this.f2316s;
    }

    @Override // androidx.fragment.app.AbstractC0477n
    /* renamed from: h */
    public AbstractC0477n mo2637h(Fragment fragment) {
        LayoutInflater$Factory2C0456j jVar = fragment.f2285t;
        if (jVar == null || jVar == this.f2316s) {
            return super.mo2637h(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2638k(int i) {
        if (this.f2465h) {
            if (LayoutInflater$Factory2C0456j.f2366d) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2458a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0477n.C0478a aVar = this.f2458a.get(i2);
                Fragment fragment = aVar.f2477b;
                if (fragment != null) {
                    fragment.f2284s += i;
                    if (LayoutInflater$Factory2C0456j.f2366d) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2477b + " to " + aVar.f2477b.f2284s);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2639l(boolean z) {
        if (!this.f2317t) {
            if (LayoutInflater$Factory2C0456j.f2366d) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0954b("FragmentManager"));
                mo2640m("  ", printWriter);
                printWriter.close();
            }
            this.f2317t = true;
            this.f2318u = this.f2465h ? this.f2316s.mo2816q(this) : -1;
            this.f2316s.mo2805l0(this, z);
            return this.f2318u;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: m */
    public void mo2640m(String str, PrintWriter printWriter) {
        mo2641n(str, printWriter, true);
    }

    /* renamed from: n */
    public void mo2641n(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2467j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2318u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2317t);
            if (this.f2463f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2463f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2464g));
            }
            if (!(this.f2459b == 0 && this.f2460c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2459b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2460c));
            }
            if (!(this.f2461d == 0 && this.f2462e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2461d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2462e));
            }
            if (!(this.f2468k == 0 && this.f2469l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2468k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2469l);
            }
            if (!(this.f2470m == 0 && this.f2471n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2470m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2471n);
            }
        }
        if (!this.f2458a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2458a.size();
            for (int i = 0; i < size; i++) {
                AbstractC0477n.C0478a aVar = this.f2458a.get(i);
                switch (aVar.f2476a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2476a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2477b);
                if (z) {
                    if (!(aVar.f2478c == 0 && aVar.f2479d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2478c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2479d));
                    }
                    if (aVar.f2480e != 0 || aVar.f2481f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2480e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2481f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2642o() {
        int size = this.f2458a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0477n.C0478a aVar = this.f2458a.get(i);
            Fragment fragment = aVar.f2477b;
            if (fragment != null) {
                fragment.mo2574i2(this.f2463f, this.f2464g);
            }
            switch (aVar.f2476a) {
                case 1:
                    fragment.mo2570h2(aVar.f2478c);
                    this.f2316s.mo2811o(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2476a);
                case 3:
                    fragment.mo2570h2(aVar.f2479d);
                    this.f2316s.mo2787Z0(fragment);
                    break;
                case 4:
                    fragment.mo2570h2(aVar.f2479d);
                    this.f2316s.mo2751E0(fragment);
                    break;
                case 5:
                    fragment.mo2570h2(aVar.f2478c);
                    this.f2316s.mo2807m1(fragment);
                    break;
                case 6:
                    fragment.mo2570h2(aVar.f2479d);
                    this.f2316s.mo2742A(fragment);
                    break;
                case 7:
                    fragment.mo2570h2(aVar.f2478c);
                    this.f2316s.mo2819t(fragment);
                    break;
                case 8:
                    this.f2316s.mo2806l1(fragment);
                    break;
                case 9:
                    this.f2316s.mo2806l1(null);
                    break;
                case 10:
                    this.f2316s.mo2804k1(fragment, aVar.f2483h);
                    break;
            }
            if (!(this.f2474q || aVar.f2476a == 1 || fragment == null)) {
                this.f2316s.mo2771Q0(fragment);
            }
        }
        if (!this.f2474q) {
            LayoutInflater$Factory2C0456j jVar = this.f2316s;
            jVar.mo2773R0(jVar.f2393t, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2643p(boolean z) {
        for (int size = this.f2458a.size() - 1; size >= 0; size--) {
            AbstractC0477n.C0478a aVar = this.f2458a.get(size);
            Fragment fragment = aVar.f2477b;
            if (fragment != null) {
                fragment.mo2574i2(LayoutInflater$Factory2C0456j.m2456e1(this.f2463f), this.f2464g);
            }
            switch (aVar.f2476a) {
                case 1:
                    fragment.mo2570h2(aVar.f2481f);
                    this.f2316s.mo2787Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2476a);
                case 3:
                    fragment.mo2570h2(aVar.f2480e);
                    this.f2316s.mo2811o(fragment, false);
                    break;
                case 4:
                    fragment.mo2570h2(aVar.f2480e);
                    this.f2316s.mo2807m1(fragment);
                    break;
                case 5:
                    fragment.mo2570h2(aVar.f2481f);
                    this.f2316s.mo2751E0(fragment);
                    break;
                case 6:
                    fragment.mo2570h2(aVar.f2480e);
                    this.f2316s.mo2819t(fragment);
                    break;
                case 7:
                    fragment.mo2570h2(aVar.f2481f);
                    this.f2316s.mo2742A(fragment);
                    break;
                case 8:
                    this.f2316s.mo2806l1(null);
                    break;
                case 9:
                    this.f2316s.mo2806l1(fragment);
                    break;
                case 10:
                    this.f2316s.mo2804k1(fragment, aVar.f2482g);
                    break;
            }
            if (!(this.f2474q || aVar.f2476a == 3 || fragment == null)) {
                this.f2316s.mo2771Q0(fragment);
            }
        }
        if (!this.f2474q && z) {
            LayoutInflater$Factory2C0456j jVar = this.f2316s;
            jVar.mo2773R0(jVar.f2393t, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Fragment mo2644q(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2458a.size()) {
            AbstractC0477n.C0478a aVar = this.f2458a.get(i);
            int i2 = aVar.f2476a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2477b;
                    int i3 = fragment3.f2290y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f2290y == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2458a.add(i, new AbstractC0477n.C0478a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                AbstractC0477n.C0478a aVar2 = new AbstractC0477n.C0478a(3, fragment4);
                                aVar2.f2478c = aVar.f2478c;
                                aVar2.f2480e = aVar.f2480e;
                                aVar2.f2479d = aVar.f2479d;
                                aVar2.f2481f = aVar.f2481f;
                                this.f2458a.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2458a.remove(i);
                        i--;
                    } else {
                        aVar.f2476a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f2477b);
                    Fragment fragment5 = aVar.f2477b;
                    if (fragment5 == fragment2) {
                        this.f2458a.add(i, new AbstractC0477n.C0478a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2458a.add(i, new AbstractC0477n.C0478a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2477b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f2477b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: r */
    public String mo2645r() {
        return this.f2467j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo2646s(int i) {
        int size = this.f2458a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2458a.get(i2).f2477b;
            int i3 = fragment != null ? fragment.f2290y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo2647t(ArrayList<C0442a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2458a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2458a.get(i4).f2477b;
            int i5 = fragment != null ? fragment.f2290y : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0442a aVar = arrayList.get(i6);
                    int size2 = aVar.f2458a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f2458a.get(i7).f2477b;
                        if ((fragment2 != null ? fragment2.f2290y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2318u >= 0) {
            sb.append(" #");
            sb.append(this.f2318u);
        }
        if (this.f2467j != null) {
            sb.append(" ");
            sb.append(this.f2467j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo2649v() {
        for (int i = 0; i < this.f2458a.size(); i++) {
            if (m2325u(this.f2458a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public void mo2650w() {
        if (this.f2475r != null) {
            for (int i = 0; i < this.f2475r.size(); i++) {
                this.f2475r.get(i).run();
            }
            this.f2475r = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2651x(Fragment.AbstractC0439f fVar) {
        for (int i = 0; i < this.f2458a.size(); i++) {
            AbstractC0477n.C0478a aVar = this.f2458a.get(i);
            if (m2325u(aVar)) {
                aVar.f2477b.mo2577j2(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Fragment mo2652y(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2458a.size() - 1; size >= 0; size--) {
            AbstractC0477n.C0478a aVar = this.f2458a.get(size);
            int i = aVar.f2476a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2477b;
                            break;
                        case 10:
                            aVar.f2483h = aVar.f2482g;
                            break;
                    }
                }
                arrayList.add(aVar.f2477b);
            }
            arrayList.remove(aVar.f2477b);
        }
        return fragment;
    }
}
