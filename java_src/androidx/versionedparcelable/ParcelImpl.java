package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0750a();

    /* renamed from: b */
    private final AbstractC0753c f3551b;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0750a implements Parcelable.Creator<ParcelImpl> {
        C0750a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3551b = new C0752b(parcel).mo4549u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0752b(parcel).mo4530L(this.f3551b);
    }
}
