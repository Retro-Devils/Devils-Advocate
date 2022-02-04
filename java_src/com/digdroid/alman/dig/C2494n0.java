package com.digdroid.alman.dig;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.constraintlayout.widget.C0333i;
import java.util.HashMap;

/* renamed from: com.digdroid.alman.dig.n0 */
public class C2494n0 extends AbstractC2531p1 {

    /* renamed from: n0 */
    static final int[] f8652n0 = {R.string.select, R.string.back, R.string.voice_search, R.string.forward, R.string.main_menu, R.string.page_menu, R.string.page_info, R.string.sort_menu, R.string.next_letter, R.string.prev_letter, R.string.page_top, R.string.launch_game, R.string.preview_pane, R.string.change_view, R.string.home, R.string.systems, R.string.genres, R.string.favorites, R.string.played_games, R.string.all_games, R.string.options, R.string.select_random, R.string.faq};

    /* renamed from: o0 */
    static final int[] f8653o0 = {0, 1, 3, 2, 4, 5, 26, 15, 13, 14, 24, 6, 32, 7, 16, 17, 18, 19, 23, 20, 21, 25, 22};

    /* renamed from: p0 */
    HashMap<Integer, Integer> f8654p0;

    /* renamed from: q0 */
    HashMap<Integer, Integer> f8655q0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.n0$a */
    public class View$OnClickListenerC2495a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8656b;

        /* renamed from: c */
        final /* synthetic */ TextView f8657c;

        /* renamed from: d */
        final /* synthetic */ int f8658d;

        /* renamed from: e */
        final /* synthetic */ String f8659e;

        /* renamed from: com.digdroid.alman.dig.n0$a$a */
        class DialogInterface$OnClickListenerC2496a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int[] f8661b;

