package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.constraintlayout.widget.C0333i;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2165a0;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2375h3;
import com.digdroid.alman.dig.C2391i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p006b.p057o.p058a.C1088a;

/* renamed from: com.digdroid.alman.dig.g3 */
public class C2329g3 extends C2728t0 {

    /* renamed from: A0 */
    Object f8206A0 = new Object();

    /* renamed from: B0 */
    boolean f8207B0 = false;

    /* renamed from: C0 */
    String f8208C0 = null;

    /* renamed from: D0 */
    int f8209D0;

    /* renamed from: E0 */
    int f8210E0 = 0;

    /* renamed from: F0 */
    DialogInterfaceC0068b f8211F0;

    /* renamed from: z0 */
    ArrayList<C2357r> f8212z0;

    /* renamed from: com.digdroid.alman.dig.g3$a */
    class DialogInterface$OnClickListenerC2330a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2330a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$b */
    public class DialogInterface$OnMultiChoiceClickListenerC2331b implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ ArrayList f8214a;

        /* renamed from: b */
        final /* synthetic */ Cursor f8215b;

        /* renamed from: c */
        final /* synthetic */ SQLiteDatabase f8216c;

        DialogInterface$OnMultiChoiceClickListenerC2331b(ArrayList arrayList, Cursor cursor, SQLiteDatabase sQLiteDatabase) {
            this.f8214a = arrayList;
            this.f8215b = cursor;
            this.f8216c = sQLiteDatabase;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            ArrayList arrayList = this.f8214a;
            Integer valueOf = Integer.valueOf(i);
            if (z) {
                arrayList.add(valueOf);
            } else if (arrayList.contains(valueOf)) {
                this.f8214a.remove(Integer.valueOf(i));
            }
            this.f8215b.moveToPosition(i);
            SQLiteDatabase sQLiteDatabase = this.f8216c;
            sQLiteDatabase.execSQL("UPDATE rompaths SET selected=" + (z ? 1 : 0) + " WHERE _id=" + this.f8215b.getLong(0));
            this.f8215b.requery();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$c */
    public class DialogInterface$OnShowListenerC2332c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ ArrayList f8218a;

        /* renamed from: b */
        final /* synthetic */ Cursor f8219b;

        /* renamed from: c */
        final /* synthetic */ SQLiteDatabase f8220c;

        /* renamed from: com.digdroid.alman.dig.g3$c$a */
        class View$OnClickListenerC2333a implements View.OnClickListener {

            /* renamed from: com.digdroid.alman.dig.g3$c$a$a */
            class DialogInterface$OnClickListenerC2334a implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2334a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C2329g3.this.f8806m0.mo8291q0();
                    int size = DialogInterface$OnShowListenerC2332c.this.f8218a.size();
                    int[] iArr = new int[size];
                    int i2 = 0;
                    while (DialogInterface$OnShowListenerC2332c.this.f8218a.size() > 0) {
                        int intValue = ((Integer) DialogInterface$OnShowListenerC2332c.this.f8218a.get(0)).intValue();
                        if (intValue < DialogInterface$OnShowListenerC2332c.this.f8219b.getCount() && DialogInterface$OnShowListenerC2332c.this.f8219b.moveToPosition(intValue)) {
                            int i3 = i2 + 1;
                            iArr[i2] = DialogInterface$OnShowListenerC2332c.this.f8219b.getInt(0);
                            SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
                            c.execSQL("UPDATE roms SET pathid=-1 WHERE pathid=" + DialogInterface$OnShowListenerC2332c.this.f8219b.getInt(0));
                            i2 = i3;
                        }
                        DialogInterface$OnShowListenerC2332c.this.f8218a.remove(0);
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = iArr[i4];
                        SQLiteDatabase c2 = C2329g3.this.f8794a0.mo9325c();
                        c2.execSQL("DELETE FROM rompaths WHERE _id=" + i5);
                    }
                    SQLiteDatabase sQLiteDatabase = DialogInterface$OnShowListenerC2332c.this.f8220c;
                    sQLiteDatabase.execSQL("UPDATE rompaths SET selected=0 WHERE system='" + C2329g3.this.f9278s0.f8308h + "'");
                    DialogInterface$OnShowListenerC2332c.this.f8219b.requery();
                    AsyncTaskC2362u uVar = new AsyncTaskC2362u(C2329g3.this, null);
                    Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                    C2329g3 g3Var = C2329g3.this;
                    uVar.executeOnExecutor(executor, C2329g3.this.mo2552c0().getApplicationContext(), C2329g3.this.f8794a0.mo9325c(), g3Var.f8795b0, g3Var.f9278s0.f8308h);
                }
            }

