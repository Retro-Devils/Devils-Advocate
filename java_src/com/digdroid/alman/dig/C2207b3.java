package com.digdroid.alman.dig;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.b3 */
public class C2207b3 extends C2492n {

    /* renamed from: f */
    SQLiteDatabase f7929f;

    /* renamed from: g */
    SQLiteDatabase f7930g;

    C2207b3(Context context) {
        super(context);
        this.f7930g = C2775u.m11726e(context).mo9325c();
        C2886z1 b = C2886z1.m11967b(context);
        b.mo9516c();
        this.f7929f = b.mo9515a();
        mo8783t(false);
    }

    /* renamed from: A */
    public void mo8095A(String str, long j) {
        int indexOf = this.f8648b.indexOf(91, 10);
        if (indexOf > 0) {
            this.f8648b = this.f8648b.substring(0, indexOf);
        }
        String x = mo8099x(j);
        if (x != null) {
            mo8782s("lastselectedgame", x);
            this.f8648b += "[" + x + "]\n";
            this.f8648b += "\ngameid=" + x + "\n";
            Cursor rawQuery = this.f7929f.rawQuery("SELECT title FROM titles WHERE rowid=" + mo8098w(j), null);
            rawQuery.moveToFirst();
            this.f8648b += "description=" + rawQuery.getString(0) + "\n";
            rawQuery.close();
            this.f8648b += "path=" + str + "\n";
        }
    }

    /* renamed from: u */
    public String mo8096u() {
        Context context = this.f8647a;
        return new C2399i2(C2399i2.m10374d(context, C2219c3.m9805k(context).mo8193q("dig_dir", "")), "Emu config/ScummVM").getAbsolutePath();
    }

    /* renamed from: v */
    public String mo8097v() {
        return new C2399i2(C2399i2.m10374d(this.f8647a, mo8096u()), ".config/scummvm/scummvm.ini").getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public long mo8098w(long j) {
        SQLiteDatabase sQLiteDatabase = this.f7930g;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT mdbid FROM roms WHERE _id=" + j, null);
        long j2 = rawQuery.moveToFirst() ? rawQuery.getLong(0) : -1;
        rawQuery.close();
        return j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public String mo8099x(long j) {
        long w = mo8098w(j);
        String str = null;
        if (w >= 0) {
            SQLiteDatabase sQLiteDatabase = this.f7929f;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT slug FROM slugs WHERE gameid=" + w, null);
            if (rawQuery.moveToFirst()) {
                str = rawQuery.getString(0);
            }
            rawQuery.close();
        }
        return str;
    }

    /* renamed from: y */
    public void mo8100y() {
        mo8774k(C2399i2.m10374d(this.f8647a, mo8097v()));
    }

    /* renamed from: z */
    public boolean mo8101z() {
        C2399i2 d = C2399i2.m10374d(this.f8647a, mo8096u());
        if (!d.exists()) {
            try {
                d.mkdirs();
            } catch (Exception unused) {
            }
        }
        return mo8781r(mo8097v());
    }
}
