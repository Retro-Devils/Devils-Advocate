package com.digdroid.alman.dig;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import com.digdroid.alman.dig.C2363g4;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p006b.p057o.p058a.C1088a;
import p150d.p151a.p153b.C3345a;

public class DatabaseService extends IntentService {

    /* renamed from: b */
    C2775u f7615b;

    /* renamed from: c */
    SQLiteDatabase f7616c;

    /* renamed from: d */
    SQLiteDatabase f7617d;

    /* renamed from: e */
    C2456l0 f7618e;

    /* renamed from: f */
    C2219c3 f7619f;

    /* renamed from: g */
    C2512o0 f7620g;

    /* renamed from: h */
    C2375h3 f7621h;

    /* renamed from: i */
    long f7622i;

    /* renamed from: j */
    long f7623j;

    /* renamed from: k */
    boolean f7624k;

    /* renamed from: l */
    int f7625l;

    /* renamed from: m */
    int f7626m;

    /* renamed from: n */
    long f7627n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.DatabaseService$a */
    public class C2096a implements FileFilter {
        C2096a() {
        }

        public boolean accept(File file) {
            return file.isDirectory() && file.canRead() && file.canExecute();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.DatabaseService$b */
    public class C2097b implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f7629a;

        C2097b(Pattern pattern) {
            this.f7629a = pattern;
        }

        public boolean accept(File file) {
            try {
                return this.f7629a.matcher(file.getName()).find();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.DatabaseService$c */
    public class C2098c implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f7631a;

        C2098c(Pattern pattern) {
            this.f7631a = pattern;
        }

        public boolean accept(File file) {
            try {
                if (file.isDirectory()) {
                    DatabaseService.this.f7626m++;
                    return true;
                }
                DatabaseService.this.f7625l++;
                return this.f7631a.matcher(file.getName()).find();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.DatabaseService$d */
    public class C2099d {

        /* renamed from: a */
        HashMap<String, Float> f7633a = new HashMap<>();

        /* renamed from: b */
        HashMap<String, Integer> f7634b = new HashMap<>();

        /* renamed from: c */
        float f7635c;

        /* renamed from: d */
        String f7636d;

        public C2099d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7905a(String str) {
            if (this.f7633a.containsKey(str)) {
                this.f7633a.remove(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo7906b() {
            this.f7635c = 0.0f;
            this.f7636d = "";
            for (Map.Entry<String, Float> entry : this.f7633a.entrySet()) {
                if (entry.getValue().floatValue() > this.f7635c) {
                    this.f7635c = entry.getValue().floatValue();
                    this.f7636d = entry.getKey();
                }
            }
            return this.f7635c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo7907c() {
            mo7906b();
            return this.f7636d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo7908d(String str) {
            return this.f7634b.get(str).intValue();
        }

        /* renamed from: e */
        public void mo7909e(String str) {
            str.hashCode();
            mo7910f(str, !str.equals("mame") ? !str.equals("scumm") ? 1.0f : 1.1f : 0.8f);
        }

        /* renamed from: f */
        public void mo7910f(String str, float f) {
            HashMap<String, Integer> hashMap;
            int i;
            if (this.f7633a.containsKey(str)) {
                HashMap<String, Float> hashMap2 = this.f7633a;
                hashMap2.put(str, Float.valueOf(hashMap2.get(str).floatValue() + f));
                hashMap = this.f7634b;
                i = Integer.valueOf(hashMap.get(str).intValue() + 1);
            } else {
                this.f7633a.put(str, Float.valueOf(f));
                hashMap = this.f7634b;
                i = 1;
            }
            hashMap.put(str, i);
        }
    }

    public DatabaseService() {
        super("DatabaseService");
        setIntentRedelivery(true);
    }

    /* renamed from: v */
    public static void m9478v(Context context, String str) {
        try {
            Intent intent = new Intent(context, DatabaseService.class);
            intent.setAction(str);
            context.getApplicationContext().startService(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    public static void m9479w(Context context, String str, Uri uri) {
        try {
            Intent intent = new Intent(context, DatabaseService.class);
            intent.setAction(str);
            intent.putExtra("uri", uri);
            context.getApplicationContext().startService(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public static void m9480x(Context context, String str, String str2) {
        try {
            Intent intent = new Intent(context, DatabaseService.class);
            intent.setAction(str);
            intent.putExtra("param", str2);
            context.getApplicationContext().startService(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    public static void m9481y(Context context, String str, String str2, int i, String str3, boolean z) {
        try {
            Intent intent = new Intent(context, DatabaseService.class);
            intent.setAction(str);
            intent.putExtra(str2, i);
            intent.putExtra(str3, z);
            context.getApplicationContext().startService(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo7877A() {
        while (true) {
            Cursor rawQuery = this.f7616c.rawQuery("SELECT _id,mdbid FROM roms WHERE age_rating IS NULL LIMIT 100", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return;
            }
            do {
                ContentValues contentValues = new ContentValues();
                long j = rawQuery.getLong(0);
                long j2 = rawQuery.getLong(1);
                if (j2 >= 0) {
                    SQLiteDatabase sQLiteDatabase = this.f7617d;
                    Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT age_rating,youtube FROM games WHERE _id=" + j2, null);
                    if (rawQuery2.moveToFirst()) {
                        contentValues.put("age_rating", rawQuery2.isNull(0) ? -1 : Integer.valueOf(rawQuery2.getInt(0)));
                        if (rawQuery2.getLong(1) != 0) {
                            try {
                                contentValues.put("youtube", C2185a4.m9688r(rawQuery2.getLong(1)));
                            } catch (Exception unused) {
                            }
                            rawQuery2.close();
                        }
                    } else {
                        contentValues.put("age_rating", (Integer) -1);
                    }
                    contentValues.put("youtube", (String) null);
                    rawQuery2.close();
                } else {
                    contentValues.put("age_rating", (Integer) -1);
                    contentValues.put("youtube", (String) null);
                }
                SQLiteDatabase sQLiteDatabase2 = this.f7616c;
                sQLiteDatabase2.update("roms", contentValues, "_id=" + j, null);
            } while (rawQuery.moveToNext());
            rawQuery.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0162  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7878a(java.lang.String r12, long r13, android.content.ContentValues r15) {
        /*
        // Method dump skipped, instructions count: 445
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.DatabaseService.mo7878a(java.lang.String, long, android.content.ContentValues):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7879b() {
        mo7900u(500);
        Cursor rawQuery = this.f7616c.rawQuery("SELECT _id,path,present,system,uri FROM rompaths WHERE system!='none'", null);
        boolean z = false;
        if (rawQuery.moveToFirst()) {
            boolean z2 = false;
            do {
                boolean z3 = rawQuery.getInt(2) == 1;
                C2399i2 d = C2399i2.m10374d(this, rawQuery.isNull(4) ? rawQuery.getString(1) : rawQuery.getString(4));
                if (!(d == null || d.exists() == z3)) {
                    SQLiteDatabase sQLiteDatabase = this.f7616c;
                    sQLiteDatabase.execSQL("UPDATE rompaths SET last_checked=0 WHERE _id=" + rawQuery.getInt(0));
                    mo7881d(rawQuery.getInt(0), true);
                    if (this.f7621h.mo8545E(rawQuery.getString(3))) {
                        mo7891n();
                        z2 = true;
                    }
                }
            } while (rawQuery.moveToNext());
            z = z2;
        }
        rawQuery.close();
        if (z) {
            mo7892o();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ec  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7880c(int r21, java.lang.String r22, java.lang.String r23, com.digdroid.alman.dig.C2399i2 r24, java.util.regex.Pattern r25, java.util.regex.Pattern r26) {
        /*
        // Method dump skipped, instructions count: 840
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.DatabaseService.mo7880c(int, java.lang.String, java.lang.String, com.digdroid.alman.dig.i2, java.util.regex.Pattern, java.util.regex.Pattern):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0155, code lost:
        if (r2.getInt(1) != 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0157, code lost:
        r0 = r19.f7616c;
        r0.execSQL("UPDATE rompaths SET last_checked=0 WHERE _id=" + r20);
        r0 = true;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0171, code lost:
        r13 = r13;
        r0 = true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7881d(int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 1023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.DatabaseService.mo7881d(int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        if (r7[r9] == null) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017b A[LOOP:3: B:77:0x0179->B:78:0x017b, LOOP_END] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7882e() {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.DatabaseService.mo7882e():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7883f(C2399i2 i2Var, int i, File file, long j) {
        String g;
        if (!(i2Var == null || i >= 12 || (g = i2Var.mo8601g()) == null)) {
            if (file == null || !file.getAbsolutePath().equals(g)) {
                Cursor rawQuery = this.f7616c.rawQuery("SELECT _id FROM rompaths WHERE (system='none' OR system='ignore') AND path=" + DatabaseUtils.sqlEscapeString(g), null);
                boolean moveToFirst = rawQuery.moveToFirst();
                rawQuery.close();
                if (!moveToFirst) {
                    if (C2372h2.m10297a(this, g)) {
                        this.f7624k = true;
                    }
                    if (i == 1) {
                        try {
                            if (i2Var.getName().equalsIgnoreCase("users")) {
                                return;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    if (!i2Var.getName().equalsIgnoreCase("$RECYCLE.BIN")) {
                        for (File file2 : i2Var.listFiles(new C2096a())) {
                            mo7883f(C2399i2.m10373c(file2), i + 1, file, j);
                        }
                        if (i2Var.lastModified() > j) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("path", g);
                            contentValues.put("uri", i2Var.getAbsolutePath());
                            contentValues.put("system", "none");
                            contentValues.put("last_checked", (Integer) 0);
                            contentValues.put("selected", (Integer) 0);
                            this.f7616c.insert("rompaths", null, contentValues);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7884g(String str, int i, File file, long j) {
        mo7883f(C2399i2.m10374d(this, str), i, file, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo7885h(String str, File file, Pattern pattern, boolean z) {
        if (!file.isDirectory()) {
            return false;
        }
        if (str.equals("amiga")) {
            return !z;
        }
        if (str.equals("scumm")) {
            return !z || file.getName().length() >= 10;
        }
        try {
            return file.listFiles(new C2097b(pattern)).length > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0110  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues mo7886i(com.digdroid.alman.dig.C2399i2 r10, long r11) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.DatabaseService.mo7886i(com.digdroid.alman.dig.i2, long):android.content.ContentValues");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo7887j(C2399i2 i2Var, long j) {
        String f;
        String[] strArr;
        String str;
        SQLiteDatabase sQLiteDatabase;
        if (!i2Var.getName().equalsIgnoreCase("collection.xml") || (f = C2185a4.m9676f(i2Var)) == null) {
            return false;
        }
        String[] split = f.split("<game>");
        boolean z = false;
        for (String str2 : split) {
            Matcher matcher = Pattern.compile("<id>(.*?)<\\/id>").matcher(str2);
            if (matcher.find()) {
                String group = matcher.group(1);
                Matcher matcher2 = Pattern.compile("<description>(.*?)<\\/description>").matcher(str2);
                if (matcher2.find()) {
                    if (j < 0) {
                        return true;
                    }
                    String group2 = matcher2.group(1);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("present", (Integer) 1);
                    if (this.f7616c.update("roms", contentValues, "pathid=" + j + " AND system='pc' AND filename=" + DatabaseUtils.sqlEscapeString(group) + "", null) <= 0) {
                        long e = this.f7618e.mo8712e("pc", group2, false, 80, false);
                        ContentValues b = this.f7615b.mo9324b();
                        b.put("system", "pc");
                        b.put("pathid", Long.valueOf(j));
                        b.put("filename", group);
                        if (e < 0) {
                            String b2 = this.f7618e.mo8709b(this.f7618e.mo8708a(group2, false));
                            b.put("title", b2);
                            b.put("sortname", this.f7620g.mo8846k(b2));
                        }
                        if (this.f7619f.mo8197u()) {
                            sQLiteDatabase = this.f7616c;
                            str = "SELECT _id FROM emulators WHERE name='Magic DosBox (TV)'";
                            strArr = null;
                        } else {
                            strArr = null;
                            sQLiteDatabase = this.f7616c;
                            str = "SELECT _id FROM emulators WHERE name='Magic DosBox'";
                        }
                        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
                        if (rawQuery.moveToFirst()) {
                            b.put("emulator", Integer.valueOf(rawQuery.getInt(0)));
                        }
                        rawQuery.close();
                        if (mo7878a("pc", e, b)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7888k() {
        Cursor rawQuery = this.f7616c.rawQuery("SELECT _id,merged_with FROM roms WHERE pathid=-1", null);
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            this.f7616c.execSQL("DELETE FROM roms WHERE pathid=-1");
        }
        do {
            SQLiteDatabase sQLiteDatabase = this.f7616c;
            sQLiteDatabase.execSQL("DELETE FROM gamegenres WHERE game=" + rawQuery.getLong(0));
            if (rawQuery.getLong(1) >= 0) {
                SQLiteDatabase sQLiteDatabase2 = this.f7616c;
                sQLiteDatabase2.execSQL("UPDATE roms SET merged_with=-1 WHERE merged_with=" + rawQuery.getLong(1));
            }
        } while (rawQuery.moveToNext());
        rawQuery.close();
        this.f7616c.execSQL("DELETE FROM roms WHERE pathid=-1");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo7889l(File file, String str, String str2, HashMap<String, Pattern> hashMap, HashMap<String, Pattern> hashMap2, C2099d dVar) {
        boolean z = false;
        String lowerCase = this.f7618e.mo8709b(this.f7618e.mo8708a(str, file != null && file.exists() && file.isDirectory())).toLowerCase();
        String g = this.f7618e.mo8714g(lowerCase);
        String h = this.f7618e.mo8715h(lowerCase);
        boolean z2 = file != null && file.exists() && file.isDirectory();
        SQLiteDatabase sQLiteDatabase = this.f7617d;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT s.slug,t.title FROM systems as s,titles as t WHERE t.title MATCH " + DatabaseUtils.sqlEscapeString(g) + " AND s._id=t.system", null);
        if (rawQuery.moveToFirst()) {
            boolean z3 = false;
            do {
                String string = rawQuery.getString(0);
                if (!z2 ? !(string.equals("mame") || string.equals("neogeo") || ((str2 != null && !hashMap.get(string).matcher(str2).find()) || C3345a.m13939a(h, this.f7618e.mo8715h(rawQuery.getString(1))) < 90)) : !((!string.equals("pc") && !string.equals("scumm")) || !hashMap2.containsKey(string) || C3345a.m13939a(h, this.f7618e.mo8715h(rawQuery.getString(1))) < 95 || !mo7885h(string, file, hashMap2.get(string), true))) {
                    dVar.mo7909e(string);
                    z3 = true;
                }
            } while (rawQuery.moveToNext());
            z = z3;
        }
        rawQuery.close();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7890m() {
        Cursor rawQuery;
        HashSet hashSet = new HashSet();
        mo7900u(2000);
        boolean z = false;
        while (true) {
            rawQuery = this.f7616c.rawQuery("SELECT _id,title,system FROM roms WHERE merged_with<0 AND ignored=0 AND present=1 LIMIT 1", null);
            if (!rawQuery.moveToFirst()) {
                break;
            }
            long j = rawQuery.getLong(0);
            String string = rawQuery.getString(1);
            String string2 = rawQuery.getString(2);
            rawQuery.close();
            Cursor rawQuery2 = this.f7616c.rawQuery("SELECT _id,last_played,times_played,time_played,present FROM roms WHERE system='" + string2 + "' AND title=" + DatabaseUtils.sqlEscapeString(string) + " AND ignored=0 AND present=1 ORDER BY filename ASC", null);
            if (!rawQuery2.moveToFirst()) {
                rawQuery2.close();
                rawQuery2 = this.f7616c.rawQuery("SELECT _id,last_played,times_played,time_played,present FROM roms WHERE _id=" + j, null);
                if (!rawQuery2.moveToFirst()) {
                    rawQuery2.close();
                    z = true;
                }
            }
            long j2 = -1;
            while (true) {
                if (rawQuery2.getInt(4) != 1) {
                    if (!rawQuery2.moveToNext()) {
                        break;
                    }
                } else {
                    j2 = rawQuery2.getLong(0);
                    break;
                }
            }
            long j3 = j2;
            long j4 = 0;
            if (j3 >= 0) {
                rawQuery2.moveToFirst();
                long j5 = 0;
                int i = 0;
                while (true) {
                    this.f7616c.execSQL("UPDATE roms SET merged_with=" + j3 + " WHERE _id=" + rawQuery2.getLong(0));
                    j4 = Math.max(j4, rawQuery2.getLong(1));
                    i += rawQuery2.getInt(2);
                    j5 += rawQuery2.getLong(3);
                    if (!rawQuery2.moveToNext()) {
                        break;
                    }
                    j3 = j3;
                }
                if (rawQuery2.getCount() > 1 && this.f7619f.mo8180c("merged_games", true)) {
                    this.f7616c.execSQL("UPDATE systems SET numgames=numgames-" + (rawQuery2.getCount() - 1) + " WHERE slug='" + string2 + "'");
                }
                if (rawQuery2.getCount() > 1) {
                    hashSet.add(string2);
                }
                rawQuery2.close();
                ContentValues contentValues = new ContentValues();
                contentValues.put("merged_last_played", Long.valueOf(j4));
                contentValues.put("merged_times_played", Integer.valueOf(i));
                contentValues.put("merged_time_played", Long.valueOf(j5));
                this.f7616c.update("roms", contentValues, "_id=" + j3, null);
                mo7891n();
            }
            z = true;
        }
        rawQuery.close();
        this.f7619f.mo8152A("unmerged_files", false);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f7621h.mo8545E((String) it.next());
        }
        if (z) {
            mo7892o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo7891n() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f7622i >= this.f7623j) {
            this.f7622i = currentTimeMillis;
            mo7892o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo7892o() {
        try {
            C1088a.m6129b(this).mo5723d(new Intent(getPackageName() + "." + "request_refresh"));
        } catch (Exception unused) {
        }
    }

    public void onCreate() {
        super.onCreate();
        C2775u e = C2775u.m11726e(getApplicationContext());
        this.f7615b = e;
        e.mo9329h();
        this.f7616c = this.f7615b.mo9325c();
        C2886z1 b = C2886z1.m11967b(getApplicationContext());
        b.mo9516c();
        this.f7617d = b.mo9515a();
        this.f7619f = C2219c3.m9805k(getApplicationContext());
        C2512o0 g = C2512o0.m10833g(getApplicationContext(), this.f7615b);
        this.f7620g = g;
        g.mo8850o();
        C2375h3 r = C2375h3.m10306r(getApplicationContext(), this.f7615b);
        this.f7621h = r;
        r.mo8543C();
        this.f7618e = new C2456l0(this.f7617d);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (!C2185a4.m9694x(this) && intent != null) {
            try {
                this.f7619f.mo8173V(true);
                String action = intent.getAction();
                if ("check_paths".equals(action)) {
                    mo7879b();
                } else if ("romupdates".equals(action)) {
                    mo7881d(intent.getIntExtra("pathid", -1), intent.getBooleanExtra("rescan", false));
                } else if ("kill_orphans".equals(action)) {
                    mo7888k();
                    mo7877A();
                } else if ("find_dirs".equals(action)) {
                    mo7882e();
                } else if ("scan_dirs".equals(action)) {
                    mo7896q();
                } else if ("scan_dir".equals(action)) {
                    mo7899t(intent.getStringExtra("param"));
                } else if ("scan_uri".equals(action)) {
                    mo7898s((Uri) intent.getParcelableExtra("uri"));
                } else if ("scandroid".equals(action)) {
                    mo7897r(true);
                } else if ("merge_games".equals(action)) {
                    mo7890m();
                } else if ("sync".equals(action)) {
                    ServerService.m9575t(getApplicationContext(), "com.digdroid.alman.dig.action.SYNC");
                } else {
                    action.equals("update_masterbase");
                }
                this.f7619f.mo8173V(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f7 A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030c A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0310 A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x033e A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d0 A[Catch:{ Exception -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0564 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0141 A[Catch:{ Exception -> 0x02c9 }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7895p(com.digdroid.alman.dig.C2399i2 r33, java.util.regex.Pattern r34, java.util.HashMap<java.lang.String, java.util.regex.Pattern> r35, java.util.HashMap<java.lang.String, java.util.regex.Pattern> r36) {
        /*
        // Method dump skipped, instructions count: 1406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.DatabaseService.mo7895p(com.digdroid.alman.dig.i2, java.util.regex.Pattern, java.util.HashMap, java.util.HashMap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo7896q() {
        Cursor rawQuery;
        Cursor rawQuery2 = this.f7616c.rawQuery("SELECT _id,path FROM rompaths WHERE system='none' LIMIT 1", null);
        boolean moveToFirst = rawQuery2.moveToFirst();
        rawQuery2.close();
        if (moveToFirst) {
            mo7900u(2000);
            HashSet hashSet = new HashSet();
            HashMap<String, Pattern> hashMap = new HashMap<>();
            Cursor rawQuery3 = this.f7616c.rawQuery("SELECT extensions,slug FROM systems", null);
            String str = "";
            if (rawQuery3.moveToFirst()) {
                do {
                    if (!rawQuery3.isNull(0) && !rawQuery3.getString(0).equals(str)) {
                        hashMap.put(rawQuery3.getString(1), Pattern.compile("\\.(" + rawQuery3.getString(0) + ")$", 2));
                        String[] split = rawQuery3.getString(0).split("\\|");
                        for (String str2 : split) {
                            if (!str2.equals("folder")) {
                                hashSet.add(str2);
                            }
                        }
                    }
                } while (rawQuery3.moveToNext());
            }
            rawQuery3.close();
            HashMap<String, Pattern> hashMap2 = new HashMap<>();
            Cursor rawQuery4 = this.f7616c.rawQuery("SELECT folder_exts,slug FROM systems", null);
            if (rawQuery4.moveToFirst()) {
                do {
                    if (!rawQuery4.getString(0).equals(str)) {
                        hashMap2.put(rawQuery4.getString(1), Pattern.compile("\\.(" + rawQuery4.getString(0) + ")$", 2));
                    }
                } while (rawQuery4.moveToNext());
            }
            rawQuery4.close();
            hashSet.add("zip");
            hashSet.add("rar");
            hashSet.add("7z");
            hashSet.add("gz");
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                str = str + "|" + ((String) it.next());
            }
            Pattern compile = Pattern.compile("\\.(" + str.substring(1) + ")$", 2);
            while (true) {
                rawQuery = this.f7616c.rawQuery("SELECT _id,path,uri FROM rompaths WHERE system='none' LIMIT 1", null);
                if (!rawQuery.moveToFirst()) {
                    break;
                }
                long j = rawQuery.getLong(0);
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(2);
                rawQuery.close();
                if (string2 != null) {
                    string = string2;
                }
                C2399i2 d = C2399i2.m10374d(this, string);
                if (d.exists()) {
                    try {
                        mo7895p(d, compile, hashMap, hashMap2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                this.f7616c.execSQL("DELETE FROM rompaths WHERE _id=" + j);
            }
            rawQuery.close();
            this.f7616c.execSQL("DELETE FROM rompaths WHERE system='none'");
            mo7891n();
            Cursor rawQuery5 = this.f7616c.rawQuery("SELECT _id,path FROM rompaths WHERE system='pc' OR system='scumm' OR system='amiga'", null);
            if (rawQuery5.moveToFirst()) {
                do {
                    String string3 = rawQuery5.getString(1);
                    if (!string3.contains(".MagicBox")) {
                        SQLiteDatabase sQLiteDatabase = this.f7616c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT _id,path,system FROM rompaths WHERE path LIKE ");
                        sb.append(DatabaseUtils.sqlEscapeString(string3 + "%"));
                        Cursor rawQuery6 = sQLiteDatabase.rawQuery(sb.toString(), null);
                        if (rawQuery6.moveToFirst()) {
                            do {
                                long j2 = rawQuery6.getLong(0);
                                String string4 = rawQuery6.getString(1);
                                if (string4.substring(0, string4.lastIndexOf(47)).equals(string3)) {
                                    this.f7616c.execSQL("UPDATE roms SET pathid=-1,ignored=1,present=0 WHERE pathid=" + j2);
                                    this.f7616c.execSQL("DELETE FROM rompaths WHERE _id=" + j2);
                                    this.f7621h.mo8545E(rawQuery6.getString(2));
                                }
                            } while (rawQuery6.moveToNext());
                        }
                        rawQuery6.close();
                    }
                } while (rawQuery5.moveToNext());
            }
            rawQuery5.close();
            mo7892o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7897r(boolean z) {
        Bundle bundle;
        Cursor rawQuery = this.f7616c.rawQuery("SELECT ignored FROM systems WHERE slug='android'", null);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        if (i != 1) {
            this.f7616c.execSQL("UPDATE roms SET present=0 WHERE system='android'");
            for (ApplicationInfo applicationInfo : getPackageManager().getInstalledApplications(128)) {
                int i2 = applicationInfo.flags;
                if ((i2 & 1) == 0) {
                    boolean z2 = (i2 & 33554432) != 0 || ((bundle = applicationInfo.metaData) != null && bundle.getBoolean("isGame", false));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("present", (Integer) 1);
                    if (z) {
                        contentValues.put("ignored", Boolean.valueOf(!z2));
                    }
                    String str = applicationInfo.packageName;
                    SQLiteDatabase sQLiteDatabase = this.f7616c;
                    if (sQLiteDatabase.update("roms", contentValues, "system='android' AND filename=" + DatabaseUtils.sqlEscapeString(str), null) == 0) {
                        ContentValues b = this.f7615b.mo9324b();
                        b.put("system", "android");
                        b.put("pathid", (Integer) 0);
                        String charSequence = applicationInfo.loadLabel(getPackageManager()).toString();
                        b.put("title", charSequence);
                        b.put("sortname", this.f7620g.mo8846k(charSequence));
                        b.put("filename", str);
                        b.put("ignored", Boolean.valueOf(!z2));
                        long insert = this.f7616c.insert("roms", null, b);
                        SQLiteDatabase sQLiteDatabase2 = this.f7616c;
                        sQLiteDatabase2.execSQL("UPDATE roms SET merged_with=_id WHERE _id=" + insert);
                    }
                }
            }
            this.f7621h.mo8545E("android");
            mo7892o();
            ImageService.m9511a(getApplicationContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7898s(Uri uri) {
        mo7883f(new C2399i2(this, uri), 0, C2185a4.m9663A(getApplicationContext()), 0);
        mo7896q();
        ImageService.m9511a(getApplicationContext());
        mo7890m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7899t(String str) {
        mo7884g(str, 0, C2185a4.m9663A(getApplicationContext()), 0);
        mo7896q();
        ImageService.m9511a(getApplicationContext());
        mo7890m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo7900u(long j) {
        this.f7623j = j;
        this.f7622i = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public long mo7901z(String str, File file, Pattern pattern) {
        try {
            C2363g4 g4Var = new C2363g4(this, file.getAbsolutePath());
            long j = -2;
            int i = 0;
            while (true) {
                try {
                    C2363g4.C2364a d = g4Var.mo8020d();
                    if (d == null || j >= 0) {
                        break;
                    }
                    int i2 = i + 1;
                    if (i >= 30) {
                        break;
                    }
                    boolean find = pattern.matcher(d.f8292a).find();
                    long j2 = d.f8294c;
                    this.f7627n = j2;
                    SQLiteDatabase sQLiteDatabase = this.f7617d;
                    Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT g._id,g.gdbid,g.gfcover FROM games as g,crcs as c,systems as s WHERE c.rowid=" + j2 + " AND g._id=c.gameid AND s.slug='" + str + "' AND g.system=s._id", null);
                    if (rawQuery.moveToFirst()) {
                        j = rawQuery.getLong(0);
                        String string = rawQuery.getString(2);
                        if (find && rawQuery.getLong(1) < 0 && (string == null || string.equals(""))) {
                            long e = this.f7618e.mo8712e(str, file.getName(), false, 85, true);
                            if (e >= 0) {
                                j = e;
                            }
                        }
                    } else if (find) {
                        j = this.f7618e.mo8712e(str, file.getName(), false, 80, false);
                    }
                    rawQuery.close();
                    i = i2;
                } catch (Exception unused) {
                    return -1;
                }
            }
            g4Var.mo8019a();
            return j;
        } catch (Exception unused2) {
            return -1;
        }
    }
}
