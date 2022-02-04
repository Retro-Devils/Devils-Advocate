package android.support.p004v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0011a();

    /* renamed from: b */
    private final int f35b;

    /* renamed from: c */
    private final float f36c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0011a implements Parcelable.Creator<RatingCompat> {
        C0011a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f35b = i;
        this.f36c = f;
    }

    public int describeContents() {
        return this.f35b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f35b);
        sb.append(" rating=");
        float f = this.f36c;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35b);
        parcel.writeFloat(this.f36c);
    }
}
