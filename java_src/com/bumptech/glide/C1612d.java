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
    private final Map<Class<?>, AbstractC1629l<?, ?>> f6546a = new C0823a();

    /* renamed from: b */
    private C1769k f6547b;

    /* renamed from: c */
    private AbstractC1695e f6548c;

    /* renamed from: d */
    private AbstractC1690b f6549d;

    /* renamed from: e */
    private AbstractC1727h f6550e;

    /* renamed from: f */
    private ExecutorServiceC1737a f6551f;

    /* renamed from: g */
    private ExecutorServiceC1737a f6552g;

    /* renamed from: h */
    private AbstractC1714a.AbstractC1715a f6553h;

    /* renamed from: i */
    private C1729i f6554i;

    /* renamed from: j */
    private AbstractC2006d f6555j;

    /* renamed from: k */
    private int f6556k = 4;

    /* renamed from: l */
    private ComponentCallbacks2C1610c.AbstractC1611a f6557l = new C1613a();

    /* renamed from: m */
    private C2016l.AbstractC2018b f6558m;

    /* renamed from: n */
    private ExecutorServiceC1737a f6559n;

    /* renamed from: o */
    private boolean f6560o;

    /* renamed from: p */
    private List<AbstractC2042e<Object>> f6561p;

    /* renamed from: q */
    private boolean f6562q;

    /* renamed from: r */
    private boolean f6563r;

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
        if (this.f6551f == null) {
            this.f6551f = ExecutorServiceC1737a.m8175g();
        }
        if (this.f6552g == null) {
            this.f6552g = ExecutorServiceC1737a.m8173e();
        }
        if (this.f6559n == null) {
            this.f6559n = ExecutorServiceC1737a.m8171c();
        }
        if (this.f6554i == null) {
            this.f6554i = new C1729i.C1730a(context).mo7234a();
        }
        if (this.f6555j == null) {
            this.f6555j = new C2009f();
        }
        if (this.f6548c == null) {
            int b = this.f6554i.mo7232b();
            if (b > 0) {
                this.f6548c = new C1704k((long) b);
            } else {
                this.f6548c = new C1696f();
            }
        }
        if (this.f6549d == null) {
            this.f6549d = new C1701j(this.f6554i.mo7231a());
        }
        if (this.f6550e == null) {
            this.f6550e = new C1726g((long) this.f6554i.mo7233d());
        }
        if (this.f6553h == null) {
            this.f6553h = new C1724f(context);
        }
        if (this.f6547b == null) {
            this.f6547b = new C1769k(this.f6550e, this.f6553h, this.f6552g, this.f6551f, ExecutorServiceC1737a.m8176h(), this.f6559n, this.f6560o);
        }
        List<AbstractC2042e<Object>> list = this.f6561p;
        this.f6561p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        return new ComponentCallbacks2C1610c(context, this.f6547b, this.f6550e, this.f6548c, this.f6549d, new C2016l(this.f6558m), this.f6555j, this.f6556k, this.f6557l, this.f6546a, this.f6561p, this.f6562q, this.f6563r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6995b(C2016l.AbstractC2018b bVar) {
        this.f6558m = bVar;
    }
}
