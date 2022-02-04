package p155e.p156a.p157a.p158a.p159b.p160b;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p155e.p156a.p157a.p158a.p159b.AbstractC3348a;

/* renamed from: e.a.a.a.b.b.k */
public class C3368k implements AbstractC3348a {

    /* renamed from: a */
    private String f11324a;

    /* renamed from: b */
    private boolean f11325b;

    /* renamed from: c */
    private boolean f11326c;

    /* renamed from: d */
    private boolean f11327d;

    /* renamed from: e */
    private boolean f11328e;

    /* renamed from: f */
    private boolean f11329f;

    /* renamed from: g */
    private boolean f11330g;

    /* renamed from: h */
    private long f11331h;

    /* renamed from: i */
    private long f11332i;

    /* renamed from: j */
    private long f11333j;

    /* renamed from: k */
    private boolean f11334k;

    /* renamed from: l */
    private int f11335l;

    /* renamed from: m */
    private boolean f11336m;

    /* renamed from: n */
    private long f11337n;

    /* renamed from: o */
    private long f11338o;

    /* renamed from: p */
    private Iterable<? extends C3371n> f11339p;

    /* renamed from: a */
    public Iterable<? extends C3371n> mo11316a() {
        return this.f11339p;
    }

    @Override // p155e.p156a.p157a.p158a.p159b.AbstractC3348a
    /* renamed from: b */
    public long mo11292b() {
        return this.f11338o;
    }

    /* renamed from: c */
    public long mo11317c() {
        return this.f11337n;
    }

    /* renamed from: d */
    public boolean mo11318d() {
        return this.f11330g;
    }

    /* renamed from: e */
    public boolean mo11319e() {
        return this.f11336m;
    }

    /* renamed from: f */
    public boolean mo11320f() {
        return this.f11328e;
    }

    /* renamed from: g */
    public boolean mo11321g() {
        return this.f11329f;
    }

    /* renamed from: h */
    public boolean mo11322h() {
        return this.f11334k;
    }

    /* renamed from: i */
    public String mo11323i() {
        return this.f11324a;
    }

    /* renamed from: j */
    public boolean mo11324j() {
        return this.f11325b;
    }

    /* renamed from: k */
    public void mo11325k(long j) {
        this.f11333j = j;
    }

    /* renamed from: l */
    public void mo11326l(boolean z) {
        this.f11327d = z;
    }

    /* renamed from: m */
    public void mo11327m(Iterable<? extends C3371n> iterable) {
        List list;
        if (iterable != null) {
            LinkedList linkedList = new LinkedList();
            for (C3371n nVar : iterable) {
                linkedList.addLast(nVar);
            }
            list = Collections.unmodifiableList(linkedList);
        } else {
            list = null;
        }
        this.f11339p = list;
    }

    /* renamed from: n */
    public void mo11328n(long j) {
        this.f11337n = j;
    }

    /* renamed from: o */
    public void mo11329o(long j) {
        this.f11331h = j;
    }

    /* renamed from: p */
    public void mo11330p(boolean z) {
        this.f11326c = z;
    }

    /* renamed from: q */
    public void mo11331q(boolean z) {
        this.f11330g = z;
    }

    /* renamed from: r */
    public void mo11332r(boolean z) {
        this.f11336m = z;
    }

    /* renamed from: s */
    public void mo11333s(boolean z) {
        this.f11328e = z;
    }

    /* renamed from: t */
    public void mo11334t(boolean z) {
        this.f11329f = z;
    }

    /* renamed from: u */
    public void mo11335u(boolean z) {
        this.f11325b = z;
    }

    /* renamed from: v */
    public void mo11336v(boolean z) {
        this.f11334k = z;
    }

    /* renamed from: w */
    public void mo11337w(long j) {
        this.f11332i = j;
    }

    /* renamed from: x */
    public void mo11338x(String str) {
        this.f11324a = str;
    }

    /* renamed from: y */
    public void mo11339y(long j) {
        this.f11338o = j;
    }

    /* renamed from: z */
    public void mo11340z(int i) {
        this.f11335l = i;
    }
}
