package com.bumptech.glide.p140r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C1614e;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.C1769k;
import com.bumptech.glide.load.p122o.C1787q;
import com.bumptech.glide.load.p128q.p131f.C1955a;
import com.bumptech.glide.p140r.p141j.AbstractC2054g;
import com.bumptech.glide.p140r.p141j.AbstractC2055h;
import com.bumptech.glide.p140r.p142k.AbstractC2063c;
import com.bumptech.glide.p144t.C2077f;
import com.bumptech.glide.p144t.C2082k;
import com.bumptech.glide.p144t.p145l.AbstractC2093c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.r.h */
public final class C2045h<R> implements AbstractC2039c, AbstractC2054g, AbstractC2044g {

    /* renamed from: a */
    private static final boolean f7515a = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f7516A;

    /* renamed from: B */
    private int f7517B;

    /* renamed from: C */
    private boolean f7518C;

    /* renamed from: D */
    private RuntimeException f7519D;

    /* renamed from: b */
    private final String f7520b;

    /* renamed from: c */
    private final AbstractC2093c f7521c;

    /* renamed from: d */
    private final Object f7522d;

    /* renamed from: e */
    private final AbstractC2042e<R> f7523e;

    /* renamed from: f */
    private final AbstractC2040d f7524f;

    /* renamed from: g */
    private final Context f7525g;

    /* renamed from: h */
    private final C1614e f7526h;

    /* renamed from: i */
    private final Object f7527i;

    /* renamed from: j */
    private final Class<R> f7528j;

    /* renamed from: k */
    private final AbstractC2037a<?> f7529k;

    /* renamed from: l */
    private final int f7530l;

    /* renamed from: m */
    private final int f7531m;

    /* renamed from: n */
    private final EnumC1616g f7532n;

    /* renamed from: o */
    private final AbstractC2055h<R> f7533o;

    /* renamed from: p */
    private final List<AbstractC2042e<R>> f7534p;

    /* renamed from: q */
    private final AbstractC2063c<? super R> f7535q;

    /* renamed from: r */
    private final Executor f7536r;

    /* renamed from: s */
    private AbstractC1794v<R> f7537s;

    /* renamed from: t */
    private C1769k.C1775d f7538t;

    /* renamed from: u */
    private long f7539u;

    /* renamed from: v */
    private volatile C1769k f7540v;

    /* renamed from: w */
    private EnumC2046a f7541w;

    /* renamed from: x */
    private Drawable f7542x;

    /* renamed from: y */
    private Drawable f7543y;

    /* renamed from: z */
    private Drawable f7544z;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.r.h$a */
    public enum EnumC2046a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C2045h(Context context, C1614e eVar, Object obj, Object obj2, Class<R> cls, AbstractC2037a<?> aVar, int i, int i2, EnumC1616g gVar, AbstractC2055h<R> hVar, AbstractC2042e<R> eVar2, List<AbstractC2042e<R>> list, AbstractC2040d dVar, C1769k kVar, AbstractC2063c<? super R> cVar, Executor executor) {
        this.f7520b = f7515a ? String.valueOf(super.hashCode()) : null;
        this.f7521c = AbstractC2093c.m9473a();
        this.f7522d = obj;
        this.f7525g = context;
        this.f7526h = eVar;
        this.f7527i = obj2;
        this.f7528j = cls;
        this.f7529k = aVar;
        this.f7530l = i;
        this.f7531m = i2;
        this.f7532n = gVar;
        this.f7533o = hVar;
        this.f7523e = eVar2;
        this.f7534p = list;
        this.f7524f = dVar;
        this.f7540v = kVar;
        this.f7535q = cVar;
        this.f7536r = executor;
        this.f7541w = EnumC2046a.PENDING;
        if (this.f7519D == null && eVar.mo7004i()) {
            this.f7519D = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    private void m9280A(AbstractC1794v<R> vVar, R r, EnumC1630a aVar) {
        boolean z;
        boolean s = m9290s();
        this.f7541w = EnumC2046a.COMPLETE;
        this.f7537s = vVar;
        if (this.f7526h.mo7002g() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.f7527i + " with size [" + this.f7516A + "x" + this.f7517B + "] in " + C2077f.m9415a(this.f7539u) + " ms");
        }
        boolean z2 = true;
        this.f7518C = true;
        try {
            List<AbstractC2042e<R>> list = this.f7534p;
            if (list != null) {
                z = false;
                for (AbstractC2042e<R> eVar : list) {
                    z |= eVar.mo7802a(r, this.f7527i, this.f7533o, aVar, s);
                }
            } else {
                z = false;
            }
            AbstractC2042e<R> eVar2 = this.f7523e;
            if (eVar2 == null || !eVar2.mo7802a(r, this.f7527i, this.f7533o, aVar, s)) {
                z2 = false;
            }
            if (!z2 && !z) {
                this.f7533o.mo7614d(r, this.f7535q.mo7827a(aVar, s));
            }
            this.f7518C = false;
            m9295x();
        } catch (Throwable th) {
            this.f7518C = false;
            throw th;
        }
    }

