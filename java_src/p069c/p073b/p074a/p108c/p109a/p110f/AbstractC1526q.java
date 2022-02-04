package p069c.p073b.p074a.p108c.p109a.p110f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.c.a.f.q */
public interface AbstractC1526q extends IInterface {

    /* renamed from: c.b.a.c.a.f.q$a */
    public static abstract class AbstractBinderC1527a extends Binder implements AbstractC1526q {

        /* access modifiers changed from: private */
        /* renamed from: c.b.a.c.a.f.q$a$a */
        public static class C1528a implements AbstractC1526q {

            /* renamed from: a */
            private IBinder f6338a;

            C1528a(IBinder iBinder) {
                this.f6338a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f6338a;
            }
        }

        public AbstractBinderC1527a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        /* renamed from: i */
        public static AbstractC1526q m7505i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1526q)) ? new C1528a(iBinder) : (AbstractC1526q) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
