package p006b.p048k.p049a;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: b.k.a.a */
public class C1060a {

    /* renamed from: A */
    private static final HashMap<Integer, C1063c>[] f4850A;

    /* renamed from: B */
    private static final HashMap<String, C1063c>[] f4851B;

    /* renamed from: C */
    private static final HashSet<String> f4852C = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: D */
    private static final HashMap<Integer, Integer> f4853D = new HashMap<>();

    /* renamed from: E */
    static final Charset f4854E;

    /* renamed from: F */
    static final byte[] f4855F;

    /* renamed from: G */
    private static final Pattern f4856G = Pattern.compile(".*[1-9].*");

    /* renamed from: H */
    private static final Pattern f4857H = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: a */
    private static final List<Integer> f4858a = Arrays.asList(1, 6, 3, 8);

    /* renamed from: b */
    private static final List<Integer> f4859b = Arrays.asList(2, 7, 4, 5);

    /* renamed from: c */
    public static final int[] f4860c = {8, 8, 8};

    /* renamed from: d */
    public static final int[] f4861d = {4};

    /* renamed from: e */
    public static final int[] f4862e = {8};

    /* renamed from: f */
    static final byte[] f4863f = {-1, -40, -1};

    /* renamed from: g */
    private static final byte[] f4864g = {79, 76, 89, 77, 80, 0};

    /* renamed from: h */
    private static final byte[] f4865h = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: i */
    private static SimpleDateFormat f4866i;

    /* renamed from: j */
    static final String[] f4867j = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: k */
    static final int[] f4868k = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: l */
    static final byte[] f4869l = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: m */
    private static final C1063c[] f4870m;

    /* renamed from: n */
    private static final C1063c[] f4871n;

    /* renamed from: o */
    private static final C1063c[] f4872o;

    /* renamed from: p */
    private static final C1063c[] f4873p;

    /* renamed from: q */
    private static final C1063c[] f4874q;

    /* renamed from: r */
    private static final C1063c f4875r = new C1063c("StripOffsets", 273, 3);

    /* renamed from: s */
    private static final C1063c[] f4876s;

    /* renamed from: t */
    private static final C1063c[] f4877t;

    /* renamed from: u */
    private static final C1063c[] f4878u;

    /* renamed from: v */
    private static final C1063c[] f4879v;

    /* renamed from: w */
    static final C1063c[][] f4880w;

