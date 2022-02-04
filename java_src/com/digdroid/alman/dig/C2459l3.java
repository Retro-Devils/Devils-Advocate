package com.digdroid.alman.dig;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2267e2;
import com.digdroid.alman.dig.C2324g1;
import com.digdroid.alman.dig.C2749t1;

/* renamed from: com.digdroid.alman.dig.l3 */
public class C2459l3 extends AbstractC2577r1 implements C2324g1.AbstractC2325a {

    /* renamed from: s0 */
    int f8580s0;

    /* renamed from: t0 */
    String f8581t0;

    /* renamed from: com.digdroid.alman.dig.l3$a */
    class C2460a implements C2267e2.AbstractC2291x {

        /* renamed from: a */
        int f8582a = -1;

        /* renamed from: b */
        Handler f8583b = new Handler();

        /* renamed from: com.digdroid.alman.dig.l3$a$a */
        class RunnableC2461a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f8585b;

            RunnableC2461a(int i) {
                this.f8585b = i;
            }

            public void run() {
                if (C2459l3.this.mo8102B2()) {
                    int i = this.f8585b;
                    C2460a aVar = C2460a.this;
                    if (i != aVar.f8582a) {
                        C2459l3 l3Var = C2459l3.this;
                        if (l3Var.f8803j0) {
                            l3Var.m10591z3(i);
                        }
                    }
                    C2460a.this.f8582a = this.f8585b;
                }
            }
        }

        C2460a() {
        }

