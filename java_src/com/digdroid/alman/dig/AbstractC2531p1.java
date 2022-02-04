package com.digdroid.alman.dig;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.p1 */
public abstract class AbstractC2531p1 extends Fragment {

    /* renamed from: Z */
    C2219c3 f8793Z;

    /* renamed from: a0 */
    C2775u f8794a0;

    /* renamed from: b0 */
    C2375h3 f8795b0;

    /* renamed from: c0 */
    C2512o0 f8796c0;

    /* renamed from: d0 */
    C2187b0 f8797d0;

    /* renamed from: e0 */
    C2886z1 f8798e0;

    /* renamed from: f0 */
    C2749t1 f8799f0;

    /* renamed from: g0 */
    C2774t3 f8800g0;

    /* renamed from: h0 */
    String f8801h0 = "";

    /* renamed from: i0 */
    boolean f8802i0 = false;

    /* renamed from: j0 */
    boolean f8803j0 = false;

    /* renamed from: k0 */
    private boolean f8804k0 = false;

    /* renamed from: l0 */
    Context f8805l0;

    /* renamed from: m0 */
    AbstractC2532a f8806m0;

    /* renamed from: com.digdroid.alman.dig.p1$a */
    public interface AbstractC2532a {
        /* renamed from: A */
        void mo8253A(long j);

        /* renamed from: B */
        Menu mo8254B();

        /* renamed from: C */
        void mo8255C();

        /* renamed from: D */
        void mo8256D(long j, String str, C2369h0 h0Var);

        /* renamed from: E */
        void mo8257E(C2774t3 t3Var);

        /* renamed from: F */
        void mo8258F();

        /* renamed from: G */
        void mo8903G(C2774t3 t3Var, String str, String str2);

        /* renamed from: H */
        void mo8259H(boolean z);

        /* renamed from: I */
        View mo8904I();

        /* renamed from: J */
        void mo7916J();

        /* renamed from: K */
        void mo8260K(int i);

        /* renamed from: L */
        void mo8261L();

        /* renamed from: M */
        void mo8262M(long j, String str);

        /* renamed from: P */
        boolean mo8263P();

        /* renamed from: R */
        void mo8264R();

        /* renamed from: T */
        void mo8265T(C2369h0 h0Var);

        /* renamed from: U */
        void mo8266U(long j, String str);

        /* renamed from: V */
        void mo8267V(String str);

        /* renamed from: W */
        void mo8905W(String str);

        /* renamed from: Z */
        void mo8268Z();

        /* renamed from: a0 */
        void mo8269a0(long j);

        /* renamed from: b0 */
        void mo8270b0();

        /* renamed from: d0 */
        void mo8271d0();

        /* renamed from: e */
        void mo8906e();

        /* renamed from: e0 */
        void mo8272e0(long j, String str);

        /* renamed from: g */
        Point mo8907g(boolean z);

        /* renamed from: g0 */
        boolean mo8273g0();

        /* renamed from: h0 */
        void mo8274h0();

        /* renamed from: i */
        void mo8275i();

        /* renamed from: i0 */
        void mo8276i0(String str, String str2, int i, int i2);

        /* renamed from: j */
        void mo8277j();

        /* renamed from: k0 */
        void mo8279k0(boolean z);

        /* renamed from: l */
        boolean mo8908l();

        /* renamed from: m */
        boolean mo8282m();

        /* renamed from: m0 */
        long mo8283m0();

        /* renamed from: o */
        HashMap<Integer, Integer> mo8909o();

        /* renamed from: o0 */
        void mo8286o0(long j);

        /* renamed from: p */
        void mo8288p();

        /* renamed from: q */
        void mo8290q(String str, C2369h0 h0Var, int i);

        /* renamed from: q0 */
        void mo8291q0();

        /* renamed from: r */
        void mo8293r();

        /* renamed from: t0 */
        void mo8910t0(boolean z, boolean z2, boolean z3);

        /* renamed from: u */
        void mo8297u();

