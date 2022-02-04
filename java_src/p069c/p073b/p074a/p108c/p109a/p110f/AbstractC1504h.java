package p069c.p073b.p074a.p108c.p109a.p110f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.c.a.f.h */
public interface AbstractC1504h extends IInterface {

    /* renamed from: c.b.a.c.a.f.h$a */
    public static abstract class AbstractBinderC1505a extends Binder implements AbstractC1504h {

        /* renamed from: c.b.a.c.a.f.h$a$a */
        private static class C1506a implements AbstractC1504h {

            /* renamed from: a */
            private IBinder f6288a;

            C1506a(IBinder iBinder) {
                this.f6288a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f6288a;
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1504h
            /* renamed from: p */
            public final void mo6780p(AbstractC1497e eVar, int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6288a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: i */
        public static AbstractC1504h m7428i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1504h)) ? new C1506a(iBinder) : (AbstractC1504h) queryLocalInterface;
        }
    }

    /* renamed from: p */
    void mo6780p(AbstractC1497e eVar, int i, String str, String str2, String str3, Bundle bundle);
}