    /* renamed from: B */
    private void m9281B() {
        if (m9284m()) {
            Drawable drawable = null;
            if (this.f7527i == null) {
                drawable = m9288q();
            }
            if (drawable == null) {
                drawable = m9287p();
            }
            if (drawable == null) {
                drawable = m9289r();
            }
            this.f7533o.mo7810e(drawable);
        }
    }

    /* renamed from: k */
    private void m9282k() {
        if (this.f7518C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: l */
    private boolean m9283l() {
        AbstractC2040d dVar = this.f7524f;
        return dVar == null || dVar.mo7799l(this);
    }

    /* renamed from: m */
    private boolean m9284m() {
        AbstractC2040d dVar = this.f7524f;
        return dVar == null || dVar.mo7798k(this);
    }

    /* renamed from: n */
    private boolean m9285n() {
        AbstractC2040d dVar = this.f7524f;
        return dVar == null || dVar.mo7786a(this);
    }

    /* renamed from: o */
    private void m9286o() {
        m9282k();
        this.f7521c.mo7875c();
        this.f7533o.mo7813b(this);
        C1769k.C1775d dVar = this.f7538t;
        if (dVar != null) {
            dVar.mo7328a();
            this.f7538t = null;
        }
    }

    /* renamed from: p */
    private Drawable m9287p() {
        if (this.f7542x == null) {
            Drawable k = this.f7529k.mo7770k();
            this.f7542x = k;
            if (k == null && this.f7529k.mo7769j() > 0) {
                this.f7542x = m9291t(this.f7529k.mo7769j());
            }
        }
        return this.f7542x;
    }

    /* renamed from: q */
    private Drawable m9288q() {
        if (this.f7544z == null) {
            Drawable l = this.f7529k.mo7771l();
            this.f7544z = l;
            if (l == null && this.f7529k.mo7772m() > 0) {
                this.f7544z = m9291t(this.f7529k.mo7772m());
            }
        }
        return this.f7544z;
    }

    /* renamed from: r */
    private Drawable m9289r() {
        if (this.f7543y == null) {
            Drawable r = this.f7529k.mo7777r();
            this.f7543y = r;
            if (r == null && this.f7529k.mo7778s() > 0) {
                this.f7543y = m9291t(this.f7529k.mo7778s());
            }
        }
        return this.f7543y;
    }

    /* renamed from: s */
    private boolean m9290s() {
        AbstractC2040d dVar = this.f7524f;
        return dVar == null || !dVar.mo7790d().mo7788c();
    }

    /* renamed from: t */
    private Drawable m9291t(int i) {
        return C1955a.m8847a(this.f7526h, i, this.f7529k.mo7783x() != null ? this.f7529k.mo7783x() : this.f7525g.getTheme());
    }

    /* renamed from: u */
    private void m9292u(String str) {
        Log.v("Request", str + " this: " + this.f7520b);
    }

    /* renamed from: v */
    private static int m9293v(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: w */
    private void m9294w() {
        AbstractC2040d dVar = this.f7524f;
        if (dVar != null) {
            dVar.mo7791e(this);
        }
    }

    /* renamed from: x */
    private void m9295x() {
        AbstractC2040d dVar = this.f7524f;
        if (dVar != null) {
            dVar.mo7793g(this);
        }
    }

    /* renamed from: y */
    public static <R> C2045h<R> m9296y(Context context, C1614e eVar, Object obj, Object obj2, Class<R> cls, AbstractC2037a<?> aVar, int i, int i2, EnumC1616g gVar, AbstractC2055h<R> hVar, AbstractC2042e<R> eVar2, List<AbstractC2042e<R>> list, AbstractC2040d dVar, C1769k kVar, AbstractC2063c<? super R> cVar, Executor executor) {
        return new C2045h<>(context, eVar, obj, obj2, cls, aVar, i, i2, gVar, hVar, eVar2, list, dVar, kVar, cVar, executor);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    private void m9297z(C1787q qVar, int i) {
        boolean z;
        this.f7521c.mo7875c();
        synchronized (this.f7522d) {
            qVar.mo7372k(this.f7519D);
            int g = this.f7526h.mo7002g();
            if (g <= i) {
                Log.w("Glide", "Load failed for " + this.f7527i + " with size [" + this.f7516A + "x" + this.f7517B + "]", qVar);
                if (g <= 4) {
                    qVar.mo7368g("Glide");
                }
            }
            this.f7538t = null;
            this.f7541w = EnumC2046a.FAILED;
            boolean z2 = true;
            this.f7518C = true;
            try {
                List<AbstractC2042e<R>> list = this.f7534p;
                if (list != null) {
                    z = false;
                    for (AbstractC2042e<R> eVar : list) {
                        z |= eVar.mo7803b(qVar, this.f7527i, this.f7533o, m9290s());
                    }
                } else {
                    z = false;
                }
                AbstractC2042e<R> eVar2 = this.f7523e;
                if (eVar2 == null || !eVar2.mo7803b(qVar, this.f7527i, this.f7533o, m9290s())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m9281B();
                }
                this.f7518C = false;
                m9294w();
            } catch (Throwable th) {
                this.f7518C = false;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2044g
    /* renamed from: a */
    public void mo7804a(C1787q qVar) {
        m9297z(qVar, 5);
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: b */
    public void mo7787b() {
        synchronized (this.f7522d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: c */
    public boolean mo7788c() {
        boolean z;
        synchronized (this.f7522d) {
            z = this.f7541w == EnumC2046a.COMPLETE;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f7540v.mo7323k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7522d
            monitor-enter(r0)
            r5.m9282k()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.t.l.c r1 = r5.f7521c     // Catch:{ all -> 0x0039 }
            r1.mo7875c()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.r.h$a r1 = r5.f7541w     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p140r.C2045h.EnumC2046a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.m9286o()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.o.v<R> r1 = r5.f7537s     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f7537s = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m9283l()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            com.bumptech.glide.r.j.h<R> r3 = r5.f7533o     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.m9289r()     // Catch:{ all -> 0x0039 }
            r3.mo7615h(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f7541w = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.bumptech.glide.load.o.k r0 = r5.f7540v
            r0.mo7323k(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p140r.C2045h.clear():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bumptech.glide.r.h<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.p140r.AbstractC2044g
    /* renamed from: d */
    public void mo7805d(AbstractC1794v<?> vVar, EnumC1630a aVar) {
        Throwable th;
        this.f7521c.mo7875c();
        try {
            synchronized (this.f7522d) {
                try {
                    this.f7538t = null;
                    if (vVar == null) {
                        mo7804a(new C1787q("Expected to receive a Resource<R> with an object of " + this.f7528j + " inside, but instead got null."));
                        return;
                    }
                    Object c = vVar.mo7358c();
                    if (c != null) {
                        if (this.f7528j.isAssignableFrom(c.getClass())) {
                            if (!m9285n()) {
                                try {
                                    this.f7537s = null;
                                    this.f7541w = EnumC2046a.COMPLETE;
                                    this.f7540v.mo7323k(vVar);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                m9280A(vVar, c, aVar);
                                return;
                            }
                        }
                    }
                    this.f7537s = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f7528j);
                    sb.append(" but instead got ");
                    sb.append(c != null ? c.getClass() : "");
                    sb.append("{");
                    sb.append(c);
                    sb.append("} inside Resource{");
                    sb.append(vVar);
                    sb.append("}.");
                    sb.append(c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    mo7804a(new C1787q(sb.toString()));
                    this.f7540v.mo7323k(vVar);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            if (0 != 0) {
                this.f7540v.mo7323k(null);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2044g
    /* renamed from: e */
    public Object mo7806e() {
        this.f7521c.mo7875c();
        return this.f7522d;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: f */
    public void mo7792f() {
        synchronized (this.f7522d) {
            m9282k();
            this.f7521c.mo7875c();
            this.f7539u = C2077f.m9416b();
            if (this.f7527i == null) {
                if (C2082k.m9451r(this.f7530l, this.f7531m)) {
                    this.f7516A = this.f7530l;
                    this.f7517B = this.f7531m;
                }
                m9297z(new C1787q("Received null model"), m9288q() == null ? 5 : 3);
                return;
            }
            EnumC2046a aVar = this.f7541w;
            EnumC2046a aVar2 = EnumC2046a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            } else if (aVar == EnumC2046a.COMPLETE) {
                mo7805d(this.f7537s, EnumC1630a.MEMORY_CACHE);
            } else {
                EnumC2046a aVar3 = EnumC2046a.WAITING_FOR_SIZE;
                this.f7541w = aVar3;
                if (C2082k.m9451r(this.f7530l, this.f7531m)) {
                    mo7807g(this.f7530l, this.f7531m);
                } else {
                    this.f7533o.mo7815i(this);
                }
                EnumC2046a aVar4 = this.f7541w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m9284m()) {
                    this.f7533o.mo7809c(m9289r());
                }
                if (f7515a) {
                    m9292u("finished run method in " + C2077f.m9415a(this.f7539u));
                }
            }
        }
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2054g
    /* renamed from: g */
    public void mo7807g(int i, int i2) {
        Object obj;
        this.f7521c.mo7875c();
        Object obj2 = this.f7522d;
        synchronized (obj2) {
            try {
                boolean z = f7515a;
                if (z) {
                    m9292u("Got onSizeReady in " + C2077f.m9415a(this.f7539u));
                }
                if (this.f7541w == EnumC2046a.WAITING_FOR_SIZE) {
                    EnumC2046a aVar = EnumC2046a.RUNNING;
                    this.f7541w = aVar;
                    float w = this.f7529k.mo7782w();
                    this.f7516A = m9293v(i, w);
                    this.f7517B = m9293v(i2, w);
                    if (z) {
                        m9292u("finished setup for calling load in " + C2077f.m9415a(this.f7539u));
                    }
                    obj = obj2;
                    try {
                        this.f7538t = this.f7540v.mo7322f(this.f7526h, this.f7527i, this.f7529k.mo7781v(), this.f7516A, this.f7517B, this.f7529k.mo7780u(), this.f7528j, this.f7532n, this.f7529k.mo7768i(), this.f7529k.mo7784y(), this.f7529k.mo7741H(), this.f7529k.mo7739D(), this.f7529k.mo7774o(), this.f7529k.mo7737B(), this.f7529k.mo7736A(), this.f7529k.mo7785z(), this.f7529k.mo7773n(), this, this.f7536r);
                        if (this.f7541w != aVar) {
                            this.f7538t = null;
                        }
                        if (z) {
                            m9292u("finished onSizeReady in " + C2077f.m9415a(this.f7539u));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: h */
    public boolean mo7794h(AbstractC2039c cVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC2037a<?> aVar;
        EnumC1616g gVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        AbstractC2037a<?> aVar2;
        EnumC1616g gVar2;
        int size2;
        if (!(cVar instanceof C2045h)) {
            return false;
        }
        synchronized (this.f7522d) {
            i = this.f7530l;
            i2 = this.f7531m;
            obj = this.f7527i;
            cls = this.f7528j;
            aVar = this.f7529k;
            gVar = this.f7532n;
            List<AbstractC2042e<R>> list = this.f7534p;
            size = list != null ? list.size() : 0;
        }
        C2045h hVar = (C2045h) cVar;
        synchronized (hVar.f7522d) {
            i3 = hVar.f7530l;
            i4 = hVar.f7531m;
            obj2 = hVar.f7527i;
            cls2 = hVar.f7528j;
            aVar2 = hVar.f7529k;
            gVar2 = hVar.f7532n;
            List<AbstractC2042e<R>> list2 = hVar.f7534p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C2082k.m9435b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: i */
    public boolean mo7795i() {
        boolean z;
        synchronized (this.f7522d) {
            z = this.f7541w == EnumC2046a.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f7522d) {
            EnumC2046a aVar = this.f7541w;
            if (aVar != EnumC2046a.RUNNING) {
                if (aVar != EnumC2046a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: j */
    public boolean mo7797j() {
        boolean z;
        synchronized (this.f7522d) {
            z = this.f7541w == EnumC2046a.CLEARED;
        }
        return z;
    }
}