        /* renamed from: u0 */
        void mo8298u0();

        /* renamed from: v */
        void mo8911v(String str);

        /* renamed from: v0 */
        C2515o2 mo8300v0();

        /* renamed from: w */
        void mo8302w(boolean z);

        /* renamed from: x */
        void mo8303x(String str);

        /* renamed from: y */
        boolean mo8912y();

        /* renamed from: z */
        void mo8304z(String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A2 */
    public boolean mo8893A2(String str) {
        return str == null || str.equals("");
    }

    /* renamed from: B2 */
    public boolean mo8102B2() {
        return this.f8802i0;
    }

    /* renamed from: C2 */
    public boolean mo8103C2() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D2 */
    public File[] mo8894D2(String str) {
        return C2372h2.m10298b(mo2552c0());
    }

    /* renamed from: E2 */
    public void mo8104E2(boolean z) {
    }

    /* renamed from: F2 */
    public void mo8105F2() {
        if (mo8102B2() && this.f8804k0) {
            mo8407O2();
        }
        this.f8804k0 = false;
    }

    /* renamed from: G2 */
    public void mo8106G2(boolean z) {
        this.f8804k0 = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        return false;
    }

    /* renamed from: I2 */
    public void mo8107I2(String str) {
    }

    /* renamed from: J2 */
    public void mo8108J2(String str) {
    }

    /* renamed from: K2 */
    public void mo8109K2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L2 */
    public void mo8895L2(View view) {
        mo8896M2(view, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public void mo8896M2(View view, int i, int i2) {
        int e = C2185a4.m9675e(mo2552c0(), 20.0f);
        String w2 = mo8409w2();
        w2.hashCode();
        char c = 65535;
        switch (w2.hashCode()) {
            case -1372576080:
                if (w2.equals("icons_top")) {
                    c = 0;
                    break;
                }
                break;
            case 3387192:
                if (w2.equals("none")) {
                    c = 1;
                    break;
                }
                break;
            case 1454535408:
                if (w2.equals("icons_bottom")) {
                    c = 2;
                    break;
                }
                break;
            case 1544803905:
                if (w2.equals("default")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                view.setPadding(i, 0, i2, e);
                return;
            case 1:
                view.setPadding(i, e, i2, e);
                return;
            case 2:
                view.setPadding(i, e, i2, 0);
                return;
            default:
                return;
        }
    }

    /* renamed from: N2 */
    public boolean mo8110N2() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O2 */
    public void mo8407O2() {
    }

    /* renamed from: P2 */
    public void mo8111P2() {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8293r();
        }
    }

    /* renamed from: Q2 */
    public void mo8112Q2() {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8903G(this.f8800g0, null, null);
        }
    }

    /* renamed from: R2 */
    public void mo8113R2() {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8302w(true);
        }
    }

    /* renamed from: S2 */
    public void mo8114S2() {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            Menu B = aVar.mo8254B();
            B.findItem(R.id.game_group).setVisible(false);
            B.findItem(R.id.system_group).setVisible(false);
            B.findItem(R.id.nav_random).setVisible(false);
            B.findItem(R.id.nav_search).setVisible(false);
            B.findItem(R.id.nav_sort).setVisible(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public void mo2531T0(Context context) {
        this.f8802i0 = false;
        super.mo2531T0(context);
        this.f8805l0 = context.getApplicationContext();
        this.f8806m0 = (AbstractC2532a) context;
    }

    /* renamed from: T2 */
    public void mo8115T2(C2369h0 h0Var) {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8265T(h0Var);
        }
    }

    /* renamed from: U2 */
    public void mo8116U2() {
    }

    /* renamed from: V2 */
    public void mo8897V2() {
        this.f8802i0 = true;
        mo8109K2();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        boolean z = false;
        this.f8802i0 = false;
        super.mo2537W0(bundle);
        if (!mo8103C2()) {
            this.f8793Z = C2219c3.m9805k(this.f8805l0);
            C2775u e = C2775u.m11726e(this.f8805l0);
            this.f8794a0 = e;
            this.f8795b0 = C2375h3.m10306r(this.f8805l0, e);
            C2512o0 g = C2512o0.m10833g(this.f8805l0, this.f8794a0);
            this.f8796c0 = g;
            this.f8797d0 = C2187b0.m9701o(this.f8805l0, this.f8795b0, g);
            this.f8798e0 = C2886z1.m11967b(this.f8805l0);
            if (mo8248r2() >= 0 && !this.f8793Z.mo8196t()) {
                z = true;
            }
        }
        mo2557d2(z);
        this.f8800g0 = new C2774t3();
        C2553q3.f8891a.f9397a.mo9210M(mo8127t2(), this.f8800g0);
    }

    /* renamed from: W2 */
    public void mo8117W2() {
        if (this.f8806m0 != null && !mo8103C2()) {
            this.f8806m0.mo8905W(this.f8801h0);
        }
    }

    /* renamed from: X2 */
    public void mo8118X2(String str) {
        this.f8801h0 = str;
    }

    /* renamed from: Y2 */
    public void mo8119Y2(String str) {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8911v(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public void mo2545Z0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(mo8248r2(), menu);
        mo8439p2(menu);
        super.mo2545Z0(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z2 */
    public void mo8898Z2(String str) {
        C2219c3 c3Var = this.f8793Z;
        c3Var.mo8158G(mo8127t2() + "_toolbar", str);
    }

    /* renamed from: a3 */
    public void mo8120a3(boolean z) {
        if (z && !this.f8803j0) {
            mo8119Y2(mo8409w2());
            mo8117W2();
            mo8105F2();
            mo8113R2();
            mo8114S2();
        }
        this.f8803j0 = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b3 */
    public boolean mo8899b3(String str) {
        boolean w = this.f8795b0.mo8572w(str);
        return this.f8795b0.mo8569t(str).equals("mame") ? !w : w;
    }

    /* renamed from: c3 */
    public void mo8121c3() {
    }

    /* renamed from: d3 */
    public boolean mo8122d3() {
        return true;
    }

    /* renamed from: e */
    public void mo8900e() {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8906e();
        }
    }

    /* renamed from: e3 */
    public void mo8123e3() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f3 */
    public String mo8901f3(String str) {
        return str == null ? "" : str;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public boolean mo2579k1(MenuItem menuItem) {
        if (mo8243H2(menuItem)) {
            return true;
        }
        return super.mo2579k1(menuItem);
    }

    /* renamed from: l */
    public boolean mo8902l() {
        AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            return aVar.mo8908l();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        this.f8803j0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
    }

    /* renamed from: q2 */
    public void mo8125q2() {
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        this.f8802i0 = false;
        super.mo2601r1();
        if (!mo8103C2() && !this.f8793Z.mo8186i()) {
            ImageService.m9511a(this.f8805l0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public int mo8248r2() {
        return -1;
    }

    /* renamed from: s2 */
    public String mo8126s2() {
        return this.f8801h0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        this.f8802i0 = false;
        super.mo2605t1();
        if (!mo8103C2()) {
            this.f8794a0.mo9329h();
            this.f8798e0.mo9516c();
            this.f8796c0.mo8850o();
            this.f8795b0.mo8543C();
            this.f8799f0 = C2749t1.m11663p(this.f8805l0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public abstract String mo8127t2();

    /* renamed from: u2 */
    public long mo8128u2() {
        return -1;
    }

    /* renamed from: v2 */
    public C2774t3 mo8129v2() {
        return this.f8800g0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w2 */
    public String mo8409w2() {
        C2219c3 c3Var = this.f8793Z;
        return c3Var.mo8193q(mo8127t2() + "_toolbar", "default");
    }

    /* renamed from: x2 */
    public boolean mo8130x2() {
        return false;
    }

    /* renamed from: y2 */
    public boolean mo8131y2(int i, int i2) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
    }
}
