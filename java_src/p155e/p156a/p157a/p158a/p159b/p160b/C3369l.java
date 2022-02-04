package p155e.p156a.p157a.p158a.p159b.p160b;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import p155e.p156a.p157a.p158a.p163d.C3380a;
import p155e.p156a.p157a.p158a.p163d.C3381b;
import p155e.p156a.p157a.p158a.p163d.C3383d;

/* renamed from: e.a.a.a.b.b.l */
public class C3369l implements Closeable {

    /* renamed from: b */
    static final byte[] f11340b = {55, 122, -68, -81, 39, 28};

    /* renamed from: c */
    private final String f11341c;

    /* renamed from: d */
    private RandomAccessFile f11342d;

    /* renamed from: e */
    private final C3351b f11343e;

    /* renamed from: f */
    private int f11344f;

    /* renamed from: g */
    private int f11345g;

    /* renamed from: h */
    private InputStream f11346h;

    /* renamed from: i */
    private byte[] f11347i;

    /* renamed from: j */
    private final ArrayList<InputStream> f11348j;

    public C3369l(File file) {
        this(file, null);
    }

    public C3369l(File file, byte[] bArr) {
        this.f11344f = -1;
        this.f11345g = -1;
        this.f11346h = null;
        this.f11348j = new ArrayList<>();
        this.f11342d = new RandomAccessFile(file, "r");
        this.f11341c = file.getAbsolutePath();
        try {
            this.f11343e = m14004o(bArr);
            if (bArr != null) {
                byte[] bArr2 = new byte[bArr.length];
                this.f11347i = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return;
            }
            this.f11347i = null;
        } catch (Throwable th) {
            this.f11342d.close();
            throw th;
        }
    }

    /* renamed from: a */
    private InputStream m13993a(C3366i iVar, long j, int i, C3368k kVar) {
        this.f11342d.seek(j);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C3353d(this.f11342d, this.f11343e.f11292b[i]));
        LinkedList linkedList = new LinkedList();
        InputStream inputStream = bufferedInputStream;
        for (C3354e eVar : iVar.mo11312c()) {
            if (eVar.f11304b == 1 && eVar.f11305c == 1) {
                EnumC3370m a = EnumC3370m.m14015a(eVar.f11303a);
                inputStream = C3356g.m13949a(this.f11341c, inputStream, iVar.mo11314e(eVar), eVar, this.f11347i);
                linkedList.addFirst(new C3371n(a, C3356g.m13950b(a).mo11303c(eVar, inputStream)));
            } else {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
        }
        kVar.mo11327m(linkedList);
        return iVar.f11321g ? new C3381b(inputStream, iVar.mo11313d(), iVar.f11322h) : inputStream;
    }

    /* renamed from: b */
    private void m13994b() {
        C3351b bVar = this.f11343e;
        int[] iArr = bVar.f11298h.f11372d;
        int i = this.f11344f;
        int i2 = iArr[i];
        if (i2 < 0) {
            this.f11348j.clear();
            return;
        }
        C3368k[] kVarArr = bVar.f11297g;
        C3368k kVar = kVarArr[i];
        if (this.f11345g == i2) {
            kVar.mo11327m(kVarArr[i - 1].mo11316a());
        } else {
            this.f11345g = i2;
            this.f11348j.clear();
            InputStream inputStream = this.f11346h;
            if (inputStream != null) {
                inputStream.close();
                this.f11346h = null;
            }
            C3351b bVar2 = this.f11343e;
            C3366i iVar = bVar2.f11295e[i2];
            C3373p pVar = bVar2.f11298h;
            int i3 = pVar.f11369a[i2];
            this.f11346h = m13993a(iVar, pVar.f11370b[i3] + bVar2.f11291a + 32, i3, kVar);
        }
        InputStream aVar = new C3380a(this.f11346h, kVar.mo11292b());
        if (kVar.mo11319e()) {
            aVar = new C3381b(aVar, kVar.mo11292b(), kVar.mo11317c());
        }
        this.f11348j.add(aVar);
    }

