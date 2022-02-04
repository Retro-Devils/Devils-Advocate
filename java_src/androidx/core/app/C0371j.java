package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0364h;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.app.j */
public class C0371j {

    /* renamed from: a */
    private static final Object f2049a = new Object();

    /* renamed from: b */
    private static Field f2050b;

    /* renamed from: c */
    private static boolean f2051c;

    /* renamed from: d */
    private static final Object f2052d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m1847a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m1848b(C0364h.C0365a aVar) {
        Bundle bundle = new Bundle();
        IconCompat e = aVar.mo2177e();
        bundle.putInt("icon", e != null ? e.mo2243c() : 0);
        bundle.putCharSequence("title", aVar.mo2181i());
        bundle.putParcelable("actionIntent", aVar.mo2173a());
        Bundle bundle2 = aVar.mo2176d() != null ? new Bundle(aVar.mo2176d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.mo2174b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m1851e(aVar.mo2178f()));
        bundle.putBoolean("showsUserInterface", aVar.mo2180h());
        bundle.putInt("semanticAction", aVar.mo2179g());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m1849c(Notification notification) {
        String str;
        String str2;
        synchronized (f2049a) {
            if (f2051c) {
                return null;
            }
            try {
                if (f2050b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2051c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2050b = declaredField;
                }
                Bundle bundle = (Bundle) f2050b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2050b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f2051c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f2051c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m1850d(C0372k kVar) {
        new Bundle();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m1851e(C0372k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[kVarArr.length];
        for (int i = 0; i < kVarArr.length; i++) {
            bundleArr[i] = m1850d(kVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m1852f(Notification.Builder builder, C0364h.C0365a aVar) {
        IconCompat e = aVar.mo2177e();
        builder.addAction(e != null ? e.mo2243c() : 0, aVar.mo2181i(), aVar.mo2173a());
        Bundle bundle = new Bundle(aVar.mo2176d());
        if (aVar.mo2178f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1851e(aVar.mo2178f()));
        }
        if (aVar.mo2175c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1851e(aVar.mo2175c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2174b());
        return bundle;
    }
}
