package p069c.p070a.p071a.p072w;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import p069c.p070a.p071a.C1236k;
import p069c.p070a.p071a.C1238m;
import p069c.p070a.p071a.C1245p;

/* renamed from: c.a.a.w.k */
public class C1272k extends AbstractC1273l<JSONObject> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1272k(int i, String str, JSONObject jSONObject, C1245p.AbstractC1247b<JSONObject> bVar, C1245p.AbstractC1246a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1272k(String str, JSONObject jSONObject, C1245p.AbstractC1247b<JSONObject> bVar, C1245p.AbstractC1246a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p070a.p071a.AbstractC1239n
    /* renamed from: F */
    public C1245p<JSONObject> mo6183F(C1236k kVar) {
        C1238m mVar;
        try {
            return C1245p.m6654c(new JSONObject(new String(kVar.f5436b, C1266g.m6722e(kVar.f5437c, "utf-8"))), C1266g.m6720c(kVar));
        } catch (UnsupportedEncodingException e) {
            mVar = new C1238m(e);
            return C1245p.m6653a(mVar);
        } catch (JSONException e2) {
            mVar = new C1238m(e2);
            return C1245p.m6653a(mVar);
        }
    }
}
