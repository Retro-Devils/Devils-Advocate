package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.w */
public final class C3035w extends AbstractDialogInterface$OnClickListenerC2998f {

    /* renamed from: b */
    private final /* synthetic */ Intent f10044b;

    /* renamed from: c */
    private final /* synthetic */ Activity f10045c;

    /* renamed from: d */
    private final /* synthetic */ int f10046d;

    C3035w(Intent intent, Activity activity, int i) {
        this.f10044b = intent;
        this.f10045c = activity;
        this.f10046d = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC2998f
    /* renamed from: b */
    public final void mo9763b() {
        Intent intent = this.f10044b;
        if (intent != null) {
            this.f10045c.startActivityForResult(intent, this.f10046d);
        }
    }
}
