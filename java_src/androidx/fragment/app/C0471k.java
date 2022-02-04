package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.k */
public final class C0471k implements Parcelable {
    public static final Parcelable.Creator<C0471k> CREATOR = new C0472a();

    /* renamed from: b */
    ArrayList<C0475m> f2432b;

    /* renamed from: c */
    ArrayList<String> f2433c;

    /* renamed from: d */
    C0443b[] f2434d;

    /* renamed from: e */
    String f2435e = null;

    /* renamed from: f */
    int f2436f;

    /* renamed from: androidx.fragment.app.k$a */
    static class C0472a implements Parcelable.Creator<C0471k> {
        C0472a() {
        }

        /* renamed from: a */
        public C0471k createFromParcel(Parcel parcel) {
            return new C0471k(parcel);
        }

        /* renamed from: b */
        public C0471k[] newArray(int i) {
            return new C0471k[i];
        }
    }

    public C0471k() {
    }

    public C0471k(Parcel parcel) {
        this.f2432b = parcel.createTypedArrayList(C0475m.CREATOR);
        this.f2433c = parcel.createStringArrayList();
        this.f2434d = (C0443b[]) parcel.createTypedArray(C0443b.CREATOR);
        this.f2435e = parcel.readString();
        this.f2436f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2432b);
        parcel.writeStringList(this.f2433c);
        parcel.writeTypedArray(this.f2434d, i);
        parcel.writeString(this.f2435e);
        parcel.writeInt(this.f2436f);
    }
}
