package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.C2908e;
import com.google.android.gms.common.api.C2967n;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC2978c;
import com.google.android.gms.common.internal.AbstractC3009k;
import com.google.android.gms.common.internal.C3007j;
import com.google.android.gms.common.internal.C3022p;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.internal.C3030u;
import com.google.android.gms.common.util.C3039a;
import com.google.android.gms.common.util.C3044f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p006b.p021d.C0823a;
import p006b.p021d.C0825b;
import p069c.p073b.p074a.p075a.p077b.C1279a;
import p069c.p073b.p074a.p075a.p077b.C1281c;
import p069c.p073b.p074a.p075a.p077b.C1282d;
import p069c.p073b.p074a.p075a.p081d.p082a.HandlerC1308d;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* renamed from: com.google.android.gms.common.api.internal.d */
public class C2927d implements Handler.Callback {

    /* renamed from: a */
    public static final Status f9811a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b */
    private static final Status f9812b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: c */
    private static final Object f9813c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private static C2927d f9814d;

    /* renamed from: e */
    private long f9815e = 5000;

    /* renamed from: f */
    private long f9816f = 120000;

    /* renamed from: g */
    private long f9817g = 10000;

    /* renamed from: h */
    private final Context f9818h;

    /* renamed from: i */
    private final C1282d f9819i;

    /* renamed from: j */
    private final C3007j f9820j;

    /* renamed from: k */
    private final AtomicInteger f9821k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f9822l = new AtomicInteger(0);

    /* renamed from: m */
    private final Map<C2943j0<?>, C2928a<?>> f9823m = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")

    /* renamed from: n */
    private C2946l f9824n;
    @GuardedBy("lock")

    /* renamed from: o */
    private final Set<C2943j0<?>> f9825o = new C0825b();

    /* renamed from: p */
    private final Set<C2943j0<?>> f9826p = new C0825b();

