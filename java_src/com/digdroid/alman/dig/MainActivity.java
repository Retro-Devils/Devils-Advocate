package com.digdroid.alman.dig;

import android.app.SearchManager;
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
import android.os.Handler;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC0072e;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.SearchView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.digdroid.alman.dig.ActivityC2719s2;
import com.digdroid.alman.dig.C2181a3;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2318g;
import java.lang.ref.WeakReference;

public class MainActivity extends AbstractActivityC2664r3 {

    /* renamed from: t1 */
    boolean f7634t1;

    /* renamed from: u1 */
    boolean f7635u1;

    /* renamed from: v1 */
    boolean f7636v1;

    /* renamed from: w1 */
    SearchView f7637w1;

    /* renamed from: x1 */
    MenuItem f7638x1;

    /* renamed from: com.digdroid.alman.dig.MainActivity$a */
    class C2101a implements ActivityC2719s2.AbstractC2723d {

        /* renamed from: com.digdroid.alman.dig.MainActivity$a$a */
        class DialogInterface$OnClickListenerC2102a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2102a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        }

        C2101a() {
        }

        @Override // com.digdroid.alman.dig.ActivityC2719s2.AbstractC2723d
        /* renamed from: a */
        public void mo7921a() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f7634t1 = mainActivity.mo9196a1();
        }

        @Override // com.digdroid.alman.dig.ActivityC2719s2.AbstractC2723d
        /* renamed from: b */
        public void mo7922b() {
            new DialogInterfaceC0068b.C0069a(MainActivity.this).mo228h(R.string.storage_denied).mo224d(false).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2102a()).mo221a().show();
        }
    }

    /* renamed from: com.digdroid.alman.dig.MainActivity$b */
    class C2103b implements SearchView.AbstractC0179k {
        C2103b() {
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC0179k
        /* renamed from: a */
        public boolean mo1117a() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f8052T = false;
            mainActivity.f7638x1.setVisible(false);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$c */
    public class AsyncTaskC2104c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        int f7642a = 0;

        /* renamed from: b */
        int f7643b = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.MainActivity$c$a */
        public class DialogInterface$OnClickListenerC2105a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2105a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        AsyncTaskC2104c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            SQLiteDatabase c;
            Cursor rawQuery;
            C2775u uVar = MainActivity.this.f9265u;
            if (uVar == null || (c = uVar.mo9325c()) == null) {
                return null;
            }
            Cursor rawQuery2 = c.rawQuery("SELECT COUNT(*) FROM rompaths WHERE system='none'", null);
            if (rawQuery2 != null) {
                if (rawQuery2.moveToFirst()) {
                    this.f7642a = rawQuery2.getInt(0);
                }
                rawQuery2.close();
            }
            Cursor rawQuery3 = c.rawQuery("SELECT COUNT(*) FROM roms WHERE cover_status>=16384 AND (cover_status&4871)!=0 AND (ignored=0 OR system='android') AND present=1", null);
            if (rawQuery3 != null) {
                if (rawQuery3.moveToFirst()) {
                    this.f7643b = rawQuery3.getInt(0);
                }
                rawQuery3.close();
            }
            Cursor rawQuery4 = c.rawQuery("SELECT COUNT(*) FROM roms WHERE cover_status>=16384 AND (cover_status&4096)!=0 AND (ignored=0 OR system='android') AND present=1", null);
            if (rawQuery4 != null) {
                if (rawQuery4.moveToFirst()) {
                    this.f7643b += rawQuery4.getInt(0);
                }
                rawQuery4.close();
            }
            if (this.f7643b == 0 && (rawQuery = c.rawQuery("SELECT COUNT(*) FROM roms WHERE has_images IS NULL AND (ignored=0 OR system='android') AND present=1", null)) != null) {
                if (rawQuery.moveToFirst()) {
                    this.f7643b = rawQuery.getInt(0);
                }
                rawQuery.close();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r4) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity != null && !mainActivity.isFinishing()) {
                new DialogInterfaceC0068b.C0069a(MainActivity.this, C2553q3.m11117c()).mo229i(((mainActivity.getString(R.string.service_working) + "\n\n") + this.f7642a + " " + mainActivity.getString(R.string.folders_to_check) + "\n") + this.f7643b + " " + mainActivity.getString(R.string.covers_to_check)).mo235o(17039370, new DialogInterface$OnClickListenerC2105a()).mo221a().show();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.MainActivity$d */
    class DialogInterface$OnClickListenerC2106d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f7646b;

        DialogInterface$OnClickListenerC2106d(String str) {
            this.f7646b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f7646b, null));
            MainActivity.this.startActivity(intent);
            C2185a4.m9668F(MainActivity.this, "retroarch");
            MainActivity.this.finish();
        }
    }

    /* renamed from: com.digdroid.alman.dig.MainActivity$e */
    class DialogInterface$OnClickListenerC2107e implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2107e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2185a4.m9668F(MainActivity.this, "retroarch");
            MainActivity.this.m9519c3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$f */
    public class C2108f implements C2223d0.AbstractC2248r {
        C2108f() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2248r
        /* renamed from: a */
        public void mo7931a() {
            MainActivity.this.m9520d3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$g */
    public class C2109g implements C2318g.AbstractC2319a {
        C2109g() {
        }

        @Override // com.digdroid.alman.dig.C2318g.AbstractC2319a
        /* renamed from: a */
        public void mo7932a(boolean z) {
            MainActivity.this.mo8279k0(false);
            MainActivity.this.f9267w.mo8156E("data_version", 462);
            MainActivity mainActivity = MainActivity.this;
            new AsyncTaskC2115l(mainActivity).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$h */
    public class DialogInterface$OnClickListenerC2110h implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2110h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MainActivity.this.f9267w.mo8153B("auto_scan", false);
            MainActivity.this.f7635u1 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$i */
    public class DialogInterface$OnClickListenerC2111i implements DialogInterface.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.MainActivity$i$a */
        class C2112a implements C2181a3.AbstractC2184b {
            C2112a() {
            }

            @Override // com.digdroid.alman.dig.C2181a3.AbstractC2184b
            public void start() {
                MainActivity.this.mo9235t0(false, true, false);
            }
        }

        DialogInterface$OnClickListenerC2111i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MainActivity.this.f9267w.mo8153B("auto_scan", false);
            new C2181a3(MainActivity.this).mo8041a(new C2112a());
            MainActivity.this.f7635u1 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$j */
    public class RunnableC2113j implements Runnable {
        RunnableC2113j() {
        }

        public void run() {
            int i;
            MainActivity mainActivity;
            int l = MainActivity.this.f9267w.mo8188l("orientation", 0);
            if (l != 0) {
                i = 1;
                if (l == 1) {
                    MainActivity.this.setRequestedOrientation(0);
                    return;
                } else if (l == 2) {
                    mainActivity = MainActivity.this;
                } else if (l == 3) {
                    mainActivity = MainActivity.this;
                    i = 7;
                } else {
                    return;
                }
            } else {
                mainActivity = MainActivity.this;
                i = 10;
            }
            mainActivity.setRequestedOrientation(i);
        }
    }

    /* renamed from: com.digdroid.alman.dig.MainActivity$k */
    class C2114k implements SearchView.AbstractC0180l {
        C2114k() {
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC0180l
        /* renamed from: a */
        public boolean mo1118a(String str) {
            AbstractC2531p1 k1 = MainActivity.this.mo8280k1();
            if (k1 == null) {
                return true;
            }
            k1.mo8107I2(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC0180l
        /* renamed from: b */
        public boolean mo1119b(String str) {
            AbstractC2531p1 k1 = MainActivity.this.mo8280k1();
            if (k1 != null) {
                k1.mo8108J2(str);
            }
            MainActivity.this.f7637w1.setIconified(true);
            MainActivity.this.f7638x1.setVisible(false);
            MainActivity.this.f7637w1.clearFocus();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.MainActivity$l */
    public class AsyncTaskC2115l extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private final WeakReference<MainActivity> f7656a;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.MainActivity$l$a */
        public class C2116a implements C2223d0.AbstractC2249s {
            C2116a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
                MainActivity.this.f9267w.mo8152A("merged_games", false);
                MainActivity.this.f9265u.mo9325c().execSQL("UPDATE systems SET show_merged=0");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.MainActivity$l$b */
        public class DialogInterface$OnClickListenerC2117b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2117b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        }

        public AsyncTaskC2115l(MainActivity mainActivity) {
            this.f7656a = new WeakReference<>(mainActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            MainActivity.this.mo9233V0();
            if (!MainActivity.this.mo9234W0()) {
                return Boolean.FALSE;
            }
            MainActivity.this.f9269y.mo8560i();
            C2223d0.m9876p().mo8216s(MainActivity.this, 6, new C2116a(), true);
            return Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            MainActivity mainActivity = this.f7656a.get();
            if (mainActivity != null && !mainActivity.isFinishing()) {
                if (bool.booleanValue()) {
                    MainActivity.this.mo7918b3();
                } else {
                    new DialogInterfaceC0068b.C0069a(mainActivity, C2553q3.m11117c()).mo224d(false).mo229i(MainActivity.this.getString(R.string.install_fail)).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2117b()).mo221a().show();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c3 */
    private void m9519c3() {
        if (this.f7634t1) {
            C2223d0.m9876p().mo8212l(this, new C2108f());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d3 */
    private void m9520d3() {
        C2219c3 k = C2219c3.m9805k(getApplicationContext());
        this.f9267w = k;
        if ((k.mo8188l("data_version", 0) < 463 || this.f9267w.mo8180c("do_repair", false)) && mo8280k1() == null) {
            mo8292q1();
        }
        if (this.f9267w.mo8180c("do_repair", false)) {
            this.f9267w.mo8153B("do_repair", false);
            this.f9267w.mo8156E("data_version", 463);
            C2318g gVar = new C2318g(this);
            gVar.mo8445g(new C2109g());
            mo8279k0(true);
            gVar.mo8443e();
            return;
        }
        new AsyncTaskC2115l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: J */
    public void mo7916J() {
        this.f7638x1.setVisible(true);
        this.f7637w1.setIconified(false);
        this.f7637w1.requestFocus();
        this.f8052T = true;
    }

    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: L1 */
    public void mo7917L1() {
        new AsyncTaskC2104c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b3 */
    public void mo7918b3() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            AbstractC2531p1 k1 = mo8280k1();
            if (k1 != null && k1.mo8103C2()) {
                mo8299u1();
                k1 = null;
            }
            if (k1 == null) {
                if (intent.hasExtra("system")) {
                    mo8294r1(intent);
                } else {
                    mo8287o1();
                }
            }
            mo8301v1();
            if (this.f9267w.mo8187j()) {
                this.f9267w.mo8170S(false);
                this.f7635u1 = true;
            }
            if (this.f7635u1) {
                if (!isFinishing()) {
                    new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo229i(getString(R.string.welcome)).mo235o(17039370, new DialogInterface$OnClickListenerC2111i()).mo232l(R.string.later, new DialogInterface$OnClickListenerC2110h()).mo224d(false).mo221a().show();
                }
            } else if (!isFinishing()) {
                if (!intent.hasExtra("restore_success") || this.f7636v1) {
                    DatabaseService.m9478v(this, "check_paths");
                    ServerService.m9575t(this, "com.digdroid.alman.dig.action.SYNC");
                    ImageService.m9511a(this);
                    mo9235t0(true, this.f9267w.mo8180c("auto_scan", false), false);
                } else {
                    new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo228h(intent.getBooleanExtra("restore_success", true) ? R.string.restore_success : R.string.restore_fail).mo224d(false).mo235o(R.string.ok, null).mo221a().show();
                    this.f7636v1 = true;
                    mo9235t0(false, true, false);
                }
                if (!isFinishing() && !this.f9267w.mo8197u()) {
                    new Handler().post(new RunnableC2113j());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, com.digdroid.alman.dig.AbstractActivityC2533p2, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.AbstractActivityC2664r3, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2800v1, com.digdroid.alman.dig.AbstractActivityC2802v3, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C2185a4.m9692v(this)) {
            if (SystemClock.elapsedRealtime() < 300000) {
                Intent intent = new Intent(this, RestoreActivity.class);
                intent.setFlags(268435456);
                startActivity(intent);
                finish();
                return;
            }
            C2185a4.m9670H(this);
            C2185a4.m9669G(this);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i < 300) {
            try {
                StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        AbstractC0072e.m269A(true);
        if (bundle == null) {
            this.f7635u1 = false;
            this.f7636v1 = false;
            return;
        }
        this.f7635u1 = bundle.getBoolean("scan_alert");
        this.f7636v1 = bundle.getBoolean("restore_informed");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (isFinishing()) {
            return super.onCreateOptionsMenu(menu);
        }
        menu.clear();
        getMenuInflater().inflate(R.menu.home, menu);
        MenuItem findItem = menu.findItem(R.id.menu_search);
        this.f7638x1 = findItem;
        SearchView searchView = (SearchView) findItem.getActionView();
        this.f7637w1 = searchView;
        searchView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new C2114k());
        searchView.setOnCloseListener(new C2103b());
        MenuItem findItem2 = menu.findItem(R.id.menu_search);
        this.f7638x1 = findItem2;
        boolean z = false;
        findItem2.setVisible(false);
        if (this.f9267w.mo8196t()) {
            menu.findItem(R.id.service_working).setVisible(false);
            menu.findItem(R.id.announcements).setVisible(false);
            menu.findItem(R.id.media_next).setVisible(false);
            menu.findItem(R.id.media_pause).setVisible(false);
            menu.findItem(R.id.media_play).setVisible(false);
            return true;
        }
        boolean z2 = this.f9267w.mo8191o() || this.f9267w.mo8186i();
        Drawable icon = this.f7638x1.getIcon();
        if (icon != null) {
            icon.mutate();
            icon.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
        }
        this.f7638x1.setIcon(icon);
        MenuItem findItem3 = menu.findItem(R.id.service_working);
        findItem3.setVisible(z2);
        this.f9507u0 = z2;
        Drawable icon2 = findItem3.getIcon();
        if (icon2 != null) {
            icon2.mutate();
            icon2.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
            findItem3.setIcon(icon2);
        }
        MenuItem findItem4 = menu.findItem(R.id.announcements);
        if (!this.f9267w.mo8198v()) {
            findItem4.setVisible(false);
            this.f9508v0 = false;
        } else {
            Drawable icon3 = findItem4.getIcon();
            if (icon3 != null) {
                icon3.mutate();
                icon3.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), this.f9509w0 ? PorterDuff.Mode.SRC_ATOP : PorterDuff.Mode.CLEAR));
                findItem4.setIcon(icon3);
            }
            this.f9508v0 = this.f9509w0;
        }
        MenuItem findItem5 = menu.findItem(R.id.media_next);
        findItem5.setVisible(mo9127B1());
        Drawable icon4 = findItem5.getIcon();
        if (icon4 != null) {
            icon4.mutate();
            icon4.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
            findItem5.setIcon(icon4);
        }
        MenuItem findItem6 = menu.findItem(R.id.media_pause);
        findItem6.setVisible(mo9129D1() && !mo9128C1());
        Drawable icon5 = findItem6.getIcon();
        if (icon5 != null) {
            icon5.mutate();
            icon5.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
            findItem6.setIcon(icon5);
        }
        MenuItem findItem7 = menu.findItem(R.id.media_play);
        if (mo9129D1() && mo9128C1()) {
            z = true;
        }
        findItem7.setVisible(z);
        Drawable icon6 = findItem7.getIcon();
        if (icon6 != null) {
            icon6.mutate();
            icon6.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
            findItem7.setIcon(icon6);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2533p2, com.digdroid.alman.dig.AbstractActivityC2664r3, androidx.appcompat.app.ActivityC0070c
    public void onDestroy() {
        super.onDestroy();
        C2223d0.m9876p().mo8218y();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                this.f8054V = false;
                ((DrawerLayout) findViewById(R.id.drawer_layout)).mo2407H(8388611);
                return true;
            case R.id.announcements /*{ENCODED_INT: 2131296359}*/:
                mo8285n1();
                return true;
            case R.id.media_next /*{ENCODED_INT: 2131296897}*/:
                mo8920R1();
                return true;
            case R.id.media_pause /*{ENCODED_INT: 2131296899}*/:
                mo8923U1();
                invalidateOptionsMenu();
                return true;
            case R.id.media_play /*{ENCODED_INT: 2131296900}*/:
                mo8924V1();
                invalidateOptionsMenu();
                return true;
            case R.id.service_working /*{ENCODED_INT: 2131297144}*/:
                mo7917L1();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2533p2, com.digdroid.alman.dig.AbstractActivityC2664r3, com.digdroid.alman.dig.AbstractActivityC2852x2, com.digdroid.alman.dig.AbstractActivityC2802v3
    public void onResume() {
        super.onResume();
        this.f9504r0.setTitle("");
        if (System.currentTimeMillis() - this.f9267w.mo8190n("retroarch_last", 0) > SystemClock.elapsedRealtime()) {
            C2185a4.m9668F(this, "retroarch");
        }
        String q = this.f9267w.mo8193q("retroarch_package_running", null);
        if (!C2185a4.m9683m(this, "retroarch") || q == null) {
            m9519c3();
        } else {
            new DialogInterfaceC0068b.C0069a(this).mo224d(false).mo228h(R.string.retrarch_crashed).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2107e()).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2106d(q)).mo221a().show();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.AbstractActivityC2664r3, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("scan_alert", this.f7635u1);
        bundle.putBoolean("restore_informed", this.f7636v1);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2178a2, androidx.appcompat.app.ActivityC0070c
    public void onStart() {
        super.onStart();
        this.f7634t1 = false;
        mo9195Z0(new C2101a());
    }
}
