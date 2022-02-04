package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.bumptech.glide.load.p128q.p133h.C1966c;
import com.bumptech.glide.p137o.AbstractC2004c;
import com.bumptech.glide.p137o.AbstractC2006d;
import com.bumptech.glide.p137o.AbstractC2011h;
import com.bumptech.glide.p137o.AbstractC2012i;
import com.bumptech.glide.p137o.AbstractC2019m;
import com.bumptech.glide.p137o.C2020n;
import com.bumptech.glide.p137o.C2023p;
import com.bumptech.glide.p140r.AbstractC2039c;
import com.bumptech.glide.p140r.AbstractC2042e;
import com.bumptech.glide.p140r.C2043f;
import com.bumptech.glide.p140r.p141j.AbstractC2055h;
import com.bumptech.glide.p144t.C2082k;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.k */
public class ComponentCallbacks2C1626k implements ComponentCallbacks2, AbstractC2012i {

    /* renamed from: b */
    private static final C2043f f6605b = ((C2043f) C2043f.m9274e0(Bitmap.class).mo7744K());

    /* renamed from: c */
    private static final C2043f f6606c = ((C2043f) C2043f.m9274e0(C1966c.class).mo7744K());

    /* renamed from: d */
    private static final C2043f f6607d = ((C2043f) ((C2043f) C2043f.m9275f0(AbstractC1763j.f6904c).mo7750R(EnumC1616g.LOW)).mo7754Y(true));

    /* renamed from: e */
    protected final ComponentCallbacks2C1610c f6608e;

    /* renamed from: f */
    protected final Context f6609f;

    /* renamed from: g */
    final AbstractC2011h f6610g;

    /* renamed from: h */
    private final C2020n f6611h;

    /* renamed from: i */
    private final AbstractC2019m f6612i;

    /* renamed from: j */
    private final C2023p f6613j;

    /* renamed from: k */
    private final Runnable f6614k;

    /* renamed from: l */
    private final Handler f6615l;

    /* renamed from: m */
    private final AbstractC2004c f6616m;

    /* renamed from: n */
    private final CopyOnWriteArrayList<AbstractC2042e<Object>> f6617n;

    /* renamed from: o */
    private C2043f f6618o;

    /* renamed from: p */
    private boolean f6619p;

    /* renamed from: com.bumptech.glide.k$a */
    class RunnableC1627a implements Runnable {
        RunnableC1627a() {
        }

        public void run() {
            ComponentCallbacks2C1626k kVar = ComponentCallbacks2C1626k.this;
            kVar.f6610g.mo7668a(kVar);
        }
    }

    /* renamed from: com.bumptech.glide.k$b */
    private class C1628b implements AbstractC2004c.AbstractC2005a {

        /* renamed from: a */
        private final C2020n f6621a;

        C1628b(C2020n nVar) {
            this.f6621a = nVar;
        }

        @Override // com.bumptech.glide.p137o.AbstractC2004c.AbstractC2005a
        /* renamed from: a */
        public void mo7064a(boolean z) {
            if (z) {
                synchronized (ComponentCallbacks2C1626k.this) {
                    this.f6621a.mo7700e();
                }
            }
        }
    }

    public ComponentCallbacks2C1626k(ComponentCallbacks2C1610c cVar, AbstractC2011h hVar, AbstractC2019m mVar, Context context) {
        this(cVar, hVar, mVar, new C2020n(), cVar.mo6981g(), context);
    }

    ComponentCallbacks2C1626k(ComponentCallbacks2C1610c cVar, AbstractC2011h hVar, AbstractC2019m mVar, C2020n nVar, AbstractC2006d dVar, Context context) {
        this.f6613j = new C2023p();
        RunnableC1627a aVar = new RunnableC1627a();
        this.f6614k = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6615l = handler;
        this.f6608e = cVar;
        this.f6610g = hVar;
        this.f6612i = mVar;
        this.f6611h = nVar;
        this.f6609f = context;
        AbstractC2004c a = dVar.mo7673a(context.getApplicationContext(), new C1628b(nVar));
        this.f6616m = a;
        if (C2082k.m9448o()) {
            handler.post(aVar);
        } else {
            hVar.mo7668a(this);
        }
        hVar.mo7668a(a);
        this.f6617n = new CopyOnWriteArrayList<>(cVar.mo6983i().mo6998c());
        mo7038B(cVar.mo6983i().mo6999d());
        cVar.mo6986o(this);
    }

