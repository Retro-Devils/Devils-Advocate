package com.bumptech.glide.load.p126p;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.p144t.C2081j;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.p.g */
public class C1829g implements AbstractC1643g {

    /* renamed from: b */
    private final AbstractC1830h f7053b;

    /* renamed from: c */
    private final URL f7054c;

    /* renamed from: d */
    private final String f7055d;

    /* renamed from: e */
    private String f7056e;

    /* renamed from: f */
    private URL f7057f;

    /* renamed from: g */
    private volatile byte[] f7058g;

    /* renamed from: h */
    private int f7059h;

    public C1829g(String str) {
        this(str, AbstractC1830h.f7061b);
    }

    public C1829g(String str, AbstractC1830h hVar) {
        this.f7054c = null;
        this.f7055d = C2081j.m9430b(str);
        this.f7053b = (AbstractC1830h) C2081j.m9432d(hVar);
    }

    public C1829g(URL url) {
        this(url, AbstractC1830h.f7061b);
    }

    public C1829g(URL url, AbstractC1830h hVar) {
        this.f7054c = (URL) C2081j.m9432d(url);
        this.f7055d = null;
        this.f7053b = (AbstractC1830h) C2081j.m9432d(hVar);
    }

    /* renamed from: d */
    private byte[] m8473d() {
        if (this.f7058g == null) {
            this.f7058g = mo7422c().getBytes(AbstractC1643g.f6648a);
        }
        return this.f7058g;
    }

    /* renamed from: f */
    private String m8474f() {
        if (TextUtils.isEmpty(this.f7056e)) {
            String str = this.f7055d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C2081j.m9432d(this.f7054c)).toString();
            }
            this.f7056e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f7056e;
    }

    /* renamed from: g */
    private URL m8475g() {
        if (this.f7057f == null) {
            this.f7057f = new URL(m8474f());
        }
        return this.f7057f;
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        messageDigest.update(m8473d());
    }

    /* renamed from: c */
    public String mo7422c() {
        String str = this.f7055d;
        return str != null ? str : ((URL) C2081j.m9432d(this.f7054c)).toString();
    }

    /* renamed from: e */
    public Map<String, String> mo7423e() {
        return this.f7053b.mo7426a();
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (!(obj instanceof C1829g)) {
            return false;
        }
        C1829g gVar = (C1829g) obj;
        return mo7422c().equals(gVar.mo7422c()) && this.f7053b.equals(gVar.f7053b);
    }

    /* renamed from: h */
    public URL mo7424h() {
        return m8475g();
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        if (this.f7059h == 0) {
            int hashCode = mo7422c().hashCode();
            this.f7059h = hashCode;
            this.f7059h = (hashCode * 31) + this.f7053b.hashCode();
        }
        return this.f7059h;
    }

    public String toString() {
        return mo7422c();
    }
}
