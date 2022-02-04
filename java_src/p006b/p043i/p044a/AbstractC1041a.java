package p006b.p043i.p044a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.i.a.a */
public abstract class AbstractC1041a implements Parcelable {
    public static final Parcelable.Creator<AbstractC1041a> CREATOR = new C1043b();

    /* renamed from: b */
    public static final AbstractC1041a f4801b = new C1042a();

    /* renamed from: c */
    private final Parcelable f4802c;

    /* renamed from: b.i.a.a$a */
    static class C1042a extends AbstractC1041a {
        C1042a() {
            super((C1042a) null);
        }
    }

    /* renamed from: b.i.a.a$b */
    static class C1043b implements Parcelable.ClassLoaderCreator<AbstractC1041a> {
        C1043b() {
        }

        /* renamed from: a */
        public AbstractC1041a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public AbstractC1041a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1041a.f4801b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbstractC1041a[] newArray(int i) {
            return new AbstractC1041a[i];
        }
    }

    private AbstractC1041a() {
        this.f4802c = null;
    }

    protected AbstractC1041a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4802c = readParcelable == null ? f4801b : readParcelable;
    }

    protected AbstractC1041a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4802c = parcelable == f4801b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ AbstractC1041a(C1042a aVar) {
        this();
    }

    /* renamed from: b */
    public final Parcelable mo5608b() {
        return this.f4802c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4802c, i);
    }
}
