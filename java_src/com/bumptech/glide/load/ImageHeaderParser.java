package com.bumptech.glide.load;

import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: b */
        private final boolean f6624b;

        private ImageType(boolean z) {
            this.f6624b = z;
        }

        public boolean hasAlpha() {
            return this.f6624b;
        }
    }

    /* renamed from: a */
    ImageType mo7068a(ByteBuffer byteBuffer);

    /* renamed from: b */
    int mo7069b(InputStream inputStream, AbstractC1690b bVar);

    /* renamed from: c */
    ImageType mo7070c(InputStream inputStream);
}
