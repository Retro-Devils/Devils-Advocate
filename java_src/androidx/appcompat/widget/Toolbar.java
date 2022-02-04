package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.view.menu.SubMenuC0154r;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import p006b.p007a.C0754a;
import p006b.p007a.C0763j;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p007a.p014o.AbstractC0787c;
import p006b.p007a.p014o.C0792g;
import p006b.p030g.p039k.C0997d;
import p006b.p030g.p039k.C1001g;
import p006b.p030g.p039k.C1013s;
import p006b.p043i.p044a.AbstractC1041a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ColorStateList f860A;

    /* renamed from: B */
    private ColorStateList f861B;

    /* renamed from: C */
    private boolean f862C;

    /* renamed from: D */
    private boolean f863D;

    /* renamed from: E */
    private final ArrayList<View> f864E;

    /* renamed from: F */
    private final ArrayList<View> f865F;

    /* renamed from: G */
    private final int[] f866G;

    /* renamed from: H */
    AbstractC0192f f867H;

    /* renamed from: I */
    private final ActionMenuView.AbstractC0166e f868I;

    /* renamed from: J */
    private C0299x0 f869J;

    /* renamed from: K */
    private C0203c f870K;

    /* renamed from: L */
    private C0190d f871L;

    /* renamed from: M */
    private AbstractC0145m.AbstractC0146a f872M;

    /* renamed from: N */
    private C0130g.AbstractC0131a f873N;

    /* renamed from: O */
    private boolean f874O;

    /* renamed from: P */
    private final Runnable f875P;

    /* renamed from: b */
    private ActionMenuView f876b;

    /* renamed from: c */
    private TextView f877c;

    /* renamed from: d */
    private TextView f878d;

    /* renamed from: e */
    private ImageButton f879e;

    /* renamed from: f */
    private ImageView f880f;

    /* renamed from: g */
    private Drawable f881g;

    /* renamed from: h */
    private CharSequence f882h;

    /* renamed from: i */
    ImageButton f883i;

    /* renamed from: j */
    View f884j;

    /* renamed from: k */
    private Context f885k;

    /* renamed from: l */
    private int f886l;

    /* renamed from: m */
    private int f887m;

    /* renamed from: n */
    private int f888n;

    /* renamed from: o */
    int f889o;

    /* renamed from: p */
    private int f890p;

    /* renamed from: q */
    private int f891q;

    /* renamed from: r */
    private int f892r;

    /* renamed from: s */
    private int f893s;

    /* renamed from: t */
    private int f894t;

    /* renamed from: u */
    private C0264o0 f895u;

    /* renamed from: v */
    private int f896v;

    /* renamed from: w */
    private int f897w;

    /* renamed from: x */
    private int f898x;

    /* renamed from: y */
    private CharSequence f899y;

    /* renamed from: z */
    private CharSequence f900z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0187a implements ActionMenuView.AbstractC0166e {
        C0187a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0166e
        public boolean onMenuItemClick(MenuItem menuItem) {
            AbstractC0192f fVar = Toolbar.this.f867H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class RunnableC0188b implements Runnable {
        RunnableC0188b() {
        }

        public void run() {
            Toolbar.this.mo1196O();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class View$OnClickListenerC0189c implements View.OnClickListener {
        View$OnClickListenerC0189c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1200e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0190d implements AbstractC0145m {

        /* renamed from: b */
        C0130g f904b;

        /* renamed from: c */
        C0134i f905c;

        C0190d() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: b */
        public void mo544b(C0130g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: d */
        public int mo546d() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: e */
        public boolean mo568e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: f */
        public Parcelable mo569f() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: g */
        public void mo547g(Context context, C0130g gVar) {
            C0134i iVar;
            C0130g gVar2 = this.f904b;
            if (!(gVar2 == null || (iVar = this.f905c) == null)) {
                gVar2.mo656f(iVar);
            }
            this.f904b = gVar;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: h */
        public void mo570h(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: i */
        public boolean mo548i(C0130g gVar, C0134i iVar) {
            View view = Toolbar.this.f884j;
            if (view instanceof AbstractC0787c) {
                ((AbstractC0787c) view).mo817f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f884j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f883i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f884j = null;
            toolbar3.mo1197a();
            this.f905c = null;
            Toolbar.this.requestLayout();
            iVar.mo724r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: j */
        public boolean mo549j(C0130g gVar, C0134i iVar) {
            Toolbar.this.mo1202g();
            ViewParent parent = Toolbar.this.f883i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f883i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f883i);
            }
            Toolbar.this.f884j = iVar.getActionView();
            this.f905c = iVar;
            ViewParent parent2 = Toolbar.this.f884j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f884j);
                }
                C0191e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f223a = 8388611 | (toolbar4.f889o & 112);
                m.f907b = 2;
                toolbar4.f884j.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f884j);
            }
            Toolbar.this.mo1190G();
            Toolbar.this.requestLayout();
            iVar.mo724r(true);
            View view = Toolbar.this.f884j;
            if (view instanceof AbstractC0787c) {
                ((AbstractC0787c) view).mo816c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: m */
        public boolean mo552m(SubMenuC0154r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m
        /* renamed from: n */
        public void mo553n(boolean z) {
            if (this.f905c != null) {
                C0130g gVar = this.f904b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f904b.getItem(i) == this.f905c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo548i(this.f904b, this.f905c);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0191e extends AbstractC0064a.C0065a {

        /* renamed from: b */
        int f907b = 0;

        public C0191e(int i, int i2) {
            super(i, i2);
            this.f223a = 8388627;
        }

        public C0191e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0191e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0191e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            mo1284a(marginLayoutParams);
        }

        public C0191e(AbstractC0064a.C0065a aVar) {
            super(aVar);
        }

        public C0191e(C0191e eVar) {
            super((AbstractC0064a.C0065a) eVar);
            this.f907b = eVar.f907b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1284a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface AbstractC0192f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0193g extends AbstractC1041a {
        public static final Parcelable.Creator<C0193g> CREATOR = new C0194a();

        /* renamed from: d */
        int f908d;

        /* renamed from: e */
        boolean f909e;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        class C0194a implements Parcelable.ClassLoaderCreator<C0193g> {
            C0194a() {
            }

            /* renamed from: a */
            public C0193g createFromParcel(Parcel parcel) {
                return new C0193g(parcel, null);
            }

            /* renamed from: b */
            public C0193g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0193g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0193g[] newArray(int i) {
                return new C0193g[i];
            }
        }

        public C0193g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f908d = parcel.readInt();
            this.f909e = parcel.readInt() != 0;
        }

        public C0193g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f908d);
            parcel.writeInt(this.f909e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.f3567P);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f898x = 8388627;
        this.f864E = new ArrayList<>();
        this.f865F = new ArrayList<>();
        this.f866G = new int[2];
        this.f868I = new C0187a();
        this.f875P = new RunnableC0188b();
        Context context2 = getContext();
        int[] iArr = C0763j.f3756k3;
        C0296w0 v = C0296w0.m1432v(context2, attributeSet, iArr, i, 0);
        C1013s.m5762g0(this, context, iArr, attributeSet, v.mo1821r(), i, 0);
        this.f887m = v.mo1817n(C0763j.f3637M3, 0);
        this.f888n = v.mo1817n(C0763j.f3592D3, 0);
        this.f898x = v.mo1815l(C0763j.f3761l3, this.f898x);
        this.f889o = v.mo1815l(C0763j.f3766m3, 48);
        int e = v.mo1808e(C0763j.f3607G3, 0);
        int i2 = C0763j.f3632L3;
        e = v.mo1822s(i2) ? v.mo1808e(i2, e) : e;
        this.f894t = e;
        this.f893s = e;
        this.f892r = e;
        this.f891q = e;
        int e2 = v.mo1808e(C0763j.f3622J3, -1);
        if (e2 >= 0) {
            this.f891q = e2;
        }
        int e3 = v.mo1808e(C0763j.f3617I3, -1);
        if (e3 >= 0) {
            this.f892r = e3;
        }
        int e4 = v.mo1808e(C0763j.f3627K3, -1);
        if (e4 >= 0) {
            this.f893s = e4;
        }
        int e5 = v.mo1808e(C0763j.f3612H3, -1);
        if (e5 >= 0) {
            this.f894t = e5;
        }
        this.f890p = v.mo1809f(C0763j.f3821x3, -1);
        int e6 = v.mo1808e(C0763j.f3801t3, Integer.MIN_VALUE);
        int e7 = v.mo1808e(C0763j.f3781p3, Integer.MIN_VALUE);
        int f = v.mo1809f(C0763j.f3791r3, 0);
        int f2 = v.mo1809f(C0763j.f3796s3, 0);
        m986h();
        this.f895u.mo1664e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f895u.mo1666g(e6, e7);
        }
        this.f896v = v.mo1808e(C0763j.f3806u3, Integer.MIN_VALUE);
        this.f897w = v.mo1808e(C0763j.f3786q3, Integer.MIN_VALUE);
        this.f881g = v.mo1810g(C0763j.f3776o3);
        this.f882h = v.mo1819p(C0763j.f3771n3);
        CharSequence p = v.mo1819p(C0763j.f3602F3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo1819p(C0763j.f3587C3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f885k = getContext();
        setPopupTheme(v.mo1817n(C0763j.f3582B3, 0));
        Drawable g = v.mo1810g(C0763j.f3577A3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo1819p(C0763j.f3831z3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo1810g(C0763j.f3811v3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo1819p(C0763j.f3816w3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C0763j.f3642N3;
        if (v.mo1822s(i3)) {
            setTitleTextColor(v.mo1806c(i3));
        }
        int i4 = C0763j.f3597E3;
        if (v.mo1822s(i4)) {
            setSubtitleTextColor(v.mo1806c(i4));
        }
        int i5 = C0763j.f3826y3;
        if (v.mo1822s(i5)) {
            mo1280x(v.mo1817n(i5, 0));
        }
        v.mo1823w();
    }

    /* renamed from: B */
    private int m977B(View view, int i, int[] iArr, int i2) {
        C0191e eVar = (C0191e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m992q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    /* renamed from: C */
    private int m978C(View view, int i, int[] iArr, int i2) {
        C0191e eVar = (C0191e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m992q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    /* renamed from: D */
    private int m979D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m980E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m981F() {
        removeCallbacks(this.f875P);
        post(this.f875P);
    }

    /* renamed from: M */
    private boolean m982M() {
        if (!this.f874O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m983N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private boolean m983N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m984b(List<View> list, int i) {
        boolean z = C1013s.m5797y(this) == 1;
        int childCount = getChildCount();
        int b = C0997d.m5669b(i, C1013s.m5797y(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0191e eVar = (C0191e) childAt.getLayoutParams();
                if (eVar.f907b == 0 && m983N(childAt) && m991p(eVar.f223a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0191e eVar2 = (C0191e) childAt2.getLayoutParams();
            if (eVar2.f907b == 0 && m983N(childAt2) && m991p(eVar2.f223a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m985c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0191e m = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0191e) layoutParams;
        m.f907b = 1;
        if (!z || this.f884j == null) {
            addView(view, m);
            return;
        }
        view.setLayoutParams(m);
        this.f865F.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0792g(getContext());
    }

    /* renamed from: h */
    private void m986h() {
        if (this.f895u == null) {
            this.f895u = new C0264o0();
        }
    }

    /* renamed from: i */
    private void m987i() {
        if (this.f880f == null) {
            this.f880f = new C0263o(getContext());
        }
    }

    /* renamed from: j */
    private void m988j() {
        m989k();
        if (this.f876b.mo998N() == null) {
            C0130g gVar = (C0130g) this.f876b.getMenu();
            if (this.f871L == null) {
                this.f871L = new C0190d();
            }
            this.f876b.setExpandedActionViewsExclusive(true);
            gVar.mo647c(this.f871L, this.f885k);
        }
    }

    /* renamed from: k */
    private void m989k() {
        if (this.f876b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f876b = actionMenuView;
            actionMenuView.setPopupTheme(this.f886l);
            this.f876b.setOnMenuItemClickListener(this.f868I);
            this.f876b.mo999O(this.f872M, this.f873N);
            C0191e m = generateDefaultLayoutParams();
            m.f223a = 8388613 | (this.f889o & 112);
            this.f876b.setLayoutParams(m);
            m985c(this.f876b, false);
        }
    }

    /* renamed from: l */
    private void m990l() {
        if (this.f879e == null) {
            this.f879e = new C0253m(getContext(), null, C0754a.toolbarNavigationButtonStyle);
            C0191e m = generateDefaultLayoutParams();
            m.f223a = 8388611 | (this.f889o & 112);
            this.f879e.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m991p(int i) {
        int y = C1013s.m5797y(this);
        int b = C0997d.m5669b(i, y) & 7;
        return (b == 1 || b == 3 || b == 5) ? b : y == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m992q(View view, int i) {
        C0191e eVar = (C0191e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m993r(eVar.f223a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m993r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f898x & 112;
    }

    /* renamed from: s */
    private int m994s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1001g.m5680b(marginLayoutParams) + C1001g.m5679a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m995t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m996u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0191e eVar = (C0191e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m997y(View view) {
        return view.getParent() == this || this.f865F.contains(view);
    }

    /* renamed from: A */
    public boolean mo1189A() {
        ActionMenuView actionMenuView = this.f876b;
        return actionMenuView != null && actionMenuView.mo996J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo1190G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0191e) childAt.getLayoutParams()).f907b == 2 || childAt == this.f876b)) {
                removeViewAt(childCount);
                this.f865F.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void mo1191H(int i, int i2) {
        m986h();
        this.f895u.mo1666g(i, i2);
    }

    /* renamed from: I */
    public void mo1192I(C0130g gVar, C0203c cVar) {
        if (gVar != null || this.f876b != null) {
            m989k();
            C0130g N = this.f876b.mo998N();
            if (N != gVar) {
                if (N != null) {
                    N.mo625Q(this.f870K);
                    N.mo625Q(this.f871L);
                }
                if (this.f871L == null) {
                    this.f871L = new C0190d();
                }
                cVar.mo1326J(true);
                if (gVar != null) {
                    gVar.mo647c(cVar, this.f885k);
                    gVar.mo647c(this.f871L, this.f885k);
                } else {
                    cVar.mo547g(this.f885k, null);
                    this.f871L.mo547g(this.f885k, null);
                    cVar.mo553n(true);
                    this.f871L.mo553n(true);
                }
                this.f876b.setPopupTheme(this.f886l);
                this.f876b.setPresenter(cVar);
                this.f870K = cVar;
            }
        }
    }

    /* renamed from: J */
    public void mo1193J(AbstractC0145m.AbstractC0146a aVar, C0130g.AbstractC0131a aVar2) {
        this.f872M = aVar;
        this.f873N = aVar2;
        ActionMenuView actionMenuView = this.f876b;
        if (actionMenuView != null) {
            actionMenuView.mo999O(aVar, aVar2);
        }
    }

    /* renamed from: K */
    public void mo1194K(Context context, int i) {
        this.f888n = i;
        TextView textView = this.f878d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: L */
    public void mo1195L(Context context, int i) {
        this.f887m = i;
        TextView textView = this.f877c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public boolean mo1196O() {
        ActionMenuView actionMenuView = this.f876b;
        return actionMenuView != null && actionMenuView.mo1000P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1197a() {
        for (int size = this.f865F.size() - 1; size >= 0; size--) {
            addView(this.f865F.get(size));
        }
        this.f865F.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0191e);
    }

    /* renamed from: d */
    public boolean mo1199d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f876b) != null && actionMenuView.mo997K();
    }

    /* renamed from: e */
    public void mo1200e() {
        C0190d dVar = this.f871L;
        C0134i iVar = dVar == null ? null : dVar.f905c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1201f() {
        ActionMenuView actionMenuView = this.f876b;
        if (actionMenuView != null) {
            actionMenuView.mo988B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1202g() {
        if (this.f883i == null) {
            C0253m mVar = new C0253m(getContext(), null, C0754a.toolbarNavigationButtonStyle);
            this.f883i = mVar;
            mVar.setImageDrawable(this.f881g);
            this.f883i.setContentDescription(this.f882h);
            C0191e m = generateDefaultLayoutParams();
            m.f223a = 8388611 | (this.f889o & 112);
            m.f907b = 2;
            this.f883i.setLayoutParams(m);
            this.f883i.setOnClickListener(new View$OnClickListenerC0189c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f883i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f883i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0264o0 o0Var = this.f895u;
        if (o0Var != null) {
            return o0Var.mo1660a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f897w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0264o0 o0Var = this.f895u;
        if (o0Var != null) {
            return o0Var.mo1661b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0264o0 o0Var = this.f895u;
        if (o0Var != null) {
            return o0Var.mo1662c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0264o0 o0Var = this.f895u;
        if (o0Var != null) {
            return o0Var.mo1663d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f896v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0130g N;
        ActionMenuView actionMenuView = this.f876b;
        return actionMenuView != null && (N = actionMenuView.mo998N()) != null && N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f897w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C1013s.m5797y(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C1013s.m5797y(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f896v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f880f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f880f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m988j();
        return this.f876b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f879e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f879e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0203c getOuterActionMenuPresenter() {
        return this.f870K;
    }

    public Drawable getOverflowIcon() {
        m988j();
        return this.f876b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f885k;
    }

    public int getPopupTheme() {
        return this.f886l;
    }

    public CharSequence getSubtitle() {
        return this.f900z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f878d;
    }

    public CharSequence getTitle() {
        return this.f899y;
    }

    public int getTitleMarginBottom() {
        return this.f894t;
    }

    public int getTitleMarginEnd() {
        return this.f892r;
    }

    public int getTitleMarginStart() {
        return this.f891q;
    }

    public int getTitleMarginTop() {
        return this.f893s;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f877c;
    }

    public AbstractC0213c0 getWrapper() {
        if (this.f869J == null) {
            this.f869J = new C0299x0(this, true);
        }
        return this.f869J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0191e generateDefaultLayoutParams() {
        return new C0191e(-2, -2);
    }

    /* renamed from: n */
    public C0191e generateLayoutParams(AttributeSet attributeSet) {
        return new C0191e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0191e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0191e ? new C0191e((C0191e) layoutParams) : layoutParams instanceof AbstractC0064a.C0065a ? new C0191e((AbstractC0064a.C0065a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0191e((ViewGroup.MarginLayoutParams) layoutParams) : new C0191e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f875P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f863D = false;
        }
        if (!this.f863D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f863D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f863D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 773
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f866G;
        int i10 = 0;
        if (C0214c1.m1132b(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m983N(this.f879e)) {
            m980E(this.f879e, i, 0, i2, 0, this.f890p);
            i5 = this.f879e.getMeasuredWidth() + m994s(this.f879e);
            i4 = Math.max(0, this.f879e.getMeasuredHeight() + m995t(this.f879e));
            i3 = View.combineMeasuredStates(0, this.f879e.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m983N(this.f883i)) {
            m980E(this.f883i, i, 0, i2, 0, this.f890p);
            i5 = this.f883i.getMeasuredWidth() + m994s(this.f883i);
            i4 = Math.max(i4, this.f883i.getMeasuredHeight() + m995t(this.f883i));
            i3 = View.combineMeasuredStates(i3, this.f883i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m983N(this.f876b)) {
            m980E(this.f876b, i, max, i2, 0, this.f890p);
            i6 = this.f876b.getMeasuredWidth() + m994s(this.f876b);
            i4 = Math.max(i4, this.f876b.getMeasuredHeight() + m995t(this.f876b));
            i3 = View.combineMeasuredStates(i3, this.f876b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m983N(this.f884j)) {
            max2 += m979D(this.f884j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f884j.getMeasuredHeight() + m995t(this.f884j));
            i3 = View.combineMeasuredStates(i3, this.f884j.getMeasuredState());
        }
        if (m983N(this.f880f)) {
            max2 += m979D(this.f880f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f880f.getMeasuredHeight() + m995t(this.f880f));
            i3 = View.combineMeasuredStates(i3, this.f880f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0191e) childAt.getLayoutParams()).f907b == 0 && m983N(childAt)) {
                max2 += m979D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m995t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f893s + this.f894t;
        int i13 = this.f891q + this.f892r;
        if (m983N(this.f877c)) {
            m979D(this.f877c, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f877c.getMeasuredWidth() + m994s(this.f877c);
            i7 = this.f877c.getMeasuredHeight() + m995t(this.f877c);
            i9 = View.combineMeasuredStates(i3, this.f877c.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m983N(this.f878d)) {
            i8 = Math.max(i8, m979D(this.f878d, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f878d.getMeasuredHeight() + m995t(this.f878d);
            i9 = View.combineMeasuredStates(i9, this.f878d.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m982M()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0193g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0193g gVar = (C0193g) parcelable;
        super.onRestoreInstanceState(gVar.mo5608b());
        ActionMenuView actionMenuView = this.f876b;
        C0130g N = actionMenuView != null ? actionMenuView.mo998N() : null;
        int i = gVar.f908d;
        if (!(i == 0 || this.f871L == null || N == null || (findItem = N.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f909e) {
            m981F();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m986h();
        C0264o0 o0Var = this.f895u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        o0Var.mo1665f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0134i iVar;
        C0193g gVar = new C0193g(super.onSaveInstanceState());
        C0190d dVar = this.f871L;
        if (!(dVar == null || (iVar = dVar.f905c) == null)) {
            gVar.f908d = iVar.getItemId();
        }
        gVar.f909e = mo1189A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f862C = false;
        }
        if (!this.f862C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f862C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f862C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1202g();
        }
        ImageButton imageButton = this.f883i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0764a.m4517d(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1202g();
            this.f883i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f883i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f881g);
        }
    }

    public void setCollapsible(boolean z) {
        this.f874O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f897w) {
            this.f897w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f896v) {
            this.f896v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0764a.m4517d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m987i();
            if (!m997y(this.f880f)) {
                m985c(this.f880f, true);
            }
        } else {
            ImageView imageView = this.f880f;
            if (imageView != null && m997y(imageView)) {
                removeView(this.f880f);
                this.f865F.remove(this.f880f);
            }
        }
        ImageView imageView2 = this.f880f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m987i();
        }
        ImageView imageView = this.f880f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m990l();
        }
        ImageButton imageButton = this.f879e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0764a.m4517d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m990l();
            if (!m997y(this.f879e)) {
                m985c(this.f879e, true);
            }
        } else {
            ImageButton imageButton = this.f879e;
            if (imageButton != null && m997y(imageButton)) {
                removeView(this.f879e);
                this.f865F.remove(this.f879e);
            }
        }
        ImageButton imageButton2 = this.f879e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m990l();
        this.f879e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(AbstractC0192f fVar) {
        this.f867H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m988j();
        this.f876b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f886l != i) {
            this.f886l = i;
            if (i == 0) {
                this.f885k = getContext();
            } else {
                this.f885k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f878d == null) {
                Context context = getContext();
                C0302y yVar = new C0302y(context);
                this.f878d = yVar;
                yVar.setSingleLine();
                this.f878d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f888n;
                if (i != 0) {
                    this.f878d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f861B;
                if (colorStateList != null) {
                    this.f878d.setTextColor(colorStateList);
                }
            }
            if (!m997y(this.f878d)) {
                m985c(this.f878d, true);
            }
        } else {
            TextView textView = this.f878d;
            if (textView != null && m997y(textView)) {
                removeView(this.f878d);
                this.f865F.remove(this.f878d);
            }
        }
        TextView textView2 = this.f878d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f900z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f861B = colorStateList;
        TextView textView = this.f878d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f877c == null) {
                Context context = getContext();
                C0302y yVar = new C0302y(context);
                this.f877c = yVar;
                yVar.setSingleLine();
                this.f877c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f887m;
                if (i != 0) {
                    this.f877c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f860A;
                if (colorStateList != null) {
                    this.f877c.setTextColor(colorStateList);
                }
            }
            if (!m997y(this.f877c)) {
                m985c(this.f877c, true);
            }
        } else {
            TextView textView = this.f877c;
            if (textView != null && m997y(textView)) {
                removeView(this.f877c);
                this.f865F.remove(this.f877c);
            }
        }
        TextView textView2 = this.f877c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f899y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f894t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f892r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f891q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f893s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f860A = colorStateList;
        TextView textView = this.f877c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: v */
    public boolean mo1278v() {
        C0190d dVar = this.f871L;
        return (dVar == null || dVar.f905c == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1279w() {
        ActionMenuView actionMenuView = this.f876b;
        return actionMenuView != null && actionMenuView.mo994H();
    }

    /* renamed from: x */
    public void mo1280x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean mo1281z() {
        ActionMenuView actionMenuView = this.f876b;
        return actionMenuView != null && actionMenuView.mo995I();
    }
}
