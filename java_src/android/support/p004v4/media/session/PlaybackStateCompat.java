package android.support.p004v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p004v4.media.session.C0040g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0024a();

    /* renamed from: b */
    final int f54b;

    /* renamed from: c */
    final long f55c;

    /* renamed from: d */
    final long f56d;

    /* renamed from: e */
    final float f57e;

    /* renamed from: f */
    final long f58f;

    /* renamed from: g */
    final int f59g;

    /* renamed from: h */
    final CharSequence f60h;

    /* renamed from: i */
    final long f61i;

    /* renamed from: j */
    List<CustomAction> f62j;

    /* renamed from: k */
    final long f63k;

    /* renamed from: l */
    final Bundle f64l;

    /* renamed from: m */
    private Object f65m;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0023a();

        /* renamed from: b */
        private final String f66b;

        /* renamed from: c */
        private final CharSequence f67c;

        /* renamed from: d */
        private final int f68d;

        /* renamed from: e */
        private final Bundle f69e;

        /* renamed from: f */
        private Object f70f;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0023a implements Parcelable.Creator<CustomAction> {
            C0023a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f66b = parcel.readString();
            this.f67c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f68d = parcel.readInt();
            this.f69e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f66b = str;
            this.f67c = charSequence;
            this.f68d = i;
            this.f69e = bundle;
        }

        /* renamed from: b */
        public static CustomAction m72b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0040g.C0041a.m146a(obj), C0040g.C0041a.m149d(obj), C0040g.C0041a.m148c(obj), C0040g.C0041a.m147b(obj));
            customAction.f70f = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f67c) + ", mIcon=" + this.f68d + ", mExtras=" + this.f69e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f66b);
            TextUtils.writeToParcel(this.f67c, parcel, i);
            parcel.writeInt(this.f68d);
            parcel.writeBundle(this.f69e);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0024a implements Parcelable.Creator<PlaybackStateCompat> {
        C0024a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f54b = i;
        this.f55c = j;
        this.f56d = j2;
        this.f57e = f;
        this.f58f = j3;
        this.f59g = i2;
        this.f60h = charSequence;
        this.f61i = j4;
        this.f62j = new ArrayList(list);
        this.f63k = j5;
        this.f64l = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f54b = parcel.readInt();
        this.f55c = parcel.readLong();
        this.f57e = parcel.readFloat();
        this.f61i = parcel.readLong();
        this.f56d = parcel.readLong();
        this.f58f = parcel.readLong();
        this.f60h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f62j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f63k = parcel.readLong();
        this.f64l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f59g = parcel.readInt();
    }

    /* renamed from: b */
    public static PlaybackStateCompat m71b(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0040g.m140d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object obj2 : d) {
                arrayList2.add(CustomAction.m72b(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0042h.m150a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0040g.m145i(obj), C0040g.m144h(obj), C0040g.m139c(obj), C0040g.m143g(obj), C0040g.m137a(obj), 0, C0040g.m141e(obj), C0040g.m142f(obj), arrayList, C0040g.m138b(obj), bundle);
        playbackStateCompat.f65m = obj;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f54b + ", position=" + this.f55c + ", buffered position=" + this.f56d + ", speed=" + this.f57e + ", updated=" + this.f61i + ", actions=" + this.f58f + ", error code=" + this.f59g + ", error message=" + this.f60h + ", custom actions=" + this.f62j + ", active item id=" + this.f63k + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f54b);
        parcel.writeLong(this.f55c);
        parcel.writeFloat(this.f57e);
        parcel.writeLong(this.f61i);
        parcel.writeLong(this.f56d);
        parcel.writeLong(this.f58f);
        TextUtils.writeToParcel(this.f60h, parcel, i);
        parcel.writeTypedList(this.f62j);
        parcel.writeLong(this.f63k);
        parcel.writeBundle(this.f64l);
        parcel.writeInt(this.f59g);
    }
}
