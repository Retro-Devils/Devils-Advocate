package com.digdroid.alman.dig;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.y1 */
public class C2881y1 extends SQLiteOpenHelper {

    /* renamed from: b */
    private static C2881y1 f9698b;

    private C2881y1(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static synchronized C2881y1 m11931a(Context context, String str) {
        C2881y1 y1Var;
        synchronized (C2881y1.class) {
            if (f9698b == null) {
                f9698b = new C2881y1(context.getApplicationContext(), str);
            }
            y1Var = f9698b;
        }
        return y1Var;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
