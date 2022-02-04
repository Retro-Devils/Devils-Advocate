package com.digdroid.alman.dig;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.MyViewPager;
import com.google.android.material.navigation.NavigationView;
import java.util.Calendar;
import p006b.p067t.p068a.C1205b;

/* renamed from: com.digdroid.alman.dig.e0 */
public abstract class AbstractActivityC2260e0 extends ActivityC2800v1 implements AbstractC2531p1.AbstractC2532a, MyViewPager.AbstractC2120a {

    /* renamed from: T */
    boolean f8052T = false;

    /* renamed from: U */
    boolean f8053U = false;

    /* renamed from: V */
    boolean f8054V = false;

    /* renamed from: W */
    C2458l2 f8055W;

    /* renamed from: X */
    MyViewPager f8056X;

    /* renamed from: Y */
    C2515o2 f8057Y = null;

    /* renamed from: Z */
    ViewStub f8058Z = null;

    /* renamed from: a0 */
    ViewStub f8059a0 = null;

    /* renamed from: com.digdroid.alman.dig.e0$a */
    class C2261a implements C1205b.AbstractC1215j {

        /* renamed from: a */
        boolean f8060a = true;

        C2261a() {
        }

        @Override // p006b.p067t.p068a.C1205b.AbstractC1215j
        /* renamed from: a */
        public void mo6133a(int i, float f, int i2) {
            if (this.f8060a) {
                this.f8060a = false;
                mo6135c(0);
            }
            AbstractActivityC2260e0 e0Var = AbstractActivityC2260e0.this;
            C2515o2 o2Var = e0Var.f8057Y;
            if (o2Var != null) {
                o2Var.mo8866q((AbstractC2531p1) e0Var.f8055W.mo8687o(i), i2);
            }
        }

        @Override // p006b.p067t.p068a.C1205b.AbstractC1215j
        /* renamed from: b */
        public void mo6134b(int i) {
        }

