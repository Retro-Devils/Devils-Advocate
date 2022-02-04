package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.android.billingclient.api.AbstractC1569b;
import com.android.billingclient.api.AbstractC1571c;
import com.android.billingclient.api.AbstractC1577e;
import com.android.billingclient.api.AbstractC1585h;
import com.android.billingclient.api.AbstractC1590j;
import com.android.billingclient.api.C1566a;
import com.android.billingclient.api.C1579f;
import com.android.billingclient.api.C1582g;
import com.android.billingclient.api.C1587i;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.digdroid.alman.dig.C2295f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.d0 */
public class C2223d0 implements AbstractC1585h {

    /* renamed from: a */
    private static C2223d0 f7968a;

    /* renamed from: b */
    private int[] f7969b = {0, 2, 4, 6, 5, 7, 8, 10, 11, 15, 16, 19, 20, 17, 12};

    /* renamed from: c */
    private int[] f7970c = {R.string.voice_search, R.string.widgets, R.string.search_cover, R.string.merged_sets, R.string.edit_genres, R.string.system_types, R.string.cloned_systems, R.string.edit_game_info, R.string.game_notes, R.string.gamepad_bindings, R.string.collections, R.string.kiosk, R.string.preview_pane, R.string.select_random, R.string.ignore_files};

    /* renamed from: d */
    HashSet<String> f7971d = new HashSet<>();

    /* renamed from: e */
    private boolean[] f7972e;

    /* renamed from: f */
    private int[] f7973f;

    /* renamed from: g */
    private C2492n f7974g = null;

    /* renamed from: h */
    private boolean f7975h = false;

    /* renamed from: i */
    public boolean f7976i = false;

    /* renamed from: j */
    String f7977j = null;

    /* renamed from: k */
    String f7978k = null;

    /* renamed from: l */
    AbstractC1571c f7979l = null;

    /* renamed from: m */
    Activity f7980m;

    /* renamed from: n */
    String f7981n = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$a */
    public class C2224a implements AbstractC1569b {
        C2224a() {
        }

