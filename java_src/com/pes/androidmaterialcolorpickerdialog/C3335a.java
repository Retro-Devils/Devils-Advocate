package com.pes.androidmaterialcolorpickerdialog;

/* access modifiers changed from: package-private */
/* renamed from: com.pes.androidmaterialcolorpickerdialog.a */
public final class C3335a {
    /* renamed from: a */
    static int m13922a(int i) {
        if (i < 0 || i > 255) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    static String m13923b(int i, int i2, int i3) {
        return String.format("%02X%02X%02X", Integer.valueOf(m13922a(i)), Integer.valueOf(m13922a(i2)), Integer.valueOf(m13922a(i3)));
    }

    /* renamed from: c */
    static String m13924c(int i, int i2, int i3, int i4) {
        return String.format("%02X%02X%02X%02X", Integer.valueOf(m13922a(i)), Integer.valueOf(m13922a(i2)), Integer.valueOf(m13922a(i3)), Integer.valueOf(m13922a(i4)));
    }
}
