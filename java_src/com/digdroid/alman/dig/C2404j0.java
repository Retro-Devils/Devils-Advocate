package com.digdroid.alman.dig;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.C0248l0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.C0398a;
import androidx.fragment.app.ActivityC0447d;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.bumptech.glide.p143s.C2067d;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2465m0;
import com.digdroid.alman.dig.C2515o2;
import com.digdroid.alman.dig.C2749t1;
import com.digdroid.alman.dig.C2828w2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;
import p006b.p007a.p014o.C0788d;

/* renamed from: com.digdroid.alman.dig.j0 */
public class C2404j0 extends AbstractC2531p1 {

    /* renamed from: n0 */
    static int[] f8401n0 = {R.string.play_videos, R.string.play_videos_mobile, R.string.box_cover, R.string.screenshot, R.string.file_path, R.string.rating, R.string.genres, R.string.game_info, R.string.published_by, R.string.developed_by, R.string.released, R.string.comments, R.string.collections};

    /* renamed from: o0 */
    static boolean[] f8402o0 = {false, false, true, true, true, true, true, true, true, true, true, true, true};

    /* renamed from: p0 */
    static String[] f8403p0 = {"game_play_videos", "game_play_videos_mobile", "show_cover", "show_screenshot", "show_file", "show_rating", "show_genres", "show_info", "show_publisher", "show_developer", "show_released", "show_comments", "show_collections"};

    /* renamed from: A0 */
    String f8404A0;

    /* renamed from: A1 */
    ScrollView f8405A1;

    /* renamed from: B0 */
    String f8406B0;

    /* renamed from: B1 */
    ViewTreeObserver.OnScrollChangedListener f8407B1 = null;

    /* renamed from: C0 */
    String f8408C0;

    /* renamed from: C1 */
    Handler f8409C1 = null;

    /* renamed from: D0 */
    String f8410D0;

    /* renamed from: D1 */
    boolean f8411D1 = false;

    /* renamed from: E0 */
    String f8412E0;

    /* renamed from: E1 */
    File f8413E1 = null;

    /* renamed from: F0 */
    String f8414F0;

    /* renamed from: F1 */
    Runnable f8415F1 = new RunnableC2405a();

    /* renamed from: G0 */
    String f8416G0;

    /* renamed from: G1 */
    C2515o2 f8417G1 = null;

    /* renamed from: H0 */
    String f8418H0;

    /* renamed from: H1 */
    C2515o2.C2523f f8419H1;

    /* renamed from: I0 */
    String f8420I0;

    /* renamed from: I1 */
    DialogInterfaceC0068b f8421I1 = null;

    /* renamed from: J0 */
    String f8422J0;

    /* renamed from: K0 */
    long f8423K0;

    /* renamed from: L0 */
    long f8424L0;

    /* renamed from: M0 */
    long f8425M0;

    /* renamed from: N0 */
    long f8426N0;

    /* renamed from: O0 */
    long f8427O0;

    /* renamed from: P0 */
    float f8428P0;

    /* renamed from: Q0 */
    int f8429Q0;

    /* renamed from: R0 */
    int f8430R0;

    /* renamed from: S0 */
    int f8431S0;

    /* renamed from: T0 */
    File f8432T0;

    /* renamed from: U0 */
    File f8433U0;

    /* renamed from: V0 */
    boolean f8434V0 = false;

    /* renamed from: W0 */
    boolean f8435W0 = false;

    /* renamed from: X0 */
    String f8436X0;

    /* renamed from: Y0 */
    String f8437Y0;

    /* renamed from: Z0 */
    long f8438Z0 = 0;

    /* renamed from: a1 */
    long f8439a1 = 0;

    /* renamed from: b1 */
    long f8440b1 = 0;

    /* renamed from: c1 */
    long f8441c1 = 0;

    /* renamed from: d1 */
    long f8442d1 = 0;

    /* renamed from: e1 */
    long f8443e1 = 0;

    /* renamed from: f1 */
    C2369h0 f8444f1;

    /* renamed from: g1 */
    ArrayList<C2443z> f8445g1 = new ArrayList<>();

    /* renamed from: h1 */
    String f8446h1 = null;

    /* renamed from: i1 */
    int f8447i1;

    /* renamed from: j1 */
    int f8448j1 = 0;

    /* renamed from: k1 */
    TextView f8449k1;

    /* renamed from: l1 */
    TextView f8450l1;

    /* renamed from: m1 */
    TextView f8451m1;

    /* renamed from: n1 */
    TextView f8452n1;

    /* renamed from: o1 */
    TextView f8453o1;

    /* renamed from: p1 */
    EditText f8454p1;

    /* renamed from: q0 */
    long f8455q0;

    /* renamed from: q1 */
    EditText f8456q1;

    /* renamed from: r0 */
    int f8457r0;

    /* renamed from: r1 */
    EditText f8458r1;

    /* renamed from: s0 */
    String f8459s0;

    /* renamed from: s1 */
    EditText f8460s1;

    /* renamed from: t0 */
    SQLiteDatabase f8461t0;

    /* renamed from: t1 */
    EditText f8462t1;

    /* renamed from: u0 */
    boolean f8463u0;

    /* renamed from: u1 */
    ConstraintLayout f8464u1;

    /* renamed from: v0 */
    boolean f8465v0;

    /* renamed from: v1 */
    RatingBar f8466v1;

    /* renamed from: w0 */
    boolean f8467w0;

    /* renamed from: w1 */
    ImageView f8468w1 = null;

    /* renamed from: x0 */
    boolean f8469x0;

    /* renamed from: x1 */
    ImageView f8470x1 = null;

    /* renamed from: y0 */
    String f8471y0;

    /* renamed from: y1 */
    ImageView f8472y1 = null;

    /* renamed from: z0 */
    String f8473z0;

    /* renamed from: z1 */
    Object f8474z1 = new Object();

    /* renamed from: com.digdroid.alman.dig.j0$a */
    class RunnableC2405a implements Runnable {
        RunnableC2405a() {
        }

        public void run() {
            C2404j0 j0Var = C2404j0.this;
            if (j0Var.f8803j0 && !j0Var.f8463u0) {
                boolean z = !j0Var.f8411D1;
                j0Var.f8411D1 = z;
                File k3 = j0Var.mo8631k3(z);
                C2404j0 j0Var2 = C2404j0.this;
                if (k3 != j0Var2.f8413E1 && !j0Var2.f8806m0.mo8282m()) {
                    C2404j0 j0Var3 = C2404j0.this;
                    j0Var3.f8413E1 = k3;
                    j0Var3.mo8645y3(false);
                }
            }
            C2404j0.this.f8409C1.postDelayed(this, 3000);
        }
    }

