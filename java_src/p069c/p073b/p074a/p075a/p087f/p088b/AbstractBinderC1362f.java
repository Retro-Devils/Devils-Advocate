package p069c.p073b.p074a.p075a.p087f.p088b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p069c.p073b.p074a.p075a.p077b.C1279a;
import p069c.p073b.p074a.p075a.p081d.p082a.BinderC1306b;
import p069c.p073b.p074a.p075a.p081d.p082a.C1307c;

/* renamed from: c.b.a.a.f.b.f */
public abstract class AbstractBinderC1362f extends BinderC1306b implements AbstractC1361e {
    public AbstractBinderC1362f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p075a.p081d.p082a.BinderC1306b
    /* renamed from: w0 */
    public boolean mo6313w0(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            mo6401a0((C1279a) C1307c.m6827a(parcel, C1279a.CREATOR), (C1358b) C1307c.m6827a(parcel, C1358b.CREATOR));
        } else if (i == 4) {
            mo6402q0((Status) C1307c.m6827a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo6403u((Status) C1307c.m6827a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo6404x((Status) C1307c.m6827a(parcel, Status.CREATOR), (GoogleSignInAccount) C1307c.m6827a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo6405Q((C1367k) C1307c.m6827a(parcel, C1367k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
