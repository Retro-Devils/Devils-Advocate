package p069c.p073b.p074a.p075a.p081d.p084c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.a.d.c.f */
public class C1318f implements IInterface {

    /* renamed from: a */
    private final IBinder f5586a;

    /* renamed from: b */
    private final String f5587b;

    protected C1318f(IBinder iBinder, String str) {
        this.f5586a = iBinder;
        this.f5587b = str;
    }

    public IBinder asBinder() {
        return this.f5586a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel mo6332i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5587b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo6333j(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f5586a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
