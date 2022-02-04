package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3004i;
import com.google.android.gms.common.internal.AbstractC3015m;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p069c.p073b.p074a.p075a.p077b.C1279a;
import p069c.p073b.p074a.p075a.p077b.C1281c;
import p069c.p073b.p074a.p075a.p077b.C1284e;
import p069c.p073b.p074a.p075a.p081d.p083b.HandlerC1312d;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class AbstractC2978c<T extends IInterface> {

    /* renamed from: a */
    private static final C1281c[] f9909a = new C1281c[0];

    /* renamed from: b */
    public static final String[] f9910b = {"service_esmobile", "service_googleme"};

    /* renamed from: A */
    private boolean f9911A = false;

    /* renamed from: B */
    private volatile C2997e0 f9912B = null;

    /* renamed from: C */
    protected AtomicInteger f9913C = new AtomicInteger(0);

    /* renamed from: c */
    private int f9914c;

    /* renamed from: d */
    private long f9915d;

    /* renamed from: e */
    private long f9916e;

    /* renamed from: f */
    private int f9917f;

    /* renamed from: g */
    private long f9918g;

    /* renamed from: h */
    private C3012k0 f9919h;

    /* renamed from: i */
    private final Context f9920i;

    /* renamed from: j */
    private final Looper f9921j;

    /* renamed from: k */
    private final AbstractC3004i f9922k;

    /* renamed from: l */
    private final C1284e f9923l;

    /* renamed from: m */
    final Handler f9924m;

    /* renamed from: n */
    private final Object f9925n = new Object();

    /* renamed from: o */
    private final Object f9926o = new Object();
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: p */
    private AbstractC3020o f9927p;

    /* renamed from: q */
    protected AbstractC2981c f9928q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private T f9929r;

    /* renamed from: s */
    private final ArrayList<AbstractC2986h<?>> f9930s = new ArrayList<>();
    @GuardedBy("mLock")

    /* renamed from: t */
    private ServiceConnectionC2988j f9931t;
    @GuardedBy("mLock")

    /* renamed from: u */
    private int f9932u = 1;

    /* renamed from: v */
    private final AbstractC2979a f9933v;

    /* renamed from: w */
    private final AbstractC2980b f9934w;

    /* renamed from: x */
    private final int f9935x;

    /* renamed from: y */
    private final String f9936y;

    /* renamed from: z */
    private C1279a f9937z = null;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface AbstractC2979a {
        /* renamed from: j */
        void mo9728j(int i);

        /* renamed from: m */
        void mo9729m(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface AbstractC2980b {
        /* renamed from: i */
        void mo9730i(C1279a aVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface AbstractC2981c {
        /* renamed from: a */
        void mo9653a(C1279a aVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class C2982d implements AbstractC2981c {
        public C2982d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2981c
        /* renamed from: a */
        public void mo9653a(C1279a aVar) {
            if (aVar.mo6266l()) {
                AbstractC2978c cVar = AbstractC2978c.this;
                cVar.mo9716h(null, cVar.mo9727z());
            } else if (AbstractC2978c.this.f9934w != null) {
                AbstractC2978c.this.f9934w.mo9730i(aVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface AbstractC2983e {
        /* renamed from: a */
        void mo9678a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    private abstract class AbstractC2984f extends AbstractC2986h<Boolean> {

        /* renamed from: d */
        private final int f9939d;

        /* renamed from: e */
        private final Bundle f9940e;

        protected AbstractC2984f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f9939d = i;
            this.f9940e = bundle;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2986h
        /* renamed from: c */
        public final /* synthetic */ void mo9731c(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                AbstractC2978c.this.m12208N(1, null);
                return;
            }
            int i = this.f9939d;
            if (i != 0) {
                if (i != 10) {
                    AbstractC2978c.this.m12208N(1, null);
                    Bundle bundle = this.f9940e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    mo9733f(new C1279a(this.f9939d, pendingIntent));
                    return;
                }
                AbstractC2978c.this.m12208N(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), AbstractC2978c.this.mo6357n(), AbstractC2978c.this.mo6354g()));
            } else if (!mo9734g()) {
                AbstractC2978c.this.m12208N(1, null);
                mo9733f(new C1279a(8, null));
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2986h
        /* renamed from: d */
        public final void mo9732d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo9733f(C1279a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract boolean mo9734g();
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    final class HandlerC2985g extends HandlerC1312d {
        public HandlerC2985g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m12268a(Message message) {
            AbstractC2986h hVar = (AbstractC2986h) message.obj;
            hVar.mo9732d();
            hVar.mo9737b();
        }

        /* renamed from: b */
        private static boolean m12269b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            if (AbstractC2978c.this.f9913C.get() == message.arg1) {
                int i = message.what;
                if ((i == 1 || i == 7 || ((i == 4 && !AbstractC2978c.this.mo9721s()) || message.what == 5)) && !AbstractC2978c.this.mo9712c()) {
                    m12268a(message);
                    return;
                }
                int i2 = message.what;
                PendingIntent pendingIntent = null;
                if (i2 == 4) {
                    AbstractC2978c.this.f9937z = new C1279a(message.arg2);
                    if (!AbstractC2978c.this.m12224d0() || AbstractC2978c.this.f9911A) {
                        C1279a aVar = AbstractC2978c.this.f9937z != null ? AbstractC2978c.this.f9937z : new C1279a(8);
                        AbstractC2978c.this.f9928q.mo9653a(aVar);
                        AbstractC2978c.this.mo9704D(aVar);
                        return;
                    }
                    AbstractC2978c.this.m12208N(3, null);
                } else if (i2 == 5) {
                    C1279a aVar2 = AbstractC2978c.this.f9937z != null ? AbstractC2978c.this.f9937z : new C1279a(8);
                    AbstractC2978c.this.f9928q.mo9653a(aVar2);
                    AbstractC2978c.this.mo9704D(aVar2);
                } else if (i2 == 3) {
                    Object obj = message.obj;
                    if (obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) obj;
                    }
                    C1279a aVar3 = new C1279a(message.arg2, pendingIntent);
                    AbstractC2978c.this.f9928q.mo9653a(aVar3);
                    AbstractC2978c.this.mo9704D(aVar3);
                } else if (i2 == 6) {
                    AbstractC2978c.this.m12208N(5, null);
                    if (AbstractC2978c.this.f9933v != null) {
                        AbstractC2978c.this.f9933v.mo9728j(message.arg2);
                    }
                    AbstractC2978c.this.mo9705E(message.arg2);
                    AbstractC2978c.this.m12213S(5, 1, null);
                } else if (i2 == 2 && !AbstractC2978c.this.mo9714e()) {
                    m12268a(message);
                } else if (m12269b(message)) {
                    ((AbstractC2986h) message.obj).mo9738e();
                } else {
                    int i3 = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i3);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            } else if (m12269b(message)) {
                m12268a(message);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$h */
    public abstract class AbstractC2986h<TListener> {

        /* renamed from: a */
        private TListener f9943a;

        /* renamed from: b */
        private boolean f9944b = false;

        public AbstractC2986h(TListener tlistener) {
            this.f9943a = tlistener;
        }

        /* renamed from: a */
        public final void mo9736a() {
            synchronized (this) {
                this.f9943a = null;
            }
        }

        /* renamed from: b */
        public final void mo9737b() {
            mo9736a();
            synchronized (AbstractC2978c.this.f9930s) {
                AbstractC2978c.this.f9930s.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo9731c(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo9732d();

        /* renamed from: e */
        public final void mo9738e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f9943a;
                if (this.f9944b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo9731c(tlistener);
                } catch (RuntimeException e) {
                    mo9732d();
                    throw e;
                }
            } else {
                mo9732d();
            }
            synchronized (this) {
                this.f9944b = true;
            }
            mo9737b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class BinderC2987i extends AbstractC3015m.AbstractBinderC3016a {

        /* renamed from: a */
        private AbstractC2978c f9946a;

        /* renamed from: b */
        private final int f9947b;

        public BinderC2987i(AbstractC2978c cVar, int i) {
            this.f9946a = cVar;
            this.f9947b = i;
        }

        @Override // com.google.android.gms.common.internal.AbstractC3015m
        /* renamed from: R */
        public final void mo9739R(int i, IBinder iBinder, C2997e0 e0Var) {
            C3027r.m12377i(this.f9946a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C3027r.m12376h(e0Var);
            this.f9946a.m12212R(e0Var);
            mo9741t0(i, iBinder, e0Var.f9975b);
        }

        @Override // com.google.android.gms.common.internal.AbstractC3015m
        /* renamed from: b0 */
        public final void mo9740b0(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.AbstractC3015m
        /* renamed from: t0 */
        public final void mo9741t0(int i, IBinder iBinder, Bundle bundle) {
            C3027r.m12377i(this.f9946a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f9946a.mo9706F(i, iBinder, bundle, this.f9947b);
            this.f9946a = null;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class ServiceConnectionC2988j implements ServiceConnection {

        /* renamed from: a */
        private final int f9948a;

        public ServiceConnectionC2988j(int i) {
            this.f9948a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC2978c cVar = AbstractC2978c.this;
            if (iBinder == null) {
                cVar.m12215U(16);
                return;
            }
            synchronized (cVar.f9926o) {
                AbstractC2978c cVar2 = AbstractC2978c.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar2.f9927p = (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC3020o)) ? new C3018n(iBinder) : (AbstractC3020o) queryLocalInterface;
            }
            AbstractC2978c.this.mo9710M(0, null, this.f9948a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AbstractC2978c.this.f9926o) {
                AbstractC2978c.this.f9927p = null;
            }
            Handler handler = AbstractC2978c.this.f9924m;
            handler.sendMessage(handler.obtainMessage(6, this.f9948a, 1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$k */
    public final class C2989k extends AbstractC2984f {

        /* renamed from: g */
        private final IBinder f9950g;

        public C2989k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f9950g = iBinder;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2984f
        /* renamed from: f */
        public final void mo9733f(C1279a aVar) {
            if (AbstractC2978c.this.f9934w != null) {
                AbstractC2978c.this.f9934w.mo9730i(aVar);
            }
            AbstractC2978c.this.mo9704D(aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2984f
        /* renamed from: g */
        public final boolean mo9734g() {
            try {
                String interfaceDescriptor = this.f9950g.getInterfaceDescriptor();
                if (!AbstractC2978c.this.mo6354g().equals(interfaceDescriptor)) {
                    String g = AbstractC2978c.this.mo6354g();
                    StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(g);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface i = AbstractC2978c.this.mo6355i(this.f9950g);
                if (i == null || (!AbstractC2978c.this.m12213S(2, 4, i) && !AbstractC2978c.this.m12213S(3, 4, i))) {
                    return false;
                }
                AbstractC2978c.this.f9937z = null;
                Bundle v = AbstractC2978c.this.mo9724v();
                if (AbstractC2978c.this.f9933v == null) {
                    return true;
                }
                AbstractC2978c.this.f9933v.mo9729m(v);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$l */
    public final class C2990l extends AbstractC2984f {
        public C2990l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2984f
        /* renamed from: f */
        public final void mo9733f(C1279a aVar) {
            if (!AbstractC2978c.this.mo9721s() || !AbstractC2978c.this.m12224d0()) {
                AbstractC2978c.this.f9928q.mo9653a(aVar);
                AbstractC2978c.this.mo9704D(aVar);
                return;
            }
            AbstractC2978c.this.m12215U(16);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2984f
        /* renamed from: g */
        public final boolean mo9734g() {
            AbstractC2978c.this.f9928q.mo9653a(C1279a.f5528b);
            return true;
        }
    }

    protected AbstractC2978c(Context context, Looper looper, AbstractC3004i iVar, C1284e eVar, int i, AbstractC2979a aVar, AbstractC2980b bVar, String str) {
        this.f9920i = (Context) C3027r.m12377i(context, "Context must not be null");
        this.f9921j = (Looper) C3027r.m12377i(looper, "Looper must not be null");
        this.f9922k = (AbstractC3004i) C3027r.m12377i(iVar, "Supervisor must not be null");
        this.f9923l = (C1284e) C3027r.m12377i(eVar, "API availability must not be null");
        this.f9924m = new HandlerC2985g(looper);
        this.f9935x = i;
        this.f9933v = aVar;
        this.f9934w = bVar;
        this.f9936y = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: N */
    private final void m12208N(int i, T t) {
        C3012k0 k0Var;
        C3027r.m12369a((i == 4) == (t != null));
        synchronized (this.f9925n) {
            this.f9932u = i;
            this.f9929r = t;
            mo9707G(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f9931t == null || (k0Var = this.f9919h) == null)) {
                        String c = k0Var.mo9799c();
                        String a = this.f9919h.mo9797a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c);
                        sb.append(" on ");
                        sb.append(a);
                        Log.e("GmsClient", sb.toString());
                        this.f9922k.mo9774b(this.f9919h.mo9799c(), this.f9919h.mo9797a(), this.f9919h.mo9798b(), this.f9931t, m12222b0());
                        this.f9913C.incrementAndGet();
                    }
                    this.f9931t = new ServiceConnectionC2988j(this.f9913C.get());
                    C3012k0 k0Var2 = (this.f9932u != 3 || mo9726y() == null) ? new C3012k0(mo9702B(), mo6357n(), false, 129) : new C3012k0(mo9725w().getPackageName(), mo9726y(), true, 129);
                    this.f9919h = k0Var2;
                    if (!this.f9922k.mo9771c(new AbstractC3004i.C3005a(k0Var2.mo9799c(), this.f9919h.mo9797a(), this.f9919h.mo9798b()), this.f9931t, m12222b0())) {
                        String c2 = this.f9919h.mo9799c();
                        String a2 = this.f9919h.mo9797a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c2);
                        sb2.append(" on ");
                        sb2.append(a2);
                        Log.e("GmsClient", sb2.toString());
                        mo9710M(16, null, this.f9913C.get());
                    }
                } else if (i == 4) {
                    mo9703C(t);
                }
            } else if (this.f9931t != null) {
                this.f9922k.mo9774b(this.f9919h.mo9799c(), this.f9919h.mo9797a(), this.f9919h.mo9798b(), this.f9931t, m12222b0());
                this.f9931t = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: R */
    private final void m12212R(C2997e0 e0Var) {
        this.f9912B = e0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: S */
    private final boolean m12213S(int i, int i2, T t) {
        synchronized (this.f9925n) {
            if (this.f9932u != i) {
                return false;
            }
            m12208N(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: U */
    private final void m12215U(int i) {
        int i2;
        if (m12223c0()) {
            i2 = 5;
            this.f9911A = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f9924m;
        handler.sendMessage(handler.obtainMessage(i2, this.f9913C.get(), 16));
    }

    /* renamed from: b0 */
    private final String m12222b0() {
        String str = this.f9936y;
        return str == null ? this.f9920i.getClass().getName() : str;
    }

    /* renamed from: c0 */
    private final boolean m12223c0() {
        boolean z;
        synchronized (this.f9925n) {
            z = this.f9932u == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d0 */
    private final boolean m12224d0() {
        if (this.f9911A || TextUtils.isEmpty(mo6354g()) || TextUtils.isEmpty(mo9726y())) {
            return false;
        }
        try {
            Class.forName(mo6354g());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: A */
    public final T mo9701A() {
        T t;
        synchronized (this.f9925n) {
            if (this.f9932u != 5) {
                mo9720r();
                C3027r.m12379k(this.f9929r != null, "Client is connected but service is null");
                t = this.f9929r;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo9702B() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo9703C(T t) {
        this.f9916e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo9704D(C1279a aVar) {
        this.f9917f = aVar.mo6261h();
        this.f9918g = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo9705E(int i) {
        this.f9914c = i;
        this.f9915d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo9706F(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f9924m;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2989k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo9707G(int i, T t) {
    }

    /* renamed from: H */
    public boolean mo9708H() {
        return false;
    }

    /* renamed from: I */
    public void mo9709I(int i) {
        Handler handler = this.f9924m;
        handler.sendMessage(handler.obtainMessage(6, this.f9913C.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo9710M(int i, Bundle bundle, int i2) {
        Handler handler = this.f9924m;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2990l(i, null)));
    }

    /* renamed from: a */
    public void mo9711a(AbstractC2983e eVar) {
        eVar.mo9678a();
    }

    /* renamed from: c */
    public boolean mo9712c() {
        boolean z;
        synchronized (this.f9925n) {
            int i = this.f9932u;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public final C1281c[] mo9713d() {
        C2997e0 e0Var = this.f9912B;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f9976c;
    }

    /* renamed from: e */
    public boolean mo9714e() {
        boolean z;
        synchronized (this.f9925n) {
            z = this.f9932u == 4;
        }
        return z;
    }

    /* renamed from: f */
    public String mo9715f() {
        C3012k0 k0Var;
        if (mo9714e() && (k0Var = this.f9919h) != null) {
            return k0Var.mo9797a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo6354g();

    /* renamed from: h */
    public void mo9716h(AbstractC3009k kVar, Set<Scope> set) {
        Bundle x = mo6397x();
        C3000g gVar = new C3000g(this.f9935x);
        gVar.f9980e = this.f9920i.getPackageName();
        gVar.f9983h = x;
        if (set != null) {
            gVar.f9982g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo6396m()) {
            gVar.f9984i = mo9722t() != null ? mo9722t() : new Account("<<default account>>", "com.google");
            if (kVar != null) {
                gVar.f9981f = kVar.asBinder();
            }
        } else if (mo9708H()) {
            gVar.f9984i = mo9722t();
        }
        gVar.f9985j = f9909a;
        gVar.f9986k = mo9723u();
        try {
            synchronized (this.f9926o) {
                AbstractC3020o oVar = this.f9927p;
                if (oVar != null) {
                    oVar.mo9801e0(new BinderC2987i(this, this.f9913C.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo9709I(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo9706F(8, null, null, this.f9913C.get());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract T mo6355i(IBinder iBinder);

    /* renamed from: j */
    public void mo9717j(AbstractC2981c cVar) {
        this.f9928q = (AbstractC2981c) C3027r.m12377i(cVar, "Connection progress callbacks cannot be null.");
        m12208N(2, null);
    }

    /* renamed from: k */
    public void mo9718k() {
        this.f9913C.incrementAndGet();
        synchronized (this.f9930s) {
            int size = this.f9930s.size();
            for (int i = 0; i < size; i++) {
                this.f9930s.get(i).mo9736a();
            }
            this.f9930s.clear();
        }
        synchronized (this.f9926o) {
            this.f9927p = null;
        }
        m12208N(1, null);
    }

    /* renamed from: m */
    public boolean mo6396m() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract String mo6357n();

    /* renamed from: o */
    public boolean mo9719o() {
        return true;
    }

    /* renamed from: q */
    public int mo6358q() {
        return C1284e.f5544a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo9720r() {
        if (!mo9714e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo9721s() {
        return false;
    }

    /* renamed from: t */
    public abstract Account mo9722t();

    /* renamed from: u */
    public C1281c[] mo9723u() {
        return f9909a;
    }

    /* renamed from: v */
    public Bundle mo9724v() {
        return null;
    }

    /* renamed from: w */
    public final Context mo9725w() {
        return this.f9920i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Bundle mo6397x() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public String mo9726y() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract Set<Scope> mo9727z();
}
