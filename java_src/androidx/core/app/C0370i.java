package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0364h;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.app.i */
public class C0370i implements AbstractC0363g {

    /* renamed from: a */
    private final Notification.Builder f2041a;

    /* renamed from: b */
    private final C0364h.C0368d f2042b;

    /* renamed from: c */
    private RemoteViews f2043c;

    /* renamed from: d */
    private RemoteViews f2044d;

    /* renamed from: e */
    private final List<Bundle> f2045e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2046f = new Bundle();

    /* renamed from: g */
    private int f2047g;

    /* renamed from: h */
    private RemoteViews f2048h;

    C0370i(C0364h.C0368d dVar) {
        Notification.Builder builder;
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.f2042b = dVar;
        int i = Build.VERSION.SDK_INT;
        Context context = dVar.f2011a;
        if (i >= 26) {
            String str2 = dVar.f2001I;
        } else {
            builder = new Notification.Builder(context);
        }
        this.f2041a = builder;
        Notification notification = dVar.f2008P;
        this.f2041a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f2018h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f2014d).setContentText(dVar.f2015e).setContentInfo(dVar.f2020j).setContentIntent(dVar.f2016f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f2017g, (notification.flags & 128) != 0).setLargeIcon(dVar.f2019i).setNumber(dVar.f2021k).setProgress(dVar.f2028r, dVar.f2029s, dVar.f2030t);
        if (i < 21) {
            this.f2041a.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f2041a.setSubText(dVar.f2026p).setUsesChronometer(dVar.f2024n).setPriority(dVar.f2022l);
            Iterator<C0364h.C0365a> it = dVar.f2012b.iterator();
            while (it.hasNext()) {
                m1842b(it.next());
            }
            Bundle bundle2 = dVar.f1994B;
            if (bundle2 != null) {
                this.f2046f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f2034x) {
                    this.f2046f.putBoolean("android.support.localOnly", true);
                }
                String str3 = dVar.f2031u;
                if (str3 != null) {
                    this.f2046f.putString("android.support.groupKey", str3);
                    if (dVar.f2032v) {
                        bundle = this.f2046f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f2046f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str4 = dVar.f2033w;
                if (str4 != null) {
                    this.f2046f.putString("android.support.sortKey", str4);
                }
            }
            this.f2043c = dVar.f1998F;
            this.f2044d = dVar.f1999G;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            this.f2041a.setShowWhen(dVar.f2023m);
            if (i2 < 21 && (arrayList = dVar.f2010R) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f2046f;
                ArrayList<String> arrayList2 = dVar.f2010R;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i2 >= 20) {
            this.f2041a.setLocalOnly(dVar.f2034x).setGroup(dVar.f2031u).setGroupSummary(dVar.f2032v).setSortKey(dVar.f2033w);
            this.f2047g = dVar.f2005M;
        }
        if (i2 >= 21) {
            this.f2041a.setCategory(dVar.f1993A).setColor(dVar.f1995C).setVisibility(dVar.f1996D).setPublicVersion(dVar.f1997E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.f2010R.iterator();
            while (it2.hasNext()) {
                this.f2041a.addPerson(it2.next());
            }
            this.f2048h = dVar.f2000H;
            if (dVar.f2013c.size() > 0) {
                Bundle bundle4 = dVar.mo2187c().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i3 = 0; i3 < dVar.f2013c.size(); i3++) {
                    bundle5.putBundle(Integer.toString(i3), C0371j.m1848b(dVar.f2013c.get(i3)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.mo2187c().putBundle("android.car.EXTENSIONS", bundle4);
                this.f2046f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            this.f2041a.setExtras(dVar.f1994B).setRemoteInputHistory(dVar.f2027q);
            RemoteViews remoteViews = dVar.f1998F;
            if (remoteViews != null) {
                this.f2041a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f1999G;
            if (remoteViews2 != null) {
                this.f2041a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f2000H;
            if (remoteViews3 != null) {
                this.f2041a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.f2041a.setBadgeIconType(dVar.f2002J).setShortcutId(dVar.f2003K).setTimeoutAfter(dVar.f2004L).setGroupAlertBehavior(dVar.f2005M);
            if (dVar.f2036z) {
                this.f2041a.setColorized(dVar.f2035y);
            }
            if (!TextUtils.isEmpty(dVar.f2001I)) {
                this.f2041a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 29) {
            this.f2041a.setAllowSystemGeneratedContextualActions(dVar.f2006N);
            this.f2041a.setBubbleMetadata(C0364h.C0367c.m1819a(dVar.f2007O));
        }
        if (dVar.f2009Q) {
            if (this.f2042b.f2032v) {
                this.f2047g = 2;
            } else {
                this.f2047g = 1;
            }
            this.f2041a.setVibrate(null);
            this.f2041a.setSound(null);
            int i5 = notification.defaults & -2;
            notification.defaults = i5;
            int i6 = i5 & -3;
            notification.defaults = i6;
            this.f2041a.setDefaults(i6);
            if (i4 >= 26) {
                if (TextUtils.isEmpty(this.f2042b.f2031u)) {
                    this.f2041a.setGroup("silent");
                }
                this.f2041a.setGroupAlertBehavior(this.f2047g);
            }
        }
    }

    /* renamed from: b */
    private void m1842b(C0364h.C0365a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat e = aVar.mo2177e();
            Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(e != null ? e.mo2249n() : null, aVar.mo2181i(), aVar.mo2173a()) : new Notification.Action.Builder(e != null ? e.mo2243c() : 0, aVar.mo2181i(), aVar.mo2173a());
            if (aVar.mo2178f() != null) {
                for (RemoteInput remoteInput : C0372k.m1854b(aVar.mo2178f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle = aVar.mo2176d() != null ? new Bundle(aVar.mo2176d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2174b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2174b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2179g());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.mo2179g());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.mo2182j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2180h());
            builder.addExtras(bundle);
            this.f2041a.addAction(builder.build());
        } else if (i >= 16) {
            this.f2045e.add(C0371j.m1852f(this.f2041a, aVar));
        }
    }

    /* renamed from: e */
    private void m1843e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    @Override // androidx.core.app.AbstractC0363g
    /* renamed from: a */
    public Notification.Builder mo2172a() {
        return this.f2041a;
    }

    /* renamed from: c */
    public Notification mo2204c() {
        Bundle a;
        RemoteViews e;
        RemoteViews c;
        C0364h.AbstractC0369e eVar = this.f2042b.f2025o;
        if (eVar != null) {
            eVar.mo2183b(this);
        }
        RemoteViews d = eVar != null ? eVar.mo2201d(this) : null;
        Notification d2 = mo2205d();
        if (!(d == null && (d = this.f2042b.f1998F) == null)) {
            d2.contentView = d;
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i < 16 || eVar == null || (c = eVar.mo2200c(this)) == null)) {
            d2.bigContentView = c;
        }
        if (!(i < 21 || eVar == null || (e = this.f2042b.f2025o.mo2202e(this)) == null)) {
            d2.headsUpContentView = e;
        }
        if (!(i < 16 || eVar == null || (a = C0364h.m1806a(d2)) == null)) {
            eVar.mo2199a(a);
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo2205d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2041a.build();
        }
        if (i >= 24) {
            Notification build = this.f2041a.build();
            if (this.f2047g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f2047g != 2)) {
                    m1843e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2047g == 1) {
                    m1843e(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2041a.setExtras(this.f2046f);
            Notification build2 = this.f2041a.build();
            RemoteViews remoteViews = this.f2043c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2044d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2048h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2047g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f2047g != 2)) {
                    m1843e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2047g == 1) {
                    m1843e(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2041a.setExtras(this.f2046f);
            Notification build3 = this.f2041a.build();
            RemoteViews remoteViews4 = this.f2043c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2044d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2047g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f2047g != 2)) {
                    m1843e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2047g == 1) {
                    m1843e(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0371j.m1847a(this.f2045e);
            if (a != null) {
                this.f2046f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f2041a.setExtras(this.f2046f);
            Notification build4 = this.f2041a.build();
            RemoteViews remoteViews6 = this.f2043c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2044d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f2041a.getNotification();
        } else {
            Notification build5 = this.f2041a.build();
            Bundle a2 = C0364h.m1806a(build5);
            Bundle bundle = new Bundle(this.f2046f);
            for (String str : this.f2046f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0371j.m1847a(this.f2045e);
            if (a3 != null) {
                C0364h.m1806a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f2043c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2044d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
