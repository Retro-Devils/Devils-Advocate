package p069c.p070a.p071a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import p069c.p070a.p071a.AbstractC1222b;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1253v;

/* renamed from: c.a.a.n */
public abstract class AbstractC1239n<T> implements Comparable<AbstractC1239n<T>> {

    /* renamed from: b */
    private final C1253v.C1254a f5441b;

    /* renamed from: c */
    private final int f5442c;

    /* renamed from: d */
    private final String f5443d;

    /* renamed from: e */
    private final int f5444e;

    /* renamed from: f */
    private final Object f5445f;

    /* renamed from: g */
    private C1245p.AbstractC1246a f5446g;

    /* renamed from: h */
    private Integer f5447h;

    /* renamed from: i */
    private C1243o f5448i;

    /* renamed from: j */
    private boolean f5449j;

    /* renamed from: k */
    private boolean f5450k;

    /* renamed from: l */
    private boolean f5451l;

    /* renamed from: m */
    private boolean f5452m;

    /* renamed from: n */
    private AbstractC1249r f5453n;

    /* renamed from: o */
    private AbstractC1222b.C1223a f5454o;

    /* renamed from: p */
    private AbstractC1241b f5455p;

    /* renamed from: c.a.a.n$a */
    class RunnableC1240a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f5456b;

        /* renamed from: c */
        final /* synthetic */ long f5457c;

        RunnableC1240a(String str, long j) {
            this.f5456b = str;
            this.f5457c = j;
        }

