package android.support.p004v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
public interface AbstractC0027b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class AbstractBinderC0028a extends Binder implements AbstractC0027b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0029a implements AbstractC0027b {

            /* renamed from: a */
            private IBinder f71a;

            C0029a(IBinder iBinder) {
                this.f71a = iBinder;
            }

            public IBinder asBinder() {
                return this.f71a;
            }

            @Override // android.support.p004v4.media.session.AbstractC0027b
            /* renamed from: y */
            public void mo111y(AbstractC0025a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f71a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: i */
        public static AbstractC0027b m91i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0027b)) ? new C0029a(iBinder) : (AbstractC0027b) queryLocalInterface;
        }
    }

    /* renamed from: y */
    void mo111y(AbstractC0025a aVar);
}
