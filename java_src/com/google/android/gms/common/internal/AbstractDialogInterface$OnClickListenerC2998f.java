package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class AbstractDialogInterface$OnClickListenerC2998f implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC2998f m12305a(Activity activity, Intent intent, int i) {
        return new C3035w(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9763b();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo9763b();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
