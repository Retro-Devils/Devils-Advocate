package p069c.p070a.p071a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.a.b */
public interface AbstractC1222b {

    /* renamed from: c.a.a.b$a */
    public static class C1223a {

        /* renamed from: a */
        public byte[] f5399a;

        /* renamed from: b */
        public String f5400b;

        /* renamed from: c */
        public long f5401c;

        /* renamed from: d */
        public long f5402d;

        /* renamed from: e */
        public long f5403e;

        /* renamed from: f */
        public long f5404f;

        /* renamed from: g */
        public Map<String, String> f5405g = Collections.emptyMap();

        /* renamed from: h */
        public List<C1232g> f5406h;

        /* renamed from: a */
        public boolean mo6152a() {
            return this.f5403e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean mo6153b() {
            return this.f5404f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    void mo6149a();

    /* renamed from: b */
    void mo6150b(String str, C1223a aVar);

    /* renamed from: c */
    C1223a mo6151c(String str);
}
