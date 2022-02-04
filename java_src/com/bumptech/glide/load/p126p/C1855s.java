package com.bumptech.glide.load.p126p;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.s */
public class C1855s<Data> implements AbstractC1843n<Integer, Data> {

    /* renamed from: a */
    private final AbstractC1843n<Uri, Data> f7114a;

    /* renamed from: b */
    private final Resources f7115b;

    /* renamed from: com.bumptech.glide.load.p.s$a */
    public static final class C1856a implements AbstractC1845o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f7116a;

        public C1856a(Resources resources) {
            this.f7116a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, AssetFileDescriptor> mo7398b(C1851r rVar) {
            return new C1855s(this.f7116a, rVar.mo7452d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$b */
    public static class C1857b implements AbstractC1845o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f7117a;

        public C1857b(Resources resources) {
            this.f7117a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, ParcelFileDescriptor> mo7398b(C1851r rVar) {
            return new C1855s(this.f7117a, rVar.mo7452d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$c */
    public static class C1858c implements AbstractC1845o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f7118a;

        public C1858c(Resources resources) {
            this.f7118a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, InputStream> mo7398b(C1851r rVar) {
            return new C1855s(this.f7118a, rVar.mo7452d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$d */
    public static class C1859d implements AbstractC1845o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f7119a;

        public C1859d(Resources resources) {
            this.f7119a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, Uri> mo7398b(C1851r rVar) {
            return new C1855s(this.f7119a, C1865v.m8558c());
        }
    }

    public C1855s(Resources resources, AbstractC1843n<Uri, Data> nVar) {
        this.f7115b = resources;
        this.f7114a = nVar;
    }

    /* renamed from: d */
    private Uri m8538d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f7115b.getResourcePackageName(num.intValue()) + '/' + this.f7115b.getResourceTypeName(num.intValue()) + '/' + this.f7115b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(Integer num, int i, int i2, C1647i iVar) {
        Uri d = m8538d(num);
        if (d == null) {
            return null;
        }
        return this.f7114a.mo7393a(d, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean mo7394b(Integer num) {
        return true;
    }
}
