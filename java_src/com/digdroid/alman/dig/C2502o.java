package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.text.Html;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p006b.p057o.p058a.C1088a;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1236k;
import p069c.p070a.p071a.C1243o;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1266g;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.o */
public class C2502o {

    /* renamed from: a */
    private static C2502o f8666a;

    /* renamed from: b */
    private SQLiteDatabase f8667b;

    /* renamed from: c */
    private SQLiteDatabase f8668c;

    /* renamed from: d */
    private C2219c3 f8669d;

    /* renamed from: e */
    private C1243o f8670e;

    /* renamed from: f */
    private C2549q f8671f;

    /* renamed from: g */
    boolean f8672g = false;

    /* renamed from: h */
    Context f8673h;

    /* renamed from: i */
    C2375h3 f8674i;

    /* renamed from: j */
    C2512o0 f8675j;

    /* renamed from: k */
    C2749t1 f8676k;

    /* renamed from: l */
    String f8677l;

    /* renamed from: m */
    String f8678m;

    /* renamed from: n */
    boolean f8679n = true;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o$a */
    public class C2503a implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ int f8680a;

        /* renamed from: b */
        final /* synthetic */ boolean f8681b;

        /* renamed from: c */
        final /* synthetic */ String f8682c;

        /* renamed from: d */
        final /* synthetic */ String f8683d;

        /* renamed from: e */
        final /* synthetic */ long f8684e;

        /* renamed from: f */
        final /* synthetic */ int f8685f;

