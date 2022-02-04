package com.bumptech.glide.load.p120n;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.b */
public abstract class AbstractC1653b<T> implements AbstractC1655d<T> {

    /* renamed from: b */
    private final String f6658b;

    /* renamed from: c */
    private final AssetManager f6659c;

    /* renamed from: d */
    private T f6660d;

    public AbstractC1653b(AssetManager assetManager, String str) {
        this.f6659c = assetManager;
        this.f6658b = str;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: b */
    public void mo7097b() {
        T t = this.f6660d;
        if (t != null) {
            try {
                mo7100d(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: c */
    public EnumC1630a mo7098c() {
        return EnumC1630a.LOCAL;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    public void cancel() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo7100d(T t);

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: e */
    public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super T> aVar) {
        try {
            T f = mo7102f(this.f6659c, this.f6658b);
            this.f6660d = f;
            aVar.mo7109f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo7108d(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo7102f(AssetManager assetManager, String str);
}
