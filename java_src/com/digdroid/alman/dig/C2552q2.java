package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: com.digdroid.alman.dig.q2 */
public class C2552q2 extends AbstractC2531p1 {

    /* renamed from: n0 */
    long f8888n0;

    /* renamed from: o0 */
    EditText f8889o0;

    /* renamed from: p0 */
    boolean f8890p0;

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: B2 */
    public /* bridge */ /* synthetic */ boolean mo8102B2() {
        return super.mo8102B2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: C2 */
    public /* bridge */ /* synthetic */ boolean mo8103C2() {
        return super.mo8103C2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: E2 */
    public /* bridge */ /* synthetic */ void mo8104E2(boolean z) {
        super.mo8104E2(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: F2 */
    public /* bridge */ /* synthetic */ void mo8105F2() {
        super.mo8105F2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: G2 */
    public /* bridge */ /* synthetic */ void mo8106G2(boolean z) {
        super.mo8106G2(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: I2 */
    public /* bridge */ /* synthetic */ void mo8107I2(String str) {
        super.mo8107I2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: J2 */
    public /* bridge */ /* synthetic */ void mo8108J2(String str) {
        super.mo8108J2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: K2 */
    public /* bridge */ /* synthetic */ void mo8109K2() {
        super.mo8109K2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: N2 */
    public /* bridge */ /* synthetic */ boolean mo8110N2() {
        return super.mo8110N2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public void mo8407O2() {
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: P2 */
    public /* bridge */ /* synthetic */ void mo8111P2() {
        super.mo8111P2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Q2 */
    public /* bridge */ /* synthetic */ void mo8112Q2() {
        super.mo8112Q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: R2 */
    public /* bridge */ /* synthetic */ void mo8113R2() {
        super.mo8113R2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: S2 */
    public /* bridge */ /* synthetic */ void mo8114S2() {
        super.mo8114S2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public /* bridge */ /* synthetic */ void mo2531T0(Context context) {
        super.mo2531T0(context);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: T2 */
    public /* bridge */ /* synthetic */ void mo8115T2(C2369h0 h0Var) {
        super.mo8115T2(h0Var);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: U2 */
    public /* bridge */ /* synthetic */ void mo8116U2() {
        super.mo8116U2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        this.f8890p0 = bundle == null ? false : bundle.getBoolean("editing");
        mo2557d2(true);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: W2 */
    public /* bridge */ /* synthetic */ void mo8117W2() {
        super.mo8117W2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: X2 */
    public /* bridge */ /* synthetic */ void mo8118X2(String str) {
        super.mo8118X2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Y2 */
    public /* bridge */ /* synthetic */ void mo8119Y2(String str) {
        super.mo8119Y2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public void mo2545Z0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.notes_menu, menu);
        menu.findItem(R.id.edit_notes).setTitle(this.f8890p0 ? R.string.done : R.string.edit);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_notes, viewGroup, false);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: a3 */
    public /* bridge */ /* synthetic */ void mo8120a3(boolean z) {
        super.mo8120a3(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: c3 */
    public /* bridge */ /* synthetic */ void mo8121c3() {
        super.mo8121c3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: d3 */
    public /* bridge */ /* synthetic */ boolean mo8122d3() {
        return super.mo8122d3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: e3 */
    public /* bridge */ /* synthetic */ void mo8123e3() {
        super.mo8123e3();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g3 */
    public void mo8972g3() {
        String trim = this.f8889o0.getText().toString().trim();
        ContentValues contentValues = new ContentValues();
        contentValues.put("notes", trim);
        SQLiteDatabase c = this.f8794a0.mo9325c();
        c.update("roms", contentValues, "_id=" + this.f8888n0, null);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public boolean mo2579k1(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.edit_notes) {
            return super.mo2579k1(menuItem);
        }
        boolean z = !this.f8890p0;
        this.f8890p0 = z;
        this.f8889o0.setEnabled(z);
        this.f8889o0.setTextColor(this.f8890p0 ? -1 : this.f8800g0.f9401e);
        this.f8889o0.setBackgroundColor(this.f8890p0 ? C2553q3.m11127m() : 0);
        mo2552c0().invalidateOptionsMenu();
        return true;
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        mo8972g3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: q2 */
    public /* bridge */ /* synthetic */ void mo8125q2() {
        super.mo8125q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        this.f8888n0 = mo2568h0().getLong("gameid");
        SQLiteDatabase c = this.f8794a0.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT title,notes FROM roms WHERE _id=" + this.f8888n0, null);
        if (rawQuery.moveToFirst()) {
            mo8118X2(rawQuery.getString(0));
            String string = rawQuery.getString(1);
            if (string == null) {
                string = "";
            }
            EditText editText = (EditText) mo2505F0().findViewById(R.id.notes);
            this.f8889o0 = editText;
            editText.setText(string);
            this.f8889o0.setBackgroundColor(0);
            this.f8889o0.setTextColor(this.f8800g0.f9401e);
            this.f8889o0.setEnabled(false);
        }
        rawQuery.close();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putBoolean("editing", this.f8890p0);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ String mo8126s2() {
        return super.mo8126s2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public /* bridge */ /* synthetic */ void mo2605t1() {
        super.mo2605t1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "notes";
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: u2 */
    public /* bridge */ /* synthetic */ long mo8128u2() {
        return super.mo8128u2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: v2 */
    public /* bridge */ /* synthetic */ C2774t3 mo8129v2() {
        return super.mo8129v2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: x2 */
    public /* bridge */ /* synthetic */ boolean mo8130x2() {
        return super.mo8130x2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: y2 */
    public /* bridge */ /* synthetic */ boolean mo8131y2(int i, int i2) {
        return super.mo8131y2(i, i2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
    }
}
