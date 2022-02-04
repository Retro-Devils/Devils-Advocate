package com.bumptech.glide.load.p120n;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: com.bumptech.glide.load.n.h */
public class C1663h extends AbstractC1653b<ParcelFileDescriptor> {
    public C1663h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo7092a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7100d(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ParcelFileDescriptor mo7102f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
