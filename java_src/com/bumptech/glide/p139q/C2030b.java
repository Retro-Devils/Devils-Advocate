package com.bumptech.glide.p139q;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.b */
public final class C2030b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f7462a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo7721a(ImageHeaderParser imageHeaderParser) {
        this.f7462a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo7722b() {
        return this.f7462a;
    }
}
