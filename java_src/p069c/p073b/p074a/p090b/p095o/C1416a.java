package p069c.p073b.p074a.p090b.p095o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0225g;
import androidx.core.widget.C0412c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p098q.C1428a;

/* renamed from: c.b.a.b.o.a */
public class C1416a extends C0225g {

    /* renamed from: e */
    private static final int f6038e = C1399j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: f */
    private static final int[][] f6039f = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: g */
    private ColorStateList f6040g;

    /* renamed from: h */
    private boolean f6041h;

    public C1416a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.f5670c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1416a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p069c.p073b.p074a.p090b.p095o.C1416a.f6038e
            android.content.Context r8 = com.google.android.material.theme.p148a.C3288a.m13767c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p069c.p073b.p074a.p090b.C1400k.f5877g2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C3202o.m13430h(r0, r1, r2, r3, r4, r5)
            int r10 = p069c.p073b.p074a.p090b.C1400k.f5884h2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p069c.p073b.p074a.p090b.p104w.C1437c.m7077a(r8, r9, r10)
            androidx.core.widget.C0412c.m2079c(r7, r8)
        L_0x0028:
            int r8 = p069c.p073b.p074a.p090b.C1400k.f5891i2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f6041h = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069c.p073b.p074a.p090b.p095o.C1416a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6040g == null) {
            int[][] iArr = f6039f;
            int[] iArr2 = new int[iArr.length];
            int c = C1428a.m7052c(this, C1391b.f5671f);
            int c2 = C1428a.m7052c(this, C1391b.colorSurface);
            int c3 = C1428a.m7052c(this, C1391b.colorOnSurface);
            iArr2[0] = C1428a.m7055f(c2, c, 1.0f);
            iArr2[1] = C1428a.m7055f(c2, c3, 0.54f);
            iArr2[2] = C1428a.m7055f(c2, c3, 0.38f);
            iArr2[3] = C1428a.m7055f(c2, c3, 0.38f);
            this.f6040g = new ColorStateList(iArr, iArr2);
        }
        return this.f6040g;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6041h && C0412c.m2078b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6041h = z;
        C0412c.m2079c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
