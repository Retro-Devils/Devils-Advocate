package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0379b;
import java.util.Calendar;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.l */
public class C0109l {

    /* renamed from: a */
    private static C0109l f366a;

    /* renamed from: b */
    private final Context f367b;

    /* renamed from: c */
    private final LocationManager f368c;

    /* renamed from: d */
    private final C0110a f369d = new C0110a();

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.l$a */
    public static class C0110a {

        /* renamed from: a */
        boolean f370a;

        /* renamed from: b */
        long f371b;

        /* renamed from: c */
        long f372c;

        /* renamed from: d */
        long f373d;

        /* renamed from: e */
        long f374e;

        /* renamed from: f */
        long f375f;

        C0110a() {
        }
    }

    C0109l(Context context, LocationManager locationManager) {
        this.f367b = context;
        this.f368c = locationManager;
    }

    /* renamed from: a */
    static C0109l m484a(Context context) {
        if (f366a == null) {
            Context applicationContext = context.getApplicationContext();
            f366a = new C0109l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f366a;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m485b() {
        Location location = null;
        Location c = C0379b.m1879b(this.f367b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m486c("network") : null;
        if (C0379b.m1879b(this.f367b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m486c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m486c(String str) {
        try {
            if (this.f368c.isProviderEnabled(str)) {
                return this.f368c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m487e() {
        return this.f369d.f375f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m488f(Location location) {
        long j;
        C0110a aVar = this.f369d;
        long currentTimeMillis = System.currentTimeMillis();
        C0108k b = C0108k.m482b();
        b.mo414a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f363b;
        b.mo414a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f365d == 1;
        long j3 = b.f364c;
        long j4 = b.f363b;
        b.mo414a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b.f364c;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f370a = z;
        aVar.f371b = j2;
        aVar.f372c = j3;
        aVar.f373d = j4;
        aVar.f374e = j5;
        aVar.f375f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo415d() {
        C0110a aVar = this.f369d;
        if (m487e()) {
            return aVar.f370a;
        }
        Location b = m485b();
        if (b != null) {
            m488f(b);
            return aVar.f370a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