    /* renamed from: c */
    private void m13995c(C3351b bVar) {
        C3366i[] iVarArr;
        C3373p pVar = new C3373p();
        C3366i[] iVarArr2 = bVar.f11295e;
        int length = iVarArr2 != null ? iVarArr2.length : 0;
        pVar.f11369a = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            pVar.f11369a[i2] = i;
            i += bVar.f11295e[i2].f11319e.length;
        }
        long j = 0;
        long[] jArr = bVar.f11292b;
        int length2 = jArr != null ? jArr.length : 0;
        pVar.f11370b = new long[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            pVar.f11370b[i3] = j;
            j += bVar.f11292b[i3];
        }
        pVar.f11371c = new int[length];
        pVar.f11372d = new int[bVar.f11297g.length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            C3368k[] kVarArr = bVar.f11297g;
            if (i4 < kVarArr.length) {
                if (kVarArr[i4].mo11324j() || i5 != 0) {
                    if (i5 == 0) {
                        while (true) {
                            iVarArr = bVar.f11295e;
                            if (i6 >= iVarArr.length) {
                                break;
                            }
                            pVar.f11371c[i6] = i4;
                            if (iVarArr[i6].f11323i > 0) {
                                break;
                            }
                            i6++;
                        }
                        if (i6 >= iVarArr.length) {
                            throw new IOException("Too few folders in archive");
                        }
                    }
                    pVar.f11372d[i4] = i6;
                    if (bVar.f11297g[i4].mo11324j() && (i5 = i5 + 1) >= bVar.f11295e[i6].f11323i) {
                        i6++;
                        i5 = 0;
                    }
                } else {
                    pVar.f11372d[i4] = -1;
                }
                i4++;
            } else {
                bVar.f11298h = pVar;
                return;
            }
        }
    }

    /* renamed from: d */
    private InputStream m13996d() {
        if (this.f11343e.f11297g[this.f11344f].mo11292b() == 0) {
            return new ByteArrayInputStream(new byte[0]);
        }
        if (!this.f11348j.isEmpty()) {
            while (this.f11348j.size() > 1) {
                InputStream remove = this.f11348j.remove(0);
                C3383d.m14046b(remove, Long.MAX_VALUE);
                remove.close();
            }
            return this.f11348j.get(0);
        }
        throw new IllegalStateException("No current 7z entry (call getNextEntry() first).");
    }

    /* renamed from: h */
    private BitSet m13997h(DataInput dataInput, int i) {
        if (dataInput.readUnsignedByte() == 0) {
            return m13999j(dataInput, i);
        }
        BitSet bitSet = new BitSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            bitSet.set(i2, true);
        }
        return bitSet;
    }

    /* renamed from: i */
    private void m13998i(DataInput dataInput) {
        while (dataInput.readUnsignedByte() != 0) {
            dataInput.readFully(new byte[((int) m14009t(dataInput))]);
        }
    }

    /* renamed from: j */
    private BitSet m13999j(DataInput dataInput, int i) {
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 == 0) {
                i2 = 128;
                i3 = dataInput.readUnsignedByte();
            }
            bitSet.set(i4, (i3 & i2) != 0);
            i2 >>>= 1;
        }
        return bitSet;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: k */
    private DataInputStream m14000k(DataInputStream dataInputStream, C3351b bVar, byte[] bArr) {
        m14007r(dataInputStream, bVar);
        C3366i iVar = bVar.f11295e[0];
        this.f11342d.seek(bVar.f11291a + 32 + 0);
        C3353d dVar = new C3353d(this.f11342d, bVar.f11292b[0]);
        C3381b bVar2 = dVar;
        for (C3354e eVar : iVar.mo11312c()) {
            if (eVar.f11304b == 1 && eVar.f11305c == 1) {
                bVar2 = C3356g.m13949a(this.f11341c, bVar2, iVar.mo11314e(eVar), eVar, bArr);
            } else {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
        }
        if (iVar.f11321g) {
            bVar2 = new C3381b(bVar2, iVar.mo11313d(), iVar.f11322h);
        }
        byte[] bArr2 = new byte[((int) iVar.mo11313d())];
        DataInputStream dataInputStream2 = new DataInputStream(bVar2);
        try {
            dataInputStream2.readFully(bArr2);
            dataInputStream2.close();
            return new DataInputStream(new ByteArrayInputStream(bArr2));
        } catch (Throwable th) {
            dataInputStream2.close();
            throw th;
        }
    }

    /* renamed from: l */
    private void m14001l(DataInput dataInput, C3351b bVar) {
        C3351b bVar2 = bVar;
        int t = (int) m14009t(dataInput);
        C3368k[] kVarArr = new C3368k[t];
        boolean z = false;
        for (int i = 0; i < t; i++) {
            kVarArr[i] = new C3368k();
        }
        BitSet bitSet = null;
        BitSet bitSet2 = null;
        BitSet bitSet3 = null;
        while (true) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            if (readUnsignedByte == 0) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < t; i4++) {
                    boolean z2 = true;
                    kVarArr[i4].mo11335u(bitSet == null || !bitSet.get(i4));
                    if (kVarArr[i4].mo11324j()) {
                        kVarArr[i4].mo11330p(z);
                        kVarArr[i4].mo11326l(z);
                        kVarArr[i4].mo11332r(bVar2.f11296f.f11374b.get(i2));
                        kVarArr[i4].mo11328n(bVar2.f11296f.f11375c[i2]);
                        kVarArr[i4].mo11339y(bVar2.f11296f.f11373a[i2]);
                        i2++;
                    } else {
                        C3368k kVar = kVarArr[i4];
                        if (bitSet2 != null && bitSet2.get(i3)) {
                            z2 = false;
                        }
                        kVar.mo11330p(z2);
                        kVarArr[i4].mo11326l(bitSet3 == null ? false : bitSet3.get(i3));
                        kVarArr[i4].mo11332r(z);
                        kVarArr[i4].mo11339y(0);
                        i3++;
                    }
                }
                bVar2.f11297g = kVarArr;
                m13995c(bVar2);
                return;
            }
            long t2 = m14009t(dataInput);
            switch (readUnsignedByte) {
                case 14:
                    bitSet = m13999j(dataInput, t);
                    break;
                case 15:
                    if (bitSet != null) {
                        bitSet2 = m13999j(dataInput, bitSet.cardinality());
                        break;
                    } else {
                        throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
                    }
                case 16:
                    if (bitSet != null) {
                        bitSet3 = m13999j(dataInput, bitSet.cardinality());
                        break;
                    } else {
                        throw new IOException("Header format error: kEmptyStream must appear before kAnti");
                    }
                case 17:
                    if (dataInput.readUnsignedByte() == 0) {
                        long j = t2 - 1;
                        if ((1 & j) == 0) {
                            int i5 = (int) j;
                            byte[] bArr = new byte[i5];
                            dataInput.readFully(bArr);
                            int i6 = 0;
                            int i7 = 0;
                            for (int i8 = 0; i8 < i5; i8 += 2) {
                                if (bArr[i8] == 0 && bArr[i8 + 1] == 0) {
                                    kVarArr[i7].mo11338x(new String(bArr, i6, i8 - i6, "UTF-16LE"));
                                    i6 = i8 + 2;
                                    i7++;
                                }
                            }
                            if (i6 != i5 || i7 != t) {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new IOException("File names length invalid");
                        }
                    } else {
                        throw new IOException("Not implemented");
                    }
                    break;
                case 18:
                    BitSet h = m13997h(dataInput, t);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i9 = 0; i9 < t; i9++) {
                            kVarArr[i9].mo11333s(h.get(i9));
                            if (kVarArr[i9].mo11320f()) {
                                kVarArr[i9].mo11329o(Long.reverseBytes(dataInput.readLong()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 19:
                    BitSet h2 = m13997h(dataInput, t);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i10 = 0; i10 < t; i10++) {
                            kVarArr[i10].mo11331q(h2.get(i10));
                            if (kVarArr[i10].mo11318d()) {
                                kVarArr[i10].mo11325k(Long.reverseBytes(dataInput.readLong()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 20:
                    BitSet h3 = m13997h(dataInput, t);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i11 = 0; i11 < t; i11++) {
                            kVarArr[i11].mo11334t(h3.get(i11));
                            if (kVarArr[i11].mo11321g()) {
                                kVarArr[i11].mo11337w(Long.reverseBytes(dataInput.readLong()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 21:
                    BitSet h4 = m13997h(dataInput, t);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i12 = 0; i12 < t; i12++) {
                            kVarArr[i12].mo11336v(h4.get(i12));
                            if (kVarArr[i12].mo11322h()) {
                                kVarArr[i12].mo11340z(Integer.reverseBytes(dataInput.readInt()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 22:
                case 23:
                default:
                    if (m14011v(dataInput, t2) >= t2) {
                        break;
                    } else {
                        throw new IOException("Incomplete property of type " + readUnsignedByte);
                    }
                case 24:
                    throw new IOException("kStartPos is unsupported, please report");
                case 25:
                    if (m14011v(dataInput, t2) >= t2) {
                        break;
                    } else {
                        throw new IOException("Incomplete kDummy property");
                    }
            }
            bVar2 = bVar;
            z = false;
        }
        throw new IOException("Error parsing file names");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p155e.p156a.p157a.p158a.p159b.p160b.C3366i m14002m(java.io.DataInput r20) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: p155e.p156a.p157a.p158a.p159b.p160b.C3369l.m14002m(java.io.DataInput):e.a.a.a.b.b.i");
    }

    /* renamed from: n */
    private void m14003n(DataInput dataInput, C3351b bVar) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 2) {
            m13998i(dataInput);
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte != 3) {
            if (readUnsignedByte == 4) {
                m14007r(dataInput, bVar);
                readUnsignedByte = dataInput.readUnsignedByte();
            }
            if (readUnsignedByte == 5) {
                m14001l(dataInput, bVar);
                readUnsignedByte = dataInput.readUnsignedByte();
            }
            if (readUnsignedByte != 0) {
                throw new IOException("Badly terminated header, found " + readUnsignedByte);
            }
            return;
        }
        throw new IOException("Additional streams unsupported");
    }

    /* renamed from: o */
    private C3351b m14004o(byte[] bArr) {
        byte[] bArr2 = new byte[6];
        this.f11342d.readFully(bArr2);
        if (Arrays.equals(bArr2, f11340b)) {
            byte readByte = this.f11342d.readByte();
            byte readByte2 = this.f11342d.readByte();
            if (readByte == 0) {
                C3372o q = m14006q(4294967295L & ((long) Integer.reverseBytes(this.f11342d.readInt())));
                long j = q.f11367b;
                int i = (int) j;
                if (((long) i) == j) {
                    this.f11342d.seek(q.f11366a + 32);
                    byte[] bArr3 = new byte[i];
                    this.f11342d.readFully(bArr3);
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr3);
                    if (q.f11368c == crc32.getValue()) {
                        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr3));
                        C3351b bVar = new C3351b();
                        int readUnsignedByte = dataInputStream.readUnsignedByte();
                        if (readUnsignedByte == 23) {
                            dataInputStream = m14000k(dataInputStream, bVar, bArr);
                            bVar = new C3351b();
                            readUnsignedByte = dataInputStream.readUnsignedByte();
                        }
                        if (readUnsignedByte == 1) {
                            m14003n(dataInputStream, bVar);
                            dataInputStream.close();
                            return bVar;
                        }
                        throw new IOException("Broken or unsupported archive: no Header");
                    }
                    throw new IOException("NextHeader CRC mismatch");
                }
                throw new IOException("cannot handle nextHeaderSize " + q.f11367b);
            }
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", Byte.valueOf(readByte), Byte.valueOf(readByte2)));
        }
        throw new IOException("Bad 7z signature");
    }

    /* renamed from: p */
    private void m14005p(DataInput dataInput, C3351b bVar) {
        bVar.f11291a = m14009t(dataInput);
        long t = m14009t(dataInput);
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 9) {
            bVar.f11292b = new long[((int) t)];
            int i = 0;
            while (true) {
                long[] jArr = bVar.f11292b;
                if (i >= jArr.length) {
                    break;
                }
                jArr[i] = m14009t(dataInput);
                i++;
            }
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte == 10) {
            int i2 = (int) t;
            bVar.f11293c = m13997h(dataInput, i2);
            bVar.f11294d = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                if (bVar.f11293c.get(i3)) {
                    bVar.f11294d[i3] = 4294967295L & ((long) Integer.reverseBytes(dataInput.readInt()));
                }
            }
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte != 0) {
            throw new IOException("Badly terminated PackInfo (" + readUnsignedByte + ")");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p155e.p156a.p157a.p158a.p159b.p160b.C3372o m14006q(long r11) {
        /*
            r10 = this;
            e.a.a.a.b.b.o r0 = new e.a.a.a.b.b.o
            r0.<init>()
            r1 = 0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ all -> 0x0049 }
            e.a.a.a.d.b r9 = new e.a.a.a.d.b     // Catch:{ all -> 0x0049 }
            e.a.a.a.b.b.d r4 = new e.a.a.a.b.b.d     // Catch:{ all -> 0x0049 }
            java.io.RandomAccessFile r3 = r10.f11342d     // Catch:{ all -> 0x0049 }
            r5 = 20
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0049 }
            r5 = 20
            r3 = r9
            r7 = r11
            r3.<init>(r4, r5, r7)     // Catch:{ all -> 0x0049 }
            r2.<init>(r9)     // Catch:{ all -> 0x0049 }
            long r11 = r2.readLong()     // Catch:{ all -> 0x0046 }
            long r11 = java.lang.Long.reverseBytes(r11)     // Catch:{ all -> 0x0046 }
            r0.f11366a = r11     // Catch:{ all -> 0x0046 }
            long r11 = r2.readLong()     // Catch:{ all -> 0x0046 }
            long r11 = java.lang.Long.reverseBytes(r11)     // Catch:{ all -> 0x0046 }
            r0.f11367b = r11     // Catch:{ all -> 0x0046 }
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = r2.readInt()     // Catch:{ all -> 0x0046 }
            int r1 = java.lang.Integer.reverseBytes(r1)     // Catch:{ all -> 0x0046 }
            long r3 = (long) r1     // Catch:{ all -> 0x0046 }
            long r11 = r11 & r3
            r0.f11368c = r11     // Catch:{ all -> 0x0046 }
            r2.close()
            return r0
        L_0x0046:
            r11 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x0049:
            r11 = move-exception
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p155e.p156a.p157a.p158a.p159b.p160b.C3369l.m14006q(long):e.a.a.a.b.b.o");
    }

    /* renamed from: r */
    private void m14007r(DataInput dataInput, C3351b bVar) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 6) {
            m14005p(dataInput, bVar);
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte == 7) {
            m14010u(dataInput, bVar);
            readUnsignedByte = dataInput.readUnsignedByte();
        } else {
            bVar.f11295e = new C3366i[0];
        }
        if (readUnsignedByte == 8) {
            m14008s(dataInput, bVar);
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte != 0) {
            throw new IOException("Badly terminated StreamsInfo");
        }
    }

    /* renamed from: s */
    private void m14008s(DataInput dataInput, C3351b bVar) {
        boolean z;
        C3366i[] iVarArr = bVar.f11295e;
        int length = iVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            iVarArr[i].f11323i = 1;
            i++;
        }
        int length2 = bVar.f11295e.length;
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 13) {
            C3366i[] iVarArr2 = bVar.f11295e;
            int i2 = 0;
            for (C3366i iVar : iVarArr2) {
                long t = m14009t(dataInput);
                iVar.f11323i = (int) t;
                i2 = (int) (((long) i2) + t);
            }
            readUnsignedByte = dataInput.readUnsignedByte();
            length2 = i2;
        }
        C3374q qVar = new C3374q();
        qVar.f11373a = new long[length2];
        qVar.f11374b = new BitSet(length2);
        qVar.f11375c = new long[length2];
        C3366i[] iVarArr3 = bVar.f11295e;
        int i3 = 0;
        for (C3366i iVar2 : iVarArr3) {
            if (iVar2.f11323i != 0) {
                long j = 0;
                if (readUnsignedByte == 9) {
                    int i4 = 0;
                    while (i4 < iVar2.f11323i - 1) {
                        long t2 = m14009t(dataInput);
                        qVar.f11373a[i3] = t2;
                        j += t2;
                        i4++;
                        i3++;
                    }
                }
                qVar.f11373a[i3] = iVar2.mo11313d() - j;
                i3++;
            }
        }
        if (readUnsignedByte == 9) {
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        C3366i[] iVarArr4 = bVar.f11295e;
        int i5 = 0;
        for (C3366i iVar3 : iVarArr4) {
            int i6 = iVar3.f11323i;
            if (i6 != 1 || !iVar3.f11321g) {
                i5 += i6;
            }
        }
        if (readUnsignedByte == 10) {
            BitSet h = m13997h(dataInput, i5);
            long[] jArr = new long[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                if (h.get(i7)) {
                    jArr[i7] = 4294967295L & ((long) Integer.reverseBytes(dataInput.readInt()));
                }
            }
            C3366i[] iVarArr5 = bVar.f11295e;
            int length3 = iVarArr5.length;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < length3) {
                C3366i iVar4 = iVarArr5[i8];
                if (iVar4.f11323i != z || !iVar4.f11321g) {
                    for (int i11 = 0; i11 < iVar4.f11323i; i11++) {
                        qVar.f11374b.set(i9, h.get(i10));
                        qVar.f11375c[i9] = jArr[i10];
                        i9++;
                        i10++;
                    }
                } else {
                    qVar.f11374b.set(i9, z);
                    qVar.f11375c[i9] = iVar4.f11322h;
                    i9++;
                }
                i8++;
                z = true;
            }
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte == 0) {
            bVar.f11296f = qVar;
            return;
        }
        throw new IOException("Badly terminated SubStreamsInfo");
    }

    /* renamed from: t */
    private static long m14009t(DataInput dataInput) {
        long readUnsignedByte = (long) dataInput.readUnsignedByte();
        int i = 128;
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((((long) i) & readUnsignedByte) == 0) {
                return ((readUnsignedByte & ((long) (i - 1))) << (i2 * 8)) | j;
            }
            j |= ((long) dataInput.readUnsignedByte()) << (i2 * 8);
            i >>>= 1;
        }
        return j;
    }

    /* renamed from: u */
    private void m14010u(DataInput dataInput, C3351b bVar) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 11) {
            int t = (int) m14009t(dataInput);
            C3366i[] iVarArr = new C3366i[t];
            bVar.f11295e = iVarArr;
            if (dataInput.readUnsignedByte() == 0) {
                for (int i = 0; i < t; i++) {
                    iVarArr[i] = m14002m(dataInput);
                }
                int readUnsignedByte2 = dataInput.readUnsignedByte();
                if (readUnsignedByte2 == 12) {
                    for (int i2 = 0; i2 < t; i2++) {
                        C3366i iVar = iVarArr[i2];
                        iVar.f11320f = new long[((int) iVar.f11317c)];
                        for (int i3 = 0; ((long) i3) < iVar.f11317c; i3++) {
                            iVar.f11320f[i3] = m14009t(dataInput);
                        }
                    }
                    int readUnsignedByte3 = dataInput.readUnsignedByte();
                    if (readUnsignedByte3 == 10) {
                        BitSet h = m13997h(dataInput, t);
                        for (int i4 = 0; i4 < t; i4++) {
                            if (h.get(i4)) {
                                iVarArr[i4].f11321g = true;
                                iVarArr[i4].f11322h = 4294967295L & ((long) Integer.reverseBytes(dataInput.readInt()));
                            } else {
                                iVarArr[i4].f11321g = false;
                            }
                        }
                        readUnsignedByte3 = dataInput.readUnsignedByte();
                    }
                    if (readUnsignedByte3 != 0) {
                        throw new IOException("Badly terminated UnpackInfo");
                    }
                    return;
                }
                throw new IOException("Expected kCodersUnpackSize, got " + readUnsignedByte2);
            }
            throw new IOException("External unsupported");
        }
        throw new IOException("Expected kFolder, got " + readUnsignedByte);
    }

    /* renamed from: v */
    private static long m14011v(DataInput dataInput, long j) {
        int skipBytes;
        if (j < 1) {
            return 0;
        }
        long j2 = 0;
        while (j > 2147483647L) {
            long v = m14011v(dataInput, 2147483647L);
            if (v == 0) {
                return j2;
            }
            j2 += v;
            j -= v;
        }
        while (j > 0 && (skipBytes = dataInput.skipBytes((int) j)) != 0) {
            long j3 = (long) skipBytes;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.f11342d;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } finally {
                this.f11342d = null;
                byte[] bArr = this.f11347i;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.f11347i = null;
            }
        }
    }

    /* renamed from: e */
    public C3368k mo11342e() {
        int i = this.f11344f;
        C3368k[] kVarArr = this.f11343e.f11297g;
        if (i >= kVarArr.length - 1) {
            return null;
        }
        int i2 = i + 1;
        this.f11344f = i2;
        C3368k kVar = kVarArr[i2];
        m13994b();
        return kVar;
    }

    /* renamed from: f */
    public int mo11343f(byte[] bArr) {
        return mo11344g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public int mo11344g(byte[] bArr, int i, int i2) {
        return m13996d().read(bArr, i, i2);
    }

    public String toString() {
        return this.f11343e.toString();
    }
}
