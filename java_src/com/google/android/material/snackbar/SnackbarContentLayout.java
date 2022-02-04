package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p098q.C1428a;

public class SnackbarContentLayout extends LinearLayout implements AbstractC3239a {

    /* renamed from: b */
    private TextView f10804b;

    /* renamed from: c */
    private Button f10805c;

    /* renamed from: d */
    private int f10806d;

    /* renamed from: e */
    private int f10807e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1400k.f5976t3);
        this.f10806d = obtainStyledAttributes.getDimensionPixelSize(C1400k.f5982u3, -1);
        this.f10807e = obtainStyledAttributes.getDimensionPixelSize(C1400k.f5694B3, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private static void m13532d(View view, int i, int i2) {
        if (C1013s.m5739Q(view)) {
            C1013s.m5792v0(view, C1013s.m5726D(view), i, C1013s.m5725C(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m13533e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f10804b.getPaddingTop() == i2 && this.f10804b.getPaddingBottom() == i3) {
            return z;
        }
        m13532d(this.f10804b, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.AbstractC3239a
    /* renamed from: a */
    public void mo10901a(int i, int i2) {
        this.f10804b.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f10804b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f10805c.getVisibility() == 0) {
            this.f10805c.setAlpha(1.0f);
            this.f10805c.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.AbstractC3239a
    /* renamed from: b */
    public void mo10902b(int i, int i2) {
        this.f10804b.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f10804b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f10805c.getVisibility() == 0) {
            this.f10805c.setAlpha(0.0f);
            this.f10805c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10903c(float f) {
        if (f != 1.0f) {
            this.f10805c.setTextColor(C1428a.m7055f(C1428a.m7052c(this, C1391b.colorSurface), this.f10805c.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f10805c;
    }

    public TextView getMessageView() {
        return this.f10804b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f10804b = (TextView) findViewById(C1395f.snackbar_text);
        this.f10805c = (Button) findViewById(C1395f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m13533e(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m13533e(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f10807e = i;
    }
}
