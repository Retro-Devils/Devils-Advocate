package com.bumptech.glide.load.p126p;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p120n.C1663h;
import com.bumptech.glide.load.p120n.C1674n;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.a */
public class C1801a<Data> implements AbstractC1843n<Uri, Data> {

    /* renamed from: a */
    private static final int f7031a = 22;

    /* renamed from: b */
    private final AssetManager f7032b;

    /* renamed from: c */
    private final AbstractC1802a<Data> f7033c;

    /* renamed from: com.bumptech.glide.load.p.a$a */
    public interface AbstractC1802a<Data> {
        /* renamed from: a */
        AbstractC1655d<Data> mo7397a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.p.a$b */
    public static class C1803b implements AbstractC1845o<Uri, ParcelFileDescriptor>, AbstractC1802a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f7034a;

        public C1803b(AssetManager assetManager) {
            this.f7034a = assetManager;
        }

        @Override // com.bumptech.glide.load.p126p.C1801a.AbstractC1802a
        /* renamed from: a */
        public AbstractC1655d<ParcelFileDescriptor> mo7397a(AssetManager assetManager, String str) {
            return new C1663h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, ParcelFileDescriptor> mo7398b(C1851r rVar) {
            return new C1801a(this.f7034a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.a$c */
    public static class C1804c implements AbstractC1845o<Uri, InputStream>, AbstractC1802a<InputStream> {

        /* renamed from: a */
        private final AssetManager f7035a;

        public C1804c(AssetManager assetManager) {
            this.f7035a = assetManager;
        }

        @Override // com.bumptech.glide.load.p126p.C1801a.AbstractC1802a
        /* renamed from: a */
        public AbstractC1655d<InputStream> mo7397a(AssetManager assetManager, String str) {
            return new C1674n(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, InputStream> mo7398b(C1851r rVar) {
            return new C1801a(this.f7035a, this);
        }
    }

    public C1801a(AssetManager assetManager, AbstractC1802a<Data> aVar) {
        this.f7032b = assetManager;
        this.f7033c = aVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(uri), this.f7033c.mo7397a(this.f7032b, uri.toString().substring(f7031a)));
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