    /* renamed from: q */
    private final Handler f9827q;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public class C2928a<O extends C2894a.AbstractC2898d> implements AbstractC2911f.AbstractC2912a, AbstractC2911f.AbstractC2913b {

        /* renamed from: a */
        private final Queue<AbstractC2951o> f9828a = new LinkedList();

        /* renamed from: b */
        private final C2894a.AbstractC2902f f9829b;

        /* renamed from: c */
        private final C2894a.AbstractC2896b f9830c;

        /* renamed from: d */
        private final C2943j0<O> f9831d;

        /* renamed from: e */
        private final C2942j f9832e;

        /* renamed from: f */
        private final Set<C2945k0> f9833f = new HashSet();

        /* renamed from: g */
        private final Map<C2936g<?>, C2960x> f9834g = new HashMap();

        /* renamed from: h */
        private final int f9835h;

        /* renamed from: i */
        private final BinderC2962z f9836i;

        /* renamed from: j */
        private boolean f9837j;

        /* renamed from: k */
        private final List<C2929b> f9838k = new ArrayList();

        /* renamed from: l */
        private C1279a f9839l = null;

        public C2928a(C2908e<O> eVar) {
            C2894a.AbstractC2902f f = eVar.mo9585f(C2927d.this.f9827q.getLooper(), this);
            this.f9829b = f;
            if (f instanceof C3030u) {
                this.f9830c = ((C3030u) f).mo9815i0();
            } else {
                this.f9830c = f;
            }
            this.f9831d = eVar.mo9587i();
            this.f9832e = new C2942j();
            this.f9835h = eVar.mo9583d();
            if (f.mo6396m()) {
                this.f9836i = eVar.mo9586h(C2927d.this.f9818h, C2927d.this.f9827q);
            } else {
                this.f9836i = null;
            }
        }

        /* renamed from: A */
        private final void m12096A() {
            if (this.f9837j) {
                C2927d.this.f9827q.removeMessages(11, this.f9831d);
                C2927d.this.f9827q.removeMessages(9, this.f9831d);
                this.f9837j = false;
            }
        }

        /* renamed from: B */
        private final void m12097B() {
            C2927d.this.f9827q.removeMessages(12, this.f9831d);
            C2927d.this.f9827q.sendMessageDelayed(C2927d.this.f9827q.obtainMessage(12, this.f9831d), C2927d.this.f9817g);
        }

        /* renamed from: E */
        private final void m12098E(AbstractC2951o oVar) {
            oVar.mo9661d(this.f9832e, mo9640d());
            try {
                oVar.mo9658c(this);
            } catch (DeadObjectException unused) {
                mo9592j(1);
                this.f9829b.mo9573k();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: F */
        private final boolean m12099F(boolean z) {
            C3027r.m12371c(C2927d.this.f9827q);
            if (!this.f9829b.mo9569e() || this.f9834g.size() != 0) {
                return false;
            }
            if (this.f9832e.mo9665d()) {
                if (z) {
                    m12097B();
                }
                return false;
            }
            this.f9829b.mo9573k();
            return true;
        }

        /* renamed from: K */
        private final boolean m12103K(C1279a aVar) {
            synchronized (C2927d.f9813c) {
                if (C2927d.this.f9824n != null) {
                    if (C2927d.this.f9825o.contains(this.f9831d)) {
                        C2946l unused = C2927d.this.f9824n;
                        throw null;
                    }
                }
            }
            return false;
        }

        /* renamed from: L */
        private final void m12104L(C1279a aVar) {
            for (C2945k0 k0Var : this.f9833f) {
                String str = null;
                if (C3022p.m12361a(aVar, C1279a.f5536b)) {
                    str = this.f9829b.mo9570f();
                }
                k0Var.mo9671a(this.f9831d, aVar, str);
            }
            this.f9833f.clear();
        }

        /* renamed from: f */
        private final C1281c m12105f(C1281c[] cVarArr) {
            if (!(cVarArr == null || cVarArr.length == 0)) {
                C1281c[] d = this.f9829b.mo9568d();
                if (d == null) {
                    d = new C1281c[0];
                }
                C0823a aVar = new C0823a(d.length);
                for (C1281c cVar : d) {
                    aVar.put(cVar.mo6273h(), Long.valueOf(cVar.mo6275i()));
                }
                for (C1281c cVar2 : cVarArr) {
                    if (!aVar.containsKey(cVar2.mo6273h()) || ((Long) aVar.get(cVar2.mo6273h())).longValue() < cVar2.mo6275i()) {
                        return cVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: h */
        private final void m12107h(C2929b bVar) {
            if (!this.f9838k.contains(bVar) || this.f9837j) {
                return;
            }
            if (!this.f9829b.mo9569e()) {
                mo9637a();
            } else {
                m12114v();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: r */
        private final void m12110r(C2929b bVar) {
            C1281c[] g;
            if (this.f9838k.remove(bVar)) {
                C2927d.this.f9827q.removeMessages(15, bVar);
                C2927d.this.f9827q.removeMessages(16, bVar);
                C1281c cVar = bVar.f9842b;
                ArrayList arrayList = new ArrayList(this.f9828a.size());
                for (AbstractC2951o oVar : this.f9828a) {
                    if ((oVar instanceof AbstractC2961y) && (g = ((AbstractC2961y) oVar).mo9662g(this)) != null && C3039a.m12433a(g, cVar)) {
                        arrayList.add(oVar);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    AbstractC2951o oVar2 = (AbstractC2951o) obj;
                    this.f9828a.remove(oVar2);
                    oVar2.mo9659e(new C2967n(cVar));
                }
            }
        }

        /* renamed from: s */
        private final boolean m12111s(AbstractC2951o oVar) {
            if (!(oVar instanceof AbstractC2961y)) {
                m12098E(oVar);
                return true;
            }
            AbstractC2961y yVar = (AbstractC2961y) oVar;
            C1281c f = m12105f(yVar.mo9662g(this));
            if (f == null) {
                m12098E(oVar);
                return true;
            } else if (yVar.mo9663h(this)) {
                C2929b bVar = new C2929b(this.f9831d, f, null);
                int indexOf = this.f9838k.indexOf(bVar);
                if (indexOf >= 0) {
                    C2929b bVar2 = this.f9838k.get(indexOf);
                    C2927d.this.f9827q.removeMessages(15, bVar2);
                    C2927d.this.f9827q.sendMessageDelayed(Message.obtain(C2927d.this.f9827q, 15, bVar2), C2927d.this.f9815e);
                    return false;
                }
                this.f9838k.add(bVar);
                C2927d.this.f9827q.sendMessageDelayed(Message.obtain(C2927d.this.f9827q, 15, bVar), C2927d.this.f9815e);
                C2927d.this.f9827q.sendMessageDelayed(Message.obtain(C2927d.this.f9827q, 16, bVar), C2927d.this.f9816f);
                C1279a aVar = new C1279a(2, null);
                if (m12103K(aVar)) {
                    return false;
                }
                C2927d.this.mo9632l(aVar, this.f9835h);
                return false;
            } else {
                yVar.mo9659e(new C2967n(f));
                return false;
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: t */
        private final void m12112t() {
            mo9648y();
            m12104L(C1279a.f5536b);
            m12096A();
            Iterator<C2960x> it = this.f9834g.values().iterator();
            if (!it.hasNext()) {
                m12114v();
                m12097B();
                return;
            }
            AbstractC2938h<C2894a.AbstractC2896b, ?> hVar = it.next().f9884a;
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: u */
        private final void m12113u() {
            mo9648y();
            this.f9837j = true;
            this.f9832e.mo9667f();
            C2927d.this.f9827q.sendMessageDelayed(Message.obtain(C2927d.this.f9827q, 9, this.f9831d), C2927d.this.f9815e);
            C2927d.this.f9827q.sendMessageDelayed(Message.obtain(C2927d.this.f9827q, 11, this.f9831d), C2927d.this.f9816f);
            C2927d.this.f9820j.mo9794a();
        }

        /* renamed from: v */
        private final void m12114v() {
            ArrayList arrayList = new ArrayList(this.f9828a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC2951o oVar = (AbstractC2951o) obj;
                if (!this.f9829b.mo9569e()) {
                    return;
                }
                if (m12111s(oVar)) {
                    this.f9828a.remove(oVar);
                }
            }
        }

        /* renamed from: C */
        public final boolean mo9634C() {
            return m12099F(true);
        }

        /* renamed from: D */
        public final void mo9635D(Status status) {
            C3027r.m12371c(C2927d.this.f9827q);
            for (AbstractC2951o oVar : this.f9828a) {
                oVar.mo9657b(status);
            }
            this.f9828a.clear();
        }

        /* renamed from: J */
        public final void mo9636J(C1279a aVar) {
            C3027r.m12371c(C2927d.this.f9827q);
            this.f9829b.mo9573k();
            mo9594i(aVar);
        }

        /* renamed from: a */
        public final void mo9637a() {
            C3027r.m12371c(C2927d.this.f9827q);
            if (!this.f9829b.mo9569e() && !this.f9829b.mo9567c()) {
                int b = C2927d.this.f9820j.mo9795b(C2927d.this.f9818h, this.f9829b);
                if (b != 0) {
                    mo9594i(new C1279a(b, null));
                    return;
                }
                C2930c cVar = new C2930c(this.f9829b, this.f9831d);
                if (this.f9829b.mo6396m()) {
                    this.f9836i.mo9682z0(cVar);
                }
                this.f9829b.mo9572j(cVar);
            }
        }

        /* renamed from: b */
        public final int mo9638b() {
            return this.f9835h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo9639c() {
            return this.f9829b.mo9569e();
        }

        /* renamed from: d */
        public final boolean mo9640d() {
            return this.f9829b.mo6396m();
        }

        /* renamed from: e */
        public final void mo9641e() {
            C3027r.m12371c(C2927d.this.f9827q);
            if (this.f9837j) {
                mo9637a();
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC2911f.AbstractC2913b
        /* renamed from: i */
        public final void mo9594i(C1279a aVar) {
            C3027r.m12371c(C2927d.this.f9827q);
            BinderC2962z zVar = this.f9836i;
            if (zVar != null) {
                zVar.mo9681A0();
            }
            mo9648y();
            C2927d.this.f9820j.mo9794a();
            m12104L(aVar);
            if (aVar.mo6261h() == 4) {
                mo9635D(C2927d.f9812b);
            } else if (this.f9828a.isEmpty()) {
                this.f9839l = aVar;
            } else if (!m12103K(aVar) && !C2927d.this.mo9632l(aVar, this.f9835h)) {
                if (aVar.mo6261h() == 18) {
                    this.f9837j = true;
                }
                if (this.f9837j) {
                    C2927d.this.f9827q.sendMessageDelayed(Message.obtain(C2927d.this.f9827q, 9, this.f9831d), C2927d.this.f9815e);
                    return;
                }
                String b = this.f9831d.mo9668b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 38);
                sb.append("API: ");
                sb.append(b);
                sb.append(" is not available on this device.");
                mo9635D(new Status(17, sb.toString()));
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC2911f.AbstractC2912a
        /* renamed from: j */
        public final void mo9592j(int i) {
            if (Looper.myLooper() == C2927d.this.f9827q.getLooper()) {
                m12113u();
            } else {
                C2927d.this.f9827q.post(new RunnableC2954r(this));
            }
        }

        /* renamed from: k */
        public final void mo9642k(AbstractC2951o oVar) {
            C3027r.m12371c(C2927d.this.f9827q);
            if (!this.f9829b.mo9569e()) {
                this.f9828a.add(oVar);
                C1279a aVar = this.f9839l;
                if (aVar == null || !aVar.mo6265k()) {
                    mo9637a();
                } else {
                    mo9594i(this.f9839l);
                }
            } else if (m12111s(oVar)) {
                m12097B();
            } else {
                this.f9828a.add(oVar);
            }
        }

        /* renamed from: l */
        public final void mo9643l(C2945k0 k0Var) {
            C3027r.m12371c(C2927d.this.f9827q);
            this.f9833f.add(k0Var);
        }

        @Override // com.google.android.gms.common.api.AbstractC2911f.AbstractC2912a
        /* renamed from: m */
        public final void mo9593m(Bundle bundle) {
            if (Looper.myLooper() == C2927d.this.f9827q.getLooper()) {
                m12112t();
            } else {
                C2927d.this.f9827q.post(new RunnableC2953q(this));
            }
        }

        /* renamed from: o */
        public final C2894a.AbstractC2902f mo9644o() {
            return this.f9829b;
        }

        /* renamed from: p */
        public final void mo9645p() {
            C3027r.m12371c(C2927d.this.f9827q);
            if (this.f9837j) {
                m12096A();
                mo9635D(C2927d.this.f9819i.mo6281e(C2927d.this.f9818h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f9829b.mo9573k();
            }
        }

        /* renamed from: w */
        public final void mo9646w() {
            C3027r.m12371c(C2927d.this.f9827q);
            mo9635D(C2927d.f9811a);
            this.f9832e.mo9666e();
            for (C2936g gVar : (C2936g[]) this.f9834g.keySet().toArray(new C2936g[this.f9834g.size()])) {
                mo9642k(new C2941i0(gVar, new C1377e()));
            }
            m12104L(new C1279a(4));
            if (this.f9829b.mo9569e()) {
                this.f9829b.mo9566a(new C2955s(this));
            }
        }

        /* renamed from: x */
        public final Map<C2936g<?>, C2960x> mo9647x() {
            return this.f9834g;
        }

        /* renamed from: y */
        public final void mo9648y() {
            C3027r.m12371c(C2927d.this.f9827q);
            this.f9839l = null;
        }

        /* renamed from: z */
        public final C1279a mo9649z() {
            C3027r.m12371c(C2927d.this.f9827q);
            return this.f9839l;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    public static class C2929b {

        /* renamed from: a */
        private final C2943j0<?> f9841a;

        /* renamed from: b */
        private final C1281c f9842b;

        private C2929b(C2943j0<?> j0Var, C1281c cVar) {
            this.f9841a = j0Var;
            this.f9842b = cVar;
        }

        /* synthetic */ C2929b(C2943j0 j0Var, C1281c cVar, C2952p pVar) {
            this(j0Var, cVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C2929b)) {
                C2929b bVar = (C2929b) obj;
                return C3022p.m12361a(this.f9841a, bVar.f9841a) && C3022p.m12361a(this.f9842b, bVar.f9842b);
            }
        }

        public final int hashCode() {
            return C3022p.m12362b(this.f9841a, this.f9842b);
        }

        public final String toString() {
            return C3022p.m12363c(this).mo9802a("key", this.f9841a).mo9802a("feature", this.f9842b).toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.d$c */
    public class C2930c implements AbstractC2926c0, AbstractC2978c.AbstractC2981c {

        /* renamed from: a */
        private final C2894a.AbstractC2902f f9843a;

        /* renamed from: b */
        private final C2943j0<?> f9844b;

        /* renamed from: c */
        private AbstractC3009k f9845c = null;

        /* renamed from: d */
        private Set<Scope> f9846d = null;

        /* renamed from: e */
        private boolean f9847e = false;

        public C2930c(C2894a.AbstractC2902f fVar, C2943j0<?> j0Var) {
            this.f9843a = fVar;
            this.f9844b = j0Var;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: g */
        private final void m12139g() {
            AbstractC3009k kVar;
            if (this.f9847e && (kVar = this.f9845c) != null) {
                this.f9843a.mo9571h(kVar, this.f9846d);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC2978c.AbstractC2981c
        /* renamed from: a */
        public final void mo9653a(C1279a aVar) {
            C2927d.this.f9827q.post(new RunnableC2957u(this, aVar));
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC2926c0
        /* renamed from: b */
        public final void mo9625b(C1279a aVar) {
            ((C2928a) C2927d.this.f9823m.get(this.f9844b)).mo9636J(aVar);
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC2926c0
        /* renamed from: c */
        public final void mo9626c(AbstractC3009k kVar, Set<Scope> set) {
            if (kVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo9625b(new C1279a(4));
                return;
            }
            this.f9845c = kVar;
            this.f9846d = set;
            m12139g();
        }
    }

    private C2927d(Context context, Looper looper, C1282d dVar) {
        this.f9818h = context;
        HandlerC1308d dVar2 = new HandlerC1308d(looper, this);
        this.f9827q = dVar2;
        this.f9819i = dVar;
        this.f9820j = new C3007j(dVar);
        dVar2.sendMessage(dVar2.obtainMessage(6));
    }

    /* renamed from: f */
    public static C2927d m12078f(Context context) {
        C2927d dVar;
        synchronized (f9813c) {
            if (f9814d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f9814d = new C2927d(context.getApplicationContext(), handlerThread.getLooper(), C1282d.m6764k());
            }
            dVar = f9814d;
        }
        return dVar;
    }

    /* renamed from: g */
    private final void m12079g(C2908e<?> eVar) {
        C2943j0<?> i = eVar.mo9587i();
        C2928a<?> aVar = this.f9823m.get(i);
        if (aVar == null) {
            aVar = new C2928a<>(eVar);
            this.f9823m.put(i, aVar);
        }
        if (aVar.mo9640d()) {
            this.f9826p.add(i);
        }
        aVar.mo9637a();
    }

    /* renamed from: b */
    public final void mo9627b(C1279a aVar, int i) {
        if (!mo9632l(aVar, i)) {
            Handler handler = this.f9827q;
            handler.sendMessage(handler.obtainMessage(5, i, 0, aVar));
        }
    }

    /* renamed from: c */
    public final void mo9628c(C2908e<?> eVar) {
        Handler handler = this.f9827q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: d */
    public final <O extends C2894a.AbstractC2898d> void mo9629d(C2908e<O> eVar, int i, AbstractC2925c<? extends AbstractC2964k, C2894a.AbstractC2896b> cVar) {
        C2939h0 h0Var = new C2939h0(i, cVar);
        Handler handler = this.f9827q;
        handler.sendMessage(handler.obtainMessage(4, new C2959w(h0Var, this.f9822l.get(), eVar)));
    }

    /* renamed from: h */
    public final int mo9630h() {
        return this.f9821k.getAndIncrement();
    }

    public boolean handleMessage(Message message) {
        C1377e<Boolean> eVar;
        Boolean bool;
        int i = message.what;
        long j = 300000;
        C2928a<?> aVar = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f9817g = j;
                this.f9827q.removeMessages(12);
                for (C2943j0<?> j0Var : this.f9823m.keySet()) {
                    Handler handler = this.f9827q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, j0Var), this.f9817g);
                }
                break;
            case 2:
                C2945k0 k0Var = (C2945k0) message.obj;
                Iterator<C2943j0<?>> it = k0Var.mo9672b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C2943j0<?> next = it.next();
                        C2928a<?> aVar2 = this.f9823m.get(next);
                        if (aVar2 == null) {
                            k0Var.mo9671a(next, new C1279a(13), null);
                            break;
                        } else if (aVar2.mo9639c()) {
                            k0Var.mo9671a(next, C1279a.f5536b, aVar2.mo9644o().mo9570f());
                        } else if (aVar2.mo9649z() != null) {
                            k0Var.mo9671a(next, aVar2.mo9649z(), null);
                        } else {
                            aVar2.mo9643l(k0Var);
                            aVar2.mo9637a();
                        }
                    }
                }
            case 3:
                for (C2928a<?> aVar3 : this.f9823m.values()) {
                    aVar3.mo9648y();
                    aVar3.mo9637a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C2959w wVar = (C2959w) message.obj;
                C2928a<?> aVar4 = this.f9823m.get(wVar.f9883c.mo9587i());
                if (aVar4 == null) {
                    m12079g(wVar.f9883c);
                    aVar4 = this.f9823m.get(wVar.f9883c.mo9587i());
                }
                if (!aVar4.mo9640d() || this.f9822l.get() == wVar.f9882b) {
                    aVar4.mo9642k(wVar.f9881a);
                    break;
                } else {
                    wVar.f9881a.mo9657b(f9811a);
                    aVar4.mo9646w();
                    break;
                }
            case 5:
                int i2 = message.arg1;
                C1279a aVar5 = (C1279a) message.obj;
                Iterator<C2928a<?>> it2 = this.f9823m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C2928a<?> next2 = it2.next();
                        if (next2.mo9638b() == i2) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String d = this.f9819i.mo6280d(aVar5.mo6261h());
                    String i3 = aVar5.mo6263i();
                    StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 69 + String.valueOf(i3).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(d);
                    sb.append(": ");
                    sb.append(i3);
                    aVar.mo9635D(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (C3044f.m12442a() && (this.f9818h.getApplicationContext() instanceof Application)) {
                    ComponentCallbacks2C2922b.m12063c((Application) this.f9818h.getApplicationContext());
                    ComponentCallbacks2C2922b.m12062b().mo9607a(new C2952p(this));
                    if (!ComponentCallbacks2C2922b.m12062b().mo9609f(true)) {
                        this.f9817g = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m12079g((C2908e) message.obj);
                break;
            case 9:
                if (this.f9823m.containsKey(message.obj)) {
                    this.f9823m.get(message.obj).mo9641e();
                    break;
                }
                break;
            case 10:
                for (C2943j0<?> j0Var2 : this.f9826p) {
                    this.f9823m.remove(j0Var2).mo9646w();
                }
                this.f9826p.clear();
                break;
            case 11:
                if (this.f9823m.containsKey(message.obj)) {
                    this.f9823m.get(message.obj).mo9645p();
                    break;
                }
                break;
            case 12:
                if (this.f9823m.containsKey(message.obj)) {
                    this.f9823m.get(message.obj).mo9634C();
                    break;
                }
                break;
            case 14:
                C2948m mVar = (C2948m) message.obj;
                C2943j0<?> b = mVar.mo9674b();
                if (!this.f9823m.containsKey(b)) {
                    eVar = mVar.mo9673a();
                    bool = Boolean.FALSE;
                } else {
                    boolean F = this.f9823m.get(b).m12099F(false);
                    eVar = mVar.mo9673a();
                    bool = Boolean.valueOf(F);
                }
                eVar.mo6427c(bool);
                break;
            case 15:
                C2929b bVar = (C2929b) message.obj;
                if (this.f9823m.containsKey(bVar.f9841a)) {
                    this.f9823m.get(bVar.f9841a).m12107h(bVar);
                    break;
                }
                break;
            case 16:
                C2929b bVar2 = (C2929b) message.obj;
                if (this.f9823m.containsKey(bVar2.f9841a)) {
                    this.f9823m.get(bVar2.f9841a).m12110r(bVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo9632l(C1279a aVar, int i) {
        return this.f9819i.mo6289r(this.f9818h, aVar, i);
    }

    /* renamed from: t */
    public final void mo9633t() {
        Handler handler = this.f9827q;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
