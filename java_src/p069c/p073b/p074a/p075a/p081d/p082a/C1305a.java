package p069c.p073b.p074a.p075a.p081d.p082a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.a.d.a.a */
public class C1305a implements IInterface {

    /* renamed from: a */
    private final IBinder f5571a;

    /* renamed from: b */
    private final String f5572b;

    protected C1305a(IBinder iBinder, String str) {
        this.f5571a = iBinder;
        this.f5572b = str;
    }

    public IBinder asBinder() {
        return this.f5571a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel mo6309i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5572b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo6310j(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5571a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
