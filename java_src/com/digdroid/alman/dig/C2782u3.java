package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.AbstractC2531p1;
import org.json.JSONArray;
import org.json.JSONObject;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1272k;

/* renamed from: com.digdroid.alman.dig.u3 */
public class C2782u3 extends AbstractC2307f1 {

    /* renamed from: x0 */
    private boolean f9434x0 = true;

    /* renamed from: com.digdroid.alman.dig.u3$a */
    class C2783a implements C1245p.AbstractC1247b<JSONObject> {
        C2783a() {
        }

        /* renamed from: b */
        public void mo6226a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("themes")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("themes");
                        C2782u3.this.f8794a0.mo9325c().execSQL("DELETE FROM themes");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("forum_id", Integer.valueOf(jSONObject2.getInt("id")));
                            contentValues.put("name", jSONObject2.getString("name"));
                            contentValues.put("image_url", jSONObject2.getString("image"));
                            contentValues.put("modified", Long.valueOf(jSONObject2.getLong("updated")));
                            contentValues.put("minsize", Long.valueOf(jSONObject2.getLong("minsize")));
                            contentValues.put("maxsize", Long.valueOf(jSONObject2.getLong("maxsize")));
                            C2782u3.this.f8794a0.mo9325c().insert("themes", null, contentValues);
                        }
                        C2219c3 c3Var = C2782u3.this.f8793Z;
                        c3Var.mo8157F("themes_updated", c3Var.mo8190n("new_themes_updated", 0));
                        C2782u3.this.mo9021q3();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.u3$b */
    class C2784b implements C1245p.AbstractC1246a {
        C2784b() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
        }
    }

    /* renamed from: D3 */
    private String m11742D3(long j) {
        String str;
        double d = (double) j;
        if (j >= 1000000000) {
            Double.isNaN(d);
            d /= 1.0E9d;
            str = "GB";
        } else if (j >= 1000000) {
            Double.isNaN(d);
            d /= 1000000.0d;
            str = "MB";
        } else if (j >= 1000) {
            Double.isNaN(d);
            d /= 1000.0d;
            str = "KB";
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        double round = (double) Math.round(d * 10.0d);
        Double.isNaN(round);
        sb.append(round / 10.0d);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: B3 */
    public String mo8430B3() {
        return mo2501D0(R.string.themes);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.sort_date) {
            this.f9434x0 = false;
        } else if (itemId != R.id.sort_name) {
            return super.mo8243H2(menuItem);
        } else {
            this.f9434x0 = true;
        }
        mo2552c0().invalidateOptionsMenu();
        mo9021q3();
        return true;
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: R */
    public /* bridge */ /* synthetic */ int mo8424R(Cursor cursor) {
        return super.mo8424R(cursor);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        if (bundle != null) {
            this.f9434x0 = bundle.getBoolean("themes_sort_name");
        }
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: a */
    public String mo8309a(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex("name"));
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C2464m mo8310b() {
        return super.mo8310b();
    }

    @Override // com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: d */
    public String mo8312d(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex("minsize"));
        long j2 = cursor.getLong(cursor.getColumnIndex("maxsize"));
        if (j == 0) {
            return "...";
        }
        String D3 = m11742D3(j);
        if (j2 <= j) {
            return D3;
        }
        return D3 + " - " + m11742D3(j2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: f */
    public String mo8313f(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex("image_url"));
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: h3 */
    public void mo8431h3(View view, Object obj) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: k3 */
    public Cursor mo8694k3() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT _id,name,forum_id,image_url,modified,minsize,maxsize FROM themes ORDER BY ");
        sb.append(this.f9434x0 ? "name ASC" : "modified DESC");
        Cursor rawQuery = this.f8794a0.mo9325c().rawQuery(sb.toString(), null);
        mo8434z3(rawQuery);
        return rawQuery;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: l3 */
    public String mo8695l3() {
        return "coverflow";
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.AbstractC2307f1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public /* bridge */ /* synthetic */ void mo2585m1() {
        super.mo2585m1();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: n3 */
    public void mo8425n3(View view, Object obj) {
        if (obj != null) {
            try {
                Cursor cursor = (Cursor) obj;
                AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
                aVar.mo8304z("https://digdroid.com/forums/discussion/" + cursor.getInt(cursor.getColumnIndex("forum_id")));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        super.mo8439p2(menu);
        menu.findItem(R.id.sort_name).setVisible(!this.f9434x0);
        menu.findItem(R.id.sort_date).setVisible(this.f9434x0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.AbstractC2307f1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        if (this.f8793Z.mo8190n("new_themes_updated", 0) > this.f8793Z.mo8190n("themes_updated", 0)) {
            C1272k kVar = new C1272k("https://digdroid.com/php/themes.txt", null, new C2783a(), new C2784b());
            try {
                kVar.mo6189L(false);
                C2490m2.m10682a(mo2575j0()).mo6218a(kVar);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.themes_menu;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putBoolean("themes_sort_name", this.f9434x0);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "themes";
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: z3 */
    public void mo8434z3(Cursor cursor) {
        ActivityC0447d c0;
        if (cursor.moveToFirst() && (c0 = mo2552c0()) != null && !c0.isFinishing()) {
            this.f8170v0 = new boolean[cursor.getCount()];
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.f8170v0[i] = !cursor.getString(cursor.getColumnIndex("image_url")).equals("");
                if (cursor.moveToNext()) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
