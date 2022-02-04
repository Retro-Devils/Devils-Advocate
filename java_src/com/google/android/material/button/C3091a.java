package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0398a;
import com.google.android.material.internal.C3203p;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p098q.C1428a;
import p069c.p073b.p074a.p090b.p104w.C1437c;
import p069c.p073b.p074a.p090b.p105x.C1443a;
import p069c.p073b.p074a.p090b.p105x.C1446b;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
public class C3091a {

    /* renamed from: a */
    private static final boolean f10261a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private final MaterialButton f10262b;

    /* renamed from: c */
    private C1462k f10263c;

    /* renamed from: d */
    private int f10264d;

    /* renamed from: e */
    private int f10265e;

    /* renamed from: f */
    private int f10266f;

    /* renamed from: g */
    private int f10267g;

    /* renamed from: h */
    private int f10268h;

    /* renamed from: i */
    private int f10269i;

    /* renamed from: j */
    private PorterDuff.Mode f10270j;

    /* renamed from: k */
    private ColorStateList f10271k;

    /* renamed from: l */
    private ColorStateList f10272l;

    /* renamed from: m */
    private ColorStateList f10273m;

    /* renamed from: n */
    private Drawable f10274n;

    /* renamed from: o */
    private boolean f10275o = false;

    /* renamed from: p */
    private boolean f10276p = false;

    /* renamed from: q */
    private boolean f10277q = false;

    /* renamed from: r */
    private boolean f10278r;

    /* renamed from: s */
    private LayerDrawable f10279s;

    C3091a(MaterialButton materialButton, C1462k kVar) {
        this.f10262b = materialButton;
        this.f10263c = kVar;
    }

