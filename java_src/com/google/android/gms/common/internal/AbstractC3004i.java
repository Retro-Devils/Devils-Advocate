package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.i */
public abstract class AbstractC3004i {

    /* renamed from: a */
    private static final Object f9997a = new Object();

    /* renamed from: b */
    private static AbstractC3004i f9998b;

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.i$a */
    public static final class C3005a {

        /* renamed from: a */
        private final String f9999a;

        /* renamed from: b */
        private final String f10000b;

        /* renamed from: c */
        private final ComponentName f10001c = null;

        /* renamed from: d */
        private final int f10002d;

        public C3005a(String str, String str2, int i) {
            this.f9999a = C3027r.m12373e(str);
            this.f10000b = C3027r.m12373e(str2);
            this.f10002d = i;
        }

        /* renamed from: a */
        public final ComponentName mo9775a() {
            return this.f10001c;
        }

        /* renamed from: b */
        public final String mo9776b() {
            return this.f10000b;
        }

        /* renamed from: c */
        public final Intent mo9777c(Context context) {
            return this.f9999a != null ? new Intent(this.f9999a).setPackage(this.f10000b) : new Intent().setComponent(this.f10001c);
        }

        /* renamed from: d */
        public final int mo9778d() {
            return this.f10002d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3005a)) {
                return false;
            }
            C3005a aVar = (C3005a) obj;
            return C3022p.m12361a(this.f9999a, aVar.f9999a) && C3022p.m12361a(this.f10000b, aVar.f10000b) && C3022p.m12361a(this.f10001c, aVar.f10001c) && this.f10002d == aVar.f10002d;
        }

        public final int hashCode() {
            return C3022p.m12362b(this.f9999a, this.f10000b, this.f10001c, Integer.valueOf(this.f10002d));
        }

        public final String toString() {
            String str = this.f9999a;
            return str == null ? this.f10001c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static AbstractC3004i m12321a(Context context) {
        synchronized (f9997a) {
            if (f9998b == null) {
                f9998b = new C3003h0(context.getApplicationContext());
            }
        }
        return f9998b;
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
