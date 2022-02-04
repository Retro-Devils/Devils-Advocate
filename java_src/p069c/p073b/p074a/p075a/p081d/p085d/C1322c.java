package p069c.p073b.p074a.p075a.p081d.p085d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.b.a.a.d.d.c */
public class C1322c {

    /* renamed from: a */
    private static final ClassLoader f5583a = C1322c.class.getClassLoader();

    private C1322c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6873a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6874b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static boolean m6875c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
