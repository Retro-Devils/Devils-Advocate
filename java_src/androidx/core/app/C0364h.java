package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: androidx.core.app.h */
public class C0364h {

    /* renamed from: androidx.core.app.h$a */
    public static class C0365a {

        /* renamed from: a */
        final Bundle f1981a;

        /* renamed from: b */
        private IconCompat f1982b;

        /* renamed from: c */
        private final C0372k[] f1983c;

        /* renamed from: d */
        private final C0372k[] f1984d;

        /* renamed from: e */
        private boolean f1985e;

        /* renamed from: f */
        boolean f1986f;

        /* renamed from: g */
        private final int f1987g;

        /* renamed from: h */
        private final boolean f1988h;
        @Deprecated

        /* renamed from: i */
        public int f1989i;

        /* renamed from: j */
        public CharSequence f1990j;

        /* renamed from: k */
        public PendingIntent f1991k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0365a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m1949b(null, "", i) : null, charSequence, pendingIntent);
        }

        public C0365a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        C0365a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0372k[] kVarArr, C0372k[] kVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f1986f = true;
            this.f1982b = iconCompat;
            if (iconCompat != null && iconCompat.mo2245g() == 2) {
                this.f1989i = iconCompat.mo2243c();
            }
            this.f1990j = C0368d.m1820d(charSequence);
            this.f1991k = pendingIntent;
            this.f1981a = bundle == null ? new Bundle() : bundle;
            this.f1983c = kVarArr;
            this.f1984d = kVarArr2;
            this.f1985e = z;
            this.f1987g = i;
            this.f1986f = z2;
            this.f1988h = z3;
        }

        /* renamed from: a */
        public PendingIntent mo2173a() {
            return this.f1991k;
        }

        /* renamed from: b */
        public boolean mo2174b() {
            return this.f1985e;
        }

        /* renamed from: c */
        public C0372k[] mo2175c() {
            return this.f1984d;
        }

        /* renamed from: d */
        public Bundle mo2176d() {
            return this.f1981a;
        }

        /* renamed from: e */
        public IconCompat mo2177e() {
            int i;
            if (this.f1982b == null && (i = this.f1989i) != 0) {
                this.f1982b = IconCompat.m1949b(null, "", i);
            }
            return this.f1982b;
        }

        /* renamed from: f */
        public C0372k[] mo2178f() {
            return this.f1983c;
        }

        /* renamed from: g */
        public int mo2179g() {
            return this.f1987g;
        }

        /* renamed from: h */
        public boolean mo2180h() {
            return this.f1986f;
        }

        /* renamed from: i */
        public CharSequence mo2181i() {
            return this.f1990j;
        }

        /* renamed from: j */
        public boolean mo2182j() {
            return this.f1988h;
        }
    }

    /* renamed from: androidx.core.app.h$b */
    public static class C0366b extends AbstractC0369e {

        /* renamed from: e */
        private CharSequence f1992e;

        @Override // androidx.core.app.C0364h.AbstractC0369e
        /* renamed from: b */
        public void mo2183b(AbstractC0363g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.mo2172a()).setBigContentTitle(this.f2038b).bigText(this.f1992e);
                if (this.f2040d) {
                    bigText.setSummaryText(this.f2039c);
                }
            }
        }

        /* renamed from: g */
        public C0366b mo2184g(CharSequence charSequence) {
            this.f1992e = C0368d.m1820d(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$c */
    public static final class C0367c {
        /* renamed from: a */
        public static Notification.BubbleMetadata m1819a(C0367c cVar) {
            if (cVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            throw null;
        }
    }

    /* renamed from: androidx.core.app.h$d */
    public static class C0368d {

        /* renamed from: A */
        String f1993A;

        /* renamed from: B */
        Bundle f1994B;

        /* renamed from: C */
        int f1995C;

        /* renamed from: D */
        int f1996D;

        /* renamed from: E */
        Notification f1997E;

        /* renamed from: F */
        RemoteViews f1998F;

        /* renamed from: G */
        RemoteViews f1999G;

        /* renamed from: H */
        RemoteViews f2000H;

        /* renamed from: I */
        String f2001I;

        /* renamed from: J */
        int f2002J;

        /* renamed from: K */
        String f2003K;

        /* renamed from: L */
        long f2004L;

        /* renamed from: M */
        int f2005M;

        /* renamed from: N */
        boolean f2006N;

        /* renamed from: O */
        C0367c f2007O;

        /* renamed from: P */
        Notification f2008P;

        /* renamed from: Q */
        boolean f2009Q;
        @Deprecated

        /* renamed from: R */
        public ArrayList<String> f2010R;

        /* renamed from: a */
        public Context f2011a;

        /* renamed from: b */
        public ArrayList<C0365a> f2012b;

        /* renamed from: c */
        ArrayList<C0365a> f2013c;

        /* renamed from: d */
        CharSequence f2014d;

        /* renamed from: e */
        CharSequence f2015e;

        /* renamed from: f */
        PendingIntent f2016f;

        /* renamed from: g */
        PendingIntent f2017g;

        /* renamed from: h */
        RemoteViews f2018h;

        /* renamed from: i */
        Bitmap f2019i;

        /* renamed from: j */
        CharSequence f2020j;

        /* renamed from: k */
        int f2021k;

        /* renamed from: l */
        int f2022l;

        /* renamed from: m */
        boolean f2023m;

        /* renamed from: n */
        boolean f2024n;

        /* renamed from: o */
        AbstractC0369e f2025o;

        /* renamed from: p */
        CharSequence f2026p;

        /* renamed from: q */
        CharSequence[] f2027q;

        /* renamed from: r */
        int f2028r;

        /* renamed from: s */
        int f2029s;

        /* renamed from: t */
        boolean f2030t;

        /* renamed from: u */
        String f2031u;

        /* renamed from: v */
        boolean f2032v;

        /* renamed from: w */
        String f2033w;

        /* renamed from: x */
        boolean f2034x;

        /* renamed from: y */
        boolean f2035y;

        /* renamed from: z */
        boolean f2036z;

        @Deprecated
        public C0368d(Context context) {
            this(context, null);
        }

        public C0368d(Context context, String str) {
            this.f2012b = new ArrayList<>();
            this.f2013c = new ArrayList<>();
            this.f2023m = true;
            this.f2034x = false;
            this.f1995C = 0;
            this.f1996D = 0;
            this.f2002J = 0;
            this.f2005M = 0;
            Notification notification = new Notification();
            this.f2008P = notification;
            this.f2011a = context;
            this.f2001I = str;
            notification.when = System.currentTimeMillis();
            this.f2008P.audioStreamType = -1;
            this.f2022l = 0;
            this.f2010R = new ArrayList<>();
            this.f2006N = true;
        }

        /* renamed from: d */
        protected static CharSequence m1820d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: j */
        private void m1821j(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f2008P;
                i2 = i | notification.flags;
            } else {
                notification = this.f2008P;
                i2 = (i ^ -1) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: a */
        public C0368d mo2185a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2012b.add(new C0365a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification mo2186b() {
            return new C0370i(this).mo2204c();
        }

        /* renamed from: c */
        public Bundle mo2187c() {
            if (this.f1994B == null) {
                this.f1994B = new Bundle();
            }
            return this.f1994B;
        }

        /* renamed from: e */
        public C0368d mo2188e(boolean z) {
            m1821j(16, z);
            return this;
        }

        /* renamed from: f */
        public C0368d mo2189f(String str) {
            this.f2001I = str;
            return this;
        }

        /* renamed from: g */
        public C0368d mo2190g(PendingIntent pendingIntent) {
            this.f2016f = pendingIntent;
            return this;
        }

        /* renamed from: h */
        public C0368d mo2191h(CharSequence charSequence) {
            this.f2015e = m1820d(charSequence);
            return this;
        }

        /* renamed from: i */
        public C0368d mo2192i(CharSequence charSequence) {
            this.f2014d = m1820d(charSequence);
            return this;
        }

        /* renamed from: k */
        public C0368d mo2193k(boolean z) {
            this.f2034x = z;
            return this;
        }

        /* renamed from: l */
        public C0368d mo2194l(int i) {
            this.f2022l = i;
            return this;
        }

        /* renamed from: m */
        public C0368d mo2195m(int i) {
            this.f2008P.icon = i;
            return this;
        }

        /* renamed from: n */
        public C0368d mo2196n(AbstractC0369e eVar) {
            if (this.f2025o != eVar) {
                this.f2025o = eVar;
                if (eVar != null) {
                    eVar.mo2203f(this);
                }
            }
            return this;
        }

        /* renamed from: o */
        public C0368d mo2197o(CharSequence charSequence) {
            this.f2008P.tickerText = m1820d(charSequence);
            return this;
        }

        /* renamed from: p */
        public C0368d mo2198p(long j) {
            this.f2008P.when = j;
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$e */
    public static abstract class AbstractC0369e {

        /* renamed from: a */
        protected C0368d f2037a;

        /* renamed from: b */
        CharSequence f2038b;

        /* renamed from: c */
        CharSequence f2039c;

        /* renamed from: d */
        boolean f2040d = false;

        /* renamed from: a */
        public void mo2199a(Bundle bundle) {
        }

        /* renamed from: b */
        public abstract void mo2183b(AbstractC0363g gVar);

        /* renamed from: c */
        public RemoteViews mo2200c(AbstractC0363g gVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2201d(AbstractC0363g gVar) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo2202e(AbstractC0363g gVar) {
            return null;
        }

        /* renamed from: f */
        public void mo2203f(C0368d dVar) {
            if (this.f2037a != dVar) {
                this.f2037a = dVar;
                if (dVar != null) {
                    dVar.mo2196n(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1806a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0371j.m1849c(notification);
        }
        return null;
    }
}
