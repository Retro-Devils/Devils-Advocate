package p069c.p070a.p071a.p072w;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p069c.p070a.p071a.AbstractC1222b;
import p069c.p070a.p071a.C1232g;
import p069c.p070a.p071a.C1253v;

/* renamed from: c.a.a.w.e */
public class C1261e implements AbstractC1222b {

    /* renamed from: a */
    private final Map<String, C1262a> f5506a;

    /* renamed from: b */
    private long f5507b;

    /* renamed from: c */
    private final File f5508c;

    /* renamed from: d */
    private final int f5509d;

    /* access modifiers changed from: package-private */
    /* renamed from: c.a.a.w.e$a */
    public static class C1262a {

        /* renamed from: a */
        long f5510a;

        /* renamed from: b */
        final String f5511b;

        /* renamed from: c */
        final String f5512c;

        /* renamed from: d */
        final long f5513d;

        /* renamed from: e */
        final long f5514e;

        /* renamed from: f */
        final long f5515f;

        /* renamed from: g */
        final long f5516g;

        /* renamed from: h */
        final List<C1232g> f5517h;

        C1262a(String str, AbstractC1222b.C1223a aVar) {
            this(str, aVar.f5407b, aVar.f5408c, aVar.f5409d, aVar.f5410e, aVar.f5411f, m6708a(aVar));
            this.f5510a = (long) aVar.f5406a.length;
        }

        private C1262a(String str, String str2, long j, long j2, long j3, long j4, List<C1232g> list) {
            this.f5511b = str;
            this.f5512c = "".equals(str2) ? null : str2;
            this.f5513d = j;
            this.f5514e = j2;
            this.f5515f = j3;
            this.f5516g = j4;
            this.f5517h = list;
        }

        /* renamed from: a */
        private static List<C1232g> m6708a(AbstractC1222b.C1223a aVar) {
            List<C1232g> list = aVar.f5413h;
            return list != null ? list : C1266g.m6724g(aVar.f5412g);
        }

