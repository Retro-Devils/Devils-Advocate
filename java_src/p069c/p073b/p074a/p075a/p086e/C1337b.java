package p069c.p073b.p074a.p075a.p086e;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: c.b.a.a.e.b */
public class C1337b extends AbstractC3031a {
    public static final Parcelable.Creator<C1337b> CREATOR = new C1352o();

    /* renamed from: b */
    private static final String f5594b = C1337b.class.getSimpleName();

    /* renamed from: c */
    private String f5595c;

    /* renamed from: d */
    private DataHolder f5596d;

    /* renamed from: e */
    private ParcelFileDescriptor f5597e;

    /* renamed from: f */
    private long f5598f;

    /* renamed from: g */
    private byte[] f5599g;

    /* renamed from: h */
    private byte[] f5600h;

    /* renamed from: i */
    private File f5601i;

    public C1337b() {
        this(null, null, null, 0, null);
    }

    public C1337b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.f5595c = str;
        this.f5596d = dataHolder;
        this.f5597e = parcelFileDescriptor;
        this.f5598f = j;
        this.f5599g = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.FileOutputStream m6907m() {
        /*
            r5 = this;
            java.io.File r0 = r5.f5601i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0025 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r5.f5597e = r3     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            if (r0 == 0) goto L_0x0020
            r0.delete()
        L_0x0020:
            return r2
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            goto L_0x0030
        L_0x0025:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.delete()
        L_0x002e:
            throw r1
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.delete()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p069c.p073b.p074a.p075a.p086e.C1337b.m6907m():java.io.FileOutputStream");
    }

    /* renamed from: n */
    private static void m6908n(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: h */
    public DataHolder mo6360h() {
        return this.f5596d;
    }

    /* renamed from: i */
    public ParcelFileDescriptor mo6361i() {
        return this.f5597e;
    }

    /* renamed from: j */
    public long mo6362j() {
        return this.f5598f;
    }

    /* renamed from: k */
    public String mo6363k() {
        return this.f5595c;
    }

    /* renamed from: l */
    public byte[] mo6364l() {
        return this.f5599g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f5597e
            r1 = 1
            if (r0 != 0) goto L_0x0031
            byte[] r0 = r3.f5600h
            if (r0 == 0) goto L_0x0031
            java.io.FileOutputStream r0 = r3.m6907m()
            if (r0 == 0) goto L_0x0031
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f5600h     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            int r2 = r2.length     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.writeInt(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            byte[] r2 = r3.f5600h     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.write(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            m6908n(r0)
            r0 = 1
            goto L_0x0032
        L_0x0029:
            r4 = move-exception
            m6908n(r0)
            throw r4
        L_0x002e:
            m6908n(r0)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r5 | r1
        L_0x0036:
            p069c.p073b.p074a.p075a.p086e.C1352o.m6919a(r3, r4, r5)
            r4 = 0
            r3.f5597e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069c.p073b.p074a.p075a.p086e.C1337b.writeToParcel(android.os.Parcel, int):void");
    }
}
