package com.bumptech.glide.load.p126p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p120n.C1652a;
import com.bumptech.glide.load.p120n.C1664i;
import com.bumptech.glide.load.p120n.C1675o;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.w */
public class C1868w<Data> implements AbstractC1843n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f7125a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: b */
    private final AbstractC1871c<Data> f7126b;

    /* renamed from: com.bumptech.glide.load.p.w$a */
    public static final class C1869a implements AbstractC1845o<Uri, AssetFileDescriptor>, AbstractC1871c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f7127a;

        public C1869a(ContentResolver contentResolver) {
            this.f7127a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p126p.C1868w.AbstractC1871c
        /* renamed from: a */
        public AbstractC1655d<AssetFileDescriptor> mo7465a(Uri uri) {
            return new C1652a(this.f7127a, uri);
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, AssetFileDescriptor> mo7398b(C1851r rVar) {
            return new C1868w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.w$b */
    public static class C1870b implements AbstractC1845o<Uri, ParcelFileDescriptor>, AbstractC1871c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f7128a;

        public C1870b(ContentResolver contentResolver) {
            this.f7128a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p126p.C1868w.AbstractC1871c
        /* renamed from: a */
        public AbstractC1655d<ParcelFileDescriptor> mo7465a(Uri uri) {
            return new C1664i(this.f7128a, uri);
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, ParcelFileDescriptor> mo7398b(C1851r rVar) {
            return new C1868w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.w$c */
    public interface AbstractC1871c<Data> {
        /* renamed from: a */
        AbstractC1655d<Data> mo7465a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.p.w$d */
    public static class C1872d implements AbstractC1845o<Uri, InputStream>, AbstractC1871c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f7129a;

        public C1872d(ContentResolver contentResolver) {
            this.f7129a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p126p.C1868w.AbstractC1871c
        /* renamed from: a */
        public AbstractC1655d<InputStream> mo7465a(Uri uri) {
            return new C1675o(this.f7129a, uri);
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, InputStream> mo7398b(C1851r rVar) {
            return new C1868w(this);
        }
    }

    public C1868w(AbstractC1871c<Data> cVar) {
        this.f7126b = cVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(uri), this.f7126b.mo7465a(uri));
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return f7125a.contains(uri.getScheme());
    }
}