    /* renamed from: x */
    private static final C1063c[] f4881x = {new C1063c("SubIFDPointer", 330, 4), new C1063c("ExifIFDPointer", 34665, 4), new C1063c("GPSInfoIFDPointer", 34853, 4), new C1063c("InteroperabilityIFDPointer", 40965, 4), new C1063c("CameraSettingsIFDPointer", 8224, 1), new C1063c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: y */
    private static final C1063c f4882y = new C1063c("JPEGInterchangeFormat", 513, 4);

    /* renamed from: z */
    private static final C1063c f4883z = new C1063c("JPEGInterchangeFormatLength", 514, 4);

    /* renamed from: I */
    private final String f4884I;

    /* renamed from: J */
    private final AssetManager.AssetInputStream f4885J;

    /* renamed from: K */
    private int f4886K;

    /* renamed from: L */
    private final HashMap<String, C1062b>[] f4887L;

    /* renamed from: M */
    private Set<Integer> f4888M;

    /* renamed from: N */
    private ByteOrder f4889N = ByteOrder.BIG_ENDIAN;

    /* renamed from: O */
    private boolean f4890O;

    /* renamed from: P */
    private int f4891P;

    /* renamed from: Q */
    private int f4892Q;

    /* renamed from: R */
    private byte[] f4893R;

    /* renamed from: S */
    private int f4894S;

    /* renamed from: T */
    private int f4895T;

    /* renamed from: U */
    private int f4896U;

    /* renamed from: V */
    private int f4897V;

    /* renamed from: W */
    private int f4898W;

    /* renamed from: X */
    private int f4899X;

    /* renamed from: Y */
    private boolean f4900Y;

    /* access modifiers changed from: private */
    /* renamed from: b.k.a.a$a */
    public static class C1061a extends InputStream implements DataInput {

        /* renamed from: b */
        private static final ByteOrder f4901b = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: c */
        private static final ByteOrder f4902c = ByteOrder.BIG_ENDIAN;

        /* renamed from: d */
        private DataInputStream f4903d;

        /* renamed from: e */
        private ByteOrder f4904e;

        /* renamed from: f */
        final int f4905f;

        /* renamed from: g */
        int f4906g;

        public C1061a(InputStream inputStream) {
            this.f4904e = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4903d = dataInputStream;
            int available = dataInputStream.available();
            this.f4905f = available;
            this.f4906g = 0;
            this.f4903d.mark(available);
        }

        public C1061a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public int mo5681a() {
            return this.f4906g;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4903d.available();
        }

        /* renamed from: b */
        public long mo5683b() {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: c */
        public void mo5684c(long j) {
            int i = this.f4906g;
            if (((long) i) > j) {
                this.f4906g = 0;
                this.f4903d.reset();
                this.f4903d.mark(this.f4905f);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: d */
        public void mo5685d(ByteOrder byteOrder) {
            this.f4904e = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f4906g++;
            return this.f4903d.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.f4903d.read(bArr, i, i2);
            this.f4906g += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f4906g++;
            return this.f4903d.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i = this.f4906g + 1;
            this.f4906g = i;
            if (i <= this.f4905f) {
                int read = this.f4903d.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f4906g += 2;
            return this.f4903d.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f4906g + bArr.length;
            this.f4906g = length;
            if (length > this.f4905f) {
                throw new EOFException();
            } else if (this.f4903d.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.f4906g + i2;
            this.f4906g = i3;
            if (i3 > this.f4905f) {
                throw new EOFException();
            } else if (this.f4903d.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i = this.f4906g + 4;
            this.f4906g = i;
            if (i <= this.f4905f) {
                int read = this.f4903d.read();
                int read2 = this.f4903d.read();
                int read3 = this.f4903d.read();
                int read4 = this.f4903d.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f4904e;
                    if (byteOrder == f4901b) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f4902c) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f4904e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i = this.f4906g + 8;
            this.f4906g = i;
            if (i <= this.f4905f) {
                int read = this.f4903d.read();
                int read2 = this.f4903d.read();
                int read3 = this.f4903d.read();
                int read4 = this.f4903d.read();
                int read5 = this.f4903d.read();
                int read6 = this.f4903d.read();
                int read7 = this.f4903d.read();
                int read8 = this.f4903d.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f4904e;
                    if (byteOrder == f4901b) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f4902c) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f4904e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i = this.f4906g + 2;
            this.f4906g = i;
            if (i <= this.f4905f) {
                int read = this.f4903d.read();
                int read2 = this.f4903d.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f4904e;
                    if (byteOrder == f4901b) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f4902c) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f4904e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f4906g += 2;
            return this.f4903d.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f4906g++;
            return this.f4903d.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i = this.f4906g + 2;
            this.f4906g = i;
            if (i <= this.f4905f) {
                int read = this.f4903d.read();
                int read2 = this.f4903d.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f4904e;
                    if (byteOrder == f4901b) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f4902c) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f4904e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int min = Math.min(i, this.f4905f - this.f4906g);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f4903d.skipBytes(min - i2);
            }
            this.f4906g += i2;
            return i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.k.a.a$b */
    public static class C1062b {

        /* renamed from: a */
        public final int f4907a;

        /* renamed from: b */
        public final int f4908b;

        /* renamed from: c */
        public final byte[] f4909c;

        C1062b(int i, int i2, byte[] bArr) {
            this.f4907a = i;
            this.f4908b = i2;
            this.f4909c = bArr;
        }

        /* renamed from: a */
        public static C1062b m6099a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C1060a.f4854E);
            return new C1062b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C1062b m6100b(long j, ByteOrder byteOrder) {
            return m6101c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C1062b m6101c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1060a.f4868k[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C1062b(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C1062b m6102d(C1064d dVar, ByteOrder byteOrder) {
            return m6103e(new C1064d[]{dVar}, byteOrder);
        }

        /* renamed from: e */
        public static C1062b m6103e(C1064d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1060a.f4868k[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C1064d dVar : dVarArr) {
                wrap.putInt((int) dVar.f4914a);
                wrap.putInt((int) dVar.f4915b);
            }
            return new C1062b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C1062b m6104f(int i, ByteOrder byteOrder) {
            return m6105g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C1062b m6105g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1060a.f4868k[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C1062b(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo5703h(ByteOrder byteOrder) {
            Object k = mo5706k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C1064d[]) {
                    C1064d[] dVarArr = (C1064d[]) k;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo5709a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo5704i(ByteOrder byteOrder) {
            Object k = mo5706k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo5705j(ByteOrder byteOrder) {
            Object k = mo5706k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C1064d[])) {
                return null;
            } else {
                C1064d[] dVarArr = (C1064d[]) k;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f4914a);
                    sb.append('/');
                    sb.append(dVarArr[i].f4915b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0196 A[SYNTHETIC, Splitter:B:138:0x0196] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01a3 A[SYNTHETIC, Splitter:B:146:0x01a3] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo5706k(java.nio.ByteOrder r11) {
            /*
            // Method dump skipped, instructions count: 458
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p048k.p049a.C1060a.C1062b.mo5706k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C1060a.f4867j[this.f4907a] + ", data length:" + this.f4909c.length + ")";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.k.a.a$c */
    public static class C1063c {

        /* renamed from: a */
        public final int f4910a;

        /* renamed from: b */
        public final String f4911b;

        /* renamed from: c */
        public final int f4912c;

        /* renamed from: d */
        public final int f4913d;

        C1063c(String str, int i, int i2) {
            this.f4911b = str;
            this.f4910a = i;
            this.f4912c = i2;
            this.f4913d = -1;
        }

        C1063c(String str, int i, int i2, int i3) {
            this.f4911b = str;
            this.f4910a = i;
            this.f4912c = i2;
            this.f4913d = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5708a(int i) {
            int i2;
            int i3 = this.f4912c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f4913d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.k.a.a$d */
    public static class C1064d {

        /* renamed from: a */
        public final long f4914a;

        /* renamed from: b */
        public final long f4915b;

        C1064d(long j, long j2) {
            if (j2 == 0) {
                this.f4914a = 0;
                this.f4915b = 1;
                return;
            }
            this.f4914a = j;
            this.f4915b = j2;
        }

        /* renamed from: a */
        public double mo5709a() {
            double d = (double) this.f4914a;
            double d2 = (double) this.f4915b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.f4914a + "/" + this.f4915b;
        }
    }

    static {
        C1063c[] cVarArr = {new C1063c("NewSubfileType", 254, 4), new C1063c("SubfileType", 255, 4), new C1063c("ImageWidth", 256, 3, 4), new C1063c("ImageLength", 257, 3, 4), new C1063c("BitsPerSample", 258, 3), new C1063c("Compression", 259, 3), new C1063c("PhotometricInterpretation", 262, 3), new C1063c("ImageDescription", 270, 2), new C1063c("Make", 271, 2), new C1063c("Model", 272, 2), new C1063c("StripOffsets", 273, 3, 4), new C1063c("Orientation", 274, 3), new C1063c("SamplesPerPixel", 277, 3), new C1063c("RowsPerStrip", 278, 3, 4), new C1063c("StripByteCounts", 279, 3, 4), new C1063c("XResolution", 282, 5), new C1063c("YResolution", 283, 5), new C1063c("PlanarConfiguration", 284, 3), new C1063c("ResolutionUnit", 296, 3), new C1063c("TransferFunction", 301, 3), new C1063c("Software", 305, 2), new C1063c("DateTime", 306, 2), new C1063c("Artist", 315, 2), new C1063c("WhitePoint", 318, 5), new C1063c("PrimaryChromaticities", 319, 5), new C1063c("SubIFDPointer", 330, 4), new C1063c("JPEGInterchangeFormat", 513, 4), new C1063c("JPEGInterchangeFormatLength", 514, 4), new C1063c("YCbCrCoefficients", 529, 5), new C1063c("YCbCrSubSampling", 530, 3), new C1063c("YCbCrPositioning", 531, 3), new C1063c("ReferenceBlackWhite", 532, 5), new C1063c("Copyright", 33432, 2), new C1063c("ExifIFDPointer", 34665, 4), new C1063c("GPSInfoIFDPointer", 34853, 4), new C1063c("SensorTopBorder", 4, 4), new C1063c("SensorLeftBorder", 5, 4), new C1063c("SensorBottomBorder", 6, 4), new C1063c("SensorRightBorder", 7, 4), new C1063c("ISO", 23, 3), new C1063c("JpgFromRaw", 46, 7)};
        f4870m = cVarArr;
        C1063c[] cVarArr2 = {new C1063c("ExposureTime", 33434, 5), new C1063c("FNumber", 33437, 5), new C1063c("ExposureProgram", 34850, 3), new C1063c("SpectralSensitivity", 34852, 2), new C1063c("PhotographicSensitivity", 34855, 3), new C1063c("OECF", 34856, 7), new C1063c("ExifVersion", 36864, 2), new C1063c("DateTimeOriginal", 36867, 2), new C1063c("DateTimeDigitized", 36868, 2), new C1063c("ComponentsConfiguration", 37121, 7), new C1063c("CompressedBitsPerPixel", 37122, 5), new C1063c("ShutterSpeedValue", 37377, 10), new C1063c("ApertureValue", 37378, 5), new C1063c("BrightnessValue", 37379, 10), new C1063c("ExposureBiasValue", 37380, 10), new C1063c("MaxApertureValue", 37381, 5), new C1063c("SubjectDistance", 37382, 5), new C1063c("MeteringMode", 37383, 3), new C1063c("LightSource", 37384, 3), new C1063c("Flash", 37385, 3), new C1063c("FocalLength", 37386, 5), new C1063c("SubjectArea", 37396, 3), new C1063c("MakerNote", 37500, 7), new C1063c("UserComment", 37510, 7), new C1063c("SubSecTime", 37520, 2), new C1063c("SubSecTimeOriginal", 37521, 2), new C1063c("SubSecTimeDigitized", 37522, 2), new C1063c("FlashpixVersion", 40960, 7), new C1063c("ColorSpace", 40961, 3), new C1063c("PixelXDimension", 40962, 3, 4), new C1063c("PixelYDimension", 40963, 3, 4), new C1063c("RelatedSoundFile", 40964, 2), new C1063c("InteroperabilityIFDPointer", 40965, 4), new C1063c("FlashEnergy", 41483, 5), new C1063c("SpatialFrequencyResponse", 41484, 7), new C1063c("FocalPlaneXResolution", 41486, 5), new C1063c("FocalPlaneYResolution", 41487, 5), new C1063c("FocalPlaneResolutionUnit", 41488, 3), new C1063c("SubjectLocation", 41492, 3), new C1063c("ExposureIndex", 41493, 5), new C1063c("SensingMethod", 41495, 3), new C1063c("FileSource", 41728, 7), new C1063c("SceneType", 41729, 7), new C1063c("CFAPattern", 41730, 7), new C1063c("CustomRendered", 41985, 3), new C1063c("ExposureMode", 41986, 3), new C1063c("WhiteBalance", 41987, 3), new C1063c("DigitalZoomRatio", 41988, 5), new C1063c("FocalLengthIn35mmFilm", 41989, 3), new C1063c("SceneCaptureType", 41990, 3), new C1063c("GainControl", 41991, 3), new C1063c("Contrast", 41992, 3), new C1063c("Saturation", 41993, 3), new C1063c("Sharpness", 41994, 3), new C1063c("DeviceSettingDescription", 41995, 7), new C1063c("SubjectDistanceRange", 41996, 3), new C1063c("ImageUniqueID", 42016, 2), new C1063c("DNGVersion", 50706, 1), new C1063c("DefaultCropSize", 50720, 3, 4)};
        f4871n = cVarArr2;
        C1063c[] cVarArr3 = {new C1063c("GPSVersionID", 0, 1), new C1063c("GPSLatitudeRef", 1, 2), new C1063c("GPSLatitude", 2, 5), new C1063c("GPSLongitudeRef", 3, 2), new C1063c("GPSLongitude", 4, 5), new C1063c("GPSAltitudeRef", 5, 1), new C1063c("GPSAltitude", 6, 5), new C1063c("GPSTimeStamp", 7, 5), new C1063c("GPSSatellites", 8, 2), new C1063c("GPSStatus", 9, 2), new C1063c("GPSMeasureMode", 10, 2), new C1063c("GPSDOP", 11, 5), new C1063c("GPSSpeedRef", 12, 2), new C1063c("GPSSpeed", 13, 5), new C1063c("GPSTrackRef", 14, 2), new C1063c("GPSTrack", 15, 5), new C1063c("GPSImgDirectionRef", 16, 2), new C1063c("GPSImgDirection", 17, 5), new C1063c("GPSMapDatum", 18, 2), new C1063c("GPSDestLatitudeRef", 19, 2), new C1063c("GPSDestLatitude", 20, 5), new C1063c("GPSDestLongitudeRef", 21, 2), new C1063c("GPSDestLongitude", 22, 5), new C1063c("GPSDestBearingRef", 23, 2), new C1063c("GPSDestBearing", 24, 5), new C1063c("GPSDestDistanceRef", 25, 2), new C1063c("GPSDestDistance", 26, 5), new C1063c("GPSProcessingMethod", 27, 7), new C1063c("GPSAreaInformation", 28, 7), new C1063c("GPSDateStamp", 29, 2), new C1063c("GPSDifferential", 30, 3)};
        f4872o = cVarArr3;
        C1063c[] cVarArr4 = {new C1063c("InteroperabilityIndex", 1, 2)};
        f4873p = cVarArr4;
        C1063c[] cVarArr5 = {new C1063c("NewSubfileType", 254, 4), new C1063c("SubfileType", 255, 4), new C1063c("ThumbnailImageWidth", 256, 3, 4), new C1063c("ThumbnailImageLength", 257, 3, 4), new C1063c("BitsPerSample", 258, 3), new C1063c("Compression", 259, 3), new C1063c("PhotometricInterpretation", 262, 3), new C1063c("ImageDescription", 270, 2), new C1063c("Make", 271, 2), new C1063c("Model", 272, 2), new C1063c("StripOffsets", 273, 3, 4), new C1063c("Orientation", 274, 3), new C1063c("SamplesPerPixel", 277, 3), new C1063c("RowsPerStrip", 278, 3, 4), new C1063c("StripByteCounts", 279, 3, 4), new C1063c("XResolution", 282, 5), new C1063c("YResolution", 283, 5), new C1063c("PlanarConfiguration", 284, 3), new C1063c("ResolutionUnit", 296, 3), new C1063c("TransferFunction", 301, 3), new C1063c("Software", 305, 2), new C1063c("DateTime", 306, 2), new C1063c("Artist", 315, 2), new C1063c("WhitePoint", 318, 5), new C1063c("PrimaryChromaticities", 319, 5), new C1063c("SubIFDPointer", 330, 4), new C1063c("JPEGInterchangeFormat", 513, 4), new C1063c("JPEGInterchangeFormatLength", 514, 4), new C1063c("YCbCrCoefficients", 529, 5), new C1063c("YCbCrSubSampling", 530, 3), new C1063c("YCbCrPositioning", 531, 3), new C1063c("ReferenceBlackWhite", 532, 5), new C1063c("Copyright", 33432, 2), new C1063c("ExifIFDPointer", 34665, 4), new C1063c("GPSInfoIFDPointer", 34853, 4), new C1063c("DNGVersion", 50706, 1), new C1063c("DefaultCropSize", 50720, 3, 4)};
        f4874q = cVarArr5;
        C1063c[] cVarArr6 = {new C1063c("ThumbnailImage", 256, 7), new C1063c("CameraSettingsIFDPointer", 8224, 4), new C1063c("ImageProcessingIFDPointer", 8256, 4)};
        f4876s = cVarArr6;
        C1063c[] cVarArr7 = {new C1063c("PreviewImageStart", 257, 4), new C1063c("PreviewImageLength", 258, 4)};
        f4877t = cVarArr7;
        C1063c[] cVarArr8 = {new C1063c("AspectFrame", 4371, 3)};
        f4878u = cVarArr8;
        C1063c[] cVarArr9 = {new C1063c("ColorSpace", 55, 3)};
        f4879v = cVarArr9;
        C1063c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        f4880w = cVarArr10;
        f4850A = new HashMap[cVarArr10.length];
        f4851B = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f4854E = forName;
        f4855F = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f4866i = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1063c[][] cVarArr11 = f4880w;
            if (i < cVarArr11.length) {
                f4850A[i] = new HashMap<>();
                f4851B[i] = new HashMap<>();
                C1063c[] cVarArr12 = cVarArr11[i];
                for (C1063c cVar : cVarArr12) {
                    f4850A[i].put(Integer.valueOf(cVar.f4910a), cVar);
                    f4851B[i].put(cVar.f4911b, cVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f4853D;
                C1063c[] cVarArr13 = f4881x;
                hashMap.put(Integer.valueOf(cVarArr13[0].f4910a), 5);
                hashMap.put(Integer.valueOf(cVarArr13[1].f4910a), 1);
                hashMap.put(Integer.valueOf(cVarArr13[2].f4910a), 2);
                hashMap.put(Integer.valueOf(cVarArr13[3].f4910a), 3);
                hashMap.put(Integer.valueOf(cVarArr13[4].f4910a), 7);
                hashMap.put(Integer.valueOf(cVarArr13[5].f4910a), 8);
                return;
            }
        }
    }

    public C1060a(InputStream inputStream) {
        C1063c[][] cVarArr = f4880w;
        this.f4887L = new HashMap[cVarArr.length];
        this.f4888M = new HashSet(cVarArr.length);
        if (inputStream != null) {
            AssetManager.AssetInputStream assetInputStream = null;
            this.f4884I = null;
            this.f4885J = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : assetInputStream;
            m6086t(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    /* renamed from: A */
    private void m6066A(int i, int i2) {
        if (!this.f4887L[i].isEmpty() && !this.f4887L[i2].isEmpty()) {
            C1062b bVar = this.f4887L[i].get("ImageLength");
            C1062b bVar2 = this.f4887L[i].get("ImageWidth");
            C1062b bVar3 = this.f4887L[i2].get("ImageLength");
            C1062b bVar4 = this.f4887L[i2].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int i3 = bVar.mo5704i(this.f4889N);
                int i4 = bVar2.mo5704i(this.f4889N);
                int i5 = bVar3.mo5704i(this.f4889N);
                int i6 = bVar4.mo5704i(this.f4889N);
                if (i3 < i5 && i4 < i6) {
                    HashMap<String, C1062b>[] hashMapArr = this.f4887L;
                    HashMap<String, C1062b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: B */
    private void m6067B(C1061a aVar, int i) {
        C1062b bVar;
        C1062b bVar2;
        StringBuilder sb;
        String arrays;
        C1062b bVar3 = this.f4887L[i].get("DefaultCropSize");
        C1062b bVar4 = this.f4887L[i].get("SensorTopBorder");
        C1062b bVar5 = this.f4887L[i].get("SensorLeftBorder");
        C1062b bVar6 = this.f4887L[i].get("SensorBottomBorder");
        C1062b bVar7 = this.f4887L[i].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.f4907a == 5) {
                C1064d[] dVarArr = (C1064d[]) bVar3.mo5706k(this.f4889N);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(dVarArr);
                } else {
                    bVar2 = C1062b.m6102d(dVarArr[0], this.f4889N);
                    bVar = C1062b.m6102d(dVarArr[1], this.f4889N);
                    this.f4887L[i].put("ImageWidth", bVar2);
                    this.f4887L[i].put("ImageLength", bVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) bVar3.mo5706k(this.f4889N);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    bVar2 = C1062b.m6104f(iArr[0], this.f4889N);
                    bVar = C1062b.m6104f(iArr[1], this.f4889N);
                    this.f4887L[i].put("ImageWidth", bVar2);
                    this.f4887L[i].put("ImageLength", bVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m6091y(aVar, i);
        } else {
            int i2 = bVar4.mo5704i(this.f4889N);
            int i3 = bVar6.mo5704i(this.f4889N);
            int i4 = bVar7.mo5704i(this.f4889N);
            int i5 = bVar5.mo5704i(this.f4889N);
            if (i3 > i2 && i4 > i5) {
                C1062b f = C1062b.m6104f(i3 - i2, this.f4889N);
                C1062b f2 = C1062b.m6104f(i4 - i5, this.f4889N);
                this.f4887L[i].put("ImageLength", f);
                this.f4887L[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: C */
    private void m6068C(InputStream inputStream) {
        m6066A(0, 5);
        m6066A(0, 4);
        m6066A(5, 4);
        C1062b bVar = this.f4887L[1].get("PixelXDimension");
        C1062b bVar2 = this.f4887L[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f4887L[0].put("ImageWidth", bVar);
            this.f4887L[0].put("ImageLength", bVar2);
        }
        if (this.f4887L[4].isEmpty() && m6085s(this.f4887L[5])) {
            HashMap<String, C1062b>[] hashMapArr = this.f4887L;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m6085s(this.f4887L[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m6069a() {
        String c = mo5679c("DateTimeOriginal");
        if (c != null && mo5679c("DateTime") == null) {
            this.f4887L[0].put("DateTime", C1062b.m6099a(c));
        }
        if (mo5679c("ImageWidth") == null) {
            this.f4887L[0].put("ImageWidth", C1062b.m6100b(0, this.f4889N));
        }
        if (mo5679c("ImageLength") == null) {
            this.f4887L[0].put("ImageLength", C1062b.m6100b(0, this.f4889N));
        }
        if (mo5679c("Orientation") == null) {
            this.f4887L[0].put("Orientation", C1062b.m6100b(0, this.f4889N));
        }
        if (mo5679c("LightSource") == null) {
            this.f4887L[1].put("LightSource", C1062b.m6100b(0, this.f4889N));
        }
    }

    /* renamed from: b */
    private static long[] m6070b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: e */
    private C1062b m6071e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f4880w.length; i++) {
            C1062b bVar = this.f4887L[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6072f(p006b.p048k.p049a.C1060a.C1061a r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p048k.p049a.C1060a.m6072f(b.k.a.a$a, int, int):void");
    }

    /* renamed from: g */
    private int m6073g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m6080n(bArr)) {
            return 4;
        }
        if (m6082p(bArr)) {
            return 9;
        }
        if (m6081o(bArr)) {
            return 7;
        }
        return m6083q(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6074h(p006b.p048k.p049a.C1060a.C1061a r7) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p048k.p049a.C1060a.m6074h(b.k.a.a$a):void");
    }

    /* renamed from: i */
    private void m6075i(C1061a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m6072f(aVar, i, 5);
        aVar.mo5684c((long) i2);
        aVar.mo5685d(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f4875r.f4910a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C1062b f = C1062b.m6104f(readShort, this.f4889N);
                C1062b f2 = C1062b.m6104f(readShort2, this.f4889N);
                this.f4887L[0].put("ImageLength", f);
                this.f4887L[0].put("ImageWidth", f2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: j */
    private void m6076j(C1061a aVar) {
        C1062b bVar;
        m6087u(aVar, aVar.available());
        m6090x(aVar, 0);
        m6067B(aVar, 0);
        m6067B(aVar, 5);
        m6067B(aVar, 4);
        m6068C(aVar);
        if (this.f4886K == 8 && (bVar = this.f4887L[1].get("MakerNote")) != null) {
            C1061a aVar2 = new C1061a(bVar.f4909c);
            aVar2.mo5685d(this.f4889N);
            aVar2.mo5684c(6);
            m6090x(aVar2, 9);
            C1062b bVar2 = this.f4887L[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f4887L[1].put("ColorSpace", bVar2);
            }
        }
    }

    /* renamed from: k */
    private void m6077k(C1061a aVar) {
        m6076j(aVar);
        if (this.f4887L[0].get("JpgFromRaw") != null) {
            m6072f(aVar, this.f4899X, 5);
        }
        C1062b bVar = this.f4887L[0].get("ISO");
        C1062b bVar2 = this.f4887L[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f4887L[1].put("PhotographicSensitivity", bVar);
        }
    }

    /* renamed from: l */
    private void m6078l(C1061a aVar, HashMap hashMap) {
        int i;
        C1062b bVar = (C1062b) hashMap.get("JPEGInterchangeFormat");
        C1062b bVar2 = (C1062b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int i2 = bVar.mo5704i(this.f4889N);
            int min = Math.min(bVar2.mo5704i(this.f4889N), aVar.available() - i2);
            int i3 = this.f4886K;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i = this.f4895T;
            } else {
                if (i3 == 7) {
                    i = this.f4896U;
                }
                if (i2 > 0 && min > 0) {
                    this.f4890O = true;
                    this.f4891P = i2;
                    this.f4892Q = min;
                    if (this.f4884I == null && this.f4885J == null) {
                        byte[] bArr = new byte[min];
                        aVar.mo5684c((long) i2);
                        aVar.readFully(bArr);
                        this.f4893R = bArr;
                        return;
                    }
                    return;
                }
            }
            i2 += i;
            if (i2 > 0) {
            }
        }
    }

    /* renamed from: m */
    private void m6079m(C1061a aVar, HashMap hashMap) {
        String str;
        C1062b bVar = (C1062b) hashMap.get("StripOffsets");
        C1062b bVar2 = (C1062b) hashMap.get("StripByteCounts");
        if (!(bVar == null || bVar2 == null)) {
            long[] b = m6070b(bVar.mo5706k(this.f4889N));
            long[] b2 = m6070b(bVar2.mo5706k(this.f4889N));
            if (b == null) {
                str = "stripOffsets should not be null.";
            } else if (b2 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j = 0;
                for (long j2 : b2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < b.length; i4++) {
                    int i5 = (int) b[i4];
                    int i6 = (int) b2[i4];
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    aVar.mo5684c((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    aVar.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f4890O = true;
                this.f4893R = bArr;
                this.f4892Q = i;
                return;
            }
            Log.w("ExifInterface", str);
        }
    }

    /* renamed from: n */
    private static boolean m6080n(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f4863f;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: o */
    private boolean m6081o(byte[] bArr) {
        C1061a aVar = new C1061a(bArr);
        ByteOrder v = m6088v(aVar);
        this.f4889N = v;
        aVar.mo5685d(v);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: p */
    private boolean m6082p(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private boolean m6083q(byte[] bArr) {
        C1061a aVar = new C1061a(bArr);
        ByteOrder v = m6088v(aVar);
        this.f4889N = v;
        aVar.mo5685d(v);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: r */
    private boolean m6084r(HashMap hashMap) {
        C1062b bVar;
        C1062b bVar2 = (C1062b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.mo5706k(this.f4889N);
        int[] iArr2 = f4860c;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f4886K != 3 || (bVar = (C1062b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i = bVar.mo5704i(this.f4889N);
        return (i == 1 && Arrays.equals(iArr, f4862e)) || (i == 6 && Arrays.equals(iArr, iArr2));
    }

    /* renamed from: s */
    private boolean m6085s(HashMap hashMap) {
        C1062b bVar = (C1062b) hashMap.get("ImageLength");
        C1062b bVar2 = (C1062b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.mo5704i(this.f4889N) <= 512 && bVar2.mo5704i(this.f4889N) <= 512;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f4900Y = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        m6069a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6086t(java.io.InputStream r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p048k.p049a.C1060a.m6086t(java.io.InputStream):void");
    }

    /* renamed from: u */
    private void m6087u(C1061a aVar, int i) {
        ByteOrder v = m6088v(aVar);
        this.f4889N = v;
        aVar.mo5685d(v);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f4886K;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: v */
    private ByteOrder m6088v(C1061a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: w */
    private void m6089w(byte[] bArr, int i) {
        C1061a aVar = new C1061a(bArr);
        m6087u(aVar, bArr.length);
        m6090x(aVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0240  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6090x(p006b.p048k.p049a.C1060a.C1061a r25, int r26) {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p048k.p049a.C1060a.m6090x(b.k.a.a$a, int):void");
    }

    /* renamed from: y */
    private void m6091y(C1061a aVar, int i) {
        C1062b bVar;
        C1062b bVar2 = this.f4887L[i].get("ImageLength");
        C1062b bVar3 = this.f4887L[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f4887L[i].get("JPEGInterchangeFormat")) != null) {
            m6072f(aVar, bVar.mo5704i(this.f4889N), i);
        }
    }

    /* renamed from: z */
    private void m6092z(C1061a aVar) {
        HashMap<String, C1062b> hashMap = this.f4887L[4];
        C1062b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i = bVar.mo5704i(this.f4889N);
            this.f4894S = i;
            if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                }
            }
            if (m6084r(hashMap)) {
                m6079m(aVar, hashMap);
                return;
            }
            return;
        }
        this.f4894S = 6;
        m6078l(aVar, hashMap);
    }

    /* renamed from: c */
    public String mo5679c(String str) {
        String str2;
        C1062b e = m6071e(str);
        if (e != null) {
            if (!f4852C.contains(str)) {
                return e.mo5705j(this.f4889N);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = e.f4907a;
                if (i == 5 || i == 10) {
                    C1064d[] dVarArr = (C1064d[]) e.mo5706k(this.f4889N);
                    if (dVarArr == null || dVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].f4914a) / ((float) dVarArr[0].f4915b))), Integer.valueOf((int) (((float) dVarArr[1].f4914a) / ((float) dVarArr[1].f4915b))), Integer.valueOf((int) (((float) dVarArr[2].f4914a) / ((float) dVarArr[2].f4915b))));
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + e.f4907a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(e.mo5703h(this.f4889N));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo5680d(String str, int i) {
        C1062b e = m6071e(str);
        if (e == null) {
            return i;
        }
        try {
            return e.mo5704i(this.f4889N);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
