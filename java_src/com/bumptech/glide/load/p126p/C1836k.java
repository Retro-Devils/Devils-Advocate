package com.bumptech.glide.load.p126p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p120n.p121p.C1677b;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.p.k */
public final class C1836k implements AbstractC1843n<Uri, File> {

    /* renamed from: a */
    private final Context f7078a;

    /* renamed from: com.bumptech.glide.load.p.k$a */
    public static final class C1837a implements AbstractC1845o<Uri, File> {

        /* renamed from: a */
        private final Context f7079a;

        public C1837a(Context context) {
            this.f7079a = context;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Uri, File> mo7398b(C1851r rVar) {
            return new C1836k(this.f7079a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.k$b */
    public static class C1838b implements AbstractC1655d<File> {

        /* renamed from: b */
        private static final String[] f7080b = {"_data"};

        /* renamed from: c */
        private final Context f7081c;

        /* renamed from: d */
        private final Uri f7082d;

        C1838b(Context context, Uri uri) {
            this.f7081c = context;
            this.f7082d = uri;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<File> mo7092a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
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
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super File> aVar) {
            Cursor query = this.f7081c.getContentResolver().query(this.f7082d, f7080b, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo7108d(new FileNotFoundException("Failed to find file path for: " + this.f7082d));
                return;
            }
            aVar.mo7109f(new File(str));
        }
    }

    public C1836k(Context context) {
        this.f7078a = context;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<File> mo7393a(Uri uri, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(uri), new C1838b(this.f7078a, uri));
    }

    /* renamed from: d */
    public boolean mo7394b(Uri uri) {
        return C1677b.m7972b(uri);
    }
}
