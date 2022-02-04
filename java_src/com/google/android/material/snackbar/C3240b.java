package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.snackbar.b */
public class C3240b {

    /* renamed from: a */
    private static C3240b f10808a;

    /* renamed from: b */
    private final Object f10809b = new Object();

    /* renamed from: c */
    private final Handler f10810c = new Handler(Looper.getMainLooper(), new C3241a());

    /* renamed from: d */
    private C3243c f10811d;

    /* renamed from: e */
    private C3243c f10812e;

    /* renamed from: com.google.android.material.snackbar.b$a */
    class C3241a implements Handler.Callback {
        C3241a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C3240b.this.mo10910d((C3243c) message.obj);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b */
    public interface AbstractC3242b {
        /* renamed from: a */
        void mo10869a();

        /* renamed from: b */
        void mo10870b(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.b$c */
    public static class C3243c {

        /* renamed from: a */
        final WeakReference<AbstractC3242b> f10814a;

        /* renamed from: b */
        int f10815b;

        /* renamed from: c */
        boolean f10816c;

        C3243c(int i, AbstractC3242b bVar) {
            this.f10814a = new WeakReference<>(bVar);
            this.f10815b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10918a(AbstractC3242b bVar) {
            return bVar != null && this.f10814a.get() == bVar;
        }
    }

    private C3240b() {
    }

    /* renamed from: a */
    private boolean m13539a(C3243c cVar, int i) {
        AbstractC3242b bVar = cVar.f10814a.get();
        if (bVar == null) {
            return false;
        }
        this.f10810c.removeCallbacksAndMessages(cVar);
        bVar.mo10870b(i);
        return true;
    }

    /* renamed from: c */
    static C3240b m13540c() {
        if (f10808a == null) {
            f10808a = new C3240b();
        }
        return f10808a;
    }

    /* renamed from: f */
    private boolean m13541f(AbstractC3242b bVar) {
        C3243c cVar = this.f10811d;
        return cVar != null && cVar.mo10918a(bVar);
    }

    /* renamed from: g */
    private boolean m13542g(AbstractC3242b bVar) {
        C3243c cVar = this.f10812e;
        return cVar != null && cVar.mo10918a(bVar);
    }

    /* renamed from: l */
    private void m13543l(C3243c cVar) {
        int i = cVar.f10815b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f10810c.removeCallbacksAndMessages(cVar);
            Handler handler = this.f10810c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: n */
    private void m13544n() {
        C3243c cVar = this.f10812e;
        if (cVar != null) {
            this.f10811d = cVar;
            this.f10812e = null;
            AbstractC3242b bVar = cVar.f10814a.get();
            if (bVar != null) {
                bVar.mo10869a();
            } else {
                this.f10811d = null;
            }
        }
    }

    /* renamed from: b */
    public void mo10909b(AbstractC3242b bVar, int i) {
        C3243c cVar;
        synchronized (this.f10809b) {
            if (m13541f(bVar)) {
                cVar = this.f10811d;
            } else if (m13542g(bVar)) {
                cVar = this.f10812e;
            }
            m13539a(cVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10910d(C3243c cVar) {
        synchronized (this.f10809b) {
            if (this.f10811d == cVar || this.f10812e == cVar) {
                m13539a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo10911e(AbstractC3242b bVar) {
        boolean z;
        synchronized (this.f10809b) {
            if (!m13541f(bVar)) {
                if (!m13542g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public void mo10912h(AbstractC3242b bVar) {
        synchronized (this.f10809b) {
            if (m13541f(bVar)) {
                this.f10811d = null;
                if (this.f10812e != null) {
                    m13544n();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo10913i(AbstractC3242b bVar) {
        synchronized (this.f10809b) {
            if (m13541f(bVar)) {
                m13543l(this.f10811d);
            }
        }
    }

    /* renamed from: j */
    public void mo10914j(AbstractC3242b bVar) {
        synchronized (this.f10809b) {
            if (m13541f(bVar)) {
                C3243c cVar = this.f10811d;
                if (!cVar.f10816c) {
                    cVar.f10816c = true;
                    this.f10810c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo10915k(AbstractC3242b bVar) {
        synchronized (this.f10809b) {
            if (m13541f(bVar)) {
                C3243c cVar = this.f10811d;
                if (cVar.f10816c) {
                    cVar.f10816c = false;
                    m13543l(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo10916m(int i, AbstractC3242b bVar) {
        synchronized (this.f10809b) {
            if (m13541f(bVar)) {
                C3243c cVar = this.f10811d;
                cVar.f10815b = i;
                this.f10810c.removeCallbacksAndMessages(cVar);
                m13543l(this.f10811d);
                return;
            }
            if (m13542g(bVar)) {
                this.f10812e.f10815b = i;
            } else {
                this.f10812e = new C3243c(i, bVar);
            }
            C3243c cVar2 = this.f10811d;
            if (cVar2 == null || !m13539a(cVar2, 4)) {
                this.f10811d = null;
                m13544n();
            }
        }
    }
}
