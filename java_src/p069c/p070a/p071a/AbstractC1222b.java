package p069c.p070a.p071a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.a.b */
public interface AbstractC1222b {

    /* renamed from: c.a.a.b$a */
    public static class C1223a {

        /* renamed from: a */
        public byte[] f5406a;

        /* renamed from: b */
        public String f5407b;

        /* renamed from: c */
        public long f5408c;

        /* renamed from: d */
        public long f5409d;

        /* renamed from: e */
        public long f5410e;

        /* renamed from: f */
        public long f5411f;

        /* renamed from: g */
        public Map<String, String> f5412g = Collections.emptyMap();

        /* renamed from: h */
        public List<C1232g> f5413h;

        /* renamed from: a */
        public boolean mo6152a() {
            return this.f5410e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean mo6153b() {
            return this.f5411f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    void mo6149a();

    /* renamed from: b */
    void mo6150b(String str, C1223a aVar);

    /* renamed from: c */
    C1223a mo6151c(String str);
}
