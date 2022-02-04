package com.digdroid.alman.dig;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.C0248l0;
import androidx.constraintlayout.widget.C0333i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.digdroid.alman.dig.ActivityC2719s2;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2841x;
import com.google.android.material.navigation.NavigationView;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import p006b.p007a.p014o.C0788d;

/* renamed from: com.digdroid.alman.dig.p2 */
public abstract class AbstractActivityC2533p2 extends AbstractActivityC2802v3 implements NavigationView.AbstractC3211c, RecognitionListener, C2841x.AbstractC2845d {

    /* renamed from: A0 */
    static boolean f8807A0;

    /* renamed from: B0 */
    static boolean f8808B0;

    /* renamed from: C0 */
    static boolean f8809C0;

    /* renamed from: z0 */
    static DrawerLayout f8810z0;

    /* renamed from: D0 */
    SpeechRecognizer f8811D0 = null;

    /* renamed from: E0 */
    ConstraintLayout f8812E0 = null;

    /* renamed from: F0 */
    boolean f8813F0 = false;

    /* renamed from: G0 */
    boolean f8814G0 = true;

    /* renamed from: H0 */
    boolean f8815H0 = true;

    /* renamed from: I0 */
    boolean f8816I0 = false;

    /* renamed from: J0 */
    HashMap<Integer, Integer> f8817J0;

    /* renamed from: K0 */
    boolean[] f8818K0 = new boolean[33];

    /* renamed from: L0 */
    Handler f8819L0 = null;

    /* renamed from: M0 */
    int f8820M0 = -1;

    /* renamed from: N0 */
    ViewStub f8821N0 = null;

    /* renamed from: O0 */
    int f8822O0;

    /* renamed from: P0 */
    ViewStub f8823P0 = null;

    /* renamed from: Q0 */
    float f8824Q0 = 0.0f;

    /* renamed from: com.digdroid.alman.dig.p2$a */
    class RunnableC2534a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f8825b;

        RunnableC2534a(ArrayList arrayList) {
            this.f8825b = arrayList;
        }

