package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.w */
public class C2825w extends AbstractC2526p {
    C2825w() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: b */
    public String mo8091b(long j) {
        return "";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: c */
    public String mo8092c(int i, String str, long j, long j2, String str2) {
        C2219c3 k = C2219c3.m9805k(null);
        String q = k.mo8193q("token", "0");
        String q2 = k.mo8193q("userid", "0");
        SQLiteDatabase c = C2775u.m11726e(null).mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT r.mdbid FROM roms as r,systems as s WHERE r._id=" + j + " AND s.slug=r.system", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        long j3 = rawQuery.getLong(0);
        rawQuery.close();
        if (j3 < 0) {
            return null;
        }
        if (i == 4096) {
            return "https://digdroid.com/php/getscreenshot.php?game=" + j3 + "&system=" + str + "&user=" + q2 + "&token=" + q;
        }
        String q3 = k.mo8193q("image_quality", "low");
        String str3 = q3.equals("high") ? "hi" : q3.equals("medium") ? "med" : "lo";
        return "https://digdroid.com/php/getcover3.php?game=" + j3 + "&system=" + str + "&qual=" + str3 + "&user=" + q2 + "&token=" + q;
    }
}
