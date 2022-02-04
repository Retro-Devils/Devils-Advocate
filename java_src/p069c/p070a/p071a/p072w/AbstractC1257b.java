package p069c.p070a.p071a.p072w;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1232g;

/* renamed from: c.a.a.w.b */
public abstract class AbstractC1257b implements AbstractC1268i {
    @Override // p069c.p070a.p071a.p072w.AbstractC1268i
    @Deprecated
    /* renamed from: a */
    public final HttpResponse mo6232a(AbstractC1239n<?> nVar, Map<String, String> map) {
        C1267h b = mo6231b(nVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b.mo6251d(), ""));
        ArrayList arrayList = new ArrayList();
        for (C1232g gVar : b.mo6250c()) {
            arrayList.add(new BasicHeader(gVar.mo6169a(), gVar.mo6170b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream a = b.mo6248a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength((long) b.mo6249b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    /* renamed from: b */
    public abstract C1267h mo6231b(AbstractC1239n<?> nVar, Map<String, String> map);
}
