package com.bumptech.glide.load.p122o;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1614e;
import com.bumptech.glide.C1618i;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1650l;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.EnumC1632c;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p120n.AbstractC1657e;
import com.bumptech.glide.load.p122o.AbstractC1749f;
import com.bumptech.glide.load.p122o.C1761i;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import com.bumptech.glide.load.p128q.p129d.C1930m;
import com.bumptech.glide.p144t.C2077f;
import com.bumptech.glide.p144t.p145l.AbstractC2093c;
import com.bumptech.glide.p144t.p145l.C2084a;
import com.bumptech.glide.p144t.p145l.C2092b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006b.p030g.p038j.AbstractC0958f;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.h */
public class RunnableC1752h<R> implements AbstractC1749f.AbstractC1750a, Runnable, Comparable<RunnableC1752h<?>>, C2084a.AbstractC2090f {

    /* renamed from: A */
    private Object f6852A;

    /* renamed from: B */
    private EnumC1630a f6853B;

    /* renamed from: C */
    private AbstractC1655d<?> f6854C;

    /* renamed from: D */
    private volatile AbstractC1749f f6855D;

    /* renamed from: E */
    private volatile boolean f6856E;

    /* renamed from: F */
    private volatile boolean f6857F;

    /* renamed from: b */
    private final C1751g<R> f6858b = new C1751g<>();

    /* renamed from: c */
    private final List<Throwable> f6859c = new ArrayList();

    /* renamed from: d */
    private final AbstractC2093c f6860d = AbstractC2093c.m9473a();

    /* renamed from: e */
    private final AbstractC1757e f6861e;

    /* renamed from: f */
    private final AbstractC0958f<RunnableC1752h<?>> f6862f;

    /* renamed from: g */
    private final C1756d<?> f6863g = new C1756d<>();

    /* renamed from: h */
    private final C1758f f6864h = new C1758f();

    /* renamed from: i */
    private C1614e f6865i;

    /* renamed from: j */
    private AbstractC1643g f6866j;

    /* renamed from: k */
    private EnumC1616g f6867k;

    /* renamed from: l */
    private C1783n f6868l;

    /* renamed from: m */
    private int f6869m;

    /* renamed from: n */
    private int f6870n;

    /* renamed from: o */
    private AbstractC1763j f6871o;

    /* renamed from: p */
    private C1647i f6872p;

    /* renamed from: q */
    private AbstractC1754b<R> f6873q;

    /* renamed from: r */
    private int f6874r;

    /* renamed from: s */
    private EnumC1760h f6875s;

    /* renamed from: t */
    private EnumC1759g f6876t;

    /* renamed from: u */
    private long f6877u;

    /* renamed from: v */
    private boolean f6878v;

    /* renamed from: w */
    private Object f6879w;

    /* renamed from: x */
    private Thread f6880x;

    /* renamed from: y */
    private AbstractC1643g f6881y;

    /* renamed from: z */
    private AbstractC1643g f6882z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.h$a */
    public static /* synthetic */ class C1753a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6883a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6884b;

        /* renamed from: c */
        static final /* synthetic */ int[] f6885c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p122o.RunnableC1752h.C1753a.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.h$b */
    public interface AbstractC1754b<R> {
        /* renamed from: a */
        void mo7300a(C1787q qVar);

        /* renamed from: d */
        void mo7301d(AbstractC1794v<R> vVar, EnumC1630a aVar);

