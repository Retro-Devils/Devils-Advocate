package com.digdroid.alman.dig;

import android.content.Context;
import java.io.File;
import java.util.HashSet;

/* renamed from: com.digdroid.alman.dig.y3 */
public class C2883y3 extends C2492n {

    /* renamed from: f */
    private static C2883y3 f9708f;

    /* renamed from: g */
    private int f9709g;

    /* renamed from: h */
    private int f9710h;

    /* renamed from: i */
    HashSet<String> f9711i;

    /* renamed from: j */
    long f9712j;

    private C2883y3(Context context) {
        super(context);
        mo9504z();
    }

    /* renamed from: A */
    private void m11937A(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m11937A(file2);
                } else {
                    this.f9712j += file2.length();
                }
            }
        }
    }

    /* renamed from: B */
    private void m11938B() {
        File[] listFiles;
        this.f9712j = 0;
        File w = m11941w();
        if (!(w == null || (listFiles = w.listFiles()) == null)) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    if (this.f9711i.contains(file.getAbsolutePath())) {
                        m11937A(file);
                    } else {
                        mo9503v(file, false);
                    }
                }
            }
        }
    }

    /* renamed from: C */
    private void m11939C() {
        mo8774k(C2399i2.m10373c(m11942x()));
        mo8775l();
        this.f9711i = new HashSet<>();
        this.f9709g = mo8770g("first_game", 1);
        this.f9710h = mo8770g("last_game", 0);
        for (int i = this.f9709g; i <= this.f9710h; i++) {
            String i2 = mo8772i("" + i);
            if (!i2.equals("")) {
                this.f9711i.add(i2);
            }
        }
    }

    /* renamed from: E */
    private void m11940E() {
        mo8779p("first_game", this.f9709g);
        mo8779p("last_game", this.f9710h);
        mo8781r(m11942x().getAbsolutePath());
    }

    /* renamed from: w */
    private File m11941w() {
        return C2185a4.m9663A(this.f8647a);
    }

    /* renamed from: x */
    private File m11942x() {
        File filesDir = this.f8647a.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, "unzippedgames.txt");
        }
        return null;
    }

    /* renamed from: y */
    public static synchronized C2883y3 m11943y(Context context) {
        C2883y3 y3Var;
        synchronized (C2883y3.class) {
            if (f9708f == null) {
                f9708f = new C2883y3(context);
            }
            y3Var = f9708f;
        }
        return y3Var;
    }

    /* renamed from: D */
    public synchronized void mo9501D(long j) {
        C2399i2 d;
        boolean z = false;
        long l = ((long) (C2219c3.m9805k(this.f8647a).mo8188l("game_cache_size", 0) * 1024)) * 1024;
        while (this.f9712j + j > l && this.f9709g <= this.f9710h) {
            String i = mo8772i("" + this.f9709g);
            if (!i.equals("") && (d = C2399i2.m10374d(this.f8647a, i)) != null && m11941w().exists()) {
                mo9503v(d, true);
            }
            mo8765a("" + this.f9709g);
            this.f9709g = this.f9709g + 1;
            z = true;
        }
        if (z) {
            m11940E();
        }
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8765a(String str) {
        super.mo8765a(str);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: d */
    public /* bridge */ /* synthetic */ String mo8767d() {
        return super.mo8767d();
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: g */
    public /* bridge */ /* synthetic */ int mo8770g(String str, int i) {
        return super.mo8770g(str, i);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo8773j(String str) {
        super.mo8773j(str);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo8774k(C2399i2 i2Var) {
        super.mo8774k(i2Var);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo8775l() {
        super.mo8775l();
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo8779p(String str, int i) {
        super.mo8779p(str, i);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo8781r(String str) {
        return super.mo8781r(str);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: s */
    public /* bridge */ /* synthetic */ void mo8782s(String str, String str2) {
        super.mo8782s(str, str2);
    }

    /* renamed from: u */
    public synchronized void mo9502u(String str, long j) {
        if (this.f9711i.contains(str)) {
            for (int i = this.f9709g; i <= this.f9710h; i++) {
                if (mo8772i("" + i).equals(str)) {
                    this.f9710h++;
                    mo8782s("" + this.f9710h, str);
                    mo8765a("" + i);
                    m11940E();
                    return;
                }
            }
        }
        this.f9710h++;
        mo8782s("" + this.f9710h, str);
        this.f9712j = this.f9712j + j;
        this.f9711i.add(str);
        m11940E();
    }

    /* renamed from: v */
    public synchronized void mo9503v(File file, boolean z) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    mo9503v(file, z);
                } else {
                    try {
                        long length = file2.length();
                        file2.delete();
                        if (z) {
                            this.f9712j -= length;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            try {
                file.delete();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: z */
    public void mo9504z() {
        m11939C();
        m11938B();
        mo9501D(0);
    }
}
