package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.widget.C0296w0;
import androidx.core.content.C0378a;
import com.google.android.material.internal.C3170b;
import com.google.android.material.internal.C3175g;
import com.google.android.material.internal.C3176h;
import com.google.android.material.internal.C3192k;
import p006b.p007a.C0754a;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p007a.p014o.C0792g;
import p006b.p030g.p039k.C0964a0;
import p006b.p043i.p044a.AbstractC1041a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p104w.C1437c;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1459h;
import p069c.p073b.p074a.p090b.p107z.C1462k;

public class NavigationView extends C3192k {

    /* renamed from: g */
    private static final int[] f10723g = {16842912};

    /* renamed from: h */
    private static final int[] f10724h = {-16842910};

    /* renamed from: i */
    private static final int f10725i = C1399j.Widget_Design_NavigationView;

    /* renamed from: j */
    private final C3175g f10726j;

    /* renamed from: k */
    private final C3176h f10727k;

    /* renamed from: l */
    AbstractC3211c f10728l;

    /* renamed from: m */
    private final int f10729m;

    /* renamed from: n */
    private final int[] f10730n;

    /* renamed from: o */
    private MenuInflater f10731o;

    /* renamed from: p */
    private ViewTreeObserver.OnGlobalLayoutListener f10732p;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    class C3209a implements C0130g.AbstractC0131a {
        C3209a() {
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: a */
        public boolean mo320a(C0130g gVar, MenuItem menuItem) {
            AbstractC3211c cVar = NavigationView.this.f10728l;
            return cVar != null && cVar.mo8932f(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: b */
        public void mo322b(C0130g gVar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public class ViewTreeObserver$OnGlobalLayoutListenerC3210b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC3210b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f10730n);
            boolean z = true;
            boolean z2 = NavigationView.this.f10730n[1] == 0;
            NavigationView.this.f10727k.mo10751y(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a = C3170b.m13323a(NavigationView.this.getContext());
            if (a != null && Build.VERSION.SDK_INT >= 21) {
                boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z3 || !z4) {
                    z = false;
                }
                navigationView2.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface AbstractC3211c {
        /* renamed from: f */
        boolean mo8932f(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$d */
    public static class C3212d extends AbstractC1041a {
        public static final Parcelable.Creator<C3212d> CREATOR = new C3213a();

        /* renamed from: d */
        public Bundle f10735d;

        /* renamed from: com.google.android.material.navigation.NavigationView$d$a */
        static class C3213a implements Parcelable.ClassLoaderCreator<C3212d> {
            C3213a() {
            }

            /* renamed from: a */
            public C3212d createFromParcel(Parcel parcel) {
                return new C3212d(parcel, null);
            }

            /* renamed from: b */
            public C3212d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3212d(parcel, classLoader);
            }

            /* renamed from: c */
            public C3212d[] newArray(int i) {
                return new C3212d[i];
            }
        }

        public C3212d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10735d = parcel.readBundle(classLoader);
        }

        public C3212d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f10735d);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: d */
    private ColorStateList m13443d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c = C0764a.m4516c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0754a.f3572x, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        int[] iArr = f10724h;
        return new ColorStateList(new int[][]{iArr, f10723g, FrameLayout.EMPTY_STATE_SET}, new int[]{c.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: e */
    private final Drawable m13444e(C0296w0 w0Var) {
        C1455g gVar = new C1455g(C1462k.m7190b(getContext(), w0Var.mo1817n(C1400k.f5745L2, 0), w0Var.mo1817n(C1400k.f5751M2, 0)).mo6667m());
        gVar.mo6608V(C1437c.m7078b(getContext(), w0Var, C1400k.f5757N2));
        return new InsetDrawable((Drawable) gVar, w0Var.mo1809f(C1400k.f5775Q2, 0), w0Var.mo1809f(C1400k.f5781R2, 0), w0Var.mo1809f(C1400k.f5769P2, 0), w0Var.mo1809f(C1400k.f5763O2, 0));
    }

    /* renamed from: f */
    private boolean m13445f(C0296w0 w0Var) {
        return w0Var.mo1822s(C1400k.f5745L2) || w0Var.mo1822s(C1400k.f5751M2);
    }

    private MenuInflater getMenuInflater() {
        if (this.f10731o == null) {
            this.f10731o = new C0792g(getContext());
        }
        return this.f10731o;
    }

    /* renamed from: i */
    private void m13446i() {
        this.f10732p = new ViewTreeObserver$OnGlobalLayoutListenerC3210b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10732p);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.C3192k
    /* renamed from: a */
    public void mo10775a(C0964a0 a0Var) {
        this.f10727k.mo10740l(a0Var);
    }

    /* renamed from: g */
    public View mo10804g(int i) {
        return this.f10727k.mo10750x(i);
    }

    public MenuItem getCheckedItem() {
        return this.f10727k.mo10741o();
    }

    public int getHeaderCount() {
        return this.f10727k.mo10742p();
    }

    public Drawable getItemBackground() {
        return this.f10727k.mo10743q();
    }

    public int getItemHorizontalPadding() {
        return this.f10727k.mo10744r();
    }

    public int getItemIconPadding() {
        return this.f10727k.mo10745s();
    }

    public ColorStateList getItemIconTintList() {
        return this.f10727k.mo10748v();
    }

    public int getItemMaxLines() {
        return this.f10727k.mo10746t();
    }

    public ColorStateList getItemTextColor() {
        return this.f10727k.mo10747u();
    }

    public Menu getMenu() {
        return this.f10726j;
    }

    /* renamed from: h */
    public void mo10814h(int i) {
        this.f10727k.mo10738K(true);
        getMenuInflater().inflate(i, this.f10726j);
        this.f10727k.mo10738K(false);
        this.f10727k.mo553n(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.C3192k
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1459h.m7185e(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.internal.C3192k
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f10732p);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f10732p);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f10729m;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.f10729m);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3212d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3212d dVar = (C3212d) parcelable;
        super.onRestoreInstanceState(dVar.mo5608b());
        this.f10726j.mo627S(dVar.f10735d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C3212d dVar = new C3212d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f10735d = bundle;
        this.f10726j.mo629U(bundle);
        return dVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f10726j.findItem(i);
        if (findItem != null) {
            this.f10727k.mo10752z((C0134i) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f10726j.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f10727k.mo10752z((C0134i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C1459h.m7184d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f10727k.mo10729B(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0378a.m1874d(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f10727k.mo10730C(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f10727k.mo10730C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f10727k.mo10731D(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f10727k.mo10731D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f10727k.mo10732E(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f10727k.mo10733F(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f10727k.mo10734G(i);
    }

    public void setItemTextAppearance(int i) {
        this.f10727k.mo10735H(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f10727k.mo10736I(colorStateList);
    }

    public void setNavigationItemSelectedListener(AbstractC3211c cVar) {
        this.f10728l = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C3176h hVar = this.f10727k;
        if (hVar != null) {
            hVar.mo10737J(i);
        }
    }
}
