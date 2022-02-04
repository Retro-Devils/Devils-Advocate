package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0725g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.n */
public class C3133n extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.n$a */
    class C3134a extends C0725g {
        C3134a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g
        /* renamed from: v */
        public float mo4427v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C3133n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Q1 */
    public void mo3385Q1(RecyclerView recyclerView, RecyclerView.C0649a0 a0Var, int i) {
        C3134a aVar = new C3134a(recyclerView.getContext());
        aVar.mo4244p(i);
        mo3389R1(aVar);
    }
}
