package com.bumptech.glide.load.p126p.p127y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.p121p.C1677b;
import com.bumptech.glide.load.p120n.p121p.C1678c;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1851r;
import com.bumptech.glide.load.p128q.p129d.C1899b0;
import com.bumptech.glide.p143s.C2067d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.d */
public class C1881d implements AbstractC1843n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f7131a;

    /* renamed from: com.bumptech.glide.load.p.y.d$a */
    public static class C1882a implements AbstractC1845o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f7132a;

        public C1882a(Context context) {
            this.f7132a = context;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, InputStream> mo7398b(C1851r rVar) {
            return new C1881d(this.f7132a);
        }
    }

    public C1881d(Context context) {
        this.f7131a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m8598e(C1647i iVar) {
        Long l = (Long) iVar.mo7084c(C1899b0.f7167a);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<InputStream> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        if (!C1677b.m7974d(i, i2) || !m8598e(iVar)) {
            return null;
        }
        return new AbstractC1843n.C1844a<>(new C2067d(uri), C1678c.m7978g(this.f7131a, uri));
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return C1677b.m7973c(uri);
    }
}
