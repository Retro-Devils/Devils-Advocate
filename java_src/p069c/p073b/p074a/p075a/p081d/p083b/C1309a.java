package p069c.p073b.p074a.p075a.p081d.p083b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.a.d.b.a */
public class C1309a implements IInterface {

    /* renamed from: a */
    private final IBinder f5574a;

    /* renamed from: b */
    private final String f5575b;

    protected C1309a(IBinder iBinder, String str) {
        this.f5574a = iBinder;
        this.f5575b = str;
    }

    public IBinder asBinder() {
        return this.f5574a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel mo6316i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5575b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo6317j(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f5574a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
