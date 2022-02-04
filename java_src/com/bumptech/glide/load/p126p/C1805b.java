package com.bumptech.glide.load.p126p;

import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.b */
public class C1805b<Data> implements AbstractC1843n<byte[], Data> {

    /* renamed from: a */
    private final AbstractC1808b<Data> f7036a;

    /* renamed from: com.bumptech.glide.load.p.b$a */
    public static class C1806a implements AbstractC1845o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.p.b$a$a */
        class C1807a implements AbstractC1808b<ByteBuffer> {
            C1807a() {
            }

            @Override // com.bumptech.glide.load.p126p.C1805b.AbstractC1808b
            /* renamed from: a */
            public Class<ByteBuffer> mo7401a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo7402b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<byte[], ByteBuffer> mo7398b(C1851r rVar) {
            return new C1805b(new C1807a());
        }
    }

    /* renamed from: com.bumptech.glide.load.p.b$b */
    public interface AbstractC1808b<Data> {
        /* renamed from: a */
        Class<Data> mo7401a();

        /* renamed from: b */
        Data mo7402b(byte[] bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.b$c */
    public static class C1809c<Data> implements AbstractC1655d<Data> {

        /* renamed from: b */
        private final byte[] f7038b;

        /* renamed from: c */
        private final AbstractC1808b<Data> f7039c;

        C1809c(byte[] bArr, AbstractC1808b<Data> bVar) {
            this.f7038b = bArr;
            this.f7039c = bVar;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<Data> mo7092a() {
            return this.f7039c.mo7401a();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: c */
        public EnumC1630a mo7098c() {
            return EnumC1630a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: e */
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super Data> aVar) {
            aVar.mo7109f(this.f7039c.mo7402b(this.f7038b));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.b$d */
    public static class C1810d implements AbstractC1845o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.p.b$d$a */
        class C1811a implements AbstractC1808b<InputStream> {
            C1811a() {
            }

            @Override // com.bumptech.glide.load.p126p.C1805b.AbstractC1808b
            /* renamed from: a */
            public Class<InputStream> mo7401a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo7402b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<byte[], InputStream> mo7398b(C1851r rVar) {
            return new C1805b(new C1811a());
        }
    }

    public C1805b(AbstractC1808b<Data> bVar) {
        this.f7036a = bVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<Data> mo7393a(byte[] bArr, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(bArr), new C1809c(bArr, this.f7036a));
    }

    /* renamed from: d */
    public boolean mo7394b(byte[] bArr) {
        return true;
    }
}
