package com.bumptech.glide.load.p120n.p121p;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C1635f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.p.e */
class C1682e {

    /* renamed from: a */
    private static final C1676a f6695a = new C1676a();

    /* renamed from: b */
    private final C1676a f6696b;

    /* renamed from: c */
    private final AbstractC1681d f6697c;

    /* renamed from: d */
    private final AbstractC1690b f6698d;

    /* renamed from: e */
    private final ContentResolver f6699e;

    /* renamed from: f */
    private final List<ImageHeaderParser> f6700f;

    C1682e(List<ImageHeaderParser> list, C1676a aVar, AbstractC1681d dVar, AbstractC1690b bVar, ContentResolver contentResolver) {
        this.f6696b = aVar;
        this.f6697c = dVar;
        this.f6698d = bVar;
        this.f6699e = contentResolver;
        this.f6700f = list;
    }

    C1682e(List<ImageHeaderParser> list, AbstractC1681d dVar, AbstractC1690b bVar, ContentResolver contentResolver) {
        this(list, f6695a, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m7987b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.n.p.d r2 = r6.f6697c     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            android.database.Cursor r2 = r2.mo7140a(r7)     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001a }
            if (r3 == 0) goto L_0x001c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001a }
            r2.close()
            return r7
        L_0x001a:
            r3 = move-exception
            goto L_0x0026
        L_0x001c:
            if (r2 == 0) goto L_0x0021
            r2.close()
        L_0x0021:
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0049
        L_0x0024:
            r3 = move-exception
            r2 = r1
        L_0x0026:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0041
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r4.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0047 }
            r4.append(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return r1
        L_0x0047:
            r7 = move-exception
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p120n.p121p.C1682e.m7987b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m7988c(File file) {
        return this.f6696b.mo7137a(file) && 0 < this.f6696b.mo7139c(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7141a(Uri uri) {
        InputStream inputStream = null;
        try {
            inputStream = this.f6699e.openInputStream(uri);
            int b = C1635f.m7855b(this.f6700f, inputStream, this.f6698d);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public InputStream mo7142d(Uri uri) {
        String b = m7987b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f6696b.mo7138b(b);
        if (!m7988c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f6699e.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }
}