        /* renamed from: b */
        static C1262a m6709b(C1263b bVar) {
            if (C1261e.m6692l(bVar) == 538247942) {
                return new C1262a(C1261e.m6694n(bVar), C1261e.m6694n(bVar), C1261e.m6693m(bVar), C1261e.m6693m(bVar), C1261e.m6693m(bVar), C1261e.m6693m(bVar), C1261e.m6691k(bVar));
            }
            throw new IOException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public AbstractC1222b.C1223a mo6241c(byte[] bArr) {
            AbstractC1222b.C1223a aVar = new AbstractC1222b.C1223a();
            aVar.f5406a = bArr;
            aVar.f5407b = this.f5512c;
            aVar.f5408c = this.f5513d;
            aVar.f5409d = this.f5514e;
            aVar.f5410e = this.f5515f;
            aVar.f5411f = this.f5516g;
            aVar.f5412g = C1266g.m6725h(this.f5517h);
            aVar.f5413h = Collections.unmodifiableList(this.f5517h);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6242d(OutputStream outputStream) {
            try {
                C1261e.m6698s(outputStream, 538247942);
                C1261e.m6700u(outputStream, this.f5511b);
                String str = this.f5512c;
                if (str == null) {
                    str = "";
                }
                C1261e.m6700u(outputStream, str);
                C1261e.m6699t(outputStream, this.f5513d);
                C1261e.m6699t(outputStream, this.f5514e);
                C1261e.m6699t(outputStream, this.f5515f);
                C1261e.m6699t(outputStream, this.f5516g);
                C1261e.m6697r(this.f5517h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C1253v.m6666b("%s", e.toString());
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.a.a.w.e$b */
    public static class C1263b extends FilterInputStream {

        /* renamed from: b */
        private final long f5518b;

        /* renamed from: c */
        private long f5519c;

        C1263b(InputStream inputStream, long j) {
            super(inputStream);
            this.f5518b = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo6243a() {
            return this.f5518b - this.f5519c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f5519c++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f5519c += (long) read;
            }
            return read;
        }
    }

    public C1261e(File file) {
        this(file, 5242880);
    }

    public C1261e(File file, int i) {
        this.f5506a = new LinkedHashMap(16, 0.75f, true);
        this.f5507b = 0;
        this.f5508c = file;
        this.f5509d = i;
    }

    /* renamed from: g */
    private String m6687g(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: h */
    private void m6688h(int i) {
        long j;
        long j2 = (long) i;
        if (this.f5507b + j2 >= ((long) this.f5509d)) {
            if (C1253v.f5488b) {
                C1253v.m6669e("Pruning old cache entries.", new Object[0]);
            }
            long j3 = this.f5507b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C1262a>> it = this.f5506a.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C1262a value = it.next().getValue();
                if (mo6239f(value.f5511b).delete()) {
                    j = j2;
                    this.f5507b -= value.f5510a;
                } else {
                    j = j2;
                    String str = value.f5511b;
                    C1253v.m6666b("Could not delete cache entry for key=%s, filename=%s", str, m6687g(str));
                }
                it.remove();
                i2++;
                if (((float) (this.f5507b + j)) < ((float) this.f5509d) * 0.9f) {
                    break;
                }
                j2 = j;
            }
            if (C1253v.f5488b) {
                C1253v.m6669e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f5507b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: i */
    private void m6689i(String str, C1262a aVar) {
        if (!this.f5506a.containsKey(str)) {
            this.f5507b += aVar.f5510a;
        } else {
            this.f5507b += aVar.f5510a - this.f5506a.get(str).f5510a;
        }
        this.f5506a.put(str, aVar);
    }

    /* renamed from: j */
    private static int m6690j(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: k */
    static List<C1232g> m6691k(C1263b bVar) {
        int l = m6692l(bVar);
        if (l >= 0) {
            List<C1232g> emptyList = l == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < l; i++) {
                emptyList.add(new C1232g(m6694n(bVar).intern(), m6694n(bVar).intern()));
            }
            return emptyList;
        }
        throw new IOException("readHeaderList size=" + l);
    }

    /* renamed from: l */
    static int m6692l(InputStream inputStream) {
        return (m6690j(inputStream) << 24) | (m6690j(inputStream) << 0) | 0 | (m6690j(inputStream) << 8) | (m6690j(inputStream) << 16);
    }

    /* renamed from: m */
    static long m6693m(InputStream inputStream) {
        return ((((long) m6690j(inputStream)) & 255) << 0) | 0 | ((((long) m6690j(inputStream)) & 255) << 8) | ((((long) m6690j(inputStream)) & 255) << 16) | ((((long) m6690j(inputStream)) & 255) << 24) | ((((long) m6690j(inputStream)) & 255) << 32) | ((((long) m6690j(inputStream)) & 255) << 40) | ((((long) m6690j(inputStream)) & 255) << 48) | ((255 & ((long) m6690j(inputStream))) << 56);
    }

    /* renamed from: n */
    static String m6694n(C1263b bVar) {
        return new String(m6696q(bVar, m6693m(bVar)), "UTF-8");
    }

    /* renamed from: p */
    private void m6695p(String str) {
        C1262a remove = this.f5506a.remove(str);
        if (remove != null) {
            this.f5507b -= remove.f5510a;
        }
    }

    /* renamed from: q */
    static byte[] m6696q(C1263b bVar, long j) {
        long a = bVar.mo6243a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    /* renamed from: r */
    static void m6697r(List<C1232g> list, OutputStream outputStream) {
        if (list != null) {
            m6698s(outputStream, list.size());
            for (C1232g gVar : list) {
                m6700u(outputStream, gVar.mo6169a());
                m6700u(outputStream, gVar.mo6170b());
            }
            return;
        }
        m6698s(outputStream, 0);
    }

    /* renamed from: s */
    static void m6698s(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: t */
    static void m6699t(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: u */
    static void m6700u(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m6699t(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // p069c.p070a.p071a.AbstractC1222b
    /* renamed from: a */
    public synchronized void mo6149a() {
        if (!this.f5508c.exists()) {
            if (!this.f5508c.mkdirs()) {
                C1253v.m6667c("Unable to create cache dir %s", this.f5508c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f5508c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    C1263b bVar = new C1263b(new BufferedInputStream(mo6237d(file)), length);
                    try {
                        C1262a b = C1262a.m6709b(bVar);
                        b.f5510a = length;
                        m6689i(b.f5511b, b);
                    } finally {
                        bVar.close();
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // p069c.p070a.p071a.AbstractC1222b
    /* renamed from: b */
    public synchronized void mo6150b(String str, AbstractC1222b.C1223a aVar) {
        m6688h(aVar.f5406a.length);
        File f = mo6239f(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(mo6238e(f));
            C1262a aVar2 = new C1262a(str, aVar);
            if (aVar2.mo6242d(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f5406a);
                bufferedOutputStream.close();
                m6689i(str, aVar2);
            } else {
                bufferedOutputStream.close();
                C1253v.m6666b("Failed to write header for %s", f.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!f.delete()) {
                C1253v.m6666b("Could not clean up file %s", f.getAbsolutePath());
            }
        }
    }

    @Override // p069c.p070a.p071a.AbstractC1222b
    /* renamed from: c */
    public synchronized AbstractC1222b.C1223a mo6151c(String str) {
        C1262a aVar = this.f5506a.get(str);
        if (aVar == null) {
            return null;
        }
        File f = mo6239f(str);
        try {
            C1263b bVar = new C1263b(new BufferedInputStream(mo6237d(f)), f.length());
            try {
                C1262a b = C1262a.m6709b(bVar);
                if (!TextUtils.equals(str, b.f5511b)) {
                    C1253v.m6666b("%s: key=%s, found=%s", f.getAbsolutePath(), str, b.f5511b);
                    m6695p(str);
                    return null;
                }
                AbstractC1222b.C1223a c = aVar.mo6241c(m6696q(bVar, bVar.mo6243a()));
                bVar.close();
                return c;
            } finally {
                bVar.close();
            }
        } catch (IOException e) {
            C1253v.m6666b("%s: %s", f.getAbsolutePath(), e.toString());
            mo6240o(str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public InputStream mo6237d(File file) {
        return new FileInputStream(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public OutputStream mo6238e(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: f */
    public File mo6239f(String str) {
        return new File(this.f5508c, m6687g(str));
    }

    /* renamed from: o */
    public synchronized void mo6240o(String str) {
        boolean delete = mo6239f(str).delete();
        m6695p(str);
        if (!delete) {
            C1253v.m6666b("Could not delete cache entry for key=%s, filename=%s", str, m6687g(str));
        }
    }
}
