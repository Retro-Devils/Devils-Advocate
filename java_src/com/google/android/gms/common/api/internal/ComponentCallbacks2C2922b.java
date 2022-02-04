package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C3044f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class ComponentCallbacks2C2922b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: b */
    private static final ComponentCallbacks2C2922b f9794b = new ComponentCallbacks2C2922b();

    /* renamed from: c */
    private final AtomicBoolean f9795c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f9796d = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: e */
    private final ArrayList<AbstractC2923a> f9797e = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: f */
    private boolean f9798f = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface AbstractC2923a {
        /* renamed from: a */
        void mo9620a(boolean z);
    }

    private ComponentCallbacks2C2922b() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C2922b m12062b() {
        return f9794b;
    }

    /* renamed from: c */
    public static void m12063c(Application application) {
        ComponentCallbacks2C2922b bVar = f9794b;
        synchronized (bVar) {
            if (!bVar.f9798f) {
                application.registerActivityLifecycleCallbacks(bVar);
                application.registerComponentCallbacks(bVar);
                bVar.f9798f = true;
            }
        }
    }

    /* renamed from: e */
    private final void m12064e(boolean z) {
        synchronized (f9794b) {
            ArrayList<AbstractC2923a> arrayList = this.f9797e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                AbstractC2923a aVar = arrayList.get(i);
                i++;
                aVar.mo9620a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo9607a(AbstractC2923a aVar) {
        synchronized (f9794b) {
            this.f9797e.add(aVar);
        }
    }

    /* renamed from: d */
    public final boolean mo9608d() {
        return this.f9795c.get();
    }

    @TargetApi(16)
    /* renamed from: f */
    public final boolean mo9609f(boolean z) {
        if (!this.f9796d.get()) {
            if (!C3044f.m12444c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f9796d.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f9795c.set(true);
            }
        }
        return mo9608d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9795c.compareAndSet(true, false);
        this.f9796d.set(true);
        if (compareAndSet) {
            m12064e(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9795c.compareAndSet(true, false);
        this.f9796d.set(true);
        if (compareAndSet) {
            m12064e(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f9795c.compareAndSet(false, true)) {
            this.f9796d.set(true);
            m12064e(true);
        }
    }
}
