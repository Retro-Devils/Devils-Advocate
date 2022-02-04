package p069c.p073b.p074a.p090b.p091a0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p006b.p021d.C0838i;
import p006b.p043i.p044a.AbstractC1041a;

/* renamed from: c.b.a.b.a0.a */
public class C1389a extends AbstractC1041a {
    public static final Parcelable.Creator<C1389a> CREATOR = new C1390a();

    /* renamed from: d */
    public final C0838i<String, Bundle> f5675d;

    /* renamed from: c.b.a.b.a0.a$a */
    static class C1390a implements Parcelable.ClassLoaderCreator<C1389a> {
        C1390a() {
        }

        /* renamed from: a */
        public C1389a createFromParcel(Parcel parcel) {
            return new C1389a(parcel, null, null);
        }

        /* renamed from: b */
        public C1389a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1389a(parcel, classLoader, null);
        }

        /* renamed from: c */
        public C1389a[] newArray(int i) {
            return new C1389a[i];
        }
    }

    private C1389a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f5675d = new C0838i<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f5675d.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C1389a(Parcel parcel, ClassLoader classLoader, C1390a aVar) {
        this(parcel, classLoader);
    }

    public C1389a(Parcelable parcelable) {
        super(parcelable);
        this.f5675d = new C0838i<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f5675d + "}";
    }

    @Override // p006b.p043i.p044a.AbstractC1041a
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f5675d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f5675d.mo5011i(i2);
            bundleArr[i2] = this.f5675d.mo5016m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
