package androidx.lifecycle;

import androidx.lifecycle.AbstractC0614d;
import java.util.Map;
import p006b.p015b.p016a.p017a.C0798a;
import p006b.p015b.p016a.p018b.C0805b;

public abstract class LiveData<T> {

    /* renamed from: a */
    static final Object f2999a = new Object();

    /* renamed from: b */
    final Object f3000b = new Object();

    /* renamed from: c */
    private C0805b<AbstractC0627m<? super T>, LiveData<T>.AbstractC0608b> f3001c = new C0805b<>();

    /* renamed from: d */
    int f3002d = 0;

    /* renamed from: e */
    private volatile Object f3003e;

    /* renamed from: f */
    volatile Object f3004f;

    /* renamed from: g */
    private int f3005g;

    /* renamed from: h */
    private boolean f3006h;

    /* renamed from: i */
    private boolean f3007i;

    /* renamed from: j */
    private final Runnable f3008j;

    class LifecycleBoundObserver extends LiveData<T>.AbstractC0608b implements AbstractC0617e {

        /* renamed from: e */
        final AbstractC0619g f3009e;

        LifecycleBoundObserver(AbstractC0619g gVar, AbstractC0627m<? super T> mVar) {
            super(mVar);
            this.f3009e = gVar;
        }

        @Override // androidx.lifecycle.AbstractC0617e
        /* renamed from: d */
        public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
            if (this.f3009e.mo140n().mo3665b() == AbstractC0614d.EnumC0616b.DESTROYED) {
                LiveData.this.mo3644g(this.f3012a);
            } else {
                mo3650h(mo3648k());
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC0608b
        /* renamed from: i */
        public void mo3646i() {
            this.f3009e.mo140n().mo3666c(this);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC0608b
        /* renamed from: j */
        public boolean mo3647j(AbstractC0619g gVar) {
            return this.f3009e == gVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC0608b
        /* renamed from: k */
        public boolean mo3648k() {
            return this.f3009e.mo140n().mo3665b().mo3667a(AbstractC0614d.EnumC0616b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class RunnableC0607a implements Runnable {
        RunnableC0607a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3000b) {
                obj = LiveData.this.f3004f;
                LiveData.this.f3004f = LiveData.f2999a;
            }
            LiveData.this.mo3645h(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class AbstractC0608b {

        /* renamed from: a */
        final AbstractC0627m<? super T> f3012a;

        /* renamed from: b */
        boolean f3013b;

        /* renamed from: c */
        int f3014c = -1;

        AbstractC0608b(AbstractC0627m<? super T> mVar) {
            this.f3012a = mVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3650h(boolean z) {
            if (z != this.f3013b) {
                this.f3013b = z;
                LiveData liveData = LiveData.this;
                int i = liveData.f3002d;
                int i2 = 1;
                boolean z2 = i == 0;
                if (!z) {
                    i2 = -1;
                }
                liveData.f3002d = i + i2;
                if (z2 && z) {
                    liveData.mo3642e();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f3002d == 0 && !this.f3013b) {
                    liveData2.mo3643f();
                }
                if (this.f3013b) {
                    LiveData.this.mo3640c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3646i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3647j(AbstractC0619g gVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract boolean mo3648k();
    }

    public LiveData() {
        Object obj = f2999a;
        this.f3003e = obj;
        this.f3004f = obj;
        this.f3005g = -1;
        this.f3008j = new RunnableC0607a();
    }

    /* renamed from: a */
    private static void m3212a(String str) {
        if (!C0798a.m4684d().mo4749b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    /* renamed from: b */
    private void m3213b(LiveData<T>.AbstractC0608b bVar) {
        if (bVar.f3013b) {
            if (!bVar.mo3648k()) {
                bVar.mo3650h(false);
                return;
            }
            int i = bVar.f3014c;
            int i2 = this.f3005g;
            if (i < i2) {
                bVar.f3014c = i2;
                bVar.f3012a.mo3672a((Object) this.f3003e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3640c(LiveData<T>.AbstractC0608b bVar) {
        if (this.f3006h) {
            this.f3007i = true;
            return;
        }
        this.f3006h = true;
        do {
            this.f3007i = false;
            if (bVar == null) {
                C0805b<K, V>.C0809d d = this.f3001c.mo4761d();
                while (d.hasNext()) {
                    m3213b((AbstractC0608b) ((Map.Entry) d.next()).getValue());
                    if (this.f3007i) {
                        break;
                    }
                }
            } else {
                m3213b(bVar);
                bVar = null;
            }
        } while (this.f3007i);
        this.f3006h = false;
    }

    /* renamed from: d */
    public void mo3641d(AbstractC0619g gVar, AbstractC0627m<? super T> mVar) {
        m3212a("observe");
        if (gVar.mo140n().mo3665b() != AbstractC0614d.EnumC0616b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            LiveData<T>.AbstractC0608b g = this.f3001c.mo4756g(mVar, lifecycleBoundObserver);
            if (g != null && !g.mo3647j(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (g == null) {
                gVar.mo140n().mo3664a(lifecycleBoundObserver);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3642e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3643f() {
    }

    /* renamed from: g */
    public void mo3644g(AbstractC0627m<? super T> mVar) {
        m3212a("removeObserver");
        LiveData<T>.AbstractC0608b h = this.f3001c.mo4757h(mVar);
        if (h != null) {
            h.mo3646i();
            h.mo3650h(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo3645h(T t) {
        m3212a("setValue");
        this.f3005g++;
        this.f3003e = t;
        mo3640c(null);
    }
}
