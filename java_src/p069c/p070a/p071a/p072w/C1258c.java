package p069c.p070a.p071a.p072w;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p069c.p070a.p071a.AbstractC1222b;
import p069c.p070a.p071a.AbstractC1233h;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.AbstractC1249r;
import p069c.p070a.p071a.C1232g;
import p069c.p070a.p071a.C1250s;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.C1253v;

/* renamed from: c.a.a.w.c */
public class C1258c implements AbstractC1233h {

    /* renamed from: a */
    protected static final boolean f5490a = C1253v.f5481b;
    @Deprecated

    /* renamed from: b */
    protected final AbstractC1268i f5491b;

    /* renamed from: c */
    private final AbstractC1257b f5492c;

    /* renamed from: d */
    protected final C1259d f5493d;

    public C1258c(AbstractC1257b bVar) {
        this(bVar, new C1259d(4096));
    }

    public C1258c(AbstractC1257b bVar, C1259d dVar) {
        this.f5492c = bVar;
        this.f5491b = bVar;
        this.f5493d = dVar;
    }

    @Deprecated
    public C1258c(AbstractC1268i iVar) {
        this(iVar, new C1259d(4096));
    }

    @Deprecated
    public C1258c(AbstractC1268i iVar, C1259d dVar) {
        this.f5491b = iVar;
        this.f5492c = new C1256a(iVar);
        this.f5493d = dVar;
    }

    /* renamed from: b */
    private static void m6677b(String str, AbstractC1239n<?> nVar, C1252u uVar) {
        AbstractC1249r v = nVar.mo6212v();
        int w = nVar.mo6213w();
        try {
            v.mo6161b(uVar);
            nVar.mo6192b(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(w)));
        } catch (C1252u e) {
            nVar.mo6192b(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(w)));
            throw e;
        }
    }

    /* renamed from: c */
    private static List<C1232g> m6678c(List<C1232g> list, AbstractC1222b.C1223a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C1232g gVar : list) {
                treeSet.add(gVar.mo6169a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C1232g> list2 = aVar.f5406h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C1232g gVar2 : aVar.f5406h) {
                    if (!treeSet.contains(gVar2.mo6169a())) {
                        arrayList.add(gVar2);
                    }
                }
            }
        } else if (!aVar.f5405g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f5405g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C1232g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private Map<String, String> m6679d(AbstractC1222b.C1223a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f5400b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = aVar.f5402d;
        if (j > 0) {
            hashMap.put("If-Modified-Since", C1266g.m6718a(j));
        }
        return hashMap;
    }

    /* renamed from: e */
    private byte[] m6680e(InputStream inputStream, int i) {
        C1274m mVar = new C1274m(this.f5493d, i);
        if (inputStream != null) {
            try {
                byte[] a = this.f5493d.mo6233a(1024);
                while (true) {
                    int read = inputStream.read(a);
                    if (read == -1) {
                        break;
                    }
                    mVar.write(a, 0, read);
                }
                byte[] byteArray = mVar.toByteArray();
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    C1253v.m6669e("Error occurred when closing InputStream", new Object[0]);
                }
                this.f5493d.mo6234b(a);
                mVar.close();
                return byteArray;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        C1253v.m6669e("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f5493d.mo6234b(null);
                mVar.close();
                throw th;
            }
        } else {
            throw new C1250s();
        }
    }

    /* renamed from: f */
    private void m6681f(long j, AbstractC1239n<?> nVar, byte[] bArr, int i) {
        if (f5490a || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = nVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(nVar.mo6212v().mo6162c());
            C1253v.m6666b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r15 = null;
        r2 = r12;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r19 = r1;
        r15 = null;
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r19 = r1;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        r0 = r2.mo6251d();
        p069c.p070a.p071a.C1253v.m6667c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r29.mo6215y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        if (r15 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r1 = new p069c.p070a.p071a.C1236k(r0, r15, false, android.os.SystemClock.elapsedRealtime() - r9, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        if (r0 == 401) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f8, code lost:
        if (r0 < 400) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0104, code lost:
        throw new p069c.p070a.p071a.C1227d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0107, code lost:
        if (r0 < 500) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0111, code lost:
        if (r29.mo6191N() != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        r0 = new p069c.p070a.p071a.C1250s(r1);
        r1 = "server";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0120, code lost:
        throw new p069c.p070a.p071a.C1250s(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0126, code lost:
        throw new p069c.p070a.p071a.C1250s(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0127, code lost:
        r0 = new p069c.p070a.p071a.C1221a(r1);
        r1 = "auth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        r0 = new p069c.p070a.p071a.C1235j();
        r1 = "network";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013c, code lost:
        throw new p069c.p070a.p071a.C1237l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0158, code lost:
        throw new java.lang.RuntimeException("Bad URL " + r29.mo6215y(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0159, code lost:
        r0 = new p069c.p070a.p071a.C1251t();
        r1 = "socket";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013d A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0137 A[SYNTHETIC] */
    @Override // p069c.p070a.p071a.AbstractC1233h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p069c.p070a.p071a.C1236k mo6174a(p069c.p070a.p071a.AbstractC1239n<?> r29) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: p069c.p070a.p071a.p072w.C1258c.mo6174a(c.a.a.n):c.a.a.k");
    }
}
