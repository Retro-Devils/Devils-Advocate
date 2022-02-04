package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.view.menu.SubMenuC0154r;
import androidx.recyclerview.widget.C0732k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1397h;

/* renamed from: com.google.android.material.internal.h */
public class C3176h implements AbstractC0145m {

    /* renamed from: b */
    private NavigationMenuView f10649b;

    /* renamed from: c */
    LinearLayout f10650c;

    /* renamed from: d */
    private AbstractC0145m.AbstractC0146a f10651d;

    /* renamed from: e */
    C0130g f10652e;

    /* renamed from: f */
    private int f10653f;

    /* renamed from: g */
    C3179c f10654g;

    /* renamed from: h */
    LayoutInflater f10655h;

    /* renamed from: i */
    int f10656i;

    /* renamed from: j */
    boolean f10657j;

    /* renamed from: k */
    ColorStateList f10658k;

    /* renamed from: l */
    ColorStateList f10659l;

    /* renamed from: m */
    Drawable f10660m;

    /* renamed from: n */
    int f10661n;

    /* renamed from: o */
    int f10662o;

    /* renamed from: p */
    int f10663p;

    /* renamed from: q */
    boolean f10664q;

    /* renamed from: r */
    boolean f10665r = true;

    /* renamed from: s */
    private int f10666s;

    /* renamed from: t */
    private int f10667t;

    /* renamed from: u */
    int f10668u;

    /* renamed from: v */
    private int f10669v = -1;

    /* renamed from: w */
    final View.OnClickListener f10670w = new View$OnClickListenerC3177a();

    /* renamed from: com.google.android.material.internal.h$a */
    class View$OnClickListenerC3177a implements View.OnClickListener {
        View$OnClickListenerC3177a() {
        }

        public void onClick(View view) {
            boolean z = true;
            C3176h.this.mo10738K(true);
            C0134i itemData = ((NavigationMenuItemView) view).getItemData();
            C3176h hVar = C3176h.this;
            boolean O = hVar.f10652e.mo624O(itemData, hVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                C3176h.this.f10654g.mo10756D(itemData);
            }
            C3176h.this.mo10738K(false);
            if (z) {
                C3176h.this.mo553n(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$b */
    public static class C3178b extends AbstractC3188l {
        public C3178b(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$c */
    public class C3179c extends RecyclerView.AbstractC0658g<AbstractC3188l> {

        /* renamed from: c */
        private final ArrayList<AbstractC3181e> f10672c = new ArrayList<>();

        /* renamed from: d */
        private C0134i f10673d;

        /* renamed from: e */
        private boolean f10674e;

        C3179c() {
            m13369B();
        }

        /* renamed from: B */
        private void m13369B() {
            if (!this.f10674e) {
                this.f10674e = true;
                this.f10672c.clear();
                this.f10672c.add(new C3180d());
                int i = -1;
                int size = C3176h.this.f10652e.mo616G().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0134i iVar = C3176h.this.f10652e.mo616G().get(i3);
                    if (iVar.isChecked()) {
                        mo10756D(iVar);
                    }
                    if (iVar.isCheckable()) {
                        iVar.mo742t(false);
                    }
                    if (iVar.hasSubMenu()) {
                        SubMenu subMenu = iVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f10672c.add(new C3182f(C3176h.this.f10668u, 0));
                            }
                            this.f10672c.add(new C3183g(iVar));
                            int size2 = this.f10672c.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0134i iVar2 = (C0134i) subMenu.getItem(i4);
                                if (iVar2.isVisible()) {
                                    if (!z2 && iVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (iVar2.isCheckable()) {
                                        iVar2.mo742t(false);
                                    }
                                    if (iVar.isChecked()) {
                                        mo10756D(iVar);
                                    }
                                    this.f10672c.add(new C3183g(iVar2));
                                }
                            }
                            if (z2) {
                                m13370u(size2, this.f10672c.size());
                            }
                        }
                    } else {
                        int groupId = iVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f10672c.size();
                            z = iVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<AbstractC3181e> arrayList = this.f10672c;
                                int i5 = C3176h.this.f10668u;
                                arrayList.add(new C3182f(i5, i5));
                            }
                        } else if (!z && iVar.getIcon() != null) {
                            m13370u(i2, this.f10672c.size());
                            z = true;
                        }
                        C3183g gVar = new C3183g(iVar);
                        gVar.f10679b = z;
                        this.f10672c.add(gVar);
                        i = groupId;
                    }
                }
                this.f10674e = false;
            }
        }

        /* renamed from: u */
        private void m13370u(int i, int i2) {
            while (i < i2) {
                ((C3183g) this.f10672c.get(i)).f10679b = true;
                i++;
            }
        }

        /* renamed from: A */
        public void mo4035q(AbstractC3188l lVar) {
            if (lVar instanceof C3185i) {
                ((NavigationMenuItemView) lVar.f3228b).mo10667D();
            }
        }

        /* renamed from: C */
        public void mo10755C(Bundle bundle) {
            C0134i a;
            View actionView;
            C3190j jVar;
            C0134i a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f10674e = true;
                int size = this.f10672c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    AbstractC3181e eVar = this.f10672c.get(i2);
                    if ((eVar instanceof C3183g) && (a2 = ((C3183g) eVar).mo10766a()) != null && a2.getItemId() == i) {
                        mo10756D(a2);
                        break;
                    }
                    i2++;
                }
                this.f10674e = false;
                m13369B();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f10672c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC3181e eVar2 = this.f10672c.get(i3);
                    if (!(!(eVar2 instanceof C3183g) || (a = ((C3183g) eVar2).mo10766a()) == null || (actionView = a.getActionView()) == null || (jVar = (C3190j) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(jVar);
                    }
                }
            }
        }

