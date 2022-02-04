package p069c.p073b.p074a.p075a.p081d.p085d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.a.d.d.a */
public class C1320a implements IInterface {

    /* renamed from: a */
    private final IBinder f5589a;

    /* renamed from: b */
    private final String f5590b;

    protected C1320a(IBinder iBinder, String str) {
        this.f5589a = iBinder;
        this.f5590b = str;
    }

    public IBinder asBinder() {
        return this.f5589a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel mo6335i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5590b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo6336j(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5589a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
