package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.DialogInterfaceC0068b;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;

/* renamed from: com.digdroid.alman.dig.h3 */
public class C2375h3 {

    /* renamed from: a */
    private static C2375h3 f8322a;

    /* renamed from: b */
    Context f8323b;

    /* renamed from: c */
    C2775u f8324c;

    /* renamed from: d */
    SQLiteDatabase f8325d;

    /* renamed from: e */
    C2219c3 f8326e;

    /* renamed from: f */
    HashMap<String, C2387l> f8327f = null;

    /* renamed from: com.digdroid.alman.dig.h3$a */
    class DialogInterface$OnClickListenerC2376a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8328b;

        DialogInterface$OnClickListenerC2376a(String str) {
            this.f8328b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase sQLiteDatabase = C2375h3.this.f8325d;
            sQLiteDatabase.execSQL("UPDATE systems SET ignored=0 WHERE slug='" + this.f8328b + "'");
            SQLiteDatabase sQLiteDatabase2 = C2375h3.this.f8325d;
            sQLiteDatabase2.execSQL("UPDATE roms SET ignored=0 WHERE system='" + this.f8328b + "'");
            SQLiteDatabase sQLiteDatabase3 = C2375h3.this.f8325d;
            sQLiteDatabase3.execSQL("UPDATE rompaths SET last_checked=0 WHERE system='" + this.f8328b + "'");
            C2375h3.this.mo8545E(this.f8328b);
            if (this.f8328b.equals("android")) {
                DatabaseService.m9478v(C2375h3.this.f8323b, "scandroid");
            } else {
                C2375h3.this.mo8555d(this.f8328b, true);
            }
            DatabaseService.m9478v(C2375h3.this.f8323b, "merge_games");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$b */
    public class C2377b implements AbstractC2389n {
        C2377b() {
        }

        @Override // com.digdroid.alman.dig.C2375h3.AbstractC2389n
        /* renamed from: a */
        public void mo8577a(String str, String str2) {
            C2375h3.this.f8327f.get(str).f8353g = str2;
        }
    }

    /* renamed from: com.digdroid.alman.dig.h3$c */
    class AsyncTaskC2378c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        final /* synthetic */ String f8331a;

        /* renamed from: b */
        final /* synthetic */ AbstractC2388m f8332b;

        AsyncTaskC2378c(String str, AbstractC2388m mVar) {
            this.f8331a = str;
            this.f8332b = mVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            int i = 1;
            while (true) {
                Cursor rawQuery = C2375h3.this.f8325d.rawQuery("SELECT _id FROM systems WHERE slug='clone" + i + "'", null);
                boolean moveToFirst = rawQuery.moveToFirst();
                rawQuery.close();
                if (!moveToFirst) {
                    break;
                }
                i++;
            }
            String str = "clone" + i;
            Cursor rawQuery2 = C2375h3.this.f8325d.rawQuery("SELECT * FROM systems WHERE slug='" + this.f8331a + "'", null);
            if (!rawQuery2.moveToFirst()) {
                rawQuery2.close();
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("slug", str);
            String string = rawQuery2.getString(rawQuery2.getColumnIndex("parent"));
            contentValues.put("parent", string);
            String str2 = "Clone of " + rawQuery2.getString(rawQuery2.getColumnIndex("name"));
            contentValues.put("name", str2);
            contentValues.put("type", rawQuery2.getString(rawQuery2.getColumnIndex("type")));
            contentValues.put("introduced", Long.valueOf(rawQuery2.getLong(rawQuery2.getColumnIndex("introduced"))));
            contentValues.put("generation", Integer.valueOf(rawQuery2.getInt(rawQuery2.getColumnIndex("generation"))));
            contentValues.put("extensions", rawQuery2.getString(rawQuery2.getColumnIndex("extensions")));
            contentValues.put("folder_exts", rawQuery2.getString(rawQuery2.getColumnIndex("folder_exts")));
            contentValues.put("numgames", (Integer) 0);
            contentValues.put("emulator", Integer.valueOf(rawQuery2.getInt(rawQuery2.getColumnIndex("emulator"))));
            contentValues.put("overlay", rawQuery2.getString(rawQuery2.getColumnIndex("overlay")));
            contentValues.put("overlay_opacity", Float.valueOf(rawQuery2.getFloat(rawQuery2.getColumnIndex("overlay_opacity"))));
            rawQuery2.close();
            C2375h3.this.f8325d.insert("systems", null, contentValues);
            C2387l lVar = new C2387l();
            lVar.f8347a = str2;
            lVar.f8348b = string;
            lVar.f8350d = true;
            lVar.f8349c = true;
            C2375h3.this.f8327f.put(str, lVar);
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            AbstractC2388m mVar;
            if (str != null && (mVar = this.f8332b) != null) {
                mVar.mo8585a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$d */
    public class C2379d implements AbstractC2389n {
        C2379d() {
        }

        @Override // com.digdroid.alman.dig.C2375h3.AbstractC2389n
        /* renamed from: a */
        public void mo8577a(String str, String str2) {
            C2375h3.this.f8327f.get(str).f8354h = str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$e */
    public class C2380e implements AbstractC2389n {
        C2380e() {
        }

        @Override // com.digdroid.alman.dig.C2375h3.AbstractC2389n
        /* renamed from: a */
        public void mo8577a(String str, String str2) {
            C2375h3.this.f8327f.get(str).f8355i = str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$f */
    public class C2381f implements AbstractC2389n {
        C2381f() {
        }

        @Override // com.digdroid.alman.dig.C2375h3.AbstractC2389n
        /* renamed from: a */
        public void mo8577a(String str, String str2) {
            C2375h3.this.f8327f.get(str).f8356j = str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$g */
    public class C2382g implements AbstractC2389n {
        C2382g() {
        }

        @Override // com.digdroid.alman.dig.C2375h3.AbstractC2389n
        /* renamed from: a */
        public void mo8577a(String str, String str2) {
            C2375h3.this.f8327f.get(str).f8357k = str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$h */
    public class C2383h implements AbstractC2389n {
        C2383h() {
        }

        @Override // com.digdroid.alman.dig.C2375h3.AbstractC2389n
        /* renamed from: a */
        public void mo8577a(String str, String str2) {
            C2375h3.this.f8327f.get(str).f8358l = str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$i */
    public class C2384i implements FileFilter {
        C2384i() {
        }

        public boolean accept(File file) {
            return file.isDirectory();
        }
    }

    /* renamed from: com.digdroid.alman.dig.h3$j */
    class DialogInterface$OnClickListenerC2385j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f8340b;

        /* renamed from: c */
        final /* synthetic */ String f8341c;

        /* renamed from: d */
        final /* synthetic */ Activity f8342d;

        DialogInterface$OnClickListenerC2385j(EditText editText, String str, Activity activity) {
            this.f8340b = editText;
            this.f8341c = str;
            this.f8342d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = this.f8340b.getText().toString().trim();
            if (!trim.equals("")) {
                SQLiteDatabase sQLiteDatabase = C2375h3.this.f8325d;
                sQLiteDatabase.execSQL("UPDATE systems SET name=" + DatabaseUtils.sqlEscapeString(trim) + " WHERE slug='" + this.f8341c + "'");
                C2375h3.this.f8327f = null;
                this.f8342d.recreate();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.h3$k */
    class DialogInterface$OnClickListenerC2386k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8344b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2390o f8345c;

        DialogInterface$OnClickListenerC2386k(String str, AbstractC2390o oVar) {
            this.f8344b = str;
            this.f8345c = oVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase sQLiteDatabase = C2375h3.this.f8325d;
            sQLiteDatabase.execSQL("UPDATE roms SET ignored=1 WHERE system='" + this.f8344b + "'");
            SQLiteDatabase sQLiteDatabase2 = C2375h3.this.f8325d;
            sQLiteDatabase2.execSQL("UPDATE systems SET ignored=1,numgames=0 WHERE slug='" + this.f8344b + "'");
            this.f8345c.mo8502a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$l */
    public class C2387l {

        /* renamed from: a */
        String f8347a;

        /* renamed from: b */
        String f8348b;

        /* renamed from: c */
        boolean f8349c;

        /* renamed from: d */
        boolean f8350d;

        /* renamed from: e */
        boolean f8351e;

        /* renamed from: f */
        float f8352f;

        /* renamed from: g */
        String f8353g;

        /* renamed from: h */
        String f8354h;

        /* renamed from: i */
        String f8355i;

        /* renamed from: j */
        String f8356j;

        /* renamed from: k */
        String f8357k;

        /* renamed from: l */
        String f8358l;

        C2387l() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$m */
    public interface AbstractC2388m {
        /* renamed from: a */
        void mo8585a(String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h3$n */
    public interface AbstractC2389n {
        /* renamed from: a */
        void mo8577a(String str, String str2);
    }

    /* renamed from: com.digdroid.alman.dig.h3$o */
    interface AbstractC2390o {
        /* renamed from: a */
        void mo8502a();
    }

    private C2375h3(Context context, C2775u uVar) {
        this.f8323b = context;
        this.f8324c = uVar;
        this.f8326e = C2219c3.m9805k(context);
    }

    /* renamed from: j */
    private void m10305j(String str, String str2, AbstractC2389n nVar) {
        File[] listFiles;
        String G = C2553q3.f8891a.f9397a.mo9206G(str, str2);
        if (!(G == null || G.equals("") || (listFiles = new File(G).listFiles()) == null)) {
            for (File file : listFiles) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    String lowerCase = name.substring(0, lastIndexOf).toLowerCase();
                    if (this.f8327f.containsKey(lowerCase)) {
                        nVar.mo8577a(lowerCase, file.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public static synchronized C2375h3 m10306r(Context context, C2775u uVar) {
        C2375h3 h3Var;
        synchronized (C2375h3.class) {
            if (f8322a == null) {
                f8322a = new C2375h3(context.getApplicationContext(), uVar);
            }
            h3Var = f8322a;
        }
        return h3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo8541A(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8351e;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo8542B(Activity activity, String str, AbstractC2390o oVar) {
        new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2386k(str, oVar)).mo221a().show();
    }

    /* renamed from: C */
    public synchronized void mo8543C() {
        this.f8325d = this.f8324c.mo9325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo8544D(Activity activity, String str) {
        View inflate = activity.getLayoutInflater().inflate(R.layout.genre_edit, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.genre_input);
        editText.setText(mo8568s(str));
        editText.setTextColor(C2553q3.m11116b());
        DialogInterfaceC0068b.C0069a t = new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo240t(inflate);
        t.mo229i(activity.getString(R.string.rename) + " " + mo8568s(str)).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2385j(editText, str, activity)).mo221a().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo8545E(String str) {
        StringBuilder sb;
        String str2;
        SQLiteDatabase sQLiteDatabase;
        if (mo8573x(str)) {
            sQLiteDatabase = this.f8325d;
            sb = new StringBuilder();
            sb.append("SELECT COUNT (*) as count FROM roms WHERE system='");
            sb.append(str);
            str2 = "' AND ignored=0 AND present=1 AND (merged_with=-1 OR merged_with=_id)";
        } else {
            sQLiteDatabase = this.f8325d;
            sb = new StringBuilder();
            sb.append("SELECT COUNT (*) as count FROM roms WHERE system='");
            sb.append(str);
            str2 = "' AND ignored=0 AND present=1";
        }
        sb.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        rawQuery.moveToFirst();
        int i = rawQuery.getInt(0);
        rawQuery.close();
        ContentValues contentValues = new ContentValues();
        contentValues.put("numgames", Integer.valueOf(i));
        SQLiteDatabase sQLiteDatabase2 = this.f8325d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("slug='");
        sb2.append(str);
        sb2.append("' AND numgames!=");
        sb2.append(i);
        return sQLiteDatabase2.update("systems", contentValues, sb2.toString(), null) > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo8546F(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("emulator", Integer.valueOf(i));
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        sQLiteDatabase.update("systems", contentValues, "slug='" + str + "'", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo8547G(String str, float f) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("icon_aspect_ratio", Float.valueOf(f));
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        sQLiteDatabase.update("systems", contentValues, "slug='" + str + "'", null);
        mo8557f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo8548H(String str, boolean z) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f8325d;
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE systems SET show_covers=");
            sb.append(z ? 1 : 0);
            sb.append(" WHERE slug='");
            sb.append(str);
            sb.append("'");
            sQLiteDatabase.execSQL(sb.toString());
            HashMap<String, C2387l> hashMap = this.f8327f;
            if (hashMap != null && str != null) {
                hashMap.get(str).f8349c = z;
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo8549I(String str, boolean z) {
        if (str != null) {
            SQLiteDatabase sQLiteDatabase = this.f8325d;
            sQLiteDatabase.execSQL("UPDATE systems SET show_merged=" + (z ? 1 : 0) + " WHERE slug='" + str + "'");
            HashMap<String, C2387l> hashMap = this.f8327f;
            if (hashMap != null) {
                hashMap.get(str).f8350d = z;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public Cursor mo8550J(boolean z, String str, int i, String str2) {
        String str3;
        String str4;
        StringBuilder sb;
        String str5 = " AND ";
        String str6 = "SELECT _id,name,numgames,slug,introduced,parent FROM systems";
        if (!z) {
            str6 = str6 + " WHERE numgames>0";
            str3 = str5;
        } else {
            str3 = " WHERE ";
        }
        if (!str.equals("all")) {
            str6 = str6 + str3 + "type='" + str + "'";
            str3 = str5;
        }
        if (i > 0) {
            str6 = str6 + str3 + "generation=" + i;
        } else {
            str5 = str3;
        }
        if (this.f8326e.mo8180c("has_theme_icon", false)) {
            str6 = str6 + str5 + "has_theme_icon=1";
        }
        if (str2.equals("name")) {
            sb = new StringBuilder();
            sb.append(str6);
            str4 = " ORDER BY name";
        } else {
            sb = new StringBuilder();
            sb.append(str6);
            str4 = " ORDER BY introduced";
        }
        sb.append(str4);
        return this.f8325d.rawQuery(sb.toString(), null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo8551K(Activity activity, String str) {
        new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2376a(str)).mo221a().show();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x014d A[LOOP:0: B:6:0x004b->B:16:0x014d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0151 A[EDGE_INSN: B:34:0x0151->B:18:0x0151 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8552a(java.lang.String r17, java.lang.String r18, int r19) {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2375h3.mo8552a(java.lang.String, java.lang.String, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8553b(long j, boolean z) {
        DatabaseService.m9481y(this.f8323b, "romupdates", "pathid", (int) j, "rescan", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8554c(Cursor cursor, boolean z) {
        if (!cursor.isClosed()) {
            if (cursor.moveToFirst()) {
                do {
                    mo8553b(cursor.getLong(0), z);
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8555d(String str, boolean z) {
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        mo8554c(sQLiteDatabase.rawQuery("SELECT _id FROM rompaths WHERE system='" + str + "'", null), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8556e(boolean z) {
        mo8554c(this.f8325d.rawQuery("SELECT _id FROM rompaths WHERE system!='none'", null), z);
    }

    /* renamed from: f */
    public synchronized void mo8557f() {
        this.f8327f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8558g(String str, AbstractC2388m mVar) {
        new AsyncTaskC2378c(str, mVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: h */
    public void mo8559h(String str) {
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (hashMap != null && str != null && hashMap.containsKey(str)) {
            this.f8327f.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void mo8560i() {
        File[] b;
        if (this.f8327f == null) {
            try {
                String G = C2553q3.f8891a.f9397a.mo9206G("systems", "icons");
                if (G.equals("") && (b = C2372h2.m10298b(this.f8323b)) != null) {
                    G = b[0].getAbsolutePath() + "/Systems/icons";
                }
                Cursor rawQuery = this.f8325d.rawQuery("SELECT _id,slug,name,parent,show_covers,show_merged,icon_aspect_ratio FROM systems", null);
                if (rawQuery.moveToFirst()) {
                    this.f8327f = new HashMap<>();
                    this.f8325d.beginTransaction();
                    do {
                        C2387l lVar = new C2387l();
                        lVar.f8347a = rawQuery.getString(2);
                        lVar.f8348b = rawQuery.getString(3);
                        int i = 1;
                        lVar.f8349c = rawQuery.getInt(4) != 0;
                        lVar.f8350d = rawQuery.getInt(5) != 0;
                        lVar.f8351e = new File(G + "/" + rawQuery.getString(1) + ".png").exists();
                        lVar.f8353g = null;
                        lVar.f8354h = null;
                        lVar.f8355i = null;
                        lVar.f8352f = rawQuery.getFloat(6);
                        this.f8327f.put(rawQuery.getString(1), lVar);
                        new ContentValues().put("has_theme_icon", Boolean.valueOf(lVar.f8351e));
                        SQLiteDatabase sQLiteDatabase = this.f8325d;
                        StringBuilder sb = new StringBuilder();
                        sb.append("UPDATE systems SET has_theme_icon=");
                        if (!lVar.f8351e) {
                            i = 0;
                        }
                        sb.append(i);
                        sb.append(" WHERE _id=");
                        sb.append(rawQuery.getLong(0));
                        sQLiteDatabase.execSQL(sb.toString());
                    } while (rawQuery.moveToNext());
                    this.f8325d.setTransactionSuccessful();
                    this.f8325d.endTransaction();
                }
                rawQuery.close();
                m10305j("systems", "system_backgrounds", new C2377b());
                m10305j("game", "system_backgrounds", new C2379d());
                m10305j("gameinfo", "system_backgrounds", new C2380e());
                m10305j("systems", "system_audio", new C2381f());
                m10305j("game", "system_audio", new C2382g());
                m10305j("gameinfo", "system_audio", new C2383h());
            } catch (Exception unused) {
                this.f8327f = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Cursor mo8561k(String str) {
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT e._id,e.name,e.system,e.package,e.class,e.core,e.rom_key,e.use_retroarch64 FROM emulators as e,systems as s WHERE s.slug='" + str + "'AND e._id=s.emulator", null);
        if (rawQuery.moveToFirst()) {
            return rawQuery;
        }
        rawQuery.close();
        SQLiteDatabase sQLiteDatabase2 = this.f8325d;
        return sQLiteDatabase2.rawQuery("SELECT e._id,e.name,e.system,e.package,e.class,e.core,e.rom_key,e.use_retroarch64 FROM emulators as e WHERE e.system='" + str + "' LIMIT 1", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Cursor mo8562l(String str) {
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        return sQLiteDatabase.rawQuery("SELECT _id,name,system,package,class,core,rom_key,use_retroarch64 FROM emulators WHERE system='" + str + "' ORDER BY name", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo8563m(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8358l;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo8564n(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8355i;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo8565o(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8357k;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo8566p(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8354h;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo8567q(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8352f;
            } catch (Exception unused) {
            }
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo8568s(String str) {
        try {
            mo8560i();
            HashMap<String, C2387l> hashMap = this.f8327f;
            return (hashMap == null || str == null) ? "" : hashMap.get(str).f8347a;
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo8569t(String str) {
        String str2;
        try {
            mo8560i();
            HashMap<String, C2387l> hashMap = this.f8327f;
            return (hashMap == null || str == null || (str2 = hashMap.get(str).f8348b) == null) ? str : str2;
        } catch (Exception unused) {
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo8570u(int i) {
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT path,uri FROM rompaths WHERE _id=" + i, null);
        rawQuery.moveToFirst();
        int i2 = 1;
        if (rawQuery.isNull(1)) {
            i2 = 0;
        }
        String string = rawQuery.getString(i2);
        rawQuery.close();
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public long mo8571v(String str, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase = this.f8325d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM rompaths WHERE system='" + str + "' AND path=" + DatabaseUtils.sqlEscapeString(str2), null);
        if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        }
        rawQuery.close();
        ContentValues contentValues = new ContentValues();
        contentValues.put("system", str);
        contentValues.put("path", str2);
        contentValues.put("uri", str3);
        contentValues.put("last_checked", (Integer) 0);
        contentValues.put("selected", (Integer) 0);
        return this.f8325d.insert("rompaths", null, contentValues);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo8572w(String str) {
        try {
            mo8560i();
            HashMap<String, C2387l> hashMap = this.f8327f;
            if (hashMap == null || str == null) {
                return false;
            }
            return hashMap.get(str).f8349c;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo8573x(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8350d;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo8574y(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8356j;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public String mo8575z(String str) {
        mo8560i();
        HashMap<String, C2387l> hashMap = this.f8327f;
        if (!(hashMap == null || str == null)) {
            try {
                return hashMap.get(str).f8353g;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
