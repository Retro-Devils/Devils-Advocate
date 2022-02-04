package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.digdroid.alman.dig.MyAppGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    private final MyAppGlideModule f6524a = new MyAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.digdroid.alman.dig.MyAppGlideModule");
        }
    }

    @Override // com.bumptech.glide.p138p.AbstractC2026c
    /* renamed from: a */
    public void mo6973a(Context context, ComponentCallbacks2C1610c cVar, C1618i iVar) {
        this.f6524a.mo6973a(context, cVar, iVar);
    }

    @Override // com.bumptech.glide.p138p.AbstractC2024a
    /* renamed from: b */
    public void mo6974b(Context context, C1612d dVar) {
        this.f6524a.mo6974b(context, dVar);
    }

    @Override // com.bumptech.glide.p138p.AbstractC2024a
    /* renamed from: c */
    public boolean mo6975c() {
        return this.f6524a.mo6975c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: d */
    public Set<Class<?>> mo6971d() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1608a mo6972e() {
        return new C1608a();
    }
}
