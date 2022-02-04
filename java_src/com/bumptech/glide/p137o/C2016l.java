package com.bumptech.glide.p137o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractC0453i;
import androidx.fragment.app.ActivityC0447d;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.ComponentCallbacks2C1626k;
import com.bumptech.glide.p144t.C2082k;
import java.util.HashMap;
import java.util.Map;
import p006b.p021d.C0823a;

/* renamed from: com.bumptech.glide.o.l */
public class C2016l implements Handler.Callback {

    /* renamed from: a */
    private static final AbstractC2018b f7430a = new C2017a();

    /* renamed from: b */
    private volatile ComponentCallbacks2C1626k f7431b;

    /* renamed from: c */
    final Map<FragmentManager, FragmentC2014k> f7432c = new HashMap();

    /* renamed from: d */
    final Map<AbstractC0453i, C2021o> f7433d = new HashMap();

    /* renamed from: e */
    private final Handler f7434e;

    /* renamed from: f */
    private final AbstractC2018b f7435f;

    /* renamed from: g */
    private final C0823a<View, Fragment> f7436g = new C0823a<>();

    /* renamed from: h */
    private final C0823a<View, android.app.Fragment> f7437h = new C0823a<>();

    /* renamed from: i */
    private final Bundle f7438i = new Bundle();

    /* renamed from: com.bumptech.glide.o.l$a */
    class C2017a implements AbstractC2018b {
        C2017a() {
        }

        @Override // com.bumptech.glide.p137o.C2016l.AbstractC2018b
        /* renamed from: a */
        public ComponentCallbacks2C1626k mo6977a(ComponentCallbacks2C1610c cVar, AbstractC2011h hVar, AbstractC2019m mVar, Context context) {
            return new ComponentCallbacks2C1626k(cVar, hVar, mVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.o.l$b */
    public interface AbstractC2018b {
        /* renamed from: a */
        ComponentCallbacks2C1626k mo6977a(ComponentCallbacks2C1610c cVar, AbstractC2011h hVar, AbstractC2019m mVar, Context context);
    }

    public C2016l(AbstractC2018b bVar) {
        this.f7435f = bVar == null ? f7430a : bVar;
        this.f7434e = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    private static void m9108a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static Activity m9109b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m9109b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    /* renamed from: c */
    private ComponentCallbacks2C1626k m9110c(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        FragmentC2014k i = m9112i(fragmentManager, fragment, z);
        ComponentCallbacks2C1626k e = i.mo7679e();
        if (e != null) {
            return e;
        }
        ComponentCallbacks2C1626k a = this.f7435f.mo6977a(ComponentCallbacks2C1610c.m7749c(context), i.mo7678c(), i.mo7680f(), context);
        i.mo7682k(a);
        return a;
    }

    /* renamed from: g */
    private ComponentCallbacks2C1626k m9111g(Context context) {
        if (this.f7431b == null) {
            synchronized (this) {
                if (this.f7431b == null) {
                    this.f7431b = this.f7435f.mo6977a(ComponentCallbacks2C1610c.m7749c(context.getApplicationContext()), new C2003b(), new C2010g(), context.getApplicationContext());
                }
            }
        }
        return this.f7431b;
    }

    /* renamed from: i */
    private FragmentC2014k m9112i(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        FragmentC2014k kVar = (FragmentC2014k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f7432c.get(fragmentManager)) == null) {
            kVar = new FragmentC2014k();
            kVar.mo7681j(fragment);
            if (z) {
                kVar.mo7678c().mo7671d();
            }
            this.f7432c.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f7434e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    /* renamed from: k */
    private C2021o m9113k(AbstractC0453i iVar, Fragment fragment, boolean z) {
        C2021o oVar = (C2021o) iVar.mo2732d("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f7433d.get(iVar)) == null) {
            oVar = new C2021o();
            oVar.mo7709z2(fragment);
            if (z) {
                oVar.mo7706r2().mo7671d();
            }
            this.f7433d.put(iVar, oVar);
            iVar.mo2729a().mo2869c(oVar, "com.bumptech.glide.manager").mo2635f();
            this.f7434e.obtainMessage(2, iVar).sendToTarget();
        }
        return oVar;
    }

    /* renamed from: l */
    private static boolean m9114l(Context context) {
        Activity b = m9109b(context);
        return b == null || !b.isFinishing();
    }

    /* renamed from: m */
    private ComponentCallbacks2C1626k m9115m(Context context, AbstractC0453i iVar, Fragment fragment, boolean z) {
        C2021o k = m9113k(iVar, fragment, z);
        ComponentCallbacks2C1626k t2 = k.mo7707t2();
        if (t2 != null) {
            return t2;
        }
        ComponentCallbacks2C1626k a = this.f7435f.mo6977a(ComponentCallbacks2C1610c.m7749c(context), k.mo7706r2(), k.mo7708u2(), context);
        k.mo7704A2(a);
        return a;
    }

    /* renamed from: d */
    public ComponentCallbacks2C1626k mo7690d(Activity activity) {
        if (C2082k.m9448o()) {
            return mo7691e(activity.getApplicationContext());
        }
        m9108a(activity);
        return m9110c(activity, activity.getFragmentManager(), null, m9114l(activity));
    }

    /* renamed from: e */
    public ComponentCallbacks2C1626k mo7691e(Context context) {
        if (context != null) {
            if (C2082k.m9449p() && !(context instanceof Application)) {
                if (context instanceof ActivityC0447d) {
                    return mo7692f((ActivityC0447d) context);
                }
                if (context instanceof Activity) {
                    return mo7690d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo7691e(contextWrapper.getBaseContext());
                    }
                }
            }
            return m9111g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: f */
    public ComponentCallbacks2C1626k mo7692f(ActivityC0447d dVar) {
        if (C2082k.m9448o()) {
            return mo7691e(dVar.getApplicationContext());
        }
        m9108a(dVar);
        return m9115m(dVar, dVar.mo2668C0(), null, m9114l(dVar));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: h */
    public FragmentC2014k mo7693h(Activity activity) {
        return m9112i(activity.getFragmentManager(), null, m9114l(activity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f7432c;
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (AbstractC0453i) message.obj;
            map = this.f7433d;
        }
        obj3 = map.remove(obj2);
        obj = obj2;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2021o mo7695j(Context context, AbstractC0453i iVar) {
        return m9113k(iVar, null, m9114l(context));
    }
}
