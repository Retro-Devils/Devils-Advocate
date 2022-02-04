package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2778u2;
import com.digdroid.alman.dig.C2828w2;
import com.digdroid.alman.dig.C2848x1;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.digdroid.alman.dig.b0 */
public class C2187b0 {

    /* renamed from: a */
    private static C2187b0 f7854a;

    /* renamed from: b */
    private Context f7855b;

    /* renamed from: c */
    private C2775u f7856c;

    /* renamed from: d */
    private C2219c3 f7857d;

    /* renamed from: e */
    private C2375h3 f7858e;

    /* renamed from: f */
    private C2512o0 f7859f;

    /* renamed from: g */
    private String f7860g = null;

    /* renamed from: h */
    private String f7861h = null;

    /* renamed from: i */
    private AbstractC2203l f7862i = null;

    /* renamed from: j */
    AbstractC2204m f7863j = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$a */
    public class DialogInterface$OnClickListenerC2188a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f7864b;

        /* renamed from: c */
        final /* synthetic */ Activity f7865c;

        DialogInterface$OnClickListenerC2188a(int i, Activity activity) {
            this.f7864b = i;
            this.f7865c = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2882y2.m11936y(this.f7864b);
            try {
                this.f7865c.startActivity(C2187b0.this.f7855b.getPackageManager().getLaunchIntentForPackage(C2882y2.m11934w(this.f7865c)));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$b */
    public class DialogInterface$OnClickListenerC2189b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Cursor f7867b;

        /* renamed from: c */
        final /* synthetic */ Activity f7868c;

        DialogInterface$OnClickListenerC2189b(Cursor cursor, Activity activity) {
            this.f7867b = cursor;
            this.f7868c = activity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|5|6|8|9|10|(1:17)(2:14|15)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.content.DialogInterface r5, int r6) {
            /*
                r4 = this;
                java.lang.String r5 = "android.intent.action.VIEW"
                android.database.Cursor r6 = r4.f7867b     // Catch:{ Exception -> 0x000a }
                r0 = 3
                java.lang.String r6 = r6.getString(r0)     // Catch:{ Exception -> 0x000a }
                goto L_0x000b
            L_0x000a:
                r6 = 0
            L_0x000b:
                android.app.Activity r0 = r4.f7868c     // Catch:{ ActivityNotFoundException -> 0x002d }
                android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x002d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x002d }
                r2.<init>()     // Catch:{ ActivityNotFoundException -> 0x002d }
                java.lang.String r3 = "market://details?id="
                r2.append(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
                r2.append(r6)     // Catch:{ ActivityNotFoundException -> 0x002d }
                java.lang.String r2 = r2.toString()     // Catch:{ ActivityNotFoundException -> 0x002d }
                android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ ActivityNotFoundException -> 0x002d }
                r1.<init>(r5, r2)     // Catch:{ ActivityNotFoundException -> 0x002d }
                r0.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002d }
                goto L_0x004c
            L_0x002b:
                goto L_0x004c
            L_0x002d:
                android.app.Activity r0 = r4.f7868c     // Catch:{ Exception -> 0x002b }
                android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x002b }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002b }
                r2.<init>()     // Catch:{ Exception -> 0x002b }
                java.lang.String r3 = "https://play.google.com/store/apps/details?id="
                r2.append(r3)     // Catch:{ Exception -> 0x002b }
                r2.append(r6)     // Catch:{ Exception -> 0x002b }
                java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x002b }
                android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x002b }
                r1.<init>(r5, r6)     // Catch:{ Exception -> 0x002b }
                r0.startActivity(r1)     // Catch:{ Exception -> 0x002b }
            L_0x004c:
                android.database.Cursor r5 = r4.f7867b
                if (r5 == 0) goto L_0x005b
                boolean r5 = r5.isClosed()
                if (r5 != 0) goto L_0x005b
                android.database.Cursor r5 = r4.f7867b
                r5.close()
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2187b0.DialogInterface$OnClickListenerC2189b.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$c */
    public class AsyncTaskC2190c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ long f7870a;

        /* renamed from: b */
        final /* synthetic */ long f7871b;

        /* renamed from: c */
        final /* synthetic */ Activity f7872c;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.b0$c$a */
        public class C2191a implements C2828w2.AbstractC2838j {
            C2191a() {
            }

            @Override // com.digdroid.alman.dig.C2828w2.AbstractC2838j
            /* renamed from: a */
            public void mo8071a(boolean z) {
                if (C2187b0.this.f7857d.mo8180c("share_stats", true)) {
                    new AsyncTaskC2192b().execute(new Void[0]);
                    return;
                }
                AbstractC2204m mVar = C2187b0.this.f7863j;
                if (mVar != null) {
                    mVar.mo8018a();
                }
            }
        }

        /* renamed from: com.digdroid.alman.dig.b0$c$b */
        class AsyncTaskC2192b extends AsyncTask<Void, Void, Long> {
            AsyncTaskC2192b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Long doInBackground(Void... voidArr) {
                SQLiteDatabase c = C2187b0.this.f7856c.mo9325c();
                Cursor rawQuery = c.rawQuery("SELECT mdbid FROM roms WHERE _id=" + AsyncTaskC2190c.this.f7870a, null);
                long j = rawQuery.moveToFirst() ? rawQuery.getLong(0) : -1;
                rawQuery.close();
                return Long.valueOf(j);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void onPostExecute(Long l) {
                if (l.longValue() >= 0) {
                    ServerService.m9572q(AsyncTaskC2190c.this.f7872c, l.longValue(), AsyncTaskC2190c.this.f7871b);
                }
                AbstractC2204m mVar = C2187b0.this.f7863j;
                if (mVar != null) {
                    mVar.mo8018a();
                }
            }
        }

        AsyncTaskC2190c(long j, long j2, Activity activity) {
            this.f7870a = j;
            this.f7871b = j2;
            this.f7872c = activity;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C2187b0.this.f7859f.mo8853u(this.f7870a, C2187b0.this.f7857d.mo8184g().longValue(), this.f7871b);
            C2187b0 b0Var = C2187b0.this;
            b0Var.mo8045e(this.f7870a, b0Var.f7857d.mo8184g().longValue());
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r5) {
            if (this.f7871b >= 30000) {
                new C2828w2(this.f7872c, C2187b0.this.f7856c.mo9325c(), true, new C2191a()).mo9396f(this.f7870a);
                return;
            }
            AbstractC2204m mVar = C2187b0.this.f7863j;
            if (mVar != null) {
                mVar.mo8018a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$d */
    public class C2193d implements C2778u2.AbstractC2780b {

        /* renamed from: a */
        final /* synthetic */ Cursor f7876a;

        /* renamed from: b */
        final /* synthetic */ Cursor f7877b;

        /* renamed from: c */
        final /* synthetic */ ActivityC2888z3 f7878c;

        /* renamed from: com.digdroid.alman.dig.b0$d$a */
        class C2194a implements FileFilter {

            /* renamed from: a */
            final /* synthetic */ Pattern f7880a;

            C2194a(Pattern pattern) {
                this.f7880a = pattern;
            }

            public boolean accept(File file) {
                try {
                    return this.f7880a.matcher(file.getName()).find();
                } catch (Exception unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.digdroid.alman.dig.b0$d$b */
        class DialogInterface$OnClickListenerC2195b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ File[] f7882b;

            /* renamed from: c */
            final /* synthetic */ String f7883c;

            DialogInterface$OnClickListenerC2195b(File[] fileArr, String str) {
                this.f7882b = fileArr;
                this.f7883c = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2193d dVar = C2193d.this;
                C2187b0 b0Var = C2187b0.this;
                ActivityC2888z3 z3Var = dVar.f7878c;
                Cursor cursor = dVar.f7876a;
                Cursor cursor2 = dVar.f7877b;
                File[] fileArr = this.f7882b;
                b0Var.mo8059u(z3Var, cursor, cursor2, i == fileArr.length ? this.f7883c : fileArr[i].getAbsolutePath());
            }
        }

        C2193d(Cursor cursor, Cursor cursor2, ActivityC2888z3 z3Var) {
            this.f7876a = cursor;
            this.f7877b = cursor2;
            this.f7878c = z3Var;
        }

        @Override // com.digdroid.alman.dig.C2778u2.AbstractC2780b
        /* renamed from: a */
        public void mo8076a(String str) {
            if (str == null) {
                this.f7876a.close();
                this.f7877b.close();
                return;
            }
            C2399i2 d = C2399i2.m10374d(this.f7878c, str);
            if (!C2187b0.this.mo8055q(this.f7876a) && !d.exists()) {
                new DialogInterfaceC0068b.C0069a(this.f7878c, C2553q3.m11117c()).mo229i(C2187b0.this.f7855b.getString(R.string.no_game_file)).mo235o(17039370, null).mo221a().show();
                this.f7876a.close();
                this.f7877b.close();
            } else if (!this.f7877b.getString(4).equals("pc") || C2187b0.this.mo8055q(this.f7876a) || !d.isDirectory()) {
                C2187b0.this.mo8059u(this.f7878c, this.f7876a, this.f7877b, str);
            } else {
                try {
                    File[] listFiles = d.listFiles(new C2194a(Pattern.compile("(\\.exe|.com|\\.bat)$", 2)));
                    String str2 = str + "/DOS";
                    if (listFiles.length == 0) {
                        C2187b0.this.mo8059u(this.f7878c, this.f7876a, this.f7877b, str2);
                        return;
                    }
                    CharSequence[] charSequenceArr = new CharSequence[(listFiles.length + 1)];
                    for (int i = 0; i < listFiles.length; i++) {
                        charSequenceArr[i] = listFiles[i].getName();
                    }
                    charSequenceArr[listFiles.length] = "DOS prompt";
                    new DialogInterfaceC0068b.C0069a(this.f7878c, C2553q3.m11117c()).mo238r(R.string.select_executable).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2195b(listFiles, str2)).mo221a().show();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$e */
    public class C2196e implements C2848x1.AbstractC2851c {

        /* renamed from: a */
        final /* synthetic */ ActivityC2888z3 f7885a;

        /* renamed from: b */
        final /* synthetic */ Cursor f7886b;

        /* renamed from: c */
        final /* synthetic */ Cursor f7887c;

        /* renamed from: d */
        final /* synthetic */ String f7888d;

        C2196e(ActivityC2888z3 z3Var, Cursor cursor, Cursor cursor2, String str) {
            this.f7885a = z3Var;
            this.f7886b = cursor;
            this.f7887c = cursor2;
            this.f7888d = str;
        }

        @Override // com.digdroid.alman.dig.C2848x1.AbstractC2851c
        /* renamed from: a */
        public void mo8079a(String str, String str2) {
            File file = new File(str);
            this.f7885a.mo9522g1(this.f7888d, file.getParent(), file.getName(), this.f7887c.getLong(0), this.f7887c.getString(1), str2);
        }

        @Override // com.digdroid.alman.dig.C2848x1.AbstractC2851c
        /* renamed from: b */
        public void mo8080b() {
            C2187b0.this.mo8060v(this.f7885a, this.f7886b, this.f7887c, this.f7888d);
        }

        @Override // com.digdroid.alman.dig.C2848x1.AbstractC2851c
        /* renamed from: c */
        public void mo8081c() {
        }

        @Override // com.digdroid.alman.dig.C2848x1.AbstractC2851c
        /* renamed from: d */
        public void mo8082d() {
            new DialogInterfaceC0068b.C0069a(this.f7885a, C2553q3.m11117c()).mo228h(R.string.not_supported).mo235o(R.string.ok, null).mo221a().show();
        }

        @Override // com.digdroid.alman.dig.C2848x1.AbstractC2851c
        /* renamed from: e */
        public void mo8083e(String str) {
            C2187b0.this.mo8060v(this.f7885a, this.f7886b, this.f7887c, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$f */
    public class DialogInterface$OnClickListenerC2197f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Cursor f7890b;

        DialogInterface$OnClickListenerC2197f(Cursor cursor) {
            this.f7890b = cursor;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Cursor cursor = this.f7890b;
            if (cursor != null && !cursor.isClosed()) {
                this.f7890b.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$g */
    public class C2198g implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f7892a;

        C2198g(Pattern pattern) {
            this.f7892a = pattern;
        }

        public boolean accept(File file) {
            try {
                return this.f7892a.matcher(file.getName()).find();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$h */
    public class DialogInterface$OnClickListenerC2199h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ActivityC2888z3 f7894b;

        /* renamed from: c */
        final /* synthetic */ Cursor f7895c;

        /* renamed from: d */
        final /* synthetic */ Cursor f7896d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f7897e;

        DialogInterface$OnClickListenerC2199h(ActivityC2888z3 z3Var, Cursor cursor, Cursor cursor2, ArrayList arrayList) {
            this.f7894b = z3Var;
            this.f7895c = cursor;
            this.f7896d = cursor2;
            this.f7897e = arrayList;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2187b0.this.mo8060v(this.f7894b, this.f7895c, this.f7896d, ((File) this.f7897e.get(i)).getAbsolutePath());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$i */
    public class DialogInterface$OnClickListenerC2200i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f7899b;

        /* renamed from: c */
        final /* synthetic */ String f7900c;

        /* renamed from: d */
        final /* synthetic */ ActivityC2888z3 f7901d;

        /* renamed from: e */
        final /* synthetic */ Intent f7902e;

        /* renamed from: f */
        final /* synthetic */ Cursor f7903f;

        /* renamed from: g */
        final /* synthetic */ Cursor f7904g;

        DialogInterface$OnClickListenerC2200i(View view, String str, ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2) {
            this.f7899b = view;
            this.f7900c = str;
            this.f7901d = z3Var;
            this.f7902e = intent;
            this.f7903f = cursor;
            this.f7904g = cursor2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2187b0.this.f7857d.mo8152A(this.f7900c, ((CheckBox) this.f7899b.findViewById(R.id.not_again)).isChecked());
            C2187b0.this.mo8056r(this.f7901d, this.f7902e, this.f7903f, this.f7904g, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$j */
    public class DialogInterface$OnClickListenerC2201j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f7906b;

        /* renamed from: c */
        final /* synthetic */ String f7907c;

        /* renamed from: d */
        final /* synthetic */ ActivityC2888z3 f7908d;

        /* renamed from: e */
        final /* synthetic */ Intent f7909e;

        /* renamed from: f */
        final /* synthetic */ Cursor f7910f;

        /* renamed from: g */
        final /* synthetic */ Cursor f7911g;

        DialogInterface$OnClickListenerC2201j(View view, String str, ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2) {
            this.f7906b = view;
            this.f7907c = str;
            this.f7908d = z3Var;
            this.f7909e = intent;
            this.f7910f = cursor;
            this.f7911g = cursor2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2187b0.this.f7857d.mo8152A(this.f7907c, ((CheckBox) this.f7906b.findViewById(R.id.not_again)).isChecked());
            C2187b0.this.mo8056r(this.f7908d, this.f7909e, this.f7910f, this.f7911g, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.b0$k */
    public class DialogInterface$OnClickListenerC2202k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f7913b;

        /* renamed from: c */
        final /* synthetic */ ActivityC2888z3 f7914c;

        /* renamed from: d */
        final /* synthetic */ Intent f7915d;

        /* renamed from: e */
        final /* synthetic */ Cursor f7916e;

        /* renamed from: f */
        final /* synthetic */ Cursor f7917f;

        DialogInterface$OnClickListenerC2202k(View view, ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2) {
            this.f7913b = view;
            this.f7914c = z3Var;
            this.f7915d = intent;
            this.f7916e = cursor;
            this.f7917f = cursor2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2187b0.this.f7857d.mo8152A("uae_informed", ((CheckBox) this.f7913b.findViewById(R.id.not_again)).isChecked());
            C2187b0.this.mo8056r(this.f7914c, this.f7915d, this.f7916e, this.f7917f, false);
        }
    }

    /* renamed from: com.digdroid.alman.dig.b0$l */
    public interface AbstractC2203l {
        /* renamed from: s0 */
        void mo8090s0(long j, long j2, String str, boolean z);
    }

    /* renamed from: com.digdroid.alman.dig.b0$m */
    public interface AbstractC2204m {
        /* renamed from: a */
        void mo8018a();
    }

    private C2187b0(Context context, C2375h3 h3Var, C2512o0 o0Var) {
        this.f7855b = context;
        this.f7856c = C2775u.m11726e(context);
        this.f7857d = C2219c3.m9805k(context);
        this.f7858e = h3Var;
        this.f7859f = o0Var;
        File[] z = mo8064z(null);
        if (z != null) {
            this.f7860g = z[0].getAbsolutePath();
        }
    }

    /* renamed from: o */
    public static synchronized C2187b0 m9701o(Context context, C2375h3 h3Var, C2512o0 o0Var) {
        C2187b0 b0Var;
        synchronized (C2187b0.class) {
            if (f7854a == null) {
                f7854a = new C2187b0(context.getApplicationContext(), h3Var, o0Var);
            }
            b0Var = f7854a;
        }
        return b0Var;
    }

    /* renamed from: p */
    private void m9702p(Activity activity, Cursor cursor) {
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c());
        aVar.mo229i(cursor.getString(1) + " " + this.f7855b.getString(R.string.emu_not_installed)).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2189b(cursor, activity)).mo221a().show();
    }

    /* renamed from: A */
    public void mo8044A(AbstractC2203l lVar) {
        this.f7862i = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8045e(long j, long j2) {
        if (this.f7861h == null) {
            String i = new C2882y2(this.f7855b).mo8772i("screenshot_directory");
            if (i.equals("")) {
                this.f7861h = i;
            } else {
                return;
            }
        }
        C2749t1.m11663p(this.f7855b).mo9286v(new File(this.f7861h), "Screenshots", j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8046f(String str) {
        C2840w3 w3Var = new C2840w3(this.f7855b);
        w3Var.mo8774k(C2399i2.m10374d(this.f7855b, str));
        w3Var.mo8782s("use_gui", "no");
        w3Var.mo9416w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8047g(String str, String str2, Cursor cursor, String str3) {
        C2840w3 w3Var = new C2840w3(this.f7855b);
        w3Var.mo8773j("Uae4arm/" + str);
        SQLiteDatabase c = this.f7856c.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT p.path,r.filename FROM rompaths as p,roms as r WHERE r.title LIKE " + DatabaseUtils.sqlEscapeString(str2) + " AND p._id=r.pathid", null);
        if (rawQuery.moveToFirst()) {
            w3Var.mo9413A(rawQuery.getString(0) + "/" + rawQuery.getString(1));
        }
        rawQuery.close();
        String string = cursor.getString(4);
        String string2 = cursor.getString(1);
        w3Var.mo9417x(string2);
        if (new File(str3).isDirectory() || str3.substring(str3.length() - 4).toLowerCase().equals(".hdf")) {
            w3Var.mo9419z(str3);
        } else {
            SQLiteDatabase c2 = this.f7856c.mo9325c();
            rawQuery = c2.rawQuery("SELECT filename FROM roms WHERE system='" + string + "' AND title=" + DatabaseUtils.sqlEscapeString(string2) + " ORDER BY filename ASC", null);
            if (rawQuery.moveToFirst()) {
                int i = -1;
                do {
                    if (rawQuery.getString(0).equals(cursor.getString(7))) {
                        i = 0;
                    }
                    if (i >= 0) {
                        w3Var.mo9418y(i, this.f7858e.mo8570u(cursor.getInt(3)) + "/" + rawQuery.getString(0));
                        i++;
                    }
                    if (i >= 4) {
                        break;
                    }
                } while (rawQuery.moveToNext());
            }
        }
        rawQuery.close();
        w3Var.mo8781r(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo8048h(ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2, String str, String str2) {
        C2884z zVar = new C2884z(this.f7855b);
        zVar.mo9507w();
        zVar.mo9509y(str);
        zVar.mo9508x();
        if (this.f7857d.mo8180c(str2, false)) {
            return false;
        }
        View inflate = z3Var.getLayoutInflater().inflate(R.layout.not_again, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setTextColor(C2553q3.m11116b());
        textView.setText(z3Var.getString(R.string.change_dosbox_conf) + "\n\n" + zVar.mo9506v());
        C2553q3.m11133s((TextView) inflate.findViewById(R.id.not_again));
        new DialogInterfaceC0068b.C0069a(z3Var, C2553q3.m11117c()).mo240t(inflate).mo235o(17039370, new DialogInterface$OnClickListenerC2201j(inflate, str2, z3Var, intent, cursor, cursor2)).mo221a().show();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo8049i(ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2, String str) {
        if (cursor.getString(1).equals("Uae4arm")) {
            return mo8053m(z3Var, intent, cursor, cursor2, str);
        }
        if (cursor.getString(1).equals("DosBox Turbo")) {
            return mo8048h(z3Var, intent, cursor, cursor2, str, "dosbox_turbo_informed");
        }
        if (cursor.getString(1).equals("FreeBox")) {
            return mo8048h(z3Var, intent, cursor, cursor2, str, "dosbox_free_informed");
        }
        if (cursor.getString(1).equals("ScummVM")) {
            return mo8051k(z3Var, intent, cursor, cursor2, str, "scummvm_informed");
        }
        if (cursor.getString(1).equals("ScummVM 2.0.0")) {
            return mo8052l(z3Var, intent, cursor, cursor2, str, "scummvm_informed");
        }
        if (cursor.getString(1).equals("RetroArch (ScummVM)")) {
            return mo8050j(intent, cursor, cursor2, str);
        }
        if (cursor.getString(1).equals("J2ME Loader")) {
            intent.setAction("config.edit");
            intent.putExtra("midletName", cursor2.getString(1));
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo8050j(Intent intent, Cursor cursor, Cursor cursor2, String str) {
        C2207b3 b3Var = new C2207b3(this.f7855b);
        String x = b3Var.mo8099x(cursor2.getLong(0));
        if (x != null) {
            String str2 = str + "/" + x + ".scummvm";
            intent.putExtra(cursor.getString(6), str2);
            b3Var.f8640b = x;
            b3Var.mo8781r(str2);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo8051k(ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2, String str, String str2) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo8052l(ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2, String str, String str2) {
        C2207b3 b3Var = new C2207b3(this.f7855b);
        b3Var.mo8100y();
        b3Var.mo8095A(str, cursor2.getLong(0));
        b3Var.mo8101z();
        if (this.f7857d.mo8180c(str2, false)) {
            return false;
        }
        View inflate = z3Var.getLayoutInflater().inflate(R.layout.not_again, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setTextColor(C2553q3.m11116b());
        textView.setText(z3Var.getString(R.string.change_scummvm_conf) + "\n\n" + b3Var.mo8096u());
        C2553q3.m11133s((TextView) inflate.findViewById(R.id.not_again));
        new DialogInterfaceC0068b.C0069a(z3Var, C2553q3.m11117c()).mo240t(inflate).mo235o(17039370, new DialogInterface$OnClickListenerC2200i(inflate, str2, z3Var, intent, cursor, cursor2)).mo221a().show();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo8053m(ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2, String str) {
        if (str.length() <= 4 || !str.substring(str.length() - 4).toLowerCase().equals(".uae")) {
            mo8047g("A1200.uae", "Kickstart v3.1", cursor2, str);
            mo8047g("A500.uae", "Kickstart v1.3", cursor2, str);
        } else {
            mo8046f(str);
        }
        if (this.f7857d.mo8180c("uae_informed", false)) {
            return false;
        }
        View inflate = z3Var.getLayoutInflater().inflate(R.layout.not_again, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setTextColor(C2553q3.m11116b());
        textView.setText(z3Var.getString(R.string.change_uae_conf) + "\n\n" + new C2840w3(this.f7855b).mo9415v());
        C2553q3.m11133s((TextView) inflate.findViewById(R.id.not_again));
        new DialogInterfaceC0068b.C0069a(z3Var, C2553q3.m11117c()).mo240t(inflate).mo235o(17039370, new DialogInterface$OnClickListenerC2202k(inflate, z3Var, intent, cursor, cursor2)).mo221a().show();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo8054n(Context context, Cursor cursor, Cursor cursor2) {
        String u;
        if (Build.VERSION.SDK_INT >= 30) {
            return C2882y2.m11932u(context);
        }
        String string = cursor.getString(4);
        Cursor rawQuery = this.f7856c.mo9325c().rawQuery("SELECT overlay,overlay_opacity,user_set_overlay FROM systems WHERE slug='" + string + "'", null);
        rawQuery.moveToFirst();
        String string2 = rawQuery.getString(0);
        float f = rawQuery.getFloat(1);
        boolean z = rawQuery.getInt(2) != 0;
        rawQuery.close();
        C2882y2.m11936y(cursor2.getInt(11));
        if (string2 != null && string2.equals("default") && (u = C2882y2.m11932u(context)) != null) {
            return u;
        }
        C2882y2 y2Var = new C2882y2(context);
        String str = this.f7860g + "/retroarch.cfg";
        String str2 = C2882y2.m11935x(context) + "/overlays";
        if (string2 != null && string2.equals("")) {
            string2 = "gamepads/flat/retropad.cfg";
        }
        if (string2 != null) {
            if (z) {
                y2Var.mo8782s("input_overlay_enable", "true");
            }
            if (string2.substring(0, 1).equals("/")) {
                y2Var.mo8782s("input_overlay", string2);
            } else {
                y2Var.mo8782s("input_overlay", str2 + "/" + string2);
            }
            y2Var.mo8782s("input_overlay_opacity", "" + f);
        } else if (z) {
            y2Var.mo8782s("input_overlay_enable", "false");
        }
        y2Var.mo8781r(str);
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo8055q(Cursor cursor) {
        return cursor != null && cursor.getString(1).contains("Magic DosBox");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8056r(ActivityC2888z3 z3Var, Intent intent, Cursor cursor, Cursor cursor2, boolean z) {
        if (z) {
            try {
                this.f7857d.mo8158G("retroarch_package_running", C2882y2.m11934w(z3Var));
                this.f7857d.mo8157F("retroarch_last", System.currentTimeMillis());
                C2185a4.m9685o(z3Var, "retroarch");
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 30) {
                    m9702p(z3Var, cursor);
                } else {
                    new DialogInterfaceC0068b.C0069a(z3Var, C2553q3.m11117c()).mo228h(R.string.launch_problem).mo235o(17039370, new DialogInterface$OnClickListenerC2197f(cursor)).mo221a().show();
                }
            }
        }
        this.f7857d.mo8165N(System.currentTimeMillis());
        AbstractC2203l lVar = this.f7862i;
        if (lVar != null) {
            lVar.mo8090s0(cursor2.getLong(0), System.currentTimeMillis(), cursor2.getString(4), z);
        }
        z3Var.startActivityForResult(intent, 100);
        cursor2.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8057s(ActivityC2888z3 z3Var, long j, String str) {
        SQLiteDatabase c = this.f7856c.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT _id,title,released,pathid,system,times_played,time_played,filename,merged_with FROM roms WHERE _id=" + j, null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return;
        }
        Cursor d = this.f7859f.mo8840d(j);
        if (!d.moveToFirst()) {
            rawQuery.close();
            d.close();
            return;
        }
        mo8060v(z3Var, d, rawQuery, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo8058t(ActivityC2888z3 z3Var, Cursor cursor, Cursor cursor2, boolean z) {
        C2778u2.m11737b(z3Var, this.f7858e, cursor2, z, new C2193d(cursor, cursor2, z3Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo8059u(ActivityC2888z3 z3Var, Cursor cursor, Cursor cursor2, String str) {
        new C2848x1(z3Var).mo9435a(cursor2.getString(4), cursor.getString(1), str, new C2196e(z3Var, cursor, cursor2, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo8060v(ActivityC2888z3 z3Var, Cursor cursor, Cursor cursor2, String str) {
        boolean z;
        String str2 = str;
        if (cursor.getInt(9) != 0 || !C2363g4.m10276c(str)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(cursor.getString(3), cursor.getString(4)));
            String string = cursor2.getString(4);
            if (string.equals("j2me")) {
                str2 = new File(str2).getParentFile().getName();
            } else if (mo8055q(cursor)) {
                str2 = new File(str2).getName();
            }
            if (!string.equals("scumm")) {
                if (!cursor.getString(6).equals("")) {
                    str2 = C2399i2.m10374d(z3Var, str2).mo8601g();
                    intent.putExtra(cursor.getString(6), str2);
                } else {
                    String string2 = cursor.getString(8);
                    if (string2.equals("") || string2.equals("view")) {
                        intent.setAction("android.intent.action.VIEW");
                    }
                    String string3 = cursor.getString(7);
                    Environment.getExternalStorageDirectory();
                    Uri m = C2399i2.m10374d(z3Var, str2).mo8614m();
                    if (string3.equals("")) {
                        intent.setData(m);
                    } else {
                        intent.setDataAndType(m, string3);
                    }
                    intent.setFlags(1);
                }
            }
            String string4 = cursor.getString(5);
            if (!string4.equals("")) {
                String n = mo8054n(z3Var, cursor2, cursor);
                C2882y2.m11936y(cursor.getInt(11));
                intent.setComponent(new ComponentName(C2882y2.m11934w(z3Var), cursor.getString(4)));
                if (n != null) {
                    intent.putExtra("CONFIGFILE", n);
                }
                if (string.equals("pcfx") && string4.contains("supergrafx")) {
                    string4 = "mednafen_pcfx_libretro_android.so";
                } else if (string.equals("pce") && string4.contains("pcfx")) {
                    string4 = "mednafen_supergrafx_libretro_android.so";
                }
                intent.putExtra("LIBRETRO", C2882y2.m11935x(z3Var) + "/cores/" + string4);
                intent.putExtra("DATADIR", C2882y2.m11935x(z3Var));
                if (!mo8049i(z3Var, intent, cursor, cursor2, str2)) {
                    z = true;
                } else {
                    return;
                }
            } else {
                this.f7857d.mo8200x("is_retroarch", 2);
                if (!mo8049i(z3Var, intent, cursor, cursor2, str2)) {
                    z = false;
                } else {
                    return;
                }
            }
            mo8056r(z3Var, intent, cursor, cursor2, z);
            return;
        }
        C2185a4.m9673c(this.f7855b);
        File A = C2185a4.m9663A(this.f7855b);
        if (A != null) {
            C2399i2 d = C2399i2.m10374d(z3Var, str2);
            z3Var.mo9522g1(str, A.getAbsolutePath() + "/" + cursor2.getString(4) + " - " + d.getName(), null, cursor2.getLong(0), cursor2.getString(1), null);
        }
        cursor2.close();
        cursor.close();
    }

    /* renamed from: w */
    public void mo8061w(ActivityC2888z3 z3Var, Cursor cursor, Cursor cursor2, boolean z) {
        String str;
        if (z3Var != null && !z3Var.isFinishing()) {
            if (cursor2.getString(4).equals("android")) {
                this.f7857d.mo8200x("is_retroarch", 2);
                mo8056r(z3Var, z3Var.getPackageManager().getLaunchIntentForPackage(cursor2.getString(7)), cursor, cursor2, false);
                cursor2.close();
            } else if (cursor == null) {
                cursor2.close();
            } else {
                if (!cursor.getString(5).equals("")) {
                    C2882y2.m11936y(cursor.getInt(11));
                    str = C2882y2.m11934w(z3Var);
                } else {
                    str = cursor.getString(3);
                }
                if (Build.VERSION.SDK_INT >= 30 || C2185a4.m9689s(this.f7855b, str)) {
                    mo8058t(z3Var, cursor, cursor2, z);
                    return;
                }
                m9702p(z3Var, cursor);
                cursor2.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo8062x(Activity activity, long j, long j2, boolean z) {
        if (j2 > 1500) {
            new AsyncTaskC2190c(j, j2, activity).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        AbstractC2204m mVar = this.f7863j;
        if (mVar != null) {
            mVar.mo8018a();
        } else if (z) {
            Cursor d = this.f7859f.mo8840d(j);
            d.moveToFirst();
            String string = d.getString(1);
            int i = d.getInt(11);
            d.close();
            DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c());
            aVar.mo229i(this.f7855b.getString(R.string.retroarch_core) + " " + string + " " + this.f7855b.getString(R.string.not_installed)).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2188a(i, activity)).mo221a().show();
            d.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo8063y(ActivityC2888z3 z3Var, long j, String str) {
        C2399i2 d = C2399i2.m10374d(z3Var, str);
        if (d != null) {
            Cursor rawQuery = this.f7856c.mo9325c().rawQuery("SELECT s.extensions FROM systems as s,roms as r WHERE r._id=" + j + " AND s.slug=r.system", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\\.(");
            sb.append(rawQuery.getString(0));
            sb.append(")$");
            Pattern compile = Pattern.compile(sb.toString(), 2);
            rawQuery.close();
            File[] listFiles = d.listFiles(new C2198g(compile));
            if (listFiles != null && listFiles.length != 0) {
                Pattern compile2 = Pattern.compile("\\.cue$", 2);
                boolean z = false;
                for (File file : listFiles) {
                    if (compile2.matcher(file.getName()).find()) {
                        z = true;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (File file2 : listFiles) {
                    if (!z || compile2.matcher(file2.getName()).find()) {
                        arrayList.add(file2);
                    }
                }
                Cursor rawQuery2 = this.f7856c.mo9325c().rawQuery("SELECT _id,title,released,pathid,system,times_played,time_played,filename,merged_with FROM roms WHERE _id=" + j, null);
                if (!rawQuery2.moveToFirst()) {
                    rawQuery2.close();
                    return;
                }
                Cursor d2 = this.f7859f.mo8840d(j);
                if (!d2.moveToFirst()) {
                    rawQuery2.close();
                    d2.close();
                } else if (arrayList.size() == 1) {
                    mo8060v(z3Var, d2, rawQuery2, ((File) arrayList.get(0)).getAbsolutePath());
                } else {
                    CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        charSequenceArr[i] = ((File) arrayList.get(i)).getName();
                    }
                    new DialogInterfaceC0068b.C0069a(z3Var, C2553q3.m11117c()).mo238r(R.string.select_version).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2199h(z3Var, d2, rawQuery2, arrayList)).mo221a().show();
                }
            }
        }
    }

    /* renamed from: z */
    public File[] mo8064z(String str) {
        return C2372h2.m10298b(this.f7855b);
    }
}
