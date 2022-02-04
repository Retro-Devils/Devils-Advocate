package com.digdroid.alman.dig;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2267e2;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: com.digdroid.alman.dig.r1 */
public abstract class AbstractC2577r1 extends AbstractC2531p1 implements C2267e2.AbstractC2286s {

    /* renamed from: n0 */
    int f8964n0 = 0;

    /* renamed from: o0 */
    Cursor f8965o0 = null;

    /* renamed from: p0 */
    C2267e2 f8966p0;

    /* renamed from: q0 */
    C2252d2 f8967q0 = null;

    /* renamed from: r0 */
    View f8968r0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$a */
    public class C2578a implements C2267e2.AbstractC2289v {
        C2578a() {
        }

        @Override // com.digdroid.alman.dig.C2267e2.AbstractC2289v
        /* renamed from: a */
        public void mo8404a(View view, int i) {
            if (!AbstractC2577r1.this.f8966p0.mo8326k() && AbstractC2577r1.this.mo8102B2()) {
                AbstractC2577r1 r1Var = AbstractC2577r1.this;
                r1Var.mo8425n3(view, r1Var.f8966p0.mo8320d(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$b */
    public class C2579b implements C2267e2.AbstractC2290w {
        C2579b() {
        }

        @Override // com.digdroid.alman.dig.C2267e2.AbstractC2290w
        /* renamed from: a */
        public boolean mo8405a(View view, int i) {
            AbstractC2531p1.AbstractC2532a aVar;
            if (AbstractC2577r1.this.f8966p0.mo8326k() || (aVar = AbstractC2577r1.this.f8814m0) == null || !aVar.mo8912y()) {
                return false;
            }
            AbstractC2577r1 r1Var = AbstractC2577r1.this;
            r1Var.mo8431h3(view, r1Var.f8966p0.mo8320d(i));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$c */
    public class CallableC2580c implements Callable<String> {
        CallableC2580c() {
        }

        /* renamed from: a */
        public String call() {
            AbstractC2577r1.this.mo8897V2();
            AbstractC2577r1 r1Var = AbstractC2577r1.this;
            r1Var.f8966p0.mo8338w(r1Var.f8964n0);
            AbstractC2577r1.this.f8966p0.mo8323h();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$d */
    public class View$OnClickListenerC2581d implements View.OnClickListener {
        View$OnClickListenerC2581d() {
        }

        public void onClick(View view) {
            AbstractC2577r1.this.f8966p0.mo8330o(0.9756098f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$e */
    public class View$OnClickListenerC2582e implements View.OnClickListener {
        View$OnClickListenerC2582e() {
        }

        public void onClick(View view) {
            AbstractC2577r1.this.f8966p0.mo8330o(1.025f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$f */
    public class View$OnClickListenerC2583f implements View.OnClickListener {
        View$OnClickListenerC2583f() {
        }

        public void onClick(View view) {
            AbstractC2577r1.this.f8966p0.mo8331p(0.952381f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$g */
    public class View$OnClickListenerC2584g implements View.OnClickListener {
        View$OnClickListenerC2584g() {
        }

        public void onClick(View view) {
            AbstractC2577r1.this.f8966p0.mo8331p(1.05f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$h */
    public class View$OnClickListenerC2585h implements View.OnClickListener {
        View$OnClickListenerC2585h() {
        }

        public void onClick(View view) {
            AbstractC2577r1.this.f8814m0.mo8259H(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r1$i */
    public class AsyncTaskC2586i extends AsyncTask<String, Void, Cursor> {

        /* renamed from: a */
        boolean f8977a;

        /* renamed from: b */
        boolean f8978b;

        /* renamed from: c */
        Callable<String> f8979c;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.r1$i$a */
        public class RunnableC2587a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Cursor f8981b;

            RunnableC2587a(Cursor cursor) {
                this.f8981b = cursor;
            }

            public void run() {
                ActivityC0447d c0;
                try {
                    AsyncTaskC2586i iVar = AsyncTaskC2586i.this;
                    AbstractC2577r1.this.mo9024t3(this.f8981b, iVar.f8977a);
                    Callable<String> callable = AsyncTaskC2586i.this.f8979c;
                    if (callable != null) {
                        callable.call();
                    }
                    AsyncTaskC2586i iVar2 = AsyncTaskC2586i.this;
                    if (iVar2.f8978b && (c0 = AbstractC2577r1.this.mo2552c0()) != null && !c0.isFinishing()) {
                        c0.invalidateOptionsMenu();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public AsyncTaskC2586i(boolean z, boolean z2, Callable<String> callable) {
            this.f8977a = z;
            this.f8978b = z2;
            this.f8979c = callable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cursor doInBackground(String... strArr) {
            return AbstractC2577r1.this.mo8694k3();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Cursor cursor) {
            if (cursor != null) {
                AbstractC2577r1.this.f8966p0.mo8327l(new RunnableC2587a(cursor));
            }
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: A */
    public void mo8359A(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8199w(mo8127t2() + "_title_scale", f);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: B */
    public void mo8360B() {
        C2453k2 k2Var = this.f8966p0.f8100n;
        if (k2Var != null) {
            k2Var.f8570c = 0;
        }
        C2252d2 j3 = mo8432j3(this.f8967q0.mo8241c());
        this.f8967q0 = j3;
        this.f8966p0.mo8332q(j3);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: B2 */
    public /* bridge */ /* synthetic */ boolean mo8102B2() {
        return super.mo8102B2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: C */
    public void mo8361C(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_carousel_scale", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: C2 */
    public /* bridge */ /* synthetic */ boolean mo8103C2() {
        return super.mo8103C2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: D */
    public boolean mo8362D() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        return aVar != null && !aVar.mo8273g0();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: E */
    public float mo8363E() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_vertical_scale", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: E2 */
    public /* bridge */ /* synthetic */ void mo8104E2(boolean z) {
        super.mo8104E2(z);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: F */
    public void mo8364F(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8199w(mo8127t2() + "_list_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: F2 */
    public /* bridge */ /* synthetic */ void mo8105F2() {
        super.mo8105F2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: G */
    public int[] mo8365G() {
        return new int[]{R.id.icon_container, R.id.icon_container, R.id.game_name, R.id.game_info};
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: G2 */
    public /* bridge */ /* synthetic */ void mo8106G2(boolean z) {
        super.mo8106G2(z);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: H */
    public void mo8366H(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8199w(mo8127t2() + "_vertical_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case R.id.as_carousel /*{ENCODED_INT: 2131296371}*/:
                mo8723w3("carousel", this.f8966p0.mo8321f());
                return true;
            case R.id.as_coverflow /*{ENCODED_INT: 2131296372}*/:
                mo8723w3("coverflow", this.f8966p0.mo8321f());
                return true;
            case R.id.as_linear /*{ENCODED_INT: 2131296373}*/:
                mo8723w3("linear", this.f8966p0.mo8321f());
                return true;
            case R.id.as_list /*{ENCODED_INT: 2131296374}*/:
                mo8723w3("list", this.f8966p0.mo8321f());
                return true;
            case R.id.as_vertical /*{ENCODED_INT: 2131296375}*/:
                mo8723w3("vertical", this.f8966p0.mo8321f());
                return true;
            case R.id.as_wheel /*{ENCODED_INT: 2131296376}*/:
                mo8723w3("wheel", this.f8966p0.mo8321f());
                return true;
            default:
                switch (itemId) {
                    case R.id.aspect16_9 /*{ENCODED_INT: 2131296378}*/:
                        mo8469u3(1.7777778f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect1_1 /*{ENCODED_INT: 2131296379}*/:
                        mo8469u3(1.0f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect1_2 /*{ENCODED_INT: 2131296380}*/:
                        mo8469u3(0.5f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect2_1 /*{ENCODED_INT: 2131296381}*/:
                        mo8469u3(2.0f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect2_3 /*{ENCODED_INT: 2131296382}*/:
                        mo8469u3(0.6666667f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect3_2 /*{ENCODED_INT: 2131296383}*/:
                        mo8469u3(1.5f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect3_4 /*{ENCODED_INT: 2131296384}*/:
                        mo8469u3(0.75f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect4_3 /*{ENCODED_INT: 2131296385}*/:
                        mo8469u3(1.3333334f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    case R.id.aspect9_16 /*{ENCODED_INT: 2131296386}*/:
                        mo8469u3(0.5625f);
                        mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                        return true;
                    default:
                        switch (itemId) {
                            case R.id.icons_only /*{ENCODED_INT: 2131296785}*/:
                                mo9025v3(!mo9026w());
                                mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                                return true;
                            case R.id.resize /*{ENCODED_INT: 2131297079}*/:
                                mo9023s3();
                                return true;
                            case R.id.use_8bit /*{ENCODED_INT: 2131297325}*/:
                                mo9027x3(!mo9016c());
                                mo8723w3(mo8375Q(), this.f8966p0.mo8321f());
                                return true;
                            case R.id.view_grid /*{ENCODED_INT: 2131297340}*/:
                                mo8723w3("grid", this.f8966p0.mo8321f());
                                return true;
                            case R.id.view_titles /*{ENCODED_INT: 2131297342}*/:
                                mo8723w3("title", this.f8966p0.mo8321f());
                                return true;
                            default:
                                return super.mo8243H2(menuItem);
                        }
                }
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: I */
    public void mo8367I(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_carousel_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: I2 */
    public /* bridge */ /* synthetic */ void mo8107I2(String str) {
        super.mo8107I2(str);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: J */
    public void mo8368J(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8199w(mo8127t2() + "_title_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: J2 */
    public /* bridge */ /* synthetic */ void mo8108J2(String str) {
        super.mo8108J2(str);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: K */
    public void mo8369K(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_linear_scale", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: K2 */
    public /* bridge */ /* synthetic */ void mo8109K2() {
        super.mo8109K2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: L */
    public float mo8370L() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_linear_spacing", 1.0f);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: M */
    public float mo8371M() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_wheel_spacing", 1.0f);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: N */
    public void mo8372N(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_linear_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: N2 */
    public /* bridge */ /* synthetic */ boolean mo8110N2() {
        return super.mo8110N2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: O */
    public void mo8373O(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8199w(mo8127t2() + "_list_scale", f);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public void mo8407O2() {
        mo9020p3(false, null);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: P */
    public double mo8374P() {
        C2219c3 c3Var = this.f8801Z;
        return (double) c3Var.mo8183f(mo8127t2() + "_block_size", 170.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: P2 */
    public void mo8111P2() {
        C2267e2 e2Var;
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null && (e2Var = this.f8966p0) != null) {
            aVar.mo8260K(e2Var.mo8321f());
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: Q */
    public String mo8375Q() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8193q(mo8127t2() + "_list_type", mo8695l3());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Q2 */
    public /* bridge */ /* synthetic */ void mo8112Q2() {
        super.mo8112Q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: R2 */
    public /* bridge */ /* synthetic */ void mo8113R2() {
        super.mo8113R2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: S */
    public float mo8376S() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_vertical_spacing", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: S2 */
    public void mo8114S2() {
        super.mo8114S2();
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null) {
            aVar.mo8254B().findItem(R.id.nav_random).setVisible(true);
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: T */
    public void mo8377T(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8199w(mo8127t2() + "_vertical_scale", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public /* bridge */ /* synthetic */ void mo2531T0(Context context) {
        super.mo2531T0(context);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: T2 */
    public /* bridge */ /* synthetic */ void mo8115T2(C2369h0 h0Var) {
        super.mo8115T2(h0Var);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: U */
    public void mo8378U(double d) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_block_size", (float) d);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: U2 */
    public void mo8116U2() {
        C2252d2 d2Var;
        if (mo8102B2() && (d2Var = this.f8967q0) != null && d2Var.mo8240b() > 1) {
            this.f8966p0.mo8338w(new Random().nextInt(this.f8967q0.mo8240b()));
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: V */
    public float mo8379V() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_linear_scale", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: V2 */
    public /* bridge */ /* synthetic */ void mo8897V2() {
        super.mo8897V2();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: W */
    public float mo8380W() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_coverflow_scale", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        String str;
        super.mo2537W0(bundle);
        if (bundle == null) {
            this.f8964n0 = 0;
            bundle = mo2568h0();
            str = "scroll_position";
            if (!bundle.containsKey(str)) {
                return;
            }
        } else {
            str = "selected_item";
        }
        this.f8964n0 = bundle.getInt(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: W2 */
    public /* bridge */ /* synthetic */ void mo8117W2() {
        super.mo8117W2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: X2 */
    public /* bridge */ /* synthetic */ void mo8118X2(String str) {
        super.mo8118X2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Y2 */
    public /* bridge */ /* synthetic */ void mo8119Y2(String str) {
        super.mo8119Y2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public /* bridge */ /* synthetic */ void mo2545Z0(Menu menu, MenuInflater menuInflater) {
        super.mo2545Z0(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Z2 */
    public void mo8898Z2(String str) {
        super.mo8898Z2(str);
        this.f8966p0.mo8340y(str);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8814m0.mo8257E(this.f8808g0);
        this.f8968r0 = C2267e2.m10028e(layoutInflater, viewGroup, mo8375Q());
        C2267e2 e2Var = new C2267e2((MainActivity) mo2552c0(), this.f8968r0, mo9019o3(), this);
        this.f8966p0 = e2Var;
        e2Var.mo8340y(mo8409w2());
        AbsListView absListView = this.f8966p0.f8094h;
        if (absListView != null) {
            mo8895L2(absListView);
        }
        this.f8966p0.mo8335t(new C2578a());
        this.f8966p0.mo8336u(new C2579b());
        return this.f8968r0;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: a3 */
    public void mo8120a3(boolean z) {
        C2267e2 e2Var;
        AbstractC2531p1.AbstractC2532a aVar;
        C2267e2 e2Var2;
        boolean z2 = true;
        boolean z3 = z && !this.f8811j0;
        if (z || !this.f8811j0) {
            z2 = false;
        }
        super.mo8120a3(z);
        if (z2 && (e2Var2 = this.f8966p0) != null) {
            this.f8964n0 = e2Var2.mo8321f();
        }
        if (z && (e2Var = this.f8966p0) != null && e2Var.f8095i != null && (aVar = this.f8814m0) != null && !aVar.mo8282m() && !this.f8814m0.mo8263P() && !this.f8814m0.mo8273g0()) {
            this.f8966p0.f8095i.requestFocus();
        }
        C2267e2 e2Var3 = this.f8966p0;
        if (e2Var3 != null) {
            e2Var3.mo8341z(z);
            if (z3) {
                this.f8966p0.mo8323h();
                this.f8966p0.mo8338w(this.f8964n0);
            }
        }
    }

    /* renamed from: c */
    public boolean mo9016c() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8180c(mo8127t2() + "_8bit", true);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: c3 */
    public /* bridge */ /* synthetic */ void mo8121c3() {
        super.mo8121c3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: d3 */
    public boolean mo8122d3() {
        C2267e2 e2Var = this.f8966p0;
        return e2Var == null || e2Var.f8095i == null;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo8900e() {
        super.mo8900e();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: e3 */
    public /* bridge */ /* synthetic */ void mo8123e3() {
        super.mo8123e3();
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: g */
    public Point mo8382g(boolean z) {
        return this.f8814m0.mo8907g(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g3 */
    public void mo9017g3() {
        C2252d2 d2Var = this.f8967q0;
        if (d2Var != null) {
            Cursor c = d2Var.mo8241c();
            if (c != null && !c.isClosed()) {
                c.close();
            }
            this.f8967q0.mo8239a();
            this.f8967q0 = null;
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: h */
    public float mo8383h() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_title_scale", 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h3 */
    public abstract void mo8431h3(View view, Object obj);

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: i */
    public void mo8384i() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null) {
            aVar.mo8275i();
        }
    }

    /* renamed from: i3 */
    public boolean mo9018i3() {
        int f = this.f8966p0.mo8321f();
        String Q = mo8375Q();
        Q.hashCode();
        char c = 65535;
        switch (Q.hashCode()) {
            case -1984141450:
                if (Q.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (Q.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case 2908512:
                if (Q.equals("carousel")) {
                    c = 2;
                    break;
                }
                break;
            case 3181382:
                if (Q.equals("grid")) {
                    c = 3;
                    break;
                }
                break;
            case 3322014:
                if (Q.equals("list")) {
                    c = 4;
                    break;
                }
                break;
            case 110371416:
                if (Q.equals("title")) {
                    c = 5;
                    break;
                }
                break;
            case 113097563:
                if (Q.equals("wheel")) {
                    c = 6;
                    break;
                }
                break;
            case 1980277093:
                if (Q.equals("coverflow")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            default:
                mo8723w3("grid", f);
                break;
            case 1:
                mo8723w3("title", f);
                break;
            case 2:
                mo8723w3("coverflow", f);
                break;
            case 3:
                mo8723w3("list", f);
                break;
            case 4:
                mo8723w3("carousel", f);
                break;
            case 5:
                mo8723w3("vertical", f);
                break;
            case 6:
                mo8723w3("linear", f);
                break;
            case 7:
                mo8723w3("wheel", f);
                break;
        }
        return true;
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: j */
    public void mo8385j() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null) {
            aVar.mo8277j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j3 */
    public abstract C2252d2 mo8432j3(Cursor cursor);

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: k */
    public float mo8386k() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_list_scale", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public /* bridge */ /* synthetic */ boolean mo2579k1(MenuItem menuItem) {
        return super.mo2579k1(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3 */
    public abstract Cursor mo8694k3();

    @Override // com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo8902l() {
        return super.mo8902l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l3 */
    public abstract String mo8695l3();

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: m */
    public float mo8388m() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_list_spacing", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        this.f8964n0 = this.f8966p0.mo8321f();
        mo9017g3();
    }

    /* renamed from: m3 */
    public float mo8468m3() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_aspect_ratio", 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n3 */
    public abstract void mo8425n3(View view, Object obj);

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: o */
    public float mo8389o() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_title_spacing", 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o3 */
    public String mo9019o3() {
        String Q = mo8375Q();
        Q.hashCode();
        char c = 65535;
        switch (Q.hashCode()) {
            case -1984141450:
                if (Q.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (Q.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case 2908512:
                if (Q.equals("carousel")) {
                    c = 2;
                    break;
                }
                break;
            case 3181382:
                if (Q.equals("grid")) {
                    c = 3;
                    break;
                }
                break;
            case 113097563:
                if (Q.equals("wheel")) {
                    c = 4;
                    break;
                }
                break;
            case 1980277093:
                if (Q.equals("coverflow")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return Q;
            default:
                return "list";
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: p */
    public float mo8390p() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_coverflow_spacing", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        super.mo8439p2(menu);
        SubMenu subMenu = menu.findItem(R.id.view_as).getSubMenu();
        subMenu.clearHeader();
        SubMenu subMenu2 = subMenu.findItem(R.id.configure_view).getSubMenu();
        subMenu2.clearHeader();
        subMenu2.findItem(R.id.use_8bit).setChecked(mo9016c());
        subMenu2.findItem(R.id.icons_only).setChecked(mo9026w());
        SubMenu subMenu3 = subMenu2.findItem(R.id.aspect_ratio).getSubMenu();
        subMenu3.clearHeader();
        float m3 = mo8468m3();
        boolean z = true;
        subMenu3.findItem(R.id.aspect2_1).setChecked(Math.abs(m3 - 2.0f) < 0.001f);
        subMenu3.findItem(R.id.aspect16_9).setChecked(Math.abs(m3 - 1.7777778f) < 0.001f);
        subMenu3.findItem(R.id.aspect3_2).setChecked(Math.abs(m3 - 1.5f) < 0.001f);
        subMenu3.findItem(R.id.aspect4_3).setChecked(Math.abs(m3 - 1.3333334f) < 0.001f);
        subMenu3.findItem(R.id.aspect1_1).setChecked(Math.abs(m3 - 1.0f) < 0.001f);
        subMenu3.findItem(R.id.aspect3_4).setChecked(Math.abs(m3 - 0.75f) < 0.001f);
        subMenu3.findItem(R.id.aspect2_3).setChecked(Math.abs(m3 - 0.6666667f) < 0.001f);
        subMenu3.findItem(R.id.aspect9_16).setChecked(Math.abs(m3 - 0.5625f) < 0.001f);
        MenuItem findItem = subMenu3.findItem(R.id.aspect1_2);
        if (Math.abs(m3 - 0.5f) >= 0.001f) {
            z = false;
        }
        findItem.setChecked(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3 */
    public void mo9020p3(boolean z, Callable<String> callable) {
        try {
            new AsyncTaskC2586i(false, z, callable).execute(new String[0]);
        } catch (Exception unused) {
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: q */
    public void mo8391q(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_wheel_scale", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: q2 */
    public void mo8125q2() {
        C2267e2 e2Var = this.f8966p0;
        if (e2Var != null && e2Var.mo8321f() > 0) {
            this.f8966p0.mo8338w(0);
        }
    }

    /* renamed from: q3 */
    public void mo9021q3() {
        mo9022r3(false);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: r */
    public void mo8392r(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_coverflow_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        this.f8803b0.mo8543C();
        this.f8804c0.mo8850o();
        new AsyncTaskC2586i(false, true, new CallableC2580c()).execute(new String[0]);
    }

    /* renamed from: r3 */
    public void mo9022r3(boolean z) {
        this.f8964n0 = 0;
        new AsyncTaskC2586i(true, z, null).execute(new String[0]);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putInt("selected_item", this.f8966p0.mo8321f());
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ String mo8126s2() {
        return super.mo8126s2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s3 */
    public void mo9023s3() {
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing()) {
            this.f8814m0.mo8259H(true);
            View findViewById = c0.findViewById(R.id.resize_view);
            findViewById.setVisibility(0);
            TextView textView = (TextView) findViewById.findViewById(R.id.horizontal_down);
            textView.setOnClickListener(new View$OnClickListenerC2581d());
            C2553q3.m11132r(textView, -1073741824);
            textView.requestFocus();
            TextView textView2 = (TextView) findViewById.findViewById(R.id.horizontal_up);
            textView2.setOnClickListener(new View$OnClickListenerC2582e());
            C2553q3.m11132r(textView2, -1073741824);
            TextView textView3 = (TextView) findViewById.findViewById(R.id.vertical_down);
            textView3.setOnClickListener(new View$OnClickListenerC2583f());
            C2553q3.m11132r(textView3, -1073741824);
            TextView textView4 = (TextView) findViewById.findViewById(R.id.vertical_up);
            textView4.setOnClickListener(new View$OnClickListenerC2584g());
            C2553q3.m11132r(textView4, -1073741824);
            TextView textView5 = (TextView) findViewById.findViewById(R.id.resize_ok);
            textView5.setOnClickListener(new View$OnClickListenerC2585h());
            C2553q3.m11132r(textView5, -1073741824);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public /* bridge */ /* synthetic */ void mo2605t1() {
        super.mo2605t1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t3 */
    public synchronized void mo9024t3(Cursor cursor, boolean z) {
        if (z) {
            mo9017g3();
        }
        if (this.f8967q0 == null) {
            C2252d2 j3 = mo8432j3(cursor);
            this.f8967q0 = j3;
            this.f8966p0.mo8332q(j3);
        } else {
            this.f8966p0.mo8318b(cursor);
        }
        this.f8965o0 = cursor;
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: u */
    public void mo8393u(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_coverflow_scale", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: u2 */
    public long mo8128u2() {
        C2252d2 d2Var;
        if (!mo8102B2() || (d2Var = this.f8967q0) == null || d2Var.mo8240b() <= 1) {
            return -1;
        }
        int nextInt = new Random().nextInt(this.f8967q0.mo8240b());
        Cursor c = this.f8967q0.mo8241c();
        if (c == null || c.isClosed() || !c.moveToPosition(nextInt)) {
            return -1;
        }
        return c.getLong(0);
    }

    /* renamed from: u3 */
    public void mo8469u3(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_aspect_ratio", f);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: v */
    public void mo8394v(float f) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8155D(mo8127t2() + "_wheel_spacing", f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: v2 */
    public /* bridge */ /* synthetic */ C2774t3 mo8129v2() {
        return super.mo8129v2();
    }

    /* renamed from: v3 */
    public void mo9025v3(boolean z) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8153B(mo8127t2() + "_icons_only", z);
    }

    /* renamed from: w */
    public boolean mo9026w() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8180c(mo8127t2() + "_icons_only", false);
    }

    /* renamed from: w3 */
    public void mo8723w3(String str, int i) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8202z(mo8127t2() + "_list_type", str);
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null) {
            aVar.mo8260K(i);
        }
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: x */
    public float mo8395x() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_wheel_scale", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: x2 */
    public /* bridge */ /* synthetic */ boolean mo8130x2() {
        return super.mo8130x2();
    }

    /* renamed from: x3 */
    public void mo9027x3(boolean z) {
        C2219c3 c3Var = this.f8801Z;
        c3Var.mo8153B(mo8127t2() + "_8bit", z);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: y */
    public float mo8396y() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_carousel_spacing", 1.0f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: y2 */
    public boolean mo8131y2(int i, int i2) {
        C2267e2 e2Var;
        if (!mo8102B2() || (e2Var = this.f8966p0) == null) {
            return false;
        }
        return (i == 7 && i2 == 1) ? mo9018i3() : e2Var.mo8322g(i, i2);
    }

    @Override // com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: z */
    public float mo8397z() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8183f(mo8127t2() + "_carousel_scale", 1.0f);
    }
}
