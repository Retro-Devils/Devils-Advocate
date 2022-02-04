package com.bumptech.glide.load.p128q.p129d;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p006b.p048k.p049a.C1060a;

/* renamed from: com.bumptech.glide.load.q.d.p */
public final class C1936p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7068a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public int mo7069b(InputStream inputStream, AbstractC1690b bVar) {
        int d = new C1060a(inputStream).mo5680d("Orientation", 1);
        if (d == 0) {
            return -1;
        }
        return d;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7070c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
