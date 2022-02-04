package com.bumptech.glide.load.p120n;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.p120n.AbstractC1657e;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.m */
public final class C1671m implements AbstractC1657e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final C1673b f6693a;

    /* renamed from: com.bumptech.glide.load.n.m$a */
    public static final class C1672a implements AbstractC1657e.AbstractC1658a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p120n.AbstractC1657e.AbstractC1658a
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo7112a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public AbstractC1657e<ParcelFileDescriptor> mo7113b(ParcelFileDescriptor parcelFileDescriptor) {
            return new C1671m(parcelFileDescriptor);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.n.m$b */
    public static final class C1673b {

        /* renamed from: a */
        private final ParcelFileDescriptor f6694a;

        C1673b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6694a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ParcelFileDescriptor mo7132a() {
            try {
                Os.lseek(this.f6694a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f6694a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public C1671m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6693a = new C1673b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m7948c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1657e
    /* renamed from: b */
    public void mo7111b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo7110a() {
        return this.f6693a.mo7132a();
    }
}
