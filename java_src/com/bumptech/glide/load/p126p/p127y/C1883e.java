package com.bumptech.glide.load.p126p.p127y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p120n.p121p.C1677b;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1851r;
import com.bumptech.glide.p143s.C2067d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.e */
public final class C1883e<DataT> implements AbstractC1843n<Uri, DataT> {

    /* renamed from: a */
    private final Context f7141a;

    /* renamed from: b */
    private final AbstractC1843n<File, DataT> f7142b;

    /* renamed from: c */
    private final AbstractC1843n<Uri, DataT> f7143c;

    /* renamed from: d */
    private final Class<DataT> f7144d;

    /* renamed from: com.bumptech.glide.load.p.y.e$a */
    private static abstract class AbstractC1884a<DataT> implements AbstractC1845o<Uri, DataT> {

        /* renamed from: a */
        private final Context f7145a;

        /* renamed from: b */
        private final Class<DataT> f7146b;

        AbstractC1884a(Context context, Class<DataT> cls) {
            this.f7145a = context;
            this.f7146b = cls;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public final AbstractC1843n<Uri, DataT> mo7398b(C1851r rVar) {
            return new C1883e(this.f7145a, rVar.mo7452d(File.class, this.f7146b), rVar.mo7452d(Uri.class, this.f7146b), this.f7146b);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.y.e$b */
    public static final class C1885b extends AbstractC1884a<ParcelFileDescriptor> {
        public C1885b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.y.e$c */
    public static final class C1886c extends AbstractC1884a<InputStream> {
        public C1886c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.y.e$d */
    public static final class C1887d<DataT> implements AbstractC1655d<DataT> {

        /* renamed from: b */
        private static final String[] f7147b = {"_data"};

        /* renamed from: c */
        private final Context f7148c;

        /* renamed from: d */
        private final AbstractC1843n<File, DataT> f7149d;

        /* renamed from: e */
        private final AbstractC1843n<Uri, DataT> f7150e;

        /* renamed from: f */
        private final Uri f7151f;

        /* renamed from: g */
        private final int f7152g;

        /* renamed from: h */
        private final int f7153h;

        /* renamed from: i */
        private final C1647i f7154i;

        /* renamed from: j */
        private final Class<DataT> f7155j;

        /* renamed from: k */
        private volatile boolean f7156k;

        /* renamed from: l */
        private volatile AbstractC1655d<DataT> f7157l;

        C1887d(Context context, AbstractC1843n<File, DataT> nVar, AbstractC1843n<Uri, DataT> nVar2, Uri uri, int i, int i2, C1647i iVar, Class<DataT> cls) {
            this.f7148c = context.getApplicationContext();
            this.f7149d = nVar;
            this.f7150e = nVar2;
            this.f7151f = uri;
            this.f7152g = i;
            this.f7153h = i2;
            this.f7154i = iVar;
            this.f7155j = cls;
        }

        /* renamed from: d */
        private AbstractC1843n.C1844a<DataT> m8609d() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f7149d.mo7393a(m8612h(this.f7151f), this.f7152g, this.f7153h, this.f7154i);
            }
            return this.f7150e.mo7393a(m8611g() ? MediaStore.setRequireOriginal(this.f7151f) : this.f7151f, this.f7152g, this.f7153h, this.f7154i);
        }

        /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: com.bumptech.glide.load.n.d<Data>, com.bumptech.glide.load.n.d<DataT> */
        /* renamed from: f */
        private AbstractC1655d<DataT> m8610f() {
            AbstractC1843n.C1844a<DataT> d = m8609d();
            if (d != null) {
                return (AbstractC1655d<Data>) d.f7091c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m8611g() {
            return this.f7148c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m8612h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f7148c.getContentResolver().query(uri, f7147b, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<DataT> mo7092a() {
            return this.f7155j;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
            AbstractC1655d<DataT> dVar = this.f7157l;
            if (dVar != null) {
                dVar.mo7097b();
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: c */
        public EnumC1630a mo7098c() {
            return EnumC1630a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        public void cancel() {
            this.f7156k = true;
            AbstractC1655d<DataT> dVar = this.f7157l;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: e */
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super DataT> aVar) {
            try {
                AbstractC1655d<DataT> f = m8610f();
                if (f == null) {
                    aVar.mo7108d(new IllegalArgumentException("Failed to build fetcher for: " + this.f7151f));
                    return;
                }
                this.f7157l = f;
                if (this.f7156k) {
                    cancel();
                } else {
                    f.mo7101e(gVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo7108d(e);
            }
        }
    }

    C1883e(Context context, AbstractC1843n<File, DataT> nVar, AbstractC1843n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f7141a = context.getApplicationContext();
        this.f7142b = nVar;
        this.f7143c = nVar2;
        this.f7144d = cls;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<DataT> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(uri), new C1887d(this.f7141a, this.f7142b, this.f7143c, uri, i, i2, iVar, this.f7144d));
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C1677b.m7972b(uri);
    }
}
