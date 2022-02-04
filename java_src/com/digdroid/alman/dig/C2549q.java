package com.digdroid.alman.dig;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.q */
public class C2549q {

    /* renamed from: a */
    Context f8851a;

    /* renamed from: b */
    C2219c3 f8852b;

    /* renamed from: c */
    AbstractC2526p f8853c = new C2548p3();

    /* renamed from: d */
    AbstractC2526p f8854d = new C2323g0();

    /* renamed from: e */
    AbstractC2526p f8855e;

    /* renamed from: f */
    AbstractC2526p f8856f;

    /* renamed from: g */
    AbstractC2526p f8857g;

    /* renamed from: h */
    AbstractC2526p f8858h;

    /* renamed from: i */
    AbstractC2526p f8859i = new C2825w();

    public C2549q(Context context, SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        this.f8851a = context;
        this.f8852b = C2219c3.m9805k(context);
        this.f8855e = new C2259e(sQLiteDatabase, sQLiteDatabase2);
        this.f8856f = new C2222d(sQLiteDatabase, sQLiteDatabase2);
        this.f8857g = new C2206b2(sQLiteDatabase, sQLiteDatabase2);
        this.f8858h = new C2218c2(sQLiteDatabase, sQLiteDatabase2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8953a(int i) {
        mo8954b(i).mo8881a();
    }

    /* renamed from: b */
    public AbstractC2526p mo8954b(int i) {
        return (i == 32 || i == 64) ? this.f8857g : i == 16 ? this.f8858h : i == 256 ? this.f8855e : i == 8 ? this.f8856f : i == 4 ? this.f8854d : (i == 512 || i == 4096) ? this.f8859i : this.f8853c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo8955c(int i, String str, long j, long j2, String str2) {
        return mo8954b(i).mo8092c(i, str, j, j2, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo8956d(int i) {
        return mo8954b(i).mo8883e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8957e(int i, int i2, long j, String str) {
        if (i2 == 64) {
            i2 = 32;
        }
        int i3 = i & (i2 ^ -1);
        if ((i3 & 4) != 0 && (str == null || str.equals(""))) {
            i3 &= -5;
        }
        if ((i3 & 1) != 0 && j < 0) {
            i3 &= -2;
        }
        if ((i3 & 2) != 0 && j < 0) {
            i3 &= -3;
        }
        if (i2 == 4096) {
            i3 |= 8192;
        }
        return (i3 & 8063) != 0 ? i3 | 16384 : i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo8958f() {
        int i = !this.f8853c.mo8883e() ? 3 : 0;
        if (!this.f8859i.mo8883e()) {
            i |= 4608;
        }
        if (!this.f8854d.mo8883e()) {
            i |= 4;
        }
        if (!this.f8855e.mo8883e()) {
            i |= 256;
        }
        if (!this.f8856f.mo8883e()) {
            i |= 8;
        }
        return "cover_status>=16384" + " AND (cover_status & " + i + ")!=0 AND (ignored=0 OR system='android') AND present=1";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8959g(int i, long j, String str) {
        if ((i & 4096) != 0 && (i & 8192) == 0 && !mo8956d(512)) {
            return 4096;
        }
        if ((i & 512) != 0 && !mo8956d(512)) {
            return 512;
        }
        if ((i & 1) != 0 && j >= 0 && !mo8956d(1)) {
            return 1;
        }
        if ((i & 2) != 0 && j >= 0 && !mo8956d(2)) {
            return 2;
        }
        if ((i & 4) != 0 && str != null && !str.equals("") && !mo8956d(4)) {
            return 4;
        }
        if ((i & 256) == 0 || mo8956d(256)) {
            return ((i & 8) == 0 || mo8956d(8)) ? 0 : 8;
        }
        return 256;
    }
}
