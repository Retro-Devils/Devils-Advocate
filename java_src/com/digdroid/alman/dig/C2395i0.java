package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.digdroid.alman.dig.C2254d4;
import org.json.JSONObject;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1272k;

/* renamed from: com.digdroid.alman.dig.i0 */
public class C2395i0 extends C2254d4 {

    /* renamed from: p0 */
    long f8377p0;

    /* renamed from: q0 */
    long f8378q0 = -1;

    /* renamed from: r0 */
    boolean f8379r0 = false;

    /* renamed from: s0 */
    String f8380s0;

    /* renamed from: com.digdroid.alman.dig.i0$a */
    class C2396a implements C1245p.AbstractC1247b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C2254d4.AbstractC2258b f8381a;

        C2396a(C2254d4.AbstractC2258b bVar) {
            this.f8381a = bVar;
        }

        /* renamed from: b */
        public void mo6226a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.has("status")) {
                try {
                    if (jSONObject.getString("status").equals("ok")) {
                        SQLiteDatabase c = C2395i0.this.f8802a0.mo9325c();
                        c.execSQL("UPDATE roms SET forumcreated=1 WHERE mdbid=" + C2395i0.this.f8378q0);
                        this.f8381a.mo8249a();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.i0$b */
    class C2397b implements C1245p.AbstractC1246a {
        C2397b() {
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
        return this.f8801Z.mo8180c("external_browser", false);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: h3 */
    public String mo8245h3() {
        return "https://digdroid.com/forums/categories/game-" + this.f8378q0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2254d4
    /* renamed from: j3 */
    public void mo8247j3(C2254d4.AbstractC2258b bVar) {
        if (this.f8378q0 >= 0) {
            if (this.f8379r0) {
                bVar.mo8249a();
                return;
            }
            SQLiteDatabase a = this.f8806e0.mo9515a();
            Cursor rawQuery = a.rawQuery("SELECT title FROM titles WHERE rowid=" + this.f8378q0, null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return;
            }
            String string = rawQuery.getString(0);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("system", this.f8380s0);
                jSONObject.put("game", this.f8378q0);
                jSONObject.put("title", string);
                C2490m2.m10682a(mo2575j0()).mo6218a(new C1272k(ServerService.f7708b + "/getgameforum.php", jSONObject, new C2396a(bVar), new C2397b()));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.C2254d4, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        this.f8377p0 = mo2568h0().getLong("gameid");
        SQLiteDatabase c = this.f8802a0.mo9325c();
        Cursor rawQuery = c.rawQuery("SELECT forumcreated,system,mdbid FROM roms WHERE _id=" + this.f8377p0, null);
        if (rawQuery.moveToFirst()) {
            boolean z = false;
            if (rawQuery.getInt(0) == 1) {
                z = true;
            }
            this.f8379r0 = z;
            this.f8380s0 = this.f8803b0.mo8569t(rawQuery.getString(1));
            this.f8378q0 = rawQuery.getLong(2);
        }
        rawQuery.close();
    }
}
