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
    static final AbstractC1629l<?, ?> f6557a = new C1609b();

    /* renamed from: b */
    private final AbstractC1690b f6558b;

    /* renamed from: c */
    private final C1618i f6559c;

    /* renamed from: d */
    private final C2053f f6560d;

    /* renamed from: e */
    private final ComponentCallbacks2C1610c.AbstractC1611a f6561e;

    /* renamed from: f */
    private final List<AbstractC2042e<Object>> f6562f;

    /* renamed from: g */
    private final Map<Class<?>, AbstractC1629l<?, ?>> f6563g;

    /* renamed from: h */
    private final C1769k f6564h;

    /* renamed from: i */
    private final boolean f6565i;

    /* renamed from: j */
    private final int f6566j;

    /* renamed from: k */
    private C2043f f6567k;

    public C1614e(Context context, AbstractC1690b bVar, C1618i iVar, C2053f fVar, ComponentCallbacks2C1610c.AbstractC1611a aVar, Map<Class<?>, AbstractC1629l<?, ?>> map, List<AbstractC2042e<Object>> list, C1769k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f6558b = bVar;
        this.f6559c = iVar;
        this.f6560d = fVar;
        this.f6561e = aVar;
        this.f6562f = list;
        this.f6563g = map;
        this.f6564h = kVar;
        this.f6565i = z;
        this.f6566j = i;
    }

    /* renamed from: a */
    public <X> AbstractC2056i<ImageView, X> mo6996a(ImageView imageView, Class<X> cls) {
        return this.f6560d.mo7819a(imageView, cls);
    }

    /* renamed from: b */
    public AbstractC1690b mo6997b() {
        return this.f6558b;
    }

    /* renamed from: c */
    public List<AbstractC2042e<Object>> mo6998c() {
        return this.f6562f;
    }

    /* renamed from: d */
    public synchronized C2043f mo6999d() {
        if (this.f6567k == null) {
            this.f6567k = (C2043f) this.f6561e.mo6993a().mo7744K();
        }
        return this.f6567k;
    }

    /* renamed from: e */
    public <T> AbstractC1629l<?, T> mo7000e(Class<T> cls) {
        AbstractC1629l<?, T> lVar = (AbstractC1629l<?, T>) this.f6563g.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, AbstractC1629l<?, ?>> entry : this.f6563g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (AbstractC1629l<?, T>) entry.getValue();
                }
            }
        }
        return lVar == null ? (AbstractC1629l<?, T>) f6557a : lVar;
    }

    /* renamed from: f */
    public C1769k mo7001f() {
        return this.f6564h;
    }

    /* renamed from: g */
    public int mo7002g() {
        return this.f6566j;
    }

    /* renamed from: h */
    public C1618i mo7003h() {
        return this.f6559c;
    }

    /* renamed from: i */
    public boolean mo7004i() {
        return this.f6565i;
    }
}
