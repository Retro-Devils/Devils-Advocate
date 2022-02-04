package com.bumptech.glide.load.p122o.p123a0;

import android.graphics.Bitmap;
import com.bumptech.glide.p144t.C2082k;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.a0.c */
public class C1691c implements AbstractC1707l {

    /* renamed from: a */
    private final C1693b f6722a = new C1693b();

    /* renamed from: b */
    private final C1698h<C1692a, Bitmap> f6723b = new C1698h<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.a0.c$a */
    public static class C1692a implements AbstractC1708m {

        /* renamed from: a */
        private final C1693b f6724a;

        /* renamed from: b */
        private int f6725b;

        /* renamed from: c */
        private int f6726c;

        /* renamed from: d */
        private Bitmap.Config f6727d;

        public C1692a(C1693b bVar) {
            this.f6724a = bVar;
        }

        @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1708m
        /* renamed from: a */
        public void mo7170a() {
            this.f6724a.mo7179c(this);
        }

        /* renamed from: b */
        public void mo7171b(int i, int i2, Bitmap.Config config) {
            this.f6725b = i;
            this.f6726c = i2;
            this.f6727d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1692a)) {
                return false;
            }
            C1692a aVar = (C1692a) obj;
            return this.f6725b == aVar.f6725b && this.f6726c == aVar.f6726c && this.f6727d == aVar.f6727d;
        }

        public int hashCode() {
            int i = ((this.f6725b * 31) + this.f6726c) * 31;
            Bitmap.Config config = this.f6727d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1691c.m8007g(this.f6725b, this.f6726c, this.f6727d);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.c$b */
    static class C1693b extends AbstractC1694d<C1692a> {
        C1693b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1692a mo7175a() {
            return new C1692a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1692a mo7177e(int i, int i2, Bitmap.Config config) {
            C1692a aVar = (C1692a) mo7178b();
            aVar.mo7171b(i, i2, config);
            return aVar;
        }
    }

    C1691c() {
    }

    /* renamed from: g */
    static String m8007g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: h */
    private static String m8008h(Bitmap bitmap) {
        return m8007g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: a */
    public int mo7163a(Bitmap bitmap) {
        return C2082k.m9440g(bitmap);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: b */
    public Bitmap mo7164b() {
        return this.f6723b.mo7189f();
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: c */
    public Bitmap mo7165c(int i, int i2, Bitmap.Config config) {
        return this.f6723b.mo7187a(this.f6722a.mo7177e(i, i2, config));
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: d */
    public void mo7166d(Bitmap bitmap) {
        this.f6723b.mo7188d(this.f6722a.mo7177e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: e */
    public String mo7167e(int i, int i2, Bitmap.Config config) {
        return m8007g(i, i2, config);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: f */
    public String mo7168f(Bitmap bitmap) {
        return m8008h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f6723b;
    }
}
