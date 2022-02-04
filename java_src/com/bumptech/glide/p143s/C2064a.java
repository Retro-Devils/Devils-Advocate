package com.bumptech.glide.p143s;

import android.content.Context;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.p144t.C2082k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.s.a */
public final class C2064a implements AbstractC1643g {

    /* renamed from: b */
    private final int f7570b;

    /* renamed from: c */
    private final AbstractC1643g f7571c;

    private C2064a(int i, AbstractC1643g gVar) {
        this.f7570b = i;
        this.f7571c = gVar;
    }

    /* renamed from: c */
    public static AbstractC1643g m9389c(Context context) {
        return new C2064a(context.getResources().getConfiguration().uiMode & 48, C2065b.m9393c(context));
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        this.f7571c.mo7075a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7570b).array());
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (!(obj instanceof C2064a)) {
            return false;
        }
        C2064a aVar = (C2064a) obj;
        return this.f7570b == aVar.f7570b && this.f7571c.equals(aVar.f7571c);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        return C2082k.m9446m(this.f7571c, this.f7570b);
    }
}
