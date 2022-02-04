package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0445c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.p104w.C1436b;

/* renamed from: com.google.android.material.datepicker.h */
public final class C3124h<S> extends DialogInterface$OnCancelListenerC0445c {

    /* renamed from: k0 */
    static final Object f10433k0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: l0 */
    static final Object f10434l0 = "CANCEL_BUTTON_TAG";

    /* renamed from: m0 */
    static final Object f10435m0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: u2 */
    static boolean m13033u2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1436b.m7075c(context, C1391b.materialCalendarStyle, C3111g.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
