package p069c.p073b.p074a.p075a.p081d.p084c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: c.b.a.a.d.c.c */
public final class C1315c extends C1318f implements AbstractC1313a {
    C1315c(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: E */
    public final Bundle mo6322E(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel i2 = mo6332i();
        i2.writeInt(9);
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        C1319g.m6869b(i2, bundle);
        Parcel j = mo6333j(11, i2);
        Bundle bundle2 = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle2;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: F */
    public final Bundle mo6323F(int i, String str, String str2, Bundle bundle) {
        Parcel i2 = mo6332i();
        i2.writeInt(3);
        i2.writeString(str);
        i2.writeString(str2);
        C1319g.m6869b(i2, bundle);
        Parcel j = mo6333j(2, i2);
        Bundle bundle2 = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle2;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: H */
    public final Bundle mo6324H(int i, String str, List<String> list, String str2, String str3, String str4) {
        Parcel i2 = mo6332i();
        i2.writeInt(5);
        i2.writeString(str);
        i2.writeStringList(list);
        i2.writeString(str2);
        i2.writeString(str3);
        i2.writeString(null);
        Parcel j = mo6333j(7, i2);
        Bundle bundle = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: J */
    public final int mo6325J(int i, String str, String str2) {
        Parcel i2 = mo6332i();
        i2.writeInt(i);
        i2.writeString(str);
        i2.writeString(str2);
        Parcel j = mo6333j(1, i2);
        int readInt = j.readInt();
        j.recycle();
        return readInt;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: O */
    public final Bundle mo6326O(int i, String str, String str2, String str3, String str4) {
        Parcel i2 = mo6332i();
        i2.writeInt(3);
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        i2.writeString(null);
        Parcel j = mo6333j(3, i2);
        Bundle bundle = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: X */
    public final Bundle mo6327X(int i, String str, String str2, String str3) {
        Parcel i2 = mo6332i();
        i2.writeInt(3);
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        Parcel j = mo6333j(4, i2);
        Bundle bundle = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: i0 */
    public final Bundle mo6328i0(int i, String str, String str2, Bundle bundle) {
        Parcel i2 = mo6332i();
        i2.writeInt(9);
        i2.writeString(str);
        i2.writeString(str2);
        C1319g.m6869b(i2, bundle);
        Parcel j = mo6333j(902, i2);
        Bundle bundle2 = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle2;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: v0 */
    public final Bundle mo6329v0(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel i2 = mo6332i();
        i2.writeInt(i);
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        i2.writeString(str4);
        C1319g.m6869b(i2, bundle);
        Parcel j = mo6333j(8, i2);
        Bundle bundle2 = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle2;
    }

    @Override // p069c.p073b.p074a.p075a.p081d.p084c.AbstractC1313a
    /* renamed from: z */
    public final Bundle mo6330z(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel i2 = mo6332i();
        i2.writeInt(10);
        i2.writeString(str);
        i2.writeString(str2);
        C1319g.m6869b(i2, bundle);
        C1319g.m6869b(i2, bundle2);
        Parcel j = mo6333j(901, i2);
        Bundle bundle3 = (Bundle) C1319g.m6868a(j, Bundle.CREATOR);
        j.recycle();
        return bundle3;
    }
}
