package p069c.p073b.p074a.p075a.p081d.p084c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.b.a.a.d.c.g */
public class C1319g {

    /* renamed from: a */
    private static final ClassLoader f5580a = C1319g.class.getClassLoader();

    private C1319g() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6868a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6869b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
