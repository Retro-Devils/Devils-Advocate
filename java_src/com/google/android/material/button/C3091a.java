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
    private static final boolean f10253a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private final MaterialButton f10254b;

    /* renamed from: c */
    private C1462k f10255c;

    /* renamed from: d */
    private int f10256d;

    /* renamed from: e */
    private int f10257e;

    /* renamed from: f */
    private int f10258f;

    /* renamed from: g */
    private int f10259g;

    /* renamed from: h */
    private int f10260h;

    /* renamed from: i */
    private int f10261i;

    /* renamed from: j */
    private PorterDuff.Mode f10262j;

    /* renamed from: k */
    private ColorStateList f10263k;

    /* renamed from: l */
    private ColorStateList f10264l;

    /* renamed from: m */
    private ColorStateList f10265m;

    /* renamed from: n */
    private Drawable f10266n;

    /* renamed from: o */
    private boolean f10267o = false;

    /* renamed from: p */
    private boolean f10268p = false;

    /* renamed from: q */
    private boolean f10269q = false;

    /* renamed from: r */
    private boolean f10270r;

    /* renamed from: s */
    private LayerDrawable f10271s;

    C3091a(MaterialButton materialButton, C1462k kVar) {
        this.f10254b = materialButton;
        this.f10255c = kVar;
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
            d.mo6614b0((float) this.f10261i, this.f10264l);
            if (l != null) {
                l.mo6613a0((float) this.f10261i, this.f10267o ? C1428a.m7052c(this.f10254b, C1391b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m12755D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f10256d, this.f10258f, this.f10257e, this.f10259g);
    }

    /* renamed from: a */
    private Drawable m12756a() {
        C1455g gVar = new C1455g(this.f10255c);
        gVar.mo6603M(this.f10254b.getContext());
        C0398a.m1978o(gVar, this.f10263k);
        PorterDuff.Mode mode = this.f10262j;
        if (mode != null) {
            C0398a.m1979p(gVar, mode);
        }
        gVar.mo6614b0((float) this.f10261i, this.f10264l);
        C1455g gVar2 = new C1455g(this.f10255c);
        gVar2.setTint(0);
        gVar2.mo6613a0((float) this.f10261i, this.f10267o ? C1428a.m7052c(this.f10254b, C1391b.colorSurface) : 0);
        if (f10253a) {
            C1455g gVar3 = new C1455g(this.f10255c);
            this.f10266n = gVar3;
            C0398a.m1977n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C1446b.m7103a(this.f10265m), m12755D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f10266n);
            this.f10271s = rippleDrawable;
            return rippleDrawable;
        }
        C1443a aVar = new C1443a(this.f10255c);
        this.f10266n = aVar;
        C0398a.m1978o(aVar, C1446b.m7103a(this.f10265m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f10266n});
        this.f10271s = layerDrawable;
        return m12755D(layerDrawable);
    }

    /* renamed from: e */
    private C1455g m12757e(boolean z) {
        LayerDrawable layerDrawable = this.f10271s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1455g) (f10253a ? (LayerDrawable) ((InsetDrawable) this.f10271s.getDrawable(0)).getDrawable() : this.f10271s).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: l */
    private C1455g m12758l() {
        return m12757e(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo10063B(int i, int i2) {
        Drawable drawable = this.f10266n;
        if (drawable != null) {
            drawable.setBounds(this.f10256d, this.f10258f, i2 - this.f10257e, i - this.f10259g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10064b() {
        return this.f10260h;
    }

    /* renamed from: c */
    public AbstractC1477n mo10065c() {
        LayerDrawable layerDrawable = this.f10271s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (AbstractC1477n) (this.f10271s.getNumberOfLayers() > 2 ? this.f10271s.getDrawable(2) : this.f10271s.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1455g mo10066d() {
        return m12757e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo10067f() {
        return this.f10265m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1462k mo10068g() {
        return this.f10255c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo10069h() {
        return this.f10264l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo10070i() {
        return this.f10261i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo10071j() {
        return this.f10263k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo10072k() {
        return this.f10262j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10073m() {
        return this.f10268p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10074n() {
        return this.f10270r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo10075o(TypedArray typedArray) {
        this.f10256d = typedArray.getDimensionPixelOffset(C1400k.f5960s1, 0);
        this.f10257e = typedArray.getDimensionPixelOffset(C1400k.f5966t1, 0);
        this.f10258f = typedArray.getDimensionPixelOffset(C1400k.f5972u1, 0);
        this.f10259g = typedArray.getDimensionPixelOffset(C1400k.f5978v1, 0);
        int i = C1400k.f6002z1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f10260h = dimensionPixelSize;
            mo10081u(this.f10255c.mo6660w((float) dimensionPixelSize));
            this.f10269q = true;
        }
        this.f10261i = typedArray.getDimensionPixelSize(C1400k.f5732J1, 0);
        this.f10262j = C3203p.m13436e(typedArray.getInt(C1400k.f5996y1, -1), PorterDuff.Mode.SRC_IN);
        this.f10263k = C1437c.m7077a(this.f10254b.getContext(), typedArray, C1400k.f5990x1);
        this.f10264l = C1437c.m7077a(this.f10254b.getContext(), typedArray, C1400k.f5726I1);
        this.f10265m = C1437c.m7077a(this.f10254b.getContext(), typedArray, C1400k.f5720H1);
        this.f10270r = typedArray.getBoolean(C1400k.f5984w1, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C1400k.f5678A1, 0);
        int D = C1013s.m5726D(this.f10254b);
        int paddingTop = this.f10254b.getPaddingTop();
        int C = C1013s.m5725C(this.f10254b);
        int paddingBottom = this.f10254b.getPaddingBottom();
        if (typedArray.hasValue(C1400k.f5953r1)) {
            mo10077q();
        } else {
            this.f10254b.setInternalBackground(m12756a());
            C1455g d = mo10066d();
            if (d != null) {
                d.mo6607U((float) dimensionPixelSize2);
            }
        }
        C1013s.m5792v0(this.f10254b, D + this.f10256d, paddingTop + this.f10258f, C + this.f10257e, paddingBottom + this.f10259g);
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
        this.f10268p = true;
        this.f10254b.setSupportBackgroundTintList(this.f10263k);
        this.f10254b.setSupportBackgroundTintMode(this.f10262j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10078r(boolean z) {
        this.f10270r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo10079s(int i) {
        if (!this.f10269q || this.f10260h != i) {
            this.f10260h = i;
            this.f10269q = true;
            mo10081u(this.f10255c.mo6660w((float) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo10080t(ColorStateList colorStateList) {
        if (this.f10265m != colorStateList) {
            this.f10265m = colorStateList;
            boolean z = f10253a;
            if (z && (this.f10254b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f10254b.getBackground()).setColor(C1446b.m7103a(colorStateList));
            } else if (!z && (this.f10254b.getBackground() instanceof C1443a)) {
                ((C1443a) this.f10254b.getBackground()).setTintList(C1446b.m7103a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10081u(C1462k kVar) {
        this.f10255c = kVar;
        m12753A(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10082v(boolean z) {
        this.f10267o = z;
        m12754C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo10083w(ColorStateList colorStateList) {
        if (this.f10264l != colorStateList) {
            this.f10264l = colorStateList;
            m12754C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo10084x(int i) {
        if (this.f10261i != i) {
            this.f10261i = i;
            m12754C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo10085y(ColorStateList colorStateList) {
        if (this.f10263k != colorStateList) {
            this.f10263k = colorStateList;
            if (mo10066d() != null) {
                C0398a.m1978o(mo10066d(), this.f10263k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo10086z(PorterDuff.Mode mode) {
        if (this.f10262j != mode) {
            this.f10262j = mode;
            if (mo10066d() != null && this.f10262j != null) {
                C0398a.m1979p(mo10066d(), this.f10262j);
            }
        }
    }
}
