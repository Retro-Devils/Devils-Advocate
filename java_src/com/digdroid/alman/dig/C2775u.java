package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p006b.p057o.p058a.C1088a;

/* renamed from: com.digdroid.alman.dig.u */
public class C2775u {

    /* renamed from: a */
    private static SQLiteDatabase f9421a;

    /* renamed from: b */
    private static C2887z2 f9422b;

    /* renamed from: c */
    private static C2775u f9423c;

    /* renamed from: d */
    private Context f9424d;

    /* renamed from: e */
    private C2219c3 f9425e;

    private C2775u(Context context) {
        this.f9424d = context.getApplicationContext();
        this.f9425e = C2219c3.m9805k(context);
    }

    /* renamed from: e */
    public static synchronized C2775u m11726e(Context context) {
        C2775u uVar;
        synchronized (C2775u.class) {
            if (f9423c == null) {
                f9423c = new C2775u(context);
            }
            uVar = f9423c;
        }
        return uVar;
    }

    /* renamed from: i */
    private void m11727i(String str, String str2, SQLiteDatabase sQLiteDatabase, HashMap<String, Long> hashMap, HashMap<String, Long> hashMap2) {
        String str3;
        long j;
        String str4;
        C2492n nVar = new C2492n(this.f9424d);
        nVar.mo8773j("systems/" + str2);
        ContentValues contentValues = new ContentValues();
        String i = nVar.mo8772i("name");
        String i2 = nVar.mo8772i("system");
        String i3 = nVar.mo8772i("core");
        contentValues.put("name", i);
        contentValues.put("system", i2);
        contentValues.put("package", nVar.mo8772i("package"));
        contentValues.put("class", nVar.mo8772i("class"));
        contentValues.put("core", i3);
        contentValues.put("config_dir", nVar.mo8772i("config_dir"));
        contentValues.put("rom_key", nVar.mo8772i("rom_key"));
        contentValues.put("action_type", nVar.mo8772i("action"));
        contentValues.put("data_type", nVar.mo8772i("data_type"));
        String i4 = nVar.mo8772i("takes_zip");
        contentValues.put("takes_zip", Integer.valueOf((i4.equals("") || i4.equals("true")) ? 1 : 0));
        if (!i3.equals("")) {
            str3 = "SELECT _id,user_edited FROM emulators WHERE system='" + i2 + "' AND core=" + DatabaseUtils.sqlEscapeString(i3);
        } else {
            str3 = "SELECT _id,user_edited FROM emulators WHERE system='" + i2 + "' AND name=" + DatabaseUtils.sqlEscapeString(i);
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(str3, null);
        if (rawQuery.moveToFirst()) {
            j = rawQuery.getLong(0);
            if (rawQuery.getInt(1) == 0) {
                sQLiteDatabase.update("emulators", contentValues, "_id=" + j, null);
            }
        } else {
            j = sQLiteDatabase.insert("emulators", null, contentValues);
        }
        rawQuery.close();
        if (!nVar.mo8772i("core").equals("") || !mo9328g(nVar.mo8772i("package"))) {
            str4 = i2;
        } else {
            str4 = i2;
            hashMap2.put(str4, Long.valueOf(j));
        }
        if (nVar.mo8772i("default").equals("true") || !hashMap.containsKey(str4)) {
            hashMap.put(str4, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    private void m11728j(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        C2492n nVar = new C2492n(this.f9424d);
        nVar.mo8773j("systems/" + str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("slug", str);
        contentValues.put("parent", str);
        contentValues.put("extensions", nVar.mo8772i("extensions"));
        contentValues.put("folder_exts", nVar.mo8772i("folder_extensions"));
        contentValues.put("type", nVar.mo8772i("type"));
        contentValues.put("generation", Integer.valueOf(Integer.parseInt(nVar.mo8772i("generation"))));
        contentValues.put("introduced", Long.valueOf(C2185a4.m9690t(nVar.mo8772i("introduced"))));
        if (sQLiteDatabase.update("systems", contentValues, "slug='" + str + "'", null) == 0) {
            contentValues.put("name", nVar.mo8772i("name"));
            contentValues.put("numgames", (Integer) 0);
            contentValues.put("emulator", (Integer) -1);
            contentValues.put("overlay", nVar.mo8772i("retroarch_overlay"));
            sQLiteDatabase.insert("systems", null, contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9323a(java.util.HashMap<java.lang.String, java.lang.Long> r8, java.util.HashMap<java.lang.String, java.lang.Long> r9) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2775u.mo9323a(java.util.HashMap, java.util.HashMap):void");
    }

    /* renamed from: b */
    public ContentValues mo9324b() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mdbid", (Integer) -1);
        contentValues.put("gdbid", (Integer) -1);
        contentValues.put("merged_with", (Integer) -1);
        contentValues.put("emulator", (Integer) -1);
        contentValues.put("favorite", (Integer) 0);
        contentValues.put("released", (Integer) 0);
        contentValues.put("last_played", (Integer) 0);
        contentValues.put("times_played", (Integer) 0);
        contentValues.put("time_played", (Integer) 0);
        contentValues.put("developer", "");
        contentValues.put("publisher", "");
        contentValues.put("info", "");
        contentValues.put("notes", "");
        contentValues.put("cover_status", (Integer) 21255);
        contentValues.put("cover_requested", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("ignored", (Integer) 0);
        contentValues.put("present", (Integer) 1);
        contentValues.put("crc", (Integer) -1);
        return contentValues;
    }

    /* renamed from: c */
    public SQLiteDatabase mo9325c() {
        return f9422b.getWritableDatabase();
    }

    /* renamed from: d */
    public boolean mo9326d(SQLiteDatabase sQLiteDatabase, HashMap<String, Long> hashMap, HashMap<String, Long> hashMap2) {
        Pattern compile = Pattern.compile("^emu_([^_]+)_");
        boolean z = false;
        try {
            String[] list = this.f9424d.getAssets().list("systems");
            float length = (float) ((long) list.length);
            long round = (long) Math.round(length / 30.0f);
            long j = 0;
            long j2 = 0;
            int i = 0;
            while (true) {
                z = true;
                if (i >= list.length) {
                    break;
                }
                String str = list[i];
                Matcher matcher = compile.matcher(str);
                if (matcher.find()) {
                    m11727i(matcher.group(1), str, sQLiteDatabase, hashMap, hashMap2);
                }
                j++;
                if (j >= round) {
                    long j3 = j2 + j;
                    Intent intent = new Intent(this.f9424d.getPackageName() + "." + "INSTALL_PROGRESS");
                    intent.putExtra("progress", Math.round((((float) j3) * 30.0f) / length) + 10);
                    C1088a.m6129b(this.f9424d).mo5723d(intent);
                    j2 = j3;
                    j = 0;
                }
                i++;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo9327f(SQLiteDatabase sQLiteDatabase) {
        AssetManager assets = this.f9424d.getAssets();
        Pattern compile = Pattern.compile("^sys_(\\w+).cfg$");
        try {
            String[] list = assets.list("systems");
            for (String str : list) {
                Matcher matcher = compile.matcher(str);
                if (matcher.find()) {
                    m11728j(matcher.group(1), str, sQLiteDatabase);
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean mo9328g(String str) {
        for (ApplicationInfo applicationInfo : this.f9424d.getPackageManager().getInstalledApplications(0)) {
            if (applicationInfo.packageName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(80:9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|(2:75|76)|77|79|80|(2:82|83)|84|85|(4:87|(1:89)(1:90)|91|92)|93|94|95|96|97|(2:100|101)(1:102)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(81:9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|79|80|(2:82|83)|84|85|(4:87|(1:89)(1:90)|91|92)|93|94|95|96|97|(2:100|101)(1:102)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0100 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0107 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x010e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x011c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0123 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0131 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0138 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x013f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0146 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x014d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x015b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0162 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0169 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0170 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0177 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x019a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x01c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0214 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0229 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ad A[Catch:{ Exception -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e3 A[Catch:{ Exception -> 0x0214 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9329h() {
        /*
        // Method dump skipped, instructions count: 753
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2775u.mo9329h():void");
    }
}
