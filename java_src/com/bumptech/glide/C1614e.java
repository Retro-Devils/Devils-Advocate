package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.load.p122o.C1769k;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.p140r.AbstractC2042e;
import com.bumptech.glide.p140r.C2043f;
import com.bumptech.glide.p140r.p141j.AbstractC2056i;
import com.bumptech.glide.p140r.p141j.C2053f;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
public class C1614e extends ContextWrapper {

    /* renamed from: a */
    static final AbstractC1629l<?, ?> f6565a = new C1609b();

    /* renamed from: b */
    private final AbstractC1690b f6566b;

    /* renamed from: c */
    private final C1618i f6567c;

    /* renamed from: d */
    private final C2053f f6568d;

    /* renamed from: e */
    private final ComponentCallbacks2C1610c.AbstractC1611a f6569e;

    /* renamed from: f */
    private final List<AbstractC2042e<Object>> f6570f;

    /* renamed from: g */
    private final Map<Class<?>, AbstractC1629l<?, ?>> f6571g;

    /* renamed from: h */
    private final C1769k f6572h;

    /* renamed from: i */
    private final boolean f6573i;

    /* renamed from: j */
    private final int f6574j;

    /* renamed from: k */
    private C2043f f6575k;

    public C1614e(Context context, AbstractC1690b bVar, C1618i iVar, C2053f fVar, ComponentCallbacks2C1610c.AbstractC1611a aVar, Map<Class<?>, AbstractC1629l<?, ?>> map, List<AbstractC2042e<Object>> list, C1769k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f6566b = bVar;
        this.f6567c = iVar;
        this.f6568d = fVar;
        this.f6569e = aVar;
        this.f6570f = list;
        this.f6571g = map;
        this.f6572h = kVar;
        this.f6573i = z;
        this.f6574j = i;
    }

    /* renamed from: a */
    public <X> AbstractC2056i<ImageView, X> mo6996a(ImageView imageView, Class<X> cls) {
        return this.f6568d.mo7819a(imageView, cls);
    }

    /* renamed from: b */
    public AbstractC1690b mo6997b() {
        return this.f6566b;
    }

    /* renamed from: c */
    public List<AbstractC2042e<Object>> mo6998c() {
        return this.f6570f;
    }

    /* renamed from: d */
    public synchronized C2043f mo6999d() {
        if (this.f6575k == null) {
            this.f6575k = (C2043f) this.f6569e.mo6993a().mo7744K();
        }
        return this.f6575k;
    }

    /* renamed from: e */
    public <T> AbstractC1629l<?, T> mo7000e(Class<T> cls) {
        AbstractC1629l<?, T> lVar = (AbstractC1629l<?, T>) this.f6571g.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, AbstractC1629l<?, ?>> entry : this.f6571g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (AbstractC1629l<?, T>) entry.getValue();
                }
            }
        }
        return lVar == null ? (AbstractC1629l<?, T>) f6565a : lVar;
    }

    /* renamed from: f */
    public C1769k mo7001f() {
        return this.f6572h;
    }

    /* renamed from: g */
    public int mo7002g() {
        return this.f6574j;
    }

    /* renamed from: h */
    public C1618i mo7003h() {
        return this.f6567c;
    }

    /* renamed from: i */
    public boolean mo7004i() {
        return this.f6573i;
    }
}
