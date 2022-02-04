package com.digdroid.alman.dig;

import android.content.Context;
import p069c.p070a.p071a.C1243o;
import p069c.p070a.p071a.p072w.C1276o;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.m2 */
public class C2490m2 {

    /* renamed from: a */
    private static C1243o f8638a;

    /* renamed from: a */
    public static synchronized C1243o m10682a(Context context) {
        C1243o oVar;
        synchronized (C2490m2.class) {
            if (f8638a == null) {
                f8638a = C1276o.m6752a(context.getApplicationContext());
            }
            oVar = f8638a;
        }
        return oVar;
    }
}
