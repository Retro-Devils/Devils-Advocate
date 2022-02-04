package p069c.p073b.p074a.p075a.p081d.p085d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.internal.AbstractC3002h;
import com.google.android.gms.common.internal.C2992d;

/* renamed from: c.b.a.a.d.d.m */
public final class C1334m extends AbstractC3002h<AbstractC1327h> {

    /* renamed from: G */
    private final Context f5598G;

    public C1334m(Context context, Looper looper, C2992d dVar, AbstractC2911f.AbstractC2912a aVar, AbstractC2911f.AbstractC2913b bVar) {
        super(context, looper, 45, dVar, aVar, bVar);
        this.f5598G = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: g */
    public final String mo6354g() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: i */
    public final /* synthetic */ IInterface mo6355i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof AbstractC1327h ? (AbstractC1327h) queryLocalInterface : new C1328i(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final String mo6356i0(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f5598G.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f5598G.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return (String) bundle.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: n */
    public final String mo6357n() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3002h, com.google.android.gms.common.api.C2894a.AbstractC2902f, com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: q */
    public final int mo6358q() {
        return 12200000;
    }
}
