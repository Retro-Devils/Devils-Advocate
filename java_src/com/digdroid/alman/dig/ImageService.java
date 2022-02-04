package com.digdroid.alman.dig;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.digdroid.alman.dig.C2295f;

public class ImageService extends IntentService {

    /* renamed from: b */
    private C2502o f7638b;

    /* renamed from: c */
    private C2219c3 f7639c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.ImageService$a */
    public class C2100a implements C2295f.AbstractC2302g {

        /* renamed from: a */
        final /* synthetic */ Context f7640a;

        C2100a(Context context) {
            this.f7640a = context;
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: a */
        public void mo7913a() {
            ImageService.m9512b(this.f7640a);
        }

        @Override // com.digdroid.alman.dig.C2295f.AbstractC2302g
        /* renamed from: b */
        public void mo7914b() {
            ImageService.m9512b(this.f7640a);
        }
    }

    public ImageService() {
        super("ImageService");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    public static synchronized void m9511a(Context context) {
        synchronized (ImageService.class) {
            C2295f.m10150g(context, new C2100a(context)).mo8412d();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m9512b(android.content.Context r3) {
        /*
            java.lang.Class<com.digdroid.alman.dig.ImageService> r0 = com.digdroid.alman.dig.ImageService.class
            monitor-enter(r0)
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            java.lang.Class<com.digdroid.alman.dig.ImageService> r2 = com.digdroid.alman.dig.ImageService.class
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = "start"
            r1.setAction(r2)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r3.startService(r1)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0016:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.ImageService.m9512b(android.content.Context):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m9513c(android.content.Context r3) {
        /*
            java.lang.Class<com.digdroid.alman.dig.ImageService> r0 = com.digdroid.alman.dig.ImageService.class
            monitor-enter(r0)
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            java.lang.Class<com.digdroid.alman.dig.ImageService> r2 = com.digdroid.alman.dig.ImageService.class
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            java.lang.String r2 = "move"
            r1.setAction(r2)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r3.startService(r1)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0016:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.ImageService.m9513c(android.content.Context):void");
    }

    public void onCreate() {
        super.onCreate();
        this.f7638b = C2502o.m10802j(getApplicationContext());
        this.f7639c = C2219c3.m9805k(getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        C2502o oVar;
        if (!C2185a4.m9694x(this) && intent != null) {
            try {
                boolean z = true;
                this.f7639c.mo8168Q(true);
                String action = intent.getAction();
                if ("rename".equals(action)) {
                    this.f7638b.mo8825p();
                } else if ("start".equals(action)) {
                    if (this.f7638b.mo8821l()) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                            int type = activeNetworkInfo.getType();
                            if (!this.f7639c.mo8180c("wifi_only", true)) {
                                oVar = this.f7638b;
                            } else if (type == 1 || type == 9) {
                                oVar = this.f7638b;
                            }
                            z = oVar.mo8818h();
                        }
                    }
                } else if (action.equals("get_moby")) {
                    this.f7638b.mo8820k();
                } else if (action.equals("get_gamefaqs")) {
                    this.f7638b.mo8815e();
                }
                if (z) {
                    this.f7639c.mo8168Q(false);
                }
            } catch (Exception unused) {
            }
        }
    }
}
