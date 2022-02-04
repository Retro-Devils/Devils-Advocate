package com.bumptech.glide.load.p126p;

import android.net.Uri;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.x */
public class C1873x<Data> implements AbstractC1843n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f7122a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private final AbstractC1843n<C1829g, Data> f7123b;

    /* renamed from: com.bumptech.glide.load.p.x$a */
    public static class C1874a implements AbstractC1845o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, InputStream> mo7398b(C1851r rVar) {
            return new C1873x(rVar.mo7452d(C1829g.class, InputStream.class));
        }
    }

    public C1873x(AbstractC1843n<C1829g, Data> nVar) {
        this.f7123b = nVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return this.f7123b.mo7393a(new C1829g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return f7122a.contains(uri.getScheme());
    }
}