        @Override // p006b.p067t.p068a.C1205b.AbstractC1215j
        /* renamed from: c */
        public void mo6135c(int i) {
            AbstractActivityC2260e0 e0Var = AbstractActivityC2260e0.this;
            e0Var.f8052T = false;
            e0Var.mo8259H(false);
            AbstractC2531p1 p1Var = (AbstractC2531p1) AbstractActivityC2260e0.this.f8055W.mo8687o(i);
            if (p1Var != null && !AbstractActivityC2260e0.this.f8055W.mo8718v()) {
                AbstractActivityC2260e0.this.mo8257E(p1Var.mo8129v2());
                p1Var.mo8112Q2();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.e0$b */
    class RunnableC2262b implements Runnable {
        RunnableC2262b() {
        }

        public void run() {
            AbstractC2531p1 k1 = AbstractActivityC2260e0.this.mo8280k1();
            if (k1 != null) {
                AbstractActivityC2260e0.this.mo8257E(k1.mo8129v2());
                k1.mo8112Q2();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e0$c */
    public class View$OnTouchListenerC2263c implements View.OnTouchListener {
        View$OnTouchListenerC2263c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: A */
    public void mo8253A(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("game_id", j);
        mo8278j1(22, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: B */
    public Menu mo8254B() {
        return ((NavigationView) findViewById(R.id.nav_view)).getMenu();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: C */
    public void mo8255C() {
        mo8278j1(23, new Bundle());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: D */
    public void mo8256D(long j, String str, C2369h0 h0Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("gameid", j);
        bundle.putString("title", str);
        h0Var.mo8535d(bundle);
        mo8278j1(7, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: E */
    public void mo8257E(C2774t3 t3Var) {
        C2553q3.m11130p(t3Var);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: F */
    public void mo8258F() {
        mo8278j1(12, new Bundle());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: H */
    public void mo8259H(boolean z) {
        View view;
        this.f8053U = z;
        if (z || this.f8059a0 != null) {
            if (this.f8059a0 == null) {
                ViewStub viewStub = (ViewStub) findViewById(R.id.stub_resize);
                this.f8059a0 = viewStub;
                view = viewStub.inflate();
            } else {
                view = findViewById(R.id.resize_view);
            }
            view.setVisibility(z ? 0 : 8);
            if (this.f8053U) {
                view.setOnTouchListener(new View$OnTouchListenerC2263c());
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: K */
    public void mo8260K(int i) {
        this.f8055W.mo8720x(this.f8056X, i);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: L */
    public void mo8261L() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putString("title", getString(R.string.all_games));
        mo8278j1(2, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: M */
    public void mo8262M(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putLong("collection", j);
        bundle.putString("title", str);
        mo8278j1(18, bundle);
    }

    @Override // com.digdroid.alman.dig.MyViewPager.AbstractC2120a
    /* renamed from: N */
    public boolean mo7950N() {
        AbstractC2531p1 k1 = mo8280k1();
        if (k1 != null) {
            return k1.mo8122d3();
        }
        return true;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: P */
    public boolean mo8263P() {
        return this.f8052T;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: R */
    public void mo8264R() {
        this.f8055W.mo8689q();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: T */
    public void mo8265T(C2369h0 h0Var) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putString("title", getString(R.string.all_games));
        h0Var.mo8535d(bundle);
        mo8278j1(2, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: U */
    public void mo8266U(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putLong("genre", j);
        bundle.putString("title", str);
        mo8278j1(6, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: V */
    public void mo8267V(String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
            bundle.putString("system", str);
            bundle.putString("title", this.f9269y.mo8568s(str));
            mo8278j1(4, bundle);
        } catch (Exception unused) {
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: Z */
    public void mo8268Z() {
        mo8278j1(16, new Bundle());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: a0 */
    public void mo8269a0(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("gameid", j);
        mo8278j1(9, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: b0 */
    public void mo8270b0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putString("title", getString(R.string.played_games));
        mo8278j1(8, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: d0 */
    public void mo8271d0() {
        mo8272e0(-1, getString(R.string.collections));
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: e0 */
    public void mo8272e0(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("id", j);
        bundle.putString("title", str);
        mo8278j1(17, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: g0 */
    public boolean mo8273g0() {
        return this.f8053U;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: h0 */
    public void mo8274h0() {
        mo8278j1(0, new Bundle());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: i */
    public void mo8275i() {
        int currentItem = this.f8056X.getCurrentItem() + 1;
        if (currentItem < this.f8055W.mo6058c()) {
            this.f8056X.mo6072K(currentItem, true);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: i0 */
    public void mo8276i0(String str, String str2, int i, int i2) {
        this.f8055W.mo8721y(this.f8056X, null, str2, i, i2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: j */
    public void mo8277j() {
        int currentItem = this.f8056X.getCurrentItem();
        if (currentItem > 0) {
            this.f8056X.mo6072K(currentItem - 1, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo8278j1(int i, Bundle bundle) {
        this.f8055W.mo8716t(this.f8056X, i, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: k0 */
    public void mo8279k0(boolean z) {
        View view;
        if (z || this.f8058Z != null) {
            if (this.f8058Z == null) {
                ViewStub viewStub = (ViewStub) findViewById(R.id.stub_progress);
                this.f8058Z = viewStub;
                view = viewStub.inflate();
            } else {
                view = findViewById(R.id.show_progress);
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public AbstractC2531p1 mo8280k1() {
        int currentItem = this.f8056X.getCurrentItem();
        if (currentItem >= 0) {
            return (AbstractC2531p1) this.f8055W.mo8687o(currentItem);
        }
        return null;
    }

    /* renamed from: l1 */
    public abstract Toolbar mo8281l1();

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: m */
    public boolean mo8282m() {
        return ((DrawerLayout) findViewById(R.id.drawer_layout)).mo2402A(8388611);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: m0 */
    public long mo8283m0() {
        AbstractC2531p1 p1Var;
        int currentItem = this.f8056X.getCurrentItem();
        if (currentItem < 1 || (p1Var = (AbstractC2531p1) this.f8055W.mo8687o(currentItem - 1)) == null) {
            return -1;
        }
        return p1Var.mo8128u2();
    }

    /* renamed from: m1 */
    public boolean mo8284m1() {
        C2458l2 l2Var = this.f8055W;
        return l2Var != null && l2Var.mo8718v();
    }

    /* renamed from: n1 */
    public void mo8285n1() {
        mo8278j1(21, new Bundle());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: o0 */
    public void mo8286o0(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("gameid", j);
        mo8278j1(20, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo8287o1() {
        mo8278j1(1, new Bundle());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2800v1, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9267w = C2219c3.m9805k(getApplicationContext());
        mo8254B().findItem(R.id.nav_kiosk).setTitle(this.f9267w.mo8196t() ? R.string.exit_kiosk : R.string.kiosk);
        C2458l2 l2Var = new C2458l2(this);
        this.f8055W = l2Var;
        if (bundle != null) {
            try {
                l2Var.mo6064i(bundle.getParcelable("state"), getClassLoader());
            } catch (Exception unused) {
                this.f8055W = new C2458l2(this);
            }
        }
        MyViewPager myViewPager = (MyViewPager) findViewById(R.id.pager);
        this.f8056X = myViewPager;
        myViewPager.setAdapter(this.f8055W);
        this.f8056X.setOffscreenPageLimit(1);
        this.f8056X.mo7949P(this);
        this.f8056X.mo6080b(new C2261a());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onPause() {
        super.onPause();
        C2515o2.m10875m();
        this.f8057Y = null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c
    public void onSaveInstanceState(Bundle bundle) {
        this.f8055W.mo8691s(this.f8056X.getCurrentItem(), this.f8056X.getOffscreenPageLimit());
        bundle.putParcelable("state", this.f8055W.mo6065j());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: p */
    public void mo8288p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8193q("systems_list_type", "grid").equals("grid"));
        mo8278j1(3, bundle);
    }

    /* renamed from: p1 */
    public void mo8289p1(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("publisher", str);
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putString("title", str);
        mo8278j1(14, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: q */
    public void mo8290q(String str, C2369h0 h0Var, int i) {
        this.f8055W.mo8721y(this.f8056X, h0Var, null, -1, i);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: q0 */
    public void mo8291q0() {
        this.f8055W.mo8690r(this.f8056X.getCurrentItem() + 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo8292q1() {
        mo8278j1(10, new Bundle());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: r */
    public void mo8293r() {
        this.f8055W.mo8719w(this.f8056X);
    }

    /* renamed from: r1 */
    public void mo8294r1(Intent intent) {
        mo8281l1().setTitle(intent.getStringExtra("name"));
        Bundle bundle = new Bundle();
        bundle.putString("system", intent.getStringExtra("system"));
        bundle.putString("title", intent.getStringExtra("name"));
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        mo8278j1(4, bundle);
    }

    /* renamed from: s1 */
    public void mo8295s1(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("released", j);
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        bundle.putString("title", "" + i);
        mo8278j1(15, bundle);
    }

    /* renamed from: t1 */
    public void mo8296t1(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("system", str);
        mo8278j1(19, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: u */
    public void mo8297u() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("grid", this.f9267w.mo8179b().equals("grid"));
        bundle.putString("title", getString(R.string.favorites));
        mo8278j1(5, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: u0 */
    public void mo8298u0() {
        int currentItem = this.f8056X.getCurrentItem();
        this.f8055W.mo8690r(currentItem);
        this.f8055W.mo8717u(currentItem);
        this.f8056X.mo6072K(currentItem - 1, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo8299u1() {
        this.f8055W.mo8690r(0);
        this.f8055W.mo8717u(0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: v0 */
    public C2515o2 mo8300v0() {
        C2515o2 o = C2515o2.m10876o(this, R.id.stub_youtube, R.id.main_youtube_container, R.id.youtube_fragment, R.id.youtube_tv_video);
        this.f8057Y = o;
        return o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo8301v1() {
        this.f8056X.post(new RunnableC2262b());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: w */
    public void mo8302w(boolean z) {
        mo243L0().mo204s(z && !this.f9267w.mo8196t());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: x */
    public void mo8303x(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("theme", str);
        mo8278j1(11, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: z */
    public void mo8304z(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        mo8278j1(13, bundle);
    }
}
