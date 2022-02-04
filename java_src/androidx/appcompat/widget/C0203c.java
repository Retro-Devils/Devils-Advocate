package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0119b;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.appcompat.view.menu.AbstractC0150p;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.view.menu.C0143l;
import androidx.appcompat.view.menu.SubMenuC0154r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0398a;
import java.util.ArrayList;
import p006b.p007a.C0754a;
import p006b.p007a.C0760g;
import p006b.p007a.p014o.C0784a;
import p006b.p030g.p039k.AbstractC0974b;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
public class C0203c extends AbstractC0119b implements AbstractC0974b.AbstractC0975a {

    /* renamed from: A */
    C0204a f937A;

    /* renamed from: B */
    RunnableC0206c f938B;

    /* renamed from: C */
    private C0205b f939C;

    /* renamed from: D */
    final C0210f f940D = new C0210f();

    /* renamed from: E */
    int f941E;

    /* renamed from: l */
    C0207d f942l;

    /* renamed from: m */
    private Drawable f943m;

    /* renamed from: n */
    private boolean f944n;

    /* renamed from: o */
    private boolean f945o;

    /* renamed from: p */
    private boolean f946p;

    /* renamed from: q */
    private int f947q;

    /* renamed from: r */
    private int f948r;

    /* renamed from: s */
    private int f949s;

    /* renamed from: t */
    private boolean f950t;

    /* renamed from: u */
    private boolean f951u;

    /* renamed from: v */
    private boolean f952v;

    /* renamed from: w */
    private boolean f953w;

    /* renamed from: x */
    private int f954x;

    /* renamed from: y */
    private final SparseBooleanArray f955y = new SparseBooleanArray();