        public void run() {
            AbstractC1239n.this.f5441b.mo6228a(this.f5456b, this.f5457c);
            AbstractC1239n.this.f5441b.mo6229b(AbstractC1239n.this.toString());
        }
    }

    /* renamed from: c.a.a.n$b */
    interface AbstractC1241b {
        /* renamed from: a */
        void mo6158a(AbstractC1239n<?> nVar);

        /* renamed from: b */
        void mo6159b(AbstractC1239n<?> nVar, C1245p<?> pVar);
    }

    /* renamed from: c.a.a.n$c */
    public enum EnumC1242c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC1239n(int i, String str, C1245p.AbstractC1246a aVar) {
        this.f5441b = C1253v.C1254a.f5483a ? new C1253v.C1254a() : null;
        this.f5445f = new Object();
        this.f5449j = true;
        this.f5450k = false;
        this.f5451l = false;
        this.f5452m = false;
        this.f5454o = null;
        this.f5442c = i;
        this.f5443d = str;
        this.f5446g = aVar;
        mo6187J(new C1228e());
        this.f5444e = m6607g(str);
    }

    /* renamed from: f */
    private byte[] m6606f(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: g */
    private static int m6607g(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: A */
    public boolean mo6178A() {
        boolean z;
        synchronized (this.f5445f) {
            z = this.f5450k;
        }
        return z;
    }

    /* renamed from: B */
    public void mo6179B() {
        synchronized (this.f5445f) {
            this.f5451l = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo6180C() {
        AbstractC1241b bVar;
        synchronized (this.f5445f) {
            bVar = this.f5455p;
        }
        if (bVar != null) {
            bVar.mo6158a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo6181D(C1245p<?> pVar) {
        AbstractC1241b bVar;
        synchronized (this.f5445f) {
            bVar = this.f5455p;
        }
        if (bVar != null) {
            bVar.mo6159b(this, pVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C1252u mo6182E(C1252u uVar) {
        return uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract C1245p<T> mo6183F(C1236k kVar);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.a.a.n<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public AbstractC1239n<?> mo6184G(AbstractC1222b.C1223a aVar) {
        this.f5454o = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo6185H(AbstractC1241b bVar) {
        synchronized (this.f5445f) {
            this.f5455p = bVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.a.a.n<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public AbstractC1239n<?> mo6186I(C1243o oVar) {
        this.f5448i = oVar;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.a.a.n<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public AbstractC1239n<?> mo6187J(AbstractC1249r rVar) {
        this.f5453n = rVar;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.a.a.n<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public final AbstractC1239n<?> mo6188K(int i) {
        this.f5447h = Integer.valueOf(i);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.a.a.n<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public final AbstractC1239n<?> mo6189L(boolean z) {
        this.f5449j = z;
        return this;
    }

    /* renamed from: M */
    public final boolean mo6190M() {
        return this.f5449j;
    }

    /* renamed from: N */
    public final boolean mo6191N() {
        return this.f5452m;
    }

    /* renamed from: b */
    public void mo6192b(String str) {
        if (C1253v.C1254a.f5483a) {
            this.f5441b.mo6228a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: c */
    public int compareTo(AbstractC1239n<T> nVar) {
        EnumC1242c u = mo6211u();
        EnumC1242c u2 = nVar.mo6211u();
        return u == u2 ? this.f5447h.intValue() - nVar.f5447h.intValue() : u2.ordinal() - u.ordinal();
    }

    /* renamed from: d */
    public void mo6195d(C1252u uVar) {
        C1245p.AbstractC1246a aVar;
        synchronized (this.f5445f) {
            aVar = this.f5446g;
        }
        if (aVar != null) {
            aVar.mo6225a(uVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo6196e(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6197h(String str) {
        C1243o oVar = this.f5448i;
        if (oVar != null) {
            oVar.mo6219b(this);
        }
        if (C1253v.C1254a.f5483a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1240a(str, id));
                return;
            }
            this.f5441b.mo6228a(str, id);
            this.f5441b.mo6229b(toString());
        }
    }

    /* renamed from: i */
    public byte[] mo6198i() {
        Map<String, String> o = mo6204o();
        if (o == null || o.size() <= 0) {
            return null;
        }
        return m6606f(o, mo6205p());
    }

    /* renamed from: j */
    public String mo6199j() {
        return "application/x-www-form-urlencoded; charset=" + mo6205p();
    }

    /* renamed from: k */
    public AbstractC1222b.C1223a mo6200k() {
        return this.f5454o;
    }

    /* renamed from: l */
    public String mo6201l() {
        String y = mo6215y();
        int n = mo6203n();
        if (n == 0 || n == -1) {
            return y;
        }
        return Integer.toString(n) + '-' + y;
    }

    /* renamed from: m */
    public Map<String, String> mo6202m() {
        return Collections.emptyMap();
    }

    /* renamed from: n */
    public int mo6203n() {
        return this.f5442c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map<String, String> mo6204o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo6205p() {
        return "UTF-8";
    }

    @Deprecated
    /* renamed from: q */
    public byte[] mo6206q() {
        Map<String, String> s = mo6208s();
        if (s == null || s.size() <= 0) {
            return null;
        }
        return m6606f(s, mo6209t());
    }

    @Deprecated
    /* renamed from: r */
    public String mo6207r() {
        return mo6199j();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: s */
    public Map<String, String> mo6208s() {
        return mo6204o();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: t */
    public String mo6209t() {
        return mo6205p();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(mo6214x());
        StringBuilder sb = new StringBuilder();
        sb.append(mo6178A() ? "[X] " : "[ ] ");
        sb.append(mo6215y());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo6211u());
        sb.append(" ");
        sb.append(this.f5447h);
        return sb.toString();
    }

    /* renamed from: u */
    public EnumC1242c mo6211u() {
        return EnumC1242c.NORMAL;
    }

    /* renamed from: v */
    public AbstractC1249r mo6212v() {
        return this.f5453n;
    }

    /* renamed from: w */
    public final int mo6213w() {
        return mo6212v().mo6160a();
    }

    /* renamed from: x */
    public int mo6214x() {
        return this.f5444e;
    }

    /* renamed from: y */
    public String mo6215y() {
        return this.f5443d;
    }

    /* renamed from: z */
    public boolean mo6216z() {
        boolean z;
        synchronized (this.f5445f) {
            z = this.f5451l;
        }
        return z;
    }
}
