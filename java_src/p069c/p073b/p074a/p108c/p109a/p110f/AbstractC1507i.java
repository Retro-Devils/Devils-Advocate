package p069c.p073b.p074a.p108c.p109a.p110f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.c.a.f.i */
public interface AbstractC1507i extends IInterface {

    /* renamed from: c.b.a.c.a.f.i$a */
    public static abstract class AbstractBinderC1508a extends Binder implements AbstractC1507i {

        /* access modifiers changed from: private */
        /* renamed from: c.b.a.c.a.f.i$a$a */
        public static class C1509a implements AbstractC1507i {

            /* renamed from: a */
            private IBinder f6297a;

            C1509a(IBinder iBinder) {
                this.f6297a = iBinder;
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1507i
            /* renamed from: a */
            public final IBinder mo6782a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f6297a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f6297a;
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1507i
            /* renamed from: b */
            public final void mo6783b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f6297a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: i */
        public static AbstractC1507i m7432i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1507i)) ? new C1509a(iBinder) : (AbstractC1507i) queryLocalInterface;
        }
    }

    /* renamed from: a */
    IBinder mo6782a();

    /* renamed from: b */
    void mo6783b(boolean z);
}
