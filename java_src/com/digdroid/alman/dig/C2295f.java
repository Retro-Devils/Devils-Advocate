package com.digdroid.alman.dig;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p006b.p057o.p058a.C1088a;
import p069c.p070a.p071a.C1243o;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1272k;
import p069c.p073b.p074a.p075a.p086e.AbstractC1339d;
import p069c.p073b.p074a.p075a.p086e.C1338c;
import p069c.p073b.p074a.p075a.p089g.AbstractC1373a;
import p069c.p073b.p074a.p075a.p089g.AbstractC1374b;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.f */
public class C2295f {

    /* renamed from: a */
    private static String f8143a = "AIzaSyCjUGS0FaPsJExUR4cgeYG8R9-t4hGQMM8";

    /* renamed from: b */
    private static C2295f f8144b;

    /* renamed from: c */
    Context f8145c = null;

    /* renamed from: d */
    C1243o f8146d;

    /* renamed from: e */
    ArrayList<AbstractC2302g> f8147e = new ArrayList<>();

    /* renamed from: f */
    C2219c3 f8148f;

    /* renamed from: g */
    boolean f8149g = false;

    /* renamed from: com.digdroid.alman.dig.f$a */
    class C2296a implements C1245p.AbstractC1247b<String> {
        C2296a() {
        }

        /* renamed from: b */
        public void mo6226a(String str) {
            if (str != null) {
                try {
                    C2295f.this.m10148e(new JSONObject(str).getString("token"));
                } catch (Exception unused) {
                    C2295f.this.m10149f();
                }
            } else {
                C2295f.this.m10149f();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.f$b */
    class C2297b implements C1245p.AbstractC1246a {
        C2297b() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            C2295f.this.m10149f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.f$c */
    public class C2298c implements AbstractC1373a {
        C2298c() {
        }

        @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1373a
        /* renamed from: a */
        public void mo6415a(Exception exc) {
            C2295f.this.m10149f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.f$d */
    public class C2299d implements AbstractC1374b<AbstractC1339d.C1340a> {
        C2299d() {
        }

        /* renamed from: b */
        public void mo6416a(AbstractC1339d.C1340a aVar) {
            String c;
            if (aVar == null || (c = aVar.mo6366c()) == null) {
                C2295f.this.m10149f();
            } else {
                C2295f.this.m10151h(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.f$e */
    public class C2300e implements C1245p.AbstractC1247b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ String f8154a;

        C2300e(String str) {
            this.f8154a = str;
        }

        /* renamed from: b */
        public void mo6226a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("premium")) {
                        C2223d0.m9876p().mo8208F(C2295f.this.f8145c, jSONObject.getJSONArray("premium"));
                    }
                    if (jSONObject.has("themes")) {
                        C2295f.this.f8148f.mo8157F("new_themes_updated", jSONObject.getLong("themes"));
                    }
                    if (jSONObject.has("announcement")) {
                        C2295f.this.f8148f.mo8161J(jSONObject.getString("announcement"));
                        if (C2295f.this.f8145c != null) {
                            C1088a.m6129b(C2295f.this.f8145c).mo5723d(new Intent(C2295f.this.f8145c.getPackageName() + "." + "ANNOUNCEMENT"));
                        }
                    }
                    if (!jSONObject.getString("pass").equals("true")) {
                        C2295f.this.m10149f();
                        return;
                    }
                    if (this.f8154a == null) {
                        C2295f.this.f8148f.mo8158G("userid", jSONObject.getString("userid"));
                    }
                    C2295f.this.f8148f.mo8158G("token", jSONObject.getString("token"));
                    C2295f.this.f8148f.mo8157F("token_expires", System.currentTimeMillis() + 129600000);
                    C2295f.this.f8148f.mo8157F("attest_retry_next", 0);
                    C2295f.this.f8148f.mo8157F("attest_retry_in", 1800000);
                    synchronized (C2295f.this) {
                        Iterator<AbstractC2302g> it = C2295f.this.f8147e.iterator();
                        while (it.hasNext()) {
                            it.next().mo7914b();
                        }
                        C2295f.this.f8147e.clear();
                        C2295f.this.f8149g = false;
                    }
                } catch (Exception unused) {
                    C2295f.this.m10149f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.f$f */
    public class C2301f implements C1245p.AbstractC1246a {
        C2301f() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            C2295f.this.m10149f();
        }
    }

    /* renamed from: com.digdroid.alman.dig.f$g */
    public interface AbstractC2302g {
        /* renamed from: a */
        void mo7913a();

        /* renamed from: b */
        void mo7914b();
    }

    private C2295f(Context context) {
        if (context != null) {
            this.f8145c = context.getApplicationContext();
            this.f8146d = C2490m2.m10682a(context);
            this.f8148f = C2219c3.m9805k(this.f8145c);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m10148e(String str) {
        C1338c.m6914a(this.f8145c).mo6367j(C2185a4.m9682l(str), f8143a).mo6419c(new C2299d()).mo6417a(new C2298c());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private synchronized void m10149f() {
        Iterator<AbstractC2302g> it = this.f8147e.iterator();
        while (it.hasNext()) {
            it.next().mo7913a();
        }
        this.f8147e.clear();
        this.f8149g = false;
    }

    /* renamed from: g */
    public static synchronized C2295f m10150g(Context context, AbstractC2302g gVar) {
        C2295f fVar;
        synchronized (C2295f.class) {
            if (f8144b == null) {
                f8144b = new C2295f(context);
            }
            synchronized (f8144b) {
                f8144b.f8147e.add(gVar);
            }
            fVar = f8144b;
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m10151h(String str) {
        String q = this.f8148f.mo8193q("userid", null);
        StringBuilder sb = new StringBuilder();
        sb.append(ServerService.f7700b);
        sb.append(q == null ? "/newuser2.php" : "/refreshuser2.php");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("jws", str);
        if (q != null) {
            hashMap.put("userid", q);
        }
        C1272k kVar = new C1272k(sb2, new JSONObject(hashMap), new C2300e(q), new C2301f());
        try {
            kVar.mo6189L(false);
            this.f8146d.mo6218a(kVar);
        } catch (Exception unused) {
            m10149f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r7.f8148f.mo8190n("attest_retry_next", 0) <= java.lang.System.currentTimeMillis()) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        m10149f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        r0 = r7.f8148f.mo8190n("attest_retry_in", 1800000);
        r7.f8148f.mo8157F("attest_retry_next", java.lang.System.currentTimeMillis() + r0);
        r7.f8148f.mo8157F("attest_retry_in", java.lang.Math.min(r0 * 2, 129600000L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (p069c.p073b.p074a.p075a.p077b.C1282d.m6764k().mo6281e(r7.f8145c) == 0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        m10149f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7.f8146d.mo6218a(new p069c.p070a.p071a.p072w.C1275n(0, com.digdroid.alman.dig.ServerService.f7700b + "/gettoken.php", new com.digdroid.alman.dig.C2295f.C2296a(r7), new com.digdroid.alman.dig.C2295f.C2297b(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        m10149f();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo8412d() {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2295f.mo8412d():void");
    }
}
