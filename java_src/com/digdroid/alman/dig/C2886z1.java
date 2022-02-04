package com.digdroid.alman.dig;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.z1 */
public class C2886z1 {

    /* renamed from: a */
    private static SQLiteDatabase f9716a;

    /* renamed from: b */
    private static C2881y1 f9717b;

    /* renamed from: c */
    private static C2886z1 f9718c;

    /* renamed from: d */
    Context f9719d;

    /* renamed from: e */
    C2219c3 f9720e;

    /* renamed from: f */
    String f9721f;

    private C2886z1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f9719d = applicationContext;
        this.f9720e = C2219c3.m9805k(applicationContext);
        this.f9721f = context.getDatabasePath("games.db").getAbsolutePath().replace("games.db", "masterbase.db");
    }

    /* renamed from: b */
    public static synchronized C2886z1 m11967b(Context context) {
        C2886z1 z1Var;
        synchronized (C2886z1.class) {
            if (f9718c == null) {
                f9718c = new C2886z1(context);
            }
            z1Var = f9718c;
        }
        return z1Var;
    }

    /* renamed from: a */
    public SQLiteDatabase mo9515a() {
        return f9717b.getWritableDatabase();
    }

    /* renamed from: c */
    public synchronized boolean mo9516c() {
        if (f9716a != null) {
            return true;
        }
        if (!new File(this.f9721f).exists() || this.f9720e.mo8188l("data_version", 0) < 463) {
            try {
                new File(this.f9721f).delete();
                new File(this.f9721f + "-journal").delete();
                new File(this.f9721f + "-shm").delete();
                new File(this.f9721f + "-wal").delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!new C2785v(this.f9719d, "masterbase.7z", this.f9721f).mo9336a()) {
                return false;
            }
        }
        C2881y1 a = C2881y1.m11931a(this.f9719d, "masterbase.db");
        f9717b = a;
        SQLiteDatabase writableDatabase = a.getWritableDatabase();
        f9716a = writableDatabase;
        writableDatabase.acquireReference();
        return true;
    }
}
