package com.digdroid.alman.dig;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.k0 */
class C2451k0 {

    /* renamed from: a */
    Context f8549a;

    /* renamed from: b */
    long f8550b;

    /* renamed from: c */
    long f8551c;

    /* renamed from: d */
    C2219c3 f8552d;

    /* renamed from: e */
    SQLiteDatabase f8553e;

    /* renamed from: f */
    C2375h3 f8554f;

    /* renamed from: g */
    String f8555g;

    /* renamed from: h */
    String f8556h;

    /* renamed from: i */
    String f8557i;

    /* renamed from: j */
    String f8558j;

    /* renamed from: k */
    String f8559k;

    public C2451k0(Context context, long j) {
        this.f8549a = context;
        this.f8550b = j;
        this.f8552d = C2219c3.m9805k(context);
        C2775u e = C2775u.m11726e(context.getApplicationContext());
        e.mo9329h();
        this.f8553e = e.mo9325c();
        C2375h3 r = C2375h3.m10306r(context, e);
        this.f8554f = r;
        r.mo8543C();
    }

    /* renamed from: a */
    public boolean mo8698a() {
        SQLiteDatabase sQLiteDatabase = this.f8553e;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT system,filename,title,mdbid FROM roms WHERE _id=" + this.f8550b, null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return false;
        }
        this.f8555g = rawQuery.getString(0);
        this.f8557i = rawQuery.getString(1);
        this.f8558j = rawQuery.getString(2);
        this.f8551c = rawQuery.getLong(3);
        this.f8556h = this.f8554f.mo8569t(this.f8555g);
        this.f8559k = this.f8554f.mo8568s(this.f8555g);
        rawQuery.close();
        return true;
    }

    /* renamed from: b */
    public Bitmap mo8699b(int i) {
        return mo8700c(mo8701d(), i);
    }

    /* renamed from: c */
    public Bitmap mo8700c(File file, int i) {
        if (file.exists()) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i2 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                while (true) {
                    int i3 = i2 * 2;
                    if (Math.max(options.outHeight, options.outWidth) / i3 > C2185a4.m9675e(this.f8549a, (float) i)) {
                        i2 = i3;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i2;
                        return BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        } else if (this.f8556h.equals("android")) {
            return ((BitmapDrawable) this.f8549a.getPackageManager().getApplicationIcon(this.f8557i)).getBitmap();
        } else {
            return null;
        }
    }

    /* renamed from: d */
    public File mo8701d() {
        int lastIndexOf;
        String h = C2185a4.m9678h(this.f8549a);
        String str = h + "/Covers";
        String str2 = h + "/Screenshots";
        if (!this.f8556h.equals("pc") && !this.f8556h.equals("scumm") && !this.f8556h.equals("android") && (lastIndexOf = this.f8557i.lastIndexOf(46)) > 0) {
            this.f8557i = this.f8557i.substring(0, lastIndexOf);
        }
        File file = new File(str + "/" + this.f8556h + "/" + this.f8557i + ".png");
        if (file.exists()) {
            return file;
        }
        return new File(str2 + "/" + this.f8556h + "/" + this.f8557i + ".png");
    }

    /* renamed from: e */
    public boolean mo8702e() {
        SQLiteDatabase sQLiteDatabase = this.f8553e;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT slug,name FROM systems WHERE _id=" + this.f8550b, null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return false;
        }
        this.f8555g = rawQuery.getString(0);
        this.f8557i = rawQuery.getString(1);
        this.f8556h = this.f8554f.mo8569t(this.f8555g);
        rawQuery.close();
        return true;
    }

    /* renamed from: f */
    public Bitmap mo8703f(int i) {
        File externalFilesDir = this.f8549a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return mo8700c(new File(externalFilesDir.getAbsolutePath() + "/Systems/icons/" + this.f8555g + ".png"), i);
    }
}
