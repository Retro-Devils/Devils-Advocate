package com.bumptech.glide.load.p120n;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.l */
public abstract class AbstractC1670l<T> implements AbstractC1655d<T> {

    /* renamed from: b */
    private final Uri f6682b;

    /* renamed from: c */
    private final ContentResolver f6683c;

    /* renamed from: d */
    private T f6684d;

    public AbstractC1670l(ContentResolver contentResolver, Uri uri) {
        this.f6683c = contentResolver;
        this.f6682b = uri;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: b */
    public void mo7097b() {
        T t = this.f6684d;
        if (t != null) {
            try {
                mo7093d(t);
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
    public abstract void mo7093d(T t);

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: e */
    public final void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super T> aVar) {
        try {
            T f = mo7094f(this.f6682b, this.f6683c);
            this.f6684d = f;
            aVar.mo7109f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo7108d(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo7094f(Uri uri, ContentResolver contentResolver);
}
