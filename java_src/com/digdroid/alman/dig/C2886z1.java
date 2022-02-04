package com.digdroid.alman.dig;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.z1 */
public class C2886z1 {

    /* renamed from: a */
    private static SQLiteDatabase f9708a;

    /* renamed from: b */
    private static C2881y1 f9709b;

    /* renamed from: c */
    private static C2886z1 f9710c;

    /* renamed from: d */
    Context f9711d;

    /* renamed from: e */
    C2219c3 f9712e;

    /* renamed from: f */
    String f9713f;

    private C2886z1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f9711d = applicationContext;
        this.f9712e = C2219c3.m9805k(applicationContext);
        this.f9713f = context.getDatabasePath("games.db").getAbsolutePath().replace("games.db", "masterbase.db");
    }

    /* renamed from: b */
    public static synchronized C2886z1 m11967b(Context context) {
        C2886z1 z1Var;
        synchronized (C2886z1.class) {
            if (f9710c == null) {
                f9710c = new C2886z1(context);
            }
            z1Var = f9710c;
        }
        return z1Var;
    }

    /* renamed from: a */
    public SQLiteDatabase mo9515a() {
        return f9709b.getWritableDatabase();
    }

    /* renamed from: c */
    public synchronized boolean mo9516c() {
        if (f9708a != null) {
            return true;
        }
        if (!new File(this.f9713f).exists() || this.f9712e.mo8188l("data_version", 0) < 463) {
            try {
                new File(this.f9713f).delete();
                new File(this.f9713f + "-journal").delete();
                new File(this.f9713f + "-shm").delete();
                new File(this.f9713f + "-wal").delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!new C2785v(this.f9711d, "masterbase.7z", this.f9713f).mo9336a()) {
                return false;
            }
        }
        C2881y1 a = C2881y1.m11931a(this.f9711d, "masterbase.db");
        f9709b = a;
        SQLiteDatabase writableDatabase = a.getWritableDatabase();
        f9708a = writableDatabase;
        writableDatabase.acquireReference();
        return true;
    }
}
