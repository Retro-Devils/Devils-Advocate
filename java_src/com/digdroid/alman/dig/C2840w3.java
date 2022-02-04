package com.digdroid.alman.dig;

import android.content.Context;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.w3 */
public class C2840w3 extends C2492n {
    public C2840w3(Context context) {
        super(context);
        mo8783t(false);
    }

    /* renamed from: A */
    public void mo9413A(String str) {
        mo8782s("kickstart_rom_file", str);
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: r */
    public boolean mo8781r(String str) {
        mo9414u();
        C2399i2 d = C2399i2.m10374d(this.f8647a, mo9415v());
        super.mo8781r(new C2399i2(d, str).getAbsolutePath());
        mo8782s("use_gui", "no");
        return super.mo8781r(new C2399i2(d, "uaeconfig.uae").getAbsolutePath());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[Catch:{ Exception -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020 A[Catch:{ Exception -> 0x0033 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9414u() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f8647a
            java.lang.String r1 = r3.mo9415v()
            com.digdroid.alman.dig.i2 r0 = com.digdroid.alman.dig.C2399i2.m10374d(r0, r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0013
            r0.mkdirs()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            com.digdroid.alman.dig.i2 r1 = new com.digdroid.alman.dig.i2     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "Dig - Amiga 500.uae"
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0033 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x0023
            r1.delete()     // Catch:{ Exception -> 0x0033 }
        L_0x0023:
            com.digdroid.alman.dig.i2 r1 = new com.digdroid.alman.dig.i2     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "Dig - Amiga 1200.uae"
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0033 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            r1.delete()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2840w3.mo9414u():void");
    }

    /* renamed from: v */
    public String mo9415v() {
        Context context = this.f8647a;
        return new C2399i2(C2399i2.m10374d(context, C2219c3.m9805k(context).mo8193q("dig_dir", "")), "Emu config/UAE").getAbsolutePath();
    }

    /* renamed from: w */
    public boolean mo9416w() {
        mo9414u();
        return super.mo8781r(mo9415v() + "/uaeconfig.uae");
    }

    /* renamed from: x */
    public void mo9417x(String str) {
        mo8782s("config_description", str);
    }

    /* renamed from: y */
    public void mo9418y(int i, String str) {
        mo8782s("floppy" + i, str);
    }

    /* renamed from: z */
    public void mo9419z(String str) {
        String str2;
        String str3;
        StringBuilder sb;
        this.f8648b += "\n";
        if (!new File(str).isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rw,DH0:");
            sb2.append(str);
            str3 = ",32,1,2,512,0,,uae";
            sb2.append(str3);
            mo8782s("hardfile2", sb2.toString());
            sb = new StringBuilder();
            str2 = "hdf,rw,DH0:";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rw,DH0:DH0:");
            sb3.append(str);
            str3 = "/,0";
            sb3.append(str3);
            mo8782s("filesystem2", sb3.toString());
            sb = new StringBuilder();
            str2 = "dir,rw,DH0:DH0:";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(str3);
        mo8782s("uaehf0", sb.toString());
    }
}
