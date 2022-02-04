package android.support.p004v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0019a();

        /* renamed from: b */
        private final MediaDescriptionCompat f42b;

        /* renamed from: c */
        private final long f43c;

        /* renamed from: d */
        private Object f44d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0019a implements Parcelable.Creator<QueueItem> {
            C0019a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f42b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f43c = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f42b = mediaDescriptionCompat;
                this.f43c = j;
                this.f44d = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: b */
        public static QueueItem m58b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m11b(C0039f.m135a(obj)), C0039f.m136b(obj));
        }

        /* renamed from: g */
        public static List<QueueItem> m59g(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m58b(it.next()));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f42b + ", Id=" + this.f43c + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f42b.writeToParcel(parcel, i);
            parcel.writeLong(this.f43c);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0020a();

        /* renamed from: b */
        ResultReceiver f45b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0020a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0020a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f45b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f45b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0021a();

        /* renamed from: b */
        private final Object f46b;

        /* renamed from: c */
        private AbstractC0027b f47c;

        /* renamed from: d */
        private Bundle f48d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0021a implements Parcelable.Creator<Token> {
            C0021a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, AbstractC0027b bVar, Bundle bundle) {
            this.f46b = obj;
            this.f47c = bVar;
            this.f48d = bundle;
        }

        /* renamed from: b */
        public AbstractC0027b mo71b() {
            return this.f47c;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f46b;
            Object obj3 = ((Token) obj).f46b;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: g */
        public void mo74g(AbstractC0027b bVar) {
            this.f47c = bVar;
        }

        /* renamed from: h */
        public void mo75h(Bundle bundle) {
            this.f48d = bundle;
        }

        public int hashCode() {
            Object obj = this.f46b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f46b, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f46b);
            }
        }
    }

    /* renamed from: a */
    public static void m57a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
