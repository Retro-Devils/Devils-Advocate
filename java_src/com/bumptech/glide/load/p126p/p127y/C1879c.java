package com.bumptech.glide.load.p126p.p127y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.p121p.C1677b;
import com.bumptech.glide.load.p120n.p121p.C1678c;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1851r;
import com.bumptech.glide.p143s.C2067d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.c */
public class C1879c implements AbstractC1843n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f7137a;

    /* renamed from: com.bumptech.glide.load.p.y.c$a */
    public static class C1880a implements AbstractC1845o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f7138a;

        public C1880a(Context context) {
            this.f7138a = context;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, InputStream> mo7398b(C1851r rVar) {
            return new C1879c(this.f7138a);
        }
    }

    public C1879c(Context context) {
        this.f7137a = context.getApplicationContext();
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<InputStream> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        if (C1677b.m7974d(i, i2)) {
            return new AbstractC1843n.C1844a<>(new C2067d(uri), C1678c.m7977f(this.f7137a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return C1677b.m7971a(uri);
    }
}
