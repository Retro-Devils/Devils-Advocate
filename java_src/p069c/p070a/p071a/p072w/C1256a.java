package p069c.p070a.p071a.p072w;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1232g;

/* renamed from: c.a.a.w.a */
class C1256a extends AbstractC1257b {

    /* renamed from: a */
    private final AbstractC1268i f5489a;

    C1256a(AbstractC1268i iVar) {
        this.f5489a = iVar;
    }

    @Override // p069c.p070a.p071a.p072w.AbstractC1257b
    /* renamed from: b */
    public C1267h mo6231b(AbstractC1239n<?> nVar, Map<String, String> map) {
        try {
            HttpResponse a = this.f5489a.mo6232a(nVar, map);
            int statusCode = a.getStatusLine().getStatusCode();
            Header[] allHeaders = a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C1232g(header.getName(), header.getValue()));
            }
            if (a.getEntity() == null) {
                return new C1267h(statusCode, arrayList);
            }
            long contentLength = a.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C1267h(statusCode, arrayList, (int) a.getEntity().getContentLength(), a.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
