package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0215d;
import androidx.appcompat.widget.C0233i0;
import com.google.android.material.internal.C3174f;
import com.google.android.material.internal.C3202o;
import com.google.android.material.theme.p148a.C3288a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;

/* renamed from: com.google.android.material.textfield.g */
public class C3280g extends C0215d {

    /* renamed from: e */
    private final C0233i0 f10977e;

    /* renamed from: f */
    private final AccessibilityManager f10978f;

    /* renamed from: g */
    private final Rect f10979g;

    /* renamed from: com.google.android.material.textfield.g$a */
    class C3281a implements AdapterView.OnItemClickListener {
        C3281a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C3280g gVar = C3280g.this;
            C3280g.this.m13746e(i < 0 ? gVar.f10977e.mo1531v() : gVar.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = C3280g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C3280g.this.f10977e.mo1534y();
                    i = C3280g.this.f10977e.mo1533x();
                    j = C3280g.this.f10977e.mo1532w();
                }
                onItemClickListener.onItemClick(C3280g.this.f10977e.mo571l(), view, i, j);
            }
            C3280g.this.f10977e.dismiss();
        }
    }

    public C3280g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.f5669a);
    }

    public C3280g(Context context, AttributeSet attributeSet, int i) {
        super(C3288a.m13767c(context, attributeSet, i, 0), attributeSet, i);
        this.f10979g = new Rect();
        Context context2 = getContext();
        TypedArray h = C3202o.m13430h(context2, attributeSet, C1400k.f5932o1, i, C1399j.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C1400k.f5939p1;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f10978f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0233i0 i0Var = new C0233i0(context2);
        this.f10977e = i0Var;
        i0Var.mo1514J(true);
        i0Var.mo1508D(this);
        i0Var.mo1513I(2);
        i0Var.mo1527o(getAdapter());
        i0Var.mo1516L(new C3281a());
        h.recycle();
    }

    /* renamed from: c */
    private TextInputLayout m13744c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m13745d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = m13744c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f10977e.mo1533x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable j = this.f10977e.mo1525j();
        if (j != null) {
            j.getPadding(this.f10979g);
            Rect rect = this.f10979g;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.material.textfield.g */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private <T extends ListAdapter & Filterable> void m13746e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout c = m13744c();
        return (c == null || !c.mo10929N()) ? super.getHint() : c.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = m13744c();
        if (c != null && c.mo10929N() && super.getHint() == null && C3174f.m13331a()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m13745d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f10977e.mo1527o(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f10978f) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f10977e.mo565a();
        }
    }
}
