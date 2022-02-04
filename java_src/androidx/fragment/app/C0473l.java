package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0631p;
import androidx.lifecycle.C0632q;
import androidx.lifecycle.C0635r;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.l */
public class C0473l extends AbstractC0631p {

    /* renamed from: c */
    private static final C0632q.AbstractC0633a f2437c = new C0474a();

    /* renamed from: d */
    private final HashSet<Fragment> f2438d = new HashSet<>();

    /* renamed from: e */
    private final HashMap<String, C0473l> f2439e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C0635r> f2440f = new HashMap<>();

    /* renamed from: g */
    private final boolean f2441g;

    /* renamed from: h */
    private boolean f2442h = false;

    /* renamed from: i */
    private boolean f2443i = false;

    /* renamed from: androidx.fragment.app.l$a */
    static class C0474a implements C0632q.AbstractC0633a {
        C0474a() {
        }

        @Override // androidx.lifecycle.C0632q.AbstractC0633a
        /* renamed from: a */
        public <T extends AbstractC0631p> T mo2859a(Class<T> cls) {
            return new C0473l(true);
        }
    }

    C0473l(boolean z) {
        this.f2441g = z;
    }

    /* renamed from: g */
    static C0473l m2579g(C0635r rVar) {
        return (C0473l) new C0632q(rVar, f2437c).mo3684a(C0473l.class);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0631p
    /* renamed from: c */
    public void mo2847c() {
        if (LayoutInflater$Factory2C0456j.f2366d) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2442h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2848d(Fragment fragment) {
        return this.f2438d.add(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2849e(Fragment fragment) {
        if (LayoutInflater$Factory2C0456j.f2366d) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0473l lVar = this.f2439e.get(fragment.f2272g);
        if (lVar != null) {
            lVar.mo2847c();
            this.f2439e.remove(fragment.f2272g);
        }
        C0635r rVar = this.f2440f.get(fragment.f2272g);
        if (rVar != null) {
            rVar.mo3687a();
            this.f2440f.remove(fragment.f2272g);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0473l.class != obj.getClass()) {
            return false;
        }
        C0473l lVar = (C0473l) obj;
        return this.f2438d.equals(lVar.f2438d) && this.f2439e.equals(lVar.f2439e) && this.f2440f.equals(lVar.f2440f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0473l mo2851f(Fragment fragment) {
        C0473l lVar = this.f2439e.get(fragment.f2272g);
        if (lVar != null) {
            return lVar;
        }
        C0473l lVar2 = new C0473l(this.f2441g);
        this.f2439e.put(fragment.f2272g, lVar2);
        return lVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Collection<Fragment> mo2852h() {
        return this.f2438d;
    }

    public int hashCode() {
        return (((this.f2438d.hashCode() * 31) + this.f2439e.hashCode()) * 31) + this.f2440f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0635r mo2854i(Fragment fragment) {
        C0635r rVar = this.f2440f.get(fragment.f2272g);
        if (rVar != null) {
            return rVar;
        }
        C0635r rVar2 = new C0635r();
        this.f2440f.put(fragment.f2272g, rVar2);
        return rVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo2855j() {
        return this.f2442h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo2856k(Fragment fragment) {
        return this.f2438d.remove(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo2857l(Fragment fragment) {
        if (!this.f2438d.contains(fragment)) {
            return true;
        }
        return this.f2441g ? this.f2442h : !this.f2443i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2438d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2439e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2440f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
