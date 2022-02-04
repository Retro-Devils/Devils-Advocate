package com.bumptech.glide.load.p128q.p130e;

import com.bumptech.glide.load.p120n.AbstractC1657e;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.e.a */
public class C1952a implements AbstractC1657e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f7256a;

    /* renamed from: com.bumptech.glide.load.q.e.a$a */
    public static class C1953a implements AbstractC1657e.AbstractC1658a<ByteBuffer> {
        @Override // com.bumptech.glide.load.p120n.AbstractC1657e.AbstractC1658a
        /* renamed from: a */
        public Class<ByteBuffer> mo7112a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public AbstractC1657e<ByteBuffer> mo7113b(ByteBuffer byteBuffer) {
            return new C1952a(byteBuffer);
        }
    }

    public C1952a(ByteBuffer byteBuffer) {
        this.f7256a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1657e
    /* renamed from: b */
    public void mo7111b() {
    }

    /* renamed from: c */
    public ByteBuffer mo7110a() {
        this.f7256a.position(0);
        return this.f7256a;
    }
}
