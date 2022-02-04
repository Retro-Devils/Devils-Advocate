package p069c.p073b.p074a.p075a.p081d.p082a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.a.d.a.b */
public class BinderC1306b extends Binder implements IInterface {
    protected BinderC1306b(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo6313w0(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public boolean mo6313w0(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }
}
