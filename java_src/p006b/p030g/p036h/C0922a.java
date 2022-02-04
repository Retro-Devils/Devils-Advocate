package p006b.p030g.p036h;

import android.util.Base64;
import java.util.List;
import p006b.p030g.p038j.C0961i;

/* renamed from: b.g.h.a */
public final class C0922a {

    /* renamed from: a */
    private final String f4559a;

    /* renamed from: b */
    private final String f4560b;

    /* renamed from: c */
    private final String f4561c;

    /* renamed from: d */
    private final List<List<byte[]>> f4562d;

    /* renamed from: e */
    private final int f4563e = 0;

    /* renamed from: f */
    private final String f4564f;

    public C0922a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) C0961i.m5494c(str);
        this.f4559a = str4;
        String str5 = (String) C0961i.m5494c(str2);
        this.f4560b = str5;
        String str6 = (String) C0961i.m5494c(str3);
        this.f4561c = str6;
        this.f4562d = (List) C0961i.m5494c(list);
        this.f4564f = str4 + "-" + str5 + "-" + str6;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo5325a() {
        return this.f4562d;
    }

    /* renamed from: b */
    public int mo5326b() {
        return this.f4563e;
    }

    /* renamed from: c */
    public String mo5327c() {
        return this.f4564f;
    }

    /* renamed from: d */
    public String mo5328d() {
        return this.f4559a;
    }

    /* renamed from: e */
    public String mo5329e() {
        return this.f4560b;
    }

    /* renamed from: f */
    public String mo5330f() {
        return this.f4561c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4559a + ", mProviderPackage: " + this.f4560b + ", mQuery: " + this.f4561c + ", mCertificates:");
        for (int i = 0; i < this.f4562d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f4562d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f4563e);
        return sb.toString();
    }
}
