package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p120n.C1671m;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p128q.p129d.C1945w;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
public final class C1635f {

    /* renamed from: com.bumptech.glide.load.f$a */
    class C1636a implements AbstractC1642g {

        /* renamed from: a */
        final /* synthetic */ InputStream f6648a;

        C1636a(InputStream inputStream) {
            this.f6648a = inputStream;
        }

        @Override // com.bumptech.glide.load.C1635f.AbstractC1642g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7073a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7070c(this.f6648a);
            } finally {
                this.f6648a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$b */
    class C1637b implements AbstractC1642g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f6649a;

        C1637b(ByteBuffer byteBuffer) {
            this.f6649a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C1635f.AbstractC1642g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7073a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.mo7068a(this.f6649a);
        }
    }

    /* renamed from: com.bumptech.glide.load.f$c */
    class C1638c implements AbstractC1642g {

        /* renamed from: a */
        final /* synthetic */ C1671m f6650a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1690b f6651b;

        C1638c(C1671m mVar, AbstractC1690b bVar) {
            this.f6650a = mVar;
            this.f6651b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        @Override // com.bumptech.glide.load.C1635f.AbstractC1642g
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo7073a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.q.d.w r1 = new com.bumptech.glide.load.q.d.w     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.n.m r3 = r4.f6650a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo7110a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.o.a0.b r3 = r4.f6651b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo7070c(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.n.m r0 = r4.f6650a
                r0.mo7110a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.n.m r0 = r4.f6650a
                r0.mo7110a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1635f.C1638c.mo7073a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$d */
    class C1639d implements AbstractC1641f {

        /* renamed from: a */
        final /* synthetic */ InputStream f6652a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1690b f6653b;

        C1639d(InputStream inputStream, AbstractC1690b bVar) {
            this.f6652a = inputStream;
            this.f6653b = bVar;
        }

        @Override // com.bumptech.glide.load.C1635f.AbstractC1641f
        /* renamed from: a */
        public int mo7074a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo7069b(this.f6652a, this.f6653b);
            } finally {
                this.f6652a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$e */
    class C1640e implements AbstractC1641f {

        /* renamed from: a */
        final /* synthetic */ C1671m f6654a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1690b f6655b;

        C1640e(C1671m mVar, AbstractC1690b bVar) {
            this.f6654a = mVar;
            this.f6655b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        @Override // com.bumptech.glide.load.C1635f.AbstractC1641f
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo7074a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.q.d.w r1 = new com.bumptech.glide.load.q.d.w     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.n.m r3 = r4.f6654a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo7110a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.o.a0.b r3 = r4.f6655b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.o.a0.b r0 = r4.f6655b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo7069b(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.n.m r0 = r4.f6654a
                r0.mo7110a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.n.m r0 = r4.f6654a
                r0.mo7110a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1635f.C1640e.mo7074a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.f$f */
    public interface AbstractC1641f {
        /* renamed from: a */
        int mo7074a(ImageHeaderParser imageHeaderParser);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.f$g */
    public interface AbstractC1642g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo7073a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m7854a(List<ImageHeaderParser> list, C1671m mVar, AbstractC1690b bVar) {
        return m7856c(list, new C1640e(mVar, bVar));
    }

    /* renamed from: b */
    public static int m7855b(List<ImageHeaderParser> list, InputStream inputStream, AbstractC1690b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1945w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m7856c(list, new C1639d(inputStream, bVar));
    }

    /* renamed from: c */
    private static int m7856c(List<ImageHeaderParser> list, AbstractC1641f fVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo7074a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m7857d(List<ImageHeaderParser> list, C1671m mVar, AbstractC1690b bVar) {
        return m7860g(list, new C1638c(mVar, bVar));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m7858e(List<ImageHeaderParser> list, InputStream inputStream, AbstractC1690b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1945w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m7860g(list, new C1636a(inputStream));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m7859f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m7860g(list, new C1637b(byteBuffer));
    }

    /* renamed from: g */
    private static ImageHeaderParser.ImageType m7860g(List<ImageHeaderParser> list, AbstractC1642g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = gVar.mo7073a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
