package com.bumptech.glide;

import com.bumptech.glide.load.AbstractC1633d;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.AbstractC1650l;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p120n.AbstractC1657e;
import com.bumptech.glide.load.p120n.C1659f;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.C1761i;
import com.bumptech.glide.load.p122o.C1791t;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1846p;
import com.bumptech.glide.load.p128q.p134i.AbstractC1983e;
import com.bumptech.glide.load.p128q.p134i.C1984f;
import com.bumptech.glide.p139q.C2028a;
import com.bumptech.glide.p139q.C2030b;
import com.bumptech.glide.p139q.C2031c;
import com.bumptech.glide.p139q.C2032d;
import com.bumptech.glide.p139q.C2033e;
import com.bumptech.glide.p139q.C2035f;
import com.bumptech.glide.p144t.p145l.C2084a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.i */
public class C1618i {

    /* renamed from: a */
    private final C1846p f6586a;

    /* renamed from: b */
    private final C2028a f6587b;

    /* renamed from: c */
    private final C2033e f6588c;

    /* renamed from: d */
    private final C2035f f6589d;

    /* renamed from: e */
    private final C1659f f6590e;

    /* renamed from: f */
    private final C1984f f6591f;

    /* renamed from: g */
    private final C2030b f6592g;

    /* renamed from: h */
    private final C2032d f6593h = new C2032d();

    /* renamed from: i */
    private final C2031c f6594i = new C2031c();

    /* renamed from: j */
    private final AbstractC0958f<List<Throwable>> f6595j;

    /* renamed from: com.bumptech.glide.i$a */
    public static class C1619a extends RuntimeException {
        public C1619a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    public static final class C1620b extends C1619a {
        public C1620b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.i$c */
    public static class C1621c extends C1619a {
        public C1621c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public C1621c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> C1621c(M m, List<AbstractC1843n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + ((Object) m));
        }
    }

    /* renamed from: com.bumptech.glide.i$d */
    public static class C1622d extends C1619a {
        public C1622d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.i$e */
    public static class C1623e extends C1619a {
        public C1623e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C1618i() {
        AbstractC0958f<List<Throwable>> e = C2084a.m9457e();
        this.f6595j = e;
        this.f6586a = new C1846p(e);
        this.f6587b = new C2028a();
        this.f6588c = new C2033e();
        this.f6589d = new C2035f();
        this.f6590e = new C1659f();
        this.f6591f = new C1984f();
        this.f6592g = new C2030b();
        mo7021r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C1761i<Data, TResource, Transcode>> m7783f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f6588c.mo7730d(cls, cls2)) {
            for (Class cls5 : this.f6591f.mo7626b(cls4, cls3)) {
                arrayList.add(new C1761i(cls, cls4, cls5, this.f6588c.mo7729b(cls, cls4), this.f6591f.mo7625a(cls4, cls5), this.f6595j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> C1618i mo7005a(Class<Data> cls, AbstractC1633d<Data> dVar) {
        this.f6587b.mo7718a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <TResource> C1618i mo7006b(Class<TResource> cls, AbstractC1650l<TResource> lVar) {
        this.f6589d.mo7733a(cls, lVar);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> C1618i mo7007c(Class<Data> cls, Class<TResource> cls2, AbstractC1649k<Data, TResource> kVar) {
        mo7009e("legacy_append", cls, cls2, kVar);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> C1618i mo7008d(Class<Model> cls, Class<Data> cls2, AbstractC1845o<Model, Data> oVar) {
        this.f6586a.mo7444a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> C1618i mo7009e(String str, Class<Data> cls, Class<TResource> cls2, AbstractC1649k<Data, TResource> kVar) {
        this.f6588c.mo7728a(str, kVar, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> mo7010g() {
        List<ImageHeaderParser> b = this.f6592g.mo7722b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new C1620b();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C1791t<Data, TResource, Transcode> mo7011h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1791t<Data, TResource, Transcode> a = this.f6594i.mo7723a(cls, cls2, cls3);
        if (this.f6594i.mo7724c(a)) {
            return null;
        }
        if (a == null) {
            List<C1761i<Data, TResource, Transcode>> f = m7783f(cls, cls2, cls3);
            a = f.isEmpty() ? null : new C1791t<>(cls, cls2, cls3, f, this.f6595j);
            this.f6594i.mo7725d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public <Model> List<AbstractC1843n<Model, ?>> mo7012i(Model model) {
        return this.f6586a.mo7446d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo7013j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f6593h.mo7726a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> cls4 : this.f6586a.mo7445c(cls)) {
                for (Class<?> cls5 : this.f6588c.mo7730d(cls4, cls2)) {
                    if (!this.f6591f.mo7626b(cls5, cls3).isEmpty() && !a.contains(cls5)) {
                        a.add(cls5);
                    }
                }
            }
            this.f6593h.mo7727b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public <X> AbstractC1650l<X> mo7014k(AbstractC1794v<X> vVar) {
        AbstractC1650l<X> b = this.f6589d.mo7734b(vVar.mo7359d());
        if (b != null) {
            return b;
        }
        throw new C1622d(vVar.mo7359d());
    }

    /* renamed from: l */
    public <X> AbstractC1657e<X> mo7015l(X x) {
        return this.f6590e.mo7114a(x);
    }

    /* renamed from: m */
    public <X> AbstractC1633d<X> mo7016m(X x) {
        AbstractC1633d<X> b = this.f6587b.mo7719b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new C1623e(x.getClass());
    }

    /* renamed from: n */
    public boolean mo7017n(AbstractC1794v<?> vVar) {
        return this.f6589d.mo7734b(vVar.mo7359d()) != null;
    }

    /* renamed from: o */
    public C1618i mo7018o(ImageHeaderParser imageHeaderParser) {
        this.f6592g.mo7721a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public C1618i mo7019p(AbstractC1657e.AbstractC1658a<?> aVar) {
        this.f6590e.mo7115b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> C1618i mo7020q(Class<TResource> cls, Class<Transcode> cls2, AbstractC1983e<TResource, Transcode> eVar) {
        this.f6591f.mo7627c(cls, cls2, eVar);
        return this;
    }

    /* renamed from: r */
    public final C1618i mo7021r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f6588c.mo7731e(arrayList);
        return this;
    }
}
