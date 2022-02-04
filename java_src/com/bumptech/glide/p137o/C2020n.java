package com.bumptech.glide.p137o;

import android.util.Log;
import com.bumptech.glide.p140r.AbstractC2039c;
import com.bumptech.glide.p144t.C2082k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.n */
public class C2020n {

    /* renamed from: a */
    private final Set<AbstractC2039c> f7447a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<AbstractC2039c> f7448b = new ArrayList();

    /* renamed from: c */
    private boolean f7449c;

    /* renamed from: a */
    public boolean mo7696a(AbstractC2039c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f7447a.remove(cVar);
        if (!this.f7448b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo7697b() {
        for (AbstractC2039c cVar : C2082k.m9442i(this.f7447a)) {
            mo7696a(cVar);
        }
        this.f7448b.clear();
    }

    /* renamed from: c */
    public void mo7698c() {
        this.f7449c = true;
        for (AbstractC2039c cVar : C2082k.m9442i(this.f7447a)) {
            if (cVar.isRunning() || cVar.mo7795i()) {
                cVar.clear();
                this.f7448b.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public void mo7699d() {
        this.f7449c = true;
        for (AbstractC2039c cVar : C2082k.m9442i(this.f7447a)) {
            if (cVar.isRunning()) {
                cVar.mo7787b();
                this.f7448b.add(cVar);
            }
        }
    }

    /* renamed from: e */
    public void mo7700e() {
        for (AbstractC2039c cVar : C2082k.m9442i(this.f7447a)) {
            if (!cVar.mo7795i() && !cVar.mo7797j()) {
                cVar.clear();
                if (!this.f7449c) {
                    cVar.mo7792f();
                } else {
                    this.f7448b.add(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo7701f() {
        this.f7449c = false;
        for (AbstractC2039c cVar : C2082k.m9442i(this.f7447a)) {
            if (!cVar.mo7795i() && !cVar.isRunning()) {
                cVar.mo7792f();
            }
        }
        this.f7448b.clear();
    }

    /* renamed from: g */
    public void mo7702g(AbstractC2039c cVar) {
        this.f7447a.add(cVar);
        if (!this.f7449c) {
            cVar.mo7792f();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f7448b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f7447a.size() + ", isPaused=" + this.f7449c + "}";
    }
}
