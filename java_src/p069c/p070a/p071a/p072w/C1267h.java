package p069c.p070a.p071a.p072w;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p069c.p070a.p071a.C1232g;

/* renamed from: c.a.a.w.h */
public final class C1267h {

    /* renamed from: a */
    private final int f5521a;

    /* renamed from: b */
    private final List<C1232g> f5522b;

    /* renamed from: c */
    private final int f5523c;

    /* renamed from: d */
    private final InputStream f5524d;

    public C1267h(int i, List<C1232g> list) {
        this(i, list, -1, null);
    }

    public C1267h(int i, List<C1232g> list, int i2, InputStream inputStream) {
        this.f5521a = i;
        this.f5522b = list;
        this.f5523c = i2;
        this.f5524d = inputStream;
    }

    /* renamed from: a */
    public final InputStream mo6248a() {
        return this.f5524d;
    }

    /* renamed from: b */
    public final int mo6249b() {
        return this.f5523c;
    }

    /* renamed from: c */
    public final List<C1232g> mo6250c() {
        return Collections.unmodifiableList(this.f5522b);
    }

    /* renamed from: d */
    public final int mo6251d() {
        return this.f5521a;
    }
}
