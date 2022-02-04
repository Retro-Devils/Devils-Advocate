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
    private final AbstractC1843n<Uri, Data> f7106a;

    /* renamed from: b */
    private final Resources f7107b;

    /* renamed from: com.bumptech.glide.load.p.s$a */
    public static final class C1856a implements AbstractC1845o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f7108a;

        public C1856a(Resources resources) {
            this.f7108a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, AssetFileDescriptor> mo7398b(C1851r rVar) {
            return new C1855s(this.f7108a, rVar.mo7452d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$b */
    public static class C1857b implements AbstractC1845o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f7109a;

        public C1857b(Resources resources) {
            this.f7109a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, ParcelFileDescriptor> mo7398b(C1851r rVar) {
            return new C1855s(this.f7109a, rVar.mo7452d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$c */
    public static class C1858c implements AbstractC1845o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f7110a;

        public C1858c(Resources resources) {
            this.f7110a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, InputStream> mo7398b(C1851r rVar) {
            return new C1855s(this.f7110a, rVar.mo7452d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$d */
    public static class C1859d implements AbstractC1845o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f7111a;

        public C1859d(Resources resources) {
            this.f7111a = resources;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Integer, Uri> mo7398b(C1851r rVar) {
            return new C1855s(this.f7111a, C1865v.m8558c());
        }
    }

    public C1855s(Resources resources, AbstractC1843n<Uri, Data> nVar) {
        this.f7107b = resources;
        this.f7106a = nVar;
    }

    /* renamed from: d */
    private Uri m8538d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f7107b.getResourcePackageName(num.intValue()) + '/' + this.f7107b.getResourceTypeName(num.intValue()) + '/' + this.f7107b.getResourceEntryName(num.intValue()));
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
        return this.f7106a.mo7393a(d, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean mo7394b(Integer num) {
        return true;
    }
}
