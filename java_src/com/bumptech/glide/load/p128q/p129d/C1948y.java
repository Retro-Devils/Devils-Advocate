package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p128q.p129d.C1930m;
import com.bumptech.glide.p144t.C2073d;
import com.bumptech.glide.p144t.C2079h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.y */
public class C1948y implements AbstractC1649k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1930m f7255a;

    /* renamed from: b */
    private final AbstractC1690b f7256b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.d.y$a */
    public static class C1949a implements C1930m.AbstractC1932b {

        /* renamed from: a */
        private final C1945w f7257a;

        /* renamed from: b */
        private final C2073d f7258b;

        C1949a(C1945w wVar, C2073d dVar) {
            this.f7257a = wVar;
            this.f7258b = dVar;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1930m.AbstractC1932b
        /* renamed from: a */
        public void mo7522a(AbstractC1695e eVar, Bitmap bitmap) {
            IOException a = this.f7258b.mo7841a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo7183d(bitmap);
                }
                throw a;
            }
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1930m.AbstractC1932b
        /* renamed from: b */
        public void mo7523b() {
            this.f7257a.mo7537b();
        }
    }

    public C1948y(C1930m mVar, AbstractC1690b bVar) {
        this.f7255a = mVar;
        this.f7256b = bVar;
    }

    /* renamed from: c */
    public AbstractC1794v<Bitmap> mo7088a(InputStream inputStream, int i, int i2, C1647i iVar) {
        C1945w wVar;
        boolean z;
        if (inputStream instanceof C1945w) {
            wVar = (C1945w) inputStream;
            z = false;
        } else {
            wVar = new C1945w(inputStream, this.f7256b);
            z = true;
        }
        C2073d b = C2073d.m9409b(wVar);
        try {
            return this.f7255a.mo7518g(new C2079h(b), i, i2, iVar, new C1949a(wVar, b));
        } finally {
            b.mo7843c();
            if (z) {
                wVar.mo7538c();
            }
        }
    }

    /* renamed from: d */
    public boolean mo7089b(InputStream inputStream, C1647i iVar) {
        return this.f7255a.mo7520p(inputStream);
    }
}