        C2503a(int i, boolean z, String str, String str2, long j, int i2) {
            this.f8680a = i;
            this.f8681b = z;
            this.f8682c = str;
            this.f8683d = str2;
            this.f8684e = j;
            this.f8685f = i2;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            try {
                new AsyncTaskC2505c(bArr, this.f8685f, this.f8684e, this.f8683d, this.f8682c, this.f8681b, this.f8680a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
            } catch (Exception unused) {
                C2502o.this.mo8827r(this.f8684e, this.f8680a | 16384, true);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o$b */
    class AsyncTaskC2504b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        C1252u f8687a;

        /* renamed from: b */
        final /* synthetic */ long f8688b;

        /* renamed from: c */
        final /* synthetic */ int f8689c;

        /* renamed from: d */
        final /* synthetic */ int f8690d;

        /* renamed from: e */
        final /* synthetic */ long f8691e;

        /* renamed from: f */
        final /* synthetic */ String f8692f;

        /* JADX WARN: Incorrect args count in method signature: (Lc/a/a/u;)V */
        public AsyncTaskC2504b(C1252u uVar, long j, int i, int i2, long j2, String str) {
            this.f8688b = j;
            this.f8689c = i;
            this.f8690d = i2;
            this.f8691e = j2;
            this.f8692f = str;
            this.f8687a = uVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C2502o oVar;
            long j;
            int i;
            int i2;
            C1236k kVar;
            try {
                C1252u uVar = this.f8687a;
                if (uVar == null || (kVar = uVar.f5485b) == null) {
                    C2502o.this.f8671f.mo8953a(this.f8690d);
                    oVar = C2502o.this;
                    j = this.f8688b;
                    i = this.f8689c;
                    i2 = this.f8690d;
                } else {
                    int i3 = kVar.f5442a;
                    if (!(i3 == 404 || i3 == 410)) {
                        if (i3 < 300 || i3 >= 400) {
                            C2502o.this.f8671f.mo8953a(this.f8690d);
                            oVar = C2502o.this;
                            j = this.f8688b;
                            i = this.f8689c;
                            i2 = this.f8690d;
                        }
                    }
                    C2502o oVar2 = C2502o.this;
                    oVar2.mo8827r(this.f8688b, oVar2.f8671f.mo8957e(this.f8689c, this.f8690d, this.f8691e, this.f8692f), false);
                    return null;
                }
                oVar.mo8827r(j, oVar.mo8814d(i, i2), true);
                return null;
            } catch (Exception unused) {
                C2502o.this.f8671f.mo8953a(this.f8690d);
                C2502o oVar3 = C2502o.this;
                oVar3.mo8827r(this.f8688b, oVar3.mo8814d(this.f8689c, this.f8690d), true);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o$c */
    public class AsyncTaskC2505c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        byte[] f8694a;

        /* renamed from: b */
        final /* synthetic */ int f8695b;

        /* renamed from: c */
        final /* synthetic */ long f8696c;

        /* renamed from: d */
        final /* synthetic */ String f8697d;

        /* renamed from: e */
        final /* synthetic */ String f8698e;

        /* renamed from: f */
        final /* synthetic */ boolean f8699f;

        /* renamed from: g */
        final /* synthetic */ int f8700g;

        /* JADX WARN: Incorrect args count in method signature: ([B)V */
        public AsyncTaskC2505c(byte[] bArr, int i, long j, String str, String str2, boolean z, int i2) {
            this.f8695b = i;
            this.f8696c = j;
            this.f8697d = str;
            this.f8698e = str2;
            this.f8699f = z;
            this.f8700g = i2;
            this.f8694a = bArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                byte[] bArr = this.f8694a;
                if (bArr == null) {
                    C2502o.this.f8671f.mo8953a(this.f8695b);
                    C2502o oVar = C2502o.this;
                    oVar.mo8827r(this.f8696c, oVar.mo8814d(this.f8700g, this.f8695b), true);
                    return null;
                } else if (this.f8695b == 32) {
                    C2502o.this.mo8826q(bArr, this.f8696c);
                    return null;
                } else if (!C2502o.this.f8676k.mo9287w(bArr, this.f8697d)) {
                    C2502o.this.mo8828s();
                    return null;
                } else {
                    SQLiteDatabase sQLiteDatabase = C2502o.this.f8667b;
                    sQLiteDatabase.execSQL("UPDATE roms SET has_images=NULL WHERE _id=" + this.f8696c);
                    Intent intent = new Intent(C2502o.this.f8673h.getPackageName() + "." + "image_downloaded");
                    intent.putExtra("gameid", this.f8696c);
                    intent.putExtra("system", this.f8698e);
                    intent.putExtra("favorite", this.f8699f);
                    intent.putExtra("is_screenshot", this.f8695b == 4096);
                    C1088a.m6129b(C2502o.this.f8673h.getApplicationContext()).mo5723d(intent);
                    return null;
                }
            } catch (Exception unused) {
                C2502o.this.f8671f.mo8953a(this.f8695b);
                C2502o oVar2 = C2502o.this;
                oVar2.mo8827r(this.f8696c, oVar2.mo8814d(this.f8700g, this.f8695b), true);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o$d */
    public class C2506d implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f8702a;

        /* renamed from: b */
        final /* synthetic */ long f8703b;

        /* renamed from: c */
        final /* synthetic */ int f8704c;

        /* renamed from: d */
        final /* synthetic */ int f8705d;

        /* renamed from: e */
        final /* synthetic */ long f8706e;

        C2506d(String str, long j, int i, int i2, long j2) {
            this.f8702a = str;
            this.f8703b = j;
            this.f8704c = i;
            this.f8705d = i2;
            this.f8706e = j2;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            try {
                new AsyncTaskC2504b(uVar, this.f8706e, this.f8705d, this.f8704c, this.f8703b, this.f8702a).execute(new Void[0]);
            } catch (Exception unused) {
                C2502o.this.mo8827r(this.f8706e, this.f8705d | 16384, true);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o$e */
    class C2507e implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ String f8708a;

        /* renamed from: b */
        final /* synthetic */ File f8709b;

        C2507e(String str, File file) {
            this.f8708a = str;
            this.f8709b = file;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            if (bArr != null) {
                Log.e("ZZZ", this.f8708a);
                C2502o.this.f8676k.mo9287w(bArr, this.f8709b.getAbsolutePath());
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o$f */
    class C2508f implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f8711a;

        /* renamed from: b */
        final /* synthetic */ long f8712b;

        C2508f(String str, long j) {
            this.f8711a = str;
            this.f8712b = j;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            if (uVar != null && uVar.f5485b != null) {
                Log.e("ZZZ", "not found: " + this.f8711a);
                int i = uVar.f5485b.f5442a;
                if (i == 404 || i == 410 || (i >= 300 && i < 400)) {
                    SQLiteDatabase sQLiteDatabase = C2502o.this.f8668c;
                    sQLiteDatabase.execSQL("UPDATE moby SET url=null WHERE rowid=" + this.f8712b);
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o$g */
    class C2509g implements C1245p.AbstractC1247b<byte[]> {

        /* renamed from: a */
        final /* synthetic */ String f8714a;

        /* renamed from: b */
        final /* synthetic */ File f8715b;

        C2509g(String str, File file) {
            this.f8714a = str;
            this.f8715b = file;
        }

        /* renamed from: b */
        public void mo6226a(byte[] bArr) {
            if (bArr != null) {
                Log.e("ZZZ", this.f8714a);
                C2502o.this.f8676k.mo9287w(bArr, this.f8715b.getAbsolutePath());
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o$h */
    class C2510h implements C1245p.AbstractC1246a {

        /* renamed from: a */
        final /* synthetic */ String f8717a;

        /* renamed from: b */
        final /* synthetic */ long f8718b;

        C2510h(String str, long j) {
            this.f8717a = str;
            this.f8718b = j;
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
            if (uVar != null && uVar.f5485b != null) {
                Log.e("ZZZ", "not found: " + this.f8717a);
                int i = uVar.f5485b.f5442a;
                if (i == 404 || i == 410 || (i >= 300 && i < 400)) {
                    SQLiteDatabase sQLiteDatabase = C2502o.this.f8668c;
                    sQLiteDatabase.execSQL("UPDATE games SET gfcover=null WHERE _id=" + this.f8718b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o$i */
    public class C2511i extends AbstractC1239n<byte[]> {

        /* renamed from: q */
        private final C1245p.AbstractC1247b<byte[]> f8720q;

        /* renamed from: r */
        private Map<String, String> f8721r;

        /* renamed from: s */
        public Map<String, String> f8722s;

        public C2511i(int i, String str, C1245p.AbstractC1247b<byte[]> bVar, C1245p.AbstractC1246a aVar, HashMap<String, String> hashMap) {
            super(i, str, aVar);
            mo6189L(false);
            this.f8720q = bVar;
            this.f8721r = hashMap;
        }

        /* access modifiers changed from: protected */
        @Override // p069c.p070a.p071a.AbstractC1239n
        /* renamed from: F */
        public C1245p<byte[]> mo6183F(C1236k kVar) {
            this.f8722s = kVar.f5444c;
            return C1245p.m6654c(kVar.f5443b, C1266g.m6720c(kVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo6196e(byte[] bArr) {
            this.f8720q.mo6226a(bArr);
        }

        /* access modifiers changed from: protected */
        @Override // p069c.p070a.p071a.AbstractC1239n
        /* renamed from: o */
        public Map<String, String> mo6204o() {
            return this.f8721r;
        }
    }

    private C2502o(Context context) {
        this.f8673h = context;
        this.f8669d = C2219c3.m9805k(context);
        C2775u e = C2775u.m11726e(context);
        e.mo9329h();
        this.f8667b = e.mo9325c();
        C2886z1 b = C2886z1.m11967b(context);
        b.mo9516c();
        this.f8668c = b.mo9515a();
        C2512o0 g = C2512o0.m10833g(context, e);
        this.f8675j = g;
        g.mo8850o();
        C2375h3 r = C2375h3.m10306r(context, e);
        this.f8674i = r;
        r.mo8543C();
        this.f8676k = C2749t1.m11663p(context);
        this.f8677l = C2185a4.m9678h(context) + "/Screenshots";
        this.f8678m = C2185a4.m9678h(context) + "/Covers";
        this.f8671f = new C2549q(context, this.f8668c, this.f8667b);
        this.f8670e = C2490m2.m10682a(context);
    }

    /* renamed from: j */
    public static synchronized C2502o m10802j(Context context) {
        C2502o oVar;
        synchronized (C2502o.class) {
            if (f8666a == null) {
                f8666a = new C2502o(context);
            }
            oVar = f8666a;
        }
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8814d(int i, int i2) {
        return i2 == 4096 ? (i & -8193) | 4096 | 16384 : i | 16384;
    }

    /* renamed from: e */
    public void mo8815e() {
        File[] b = C2372h2.m10298b(this.f8673h);
        Cursor rawQuery = this.f8668c.rawQuery("SELECT g._id,g.gfcover,s.slug FROM games as g,systems as s WHERE g.gfcover IS NOT NULL AND s._id=g.system", null);
        long count = (long) rawQuery.getCount();
        Log.e("ZZX", "to get: " + count);
        Random random = new Random();
        while (count > 0) {
            rawQuery.moveToPosition(random.nextInt((int) count));
            String str = b[1] + "/Server/Covers/" + rawQuery.getString(2);
            C2399i2 d = C2399i2.m10374d(this.f8673h, str);
            if (!d.exists()) {
                d.mkdirs();
            }
            long j = rawQuery.getLong(0);
            C2399i2 d2 = C2399i2.m10374d(this.f8673h, str + "/" + j + ".png");
            if (d2.exists()) {
                this.f8668c.execSQL("UPDATE games SET gfcover=null WHERE _id=" + j);
            } else {
                String str2 = "http://img.gamefaqs.net/box/" + rawQuery.getString(1) + "_front.jpg";
                this.f8670e.mo6218a(new C2511i(0, str2, new C2509g(str2, d2), new C2510h(str2, j), null));
                try {
                    Thread.sleep(10000);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8816f(Cursor cursor) {
        int lastIndexOf;
        String string = cursor.getString(1);
        int i = 2;
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        String str = cursor.getString(4) + "/";
        if (string3 == null) {
            C2399i2 d = C2399i2.m10374d(this.f8673h, str + string2);
            if ((!d.exists() || !d.isDirectory()) && (lastIndexOf = string2.lastIndexOf(46)) > 0) {
                string2 = string2.substring(0, lastIndexOf);
            }
        } else {
            string2 = string3;
        }
        String t = this.f8674i.mo8569t(string);
        if (t == null) {
            return this.f8669d.mo8191o() ? 1000 : 50;
        }
        ContentValues contentValues = new ContentValues();
        if (!C2399i2.m10374d(this.f8673h, this.f8677l + "/" + t + "/" + string2 + ".png").exists()) {
            i = 0;
        }
        if (C2399i2.m10374d(this.f8673h, this.f8678m + "/" + t + "/" + string2 + ".png").exists()) {
            i |= 1;
        }
        contentValues.put("has_images", Integer.valueOf(i));
        this.f8667b.update("roms", contentValues, "_id=" + cursor.getLong(0), null);
        return this.f8669d.mo8191o() ? 1000 : 50;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8817g(Cursor cursor, int i, String str) {
        String str2;
        int i2;
        String str3;
        String str4;
        if (this.f8672g) {
            return 0;
        }
        long j = cursor.getLong(0);
        int i3 = cursor.getInt(4);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(3);
        boolean z = cursor.getInt(5) > 0;
        String string2 = cursor.getString(6);
        int g = i < 0 ? this.f8671f.mo8959g(i3, j2, string2) : i;
        if (g < 0) {
            return 0;
        }
        String t = this.f8674i.mo8569t(string);
        mo8827r(j, g == 4096 ? (i3 & -4097) | 8192 : i3 & -16385, false);
        if (str == null) {
            str2 = t;
            str3 = string2;
            i2 = g;
            str4 = this.f8671f.mo8955c(g, t, j, j2, str3);
        } else {
            str2 = t;
            str3 = string2;
            i2 = g;
            str4 = str;
        }
        if (str4 == null) {
            mo8827r(j, this.f8671f.mo8957e(i3, i2, j2, str3), true);
            return 0;
        }
        String string3 = cursor.getString(7);
        if (string3 == null) {
            string3 = cursor.getString(2);
        }
        boolean z2 = i2 == 4096;
        if (str2.equals("mame")) {
            if (i2 == 8 || i2 == 256 || i2 == 512) {
                z2 = true;
            } else if (i2 == 4096) {
                z2 = false;
            }
            z2 = !z2;
        }
        File j3 = this.f8676k.mo9275j(z2, string3, string);
        if (j3 == null || j3.exists()) {
            return this.f8669d.mo8191o() ? 1000 : 50;
        }
        try {
            this.f8670e.mo6218a(new C2511i(0, str4, new C2503a(i3, z, string, j3.getAbsolutePath(), j, i2), new C2506d(str3, j2, i2, i3, j), null));
        } catch (Exception unused) {
            this.f8671f.mo8953a(i2);
            mo8827r(j, i3 | 16384, false);
        }
        String q = this.f8669d.mo8193q("image_quality", "low");
        if (q.equals("high")) {
            return 3000;
        }
        q.equals("medium");
        return 1000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo8818h() {
        if (!this.f8672g && this.f8669d.mo8178a()) {
            return mo8819i();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo8819i() {
        if (!this.f8679n) {
            return true;
        }
        this.f8679n = false;
        SQLiteDatabase sQLiteDatabase = this.f8667b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id,system,filename,gdbid,cover_status,favorite,gfcover,foldername FROM roms WHERE " + this.f8671f.mo8958f() + " ORDER BY cover_requested DESC LIMIT 5", null);
        if (rawQuery.moveToFirst()) {
            do {
                int g = mo8817g(rawQuery, -1, null);
                if (g > 0) {
                    try {
                        Thread.sleep((long) g);
                    } catch (Exception unused) {
                    }
                }
            } while (rawQuery.moveToNext());
        } else {
            rawQuery.close();
            rawQuery = this.f8667b.rawQuery("SELECT r._id,r.system,r.filename,r.foldername,p.path FROM roms as r, rompaths as p WHERE r.has_images IS NULL AND r.present=1 AND p._id=r.pathid LIMIT 20", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                this.f8679n = true;
                return true;
            }
            do {
                int f = mo8816f(rawQuery);
                if (f > 0) {
                    try {
                        Thread.sleep((long) f);
                    } catch (Exception unused2) {
                    }
                }
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        this.f8679n = true;
        ImageService.m9511a(this.f8673h);
        return false;
    }

    /* renamed from: k */
    public void mo8820k() {
        int lastIndexOf;
        File[] b = C2372h2.m10298b(this.f8673h);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        sb.append(b[1]);
        sb.append("/Server/Covers");
        String sb2 = sb.toString();
        if (this.f8669d.mo8190n("moby_next", -1) < 0) {
            Cursor rawQuery = this.f8667b.rawQuery("SELECT system,filename,mdbid FROM roms WHERE mdbid>=0", null);
            rawQuery.moveToFirst();
            while (true) {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(i);
                long j = rawQuery.getLong(2);
                if (!string.equals("pc") && !string.equals("scumm") && !string.equals("android") && (lastIndexOf = string2.lastIndexOf(46)) > 0) {
                    string2 = string2.substring(0, lastIndexOf);
                }
                C2399i2 d = C2399i2.m10374d(this.f8673h, sb2 + "/" + string + "/" + string2 + ".png");
                if (d.exists()) {
                    try {
                        d.renameTo(new File(sb2 + "/" + string + "/" + j + ".png"));
                    } catch (Exception unused) {
                    }
                }
                if (!rawQuery.moveToNext()) {
                    break;
                }
                i = 1;
            }
            rawQuery.close();
            this.f8669d.mo8157F("moby_next", 0);
        }
        Cursor rawQuery2 = this.f8668c.rawQuery("SELECT rowid,url FROM moby WHERE url is not null", null);
        Log.e("ZZX", "to get: " + ((long) rawQuery2.getCount()));
        if (rawQuery2.moveToFirst()) {
            do {
                long j2 = rawQuery2.getLong(0);
                Cursor rawQuery3 = this.f8668c.rawQuery("SELECT s.slug FROM systems as s,games as g WHERE g._id=" + j2 + " AND s._id=g.system", null);
                rawQuery3.moveToFirst();
                String string3 = rawQuery3.getString(0);
                rawQuery3.close();
                C2399i2 d2 = C2399i2.m10374d(this.f8673h, sb2 + "/" + string3 + "/" + j2 + ".png");
                if (d2.exists()) {
                    this.f8668c.execSQL("UPDATE moby SET url=null WHERE rowid=" + j2);
                } else {
                    String str = "http://www.mobygames.com/images/covers/" + rawQuery2.getString(1);
                    this.f8670e.mo6218a(new C2511i(0, str, new C2507e(str, d2), new C2508f(str, j2), null));
                    try {
                        Thread.sleep(10000);
                    } catch (Exception unused2) {
                    }
                }
            } while (rawQuery2.moveToNext());
        }
        rawQuery2.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo8821l() {
        return this.f8679n;
    }

    /* renamed from: m */
    public File[] mo8822m(String str) {
        return C2372h2.m10298b(this.f8673h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo8823n(File file) {
        if (this.f8672g || !file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                if (!mo8823n(file2)) {
                    return false;
                }
            } else if (!mo8824o(file2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo8824o(File file) {
        if (this.f8672g) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        int lastIndexOf = absolutePath.lastIndexOf(46);
        if (lastIndexOf <= 0 || absolutePath.substring(lastIndexOf).equals(".png")) {
            return true;
        }
        String str = absolutePath.substring(0, lastIndexOf) + ".png";
        synchronized (this.f8676k) {
            try {
                file.renameTo(new File(str));
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8825p() {
        File file;
        if (!this.f8672g && !this.f8669d.mo8195s()) {
            File[] m = mo8822m(null);
            if (!this.f8669d.mo8177Z()) {
                file = m[0];
            } else if (m.length >= 2 && m[1] != null) {
                file = m[1];
            } else {
                return;
            }
            if (mo8823n(new File(file.getAbsolutePath() + "/Covers"))) {
                this.f8669d.mo8169R(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized void mo8826q(byte[] bArr, long j) {
        boolean z;
        String str;
        try {
            String str2 = new String(bArr, "UTF-8");
            Cursor rawQuery = this.f8667b.rawQuery("SELECT _id,system,filename,gdbid,cover_status,favorite,gfcover,info,mdbid,publisher,developer,released FROM roms WHERE _id=" + j, null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return;
            }
            String string = rawQuery.getString(1);
            if (Pattern.compile("/browse/games/" + new C2206b2().mo8093f(string) + "/").matcher(str2).find()) {
                ContentValues contentValues = new ContentValues();
                if (string.equals("android")) {
                    contentValues.put("ignored", (Integer) 0);
                    z = true;
                } else {
                    z = false;
                }
                String string2 = rawQuery.getString(9);
                String string3 = rawQuery.getString(10);
                long j2 = rawQuery.getLong(11);
                if (string2 == null || string2.equals("")) {
                    Matcher matcher = Pattern.compile("Published by.*?>(.+?)<\\/a>").matcher(str2);
                    if (matcher.find()) {
                        contentValues.put("publisher", Html.fromHtml(matcher.group(1).replaceAll("&nbsp;", " ")).toString().trim());
                        z = true;
                    }
                }
                if (string3 == null || string3.equals("")) {
                    Matcher matcher2 = Pattern.compile("Developed by.*?>(.+?)<\\/a>").matcher(str2);
                    if (matcher2.find()) {
                        contentValues.put("developer", Html.fromHtml(matcher2.group(1).replaceAll("&nbsp;", " ")).toString().trim());
                        z = true;
                    }
                }
                if (j2 == 0) {
                    Matcher matcher3 = Pattern.compile("Released.*?>(.+?)<\\/a>").matcher(str2);
                    if (matcher3.find()) {
                        contentValues.put("released", Long.valueOf(C2185a4.m9690t(matcher3.group(1))));
                        z = true;
                    }
                }
                Matcher matcher4 = Pattern.compile("<h2>Description<\\/h2>(.+?)<div").matcher(str2);
                if (matcher4.find()) {
                    str = matcher4.group(1).replaceAll("<br>", "\n").replaceAll("<.*?>", "").replaceAll("&quot;", "\"").replaceAll("&amp;", "&") + "[src=moby]";
                } else {
                    str = null;
                }
                String string4 = rawQuery.getString(7);
                long j3 = rawQuery.getLong(8);
                if ((string4 == null || string4.equals("")) && str != null) {
                    if (j3 < 0) {
                        contentValues.put("info", str);
                        z = true;
                    } else {
                        Cursor rawQuery2 = this.f8668c.rawQuery("SELECT info,info_comp FROM games WHERE _id=" + j3, null);
                        if (rawQuery2.moveToFirst()) {
                            String string5 = rawQuery2.getString(0);
                            byte[] blob = rawQuery.getBlob(1);
                            if ((string5 == null || string5.equals("")) && (blob == null || blob.length < 20)) {
                                contentValues.put("info", str);
                                z = true;
                            }
                        }
                        rawQuery2.close();
                    }
                }
                if (z) {
                    this.f8667b.update("roms", contentValues, "_id=" + j, null);
                    C1088a.m6129b(this.f8673h).mo5723d(new Intent(this.f8673h.getPackageName() + "." + "request_refresh"));
                }
                Cursor rawQuery3 = this.f8667b.rawQuery("SELECT rowid FROM gamegenres WHERE game=" + j + " LIMIT 1", null);
                if (!rawQuery3.moveToFirst()) {
                    Matcher matcher5 = Pattern.compile("genre\\/sheet.*?>(.*?)<").matcher(str2);
                    while (matcher5.find()) {
                        this.f8675j.mo8837a(j, this.f8675j.mo8842f(Html.fromHtml(matcher5.group(1).replaceAll("&nbsp;", " ")).toString()));
                    }
                }
                rawQuery3.close();
                Matcher matcher6 = Pattern.compile("og\\:image.*content=\\\"(.*?cover.*?)\\\"").matcher(str2);
                if (matcher6.find()) {
                    mo8817g(rawQuery, 64, matcher6.group(1));
                }
                rawQuery.close();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8827r(long j, int i, boolean z) {
        SQLiteDatabase sQLiteDatabase = this.f8667b;
        sQLiteDatabase.execSQL("UPDATE roms SET cover_status=" + i + " WHERE _id=" + j);
        if (z) {
            SQLiteDatabase sQLiteDatabase2 = this.f8667b;
            sQLiteDatabase2.execSQL("UPDATE roms SET cover_requested=cover_requested-40000000 WHERE _id=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8828s() {
        this.f8672g = true;
        C1088a.m6129b(this.f8673h).mo5723d(new Intent(this.f8673h.getPackageName() + "." + "save_error"));
    }
}
