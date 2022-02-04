package p069c.p070a.p071a.p072w;

import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import p069c.p070a.p071a.AbstractC1239n;

@Deprecated
/* renamed from: c.a.a.w.f */
public class C1264f implements AbstractC1268i {

    /* renamed from: a */
    protected final HttpClient f5520a;

    /* renamed from: c.a.a.w.f$a */
    public static final class C1265a extends HttpEntityEnclosingRequestBase {
        public C1265a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public C1264f(HttpClient httpClient) {
        this.f5520a = httpClient;
    }

    /* renamed from: b */
    static HttpUriRequest m6713b(AbstractC1239n<?> nVar, Map<String, String> map) {
        switch (nVar.mo6203n()) {
            case -1:
                byte[] q = nVar.mo6206q();
                if (q == null) {
                    return new HttpGet(nVar.mo6215y());
                }
                HttpPost httpPost = new HttpPost(nVar.mo6215y());
                httpPost.addHeader("Content-Type", nVar.mo6207r());
                httpPost.setEntity(new ByteArrayEntity(q));
                return httpPost;
            case 0:
                return new HttpGet(nVar.mo6215y());
            case 1:
                HttpPost httpPost2 = new HttpPost(nVar.mo6215y());
                httpPost2.addHeader("Content-Type", nVar.mo6199j());
                m6714d(httpPost2, nVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(nVar.mo6215y());
                httpPut.addHeader("Content-Type", nVar.mo6199j());
                m6714d(httpPut, nVar);
                return httpPut;
            case 3:
                return new HttpDelete(nVar.mo6215y());
            case 4:
                return new HttpHead(nVar.mo6215y());
            case 5:
                return new HttpOptions(nVar.mo6215y());
            case 6:
                return new HttpTrace(nVar.mo6215y());
            case 7:
                C1265a aVar = new C1265a(nVar.mo6215y());
                aVar.addHeader("Content-Type", nVar.mo6199j());
                m6714d(aVar, nVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: d */
    private static void m6714d(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, AbstractC1239n<?> nVar) {
        byte[] i = nVar.mo6198i();
        if (i != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(i));
        }
    }

    /* renamed from: e */
    private static void m6715e(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // p069c.p070a.p071a.p072w.AbstractC1268i
    /* renamed from: a */
    public HttpResponse mo6232a(AbstractC1239n<?> nVar, Map<String, String> map) {
        HttpUriRequest b = m6713b(nVar, map);
        m6715e(b, map);
        m6715e(b, nVar.mo6202m());
        mo6246c(b);
        HttpParams params = b.getParams();
        int w = nVar.mo6213w();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, w);
        return this.f5520a.execute(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6246c(HttpUriRequest httpUriRequest) {
    }
}
