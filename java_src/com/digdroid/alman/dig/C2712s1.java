package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2223d0;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.digdroid.alman.dig.s1 */
public class C2712s1 extends AbstractC2307f1 {

    /* renamed from: x0 */
    private boolean f9236x0;

    /* renamed from: com.digdroid.alman.dig.s1$a */
    class C2713a implements C2223d0.AbstractC2249s {
        C2713a() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2712s1.this.mo8407O2();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
            C2712s1.this.mo8407O2();
        }
    }

    /* renamed from: com.digdroid.alman.dig.s1$b */
    class RunnableC2714b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f9238b;

        /* renamed from: c */
        final /* synthetic */ String f9239c;

        /* renamed from: d */
        final /* synthetic */ long f9240d;

        /* renamed from: e */
        final /* synthetic */ int f9241e;

        RunnableC2714b(int i, String str, long j, int i2) {
            this.f9238b = i;
            this.f9239c = str;
            this.f9240d = j;
            this.f9241e = i2;
        }

        public void run() {
            C2712s1.this.mo9189H3(this.f9238b, this.f9239c, this.f9240d, this.f9241e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s1$c */
    public class C2715c implements C2223d0.AbstractC2249s {
        C2715c() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2712s1.this.f8814m0.mo8271d0();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s1$d */
    public class C2716d implements C2223d0.AbstractC2249s {

        /* renamed from: a */
        final /* synthetic */ Cursor f9244a;

        C2716d(Cursor cursor) {
            this.f9244a = cursor;
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2712s1 s1Var = C2712s1.this;
            Cursor cursor = this.f9244a;
            s1Var.m11516F3(cursor, cursor.moveToFirst() ? this.f9244a.getCount() : 0);
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
            C2712s1 s1Var = C2712s1.this;
            Cursor cursor = this.f9244a;
            s1Var.m11516F3(cursor, cursor.moveToFirst() ? this.f9244a.getCount() : 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s1$e */
    public class DialogInterface$OnClickListenerC2717e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ boolean[] f9246b;

        /* renamed from: c */
        final /* synthetic */ long[] f9247c;

        /* renamed from: d */
        final /* synthetic */ int f9248d;

        /* renamed from: e */
        final /* synthetic */ int[] f9249e;

        DialogInterface$OnClickListenerC2717e(boolean[] zArr, long[] jArr, int i, int[] iArr) {
            this.f9246b = zArr;
            this.f9247c = jArr;
            this.f9248d = i;
            this.f9249e = iArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase c = C2712s1.this.f8802a0.mo9325c();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < 7; i3++) {
                if (this.f9246b[i3]) {
                    i2++;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("enabled", Integer.valueOf(this.f9246b[i3] ? 1 : 0));
                c.update("main", contentValues, "_id=" + this.f9247c[i3], null);
            }
            c.execSQL("DELETE FROM main WHERE type>=7");
            for (int i4 = 7; i4 < this.f9248d + 7; i4++) {
                if (this.f9246b[i4]) {
                    i2++;
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("type", (Integer) 100);
                    contentValues2.put("position", Integer.valueOf(i4 + 100));
                    contentValues2.put("itemid", Long.valueOf(this.f9247c[i4]));
                    contentValues2.put("enabled", (Integer) 1);
                    contentValues2.put("itemaux", Integer.valueOf(this.f9249e[i4]));
                    c.insert("main", null, contentValues2);
                }
            }
            C2219c3 c3Var = C2712s1.this.f8801Z;
            if (i2 == 1) {
                z = true;
            }
            c3Var.mo8167P(z);
            C2712s1.this.mo9021q3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s1$f */
    public class DialogInterface$OnMultiChoiceClickListenerC2718f implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f9251a;

        DialogInterface$OnMultiChoiceClickListenerC2718f(boolean[] zArr) {
            this.f9251a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f9251a[i] = z;
        }
    }

    /* renamed from: E3 */
    private void m11515E3() {
        C2223d0.m9876p().mo8216s(mo2552c0(), 16, new C2716d(this.f8802a0.mo9325c().rawQuery("SELECT _id,name,isfolder FROM collections ORDER BY name", null)), true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: F3 */
    private void m11516F3(Cursor cursor, int i) {
        int i2;
        Cursor rawQuery = this.f8802a0.mo9325c().rawQuery("SELECT _id," + mo9190I3(false) + ",enabled,itemid FROM main ORDER BY type,name", null);
        if (!rawQuery.moveToFirst()) {
            cursor.close();
            rawQuery.close();
            return;
        }
        int count = rawQuery.getCount();
        int i3 = i + 7;
        long[] jArr = new long[i3];
        CharSequence[] charSequenceArr = new CharSequence[i3];
        boolean[] zArr = new boolean[i3];
        int[] iArr = new int[i3];
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= 7) {
                break;
            }
            jArr[i4] = rawQuery.getLong(0);
            charSequenceArr[i4] = rawQuery.getString(1);
            if (rawQuery.getInt(2) != 1) {
                z = false;
            }
            zArr[i4] = z;
            rawQuery.moveToNext();
            i4++;
        }
        HashMap hashMap = new HashMap();
        for (i2 = 7; i2 < count; i2++) {
            hashMap.put(Long.valueOf(rawQuery.getLong(3)), Boolean.valueOf(rawQuery.getInt(2) == 1));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        for (int i5 = 0; i5 < i; i5++) {
            long j = cursor.getLong(0);
            int i6 = i5 + 7;
            jArr[i6] = j;
            charSequenceArr[i6] = cursor.getString(1);
            zArr[i6] = hashMap.containsKey(Long.valueOf(j)) ? ((Boolean) hashMap.get(Long.valueOf(j))).booleanValue() : false;
            iArr[i6] = cursor.getInt(2);
            cursor.moveToNext();
        }
        cursor.close();
        new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c()).mo231k(charSequenceArr, zArr, new DialogInterface$OnMultiChoiceClickListenerC2718f(zArr)).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2717e(zArr, jArr, i, iArr)).mo221a().show();
    }

    /* renamed from: G3 */
    static String m11517G3(int i) {
        switch (i) {
            case 1:
                return "systems";
            case 2:
                return "genres";
            case 3:
                return "collections";
            case 4:
                return "favorites";
            case 5:
                return "played";
            case 6:
                return "allgames";
            case 7:
                return "options";
            default:
                return "null";
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: A3 */
    public File mo8429A3() {
        if (!this.f8808g0.f9424t.equals("")) {
            return new File(this.f8808g0.f9424t);
        }
        File externalFilesDir = mo2552c0().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return new File(externalFilesDir.getAbsolutePath() + "/Icons/Home");
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.configure) {
            return super.mo8243H2(menuItem);
        }
        m11515E3();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H3 */
    public void mo9189H3(int i, String str, long j, int i2) {
        if (i != 100) {
            switch (i) {
                case 0:
                    this.f8814m0.mo8288p();
                    return;
                case 1:
                    this.f8814m0.mo8274h0();
                    return;
                case 2:
                    C2223d0.m9876p().mo8215r(mo2552c0(), 16, new C2715c());
                    return;
                case 3:
                    this.f8814m0.mo8297u();
                    return;
                case 4:
                    this.f8814m0.mo8270b0();
                    return;
                case 5:
                    this.f8814m0.mo8261L();
                    return;
                case 6:
                    if (!this.f8801Z.mo8196t()) {
                        this.f8814m0.mo8258F();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (i2 == 1) {
            this.f8814m0.mo8272e0(j, str);
        } else {
            this.f8814m0.mo8262M(j, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I3 */
    public String mo9190I3(boolean z) {
        StringBuilder sb;
        String str;
        ActivityC0447d c0 = mo2552c0();
        if (c0 == null || c0.isFinishing()) {
            return "-";
        }
        String str2 = (((((("CASE type" + " WHEN 0 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.systems))) + " WHEN 1 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.genres))) + " WHEN 2 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.collections))) + " WHEN 3 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.favorites))) + " WHEN 4 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.played))) + " WHEN 5 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.all_games))) + " WHEN 6 THEN " + DatabaseUtils.sqlEscapeString(c0.getString(R.string.options));
        if (z) {
            sb = new StringBuilder();
            sb.append(str2);
            str = " WHEN 100 THEN '-'";
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = " WHEN 100 THEN (SELECT c.name FROM collections as c WHERE c._id=itemid)";
        }
        sb.append(str);
        return sb.toString() + " END AS name";
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: R */
    public int mo8424R(Cursor cursor) {
        return cursor.getInt(2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: R2 */
    public void mo8113R2() {
        AbstractC2531p1.AbstractC2532a aVar = this.f8814m0;
        if (aVar != null) {
            aVar.mo8302w(false);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        this.f9236x0 = bundle == null ? true : bundle.getBoolean("home_isfirst");
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: a */
    public String mo8309a(Cursor cursor) {
        return cursor.isNull(3) ? "-" : cursor.getString(3);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a1 = super.mo2547a1(layoutInflater, viewGroup, bundle);
        this.f8801Z.f7963j = mo8409w2();
        if (mo8375Q().equals("title")) {
            this.f8966p0.mo8333r(mo8409w2());
        }
        return a1;
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: b */
    public C2464m mo8310b() {
        if (mo8375Q().equals("title")) {
            C2774t3 t3Var = this.f8808g0;
            return new C2464m(false, t3Var.f9412h, t3Var.f9413i, 2000);
        }
        C2774t3 t3Var2 = this.f8808g0;
        return new C2464m(true, t3Var2.f9412h, t3Var2.f9413i, 6);
    }

    @Override // com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: d */
    public String mo8312d(Cursor cursor) {
        if (cursor.getInt(2) < 0) {
            return "";
        }
        String str = "" + cursor.getInt(2) + " ";
        int i = cursor.getInt(1);
        int i2 = R.string.games;
        if (i == 3 || i == 4 || i == 5) {
            return str + mo2501D0(R.string.games).toLowerCase();
        } else if (i != 100) {
            return str + mo8309a(cursor).toLowerCase();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(cursor.getInt(2));
            sb.append(" ");
            if (cursor.getInt(5) == 1) {
                i2 = R.string.collections;
            }
            sb.append(mo2501D0(i2).toLowerCase());
            return sb.toString();
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: f */
    public String mo8313f(Cursor cursor) {
        StringBuilder sb;
        if (cursor.getInt(1) != 100) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(m11517G3((int) cursor.getLong(0)));
        } else {
            sb = new StringBuilder();
            sb.append("c");
            sb.append(cursor.getLong(4));
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: k3 */
    public Cursor mo8694k3() {
        StringBuilder sb;
        String str;
        if (this.f9236x0) {
            String str2 = ("SELECT _id,type,-1," + mo9190I3(true)) + ",itemid,itemaux FROM main WHERE enabled=1 ORDER BY position,name";
            this.f9236x0 = false;
            try {
                Cursor rawQuery = this.f8802a0.mo9325c().rawQuery(str2, null);
                if (rawQuery.moveToFirst() && rawQuery.getCount() == 1) {
                    this.f8801Z.mo8167P(true);
                    int i = rawQuery.getInt(1);
                    String string = rawQuery.getString(3);
                    long j = rawQuery.getLong(4);
                    int i2 = rawQuery.getInt(5);
                    if (i == 100) {
                        Cursor rawQuery2 = this.f8802a0.mo9325c().rawQuery("SELECT name FROM collections WHERE _id=" + j, null);
                        if (rawQuery2.moveToFirst()) {
                            string = rawQuery2.getString(0);
                        }
                        rawQuery2.close();
                    }
                    mo2552c0().runOnUiThread(new RunnableC2714b(i, string, j, i2));
                }
                mo8434z3(rawQuery);
                return rawQuery;
            } catch (Exception unused) {
                return null;
            }
        } else {
            String str3 = "SELECT _id,type,CASE type " + "WHEN 0 THEN (SELECT COUNT(*) FROM systems";
            if (!this.f8801Z.mo8192p()) {
                str3 = str3 + " WHERE numgames>0";
            }
            String str4 = ((((str3 + ") WHEN 1 THEN (SELECT COUNT(*) FROM genres)") + " WHEN 2 THEN (SELECT COUNT(*) FROM collections WHERE parent=-1)") + " WHEN 3 THEN (SELECT COUNT(*) FROM roms WHERE favorite=1 AND ignored=0 AND present=1" + this.f8804c0.mo8849n() + ")") + " WHEN 4 THEN (SELECT COUNT(*) FROM roms WHERE last_played>0 AND ignored=0 AND present=1" + this.f8804c0.mo8849n() + ")") + " WHEN 5 THEN (SELECT COUNT(*) FROM roms WHERE ignored=0 AND present=1" + this.f8804c0.mo8849n() + ")";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(" WHEN 6 THEN ");
            sb2.append((this.f8801Z.mo8197u() ? 30 : 31) + (!C2223d0.m9876p().mo8217v()));
            String str5 = sb2.toString() + " WHEN 100 THEN (CASE itemaux WHEN 1 THEN (SELECT COUNT(*) FROM collections as c WHERE c.parent=itemid) ELSE ";
            if (this.f8801Z.mo8180c("merged_games", true)) {
                sb = new StringBuilder();
                sb.append(str5);
                str = "(SELECT COUNT(*) FROM gamecollection as g,roms as r WHERE g.collection=itemid AND r._id=g.game AND r.ignored=0 AND r.present=1 AND (r.merged_with=-1 OR r.merged_with=r._id))";
            } else {
                sb = new StringBuilder();
                sb.append(str5);
                str = "(SELECT COUNT(*) FROM gamecollection as g,roms as r WHERE g.collection=itemid AND r._id=g.game AND r.ignored=0 AND r.present=1)";
            }
            sb.append(str);
            try {
                Cursor rawQuery3 = this.f8802a0.mo9325c().rawQuery(((sb.toString() + " END)") + " END as count," + mo9190I3(false)) + ",itemid,itemaux FROM main WHERE enabled=1 ORDER BY position,name", null);
                mo8434z3(rawQuery3);
                return rawQuery3;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: l3 */
    public String mo8695l3() {
        return "title";
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.AbstractC2307f1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public /* bridge */ /* synthetic */ void mo2585m1() {
        super.mo2585m1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: n3 */
    public void mo8425n3(View view, Object obj) {
        if (obj != null && this.f8814m0 != null) {
            Cursor cursor = (Cursor) obj;
            mo9189H3(cursor.getInt(1), cursor.getString(3), cursor.getLong(4), cursor.getInt(5));
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.AbstractC2307f1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        C2223d0.m9876p().mo8216s(mo2552c0(), 16, new C2713a(), true);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.main;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putBoolean("home_isfirst", this.f9236x0);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "home";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: y3 */
    public int mo8433y3() {
        return R.menu.edit_home;
    }
}
