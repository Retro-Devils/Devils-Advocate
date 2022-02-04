package p069c.p073b.p074a.p075a.p077b.p079l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: c.b.a.a.b.l.a */
public class C1291a {

    /* renamed from: a */
    private final Context f5568a;

    public C1291a(Context context) {
        this.f5568a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo6295a(String str, int i) {
        return this.f5568a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence mo6296b(String str) {
        return this.f5568a.getPackageManager().getApplicationLabel(this.f5568a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: c */
    public PackageInfo mo6297c(String str, int i) {
        return this.f5568a.getPackageManager().getPackageInfo(str, i);
    }
}
