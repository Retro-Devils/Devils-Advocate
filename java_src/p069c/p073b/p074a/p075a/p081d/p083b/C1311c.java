package p069c.p073b.p074a.p075a.p081d.p083b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.b.a.a.d.b.c */
public class C1311c {

    /* renamed from: a */
    private static final ClassLoader f5584a = C1311c.class.getClassLoader();

    private C1311c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6833a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6834b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
