package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.q */
public class C3208q extends ImageButton {

    /* renamed from: b */
    private int f10730b;

    /* renamed from: b */
    public final void mo10802b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f10730b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f10730b;
    }

    public void setVisibility(int i) {
        mo10802b(i, true);
    }
}
