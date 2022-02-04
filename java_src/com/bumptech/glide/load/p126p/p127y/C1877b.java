package com.bumptech.glide.load.p126p.p127y;

import android.net.Uri;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1829g;
import com.bumptech.glide.load.p126p.C1851r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.y.b */
public class C1877b implements AbstractC1843n<Uri, InputStream> {

    /* renamed from: a */
    private static final Set<String> f7127a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private final AbstractC1843n<C1829g, InputStream> f7128b;

    /* renamed from: com.bumptech.glide.load.p.y.b$a */
    public static class C1878a implements AbstractC1845o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, InputStream> mo7398b(C1851r rVar) {
            return new C1877b(rVar.mo7452d(C1829g.class, InputStream.class));
        }
    }

    public C1877b(AbstractC1843n<C1829g, InputStream> nVar) {
        this.f7128b = nVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<InputStream> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return this.f7128b.mo7393a(new C1829g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return f7127a.contains(uri.getScheme());
    }
}
