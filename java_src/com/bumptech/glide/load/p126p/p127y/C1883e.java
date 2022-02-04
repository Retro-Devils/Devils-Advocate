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
    private final Context f7133a;

    /* renamed from: b */
    private final AbstractC1843n<File, DataT> f7134b;

    /* renamed from: c */
    private final AbstractC1843n<Uri, DataT> f7135c;

    /* renamed from: d */
    private final Class<DataT> f7136d;

    /* renamed from: com.bumptech.glide.load.p.y.e$a */
    private static abstract class AbstractC1884a<DataT> implements AbstractC1845o<Uri, DataT> {

        /* renamed from: a */
        private final Context f7137a;

        /* renamed from: b */
        private final Class<DataT> f7138b;

        AbstractC1884a(Context context, Class<DataT> cls) {
            this.f7137a = context;
            this.f7138b = cls;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public final AbstractC1843n<Uri, DataT> mo7398b(C1851r rVar) {
            return new C1883e(this.f7137a, rVar.mo7452d(File.class, this.f7138b), rVar.mo7452d(Uri.class, this.f7138b), this.f7138b);
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
        private static final String[] f7139b = {"_data"};

        /* renamed from: c */
        private final Context f7140c;

        /* renamed from: d */
        private final AbstractC1843n<File, DataT> f7141d;

        /* renamed from: e */
        private final AbstractC1843n<Uri, DataT> f7142e;

        /* renamed from: f */
        private final Uri f7143f;

        /* renamed from: g */
        private final int f7144g;

        /* renamed from: h */
        private final int f7145h;

        /* renamed from: i */
        private final C1647i f7146i;

        /* renamed from: j */
        private final Class<DataT> f7147j;

        /* renamed from: k */
        private volatile boolean f7148k;

        /* renamed from: l */
        private volatile AbstractC1655d<DataT> f7149l;

        C1887d(Context context, AbstractC1843n<File, DataT> nVar, AbstractC1843n<Uri, DataT> nVar2, Uri uri, int i, int i2, C1647i iVar, Class<DataT> cls) {
            this.f7140c = context.getApplicationContext();
            this.f7141d = nVar;
            this.f7142e = nVar2;
            this.f7143f = uri;
            this.f7144g = i;
            this.f7145h = i2;
            this.f7146i = iVar;
            this.f7147j = cls;
        }

        /* renamed from: d */
        private AbstractC1843n.C1844a<DataT> m8609d() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f7141d.mo7393a(m8612h(this.f7143f), this.f7144g, this.f7145h, this.f7146i);
            }
            return this.f7142e.mo7393a(m8611g() ? MediaStore.setRequireOriginal(this.f7143f) : this.f7143f, this.f7144g, this.f7145h, this.f7146i);
        }

        /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: com.bumptech.glide.load.n.d<Data>, com.bumptech.glide.load.n.d<DataT> */
        /* renamed from: f */
        private AbstractC1655d<DataT> m8610f() {
            AbstractC1843n.C1844a<DataT> d = m8609d();
            if (d != null) {
                return (AbstractC1655d<Data>) d.f7083c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m8611g() {
            return this.f7140c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m8612h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f7140c.getContentResolver().query(uri, f7139b, null, null, null);
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
            return this.f7147j;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
            AbstractC1655d<DataT> dVar = this.f7149l;
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
            this.f7148k = true;
            AbstractC1655d<DataT> dVar = this.f7149l;
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
                    aVar.mo7108d(new IllegalArgumentException("Failed to build fetcher for: " + this.f7143f));
                    return;
                }
                this.f7149l = f;
                if (this.f7148k) {
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
        this.f7133a = context.getApplicationContext();
        this.f7134b = nVar;
        this.f7135c = nVar2;
        this.f7136d = cls;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<DataT> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(uri), new C1887d(this.f7133a, this.f7134b, this.f7135c, uri, i, i2, iVar, this.f7136d));
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C1677b.m7972b(uri);
    }
}
