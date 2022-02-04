package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.AbstractC2914g;
import com.google.android.gms.common.api.AbstractC2916h;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.AbstractC2965l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3013l;
import com.google.android.gms.common.internal.C3027r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p069c.p073b.p074a.p075a.p081d.p082a.HandlerC1308d;

@KeepName
public abstract class BasePendingResult<R extends AbstractC2964k> extends AbstractC2914g<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f9784a = new C2949m0();

    /* renamed from: b */
    private final Object f9785b;

    /* renamed from: c */
    private final HandlerC2918a<R> f9786c;

    /* renamed from: d */
    private final WeakReference<AbstractC2911f> f9787d;

    /* renamed from: e */
    private final CountDownLatch f9788e;

    /* renamed from: f */
    private final ArrayList<AbstractC2914g.AbstractC2915a> f9789f;

    /* renamed from: g */
    private AbstractC2965l<? super R> f9790g;

    /* renamed from: h */
    private final AtomicReference<AbstractC2935f0> f9791h;

    /* renamed from: i */
    private R f9792i;

    /* renamed from: j */
    private Status f9793j;

    /* renamed from: k */
    private volatile boolean f9794k;

    /* renamed from: l */
    private boolean f9795l;

    /* renamed from: m */
    private boolean f9796m;
    @KeepName
    private C2919b mResultGuardian;

    /* renamed from: n */
    private AbstractC3013l f9797n;

    /* renamed from: o */
    private volatile C2931d0<R> f9798o;

    /* renamed from: p */
    private boolean f9799p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC2918a<R extends AbstractC2964k> extends HandlerC1308d {
        public HandlerC2918a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo9603a(AbstractC2965l<? super R> lVar, R r) {
            sendMessage(obtainMessage(1, new Pair(lVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.l */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                AbstractC2965l lVar = (AbstractC2965l) pair.first;
                AbstractC2964k kVar = (AbstractC2964k) pair.second;
                try {
                    lVar.mo9685a(kVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m12053i(kVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo9601j(Status.f9756e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    public final class C2919b {
        private C2919b() {
        }

        /* synthetic */ C2919b(BasePendingResult basePendingResult, C2949m0 m0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m12053i(BasePendingResult.this.f9792i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f9785b = new Object();
        this.f9788e = new CountDownLatch(1);
        this.f9789f = new ArrayList<>();
        this.f9791h = new AtomicReference<>();
        this.f9799p = false;
        this.f9786c = new HandlerC2918a<>(Looper.getMainLooper());
        this.f9787d = new WeakReference<>(null);
    }

    protected BasePendingResult(AbstractC2911f fVar) {
        this.f9785b = new Object();
        this.f9788e = new CountDownLatch(1);
        this.f9789f = new ArrayList<>();
        this.f9791h = new AtomicReference<>();
        this.f9799p = false;
        this.f9786c = new HandlerC2918a<>(fVar != null ? fVar.mo9591b() : Looper.getMainLooper());
        this.f9787d = new WeakReference<>(fVar);
    }

    /* renamed from: d */
    private final R m12050d() {
        R r;
        synchronized (this.f9785b) {
            C3027r.m12379k(!this.f9794k, "Result has already been consumed.");
            C3027r.m12379k(mo9599e(), "Result is not ready.");
            r = this.f9792i;
            this.f9792i = null;
            this.f9790g = null;
            this.f9794k = true;
        }
        AbstractC2935f0 andSet = this.f9791h.getAndSet(null);
        if (andSet != null) {
            andSet.mo9654a(this);
        }
        return r;
    }

    /* renamed from: h */
    private final void m12052h(R r) {
        this.f9792i = r;
        this.f9797n = null;
        this.f9788e.countDown();
        this.f9793j = this.f9792i.mo6351g();
        if (this.f9795l) {
            this.f9790g = null;
        } else if (this.f9790g != null) {
            this.f9786c.removeMessages(2);
            this.f9786c.mo9603a(this.f9790g, m12050d());
        } else if (this.f9792i instanceof AbstractC2916h) {
            this.mResultGuardian = new C2919b(this, null);
        }
        ArrayList<AbstractC2914g.AbstractC2915a> arrayList = this.f9789f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC2914g.AbstractC2915a aVar = arrayList.get(i);
            i++;
            aVar.mo9597a(this.f9793j);
        }
        this.f9789f.clear();
    }

    /* renamed from: i */
    public static void m12053i(AbstractC2964k kVar) {
        if (kVar instanceof AbstractC2916h) {
            try {
                ((AbstractC2916h) kVar).mo9598a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC2914g
    /* renamed from: a */
    public final void mo9595a(AbstractC2914g.AbstractC2915a aVar) {
        C3027r.m12370b(aVar != null, "Callback cannot be null.");
        synchronized (this.f9785b) {
            if (mo9599e()) {
                aVar.mo9597a(this.f9793j);
            } else {
                this.f9789f.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC2914g
    /* renamed from: b */
    public final R mo9596b(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C3027r.m12375g("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C3027r.m12379k(!this.f9794k, "Result has already been consumed.");
        if (this.f9798o != null) {
            z = false;
        }
        C3027r.m12379k(z, "Cannot await if then() has been called.");
        try {
            if (!this.f9788e.await(j, timeUnit)) {
                mo9601j(Status.f9756e);
            }
        } catch (InterruptedException unused) {
            mo9601j(Status.f9754c);
        }
        C3027r.m12379k(mo9599e(), "Result is not ready.");
        return m12050d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract R mo6352c(Status status);

    /* renamed from: e */
    public final boolean mo9599e() {
        return this.f9788e.getCount() == 0;
    }

    /* renamed from: f */
    public final void mo9600f(R r) {
        synchronized (this.f9785b) {
            if (this.f9796m || this.f9795l) {
                m12053i(r);
                return;
            }
            mo9599e();
            boolean z = true;
            C3027r.m12379k(!mo9599e(), "Results have already been set");
            if (this.f9794k) {
                z = false;
            }
            C3027r.m12379k(z, "Result has already been consumed");
            m12052h(r);
        }
    }

    /* renamed from: j */
    public final void mo9601j(Status status) {
        synchronized (this.f9785b) {
            if (!mo9599e()) {
                mo9600f(mo6352c(status));
                this.f9796m = true;
            }
        }
    }

    /* renamed from: k */
    public final void mo9602k() {
        this.f9799p = this.f9799p || f9784a.get().booleanValue();
    }
}
