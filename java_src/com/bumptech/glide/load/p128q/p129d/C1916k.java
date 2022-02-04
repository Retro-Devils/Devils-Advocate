package com.bumptech.glide.load.p128q.p129d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.p144t.C2081j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.q.d.k */
public final class C1916k implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f7195a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f7196b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.q.d.k$a */
    private static final class C1917a implements AbstractC1919c {

        /* renamed from: a */
        private final ByteBuffer f7197a;

        C1917a(ByteBuffer byteBuffer) {
            this.f7197a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: a */
        public int mo7506a() {
            return (mo7509d() << 8) | mo7509d();
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: b */
        public long mo7507b(long j) {
            int min = (int) Math.min((long) this.f7197a.remaining(), j);
            ByteBuffer byteBuffer = this.f7197a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: c */
        public int mo7508c(byte[] bArr, int i) {
            int min = Math.min(i, this.f7197a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7197a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: d */
        public short mo7509d() {
            if (this.f7197a.remaining() >= 1) {
                return (short) (this.f7197a.get() & 255);
            }
            throw new AbstractC1919c.C1920a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.q.d.k$b */
    public static final class C1918b {

        /* renamed from: a */
        private final ByteBuffer f7198a;

        C1918b(byte[] bArr, int i) {
            this.f7198a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m8709c(int i, int i2) {
            return this.f7198a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo7510a(int i) {
            if (m8709c(i, 2)) {
                return this.f7198a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7511b(int i) {
            if (m8709c(i, 4)) {
                return this.f7198a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo7512d() {
            return this.f7198a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo7513e(ByteOrder byteOrder) {
            this.f7198a.order(byteOrder);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.q.d.k$c */
    public interface AbstractC1919c {

        /* renamed from: com.bumptech.glide.load.q.d.k$c$a */
        public static final class C1920a extends IOException {
            C1920a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo7506a();

        /* renamed from: b */
        long mo7507b(long j);

        /* renamed from: c */
        int mo7508c(byte[] bArr, int i);

        /* renamed from: d */
        short mo7509d();
    }

    /* renamed from: com.bumptech.glide.load.q.d.k$d */
    private static final class C1921d implements AbstractC1919c {

        /* renamed from: a */
        private final InputStream f7199a;

        C1921d(InputStream inputStream) {
            this.f7199a = inputStream;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: a */
        public int mo7506a() {
            return (mo7509d() << 8) | mo7509d();
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: b */
        public long mo7507b(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f7199a.skip(j2);
                if (skip <= 0) {
                    if (this.f7199a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: c */
        public int mo7508c(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f7199a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new AbstractC1919c.C1920a();
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1916k.AbstractC1919c
        /* renamed from: d */
        public short mo7509d() {
            int read = this.f7199a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new AbstractC1919c.C1920a();
        }
    }

    /* renamed from: d */
    private static int m8694d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m8695e(AbstractC1919c cVar, AbstractC1690b bVar) {
        try {
            int a = cVar.mo7506a();
            if (!m8697g(a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a);
                }
                return -1;
            }
            int i = m8699i(cVar);
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.mo7162e(i, byte[].class);
            try {
                return m8701k(cVar, bArr, i);
            } finally {
                bVar.mo7161d(bArr);
            }
        } catch (AbstractC1919c.C1920a unused) {
            return -1;
        }
    }

    /* renamed from: f */
    private ImageHeaderParser.ImageType m8696f(AbstractC1919c cVar) {
        try {
            int a = cVar.mo7506a();
            if (a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int d = (a << 8) | cVar.mo7509d();
            if (d == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int d2 = (d << 8) | cVar.mo7509d();
            if (d2 == -1991225785) {
                cVar.mo7507b(21);
                try {
                    return cVar.mo7509d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (AbstractC1919c.C1920a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (d2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.mo7507b(4);
                if (((cVar.mo7506a() << 16) | cVar.mo7506a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a2 = (cVar.mo7506a() << 16) | cVar.mo7506a();
                if ((a2 & -256) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = a2 & 255;
                if (i == 88) {
                    cVar.mo7507b(4);
                    return (cVar.mo7509d() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    cVar.mo7507b(4);
                    return (cVar.mo7509d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (AbstractC1919c.C1920a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: g */
    private static boolean m8697g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m8698h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f7195a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f7195a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m8699i(AbstractC1919c cVar) {
        short d;
        int a;
        long j;
        long b;
        do {
            short d2 = cVar.mo7509d();
            if (d2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) d2));
                }
                return -1;
            }
            d = cVar.mo7509d();
            if (d == 218) {
                return -1;
            }
            if (d == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = cVar.mo7506a() - 2;
            if (d == 225) {
                return a;
            }
            j = (long) a;
            b = cVar.mo7507b(j);
        } while (b == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) d) + ", wanted to skip: " + a + ", but actually skipped: " + b);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m8700j(C1918b bVar) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb;
        String str2;
        short a = bVar.mo7510a(6);
        if (a != 18761) {
            if (a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.mo7513e(byteOrder);
        int b = bVar.mo7511b(10) + 6;
        short a2 = bVar.mo7510a(b);
        for (int i = 0; i < a2; i++) {
            int d = m8694d(b, i);
            short a3 = bVar.mo7510a(d);
            if (a3 == 274) {
                short a4 = bVar.mo7510a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo7511b(d + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) a3) + " formatCode=" + ((int) a4) + " componentCount=" + b2);
                        }
                        int i2 = b2 + f7196b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo7512d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) a3);
                                    Log.d("DfltImageHeaderParser", str);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo7512d()) {
                                return bVar.mo7510a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append((int) a3);
                                    str = sb.toString();
                                    Log.d("DfltImageHeaderParser", str);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        str = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", str);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str2 = "Got invalid format code = ";
                }
                sb.append(str2);
                sb.append((int) a4);
                str = sb.toString();
                Log.d("DfltImageHeaderParser", str);
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m8701k(AbstractC1919c cVar, byte[] bArr, int i) {
        int c = cVar.mo7508c(bArr, i);
        if (c != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + c);
            }
            return -1;
        } else if (m8698h(bArr, i)) {
            return m8700j(new C1918b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7068a(ByteBuffer byteBuffer) {
        return m8696f(new C1917a((ByteBuffer) C2081j.m9432d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public int mo7069b(InputStream inputStream, AbstractC1690b bVar) {
        return m8695e(new C1921d((InputStream) C2081j.m9432d(inputStream)), (AbstractC1690b) C2081j.m9432d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7070c(InputStream inputStream) {
        return m8696f(new C1921d((InputStream) C2081j.m9432d(inputStream)));
    }
}
