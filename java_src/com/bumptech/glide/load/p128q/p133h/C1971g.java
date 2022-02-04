package com.bumptech.glide.load.p128q.p133h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1624j;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.ComponentCallbacks2C1626k;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.p136n.AbstractC1996a;
import com.bumptech.glide.p140r.C2043f;
import com.bumptech.glide.p140r.p141j.AbstractC2050c;
import com.bumptech.glide.p140r.p142k.AbstractC2061b;
import com.bumptech.glide.p143s.C2067d;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.q.h.g */
public class C1971g {

    /* renamed from: a */
    private final AbstractC1996a f7292a;

    /* renamed from: b */
    private final Handler f7293b;

    /* renamed from: c */
    private final List<AbstractC1973b> f7294c;

    /* renamed from: d */
    final ComponentCallbacks2C1626k f7295d;

    /* renamed from: e */
    private final AbstractC1695e f7296e;

    /* renamed from: f */
    private boolean f7297f;

    /* renamed from: g */
    private boolean f7298g;

    /* renamed from: h */
    private boolean f7299h;

    /* renamed from: i */
    private C1624j<Bitmap> f7300i;

    /* renamed from: j */
    private C1972a f7301j;

    /* renamed from: k */
    private boolean f7302k;

    /* renamed from: l */
    private C1972a f7303l;

    /* renamed from: m */
    private Bitmap f7304m;

    /* renamed from: n */
    private AbstractC1651m<Bitmap> f7305n;

    /* renamed from: o */
    private C1972a f7306o;

    /* renamed from: p */
    private AbstractC1975d f7307p;

    /* renamed from: q */
    private int f7308q;

    /* renamed from: r */
    private int f7309r;

    /* renamed from: s */
    private int f7310s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.h.g$a */
    public static class C1972a extends AbstractC2050c<Bitmap> {

        /* renamed from: e */
        private final Handler f7311e;

        /* renamed from: f */
        final int f7312f;

        /* renamed from: g */
        private final long f7313g;

        /* renamed from: h */
        private Bitmap f7314h;

        C1972a(Handler handler, int i, long j) {
            this.f7311e = handler;
            this.f7312f = i;
            this.f7313g = j;
        }

