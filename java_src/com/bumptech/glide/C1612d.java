package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.load.p122o.C1769k;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p122o.p123a0.C1696f;
import com.bumptech.glide.load.p122o.p123a0.C1701j;
import com.bumptech.glide.load.p122o.p123a0.C1704k;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1727h;
import com.bumptech.glide.load.p122o.p124b0.C1724f;
import com.bumptech.glide.load.p122o.p124b0.C1726g;
import com.bumptech.glide.load.p122o.p124b0.C1729i;
import com.bumptech.glide.load.p122o.p125c0.ExecutorServiceC1737a;
import com.bumptech.glide.p137o.AbstractC2006d;
import com.bumptech.glide.p137o.C2009f;
import com.bumptech.glide.p137o.C2016l;
import com.bumptech.glide.p140r.AbstractC2042e;
import com.bumptech.glide.p140r.C2043f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p006b.p021d.C0823a;

/* renamed from: com.bumptech.glide.d */
public final class C1612d {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC1629l<?, ?>> f6538a = new C0823a();

    /* renamed from: b */
    private C1769k f6539b;

    /* renamed from: c */
    private AbstractC1695e f6540c;

    /* renamed from: d */
    private AbstractC1690b f6541d;

    /* renamed from: e */
    private AbstractC1727h f6542e;

    /* renamed from: f */
    private ExecutorServiceC1737a f6543f;

    /* renamed from: g */
    private ExecutorServiceC1737a f6544g;

    /* renamed from: h */
    private AbstractC1714a.AbstractC1715a f6545h;

    /* renamed from: i */
    private C1729i f6546i;

    /* renamed from: j */
    private AbstractC2006d f6547j;

    /* renamed from: k */
    private int f6548k = 4;

    /* renamed from: l */
    private ComponentCallbacks2C1610c.AbstractC1611a f6549l = new C1613a();

    /* renamed from: m */
    private C2016l.AbstractC2018b f6550m;

    /* renamed from: n */
    private ExecutorServiceC1737a f6551n;

    /* renamed from: o */
    private boolean f6552o;

    /* renamed from: p */
    private List<AbstractC2042e<Object>> f6553p;

    /* renamed from: q */
    private boolean f6554q;

    /* renamed from: r */
    private boolean f6555r;

    /* renamed from: com.bumptech.glide.d$a */
    class C1613a implements ComponentCallbacks2C1610c.AbstractC1611a {
        C1613a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C1610c.AbstractC1611a
        /* renamed from: a */
        public C2043f mo6993a() {
            return new C2043f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacks2C1610c mo6994a(Context context) {
        if (this.f6543f == null) {
            this.f6543f = ExecutorServiceC1737a.m8175g();
        }
        if (this.f6544g == null) {
            this.f6544g = ExecutorServiceC1737a.m8173e();
        }
        if (this.f6551n == null) {
            this.f6551n = ExecutorServiceC1737a.m8171c();
        }
        if (this.f6546i == null) {
            this.f6546i = new C1729i.C1730a(context).mo7234a();
        }
        if (this.f6547j == null) {
            this.f6547j = new C2009f();
        }
        if (this.f6540c == null) {
            int b = this.f6546i.mo7232b();
            if (b > 0) {
                this.f6540c = new C1704k((long) b);
            } else {
                this.f6540c = new C1696f();
            }
        }
        if (this.f6541d == null) {
            this.f6541d = new C1701j(this.f6546i.mo7231a());
        }
        if (this.f6542e == null) {
            this.f6542e = new C1726g((long) this.f6546i.mo7233d());
        }
        if (this.f6545h == null) {
            this.f6545h = new C1724f(context);
        }
        if (this.f6539b == null) {
            this.f6539b = new C1769k(this.f6542e, this.f6545h, this.f6544g, this.f6543f, ExecutorServiceC1737a.m8176h(), this.f6551n, this.f6552o);
        }
        List<AbstractC2042e<Object>> list = this.f6553p;
        this.f6553p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        return new ComponentCallbacks2C1610c(context, this.f6539b, this.f6542e, this.f6540c, this.f6541d, new C2016l(this.f6550m), this.f6547j, this.f6548k, this.f6549l, this.f6538a, this.f6553p, this.f6554q, this.f6555r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6995b(C2016l.AbstractC2018b bVar) {
        this.f6550m = bVar;
    }
}
