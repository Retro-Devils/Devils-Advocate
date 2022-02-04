package com.bumptech.glide.p143s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.AbstractC1643g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.bumptech.glide.s.b */
public final class C2065b {

    /* renamed from: a */
    private static final ConcurrentMap<String, AbstractC1643g> f7580a = new ConcurrentHashMap();

    /* renamed from: a */
    private static PackageInfo m9391a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: b */
    private static String m9392b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static AbstractC1643g m9393c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, AbstractC1643g> concurrentMap = f7580a;
        AbstractC1643g gVar = concurrentMap.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        AbstractC1643g d = m9394d(context);
        AbstractC1643g putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    /* renamed from: d */
    private static AbstractC1643g m9394d(Context context) {
        return new C2067d(m9392b(m9391a(context)));
    }
}
