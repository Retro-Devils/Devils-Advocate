package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.i */
public abstract class AbstractC3004i {

    /* renamed from: a */
    private static final Object f10005a = new Object();

    /* renamed from: b */
    private static AbstractC3004i f10006b;

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.i$a */
    public static final class C3005a {

        /* renamed from: a */
        private final String f10007a;

        /* renamed from: b */
        private final String f10008b;

        /* renamed from: c */
        private final ComponentName f10009c = null;

        /* renamed from: d */
        private final int f10010d;

        public C3005a(String str, String str2, int i) {
            this.f10007a = C3027r.m12373e(str);
            this.f10008b = C3027r.m12373e(str2);
            this.f10010d = i;
        }

        /* renamed from: a */
        public final ComponentName mo9775a() {
            return this.f10009c;
        }

        /* renamed from: b */
        public final String mo9776b() {
            return this.f10008b;
        }

        /* renamed from: c */
        public final Intent mo9777c(Context context) {
            return this.f10007a != null ? new Intent(this.f10007a).setPackage(this.f10008b) : new Intent().setComponent(this.f10009c);
        }

        /* renamed from: d */
        public final int mo9778d() {
            return this.f10010d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3005a)) {
                return false;
            }
            C3005a aVar = (C3005a) obj;
            return C3022p.m12361a(this.f10007a, aVar.f10007a) && C3022p.m12361a(this.f10008b, aVar.f10008b) && C3022p.m12361a(this.f10009c, aVar.f10009c) && this.f10010d == aVar.f10010d;
        }

        public final int hashCode() {
            return C3022p.m12362b(this.f10007a, this.f10008b, this.f10009c, Integer.valueOf(this.f10010d));
        }

        public final String toString() {
            String str = this.f10007a;
            return str == null ? this.f10009c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static AbstractC3004i m12321a(Context context) {
        synchronized (f10005a) {
            if (f10006b == null) {
                f10006b = new C3003h0(context.getApplicationContext());
            }
        }
        return f10006b;
    }

    /* renamed from: b */
    public final void mo9774b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo9772d(new C3005a(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo9771c(C3005a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo9772d(C3005a aVar, ServiceConnection serviceConnection, String str);
}
