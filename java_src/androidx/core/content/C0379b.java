package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0358c;

/* renamed from: androidx.core.content.b */
public final class C0379b {
    /* renamed from: a */
    public static int m1878a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = C0358c.m1795b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0358c.m1794a(context, b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m1879b(Context context, String str) {
        return m1878a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
