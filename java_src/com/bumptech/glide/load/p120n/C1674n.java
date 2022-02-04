package com.bumptech.glide.load.p120n;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.n */
public class C1674n extends AbstractC1653b<InputStream> {
    public C1674n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: a */
    public Class<InputStream> mo7092a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7100d(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo7102f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