    /* renamed from: com.digdroid.alman.dig.j0$a0 */
    public interface AbstractC2406a0 {
        /* renamed from: a */
        void mo8647a(boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$b */
    public class C2407b implements C2515o2.AbstractC2524g {
        C2407b() {
        }

        @Override // com.digdroid.alman.dig.C2515o2.AbstractC2524g
        /* renamed from: a */
        public void mo8648a() {
        }

        @Override // com.digdroid.alman.dig.C2515o2.AbstractC2524g
        /* renamed from: b */
        public boolean mo8649b() {
            return C2404j0.this.f8803j0;
        }

        @Override // com.digdroid.alman.dig.C2515o2.AbstractC2524g
        /* renamed from: c */
        public void mo8650c() {
            C2404j0 j0Var = C2404j0.this;
            long j = j0Var.f8424L0;
            if (j >= 0) {
                ServerService.m9567j(j0Var.f8805l0, j, 463);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$b0 */
    public class AsyncTaskC2408b0 extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        AbstractC2406a0 f8477a;

        public AsyncTaskC2408b0(AbstractC2406a0 a0Var) {
            this.f8477a = a0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            try {
                C2404j0 j0Var = C2404j0.this;
                j0Var.f8437Y0 = C2185a4.m9678h(C2404j0.this.mo2552c0()) + "/Screenshots";
                C2404j0 j0Var2 = C2404j0.this;
                j0Var2.f8436X0 = C2185a4.m9678h(C2404j0.this.mo2552c0()) + "/Covers";
                return Boolean.valueOf(C2404j0.this.mo8630j3());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                try {
                    C2404j0.this.mo8643w3();
                } catch (Exception unused) {
                }
            }
            this.f8477a.mo8647a(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$c */
    public class C2409c implements AbstractC2406a0 {
        C2409c() {
        }

        @Override // com.digdroid.alman.dig.C2404j0.AbstractC2406a0
        /* renamed from: a */
        public void mo8647a(boolean z) {
            if (z) {
                C2404j0.this.mo8642v3();
                C2404j0.this.mo8644x3(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$d */
    public class View$OnClickListenerC2410d implements View.OnClickListener {
        View$OnClickListenerC2410d() {
        }

        public void onClick(View view) {
            C2404j0 j0Var = C2404j0.this;
            int i = j0Var.f8457r0;
            String b = (i != 0 ? i != 1 ? i != 2 ? null : new C2206b2(j0Var.f8798e0.mo9515a(), C2404j0.this.f8794a0.mo9325c()) : new C2323g0() : new C2548p3()).mo8091b(C2404j0.this.f8455q0);
            if (b != null) {
                C2404j0.this.f8806m0.mo8304z(b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$e */
    public class View$OnClickListenerC2411e implements View.OnClickListener {
        View$OnClickListenerC2411e() {
        }

        public void onClick(View view) {
            C2404j0 j0Var = C2404j0.this;
            j0Var.f8806m0.mo8286o0(j0Var.f8455q0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$f */
    public class DialogInterface$OnClickListenerC2412f implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2412f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2404j0.this.mo8641u3();
            C2404j0.this.mo8642v3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$g */
    public class DialogInterface$OnClickListenerC2413g implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2413g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2404j0.this.mo8642v3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$h */
    public class DialogInterface$OnClickListenerC2414h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ boolean[] f8484b;

        DialogInterface$OnClickListenerC2414h(boolean[] zArr) {
            this.f8484b = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 0;
            while (true) {
                String[] strArr = C2404j0.f8403p0;
                if (i2 < strArr.length) {
                    C2404j0.this.f8793Z.mo8152A(strArr[i2], this.f8484b[i2]);
                    i2++;
                } else {
                    C2404j0.this.mo8407O2();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$i */
    public class DialogInterface$OnMultiChoiceClickListenerC2415i implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f8486a;

        /* renamed from: com.digdroid.alman.dig.j0$i$a */
        class DialogInterface$OnClickListenerC2416a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int f8488b;

            DialogInterface$OnClickListenerC2416a(int i) {
                this.f8488b = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface$OnMultiChoiceClickListenerC2415i iVar = DialogInterface$OnMultiChoiceClickListenerC2415i.this;
                iVar.f8486a[this.f8488b] = false;
                C2404j0.this.f8421I1.mo216f().setItemChecked(this.f8488b, false);
            }
        }

        /* renamed from: com.digdroid.alman.dig.j0$i$b */
        class DialogInterface$OnClickListenerC2417b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int f8490b;

            DialogInterface$OnClickListenerC2417b(int i) {
                this.f8490b = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface$OnMultiChoiceClickListenerC2415i.this.f8486a[this.f8490b] = true;
            }
        }

        DialogInterface$OnMultiChoiceClickListenerC2415i(boolean[] zArr) {
            this.f8486a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (!z || C2404j0.f8401n0[i] != R.string.play_videos_mobile) {
                this.f8486a[i] = z;
            } else {
                new DialogInterfaceC0068b.C0069a(C2404j0.this.mo2552c0(), C2553q3.m11117c()).mo224d(false).mo228h(R.string.confirm).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2417b(i)).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2416a(i)).mo221a().show();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.j0$j */
    class C2418j implements C2465m0.AbstractC2488p {

        /* renamed from: a */
        final /* synthetic */ Activity f8492a;

        C2418j(Activity activity) {
            this.f8492a = activity;
        }

        @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
        /* renamed from: a */
        public void mo8663a() {
            C2404j0.this.f8806m0.mo8264R();
            C2404j0.this.mo8106G2(false);
            C2404j0.this.f8806m0.mo8298u0();
        }

        @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
        /* renamed from: b */
        public void mo8664b() {
            C2404j0.this.f8806m0.mo8264R();
            C2404j0.this.mo8105F2();
        }

        @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
        /* renamed from: c */
        public void mo8665c(boolean z) {
            C2404j0.this.f8469x0 = z;
            this.f8492a.invalidateOptionsMenu();
            C2404j0.this.f8806m0.mo8264R();
        }

        @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
        public C2369h0 getFilter() {
            return C2404j0.this.f8444f1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$k */
    public class ViewTreeObserver$OnScrollChangedListenerC2419k implements ViewTreeObserver.OnScrollChangedListener {
        ViewTreeObserver$OnScrollChangedListenerC2419k() {
        }

        public void onScrollChanged() {
            C2404j0 j0Var = C2404j0.this;
            C2515o2 o2Var = j0Var.f8417G1;
            if (o2Var != null) {
                o2Var.mo8873z(j0Var, j0Var.f8405A1.getScrollY());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$l */
    public class AsyncTaskC2420l extends AsyncTask<Void, Void, Boolean> {
        AsyncTaskC2420l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            int lastIndexOf;
            C2404j0 j0Var = C2404j0.this;
            String str = j0Var.f8404A0;
            if (str == null) {
                str = j0Var.f8473z0;
                if (!j0Var.f8471y0.equals("")) {
                    File file = new File(C2404j0.this.f8471y0 + C2404j0.this.f8473z0);
                    if ((!file.exists() || !file.isDirectory()) && (lastIndexOf = str.lastIndexOf(46)) > 0) {
                        str = str.substring(0, lastIndexOf);
                    }
                }
            }
            C2404j0 j0Var2 = C2404j0.this;
            String t = j0Var2.f8795b0.mo8569t(j0Var2.f8459s0);
            if (t == null) {
                return Boolean.FALSE;
            }
            C2404j0 j0Var3 = C2404j0.this;
            j0Var3.f8433U0 = C2399i2.m10374d(j0Var3.mo2575j0(), C2404j0.this.f8437Y0);
            C2404j0 j0Var4 = C2404j0.this;
            File file2 = C2404j0.this.f8433U0;
            j0Var4.f8433U0 = new C2399i2(file2, t + "/" + str + ".png");
            C2404j0 j0Var5 = C2404j0.this;
            j0Var5.f8435W0 = j0Var5.f8433U0.exists();
            C2404j0 j0Var6 = C2404j0.this;
            if (j0Var6.f8435W0) {
                j0Var6.f8440b1 = j0Var6.f8433U0.length();
                C2404j0 j0Var7 = C2404j0.this;
                j0Var7.f8441c1 = j0Var7.f8433U0.lastModified();
            }
            C2404j0 j0Var8 = C2404j0.this;
            j0Var8.f8432T0 = C2399i2.m10374d(j0Var8.mo2575j0(), C2404j0.this.f8436X0);
            C2404j0 j0Var9 = C2404j0.this;
            File file3 = C2404j0.this.f8432T0;
            j0Var9.f8432T0 = new C2399i2(file3, t + "/" + str + ".png");
            C2404j0 j0Var10 = C2404j0.this;
            j0Var10.f8434V0 = j0Var10.f8432T0.exists();
            C2404j0 j0Var11 = C2404j0.this;
            if (j0Var11.f8434V0) {
                j0Var11.f8438Z0 = j0Var11.f8432T0.length();
                C2404j0 j0Var12 = C2404j0.this;
                j0Var12.f8439a1 = j0Var12.f8432T0.lastModified();
            }
            return Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                C2404j0.this.mo8645y3(false);
                C2404j0.this.f8472y1.requestFocus();
                C2404j0 j0Var = C2404j0.this;
                if (j0Var.f8409C1 == null) {
                    j0Var.f8409C1 = new Handler();
                    C2404j0 j0Var2 = C2404j0.this;
                    j0Var2.f8409C1.postDelayed(j0Var2.f8415F1, 3000);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$m */
    public class AsyncTaskC2421m extends AsyncTask<Void, Void, Void> {
        AsyncTaskC2421m() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            SQLiteDatabase c;
            C2775u uVar = C2404j0.this.f8794a0;
            if (!(uVar == null || (c = uVar.mo9325c()) == null)) {
                try {
                    Cursor rawQuery = c.rawQuery("SELECT s.parent FROM roms as r,systems as s WHERE r._id=" + C2404j0.this.f8455q0 + " AND s.slug=r.system", null);
                    if (!rawQuery.moveToFirst()) {
                        rawQuery.close();
                        return null;
                    }
                    C2404j0.this.f8459s0 = rawQuery.getString(0);
                    rawQuery.close();
                    C2404j0 j0Var = C2404j0.this;
                    Cursor d = j0Var.f8796c0.mo8840d(j0Var.f8455q0);
                    if (d.moveToFirst()) {
                        C2404j0.this.f8447i1 = d.getInt(0);
                        C2404j0.this.f8446h1 = d.getString(1);
                        C2404j0.this.f8448j1 = d.getInt(11);
                    }
                    d.close();
                    C2404j0 j0Var2 = C2404j0.this;
                    Cursor l = j0Var2.f8795b0.mo8562l(j0Var2.f8459s0);
                    synchronized (C2404j0.this.f8474z1) {
                        if (l.moveToFirst()) {
                            do {
                                C2404j0 j0Var3 = C2404j0.this;
                                j0Var3.f8445g1.add(new C2443z(l.getLong(0), l.getString(1), l.getInt(7)));
                            } while (l.moveToNext());
                        }
                    }
                    l.close();
                    Cursor rawQuery2 = c.rawQuery("SELECT _id FROM roms WHERE _id=" + C2404j0.this.f8455q0 + " AND cover_status>=" + 16384 + " LIMIT 1", null);
                    if (rawQuery2.moveToFirst()) {
                        c.execSQL("UPDATE roms SET cover_requested=" + System.currentTimeMillis() + " WHERE _id=" + C2404j0.this.f8455q0);
                    }
                    rawQuery2.close();
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r2) {
            ActivityC0447d c0 = C2404j0.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                c0.invalidateOptionsMenu();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.j0$n */
    class C2422n implements C2223d0.AbstractC2249s {
        C2422n() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            ActivityC0447d c0 = C2404j0.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2404j0 j0Var = C2404j0.this;
                boolean z = !j0Var.f8463u0;
                j0Var.f8463u0 = z;
                if (!z) {
                    j0Var.mo8640t3();
                } else {
                    j0Var.mo8642v3();
                }
                c0.invalidateOptionsMenu();
                C2404j0.this.f8806m0.mo8264R();
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.j0$o */
    class C2423o implements C2223d0.AbstractC2249s {
        C2423o() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2404j0 j0Var;
            AbstractC2531p1.AbstractC2532a aVar;
            ActivityC0447d c0 = C2404j0.this.mo2552c0();
            if (c0 != null && !c0.isFinishing() && (aVar = (j0Var = C2404j0.this).f8806m0) != null) {
                aVar.mo8269a0(j0Var.f8455q0);
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.j0$p */
    class DialogInterface$OnClickListenerC2424p implements DialogInterface.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.j0$p$a */
        class C2425a implements AbstractC2406a0 {
            C2425a() {
            }

            @Override // com.digdroid.alman.dig.C2404j0.AbstractC2406a0
            /* renamed from: a */
            public void mo8647a(boolean z) {
                if (z) {
                    C2404j0.this.mo8644x3(true);
                }
            }
        }

        DialogInterface$OnClickListenerC2424p() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase sQLiteDatabase = C2404j0.this.f8461t0;
            sQLiteDatabase.execSQL("UPDATE roms SET has_images=NULL,cover_status=cover_status&-8193 WHERE _id=" + C2404j0.this.f8455q0);
            C2404j0.this.f8806m0.mo8264R();
            if (C2404j0.this.f8433U0.exists()) {
                try {
                    C2404j0.this.f8433U0.delete();
                } catch (Exception unused) {
                }
            }
            C2404j0 j0Var = C2404j0.this;
            j0Var.f8435W0 = false;
            ActivityC0447d c0 = j0Var.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                c0.invalidateOptionsMenu();
                new AsyncTaskC2408b0(new C2425a()).execute(new String[0]);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.j0$q */
    class C2426q implements C2223d0.AbstractC2249s {

        /* renamed from: com.digdroid.alman.dig.j0$q$a */
        class C2427a implements C0248l0.AbstractC0252d {

            /* renamed from: com.digdroid.alman.dig.j0$q$a$a */
            class C2428a implements AbstractC2406a0 {
                C2428a() {
                }

                @Override // com.digdroid.alman.dig.C2404j0.AbstractC2406a0
                /* renamed from: a */
                public void mo8647a(boolean z) {
                    if (z) {
                        try {
                            if (C2404j0.this.f8432T0.exists()) {
                                C2404j0.this.f8432T0.delete();
                            }
                        } catch (Exception unused) {
                        }
                        C2404j0 j0Var = C2404j0.this;
                        j0Var.f8796c0.mo8839c(j0Var.f8455q0);
                        ActivityC0447d c0 = C2404j0.this.mo2552c0();
                        if (c0 != null && !c0.isFinishing()) {
                            C2404j0.this.f8463u0 = false;
                            c0.invalidateOptionsMenu();
                            C2404j0.this.mo8642v3();
                            C2404j0.this.f8806m0.mo8264R();
                            C2404j0.this.mo8106G2(false);
                            C2404j0.this.mo8407O2();
                            ImageService.m9511a(c0);
                        }
                    }
                }
            }

            C2427a() {
            }

            @Override // androidx.appcompat.widget.C0248l0.AbstractC0252d
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.unmatch) {
                    C2404j0 j0Var = C2404j0.this;
                    j0Var.f8796c0.mo8851s(j0Var.f8455q0, j0Var.f8798e0.mo9515a());
                } else {
                    C2404j0 j0Var2 = C2404j0.this;
                    j0Var2.f8796c0.mo8847l(j0Var2.f8455q0, j0Var2.f8798e0.mo9515a(), (long) menuItem.getItemId());
                    ServerService.m9570m(C2404j0.this.f8805l0, "com.digdroid.alman.dig.action.GAME_STATS", (long) menuItem.getItemId());
                }
                new AsyncTaskC2408b0(new C2428a()).execute(new String[0]);
                return true;
            }
        }

        C2426q() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            ActivityC0447d c0 = C2404j0.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2404j0 j0Var = C2404j0.this;
                C2512o0 o0Var = j0Var.f8796c0;
                String obj = j0Var.f8454p1.getText().toString();
                C2404j0 j0Var2 = C2404j0.this;
                Cursor b = o0Var.mo8838b(obj, j0Var2.f8795b0.mo8569t(j0Var2.f8459s0), C2404j0.this.f8798e0.mo9515a(), 10);
                C0248l0 l0Var = new C0248l0(new C0788d(C2404j0.this.mo2552c0(), C2553q3.m11117c()), C2404j0.this.f8454p1);
                l0Var.mo1571b().inflate(R.menu.rematch, l0Var.mo1570a());
                l0Var.mo1572c(new C2427a());
                Menu a = l0Var.mo1570a();
                if (b.moveToFirst()) {
                    do {
                        a.add(0, b.getInt(0), 0, b.getString(1));
                    } while (b.moveToNext());
                    l0Var.mo1573d();
                }
                b.close();
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$r */
    public class C2429r implements AbstractC2406a0 {
        C2429r() {
        }

        @Override // com.digdroid.alman.dig.C2404j0.AbstractC2406a0
        /* renamed from: a */
        public void mo8647a(boolean z) {
            C2404j0.this.mo8637q3(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$s */
    public class DialogInterface$OnClickListenerC2430s implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f8505b;

        DialogInterface$OnClickListenerC2430s(Activity activity) {
            this.f8505b = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((AlarmManager) this.f8505b.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000, PendingIntent.getActivity(this.f8505b.getBaseContext(), 0, new Intent(this.f8505b.getIntent()), this.f8505b.getIntent().getFlags()));
            Process.killProcess(Process.myPid());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$t */
    public class View$OnClickListenerC2431t implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.j0$t$a */
        class C2432a implements C2828w2.AbstractC2838j {
            C2432a() {
            }

            @Override // com.digdroid.alman.dig.C2828w2.AbstractC2838j
            /* renamed from: a */
            public void mo8071a(boolean z) {
            }
        }

        View$OnClickListenerC2431t() {
        }

        public void onClick(View view) {
            new C2828w2(C2404j0.this.mo2552c0(), C2404j0.this.f8461t0, false, new C2432a()).mo9396f(C2404j0.this.f8455q0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$u */
    public class View$OnClickListenerC2433u implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.j0$u$a */
        class C2434a implements C2223d0.AbstractC2249s {

            /* renamed from: com.digdroid.alman.dig.j0$u$a$a */
            class C2435a implements C2465m0.AbstractC2488p {
                C2435a() {
                }

                @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
                /* renamed from: a */
                public void mo8663a() {
                }

                @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
                /* renamed from: b */
                public void mo8664b() {
                    C2404j0.this.f8806m0.mo8264R();
                    C2404j0.this.mo8105F2();
                }

                @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
                /* renamed from: c */
                public void mo8665c(boolean z) {
                }

                @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
                public C2369h0 getFilter() {
                    return C2404j0.this.f8444f1;
                }
            }

            C2434a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                ActivityC0447d c0 = C2404j0.this.mo2552c0();
                if (c0 != null && !c0.isFinishing()) {
                    new C2465m0(c0, C2404j0.this.f8455q0, new C2435a(), C2404j0.this.f8806m0).mo8728a();
                }
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
            }
        }

        View$OnClickListenerC2433u() {
        }

        public void onClick(View view) {
            C2223d0.m9876p().mo8215r(C2404j0.this.mo2552c0(), 5, new C2434a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$v */
    public class View$OnClickListenerC2436v implements View.OnClickListener {
        View$OnClickListenerC2436v() {
        }

        public void onClick(View view) {
            ActivityC0447d c0 = C2404j0.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                C2404j0 j0Var = C2404j0.this;
                C2404j0 j0Var2 = C2404j0.this;
                j0Var.f8796c0.mo8844i((ActivityC2888z3) j0Var.mo2552c0(), j0Var2.f8455q0, j0Var2.f8444f1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$w */
    public class View$OnClickListenerC2437w implements View.OnClickListener {
        View$OnClickListenerC2437w() {
        }

        public void onClick(View view) {
            C2404j0 j0Var = C2404j0.this;
            boolean z = j0Var.f8411D1;
            j0Var.f8467w0 = z;
            File k3 = j0Var.mo8631k3(z);
            Uri m = k3 instanceof C2399i2 ? ((C2399i2) k3).mo8614m() : Uri.fromFile(k3);
            if (k3 != null) {
                try {
                    C2498n1<Drawable> V0 = C2457l1.m10577b(C2404j0.this.mo2552c0().getApplicationContext()).mo8859J(m).mo7762e(AbstractC1763j.f6903b).mo7754Y(true);
                    V0.mo7752W(new C2067d(k3.length() + "@" + k3.lastModified())).mo7030p0(C2404j0.this.f8470x1);
                    C2404j0 j0Var2 = C2404j0.this;
                    j0Var2.f8465v0 = true;
                    j0Var2.mo8625A3();
                    C2404j0.this.mo8642v3();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$x */
    public class View$OnLongClickListenerC2438x implements View.OnLongClickListener {

        /* renamed from: com.digdroid.alman.dig.j0$x$a */
        class DialogInterface$OnClickListenerC2439a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ boolean f8515b;

            /* renamed from: com.digdroid.alman.dig.j0$x$a$a */
            class C2440a implements C2749t1.AbstractC2772l {
                C2440a() {
                }

                @Override // com.digdroid.alman.dig.C2749t1.AbstractC2772l
                /* renamed from: a */
                public void mo8684a() {
                    C2404j0.this.mo8644x3(true);
                }
            }

            /* renamed from: com.digdroid.alman.dig.j0$x$a$b */
            class C2441b implements C2749t1.AbstractC2772l {
                C2441b() {
                }

                @Override // com.digdroid.alman.dig.C2749t1.AbstractC2772l
                /* renamed from: a */
                public void mo8684a() {
                    C2404j0.this.mo8644x3(true);
                }
            }

            DialogInterface$OnClickListenerC2439a(boolean z) {
                this.f8515b = z;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                boolean z;
                C2749t1.AbstractC2772l bVar;
                boolean z2 = this.f8515b;
                C2404j0 j0Var = C2404j0.this;
                C2749t1 t1Var = j0Var.f8799f0;
                ActivityC0447d c0 = j0Var.mo2552c0();
                C2404j0 j0Var2 = C2404j0.this;
                long j = j0Var2.f8455q0;
                if (i == 0) {
                    z = this.f8515b;
                    bVar = new C2440a();
                } else {
                    z = !this.f8515b;
                    bVar = new C2441b();
                }
                t1Var.mo9276k(c0, j0Var2, j, z, bVar);
            }
        }

        View$OnLongClickListenerC2438x() {
        }

        public boolean onLongClick(View view) {
            CharSequence[] charSequenceArr = {C2404j0.this.mo2501D0(R.string.box_cover), C2404j0.this.mo2501D0(R.string.screenshot)};
            C2404j0 j0Var = C2404j0.this;
            new DialogInterfaceC0068b.C0069a(C2404j0.this.mo2552c0(), C2553q3.m11117c()).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2439a(j0Var.f8795b0.mo8569t(j0Var.f8459s0).equals("mame"))).mo221a().show();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$y */
    public class View$OnClickListenerC2442y implements View.OnClickListener {
        View$OnClickListenerC2442y() {
        }

        public void onClick(View view) {
            C2404j0 j0Var = C2404j0.this;
            j0Var.f8465v0 = false;
            j0Var.mo8625A3();
            C2404j0.this.mo8642v3();
            C2404j0.this.f8468w1.requestFocus();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.j0$z */
    public class C2443z {

        /* renamed from: a */
        long f8520a;

        /* renamed from: b */
        String f8521b;

        /* renamed from: c */
        int f8522c;

        public C2443z(long j, String str, int i) {
            this.f8520a = j;
            this.f8521b = str;
            this.f8522c = i;
        }
    }

    /* renamed from: z3 */
    private void m10401z3(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0398a.m1977n(drawable, i);
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: A3 */
    public void mo8625A3() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8911v(mo8409w2());
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: B2 */
    public /* bridge */ /* synthetic */ boolean mo8102B2() {
        return super.mo8102B2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B3 */
    public void mo8626B3(int i) {
        this.f8448j1 = i;
        Iterator<C2443z> it = this.f8445g1.iterator();
        while (it.hasNext()) {
            C2443z next = it.next();
            if (next.f8520a == ((long) this.f8447i1)) {
                next.f8522c = this.f8448j1;
            }
        }
        SQLiteDatabase c = this.f8794a0.mo9325c();
        c.execSQL("UPDATE emulators SET use_retroarch64=" + this.f8448j1 + " WHERE _id=" + this.f8447i1);
        mo2552c0().invalidateOptionsMenu();
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

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (new com.digdroid.alman.dig.C2465m0(r6, r11.f8455q0, new com.digdroid.alman.dig.C2404j0.C2418j(r11, r6), r11.f8806m0).mo8729c(r12) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        switch(r12.getItemId()) {
            case 2131296515: goto L_0x0152;
            case 2131296580: goto L_0x0124;
            case 2131296633: goto L_0x0115;
            case 2131296634: goto L_0x0106;
            case 2131297072: goto L_0x00f7;
            case 2131297236: goto L_0x009f;
            case 2131297326: goto L_0x009b;
            case 2131297327: goto L_0x0096;
            case 2131297328: goto L_0x0092;
            default: goto L_0x0090;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        mo8626B3(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        mo8626B3(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        mo8626B3(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r12 = new android.content.ContentValues();
        r12.put("emulator", (java.lang.Integer) -1);
        r0 = r11.f8461t0;
        r0.update("roms", r12, "_id=" + r11.f8455q0, null);
        r12 = r11.f8796c0.mo8840d(r11.f8455q0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        if (r12.moveToFirst() == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        r11.f8447i1 = r12.getInt(0);
        r11.f8446h1 = r12.getString(1);
        r11.f8448j1 = r12.getInt(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r11.f8446h1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ec, code lost:
        r12.close();
        mo2552c0().invalidateOptionsMenu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        com.digdroid.alman.dig.C2223d0.m9876p().mo8215r(r6, 9, new com.digdroid.alman.dig.C2404j0.C2426q(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0105, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0106, code lost:
        com.digdroid.alman.dig.C2223d0.m9876p().mo8215r(r6, 11, new com.digdroid.alman.dig.C2404j0.C2423o(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0115, code lost:
        com.digdroid.alman.dig.C2223d0.m9876p().mo8215r(r6, 10, new com.digdroid.alman.dig.C2404j0.C2422n(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0123, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        new androidx.appcompat.app.DialogInterfaceC0068b.C0069a(r6, com.digdroid.alman.dig.C2553q3.m11117c()).mo229i(mo2501D0(com.digdroid.alman.dig.R.string.confirm)).mo232l(17039360, null).mo235o(17039370, new com.digdroid.alman.dig.C2404j0.DialogInterface$OnClickListenerC2424p(r11)).mo221a().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0151, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0152, code lost:
        mo8627g3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0155, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x015a, code lost:
        return super.mo8243H2(r12);
     */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8243H2(android.view.MenuItem r12) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2404j0.mo8243H2(android.view.MenuItem):boolean");
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
    public boolean mo8110N2() {
        ActivityC0447d c0 = mo2552c0();
        if (c0 == null || c0.isFinishing()) {
            return true;
        }
        this.f8796c0.mo8844i((ActivityC2888z3) mo2552c0(), this.f8455q0, this.f8444f1);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public synchronized void mo8407O2() {
        try {
            new AsyncTaskC2408b0(new C2409c()).execute(new String[0]);
        } catch (Exception unused) {
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: P2 */
    public /* bridge */ /* synthetic */ void mo8111P2() {
        super.mo8111P2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Q2 */
    public void mo8112Q2() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8903G(this.f8800g0, this.f8795b0.mo8564n(this.f8459s0), this.f8795b0.mo8563m(this.f8459s0));
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: R2 */
    public /* bridge */ /* synthetic */ void mo8113R2() {
        super.mo8113R2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: S2 */
    public void mo8114S2() {
        super.mo8114S2();
        String str = this.f8459s0;
        if (str != null && !str.equals("")) {
            mo8643w3();
        }
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
    public void mo8116U2() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            long m0 = aVar.mo8283m0();
            if (m0 >= 0) {
                this.f8455q0 = m0;
                mo8638r3();
                mo8636p3();
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        if (bundle == null) {
            this.f8463u0 = false;
            this.f8465v0 = false;
            this.f8467w0 = true;
        } else {
            this.f8463u0 = bundle.getBoolean("editing");
            this.f8465v0 = bundle.getBoolean("show_cover");
            this.f8467w0 = bundle.getBoolean("show_big_cover");
        }
        mo2557d2(!this.f8793Z.mo8196t());
        Bundle h0 = mo2568h0();
        this.f8455q0 = h0.getLong("gameid");
        this.f8457r0 = -1;
        this.f8459s0 = "";
        C2369h0 h0Var = new C2369h0();
        this.f8444f1 = h0Var;
        h0Var.mo8533b(h0);
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
        return layoutInflater.inflate(R.layout.activity_game, viewGroup, false);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: a3 */
    public void mo8120a3(boolean z) {
        C2515o2 o2Var;
        C2515o2 o2Var2;
        if (z && !this.f8803j0 && mo8102B2() && mo2505F0() != null && !this.f8463u0) {
            mo8642v3();
        }
        boolean z2 = this.f8803j0;
        super.mo8120a3(z);
        if (!z && z2 && (o2Var2 = this.f8417G1) != null) {
            o2Var2.mo8869u(this);
        }
        if (z && !z2 && (o2Var = this.f8417G1) != null) {
            o2Var.mo8870v(this, this.f8419H1);
            mo8639s3();
        }
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
    public void mo8627g3() {
        boolean[] zArr = new boolean[f8403p0.length];
        String[] strArr = new String[f8401n0.length];
        for (int i = 0; i < f8403p0.length; i++) {
            strArr[i] = mo2552c0().getString(f8401n0[i]);
            zArr[i] = this.f8793Z.mo8180c(f8403p0[i], f8402o0[i]);
        }
        DialogInterfaceC0068b a = new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c()).mo231k(strArr, zArr, new DialogInterface$OnMultiChoiceClickListenerC2415i(zArr)).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2414h(zArr)).mo232l(R.string.cancel, null).mo221a();
        this.f8421I1 = a;
        a.show();
    }

    /* renamed from: h3 */
    public String mo8628h3() {
        return this.f8416G0;
    }

    /* renamed from: i3 */
    public long mo8629i3() {
        return this.f8455q0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j3 */
    public boolean mo8630j3() {
        Cursor rawQuery = this.f8461t0.rawQuery("SELECT p.path,r.filename,r.title,r.released,r.developer,r.publisher,r.info,r.favorite,r.system,r.mdbid,r.cover_status,r.crc,r.gdbid,r.gfcover,r.has_images,r.rating,r.c_rating,r.c_rating_count,r.foldername,r.sortname,r.comments,r.youtube FROM roms as r,rompaths as p WHERE r._id=" + this.f8455q0 + " AND p._id=r.pathid", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            rawQuery = this.f8461t0.rawQuery("SELECT pathid,filename,title,released,developer,publisher,info,favorite,system,mdbid,cover_status,crc,gdbid,gfcover,has_images,rating,c_rating,c_rating_count,foldername,sortname,comments,youtube FROM roms WHERE _id=" + this.f8455q0, null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return false;
            }
            this.f8471y0 = "";
        } else {
            this.f8471y0 = rawQuery.getString(0) + "/";
        }
        this.f8473z0 = rawQuery.getString(1);
        this.f8404A0 = rawQuery.getString(18);
        this.f8410D0 = C2185a4.m9667E(rawQuery.getString(2));
        this.f8412E0 = mo8901f3(rawQuery.getString(6));
        this.f8414F0 = C2185a4.m9667E(mo8901f3(rawQuery.getString(5)));
        this.f8416G0 = C2185a4.m9667E(mo8901f3(rawQuery.getString(4)));
        this.f8423K0 = rawQuery.getLong(3);
        this.f8469x0 = rawQuery.getInt(7) > 0;
        this.f8459s0 = rawQuery.getString(8);
        this.f8424L0 = rawQuery.getLong(9);
        this.f8431S0 = rawQuery.getInt(10);
        this.f8418H0 = rawQuery.getString(13);
        this.f8427O0 = rawQuery.getLong(11);
        this.f8426N0 = rawQuery.getLong(12);
        int i = rawQuery.getInt(17);
        this.f8429Q0 = i;
        if (i > 0) {
            this.f8428P0 = rawQuery.getFloat(16);
        } else {
            this.f8428P0 = rawQuery.isNull(15) ? -1.0f : rawQuery.getFloat(15);
            this.f8429Q0 = 1;
        }
        this.f8420I0 = rawQuery.getString(19);
        this.f8430R0 = rawQuery.getInt(20);
        this.f8422J0 = rawQuery.getString(21);
        rawQuery.close();
        this.f8457r0 = -1;
        if (mo8893A2(this.f8412E0) && this.f8424L0 >= 0) {
            Cursor rawQuery2 = this.f8798e0.mo9515a().rawQuery("SELECT info,info_comp,gdbid,gfcover FROM games WHERE _id=" + this.f8424L0, null);
            if (rawQuery2.moveToFirst()) {
                byte[] blob = rawQuery2.getBlob(1);
                if (blob == null || blob.length <= 0) {
                    this.f8412E0 = mo8901f3(rawQuery2.getString(0));
                } else {
                    try {
                        this.f8412E0 = new C2253d3().mo8242a(blob);
                    } catch (Exception unused) {
                        this.f8412E0 = "";
                    }
                }
                if (this.f8412E0.length() > 1000) {
                    this.f8412E0 = this.f8412E0.substring(0, 1000);
                }
                if (this.f8412E0.length() >= 1000) {
                    this.f8412E0 += "...";
                }
                String replaceAll = this.f8412E0.replaceAll("\\r", "");
                this.f8412E0 = replaceAll;
                String replaceAll2 = replaceAll.replaceAll("\\n\\n", "\n");
                this.f8412E0 = replaceAll2;
                String trim = replaceAll2.replaceAll("\\n", "\n\n").trim();
                this.f8412E0 = trim;
                if (!mo8893A2(trim)) {
                    if (rawQuery2.getLong(2) >= 0) {
                        this.f8457r0 = 0;
                    } else if (!rawQuery2.isNull(3) && !rawQuery2.getString(3).equals("")) {
                        this.f8457r0 = 1;
                    } else if (!this.f8459s0.equals("mame") && !this.f8459s0.equals("naomi")) {
                        this.f8457r0 = 2;
                    }
                }
            }
            rawQuery2.close();
        }
        if (!mo8893A2(this.f8412E0)) {
            if (Pattern.compile("\\[src=moby\\]").matcher(this.f8412E0).find()) {
                this.f8457r0 = 2;
                this.f8412E0 = this.f8412E0.replaceAll("\\[src=moby\\]", "");
            }
            this.f8412E0 = C2185a4.m9667E(this.f8412E0);
        }
        this.f8406B0 = "";
        Cursor rawQuery3 = this.f8461t0.rawQuery("SELECT g.name FROM gamegenres as gg, genres as g WHERE gg.game=" + this.f8455q0 + " AND g._id=gg.genre", null);
        if (rawQuery3.moveToFirst()) {
            do {
                if (this.f8406B0.length() > 0) {
                    this.f8406B0 += ", ";
                }
                this.f8406B0 += rawQuery3.getString(0);
            } while (rawQuery3.moveToNext());
        }
        this.f8408C0 = "";
        Cursor rawQuery4 = this.f8461t0.rawQuery("SELECT c.name FROM gamecollection as gc,collections as c WHERE gc.game=" + this.f8455q0 + " AND c._id=gc.collection", null);
        if (rawQuery4.moveToFirst()) {
            do {
                if (this.f8408C0.length() > 0) {
                    this.f8408C0 += ", ";
                }
                this.f8408C0 += rawQuery4.getString(0);
            } while (rawQuery4.moveToNext());
        }
        return true;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public /* bridge */ /* synthetic */ boolean mo2579k1(MenuItem menuItem) {
        return super.mo2579k1(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3 */
    public File mo8631k3(boolean z) {
        boolean c = this.f8793Z.mo8180c("show_cover", true);
        boolean c2 = this.f8793Z.mo8180c("show_screenshot", true);
        if (z && this.f8434V0 && c) {
            this.f8442d1 = this.f8438Z0;
            this.f8443e1 = this.f8439a1;
            return this.f8432T0;
        } else if (z || !this.f8435W0 || !c2) {
            boolean z2 = this.f8434V0;
            if (!z2 || !c) {
                boolean z3 = this.f8435W0;
                if (z3 && c2) {
                    this.f8442d1 = this.f8440b1;
                    this.f8443e1 = this.f8441c1;
                    return this.f8433U0;
                } else if (z2) {
                    this.f8442d1 = this.f8438Z0;
                    this.f8443e1 = this.f8439a1;
                    return this.f8432T0;
                } else if (!z3) {
                    return null;
                } else {
                    this.f8442d1 = this.f8440b1;
                    this.f8443e1 = this.f8441c1;
                    return this.f8433U0;
                }
            } else {
                this.f8442d1 = this.f8438Z0;
                this.f8443e1 = this.f8439a1;
                return this.f8432T0;
            }
        } else {
            this.f8442d1 = this.f8440b1;
            this.f8443e1 = this.f8441c1;
            return this.f8433U0;
        }
    }

    /* renamed from: l3 */
    public String mo8632l3() {
        return this.f8414F0;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        Handler handler = this.f8409C1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8409C1 = null;
        }
        C2515o2 o2Var = this.f8417G1;
        if (o2Var != null) {
            o2Var.mo8869u(this);
        }
        if (this.f8407B1 != null) {
            this.f8405A1.getViewTreeObserver().removeOnScrollChangedListener(this.f8407B1);
        }
        ImageView imageView = this.f8468w1;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f8470x1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.f8472y1;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
    }

    /* renamed from: m3 */
    public long mo8633m3() {
        return this.f8423K0;
    }

    /* renamed from: n3 */
    public String mo8634n3() {
        return this.f8459s0;
    }

    /* renamed from: o3 */
    public String mo8635o3() {
        return this.f8410D0;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        menu.findItem(R.id.edit_game_info).setTitle(this.f8463u0 ? R.string.done : R.string.edit);
        menu.findItem(R.id.favorite).setChecked(this.f8469x0);
        menu.findItem(R.id.add_homescreen).setVisible(!this.f8793Z.mo8197u());
        MenuItem findItem = menu.findItem(R.id.remove_collection);
        String str = this.f8408C0;
        findItem.setVisible(str == null || !str.equals(""));
        MenuItem findItem2 = menu.findItem(R.id.manage_game);
        findItem2.setVisible(true);
        SubMenu subMenu = findItem2.getSubMenu();
        subMenu.clearHeader();
        subMenu.findItem(R.id.delete).setVisible(!this.f8459s0.equals("android"));
        MenuItem findItem3 = menu.findItem(R.id.select_emulator);
        if (this.f8446h1 != null) {
            findItem3.setVisible(true);
            findItem3.setTitle(this.f8446h1);
            SubMenu subMenu2 = findItem3.getSubMenu();
            subMenu2.clearHeader();
            synchronized (this.f8474z1) {
                Iterator<C2443z> it = this.f8445g1.iterator();
                while (it.hasNext()) {
                    C2443z next = it.next();
                    subMenu2.add(0, (int) next.f8520a, 0, next.f8521b);
                }
                boolean s = C2185a4.m9689s(mo2575j0(), "com.retroarch.ra32");
                boolean s2 = C2185a4.m9689s(mo2575j0(), "com.retroarch.aarch64");
                MenuItem findItem4 = menu.findItem(R.id.use_retroarch);
                findItem4.setVisible(this.f8446h1.toLowerCase().contains("retroarch") && (s || s2));
                findItem4.setTitle(C2882y2.m11933v(mo2575j0(), this.f8448j1));
                SubMenu subMenu3 = findItem4.getSubMenu();
                subMenu3.clearHeader();
                subMenu3.findItem(R.id.use_default_ra).setTitle(C2882y2.m11933v(mo2575j0(), 0));
                MenuItem findItem5 = subMenu3.findItem(R.id.use_ra32);
                findItem5.setVisible(s);
                findItem5.setTitle(C2882y2.m11933v(mo2575j0(), 2));
                MenuItem findItem6 = subMenu3.findItem(R.id.use_ra64);
                findItem6.setVisible(s2);
                findItem6.setTitle(C2882y2.m11933v(mo2575j0(), 1));
            }
        } else {
            findItem3.setVisible(false);
            menu.findItem(R.id.use_retroarch).setVisible(false);
        }
        menu.findItem(R.id.delete_screenshot).setVisible(this.f8435W0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3 */
    public void mo8636p3() {
        mo8118X2(mo2568h0().getString("title"));
        View F0 = mo2505F0();
        ImageView imageView = (ImageView) F0.findViewById(R.id.game_cover);
        this.f8468w1 = imageView;
        C2553q3.m11131q(imageView);
        this.f8405A1 = (ScrollView) F0.findViewById(R.id.scroll_area);
        Point k = C2185a4.m9681k(mo2552c0());
        if (k.y > k.x) {
            this.f8407B1 = new ViewTreeObserver$OnScrollChangedListenerC2419k();
            this.f8405A1.getViewTreeObserver().addOnScrollChangedListener(this.f8407B1);
        }
        mo8895L2(this.f8405A1);
        if (mo2552c0().getResources().getConfiguration().orientation == 2) {
            String w2 = mo8409w2();
            w2.hashCode();
            if (w2.equals("none") || w2.equals("icons_bottom")) {
                this.f8468w1.setPadding(0, 20, 0, 0);
            }
        }
        ImageView imageView2 = (ImageView) F0.findViewById(R.id.play);
        this.f8472y1 = imageView2;
        C2553q3.m11131q(imageView2);
        this.f8461t0 = this.f8794a0.mo9325c();
        new AsyncTaskC2408b0(new C2429r()).execute(new String[0]);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: q2 */
    public /* bridge */ /* synthetic */ void mo8125q2() {
        super.mo8125q2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q3 */
    public void mo8637q3(boolean z) {
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing()) {
            if (!z) {
                this.f8793Z.mo8153B("do_repair", true);
                new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(R.string.not_in_db).mo224d(false).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2430s(c0)).mo221a().show();
                return;
            }
            this.f8425M0 = this.f8424L0;
            View F0 = mo2505F0();
            if (F0 != null) {
                TextView textView = (TextView) F0.findViewById(R.id.file_name);
                this.f8449k1 = textView;
                textView.setText(this.f8471y0 + this.f8473z0);
                this.f8449k1.setTextColor(this.f8800g0.f9401e);
                this.f8464u1 = (ConstraintLayout) F0.findViewById(R.id.star_bar);
                RatingBar ratingBar = (RatingBar) F0.findViewById(R.id.game_rating);
                this.f8466v1 = ratingBar;
                LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
                m10401z3(layerDrawable.getDrawable(2), -8448);
                m10401z3(layerDrawable.getDrawable(1), -2138535800);
                m10401z3(layerDrawable.getDrawable(0), -2138535800);
                View$OnClickListenerC2431t tVar = new View$OnClickListenerC2431t();
                TextView textView2 = (TextView) F0.findViewById(R.id.rating_text);
                this.f8453o1 = textView2;
                textView2.setOnClickListener(tVar);
                TextView textView3 = (TextView) F0.findViewById(R.id.game_genres);
                this.f8452n1 = textView3;
                textView3.setOnClickListener(new View$OnClickListenerC2433u());
                this.f8454p1 = (EditText) F0.findViewById(R.id.game_title);
                this.f8456q1 = (EditText) F0.findViewById(R.id.game_info);
                this.f8450l1 = (TextView) F0.findViewById(R.id.comments);
                this.f8451m1 = (TextView) F0.findViewById(R.id.game_source);
                this.f8458r1 = (EditText) F0.findViewById(R.id.game_publisher);
                this.f8460s1 = (EditText) F0.findViewById(R.id.game_developer);
                this.f8462t1 = (EditText) F0.findViewById(R.id.game_released);
                this.f8470x1 = (ImageView) F0.findViewById(R.id.big_cover);
                mo8644x3(false);
                this.f8472y1.setOnClickListener(new View$OnClickListenerC2436v());
                this.f8468w1.setOnClickListener(new View$OnClickListenerC2437w());
                this.f8468w1.setOnLongClickListener(new View$OnLongClickListenerC2438x());
                this.f8470x1.setOnClickListener(new View$OnClickListenerC2442y());
                mo8642v3();
                this.f8802i0 = true;
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        mo8636p3();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.game_menu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r3 */
    public void mo8638r3() {
        synchronized (this.f8474z1) {
            this.f8445g1 = new ArrayList<>();
        }
        new AsyncTaskC2421m().execute(new Void[0]);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putBoolean("editing", this.f8463u0);
        bundle.putBoolean("show_cover", this.f8465v0);
        bundle.putBoolean("show_big_cover", this.f8467w0);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ String mo8126s2() {
        return super.mo8126s2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s3 */
    public boolean mo8639s3() {
        if (this.f8422J0 == null || !this.f8803j0 || !this.f8793Z.mo8180c("game_play_videos", false)) {
            C2515o2 o2Var = this.f8417G1;
            if (o2Var != null) {
                o2Var.mo8865p();
            }
            return false;
        }
        this.f8468w1.setVisibility(4);
        if (this.f8417G1 == null) {
            C2515o2 v0 = this.f8806m0.mo8300v0();
            this.f8417G1 = v0;
            C2515o2.C2523f n = v0.mo8864n();
            this.f8419H1 = n;
            n.f8759a = new C2407b();
            C2515o2.C2523f fVar = this.f8419H1;
            fVar.f8760b = R.id.youtube_container;
            fVar.f8761c = R.id.progress;
            fVar.f8762d = this.f8793Z.mo8180c("game_play_videos_mobile", false);
            this.f8419H1.f8763e = 500;
        }
        this.f8417G1.mo8870v(this, this.f8419H1);
        return this.f8417G1.mo8868t(this.f8422J0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        this.f8417G1 = null;
        mo8638r3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "gameinfo";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t3 */
    public void mo8640t3() {
        new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c()).mo229i(mo2501D0(R.string.confirm_edits)).mo232l(17039369, new DialogInterface$OnClickListenerC2413g()).mo235o(17039379, new DialogInterface$OnClickListenerC2412f()).mo221a().show();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: u2 */
    public /* bridge */ /* synthetic */ long mo8128u2() {
        return super.mo8128u2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u3 */
    public void mo8641u3() {
        Date parse;
        ContentValues contentValues = new ContentValues();
        String trim = this.f8454p1.getText().toString().trim();
        this.f8410D0 = trim;
        contentValues.put("title", trim);
        contentValues.put("sortname", this.f8796c0.mo8846k(this.f8410D0));
        this.f8454p1.setText(this.f8410D0);
        String trim2 = this.f8456q1.getText().toString().trim();
        this.f8412E0 = trim2;
        contentValues.put("info", trim2);
        this.f8456q1.setText(this.f8412E0);
        this.f8457r0 = -1;
        String trim3 = this.f8458r1.getText().toString().trim();
        this.f8414F0 = trim3;
        contentValues.put("publisher", trim3);
        String trim4 = this.f8460s1.getText().toString().trim();
        this.f8416G0 = trim4;
        contentValues.put("developer", trim4);
        this.f8423K0 = 0;
        String trim5 = this.f8462t1.getText().toString().trim();
        try {
            if (trim5.length() == 4) {
                parse = new SimpleDateFormat("yyyy").parse(trim5);
            } else {
                if (trim5.length() == 10) {
                    parse = new SimpleDateFormat("MM/dd/yyyy").parse(trim5);
                }
                contentValues.put("released", Long.valueOf(this.f8423K0));
                SQLiteDatabase sQLiteDatabase = this.f8461t0;
                sQLiteDatabase.update("roms", contentValues, "_id=" + this.f8455q0, null);
                this.f8796c0.mo8852t(this.f8455q0);
            }
            this.f8423K0 = parse.getTime();
        } catch (Exception unused) {
        }
        contentValues.put("released", Long.valueOf(this.f8423K0));
        SQLiteDatabase sQLiteDatabase2 = this.f8461t0;
        sQLiteDatabase2.update("roms", contentValues, "_id=" + this.f8455q0, null);
        this.f8796c0.mo8852t(this.f8455q0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: v2 */
    public /* bridge */ /* synthetic */ C2774t3 mo8129v2() {
        return super.mo8129v2();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x048e  */
    /* renamed from: v3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8642v3() {
        /*
        // Method dump skipped, instructions count: 1177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2404j0.mo8642v3():void");
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: w2 */
    public String mo8409w2() {
        return this.f8465v0 ? "none" : super.mo8409w2();
    }

    /* renamed from: w3 */
    public void mo8643w3() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            MenuItem findItem = aVar.mo8254B().findItem(R.id.game_group);
            findItem.setTitle(this.f8410D0);
            boolean z = true;
            findItem.setVisible(true);
            SubMenu subMenu = findItem.getSubMenu();
            MenuItem findItem2 = subMenu.findItem(R.id.nav_system);
            findItem2.setTitle(this.f8795b0.mo8568s(this.f8459s0));
            findItem2.setVisible(true);
            MenuItem findItem3 = subMenu.findItem(R.id.nav_publisher);
            String str = this.f8414F0;
            boolean z2 = str != null && !str.equals("");
            if (z2) {
                findItem3.setTitle(this.f8414F0);
                findItem3.setVisible(true);
            } else {
                findItem3.setVisible(false);
            }
            MenuItem findItem4 = subMenu.findItem(R.id.nav_developer);
            String str2 = this.f8416G0;
            if (!(str2 != null && !str2.equals("")) || (z2 && this.f8416G0.equals(this.f8414F0))) {
                findItem4.setVisible(false);
            } else {
                findItem4.setTitle(this.f8416G0);
                findItem4.setVisible(true);
            }
            MenuItem findItem5 = subMenu.findItem(R.id.nav_year);
            if (this.f8423K0 > 0) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(this.f8423K0);
                int i = instance.get(1);
                findItem5.setTitle("" + i);
                findItem5.setVisible(true);
            } else {
                findItem5.setVisible(false);
            }
            MenuItem findItem6 = subMenu.findItem(R.id.nav_game_forum);
            if (this.f8424L0 < 0) {
                z = false;
            }
            findItem6.setVisible(z);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: x2 */
    public /* bridge */ /* synthetic */ boolean mo8130x2() {
        return super.mo8130x2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x3 */
    public synchronized void mo8644x3(boolean z) {
        C2514o1 b = C2457l1.m10577b(mo2552c0().getApplicationContext());
        C2498n1<Drawable> M = !this.f8800g0.f9413q.equals("") ? b.mo8862M(this.f8800g0.f9413q) : b.mo8861L(Integer.valueOf((int) R.drawable.play));
        M.mo7762e(AbstractC1763j.f6903b);
        M.mo7030p0(this.f8472y1);
        boolean s3 = mo8639s3();
        mo2505F0().findViewById(R.id.youtube_container).setVisibility(s3 ? 0 : 8);
        if (!s3) {
            mo2505F0().findViewById(R.id.youtube_container).setVisibility(8);
            this.f8468w1.setVisibility(0);
            this.f8411D1 = z;
            Handler handler = this.f8409C1;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f8409C1 = null;
            }
            new AsyncTaskC2420l().execute(new Void[0]);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: y2 */
    public /* bridge */ /* synthetic */ boolean mo8131y2(int i, int i2) {
        return super.mo8131y2(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y3 */
    public synchronized void mo8645y3(boolean z) {
        Drawable drawable;
        File k3;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null) {
            if (!c0.isFinishing()) {
                String t = this.f8795b0.mo8569t(this.f8459s0);
                Resources resources = c0.getResources();
                int i = 0;
                Uri uri = null;
                if (this.f8459s0.equals("android")) {
                    try {
                        drawable = c0.getPackageManager().getApplicationIcon(this.f8473z0);
                    } catch (Exception unused) {
                        i = resources.getIdentifier("icon_" + t, "drawable", c0.getPackageName());
                    }
                } else {
                    i = resources.getIdentifier("icon_" + t, "drawable", c0.getPackageName());
                    if (i == 0) {
                        i = R.drawable.icon_grayed_atari2600;
                    }
                    drawable = null;
                }
                String str = "sig";
                File k32 = mo8631k3(this.f8411D1);
                if (k32 != null) {
                    str = this.f8442d1 + "@" + this.f8443e1;
                    uri = k32 instanceof C2399i2 ? ((C2399i2) k32).mo8614m() : Uri.fromFile(k32);
                }
                try {
                    C2514o1 b = C2457l1.m10577b(c0.getApplicationContext());
                    C2498n1<Drawable> J = uri != null ? b.mo8859J(uri) : drawable != null ? b.mo8858I(drawable) : b.mo8861L(Integer.valueOf(i));
                    J.mo7762e(AbstractC1763j.f6903b);
                    J.mo7752W(new C2067d(str));
                    if (drawable != null) {
                        J.mo7766h(drawable);
                    } else {
                        J.mo7765g(i);
                    }
                    J.mo7030p0(this.f8468w1);
                } catch (Exception unused2) {
                }
                if (this.f8465v0 && z && (k3 = mo8631k3(this.f8467w0)) != null) {
                    try {
                        C2457l1.m10577b(c0.getApplicationContext()).mo8859J(k3 instanceof C2399i2 ? ((C2399i2) k3).mo8614m() : Uri.fromFile(k3)).mo7762e(AbstractC1763j.f6903b).mo7754Y(true).mo7752W(new C2067d(str)).mo7765g(i).mo7030p0(this.f8470x1);
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
        if (intent.getLongExtra("gameid", -1) != this.f8455q0) {
            return;
        }
        if (intent.getBooleanExtra("is_screenshot", false)) {
            this.f8435W0 = true;
            mo8644x3(false);
            return;
        }
        this.f8434V0 = true;
        mo8644x3(true);
        this.f8806m0.mo8264R();
    }
}
