package p069c.p073b.p074a.p075a.p081d.p085d;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p069c.p073b.p074a.p075a.p086e.C1337b;
import p069c.p073b.p074a.p075a.p086e.C1343f;
import p069c.p073b.p074a.p075a.p086e.C1346i;
import p069c.p073b.p074a.p075a.p086e.C1348k;
import p069c.p073b.p074a.p075a.p086e.C1350m;

/* renamed from: c.b.a.a.d.d.g */
public abstract class AbstractBinderC1326g extends BinderC1321b implements AbstractC1325f {
    public AbstractBinderC1326g() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p075a.p081d.p085d.BinderC1321b
    /* renamed from: i */
    public final boolean mo6338i(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6348L((Status) C1322c.m6873a(parcel, Status.CREATOR), (C1343f) C1322c.m6873a(parcel, C1343f.CREATOR));
        } else if (i == 2) {
            mo6347t(parcel.readString());
        } else if (i == 3) {
            mo6340I((Status) C1322c.m6873a(parcel, Status.CREATOR), (C1337b) C1322c.m6873a(parcel, C1337b.CREATOR));
        } else if (i == 4) {
            mo6341S((Status) C1322c.m6873a(parcel, Status.CREATOR), C1322c.m6875c(parcel));
        } else if (i == 6) {
            mo6343n((Status) C1322c.m6873a(parcel, Status.CREATOR), (C1348k) C1322c.m6873a(parcel, C1348k.CREATOR));
        } else if (i == 8) {
            mo6345r0((Status) C1322c.m6873a(parcel, Status.CREATOR), (C1346i) C1322c.m6873a(parcel, C1346i.CREATOR));
        } else if (i == 15) {
            mo6346s((Status) C1322c.m6873a(parcel, Status.CREATOR), (C1350m) C1322c.m6873a(parcel, C1350m.CREATOR));
        } else if (i == 10) {
            mo6344q((Status) C1322c.m6873a(parcel, Status.CREATOR), C1322c.m6875c(parcel));
        } else if (i != 11) {
            return false;
        } else {
            mo6342W((Status) C1322c.m6873a(parcel, Status.CREATOR));
        }
        return true;
    }
}