        @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
        /* renamed from: h */
        public void mo7615h(Drawable drawable) {
            this.f7314h = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Bitmap mo7616l() {
            return this.f7314h;
        }

        /* renamed from: m */
        public void mo7614d(Bitmap bitmap, AbstractC2061b<? super Bitmap> bVar) {
            this.f7314h = bitmap;
            this.f7311e.sendMessageAtTime(this.f7311e.obtainMessage(1, this), this.f7313g);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$b */
    public interface AbstractC1973b {
        /* renamed from: a */
        void mo7577a();
    }

    /* renamed from: com.bumptech.glide.load.q.h.g$c */
    private class C1974c implements Handler.Callback {
        C1974c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C1971g.this.mo7610m((C1972a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C1971g.this.f7295d.mo7047o((C1972a) message.obj);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.h.g$d */
    public interface AbstractC1975d {
        /* renamed from: a */
        void mo7619a();
    }

    C1971g(ComponentCallbacks2C1610c cVar, AbstractC1996a aVar, int i, int i2, AbstractC1651m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.mo6980f(), ComponentCallbacks2C1610c.m7756u(cVar.mo6982h()), aVar, null, m8915i(ComponentCallbacks2C1610c.m7756u(cVar.mo6982h()), i, i2), mVar, bitmap);
    }

    C1971g(AbstractC1695e eVar, ComponentCallbacks2C1626k kVar, AbstractC1996a aVar, Handler handler, C1624j<Bitmap> jVar, AbstractC1651m<Bitmap> mVar, Bitmap bitmap) {
        this.f7294c = new ArrayList();
        this.f7295d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C1974c()) : handler;
        this.f7296e = eVar;
        this.f7293b = handler;
        this.f7300i = jVar;
        this.f7292a = aVar;
        mo7611o(mVar, bitmap);
    }

    /* renamed from: g */
    private static AbstractC1643g m8914g() {
        return new C2067d(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C1624j<Bitmap> m8915i(ComponentCallbacks2C1626k kVar, int i, int i2) {
        return kVar.mo7045m().mo7022a(((C2043f) ((C2043f) C2043f.m9275f0(AbstractC1763j.f6911b).mo7761d0(true)).mo7754Y(true)).mo7749Q(i, i2));
    }

    /* renamed from: l */
    private void m8916l() {
        if (this.f7297f && !this.f7298g) {
            if (this.f7299h) {
                C2081j.m9429a(this.f7306o == null, "Pending target must be null when starting from the first frame");
                this.f7292a.mo7658i();
                this.f7299h = false;
            }
            C1972a aVar = this.f7306o;
            if (aVar != null) {
                this.f7306o = null;
                mo7610m(aVar);
                return;
            }
            this.f7298g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f7292a.mo7656g());
            this.f7292a.mo7654e();
            this.f7303l = new C1972a(this.f7293b, this.f7292a.mo7649a(), uptimeMillis);
            this.f7300i.mo7022a(C2043f.m9276g0(m8914g())).mo7035v0(this.f7292a).mo7028m0(this.f7303l);
        }
    }

    /* renamed from: n */
    private void m8917n() {
        Bitmap bitmap = this.f7304m;
        if (bitmap != null) {
            this.f7296e.mo7183d(bitmap);
            this.f7304m = null;
        }
    }

    /* renamed from: p */
    private void m8918p() {
        if (!this.f7297f) {
            this.f7297f = true;
            this.f7302k = false;
            m8916l();
        }
    }

    /* renamed from: q */
    private void m8919q() {
        this.f7297f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7601a() {
        this.f7294c.clear();
        m8917n();
        m8919q();
        C1972a aVar = this.f7301j;
        if (aVar != null) {
            this.f7295d.mo7047o(aVar);
            this.f7301j = null;
        }
        C1972a aVar2 = this.f7303l;
        if (aVar2 != null) {
            this.f7295d.mo7047o(aVar2);
            this.f7303l = null;
        }
        C1972a aVar3 = this.f7306o;
        if (aVar3 != null) {
            this.f7295d.mo7047o(aVar3);
            this.f7306o = null;
        }
        this.f7292a.clear();
        this.f7302k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo7602b() {
        return this.f7292a.mo7657h().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo7603c() {
        C1972a aVar = this.f7301j;
        return aVar != null ? aVar.mo7616l() : this.f7304m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo7604d() {
        C1972a aVar = this.f7301j;
        if (aVar != null) {
            return aVar.f7312f;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo7605e() {
        return this.f7304m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo7606f() {
        return this.f7292a.mo7655f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo7607h() {
        return this.f7310s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo7608j() {
        return this.f7292a.mo7650b() + this.f7308q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo7609k() {
        return this.f7309r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7610m(C1972a aVar) {
        AbstractC1975d dVar = this.f7307p;
        if (dVar != null) {
            dVar.mo7619a();
        }
        this.f7298g = false;
        if (this.f7302k) {
            this.f7293b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f7297f) {
            this.f7306o = aVar;
        } else {
            if (aVar.mo7616l() != null) {
                m8917n();
                C1972a aVar2 = this.f7301j;
                this.f7301j = aVar;
                for (int size = this.f7294c.size() - 1; size >= 0; size--) {
                    this.f7294c.get(size).mo7577a();
                }
                if (aVar2 != null) {
                    this.f7293b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m8916l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo7611o(AbstractC1651m<Bitmap> mVar, Bitmap bitmap) {
        this.f7305n = (AbstractC1651m) C2081j.m9432d(mVar);
        this.f7304m = (Bitmap) C2081j.m9432d(bitmap);
        this.f7300i = this.f7300i.mo7022a(new C2043f().mo7755Z(mVar));
        this.f7308q = C2082k.m9440g(bitmap);
        this.f7309r = bitmap.getWidth();
        this.f7310s = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7612r(AbstractC1973b bVar) {
        if (this.f7302k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f7294c.contains(bVar)) {
            boolean isEmpty = this.f7294c.isEmpty();
            this.f7294c.add(bVar);
            if (isEmpty) {
                m8918p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7613s(AbstractC1973b bVar) {
        this.f7294c.remove(bVar);
        if (this.f7294c.isEmpty()) {
            m8919q();
        }
    }
}
