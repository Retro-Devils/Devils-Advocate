package android.support.p004v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p004v4.media.C0013b;
import android.support.p004v4.media.C0015c;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0008a();

    /* renamed from: b */
    private final String f12b;

    /* renamed from: c */
    private final CharSequence f13c;

    /* renamed from: d */
    private final CharSequence f14d;

    /* renamed from: e */
    private final CharSequence f15e;

    /* renamed from: f */
    private final Bitmap f16f;

    /* renamed from: g */
    private final Uri f17g;

    /* renamed from: h */
    private final Bundle f18h;

    /* renamed from: i */
    private final Uri f19i;

    /* renamed from: j */
    private Object f20j;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0008a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0008a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m11b(C0013b.m29a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0009b {

        /* renamed from: a */
        private String f21a;

        /* renamed from: b */
        private CharSequence f22b;

        /* renamed from: c */
        private CharSequence f23c;

        /* renamed from: d */
        private CharSequence f24d;

        /* renamed from: e */
        private Bitmap f25e;

        /* renamed from: f */
        private Uri f26f;

        /* renamed from: g */
        private Bundle f27g;

        /* renamed from: h */
        private Uri f28h;

        /* renamed from: a */
        public MediaDescriptionCompat mo28a() {
            return new MediaDescriptionCompat(this.f21a, this.f22b, this.f23c, this.f24d, this.f25e, this.f26f, this.f27g, this.f28h);
        }

        /* renamed from: b */
        public C0009b mo29b(CharSequence charSequence) {
            this.f24d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0009b mo30c(Bundle bundle) {
            this.f27g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0009b mo31d(Bitmap bitmap) {
            this.f25e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0009b mo32e(Uri uri) {
            this.f26f = uri;
            return this;
        }

        /* renamed from: f */
        public C0009b mo33f(String str) {
            this.f21a = str;
            return this;
        }

        /* renamed from: g */
        public C0009b mo34g(Uri uri) {
            this.f28h = uri;
            return this;
        }

        /* renamed from: h */
        public C0009b mo35h(CharSequence charSequence) {
            this.f23c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0009b mo36i(CharSequence charSequence) {
            this.f22b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f12b = parcel.readString();
        this.f13c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f16f = (Bitmap) parcel.readParcelable(classLoader);
        this.f17g = (Uri) parcel.readParcelable(classLoader);
        this.f18h = parcel.readBundle(classLoader);
        this.f19i = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f12b = str;
        this.f13c = charSequence;
        this.f14d = charSequence2;
        this.f15e = charSequence3;
        this.f16f = bitmap;
        this.f17g = uri;
        this.f18h = bundle;
        this.f19i = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p004v4.media.MediaDescriptionCompat m11b(java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004v4.media.MediaDescriptionCompat.m11b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public Object mo21g() {
        int i;
        Object obj = this.f20j;
        if (obj != null || (i = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object b = C0013b.C0014a.m39b();
        C0013b.C0014a.m44g(b, this.f12b);
        C0013b.C0014a.m46i(b, this.f13c);
        C0013b.C0014a.m45h(b, this.f14d);
        C0013b.C0014a.m40c(b, this.f15e);
        C0013b.C0014a.m42e(b, this.f16f);
        C0013b.C0014a.m43f(b, this.f17g);
        Bundle bundle = this.f18h;
        if (i < 23 && this.f19i != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f19i);
        }
        C0013b.C0014a.m41d(b, bundle);
        if (i >= 23) {
            C0015c.C0016a.m48a(b, this.f19i);
        }
        Object a = C0013b.C0014a.m38a(b);
        this.f20j = a;
        return a;
    }

    public String toString() {
        return ((Object) this.f13c) + ", " + ((Object) this.f14d) + ", " + ((Object) this.f15e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f12b);
            TextUtils.writeToParcel(this.f13c, parcel, i);
            TextUtils.writeToParcel(this.f14d, parcel, i);
            TextUtils.writeToParcel(this.f15e, parcel, i);
            parcel.writeParcelable(this.f16f, i);
            parcel.writeParcelable(this.f17g, i);
            parcel.writeBundle(this.f18h);
            parcel.writeParcelable(this.f19i, i);
            return;
        }
        C0013b.m37i(mo21g(), parcel, i);
    }
}
