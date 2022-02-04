package p006b.p007a.p010l.p011a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p006b.p007a.p010l.p011a.C0774b;

/* access modifiers changed from: package-private */
@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.l.a.d */
public class C0779d extends C0774b {

    /* renamed from: n */
    private C0780a f3902n;

    /* renamed from: o */
    private boolean f3903o;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.l.a.d$a */
    public static class C0780a extends C0774b.AbstractC0777c {

        /* renamed from: J */
        int[][] f3904J;

        C0780a(C0780a aVar, C0779d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f3904J = aVar.f3904J;
            } else {
                this.f3904J = new int[mo4625f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo4674A(int[] iArr) {
            int[][] iArr2 = this.f3904J;
            int h = mo4628h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0779d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0779d(this, resources);
        }

        @Override // p006b.p007a.p010l.p011a.C0774b.AbstractC0777c
        /* renamed from: o */
        public void mo4635o(int i, int i2) {
            super.mo4635o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f3904J, 0, iArr, 0, i);
            this.f3904J = iArr;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p007a.p010l.p011a.C0774b.AbstractC0777c
        /* renamed from: r */
        public void mo4601r() {
            int[][] iArr = this.f3904J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f3904J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f3904J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo4675z(int[] iArr, Drawable drawable) {
            int a = mo4620a(drawable);
            this.f3904J[a] = iArr;
            return a;
        }
    }

    C0779d(C0780a aVar) {
        if (aVar != null) {
            mo4570h(aVar);
        }
    }

    C0779d(C0780a aVar, Resources resources) {
        mo4570h(new C0780a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p007a.p010l.p011a.C0774b
    /* renamed from: h */
    public void mo4570h(C0774b.AbstractC0777c cVar) {
        super.mo4570h(cVar);
        if (cVar instanceof C0780a) {
            this.f3902n = (C0780a) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0780a mo4556b() {
        return new C0780a(this.f3902n, this, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo4673k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public Drawable mutate() {
        if (!this.f3903o && super.mutate() == this) {
            this.f3902n.mo4601r();
            this.f3903o = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p007a.p010l.p011a.C0774b
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f3902n.mo4674A(iArr);
        if (A < 0) {
            A = this.f3902n.mo4674A(StateSet.WILD_CARD);
        }
        return mo4609g(A) || onStateChange;
    }
}