    /* renamed from: z */
    C0209e f956z;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    public class C0204a extends C0143l {
        public C0204a(Context context, SubMenuC0154r rVar, View view) {
            super(context, rVar, view, false, C0754a.actionOverflowMenuStyle);
            if (!((C0134i) rVar.getItem()).mo718l()) {
                View view2 = C0203c.this.f942l;
                mo828f(view2 == null ? (View) ((AbstractC0119b) C0203c.this).f476j : view2);
            }
            mo832j(C0203c.this.f940D);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0143l
        /* renamed from: e */
        public void mo827e() {
            C0203c cVar = C0203c.this;
            cVar.f937A = null;
            cVar.f941E = 0;
            super.mo827e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0205b extends ActionMenuItemView.AbstractC0117b {
        C0205b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0117b
        /* renamed from: a */
        public AbstractC0150p mo468a() {
            C0204a aVar = C0203c.this.f937A;
            if (aVar != null) {
                return aVar.mo825c();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c */
    public class RunnableC0206c implements Runnable {

        /* renamed from: b */
        private C0209e f959b;

        public RunnableC0206c(C0209e eVar) {
            this.f959b = eVar;
        }

        public void run() {
            if (((AbstractC0119b) C0203c.this).f470d != null) {
                ((AbstractC0119b) C0203c.this).f470d.mo652d();
            }
            View view = (View) ((AbstractC0119b) C0203c.this).f476j;
            if (!(view == null || view.getWindowToken() == null || !this.f959b.mo834m())) {
                C0203c.this.f956z = this.f959b;
            }
            C0203c.this.f938B = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$d */
    public class C0207d extends C0263o implements ActionMenuView.AbstractC0162a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0208a extends AbstractView$OnTouchListenerC0226g0 {

            /* renamed from: k */
            final /* synthetic */ C0203c f962k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0208a(View view, C0203c cVar) {
                super(view);
                this.f962k = cVar;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
            /* renamed from: b */
            public AbstractC0150p mo466b() {
                C0209e eVar = C0203c.this.f956z;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo825c();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
            /* renamed from: c */
            public boolean mo467c() {
                C0203c.this.mo1330N();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
            /* renamed from: d */
            public boolean mo1334d() {
                C0203c cVar = C0203c.this;
                if (cVar.f938B != null) {
                    return false;
                }
                cVar.mo1321E();
                return true;
            }
        }

        public C0207d(Context context) {
            super(context, null, C0754a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0303y0.m1525a(this, getContentDescription());
            setOnTouchListener(new C0208a(this, C0203c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0162a
        /* renamed from: a */
        public boolean mo447a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0162a
        /* renamed from: b */
        public boolean mo448b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0203c.this.mo1330N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0398a.m1975l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$e */
    public class C0209e extends C0143l {
        public C0209e(Context context, C0130g gVar, View view, boolean z) {
            super(context, gVar, view, z, C0754a.actionOverflowMenuStyle);
            mo830h(8388613);
            mo832j(C0203c.this.f940D);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0143l
        /* renamed from: e */
        public void mo827e() {
            if (((AbstractC0119b) C0203c.this).f470d != null) {
                ((AbstractC0119b) C0203c.this).f470d.close();
            }
            C0203c.this.f956z = null;
            super.mo827e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0210f implements AbstractC0145m.AbstractC0146a {
        C0210f() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: b */
        public void mo347b(C0130g gVar, boolean z) {
            if (gVar instanceof SubMenuC0154r) {
                gVar.mo615F().mo654e(false);
            }
            AbstractC0145m.AbstractC0146a p = C0203c.this.mo555p();
            if (p != null) {
                p.mo347b(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: c */
        public boolean mo348c(C0130g gVar) {
            if (gVar == ((AbstractC0119b) C0203c.this).f470d) {
                return false;
            }
            C0203c.this.f941E = ((SubMenuC0154r) gVar).getItem().getItemId();
            AbstractC0145m.AbstractC0146a p = C0203c.this.mo555p();
            if (p != null) {
                return p.mo348c(gVar);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    public static class C0211g implements Parcelable {
        public static final Parcelable.Creator<C0211g> CREATOR = new C0212a();

        /* renamed from: b */
        public int f966b;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        class C0212a implements Parcelable.Creator<C0211g> {
            C0212a() {
            }

            /* renamed from: a */
            public C0211g createFromParcel(Parcel parcel) {
                return new C0211g(parcel);
            }

            /* renamed from: b */
            public C0211g[] newArray(int i) {
                return new C0211g[i];
            }
        }

        C0211g() {
        }

        C0211g(Parcel parcel) {
            this.f966b = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f966b);
        }
    }

    public C0203c(Context context) {
        super(context, C0760g.abc_action_menu_layout, C0760g.abc_action_menu_item_layout);
    }

    /* renamed from: C */
    private View m1063C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f476j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AbstractC0147n.AbstractC0148a) && ((AbstractC0147n.AbstractC0148a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1319B() {
        return mo1321E() | mo1322F();
    }

    /* renamed from: D */
    public Drawable mo1320D() {
        C0207d dVar = this.f942l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f944n) {
            return this.f943m;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo1321E() {
        AbstractC0147n nVar;
        RunnableC0206c cVar = this.f938B;
        if (cVar == null || (nVar = this.f476j) == null) {
            C0209e eVar = this.f956z;
            if (eVar == null) {
                return false;
            }
            eVar.mo824b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f938B = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo1322F() {
        C0204a aVar = this.f937A;
        if (aVar == null) {
            return false;
        }
        aVar.mo824b();
        return true;
    }

    /* renamed from: G */
    public boolean mo1323G() {
        return this.f938B != null || mo1324H();
    }

    /* renamed from: H */
    public boolean mo1324H() {
        C0209e eVar = this.f956z;
        return eVar != null && eVar.mo826d();
    }

    /* renamed from: I */
    public void mo1325I(Configuration configuration) {
        if (!this.f950t) {
            this.f949s = C0784a.m4602b(this.f469c).mo4680d();
        }
        C0130g gVar = this.f470d;
        if (gVar != null) {
            gVar.mo622M(true);
        }
    }

    /* renamed from: J */
    public void mo1326J(boolean z) {
        this.f953w = z;
    }

    /* renamed from: K */
    public void mo1327K(ActionMenuView actionMenuView) {
        this.f476j = actionMenuView;
        actionMenuView.mo470b(this.f470d);
    }

    /* renamed from: L */
    public void mo1328L(Drawable drawable) {
        C0207d dVar = this.f942l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f944n = true;
        this.f943m = drawable;
    }

    /* renamed from: M */
    public void mo1329M(boolean z) {
        this.f945o = z;
        this.f946p = true;
    }

    /* renamed from: N */
    public boolean mo1330N() {
        C0130g gVar;
        if (!this.f945o || mo1324H() || (gVar = this.f470d) == null || this.f476j == null || this.f938B != null || gVar.mo612B().isEmpty()) {
            return false;
        }
        RunnableC0206c cVar = new RunnableC0206c(new C0209e(this.f469c, this.f470d, this.f942l, true));
        this.f938B = cVar;
        ((View) this.f476j).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m, androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: b */
    public void mo544b(C0130g gVar, boolean z) {
        mo1319B();
        super.mo544b(gVar, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: c */
    public void mo545c(C0134i iVar, AbstractC0147n.AbstractC0148a aVar) {
        aVar.mo450e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f476j);
        if (this.f939C == null) {
            this.f939C = new C0205b();
        }
        actionMenuItemView.setPopupCallback(this.f939C);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: e */
    public boolean mo568e() {
        int i;
        ArrayList<C0134i> arrayList;
        int i2;
        int i3;
        int i4;
        C0203c cVar = this;
        C0130g gVar = cVar.f470d;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo616G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f949s;
        int i7 = cVar.f948r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f476j;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0134i iVar = arrayList.get(i10);
            if (iVar.mo721o()) {
                i8++;
            } else if (iVar.mo720n()) {
                i9++;
            } else {
                z = true;
            }
            if (cVar.f953w && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f945o && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.f955y;
        sparseBooleanArray.clear();
        if (cVar.f951u) {
            int i12 = cVar.f954x;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0134i iVar2 = arrayList.get(i13);
            if (iVar2.mo721o()) {
                View q = cVar.mo556q(iVar2, view, viewGroup);
                if (cVar.f951u) {
                    i2 -= ActionMenuView.m873L(q, i3, i2, makeMeasureSpec, i5);
                } else {
                    q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo744u(true);
                i4 = i;
            } else if (iVar2.mo720n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!cVar.f951u || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View q2 = cVar.mo556q(iVar2, null, viewGroup);
                    if (cVar.f951u) {
                        int L = ActionMenuView.m873L(q2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = q2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z4 & (!cVar.f951u ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0134i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo718l()) {
                                i11++;
                            }
                            iVar3.mo744u(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo744u(z3);
            } else {
                i4 = i;
                iVar2.mo744u(false);
                i13++;
                view = null;
                cVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            cVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: f */
    public Parcelable mo569f() {
        C0211g gVar = new C0211g();
        gVar.f966b = this.f941E;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m, androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: g */
    public void mo547g(Context context, C0130g gVar) {
        super.mo547g(context, gVar);
        Resources resources = context.getResources();
        C0784a b = C0784a.m4602b(context);
        if (!this.f946p) {
            this.f945o = b.mo4684h();
        }
        if (!this.f952v) {
            this.f947q = b.mo4679c();
        }
        if (!this.f950t) {
            this.f949s = b.mo4680d();
        }
        int i = this.f947q;
        if (this.f945o) {
            if (this.f942l == null) {
                C0207d dVar = new C0207d(this.f468b);
                this.f942l = dVar;
                if (this.f944n) {
                    dVar.setImageDrawable(this.f943m);
                    this.f943m = null;
                    this.f944n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f942l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f942l.getMeasuredWidth();
        } else {
            this.f942l = null;
        }
        this.f948r = i;
        this.f954x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: h */
    public void mo570h(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0211g) && (i = ((C0211g) parcelable).f966b) > 0 && (findItem = this.f470d.findItem(i)) != null) {
            mo552m((SubMenuC0154r) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m, androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: m */
    public boolean mo552m(SubMenuC0154r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        SubMenuC0154r rVar2 = rVar;
        while (rVar2.mo867i0() != this.f470d) {
            rVar2 = (SubMenuC0154r) rVar2.mo867i0();
        }
        View C = m1063C(rVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f941E = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0204a aVar = new C0204a(this.f469c, rVar, C);
        this.f937A = aVar;
        aVar.mo829g(z);
        this.f937A.mo833k();
        super.mo552m(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m, androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: n */
    public void mo553n(boolean z) {
        AbstractC0147n nVar;
        super.mo553n(z);
        ((View) this.f476j).requestLayout();
        C0130g gVar = this.f470d;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0134i> u = gVar.mo681u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                AbstractC0974b b = u.get(i).mo485b();
                if (b != null) {
                    b.mo5445i(this);
                }
            }
        }
        C0130g gVar2 = this.f470d;
        ArrayList<C0134i> B = gVar2 != null ? gVar2.mo612B() : null;
        if (this.f945o && B != null) {
            int size2 = B.size();
            if (size2 == 1) {
                z2 = !B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0207d dVar = this.f942l;
        if (z2) {
            if (dVar == null) {
                this.f942l = new C0207d(this.f468b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f942l.getParent();
            if (viewGroup != this.f476j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f942l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f476j;
                actionMenuView.addView(this.f942l, actionMenuView.mo992F());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f476j)) {
            ((ViewGroup) nVar).removeView(this.f942l);
        }
        ((ActionMenuView) this.f476j).setOverflowReserved(this.f945o);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: o */
    public boolean mo554o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f942l) {
            return false;
        }
        return super.mo554o(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: q */
    public View mo556q(C0134i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo716j()) {
            actionView = super.mo556q(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1012o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: r */
    public AbstractC0147n mo557r(ViewGroup viewGroup) {
        AbstractC0147n nVar = this.f476j;
        AbstractC0147n r = super.mo557r(viewGroup);
        if (nVar != r) {
            ((ActionMenuView) r).setPresenter(this);
        }
        return r;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0119b
    /* renamed from: t */
    public boolean mo559t(int i, C0134i iVar) {
        return iVar.mo718l();
    }
}
