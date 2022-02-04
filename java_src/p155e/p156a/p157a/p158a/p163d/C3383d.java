package p155e.p156a.p157a.p158a.p163d;

import java.io.InputStream;

/* renamed from: e.a.a.a.d.d */
public final class C3383d {

    /* renamed from: a */
    private static final byte[] f11426a = new byte[4096];

    /* renamed from: a */
    public static int m14045a(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i2 < 0 || i < 0 || i2 + i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (i3 != i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    /* renamed from: b */
    public static long m14046b(InputStream inputStream, long j) {
        int a;
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip == 0) {
                break;
            }
            j2 -= skip;
        }
        while (j2 > 0 && (a = m14045a(inputStream, f11426a, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= (long) a;
        }
        return j - j2;
    }
}
