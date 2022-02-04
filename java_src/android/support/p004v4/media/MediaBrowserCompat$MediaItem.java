package android.support.p004v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0007a();

    /* renamed from: b */
    private final int f10b;

    /* renamed from: c */
    private final MediaDescriptionCompat f11c;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0007a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0007a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f10b = parcel.readInt();
        this.f11c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f10b + ", mDescription=" + this.f11c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10b);
        this.f11c.writeToParcel(parcel, i);
    }
}