        public void run() {
            AbstractActivityC2533p2.this.mo8926X1(false);
            C2841x.m11836i().mo9420b(AbstractActivityC2533p2.this, (String) this.f8825b.get(0), AbstractActivityC2533p2.this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$b */
    public class C2535b extends DrawerLayout.AbstractC0430g {
        C2535b() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0426d
        /* renamed from: b */
        public void mo2471b(View view) {
            view.requestFocus();
            view.bringToFront();
            view.getParent().requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$c */
    public class DialogInterface$OnClickListenerC2536c implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2536c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractActivityC2533p2.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$d */
    public class RunnableC2537d implements Runnable {
        RunnableC2537d() {
        }

        public void run() {
            AbstractC2531p1 k1 = AbstractActivityC2533p2.this.mo8280k1();
            if (k1 != null) {
                k1.mo8131y2(AbstractActivityC2533p2.this.f8820M0, 0);
                AbstractActivityC2533p2.this.f8819L0.postDelayed(this, 100);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$e */
    public class C2538e implements C0248l0.AbstractC0252d {

        /* renamed from: a */
        final /* synthetic */ AbstractC2531p1 f8830a;

        C2538e(AbstractC2531p1 p1Var) {
            this.f8830a = p1Var;
        }

        @Override // androidx.appcompat.widget.C0248l0.AbstractC0252d
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f8830a.mo8243H2(menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$f */
    public class C2539f implements C2223d0.AbstractC2249s {
        C2539f() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            AbstractC2531p1 k1 = AbstractActivityC2533p2.this.mo8280k1();
            if (k1 != null) {
                k1.mo8116U2();
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$g */
    public class View$OnTouchListenerC2540g implements View.OnTouchListener {
        View$OnTouchListenerC2540g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ConstraintLayout constraintLayout = AbstractActivityC2533p2.this.f8812E0;
            if (constraintLayout == null) {
                return true;
            }
            constraintLayout.setVisibility(8);
            AbstractActivityC2533p2.this.f8812E0 = null;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$h */
    public class C2541h implements C2223d0.AbstractC2249s {

        /* renamed from: com.digdroid.alman.dig.p2$h$a */
        class C2542a implements ActivityC2719s2.AbstractC2723d {
            C2542a() {
            }

            @Override // com.digdroid.alman.dig.ActivityC2719s2.AbstractC2723d
            /* renamed from: a */
            public void mo7921a() {
                AbstractActivityC2533p2.this.mo8922T1();
            }

            @Override // com.digdroid.alman.dig.ActivityC2719s2.AbstractC2723d
            /* renamed from: b */
            public void mo7922b() {
            }
        }

        C2541h() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            AbstractActivityC2533p2.this.mo9194Y0(new C2542a());
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.p2$i */
    class RunnableC2543i implements Runnable {

        /* renamed from: b */
        final /* synthetic */ MenuItem f8836b;

        /* renamed from: com.digdroid.alman.dig.p2$i$a */
        class C2544a implements C2223d0.AbstractC2249s {

            /* renamed from: a */
            final /* synthetic */ AbstractC2577r1 f8838a;

            C2544a(AbstractC2577r1 r1Var) {
                this.f8838a = r1Var;
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                this.f8838a.mo8116U2();
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
            }
        }

        /* renamed from: com.digdroid.alman.dig.p2$i$b */
        class C2545b implements C2223d0.AbstractC2249s {

            /* renamed from: com.digdroid.alman.dig.p2$i$b$a */
            class DialogInterface$OnClickListenerC2546a implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2546a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    AbstractActivityC2533p2.this.f9267w.mo8171T(true);
                    C2185a4.m9691u(AbstractActivityC2533p2.this);
                }
            }

            C2545b() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                DialogInterfaceC0068b.C0069a aVar;
                DialogInterface$OnClickListenerC2546a aVar2 = null;
                if (AbstractActivityC2533p2.this.f9267w.mo8197u()) {
                    AbstractActivityC2533p2 p2Var = AbstractActivityC2533p2.this;
                    if (!p2Var.f8054V) {
                        aVar = new DialogInterfaceC0068b.C0069a(p2Var, C2553q3.m11117c()).mo228h(R.string.kiosk_gamepad);
                        aVar.mo235o(R.string.ok, aVar2).mo221a().show();
                    }
                }
                aVar = new DialogInterfaceC0068b.C0069a(AbstractActivityC2533p2.this, C2553q3.m11117c()).mo228h(R.string.kiosk_confirm).mo232l(R.string.cancel, null);
                aVar2 = new DialogInterface$OnClickListenerC2546a();
                aVar.mo235o(R.string.ok, aVar2).mo221a().show();
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
            }
        }

        RunnableC2543i(MenuItem menuItem) {
            this.f8836b = menuItem;
        }

        public void run() {
            AbstractActivityC2533p2 p2Var;
            String str;
            AbstractC2531p1 k1 = AbstractActivityC2533p2.this.mo8280k1();
            if (k1 != null) {
                int itemId = this.f8836b.getItemId();
                if (itemId != R.id.show_foreground) {
                    switch (itemId) {
                        case R.id.nav_all /*{ENCODED_INT: 2131296947}*/:
                            if (!(k1 instanceof C2186b)) {
                                AbstractActivityC2533p2.this.mo8261L();
                                return;
                            }
                            return;
                        case R.id.nav_announcements /*{ENCODED_INT: 2131296948}*/:
                            AbstractActivityC2533p2.this.mo8285n1();
                            return;
                        case R.id.nav_collections /*{ENCODED_INT: 2131296949}*/:
                            AbstractActivityC2533p2.this.mo8271d0();
                            return;
                        case R.id.nav_developer /*{ENCODED_INT: 2131296950}*/:
                            if (k1 instanceof C2404j0) {
                                p2Var = AbstractActivityC2533p2.this;
                                str = ((C2404j0) k1).mo8628h3();
                                break;
                            } else {
                                return;
                            }
                        case R.id.nav_digger /*{ENCODED_INT: 2131296951}*/:
                            AbstractActivityC2533p2.this.mo8919Q1();
                            return;
                        case R.id.nav_faq /*{ENCODED_INT: 2131296952}*/:
                            AbstractActivityC2533p2.this.mo8921S1();
                            return;
                        case R.id.nav_faves /*{ENCODED_INT: 2131296953}*/:
                            if (!(k1 instanceof C2214c0)) {
                                AbstractActivityC2533p2.this.mo8297u();
                                return;
                            }
                            return;
                        case R.id.nav_forum /*{ENCODED_INT: 2131296954}*/:
                            AbstractActivityC2533p2.this.mo8304z("https://digdroid.com/forums/categories/dig-general-discussions");
                            return;
                        case R.id.nav_game_forum /*{ENCODED_INT: 2131296955}*/:
                            if (k1 instanceof C2404j0) {
                                AbstractActivityC2533p2.this.mo8286o0(((C2404j0) k1).mo8629i3());
                                return;
                            }
                            return;
                        case R.id.nav_genres /*{ENCODED_INT: 2131296956}*/:
                            if (!(k1 instanceof C2452k1)) {
                                AbstractActivityC2533p2.this.mo8274h0();
                                return;
                            }
                            return;
                        case R.id.nav_home /*{ENCODED_INT: 2131296957}*/:
                            if (!(k1 instanceof C2712s1)) {
                                AbstractActivityC2533p2.this.f8056X.setCurrentItem(0);
                                return;
                            }
                            return;
                        case R.id.nav_kiosk /*{ENCODED_INT: 2131296958}*/:
                            if (AbstractActivityC2533p2.this.f9267w.mo8196t()) {
                                AbstractActivityC2533p2.this.f9267w.mo8171T(false);
                                break;
                            } else {
                                C2223d0.m9876p().mo8215r(AbstractActivityC2533p2.this, 19, new C2545b());
                                return;
                            }
                        case R.id.nav_options /*{ENCODED_INT: 2131296959}*/:
                            if (!(k1 instanceof C2588r2) && !AbstractActivityC2533p2.this.f9267w.mo8196t()) {
                                AbstractActivityC2533p2.this.mo8258F();
                                return;
                            }
                            return;
                        case R.id.nav_played /*{ENCODED_INT: 2131296960}*/:
                            if (!(k1 instanceof C2773t2)) {
                                AbstractActivityC2533p2.this.mo8270b0();
                                return;
                            }
                            return;
                        case R.id.nav_publisher /*{ENCODED_INT: 2131296961}*/:
                            if (k1 instanceof C2404j0) {
                                p2Var = AbstractActivityC2533p2.this;
                                str = ((C2404j0) k1).mo8632l3();
                                break;
                            } else {
                                return;
                            }
                        case R.id.nav_quit /*{ENCODED_INT: 2131296962}*/:
                            AbstractActivityC2533p2.this.mo8925W1();
                            return;
                        case R.id.nav_random /*{ENCODED_INT: 2131296963}*/:
                            if (k1 instanceof AbstractC2577r1) {
                                C2223d0.m9876p().mo8215r(AbstractActivityC2533p2.this, 17, new C2544a((AbstractC2577r1) k1));
                                return;
                            }
                            return;
                        case R.id.nav_search /*{ENCODED_INT: 2131296964}*/:
                            if (k1 instanceof C2728t0) {
                                ((C2728t0) k1).mo9245G3();
                                return;
                            }
                            return;
                        case R.id.nav_sort /*{ENCODED_INT: 2131296965}*/:
                            if (k1 instanceof C2728t0) {
                                ((C2728t0) k1).mo8121c3();
                                return;
                            }
                            return;
                        case R.id.nav_system /*{ENCODED_INT: 2131296966}*/:
                            if (k1 instanceof C2404j0) {
                                AbstractActivityC2533p2.this.mo8267V(((C2404j0) k1).mo8634n3());
                                return;
                            }
                            return;
                        case R.id.nav_system_forum /*{ENCODED_INT: 2131296967}*/:
                            if (k1 instanceof C2329g3) {
                                AbstractActivityC2533p2.this.mo8296t1(((C2329g3) k1).mo8465K3());
                                return;
                            }
                            return;
                        case R.id.nav_systems /*{ENCODED_INT: 2131296968}*/:
                            if (!(k1 instanceof C2459l3)) {
                                AbstractActivityC2533p2.this.mo8288p();
                                return;
                            }
                            return;
                        case R.id.nav_toolbar /*{ENCODED_INT: 2131296969}*/:
                            AbstractActivityC2533p2.this.mo9372x1();
                            return;
                        default:
                            switch (itemId) {
                                case R.id.nav_year /*{ENCODED_INT: 2131296971}*/:
                                    if (k1 instanceof C2404j0) {
                                        AbstractActivityC2533p2.this.mo8295s1(((C2404j0) k1).mo8633m3());
                                        return;
                                    }
                                    return;
                                case R.id.nav_youtube /*{ENCODED_INT: 2131296972}*/:
                                    if (k1 instanceof C2404j0) {
                                        C2404j0 j0Var = (C2404j0) k1;
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("https://www.youtube.com/results?search_query=");
                                            sb.append(URLEncoder.encode(j0Var.mo8635o3() + " " + AbstractActivityC2533p2.this.f9269y.mo8568s(j0Var.mo8634n3()), "utf-8"));
                                            String sb2 = sb.toString();
                                            Intent intent = new Intent();
                                            intent.setData(Uri.parse(sb2));
                                            intent.setAction("android.intent.action.VIEW");
                                            AbstractActivityC2533p2.this.startActivity(intent);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                default:
                                    return;
                            }
                    }
                    p2Var.mo8289p1(str);
                    return;
                }
                C2219c3 c3Var = AbstractActivityC2533p2.this.f9267w;
                c3Var.mo8153B("show_foreground", true ^ c3Var.mo8180c("show_foreground", true));
                C2185a4.m9691u(AbstractActivityC2533p2.this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p2$j */
    public class View$OnClickListenerC2547j implements View.OnClickListener {
        View$OnClickListenerC2547j() {
        }

        public void onClick(View view) {
            AbstractActivityC2533p2 p2Var = AbstractActivityC2533p2.this;
            if (p2Var.f8813F0) {
                p2Var.f8811D0.cancel();
            }
            AbstractActivityC2533p2.this.mo8926X1(false);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: E1 */
    public boolean mo8913E1() {
        return this.f8815H0;
    }

    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: G1 */
    public void mo8914G1(boolean z) {
        this.f8815H0 = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public void mo8915M1() {
        for (int i = 0; i < 33; i++) {
            this.f8818K0[i] = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public boolean mo8916N1(int i, int i2) {
        boolean[] zArr = this.f8818K0;
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        boolean z = i2 == 1;
        boolean z2 = !zArr[i];
        if (z && z2) {
            return true;
        }
        if (i2 == 1) {
            zArr[i] = false;
        } else if (i2 == 0) {
            zArr[i] = true;
        }
        if (z && mo8945z1(i)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (this.f8052T) {
            if (z) {
                this.f8052T = false;
            }
            return false;
        } else if (this.f8053U) {
            if (z) {
                mo8259H(false);
            }
            return false;
        } else {
            if (z && !mo8917O1()) {
                mo8925W1();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo8917O1() {
        SpeechRecognizer speechRecognizer;
        ConstraintLayout constraintLayout = this.f8812E0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            this.f8812E0 = null;
            return true;
        } else if (this.f8813F0 && (speechRecognizer = this.f8811D0) != null) {
            speechRecognizer.cancel();
            mo8926X1(false);
            return true;
        } else if (f8810z0.mo2402A(8388611)) {
            f8810z0.mo2427f();
            return true;
        } else if (this.f8053U) {
            mo8259H(false);
            return true;
        } else if (mo8918P1()) {
            return false;
        } else {
            AbstractC2531p1 k1 = mo8280k1();
            if (k1 != null && k1.mo8130x2()) {
                return true;
            }
            int currentItem = this.f8056X.getCurrentItem();
            if (currentItem >= (this.f9267w.mo8185h() ? 2 : 1)) {
                this.f8056X.mo6072K(currentItem - 1, true);
                return true;
            }
            mo8925W1();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public boolean mo8918P1() {
        return MyEditText.m9538b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public void mo8919Q1() {
        if (!SpeechRecognizer.isRecognitionAvailable(this)) {
            return;
        }
        if (this.f8813F0) {
            this.f8811D0.cancel();
            mo8926X1(false);
            return;
        }
        C2223d0.m9876p().mo8215r(this, 0, new C2541h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public abstract void mo8920R1();

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public void mo8921S1() {
        String q = this.f9267w.mo8193q("language", "device");
        if (q.equals("device")) {
            q = Locale.getDefault().getLanguage();
        }
        int i = 0;
        String[] strArr = {"en", "fr", "es", "pt", "it", "de", "ru", "ja", "ko", "ar"};
        String str = "https://digdroid.com/faq";
        while (true) {
            if (i >= 10) {
                break;
            } else if (!strArr[i].equals(q)) {
                i++;
            } else if (!q.equals("en")) {
                str = str + "-" + q;
            }
        }
        mo8304z(str);
    }

    /* renamed from: T1 */
    public void mo8922T1() {
        if (!isFinishing()) {
            if (this.f8811D0 == null) {
                SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
                this.f8811D0 = createSpeechRecognizer;
                createSpeechRecognizer.setRecognitionListener(this);
            }
            if (this.f8813F0) {
                this.f8811D0.cancel();
                mo8926X1(false);
                return;
            }
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("calling_package", getPackageName());
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            try {
                this.f8811D0.startListening(intent);
            } catch (Exception unused) {
                new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo228h(R.string.speech_start_error).mo235o(R.string.ok, null).mo224d(false).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public abstract void mo8923U1();

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public abstract void mo8924V1();

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public void mo8925W1() {
        if (!this.f9267w.mo8180c("confirm_quit", true)) {
            finish();
        } else {
            new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo228h(R.string.confirm_exit).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2536c()).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public void mo8926X1(boolean z) {
        View view;
        if (!z || !this.f8813F0) {
            this.f8813F0 = z;
            if (z || this.f8823P0 != null) {
                if (this.f8823P0 == null) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.stub_digger);
                    this.f8823P0 = viewStub;
                    view = viewStub.inflate();
                } else {
                    view = findViewById(R.id.voice_capture);
                }
                view.setVisibility(z ? 0 : 8);
                if (z) {
                    TextView textView = (TextView) findViewById(R.id.voice_result);
                    textView.setText(R.string.digger_hint);
                    if (!this.f8816I0) {
                        textView.setOnClickListener(new View$OnClickListenerC2547j());
                        this.f8816I0 = true;
                    }
                    this.f8822O0 = C2185a4.m9675e(this, 400.0f);
                    Point point = new Point();
                    getWindowManager().getDefaultDisplay().getSize(point);
                    double d = (double) point.x;
                    Double.isNaN(d);
                    double d2 = d * 0.9d;
                    if (((double) this.f8822O0) > d2) {
                        this.f8822O0 = (int) Math.round(d2);
                    }
                    textView.setLayoutParams(new LinearLayout.LayoutParams(this.f8822O0, -2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public boolean mo8927Y1(float f, float f2) {
        this.f8815H0 = false;
        if (f8807A0 && !this.f8052T && !this.f8053U && !f8810z0.mo2402A(8388611)) {
            if (this.f8812E0 != null) {
                return true;
            }
            int i = Float.compare(f, -1.0f) == 0 ? 10 : Float.compare(f, 1.0f) == 0 ? 11 : Float.compare(f2, -1.0f) == 0 ? 8 : Float.compare(f2, 1.0f) == 0 ? 9 : 12;
            if (i == this.f8820M0) {
                return false;
            }
            this.f8820M0 = i;
            Handler handler = this.f8819L0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            if (this.f8820M0 < 0) {
                return true;
            }
            AbstractC2531p1 k1 = mo8280k1();
            if (k1 != null && k1.mo8131y2(this.f8820M0, 0)) {
                if (this.f8820M0 == 12) {
                    return true;
                }
                if (this.f8819L0 == null) {
                    this.f8819L0 = new Handler();
                }
                this.f8819L0.postDelayed(new RunnableC2537d(), 500);
                return true;
            }
        }
        return false;
    }

    @Override // com.digdroid.alman.dig.C2841x.AbstractC2845d
    /* renamed from: c0 */
    public void mo8928c0(String str) {
        AbstractC2531p1 k1 = mo8280k1();
        if (k1 != null && (k1 instanceof C2728t0)) {
            ((C2728t0) k1).mo9246I3(str);
        }
    }

    @Override // com.digdroid.alman.dig.C2841x.AbstractC2845d
    /* renamed from: d */
    public void mo8929d(C2369h0 h0Var) {
        AbstractC2531p1 k1 = mo8280k1();
        if (k1 != null) {
            k1.mo8115T2(h0Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.AbstractActivityC2533p2.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.app.ActivityC0361e, androidx.appcompat.app.ActivityC0070c
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.f8815H0 = false;
        this.f8814G0 = false;
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 4 || keyCode == 97;
        if (z && mo8918P1()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!f8807A0 || this.f8052T || this.f8053U || f8810z0.mo2402A(8388611)) {
            if (this.f8052T && z && keyEvent.getAction() == 1) {
                this.f8052T = false;
            }
            return super.dispatchKeyEvent(keyEvent);
        } else if (this.f8812E0 != null) {
            if (z) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        } else if (!this.f8817J0.containsKey(Integer.valueOf(keyCode))) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            int intValue = this.f8817J0.get(Integer.valueOf(keyCode)).intValue();
            if (intValue == 8 || intValue == 9 || intValue == 10 || intValue == 11 || intValue == 12 || (keyEvent.getSource() & 1025) == 1025) {
                AbstractC2531p1 k1 = mo8280k1();
                if (k1 != null && k1.mo8131y2(intValue, keyEvent.getAction())) {
                    return true;
                }
                if (keyEvent.getRepeatCount() != 0 || !mo8916N1(intValue, keyEvent.getAction())) {
                    switch (intValue) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            this.f8815H0 = true;
                            break;
                    }
                } else {
                    return true;
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f8814G0 = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.navigation.NavigationView.AbstractC3211c
    /* renamed from: f */
    public boolean mo8932f(MenuItem menuItem) {
        f8810z0.mo2427f();
        new Handler().postDelayed(new RunnableC2543i(menuItem), 500);
        return true;
    }

    @Override // com.digdroid.alman.dig.C2841x.AbstractC2845d
    /* renamed from: f0 */
    public void mo8933f0(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1904065662:
                if (str.equals("all games")) {
                    c = 0;
                    break;
                }
                break;
            case -1785238953:
                if (str.equals("favorites")) {
                    c = 1;
                    break;
                }
                break;
            case -1737370588:
                if (str.equals("systems")) {
                    c = 2;
                    break;
                }
                break;
            case -1264961740:
                if (str.equals("played games")) {
                    c = 3;
                    break;
                }
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = 4;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c = 5;
                    break;
                }
                break;
            case -1211494720:
                if (str.equals("frequently asked questions")) {
                    c = 6;
                    break;
                }
                break;
            case 101142:
                if (str.equals("faq")) {
                    c = 7;
                    break;
                }
                break;
            case 3198785:
                if (str.equals("help")) {
                    c = '\b';
                    break;
                }
                break;
            case 3208415:
                if (str.equals("home")) {
                    c = '\t';
                    break;
                }
                break;
            case 479316019:
                if (str.equals("edit theme")) {
                    c = '\n';
                    break;
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo8261L();
                return;
            case 1:
                mo8297u();
                return;
            case 2:
                mo8288p();
                return;
            case 3:
                mo8270b0();
                return;
            case 4:
                mo8274h0();
                return;
            case 5:
            case 11:
                if (!this.f9267w.mo8196t()) {
                    mo8258F();
                    return;
                }
                return;
            case 6:
            case 7:
            case '\b':
                mo8921S1();
                return;
            case '\t':
                this.f8056X.setCurrentItem(0);
                return;
            case '\n':
                String str2 = C2553q3.f8891a.f9406j;
                if (Pattern.compile(".*custom(\\d)+\\.cfg").matcher(str2).find()) {
                    mo8303x(str2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.digdroid.alman.dig.C2841x.AbstractC2845d
    public C2369h0 getFilter() {
        AbstractC2531p1 k1 = mo8280k1();
        return (k1 == null || !(k1 instanceof C2728t0)) ? new C2369h0() : ((C2728t0) k1).mo9243C3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: l */
    public boolean mo8908l() {
        return this.f8814G0;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: o */
    public HashMap<Integer, Integer> mo8909o() {
        return this.f8817J0;
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (!f8807A0 || !mo8917O1()) {
            super.onBackPressed();
        }
    }

    public void onBeginningOfSpeech() {
    }

    public void onBufferReceived(byte[] bArr) {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2800v1, com.digdroid.alman.dig.AbstractActivityC2802v3, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0064a L0 = mo243L0();
        L0.mo204s(false);
        L0.mo205t(C2553q3.f8891a.mo9322f());
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        f8810z0 = drawerLayout;
        drawerLayout.setDrawerListener(new C2535b());
        this.f9267w = C2219c3.m9805k(this);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        C2553q3.m11134t(this, navigationView);
        mo8915M1();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        this.f8817J0 = hashMap;
        hashMap.put(19, 8);
        this.f8817J0.put(20, 9);
        this.f8817J0.put(21, 10);
        this.f8817J0.put(22, 11);
        this.f8817J0.put(23, 12);
        this.f8817J0.put(96, 0);
        this.f8817J0.put(97, 1);
        this.f8817J0.put(99, Integer.valueOf(this.f9267w.mo8188l("button_x_bind", 3)));
        this.f8817J0.put(100, Integer.valueOf(this.f9267w.mo8188l("button_y_bind", 2)));
        this.f8817J0.put(Integer.valueOf((int) C0333i.f1694U0), Integer.valueOf(this.f9267w.mo8188l("button_l1_bind", 4)));
        this.f8817J0.put(Integer.valueOf((int) C0333i.f1700V0), Integer.valueOf(this.f9267w.mo8188l("button_r1_bind", 5)));
        this.f8817J0.put(Integer.valueOf((int) C0333i.f1706W0), Integer.valueOf(this.f9267w.mo8188l("button_l2_bind", 14)));
        this.f8817J0.put(105, Integer.valueOf(this.f9267w.mo8188l("button_r2_bind", 13)));
        this.f8817J0.put(Integer.valueOf((int) C0333i.f1712X0), Integer.valueOf(this.f9267w.mo8188l("button_lthumb_bind", 21)));
        this.f8817J0.put(Integer.valueOf((int) C0333i.f1718Y0), Integer.valueOf(this.f9267w.mo8188l("button_rthumb_bind", 17)));
        this.f8817J0.put(57, Integer.valueOf(this.f9267w.mo8188l("button_lt_bind", 6)));
        this.f8817J0.put(58, Integer.valueOf(this.f9267w.mo8188l("button_rt_bind", 6)));
        this.f8817J0.put(Integer.valueOf((int) C0333i.f1724Z0), Integer.valueOf(this.f9267w.mo8188l("button_start_bind", 7)));
        this.f8817J0.put(4, Integer.valueOf(this.f9267w.mo8188l("button_select_bind", 16)));
        this.f8817J0.put(109, Integer.valueOf(this.f9267w.mo8188l("button_select_bind", 16)));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.appcompat.app.ActivityC0070c
    public void onDestroy() {
        super.onDestroy();
        SpeechRecognizer speechRecognizer = this.f8811D0;
        if (speechRecognizer != null) {
            try {
                speechRecognizer.destroy();
            } catch (Exception unused) {
            }
        }
    }

    public void onEndOfSpeech() {
    }

    public void onError(int i) {
        mo8926X1(false);
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
        ((TextView) findViewById(R.id.voice_result)).setText(bundle.getStringArrayList("results_recognition").get(0));
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2802v3, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onPause() {
        super.onPause();
        f8807A0 = false;
        Handler handler = this.f8819L0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void onReadyForSpeech(Bundle bundle) {
        this.f8824Q0 = 0.0f;
        mo8926X1(true);
    }

    public void onResults(Bundle bundle) {
        TextView textView;
        if (bundle != null && !isFinishing() && (textView = (TextView) findViewById(R.id.voice_result)) != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            textView.setText(stringArrayList.get(0));
            new Handler().postDelayed(new RunnableC2534a(stringArrayList), 500);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2802v3
    public void onResume() {
        super.onResume();
        Menu B = mo8254B();
        B.findItem(R.id.nav_kiosk).setTitle(this.f9267w.mo8196t() ? R.string.exit_kiosk : R.string.kiosk);
        B.findItem(R.id.show_foreground).setTitle(this.f9267w.mo8180c("show_foreground", true) ? R.string.hide_foreground : R.string.show_foreground);
        mo8915M1();
        f8807A0 = true;
    }

    public void onRmsChanged(float f) {
        if (f > this.f8824Q0) {
            this.f8824Q0 = f;
        }
        if (this.f8824Q0 > 0.0f) {
            mo8926X1(true);
            ((LinearLayout) findViewById(R.id.rms_meter)).setLayoutParams(new LinearLayout.LayoutParams(Math.round((((float) this.f8822O0) * f) / this.f8824Q0), C2185a4.m9675e(this, 5.0f)));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f8814G0 = true;
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: y */
    public boolean mo8912y() {
        return this.f8812E0 == null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: z1 */
    public boolean mo8945z1(int i) {
        View view;
        if (i == 2) {
            int currentItem = this.f8056X.getCurrentItem();
            if (currentItem < this.f8055W.mo6058c()) {
                this.f8056X.mo6072K(currentItem + 1, true);
            }
            return true;
        } else if (i == 3) {
            mo8919Q1();
            return true;
        } else if (i == 4) {
            if (f8810z0.mo2402A(8388611)) {
                f8810z0.mo2427f();
            } else {
                this.f8054V = true;
                f8810z0.mo2407H(8388611);
            }
            return true;
        } else if (i == 5) {
            if (!this.f9267w.f7955j.equals("default")) {
                AbstractC2531p1 k1 = mo8280k1();
                if (k1 != null && k1.mo8248r2() >= 0) {
                    C0248l0 l0Var = new C0248l0(new C0788d(this, (int) R.style.AppThemeLight), mo8904I(), 8388613);
                    Menu a = l0Var.mo1570a();
                    l0Var.mo1571b().inflate(k1.mo8248r2(), a);
                    k1.mo8439p2(a);
                    l0Var.mo1572c(new C2538e(k1));
                    l0Var.mo1573d();
                }
            } else if (this.f9504r0.mo1189A()) {
                this.f9504r0.mo1279w();
            } else {
                this.f9504r0.mo1196O();
            }
            return true;
        } else if (i != 6) {
            switch (i) {
                case 13:
                    AbstractC2531p1 k12 = mo8280k1();
                    if (k12 != null) {
                        k12.mo8104E2(true);
                    }
                    return true;
                case 14:
                    AbstractC2531p1 k13 = mo8280k1();
                    if (k13 != null) {
                        k13.mo8104E2(false);
                    }
                    return true;
                case 15:
                    AbstractC2531p1 k14 = mo8280k1();
                    if (k14 != null) {
                        k14.mo8121c3();
                    }
                    return true;
                case 16:
                    this.f8056X.setCurrentItem(0);
                    return true;
                case 17:
                    mo8288p();
                    return true;
                case 18:
                    mo8274h0();
                    return true;
                case 19:
                    mo8297u();
                    return true;
                case 20:
                    mo8261L();
                    return true;
                case 21:
                    if (!this.f9267w.mo8196t()) {
                        mo8258F();
                    }
                    return true;
                case 22:
                    mo8921S1();
                    return true;
                case 23:
                    mo8270b0();
                    return true;
                case 24:
                    AbstractC2531p1 k15 = mo8280k1();
                    if (k15 != null) {
                        k15.mo8125q2();
                    }
                    return true;
                case 25:
                    C2223d0.m9876p().mo8215r(this, 17, new C2539f());
                    return true;
                case 26:
                    AbstractC2531p1 k16 = mo8280k1();
                    if (k16 != null) {
                        if (this.f8821N0 == null) {
                            ViewStub viewStub = (ViewStub) findViewById(R.id.stub_info);
                            this.f8821N0 = viewStub;
                            view = viewStub.inflate();
                        } else {
                            view = findViewById(R.id.info_container);
                        }
                        this.f8812E0 = (ConstraintLayout) view;
                        this.f8812E0.setOnTouchListener(new View$OnTouchListenerC2540g());
                        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.info_box);
                        linearLayout.setBackgroundColor(-668851678);
                        TextView textView = (TextView) linearLayout.findViewById(R.id.into_title);
                        textView.setTextColor(-1);
                        textView.setText(k16.mo8126s2());
                        this.f8812E0.setVisibility(0);
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 29:
                            mo8923U1();
                            mo8911v(null);
                            break;
                        case 30:
                            mo8924V1();
                            mo8911v(null);
                            break;
                        case 31:
                            mo8920R1();
                            break;
                        case 32:
                            AbstractC2531p1 k17 = mo8280k1();
                            if (k17 != null) {
                                k17.mo8123e3();
                            }
                            return true;
                    }
            }
            return false;
        } else {
            AbstractC2531p1 k18 = mo8280k1();
            if (k18 != null) {
                k18.mo8110N2();
            }
            return true;
        }
    }
}