        /* renamed from: f */
        void mo7302f(RunnableC1752h<?> hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.h$c */
    public final class C1755c<Z> implements C1761i.AbstractC1762a<Z> {

        /* renamed from: a */
        private final EnumC1630a f6886a;

        C1755c(EnumC1630a aVar) {
            this.f6886a = aVar;
        }

        @Override // com.bumptech.glide.load.p122o.C1761i.AbstractC1762a
        /* renamed from: a */
        public AbstractC1794v<Z> mo7303a(AbstractC1794v<Z> vVar) {
            return RunnableC1752h.this.mo7298v(this.f6886a, vVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.h$d */
    public static class C1756d<Z> {

        /* renamed from: a */
        private AbstractC1643g f6888a;

        /* renamed from: b */
        private AbstractC1650l<Z> f6889b;

        /* renamed from: c */
        private C1792u<Z> f6890c;

        C1756d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7304a() {
            this.f6888a = null;
            this.f6889b = null;
            this.f6890c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7305b(AbstractC1757e eVar, C1647i iVar) {
            C2092b.m9469a("DecodeJob.encode");
            try {
                eVar.mo7308a().mo7212a(this.f6888a, new C1748e(this.f6889b, this.f6890c, iVar));
            } finally {
                this.f6890c.mo7385i();
                C2092b.m9472d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo7306c() {
            return this.f6890c != null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bumptech.glide.load.l<X> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bumptech.glide.load.o.u<X> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <X> void mo7307d(AbstractC1643g gVar, AbstractC1650l<X> lVar, C1792u<X> uVar) {
            this.f6888a = gVar;
            this.f6889b = lVar;
            this.f6890c = uVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.h$e */
    public interface AbstractC1757e {
        /* renamed from: a */
        AbstractC1714a mo7308a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.h$f */
    public static class C1758f {

        /* renamed from: a */
        private boolean f6891a;

        /* renamed from: b */
        private boolean f6892b;

        /* renamed from: c */
        private boolean f6893c;

        C1758f() {
        }

        /* renamed from: a */
        private boolean m8254a(boolean z) {
            return (this.f6893c || z || this.f6892b) && this.f6891a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo7309b() {
            this.f6892b = true;
            return m8254a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo7310c() {
            this.f6893c = true;
            return m8254a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo7311d(boolean z) {
            this.f6891a = true;
            return m8254a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo7312e() {
            this.f6892b = false;
            this.f6891a = false;
            this.f6893c = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.h$g */
    public enum EnumC1759g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.h$h */
    public enum EnumC1760h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    RunnableC1752h(AbstractC1757e eVar, AbstractC0958f<RunnableC1752h<?>> fVar) {
        this.f6861e = eVar;
        this.f6862f = fVar;
    }

    /* renamed from: A */
    private void m8216A() {
        int i = C1753a.f6883a[this.f6876t.ordinal()];
        if (i == 1) {
            this.f6875s = m8222k(EnumC1760h.INITIALIZE);
            this.f6855D = m8221j();
        } else if (i != 2) {
            if (i == 3) {
                m8220i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f6876t);
        }
        m8233y();
    }

    /* renamed from: B */
    private void m8217B() {
        Throwable th;
        this.f6860d.mo7875c();
        if (this.f6856E) {
            if (this.f6859c.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f6859c;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f6856E = true;
    }

    /* renamed from: g */
    private <Data> AbstractC1794v<R> m8218g(AbstractC1655d<?> dVar, Data data, EnumC1630a aVar) {
        if (data == null) {
            dVar.mo7097b();
            return null;
        }
        try {
            long b = C2077f.m9416b();
            AbstractC1794v<R> h = m8219h(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m8225o("Decoded result " + h, b);
            }
            return h;
        } finally {
            dVar.mo7097b();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.bumptech.glide.load.o.t<Data, ?, R>, com.bumptech.glide.load.o.t<Data, ResourceType, R> */
    /* renamed from: h */
    private <Data> AbstractC1794v<R> m8219h(Data data, EnumC1630a aVar) {
        return m8234z(data, aVar, (C1791t<Data, ?, R>) this.f6858b.mo7275h(data.getClass()));
    }

    /* renamed from: i */
    private void m8220i() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f6877u;
            m8226p("Retrieved data", j, "data: " + this.f6852A + ", cache key: " + this.f6881y + ", fetcher: " + this.f6854C);
        }
        AbstractC1794v<R> vVar = null;
        try {
            vVar = m8218g(this.f6854C, this.f6852A, this.f6853B);
        } catch (C1787q e) {
            e.mo7370i(this.f6882z, this.f6853B);
            this.f6859c.add(e);
        }
        if (vVar != null) {
            m8228r(vVar, this.f6853B);
        } else {
            m8233y();
        }
    }

    /* renamed from: j */
    private AbstractC1749f m8221j() {
        int i = C1753a.f6884b[this.f6875s.ordinal()];
        if (i == 1) {
            return new C1795w(this.f6858b, this);
        }
        if (i == 2) {
            return new C1736c(this.f6858b, this);
        }
        if (i == 3) {
            return new C1799z(this.f6858b, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f6875s);
    }

    /* renamed from: k */
    private EnumC1760h m8222k(EnumC1760h hVar) {
        int i = C1753a.f6884b[hVar.ordinal()];
        if (i == 1) {
            return this.f6871o.mo7315a() ? EnumC1760h.DATA_CACHE : m8222k(EnumC1760h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f6878v ? EnumC1760h.FINISHED : EnumC1760h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return EnumC1760h.FINISHED;
        }
        if (i == 5) {
            return this.f6871o.mo7316b() ? EnumC1760h.RESOURCE_CACHE : m8222k(EnumC1760h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: l */
    private C1647i m8223l(EnumC1630a aVar) {
        C1647i iVar = this.f6872p;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == EnumC1630a.RESOURCE_DISK_CACHE || this.f6858b.mo7290w();
        C1644h<Boolean> hVar = C1930m.f7216e;
        Boolean bool = (Boolean) iVar.mo7084c(hVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        C1647i iVar2 = new C1647i();
        iVar2.mo7085d(this.f6872p);
        iVar2.mo7086e(hVar, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: m */
    private int m8224m() {
        return this.f6867k.ordinal();
    }

    /* renamed from: o */
    private void m8225o(String str, long j) {
        m8226p(str, j, null);
    }

    /* renamed from: p */
    private void m8226p(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2077f.m9415a(j));
        sb.append(", load key: ");
        sb.append(this.f6868l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: q */
    private void m8227q(AbstractC1794v<R> vVar, EnumC1630a aVar) {
        m8217B();
        this.f6873q.mo7301d(vVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bumptech.glide.load.o.u */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.bumptech.glide.load.o.u */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bumptech.glide.load.o.u */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    private void m8228r(AbstractC1794v<R> vVar, EnumC1630a aVar) {
        if (vVar instanceof AbstractC1789r) {
            ((AbstractC1789r) vVar).mo7379a();
        }
        C1792u uVar = 0;
        if (this.f6863g.mo7306c()) {
            vVar = C1792u.m8365g(vVar);
            uVar = vVar;
        }
        m8227q(vVar, aVar);
        this.f6875s = EnumC1760h.ENCODE;
        try {
            if (this.f6863g.mo7306c()) {
                this.f6863g.mo7305b(this.f6861e, this.f6872p);
            }
            m8230t();
        } finally {
            if (uVar != 0) {
                uVar.mo7385i();
            }
        }
    }

    /* renamed from: s */
    private void m8229s() {
        m8217B();
        this.f6873q.mo7300a(new C1787q("Failed to load resource", new ArrayList(this.f6859c)));
        m8231u();
    }

    /* renamed from: t */
    private void m8230t() {
        if (this.f6864h.mo7309b()) {
            m8232x();
        }
    }

    /* renamed from: u */
    private void m8231u() {
        if (this.f6864h.mo7310c()) {
            m8232x();
        }
    }

    /* renamed from: x */
    private void m8232x() {
        this.f6864h.mo7312e();
        this.f6863g.mo7304a();
        this.f6858b.mo7268a();
        this.f6856E = false;
        this.f6865i = null;
        this.f6866j = null;
        this.f6872p = null;
        this.f6867k = null;
        this.f6868l = null;
        this.f6873q = null;
        this.f6875s = null;
        this.f6855D = null;
        this.f6880x = null;
        this.f6881y = null;
        this.f6852A = null;
        this.f6853B = null;
        this.f6854C = null;
        this.f6877u = 0;
        this.f6857F = false;
        this.f6879w = null;
        this.f6859c.clear();
        this.f6862f.mo5398a(this);
    }

    /* renamed from: y */
    private void m8233y() {
        this.f6880x = Thread.currentThread();
        this.f6877u = C2077f.m9416b();
        boolean z = false;
        while (!this.f6857F && this.f6855D != null && !(z = this.f6855D.mo7241a())) {
            this.f6875s = m8222k(this.f6875s);
            this.f6855D = m8221j();
            if (this.f6875s == EnumC1760h.SOURCE) {
                mo7265b();
                return;
            }
        }
        if ((this.f6875s == EnumC1760h.FINISHED || this.f6857F) && !z) {
            m8229s();
        }
    }

    /* renamed from: z */
    private <Data, ResourceType> AbstractC1794v<R> m8234z(Data data, EnumC1630a aVar, C1791t<Data, ResourceType, R> tVar) {
        C1647i l = m8223l(aVar);
        AbstractC1657e<Data> l2 = this.f6865i.mo7003h().mo7015l(data);
        try {
            return tVar.mo7383a(l2, l, this.f6869m, this.f6870n, new C1755c(aVar));
        } finally {
            l2.mo7111b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo7292C() {
        EnumC1760h k = m8222k(EnumC1760h.INITIALIZE);
        return k == EnumC1760h.RESOURCE_CACHE || k == EnumC1760h.DATA_CACHE;
    }

    /* renamed from: a */
    public void mo7293a() {
        this.f6857F = true;
        AbstractC1749f fVar = this.f6855D;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f.AbstractC1750a
    /* renamed from: b */
    public void mo7265b() {
        this.f6876t = EnumC1759g.SWITCH_TO_SOURCE_SERVICE;
        this.f6873q.mo7302f(this);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f.AbstractC1750a
    /* renamed from: c */
    public void mo7266c(AbstractC1643g gVar, Object obj, AbstractC1655d<?> dVar, EnumC1630a aVar, AbstractC1643g gVar2) {
        this.f6881y = gVar;
        this.f6852A = obj;
        this.f6854C = dVar;
        this.f6853B = aVar;
        this.f6882z = gVar2;
        if (Thread.currentThread() != this.f6880x) {
            this.f6876t = EnumC1759g.DECODE_DATA;
            this.f6873q.mo7302f(this);
            return;
        }
        C2092b.m9469a("DecodeJob.decodeFromRetrievedData");
        try {
            m8220i();
        } finally {
            C2092b.m9472d();
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f.AbstractC1750a
    /* renamed from: d */
    public void mo7267d(AbstractC1643g gVar, Exception exc, AbstractC1655d<?> dVar, EnumC1630a aVar) {
        dVar.mo7097b();
        C1787q qVar = new C1787q("Fetching data failed", exc);
        qVar.mo7371j(gVar, aVar, dVar.mo7092a());
        this.f6859c.add(qVar);
        if (Thread.currentThread() != this.f6880x) {
            this.f6876t = EnumC1759g.SWITCH_TO_SOURCE_SERVICE;
            this.f6873q.mo7302f(this);
            return;
        }
        m8233y();
    }

    @Override // com.bumptech.glide.p144t.p145l.C2084a.AbstractC2090f
    /* renamed from: e */
    public AbstractC2093c mo7240e() {
        return this.f6860d;
    }

    /* renamed from: f */
    public int compareTo(RunnableC1752h<?> hVar) {
        int m = m8224m() - hVar.m8224m();
        return m == 0 ? this.f6874r - hVar.f6874r : m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RunnableC1752h<R> mo7296n(C1614e eVar, Object obj, C1783n nVar, AbstractC1643g gVar, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1616g gVar2, AbstractC1763j jVar, Map<Class<?>, AbstractC1651m<?>> map, boolean z, boolean z2, boolean z3, C1647i iVar, AbstractC1754b<R> bVar, int i3) {
        this.f6858b.mo7288u(eVar, obj, gVar, i, i2, jVar, cls, cls2, gVar2, iVar, map, z, z2, this.f6861e);
        this.f6865i = eVar;
        this.f6866j = gVar;
        this.f6867k = gVar2;
        this.f6868l = nVar;
        this.f6869m = i;
        this.f6870n = i2;
        this.f6871o = jVar;
        this.f6878v = z3;
        this.f6872p = iVar;
        this.f6873q = bVar;
        this.f6874r = i3;
        this.f6876t = EnumC1759g.INITIALIZE;
        this.f6879w = obj;
        return this;
    }

    public void run() {
        C2092b.m9470b("DecodeJob#run(model=%s)", this.f6879w);
        AbstractC1655d<?> dVar = this.f6854C;
        try {
            if (this.f6857F) {
                m8229s();
                if (dVar != null) {
                    dVar.mo7097b();
                }
                C2092b.m9472d();
                return;
            }
            m8216A();
            if (dVar != null) {
                dVar.mo7097b();
            }
            C2092b.m9472d();
        } catch (C1713b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo7097b();
            }
            C2092b.m9472d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public <Z> AbstractC1794v<Z> mo7298v(EnumC1630a aVar, AbstractC1794v<Z> vVar) {
        AbstractC1651m<Z> mVar;
        AbstractC1794v<Z> vVar2;
        EnumC1632c cVar;
        AbstractC1643g gVar;
        Class<?> cls = vVar.mo7358c().getClass();
        AbstractC1650l lVar = null;
        if (aVar != EnumC1630a.RESOURCE_DISK_CACHE) {
            AbstractC1651m<Z> r = this.f6858b.mo7285r(cls);
            mVar = r;
            vVar2 = r.mo7091b(this.f6865i, vVar, this.f6869m, this.f6870n);
        } else {
            vVar2 = vVar;
            mVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.mo7361f();
        }
        if (this.f6858b.mo7289v(vVar2)) {
            lVar = this.f6858b.mo7281n(vVar2);
            cVar = lVar.mo7090b(this.f6872p);
        } else {
            cVar = EnumC1632c.NONE;
        }
        if (!this.f6871o.mo7318d(!this.f6858b.mo7291x(this.f6881y), aVar, cVar)) {
            return vVar2;
        }
        if (lVar != null) {
            int i = C1753a.f6885c[cVar.ordinal()];
            if (i == 1) {
                gVar = new C1747d(this.f6881y, this.f6866j);
            } else if (i == 2) {
                gVar = new C1796x(this.f6858b.mo7269b(), this.f6881y, this.f6866j, this.f6869m, this.f6870n, mVar, cls, this.f6872p);
            } else {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            C1792u g = C1792u.m8365g(vVar2);
            this.f6863g.mo7307d(gVar, lVar, g);
            return g;
        }
        throw new C1618i.C1622d(vVar2.mo7358c().getClass());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo7299w(boolean z) {
        if (this.f6864h.mo7311d(z)) {
            m8232x();
        }
    }
}
