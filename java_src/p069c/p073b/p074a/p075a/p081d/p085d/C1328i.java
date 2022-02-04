package p069c.p073b.p074a.p075a.p081d.p085d;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.b.a.a.d.d.i */
public final class C1328i extends C1320a implements AbstractC1327h {
    C1328i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p085d.AbstractC1327h
    /* renamed from: p0 */
    public final void mo6349p0(AbstractC1325f fVar, byte[] bArr, String str) {
        Parcel i = mo6335i();
        C1322c.m6874b(i, fVar);
        i.writeByteArray(bArr);
        i.writeString(str);
        mo6336j(7, i);
    }
}
