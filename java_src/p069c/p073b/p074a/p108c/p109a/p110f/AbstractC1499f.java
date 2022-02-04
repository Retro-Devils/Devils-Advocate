package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1526q;

/* renamed from: c.b.a.c.a.f.f */
public interface AbstractC1499f extends IInterface {

    /* renamed from: c.b.a.c.a.f.f$a */
    public static abstract class AbstractBinderC1500a extends Binder implements AbstractC1499f {

        /* renamed from: c.b.a.c.a.f.f$a$a */
        private static class C1501a implements AbstractC1499f {

            /* renamed from: a */
            private IBinder f6295a;

            C1501a(IBinder iBinder) {
                this.f6295a = iBinder;
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: A */
            public final void mo6752A() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: C */
            public final void mo6753C() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: D */
            public final void mo6754D(AbstractC1502g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f6295a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: K */
            public final void mo6755K() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: P */
            public final boolean mo6756P(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6295a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: T */
            public final AbstractC1526q mo6757T() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC1526q.AbstractBinderC1527a.m7505i(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: Y */
            public final void mo6758Y(Configuration configuration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6295a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: Z */
            public final void mo6759Z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: a */
            public final void mo6760a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f6295a;
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: b */
            public final void mo6761b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f6295a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: c */
            public final void mo6762c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: c0 */
            public final void mo6763c0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: f */
            public final boolean mo6764f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f6295a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: g0 */
            public final void mo6765g0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: m0 */
            public final boolean mo6766m0(int i, KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6295a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: o0 */
            public final void mo6767o0(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f6295a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: r */
            public final void mo6768r(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f6295a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: v */
            public final Bundle mo6769v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f6295a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f
            /* renamed from: w */
            public final boolean mo6770w(int i, KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6295a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: i */
        public static AbstractC1499f m7401i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1499f)) ? new C1501a(iBinder) : (AbstractC1499f) queryLocalInterface;
        }
    }

    /* renamed from: A */
    void mo6752A();

    /* renamed from: C */
    void mo6753C();

    /* renamed from: D */
    void mo6754D(AbstractC1502g gVar);

    /* renamed from: K */
    void mo6755K();

    /* renamed from: P */
    boolean mo6756P(Bundle bundle);

    /* renamed from: T */
    AbstractC1526q mo6757T();

    /* renamed from: Y */
    void mo6758Y(Configuration configuration);

    /* renamed from: Z */
    void mo6759Z();

    /* renamed from: a */
    void mo6760a();

    /* renamed from: b */
    void mo6761b(boolean z);

    /* renamed from: c */
    void mo6762c();

    /* renamed from: c0 */
    void mo6763c0();

    /* renamed from: f */
    boolean mo6764f();

    /* renamed from: g0 */
    void mo6765g0();

    /* renamed from: m0 */
    boolean mo6766m0(int i, KeyEvent keyEvent);

    /* renamed from: o0 */
    void mo6767o0(boolean z);

    /* renamed from: r */
    void mo6768r(String str, int i);

    /* renamed from: v */
    Bundle mo6769v();

    /* renamed from: w */
    boolean mo6770w(int i, KeyEvent keyEvent);
}
