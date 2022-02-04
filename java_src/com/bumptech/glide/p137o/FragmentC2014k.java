package com.bumptech.glide.p137o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.ComponentCallbacks2C1626k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.o.k */
public class FragmentC2014k extends Fragment {

    /* renamed from: b */
    private final C2002a f7431b;

    /* renamed from: c */
    private final AbstractC2019m f7432c;

    /* renamed from: d */
    private final Set<FragmentC2014k> f7433d;

    /* renamed from: e */
    private ComponentCallbacks2C1626k f7434e;

    /* renamed from: f */
    private FragmentC2014k f7435f;

    /* renamed from: g */
    private Fragment f7436g;

    /* renamed from: com.bumptech.glide.o.k$a */
    private class C2015a implements AbstractC2019m {
        C2015a() {
        }

        @Override // com.bumptech.glide.p137o.AbstractC2019m
        /* renamed from: a */
        public Set<ComponentCallbacks2C1626k> mo7676a() {
            Set<FragmentC2014k> b = FragmentC2014k.this.mo7677b();
            HashSet hashSet = new HashSet(b.size());
            for (FragmentC2014k kVar : b) {
                if (kVar.mo7679e() != null) {
                    hashSet.add(kVar.mo7679e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC2014k.this + "}";
        }
    }

    public FragmentC2014k() {
        this(new C2002a());
    }

    @SuppressLint({"ValidFragment"})
    FragmentC2014k(C2002a aVar) {
        this.f7432c = new C2015a();
        this.f7433d = new HashSet();
        this.f7431b = aVar;
    }

    /* renamed from: a */
    private void m9095a(FragmentC2014k kVar) {
        this.f7433d.add(kVar);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m9096d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f7436g;
    }

    @TargetApi(17)
    /* renamed from: g */
    private boolean m9097g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m9098h(Activity activity) {
        m9100l();
        FragmentC2014k h = ComponentCallbacks2C1610c.m7749c(activity).mo6985k().mo7693h(activity);
        this.f7435f = h;
        if (!equals(h)) {
            this.f7435f.m9095a(this);
        }
    }

    /* renamed from: i */
    private void m9099i(FragmentC2014k kVar) {
        this.f7433d.remove(kVar);
    }

    /* renamed from: l */
    private void m9100l() {
        FragmentC2014k kVar = this.f7435f;
        if (kVar != null) {
            kVar.m9099i(this);
            this.f7435f = null;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    /* renamed from: b */
    public Set<FragmentC2014k> mo7677b() {
        if (equals(this.f7435f)) {
            return Collections.unmodifiableSet(this.f7433d);
        }
        if (this.f7435f == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (FragmentC2014k kVar : this.f7435f.mo7677b()) {
            if (m9097g(kVar.getParentFragment())) {
                hashSet.add(kVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2002a mo7678c() {
        return this.f7431b;
    }

    /* renamed from: e */
    public ComponentCallbacks2C1626k mo7679e() {
        return this.f7434e;
    }

    /* renamed from: f */
    public AbstractC2019m mo7680f() {
        return this.f7432c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo7681j(Fragment fragment) {
        this.f7436g = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m9098h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo7682k(ComponentCallbacks2C1626k kVar) {
        this.f7434e = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m9098h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7431b.mo7670c();
        m9100l();
    }

    public void onDetach() {
        super.onDetach();
        m9100l();
    }

    public void onStart() {
        super.onStart();
        this.f7431b.mo7671d();
    }

    public void onStop() {
        super.onStop();
        this.f7431b.mo7672e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m9096d() + "}";
    }
}
