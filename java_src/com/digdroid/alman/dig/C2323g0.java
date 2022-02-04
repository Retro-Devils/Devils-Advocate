package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.net.URLEncoder;

/* renamed from: com.digdroid.alman.dig.g0 */
class C2323g0 extends AbstractC2526p {
    C2323g0() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: b */
    public String mo8091b(long j) {
        String str = null;
        SQLiteDatabase c = C2775u.m11726e(null).mo9325c();
        SQLiteDatabase a = C2886z1.m11967b(null).mo9515a();
        Cursor rawQuery = c.rawQuery("SELECT mdbid FROM roms WHERE _id=" + j + " AND mdbid>=0", null);
        if (rawQuery.moveToFirst()) {
            Cursor rawQuery2 = a.rawQuery("SELECT title FROM titles WHERE rowid=" + rawQuery.getLong(0), null);
            if (rawQuery2.moveToFirst()) {
                try {
                    str = "https://gamefaqs.gamespot.com/search?game=" + URLEncoder.encode(rawQuery2.getString(0), "UTF-8");
                } catch (Exception unused) {
                }
            }
            rawQuery2.close();
        }
        rawQuery.close();
        return str;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: c */
    public String mo8092c(int i, String str, long j, long j2, String str2) {
        if (str2 == null || str2.equals("")) {
            return null;
        }
        return "http://img.gamefaqs.net/box/" + str2 + "_front.jpg";
    }
}