    /* renamed from: A */
    private void m12753A(C1462k kVar) {
        if (mo10066d() != null) {
            mo10066d().setShapeAppearanceModel(kVar);
        }
        if (m12758l() != null) {
            m12758l().setShapeAppearanceModel(kVar);
        }
        if (mo10065c() != null) {
            mo10065c().setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: C */
    private void m12754C() {
        C1455g d = mo10066d();
        C1455g l = m12758l();
        if (d != null) {
            d.mo6614b0((float) this.f10269i, this.f10272l);
            if (l != null) {
                l.mo6613a0((float) this.f10269i, this.f10275o ? C1428a.m7052c(this.f10262b, C1391b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m12755D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f10264d, this.f10266f, this.f10265e, this.f10267g);
    }

    /* renamed from: a */
    private Drawable m12756a() {
        C1455g gVar = new C1455g(this.f10263c);
        gVar.mo6603M(this.f10262b.getContext());
        C0398a.m1978o(gVar, this.f10271k);
        PorterDuff.Mode mode = this.f10270j;
        if (mode != null) {
            C0398a.m1979p(gVar, mode);
        }
        gVar.mo6614b0((float) this.f10269i, this.f10272l);
        C1455g gVar2 = new C1455g(this.f10263c);
        gVar2.setTint(0);
        gVar2.mo6613a0((float) this.f10269i, this.f10275o ? C1428a.m7052c(this.f10262b, C1391b.colorSurface) : 0);
        if (f10261a) {
            C1455g gVar3 = new C1455g(this.f10263c);
            this.f10274n = gVar3;
            C0398a.m1977n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C1446b.m7103a(this.f10273m), m12755D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f10274n);
            this.f10279s = rippleDrawable;
            return rippleDrawable;
        }
        C1443a aVar = new C1443a(this.f10263c);
        this.f10274n = aVar;
        C0398a.m1978o(aVar, C1446b.m7103a(this.f10273m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f10274n});
        this.f10279s = layerDrawable;
        return m12755D(layerDrawable);
    }

    /* renamed from: e */
    private C1455g m12757e(boolean z) {
        LayerDrawable layerDrawable = this.f10279s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1455g) (f10261a ? (LayerDrawable) ((InsetDrawable) this.f10279s.getDrawable(0)).getDrawable() : this.f10279s).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: l */
    private C1455g m12758l() {
        return m12757e(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo10063B(int i, int i2) {
        Drawable drawable = this.f10274n;
        if (drawable != null) {
            drawable.setBounds(this.f10264d, this.f10266f, i2 - this.f10265e, i - this.f10267g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10064b() {
        return this.f10268h;
    }

    /* renamed from: c */
    public AbstractC1477n mo10065c() {
        LayerDrawable layerDrawable = this.f10279s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (AbstractC1477n) (this.f10279s.getNumberOfLayers() > 2 ? this.f10279s.getDrawable(2) : this.f10279s.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1455g mo10066d() {
        return m12757e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo10067f() {
        return this.f10273m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1462k mo10068g() {
        return this.f10263c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo10069h() {
        return this.f10272l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo10070i() {
        return this.f10269i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo10071j() {
        return this.f10271k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo10072k() {
        return this.f10270j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10073m() {
        return this.f10276p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10074n() {
        return this.f10278r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo10075o(TypedArray typedArray) {
        this.f10264d = typedArray.getDimensionPixelOffset(C1400k.f5968s1, 0);
        this.f10265e = typedArray.getDimensionPixelOffset(C1400k.f5974t1, 0);
        this.f10266f = typedArray.getDimensionPixelOffset(C1400k.f5980u1, 0);
        this.f10267g = typedArray.getDimensionPixelOffset(C1400k.f5986v1, 0);
        int i = C1400k.f6010z1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f10268h = dimensionPixelSize;
            mo10081u(this.f10263c.mo6660w((float) dimensionPixelSize));
            this.f10277q = true;
        }
        this.f10269i = typedArray.getDimensionPixelSize(C1400k.f5740J1, 0);
        this.f10270j = C3203p.m13436e(typedArray.getInt(C1400k.f6004y1, -1), PorterDuff.Mode.SRC_IN);
        this.f10271k = C1437c.m7077a(this.f10262b.getContext(), typedArray, C1400k.f5998x1);
        this.f10272l = C1437c.m7077a(this.f10262b.getContext(), typedArray, C1400k.f5734I1);
        this.f10273m = C1437c.m7077a(this.f10262b.getContext(), typedArray, C1400k.f5728H1);
        this.f10278r = typedArray.getBoolean(C1400k.f5992w1, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C1400k.f5686A1, 0);
        int D = C1013s.m5726D(this.f10262b);
        int paddingTop = this.f10262b.getPaddingTop();
        int C = C1013s.m5725C(this.f10262b);
        int paddingBottom = this.f10262b.getPaddingBottom();
        if (typedArray.hasValue(C1400k.f5961r1)) {
            mo10077q();
        } else {
            this.f10262b.setInternalBackground(m12756a());
            C1455g d = mo10066d();
            if (d != null) {
                d.mo6607U((float) dimensionPixelSize2);
            }
        }
        C1013s.m5792v0(this.f10262b, D + this.f10264d, paddingTop + this.f10266f, C + this.f10265e, paddingBottom + this.f10267g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo10076p(int i) {
        if (mo10066d() != null) {
            mo10066d().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo10077q() {
        this.f10276p = true;
        this.f10262b.setSupportBackgroundTintList(this.f10271k);
        this.f10262b.setSupportBackgroundTintMode(this.f10270j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10078r(boolean z) {
        this.f10278r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo10079s(int i) {
        if (!this.f10277q || this.f10268h != i) {
            this.f10268h = i;
            this.f10277q = true;
            mo10081u(this.f10263c.mo6660w((float) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo10080t(ColorStateList colorStateList) {
        if (this.f10273m != colorStateList) {
            this.f10273m = colorStateList;
            boolean z = f10261a;
            if (z && (this.f10262b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f10262b.getBackground()).setColor(C1446b.m7103a(colorStateList));
            } else if (!z && (this.f10262b.getBackground() instanceof C1443a)) {
                ((C1443a) this.f10262b.getBackground()).setTintList(C1446b.m7103a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10081u(C1462k kVar) {
        this.f10263c = kVar;
        m12753A(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10082v(boolean z) {
        this.f10275o = z;
        m12754C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo10083w(ColorStateList colorStateList) {
        if (this.f10272l != colorStateList) {
            this.f10272l = colorStateList;
            m12754C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo10084x(int i) {
        if (this.f10269i != i) {
            this.f10269i = i;
            m12754C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo10085y(ColorStateList colorStateList) {
        if (this.f10271k != colorStateList) {
            this.f10271k = colorStateList;
            if (mo10066d() != null) {
                C0398a.m1978o(mo10066d(), this.f10271k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo10086z(PorterDuff.Mode mode) {
        if (this.f10270j != mode) {
            this.f10270j = mode;
            if (mo10066d() != null && this.f10270j != null) {
                C0398a.m1979p(mo10066d(), this.f10270j);
            }
        }
    }
}
