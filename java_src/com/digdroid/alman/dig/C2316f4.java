package com.digdroid.alman.dig;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.MenuItem;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.digdroid.alman.dig.f4 */
public class C2316f4 extends C2254d4 {

    /* renamed from: p0 */
    long f8193p0;

    /* renamed from: com.digdroid.alman.dig.f4$a */
    class DialogInterface$OnClickListenerC2317a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2317a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Matcher matcher = Pattern.compile("v=([-_0-9a-zA-Z]+)$").matcher(C2316f4.this.f8053o0);
            if (matcher.find()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("youtube", matcher.group(1));
                SQLiteDatabase c = C2316f4.this.f8802a0.mo9325c();
                c.update("roms", contentValues, "_id=" + C2316f4.this.f8193p0, null);
                C2316f4.this.f8814m0.mo8264R();
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2254d4
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.save_video) {
            return super.mo8243H2(menuItem);
        }
        new AlertDialog.Builder(mo2552c0(), C2553q3.m11117c()).setMessage(R.string.confirm).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface$OnClickListenerC2317a()).create().show();
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: g3 */
    public boolean mo8244g3() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: h3 */
    public String mo8245h3() {
        String str;
        this.f8193p0 = mo2568h0().getLong("game_id");
        SQLiteDatabase c = this.f8802a0.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT title,system FROM roms WHERE _id=" + this.f8193p0, null);
        if (rawQuery.moveToFirst()) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("https://www.youtube.com/results?search_query=");
                sb.append(URLEncoder.encode(rawQuery.getString(0) + " " + this.f8803b0.mo8568s(rawQuery.getString(1)), "utf-8"));
                str = sb.toString();
            } catch (Exception unused) {
            }
            rawQuery.close();
            return str;
        }
        str = "";
        rawQuery.close();
        return str;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: i3 */
    public void mo8246i3(String str) {
        super.mo8246i3(str);
        mo2552c0().invalidateOptionsMenu();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        super.mo8439p2(menu);
        menu.findItem(R.id.save_video).setVisible(Pattern.compile("v=[-_0-9a-zA-Z]+$").matcher(this.f8053o0).find());
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2254d4
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.youtube;
    }
}
