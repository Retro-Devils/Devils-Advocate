package com.digdroid.alman.dig;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.appcompat.app.DialogInterfaceC0068b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p006b.p061r.p062a.p063a.C1173c;
import p006b.p061r.p062a.p063a.C1175d;
import p006b.p061r.p062a.p063a.C1177f;
import p006b.p061r.p062a.p063a.C1179g;

public class MyWidget extends AppWidgetProvider {

    /* renamed from: com.digdroid.alman.dig.MyWidget$a */
    class RunnableC2121a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f7675b;

        /* renamed from: c */
        final /* synthetic */ C2219c3 f7676c;

        /* renamed from: d */
        final /* synthetic */ String f7677d;

        /* renamed from: e */
        final /* synthetic */ long f7678e;

        /* renamed from: com.digdroid.alman.dig.MyWidget$a$a */
        class DialogInterface$OnClickListenerC2122a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2122a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                HashSet hashSet = new HashSet(RunnableC2121a.this.f7676c.mo8194r("homescreen"));
                hashSet.add(RunnableC2121a.this.f7677d + RunnableC2121a.this.f7678e);
                RunnableC2121a.this.f7676c.mo8159H("homescreen", hashSet);
            }
        }

        /* renamed from: com.digdroid.alman.dig.MyWidget$a$b */
        class DialogInterface$OnClickListenerC2123b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2123b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                HashSet hashSet = new HashSet(RunnableC2121a.this.f7676c.mo8194r("homescreen"));
                hashSet.add("+" + RunnableC2121a.this.f7677d + RunnableC2121a.this.f7678e);
                RunnableC2121a.this.f7676c.mo8159H("homescreen", hashSet);
            }
        }

        RunnableC2121a(Activity activity, C2219c3 c3Var, String str, long j) {
            this.f7675b = activity;
            this.f7676c = c3Var;
            this.f7677d = str;
            this.f7678e = j;
        }

        public void run() {
            new DialogInterfaceC0068b.C0069a(this.f7675b, C2553q3.m11117c()).mo229i(this.f7675b.getString(R.string.confirm_add_homescreen)).mo232l(R.string.with_label, new DialogInterface$OnClickListenerC2123b()).mo235o(R.string.without_label, new DialogInterface$OnClickListenerC2122a()).mo221a().show();
        }
    }

    /* renamed from: com.digdroid.alman.dig.MyWidget$b */
    class DialogInterface$OnClickListenerC2124b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f7681b;

        /* renamed from: c */
        final /* synthetic */ long f7682c;

        /* renamed from: d */
        final /* synthetic */ boolean f7683d;

        /* renamed from: e */
        final /* synthetic */ ShortcutManager f7684e;

        DialogInterface$OnClickListenerC2124b(Activity activity, long j, boolean z, ShortcutManager shortcutManager) {
            this.f7681b = activity;
            this.f7682c = j;
            this.f7683d = z;
            this.f7684e = shortcutManager;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bitmap bitmap;
            Intent intent;
            String str;
            Icon icon;
            if (Build.VERSION.SDK_INT >= 26) {
                C2451k0 k0Var = new C2451k0(this.f7681b, this.f7682c);
                if (this.f7683d) {
                    if (k0Var.mo8702e()) {
                        bitmap = k0Var.mo8703f(128);
                        intent = new Intent(this.f7681b, MainActivity.class);
                        intent.setAction("com.digdroid.alman.LAUNCH_GAME");
                        intent.putExtra("system", k0Var.f8563g);
                        intent.putExtra("name", k0Var.f8565i);
                        str = k0Var.f8565i;
                    } else {
                        return;
                    }
                } else if (k0Var.mo8698a()) {
                    bitmap = k0Var.mo8699b(128);
                    intent = new Intent(this.f7681b, WidgetActivity.class);
                    intent.setAction("com.digdroid.alman.LAUNCH_GAME");
                    intent.putExtra("gameid", this.f7682c);
                    str = k0Var.f8566j;
                } else {
                    return;
                }
                if (bitmap != null) {
                    icon = Icon.createWithBitmap(bitmap);
                } else {
                    Resources resources = this.f7681b.getResources();
                    int identifier = resources.getIdentifier("icon_" + k0Var.f8564h, "drawable", this.f7681b.getPackageName());
                    if (identifier == 0) {
                        identifier = resources.getIdentifier("play", "drawable", this.f7681b.getPackageName());
                    }
                    icon = Icon.createWithResource(this.f7681b, identifier);
                }
                Activity activity = this.f7681b;
                ShortcutInfo.Builder shortLabel = new ShortcutInfo.Builder(activity, "game" + this.f7682c).setShortLabel(str.length() <= 110 ? str : str.substring(0, 10));
                if (str.length() > 125) {
                    str = str.substring(0, 25);
                }
                this.f7684e.requestPinShortcut(shortLabel.setLongLabel(str).setIcon(icon).setIntent(intent).build(), null);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.MyWidget$c */
    class DialogInterface$OnClickListenerC2125c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Runnable f7685b;

        DialogInterface$OnClickListenerC2125c(Runnable runnable) {
            this.f7685b = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f7685b.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MyWidget$d */
    public class C2126d {

        /* renamed from: a */
        long f7686a = -1;

        /* renamed from: b */
        boolean f7687b = false;

        /* renamed from: c */
        String f7688c;

        /* renamed from: d */
        String f7689d = null;

        /* renamed from: e */
        Bitmap f7690e = null;

        /* renamed from: f */
        int f7691f = -1;

        C2126d() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MyWidget$e */
    public class AsyncTaskC2127e extends AsyncTask<Void, Void, C2126d> {

        /* renamed from: a */
        Context f7693a;

        /* renamed from: b */
        AppWidgetManager f7694b;

        /* renamed from: c */
        int f7695c;

        /* renamed from: d */
        long f7696d;

        /* renamed from: e */
        boolean f7697e;

        /* renamed from: f */
        boolean f7698f;

        /* renamed from: g */
        RemoteViews f7699g;

        /* renamed from: h */
        Bundle f7700h;

        /* renamed from: i */
        C2219c3 f7701i;

        public AsyncTaskC2127e(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
            this.f7693a = context;
            this.f7694b = appWidgetManager;
            this.f7695c = i;
            this.f7700h = bundle;
            this.f7701i = C2219c3.m9805k(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2126d doInBackground(Void... voidArr) {
            return MyWidget.this.mo7951f(this.f7693a, this.f7694b, this.f7695c, this.f7696d, this.f7697e, this.f7698f, this.f7700h);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(C2126d dVar) {
            String str;
            StringBuilder sb;
            C2219c3 c3Var;
            Intent intent;
            if (dVar != null) {
                String str2 = dVar.f7689d;
                if (str2 != null) {
                    this.f7699g.setTextViewText(R.id.widgetlabel, str2);
                }
                this.f7699g.setViewVisibility(R.id.widgetlabel, dVar.f7689d != null ? 0 : 8);
                Bitmap bitmap = dVar.f7690e;
                if (bitmap != null) {
                    this.f7699g.setImageViewBitmap(R.id.widgetimage, bitmap);
                } else {
                    int i = dVar.f7691f;
                    if (i > 0) {
                        this.f7699g.setImageViewResource(R.id.widgetimage, i);
                    }
                }
                this.f7696d = dVar.f7686a;
                boolean z = dVar.f7687b;
                this.f7697e = z;
                if (z) {
                    c3Var = this.f7701i;
                    sb = new StringBuilder();
                    str = "systemwidget";
                } else {
                    c3Var = this.f7701i;
                    sb = new StringBuilder();
                    str = "widget";
                }
                sb.append(str);
                sb.append(this.f7695c);
                c3Var.mo8201y(sb.toString(), this.f7696d);
                if (this.f7696d < 0) {
                    intent = new Intent(this.f7693a, MainActivity.class);
                } else if (this.f7697e) {
                    intent = new Intent(this.f7693a, MainActivity.class);
                    intent.putExtra("system", dVar.f7688c);
                    intent.putExtra("name", dVar.f7689d);
                } else {
                    intent = new Intent(this.f7693a, WidgetActivity.class);
                    intent.putExtra("gameid", this.f7696d);
                }
                this.f7699g.setOnClickPendingIntent(R.id.widgetimage, PendingIntent.getActivity(this.f7693a, new Random().nextInt(), intent, 134217728));
                try {
                    this.f7694b.updateAppWidget(this.f7695c, this.f7699g);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            try {
                C2219c3 c3Var = this.f7701i;
                long n = c3Var.mo8190n("systemwidget" + this.f7695c, -1);
                this.f7696d = n;
                if (n >= 0) {
                    this.f7697e = true;
                } else {
                    this.f7697e = false;
                    C2219c3 c3Var2 = this.f7701i;
                    this.f7696d = c3Var2.mo8190n("widget" + this.f7695c, -1);
                }
                C2219c3 c3Var3 = this.f7701i;
                this.f7698f = c3Var3.mo8180c("widgettext" + this.f7695c, true);
            } catch (Exception unused) {
                this.f7696d = -1;
                this.f7697e = false;
                this.f7698f = true;
            }
            this.f7699g = new RemoteViews(this.f7693a.getPackageName(), (int) R.layout.widget);
        }
    }

    /* renamed from: a */
    public static void m9545a(Activity activity, long j, boolean z) {
        RunnableC2121a aVar = new RunnableC2121a(activity, C2219c3.m9805k(activity), z ? "*" : "", j);
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) activity.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRequestPinShortcutSupported()) {
                new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo228h(R.string.widget_or_shortcut).mo232l(R.string.widget, new DialogInterface$OnClickListenerC2125c(aVar)).mo235o(R.string.shortcut, new DialogInterface$OnClickListenerC2124b(activity, j, z, shortcutManager)).mo221a().show();
                return;
            }
        }
        aVar.run();
    }

    /* renamed from: b */
    static void m9546b(Context context, long j) {
        if (Build.VERSION.SDK_INT >= 25) {
            C2451k0 k0Var = new C2451k0(context, j);
            if (k0Var.mo8698a()) {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                Intent intent = new Intent(context, WidgetActivity.class);
                intent.setAction("android.intent.action.MAIN");
                intent.putExtra("gameid", j);
                ShortcutInfo build = new ShortcutInfo.Builder(context, "sc" + j).setShortLabel(k0Var.f8566j).setLongLabel(k0Var.f8566j).setIcon(m9548d(context, k0Var)).setIntent(intent).build();
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                for (int i = 0; i < dynamicShortcuts.size(); i++) {
                    if (dynamicShortcuts.get(i).getId().equals(build.getId())) {
                        return;
                    }
                }
                while (dynamicShortcuts.size() >= 4) {
                    long currentTimeMillis = System.currentTimeMillis() + 3600000;
                    String str = null;
                    int i2 = 0;
                    for (int i3 = 0; i3 < dynamicShortcuts.size(); i3++) {
                        ShortcutInfo shortcutInfo = dynamicShortcuts.get(i3);
                        if (shortcutInfo.getLastChangedTimestamp() < currentTimeMillis) {
                            currentTimeMillis = shortcutInfo.getLastChangedTimestamp();
                            str = shortcutInfo.getId();
                            i2 = i3;
                        }
                    }
                    dynamicShortcuts.remove(i2);
                    if (str != null) {
                        shortcutManager.removeDynamicShortcuts(Arrays.asList(str));
                    }
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(build));
            }
        }
    }

    /* renamed from: c */
    public static void m9547c(Context context, long j) {
        long j2;
        Uri uri;
        if (Build.VERSION.SDK_INT >= 26) {
            String str = context.getFilesDir() + "/settings.cfg";
            C2492n nVar = new C2492n(context);
            nVar.mo8774k(C2399i2.m10374d(context, str));
            int g = nVar.mo8770g("tv_column_weight", 1000);
            nVar.mo8779p("tv_column_weight", g + 1);
            String i = nVar.mo8772i("tv_channel");
            if (i.equals("")) {
                Intent intent = new Intent(context, TVActivity.class);
                intent.setAction("android.intent.action.MAIN");
                C1173c.C1174a aVar = new C1173c.C1174a();
                aVar.mo5901e("TYPE_PREVIEW").mo5900d(context.getString(R.string.recently_played)).mo5898b(intent);
                j2 = ContentUris.parseId(context.getContentResolver().insert(C1179g.C1180a.f5222a, aVar.mo5897a().mo5892b()));
                nVar.mo8782s("tv_channel", "" + j2);
                if (nVar.mo8781r(str)) {
                    C1175d.m6418a(context, j2, BitmapFactory.decodeResource(context.getResources(), R.drawable.channelicon));
                    C1179g.m6427b(context, j2);
                } else {
                    return;
                }
            } else {
                j2 = Long.parseLong(i);
            }
            C2451k0 k0Var = new C2451k0(context, j);
            if (k0Var.mo8698a()) {
                Intent intent2 = new Intent(context, TVWidgetActivity.class);
                intent2.setAction("android.intent.action.MAIN");
                intent2.putExtra("gameid", j);
                C2219c3 k = C2219c3.m9805k(context);
                String q = k.mo8193q("token", "0");
                if (k0Var.f8559c < 0 || q.length() != 32) {
                    uri = null;
                } else {
                    uri = Uri.parse("https://digdroid.com/php/getcover3.php?game=" + k0Var.f8559c + "&system=" + k0Var.f8564h + "&qual=" + "med" + "&user=" + k.mo8193q("userid", "0") + "&token=" + q);
                }
                if (uri == null) {
                    uri = Uri.parse("android.resource://" + context.getPackageName() + "/drawable/play");
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str2 = "tv_program_ids";
                String i2 = nVar.mo8772i(str2);
                String i3 = nVar.mo8772i("tv_program_games");
                if (!i2.equals("")) {
                    arrayList.addAll(Arrays.asList(i2.split(",")));
                    arrayList2.addAll(Arrays.asList(i3.split(",")));
                }
                int i4 = 0;
                while (i4 < arrayList2.size()) {
                    if (Long.parseLong((String) arrayList2.get(i4)) == j) {
                        context.getContentResolver().delete(C1179g.m6426a(Long.parseLong((String) arrayList.get(i4))), null, null);
                        arrayList.remove(i4);
                        arrayList2.remove(i4);
                        str2 = str2;
                        nVar = nVar;
                    } else {
                        i4++;
                    }
                }
                C1177f.C1178a aVar2 = new C1177f.C1178a();
                ((C1177f.C1178a) ((C1177f.C1178a) ((C1177f.C1178a) ((C1177f.C1178a) ((C1177f.C1178a) ((C1177f.C1178a) aVar2.mo5905i(j2).mo5886g(12)).mo5891c(k0Var.f8566j)).mo5889a(k0Var.f8567k)).mo5885f(3)).mo5906j(g).mo5890b(uri)).mo5883d(Uri.parse(intent2.toUri(1)))).mo5884e("pr" + j);
                arrayList.add("" + ContentUris.parseId(context.getContentResolver().insert(C1179g.C1181b.f5224a, aVar2.mo5904h().mo5887b())));
                arrayList2.add("" + j);
                while (arrayList.size() >= 10) {
                    context.getContentResolver().delete(C1179g.m6426a(Long.parseLong((String) arrayList.get(0))), null, null);
                    arrayList.remove(0);
                    arrayList2.remove(0);
                }
                nVar.mo8782s(str2, C2499n2.m10796a(",", arrayList));
                nVar.mo8782s("tv_program_games", C2499n2.m10796a(",", arrayList2));
                nVar.mo8781r(str);
            }
        }
    }

    /* renamed from: d */
    static Icon m9548d(Context context, C2451k0 k0Var) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Icon.createWithResource(context, (int) R.drawable.play);
        }
        return null;
    }

    /* renamed from: e */
    private synchronized void m9549e(Context context, Intent intent) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int intExtra = intent.getIntExtra("widgetId", 0);
        int intExtra2 = intent.getIntExtra("widgetspanx", 0);
        int intExtra3 = intent.getIntExtra("widgetspany", 0);
        if (intExtra > 0 && intExtra2 > 0 && intExtra3 > 0) {
            Bundle bundle = new Bundle();
            int i = (intExtra3 * 70) - 30;
            bundle.putInt("appWidgetMinHeight", i);
            int i2 = (intExtra2 * 70) - 30;
            bundle.putInt("appWidgetMinWidth", i2);
            bundle.putInt("appWidgetMaxHeight", i);
            bundle.putInt("appWidgetMaxWidth", i2);
            onAppWidgetOptionsChanged(context, instance, intExtra, bundle);
        }
    }

    /* renamed from: g */
    private synchronized void m9550g(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            new AsyncTaskC2127e(context, appWidgetManager, i, null).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2126d mo7951f(Context context, AppWidgetManager appWidgetManager, int i, long j, boolean z, boolean z2, Bundle bundle) {
        long j2;
        boolean z3;
        Bitmap bitmap;
        C2219c3 k = C2219c3.m9805k(context.getApplicationContext());
        C2126d dVar = new C2126d();
        dVar.f7686a = j;
        dVar.f7687b = z;
        boolean z4 = false;
        boolean z5 = true;
        if (j < 0) {
            HashSet hashSet = new HashSet(k.mo8194r("homescreen"));
            Iterator it = hashSet.iterator();
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            it.remove();
            k.mo8159H("homescreen", hashSet);
            if (str.substring(0, 1).equals("+")) {
                str = str.substring(1);
                z3 = true;
            } else {
                z3 = false;
            }
            if (str.substring(0, 1).equals("*")) {
                str = str.substring(1);
                z4 = true;
            }
            j2 = Long.parseLong(str);
            dVar.f7686a = j2;
            dVar.f7687b = z4;
            k.mo8153B("widgettext" + i, z3);
        } else {
            j2 = j;
            z4 = z;
            z5 = false;
            z3 = z2;
        }
        C2451k0 k0Var = new C2451k0(context, j2);
        int i2 = 70;
        if (!z5) {
            Bundle appWidgetOptions = (bundle != null || Build.VERSION.SDK_INT < 16) ? bundle : appWidgetManager.getAppWidgetOptions(i);
            if (appWidgetOptions != null) {
                i2 = Math.max(appWidgetOptions.getInt("appWidgetMaxWidth"), appWidgetOptions.getInt("appWidgetMaxHeight"));
            }
        }
        if (z4) {
            if (!k0Var.mo8702e()) {
                return null;
            }
            dVar.f7689d = k0Var.f8565i;
            dVar.f7688c = k0Var.f8563g;
            bitmap = k0Var.mo8703f(i2);
        } else if (!k0Var.mo8698a()) {
            return null;
        } else {
            dVar.f7689d = k0Var.f8566j;
            bitmap = k0Var.mo8699b(i2);
        }
        dVar.f7690e = bitmap;
        if (dVar.f7690e == null && dVar.f7691f < 0) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("icon_" + k0Var.f8564h, "drawable", context.getPackageName());
            if (identifier == 0) {
                identifier = resources.getIdentifier("play", "drawable", context.getPackageName());
            }
            dVar.f7691f = identifier;
        }
        if (!z3) {
            dVar.f7689d = null;
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
        if (r0.mo8190n("systemwidget" + r11, -1) >= 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onAppWidgetOptionsChanged(android.content.Context r9, android.appwidget.AppWidgetManager r10, int r11, android.os.Bundle r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.digdroid.alman.dig.c3 r0 = com.digdroid.alman.dig.C2219c3.m9805k(r9)     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "widget"
            r1.append(r2)     // Catch:{ all -> 0x0050 }
            r1.append(r11)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0050 }
            r2 = -1
            long r4 = r0.mo8190n(r1, r2)     // Catch:{ all -> 0x0050 }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x003b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = "systemwidget"
            r1.append(r4)     // Catch:{ all -> 0x0050 }
            r1.append(r11)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0050 }
            long r0 = r0.mo8190n(r1, r2)     // Catch:{ all -> 0x0050 }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x004e
        L_0x003b:
            com.digdroid.alman.dig.MyWidget$e r6 = new com.digdroid.alman.dig.MyWidget$e     // Catch:{ all -> 0x0050 }
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r2, r3, r4, r5)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.Executor r9 = android.os.AsyncTask.SERIAL_EXECUTOR     // Catch:{ all -> 0x0050 }
            r10 = 0
            java.lang.Void[] r10 = new java.lang.Void[r10]     // Catch:{ all -> 0x0050 }
            r6.executeOnExecutor(r9, r10)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r8)
            return
        L_0x0050:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.MyWidget.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onDeleted(Context context, int[] iArr) {
        C2219c3 k = C2219c3.m9805k(context.getApplicationContext());
        for (int i : iArr) {
            k.mo8160I("widget" + i);
            k.mo8160I("systemwidget" + i);
        }
    }

    public synchronized void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if (intent.getAction() != null) {
                if (intent.getAction().contentEquals("com.sec.android.widgetapp.APPWIDGET_RESIZE") && Build.VERSION.SDK_INT >= 16) {
                    m9549e(context, intent);
                }
                super.onReceive(context, intent);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (!C2185a4.m9692v(context)) {
            m9550g(context, appWidgetManager, iArr);
        }
    }
}
