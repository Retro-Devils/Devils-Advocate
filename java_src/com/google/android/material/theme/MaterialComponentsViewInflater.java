package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0099h;
import androidx.appcompat.widget.C0215d;
import androidx.appcompat.widget.C0222f;
import androidx.appcompat.widget.C0225g;
import androidx.appcompat.widget.C0276s;
import androidx.appcompat.widget.C0302y;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C3280g;
import com.google.android.material.textview.MaterialTextView;
import p069c.p073b.p074a.p090b.p095o.C1416a;
import p069c.p073b.p074a.p090b.p103v.C1433a;

public class MaterialComponentsViewInflater extends C0099h {
    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.C0099h
    /* renamed from: b */
    public C0215d mo391b(Context context, AttributeSet attributeSet) {
        return new C3280g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.C0099h
    /* renamed from: c */
    public C0222f mo392c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.C0099h
    /* renamed from: d */
    public C0225g mo393d(Context context, AttributeSet attributeSet) {
        return new C1416a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.C0099h
    /* renamed from: j */
    public C0276s mo399j(Context context, AttributeSet attributeSet) {
        return new C1433a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.C0099h
    /* renamed from: n */
    public C0302y mo403n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
