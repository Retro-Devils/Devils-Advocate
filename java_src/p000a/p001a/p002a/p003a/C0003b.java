package p000a.p001a.p002a.p003a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p001a.p002a.p003a.AbstractC0000a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.a.a.a.b */
public class C0003b implements Parcelable {
    public static final Parcelable.Creator<C0003b> CREATOR = new C0004a();

    /* renamed from: b */
    final boolean f1b = false;

    /* renamed from: c */
    final Handler f2c = null;

    /* renamed from: d */
    AbstractC0000a f3d;

    /* renamed from: a.a.a.a.b$a */
    class C0004a implements Parcelable.Creator<C0003b> {
        C0004a() {
        }

        /* renamed from: a */
        public C0003b createFromParcel(Parcel parcel) {
            return new C0003b(parcel);
        }

        /* renamed from: b */
        public C0003b[] newArray(int i) {
            return new C0003b[i];
        }
    }

    /* renamed from: a.a.a.a.b$b */
    class BinderC0005b extends AbstractC0000a.AbstractBinderC0001a {
        BinderC0005b() {
        }

        @Override // p000a.p001a.p002a.p003a.AbstractC0000a
        /* renamed from: s0 */
        public void mo1s0(int i, Bundle bundle) {
            C0003b bVar = C0003b.this;
            Handler handler = bVar.f2c;
            if (handler != null) {
                handler.post(new RunnableC0006c(i, bundle));
            } else {
                bVar.mo5b(i, bundle);
            }
        }
    }

    /* renamed from: a.a.a.a.b$c */
    class RunnableC0006c implements Runnable {

        /* renamed from: b */
        final int f5b;

        /* renamed from: c */
        final Bundle f6c;

        RunnableC0006c(int i, Bundle bundle) {
            this.f5b = i;
            this.f6c = bundle;
        }

        public void run() {
            C0003b.this.mo5b(this.f5b, this.f6c);
        }
    }

    C0003b(Parcel parcel) {
        this.f3d = AbstractC0000a.AbstractBinderC0001a.m1i(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5b(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3d == null) {
                this.f3d = new BinderC0005b();
            }
            parcel.writeStrongBinder(this.f3d.asBinder());
        }
    }
}
