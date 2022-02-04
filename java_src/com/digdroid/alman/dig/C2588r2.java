package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.C0333i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2181a3;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2318g;
import com.digdroid.alman.dig.C2372h2;
import com.digdroid.alman.dig.C2391i;
import com.digdroid.alman.dig.C2553q3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p006b.p060q.C1151o;

/* renamed from: com.digdroid.alman.dig.r2 */
public class C2588r2 extends AbstractC2531p1 {

    /* renamed from: n0 */
    static final String[] f8983n0 = {"en", "fr", "es", "pt", "it", "de", "ru", "ja", "ko", "ar"};

    /* renamed from: o0 */
    boolean f8984o0;

    /* renamed from: p0 */
    File[] f8985p0;

    /* renamed from: q0 */
    ArrayList<C2724s3> f8986q0;

    /* renamed from: r0 */
    DialogInterfaceC0068b f8987r0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$a */
    public class C2589a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f8988b;

        /* renamed from: c */
        final /* synthetic */ Activity f8989c;

        /* renamed from: d */
        final /* synthetic */ TextView f8990d;

        /* renamed from: com.digdroid.alman.dig.r2$a$a */
        class C2590a implements C2391i.AbstractC2394b {
            C2590a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2589a.this.m11344b(0, strArr[0]);
            }
        }

        C2589a(Spinner spinner, Activity activity, TextView textView) {
            this.f8988b = spinner;
            this.f8989c = activity;
            this.f8990d = textView;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private void m11344b(int i, String str) {
            C2185a4.m9695y(this.f8989c, i, str);
            this.f8990d.setText(C2185a4.m9678h(this.f8989c));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                Integer num = (Integer) this.f8988b.getTag();
                if (i == 1) {
                    if (Build.VERSION.SDK_INT < 30) {
                        C2391i iVar = new C2391i(c0);
                        iVar.mo8592h(new C2590a());
                        iVar.mo8588d();
                    } else {
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                        intent.addFlags(65731);
                        c0.startActivityForResult(intent, C0333i.f1700V0);
                    }
                } else if (i != 0) {
                    m11344b(i - 1, null);
                }
                this.f8988b.setTag(new Integer(i));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$a0 */
    public class View$OnClickListenerC2591a0 implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.r2$a0$a */
        class C2592a implements C2372h2.AbstractC2374b {

            /* renamed from: a */
            final /* synthetic */ Activity f8994a;

            /* renamed from: com.digdroid.alman.dig.r2$a0$a$a */
            class DialogInterface$OnClickListenerC2593a implements DialogInterface.OnClickListener {

                /* renamed from: b */
                final /* synthetic */ String[] f8996b;

                /* renamed from: c */
                final /* synthetic */ C2594b f8997c;

                DialogInterface$OnClickListenerC2593a(String[] strArr, C2594b bVar) {
                    this.f8996b = strArr;
                    this.f8997c = bVar;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C2588r2.this.f8801Z.mo8202z("temp_storage_dir", this.f8996b[this.f8997c.f8999a]);
                }
            }

            /* renamed from: com.digdroid.alman.dig.r2$a0$a$b */
            class C2594b {

                /* renamed from: a */
                int f8999a = 0;

                C2594b() {
                }
            }

            /* renamed from: com.digdroid.alman.dig.r2$a0$a$c */
            class DialogInterface$OnClickListenerC2595c implements DialogInterface.OnClickListener {

                /* renamed from: b */
                final /* synthetic */ C2594b f9001b;

                DialogInterface$OnClickListenerC2595c(C2594b bVar) {
                    this.f9001b = bVar;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.f9001b.f8999a = i;
                }
            }

            C2592a(Activity activity) {
                this.f8994a = activity;
            }

            @Override // com.digdroid.alman.dig.C2372h2.AbstractC2374b
            /* renamed from: a */
            public void mo8540a(String[] strArr) {
                if (!(strArr == null || strArr.length == 0)) {
                    String q = C2588r2.this.f8801Z.mo8193q("temp_storage_dir", strArr[0]);
                    C2594b bVar = new C2594b();
                    CharSequence[] charSequenceArr = new CharSequence[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        charSequenceArr[i] = strArr[i];
                        if (strArr[i].equals(q)) {
                            bVar.f8999a = i;
                        }
                    }
                    new DialogInterfaceC0068b.C0069a(this.f8994a, C2553q3.m11117c()).mo237q(charSequenceArr, bVar.f8999a, new DialogInterface$OnClickListenerC2595c(bVar)).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2593a(strArr, bVar)).mo221a().show();
                }
            }
        }

        View$OnClickListenerC2591a0() {
        }

        public void onClick(View view) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2372h2.m10301e(c0, new C2592a(c0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$b */
    public class View$OnClickListenerC2596b implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9003b;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.r2$b$a */
        public class DialogInterface$OnClickListenerC2597a implements DialogInterface.OnClickListener {

            /* renamed from: com.digdroid.alman.dig.r2$b$a$a */
            class AsyncTaskC2598a extends AsyncTask<Void, Void, Void> {
                AsyncTaskC2598a() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Void doInBackground(Void... voidArr) {
                    C2588r2.this.f8802a0.mo9325c().execSQL("UPDATE roms SET has_images=NULL,cover_status=21255");
                    return null;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public void onPostExecute(Void r1) {
                    ImageService.m9511a(View$OnClickListenerC2596b.this.f9003b.getApplicationContext());
                }
            }

            DialogInterface$OnClickListenerC2597a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                new AsyncTaskC2598a().execute(new Void[0]);
            }
        }

        View$OnClickListenerC2596b(Activity activity) {
            this.f9003b = activity;
        }

        public void onClick(View view) {
            new DialogInterfaceC0068b.C0069a(this.f9003b, C2553q3.m11117c()).mo228h(R.string.inform_refresh).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2597a()).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$b0 */
    public class C2599b0 implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ EditText f9007b;

        C2599b0(EditText editText) {
            this.f9007b = editText;
        }

        public void afterTextChanged(Editable editable) {
            try {
                int parseInt = Integer.parseInt(this.f9007b.getText().toString().trim());
                if (parseInt >= 0) {
                    C2588r2.this.f8801Z.mo8156E("game_cache_size", parseInt);
                }
            } catch (Exception unused) {
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$c */
    public class C2600c implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f9009b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f9010c;

        C2600c(Spinner spinner, ArrayList arrayList) {
            this.f9009b = spinner;
            this.f9010c = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing() && ((Integer) this.f9009b.getTag()).intValue() != i) {
                C2553q3.m11129o(C2588r2.this.f8813l0, (String) this.f9010c.get(i));
                C2185a4.m9691u(c0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$c0 */
    public class View$OnClickListenerC2601c0 implements View.OnClickListener {
        View$OnClickListenerC2601c0() {
        }

        public void onClick(View view) {
            C2588r2.this.f8814m0.mo8304z("https://digdroid.com/privacy.html");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$d */
    public class C2602d implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ MainActivity f9013b;

        C2602d(MainActivity mainActivity) {
            this.f9013b = mainActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            float f = -1.0f;
            if (i == 1) {
                f = C2553q3.f8899a.f9405a.mo8768e("theme_aspect_ratio", -1.0f);
            } else if (i == 3) {
                f = 2.0f;
            } else if (i == 4) {
                f = 1.7777778f;
            } else if (i == 5) {
                f = 1.5f;
            } else if (i == 6) {
                f = 1.3333334f;
            }
            if (i > 0) {
                C2588r2.this.f8801Z.mo8199w("main_aspect_ratio", f);
                C2185a4.m9691u(this.f9013b);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$d0 */
    public class View$OnClickListenerC2603d0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f9015b;

        View$OnClickListenerC2603d0(String str) {
            this.f9015b = str;
        }

        public void onClick(View view) {
            AbstractC2531p1.AbstractC2532a aVar = C2588r2.this.f8814m0;
            aVar.mo8304z("https://" + this.f9015b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$e */
    public class View$OnClickListenerC2604e implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9017b;

        View$OnClickListenerC2604e(SwitchCompat switchCompat) {
            this.f9017b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9017b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8153B("aspect_ratio_hack", this.f9017b.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$e0 */
    public class View$OnClickListenerC2605e0 implements View.OnClickListener {
        View$OnClickListenerC2605e0() {
        }

        public void onClick(View view) {
            C2588r2.this.f8814m0.mo8304z("https://digdroid.com/credits.html");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$f */
    public class View$OnClickListenerC2606f implements View.OnClickListener {
        View$OnClickListenerC2606f() {
        }

        public void onClick(View view) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2588r2.this.f8814m0.mo8303x(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$f0 */
    public class View$OnClickListenerC2607f0 implements View.OnClickListener {
        View$OnClickListenerC2607f0() {
        }

        public void onClick(View view) {
            if (C2588r2.this.mo9041s3()) {
                C2588r2.this.f8814m0.mo8279k0(true);
                C2318g gVar = new C2318g(C2588r2.this.mo2552c0());
                gVar.mo8445g(new C2654u0());
                gVar.mo8441c();
            }
            C2588r2.this.f8987r0.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$g */
    public class View$OnClickListenerC2608g implements View.OnClickListener {
        View$OnClickListenerC2608g() {
        }

        public void onClick(View view) {
            MainActivity mainActivity = (MainActivity) C2588r2.this.mo2552c0();
            if (mainActivity != null && !mainActivity.isFinishing()) {
                C2553q3.m11126l(mainActivity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$g0 */
    public class View$OnClickListenerC2609g0 implements View.OnClickListener {
        View$OnClickListenerC2609g0() {
        }

        public void onClick(View view) {
            if (C2588r2.this.mo9041s3()) {
                C2588r2.this.f8814m0.mo8279k0(true);
                C2318g gVar = new C2318g(C2588r2.this.mo2552c0());
                gVar.mo8445g(new C2652t0());
                gVar.mo8441c();
            }
            C2588r2.this.f8987r0.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$h */
    public class View$OnClickListenerC2610h implements View.OnClickListener {
        View$OnClickListenerC2610h() {
        }

        public void onClick(View view) {
            C2588r2.this.f8814m0.mo8255C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$h0 */
    public class View$OnClickListenerC2611h0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9025b;

        View$OnClickListenerC2611h0(Activity activity) {
            this.f9025b = activity;
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setType("*/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            this.f9025b.startActivityForResult(Intent.createChooser(intent, "Choose backup file"), 202);
            C2588r2.this.f8987r0.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$i */
    public class C2612i implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        private String f9027b;

        /* renamed from: c */
        final /* synthetic */ Spinner f9028c;

        /* renamed from: d */
        final /* synthetic */ MainActivity f9029d;

        /* renamed from: e */
        final /* synthetic */ TextView f9030e;

        /* renamed from: com.digdroid.alman.dig.r2$i$a */
        class C2613a implements C2391i.AbstractC2394b {
            C2613a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2588r2.this.f8801Z.mo8156E("theme_storage", 0);
                C2588r2.this.f8801Z.mo8158G("theme_storage_dir", strArr[0]);
                C2612i.this.m11350b();
            }
        }

        C2612i(Spinner spinner, MainActivity mainActivity, TextView textView) {
            this.f9028c = spinner;
            this.f9029d = mainActivity;
            this.f9030e = textView;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private void m11350b() {
            String J = C2724s3.m11551J(this.f9029d);
            if (!J.equals(this.f9027b)) {
                this.f9030e.setText(J);
                C2588r2.this.f8807f0.mo9268c(this.f9029d, this.f9027b, J);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                Integer num = (Integer) this.f9028c.getTag();
                this.f9027b = C2724s3.m11551J(c0);
                if (i == 1) {
                    C2391i iVar = new C2391i(c0);
                    iVar.mo8592h(new C2613a());
                    iVar.mo8588d();
                } else if (i != 0) {
                    C2588r2.this.f8801Z.mo8156E("theme_storage", i - 1);
                    m11350b();
                }
                this.f9028c.setTag(new Integer(i));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$i0 */
    public class DialogInterface$OnMultiChoiceClickListenerC2614i0 implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f9033a;

        DialogInterface$OnMultiChoiceClickListenerC2614i0(boolean[] zArr) {
            this.f9033a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f9033a[i] = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$j */
    public class C2615j implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f9035b;

        C2615j(Spinner spinner) {
            this.f9035b = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != ((Integer) this.f9035b.getTag()).intValue()) {
                C2219c3 c3Var = C2588r2.this.f8801Z;
                if (i == 0) {
                    c3Var.mo8160I("language");
                } else {
                    c3Var.mo8202z("language", C2588r2.f8983n0[i - 1]);
                }
                ActivityC0447d c0 = C2588r2.this.mo2552c0();
                if (c0 != null && !c0.isFinishing()) {
                    C2185a4.m9691u(c0);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$j0 */
    public class DialogInterface$OnClickListenerC2616j0 implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f9037b;

        /* renamed from: com.digdroid.alman.dig.r2$j0$a */
        class C2617a implements C2391i.AbstractC2394b {
            C2617a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2219c3 c3Var = C2588r2.this.f8801Z;
                c3Var.mo8202z("storage_dir" + DialogInterface$OnClickListenerC2616j0.this.f9037b, strArr[0]);
                DialogInterface$OnClickListenerC2616j0 j0Var = DialogInterface$OnClickListenerC2616j0.this;
                C2588r2.this.f8801Z.mo8200x("num_storage_dirs", j0Var.f9037b + 1);
                C2588r2.this.mo9040A3();
            }
        }

        DialogInterface$OnClickListenerC2616j0(int i) {
            this.f9037b = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2391i iVar = new C2391i(C2588r2.this.mo2552c0());
            iVar.mo8592h(new C2617a());
            iVar.mo8588d();
        }
    }

    /* renamed from: com.digdroid.alman.dig.r2$k */
    class RunnableC2618k implements Runnable {
        RunnableC2618k() {
        }

        public void run() {
            if (C2588r2.this.mo2505F0() != null) {
                C2588r2.this.m11279G3();
                C2588r2.this.m11296u3();
                C2588r2.this.m11281I3();
                C2588r2.this.m11293q3();
                C2588r2.this.m11276D3();
                C2588r2.this.m11298w3();
                C2588r2.this.m11274B3();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$k0 */
    public class DialogInterface$OnClickListenerC2619k0 implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f9041b;

        /* renamed from: c */
        final /* synthetic */ boolean[] f9042c;

        /* renamed from: d */
        final /* synthetic */ String[] f9043d;

        /* renamed from: com.digdroid.alman.dig.r2$k0$a */
        class DialogInterface$OnClickListenerC2620a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2620a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    DialogInterface$OnClickListenerC2619k0 k0Var = DialogInterface$OnClickListenerC2619k0.this;
                    if (i2 < k0Var.f9041b) {
                        if (!k0Var.f9042c[i2]) {
                            C2219c3 c3Var = C2588r2.this.f8801Z;
                            c3Var.mo8202z("storage_dir" + i3, DialogInterface$OnClickListenerC2619k0.this.f9043d[i2]);
                            i3++;
                        }
                        i2++;
                    } else {
                        C2588r2.this.f8801Z.mo8200x("num_storage_dirs", i3);
                        C2588r2.this.mo9040A3();
                        return;
                    }
                }
            }
        }

        DialogInterface$OnClickListenerC2619k0(int i, boolean[] zArr, String[] strArr) {
            this.f9041b = i;
            this.f9042c = zArr;
            this.f9043d = strArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new DialogInterfaceC0068b.C0069a(C2588r2.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.confirm).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2620a()).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$l */
    public class AsyncTaskC2621l extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ MainActivity f9046a;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.r2$l$a */
        public class C2622a implements C2553q3.AbstractC2559e {
            C2622a() {
            }

            @Override // com.digdroid.alman.dig.C2553q3.AbstractC2559e
            /* renamed from: a */
            public void mo8981a(ArrayList<C2724s3> arrayList) {
                C2588r2.this.m11278F3(arrayList);
            }
        }

        AsyncTaskC2621l(MainActivity mainActivity) {
            this.f9046a = mainActivity;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C2588r2 r2Var = C2588r2.this;
            r2Var.f8985p0 = r2Var.mo8894D2(null);
            C2588r2 r2Var2 = C2588r2.this;
            r2Var2.f8984o0 = r2Var2.f8801Z.mo8177Z();
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r2) {
            C2553q3.m11124j(this.f9046a, new C2622a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$l0 */
    public class DialogInterface$OnMultiChoiceClickListenerC2623l0 implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ ArrayList f9049a;

        /* renamed from: b */
        final /* synthetic */ Cursor f9050b;

        /* renamed from: c */
        final /* synthetic */ SQLiteDatabase f9051c;

        DialogInterface$OnMultiChoiceClickListenerC2623l0(ArrayList arrayList, Cursor cursor, SQLiteDatabase sQLiteDatabase) {
            this.f9049a = arrayList;
            this.f9050b = cursor;
            this.f9051c = sQLiteDatabase;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            ArrayList arrayList = this.f9049a;
            Integer valueOf = Integer.valueOf(i);
            if (z) {
                arrayList.add(valueOf);
            } else if (arrayList.contains(valueOf)) {
                this.f9049a.remove(Integer.valueOf(i));
            }
            this.f9050b.moveToPosition(i);
            SQLiteDatabase sQLiteDatabase = this.f9051c;
            sQLiteDatabase.execSQL("UPDATE rompaths SET selected=" + (z ? 1 : 0) + " WHERE _id=" + this.f9050b.getLong(0));
            this.f9050b.requery();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$m */
    public class View$OnClickListenerC2624m implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9053b;

        View$OnClickListenerC2624m(SwitchCompat switchCompat) {
            this.f9053b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9053b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8153B("autostart", this.f9053b.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$m0 */
    public class DialogInterface$OnShowListenerC2625m0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ ArrayList f9055a;

        /* renamed from: b */
        final /* synthetic */ Cursor f9056b;

        /* renamed from: c */
        final /* synthetic */ SQLiteDatabase f9057c;

        /* renamed from: com.digdroid.alman.dig.r2$m0$a */
        class View$OnClickListenerC2626a implements View.OnClickListener {

            /* renamed from: com.digdroid.alman.dig.r2$m0$a$a */
            class DialogInterface$OnClickListenerC2627a implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2627a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C2588r2.this.f8814m0.mo8291q0();
                    int[] iArr = new int[DialogInterface$OnShowListenerC2625m0.this.f9055a.size()];
                    while (DialogInterface$OnShowListenerC2625m0.this.f9055a.size() > 0) {
                        int intValue = ((Integer) DialogInterface$OnShowListenerC2625m0.this.f9055a.get(0)).intValue();
                        if (intValue < DialogInterface$OnShowListenerC2625m0.this.f9056b.getCount() && DialogInterface$OnShowListenerC2625m0.this.f9056b.moveToPosition(intValue)) {
                            SQLiteDatabase sQLiteDatabase = DialogInterface$OnShowListenerC2625m0.this.f9057c;
                            sQLiteDatabase.execSQL("DELETE FROM rompaths WHERE _id=" + DialogInterface$OnShowListenerC2625m0.this.f9056b.getLong(0));
                        }
                        DialogInterface$OnShowListenerC2625m0.this.f9055a.remove(0);
                    }
                    DialogInterface$OnShowListenerC2625m0.this.f9056b.requery();
                }
            }

            /* renamed from: com.digdroid.alman.dig.r2$m0$a$b */
            class DialogInterface$OnClickListenerC2628b implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2628b() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterface$OnShowListenerC2625m0.this.f9055a.clear();
                }
            }

            View$OnClickListenerC2626a() {
            }

            public void onClick(View view) {
                if (DialogInterface$OnShowListenerC2625m0.this.f9055a.size() > 0) {
                    new DialogInterfaceC0068b.C0069a(C2588r2.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2628b()).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2627a()).mo221a().show();
                }
            }
        }

        /* renamed from: com.digdroid.alman.dig.r2$m0$b */
        class View$OnClickListenerC2629b implements View.OnClickListener {

            /* renamed from: com.digdroid.alman.dig.r2$m0$b$a */
            class C2630a implements C2391i.AbstractC2394b {
                C2630a() {
                }

                @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
                /* renamed from: a */
                public void mo8043a(String[] strArr) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("system", "ignore");
                    contentValues.put("path", strArr[0]);
                    contentValues.put("selected", (Integer) 0);
                    contentValues.put("last_checked", (Integer) 0);
                    DialogInterface$OnShowListenerC2625m0.this.f9057c.insert("rompaths", null, contentValues);
                    DialogInterface$OnShowListenerC2625m0.this.f9056b.requery();
                }
            }

            View$OnClickListenerC2629b() {
            }

            public void onClick(View view) {
                C2391i iVar = new C2391i(C2588r2.this.mo2552c0());
                iVar.mo8592h(new C2630a());
                iVar.mo8588d();
            }
        }

        /* renamed from: com.digdroid.alman.dig.r2$m0$c */
        class View$OnClickListenerC2631c implements View.OnClickListener {
            View$OnClickListenerC2631c() {
            }

            public void onClick(View view) {
                DialogInterface$OnShowListenerC2625m0.this.f9056b.close();
                C2588r2.this.f8987r0.dismiss();
            }
        }

        DialogInterface$OnShowListenerC2625m0(ArrayList arrayList, Cursor cursor, SQLiteDatabase sQLiteDatabase) {
            this.f9055a = arrayList;
            this.f9056b = cursor;
            this.f9057c = sQLiteDatabase;
        }

        public void onShow(DialogInterface dialogInterface) {
            C2588r2.this.f8987r0.mo215e(-1).setOnClickListener(new View$OnClickListenerC2626a());
            C2588r2.this.f8987r0.mo215e(-2).setOnClickListener(new View$OnClickListenerC2629b());
            C2588r2.this.f8987r0.mo215e(-3).setOnClickListener(new View$OnClickListenerC2631c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$n */
    public class View$OnClickListenerC2632n implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9065b;

        View$OnClickListenerC2632n(SwitchCompat switchCompat) {
            this.f9065b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9065b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8153B("external_browser", this.f9065b.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$n0 */
    public class View$OnClickListenerC2633n0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9067b;

        View$OnClickListenerC2633n0(SwitchCompat switchCompat) {
            this.f9067b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9067b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8152A("auto_scan", this.f9067b.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$o */
    public class View$OnClickListenerC2634o implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9069b;

        /* renamed from: com.digdroid.alman.dig.r2$o$a */
        class C2635a implements C2223d0.AbstractC2249s {
            C2635a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                C2588r2.this.m11295t3();
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
            }
        }

        View$OnClickListenerC2634o(Activity activity) {
            this.f9069b = activity;
        }

        public void onClick(View view) {
            C2223d0.m9876p().mo8215r(this.f9069b, 1, new C2635a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$o0 */
    public class View$OnClickListenerC2636o0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9072b;

        View$OnClickListenerC2636o0(Activity activity) {
            this.f9072b = activity;
        }

        public void onClick(View view) {
            C2588r2.this.mo9042z3(this.f9072b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$p */
    public class View$OnClickListenerC2637p implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.r2$p$a */
        class DialogInterface$OnClickListenerC2638a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ Activity f9075b;

            DialogInterface$OnClickListenerC2638a(Activity activity) {
                this.f9075b = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                File file = new File(this.f9075b.getExternalFilesDir(null), "retroarch.cfg");
                if (file.exists()) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
        }

        View$OnClickListenerC2637p() {
        }

        public void onClick(View view) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(R.string.confirm_retroarch_reset).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2638a(c0)).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$p0 */
    public class View$OnClickListenerC2639p0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9077b;

        /* renamed from: com.digdroid.alman.dig.r2$p0$a */
        class C2640a implements C2181a3.AbstractC2184b {

            /* renamed from: com.digdroid.alman.dig.r2$p0$a$a */
            class DialogInterface$OnClickListenerC2641a implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2641a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    new AsyncTaskC2658w0(C2588r2.this, null).execute(new String[0]);
                }
            }

            C2640a() {
            }

            @Override // com.digdroid.alman.dig.C2181a3.AbstractC2184b
            public void start() {
                new DialogInterfaceC0068b.C0069a(View$OnClickListenerC2639p0.this.f9077b, C2553q3.m11117c()).mo228h(R.string.confirm_scan).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2641a()).mo221a().show();
            }
        }

        View$OnClickListenerC2639p0(Activity activity) {
            this.f9077b = activity;
        }

        public void onClick(View view) {
            new C2181a3(this.f9077b).mo8041a(new C2640a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$q */
    public class View$OnClickListenerC2642q implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C2223d0 f9081b;

        View$OnClickListenerC2642q(C2223d0 d0Var) {
            this.f9081b = d0Var;
        }

        public void onClick(View view) {
            this.f9081b.mo8211j(C2588r2.this.mo2552c0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$q0 */
    public class View$OnClickListenerC2643q0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Switch f9083b;

        View$OnClickListenerC2643q0(Switch r2) {
            this.f9083b = r2;
        }

        public void onClick(View view) {
            Switch r2 = this.f9083b;
            r2.setChecked(!r2.isChecked());
            C2588r2.this.f8801Z.mo8162K(this.f9083b.isChecked());
            ImageService.m9511a(C2588r2.this.f8813l0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$r */
    public class View$OnClickListenerC2644r implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9085b;

        View$OnClickListenerC2644r(SwitchCompat switchCompat) {
            this.f9085b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9085b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8153B("confirm_quit", this.f9085b.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$r0 */
    public class View$OnClickListenerC2645r0 implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Switch f9087b;

        /* renamed from: c */
        final /* synthetic */ Activity f9088c;

        /* renamed from: com.digdroid.alman.dig.r2$r0$a */
        class DialogInterface$OnClickListenerC2646a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2646a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2588r2.this.f8801Z.mo8153B("wifi_only", false);
                ImageService.m9511a(C2588r2.this.f8813l0);
            }
        }

        /* renamed from: com.digdroid.alman.dig.r2$r0$b */
        class DialogInterface$OnClickListenerC2647b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2647b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC2645r0.this.f9087b.setChecked(true);
            }
        }

        View$OnClickListenerC2645r0(Switch r2, Activity activity) {
            this.f9087b = r2;
            this.f9088c = activity;
        }

        public void onClick(View view) {
            Switch r3 = this.f9087b;
            r3.setChecked(!r3.isChecked());
            if (!this.f9087b.isChecked()) {
                new DialogInterfaceC0068b.C0069a(this.f9088c, C2553q3.m11117c()).mo228h(R.string.no_wifi_confirm).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2647b()).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2646a()).mo221a().show();
                return;
            }
            C2588r2.this.f8801Z.mo8153B("wifi_only", true);
            ImageService.m9511a(C2588r2.this.f8813l0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$s */
    public class View$OnClickListenerC2648s implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9092b;

        View$OnClickListenerC2648s(SwitchCompat switchCompat) {
            this.f9092b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9092b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8153B("allow_paging", this.f9092b.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$s0 */
    public class C2649s0 implements AdapterView.OnItemSelectedListener {
        C2649s0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C2588r2.this.f8801Z.mo8202z("image_quality", i != 0 ? i != 1 ? i != 2 ? "" : "high" : "medium" : "low");
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$t */
    public class View$OnClickListenerC2650t implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.r2$t$a */
        class C2651a implements C2223d0.AbstractC2249s {
            C2651a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                C2588r2.this.f8814m0.mo8268Z();
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
            }
        }

        View$OnClickListenerC2650t() {
        }

        public void onClick(View view) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2223d0.m9876p().mo8215r(c0, 15, new C2651a());
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.r2$t0 */
    class C2652t0 implements C2318g.AbstractC2319a {
        C2652t0() {
        }

        @Override // com.digdroid.alman.dig.C2318g.AbstractC2319a
        /* renamed from: a */
        public void mo7932a(boolean z) {
            C2588r2.this.f8814m0.mo8279k0(false);
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2185a4.m9670H(c0);
                if (z) {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "dig_backup.bak");
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    intent.setType("*/*");
                    C2588r2.this.mo2586m2(Intent.createChooser(intent, "Send to"));
                    return;
                }
                new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(R.string.backup_fail).mo224d(false).mo235o(R.string.ok, null).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$u */
    public class View$OnClickListenerC2653u implements View.OnClickListener {
        View$OnClickListenerC2653u() {
        }

        public void onClick(View view) {
            C2588r2.this.mo9040A3();
        }
    }

    /* renamed from: com.digdroid.alman.dig.r2$u0 */
    class C2654u0 implements C2318g.AbstractC2319a {
        C2654u0() {
        }

        @Override // com.digdroid.alman.dig.C2318g.AbstractC2319a
        /* renamed from: a */
        public void mo7932a(boolean z) {
            C2588r2.this.f8814m0.mo8279k0(false);
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2185a4.m9670H(c0);
                new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(z ? R.string.backup_success : R.string.backup_fail).mo224d(false).mo235o(R.string.ok, null).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$v */
    public class C2655v implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f9100b;

        C2655v(Spinner spinner) {
            this.f9100b = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing() && i != ((Integer) this.f9100b.getTag()).intValue()) {
                C2588r2.this.f8801Z.mo8200x("orientation", i);
                C2185a4.m9691u(c0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$v0 */
    public class View$OnClickListenerC2656v0 implements View.OnClickListener {

        /* renamed from: b */
        boolean f9102b = false;

        /* renamed from: c */
        int f9103c;

        /* renamed from: d */
        int f9104d;

        /* renamed from: e */
        int f9105e;

        /* renamed from: f */
        int f9106f;

        /* renamed from: g */
        int f9107g = -1;

        /* renamed from: h */
        int f9108h = -1;

        public View$OnClickListenerC2656v0(int i, int i2, int i3, int i4) {
            this.f9103c = i;
            this.f9104d = i2;
            this.f9105e = i3;
            this.f9106f = i4;
            m11363a();
        }

        public View$OnClickListenerC2656v0(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f9103c = i;
            this.f9104d = i2;
            this.f9105e = i3;
            this.f9106f = i4;
            this.f9107g = i5;
            this.f9108h = i6;
            m11363a();
        }

        /* renamed from: a */
        private void m11363a() {
            Drawable drawable;
            ActivityC0447d c0 = C2588r2.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                if (this.f9104d >= 0 && (drawable = C2588r2.this.mo2613x0().getDrawable(R.drawable.ic_arrow_right)) != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(C2588r2.this.f8808g0.f9410f, PorterDuff.Mode.SRC_ATOP));
                    ImageView imageView = (ImageView) C2588r2.this.mo2505F0().findViewById(this.f9104d);
                    imageView.setImageDrawable(drawable);
                    imageView.setRotation(this.f9102b ? 90.0f : 0.0f);
                }
                TextView textView = (TextView) C2588r2.this.mo2505F0().findViewById(this.f9103c);
                textView.setText(" " + c0.getString(this.f9105e));
                textView.setTextColor(C2588r2.this.f8808g0.f9410f);
                int i = this.f9107g;
                if (i >= 0) {
                    if (!this.f9102b) {
                        i = this.f9108h;
                    }
                    textView.setNextFocusDownId(i);
                }
            }
        }

        public void onClick(View view) {
            this.f9102b = !this.f9102b;
            m11363a();
            ((LinearLayout) C2588r2.this.mo2505F0().findViewById(this.f9106f)).setVisibility(this.f9102b ? 0 : 8);
        }
    }

    /* renamed from: com.digdroid.alman.dig.r2$w */
    class RunnableC2657w implements Runnable {
        RunnableC2657w() {
        }

        public void run() {
            C2588r2.this.m11300y3();
        }
    }

    /* renamed from: com.digdroid.alman.dig.r2$w0 */
    private class AsyncTaskC2658w0 extends AsyncTask<String, Void, String> {
        private AsyncTaskC2658w0() {
        }

        /* synthetic */ AsyncTaskC2658w0(C2588r2 r2Var, RunnableC2618k kVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C2588r2.this.f8801Z.mo8163L(false);
            C2588r2.this.f8801Z.mo8154C(0);
            C2588r2.this.f8801Z.mo8157F("sd_dirs_last_scanned", 0);
            C2588r2.this.f8802a0.mo9325c().execSQL("UPDATE roms SET merged_with=-1");
            C2588r2.this.f8802a0.mo9325c().execSQL("UPDATE rompaths SET last_checked=0");
            C2588r2.this.f8814m0.mo8910t0(true, true, true);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$x */
    public class View$OnClickListenerC2659x implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9112b;

        /* renamed from: com.digdroid.alman.dig.r2$x$a */
        class C2660a implements C2223d0.AbstractC2249s {
            C2660a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                C2588r2.this.f8801Z.mo8152A("merged_games", true);
                View$OnClickListenerC2659x.this.f9112b.setChecked(true);
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
                C2588r2.this.f8801Z.mo8152A("merged_games", false);
                View$OnClickListenerC2659x.this.f9112b.setChecked(false);
            }
        }

        View$OnClickListenerC2659x(SwitchCompat switchCompat) {
            this.f9112b = switchCompat;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9112b;
            switchCompat.setChecked(!switchCompat.isChecked());
            if (this.f9112b.isChecked()) {
                ActivityC0447d c0 = C2588r2.this.mo2552c0();
                if (c0 != null && !c0.isFinishing()) {
                    C2223d0.m9876p().mo8215r(c0, 6, new C2660a());
                } else {
                    return;
                }
            } else {
                C2588r2.this.f8801Z.mo8152A("merged_games", false);
                this.f9112b.setChecked(false);
            }
            new AsyncTaskC2661x0(C2588r2.this, null).execute(new String[0]);
            C2588r2.this.f8814m0.mo8264R();
        }
    }

    /* renamed from: com.digdroid.alman.dig.r2$x0 */
    private class AsyncTaskC2661x0 extends AsyncTask<String, Void, String> {
        private AsyncTaskC2661x0() {
        }

        /* synthetic */ AsyncTaskC2661x0(C2588r2 r2Var, RunnableC2618k kVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                Cursor rawQuery = C2588r2.this.f8802a0.mo9325c().rawQuery("SELECT slug FROM systems", null);
                if (rawQuery.moveToFirst()) {
                    do {
                        C2588r2.this.f8803b0.mo8545E(rawQuery.getString(0));
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            } catch (Exception unused) {
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            C2588r2.this.m11300y3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$y */
    public class C2662y implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f9116b;

        C2662y(Spinner spinner) {
            this.f9116b = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != ((Integer) this.f9116b.getTag()).intValue()) {
                C2588r2.this.f8801Z.mo8156E("overscan", i);
                ActivityC0447d c0 = C2588r2.this.mo2552c0();
                if (c0 != null && !c0.isFinishing()) {
                    C2185a4.m9691u(c0);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r2$z */
    public class View$OnClickListenerC2663z implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SwitchCompat f9118b;

        /* renamed from: c */
        final /* synthetic */ Activity f9119c;

        View$OnClickListenerC2663z(SwitchCompat switchCompat, Activity activity) {
            this.f9118b = switchCompat;
            this.f9119c = activity;
        }

        public void onClick(View view) {
            SwitchCompat switchCompat = this.f9118b;
            switchCompat.setChecked(!switchCompat.isChecked());
            C2588r2.this.f8801Z.mo8153B("hide_navbar", this.f9118b.isChecked());
            this.f9119c.getWindow().getDecorView().setSystemUiVisibility(this.f9118b.isChecked() ? 3846 : 3332);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: B3 */
    private void m11274B3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.info);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.info, R.id.info_arrow, R.string.info, R.id.info_settings));
    }

    /* renamed from: C3 */
    private void m11275C3() {
        View F0;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (F0 = mo2505F0()) != null) {
            TextView textView = (TextView) F0.findViewById(R.id.privacy);
            textView.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView);
            textView.setOnClickListener(new View$OnClickListenerC2601c0());
            String q = this.f8801Z.mo8193q("language", "device");
            if (q.equals("device")) {
                q = Locale.getDefault().getLanguage();
            }
            String str = "digdroid.com/faq";
            int i = 0;
            while (true) {
                String[] strArr = f8983n0;
                if (i >= strArr.length) {
                    break;
                } else if (!strArr[i].equals(q)) {
                    i++;
                } else if (!q.equals("en")) {
                    str = str + "-" + q;
                }
            }
            TextView textView2 = (TextView) F0.findViewById(R.id.faq);
            textView2.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2603d0(str));
            TextView textView3 = (TextView) F0.findViewById(R.id.credits);
            textView3.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView3);
            textView3.setOnClickListener(new View$OnClickListenerC2605e0());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: D3 */
    private void m11276D3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.interface_options);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.interface_options, R.id.interface_arrow, R.string.interface_options, R.id.interface_settings));
    }

    /* renamed from: E3 */
    private void m11277E3() {
        View F0;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (F0 = mo2505F0()) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) F0.findViewById(R.id.confirm_quit);
            C2553q3.m11131q(constraintLayout);
            SwitchCompat switchCompat = (SwitchCompat) F0.findViewById(R.id.confirm_quit_box);
            switchCompat.setTextColor(this.f8808g0.f9409e);
            switchCompat.setChecked(this.f8801Z.mo8180c("confirm_quit", true));
            constraintLayout.setOnClickListener(new View$OnClickListenerC2644r(switchCompat));
            ConstraintLayout constraintLayout2 = (ConstraintLayout) F0.findViewById(R.id.allow_paging);
            C2553q3.m11131q(constraintLayout2);
            SwitchCompat switchCompat2 = (SwitchCompat) F0.findViewById(R.id.allow_paging_box);
            switchCompat2.setTextColor(this.f8808g0.f9409e);
            switchCompat2.setChecked(this.f8801Z.mo8180c("allow_paging", true));
            constraintLayout2.setOnClickListener(new View$OnClickListenerC2648s(switchCompat2));
            TextView textView = (TextView) F0.findViewById(R.id.gamepad_bindings);
            textView.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView);
            textView.setOnClickListener(new View$OnClickListenerC2650t());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: F3 */
    private void m11278F3(ArrayList<C2724s3> arrayList) {
        this.f8986q0 = arrayList;
        View F0 = mo2505F0();
        if (F0 != null) {
            mo8118X2("");
            m11280H3();
            m11297v3();
            m11282J3();
            m11294r3();
            m11277E3();
            m11299x3();
            m11275C3();
            F0.findViewById(R.id.scanning).requestFocus();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G3 */
    private void m11279G3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.scanning);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.requestFocus();
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.scanning, R.id.scanning_arrow, R.string.device_scanning, R.id.scanning_settings));
        textView.setTextColor(this.f8808g0.f9410f);
    }

    /* renamed from: H3 */
    private void m11280H3() {
        View F0;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (F0 = mo2505F0()) != null) {
            SwitchCompat switchCompat = (SwitchCompat) F0.findViewById(R.id.merge_key);
            switchCompat.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(switchCompat);
            switchCompat.setChecked(this.f8801Z.mo8180c("merged_games", true));
            ConstraintLayout constraintLayout = (ConstraintLayout) F0.findViewById(R.id.merge_value);
            C2553q3.m11131q(constraintLayout);
            constraintLayout.setOnClickListener(new View$OnClickListenerC2659x(switchCompat));
            SwitchCompat switchCompat2 = (SwitchCompat) F0.findViewById(R.id.autoscan_key);
            switchCompat2.setTextColor(this.f8808g0.f9409e);
            switchCompat2.setChecked(this.f8801Z.mo8180c("auto_scan", true));
            ConstraintLayout constraintLayout2 = (ConstraintLayout) F0.findViewById(R.id.autoscan_value);
            C2553q3.m11131q(constraintLayout2);
            constraintLayout2.setOnClickListener(new View$OnClickListenerC2633n0(switchCompat2));
            TextView textView = (TextView) F0.findViewById(R.id.ignore_key);
            textView.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView);
            textView.setOnClickListener(new View$OnClickListenerC2636o0(c0));
            TextView textView2 = (TextView) F0.findViewById(R.id.startscan_key);
            textView2.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2639p0(c0));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: I3 */
    private void m11281I3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.appearance);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.appearance, R.id.appearance_arrow, R.string.themes, R.id.appearance_settings, R.id.change_theme_spinner, R.id.app_options));
    }

    /* renamed from: J3 */
    private void m11282J3() {
        View F0;
        MainActivity mainActivity = (MainActivity) mo2552c0();
        if (mainActivity != null && !mainActivity.isFinishing() && (F0 = mo2505F0()) != null) {
            ((TextView) F0.findViewById(R.id.change_theme)).setTextColor(this.f8808g0.f9409e);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C2724s3> it = this.f8986q0.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                C2724s3 next = it.next();
                if (next != null) {
                    try {
                        arrayList.add(next.f9260f);
                        arrayList2.add(next.mo8772i("name"));
                        if (next.f9260f.equals(C2553q3.f8900b)) {
                            i = i2;
                        }
                        i2++;
                    } catch (Exception unused) {
                    }
                }
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(mainActivity, 17367048, arrayList2);
            arrayAdapter.setDropDownViewResource(17367049);
            Spinner spinner = (Spinner) F0.findViewById(R.id.change_theme_spinner);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setSelection(i);
            spinner.setTag(Integer.valueOf(i));
            spinner.setOnItemSelectedListener(new C2600c(spinner, arrayList));
            ((TextView) F0.findViewById(R.id.aspect_ratio)).setTextColor(this.f8808g0.f9409e);
            int i3 = 4;
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(mainActivity, 17367048, new String[]{"-------", mainActivity.getString(R.string.theme), mainActivity.getString(R.string.device_options), mainActivity.getString(R.string.aspect2_1), mainActivity.getString(R.string.aspect16_9), mainActivity.getString(R.string.aspect3_2), mainActivity.getString(R.string.aspect4_3)});
            arrayAdapter2.setDropDownViewResource(17367049);
            Spinner spinner2 = (Spinner) F0.findViewById(R.id.aspect_ratio_spinner);
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
            spinner2.setOnItemSelectedListener(new C2602d(mainActivity));
            ConstraintLayout constraintLayout = (ConstraintLayout) F0.findViewById(R.id.ar_hack);
            C2553q3.m11131q(constraintLayout);
            SwitchCompat switchCompat = (SwitchCompat) F0.findViewById(R.id.ar_hack_switch);
            switchCompat.setTextColor(this.f8808g0.f9409e);
            switchCompat.setChecked(this.f8801Z.mo8180c("aspect_ratio_hack", false));
            constraintLayout.setOnClickListener(new View$OnClickListenerC2604e(switchCompat));
            TextView textView = (TextView) F0.findViewById(R.id.edit_theme);
            textView.setText(R.string.edit_themes);
            textView.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView);
            textView.setOnClickListener(new View$OnClickListenerC2606f());
            TextView textView2 = (TextView) F0.findViewById(R.id.install_theme);
            textView2.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2608g());
            TextView textView3 = (TextView) F0.findViewById(R.id.browse_themes);
            textView3.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView3);
            textView3.setOnClickListener(new View$OnClickListenerC2610h());
            ((TextView) F0.findViewById(R.id.theme_storage)).setTextColor(this.f8808g0.f9409e);
            TextView textView4 = (TextView) F0.findViewById(R.id.theme_storage_path);
            textView4.setText(C2724s3.m11551J(mainActivity));
            File[] b = C2372h2.m10298b(mainActivity);
            boolean z = (b == null || b.length <= 1 || b[1] == null) ? false : true;
            if (!z) {
                i3 = 3;
            }
            String[] strArr = new String[i3];
            strArr[0] = "-------";
            strArr[1] = mainActivity.getString(R.string.other_folder);
            strArr[2] = mainActivity.getString(R.string.internalSource);
            if (z) {
                strArr[3] = mainActivity.getString(R.string.external);
            }
            ArrayAdapter arrayAdapter3 = new ArrayAdapter(mainActivity, 17367048, strArr);
            arrayAdapter3.setDropDownViewResource(17367049);
            Spinner spinner3 = (Spinner) F0.findViewById(R.id.theme_storage_spinner);
            spinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
            spinner3.setSelection(0);
            spinner3.setTag(new Integer(0));
            spinner3.setOnItemSelectedListener(new C2612i(spinner3, mainActivity, textView4));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: q3 */
    private void m11293q3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.app_options);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.app_options, R.id.app_arrow, R.string.app_options, R.id.app_settings, R.id.language_spinner, R.id.interface_options));
    }

    /* renamed from: r3 */
    private void m11294r3() {
        View F0;
        int i;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (F0 = mo2505F0()) != null) {
            ((TextView) F0.findViewById(R.id.language)).setTextColor(this.f8808g0.f9409e);
            boolean z = true;
            ArrayAdapter arrayAdapter = new ArrayAdapter(c0, 17367048, new String[]{c0.getString(R.string.device_options), c0.getString(R.string.english), c0.getString(R.string.french), c0.getString(R.string.spanish), c0.getString(R.string.portugese), c0.getString(R.string.italian), c0.getString(R.string.german), c0.getString(R.string.russian), c0.getString(R.string.japanese), c0.getString(R.string.korean), c0.getString(R.string.arabic)});
            arrayAdapter.setDropDownViewResource(17367049);
            String q = this.f8801Z.mo8193q("language", "device");
            int i2 = 0;
            while (true) {
                String[] strArr = f8983n0;
                if (i2 >= strArr.length) {
                    i = 0;
                    break;
                } else if (q.equals(strArr[i2])) {
                    i = i2 + 1;
                    break;
                } else {
                    i2++;
                }
            }
            Spinner spinner = (Spinner) F0.findViewById(R.id.language_spinner);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setTag(new Integer(i));
            spinner.setSelection(i);
            spinner.setOnItemSelectedListener(new C2615j(spinner));
            if (Build.VERSION.SDK_INT < 17) {
                z = false;
            }
            spinner.setEnabled(z);
            ConstraintLayout constraintLayout = (ConstraintLayout) F0.findViewById(R.id.autostart);
            C2553q3.m11131q(constraintLayout);
            SwitchCompat switchCompat = (SwitchCompat) F0.findViewById(R.id.autostart_cb);
            switchCompat.setTextColor(this.f8808g0.f9409e);
            switchCompat.setChecked(this.f8801Z.mo8180c("autostart", false));
            constraintLayout.setOnClickListener(new View$OnClickListenerC2624m(switchCompat));
            ConstraintLayout constraintLayout2 = (ConstraintLayout) F0.findViewById(R.id.external_browser);
            C2553q3.m11131q(constraintLayout2);
            SwitchCompat switchCompat2 = (SwitchCompat) F0.findViewById(R.id.external_browser_cb);
            switchCompat2.setTextColor(this.f8808g0.f9409e);
            switchCompat2.setChecked(this.f8801Z.mo8180c("external_browser", false));
            constraintLayout2.setOnClickListener(new View$OnClickListenerC2632n(switchCompat2));
            TextView textView = (TextView) F0.findViewById(R.id.backup_restore);
            textView.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView);
            textView.setOnClickListener(new View$OnClickListenerC2634o(c0));
            TextView textView2 = (TextView) F0.findViewById(R.id.reset_retroarch);
            textView2.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2637p());
            C2223d0 p = C2223d0.m9876p();
            if (p.mo8217v()) {
                F0.findViewById(R.id.upgrade_block).setVisibility(8);
                return;
            }
            F0.findViewById(R.id.upgrade_block).setVisibility(0);
            TextView textView3 = (TextView) F0.findViewById(R.id.upgrade);
            textView3.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView3);
            textView3.setOnClickListener(new View$OnClickListenerC2642q(p));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: t3 */
    private void m11295t3() {
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing()) {
            View inflate = c0.getLayoutInflater().inflate(R.layout.backup, (ViewGroup) null);
            C2553q3.m11133s((TextView) inflate.findViewById(R.id.backup_title));
            TextView textView = (TextView) inflate.findViewById(R.id.backup_file);
            C2553q3.m11133s(textView);
            textView.setOnClickListener(new View$OnClickListenerC2607f0());
            TextView textView2 = (TextView) inflate.findViewById(R.id.backup_drive);
            C2553q3.m11133s(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2609g0());
            TextView textView3 = (TextView) inflate.findViewById(R.id.restore_file);
            C2553q3.m11133s(textView3);
            textView3.setOnClickListener(new View$OnClickListenerC2611h0(c0));
            DialogInterfaceC0068b a = new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo240t(inflate).mo221a();
            this.f8987r0 = a;
            a.show();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: u3 */
    private void m11296u3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.game_covers);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.game_covers, R.id.game_covers_arrow, R.string.game_covers, R.id.covers_settings, R.id.image_quality_spinner, R.id.appearance));
    }

    /* renamed from: v3 */
    private void m11297v3() {
        View F0;
        int i;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (F0 = mo2505F0()) != null) {
            Switch r2 = (Switch) F0.findViewById(R.id.autodownload_key);
            r2.setTextColor(this.f8808g0.f9409e);
            r2.setChecked(this.f8801Z.mo8178a());
            ConstraintLayout constraintLayout = (ConstraintLayout) F0.findViewById(R.id.autodownload_value);
            C2553q3.m11131q(constraintLayout);
            constraintLayout.setOnClickListener(new View$OnClickListenerC2643q0(r2));
            String q = this.f8801Z.mo8193q("language", "device");
            if (q.equals("device")) {
                q = Locale.getDefault().getLanguage().toLowerCase();
            }
            q.hashCode();
            Switch r22 = (Switch) F0.findViewById(R.id.wifi_only_key);
            r22.setTextColor(this.f8808g0.f9409e);
            r22.setChecked(this.f8801Z.mo8180c("wifi_only", true));
            ConstraintLayout constraintLayout2 = (ConstraintLayout) F0.findViewById(R.id.wifi_only_cb);
            C2553q3.m11131q(constraintLayout2);
            constraintLayout2.setOnClickListener(new View$OnClickListenerC2645r0(r22, c0));
            ((TextView) F0.findViewById(R.id.hiq_covers)).setTextColor(this.f8808g0.f9409e);
            String[] strArr = new String[3];
            strArr[2] = c0.getString(R.string.high_quality);
            strArr[1] = c0.getString(R.string.medium_quality);
            strArr[0] = c0.getString(R.string.low_quality);
            ArrayAdapter arrayAdapter = new ArrayAdapter(c0, 17367048, strArr);
            arrayAdapter.setDropDownViewResource(17367049);
            String q2 = this.f8801Z.mo8193q("image_quality", "low");
            q2.hashCode();
            char c = 65535;
            switch (q2.hashCode()) {
                case -1078030475:
                    if (q2.equals("medium")) {
                        c = 0;
                        break;
                    }
                    break;
                case 107348:
                    if (q2.equals("low")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3202466:
                    if (q2.equals("high")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                default:
                    i = 1;
                    break;
                case 1:
                    i = 0;
                    break;
                case 2:
                    i = 2;
                    break;
            }
            Spinner spinner = (Spinner) F0.findViewById(R.id.image_quality_spinner);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setSelection(i);
            spinner.setOnItemSelectedListener(new C2649s0());
            ((TextView) F0.findViewById(R.id.cover_storage)).setTextColor(this.f8808g0.f9409e);
            TextView textView = (TextView) F0.findViewById(R.id.storage_path);
            textView.setText(C2185a4.m9678h(c0));
            File[] b = C2372h2.m10298b(c0);
            boolean z = (b == null || b.length <= 1 || b[1] == null) ? false : true;
            String[] strArr2 = new String[(z ? 4 : 3)];
            strArr2[0] = "-------";
            strArr2[1] = c0.getString(R.string.other_folder);
            strArr2[2] = c0.getString(R.string.internalSource);
            if (z) {
                strArr2[3] = c0.getString(R.string.external);
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(c0, 17367048, strArr2);
            arrayAdapter2.setDropDownViewResource(17367049);
            Spinner spinner2 = (Spinner) F0.findViewById(R.id.storage_spinner);
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
            spinner2.setSelection(0);
            spinner2.setTag(new Integer(0));
            spinner2.setOnItemSelectedListener(new C2589a(spinner2, c0, textView));
            TextView textView2 = (TextView) F0.findViewById(R.id.refresh_images);
            textView2.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2596b(c0));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: w3 */
    private void m11298w3() {
        TextView textView = (TextView) mo2505F0().findViewById(R.id.device);
        textView.setTextColor(this.f8808g0.f9410f);
        C2553q3.m11131q(textView);
        textView.setOnClickListener(new View$OnClickListenerC2656v0(R.id.device, R.id.device_arrow, R.string.device_options, R.id.device_settings, this.f8801Z.mo8197u() ? R.id.overscan_spinner : R.id.orientation_spinner, R.id.info));
    }

    /* renamed from: x3 */
    private void m11299x3() {
        View F0;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (F0 = mo2505F0()) != null) {
            TextView textView = (TextView) F0.findViewById(R.id.edit_storage);
            textView.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView);
            textView.setNextFocusUpId(this.f8801Z.mo8197u() ? R.id.overscan_spinner : R.id.orientation_spinner);
            textView.setOnClickListener(new View$OnClickListenerC2653u());
            if (this.f8801Z.mo8197u()) {
                F0.findViewById(R.id.orientation_block).setVisibility(8);
            } else {
                ((TextView) F0.findViewById(R.id.orientation)).setTextColor(this.f8808g0.f9409e);
                ArrayAdapter arrayAdapter = new ArrayAdapter(c0, 17367048, new String[]{c0.getString(R.string.auto), c0.getString(R.string.landscape), c0.getString(R.string.portrait), c0.getString(R.string.smartboy)});
                arrayAdapter.setDropDownViewResource(17367049);
                int l = this.f8801Z.mo8188l("orientation", 0);
                Spinner spinner = (Spinner) F0.findViewById(R.id.orientation_spinner);
                spinner.setEnabled(!this.f8801Z.mo8197u());
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                spinner.setSelection(l);
                spinner.setTag(Integer.valueOf(l));
                spinner.setOnItemSelectedListener(new C2655v(spinner));
            }
            if (!this.f8801Z.mo8197u()) {
                F0.findViewById(R.id.overscan_block).setVisibility(8);
            } else {
                ((TextView) F0.findViewById(R.id.overscan)).setTextColor(this.f8808g0.f9409e);
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(c0, 17367048, new String[]{"0%", "2.5%", "5%"});
                arrayAdapter2.setDropDownViewResource(17367049);
                int l2 = this.f8801Z.mo8188l("overscan", 0);
                Spinner spinner2 = (Spinner) F0.findViewById(R.id.overscan_spinner);
                spinner2.setEnabled(this.f8801Z.mo8197u());
                spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
                spinner2.setSelection(l2);
                spinner2.setTag(Integer.valueOf(l2));
                spinner2.setOnItemSelectedListener(new C2662y(spinner2));
            }
            if (this.f8801Z.mo8197u()) {
                F0.findViewById(R.id.navbar_block).setVisibility(8);
            } else {
                ConstraintLayout constraintLayout = (ConstraintLayout) F0.findViewById(R.id.navbar_block);
                C2553q3.m11131q(constraintLayout);
                SwitchCompat switchCompat = (SwitchCompat) F0.findViewById(R.id.hide_navbar);
                switchCompat.setTextColor(this.f8808g0.f9409e);
                switchCompat.setChecked(this.f8801Z.mo8180c("hide_navbar", false));
                constraintLayout.setOnClickListener(new View$OnClickListenerC2663z(switchCompat, c0));
            }
            TextView textView2 = (TextView) F0.findViewById(R.id.set_temp_storage);
            textView2.setTextColor(this.f8808g0.f9409e);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2591a0());
            ((TextView) F0.findViewById(R.id.temp_cache)).setTextColor(this.f8808g0.f9409e);
            EditText editText = (EditText) F0.findViewById(R.id.cache_edit);
            editText.setText("" + this.f8801Z.mo8188l("game_cache_size", 0));
            editText.addTextChangedListener(new C2599b0(editText));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: y3 */
    private void m11300y3() {
        MainActivity mainActivity = (MainActivity) mo2552c0();
        if (mainActivity != null && !mainActivity.isFinishing() && mo2505F0() != null) {
            try {
                new AsyncTaskC2621l(mainActivity).execute(new Void[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A3 */
    public void mo9040A3() {
        int l = this.f8801Z.mo8188l("num_storage_dirs", 0);
        String[] strArr = new String[l];
        boolean[] zArr = new boolean[l];
        for (int i = 0; i < l; i++) {
            C2219c3 c3Var = this.f8801Z;
            strArr[i] = c3Var.mo8193q("storage_dir" + i, "");
        }
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c());
        aVar.mo238r(R.string.edit_storage_title);
        aVar.mo231k(strArr, zArr, new DialogInterface$OnMultiChoiceClickListenerC2614i0(zArr));
        aVar.mo232l(R.string.add, new DialogInterface$OnClickListenerC2616j0(l));
        aVar.mo235o(R.string.delete, new DialogInterface$OnClickListenerC2619k0(l, zArr, strArr));
        aVar.mo233m(R.string.done, null);
        aVar.mo221a().show();
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

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public void mo8407O2() {
        m11300y3();
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
    public void mo8113R2() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null) {
            aVar.mo8302w(false);
        }
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_options, viewGroup, false);
        ((ViewStub) inflate.findViewById(R.id.stub_scanning)).inflate();
        ((ViewStub) inflate.findViewById(R.id.stub_covers)).inflate();
        ((ViewStub) inflate.findViewById(R.id.stub_themes)).inflate();
        ((ViewStub) inflate.findViewById(R.id.stub_app)).inflate();
        ((ViewStub) inflate.findViewById(R.id.stub_interface)).inflate();
        ((ViewStub) inflate.findViewById(R.id.stub_device)).inflate();
        ((ViewStub) inflate.findViewById(R.id.stub_info)).inflate();
        return inflate;
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

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public /* bridge */ /* synthetic */ boolean mo2579k1(MenuItem menuItem) {
        return super.mo2579k1(menuItem);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        View F0 = mo2505F0();
        F0.findViewById(R.id.autoscan_key).setOnClickListener(null);
        F0.findViewById(R.id.startscan_key).setOnClickListener(null);
        F0.findViewById(R.id.autodownload_value).setOnClickListener(null);
        ((Spinner) F0.findViewById(R.id.change_theme_spinner)).setOnItemSelectedListener(null);
        ((Spinner) F0.findViewById(R.id.image_quality_spinner)).setOnItemSelectedListener(null);
        F0.findViewById(R.id.privacy).setOnClickListener(null);
        F0.findViewById(R.id.faq).setOnClickListener(null);
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
        View F0 = mo2505F0();
        if (F0 != null) {
            C1151o.m6329a((ConstraintLayout) F0);
            mo8895L2(F0.findViewById(R.id.scroll_area));
            F0.post(new RunnableC2618k());
            new Handler().postDelayed(new RunnableC2657w(), 10);
            this.f8810i0 = true;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ String mo8126s2() {
        return super.mo8126s2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s3 */
    public boolean mo9041s3() {
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing()) {
            C2185a4.m9687q(c0);
            if (!this.f8801Z.mo8191o() && !this.f8801Z.mo8186i()) {
                return true;
            }
            new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(R.string.wait_services).mo235o(R.string.ok, null).mo221a().show();
            C2185a4.m9670H(c0);
        }
        return false;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public /* bridge */ /* synthetic */ void mo2605t1() {
        super.mo2605t1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "options";
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

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z3 */
    public void mo9042z3(Activity activity) {
        SQLiteDatabase c = this.f8802a0.mo9325c();
        c.execSQL("UPDATE rompaths SET selected=0 WHERE system='ignore'");
        Cursor rawQuery = c.rawQuery("SELECT _id,path,selected FROM rompaths WHERE system='ignore' ORDER BY path", null);
        ArrayList arrayList = new ArrayList();
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c());
        aVar.mo238r(R.string.ignore_paths);
        aVar.mo230j(rawQuery, "selected", "path", new DialogInterface$OnMultiChoiceClickListenerC2623l0(arrayList, rawQuery, c));
        aVar.mo235o(R.string.delete, null);
        aVar.mo232l(R.string.add, null);
        aVar.mo233m(R.string.done, null);
        DialogInterfaceC0068b a = aVar.mo221a();
        this.f8987r0 = a;
        a.setOnShowListener(new DialogInterface$OnShowListenerC2625m0(arrayList, rawQuery, c));
        this.f8987r0.show();
    }
}