        /* renamed from: D */
        public void mo10756D(C0134i iVar) {
            if (this.f10673d != iVar && iVar.isCheckable()) {
                C0134i iVar2 = this.f10673d;
                if (iVar2 != null) {
                    iVar2.setChecked(false);
                }
                this.f10673d = iVar;
                iVar.setChecked(true);
            }
        }

        /* renamed from: E */
        public void mo10757E(boolean z) {
            this.f10674e = z;
        }

        /* renamed from: F */
        public void mo10758F() {
            m13369B();
            mo4029h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
        /* renamed from: c */
        public int mo3580c() {
            return this.f10672c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
        /* renamed from: d */
        public long mo4025d(int i) {
            return (long) i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
        /* renamed from: e */
        public int mo4026e(int i) {
            AbstractC3181e eVar = this.f10672c.get(i);
            if (eVar instanceof C3182f) {
                return 2;
            }
            if (eVar instanceof C3180d) {
                return 3;
            }
            if (eVar instanceof C3183g) {
                return ((C3183g) eVar).mo10766a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: v */
        public Bundle mo10759v() {
            Bundle bundle = new Bundle();
            C0134i iVar = this.f10673d;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f10672c.size();
            for (int i = 0; i < size; i++) {
                AbstractC3181e eVar = this.f10672c.get(i);
                if (eVar instanceof C3183g) {
                    C0134i a = ((C3183g) eVar).mo10766a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        C3190j jVar = new C3190j();
                        actionView.saveHierarchyState(jVar);
                        sparseArray.put(a.getItemId(), jVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: w */
        public C0134i mo10760w() {
            return this.f10673d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public int mo10761x() {
            int i = C3176h.this.f10650c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C3176h.this.f10654g.mo3580c(); i2++) {
                if (C3176h.this.f10654g.mo4026e(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: y */
        public void mo3581j(AbstractC3188l lVar, int i) {
            int e = mo4026e(i);
            if (e == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f3228b;
                navigationMenuItemView.setIconTintList(C3176h.this.f10659l);
                C3176h hVar = C3176h.this;
                if (hVar.f10657j) {
                    navigationMenuItemView.setTextAppearance(hVar.f10656i);
                }
                ColorStateList colorStateList = C3176h.this.f10658k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C3176h.this.f10660m;
                C1013s.m5772l0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C3183g gVar = (C3183g) this.f10672c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f10679b);
                navigationMenuItemView.setHorizontalPadding(C3176h.this.f10661n);
                navigationMenuItemView.setIconPadding(C3176h.this.f10662o);
                C3176h hVar2 = C3176h.this;
                if (hVar2.f10664q) {
                    navigationMenuItemView.setIconSize(hVar2.f10663p);
                }
                navigationMenuItemView.setMaxLines(C3176h.this.f10666s);
                navigationMenuItemView.mo450e(gVar.mo10766a(), 0);
            } else if (e == 1) {
                ((TextView) lVar.f3228b).setText(((C3183g) this.f10672c.get(i)).mo10766a().getTitle());
            } else if (e == 2) {
                C3182f fVar = (C3182f) this.f10672c.get(i);
                lVar.f3228b.setPadding(0, fVar.mo10765b(), 0, fVar.mo10764a());
            }
        }

        /* renamed from: z */
        public AbstractC3188l mo3582l(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C3176h hVar = C3176h.this;
                return new C3185i(hVar.f10655h, viewGroup, hVar.f10670w);
            } else if (i == 1) {
                return new C3187k(C3176h.this.f10655h, viewGroup);
            } else {
                if (i == 2) {
                    return new C3186j(C3176h.this.f10655h, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C3178b(C3176h.this.f10650c);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$d */
    public static class C3180d implements AbstractC3181e {
        C3180d() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$e */
    public interface AbstractC3181e {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$f */
    public static class C3182f implements AbstractC3181e {

        /* renamed from: a */
        private final int f10676a;

        /* renamed from: b */
        private final int f10677b;

        public C3182f(int i, int i2) {
            this.f10676a = i;
            this.f10677b = i2;
        }

        /* renamed from: a */
        public int mo10764a() {
            return this.f10677b;
        }

        /* renamed from: b */
        public int mo10765b() {
            return this.f10676a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$g */
    public static class C3183g implements AbstractC3181e {

        /* renamed from: a */
        private final C0134i f10678a;

        /* renamed from: b */
        boolean f10679b;

        C3183g(C0134i iVar) {
            this.f10678a = iVar;
        }

        /* renamed from: a */
        public C0134i mo10766a() {
            return this.f10678a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$h */
    public class C3184h extends C0732k {
        C3184h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C0732k, p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            cVar.mo5474c0(C0979c.C0981b.m5654a(C3176h.this.f10654g.mo10761x(), 0, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$i */
    public static class C3185i extends AbstractC3188l {
        public C3185i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C1397h.design_navigation_item, viewGroup, false));
            this.f3228b.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$j */
    public static class C3186j extends AbstractC3188l {
        public C3186j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C1397h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.h$k */
    public static class C3187k extends AbstractC3188l {
        public C3187k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C1397h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.h$l */
    private static abstract class AbstractC3188l extends RecyclerView.AbstractC0655d0 {
        public AbstractC3188l(View view) {
            super(view);
        }
    }

    /* renamed from: L */
    private void m13332L() {
        int i = (this.f10650c.getChildCount() != 0 || !this.f10665r) ? 0 : this.f10667t;
        NavigationMenuView navigationMenuView = this.f10649b;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void mo10728A(int i) {
        this.f10653f = i;
    }

    /* renamed from: B */
    public void mo10729B(Drawable drawable) {
        this.f10660m = drawable;
        mo553n(false);
    }

    /* renamed from: C */
    public void mo10730C(int i) {
        this.f10661n = i;
        mo553n(false);
    }

    /* renamed from: D */
    public void mo10731D(int i) {
        this.f10662o = i;
        mo553n(false);
    }

    /* renamed from: E */
    public void mo10732E(int i) {
        if (this.f10663p != i) {
            this.f10663p = i;
            this.f10664q = true;
            mo553n(false);
        }
    }

    /* renamed from: F */
    public void mo10733F(ColorStateList colorStateList) {
        this.f10659l = colorStateList;
        mo553n(false);
    }

    /* renamed from: G */
    public void mo10734G(int i) {
        this.f10666s = i;
        mo553n(false);
    }

    /* renamed from: H */
    public void mo10735H(int i) {
        this.f10656i = i;
        this.f10657j = true;
        mo553n(false);
    }

    /* renamed from: I */
    public void mo10736I(ColorStateList colorStateList) {
        this.f10658k = colorStateList;
        mo553n(false);
    }

    /* renamed from: J */
    public void mo10737J(int i) {
        this.f10669v = i;
        NavigationMenuView navigationMenuView = this.f10649b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: K */
    public void mo10738K(boolean z) {
        C3179c cVar = this.f10654g;
        if (cVar != null) {
            cVar.mo10757E(z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: b */
    public void mo544b(C0130g gVar, boolean z) {
        AbstractC0145m.AbstractC0146a aVar = this.f10651d;
        if (aVar != null) {
            aVar.mo347b(gVar, z);
        }
    }

    /* renamed from: c */
    public void mo10739c(View view) {
        this.f10650c.addView(view);
        NavigationMenuView navigationMenuView = this.f10649b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: d */
    public int mo546d() {
        return this.f10653f;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: e */
    public boolean mo568e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: f */
    public Parcelable mo569f() {
        Bundle bundle = new Bundle();
        if (this.f10649b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f10649b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C3179c cVar = this.f10654g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.mo10759v());
        }
        if (this.f10650c != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f10650c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: g */
    public void mo547g(Context context, C0130g gVar) {
        this.f10655h = LayoutInflater.from(context);
        this.f10652e = gVar;
        this.f10668u = context.getResources().getDimensionPixelOffset(C1393d.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: h */
    public void mo570h(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f10649b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f10654g.mo10755C(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f10650c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: i */
    public boolean mo548i(C0130g gVar, C0134i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: j */
    public boolean mo549j(C0130g gVar, C0134i iVar) {
        return false;
    }

    /* renamed from: l */
    public void mo10740l(C0964a0 a0Var) {
        int h = a0Var.mo5418h();
        if (this.f10667t != h) {
            this.f10667t = h;
            m13332L();
        }
        NavigationMenuView navigationMenuView = this.f10649b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, a0Var.mo5414e());
        C1013s.m5761g(this.f10650c, a0Var);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: m */
    public boolean mo552m(SubMenuC0154r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: n */
    public void mo553n(boolean z) {
        C3179c cVar = this.f10654g;
        if (cVar != null) {
            cVar.mo10758F();
        }
    }

    /* renamed from: o */
    public C0134i mo10741o() {
        return this.f10654g.mo10760w();
    }

    /* renamed from: p */
    public int mo10742p() {
        return this.f10650c.getChildCount();
    }

    /* renamed from: q */
    public Drawable mo10743q() {
        return this.f10660m;
    }

    /* renamed from: r */
    public int mo10744r() {
        return this.f10661n;
    }

    /* renamed from: s */
    public int mo10745s() {
        return this.f10662o;
    }

    /* renamed from: t */
    public int mo10746t() {
        return this.f10666s;
    }

    /* renamed from: u */
    public ColorStateList mo10747u() {
        return this.f10658k;
    }

    /* renamed from: v */
    public ColorStateList mo10748v() {
        return this.f10659l;
    }

    /* renamed from: w */
    public AbstractC0147n mo10749w(ViewGroup viewGroup) {
        if (this.f10649b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f10655h.inflate(C1397h.design_navigation_menu, viewGroup, false);
            this.f10649b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C3184h(this.f10649b));
            if (this.f10654g == null) {
                this.f10654g = new C3179c();
            }
            int i = this.f10669v;
            if (i != -1) {
                this.f10649b.setOverScrollMode(i);
            }
            this.f10650c = (LinearLayout) this.f10655h.inflate(C1397h.design_navigation_item_header, (ViewGroup) this.f10649b, false);
            this.f10649b.setAdapter(this.f10654g);
        }
        return this.f10649b;
    }

    /* renamed from: x */
    public View mo10750x(int i) {
        View inflate = this.f10655h.inflate(i, (ViewGroup) this.f10650c, false);
        mo10739c(inflate);
        return inflate;
    }

    /* renamed from: y */
    public void mo10751y(boolean z) {
        if (this.f10665r != z) {
            this.f10665r = z;
            m13332L();
        }
    }

    /* renamed from: z */
    public void mo10752z(C0134i iVar) {
        this.f10654g.mo10756D(iVar);
    }
}