        @Override // com.digdroid.alman.dig.C2267e2.AbstractC2291x
        /* renamed from: a */
        public void mo8406a(View view, int i) {
            this.f8583b.removeCallbacksAndMessages(null);
            this.f8583b.postDelayed(new RunnableC2461a(i), 100);
        }
    }

    /* renamed from: com.digdroid.alman.dig.l3$b */
    class C2462b implements C2749t1.AbstractC2772l {
        C2462b() {
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2772l
        /* renamed from: a */
        public void mo8684a() {
            C2459l3.this.mo8407O2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.l3$c */
    public class C2463c implements C2223d0.AbstractC2249s {

        /* renamed from: a */
        final /* synthetic */ String f8588a;

        /* renamed from: b */
        final /* synthetic */ int f8589b;

        C2463c(String str, int i) {
            this.f8588a = str;
            this.f8589b = i;
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2459l3 l3Var = C2459l3.this;
            l3Var.f8806m0.mo8276i0(l3Var.mo9019o3(), this.f8588a, this.f8589b, 0);
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z3 */
    private boolean m10591z3(int i) {
        Cursor c;
        if (!mo8102B2()) {
            return true;
        }
        if (i < 0 || this.f8806m0 == null || (c = this.f8959q0.mo8241c()) == null || c.isClosed() || !c.moveToPosition(i)) {
            return false;
        }
        String string = c.getString(3);
        this.f8806m0.mo8903G(this.f8800g0, this.f8795b0.mo8575z(string), this.f8795b0.mo8574y(string));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A3 */
    public void mo8722A3(String str, int i) {
        C2223d0.m9876p().mo8215r(mo2552c0(), 7, new C2463c(str, i));
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: G */
    public int[] mo8365G() {
        return new int[]{R.id.system_icon, R.id.system_icon, R.id.system_name, R.id.system_info};
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case R.id.all_types /*{ENCODED_INT: 2131296350}*/:
                mo8722A3("all", this.f8580s0);
                return true;
            case R.id.arcade /*{ENCODED_INT: 2131296369}*/:
                mo8722A3("arcade", this.f8580s0);
                return true;
            case R.id.computers /*{ENCODED_INT: 2131296513}*/:
                mo8722A3("computer", this.f8580s0);
                return true;
            case R.id.consoles /*{ENCODED_INT: 2131296520}*/:
                mo8722A3("console", this.f8580s0);
                return true;
            case R.id.hide_systems /*{ENCODED_INT: 2131296765}*/:
                C2219c3 c3Var = this.f8793Z;
                c3Var.mo8174W(!c3Var.mo8192p());
                mo8407O2();
                mo2552c0().invalidateOptionsMenu();
                this.f8806m0.mo8264R();
                mo8106G2(false);
                return true;
            case R.id.sort_date /*{ENCODED_INT: 2131297179}*/:
                this.f8793Z.mo8158G("systems_sort", "date");
                this.f8806m0.mo8276i0(mo9019o3(), this.f8581t0, this.f8580s0, 0);
                return true;
            case R.id.sort_name /*{ENCODED_INT: 2131297183}*/:
                this.f8793Z.mo8158G("systems_sort", "name");
                this.f8806m0.mo8276i0(mo9019o3(), this.f8581t0, this.f8580s0, 0);
                return true;
            default:
                switch (itemId) {
                    case R.id.generation0 /*{ENCODED_INT: 2131296694}*/:
                        mo8722A3(this.f8581t0, 0);
                        return true;
                    case R.id.generation2 /*{ENCODED_INT: 2131296695}*/:
                        mo8722A3(this.f8581t0, 2);
                        return true;
                    case R.id.generation3 /*{ENCODED_INT: 2131296696}*/:
                        mo8722A3(this.f8581t0, 3);
                        return true;
                    case R.id.generation4 /*{ENCODED_INT: 2131296697}*/:
                        mo8722A3(this.f8581t0, 4);
                        return true;
                    case R.id.generation5 /*{ENCODED_INT: 2131296698}*/:
                        mo8722A3(this.f8581t0, 5);
                        return true;
                    case R.id.generation6 /*{ENCODED_INT: 2131296699}*/:
                        mo8722A3(this.f8581t0, 6);
                        return true;
                    case R.id.generation7 /*{ENCODED_INT: 2131296700}*/:
                        mo8722A3(this.f8581t0, 7);
                        return true;
                    case R.id.generation8 /*{ENCODED_INT: 2131296701}*/:
                        mo8722A3(this.f8581t0, 8);
                        return true;
                    default:
                        switch (itemId) {
                            case R.id.handhelds /*{ENCODED_INT: 2131296756}*/:
                                mo8722A3("handheld", this.f8580s0);
                                return true;
                            case R.id.has_theme_icon /*{ENCODED_INT: 2131296757}*/:
                                C2219c3 c3Var2 = this.f8793Z;
                                c3Var2.mo8153B("has_theme_icon", !c3Var2.mo8180c("has_theme_icon", false));
                                mo8407O2();
                                mo2552c0().invalidateOptionsMenu();
                                return true;
                            default:
                                return super.mo8243H2(menuItem);
                        }
                }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: K2 */
    public void mo8109K2() {
        mo8112Q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: Q */
    public String mo8375Q() {
        return this.f8793Z.mo8193q("systems_list_type", "grid");
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Q2 */
    public void mo8112Q2() {
        C2267e2 e2Var = this.f8958p0;
        if (e2Var == null || !m10591z3(e2Var.mo8321f())) {
            super.mo8112Q2();
        }
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: R */
    public int mo8424R(Cursor cursor) {
        return cursor.getInt(2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        int i;
        super.mo2537W0(bundle);
        if (bundle == null) {
            bundle = mo2568h0();
            this.f8581t0 = bundle.containsKey("type") ? bundle.getString("type") : "all";
            if (!bundle.containsKey("generation")) {
                i = 0;
                this.f8580s0 = i;
            }
        } else {
            this.f8581t0 = bundle.getString("type");
        }
        i = bundle.getInt("generation");
        this.f8580s0 = i;
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: a */
    public String mo8458a(Cursor cursor) {
        return cursor.getString(1);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a1 = super.mo2547a1(layoutInflater, viewGroup, bundle);
        if (!this.f8800g0.f9417u.equals("")) {
            this.f8958p0.mo8337v(new C2460a());
        }
        return a1;
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: b */
    public C2464m mo8310b() {
        C2774t3 t3Var = this.f8800g0;
        return new C2464m(true, t3Var.f9404h, t3Var.f9405i, 6);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: h3 */
    public void mo8431h3(View view, Object obj) {
        Cursor cursor = (Cursor) obj;
        C2749t1.m11663p(this.f8805l0).mo9281q(mo2552c0(), cursor.getString(3), cursor.getString(5), new C2462b());
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: j3 */
    public C2252d2 mo8432j3(Cursor cursor) {
        C2252d2 d2Var;
        MainActivity mainActivity = (MainActivity) mo2552c0();
        if (mainActivity == null || mainActivity.isFinishing()) {
            return null;
        }
        String q = this.f8793Z.mo8193q("systems_sort", "name");
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
            case 110371416:
                if (Q.equals("title")) {
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
                d2Var = new C2252d2(new C2500n3(mainActivity, this.f8800g0, cursor, mo8363E(), mo8468m3(), q, mo9026w()));
                return d2Var;
            case 1:
                new C2491m3(mainActivity, this.f8800g0, cursor, mo8379V(), mo8468m3(), q, mo9026w());
                return d2Var;
            case 2:
                new C2446j3(mainActivity, this.f8800g0, cursor, mo8397z(), mo8468m3(), q, mo9026w());
                return d2Var;
            case 3:
                new C2324g1(mainActivity, this.f8800g0, cursor, mo8468m3(), this);
                return d2Var;
            case 4:
                new C2525o3(mainActivity, this.f8800g0, cursor, mo8395x(), mo8468m3(), q, mo9026w());
                return d2Var;
            case 5:
                new C2454k3(mainActivity, this.f8800g0, cursor, mo8380W(), mo8468m3(), q, mo9026w());
                return d2Var;
            default:
                new C2400i3(mainActivity, this.f8800g0, cursor, mo8468m3(), q, mo9026w());
                return d2Var;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: k3 */
    public Cursor mo8694k3() {
        return this.f8795b0.mo8550J(this.f8793Z.mo8192p(), this.f8581t0, this.f8580s0, this.f8793Z.mo8193q("systems_sort", "name"));
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: l3 */
    public String mo8695l3() {
        return "grid";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: n3 */
    public void mo8425n3(View view, Object obj) {
        if (obj != null && this.f8806m0 != null) {
            this.f8806m0.mo8267V(((Cursor) obj).getString(3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8439p2(android.view.Menu r6) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2459l3.mo8439p2(android.view.Menu):void");
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        mo8118X2(mo2501D0(R.string.systems));
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.systems_menu;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putString("type", this.f8581t0);
        bundle.putInt("generation", this.f8580s0);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "systems";
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: w3 */
    public void mo8723w3(String str, int i) {
        this.f8793Z.mo8202z("systems_list_type", str);
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8276i0(str, this.f8581t0, this.f8580s0, i);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public synchronized void mo8410z2(Intent intent) {
    }
}
