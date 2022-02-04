package com.google.android.gms.common.internal.p147v;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.v.b */
public class C3032b {

    /* renamed from: com.google.android.gms.common.internal.v.b$a */
    public static class C3033a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3033a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.p147v.C3032b.C3033a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static Bundle m12393a(Parcel parcel, int i) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m12394b(Parcel parcel, int i) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + o);
        return createByteArray;
    }

    /* renamed from: c */
    public static <T extends Parcelable> T m12395c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o);
        return createFromParcel;
    }

    /* renamed from: d */
    public static String m12396d(Parcel parcel, int i) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + o);
        return readString;
    }

    /* renamed from: e */
    public static String[] m12397e(Parcel parcel, int i) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + o);
        return createStringArray;
    }

    /* renamed from: f */
    public static <T> T[] m12398f(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + o);
        return tArr;
    }

    /* renamed from: g */
    public static <T> ArrayList<T> m12399g(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + o);
        return createTypedArrayList;
    }

    /* renamed from: h */
    public static void m12400h(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C3033a(sb.toString(), parcel);
        }
    }

    /* renamed from: i */
    public static int m12401i(int i) {
        return i & 65535;
    }

    /* renamed from: j */
    public static boolean m12402j(Parcel parcel, int i) {
        m12410r(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: k */
    public static int m12403k(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: l */
    public static IBinder m12404l(Parcel parcel, int i) {
        int o = m12407o(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (o == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o);
        return readStrongBinder;
    }

    /* renamed from: m */
    public static int m12405m(Parcel parcel, int i) {
        m12410r(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: n */
    public static long m12406n(Parcel parcel, int i) {
        m12410r(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: o */
    public static int m12407o(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: p */
    public static void m12408p(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m12407o(parcel, i));
    }

    /* renamed from: q */
    public static int m12409q(Parcel parcel) {
        int k = m12403k(parcel);
        int o = m12407o(parcel, k);
        int dataPosition = parcel.dataPosition();
        if (m12401i(k) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(k));
            throw new C3033a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = o + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C3033a(sb.toString(), parcel);
    }

    /* renamed from: r */
    private static void m12410r(Parcel parcel, int i, int i2) {
        int o = m12407o(parcel, i);
        if (o != i2) {
            String hexString = Integer.toHexString(o);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(o);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C3033a(sb.toString(), parcel);
        }
    }
}
