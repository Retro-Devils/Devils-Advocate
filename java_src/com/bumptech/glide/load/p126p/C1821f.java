package com.bumptech.glide.load.p126p;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.f */
public class C1821f<Data> implements AbstractC1843n<File, Data> {

    /* renamed from: a */
    private final AbstractC1826d<Data> f7056a;

    /* renamed from: com.bumptech.glide.load.p.f$a */
    public static class C1822a<Data> implements AbstractC1845o<File, Data> {

        /* renamed from: a */
        private final AbstractC1826d<Data> f7057a;

        public C1822a(AbstractC1826d<Data> dVar) {
            this.f7057a = dVar;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public final AbstractC1843n<File, Data> mo7398b(C1851r rVar) {
            return new C1821f(this.f7057a);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$b */
    public static class C1823b extends C1822a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.p.f$b$a */
        class C1824a implements AbstractC1826d<ParcelFileDescriptor> {
            C1824a() {
            }

            @Override // com.bumptech.glide.load.p126p.C1821f.AbstractC1826d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo7415a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo7416b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo7417c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C1823b() {
            super(new C1824a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.f$c */
    public static final class C1825c<Data> implements AbstractC1655d<Data> {

        /* renamed from: b */
        private final File f7058b;

        /* renamed from: c */
        private final AbstractC1826d<Data> f7059c;

        /* renamed from: d */
        private Data f7060d;

        C1825c(File file, AbstractC1826d<Data> dVar) {
            this.f7058b = file;
            this.f7059c = dVar;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<Data> mo7092a() {
            return this.f7059c.mo7415a();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
            Data data = this.f7060d;
            if (data != null) {
                try {
                    this.f7059c.mo7416b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: c */
        public EnumC1630a mo7098c() {
            return EnumC1630a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: e */
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super Data> aVar) {
            try {
                Data c = this.f7059c.mo7417c(this.f7058b);
                this.f7060d = c;
                aVar.mo7109f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo7108d(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$d */
    public interface AbstractC1826d<Data> {
        /* renamed from: a */
        Class<Data> mo7415a();

        /* renamed from: b */
        void mo7416b(Data data);

        /* renamed from: c */
        Data mo7417c(File file);
    }

    /* renamed from: com.bumptech.glide.load.p.f$e */
    public static class C1827e extends C1822a<InputStream> {

        /* renamed from: com.bumptech.glide.load.p.f$e$a */
        class C1828a implements AbstractC1826d<InputStream> {
            C1828a() {
            }

            @Override // com.bumptech.glide.load.p126p.C1821f.AbstractC1826d
            /* renamed from: a */
            public Class<InputStream> mo7415a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo7416b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo7417c(File file) {
                return new FileInputStream(file);
            }
        }

        public C1827e() {
            super(new C1828a());
        }
    }

    public C1821f(AbstractC1826d<Data> dVar) {
        this.f7056a = dVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(File file, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(file), new C1825c(file, this.f7056a));
    }

    /* renamed from: d */
    public boolean mo7394b(File file) {
        return true;
    }
}
