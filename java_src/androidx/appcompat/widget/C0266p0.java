package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.widget.C0230h0;
import p006b.p007a.C0754a;
import p006b.p007a.p014o.C0784a;

/* renamed from: androidx.appcompat.widget.p0 */
public class C0266p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    private static final Interpolator f1136b = new DecelerateInterpolator();

    /* renamed from: c */
    Runnable f1137c;

    /* renamed from: d */
    private View$OnClickListenerC0269c f1138d;

    /* renamed from: e */
    C0230h0 f1139e;

    /* renamed from: f */
    private Spinner f1140f;

    /* renamed from: g */
    private boolean f1141g;

    /* renamed from: h */
    int f1142h;

    /* renamed from: i */
    int f1143i;

    /* renamed from: j */
    private int f1144j;

    /* renamed from: k */
    private int f1145k;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.p0$a */
    public class RunnableC0267a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1146b;

        RunnableC0267a(View view) {
            this.f1146b = view;
        }

        public void run() {
            C0266p0.this.smoothScrollTo(this.f1146b.getLeft() - ((C0266p0.this.getWidth() - this.f1146b.getWidth()) / 2), 0);
            C0266p0.this.f1137c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p0$b */
    public class C0268b extends BaseAdapter {
        C0268b() {
        }

        public int getCount() {
            return C0266p0.this.f1139e.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0270d) C0266p0.this.f1139e.getChildAt(i)).mo1691b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0266p0.this.mo1674c((AbstractC0064a.AbstractC0067c) getItem(i), true);
            }
            ((C0270d) view).mo1690a((AbstractC0064a.AbstractC0067c) getItem(i));
            return view;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p0$c */
    public class View$OnClickListenerC0269c implements View.OnClickListener {
        View$OnClickListenerC0269c() {
        }

        public void onClick(View view) {
            ((C0270d) view).mo1691b().mo214e();
            int childCount = C0266p0.this.f1139e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0266p0.this.f1139e.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p0$d */
    public class C0270d extends LinearLayout {

        /* renamed from: b */
        private final int[] f1150b;

        /* renamed from: c */
        private AbstractC0064a.AbstractC0067c f1151c;

        /* renamed from: d */
        private TextView f1152d;

        /* renamed from: e */
        private ImageView f1153e;

        /* renamed from: f */
        private View f1154f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0270d(android.content.Context r6, androidx.appcompat.app.AbstractC0064a.AbstractC0067c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0266p0.this = r5
                int r5 = p006b.p007a.C0754a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1150b = r1
                r4.f1151c = r7
                androidx.appcompat.widget.w0 r5 = androidx.appcompat.widget.C0296w0.m1432v(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo1822s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo1810g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo1823w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo1692c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0266p0.C0270d.<init>(androidx.appcompat.widget.p0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        /* renamed from: a */
        public void mo1690a(AbstractC0064a.AbstractC0067c cVar) {
            this.f1151c = cVar;
            mo1692c();
        }

        /* renamed from: b */
        public AbstractC0064a.AbstractC0067c mo1691b() {
            return this.f1151c;
        }

        /* renamed from: c */
        public void mo1692c() {
            AbstractC0064a.AbstractC0067c cVar = this.f1151c;
            View b = cVar.mo211b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1154f = b;
                TextView textView = this.f1152d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1153e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1153e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1154f;
            if (view != null) {
                removeView(view);
                this.f1154f = null;
            }
            Drawable c = cVar.mo212c();
            CharSequence d = cVar.mo213d();
            if (c != null) {
                if (this.f1153e == null) {
                    C0263o oVar = new C0263o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1153e = oVar;
                }
                this.f1153e.setImageDrawable(c);
                this.f1153e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1153e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1153e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1152d == null) {
                    C0302y yVar = new C0302y(getContext(), null, C0754a.actionBarTabTextStyle);
                    yVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    yVar.setLayoutParams(layoutParams2);
                    addView(yVar);
                    this.f1152d = yVar;
                }
                this.f1152d.setText(d);
                this.f1152d.setVisibility(0);
            } else {
                TextView textView2 = this.f1152d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1152d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1153e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo210a());
            }
            if (!z) {
                charSequence = cVar.mo210a();
            }
            C0303y0.m1525a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0266p0.this.f1142h > 0 && getMeasuredWidth() > (i3 = C0266p0.this.f1142h)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1335b() {
        C0282v vVar = new C0282v(getContext(), null, C0754a.actionDropDownStyle);
        vVar.setLayoutParams(new C0230h0.C0231a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    /* renamed from: d */
    private boolean m1336d() {
        Spinner spinner = this.f1140f;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1337e() {
        if (!m1336d()) {
            if (this.f1140f == null) {
                this.f1140f = m1335b();
            }
            removeView(this.f1139e);
            addView(this.f1140f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1140f.getAdapter() == null) {
                this.f1140f.setAdapter((SpinnerAdapter) new C0268b());
            }
            Runnable runnable = this.f1137c;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1137c = null;
            }
            this.f1140f.setSelection(this.f1145k);
        }
    }

    /* renamed from: f */
    private boolean m1338f() {
        if (!m1336d()) {
            return false;
        }
        removeView(this.f1140f);
        addView(this.f1139e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1140f.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo1673a(int i) {
        View childAt = this.f1139e.getChildAt(i);
        Runnable runnable = this.f1137c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0267a aVar = new RunnableC0267a(childAt);
        this.f1137c = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0270d mo1674c(AbstractC0064a.AbstractC0067c cVar, boolean z) {
        C0270d dVar = new C0270d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1144j));
        } else {
            dVar.setFocusable(true);
            if (this.f1138d == null) {
                this.f1138d = new View$OnClickListenerC0269c();
            }
            dVar.setOnClickListener(this.f1138d);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1137c;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0784a b = C0784a.m4602b(getContext());
        setContentHeight(b.mo4682f());
        this.f1143i = b.mo4681e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1137c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0270d) view).mo1691b().mo214e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1139e.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1142h = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1142h = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1142h, this.f1143i);
        }
        this.f1142h = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1144j, 1073741824);
        if (z2 || !this.f1141g) {
            z = false;
        }
        if (z) {
            this.f1139e.measure(0, makeMeasureSpec);
            if (this.f1139e.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1337e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1145k);
                    return;
                }
            }
        }
        m1338f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1141g = z;
    }

    public void setContentHeight(int i) {
        this.f1144j = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1145k = i;
        int childCount = this.f1139e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1139e.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1673a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1140f;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
