package com.digdroid.alman.dig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.DialogInterfaceC0068b;
import p006b.p057o.p058a.C1088a;

/* renamed from: com.digdroid.alman.dig.a2 */
public abstract class AbstractActivityC2178a2 extends AbstractActivityC2533p2 {

    /* renamed from: R0 */
    private C2180b f7846R0;

    /* renamed from: S0 */
    private Object f7847S0 = new Object();

    /* renamed from: com.digdroid.alman.dig.a2$b */
    private class C2180b extends BroadcastReceiver {
        private C2180b() {
        }

        public void onReceive(Context context, Intent intent) {
            AbstractActivityC2178a2 a2Var;
            String action;
            AbstractActivityC2178a2 a2Var2;
            boolean z;
            if (context != null && (a2Var = AbstractActivityC2178a2.this) != null && !a2Var.isFinishing() && intent != null && (action = intent.getAction()) != null) {
                String packageName = AbstractActivityC2178a2.this.getPackageName();
                AbstractC2531p1 k1 = AbstractActivityC2178a2.this.mo8280k1();
                if (k1 != null && k1.mo8102B2()) {
                    if (action.equals(packageName + "." + "request_refresh")) {
                        synchronized (AbstractActivityC2178a2.this.f7847S0) {
                            AbstractActivityC2178a2.this.mo8264R();
                            k1.mo8105F2();
                        }
                        return;
                    }
                }
                if (k1 != null && k1.mo8102B2()) {
                    if (action.equals(packageName + "." + "image_downloaded")) {
                        synchronized (AbstractActivityC2178a2.this.f7847S0) {
                            k1.mo8410z2(intent);
                        }
                        return;
                    }
                }
                if (k1 != null && k1.mo8102B2()) {
                    if (action.equals(packageName + "." + "INSTALL_PROGRESS")) {
                        if (k1 instanceof C2292e3) {
                            ((C2292e3) k1).mo8408g3(intent);
                            return;
                        }
                        return;
                    }
                }
                if (action.equals(packageName + "." + "save_error")) {
                    new DialogInterfaceC0068b.C0069a(AbstractActivityC2178a2.this, C2553q3.m11117c()).mo229i(AbstractActivityC2178a2.this.getString(R.string.cover_save_error)).mo235o(17039370, null).mo221a().show();
                    return;
                }
                if (action.equals(packageName + "." + "STATS_START")) {
                    a2Var2 = AbstractActivityC2178a2.this;
                    z = true;
                } else {
                    if (action.equals(packageName + "." + "STATS_END")) {
                        a2Var2 = AbstractActivityC2178a2.this;
                        z = false;
                    } else {
                        if (action.equals(packageName + "." + "PROGRESS_UPDATE")) {
                            AbstractActivityC2178a2.this.mo9521f1(intent);
                            return;
                        }
                        return;
                    }
                }
                a2Var2.mo8279k0(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.appcompat.app.ActivityC0070c
    public void onStart() {
        super.onStart();
        this.f7846R0 = new C2180b();
        C1088a b = C1088a.m6129b(getApplicationContext());
        C2180b bVar = this.f7846R0;
        b.mo5722c(bVar, new IntentFilter(getPackageName() + "." + "request_refresh"));
        C1088a b2 = C1088a.m6129b(getApplicationContext());
        C2180b bVar2 = this.f7846R0;
        b2.mo5722c(bVar2, new IntentFilter(getPackageName() + "." + "image_downloaded"));
        C1088a b3 = C1088a.m6129b(getApplicationContext());
        C2180b bVar3 = this.f7846R0;
        b3.mo5722c(bVar3, new IntentFilter(getPackageName() + "." + "save_error"));
        C1088a b4 = C1088a.m6129b(getApplicationContext());
        C2180b bVar4 = this.f7846R0;
        b4.mo5722c(bVar4, new IntentFilter(getPackageName() + "." + "STATS_START"));
        C1088a b5 = C1088a.m6129b(getApplicationContext());
        C2180b bVar5 = this.f7846R0;
        b5.mo5722c(bVar5, new IntentFilter(getPackageName() + "." + "STATS_END"));
        C1088a b6 = C1088a.m6129b(getApplicationContext());
        C2180b bVar6 = this.f7846R0;
        b6.mo5722c(bVar6, new IntentFilter(getPackageName() + "." + "INSTALL_PROGRESS"));
        C1088a b7 = C1088a.m6129b(getApplicationContext());
        C2180b bVar7 = this.f7846R0;
        b7.mo5722c(bVar7, new IntentFilter(getPackageName() + "." + "PROGRESS_UPDATE"));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.appcompat.app.ActivityC0070c
    public void onStop() {
        super.onStop();
        C1088a.m6129b(getApplicationContext()).mo5724e(this.f7846R0);
    }
}
