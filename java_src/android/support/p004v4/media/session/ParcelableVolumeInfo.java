package android.support.p004v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0022a();

    /* renamed from: b */
    public int f49b;

    /* renamed from: c */
    public int f50c;

    /* renamed from: d */
    public int f51d;

    /* renamed from: e */
    public int f52e;

    /* renamed from: f */
    public int f53f;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0022a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0022a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f49b = parcel.readInt();
        this.f51d = parcel.readInt();
        this.f52e = parcel.readInt();
        this.f53f = parcel.readInt();
        this.f50c = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f49b);
        parcel.writeInt(this.f51d);
        parcel.writeInt(this.f52e);
        parcel.writeInt(this.f53f);
        parcel.writeInt(this.f50c);
    }
}
