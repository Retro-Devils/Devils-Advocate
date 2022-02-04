package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.DialogInterfaceC0068b;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.k */
public class C2448k extends AbstractC2303f0 {

    /* renamed from: A0 */
    long f8543A0;

    /* renamed from: B0 */
    String f8544B0;

    /* renamed from: com.digdroid.alman.dig.k$a */
    class DialogInterface$OnClickListenerC2449a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8545b;

        DialogInterface$OnClickListenerC2449a(String str) {
            this.f8545b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2448k.this.mo8693K3(this.f8545b, false);
        }
    }

    /* renamed from: com.digdroid.alman.dig.k$b */
    class DialogInterface$OnClickListenerC2450b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8547b;

        DialogInterface$OnClickListenerC2450b(String str) {
            this.f8547b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2448k.this.mo8693K3(this.f8547b, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: A3 */
    public File mo8429A3() {
        File externalFilesDir = mo2552c0().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return new File(externalFilesDir.getAbsolutePath() + "/Icons/Collections");
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: B3 */
    public String mo8430B3() {
        return this.f8544B0;
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: C3 */
    public boolean mo8416C3(MenuItem menuItem, long j, String str, String str2) {
        return super.mo8416C3(menuItem, j, str, str2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: D3 */
    public void mo8417D3(String str) {
        new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c()).mo228h(R.string.collection_type).mo235o(R.string.collections, new DialogInterface$OnClickListenerC2450b(str)).mo232l(R.string.games, new DialogInterface$OnClickListenerC2449a(str)).mo233m(R.string.cancel, null).mo224d(false).mo221a().show();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: E3 */
    public void mo8418E3(long j) {
        SQLiteDatabase sQLiteDatabase = this.f8157x0;
        sQLiteDatabase.execSQL("DELETE FROM gamecollection WHERE collection=" + j);
        SQLiteDatabase sQLiteDatabase2 = this.f8157x0;
        sQLiteDatabase2.execSQL("DELETE FROM collections WHERE _id=" + j);
        SQLiteDatabase sQLiteDatabase3 = this.f8157x0;
        sQLiteDatabase3.execSQL("UPDATE collections SET parent=" + this.f8543A0 + " WHERE parent=" + j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: F3 */
    public int mo8419F3() {
        return R.string.enter_collection;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: G3 */
    public int mo8420G3() {
        return R.string.inform_merge_collections;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: H3 */
    public boolean mo8421H3() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: I3 */
    public void mo8422I3(long j, String str) {
        StringBuilder sb;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.f8157x0;
        Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT isfolder FROM collections WHERE _id=" + j, null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return;
        }
        int i = rawQuery.getInt(0);
        rawQuery.close();
        SQLiteDatabase sQLiteDatabase3 = this.f8157x0;
        Cursor rawQuery2 = sQLiteDatabase3.rawQuery("SELECT _id FROM collections WHERE parent=" + this.f8543A0 + " AND isfolder=" + i + " AND name LIKE " + DatabaseUtils.sqlEscapeString(str), null);
        if (rawQuery2.moveToFirst()) {
            long j2 = rawQuery2.getLong(0);
            if (j2 != j) {
                SQLiteDatabase sQLiteDatabase4 = this.f8157x0;
                sQLiteDatabase4.execSQL("UPDATE gamecollection SET collection=" + j2 + " WHERE collection=" + j);
                SQLiteDatabase sQLiteDatabase5 = this.f8157x0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DELETE FROM collections WHERE _id=");
                sb2.append(j);
                sQLiteDatabase5.execSQL(sb2.toString());
                SQLiteDatabase sQLiteDatabase6 = this.f8157x0;
                sQLiteDatabase6.execSQL("UPDATE collections SET parent=" + j2 + " WHERE parent=" + j);
                rawQuery2.close();
            }
            sQLiteDatabase = this.f8157x0;
            sb = new StringBuilder();
        } else {
            sQLiteDatabase = this.f8157x0;
            sb = new StringBuilder();
        }
        sb.append("UPDATE collections SET name=");
        sb.append(DatabaseUtils.sqlEscapeString(str));
        sb.append(" WHERE _id=");
        sb.append(j);
        sQLiteDatabase.execSQL(sb.toString());
        rawQuery2.close();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2303f0
    /* renamed from: J3 */
    public void mo8423J3(Cursor cursor) {
        if (cursor.getInt(3) == 1) {
            this.f8806m0.mo8272e0(cursor.getLong(0), cursor.getString(1));
        } else {
            this.f8806m0.mo8262M(cursor.getLong(0), cursor.getString(1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K3 */
    public void mo8693K3(String str, boolean z) {
        SQLiteDatabase sQLiteDatabase = this.f8157x0;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM collections WHERE parent=" + this.f8543A0 + " AND name LIKE " + DatabaseUtils.sqlEscapeString(str), null);
        if (!rawQuery.moveToFirst()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("parent", Long.valueOf(this.f8543A0));
            contentValues.put("isfolder", Integer.valueOf(z ? 1 : 0));
            this.f8157x0.insert("collections", null, contentValues);
            this.f8806m0.mo8260K(this.f8958p0.mo8321f());
        }
        rawQuery.close();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        Bundle h0 = mo2568h0();
        this.f8543A0 = h0.getLong("id");
        this.f8544B0 = h0.getString("title");
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: a */
    public String mo8309a(Cursor cursor) {
        return cursor.getString(1);
    }

    @Override // com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: d */
    public String mo8312d(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(cursor.getInt(2));
        sb.append(" ");
        sb.append(mo2501D0(cursor.getInt(3) == 1 ? R.string.collections : R.string.games).toLowerCase());
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: k3 */
    public Cursor mo8694k3() {
        String str;
        StringBuilder sb;
        if (this.f8793Z.mo8180c("merged_games", true)) {
            sb = new StringBuilder();
            sb.append("SELECT _id,name,CASE isfolder WHEN 1 THEN (SELECT COUNT(*) FROM collections as c WHERE c.parent=collections._id) ELSE ");
            str = "(SELECT COUNT(*) FROM gamecollection as g,roms as r WHERE g.collection=collections._id AND r._id=g.game AND r.ignored=0 AND r.present=1 AND (r.merged_with=-1 OR r.merged_with=r._id))";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT _id,name,CASE isfolder WHEN 1 THEN (SELECT COUNT(*) FROM collections as c WHERE c.parent=collections._id) ELSE ");
            str = "(SELECT COUNT(*) FROM gamecollection as g,roms as r WHERE g.collection=collections._id AND r._id=g.game AND r.ignored=0 AND r.present=1)";
        }
        sb.append(str);
        String sb2 = sb.toString();
        Cursor rawQuery = this.f8157x0.rawQuery(sb2 + " END count,isfolder FROM collections WHERE parent=" + this.f8543A0 + " ORDER BY name", null);
        mo8434z3(rawQuery);
        return rawQuery;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: l3 */
    public String mo8695l3() {
        return "title";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.collections;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "collections";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: y3 */
    public int mo8433y3() {
        return R.menu.edit_collection;
    }
}