            /* renamed from: com.digdroid.alman.dig.g3$c$a$b */
            class DialogInterface$OnClickListenerC2335b implements DialogInterface.OnClickListener {
                DialogInterface$OnClickListenerC2335b() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterface$OnShowListenerC2332c.this.f8218a.clear();
                }
            }

            View$OnClickListenerC2333a() {
            }

            public void onClick(View view) {
                if (DialogInterface$OnShowListenerC2332c.this.f8218a.size() > 0) {
                    new DialogInterfaceC0068b.C0069a(C2329g3.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.confirm_paths_delete).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2335b()).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2334a()).mo221a().show();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.g3$c$b */
        public class View$OnClickListenerC2336b implements View.OnClickListener {

            /* access modifiers changed from: package-private */
            /* renamed from: com.digdroid.alman.dig.g3$c$b$a */
            public class C2337a implements C2391i.AbstractC2394b {

                /* renamed from: com.digdroid.alman.dig.g3$c$b$a$a */
                class AsyncTaskC2338a extends AsyncTask<String[], Void, Void> {
                    AsyncTaskC2338a() {
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public Void doInBackground(String[]... strArr) {
                        String[] strArr2;
                        for (String str : strArr[0]) {
                            C2329g3 g3Var = C2329g3.this;
                            g3Var.f8795b0.mo8552a(g3Var.f9278s0.f8308h, str, 0);
                        }
                        return null;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: b */
                    public void onPostExecute(Void r3) {
                        C2329g3.this.f8806m0.mo8264R();
                        C2329g3.this.mo8106G2(false);
                        C2329g3.this.mo8407O2();
                        SQLiteDatabase sQLiteDatabase = DialogInterface$OnShowListenerC2332c.this.f8220c;
                        sQLiteDatabase.execSQL("UPDATE rompaths SET selected=0 WHERE system='" + C2329g3.this.f9278s0.f8308h + "'");
                        DialogInterface$OnShowListenerC2332c.this.f8219b.requery();
                    }
                }

                C2337a() {
                }

                @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
                /* renamed from: a */
                public void mo8043a(String[] strArr) {
                    new AsyncTaskC2338a().execute(strArr);
                }
            }

            View$OnClickListenerC2336b() {
            }

            public void onClick(View view) {
                C2329g3 g3Var = C2329g3.this;
                g3Var.f8793Z.mo8158G("___tmp_system_rom_path", g3Var.f9278s0.f8308h);
                C2391i iVar = new C2391i(C2329g3.this.mo2552c0());
                iVar.mo8590f(C0333i.f1706W0);
                iVar.mo8592h(new C2337a());
                iVar.mo8588d();
            }
        }

        /* renamed from: com.digdroid.alman.dig.g3$c$c */
        class View$OnClickListenerC2339c implements View.OnClickListener {
            View$OnClickListenerC2339c() {
            }

            public void onClick(View view) {
                DialogInterface$OnShowListenerC2332c.this.f8219b.close();
                C2329g3.this.f8211F0.dismiss();
            }
        }

        DialogInterface$OnShowListenerC2332c(ArrayList arrayList, Cursor cursor, SQLiteDatabase sQLiteDatabase) {
            this.f8218a = arrayList;
            this.f8219b = cursor;
            this.f8220c = sQLiteDatabase;
        }

        public void onShow(DialogInterface dialogInterface) {
            C2329g3.this.f8211F0.mo215e(-1).setOnClickListener(new View$OnClickListenerC2333a());
            C2329g3.this.f8211F0.mo215e(-2).setOnClickListener(new View$OnClickListenerC2336b());
            C2329g3.this.f8211F0.mo215e(-3).setOnClickListener(new View$OnClickListenerC2339c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$d */
    public class C2340d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        final /* synthetic */ TextView f8229b;

        C2340d(TextView textView) {
            this.f8229b = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f8229b;
            textView.setText("" + i + "%");
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$e */
    public class C2341e implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        View f8231b = null;

        C2341e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            View view2 = this.f8231b;
            if (view2 != null) {
                view2.setBackgroundColor(0);
            }
            view.setBackgroundColor(C2553q3.f8891a.mo9319c());
            this.f8231b = view;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            View view = this.f8231b;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            this.f8231b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$f */
    public class C2342f implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ C2358s f8233b;

        C2342f(C2358s sVar) {
            this.f8233b = sVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C2358s sVar = this.f8233b;
            sVar.f8264e = i;
            sVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$g */
    public class DialogInterface$OnClickListenerC2343g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C2358s f8235b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f8236c;

        /* renamed from: d */
        final /* synthetic */ SeekBar f8237d;

        DialogInterface$OnClickListenerC2343g(C2358s sVar, ArrayList arrayList, SeekBar seekBar) {
            this.f8235b = sVar;
            this.f8236c = arrayList;
            this.f8237d = seekBar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ContentValues contentValues = new ContentValues();
            int b = this.f8235b.mo8505b();
            if (b == 0) {
                contentValues.put("overlay", (String) null);
            } else {
                contentValues.put("overlay", b == 1 ? "default" : b == 2 ? this.f8235b.f8265f : (String) this.f8236c.get(b));
            }
            double progress = (double) ((float) this.f8237d.getProgress());
            Double.isNaN(progress);
            contentValues.put("overlay_opacity", Double.valueOf(progress / 100.0d));
            contentValues.put("user_set_overlay", (Integer) 1);
            SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
            c.update("systems", contentValues, "slug='" + C2329g3.this.f9278s0.f8308h + "'", null);
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$h */
    class C2344h implements C2223d0.AbstractC2249s {
        C2344h() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2329g3 g3Var = C2329g3.this;
            C2375h3 h3Var = g3Var.f8795b0;
            String str = g3Var.f9278s0.f8308h;
            h3Var.mo8549I(str, !h3Var.mo8573x(str));
            C2329g3 g3Var2 = C2329g3.this;
            g3Var2.f8795b0.mo8545E(g3Var2.f9278s0.f8308h);
            C2329g3.this.f8806m0.mo8264R();
            C2329g3.this.mo8106G2(false);
            C2329g3.this.mo9021q3();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$i */
    class AsyncTaskC2345i extends AsyncTask<Void, Void, Void> {
        AsyncTaskC2345i() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C2329g3 g3Var = C2329g3.this;
            C2375h3 h3Var = g3Var.f8795b0;
            String str = g3Var.f9278s0.f8308h;
            h3Var.mo8548H(str, !h3Var.mo8572w(str));
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r4) {
            ImageService.m9511a(C2329g3.this.mo2552c0());
            C2329g3 g3Var = C2329g3.this;
            AbstractC2531p1.AbstractC2532a aVar = g3Var.f8806m0;
            String o3 = g3Var.mo9019o3();
            C2329g3 g3Var2 = C2329g3.this;
            aVar.mo8290q(o3, g3Var2.f9278s0, g3Var2.f8958p0.mo8321f());
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$j */
    class C2346j implements C2165a0.AbstractC2175g {

        /* renamed from: a */
        final /* synthetic */ String f8241a;

        C2346j(String str) {
            this.f8241a = str;
        }

        @Override // com.digdroid.alman.dig.C2165a0.AbstractC2175g
        /* renamed from: a */
        public void mo8039a() {
            Cursor l = C2329g3.this.f8795b0.mo8562l(this.f8241a);
            synchronized (C2329g3.this.f8206A0) {
                C2329g3.this.f8212z0.clear();
                if (l.moveToFirst()) {
                    do {
                        C2329g3 g3Var = C2329g3.this;
                        g3Var.f8212z0.add(new C2357r(l.getLong(0), l.getString(1), l.getInt(7)));
                    } while (l.moveToNext());
                }
            }
            l.close();
            C2329g3.this.mo8407O2();
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$k */
    class C2347k implements C2223d0.AbstractC2249s {
        C2347k() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
            Cursor rawQuery = c.rawQuery("SELECT _id FROM systems WHERE slug='" + C2329g3.this.f9278s0.f8308h + "'", null);
            if (rawQuery.moveToFirst()) {
                MyWidget.m9545a(C2329g3.this.mo2552c0(), rawQuery.getLong(0), true);
            }
            rawQuery.close();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$l */
    class DialogInterface$OnClickListenerC2348l implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2348l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
            c.execSQL("UPDATE rompaths SET last_checked=0 WHERE system='" + C2329g3.this.f9278s0.f8308h + "'");
            C2329g3 g3Var = C2329g3.this;
            g3Var.f8795b0.mo8555d(g3Var.f9278s0.f8308h, true);
            SQLiteDatabase c2 = C2329g3.this.f8794a0.mo9325c();
            c2.execSQL("UPDATE roms SET merged_with=-1 WHERE system='" + C2329g3.this.f9278s0.f8308h + "'");
            DatabaseService.m9478v(C2329g3.this.f8805l0, "merge_games");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$m */
    public class DialogInterface$OnClickListenerC2349m implements DialogInterface.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.g3$m$a */
        class AsyncTaskC2350a extends AsyncTask<Void, Void, Void> {
            AsyncTaskC2350a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                String str;
                StringBuilder sb;
                SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
                C2329g3 g3Var = C2329g3.this;
                if (g3Var.mo8899b3(g3Var.f9278s0.f8308h)) {
                    sb = new StringBuilder();
                    str = "UPDATE roms SET has_images=NULL,cover_status=cover_status|21255 WHERE system='";
                } else {
                    sb = new StringBuilder();
                    str = "UPDATE roms SET has_images=NULL,cover_status=(cover_status&-8193)|20480 WHERE system='";
                }
                sb.append(str);
                sb.append(C2329g3.this.f9278s0.f8308h);
                sb.append("'");
                c.execSQL(sb.toString());
                ImageService.m9511a(C2329g3.this.mo2552c0());
                return null;
            }
        }

        DialogInterface$OnClickListenerC2349m() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new AsyncTaskC2350a().execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$n */
    public class DialogInterface$OnClickListenerC2351n implements DialogInterface.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.g3$n$a */
        class AsyncTaskC2352a extends AsyncTask<String, Void, Void> {
            AsyncTaskC2352a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Void doInBackground(String... strArr) {
                StringBuilder sb;
                String str;
                File[] listFiles;
                C2329g3 g3Var = C2329g3.this;
                boolean w = g3Var.f8795b0.mo8572w(g3Var.f9278s0.f8308h);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C2185a4.m9678h(C2329g3.this.mo2552c0()));
                sb2.append(w ? "/Covers/" : "/Screenshots/");
                C2329g3 g3Var2 = C2329g3.this;
                sb2.append(g3Var2.f8795b0.mo8569t(g3Var2.f9278s0.f8308h));
                File file = new File(sb2.toString());
                if (file.exists() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        try {
                            file2.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
                SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
                if (w) {
                    sb = new StringBuilder();
                    str = "UPDATE roms SET has_images=NULL,cover_status=cover_status|21255 WHERE system='";
                } else {
                    sb = new StringBuilder();
                    str = "UPDATE roms SET has_images=NULL,cover_status=(cover_status&-8193)|20480 WHERE system='";
                }
                sb.append(str);
                sb.append(C2329g3.this.f9278s0.f8308h);
                sb.append("'");
                c.execSQL(sb.toString());
                ImageService.m9511a(C2329g3.this.mo2552c0());
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void onPostExecute(Void r1) {
                C2329g3.this.mo8407O2();
            }
        }

        DialogInterface$OnClickListenerC2351n() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new AsyncTaskC2352a().execute(new String[0]);
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$o */
    class C2353o implements C2223d0.AbstractC2249s {

        /* renamed from: com.digdroid.alman.dig.g3$o$a */
        class C2354a implements C2375h3.AbstractC2390o {
            C2354a() {
            }

            @Override // com.digdroid.alman.dig.C2375h3.AbstractC2390o
            /* renamed from: a */
            public void mo8502a() {
                C2329g3.this.f8806m0.mo8264R();
                C2329g3.this.f8806m0.mo8298u0();
            }
        }

        C2353o() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2329g3 g3Var = C2329g3.this;
            g3Var.f8795b0.mo8542B(g3Var.mo2552c0(), C2329g3.this.f9278s0.f8308h, new C2354a());
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$p */
    class DialogInterface$OnMultiChoiceClickListenerC2355p implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f8251a;

        DialogInterface$OnMultiChoiceClickListenerC2355p(boolean[] zArr) {
            this.f8251a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f8251a[i] = z;
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$q */
    class DialogInterface$OnClickListenerC2356q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f8253b;

        /* renamed from: c */
        final /* synthetic */ boolean[] f8254c;

        /* renamed from: d */
        final /* synthetic */ long[] f8255d;

        DialogInterface$OnClickListenerC2356q(int i, boolean[] zArr, long[] jArr) {
            this.f8253b = i;
            this.f8254c = zArr;
            this.f8255d = jArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            for (int i2 = 0; i2 < this.f8253b; i2++) {
                if (this.f8254c[i2]) {
                    SQLiteDatabase c = C2329g3.this.f8794a0.mo9325c();
                    c.execSQL("UPDATE roms SET ignored=0,merged_with=-1 WHERE _id=" + this.f8255d[i2]);
                }
            }
            C2329g3 g3Var = C2329g3.this;
            g3Var.f8795b0.mo8545E(g3Var.f9278s0.f8308h);
            DatabaseService.m9478v(C2329g3.this.f8805l0, "merge_games");
            C2329g3.this.f8806m0.mo8264R();
            C2329g3.this.mo8106G2(false);
            C2329g3.this.mo8407O2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$r */
    public class C2357r {

        /* renamed from: a */
        long f8257a;

        /* renamed from: b */
        String f8258b;

        /* renamed from: c */
        int f8259c;

        public C2357r(long j, String str, int i) {
            this.f8257a = j;
            this.f8258b = str;
            this.f8259c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g3$s */
    public class C2358s extends BaseAdapter {

        /* renamed from: b */
        private final Activity f8261b;

        /* renamed from: c */
        private final ArrayList<String> f8262c;

        /* renamed from: d */
        LayoutInflater f8263d;

        /* renamed from: e */
        int f8264e;

        /* renamed from: f */
        String f8265f;

        /* renamed from: com.digdroid.alman.dig.g3$s$a */
        class C2359a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ int f8267a;

            /* renamed from: com.digdroid.alman.dig.g3$s$a$a */
            class C2360a implements C2391i.AbstractC2394b {
                C2360a() {
                }

                @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
                /* renamed from: a */
                public void mo8043a(String[] strArr) {
                    C2359a aVar = C2359a.this;
                    C2358s sVar = C2358s.this;
                    sVar.f8265f = strArr[0];
                    sVar.f8264e = aVar.f8267a;
                    sVar.notifyDataSetChanged();
                }
            }

            C2359a(int i) {
                this.f8267a = i;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = this.f8267a;
                if (i == 2) {
                    C2358s.this.notifyDataSetChanged();
                    C2391i iVar = new C2391i(C2358s.this.f8261b);
                    iVar.mo8591g(true);
                    iVar.mo8592h(new C2360a());
                    iVar.mo8588d();
                    return;
                }
                C2358s sVar = C2358s.this;
                sVar.f8264e = i;
                sVar.notifyDataSetChanged();
            }
        }

        public C2358s(Activity activity, ArrayList<String> arrayList, int i) {
            this.f8261b = activity;
            this.f8262c = arrayList;
            this.f8264e = i;
            this.f8263d = (LayoutInflater) activity.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        public int mo8505b() {
            return this.f8264e;
        }

        public int getCount() {
            return this.f8262c.size() + 3;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            boolean z = false;
            if (i >= this.f8262c.size()) {
                return this.f8263d.inflate(R.layout.overlay_item_blank, viewGroup, false);
            }
            View inflate = this.f8263d.inflate(R.layout.overlay_item, viewGroup, false);
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.name);
            radioButton.setTextColor(C2553q3.m11116b());
            String str = this.f8262c.get(i);
            radioButton.setText(str.substring(str.indexOf(47) + 1));
            if (i == this.f8264e) {
                z = true;
            }
            radioButton.setChecked(z);
            radioButton.setOnCheckedChangeListener(new C2359a(i));
            return inflate;
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$t */
    class AsyncTaskC2361t extends AsyncTask<Void, Void, Void> {
        AsyncTaskC2361t() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            SQLiteDatabase c;
            C2775u uVar = C2329g3.this.f8794a0;
            if (!(uVar == null || (c = uVar.mo9325c()) == null)) {
                try {
                    Cursor rawQuery = c.rawQuery("SELECT ignored FROM systems WHERE slug='" + C2329g3.this.f9278s0.f8308h + "'", null);
                    rawQuery.moveToFirst();
                    C2329g3.this.f8207B0 = rawQuery.getInt(0) == 1;
                    rawQuery.close();
                    C2329g3 g3Var = C2329g3.this;
                    Cursor k = g3Var.f8795b0.mo8561k(g3Var.f9278s0.f8308h);
                    if (k.moveToFirst()) {
                        C2329g3.this.f8209D0 = k.getInt(0);
                        C2329g3.this.f8208C0 = k.getString(1);
                        C2329g3.this.f8210E0 = k.getInt(7);
                    }
                    k.close();
                    C2329g3 g3Var2 = C2329g3.this;
                    Cursor l = C2329g3.this.f8795b0.mo8562l(g3Var2.f8795b0.mo8569t(g3Var2.f9278s0.f8308h));
                    synchronized (C2329g3.this.f8206A0) {
                        if (l.moveToFirst()) {
                            do {
                                C2329g3 g3Var3 = C2329g3.this;
                                g3Var3.f8212z0.add(new C2357r(l.getLong(0), l.getString(1), l.getInt(7)));
                            } while (l.moveToNext());
                        }
                    }
                    l.close();
                    Cursor rawQuery2 = c.rawQuery("SELECT _id FROM roms WHERE system='" + C2329g3.this.f9278s0.f8308h + "' AND cover_status>=" + 16384 + " LIMIT 1", null);
                    if (rawQuery2.moveToFirst()) {
                        c.execSQL("UPDATE roms SET cover_requested=" + System.currentTimeMillis() + " WHERE system='" + C2329g3.this.f9278s0.f8308h + "'");
                    }
                    rawQuery2.close();
                    if (!C2329g3.this.f8793Z.mo8191o()) {
                        C2329g3 g3Var4 = C2329g3.this;
                        g3Var4.f8795b0.mo8555d(g3Var4.f9278s0.f8308h, false);
                        ActivityC0447d c0 = C2329g3.this.mo2552c0();
                        if (c0 != null && !c0.isFinishing()) {
                            DatabaseService.m9478v(c0, "merge_games");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r2) {
            ActivityC0447d c0 = C2329g3.this.mo2552c0();
            if (c0 != null && !c0.isFinishing()) {
                c0.invalidateOptionsMenu();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.g3$u */
    private class AsyncTaskC2362u extends AsyncTask<Object, Context, Context> {
        private AsyncTaskC2362u() {
        }

        /* synthetic */ AsyncTaskC2362u(C2329g3 g3Var, C2344h hVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Context doInBackground(Object... objArr) {
            Context context = (Context) objArr[0];
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) objArr[1];
            C2375h3 h3Var = (C2375h3) objArr[2];
            String str = (String) objArr[3];
            long currentTimeMillis = System.currentTimeMillis();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id,merged_with FROM roms WHERE pathid=-1 ORDER BY sortname", null);
            if (rawQuery.moveToFirst()) {
                do {
                    sQLiteDatabase.execSQL("DELETE FROM gamegenres WHERE game=" + rawQuery.getLong(0));
                    if (rawQuery.getLong(1) >= 0) {
                        sQLiteDatabase.execSQL("UPDATE roms SET merged_with=-1 WHERE merged_with=" + rawQuery.getLong(1));
                    }
                    sQLiteDatabase.execSQL("DELETE FROM roms WHERE _id=" + rawQuery.getLong(0));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - currentTimeMillis >= 1000) {
                        publishProgress(context);
                        currentTimeMillis = currentTimeMillis2;
                    }
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            h3Var.mo8545E(str);
            DatabaseService.m9478v(context, "merge_games");
            return context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Context context) {
            C1088a.m6129b(context).mo5723d(new Intent(context.getPackageName() + "." + "request_refresh"));
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(Context... contextArr) {
            C1088a.m6129b(contextArr[0]).mo5723d(new Intent(contextArr[0].getPackageName() + "." + "request_refresh"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r4 != null) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[SYNTHETIC, Splitter:B:15:0x005a] */
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10235L3() {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2329g3.m10235L3():void");
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: B3 */
    public boolean mo8141B3(Intent intent) {
        return intent.getStringExtra("system").equals(this.f9278s0.f8308h);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: D3 */
    public Cursor mo8142D3() {
        return this.f8796c0.mo8841e(mo9244E3(), this.f9278s0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        switch(r13.getItemId()) {
            case 2131296342: goto L_0x0254;
            case 2131296632: goto L_0x0238;
            case 2131296791: goto L_0x0225;
            case 2131296796: goto L_0x0206;
            case 2131297069: goto L_0x01cd;
            case 2131297075: goto L_0x0196;
            case 2131297083: goto L_0x0192;
            case 2131297102: goto L_0x0169;
            case 2131297139: goto L_0x0165;
            case 2131297290: goto L_0x0153;
            case 2131297291: goto L_0x0148;
            case 2131297317: goto L_0x0079;
            case 2131297318: goto L_0x006b;
            case 2131297326: goto L_0x0067;
            case 2131297327: goto L_0x0063;
            case 2131297328: goto L_0x005f;
            default: goto L_0x005d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        mo8467N3(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        mo8467N3(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        mo8467N3(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r12.f8795b0.mo8551K(mo2552c0(), r12.f9278s0.f8308h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r12.f9278s0.f8308h.equals("android") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        r13 = new java.lang.StringBuilder();
        r13.append("SELECT _id,title FROM roms WHERE system='");
        r13.append(r12.f9278s0.f8308h);
        r0 = "' AND ignored=1 ORDER BY sortname ASC";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r13 = new java.lang.StringBuilder();
        r13.append("SELECT _id,filename FROM roms WHERE system='");
        r13.append(r12.f9278s0.f8308h);
        r0 = "' AND ignored=1 ORDER BY filename ASC";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        r13.append(r0);
        r13 = r12.f8794a0.mo9325c().rawQuery(r13.toString(), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (r13.moveToFirst() == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        r0 = r13.getCount();
        r1 = new java.lang.String[r0];
        r7 = new long[r0];
        r8 = new boolean[r0];
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ce, code lost:
        r1[r9] = r13.getString(1);
        r7[r9] = r13.getLong(0);
        r8[r9] = false;
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e1, code lost:
        if (r13.moveToNext() != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e3, code lost:
        r3 = new androidx.appcompat.app.DialogInterfaceC0068b.C0069a(mo2552c0(), com.digdroid.alman.dig.C2553q3.m11117c());
        r3.mo231k(r1, r8, new com.digdroid.alman.dig.C2329g3.DialogInterface$OnMultiChoiceClickListenerC2355p(r12, r8));
        r3.mo235o(com.digdroid.alman.dig.R.string.ok, new com.digdroid.alman.dig.C2329g3.DialogInterface$OnClickListenerC2356q(r12, r0, r8, r7));
        r3.mo232l(com.digdroid.alman.dig.R.string.cancel, null);
        r0 = r3.mo221a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        r0 = new androidx.appcompat.app.DialogInterfaceC0068b.C0069a(mo2552c0(), com.digdroid.alman.dig.C2553q3.m11117c());
        r0 = r0.mo229i("0 " + mo2501D0(com.digdroid.alman.dig.R.string.report_unignore)).mo235o(17039370, new com.digdroid.alman.dig.C2329g3.DialogInterface$OnClickListenerC2330a(r12)).mo221a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0141, code lost:
        r0.show();
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0147, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0148, code lost:
        new com.digdroid.alman.dig.C2329g3.AsyncTaskC2345i(r12).execute(new java.lang.Void[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0152, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0153, code lost:
        com.digdroid.alman.dig.C2223d0.m9876p().mo8215r(mo2552c0(), 6, new com.digdroid.alman.dig.C2329g3.C2344h(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0164, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0165, code lost:
        mo8466M3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0168, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0169, code lost:
        new androidx.appcompat.app.DialogInterfaceC0068b.C0069a(mo2552c0(), com.digdroid.alman.dig.C2553q3.m11117c()).mo228h(com.digdroid.alman.dig.R.string.scan_system_confirm).mo232l(com.digdroid.alman.dig.R.string.cancel, null).mo235o(com.digdroid.alman.dig.R.string.ok, new com.digdroid.alman.dig.C2329g3.DialogInterface$OnClickListenerC2348l(r12)).mo221a().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0191, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0192, code lost:
        m10235L3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0195, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0196, code lost:
        r13 = new androidx.appcompat.app.DialogInterfaceC0068b.C0069a(mo2552c0(), com.digdroid.alman.dig.C2553q3.m11117c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ab, code lost:
        if (mo8899b3(r12.f9278s0.f8308h) == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01ad, code lost:
        r0 = com.digdroid.alman.dig.R.string.inform_reset;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b1, code lost:
        r0 = com.digdroid.alman.dig.R.string.inform_reset_screenshots;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b4, code lost:
        r13.mo228h(r0).mo232l(com.digdroid.alman.dig.R.string.cancel, null).mo235o(com.digdroid.alman.dig.R.string.ok, new com.digdroid.alman.dig.C2329g3.DialogInterface$OnClickListenerC2351n(r12)).mo221a().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01cc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cd, code lost:
        r13 = r12.f8795b0.mo8572w(r12.f9278s0.f8308h);
        r0 = new androidx.appcompat.app.DialogInterfaceC0068b.C0069a(mo2552c0(), com.digdroid.alman.dig.C2553q3.m11117c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e4, code lost:
        if (r13 == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e6, code lost:
        r13 = com.digdroid.alman.dig.R.string.inform_refresh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ea, code lost:
        r13 = com.digdroid.alman.dig.R.string.inform_refresh_screenshots;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ed, code lost:
        r0.mo228h(r13).mo232l(com.digdroid.alman.dig.R.string.cancel, null).mo235o(com.digdroid.alman.dig.R.string.ok, new com.digdroid.alman.dig.C2329g3.DialogInterface$OnClickListenerC2349m(r12)).mo221a().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0205, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0206, code lost:
        r13 = r12.f8799f0;
        r0 = mo2552c0();
        r1 = r12.f9278s0.f8308h;
        r13.mo9284t(r0, r1, r12.f8795b0.mo8572w(r1));
        r12.f8806m0.mo8264R();
        mo8106G2(false);
        mo8407O2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0224, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0225, code lost:
        com.digdroid.alman.dig.C2223d0.m9876p().mo8215r(mo2552c0(), 14, new com.digdroid.alman.dig.C2329g3.C2353o(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0237, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0238, code lost:
        r0 = r12.f8795b0.mo8569t(mo8465K3());
        new com.digdroid.alman.dig.C2165a0(mo2552c0(), new com.digdroid.alman.dig.C2329g3.C2346j(r12, r0)).mo8024c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0254, code lost:
        com.digdroid.alman.dig.C2223d0.m9876p().mo8215r(mo2552c0(), 2, new com.digdroid.alman.dig.C2329g3.C2347k(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0264, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0269, code lost:
        return super.mo8243H2(r13);
     */
    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2728t0
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8243H2(android.view.MenuItem r13) {
        /*
        // Method dump skipped, instructions count: 690
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2329g3.mo8243H2(android.view.MenuItem):boolean");
    }

    /* renamed from: K3 */
    public String mo8465K3() {
        return this.f9278s0.f8308h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M3 */
    public void mo8466M3() {
        DialogInterfaceC0068b bVar = this.f8211F0;
        if (bVar != null && bVar.isShowing()) {
            this.f8211F0.dismiss();
        }
        SQLiteDatabase c = this.f8794a0.mo9325c();
        c.execSQL("UPDATE rompaths SET selected=0 WHERE system='" + this.f9278s0.f8308h + "'");
        Cursor rawQuery = c.rawQuery("SELECT _id,path,selected FROM rompaths WHERE system='" + this.f9278s0.f8308h + "'", null);
        ArrayList arrayList = new ArrayList();
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c());
        aVar.mo238r(R.string.set_rom_paths);
        aVar.mo230j(rawQuery, "selected", "path", new DialogInterface$OnMultiChoiceClickListenerC2331b(arrayList, rawQuery, c));
        aVar.mo235o(R.string.delete, null);
        aVar.mo232l(R.string.add, null);
        aVar.mo233m(R.string.done, null);
        DialogInterfaceC0068b a = aVar.mo221a();
        this.f8211F0 = a;
        a.setOnShowListener(new DialogInterface$OnShowListenerC2332c(arrayList, rawQuery, c));
        this.f8211F0.show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N3 */
    public void mo8467N3(int i) {
        this.f8210E0 = i;
        Iterator<C2357r> it = this.f8212z0.iterator();
        while (it.hasNext()) {
            C2357r next = it.next();
            if (next.f8257a == ((long) this.f8209D0)) {
                next.f8259c = this.f8210E0;
            }
        }
        SQLiteDatabase c = this.f8794a0.mo9325c();
        c.execSQL("UPDATE emulators SET use_retroarch64=" + this.f8210E0 + " WHERE _id=" + this.f8209D0);
        mo2552c0().invalidateOptionsMenu();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2728t0
    /* renamed from: Q2 */
    public void mo8112Q2() {
        if (this.f8806m0 != null) {
            this.f8806m0.mo8903G(this.f8800g0, this.f8795b0.mo8566p(this.f9278s0.f8308h), this.f8795b0.mo8565o(this.f9278s0.f8308h));
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2728t0
    /* renamed from: S2 */
    public void mo8114S2() {
        super.mo8114S2();
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            MenuItem findItem = aVar.mo8254B().findItem(R.id.system_group);
            findItem.setVisible(true);
            findItem.setTitle(this.f8795b0.mo8568s(mo8465K3()));
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment, com.digdroid.alman.dig.C2728t0
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        this.f9278s0.f8308h = mo2568h0().getString("system");
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment, com.digdroid.alman.dig.C2728t0
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.mo2547a1(layoutInflater, viewGroup, bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: m3 */
    public float mo8468m3() {
        return this.f8795b0.mo8567q(mo8465K3());
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2728t0
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        super.mo8439p2(menu);
        menu.findItem(R.id.add_homescreen).setVisible(!this.f8793Z.mo8197u());
        MenuItem findItem = menu.findItem(R.id.manage_system);
        findItem.setVisible(true);
        SubMenu subMenu = findItem.getSubMenu();
        subMenu.clearHeader();
        boolean b3 = mo8899b3(this.f9278s0.f8308h);
        MenuItem findItem2 = subMenu.findItem(R.id.manage_images);
        int i = R.string.manage_mages;
        findItem2.setTitle(b3 ? R.string.manage_mages : R.string.screenshots);
        findItem2.getSubMenu().clearHeader();
        MenuItem findItem3 = menu.findItem(R.id.view);
        findItem3.setVisible(true);
        SubMenu subMenu2 = findItem3.getSubMenu();
        subMenu2.clearHeader();
        MenuItem findItem4 = subMenu2.findItem(R.id.toggle_pic_type);
        if (b3) {
            i = R.string.screenshots;
        }
        findItem4.setTitle(i);
        subMenu2.findItem(R.id.toggle_merge).setTitle(!this.f8795b0.mo8573x(this.f9278s0.f8308h) ? R.string.merged_games : R.string.split_games);
        menu.findItem(R.id.ignore_system).setVisible(!this.f8207B0);
        menu.findItem(R.id.unignore_system).setVisible(this.f8207B0);
        MenuItem findItem5 = menu.findItem(R.id.select_emulator);
        if (this.f8208C0 != null) {
            findItem5.setVisible(true);
            findItem5.setTitle(this.f8208C0);
            SubMenu subMenu3 = findItem5.getSubMenu();
            subMenu3.clearHeader();
            synchronized (this.f8206A0) {
                Iterator<C2357r> it = this.f8212z0.iterator();
                while (it.hasNext()) {
                    C2357r next = it.next();
                    subMenu3.add(0, (int) next.f8257a, 0, next.f8258b);
                }
            }
            boolean s = C2185a4.m9689s(mo2575j0(), "com.retroarch.ra32");
            boolean s2 = C2185a4.m9689s(mo2575j0(), "com.retroarch.aarch64");
            MenuItem findItem6 = menu.findItem(R.id.use_retroarch);
            findItem6.setVisible(this.f8208C0.toLowerCase().contains("retroarch") && (s || s2));
            findItem6.setTitle(C2882y2.m11933v(mo2575j0(), this.f8210E0));
            SubMenu subMenu4 = findItem6.getSubMenu();
            subMenu4.clearHeader();
            subMenu4.findItem(R.id.use_default_ra).setTitle(C2882y2.m11933v(mo2575j0(), 0));
            MenuItem findItem7 = subMenu4.findItem(R.id.use_ra32);
            findItem7.setVisible(s);
            findItem7.setTitle(C2882y2.m11933v(mo2575j0(), 2));
            MenuItem findItem8 = subMenu4.findItem(R.id.use_ra64);
            findItem8.setVisible(s2);
            findItem8.setTitle(C2882y2.m11933v(mo2575j0(), 1));
            return;
        }
        findItem5.setVisible(false);
        menu.findItem(R.id.use_retroarch).setVisible(false);
        menu.findItem(R.id.select_rom_paths).setVisible(false);
        menu.findItem(R.id.scan_system).setVisible(false);
        menu.findItem(R.id.retroarch_overlay).setVisible(false);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment, com.digdroid.alman.dig.C2728t0
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        this.f8802i0 = true;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        synchronized (this.f8206A0) {
            this.f8212z0 = new ArrayList<>();
        }
        new AsyncTaskC2361t().execute(new Void[0]);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: u3 */
    public void mo8469u3(float f) {
        this.f8795b0.mo8547G(mo8465K3(), f);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: z3 */
    public String mo8143z3() {
        return "date";
    }
}