    /* renamed from: E */
    private void m7824E(AbstractC2055h<?> hVar) {
        boolean D = mo7040D(hVar);
        AbstractC2039c g = hVar.mo7814g();
        if (!D && !this.f6608e.mo6990p(hVar) && g != null) {
            hVar.mo7816j(null);
            g.clear();
        }
    }

    /* renamed from: A */
    public synchronized void mo7037A() {
        this.f6611h.mo7701f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public synchronized void mo7038B(C2043f fVar) {
        this.f6618o = (C2043f) ((C2043f) fVar.clone()).mo7757b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public synchronized void mo7039C(AbstractC2055h<?> hVar, AbstractC2039c cVar) {
        this.f6613j.mo7713n(hVar);
        this.f6611h.mo7702g(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized boolean mo7040D(AbstractC2055h<?> hVar) {
        AbstractC2039c g = hVar.mo7814g();
        if (g == null) {
            return true;
        }
        if (!this.f6611h.mo7696a(g)) {
            return false;
        }
        this.f6613j.mo7714o(hVar);
        hVar.mo7816j(null);
        return true;
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: a */
    public synchronized void mo7041a() {
        mo7037A();
        this.f6613j.mo7041a();
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: f */
    public synchronized void mo7042f() {
        mo7062z();
        this.f6613j.mo7042f();
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: k */
    public synchronized void mo7043k() {
        this.f6613j.mo7043k();
        for (AbstractC2055h<?> hVar : this.f6613j.mo7712m()) {
            mo7047o(hVar);
        }
        this.f6613j.mo7711l();
        this.f6611h.mo7697b();
        this.f6610g.mo7669b(this);
        this.f6610g.mo7669b(this.f6616m);
        this.f6615l.removeCallbacks(this.f6614k);
        this.f6608e.mo6992s(this);
    }

    /* renamed from: l */
    public <ResourceType> C1624j<ResourceType> mo7044l(Class<ResourceType> cls) {
        return new C1624j<>(this.f6608e, this, cls, this.f6609f);
    }

    /* renamed from: m */
    public C1624j<Bitmap> mo7045m() {
        return mo7044l(Bitmap.class).mo7022a(f6605b);
    }

    /* renamed from: n */
    public C1624j<Drawable> mo7046n() {
        return mo7044l(Drawable.class);
    }

    /* renamed from: o */
    public void mo7047o(AbstractC2055h<?> hVar) {
        if (hVar != null) {
            m7824E(hVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f6619p) {
            mo7061y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public List<AbstractC2042e<Object>> mo7051p() {
        return this.f6617n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized C2043f mo7052q() {
        return this.f6618o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <T> AbstractC1629l<?, T> mo7053r(Class<T> cls) {
        return this.f6608e.mo6983i().mo7000e(cls);
    }

    /* renamed from: s */
    public C1624j<Drawable> mo7054s(Drawable drawable) {
        return mo7046n().mo7031r0(drawable);
    }

    /* renamed from: t */
    public C1624j<Drawable> mo7055t(Uri uri) {
        return mo7046n().mo7032s0(uri);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6611h + ", treeNode=" + this.f6612i + "}";
    }

    /* renamed from: u */
    public C1624j<Drawable> mo7057u(File file) {
        return mo7046n().mo7033t0(file);
    }

    /* renamed from: v */
    public C1624j<Drawable> mo7058v(Integer num) {
        return mo7046n().mo7034u0(num);
    }

    /* renamed from: w */
    public C1624j<Drawable> mo7059w(String str) {
        return mo7046n().mo7036w0(str);
    }

    /* renamed from: x */
    public synchronized void mo7060x() {
        this.f6611h.mo7698c();
    }

    /* renamed from: y */
    public synchronized void mo7061y() {
        mo7060x();
        for (ComponentCallbacks2C1626k kVar : this.f6612i.mo7676a()) {
            kVar.mo7060x();
        }
    }

    /* renamed from: z */
    public synchronized void mo7062z() {
        this.f6611h.mo7699d();
    }
}
