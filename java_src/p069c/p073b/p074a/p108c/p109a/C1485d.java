package p069c.p073b.p074a.p108c.p109a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0447d;
import androidx.fragment.app.Fragment;
import p069c.p073b.p074a.p108c.p109a.AbstractC1480c;
import p069c.p073b.p074a.p108c.p109a.C1488e;
import p069c.p073b.p074a.p108c.p109a.p110f.C1494b;

/* renamed from: c.b.a.c.a.d */
public class C1485d extends Fragment implements AbstractC1480c.AbstractC1484d {

    /* renamed from: Z */
    private final C1487b f6263Z = new C1487b();

    /* renamed from: a0 */
    private Bundle f6264a0;

    /* renamed from: b0 */
    private C1488e f6265b0;

    /* renamed from: c0 */
    private String f6266c0;

    /* renamed from: d0 */
    private AbstractC1480c.AbstractC1482b f6267d0;

    /* renamed from: e0 */
    private boolean f6268e0;

    /* renamed from: c.b.a.c.a.d$b */
    private final class C1487b implements C1488e.AbstractC1492d {
        private C1487b() {
        }

        @Override // p069c.p073b.p074a.p108c.p109a.C1488e.AbstractC1492d
        /* renamed from: a */
        public final void mo6712a(C1488e eVar) {
        }
    }

    /* renamed from: p2 */
    private void m7330p2() {
        C1488e eVar = this.f6265b0;
        if (eVar != null && this.f6267d0 != null) {
            eVar.mo6725h(this.f6268e0);
            this.f6265b0.mo6721c(mo2552c0(), this, this.f6266c0, this.f6267d0, this.f6264a0);
            this.f6264a0 = null;
            this.f6267d0 = null;
        }
    }

    /* renamed from: r2 */
    public static C1485d m7331r2() {
        return new C1485d();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        this.f6264a0 = bundle != null ? bundle.getBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE") : null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6265b0 = new C1488e(mo2552c0(), null, 0, this.f6263Z);
        m7330p2();
        return this.f6265b0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b1 */
    public void mo2550b1() {
        if (this.f6265b0 != null) {
            ActivityC0447d c0 = mo2552c0();
            this.f6265b0.mo6727k(c0 == null || c0.isFinishing());
        }
        super.mo2550b1();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d1 */
    public void mo2556d1() {
        this.f6265b0.mo6729m(mo2552c0().isFinishing());
        this.f6265b0 = null;
        super.mo2556d1();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        this.f6265b0.mo6728l();
        super.mo2585m1();
    }

    /* renamed from: q2 */
    public void mo6711q2(String str, AbstractC1480c.AbstractC1482b bVar) {
        this.f6266c0 = C1494b.m7375c(str, "Developer key cannot be null or empty");
        this.f6267d0 = bVar;
        m7330p2();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        this.f6265b0.mo6726j();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        super.mo2603s1(bundle);
        C1488e eVar = this.f6265b0;
        bundle.putBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE", eVar != null ? eVar.mo6737q() : this.f6264a0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        this.f6265b0.mo6720b();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u1 */
    public void mo2608u1() {
        this.f6265b0.mo6736p();
        super.mo2608u1();
    }
}
