package p155e.p156a.p157a.p158a.p159b.p160b;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p155e.p156a.p157a.p158a.p159b.AbstractC3348a;

/* renamed from: e.a.a.a.b.b.k */
public class C3368k implements AbstractC3348a {

    /* renamed from: a */
    private String f11315a;

    /* renamed from: b */
    private boolean f11316b;

    /* renamed from: c */
    private boolean f11317c;

    /* renamed from: d */
    private boolean f11318d;

    /* renamed from: e */
    private boolean f11319e;

    /* renamed from: f */
    private boolean f11320f;

    /* renamed from: g */
    private boolean f11321g;

    /* renamed from: h */
    private long f11322h;

    /* renamed from: i */
    private long f11323i;

    /* renamed from: j */
    private long f11324j;

    /* renamed from: k */
    private boolean f11325k;

    /* renamed from: l */
    private int f11326l;

    /* renamed from: m */
    private boolean f11327m;

    /* renamed from: n */
    private long f11328n;

    /* renamed from: o */
    private long f11329o;

    /* renamed from: p */
    private Iterable<? extends C3371n> f11330p;

    /* renamed from: a */
    public Iterable<? extends C3371n> mo11316a() {
        return this.f11330p;
    }

    @Override // p155e.p156a.p157a.p158a.p159b.AbstractC3348a
    /* renamed from: b */
    public long mo11292b() {
        return this.f11329o;
    }

    /* renamed from: c */
    public long mo11317c() {
        return this.f11328n;
    }

    /* renamed from: d */
    public boolean mo11318d() {
        return this.f11321g;
    }

    /* renamed from: e */
    public boolean mo11319e() {
        return this.f11327m;
    }

    /* renamed from: f */
    public boolean mo11320f() {
        return this.f11319e;
    }

    /* renamed from: g */
    public boolean mo11321g() {
        return this.f11320f;
    }

    /* renamed from: h */
    public boolean mo11322h() {
        return this.f11325k;
    }

    /* renamed from: i */
    public String mo11323i() {
        return this.f11315a;
    }

    /* renamed from: j */
    public boolean mo11324j() {
        return this.f11316b;
    }

    /* renamed from: k */
    public void mo11325k(long j) {
        this.f11324j = j;
    }

    /* renamed from: l */
    public void mo11326l(boolean z) {
        this.f11318d = z;
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
        this.f11330p = list;
    }

    /* renamed from: n */
    public void mo11328n(long j) {
        this.f11328n = j;
    }

    /* renamed from: o */
    public void mo11329o(long j) {
        this.f11322h = j;
    }

    /* renamed from: p */
    public void mo11330p(boolean z) {
        this.f11317c = z;
    }

    /* renamed from: q */
    public void mo11331q(boolean z) {
        this.f11321g = z;
    }

    /* renamed from: r */
    public void mo11332r(boolean z) {
        this.f11327m = z;
    }

    /* renamed from: s */
    public void mo11333s(boolean z) {
        this.f11319e = z;
    }

    /* renamed from: t */
    public void mo11334t(boolean z) {
        this.f11320f = z;
    }

    /* renamed from: u */
    public void mo11335u(boolean z) {
        this.f11316b = z;
    }

    /* renamed from: v */
    public void mo11336v(boolean z) {
        this.f11325k = z;
    }

    /* renamed from: w */
    public void mo11337w(long j) {
        this.f11323i = j;
    }

    /* renamed from: x */
    public void mo11338x(String str) {
        this.f11315a = str;
    }

    /* renamed from: y */
    public void mo11339y(long j) {
        this.f11329o = j;
    }

    /* renamed from: z */
    public void mo11340z(int i) {
        this.f11326l = i;
    }
}
