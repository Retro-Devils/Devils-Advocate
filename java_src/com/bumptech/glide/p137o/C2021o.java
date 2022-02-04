package com.bumptech.glide.p137o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.AbstractC0453i;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.ComponentCallbacks2C1626k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.o.o */
public class C2021o extends Fragment {

    /* renamed from: Z */
    private final C2002a f7450Z;

    /* renamed from: a0 */
    private final AbstractC2019m f7451a0;

    /* renamed from: b0 */
    private final Set<C2021o> f7452b0;

    /* renamed from: c0 */
    private C2021o f7453c0;

    /* renamed from: d0 */
    private ComponentCallbacks2C1626k f7454d0;

    /* renamed from: e0 */
    private Fragment f7455e0;

    /* renamed from: com.bumptech.glide.o.o$a */
    private class C2022a implements AbstractC2019m {
        C2022a() {
        }

        @Override // com.bumptech.glide.p137o.AbstractC2019m
        /* renamed from: a */
        public Set<ComponentCallbacks2C1626k> mo7676a() {
            Set<C2021o> q2 = C2021o.this.mo7705q2();
            HashSet hashSet = new HashSet(q2.size());
            for (C2021o oVar : q2) {
                if (oVar.mo7707t2() != null) {
                    hashSet.add(oVar.mo7707t2());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C2021o.this + "}";
        }
    }

    public C2021o() {
        this(new C2002a());
    }

    @SuppressLint({"ValidFragment"})
    public C2021o(C2002a aVar) {
        this.f7451a0 = new C2022a();
        this.f7452b0 = new HashSet();
        this.f7450Z = aVar;
    }

    /* renamed from: B2 */
    private void m9131B2() {
        C2021o oVar = this.f7453c0;
        if (oVar != null) {
            oVar.m9137y2(this);
            this.f7453c0 = null;
        }
    }

    /* renamed from: p2 */
    private void m9132p2(C2021o oVar) {
        this.f7452b0.add(oVar);
    }

    /* renamed from: s2 */
    private Fragment m9133s2() {
        Fragment v0 = mo2609v0();
        return v0 != null ? v0 : this.f7455e0;
    }

    /* renamed from: v2 */
    private static AbstractC0453i m9134v2(Fragment fragment) {
        while (fragment.mo2609v0() != null) {
            fragment = fragment.mo2609v0();
        }
        return fragment.mo2590o0();
    }

    /* renamed from: w2 */
    private boolean m9135w2(Fragment fragment) {
        Fragment s2 = m9133s2();
        while (true) {
            Fragment v0 = fragment.mo2609v0();
            if (v0 == null) {
                return false;
            }
            if (v0.equals(s2)) {
                return true;
            }
            fragment = fragment.mo2609v0();
        }
    }

    /* renamed from: x2 */
    private void m9136x2(Context context, AbstractC0453i iVar) {
        m9131B2();
        C2021o j = ComponentCallbacks2C1610c.m7749c(context).mo6985k().mo7695j(context, iVar);
        this.f7453c0 = j;
        if (!equals(j)) {
            this.f7453c0.m9132p2(this);
        }
    }

    /* renamed from: y2 */
    private void m9137y2(C2021o oVar) {
        this.f7452b0.remove(oVar);
    }

    /* renamed from: A2 */
    public void mo7704A2(ComponentCallbacks2C1626k kVar) {
        this.f7454d0 = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public void mo2531T0(Context context) {
        super.mo2531T0(context);
        AbstractC0453i v2 = m9134v2(this);
        if (v2 != null) {
            try {
                m9136x2(mo2575j0(), v2);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b1 */
    public void mo2550b1() {
        super.mo2550b1();
        this.f7450Z.mo7670c();
        m9131B2();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e1 */
    public void mo2559e1() {
        super.mo2559e1();
        this.f7455e0 = null;
        m9131B2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public Set<C2021o> mo7705q2() {
        C2021o oVar = this.f7453c0;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f7452b0);
        }
        HashSet hashSet = new HashSet();
        for (C2021o oVar2 : this.f7453c0.mo7705q2()) {
            if (m9135w2(oVar2.m9133s2())) {
                hashSet.add(oVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public C2002a mo7706r2() {
        return this.f7450Z;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        this.f7450Z.mo7671d();
    }

    /* renamed from: t2 */
    public ComponentCallbacks2C1626k mo7707t2() {
        return this.f7454d0;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m9133s2() + "}";
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u1 */
    public void mo2608u1() {
        super.mo2608u1();
        this.f7450Z.mo7672e();
    }

    /* renamed from: u2 */
    public AbstractC2019m mo7708u2() {
        return this.f7451a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public void mo7709z2(Fragment fragment) {
        AbstractC0453i v2;
        this.f7455e0 = fragment;
        if (fragment != null && fragment.mo2575j0() != null && (v2 = m9134v2(fragment)) != null) {
            m9136x2(fragment.mo2575j0(), v2);
        }
    }
}
