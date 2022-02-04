package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import com.digdroid.alman.dig.AbstractC2531p1;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.k1 */
public class C2452k1 extends AbstractC2303f0 {
    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: A3 */
    public File mo8429A3() {
        File externalFilesDir = mo2552c0().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return new File(externalFilesDir.getAbsolutePath() + "/Icons/Genres");
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: B3 */
    public String mo8430B3() {
        return mo2501D0(R.string.genres);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: D3 */
    public void mo8417D3(String str) {
        SQLiteDatabase sQLiteDatabase = this.f8157x0;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM genres WHERE name LIKE " + DatabaseUtils.sqlEscapeString(str), null);
        if (!rawQuery.moveToFirst()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            this.f8157x0.insert("genres", null, contentValues);
            this.f8806m0.mo8260K(this.f8958p0.mo8321f());
        }
        rawQuery.close();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: E3 */
    public void mo8418E3(long j) {
        SQLiteDatabase sQLiteDatabase = this.f8157x0;
        sQLiteDatabase.execSQL("DELETE FROM gamegenres WHERE genre=" + j);
        SQLiteDatabase sQLiteDatabase2 = this.f8157x0;
        sQLiteDatabase2.execSQL("DELETE FROM genres WHERE _id=" + j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: F3 */
    public int mo8419F3() {
        return R.string.enter_genre;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: G3 */
    public int mo8420G3() {
        return R.string.inform_merge;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: H3 */
    public boolean mo8421H3() {
        return this.f8793Z.mo8180c("show_all_genres", true);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: I3 */
    public void mo8422I3(long j, String str) {
        StringBuilder sb;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.f8157x0;
        Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT _id FROM genres WHERE name LIKE " + DatabaseUtils.sqlEscapeString(str), null);
        if (rawQuery.moveToFirst()) {
            long j2 = rawQuery.getLong(0);
            if (j2 != j) {
                SQLiteDatabase sQLiteDatabase3 = this.f8157x0;
                sQLiteDatabase3.execSQL("UPDATE gamegenres SET genre=" + j2 + " WHERE genre=" + j);
                SQLiteDatabase sQLiteDatabase4 = this.f8157x0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DELETE FROM genres WHERE _id=");
                sb2.append(j);
                sQLiteDatabase4.execSQL(sb2.toString());
                rawQuery.close();
            }
            sQLiteDatabase = this.f8157x0;
            sb = new StringBuilder();
        } else {
            sQLiteDatabase = this.f8157x0;
            sb = new StringBuilder();
        }
        sb.append("UPDATE genres SET name=");
        sb.append(DatabaseUtils.sqlEscapeString(str));
        sb.append(" WHERE _id=");
        sb.append(j);
        sQLiteDatabase.execSQL(sb.toString());
        rawQuery.close();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: J3 */
    public void mo8423J3(Cursor cursor) {
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8266U(cursor.getLong(0), cursor.getString(1));
        }
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: a */
    public String mo8309a(Cursor cursor) {
        return cursor.getString(1);
    }

    @Override // com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: d */
    public String mo8312d(Cursor cursor) {
        return "" + cursor.getInt(2) + " " + mo2501D0(R.string.games).toLowerCase();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: k3 */
    public Cursor mo8694k3() {
        String str;
        StringBuilder sb;
        if (this.f8793Z.mo8180c("merged_games", true)) {
            sb = new StringBuilder();
            sb.append("SELECT _id,name,");
            str = "(SELECT COUNT(*) FROM gamegenres as g,roms as r WHERE g.genre=genres._id AND r._id=g.game AND r.ignored=0 AND r.present=1 AND (r.merged_with=-1 OR r.merged_with=r._id)) AS count";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT _id,name,");
            str = "(SELECT COUNT(*) FROM gamegenres as g,roms as r WHERE g.genre=genres._id AND r._id=g.game AND r.ignored=0 AND r.present=1) AS count";
        }
        sb.append(str);
        String str2 = sb.toString() + " FROM genres";
        if (!this.f8158y0) {
            str2 = str2 + " WHERE count>0";
        }
        Cursor rawQuery = this.f8157x0.rawQuery(str2 + " ORDER BY name", null);
        mo8434z3(rawQuery);
        return rawQuery;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: l3 */
    public String mo8695l3() {
        return "title";
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        super.mo8439p2(menu);
        menu.findItem(R.id.hide_genres).setChecked(!this.f8158y0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.genres;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "genres";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: y3 */
    public int mo8433y3() {
        return R.menu.edit_genre;
    }
}
