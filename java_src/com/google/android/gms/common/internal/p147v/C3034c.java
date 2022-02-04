package com.google.android.gms.common.internal.p147v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.v.c */
public class C3034c {
    /* renamed from: a */
    public static int m12411a(Parcel parcel) {
        return m12424n(parcel, 20293);
    }

    /* renamed from: b */
    public static void m12412b(Parcel parcel, int i) {
        m12426p(parcel, i);
    }

    /* renamed from: c */
    public static void m12413c(Parcel parcel, int i, boolean z) {
        m12427q(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m12414d(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int n = m12424n(parcel, i);
            parcel.writeBundle(bundle);
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m12415e(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int n = m12424n(parcel, i);
            parcel.writeByteArray(bArr);
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m12416f(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int n = m12424n(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m12417g(Parcel parcel, int i, int i2) {
        m12427q(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: h */
    public static void m12418h(Parcel parcel, int i, long j) {
        m12427q(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: i */
    public static void m12419i(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int n = m12424n(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m12420j(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int n = m12424n(parcel, i);
            parcel.writeString(str);
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m12421k(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int n = m12424n(parcel, i);
            parcel.writeStringArray(strArr);
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static <T extends Parcelable> void m12422l(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int n = m12424n(parcel, i);
            int length = tArr.length;
            parcel.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m12425o(parcel, t, i2);
                }
            }
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static <T extends Parcelable> void m12423m(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int n = m12424n(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m12425o(parcel, t, 0);
                }
            }
            m12426p(parcel, n);
        } else if (z) {
            m12427q(parcel, i, 0);
        }
    }

    /* renamed from: n */
    private static int m12424n(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: o */
    private static <T extends Parcelable> void m12425o(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: p */
    private static void m12426p(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: q */
    private static void m12427q(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }
}
