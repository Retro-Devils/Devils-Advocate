package androidx.fragment.app;

import androidx.lifecycle.AbstractC0614d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.n */
public abstract class AbstractC0477n {

    /* renamed from: a */
    ArrayList<C0478a> f2458a = new ArrayList<>();

    /* renamed from: b */
    int f2459b;

    /* renamed from: c */
    int f2460c;

    /* renamed from: d */
    int f2461d;

    /* renamed from: e */
    int f2462e;

    /* renamed from: f */
    int f2463f;

    /* renamed from: g */
    int f2464g;

    /* renamed from: h */
    boolean f2465h;

    /* renamed from: i */
    boolean f2466i = true;

    /* renamed from: j */
    String f2467j;

    /* renamed from: k */
    int f2468k;

    /* renamed from: l */
    CharSequence f2469l;

    /* renamed from: m */
    int f2470m;

    /* renamed from: n */
    CharSequence f2471n;

    /* renamed from: o */
    ArrayList<String> f2472o;

    /* renamed from: p */
    ArrayList<String> f2473p;

    /* renamed from: q */
    boolean f2474q = false;

    /* renamed from: r */
    ArrayList<Runnable> f2475r;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$a */
    public static final class C0478a {

        /* renamed from: a */
        int f2476a;

        /* renamed from: b */
        Fragment f2477b;

        /* renamed from: c */
        int f2478c;

        /* renamed from: d */
        int f2479d;

        /* renamed from: e */
        int f2480e;

        /* renamed from: f */
        int f2481f;

        /* renamed from: g */
        AbstractC0614d.EnumC0616b f2482g;

        /* renamed from: h */
        AbstractC0614d.EnumC0616b f2483h;

        C0478a() {
        }

        C0478a(int i, Fragment fragment) {
            this.f2476a = i;
            this.f2477b = fragment;
            AbstractC0614d.EnumC0616b bVar = AbstractC0614d.EnumC0616b.RESUMED;
            this.f2482g = bVar;
            this.f2483h = bVar;
        }
    }

    /* renamed from: b */
    public AbstractC0477n mo2868b(int i, Fragment fragment) {
        mo2636g(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0477n mo2869c(Fragment fragment, String str) {
        mo2636g(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2870d(C0478a aVar) {
        this.f2458a.add(aVar);
        aVar.f2478c = this.f2459b;
        aVar.f2479d = this.f2460c;
        aVar.f2480e = this.f2461d;
        aVar.f2481f = this.f2462e;
    }

    /* renamed from: e */
    public abstract int mo2634e();

    /* renamed from: f */
    public abstract int mo2635f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2636g(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2291z;
            if (str2 == null || str.equals(str2)) {
                fragment.f2291z = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2291z + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2289x;
                if (i3 == 0 || i3 == i) {
                    fragment.f2289x = i;
                    fragment.f2290y = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2289x + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo2870d(new C0478a(i2, fragment));
    }

    /* renamed from: h */
    public AbstractC0477n mo2637h(Fragment fragment) {
        mo2870d(new C0478a(3, fragment));
        return this;
    }

    /* renamed from: i */
    public AbstractC0477n mo2871i(int i, Fragment fragment) {
        return mo2872j(i, fragment, null);
    }

    /* renamed from: j */
    public AbstractC0477n mo2872j(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo2636g(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
