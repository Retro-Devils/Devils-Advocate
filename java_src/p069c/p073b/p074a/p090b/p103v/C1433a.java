package p069c.p073b.p074a.p090b.p103v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0276s;
import androidx.core.widget.C0412c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p098q.C1428a;

/* renamed from: c.b.a.b.v.a */
public class C1433a extends C0276s {

    /* renamed from: e */
    private static final int f6057e = C1399j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: f */
    private static final int[][] f6058f = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: g */
    private ColorStateList f6059g;

    /* renamed from: h */
    private boolean f6060h;

    public C1433a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.f5675t);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1433a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p069c.p073b.p074a.p090b.p103v.C1433a.f6057e
            android.content.Context r8 = com.google.android.material.theme.p148a.C3288a.m13767c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p069c.p073b.p074a.p090b.C1400k.f5898j2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C3202o.m13430h(r0, r1, r2, r3, r4, r5)
            int r10 = p069c.p073b.p074a.p090b.C1400k.f5905k2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p069c.p073b.p074a.p090b.p104w.C1437c.m7077a(r8, r9, r10)
            androidx.core.widget.C0412c.m2079c(r7, r8)
        L_0x0028:
            int r8 = p069c.p073b.p074a.p090b.C1400k.f5912l2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f6060h = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069c.p073b.p074a.p090b.p103v.C1433a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6059g == null) {
            int c = C1428a.m7052c(this, C1391b.f5671f);
            int c2 = C1428a.m7052c(this, C1391b.colorOnSurface);
            int c3 = C1428a.m7052c(this, C1391b.colorSurface);
            int[][] iArr = f6058f;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C1428a.m7055f(c3, c, 1.0f);
            iArr2[1] = C1428a.m7055f(c3, c2, 0.54f);
            iArr2[2] = C1428a.m7055f(c3, c2, 0.38f);
            iArr2[3] = C1428a.m7055f(c3, c2, 0.38f);
            this.f6059g = new ColorStateList(iArr, iArr2);
        }
        return this.f6059g;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6060h && C0412c.m2078b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6060h = z;
        C0412c.m2079c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
