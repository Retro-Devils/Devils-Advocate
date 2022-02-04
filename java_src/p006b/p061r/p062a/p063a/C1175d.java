package p006b.p061r.p062a.p063a;

/* renamed from: b.r.a.a.d */
public class C1175d {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r1 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r2 = move-exception;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6418a(android.content.Context r1, long r2, android.graphics.Bitmap r4) {
        /*
            android.net.Uri r2 = android.media.tv.TvContract.buildChannelLogoUri(r2)
            r3 = 0
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SQLiteException -> 0x0027, IOException -> 0x0025 }
            java.io.OutputStream r1 = r1.openOutputStream(r2)     // Catch:{ SQLiteException -> 0x0027, IOException -> 0x0025 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x001c }
            r0 = 100
            boolean r3 = r4.compress(r2, r0, r1)     // Catch:{ all -> 0x001c }
            r1.flush()     // Catch:{ all -> 0x001c }
            r1.close()
            goto L_0x002f
        L_0x001c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001e }
        L_0x001e:
            r2 = move-exception
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r2
        L_0x0025:
            r1 = move-exception
            goto L_0x0028
        L_0x0027:
            r1 = move-exception
        L_0x0028:
            java.lang.String r2 = "ChannelLogoUtils"
            java.lang.String r4 = "Failed to store the logo to the system content provider.\n"
            android.util.Log.i(r2, r4, r1)
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p061r.p062a.p063a.C1175d.m6418a(android.content.Context, long, android.graphics.Bitmap):boolean");
    }
}
