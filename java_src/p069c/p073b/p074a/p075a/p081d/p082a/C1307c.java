package p069c.p073b.p074a.p075a.p081d.p082a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.b.a.a.d.a.c */
public class C1307c {

    /* renamed from: a */
    private static final ClassLoader f5573a = C1307c.class.getClassLoader();

    private C1307c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6827a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6828b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m6829c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
