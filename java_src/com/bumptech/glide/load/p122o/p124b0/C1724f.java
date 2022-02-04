package com.bumptech.glide.load.p122o.p124b0;

import android.content.Context;
import com.bumptech.glide.load.p122o.p124b0.C1721d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.b0.f */
public final class C1724f extends C1721d {

    /* renamed from: com.bumptech.glide.load.o.b0.f$a */
    class C1725a implements C1721d.AbstractC1722a {

        /* renamed from: a */
        final /* synthetic */ Context f6779a;

        /* renamed from: b */
        final /* synthetic */ String f6780b;

        C1725a(Context context, String str) {
            this.f6779a = context;
            this.f6780b = str;
        }

        @Override // com.bumptech.glide.load.p122o.p124b0.C1721d.AbstractC1722a
        /* renamed from: a */
        public File mo7220a() {
            File cacheDir = this.f6779a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f6780b != null ? new File(cacheDir, this.f6780b) : cacheDir;
        }
    }

    public C1724f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C1724f(Context context, String str, long j) {
        super(new C1725a(context, str), j);
    }
}
