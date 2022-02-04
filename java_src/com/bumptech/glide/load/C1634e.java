package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
public final class C1634e extends IOException {

    /* renamed from: b */
    private final int f6647b;

    public C1634e(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public C1634e(String str) {
        this(str, -1);
    }

    public C1634e(String str, int i) {
        this(str, i, null);
    }

    public C1634e(String str, int i, Throwable th) {
        super(str, th);
        this.f6647b = i;
    }
}
