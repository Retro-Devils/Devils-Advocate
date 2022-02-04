package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.digdroid.alman.dig.C2254d4;
import org.json.JSONObject;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1272k;

/* renamed from: com.digdroid.alman.dig.f3 */
public class C2313f3 extends C2254d4 {

    /* renamed from: p0 */
    String f8181p0;

    /* renamed from: com.digdroid.alman.dig.f3$a */
    class C2314a implements C1245p.AbstractC1247b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C2254d4.AbstractC2258b f8182a;

        C2314a(C2254d4.AbstractC2258b bVar) {
            this.f8182a = bVar;
        }

        /* renamed from: b */
        public void mo6226a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.has("status")) {
                try {
                    if (jSONObject.getString("status").equals("ok")) {
                        SQLiteDatabase c = C2313f3.this.f8794a0.mo9325c();
                        c.execSQL("UPDATE systems SET forumcreated=1 WHERE slug='" + C2313f3.this.f8181p0 + "'");
                        this.f8182a.mo8249a();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.f3$b */
    class C2315b implements C1245p.AbstractC1246a {
        C2315b() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: g3 */
    public boolean mo8244g3() {
        return this.f8793Z.mo8180c("external_browser", false);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: h3 */
    public String mo8245h3() {
        return "https://digdroid.com/forums/categories/system-" + this.f8181p0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: j3 */
    public void mo8247j3(C2254d4.AbstractC2258b bVar) {
        SQLiteDatabase c = this.f8794a0.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT forumcreated FROM systems WHERE slug='" + this.f8181p0 + "'", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return;
        }
        boolean z = false;
        if (rawQuery.getInt(0) == 1) {
            z = true;
        }
        rawQuery.close();
        if (z) {
            bVar.mo8249a();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject("{\"system\":" + this.f8181p0 + "}");
            C2490m2.m10682a(mo2575j0()).mo6218a(new C1272k(ServerService.f7700b + "/getsystemforum.php?system=" + this.f8181p0, jSONObject, new C2314a(bVar), new C2315b()));
        } catch (Exception unused) {
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2254d4, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        this.f8181p0 = this.f8795b0.mo8569t(mo2568h0().getString("system"));
    }
}
