package p069c.p073b.p074a.p108c.p109a.p110f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.c.a.f.e */
public interface AbstractC1497e extends IInterface {

    /* renamed from: c.b.a.c.a.f.e$a */
    public static abstract class AbstractBinderC1498a extends Binder implements AbstractC1497e {
        public AbstractBinderC1498a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                mo6749d0(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
                return true;
            }
        }
    }

    /* renamed from: d0 */
    void mo6749d0(String str, IBinder iBinder);
}
