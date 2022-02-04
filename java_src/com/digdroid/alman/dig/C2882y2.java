package com.digdroid.alman.dig;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.y2 */
public class C2882y2 extends C2492n {

    /* renamed from: f */
    private static int f9707f;

    public C2882y2(Context context) {
        super(context);
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir, "retroarch.cfg");
            if (file.exists()) {
                mo8774k(C2399i2.m10373c(file));
                String w = m11934w(context);
                String i = mo8772i("assets_directory");
                if ((w.equals("com.retroarch") && !i.contains("com.retroarch/assets")) || ((w.equals("com.retroarch.aarch64") && !i.contains("com.retroarch.aarch64/assets")) || (w.equals("com.retroarch.ra32") && !i.contains("com.retroarch.ra32/assets")))) {
                    try {
                        file.delete();
                        this.f8648b = "";
                    } catch (Exception unused) {
                    }
                } else {
                    return;
                }
            }
            externalFilesDir = !file.exists() ? new File(file.getAbsolutePath().replaceAll(context.getPackageName(), m11934w(context))) : file;
        }
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            mo8773j("Retroarch/retroarch.cfg");
        } else {
            mo8774k(C2399i2.m10373c(externalFilesDir));
        }
    }

    /* renamed from: u */
    static String m11932u(Context context) {
        String str = context.getExternalFilesDir(null).getAbsolutePath().replaceAll(context.getPackageName(), m11934w(context)) + "/retroarch.cfg";
        C2399i2 d = C2399i2.m10374d(context, str);
        if (Build.VERSION.SDK_INT < 30 || d.exists()) {
            return str;
        }
        return null;
    }

    /* renamed from: v */
    static String m11933v(Context context, int i) {
        String string = i == 0 ? context.getString(R.string.defaultIcons) : i == 1 ? "64 bit" : i == 2 ? "32 bit" : "";
        return string + " RetroArch";
    }

    /* renamed from: w */
    public static String m11934w(Context context) {
        int i = f9707f;
        if (i == 0) {
            return "com.retroarch";
        }
        if (i == 2) {
            return "com.retroarch.ra32";
        }
        if (i == 1) {
            return "com.retroarch.aarch64";
        }
        return null;
    }

    /* renamed from: x */
    static String m11935x(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        return absolutePath.replaceAll(context.getPackageName() + "/files", m11934w(context));
    }

    /* renamed from: y */
    public static void m11936y(int i) {
        f9707f = i;
    }
}
