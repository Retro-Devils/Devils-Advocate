package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.digdroid.alman.dig.d */
class C2222d extends AbstractC2526p {

    /* renamed from: e */
    SQLiteDatabase f7974e;

    /* renamed from: f */
    SQLiteDatabase f7975f;

    public C2222d(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        this.f7975f = sQLiteDatabase;
        this.f7974e = sQLiteDatabase2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: c */
    public String mo8092c(int i, String str, long j, long j2, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f7974e;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT r.mdbid,s.parent FROM roms as r,systems as s WHERE r_id=" + j + " AND s.slug=r.system", null);
        if (!rawQuery.moveToFirst() || !rawQuery.getString(1).equals("mame")) {
            rawQuery.close();
            return null;
        }
        long j3 = rawQuery.getLong(0);
        rawQuery.close();
        SQLiteDatabase sQLiteDatabase2 = this.f7975f;
        Cursor rawQuery2 = sQLiteDatabase2.rawQuery("SELECT slug FROM slugs WHERE gameid=" + j3 + " ORDER BY gameid ASC LIMIT 1", null);
        if (!rawQuery2.moveToFirst()) {
            rawQuery2.close();
            return null;
        }
        String string = rawQuery2.getString(0);
        rawQuery2.close();
        return "https://www.arcadeathome.com/snap/" + string + ".gif";
    }
}