        @Override // com.android.billingclient.api.AbstractC1569b
        /* renamed from: a */
        public void mo6909a(C1582g gVar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$b */
    public class C2225b implements C2295f.AbstractC2302g {

        /* renamed from: a */
        final /* synthetic */ AbstractC2248r f7983a;

        /* renamed from: b */
        final /* synthetic */ Activity f7984b;

        C2225b(AbstractC2248r rVar, Activity activity) {
            this.f7983a = rVar;
            this.f7984b = activity;
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: a */
        public void mo7913a() {
            C2223d0.this.m9874m(this.f7984b, this.f7983a);
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: b */
        public void mo7914b() {
            C2223d0.this.f7975h = true;
            this.f7983a.mo7931a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$c */
    public class C2226c implements AbstractC2247q {

        /* renamed from: a */
        final /* synthetic */ AbstractC2248r f7986a;

        /* renamed from: b */
        final /* synthetic */ Activity f7987b;

        /* renamed from: com.digdroid.alman.dig.d0$c$a */
        class C2227a implements AbstractC1590j {
            C2227a() {
            }

            @Override // com.android.billingclient.api.AbstractC1590j
            /* renamed from: a */
            public void mo6956a(C1582g gVar, List<SkuDetails> list) {
                if (gVar.mo6942a() == 0 && list != null) {
                    for (SkuDetails skuDetails : list) {
                        String b = skuDetails.mo6896b();
                        if ("unlock_features".equals(b)) {
                            C2223d0.this.f7977j = skuDetails.mo6895a();
                        } else if ("features12".equals(b)) {
                            C2223d0.this.f7978k = skuDetails.mo6895a();
                        }
                    }
                }
            }
        }

        C2226c(AbstractC2248r rVar, Activity activity) {
            this.f7986a = rVar;
            this.f7987b = activity;
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2247q
        /* renamed from: a */
        public void mo8220a() {
            List<Purchase> b;
            AbstractC1571c cVar = C2223d0.this.f7979l;
            if (cVar == null) {
                this.f7986a.mo7931a();
                return;
            }
            Purchase.C1564a f = cVar.mo6915f("inapp");
            if (!(f == null || f.mo6894c() != 0 || (b = f.mo6893b()) == null)) {
                for (Purchase purchase : b) {
                    C2223d0.this.mo8219z(this.f7987b, purchase);
                }
            }
            this.f7986a.mo7931a();
            C2223d0 d0Var = C2223d0.this;
            if (!(d0Var.f7979l == null || d0Var.f7975h)) {
                C2223d0 d0Var2 = C2223d0.this;
                if (d0Var2.f7977j == null || d0Var2.f7978k == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("unlock_features");
                    arrayList.add("features12");
                    C1587i.C1588a c = C1587i.m7719c();
                    if (c != null) {
                        c.mo6953b(arrayList).mo6954c("inapp");
                        C2223d0.this.f7979l.mo6916g(c.mo6952a(), new C2227a());
                    }
                }
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2247q
        /* renamed from: b */
        public void mo8221b(int i) {
            this.f7986a.mo7931a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$d */
    public class DialogInterface$OnClickListenerC2228d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f7990b;

        DialogInterface$OnClickListenerC2228d(Activity activity) {
            this.f7990b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2223d0.this.mo8210H(this.f7990b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$e */
    public class C2229e implements AbstractC2247q {

        /* renamed from: a */
        final /* synthetic */ Activity f7992a;

        /* renamed from: com.digdroid.alman.dig.d0$e$a */
        class C2230a implements AbstractC1590j {
            C2230a() {
            }

            @Override // com.android.billingclient.api.AbstractC1590j
            /* renamed from: a */
            public void mo6956a(C1582g gVar, List<SkuDetails> list) {
                if (gVar.mo6942a() != 0) {
                    C2229e eVar = C2229e.this;
                    C2223d0.this.m9873k(eVar.f7992a, gVar.mo6942a(), "unlock_features");
                } else if (list != null) {
                    for (SkuDetails skuDetails : list) {
                        if ("unlock_features".equals(skuDetails.mo6896b())) {
                            C2223d0.this.f7977j = skuDetails.mo6895a();
                            C1579f a = C1579f.m7690e().mo6940b(skuDetails).mo6939a();
                            C2229e eVar2 = C2229e.this;
                            C2223d0.this.f7979l.mo6914d(eVar2.f7992a, a);
                        }
                    }
                }
            }
        }

        C2229e(Activity activity) {
            this.f7992a = activity;
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2247q
        /* renamed from: a */
        public void mo8220a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("unlock_features");
            C2223d0.this.f7981n = "unlock_features";
            C1587i.C1588a c = C1587i.m7719c();
            c.mo6953b(arrayList).mo6954c("inapp");
            AbstractC1571c cVar = C2223d0.this.f7979l;
            if (cVar != null) {
                cVar.mo6916g(c.mo6952a(), new C2230a());
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2247q
        /* renamed from: b */
        public void mo8221b(int i) {
            C2223d0.this.m9873k(this.f7992a, i, "unlock_features");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$f */
    public class DialogInterface$OnMultiChoiceClickListenerC2231f implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f7995a;

        DialogInterface$OnMultiChoiceClickListenerC2231f(boolean[] zArr) {
            this.f7995a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f7995a[i] = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$g */
    public class DialogInterface$OnShowListenerC2232g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterfaceC0068b f7997a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f7998b;

        /* renamed from: c */
        final /* synthetic */ int[] f7999c;

        /* renamed from: d */
        final /* synthetic */ int f8000d;

        /* renamed from: e */
        final /* synthetic */ AbstractC2250t f8001e;

        /* renamed from: f */
        final /* synthetic */ Activity f8002f;

        /* renamed from: g */
        final /* synthetic */ String f8003g;

        /* renamed from: com.digdroid.alman.dig.d0$g$a */
        class View$OnClickListenerC2233a implements View.OnClickListener {
            View$OnClickListenerC2233a() {
            }

            public void onClick(View view) {
                DialogInterface$OnShowListenerC2232g gVar;
                int i = 0;
                String str = "";
                int i2 = 0;
                while (true) {
                    gVar = DialogInterface$OnShowListenerC2232g.this;
                    boolean[] zArr = gVar.f7998b;
                    if (i >= zArr.length) {
                        break;
                    }
                    if (zArr[i]) {
                        if (!str.equals("")) {
                            str = str + ",";
                        }
                        str = str + DialogInterface$OnShowListenerC2232g.this.f7999c[i];
                        i2++;
                    }
                    i++;
                }
                if (i2 == gVar.f8000d) {
                    gVar.f7997a.dismiss();
                    DialogInterface$OnShowListenerC2232g.this.f8001e.mo8233b(str);
                    return;
                }
                new DialogInterfaceC0068b.C0069a(gVar.f8002f, C2553q3.m11117c()).mo229i(DialogInterface$OnShowListenerC2232g.this.f8003g).mo235o(R.string.ok, null).mo221a().show();
            }
        }

        /* renamed from: com.digdroid.alman.dig.d0$g$b */
        class View$OnClickListenerC2234b implements View.OnClickListener {
            View$OnClickListenerC2234b() {
            }

            public void onClick(View view) {
                DialogInterface$OnShowListenerC2232g.this.f7997a.dismiss();
                DialogInterface$OnShowListenerC2232g.this.f8001e.mo8232a();
            }
        }

        DialogInterface$OnShowListenerC2232g(DialogInterfaceC0068b bVar, boolean[] zArr, int[] iArr, int i, AbstractC2250t tVar, Activity activity, String str) {
            this.f7997a = bVar;
            this.f7998b = zArr;
            this.f7999c = iArr;
            this.f8000d = i;
            this.f8001e = tVar;
            this.f8002f = activity;
            this.f8003g = str;
        }

        public void onShow(DialogInterface dialogInterface) {
            this.f7997a.mo215e(-1).setOnClickListener(new View$OnClickListenerC2233a());
            this.f7997a.mo215e(-2).setOnClickListener(new View$OnClickListenerC2234b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$h */
    public class View$OnClickListenerC2235h implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f8007b;

        /* renamed from: c */
        final /* synthetic */ CheckBox f8008c;

        /* renamed from: d */
        final /* synthetic */ Activity f8009d;

        View$OnClickListenerC2235h(int i, CheckBox checkBox, Activity activity) {
            this.f8007b = i;
            this.f8008c = checkBox;
            this.f8009d = activity;
        }

        public void onClick(View view) {
            C2492n nVar = C2223d0.this.f7974g;
            nVar.mo8782s("not_again" + this.f8007b, this.f8008c.isChecked() ? "1" : "0");
            C2223d0.this.m9861A(this.f8009d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$i */
    public class DialogInterface$OnClickListenerC2236i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f8011b;

        DialogInterface$OnClickListenerC2236i(Activity activity) {
            this.f8011b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2223d0.this.mo8211j(this.f8011b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$j */
    public class DialogInterface$OnClickListenerC2237j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f8013b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2249s f8014c;

        /* renamed from: d */
        final /* synthetic */ Activity f8015d;

        /* renamed from: com.digdroid.alman.dig.d0$j$a */
        class DialogInterface$OnClickListenerC2238a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2238a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface$OnClickListenerC2237j.this.f8014c.mo7941a();
            }
        }

        DialogInterface$OnClickListenerC2237j(int i, AbstractC2249s sVar, Activity activity) {
            this.f8013b = i;
            this.f8014c = sVar;
            this.f8015d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C2223d0.this.m9878u(this.f8013b)) {
                this.f8014c.mo7942b();
            } else {
                new DialogInterfaceC0068b.C0069a(this.f8015d, C2553q3.m11117c()).mo228h(R.string.trial_notice).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2238a()).mo224d(false).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$k */
    public class DialogInterface$OnClickListenerC2239k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f8018b;

        /* renamed from: c */
        final /* synthetic */ int f8019c;

        /* renamed from: d */
        final /* synthetic */ boolean f8020d;

        /* renamed from: e */
        final /* synthetic */ String f8021e;

        /* renamed from: f */
        final /* synthetic */ int f8022f;

        /* renamed from: g */
        final /* synthetic */ AbstractC2249s f8023g;

        /* renamed from: com.digdroid.alman.dig.d0$k$a */
        class C2240a implements AbstractC2250t {

            /* renamed from: com.digdroid.alman.dig.d0$k$a$a */
            class DialogInterface$OnClickListenerC2241a implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2241a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterface$OnClickListenerC2239k.this.f8023g.mo7941a();
                }
            }

            C2240a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2250t
            /* renamed from: a */
            public void mo8232a() {
                DialogInterface$OnClickListenerC2239k kVar = DialogInterface$OnClickListenerC2239k.this;
                if (C2223d0.this.m9878u(kVar.f8022f)) {
                    DialogInterface$OnClickListenerC2239k.this.f8023g.mo7942b();
                } else {
                    new DialogInterfaceC0068b.C0069a(DialogInterface$OnClickListenerC2239k.this.f8018b, C2553q3.m11117c()).mo228h(R.string.trial_notice).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2241a()).mo224d(false).mo221a().show();
                }
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2250t
            /* renamed from: b */
            public void mo8233b(String str) {
                DialogInterface$OnClickListenerC2239k kVar = DialogInterface$OnClickListenerC2239k.this;
                C2223d0.this.m9875o(str, kVar.f8020d);
                C2223d0.this.f7974g.mo8782s(DialogInterface$OnClickListenerC2239k.this.f8021e, str);
                DialogInterface$OnClickListenerC2239k kVar2 = DialogInterface$OnClickListenerC2239k.this;
                C2223d0.this.m9861A(kVar2.f8018b);
                DialogInterface$OnClickListenerC2239k kVar3 = DialogInterface$OnClickListenerC2239k.this;
                C2223d0.this.mo8215r(kVar3.f8018b, kVar3.f8022f, kVar3.f8023g);
            }
        }

        DialogInterface$OnClickListenerC2239k(Activity activity, int i, boolean z, String str, int i2, AbstractC2249s sVar) {
            this.f8018b = activity;
            this.f8019c = i;
            this.f8020d = z;
            this.f8021e = str;
            this.f8022f = i2;
            this.f8023g = sVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2223d0.this.mo8207B(this.f8018b, this.f8019c, new C2240a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$l */
    public class View$OnClickListenerC2242l implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f8027b;

        /* renamed from: c */
        final /* synthetic */ CheckBox f8028c;

        /* renamed from: d */
        final /* synthetic */ Activity f8029d;

        View$OnClickListenerC2242l(int i, CheckBox checkBox, Activity activity) {
            this.f8027b = i;
            this.f8028c = checkBox;
            this.f8029d = activity;
        }

        public void onClick(View view) {
            C2492n nVar = C2223d0.this.f7974g;
            nVar.mo8782s("not_again" + this.f8027b, this.f8028c.isChecked() ? "1" : "0");
            C2223d0.this.m9861A(this.f8029d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$m */
    public class DialogInterface$OnClickListenerC2243m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f8031b;

        DialogInterface$OnClickListenerC2243m(Activity activity) {
            this.f8031b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2223d0.this.mo8211j(this.f8031b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$n */
    public class DialogInterface$OnClickListenerC2244n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f8033b;

        DialogInterface$OnClickListenerC2244n(Activity activity) {
            this.f8033b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2223d0.this.mo8210H(this.f8033b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$o */
    public class DialogInterface$OnClickListenerC2245o implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ boolean f8035b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2249s f8036c;

        DialogInterface$OnClickListenerC2245o(boolean z, AbstractC2249s sVar) {
            this.f8035b = z;
            this.f8036c = sVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f8035b) {
                this.f8036c.mo7942b();
            } else {
                this.f8036c.mo7941a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$p */
    public class C2246p implements AbstractC1577e {

        /* renamed from: a */
        final /* synthetic */ AbstractC2247q f8038a;

        C2246p(AbstractC2247q qVar) {
            this.f8038a = qVar;
        }

        @Override // com.android.billingclient.api.AbstractC1577e
        /* renamed from: a */
        public void mo6927a() {
            C2223d0.this.mo8213n();
        }

        @Override // com.android.billingclient.api.AbstractC1577e
        /* renamed from: b */
        public void mo6928b(C1582g gVar) {
            if (gVar.mo6942a() != 0) {
                if (gVar.mo6942a() == 3) {
                    C2223d0.this.f7975h = true;
                } else {
                    this.f8038a.mo8221b(gVar.mo6942a());
                    return;
                }
            }
            try {
                this.f8038a.mo8220a();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$q */
    public interface AbstractC2247q {
        /* renamed from: a */
        void mo8220a();

        /* renamed from: b */
        void mo8221b(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$r */
    public interface AbstractC2248r {
        /* renamed from: a */
        void mo7931a();
    }

    /* renamed from: com.digdroid.alman.dig.d0$s */
    public interface AbstractC2249s {
        /* renamed from: a */
        void mo7941a();

        /* renamed from: b */
        void mo7942b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.d0$t */
    public interface AbstractC2250t {
        /* renamed from: a */
        void mo8232a();

        /* renamed from: b */
        void mo8233b(String str);
    }

    private C2223d0() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: A */
    private synchronized void m9861A(Context context) {
        C2492n nVar = this.f7974g;
        nVar.mo8781r(context.getFilesDir() + "/" + "features.cfg");
    }

    /* renamed from: C */
    private void m9862C(Activity activity, int i, boolean z, int i2, String str, AbstractC2249s sVar) {
        String str2;
        if (!this.f7974g.mo8772i("not_again" + i).equals("1") || m9878u(i)) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f7969b;
                if (i4 >= iArr.length) {
                    str2 = "";
                    break;
                } else if (iArr[i4] == i) {
                    str2 = "\"" + activity.getString(this.f7970c[i4]) + "\" ";
                    break;
                } else {
                    i4++;
                }
            }
            String replace = ((str2 + activity.getString(R.string.is_premium)) + activity.getString(R.string.choose_free)).replace("3", "" + i2);
            View inflate = activity.getLayoutInflater().inflate(R.layout.not_again, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.message);
            textView.setTextColor(C2553q3.m11116b());
            textView.setText(replace);
            C2553q3.m11133s((TextView) inflate.findViewById(R.id.not_again));
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.not_again);
            checkBox.setOnClickListener(new View$OnClickListenerC2235h(i, checkBox, activity));
            if (m9878u(i)) {
                i3 = 8;
            }
            checkBox.setVisibility(i3);
            new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo240t(inflate).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2239k(activity, i2, z, str, i, sVar)).mo232l(R.string.later, new DialogInterface$OnClickListenerC2237j(i, sVar, activity)).mo233m(R.string.upgrade_option, new DialogInterface$OnClickListenerC2236i(activity)).mo221a().show();
            return;
        }
        sVar.mo7941a();
    }

    /* renamed from: D */
    private synchronized void m9863D(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(System.currentTimeMillis() - 1702967296);
        this.f7974g.mo8782s("trial_ends" + i, sb.toString());
    }

    /* renamed from: E */
    private synchronized void m9864E(int i, int i2) {
        this.f7974g.mo8782s("premium" + i, "" + i2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9873k(android.app.Activity r7, int r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2223d0.m9873k(android.app.Activity, int, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private void m9874m(Activity activity, AbstractC2248r rVar) {
        if (!(activity == null || activity.isFinishing())) {
            m9880x(activity);
            if (this.f7974g.mo8772i("unlock_features_purchased").equals("true")) {
                this.f7975h = true;
                this.f7971d.add("unlock_features");
                rVar.mo7931a();
                return;
            }
            String[] strArr = {"features12", "features34", "features56", "features78", "features910"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                C2492n nVar = this.f7974g;
                if (nVar.mo8772i(str + "_purchased").equals("true")) {
                    this.f7975h = true;
                    this.f7971d.add(str);
                    m9875o(this.f7974g.mo8772i(str), false);
                }
            }
            mo8209G(activity, new C2226c(rVar, activity));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private int m9875o(String str, boolean z) {
        if (str.equals("")) {
            if (z) {
                this.f7973f = new int[0];
            }
            return 0;
        }
        String[] split = str.split(",");
        if (split == null) {
            split = new String[0];
        }
        if (z) {
            this.f7973f = new int[split.length];
        }
        for (int i = 0; i < split.length; i++) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                if (z) {
                    this.f7973f[i] = parseInt;
                }
                this.f7972e[parseInt] = true;
            } catch (Exception unused) {
                if (z) {
                    this.f7973f[i] = -1;
                }
            }
        }
        return split.length;
    }

    /* renamed from: p */
    public static synchronized C2223d0 m9876p() {
        C2223d0 d0Var;
        synchronized (C2223d0.class) {
            if (f7968a == null) {
                f7968a = new C2223d0();
            }
            d0Var = f7968a;
        }
        return d0Var;
    }

    /* renamed from: t */
    private void m9877t(Activity activity, int i, AbstractC2249s sVar) {
        String str;
        boolean u = m9878u(i);
        if (!u) {
            if (this.f7974g.mo8772i("not_again" + i).equals("1")) {
                sVar.mo7941a();
                return;
            }
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f7969b;
            if (i2 >= iArr.length) {
                str = "";
                break;
            } else if (iArr[i2] == i) {
                str = "\"" + activity.getString(this.f7970c[i2]) + "\" ";
                break;
            } else {
                i2++;
            }
        }
        String str2 = str + activity.getString(R.string.is_premium);
        if (!u) {
            str2 = str2 + activity.getString(R.string.free_trial2);
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.not_again, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setTextColor(C2553q3.m11116b());
        textView.setText(str2);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.not_again);
        if (!u) {
            C2553q3.m11133s(checkBox);
            checkBox.setOnClickListener(new View$OnClickListenerC2242l(i, checkBox, activity));
        } else {
            checkBox.setVisibility(8);
        }
        DialogInterfaceC0068b.C0069a m = new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo240t(inflate).mo235o(R.string.ok, null).mo233m(R.string.upgrade_option, new DialogInterface$OnClickListenerC2243m(activity));
        if (!this.f7976i) {
            m.mo232l(R.string.unlockall, new DialogInterface$OnClickListenerC2244n(activity));
        }
        m.mo233m(R.string.notnow, new DialogInterface$OnClickListenerC2245o(u, sVar));
        m.mo221a().show();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: u */
    private synchronized boolean m9878u(int i) {
        C2492n nVar = this.f7974g;
        String i2 = nVar.mo8772i("trial_ends" + i);
        boolean z = false;
        if (i2.equals("")) {
            return false;
        }
        if (System.currentTimeMillis() > Long.parseLong(i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: w */
    private synchronized boolean m9879w(int i) {
        C2492n nVar;
        nVar = this.f7974g;
        return nVar.mo8772i("premium" + i).equals("1");
    }

    /* renamed from: x */
    private synchronized void m9880x(Context context) {
        if (this.f7974g == null) {
            C2492n nVar = new C2492n(context);
            this.f7974g = nVar;
            nVar.mo8774k(C2399i2.m10374d(context, context.getFilesDir() + "/" + "features.cfg"));
            this.f7972e = new boolean[21];
            int i = 0;
            for (int i2 = 0; i2 < 21; i2++) {
                this.f7972e[i2] = false;
            }
            boolean z = false;
            while (true) {
                int[] iArr = this.f7969b;
                if (i >= iArr.length) {
                    break;
                }
                if (!m9879w(iArr[i])) {
                    m9863D(this.f7969b[i]);
                    m9864E(this.f7969b[i], 1);
                    z = true;
                }
                i++;
            }
            if (z) {
                m9861A(context);
            }
            m9875o(this.f7974g.mo8772i("free_features"), true);
        }
    }

    /* renamed from: B */
    public void mo8207B(Activity activity, int i, AbstractC2250t tVar) {
        m9880x(activity);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f7969b;
            if (i2 >= iArr.length) {
                break;
            }
            if (!this.f7972e[iArr[i2]]) {
                i3++;
            }
            i2++;
        }
        String[] strArr = new String[i3];
        int[] iArr2 = new int[i3];
        boolean[] zArr = new boolean[i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr3 = this.f7969b;
            if (i4 < iArr3.length) {
                if (!this.f7972e[iArr3[i4]]) {
                    strArr[i5] = activity.getString(this.f7970c[i4]);
                    iArr2[i5] = this.f7969b[i4];
                    zArr[i5] = false;
                    i5++;
                }
                i4++;
            } else {
                String string = activity.getString(R.string.select_features);
                String replace = string.replace("2", "" + i);
                DialogInterfaceC0068b a = new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo239s(replace).mo231k(strArr, zArr, new DialogInterface$OnMultiChoiceClickListenerC2231f(zArr)).mo235o(R.string.ok, null).mo232l(R.string.cancel, null).mo224d(false).mo221a();
                a.setOnShowListener(new DialogInterface$OnShowListenerC2232g(a, zArr, iArr2, i, tVar, activity, replace));
                a.show();
                return;
            }
        }
    }

    /* renamed from: F */
    public void mo8208F(Context context, JSONArray jSONArray) {
        boolean[] zArr = new boolean[21];
        for (int i = 0; i < 21; i++) {
            zArr[i] = false;
        }
        m9880x(context);
        boolean z = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                int i3 = jSONArray.getInt(i2);
                zArr[i3] = true;
                if (!m9879w(i3)) {
                    m9863D(i3);
                    m9864E(i3, 1);
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        for (int i4 = 0; i4 < 21; i4++) {
            if (!zArr[i4] && m9879w(i4)) {
                m9864E(i4, 0);
                z = true;
            }
        }
        if (z) {
            m9861A(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo8209G(Activity activity, AbstractC2247q qVar) {
        AbstractC1571c cVar = this.f7979l;
        if (cVar == null || !cVar.mo6913c()) {
            mo8213n();
            AbstractC1571c a = AbstractC1571c.m7638e(activity).mo6920c(this).mo6919b().mo6918a();
            this.f7979l = a;
            a.mo6917h(new C2246p(qVar));
            return;
        }
        try {
            qVar.mo8220a();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo8210H(Activity activity) {
        this.f7980m = activity;
        mo8209G(activity, new C2229e(activity));
    }

    @Override // com.android.billingclient.api.AbstractC1585h
    /* renamed from: a */
    public void mo6947a(C1582g gVar, List<Purchase> list) {
        if (gVar.mo6942a() != 0) {
            m9873k(this.f7980m, gVar.mo6942a(), this.f7981n);
        } else if (list != null) {
            for (Purchase purchase : list) {
                mo8219z(this.f7980m, purchase);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8211j(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo229i(activity.getString(R.string.upgrade_confirm).replace("$4", mo8214q())).mo232l(R.string.notnow, null).mo235o(R.string.upgrade, new DialogInterface$OnClickListenerC2228d(activity)).mo221a().show();
        }
    }

    /* renamed from: l */
    public void mo8212l(Activity activity, AbstractC2248r rVar) {
        if (this.f7975h) {
            rVar.mo7931a();
            return;
        }
        m9880x(activity);
        if (this.f7974g.mo8772i("developer_error").equals("1")) {
            C2295f.m10150g(activity, new C2225b(rVar, activity)).mo8412d();
        } else {
            m9874m(activity, rVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo8213n() {
        AbstractC1571c cVar = this.f7979l;
        if (cVar != null) {
            try {
                cVar.mo6912b();
            } catch (Exception unused) {
            }
        }
        this.f7979l = null;
    }

    /* renamed from: q */
    public String mo8214q() {
        String str = this.f7977j;
        return str == null ? "US $4" : str;
    }

    /* renamed from: r */
    public void mo8215r(Activity activity, int i, AbstractC2249s sVar) {
        mo8216s(activity, i, sVar, false);
    }

    /* renamed from: s */
    public void mo8216s(Activity activity, int i, AbstractC2249s sVar, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            if (Build.VERSION.SDK_INT < 16 || this.f7975h) {
                sVar.mo7941a();
                return;
            }
            m9880x(activity);
            if (!m9879w(i) || this.f7972e[i]) {
                sVar.mo7941a();
            } else if (z) {
                if (m9878u(i)) {
                    sVar.mo7942b();
                } else {
                    sVar.mo7941a();
                }
            } else if (this.f7973f.length == 0) {
                m9862C(activity, i, true, 3, "free_features", sVar);
            } else {
                m9877t(activity, i, sVar);
            }
        }
    }

    /* renamed from: v */
    public boolean mo8217v() {
        return this.f7975h;
    }

    /* renamed from: y */
    public void mo8218y() {
        mo8213n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo8219z(Activity activity, Purchase purchase) {
        if (purchase.mo6884c() == 1) {
            String f = purchase.mo6888f();
            this.f7971d.add(f);
            m9880x(activity);
            C2492n nVar = this.f7974g;
            if (!nVar.mo8772i(f + "_purchased").equals("true")) {
                C2492n nVar2 = this.f7974g;
                nVar2.mo8782s(f + "_purchased", "true");
                m9861A(activity);
            }
            if (f.equals("unlock_features")) {
                this.f7975h = true;
            }
            this.f7975h = true;
            if (!purchase.mo6889g()) {
                if (!f.equals("unlock_features")) {
                    m9875o(this.f7974g.mo8772i(f), false);
                    this.f7976i = true;
                }
                this.f7979l.mo6911a(C1566a.m7632b().mo6908b(purchase.mo6885d()).mo6907a(), new C2224a());
            } else if (!f.equals("unlock_features")) {
                String a = purchase.mo6882a();
                if (a == null || a.equals("")) {
                    m9875o(this.f7974g.mo8772i(f), false);
                } else if (m9875o(a, false) > 0) {
                    this.f7974g.mo8782s(f, a);
                    m9861A(activity);
                }
                this.f7976i = true;
            }
            if (this.f7971d.contains("features910")) {
                this.f7975h = true;
            }
        }
    }
}
