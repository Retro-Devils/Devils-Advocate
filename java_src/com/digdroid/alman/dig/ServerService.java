package com.digdroid.alman.dig;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import com.digdroid.alman.dig.C2295f;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import p006b.p057o.p058a.C1088a;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1236k;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1266g;
import p069c.p070a.p071a.p072w.C1272k;

public class ServerService extends IntentService {

    /* renamed from: b */
    public static String f7708b = "https://digdroid.com/php";

    /* renamed from: c */
    private static Object f7709c = new Object();

    /* renamed from: d */
    private static boolean f7710d = false;

    /* renamed from: e */
    private static String f7711e = "";

    /* renamed from: f */
    private C2219c3 f7712f;

    /* renamed from: g */
    int f7713g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$a */
    public class C2130a implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f7714a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f7715b;

        /* renamed from: c */
        final /* synthetic */ long f7716c;

        C2130a(String str, SQLiteDatabase sQLiteDatabase, long j) {
            this.f7714a = str;
            this.f7715b = sQLiteDatabase;
            this.f7716c = j;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            if (uVar != null && uVar.f5485b != null) {
                Log.e("ZZZ", "not found: " + this.f7714a);
                int i = uVar.f5485b.f5442a;
                if (i == 404 || i == 410 || (i >= 300 && i < 400)) {
                    SQLiteDatabase sQLiteDatabase = this.f7715b;
                    sQLiteDatabase.execSQL("UPDATE games SET gdbid=-1 WHERE _id=" + this.f7716c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$b */
    public class C2131b implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ C2749t1 f7718a;

        /* renamed from: b */
        final /* synthetic */ File f7719b;

        /* renamed from: c */
        final /* synthetic */ SQLiteDatabase f7720c;

        /* renamed from: d */
        final /* synthetic */ long f7721d;

        C2131b(C2749t1 t1Var, File file, SQLiteDatabase sQLiteDatabase, long j) {
            this.f7718a = t1Var;
            this.f7719b = file;
            this.f7720c = sQLiteDatabase;
            this.f7721d = j;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            if (bArr != null) {
                this.f7718a.mo9287w(bArr, this.f7719b.getAbsolutePath());
                SQLiteDatabase sQLiteDatabase = this.f7720c;
                sQLiteDatabase.execSQL("UPDATE games SET gdbid=-1 WHERE _id=" + this.f7721d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$c */
    public class C2132c implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f7723a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f7724b;

        /* renamed from: c */
        final /* synthetic */ long f7725c;

        C2132c(String str, SQLiteDatabase sQLiteDatabase, long j) {
            this.f7723a = str;
            this.f7724b = sQLiteDatabase;
            this.f7725c = j;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            if (uVar != null && uVar.f5485b != null) {
                Log.e("ZZZ", "not found: " + this.f7723a);
                int i = uVar.f5485b.f5442a;
                if (i == 404 || i == 410 || (i >= 300 && i < 400)) {
                    SQLiteDatabase sQLiteDatabase = this.f7724b;
                    sQLiteDatabase.execSQL("UPDATE games SET gdbid=-1 WHERE _id=" + this.f7725c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$d */
    public class C2133d implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ C2749t1 f7727a;

        /* renamed from: b */
        final /* synthetic */ File f7728b;

        /* renamed from: c */
        final /* synthetic */ C2148s f7729c;

        C2133d(C2749t1 t1Var, File file, C2148s sVar) {
            this.f7727a = t1Var;
            this.f7728b = file;
            this.f7729c = sVar;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            if (bArr != null) {
                this.f7727a.mo9287w(bArr, this.f7728b.getAbsolutePath());
                try {
                    Thread.sleep(2000);
                } catch (Exception unused) {
                }
                C2490m2.m10682a(ServerService.this).mo6218a(this.f7729c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$e */
    public class C2134e implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f7731a;

        /* renamed from: b */
        final /* synthetic */ C2148s f7732b;

        C2134e(String str, C2148s sVar) {
            this.f7731a = str;
            this.f7732b = sVar;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            if (uVar != null && uVar.f5485b != null) {
                Log.e("ZZZ", "not found: " + this.f7731a);
                int i = uVar.f5485b.f5442a;
                if (i == 404 || i == 410 || (i >= 300 && i < 400)) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception unused) {
                    }
                    C2490m2.m10682a(ServerService.this).mo6218a(this.f7732b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$f */
    public class C2135f implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ C2749t1 f7734a;

        /* renamed from: b */
        final /* synthetic */ File f7735b;

        /* renamed from: c */
        final /* synthetic */ C2148s f7736c;

        C2135f(C2749t1 t1Var, File file, C2148s sVar) {
            this.f7734a = t1Var;
            this.f7735b = file;
            this.f7736c = sVar;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            if (bArr != null) {
                this.f7734a.mo9287w(bArr, this.f7735b.getAbsolutePath());
                try {
                    Thread.sleep(2000);
                } catch (Exception unused) {
                }
                C2490m2.m10682a(ServerService.this).mo6218a(this.f7736c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$g */
    public class C2136g implements C1245p.AbstractC1247b<byte[]> {
        C2136g() {
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            ServerService serverService;
            int i;
            if (bArr != null) {
                try {
                    JSONArray jSONArray = new JSONObject(new String(bArr, "UTF-8")).getJSONObject("data").getJSONArray("games");
                    FileOutputStream fileOutputStream = new FileOutputStream(new File("/storage/emulated/0/masterbase/mame" + ServerService.this.f7713g + ".json"));
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (jSONArray.length() > 0) {
                        serverService = ServerService.this;
                        i = serverService.f7713g + 1;
                    } else {
                        serverService = ServerService.this;
                        i = 0;
                    }
                    serverService.f7713g = i;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$h */
    public class C2137h implements C1245p.AbstractC1246a {
        C2137h() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.ServerService$i */
    class C2138i implements C2295f.AbstractC2302g {
        C2138i() {
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: a */
        public void mo7913a() {
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: b */
        public void mo7914b() {
            ServerService.this.m9576u();
        }
    }

    /* renamed from: com.digdroid.alman.dig.ServerService$j */
    class C2139j implements C2295f.AbstractC2302g {

        /* renamed from: a */
        final /* synthetic */ Intent f7741a;

        C2139j(Intent intent) {
            this.f7741a = intent;
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: a */
        public void mo7913a() {
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: b */
        public void mo7914b() {
            ServerService.this.m9571n(this.f7741a.getLongExtra("gameid", -1));
        }
    }

    /* renamed from: com.digdroid.alman.dig.ServerService$k */
    class C2140k implements C2295f.AbstractC2302g {
        C2140k() {
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: a */
        public void mo7913a() {
            ImageService.m9511a(ServerService.this.getApplicationContext());
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: b */
        public void mo7914b() {
            ImageService.m9511a(ServerService.this.getApplicationContext());
            DatabaseService.m9478v(ServerService.this.getApplicationContext(), "sync");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$l */
    public class C2141l implements C1245p.AbstractC1247b<JSONObject> {
        C2141l() {
        }

        /* renamed from: b */
        public void mo6226a(JSONObject jSONObject) {
            if (jSONObject.has("status")) {
                try {
                    String string = jSONObject.getString("status");
                    if (string.equals("badtoken")) {
                        ServerService.this.f7712f.mo8158G("token", "0");
                    } else if (string.equals("ok") && jSONObject.has("stats")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("stats");
                        if (jSONArray.length() > 0) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                            long j = jSONArray2.getLong(0);
                            float f = (float) jSONArray2.getDouble(1);
                            int i = jSONArray2.getInt(2);
                            if (i > 1) {
                                double round = (double) Math.round((f * 10.0f) / ((float) i));
                                Double.isNaN(round);
                                f = (float) (round / 10.0d);
                            }
                            jSONArray2.getInt(6);
                            C2775u e = C2775u.m11726e(ServerService.this.getApplicationContext());
                            e.mo9329h();
                            SQLiteDatabase c = e.mo9325c();
                            c.execSQL("UPDATE roms SET c_rating=" + f + ",c_rating_count=" + i + ",c_played_total=" + jSONArray2.getLong(3) + ",c_played_count=" + jSONArray2.getInt(4) + ",comments=" + jSONArray2.getInt(6) + ",lastcomment=" + jSONArray2.getInt(7) + " WHERE mdbid=" + j);
                            StringBuilder sb = new StringBuilder();
                            sb.append(ServerService.this.getPackageName());
                            sb.append(".");
                            sb.append("request_refresh");
                            C1088a.m6129b(ServerService.this).mo5723d(new Intent(sb.toString()));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$m */
    public class C2142m implements C1245p.AbstractC1246a {
        C2142m() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$n */
    public class C2143n implements C1245p.AbstractC1247b<JSONObject> {
        C2143n() {
        }

        /* renamed from: b */
        public void mo6226a(JSONObject jSONObject) {
            new AsyncTaskC2150u().execute(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$o */
    public class C2144o implements C1245p.AbstractC1246a {
        C2144o() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            ServerService.this.m9568k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$p */
    public class C2145p implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f7748a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f7749b;

        /* renamed from: c */
        final /* synthetic */ long f7750c;

        C2145p(String str, SQLiteDatabase sQLiteDatabase, long j) {
            this.f7748a = str;
            this.f7749b = sQLiteDatabase;
            this.f7750c = j;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            if (uVar != null && uVar.f5485b != null) {
                Log.e("ZZZ", "not found: " + this.f7748a);
                int i = uVar.f5485b.f5442a;
                if (i == 404 || i == 410 || (i >= 300 && i < 400)) {
                    SQLiteDatabase sQLiteDatabase = this.f7749b;
                    sQLiteDatabase.execSQL("UPDATE games SET gdbid=-1 WHERE _id=" + this.f7750c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$q */
    public class C2146q implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ C2749t1 f7752a;

        /* renamed from: b */
        final /* synthetic */ File f7753b;

        /* renamed from: c */
        final /* synthetic */ SQLiteDatabase f7754c;

        /* renamed from: d */
        final /* synthetic */ long f7755d;

        C2146q(C2749t1 t1Var, File file, SQLiteDatabase sQLiteDatabase, long j) {
            this.f7752a = t1Var;
            this.f7753b = file;
            this.f7754c = sQLiteDatabase;
            this.f7755d = j;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            if (bArr != null) {
                this.f7752a.mo9287w(bArr, this.f7753b.getAbsolutePath());
                SQLiteDatabase sQLiteDatabase = this.f7754c;
                sQLiteDatabase.execSQL("UPDATE games SET gdbid=-1 WHERE _id=" + this.f7755d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$r */
    public class AsyncTaskC2147r extends AsyncTask<Void, Void, Void> {
        AsyncTaskC2147r() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            synchronized (ServerService.f7709c) {
                File filesDir = ServerService.this.getFilesDir();
                if (filesDir != null) {
                    File file = new File(filesDir, "queue.json");
                    if (file.exists()) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
                boolean unused2 = ServerService.f7710d = false;
            }
            ServerService.this.m9569l();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$s */
    public class C2148s extends AbstractC1239n<byte[]> {

        /* renamed from: q */
        private final C1245p.AbstractC1247b<byte[]> f7758q;

        /* renamed from: r */
        private Map<String, String> f7759r;

        /* renamed from: s */
        public Map<String, String> f7760s;

        public C2148s(int i, String str, C1245p.AbstractC1247b<byte[]> bVar, C1245p.AbstractC1246a aVar, HashMap<String, String> hashMap) {
            super(i, str, aVar);
            mo6189L(false);
            this.f7758q = bVar;
            this.f7759r = hashMap;
        }

        /* access modifiers changed from: protected */
        @Override // p069c.p070a.p071a.AbstractC1239n
        /* renamed from: F */
        public C1245p<byte[]> mo6183F(C1236k kVar) {
            this.f7760s = kVar.f5444c;
            return C1245p.m6654c(kVar.f5443b, C1266g.m6720c(kVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo6196e(byte[] bArr) {
            this.f7758q.mo6226a(bArr);
        }

        /* access modifiers changed from: protected */
        @Override // p069c.p070a.p071a.AbstractC1239n
        /* renamed from: o */
        public Map<String, String> mo6204o() {
            return this.f7759r;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.ServerService$t */
    public static class AsyncTaskC2149t extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        Context f7762a;

        public AsyncTaskC2149t(Context context) {
            this.f7762a = context;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:10|(5:11|12|13|14|(4:15|16|17|18))|19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005d, code lost:
            if (r1 == null) goto L_0x0060;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0049 A[SYNTHETIC, Splitter:B:30:0x0049] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0050 A[SYNTHETIC, Splitter:B:34:0x0050] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0058 A[SYNTHETIC, Splitter:B:41:0x0058] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.String... r6) {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.ServerService.AsyncTaskC2149t.doInBackground(java.lang.String[]):java.lang.Void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ServerService$u */
    public class AsyncTaskC2150u extends AsyncTask<JSONObject, Void, Void> {
        AsyncTaskC2150u() {
        }

        /* renamed from: b */
        private void m9613b(JSONArray jSONArray) {
            Exception e;
            C2775u e2 = C2775u.m11726e(ServerService.this.getApplicationContext());
            e2.mo9329h();
            SQLiteDatabase c = e2.mo9325c();
            String str = "first_sync_t";
            long n = ServerService.this.f7712f.mo8190n(str, 0);
            long n2 = ServerService.this.f7712f.mo8190n("last_sync_t", 2000000000);
            try {
                int length = jSONArray.length();
                String str2 = ".";
                if (length > 800) {
                    C1088a.m6129b(ServerService.this.getApplicationContext()).mo5723d(new Intent(ServerService.this.getPackageName() + str2 + "STATS_START"));
                }
                c.beginTransaction();
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    try {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                        long j = jSONArray2.getLong(i);
                        float f = (float) jSONArray2.getDouble(1);
                        int i3 = jSONArray2.getInt(2);
                        if (i3 > 1) {
                            double round = (double) Math.round((f * 10.0f) / ((float) i3));
                            Double.isNaN(round);
                            f = (float) (round / 10.0d);
                        }
                        c.execSQL("UPDATE roms SET c_rating=" + f + ",c_rating_count=" + i3 + ",c_played_total=" + jSONArray2.getLong(3) + ",c_played_count=" + jSONArray2.getInt(4) + ",comments=" + jSONArray2.getInt(6) + ",lastcomment=" + jSONArray2.getInt(7) + " WHERE mdbid=" + j);
                        long j2 = jSONArray2.getLong(5);
                        if (j2 > n) {
                            n = j2;
                        }
                        if (j2 < n2) {
                            n2 = j2;
                        }
                        i2++;
                        str2 = str2;
                        str = str;
                        length = length;
                        i = 0;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                }
                c.setTransactionSuccessful();
                c.endTransaction();
                ServerService.this.f7712f.mo8157F(str, n);
                ServerService.this.f7712f.mo8157F("last_sync_t", n2);
                if (length > 800) {
                    C1088a.m6129b(ServerService.this.getApplicationContext()).mo5723d(new Intent(ServerService.this.getPackageName() + str2 + "STATS_END"));
                }
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(JSONObject... jSONObjectArr) {
            JSONObject jSONObject = jSONObjectArr[0];
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("status")) {
                        String string = jSONObject.getString("status");
                        if (string.equals("badtoken")) {
                            ServerService.this.f7712f.mo8158G("token", "0");
                            boolean unused = ServerService.f7710d = false;
                            ServerService.this.m9569l();
                            return null;
                        } else if (string.equals("ok")) {
                            if (jSONObject.has("stats")) {
                                m9613b(jSONObject.getJSONArray("stats"));
                            }
                            new AsyncTaskC2147r().execute(new Void[0]);
                            return null;
                        }
                    }
                    ServerService.this.m9568k();
                    return null;
                } catch (Exception unused2) {
                }
            }
            ServerService.this.m9568k();
            return null;
        }
    }

    public ServerService() {
        super("ServerService");
        setIntentRedelivery(true);
    }

    /* renamed from: f */
    static /* synthetic */ String m9563f(Object obj) {
        String str = f7711e + obj;
        f7711e = str;
        return str;
    }

    /* renamed from: j */
    public static void m9567j(Context context, long j, int i) {
        m9573r(context, ",{\"id\":" + j + ",\"badvideo\":" + i + "}");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private void m9568k() {
        synchronized (f7709c) {
            f7710d = false;
        }
        m9569l();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private void m9569l() {
        if (f7711e.length() > 0) {
            m9573r(this, f7711e);
            f7711e = "";
        }
    }

    /* renamed from: m */
    public static void m9570m(Context context, String str, long j) {
        try {
            Intent intent = new Intent(context, ServerService.class);
            intent.setAction(str);
            intent.putExtra("gameid", j);
            context.getApplicationContext().startService(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n */
    private void m9571n(long j) {
        try {
            String q = this.f7712f.mo8193q("userid", "0");
            String q2 = this.f7712f.mo8193q("token", "0");
            JSONObject jSONObject = new JSONObject("{\"userid\":\"" + q + "\",\"token\":\"" + q2 + "\",\"gameid\":" + j + "}");
            C2490m2.m10682a(this).mo6218a(new C1272k(f7708b + "/gamestats.php", jSONObject, new C2141l(), new C2142m()));
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public static void m9572q(Context context, long j, long j2) {
        m9573r(context, ",{\"id\":" + j + ",\"played\":" + j2 + "}");
    }

    /* renamed from: r */
    private static void m9573r(Context context, String str) {
        new AsyncTaskC2149t(context).execute(str);
    }

    /* renamed from: s */
    public static void m9574s(Context context, long j, float f) {
        m9573r(context, ",{\"id\":" + j + ",\"rating\":" + f + "}");
    }

    /* renamed from: t */
    public static void m9575t(Context context, String str) {
        try {
            Intent intent = new Intent(context, ServerService.class);
            intent.setAction(str);
            context.getApplicationContext().startService(intent);
        } catch (Exception e) {
            Log.e("ZZZ", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        com.digdroid.alman.dig.C2490m2.m10682a(r13).mo6218a(new p069c.p070a.p071a.p072w.C1272k(com.digdroid.alman.dig.ServerService.f7708b + "/sync.php", r2, new com.digdroid.alman.dig.ServerService.C2143n(r13), new com.digdroid.alman.dig.ServerService.C2144o(r13)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010a, code lost:
        m9568k();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m9576u() {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.ServerService.m9576u():void");
    }

    /* renamed from: v */
    public static void m9577v(Context context) {
        C2219c3 k = C2219c3.m9805k(context.getApplicationContext());
        k.mo8160I("first_sync_t");
        k.mo8160I("last_sync_t");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo7974o() {
        this.f7713g = 1;
        while (this.f7713g > 0) {
            C2490m2.m10682a(this).mo6218a(new C2148s(0, "https://api.thegamesdb.net/Games/ByPlatformID?id=23&fields=publishers,genres,overview&apikey=98d4ee59533bec49fd68e12987bd7e0649667f63cf560232a04b62228dd89578&page=" + this.f7713g, new C2136g(), new C2137h(), null));
            try {
                Thread.sleep(20000);
            } catch (Exception unused) {
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f7712f = C2219c3.m9805k(getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String action;
        C2295f.AbstractC2302g gVar;
        C2295f g;
        if (intent != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                int type = activeNetworkInfo.getType();
                if ((!this.f7712f.mo8180c("wifi_only", true) || type == 1 || type == 9) && (action = intent.getAction()) != null) {
                    if ("com.digdroid.alman.dig.action.SYNC".equals(action)) {
                        gVar = new C2138i();
                    } else if ("com.digdroid.alman.dig.action.GAME_STATS".equals(action)) {
                        g = C2295f.m10150g(this, new C2139j(intent));
                        g.mo8412d();
                    } else if ("com.digdroid.alman.dig.action.ATTESTED_SERVICES".equals(action)) {
                        gVar = new C2140k();
                    } else if ("com.digdroid.alman.dig.action.ATTEST".equals(action)) {
                        gVar = null;
                    } else if ("com.digdroid.alman.dig.action.GETTGDB".equals(action)) {
                        mo7977p();
                        return;
                    } else if ("com.digdroid.alman.dig.action.GETMAME".equals(action)) {
                        mo7974o();
                        return;
                    } else {
                        return;
                    }
                    g = C2295f.m10150g(this, gVar);
                    g.mo8412d();
                }
            }
        }
    }

    /* renamed from: p */
    public void mo7977p() {
        C2886z1 b = C2886z1.m11967b(getApplicationContext());
        b.mo9516c();
        SQLiteDatabase a = b.mo9515a();
        C2749t1 p = C2749t1.m11663p(getApplicationContext());
        File[] b2 = C2372h2.m10298b(getApplicationContext());
        Cursor rawQuery = a.rawQuery("SELECT g._id,g.gdbid,s.slug FROM games as g,systems as s WHERE g.gdbid>=0 AND s._id=g.system AND (s.slug='3ds')", null);
        long count = (long) rawQuery.getCount();
        Log.e("ZZX", "to get: " + count);
        Random random = new Random();
        while (count > 0) {
            rawQuery.moveToPosition(random.nextInt((int) count));
            long j = rawQuery.getLong(1);
            if (j >= 0) {
                String string = rawQuery.getString(2);
                String str = b2[0] + "/Server/Covers-lo/" + string;
                String str2 = b2[0] + "/Server/Covers-hi/" + string;
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                long j2 = rawQuery.getLong(0);
                File file3 = new File(str2 + "/" + j2 + ".png");
                File file4 = new File(str + "/" + j2 + ".png");
                if (!file3.exists() || !file4.exists()) {
                    String str3 = "https://cdn.thegamesdb.net/images/original/boxart/front/" + j + "-1.jpg";
                    String str4 = "https://cdn.thegamesdb.net/images/original/boxart/front/" + j + "-1.png";
                    String str5 = "https://cdn.thegamesdb.net/images/thumb/boxart/front/" + j + "-1.jpg";
                    String str6 = "https://cdn.thegamesdb.net/images/thumb/boxart/front/" + j + "-1.png";
                    C2148s sVar = new C2148s(0, str6, new C2146q(p, file4, a, j2), new C2145p(str6, a, j2), null);
                    C2490m2.m10682a(this).mo6218a(new C2148s(0, str3, new C2135f(p, file3, new C2148s(0, str5, new C2131b(p, file4, a, j2), new C2130a(str5, a, j2), null)), new C2134e(str3, new C2148s(0, str4, new C2133d(p, file3, sVar), new C2132c(str4, a, j2), null)), null));
                    try {
                        Thread.sleep(10000);
                    } catch (Exception unused) {
                    }
                    b2 = b2;
                    rawQuery = rawQuery;
                    count = count;
                } else {
                    a.execSQL("UPDATE games SET gdbid=-1 WHERE _id=" + j2);
                    b2 = b2;
                    rawQuery = rawQuery;
                }
            }
        }
    }
}
