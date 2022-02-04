package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.widget.C0230h0;

public class ActionMenuView extends C0230h0 implements C0130g.AbstractC0132b, AbstractC0147n {

    /* renamed from: A */
    private int f709A;

    /* renamed from: B */
    AbstractC0166e f710B;

    /* renamed from: q */
    private C0130g f711q;

    /* renamed from: r */
    private Context f712r;

    /* renamed from: s */
    private int f713s;

    /* renamed from: t */
    private boolean f714t;

    /* renamed from: u */
    private C0203c f715u;

    /* renamed from: v */
    private AbstractC0145m.AbstractC0146a f716v;

    /* renamed from: w */
    C0130g.AbstractC0131a f717w;

    /* renamed from: x */
    private boolean f718x;

    /* renamed from: y */
    private int f719y;

    /* renamed from: z */
    private int f720z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface AbstractC0162a {
        /* renamed from: a */
        boolean mo447a();

        /* renamed from: b */
        boolean mo448b();
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0163b implements AbstractC0145m.AbstractC0146a {
        C0163b() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: b */
        public void mo347b(C0130g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: c */
        public boolean mo348c(C0130g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0164c extends C0230h0.C0231a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f721c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f722d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f723e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f724f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f725g;

        /* renamed from: h */
        boolean f726h;

        public C0164c(int i, int i2) {
            super(i, i2);
            this.f721c = false;
        }

        public C0164c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0164c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0164c(C0164c cVar) {
            super(cVar);
            this.f721c = cVar.f721c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0165d implements C0130g.AbstractC0131a {
        C0165d() {
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: a */
        public boolean mo320a(C0130g gVar, MenuItem menuItem) {
            AbstractC0166e eVar = ActionMenuView.this.f710B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: b */
        public void mo322b(C0130g gVar) {
            C0130g.AbstractC0131a aVar = ActionMenuView.this.f717w;
            if (aVar != null) {
                aVar.mo322b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface AbstractC0166e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f720z = (int) (56.0f * f);
        this.f709A = (int) (f * 4.0f);
        this.f712r = context;
        this.f713s = 0;
    }

    /* renamed from: L */
    static int m873L(View view, int i, int i2, int i3, int i4) {
        C0164c cVar = (C0164c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo451f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f721c || !z2) {
            z = false;
        }
        cVar.f724f = z;
        cVar.f722d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m874M(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m874M(int, int):void");
    }

    /* renamed from: B */
    public void mo988B() {
        C0203c cVar = this.f715u;
        if (cVar != null) {
            cVar.mo1319B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0164c mo1010m() {
        C0164c cVar = new C0164c(-2, -2);
        cVar.f1031b = 16;
        return cVar;
    }

    /* renamed from: D */
    public C0164c mo1011n(AttributeSet attributeSet) {
        return new C0164c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C0164c mo1012o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo1010m();
        }
        C0164c cVar = layoutParams instanceof C0164c ? new C0164c((C0164c) layoutParams) : new C0164c(layoutParams);
        if (cVar.f1031b <= 0) {
            cVar.f1031b = 16;
        }
        return cVar;
    }

    /* renamed from: F */
    public C0164c mo992F() {
        C0164c C = mo1010m();
        C.f721c = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo993G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC0162a)) {
            z = false | ((AbstractC0162a) childAt).mo447a();
        }
        return (i <= 0 || !(childAt2 instanceof AbstractC0162a)) ? z : z | ((AbstractC0162a) childAt2).mo448b();
    }

    /* renamed from: H */
    public boolean mo994H() {
        C0203c cVar = this.f715u;
        return cVar != null && cVar.mo1321E();
    }

    /* renamed from: I */
    public boolean mo995I() {
        C0203c cVar = this.f715u;
        return cVar != null && cVar.mo1323G();
    }

    /* renamed from: J */
    public boolean mo996J() {
        C0203c cVar = this.f715u;
        return cVar != null && cVar.mo1324H();
    }

    /* renamed from: K */
    public boolean mo997K() {
        return this.f714t;
    }

    /* renamed from: N */
    public C0130g mo998N() {
        return this.f711q;
    }

    /* renamed from: O */
    public void mo999O(AbstractC0145m.AbstractC0146a aVar, C0130g.AbstractC0131a aVar2) {
        this.f716v = aVar;
        this.f717w = aVar2;
    }

    /* renamed from: P */
    public boolean mo1000P() {
        C0203c cVar = this.f715u;
        return cVar != null && cVar.mo1330N();
    }

    @Override // androidx.appcompat.view.menu.C0130g.AbstractC0132b
    /* renamed from: a */
    public boolean mo469a(C0134i iVar) {
        return this.f711q.mo623N(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n
    /* renamed from: b */
    public void mo470b(C0130g gVar) {
        this.f711q = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0230h0
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0164c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f711q == null) {
            Context context = getContext();
            C0130g gVar = new C0130g(context);
            this.f711q = gVar;
            gVar.mo630V(new C0165d());
            C0203c cVar = new C0203c(context);
            this.f715u = cVar;
            cVar.mo1329M(true);
            C0203c cVar2 = this.f715u;
            AbstractC0145m.AbstractC0146a aVar = this.f716v;
            if (aVar == null) {
                aVar = new C0163b();
            }
            cVar2.mo550k(aVar);
            this.f711q.mo647c(this.f715u, this.f712r);
            this.f715u.mo1327K(this);
        }
        return this.f711q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f715u.mo1320D();
    }

    public int getPopupTheme() {
        return this.f713s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0203c cVar = this.f715u;
        if (cVar != null) {
            cVar.mo553n(false);
            if (this.f715u.mo1324H()) {
                this.f715u.mo1321E();
                this.f715u.mo1330N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo988B();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0230h0
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f718x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0214c1.m1132b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0164c cVar = (C0164c) childAt.getLayoutParams();
                if (cVar.f721c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo993G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    mo993G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0164c cVar2 = (C0164c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f721c) {
                    int i17 = width - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0164c cVar3 = (C0164c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f721c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0230h0
    public void onMeasure(int i, int i2) {
        C0130g gVar;
        boolean z = this.f718x;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f718x = z2;
        if (z != z2) {
            this.f719y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f718x || (gVar = this.f711q) == null || size == this.f719y)) {
            this.f719y = size;
            gVar.mo622M(true);
        }
        int childCount = getChildCount();
        if (!this.f718x || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0164c cVar = (C0164c) getChildAt(i3).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m874M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f715u.mo1326J(z);
    }

    public void setOnMenuItemClickListener(AbstractC0166e eVar) {
        this.f710B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f715u.mo1328L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f714t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f713s != i) {
            this.f713s = i;
            if (i == 0) {
                this.f712r = getContext();
            } else {
                this.f712r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0203c cVar) {
        this.f715u = cVar;
        cVar.mo1327K(this);
    }
}
