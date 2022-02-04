package p000a.p001a.p002a.p003a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a.a.a.a.a */
public interface AbstractC0000a extends IInterface {

    /* renamed from: a.a.a.a.a$a */
    public static abstract class AbstractBinderC0001a extends Binder implements AbstractC0000a {

        /* renamed from: a.a.a.a.a$a$a */
        private static class C0002a implements AbstractC0000a {

            /* renamed from: a */
            private IBinder f0a;

            C0002a(IBinder iBinder) {
                this.f0a = iBinder;
            }

            public IBinder asBinder() {
                return this.f0a;
            }
        }

        public AbstractBinderC0001a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: i */
        public static AbstractC0000a m1i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0000a)) ? new C0002a(iBinder) : (AbstractC0000a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo1s0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: s0 */
    void mo1s0(int i, Bundle bundle);
}
