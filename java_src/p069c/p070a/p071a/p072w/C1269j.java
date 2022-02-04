package p069c.p070a.p071a.p072w;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1232g;

/* renamed from: c.a.a.w.j */
public class C1269j extends AbstractC1257b {

    /* renamed from: a */
    private final AbstractC1271b f5525a;

    /* renamed from: b */
    private final SSLSocketFactory f5526b;

    /* renamed from: c.a.a.w.j$a */
    static class C1270a extends FilterInputStream {

        /* renamed from: b */
        private final HttpURLConnection f5527b;

        C1270a(HttpURLConnection httpURLConnection) {
            super(C1269j.m6736i(httpURLConnection));
            this.f5527b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            super.close();
            this.f5527b.disconnect();
        }
    }

    /* renamed from: c.a.a.w.j$b */
    public interface AbstractC1271b {
        /* renamed from: a */
        String mo6254a(String str);
    }

    public C1269j() {
        this(null);
    }

    public C1269j(AbstractC1271b bVar) {
        this(bVar, null);
    }

    public C1269j(AbstractC1271b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f5525a = bVar;
        this.f5526b = sSLSocketFactory;
    }

    /* renamed from: d */
    private static void m6732d(HttpURLConnection httpURLConnection, AbstractC1239n<?> nVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.mo6199j());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: e */
    private static void m6733e(HttpURLConnection httpURLConnection, AbstractC1239n<?> nVar) {
        byte[] i = nVar.mo6198i();
        if (i != null) {
            m6732d(httpURLConnection, nVar, i);
        }
    }

    /* renamed from: f */
    static List<C1232g> m6734f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new C1232g(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static boolean m6735h(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static InputStream m6736i(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: j */
    private HttpURLConnection m6737j(URL url, AbstractC1239n<?> nVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g = mo6252g(url);
        int w = nVar.mo6213w();
        g.setConnectTimeout(w);
        g.setReadTimeout(w);
        g.setUseCaches(false);
        g.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f5526b) != null) {
            ((HttpsURLConnection) g).setSSLSocketFactory(sSLSocketFactory);
        }
        return g;
    }

    /* renamed from: k */
    static void m6738k(HttpURLConnection httpURLConnection, AbstractC1239n<?> nVar) {
        String str;
        String str2;
        switch (nVar.mo6203n()) {
            case -1:
                byte[] q = nVar.mo6206q();
                if (q != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m6732d(httpURLConnection, nVar, q);
                    return;
                }
                return;
            case 0:
                str = "GET";
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m6733e(httpURLConnection, nVar);
                return;
            case 2:
                str2 = "PUT";
                httpURLConnection.setRequestMethod(str2);
                m6733e(httpURLConnection, nVar);
                return;
            case 3:
                str = "DELETE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = "HEAD";
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = "OPTIONS";
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = "TRACE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = "PATCH";
                httpURLConnection.setRequestMethod(str2);
                m6733e(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // p069c.p070a.p071a.p072w.AbstractC1257b
    /* renamed from: b */
    public C1267h mo6231b(AbstractC1239n<?> nVar, Map<String, String> map) {
        String y = nVar.mo6215y();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(nVar.mo6202m());
        AbstractC1271b bVar = this.f5525a;
        if (bVar != null) {
            String a = bVar.mo6254a(y);
            if (a != null) {
                y = a;
            } else {
                throw new IOException("URL blocked by rewriter: " + y);
            }
        }
        HttpURLConnection j = m6737j(new URL(y), nVar);
        try {
            for (String str : hashMap.keySet()) {
                j.setRequestProperty(str, (String) hashMap.get(str));
            }
            m6738k(j, nVar);
            int responseCode = j.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            } else if (m6735h(nVar.mo6203n(), responseCode)) {
                return new C1267h(responseCode, m6734f(j.getHeaderFields()), j.getContentLength(), new C1270a(j));
            } else {
                C1267h hVar = new C1267h(responseCode, m6734f(j.getHeaderFields()));
                j.disconnect();
                return hVar;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j.disconnect();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public HttpURLConnection mo6252g(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }
}
