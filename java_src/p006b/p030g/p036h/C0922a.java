package p006b.p030g.p036h;

import android.util.Base64;
import java.util.List;
import p006b.p030g.p038j.C0961i;

/* renamed from: b.g.h.a */
public final class C0922a {

    /* renamed from: a */
    private final String f4563a;

    /* renamed from: b */
    private final String f4564b;

    /* renamed from: c */
    private final String f4565c;

    /* renamed from: d */
    private final List<List<byte[]>> f4566d;

    /* renamed from: e */
    private final int f4567e = 0;

    /* renamed from: f */
    private final String f4568f;

    public C0922a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) C0961i.m5494c(str);
        this.f4563a = str4;
        String str5 = (String) C0961i.m5494c(str2);
        this.f4564b = str5;
        String str6 = (String) C0961i.m5494c(str3);
        this.f4565c = str6;
        this.f4566d = (List) C0961i.m5494c(list);
        this.f4568f = str4 + "-" + str5 + "-" + str6;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo5325a() {
        return this.f4566d;
    }

    /* renamed from: b */
    public int mo5326b() {
        return this.f4567e;
    }

    /* renamed from: c */
    public String mo5327c() {
        return this.f4568f;
    }

    /* renamed from: d */
    public String mo5328d() {
        return this.f4563a;
    }

    /* renamed from: e */
    public String mo5329e() {
        return this.f4564b;
    }

    /* renamed from: f */
    public String mo5330f() {
        return this.f4565c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4563a + ", mProviderPackage: " + this.f4564b + ", mQuery: " + this.f4565c + ", mCertificates:");
        for (int i = 0; i < this.f4566d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f4566d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f4567e);
        return sb.toString();
    }
}
