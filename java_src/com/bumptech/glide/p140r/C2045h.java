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
    private static final boolean f7507a = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f7508A;

    /* renamed from: B */
    private int f7509B;

    /* renamed from: C */
    private boolean f7510C;

    /* renamed from: D */
    private RuntimeException f7511D;

    /* renamed from: b */
    private final String f7512b;

    /* renamed from: c */
    private final AbstractC2093c f7513c;

    /* renamed from: d */
    private final Object f7514d;

    /* renamed from: e */
    private final AbstractC2042e<R> f7515e;

    /* renamed from: f */
    private final AbstractC2040d f7516f;

    /* renamed from: g */
    private final Context f7517g;

    /* renamed from: h */
    private final C1614e f7518h;

    /* renamed from: i */
    private final Object f7519i;

    /* renamed from: j */
    private final Class<R> f7520j;

    /* renamed from: k */
    private final AbstractC2037a<?> f7521k;

    /* renamed from: l */
    private final int f7522l;

    /* renamed from: m */
    private final int f7523m;

    /* renamed from: n */
    private final EnumC1616g f7524n;

    /* renamed from: o */
    private final AbstractC2055h<R> f7525o;

    /* renamed from: p */
    private final List<AbstractC2042e<R>> f7526p;

    /* renamed from: q */
    private final AbstractC2063c<? super R> f7527q;

    /* renamed from: r */
    private final Executor f7528r;

    /* renamed from: s */
    private AbstractC1794v<R> f7529s;

    /* renamed from: t */
    private C1769k.C1775d f7530t;

    /* renamed from: u */
    private long f7531u;

    /* renamed from: v */
    private volatile C1769k f7532v;

    /* renamed from: w */
    private EnumC2046a f7533w;

    /* renamed from: x */
    private Drawable f7534x;

    /* renamed from: y */
    private Drawable f7535y;

    /* renamed from: z */
    private Drawable f7536z;

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
        this.f7512b = f7507a ? String.valueOf(super.hashCode()) : null;
        this.f7513c = AbstractC2093c.m9473a();
        this.f7514d = obj;
        this.f7517g = context;
        this.f7518h = eVar;
        this.f7519i = obj2;
        this.f7520j = cls;
        this.f7521k = aVar;
        this.f7522l = i;
        this.f7523m = i2;
        this.f7524n = gVar;
        this.f7525o = hVar;
        this.f7515e = eVar2;
        this.f7526p = list;
        this.f7516f = dVar;
        this.f7532v = kVar;
        this.f7527q = cVar;
        this.f7528r = executor;
        this.f7533w = EnumC2046a.PENDING;
        if (this.f7511D == null && eVar.mo7004i()) {
            this.f7511D = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    private void m9280A(AbstractC1794v<R> vVar, R r, EnumC1630a aVar) {
        boolean z;
        boolean s = m9290s();
        this.f7533w = EnumC2046a.COMPLETE;
        this.f7529s = vVar;
        if (this.f7518h.mo7002g() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.f7519i + " with size [" + this.f7508A + "x" + this.f7509B + "] in " + C2077f.m9415a(this.f7531u) + " ms");
        }
        boolean z2 = true;
        this.f7510C = true;
        try {
            List<AbstractC2042e<R>> list = this.f7526p;
            if (list != null) {
                z = false;
                for (AbstractC2042e<R> eVar : list) {
                    z |= eVar.mo7802a(r, this.f7519i, this.f7525o, aVar, s);
                }
            } else {
                z = false;
            }
            AbstractC2042e<R> eVar2 = this.f7515e;
            if (eVar2 == null || !eVar2.mo7802a(r, this.f7519i, this.f7525o, aVar, s)) {
                z2 = false;
            }
            if (!z2 && !z) {
                this.f7525o.mo7614d(r, this.f7527q.mo7827a(aVar, s));
            }
            this.f7510C = false;
            m9295x();
        } catch (Throwable th) {
            this.f7510C = false;
            throw th;
        }
    }

    /* renamed from: B */
    private void m9281B() {
        if (m9284m()) {
            Drawable drawable = null;
            if (this.f7519i == null) {
                drawable = m9288q();
            }
            if (drawable == null) {
                drawable = m9287p();
            }
            if (drawable == null) {
                drawable = m9289r();
            }
            this.f7525o.mo7810e(drawable);
        }
    }

    /* renamed from: k */
    private void m9282k() {
        if (this.f7510C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: l */
    private boolean m9283l() {
        AbstractC2040d dVar = this.f7516f;
        return dVar == null || dVar.mo7799l(this);
    }

    /* renamed from: m */
    private boolean m9284m() {
        AbstractC2040d dVar = this.f7516f;
        return dVar == null || dVar.mo7798k(this);
    }

    /* renamed from: n */
    private boolean m9285n() {
        AbstractC2040d dVar = this.f7516f;
        return dVar == null || dVar.mo7786a(this);
    }

    /* renamed from: o */
    private void m9286o() {
        m9282k();
        this.f7513c.mo7875c();
        this.f7525o.mo7813b(this);
        C1769k.C1775d dVar = this.f7530t;
        if (dVar != null) {
            dVar.mo7328a();
            this.f7530t = null;
        }
    }

    /* renamed from: p */
    private Drawable m9287p() {
        if (this.f7534x == null) {
            Drawable k = this.f7521k.mo7770k();
            this.f7534x = k;
            if (k == null && this.f7521k.mo7769j() > 0) {
                this.f7534x = m9291t(this.f7521k.mo7769j());
            }
        }
        return this.f7534x;
    }

    /* renamed from: q */
    private Drawable m9288q() {
        if (this.f7536z == null) {
            Drawable l = this.f7521k.mo7771l();
            this.f7536z = l;
            if (l == null && this.f7521k.mo7772m() > 0) {
                this.f7536z = m9291t(this.f7521k.mo7772m());
            }
        }
        return this.f7536z;
    }

    /* renamed from: r */
    private Drawable m9289r() {
        if (this.f7535y == null) {
            Drawable r = this.f7521k.mo7777r();
            this.f7535y = r;
            if (r == null && this.f7521k.mo7778s() > 0) {
                this.f7535y = m9291t(this.f7521k.mo7778s());
            }
        }
        return this.f7535y;
    }

    /* renamed from: s */
    private boolean m9290s() {
        AbstractC2040d dVar = this.f7516f;
        return dVar == null || !dVar.mo7790d().mo7788c();
    }

    /* renamed from: t */
    private Drawable m9291t(int i) {
        return C1955a.m8847a(this.f7518h, i, this.f7521k.mo7783x() != null ? this.f7521k.mo7783x() : this.f7517g.getTheme());
    }

    /* renamed from: u */
    private void m9292u(String str) {
        Log.v("Request", str + " this: " + this.f7512b);
    }

    /* renamed from: v */
    private static int m9293v(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: w */
    private void m9294w() {
        AbstractC2040d dVar = this.f7516f;
        if (dVar != null) {
            dVar.mo7791e(this);
        }
    }

    /* renamed from: x */
    private void m9295x() {
        AbstractC2040d dVar = this.f7516f;
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
        this.f7513c.mo7875c();
        synchronized (this.f7514d) {
            qVar.mo7372k(this.f7511D);
            int g = this.f7518h.mo7002g();
            if (g <= i) {
                Log.w("Glide", "Load failed for " + this.f7519i + " with size [" + this.f7508A + "x" + this.f7509B + "]", qVar);
                if (g <= 4) {
                    qVar.mo7368g("Glide");
                }
            }
            this.f7530t = null;
            this.f7533w = EnumC2046a.FAILED;
            boolean z2 = true;
            this.f7510C = true;
            try {
                List<AbstractC2042e<R>> list = this.f7526p;
                if (list != null) {
                    z = false;
                    for (AbstractC2042e<R> eVar : list) {
                        z |= eVar.mo7803b(qVar, this.f7519i, this.f7525o, m9290s());
                    }
                } else {
                    z = false;
                }
                AbstractC2042e<R> eVar2 = this.f7515e;
                if (eVar2 == null || !eVar2.mo7803b(qVar, this.f7519i, this.f7525o, m9290s())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m9281B();
                }
                this.f7510C = false;
                m9294w();
            } catch (Throwable th) {
                this.f7510C = false;
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
        synchronized (this.f7514d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: c */
    public boolean mo7788c() {
        boolean z;
        synchronized (this.f7514d) {
            z = this.f7533w == EnumC2046a.COMPLETE;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f7532v.mo7323k(r1);
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
            java.lang.Object r0 = r5.f7514d
            monitor-enter(r0)
            r5.m9282k()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.t.l.c r1 = r5.f7513c     // Catch:{ all -> 0x0039 }
            r1.mo7875c()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.r.h$a r1 = r5.f7533w     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p140r.C2045h.EnumC2046a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.m9286o()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.o.v<R> r1 = r5.f7529s     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f7529s = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m9283l()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            com.bumptech.glide.r.j.h<R> r3 = r5.f7525o     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.m9289r()     // Catch:{ all -> 0x0039 }
            r3.mo7615h(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f7533w = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.bumptech.glide.load.o.k r0 = r5.f7532v
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
        this.f7513c.mo7875c();
        try {
            synchronized (this.f7514d) {
                try {
                    this.f7530t = null;
                    if (vVar == null) {
                        mo7804a(new C1787q("Expected to receive a Resource<R> with an object of " + this.f7520j + " inside, but instead got null."));
                        return;
                    }
                    Object c = vVar.mo7358c();
                    if (c != null) {
                        if (this.f7520j.isAssignableFrom(c.getClass())) {
                            if (!m9285n()) {
                                try {
                                    this.f7529s = null;
                                    this.f7533w = EnumC2046a.COMPLETE;
                                    this.f7532v.mo7323k(vVar);
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
                    this.f7529s = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f7520j);
                    sb.append(" but instead got ");
                    sb.append(c != null ? c.getClass() : "");
                    sb.append("{");
                    sb.append(c);
                    sb.append("} inside Resource{");
                    sb.append(vVar);
                    sb.append("}.");
                    sb.append(c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    mo7804a(new C1787q(sb.toString()));
                    this.f7532v.mo7323k(vVar);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            if (0 != 0) {
                this.f7532v.mo7323k(null);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2044g
    /* renamed from: e */
    public Object mo7806e() {
        this.f7513c.mo7875c();
        return this.f7514d;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: f */
    public void mo7792f() {
        synchronized (this.f7514d) {
            m9282k();
            this.f7513c.mo7875c();
            this.f7531u = C2077f.m9416b();
            if (this.f7519i == null) {
                if (C2082k.m9451r(this.f7522l, this.f7523m)) {
                    this.f7508A = this.f7522l;
                    this.f7509B = this.f7523m;
                }
                m9297z(new C1787q("Received null model"), m9288q() == null ? 5 : 3);
                return;
            }
            EnumC2046a aVar = this.f7533w;
            EnumC2046a aVar2 = EnumC2046a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            } else if (aVar == EnumC2046a.COMPLETE) {
                mo7805d(this.f7529s, EnumC1630a.MEMORY_CACHE);
            } else {
                EnumC2046a aVar3 = EnumC2046a.WAITING_FOR_SIZE;
                this.f7533w = aVar3;
                if (C2082k.m9451r(this.f7522l, this.f7523m)) {
                    mo7807g(this.f7522l, this.f7523m);
                } else {
                    this.f7525o.mo7815i(this);
                }
                EnumC2046a aVar4 = this.f7533w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m9284m()) {
                    this.f7525o.mo7809c(m9289r());
                }
                if (f7507a) {
                    m9292u("finished run method in " + C2077f.m9415a(this.f7531u));
                }
            }
        }
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2054g
    /* renamed from: g */
    public void mo7807g(int i, int i2) {
        Object obj;
        this.f7513c.mo7875c();
        Object obj2 = this.f7514d;
        synchronized (obj2) {
            try {
                boolean z = f7507a;
                if (z) {
                    m9292u("Got onSizeReady in " + C2077f.m9415a(this.f7531u));
                }
                if (this.f7533w == EnumC2046a.WAITING_FOR_SIZE) {
                    EnumC2046a aVar = EnumC2046a.RUNNING;
                    this.f7533w = aVar;
                    float w = this.f7521k.mo7782w();
                    this.f7508A = m9293v(i, w);
                    this.f7509B = m9293v(i2, w);
                    if (z) {
                        m9292u("finished setup for calling load in " + C2077f.m9415a(this.f7531u));
                    }
                    obj = obj2;
                    try {
                        this.f7530t = this.f7532v.mo7322f(this.f7518h, this.f7519i, this.f7521k.mo7781v(), this.f7508A, this.f7509B, this.f7521k.mo7780u(), this.f7520j, this.f7524n, this.f7521k.mo7768i(), this.f7521k.mo7784y(), this.f7521k.mo7741H(), this.f7521k.mo7739D(), this.f7521k.mo7774o(), this.f7521k.mo7737B(), this.f7521k.mo7736A(), this.f7521k.mo7785z(), this.f7521k.mo7773n(), this, this.f7528r);
                        if (this.f7533w != aVar) {
                            this.f7530t = null;
                        }
                        if (z) {
                            m9292u("finished onSizeReady in " + C2077f.m9415a(this.f7531u));
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
        synchronized (this.f7514d) {
            i = this.f7522l;
            i2 = this.f7523m;
            obj = this.f7519i;
            cls = this.f7520j;
            aVar = this.f7521k;
            gVar = this.f7524n;
            List<AbstractC2042e<R>> list = this.f7526p;
            size = list != null ? list.size() : 0;
        }
        C2045h hVar = (C2045h) cVar;
        synchronized (hVar.f7514d) {
            i3 = hVar.f7522l;
            i4 = hVar.f7523m;
            obj2 = hVar.f7519i;
            cls2 = hVar.f7520j;
            aVar2 = hVar.f7521k;
            gVar2 = hVar.f7524n;
            List<AbstractC2042e<R>> list2 = hVar.f7526p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C2082k.m9435b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: i */
    public boolean mo7795i() {
        boolean z;
        synchronized (this.f7514d) {
            z = this.f7533w == EnumC2046a.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f7514d) {
            EnumC2046a aVar = this.f7533w;
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
        synchronized (this.f7514d) {
            z = this.f7533w == EnumC2046a.CLEARED;
        }
        return z;
    }
}
