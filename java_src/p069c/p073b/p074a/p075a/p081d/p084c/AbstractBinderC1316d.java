package p069c.p073b.p074a.p075a.p081d.p084c;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.b.a.a.d.c.d */
public abstract class AbstractBinderC1316d extends BinderC1317e implements AbstractC1313a {
    /* renamed from: i */
    public static AbstractC1313a m6865i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof AbstractC1313a ? (AbstractC1313a) queryLocalInterface : new C1315c(iBinder);
    }
}