            DialogInterface$OnClickListenerC2496a(int[] iArr) {
                this.f8661b = iArr;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                int i2 = this.f8661b[i];
                View$OnClickListenerC2495a aVar = View$OnClickListenerC2495a.this;
                C2494n0.this.mo8785h3(aVar.f8657c, aVar.f8656b, i2);
                View$OnClickListenerC2495a aVar2 = View$OnClickListenerC2495a.this;
                C2494n0.this.f8654p0.put(Integer.valueOf(aVar2.f8658d), Integer.valueOf(i2));
                View$OnClickListenerC2495a aVar3 = View$OnClickListenerC2495a.this;
                C2494n0.this.f8801Z.mo8156E(aVar3.f8659e, i2);
                View$OnClickListenerC2495a aVar4 = View$OnClickListenerC2495a.this;
                if (aVar4.f8658d == 109) {
                    C2494n0.this.f8654p0.put(4, Integer.valueOf(i2));
                }
            }
        }

        View$OnClickListenerC2495a(String str, TextView textView, int i, String str2) {
            this.f8656b = str;
            this.f8657c = textView;
            this.f8658d = i;
            this.f8659e = str2;
        }

        public void onClick(View view) {
            int[] iArr = C2494n0.f8652n0;
            CharSequence[] charSequenceArr = new CharSequence[(iArr.length - 1)];
            int[] iArr2 = new int[(iArr.length - 1)];
            charSequenceArr[0] = C2494n0.this.mo2552c0().getString(R.string.unbind);
            iArr2[0] = -1;
            int i = 2;
            while (true) {
                int[] iArr3 = C2494n0.f8652n0;
                if (i < iArr3.length) {
                    int i2 = i - 1;
                    charSequenceArr[i2] = C2494n0.this.mo2552c0().getString(iArr3[i]);
                    iArr2[i2] = C2494n0.f8653o0[i];
                    i++;
                } else {
                    new DialogInterfaceC0068b.C0069a(C2494n0.this.mo2552c0(), C2553q3.m11117c()).mo239s(this.f8656b).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2496a(iArr2)).mo221a().show();
                    return;
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.n0$b */
    class RunnableC2497b implements Runnable {
        RunnableC2497b() {
        }

        public void run() {
            float width = ((float) ((ImageView) C2494n0.this.mo2505F0().findViewById(R.id.gamepad_image)).getWidth()) / 40.0f;
            C2494n0.this.mo8784g3(R.id.button_a, width, "A", 96, "button_a_bind");
            C2494n0.this.mo8784g3(R.id.button_b, width, "B", 97, "button_b_bind");
            C2494n0.this.mo8784g3(R.id.button_x, width, "X", 99, "button_x_bind");
            C2494n0.this.mo8784g3(R.id.button_y, width, "Y", 100, "button_y_bind");
            C2494n0.this.mo8784g3(R.id.button_r1, width, "R1", C0333i.f1700V0, "button_r1_bind");
            C2494n0.this.mo8784g3(R.id.button_r2, width, "R2", 105, "button_r2_bind");
            C2494n0.this.mo8784g3(R.id.button_rt, width, "RTR", 58, "button_rt_bind");
            C2494n0.this.mo8784g3(R.id.button_start, width, "Start", C0333i.f1724Z0, "button_start_bind");
            C2494n0.this.mo8784g3(R.id.button_select, width, "Select", 109, "button_select_bind");
            C2494n0.this.mo8784g3(R.id.button_l1, width, "L1", C0333i.f1694U0, "button_l1_bind");
            C2494n0.this.mo8784g3(R.id.button_l2, width, "L2", C0333i.f1706W0, "button_l2_bind");
            C2494n0.this.mo8784g3(R.id.button_lt, width, "LTR", 57, "button_lt_bind");
            C2494n0.this.mo8784g3(R.id.button_lthumb, width, "LTH", C0333i.f1712X0, "button_lthumb_bind");
            C2494n0.this.mo8784g3(R.id.button_rthumb, width, "RTH", C0333i.f1718Y0, "button_rthumb_bind");
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: B2 */
    public /* bridge */ /* synthetic */ boolean mo8102B2() {
        return super.mo8102B2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: C2 */
    public /* bridge */ /* synthetic */ boolean mo8103C2() {
        return super.mo8103C2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: E2 */
    public /* bridge */ /* synthetic */ void mo8104E2(boolean z) {
        super.mo8104E2(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: F2 */
    public /* bridge */ /* synthetic */ void mo8105F2() {
        super.mo8105F2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: G2 */
    public /* bridge */ /* synthetic */ void mo8106G2(boolean z) {
        super.mo8106G2(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: I2 */
    public /* bridge */ /* synthetic */ void mo8107I2(String str) {
        super.mo8107I2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: J2 */
    public /* bridge */ /* synthetic */ void mo8108J2(String str) {
        super.mo8108J2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: K2 */
    public /* bridge */ /* synthetic */ void mo8109K2() {
        super.mo8109K2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: N2 */
    public /* bridge */ /* synthetic */ boolean mo8110N2() {
        return super.mo8110N2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public void mo8407O2() {
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: P2 */
    public /* bridge */ /* synthetic */ void mo8111P2() {
        super.mo8111P2();
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

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: S2 */
    public /* bridge */ /* synthetic */ void mo8114S2() {
        super.mo8114S2();
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

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: U2 */
    public /* bridge */ /* synthetic */ void mo8116U2() {
        super.mo8116U2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public /* bridge */ /* synthetic */ void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: W2 */
    public /* bridge */ /* synthetic */ void mo8117W2() {
        super.mo8117W2();
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_gamepad, viewGroup, false);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: a3 */
    public /* bridge */ /* synthetic */ void mo8120a3(boolean z) {
        super.mo8120a3(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: c3 */
    public /* bridge */ /* synthetic */ void mo8121c3() {
        super.mo8121c3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: d3 */
    public /* bridge */ /* synthetic */ boolean mo8122d3() {
        return super.mo8122d3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: e3 */
    public /* bridge */ /* synthetic */ void mo8123e3() {
        super.mo8123e3();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g3 */
    public void mo8784g3(int i, float f, String str, int i2, String str2) {
        TextView textView = (TextView) mo2505F0().findViewById(i);
        textView.setTextColor(this.f8808g0.f9409e);
        C2553q3.m11131q(textView);
        textView.setTextSize(0, f);
        mo8785h3(textView, str, this.f8654p0.get(Integer.valueOf(i2)).intValue());
        if (i2 != 96 && i2 != 97) {
            textView.setOnClickListener(new View$OnClickListenerC2495a(str, textView, i2, str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h3 */
    public void mo8785h3(TextView textView, String str, int i) {
        String str2;
        String str3 = str + ": ";
        if (i < 0) {
            str2 = str3 + "-";
        } else {
            str2 = str3 + mo2552c0().getString(this.f8655q0.get(Integer.valueOf(i)).intValue());
        }
        textView.setText(str2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public /* bridge */ /* synthetic */ boolean mo2579k1(MenuItem menuItem) {
        return super.mo2579k1(menuItem);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public /* bridge */ /* synthetic */ void mo2585m1() {
        super.mo2585m1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: q2 */
    public /* bridge */ /* synthetic */ void mo8125q2() {
        super.mo8125q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        this.f8654p0 = this.f8814m0.mo8909o();
        this.f8655q0 = new HashMap<>();
        int i = 0;
        while (true) {
            int[] iArr = f8652n0;
            if (i < iArr.length) {
                this.f8655q0.put(Integer.valueOf(f8653o0[i]), Integer.valueOf(iArr[i]));
                i++;
            } else {
                mo2505F0().post(new RunnableC2497b());
                return;
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ String mo8126s2() {
        return super.mo8126s2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public /* bridge */ /* synthetic */ void mo2605t1() {
        super.mo2605t1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "gamepad";
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: u2 */
    public /* bridge */ /* synthetic */ long mo8128u2() {
        return super.mo8128u2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: v2 */
    public /* bridge */ /* synthetic */ C2774t3 mo8129v2() {
        return super.mo8129v2();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: w2 */
    public String mo8409w2() {
        C2219c3 c3Var = this.f8801Z;
        return c3Var.mo8193q(mo8127t2() + "_toolbar", "none");
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: x2 */
    public /* bridge */ /* synthetic */ boolean mo8130x2() {
        return super.mo8130x2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: y2 */
    public /* bridge */ /* synthetic */ boolean mo8131y2(int i, int i2) {
        return super.mo8131y2(i, i2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
    }
}
