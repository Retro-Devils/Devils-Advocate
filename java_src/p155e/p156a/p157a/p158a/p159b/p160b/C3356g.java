package p155e.p156a.p157a.p158a.p159b.p160b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import p155e.p156a.p157a.p158a.p161c.p162b.C3376a;
import p155e.p164b.p165a.AbstractC3391h;
import p155e.p164b.p165a.C3384a;
import p155e.p164b.p165a.C3385b;
import p155e.p164b.p165a.C3392i;
import p155e.p164b.p165a.C3395l;
import p155e.p164b.p165a.C3396m;
import p155e.p164b.p165a.C3397n;
import p155e.p164b.p165a.C3400q;

/* access modifiers changed from: package-private */
/* renamed from: e.a.a.a.b.b.g */
public class C3356g {

    /* renamed from: a */
    private static final Map<EnumC3370m, AbstractC3355f> f11309a = new C3357a();

    /* renamed from: e.a.a.a.b.b.g$a */
    static class C3357a extends HashMap<EnumC3370m, AbstractC3355f> {
        C3357a() {
            put(EnumC3370m.COPY, new C3360d());
            put(EnumC3370m.LZMA, new C3364g());
            put(EnumC3370m.LZMA2, new C3367j());
            put(EnumC3370m.DEFLATE, new C3361e());
            put(EnumC3370m.BZIP2, new C3359c());
            put(EnumC3370m.AES256SHA256, new C3349a());
            put(EnumC3370m.BCJ_X86_FILTER, new C3358b(new C3400q()));
            put(EnumC3370m.BCJ_PPC_FILTER, new C3358b(new C3396m()));
            put(EnumC3370m.BCJ_IA64_FILTER, new C3358b(new C3392i()));
            put(EnumC3370m.BCJ_ARM_FILTER, new C3358b(new C3384a()));
            put(EnumC3370m.BCJ_ARM_THUMB_FILTER, new C3358b(new C3385b()));
            put(EnumC3370m.BCJ_SPARC_FILTER, new C3358b(new C3397n()));
            put(EnumC3370m.DELTA_FILTER, new C3365h());
        }
    }

    /* renamed from: e.a.a.a.b.b.g$b */
    static class C3358b extends AbstractC3355f {

        /* renamed from: c */
        private final AbstractC3391h f11310c;

        C3358b(AbstractC3391h hVar) {
            super(new Class[0]);
            this.f11310c = hVar;
        }

        /* access modifiers changed from: package-private */
        @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
        /* renamed from: b */
        public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
            try {
                return this.f11310c.mo11374a(inputStream);
            } catch (AssertionError e) {
                throw new IOException("BCJ filter used in " + str + " needs XZ for Java > 1.4 - see " + "http://commons.apache.org/proper/commons-compress/limitations.html#7Z", e);
            }
        }
    }

    /* renamed from: e.a.a.a.b.b.g$c */
    static class C3359c extends AbstractC3355f {
        C3359c() {
            super(Number.class);
        }

        /* access modifiers changed from: package-private */
        @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
        /* renamed from: b */
        public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
            return new C3376a(inputStream);
        }
    }

    /* renamed from: e.a.a.a.b.b.g$d */
    static class C3360d extends AbstractC3355f {
        C3360d() {
            super(new Class[0]);
        }

        /* access modifiers changed from: package-private */
        @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
        /* renamed from: b */
        public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
            return inputStream;
        }
    }

    /* renamed from: e.a.a.a.b.b.g$e */
    static class C3361e extends AbstractC3355f {

        /* renamed from: e.a.a.a.b.b.g$e$a */
        class C3362a extends InputStream {

            /* renamed from: b */
            final /* synthetic */ InflaterInputStream f11311b;

            /* renamed from: c */
            final /* synthetic */ Inflater f11312c;

            C3362a(InflaterInputStream inflaterInputStream, Inflater inflater) {
                this.f11311b = inflaterInputStream;
                this.f11312c = inflater;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
            public void close() {
                try {
                    this.f11311b.close();
                } finally {
                    this.f11312c.end();
                }
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f11311b.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr) {
                return this.f11311b.read(bArr);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                return this.f11311b.read(bArr, i, i2);
            }
        }

        C3361e() {
            super(Number.class);
        }

        /* access modifiers changed from: package-private */
        @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
        /* renamed from: b */
        public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
            Inflater inflater = new Inflater(true);
            return new C3362a(new InflaterInputStream(new C3363f(inputStream, null), inflater), inflater);
        }
    }

    /* renamed from: e.a.a.a.b.b.g$f */
    private static class C3363f extends FilterInputStream {

        /* renamed from: b */
        private boolean f11314b;

        private C3363f(InputStream inputStream) {
            super(inputStream);
            this.f11314b = true;
        }

        /* synthetic */ C3363f(InputStream inputStream, C3357a aVar) {
            this(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1 || !this.f11314b) {
                return read;
            }
            this.f11314b = false;
            return 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1 || !this.f11314b) {
                return read;
            }
            this.f11314b = false;
            bArr[i] = 0;
            return 1;
        }
    }

    /* renamed from: e.a.a.a.b.b.g$g */
    static class C3364g extends AbstractC3355f {
        C3364g() {
            super(new Class[0]);
        }

        /* access modifiers changed from: package-private */
        @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
        /* renamed from: b */
        public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
            byte[] bArr2 = eVar.f11306d;
            byte b = bArr2[0];
            int i = 1;
            long j2 = (long) bArr2[1];
            while (i < 4) {
                int i2 = i + 1;
                j2 |= (((long) eVar.f11306d[i2]) & 255) << (i * 8);
                i = i2;
            }
            if (j2 <= 2147483632) {
                return new C3395l(inputStream, j, b, (int) j2);
            }
            throw new IOException("Dictionary larger than 4GiB maximum size used in " + str);
        }
    }

    /* renamed from: a */
    static InputStream m13949a(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
        AbstractC3355f b = m13950b(EnumC3370m.m14015a(eVar.f11303a));
        if (b != null) {
            return b.mo11293b(str, inputStream, j, eVar, bArr);
        }
        throw new IOException("Unsupported compression method " + Arrays.toString(eVar.f11303a) + " used in " + str);
    }

    /* renamed from: b */
    static AbstractC3355f m13950b(EnumC3370m mVar) {
        return f11309a.get(mVar);
    }
}
