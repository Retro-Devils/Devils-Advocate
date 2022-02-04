package com.digdroid.alman.dig;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.z */
public class C2884z extends C2492n {
    C2884z(Context context) {
        super(context);
    }

    /* renamed from: u */
    public String mo9505u() {
        Context context = this.f8639a;
        return new C2399i2(C2399i2.m10374d(context, C2219c3.m9805k(context).mo8193q("dig_dir", "")), "Emu config/Dosbox").getAbsolutePath();
    }

    /* renamed from: v */
    public String mo9506v() {
        return new C2399i2(C2399i2.m10374d(this.f8639a, mo9505u()), "dosbox.conf").getAbsolutePath();
    }

    /* renamed from: w */
    public void mo9507w() {
        mo8774k(C2399i2.m10374d(this.f8639a, mo9506v()));
        if (this.f8640b.equals("")) {
            mo8773j("DOSBox/dosbox.conf");
        }
    }

    /* renamed from: x */
    public boolean mo9508x() {
        File file = new File(mo9505u());
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception unused) {
            }
        }
        return super.mo8781r(mo9506v());
    }

    /* renamed from: y */
    public void mo9509y(String str) {
        this.f8640b = Pattern.compile("mount c.*$", 32).matcher(this.f8640b).replaceAll("");
        int lastIndexOf = str.lastIndexOf(47);
        String substring = str.substring(lastIndexOf + 1);
        this.f8640b += "\nmount c: \"" + str.substring(0, lastIndexOf) + "\"\n";
        this.f8640b += "c:\n";
        if (!substring.equals("DOS")) {
            this.f8640b += substring + "\n";
            this.f8640b += "exit\n";
        }
    }
}
