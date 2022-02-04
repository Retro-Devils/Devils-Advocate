package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.w */
public final class C3035w extends AbstractDialogInterface$OnClickListenerC2998f {

    /* renamed from: b */
    private final /* synthetic */ Intent f10036b;

    /* renamed from: c */
    private final /* synthetic */ Activity f10037c;

    /* renamed from: d */
    private final /* synthetic */ int f10038d;

    C3035w(Intent intent, Activity activity, int i) {
        this.f10036b = intent;
        this.f10037c = activity;
        this.f10038d = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC2998f
    /* renamed from: b */
    public final void mo9763b() {
        Intent intent = this.f10036b;
        if (intent != null) {
            this.f10037c.startActivityForResult(intent, this.f10038d);
        }
    }
}
