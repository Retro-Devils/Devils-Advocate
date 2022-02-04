package com.digdroid.alman.dig;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2375h3;
import com.digdroid.alman.dig.C2391i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.digdroid.alman.dig.t1 */
public class C2749t1 {

    /* renamed from: a */
    static C2749t1 f9320a;

    /* renamed from: b */
    Context f9321b;

    /* renamed from: c */
    C2219c3 f9322c;

    /* renamed from: d */
    C2375h3 f9323d;

    /* renamed from: e */
    C2775u f9324e;

    /* renamed from: f */
    HashMap<String, Boolean> f9325f = new HashMap<>();

    /* renamed from: com.digdroid.alman.dig.t1$a */
    class DialogInterface$OnClickListenerC2750a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f9326b;

        /* renamed from: c */
        final /* synthetic */ Activity f9327c;

        /* renamed from: d */
        final /* synthetic */ String f9328d;

        /* renamed from: e */
        final /* synthetic */ AbstractC2772l f9329e;

        /* renamed from: f */
        final /* synthetic */ String f9330f;

        /* renamed from: g */
        final /* synthetic */ boolean f9331g;

        /* renamed from: com.digdroid.alman.dig.t1$a$a */
        class C2751a implements C2391i.AbstractC2394b {
            C2751a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                Activity activity = DialogInterface$OnClickListenerC2750a.this.f9327c;
                String str = strArr[0];
                C2185a4.m9672b(activity, str, DialogInterface$OnClickListenerC2750a.this.f9328d + "/" + DialogInterface$OnClickListenerC2750a.this.f9326b + ".png");
                C2749t1.this.f9323d.mo8557f();
                DialogInterface$OnClickListenerC2750a.this.f9329e.mo8684a();
            }
        }

        /* renamed from: com.digdroid.alman.dig.t1$a$b */
        class C2752b implements C2375h3.AbstractC2390o {
            C2752b() {
            }

            @Override // com.digdroid.alman.dig.C2375h3.AbstractC2390o
            /* renamed from: a */
            public void mo8502a() {
                DialogInterface$OnClickListenerC2750a.this.f9327c.recreate();
            }
        }

        /* renamed from: com.digdroid.alman.dig.t1$a$c */
        class C2753c implements C2223d0.AbstractC2249s {

            /* renamed from: com.digdroid.alman.dig.t1$a$c$a */
            class DialogInterface$OnClickListenerC2754a implements DialogInterface.OnClickListener {

                /* renamed from: com.digdroid.alman.dig.t1$a$c$a$a */
                class C2755a implements C2375h3.AbstractC2388m {
                    C2755a() {
                    }

                    @Override // com.digdroid.alman.dig.C2375h3.AbstractC2388m
                    /* renamed from: a */
                    public void mo8585a(String str) {
                        C2749t1.this.f9322c.mo8174W(true);
                        DialogInterface$OnClickListenerC2750a aVar = DialogInterface$OnClickListenerC2750a.this;
                        C2749t1.this.mo9290z(str, aVar.f9326b);
                        DialogInterface$OnClickListenerC2750a.this.f9327c.recreate();
                    }
                }

                DialogInterface$OnClickListenerC2754a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterface$OnClickListenerC2750a aVar = DialogInterface$OnClickListenerC2750a.this;
                    C2749t1.this.f9323d.mo8558g(aVar.f9326b, new C2755a());
                }
            }

            C2753c() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                new DialogInterfaceC0068b.C0069a(DialogInterface$OnClickListenerC2750a.this.f9327c, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2754a()).mo221a().show();
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
            }
        }

        /* renamed from: com.digdroid.alman.dig.t1$a$d */
        class DialogInterface$OnClickListenerC2756d implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2756d() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SQLiteDatabase c = C2749t1.this.f9324e.mo9325c();
                c.execSQL("UPDATE rompaths SET system='" + DialogInterface$OnClickListenerC2750a.this.f9330f + "' WHERE system='" + DialogInterface$OnClickListenerC2750a.this.f9326b + "'");
                SQLiteDatabase c2 = C2749t1.this.f9324e.mo9325c();
                c2.execSQL("UPDATE roms SET system='" + DialogInterface$OnClickListenerC2750a.this.f9330f + "' WHERE system='" + DialogInterface$OnClickListenerC2750a.this.f9326b + "'");
                SQLiteDatabase c3 = C2749t1.this.f9324e.mo9325c();
                c3.execSQL("UPDATE roms SET merged_with=-1 WHERE system='" + DialogInterface$OnClickListenerC2750a.this.f9326b + "' OR system='" + DialogInterface$OnClickListenerC2750a.this.f9330f + "'");
                DatabaseService.m9478v(C2749t1.this.f9321b, "merge_games");
                DialogInterface$OnClickListenerC2750a aVar = DialogInterface$OnClickListenerC2750a.this;
                C2749t1.this.f9323d.mo8545E(aVar.f9330f);
                SQLiteDatabase c4 = C2749t1.this.f9324e.mo9325c();
                c4.execSQL("DELETE FROM systems WHERE slug='" + DialogInterface$OnClickListenerC2750a.this.f9326b + "'");
                DialogInterface$OnClickListenerC2750a aVar2 = DialogInterface$OnClickListenerC2750a.this;
                C2749t1.this.f9323d.mo8559h(aVar2.f9326b);
                DialogInterface$OnClickListenerC2750a.this.f9327c.recreate();
            }
        }

        DialogInterface$OnClickListenerC2750a(String str, Activity activity, String str2, AbstractC2772l lVar, String str3, boolean z) {
            this.f9326b = str;
            this.f9327c = activity;
            this.f9328d = str2;
            this.f9329e = lVar;
            this.f9330f = str3;
            this.f9331g = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                SQLiteDatabase c = C2749t1.this.f9324e.mo9325c();
                Cursor rawQuery = c.rawQuery("SELECT _id FROM systems WHERE slug='" + this.f9326b + "'", null);
                if (rawQuery.moveToFirst()) {
                    C2391i iVar = new C2391i(this.f9327c);
                    iVar.mo8591g(true);
                    iVar.mo8592h(new C2751a());
                    iVar.mo8588d();
                }
                rawQuery.close();
            } else if (i == 1) {
                if (C2553q3.f8891a.f9416t.equals("")) {
                    C2749t1.this.mo9290z(this.f9326b, this.f9330f);
                    C2749t1.this.f9323d.mo8557f();
                    this.f9327c.recreate();
                }
            } else if (i == 2) {
                C2749t1.this.f9323d.mo8544D(this.f9327c, this.f9326b);
            } else if (i == 3) {
                if (this.f9331g) {
                    C2749t1.this.f9323d.mo8551K(this.f9327c, this.f9326b);
                } else {
                    C2749t1.this.f9323d.mo8542B(this.f9327c, this.f9326b, new C2752b());
                }
            } else if (i == 4 && !this.f9330f.equals("android")) {
                if (this.f9326b.equals(this.f9330f)) {
                    C2223d0.m9876p().mo8215r(this.f9327c, 8, new C2753c());
                } else {
                    new DialogInterfaceC0068b.C0069a(this.f9327c, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2756d()).mo221a().show();
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.t1$b */
    class DialogInterface$OnClickListenerC2757b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9339b;

        /* renamed from: c */
        final /* synthetic */ String f9340c;

        /* renamed from: d */
        final /* synthetic */ long f9341d;

        /* renamed from: e */
        final /* synthetic */ SQLiteDatabase f9342e;

        /* renamed from: f */
        final /* synthetic */ AbstractC2772l f9343f;

        /* renamed from: g */
        final /* synthetic */ String f9344g;

        /* renamed from: h */
        final /* synthetic */ AbstractC2531p1 f9345h;

        /* renamed from: i */
        final /* synthetic */ boolean f9346i;

        /* renamed from: com.digdroid.alman.dig.t1$b$a */
        class C2758a implements C2391i.AbstractC2394b {
            C2758a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                DialogInterface$OnClickListenerC2757b bVar = DialogInterface$OnClickListenerC2757b.this;
                C2185a4.m9672b(bVar.f9339b, strArr[0], C2749t1.this.mo9273h(bVar.f9340c, bVar.f9341d, true).getAbsolutePath());
                SQLiteDatabase sQLiteDatabase = DialogInterface$OnClickListenerC2757b.this.f9342e;
                sQLiteDatabase.execSQL("UPDATE roms SET has_images=NULL WHERE _id=" + DialogInterface$OnClickListenerC2757b.this.f9341d);
                ImageService.m9511a(DialogInterface$OnClickListenerC2757b.this.f9339b.getApplicationContext());
                DialogInterface$OnClickListenerC2757b.this.f9343f.mo8684a();
            }
        }

        /* renamed from: com.digdroid.alman.dig.t1$b$b */
        class DialogInterface$OnClickListenerC2759b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2759b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SQLiteDatabase sQLiteDatabase;
                StringBuilder sb;
                try {
                    DialogInterface$OnClickListenerC2757b bVar = DialogInterface$OnClickListenerC2757b.this;
                    File h = C2749t1.this.mo9273h(bVar.f9340c, bVar.f9341d, false);
                    if (h.exists()) {
                        try {
                            h.delete();
                        } catch (Exception unused) {
                        }
                    }
                    DialogInterface$OnClickListenerC2757b bVar2 = DialogInterface$OnClickListenerC2757b.this;
                    if (!bVar2.f9346i) {
                        sQLiteDatabase = bVar2.f9342e;
                        sb = new StringBuilder();
                        sb.append("UPDATE roms SET has_images=NULL,cover_status=cover_status|21255 WHERE _id=");
                        sb.append(DialogInterface$OnClickListenerC2757b.this.f9341d);
                    } else {
                        sQLiteDatabase = bVar2.f9342e;
                        sb = new StringBuilder();
                        sb.append("UPDATE roms SET has_images=NULL,cover_status=(cover_status&-8193)|20480 WHERE _id=");
                        sb.append(DialogInterface$OnClickListenerC2757b.this.f9341d);
                    }
                    sQLiteDatabase.execSQL(sb.toString());
                    ImageService.m9511a(C2749t1.this.f9321b.getApplicationContext());
                    DialogInterface$OnClickListenerC2757b.this.f9339b.recreate();
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: com.digdroid.alman.dig.t1$b$c */
        class DialogInterface$OnClickListenerC2760c implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2760c() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface$OnClickListenerC2757b bVar = DialogInterface$OnClickListenerC2757b.this;
                File h = C2749t1.this.mo9273h(bVar.f9340c, bVar.f9341d, false);
                if (h.exists()) {
                    try {
                        h.delete();
                    } catch (Exception unused) {
                    }
                }
                SQLiteDatabase sQLiteDatabase = DialogInterface$OnClickListenerC2757b.this.f9342e;
                sQLiteDatabase.execSQL("UPDATE roms SET has_images=NULL WHERE _id=" + DialogInterface$OnClickListenerC2757b.this.f9341d);
                ImageService.m9511a(DialogInterface$OnClickListenerC2757b.this.f9339b.getApplicationContext());
                DialogInterface$OnClickListenerC2757b.this.f9339b.recreate();
            }
        }

        DialogInterface$OnClickListenerC2757b(Activity activity, String str, long j, SQLiteDatabase sQLiteDatabase, AbstractC2772l lVar, String str2, AbstractC2531p1 p1Var, boolean z) {
            this.f9339b = activity;
            this.f9340c = str;
            this.f9341d = j;
            this.f9342e = sQLiteDatabase;
            this.f9343f = lVar;
            this.f9344g = str2;
            this.f9345h = p1Var;
            this.f9346i = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DialogInterfaceC0068b.C0069a l;
            DialogInterface.OnClickListener cVar;
            String str;
            C2749t1 t1Var;
            Activity activity;
            AbstractC2531p1 p1Var;
            long j;
            if (i == 0) {
                C2391i iVar = new C2391i(this.f9339b);
                iVar.mo8591g(true);
                iVar.mo8592h(new C2758a());
                iVar.mo8588d();
            } else if (i == 1) {
                try {
                    C2749t1.this.mo9278m(this.f9339b, this.f9345h, this.f9341d, this.f9340c, "http://www.mobygames.com/search/quick?q=" + URLEncoder.encode(this.f9344g, "utf-8"));
                } catch (Exception unused) {
                }
            } else {
                if (i == 2) {
                    str = "http://thegamesdb.net/search.php/?name=" + URLEncoder.encode(this.f9344g, "utf-8") + "&function=Search";
                    t1Var = C2749t1.this;
                    activity = this.f9339b;
                    p1Var = this.f9345h;
                    j = this.f9341d;
                } else if (i == 3) {
                    Cursor rawQuery = this.f9342e.rawQuery("SELECT s.name FROM systems as s,roms as r WHERE r._id=" + this.f9341d + " AND s.slug=r.system", null);
                    if (rawQuery.moveToFirst()) {
                        String encode = URLEncoder.encode(this.f9344g + " " + rawQuery.getString(0), "utf-8");
                        rawQuery.close();
                        str = "https://www.google.com/search?q=" + encode + "&tbm=isch";
                        t1Var = C2749t1.this;
                        activity = this.f9339b;
                        p1Var = this.f9345h;
                        j = this.f9341d;
                    } else {
                        rawQuery.close();
                        return;
                    }
                } else {
                    if (i == 4) {
                        l = new DialogInterfaceC0068b.C0069a(this.f9339b, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null);
                        cVar = new DialogInterface$OnClickListenerC2759b();
                    } else if (i == 5) {
                        l = new DialogInterfaceC0068b.C0069a(this.f9339b, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null);
                        cVar = new DialogInterface$OnClickListenerC2760c();
                    } else {
                        return;
                    }
                    l.mo235o(R.string.ok, cVar).mo221a().show();
                    return;
                }
                t1Var.mo9278m(activity, p1Var, j, this.f9340c, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t1$c */
    public class C2761c implements C2223d0.AbstractC2249s {

        /* renamed from: a */
        final /* synthetic */ Activity f9351a;

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9352b;

        /* renamed from: c */
        final /* synthetic */ long f9353c;

        /* renamed from: d */
        final /* synthetic */ String f9354d;

        /* renamed from: e */
        final /* synthetic */ String f9355e;

        C2761c(Activity activity, AbstractC2531p1 p1Var, long j, String str, String str2) {
            this.f9351a = activity;
            this.f9352b = p1Var;
            this.f9353c = j;
            this.f9354d = str;
            this.f9355e = str2;
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2749t1.this.mo9279n(this.f9351a, this.f9352b, this.f9353c, this.f9354d, this.f9355e);
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t1$d */
    public class DialogInterface$OnClickListenerC2762d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f9357b;

        /* renamed from: c */
        final /* synthetic */ Activity f9358c;

        /* renamed from: d */
        final /* synthetic */ AbstractC2531p1 f9359d;

        /* renamed from: e */
        final /* synthetic */ long f9360e;

        /* renamed from: f */
        final /* synthetic */ String f9361f;

        /* renamed from: g */
        final /* synthetic */ String f9362g;

        DialogInterface$OnClickListenerC2762d(View view, Activity activity, AbstractC2531p1 p1Var, long j, String str, String str2) {
            this.f9357b = view;
            this.f9358c = activity;
            this.f9359d = p1Var;
            this.f9360e = j;
            this.f9361f = str;
            this.f9362g = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2749t1.this.f9322c.mo8152A("inform_image_download", ((CheckBox) this.f9357b.findViewById(R.id.not_again)).isChecked());
            C2749t1.this.mo9280o(this.f9358c, this.f9359d, this.f9360e, this.f9361f, this.f9362g);
        }
    }

    /* renamed from: com.digdroid.alman.dig.t1$e */
    class C2763e implements C2391i.AbstractC2394b {

        /* renamed from: a */
        final /* synthetic */ Activity f9364a;

        /* renamed from: b */
        final /* synthetic */ String f9365b;

        /* renamed from: c */
        final /* synthetic */ boolean f9366c;

        C2763e(Activity activity, String str, boolean z) {
            this.f9364a = activity;
            this.f9365b = str;
            this.f9366c = z;
        }

        @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
        /* renamed from: a */
        public void mo8043a(String[] strArr) {
            C2749t1.this.mo9285u(this.f9364a, this.f9365b, this.f9366c, strArr[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t1$f */
    public class C2764f implements AbstractC2767i {

        /* renamed from: a */
        final /* synthetic */ String f9368a;

        /* renamed from: b */
        final /* synthetic */ Activity f9369b;

        /* renamed from: c */
        final /* synthetic */ String f9370c;

        C2764f(String str, Activity activity, String str2) {
            this.f9368a = str;
            this.f9369b = activity;
            this.f9370c = str2;
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2767i
        /* renamed from: a */
        public boolean mo9298a(File file) {
            String name = file.getName();
            return name.equals("Covers") || name.equals("Screenshots");
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2767i
        /* renamed from: b */
        public String mo9299b() {
            String str = this.f9368a;
            C2399i2 i2Var = new C2399i2(C2399i2.m10374d(this.f9369b, str), "Covers");
            return !i2Var.exists() ? i2Var.getParentFile().getAbsolutePath() : str;
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2767i
        /* renamed from: c */
        public String mo9300c() {
            return this.f9370c;
        }
    }

    /* renamed from: com.digdroid.alman.dig.t1$g */
    class C2765g implements AbstractC2767i {

        /* renamed from: a */
        final /* synthetic */ String f9372a;

        /* renamed from: b */
        final /* synthetic */ String f9373b;

        /* renamed from: c */
        final /* synthetic */ String f9374c;

        C2765g(String str, String str2, String str3) {
            this.f9372a = str;
            this.f9373b = str2;
            this.f9374c = str3;
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2767i
        /* renamed from: a */
        public boolean mo9298a(File file) {
            return new File(this.f9374c + "/" + file.getName() + ".cfg").exists();
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2767i
        /* renamed from: b */
        public String mo9299b() {
            return this.f9372a;
        }

        @Override // com.digdroid.alman.dig.C2749t1.AbstractC2767i
        /* renamed from: c */
        public String mo9300c() {
            return this.f9373b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t1$h */
    public class DialogInterface$OnClickListenerC2766h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f9376b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2767i f9377c;

        DialogInterface$OnClickListenerC2766h(Activity activity, AbstractC2767i iVar) {
            this.f9376b = activity;
            this.f9377c = iVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new AsyncTaskC2768j(this.f9376b, this.f9377c).execute(new String[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t1$i */
    public interface AbstractC2767i {
        /* renamed from: a */
        boolean mo9298a(File file);

        /* renamed from: b */
        String mo9299b();

        /* renamed from: c */
        String mo9300c();
    }

    /* renamed from: com.digdroid.alman.dig.t1$j */
    class AsyncTaskC2768j extends AsyncTask<String, Object, String> {

        /* renamed from: a */
        WeakReference<Activity> f9379a;

        /* renamed from: b */
        AbstractC2767i f9380b;

        /* renamed from: c */
        ProgressDialog f9381c;

        /* renamed from: d */
        C2399i2 f9382d;

        /* renamed from: e */
        C2399i2 f9383e;

        /* renamed from: f */
        String f9384f;

        /* renamed from: g */
        int f9385g = 0;

        /* renamed from: h */
        int f9386h = 0;

        /* renamed from: com.digdroid.alman.dig.t1$j$a */
        class DialogInterface$OnClickListenerC2769a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2769a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AsyncTaskC2768j.this.cancel(true);
            }
        }

        public AsyncTaskC2768j(Activity activity, AbstractC2767i iVar) {
            this.f9379a = new WeakReference<>(activity);
            this.f9382d = C2399i2.m10374d(activity, iVar.mo9299b());
            this.f9383e = C2399i2.m10374d(activity, iVar.mo9300c());
            this.f9380b = iVar;
            this.f9384f = this.f9382d.getPath();
        }

        /* renamed from: a */
        private void m11709a(File file, File file2) {
            File[] listFiles;
            int i;
            int i2 = 1;
            this.f9385g++;
            if (this.f9379a.get() != null) {
                if (!file2.exists()) {
                    try {
                        file2.mkdirs();
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (file.exists() && (listFiles = file.listFiles()) != null) {
                    this.f9386h += listFiles.length;
                    byte[] bArr = new byte[1024];
                    int i3 = 0;
                    while (i3 < listFiles.length) {
                        try {
                            C2399i2 c = C2399i2.m10373c(listFiles[i3]);
                            if (c.isDirectory()) {
                                m11709a(c, new C2399i2(file2, c.getName()));
                            } else {
                                InputStream i4 = c.mo8606i();
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(i4);
                                OutputStream j = new C2399i2(file2, c.getName()).mo8608j();
                                if (j != null) {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(j);
                                    double length = (double) c.length();
                                    i = i3;
                                    double d = (double) 1048576;
                                    Double.isNaN(length);
                                    Double.isNaN(d);
                                    try {
                                        int floor = ((int) Math.floor(length / d)) + i2;
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            bufferedOutputStream.write(bArr, 0, read);
                                            i5 += read;
                                            if (i5 > 1048576) {
                                                i6++;
                                                publishProgress(c.getName(), Integer.valueOf(floor), Integer.valueOf(i6));
                                                i5 = 0;
                                            }
                                        }
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        j.close();
                                        bufferedInputStream.close();
                                        i4.close();
                                        Object[] objArr = new Object[3];
                                        try {
                                            objArr[0] = c.getName();
                                            try {
                                                objArr[1] = new Integer(listFiles.length);
                                                objArr[2] = new Integer(i + 1);
                                                publishProgress(objArr);
                                                c.delete();
                                            } catch (Exception unused2) {
                                            }
                                        } catch (Exception unused3) {
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    i3 = i + 1;
                                    i2 = 1;
                                }
                            }
                        } catch (Exception unused5) {
                        }
                        i = i3;
                        i3 = i + 1;
                        i2 = 1;
                    }
                    try {
                        if (!file.getPath().equals(this.f9384f)) {
                            file.delete();
                        }
                    } catch (Exception unused6) {
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String doInBackground(String... strArr) {
            File[] listFiles;
            C2399i2 i2Var = this.f9382d;
            if (i2Var == null || !i2Var.isDirectory() || (listFiles = i2Var.listFiles()) == null) {
                return null;
            }
            for (File file : listFiles) {
                if (file.isDirectory() && this.f9380b.mo9298a(file)) {
                    m11709a(file, new C2399i2(this.f9383e, file.getName()));
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            try {
                Activity activity = this.f9379a.get();
                if (activity != null && !activity.isFinishing()) {
                    this.f9381c.dismiss();
                }
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressDialog progressDialog = new ProgressDialog(this.f9379a.get());
            this.f9381c = progressDialog;
            progressDialog.setCancelable(false);
            this.f9381c.setProgressStyle(1);
            this.f9381c.setIndeterminate(false);
            this.f9381c.setTitle("Moving ");
            this.f9381c.setButton(-2, "Cancel", new DialogInterface$OnClickListenerC2769a());
            this.f9381c.show();
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(Object... objArr) {
            Activity activity = this.f9379a.get();
            if (activity != null && !activity.isFinishing()) {
                this.f9381c.setTitle((String) objArr[0]);
                this.f9381c.setMax(((Integer) objArr[1]).intValue());
                this.f9381c.setProgress(((Integer) objArr[2]).intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t1$k */
    public class AsyncTaskC2770k extends AsyncTask<String, Integer, String> {

        /* renamed from: a */
        WeakReference<Activity> f9389a;

        /* renamed from: b */
        ProgressDialog f9390b;

        /* renamed from: c */
        File[] f9391c;

        /* renamed from: d */
        String f9392d;

        /* renamed from: e */
        String f9393e;

        /* renamed from: f */
        C2456l0 f9394f = new C2456l0(C2886z1.m11967b(null).mo9515a());

        /* renamed from: com.digdroid.alman.dig.t1$k$a */
        class DialogInterface$OnClickListenerC2771a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2771a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AsyncTaskC2770k.this.cancel(true);
            }
        }

        public AsyncTaskC2770k(Activity activity, File[] fileArr, String str, String str2) {
            this.f9389a = new WeakReference<>(activity);
            this.f9391c = fileArr;
            this.f9392d = str;
            this.f9393e = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Pattern compile = Pattern.compile("^(.+)\\.(?:jpg|png|gif|bmp|jpeg)$", 2);
            for (int i = 0; i < this.f9391c.length && !isCancelled(); i++) {
                try {
                    Matcher matcher = compile.matcher(this.f9391c[i].getName());
                    if (matcher.find()) {
                        C2749t1.this.mo9283s(this.f9394f, this.f9392d, this.f9393e, this.f9391c[i], matcher.group(1));
                    }
                    publishProgress(Integer.valueOf(i + 1));
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                Activity activity = this.f9389a.get();
                if (activity != null && !activity.isFinishing()) {
                    this.f9390b.dismiss();
                }
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(Integer... numArr) {
            Activity activity = this.f9389a.get();
            if (activity != null && !activity.isFinishing()) {
                this.f9390b.setProgress(numArr[0].intValue());
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressDialog progressDialog = new ProgressDialog(this.f9389a.get());
            this.f9390b = progressDialog;
            progressDialog.setCancelable(false);
            this.f9390b.setProgressStyle(1);
            this.f9390b.setIndeterminate(false);
            this.f9390b.setMax(this.f9391c.length);
            this.f9390b.setButton(-2, "Cancel", new DialogInterface$OnClickListenerC2771a());
            this.f9390b.show();
        }
    }

    /* renamed from: com.digdroid.alman.dig.t1$l */
    public interface AbstractC2772l {
        /* renamed from: a */
        void mo8684a();
    }

    private C2749t1(Context context) {
        this.f9321b = context;
        this.f9322c = C2219c3.m9805k(context);
        C2775u e = C2775u.m11726e(context);
        this.f9324e = e;
        C2375h3 r = C2375h3.m10306r(context, e);
        this.f9323d = r;
        r.mo8543C();
    }

    /* renamed from: p */
    public static synchronized C2749t1 m11663p(Context context) {
        C2749t1 t1Var;
        synchronized (C2749t1.class) {
            if (f9320a == null) {
                f9320a = new C2749t1(context.getApplicationContext());
            }
            t1Var = f9320a;
        }
        return t1Var;
    }

    /* renamed from: A */
    public void mo9264A() {
        if (mo9269d(mo9282r())) {
            Cursor rawQuery = this.f9324e.mo9325c().rawQuery("SELECT slug,parent FROM systems", null);
            if (rawQuery.moveToFirst()) {
                do {
                    if (!new File(mo9282r() + "/" + rawQuery.getString(0) + ".png").exists()) {
                        mo9290z(rawQuery.getString(0), rawQuery.getString(1));
                    }
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:7|8|(2:9|(1:11)(1:51))|12|13|14|15|16|17) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0026 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0036 A[SYNTHETIC, Splitter:B:27:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003d A[SYNTHETIC, Splitter:B:31:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0044 A[SYNTHETIC, Splitter:B:39:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x004d A[SYNTHETIC, Splitter:B:44:0x004d] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo9265B(android.net.Uri r4, java.io.File r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r1 = 0
            android.content.Context r2 = r3.f9321b     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            java.io.InputStream r4 = r2.openInputStream(r4)     // Catch:{ Exception -> 0x0041, all -> 0x0032 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0042, all -> 0x0030 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0042, all -> 0x0030 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x002e, all -> 0x002b }
        L_0x0016:
            int r1 = r4.read(r5)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            if (r1 <= 0) goto L_0x0020
            r2.write(r5, r0, r1)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            goto L_0x0016
        L_0x0020:
            r2.flush()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.close()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            r4.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            r0 = 1
            goto L_0x0053
        L_0x002b:
            r5 = move-exception
            r1 = r2
            goto L_0x0034
        L_0x002e:
            r1 = r2
            goto L_0x0042
        L_0x0030:
            r5 = move-exception
            goto L_0x0034
        L_0x0032:
            r5 = move-exception
            r4 = r1
        L_0x0034:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0041:
            r4 = r1
        L_0x0042:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x004b
        L_0x0048:
            r4 = move-exception
            goto L_0x0051
        L_0x004a:
        L_0x004b:
            if (r4 == 0) goto L_0x0053
            r4.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0053
        L_0x0051:
            monitor-exit(r3)
            throw r4
        L_0x0053:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2749t1.mo9265B(android.net.Uri, java.io.File):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9266a(Activity activity, String str, String str2) {
        mo9267b(activity, new C2764f(str, activity, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9267b(Activity activity, AbstractC2767i iVar) {
        new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo228h(R.string.confirm_copy).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2766h(activity, iVar)).mo221a().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9268c(MainActivity mainActivity, String str, String str2) {
        String C = new C2724s3(mainActivity).mo9202C();
        if (C != null) {
            mo9267b(mainActivity, new C2765g(str, str2, C));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9269d(String str) {
        return mo9270e(str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9270e(String str, boolean z) {
        if (str == null) {
            return false;
        }
        if (!z && this.f9325f.containsKey(str)) {
            return true;
        }
        C2399i2 d = C2399i2.m10374d(this.f9321b, str);
        if (d.exists()) {
            this.f9325f.put(str, Boolean.TRUE);
            return true;
        }
        synchronized (this) {
            try {
                d.mkdirs();
                this.f9325f.put(str, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9271f(File file, Cursor cursor, boolean z, String str) {
        int lastIndexOf;
        String string = cursor.getString(0);
        if (!z && (lastIndexOf = string.lastIndexOf(".")) > 0) {
            string = string.substring(0, lastIndexOf);
        }
        C2399i2 d = C2399i2.m10374d(this.f9321b, str);
        C2399i2 i2Var = new C2399i2(d, string + ".png");
        if (!i2Var.exists()) {
            mo9265B(Uri.fromFile(file), i2Var);
            SQLiteDatabase c = this.f9324e.mo9325c();
            c.execSQL("UPDATE roms SET has_images=NULL WHERE _id=" + cursor.getLong(1));
            ImageService.m9511a(this.f9321b.getApplicationContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public File mo9272g(long j, boolean z) {
        SQLiteDatabase c = this.f9324e.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT pathid,filename,foldername,system FROM roms WHERE _id=" + j, null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        String string = rawQuery.getString(2);
        if (string == null) {
            string = rawQuery.getString(1);
        }
        String string2 = rawQuery.getString(3);
        rawQuery.close();
        return mo9274i(mo9277l(!this.f9323d.mo8572w(string2)), string, string2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public File mo9273h(String str, long j, boolean z) {
        SQLiteDatabase c = this.f9324e.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT pathid,filename,foldername,system FROM roms WHERE _id=" + j, null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        String string = rawQuery.getString(2);
        if (string == null) {
            string = rawQuery.getString(1);
        }
        String string2 = rawQuery.getString(3);
        rawQuery.close();
        return mo9274i(str, string, string2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public File mo9274i(String str, String str2, String str3, boolean z) {
        int lastIndexOf;
        String t = this.f9323d.mo8569t(str3);
        if (!t.equals("pc") && !t.equals("scumm") && !t.equals("android") && (lastIndexOf = str2.lastIndexOf(46)) > 0) {
            str2 = str2.substring(0, lastIndexOf);
        }
        Context context = this.f9321b;
        C2399i2 d = C2399i2.m10374d(context, C2185a4.m9678h(context));
        C2399i2 i2Var = new C2399i2(d, str + "/" + t);
        mo9270e(i2Var.getAbsolutePath(), z);
        return new C2399i2(i2Var, str2 + ".png");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public File mo9275j(boolean z, String str, String str2) {
        return mo9274i(mo9277l(z), str, str2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9276k(Activity activity, AbstractC2531p1 p1Var, long j, boolean z, AbstractC2772l lVar) {
        if (activity != null && !activity.isFinishing()) {
            String l = mo9277l(z);
            SQLiteDatabase c = this.f9324e.mo9325c();
            Cursor rawQuery = c.rawQuery("SELECT title,system FROM roms WHERE _id=" + j, null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return;
            }
            String string = rawQuery.getString(0);
            rawQuery.getString(1);
            rawQuery.close();
            new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo238r(R.string.get_game_image).mo227g(new CharSequence[]{activity.getString(R.string.your_device), activity.getString(R.string.mobygames), activity.getString(R.string.thegamedb), activity.getString(R.string.google_images), activity.getString(R.string.reset_image), activity.getString(R.string.delete_image)}, new DialogInterface$OnClickListenerC2757b(activity, l, j, c, lVar, string, p1Var, z)).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo9277l(boolean z) {
        return z ? "Screenshots" : "Covers";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo9278m(Activity activity, AbstractC2531p1 p1Var, long j, String str, String str2) {
        if (this.f9322c.mo8197u()) {
            mo9279n(activity, p1Var, j, str, str2);
        } else {
            C2223d0.m9876p().mo8215r(activity, 4, new C2761c(activity, p1Var, j, str, str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo9279n(Activity activity, AbstractC2531p1 p1Var, long j, String str, String str2) {
        if (this.f9322c.mo8180c("inform_image_download", false)) {
            mo9280o(activity, p1Var, j, str, str2);
            return;
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.not_again, (ViewGroup) null);
        String string = activity.getString(R.string.inform_image_download);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setTextColor(C2553q3.m11116b());
        textView.setText(string);
        C2553q3.m11133s((TextView) inflate.findViewById(R.id.not_again));
        new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo240t(inflate).mo235o(17039370, new DialogInterface$OnClickListenerC2762d(inflate, activity, p1Var, j, str, str2)).mo221a().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo9280o(Activity activity, AbstractC2531p1 p1Var, long j, String str, String str2) {
        if (activity != null && !activity.isFinishing()) {
            this.f9322c.mo8201y("get_game_image", j);
            this.f9322c.mo8201y("get_game_image_t", System.currentTimeMillis());
            this.f9322c.mo8202z("get_game_image_dir", str);
            Intent intent = new Intent();
            intent.setData(Uri.parse(str2));
            intent.setAction("android.intent.action.VIEW");
            try {
                activity.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo9281q(Activity activity, String str, String str2, AbstractC2772l lVar) {
        File[] b;
        if (activity != null && !activity.isFinishing()) {
            String str3 = C2553q3.f8891a.f9416t;
            if (str3.equals("") && (b = C2372h2.m10298b(this.f9321b)) != null && b.length > 0) {
                str3 = b[0].getAbsolutePath() + "/Systems/icons";
            }
            if (!str3.equals("")) {
                CharSequence[] charSequenceArr = new CharSequence[5];
                Cursor rawQuery = this.f9324e.mo9325c().rawQuery("SELECT ignored,parent FROM systems WHERE slug='" + str + "'", null);
                rawQuery.moveToFirst();
                boolean z = rawQuery.getInt(0) != 0;
                rawQuery.close();
                charSequenceArr[0] = activity.getString(R.string.new_image);
                charSequenceArr[1] = activity.getString(R.string.original_image);
                charSequenceArr[2] = activity.getString(R.string.rename_system);
                charSequenceArr[3] = activity.getString(z ? R.string.unignore_system : R.string.ignore_system);
                charSequenceArr[4] = activity.getString(str.equals(str2) ? R.string.clone_system : R.string.delete_clone);
                new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2750a(str, activity, str3, lVar, str2, z)).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public String mo9282r() {
        File externalFilesDir = this.f9321b.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath() + "/Systems/icons";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo9283s(C2456l0 l0Var, String str, String str2, File file, String str3) {
        boolean z = str.equals("pc") || str.equals("scumm") || str.equals("android");
        SQLiteDatabase c = this.f9324e.mo9325c();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT filename,_id FROM roms WHERE system='");
        sb.append(str);
        sb.append("' AND filename LIKE ");
        sb.append(DatabaseUtils.sqlEscapeString(str3 + "%"));
        Cursor rawQuery = c.rawQuery(sb.toString(), null);
        if (rawQuery.moveToFirst()) {
            mo9271f(file, rawQuery, z, str2);
            rawQuery.close();
            return;
        }
        rawQuery.close();
        long e = l0Var.mo8712e(str, file.getName(), false, 80, false);
        if (e >= 0) {
            SQLiteDatabase c2 = this.f9324e.mo9325c();
            Cursor rawQuery2 = c2.rawQuery("SELECT filename,_id FROM roms WHERE mdbid=" + e, null);
            if (rawQuery2.moveToFirst()) {
                do {
                    mo9271f(file, rawQuery2, z, str2);
                } while (rawQuery2.moveToNext());
            }
            rawQuery2.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo9284t(Activity activity, String str, boolean z) {
        C2391i iVar = new C2391i(activity);
        iVar.mo8593i(this.f9321b.getString(R.string.import_folder));
        iVar.mo8592h(new C2763e(activity, str, z));
        iVar.mo8588d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo9285u(Activity activity, String str, boolean z, String str2) {
        File[] listFiles;
        C2399i2 d = C2399i2.m10374d(activity, C2185a4.m9678h(activity));
        String absolutePath = new C2399i2(d, mo9277l(!z) + "/" + this.f9323d.mo8569t(str)).getAbsolutePath();
        if (mo9270e(absolutePath, true)) {
            File file = new File(str2);
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                new AsyncTaskC2770k(activity, listFiles, str, absolutePath).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:(11:19|20|21|22|23|24|25|(2:26|(1:28)(1:77))|29|30|31)|32|33|58|(3:61|(3:63|64|79)(1:80)|65)|78|67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x007e, code lost:
        if (r4 == null) goto L_0x0081;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006b A[SYNTHETIC, Splitter:B:42:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0072 A[SYNTHETIC, Splitter:B:46:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0079 A[SYNTHETIC, Splitter:B:54:0x0079] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9286v(java.io.File r16, java.lang.String r17, long r18, long r20) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2749t1.mo9286v(java.io.File, java.lang.String, long, long):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0030 A[SYNTHETIC, Splitter:B:25:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0037 A[SYNTHETIC, Splitter:B:29:0x0037] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo9287w(byte[] r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r1 = 0
            android.content.Context r2 = r3.f9321b     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            com.digdroid.alman.dig.i2 r5 = com.digdroid.alman.dig.C2399i2.m10374d(r2, r5)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            if (r5 != 0) goto L_0x000d
            monitor-exit(r3)
            return r1
        L_0x000d:
            java.io.OutputStream r5 = r5.mo8608j()
            if (r5 != 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.<init>(r5)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.write(r4)     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            r2.flush()     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            r2.close()     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            r5.close()     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0029:
            r0 = r2
            goto L_0x002e
        L_0x002b:
            r4 = move-exception
            goto L_0x003b
        L_0x002d:
            r5 = r0
        L_0x002e:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ Exception -> 0x0034, all -> 0x002b }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            if (r5 == 0) goto L_0x003d
            r5.close()     // Catch:{ Exception -> 0x003d, all -> 0x002b }
            goto L_0x003d
        L_0x003b:
            monitor-exit(r3)
            throw r4
        L_0x003d:
            monitor-exit(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2749t1.mo9287w(byte[], java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo9288x(Uri uri) {
        long n = this.f9322c.mo8190n("game_id", -1);
        if (n >= 0) {
            mo9265B(uri, mo9272g(n, true));
            SQLiteDatabase c = this.f9324e.mo9325c();
            c.execSQL("UPDATE roms SET has_images=NULL WHERE _id=" + n);
            ImageService.m9511a(this.f9321b.getApplicationContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo9289y(int i, Uri uri) {
        SQLiteDatabase c = this.f9324e.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT slug FROM systems WHERE _id=" + i, null);
        if (rawQuery.moveToFirst()) {
            if (mo9269d(mo9282r())) {
                mo9265B(uri, new File(mo9282r() + "/" + rawQuery.getString(0) + ".png"));
            } else {
                return;
            }
        }
        rawQuery.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[SYNTHETIC, Splitter:B:24:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ Exception -> 0x0074 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9290z(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2749t1.mo9290z(java.lang.String, java.lang.String):void");
    }
}
