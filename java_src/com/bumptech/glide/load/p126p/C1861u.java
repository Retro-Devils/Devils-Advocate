package com.bumptech.glide.load.p126p;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.u */
public class C1861u<Data> implements AbstractC1843n<String, Data> {

    /* renamed from: a */
    private final AbstractC1843n<Uri, Data> f7121a;

    /* renamed from: com.bumptech.glide.load.p.u$a */
    public static final class C1862a implements AbstractC1845o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<String, AssetFileDescriptor> mo7398b(C1851r rVar) {
            return new C1861u(rVar.mo7452d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.u$b */
    public static class C1863b implements AbstractC1845o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<String, ParcelFileDescriptor> mo7398b(C1851r rVar) {
            return new C1861u(rVar.mo7452d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.u$c */
    public static class C1864c implements AbstractC1845o<String, InputStream> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<String, InputStream> mo7398b(C1851r rVar) {
            return new C1861u(rVar.mo7452d(Uri.class, InputStream.class));
        }
    }

    public C1861u(AbstractC1843n<Uri, Data> nVar) {
        this.f7121a = nVar;
    }

    /* renamed from: e */
    private static Uri m8549e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return m8550f(str);
    }

    /* renamed from: f */
    private static Uri m8550f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(String str, int i, int i2, C1647i iVar) {
        Uri e = m8549e(str);
        if (e == null || !this.f7121a.mo7394b(e)) {
            return null;
        }
        return this.f7121a.mo7393a(e, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7394b(String str) {
        return true;
    }
}
