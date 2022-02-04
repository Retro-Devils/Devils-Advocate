package p069c.p073b.p074a.p108c.p109a.p110f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.c.a.f.g */
public interface AbstractC1502g extends IInterface {

    /* renamed from: c.b.a.c.a.f.g$a */
    public static abstract class AbstractBinderC1503a extends Binder implements AbstractC1502g {
        public AbstractBinderC1503a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo6773a();
                        break;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo6772G(parcel.readString());
                        break;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo6774c();
                        break;
                    case 4:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo6775f();
                        break;
                    case 5:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo6777k();
                        break;
                    case 6:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo6776j0(parcel.readString());
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
            return true;
        }
    }

    /* renamed from: G */
    void mo6772G(String str);

    /* renamed from: a */
    void mo6773a();

    /* renamed from: c */
    void mo6774c();

    /* renamed from: f */
    void mo6775f();

    /* renamed from: j0 */
    void mo6776j0(String str);

    /* renamed from: k */
    void mo6777k();
}
