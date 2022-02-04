package com.digdroid.alman.dig;

import android.database.Cursor;

/* renamed from: com.digdroid.alman.dig.p3 */
class C2548p3 extends AbstractC2526p {
    C2548p3() {
    }

    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: b */
    public String mo8091b(long j) {
        String str = null;
        Cursor rawQuery = C2775u.m11726e(null).mo9325c().rawQuery("SELECT gdbid FROM roms WHERE _id=" + j + " AND gdbid>=0", null);
        if (rawQuery.moveToFirst()) {
            str = "https://thegamesdb.net/game.php?id=" + rawQuery.getLong(0);
        }
        rawQuery.close();
        return str;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: c */
    public String mo8092c(int i, String str, long j, long j2, String str2) {
        StringBuilder sb;
        String str3;
        if (j2 < 0 || str.equals("mame")) {
            return null;
        }
        if (!C2219c3.m9805k(null).mo8193q("image_quality", "low").equals("low")) {
            sb = new StringBuilder();
            str3 = "https://cdn.thegamesdb.net/images/original/boxart/front/";
        } else {
            sb = new StringBuilder();
            str3 = "https://cdn.thegamesdb.net/images/thumb/boxart/front/";
        }
        sb.append(str3);
        sb.append(j2);
        sb.append("-1.");
        sb.append(mo8882d(i));
        return sb.toString();
    }
}
