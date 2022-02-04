package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.DialogInterfaceC0068b;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p150d.p151a.p153b.C3345a;

/* renamed from: com.digdroid.alman.dig.o0 */
public class C2512o0 {

    /* renamed from: a */
    private static C2512o0 f8724a;

    /* renamed from: b */
    private C2775u f8725b;

    /* renamed from: c */
    private SQLiteDatabase f8726c;

    /* renamed from: d */
    private Context f8727d;

    /* renamed from: e */
    private C2219c3 f8728e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o0$a */
    public class DialogInterface$OnClickListenerC2513a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ArrayList f8729b;

        /* renamed from: c */
        final /* synthetic */ Cursor f8730c;

        /* renamed from: d */
        final /* synthetic */ ActivityC2888z3 f8731d;

        DialogInterface$OnClickListenerC2513a(ArrayList arrayList, Cursor cursor, ActivityC2888z3 z3Var) {
            this.f8729b = arrayList;
            this.f8730c = cursor;
            this.f8731d = z3Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 0;
            boolean z = i >= this.f8729b.size();
            Cursor cursor = this.f8730c;
            if (!z) {
                i2 = ((Integer) this.f8729b.get(i)).intValue();
            }
            cursor.moveToPosition(i2);
            C2512o0.this.mo8845j(this.f8731d, this.f8730c, z);
        }
    }

    private C2512o0(Context context, C2775u uVar) {
        this.f8727d = context.getApplicationContext();
        this.f8725b = uVar;
        this.f8728e = C2219c3.m9805k(context);
    }

    /* renamed from: g */
    public static synchronized C2512o0 m10833g(Context context, C2775u uVar) {
        C2512o0 o0Var;
        synchronized (C2512o0.class) {
            if (f8724a == null) {
                f8724a = new C2512o0(context, uVar);
            }
            o0Var = f8724a;
        }
        return o0Var;
    }

    /* renamed from: p */
    private String m10834p(C2369h0 h0Var, String str) {
        String str2;
        String str3;
        StringBuilder sb;
        StringBuilder sb2;
        String str4;
        String str5 = "AND";
        if (h0Var.f8313e) {
            str2 = "" + " " + str + " r.favorite=1";
            str3 = str5;
        } else {
            str3 = str;
            str2 = "";
        }
        if (h0Var.f8314f) {
            str2 = str2 + " " + str3 + " r.last_played=0";
            str3 = str5;
        }
        if (h0Var.f8311c >= 0) {
            str2 = str2 + " " + str3 + " g.genre=" + h0Var.f8311c + " AND r._id=g.game";
            str3 = str5;
        }
        if (h0Var.f8312d >= 0) {
            str2 = str2 + " " + str3 + " c.collection=" + h0Var.f8312d + " AND r._id=c.game";
            str3 = str5;
        }
        if (!h0Var.f8317i.equals("")) {
            str2 = str2 + " " + str3 + " s.slug=r.system AND s.type='" + h0Var.f8317i + "'";
            str3 = str5;
        }
        if (h0Var.f8318j > 0) {
            if (h0Var.f8317i.equals("")) {
                str2 = str2 + " " + str3 + " s.slug=r.system";
                str3 = str5;
            }
            str2 = str2 + " " + str3 + " s.generation=" + h0Var.f8318j;
            str3 = str5;
        }
        if (!h0Var.f8316h.equals("")) {
            str2 = str2 + " " + str3 + " r.system='" + h0Var.f8316h + "'";
            str3 = str5;
        }
        if (h0Var.f8309a > 0) {
            str2 = str2 + " " + str3 + " r.released>=" + h0Var.f8309a;
            str3 = str5;
        }
        if (h0Var.f8310b > 0) {
            if (h0Var.f8309a == 0) {
                str2 = str2 + " " + str3 + " r.released>0";
                str3 = str5;
            }
            str2 = str2 + " " + str3 + " r.released<" + h0Var.f8310b;
            str3 = str5;
        }
        if (!h0Var.f8319k.equals("")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(str3);
            sb3.append(" (r.publisher LIKE ");
            sb3.append(DatabaseUtils.sqlEscapeString("%" + h0Var.f8319k + "%"));
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(" OR r.developer LIKE ");
            sb5.append(DatabaseUtils.sqlEscapeString("%" + h0Var.f8319k + "%"));
            sb5.append(")");
            str2 = sb5.toString();
        } else {
            str5 = str3;
        }
        if (!h0Var.f8315g.equals("")) {
            boolean c = this.f8728e.mo8180c("search_filenames", false);
            String str6 = "r.filename";
            if (h0Var.f8315g.substring(0, 1).equals("^")) {
                String substring = h0Var.f8315g.substring(1);
                if (!substring.equals("")) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(str5);
                    sb.append(" ");
                    if (!c) {
                        str6 = "r.sortname";
                    }
                    sb.append(str6);
                    sb.append(" LIKE ");
                    sb2 = new StringBuilder();
                    str4 = mo8846k(substring);
                }
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(" ");
                sb.append(str5);
                sb.append(" ");
                if (!c) {
                    str6 = "r.title";
                }
                sb.append(str6);
                sb.append(" LIKE ");
                sb2 = new StringBuilder();
                sb2.append("%");
                str4 = h0Var.f8315g;
            }
            sb2.append(str4);
            sb2.append("%");
            sb.append(DatabaseUtils.sqlEscapeString(sb2.toString()));
            return sb.toString();
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10835q(java.lang.String r5, com.digdroid.alman.dig.C2369h0 r6) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2512o0.m10835q(java.lang.String, com.digdroid.alman.dig.h0):java.lang.String");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r3.equals("mostplayed") == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0105, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017d, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0180, code lost:
        r3 = " DESC";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a3, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c2, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e1, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0200, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0234, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0268, code lost:
        if (r2 != false) goto L_0x0181;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10836r(com.digdroid.alman.dig.C2369h0 r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 688
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2512o0.m10836r(com.digdroid.alman.dig.h0, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8837a(long j, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("game", Long.valueOf(j));
        contentValues.put("genre", Integer.valueOf(i));
        this.f8726c.insert("gamegenres", null, contentValues);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Cursor mo8838b(String str, String str2, SQLiteDatabase sQLiteDatabase, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String trim = str.toLowerCase().trim();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT t.rowid,t.title FROM titles as t,systems as s WHERE s.slug='" + str2 + "' AND t.system=s._id", null);
        if (rawQuery.moveToFirst()) {
            do {
                int a = C3345a.m13939a(trim, rawQuery.getString(1).toLowerCase());
                if (arrayList.size() < i || a > ((Integer) arrayList2.get(i - 1)).intValue()) {
                    long j = (long) rawQuery.getInt(0);
                    int i2 = 0;
                    while (i2 < arrayList2.size() && a <= ((Integer) arrayList2.get(i2)).intValue()) {
                        i2++;
                    }
                    arrayList2.add(i2, Integer.valueOf(a));
                    arrayList.add(i2, Long.valueOf(j));
                    if (arrayList2.size() > i) {
                        arrayList2.remove(i);
                        arrayList.remove(i);
                    }
                }
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        String str3 = "SELECT rowid,title FROM titles WHERE rowid IN (";
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            if (i3 > 0) {
                str3 = str3 + ",";
            }
            str3 = str3 + arrayList.get(i3);
        }
        return sQLiteDatabase.rawQuery(str3 + ")", null);
    }

    /* renamed from: c */
    public void mo8839c(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("cover_status", (Integer) 21255);
        contentValues.put("cover_requested", Long.valueOf(System.currentTimeMillis()));
        SQLiteDatabase sQLiteDatabase = this.f8726c;
        sQLiteDatabase.update("roms", contentValues, "_id=" + j, null);
        ImageService.m9511a(this.f8727d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Cursor mo8840d(long j) {
        Cursor rawQuery = this.f8726c.rawQuery("SELECT e._id,e.name,e.system,e.package,e.class,e.core,e.rom_key,e.data_type,e.action_type,e.takes_zip,e.config_dir,e.use_retroarch64 FROM roms as r,emulators as e" + " WHERE r._id=" + j + " AND r.emulator>=0 AND e._id=r.emulator", null);
        if (rawQuery.getCount() != 0) {
            return rawQuery;
        }
        rawQuery.close();
        return this.f8726c.rawQuery("SELECT e._id,e.name,e.system,e.package,e.class,e.core,e.rom_key,e.data_type,e.action_type,e.takes_zip,e.config_dir,e.use_retroarch64 FROM roms as r,emulators as e" + ",systems as s WHERE r._id=" + j + " AND s.slug=r.system AND e._id=s.emulator", null);
    }

    /* renamed from: e */
    public Cursor mo8841e(String str, C2369h0 h0Var) {
        String q = m10835q(str, h0Var);
        String str2 = "WHERE";
        String p = m10834p(h0Var, str2);
        SQLiteDatabase sQLiteDatabase = this.f8726c;
        StringBuilder sb = new StringBuilder();
        sb.append(q + p);
        sb.append(" ");
        if (!p.equals("")) {
            str2 = "AND";
        }
        sb.append(m10836r(h0Var, str2));
        return sQLiteDatabase.rawQuery(sb.toString(), null);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8842f(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1187663369:
                if (str.equals("Role-playing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -830755097:
                if (str.equals("Tabletop")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -321453952:
                if (str.equals("Platformer")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 76463:
                if (str.equals("MMO")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83127:
                if (str.equals("Sim")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1725571133:
                if (str.equals("_Final Fantasy")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                str = "Role-Playing";
                break;
            case 1:
            case 3:
            case 5:
                return -1;
            case 2:
                str = "Platform";
                break;
            case 4:
                str = "Simulation";
                break;
        }
        SQLiteDatabase sQLiteDatabase = this.f8726c;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM genres WHERE name=" + DatabaseUtils.sqlEscapeString(str), null);
        if (rawQuery.moveToFirst()) {
            int i = rawQuery.getInt(0);
            rawQuery.close();
            return i;
        }
        rawQuery.close();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        return (int) this.f8726c.insert("genres", null, contentValues);
    }

    /* renamed from: h */
    public Cursor mo8843h(String str, C2369h0 h0Var) {
        String str2;
        StringBuilder sb;
        if (mo8848m(h0Var)) {
            sb = new StringBuilder();
            sb.append(m10835q(str, h0Var));
            str2 = " WHERE r.merged_last_played>0";
        } else {
            sb = new StringBuilder();
            sb.append(m10835q(str, h0Var));
            str2 = " WHERE r.last_played>0";
        }
        sb.append(str2);
        String str3 = sb.toString() + m10834p(h0Var, "AND");
        return this.f8726c.rawQuery(str3 + " " + m10836r(h0Var, "AND"), null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8844i(ActivityC2888z3 z3Var, long j, C2369h0 h0Var) {
        if (!(z3Var == null || z3Var.isFinishing())) {
            SQLiteDatabase sQLiteDatabase = this.f8726c;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id,title,released,pathid,system,times_played,time_played,filename,merged_with FROM roms WHERE _id=" + j, null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return;
            }
            long j2 = rawQuery.getLong(8);
            if (!mo8848m(h0Var) || j2 < 0) {
                mo8845j(z3Var, rawQuery, false);
                return;
            }
            rawQuery.close();
            SQLiteDatabase sQLiteDatabase2 = this.f8726c;
            Cursor rawQuery2 = sQLiteDatabase2.rawQuery("SELECT _id,title,released,pathid,system,times_played,time_played,filename,merged_with FROM roms WHERE merged_with=" + j2 + " ORDER BY filename", null);
            if (rawQuery2.moveToFirst()) {
                if (rawQuery2.getCount() == 1) {
                    mo8845j(z3Var, rawQuery2, false);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Pattern compile = Pattern.compile("\\.cue$", 2);
                int i = 0;
                boolean z = false;
                while (true) {
                    String string = rawQuery2.getString(7);
                    if (compile.matcher(string).find()) {
                        z = true;
                    }
                    arrayList.add(string);
                    int i2 = i + 1;
                    arrayList2.add(Integer.valueOf(i));
                    if (!rawQuery2.moveToNext()) {
                        break;
                    }
                    i = i2;
                }
                if (z) {
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        if (compile.matcher((CharSequence) arrayList.get(i3)).find()) {
                            i3++;
                        } else {
                            arrayList.remove(i3);
                            arrayList2.remove(i3);
                        }
                    }
                }
                if (arrayList.size() == 1) {
                    rawQuery2.moveToPosition(((Integer) arrayList2.get(0)).intValue());
                    mo8845j(z3Var, rawQuery2, false);
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[(arrayList.size() + 1)];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    charSequenceArr[i4] = (CharSequence) arrayList.get(i4);
                }
                charSequenceArr[arrayList.size()] = z3Var.getString(R.string.playlist);
                new DialogInterfaceC0068b.C0069a(z3Var, C2553q3.m11117c()).mo238r(R.string.select_version).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2513a(arrayList2, rawQuery2, z3Var)).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8845j(ActivityC2888z3 z3Var, Cursor cursor, boolean z) {
        Cursor d = mo8840d(cursor.getLong(0));
        if (!d.moveToFirst()) {
            d.close();
            d = null;
        }
        C2187b0.m9701o(z3Var.getApplicationContext(), null, this).mo8061w(z3Var, d, cursor, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r5.substring(0, 3).equals("an ") != false) goto L_0x0018;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo8846k(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.toLowerCase()
            int r0 = r5.length()
            r1 = 4
            r2 = 0
            if (r0 <= r1) goto L_0x001d
            java.lang.String r0 = r5.substring(r2, r1)
            java.lang.String r3 = "the "
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x001d
        L_0x0018:
            java.lang.String r5 = r5.substring(r1)
            goto L_0x0045
        L_0x001d:
            int r0 = r5.length()
            r1 = 2
            if (r0 <= r1) goto L_0x0031
            java.lang.String r0 = r5.substring(r2, r1)
            java.lang.String r3 = "a "
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0031
            goto L_0x0018
        L_0x0031:
            int r0 = r5.length()
            r1 = 3
            if (r0 <= r1) goto L_0x0045
            java.lang.String r0 = r5.substring(r2, r1)
            java.lang.String r3 = "an "
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0045
            goto L_0x0018
        L_0x0045:
            r0 = 20
            int r1 = r5.length()
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.String r5 = r5.substring(r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2512o0.mo8846k(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8847l(long j, SQLiteDatabase sQLiteDatabase, long j2) {
        String[] split;
        int f;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT t.title,g.released,g.developer,g.publisher,g.info,g.gdbid,g.genres,g.gfcover FROM games as g,titles as t WHERE g._id=" + j2 + " AND t.rowid=" + j2, null);
        rawQuery.moveToFirst();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mdbid", Long.valueOf(j2));
        contentValues.put("gdbid", Long.valueOf(rawQuery.getLong(5)));
        contentValues.put("title", rawQuery.getString(0).replaceAll("&amp;", "&").replaceAll(" ' ", " & "));
        contentValues.put("sortname", mo8846k(rawQuery.getString(0)));
        contentValues.put("released", Long.valueOf(rawQuery.getLong(1)));
        Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT name FROM publishers WHERE rowid=" + rawQuery.getLong(2), null);
        if (rawQuery2.moveToFirst()) {
            contentValues.put("developer", rawQuery2.getString(0));
        }
        rawQuery2.close();
        Cursor rawQuery3 = sQLiteDatabase.rawQuery("SELECT name FROM publishers WHERE rowid=" + rawQuery.getLong(3), null);
        if (rawQuery3.moveToFirst()) {
            contentValues.put("publisher", rawQuery3.getString(0));
        }
        rawQuery3.close();
        contentValues.put("info", (String) null);
        contentValues.put("gfcover", rawQuery.getString(7));
        contentValues.put("c_rating", Float.valueOf(0.0f));
        contentValues.put("c_rating_count", (Integer) 0);
        contentValues.put("c_played_total", (Integer) 0);
        contentValues.put("c_played_count", (Integer) 0);
        this.f8726c.update("roms", contentValues, "_id=" + j, null);
        mo8852t(j);
        this.f8726c.execSQL("DELETE FROM gamegenres WHERE game=" + j);
        String string = rawQuery.getString(6);
        if (string != null && !string.equals("")) {
            for (String str : string.split(",")) {
                Cursor rawQuery4 = sQLiteDatabase.rawQuery("SELECT name FROM genres WHERE rowid=" + Long.parseLong(str, 16), null);
                if (rawQuery4.moveToFirst() && (f = mo8842f(rawQuery4.getString(0))) >= 0) {
                    mo8837a(j, f);
                }
                rawQuery4.close();
            }
        }
        rawQuery.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo8848m(C2369h0 h0Var) {
        if (h0Var != null) {
            try {
                if (!h0Var.f8316h.equals("")) {
                    return C2375h3.m10306r(this.f8727d, this.f8725b).mo8573x(h0Var.f8316h);
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return this.f8728e.mo8180c("merged_games", true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo8849n() {
        return !mo8848m(null) ? "" : " AND (merged_with=-1 OR merged_with=_id)";
    }

    /* renamed from: o */
    public void mo8850o() {
        this.f8726c = this.f8725b.mo9325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8851s(long j, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = this.f8726c;
        Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT filename FROM roms WHERE _id=" + j, null);
        if (rawQuery.moveToFirst()) {
            String string = rawQuery.getString(0);
            int lastIndexOf = string.lastIndexOf(46);
            if (lastIndexOf > 0) {
                string = string.substring(0, lastIndexOf);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("mdbid", (Integer) -1);
            contentValues.put("gdbid", (Integer) -1);
            contentValues.put("title", string);
            contentValues.put("sortname", mo8846k(string));
            contentValues.put("released", (Integer) 0);
            contentValues.put("developer", "");
            contentValues.put("publisher", "");
            contentValues.put("info", "");
            contentValues.put("cover_status", (Integer) 0);
            SQLiteDatabase sQLiteDatabase3 = this.f8726c;
            sQLiteDatabase3.update("roms", contentValues, "_id=" + j, null);
            SQLiteDatabase sQLiteDatabase4 = this.f8726c;
            sQLiteDatabase4.execSQL("DELETE FROM gamegenres WHERE game=" + j);
            mo8852t(j);
        }
        rawQuery.close();
    }

    /* renamed from: t */
    public void mo8852t(long j) {
        SQLiteDatabase sQLiteDatabase = this.f8726c;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT merged_with,system FROM roms WHERE _id=" + j, null);
        if (rawQuery.moveToFirst()) {
            long j2 = rawQuery.getLong(0);
            String string = rawQuery.getString(1);
            if (j2 >= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("merged_with", (Integer) -1);
                SQLiteDatabase sQLiteDatabase2 = this.f8726c;
                int update = sQLiteDatabase2.update("roms", contentValues, "merged_with=" + j2, null);
                if (update > 1) {
                    SQLiteDatabase sQLiteDatabase3 = this.f8726c;
                    sQLiteDatabase3.execSQL("UPDATE systems SET numgames=numgames+" + (update - 1) + " WHERE slug='" + string + "'");
                }
                DatabaseService.m9478v(this.f8727d, "merge_games");
            }
        }
        rawQuery.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo8853u(long j, long j2, long j3) {
        SQLiteDatabase sQLiteDatabase = this.f8726c;
        sQLiteDatabase.execSQL("UPDATE roms SET last_played=" + j2 + ",times_played=times_played+1,time_played=time_played+" + j3 + ",c_played_count=c_played_count+1,c_played_total=c_played_total+" + j3 + " WHERE _id=" + j);
        SQLiteDatabase sQLiteDatabase2 = this.f8726c;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT merged_with FROM roms WHERE _id=");
        sb.append(j);
        Cursor rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
        if (rawQuery.moveToFirst()) {
            long j4 = rawQuery.getLong(0);
            if (j4 >= 0) {
                SQLiteDatabase sQLiteDatabase3 = this.f8726c;
                sQLiteDatabase3.execSQL("UPDATE roms SET merged_last_played=" + j2 + ",merged_times_played=merged_times_played+1,merged_time_played=merged_time_played+" + j3 + " WHERE merged_with=" + j4);
            }
        }
        rawQuery.close();
    }
}
