package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1397h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: w */
    private static final int[] f10798w;

    /* renamed from: x */
    private static final int[] f10799x;

    /* renamed from: y */
    private final AccessibilityManager f10800y;

    /* renamed from: z */
    private boolean f10801z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C3236v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3236v
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3236v
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3236v
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3236v
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3236v
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    public class View$OnClickListenerC3238a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f10802b;

        View$OnClickListenerC3238a(View.OnClickListener onClickListener) {
            this.f10802b = onClickListener;
        }

        public void onClick(View view) {
            this.f10802b.onClick(view);
            Snackbar.this.mo10853t(1);
        }
    }

    static {
        int i = C1391b.snackbarButtonStyle;
        f10798w = new int[]{i};
        f10799x = new int[]{i, C1391b.snackbarTextViewStyle};
    }

    private Snackbar(ViewGroup viewGroup, View view, AbstractC3239a aVar) {
        super(viewGroup, view, aVar);
        this.f10800y = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: V */
    private static ViewGroup m13522V(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: W */
    private static boolean m13523W(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f10799x);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* renamed from: X */
    public static Snackbar m13524X(View view, int i, int i2) {
        return m13525Y(view, view.getResources().getText(i), i2);
    }

    /* renamed from: Y */
    public static Snackbar m13525Y(View view, CharSequence charSequence, int i) {
        ViewGroup V = m13522V(view);
        if (V != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(V.getContext()).inflate(m13523W(V.getContext()) ? C1397h.mtrl_layout_snackbar_include : C1397h.design_layout_snackbar_include, V, false);
            Snackbar snackbar = new Snackbar(V, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo10898b0(charSequence);
            snackbar.mo10847J(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: N */
    public void mo10849N() {
        super.mo10849N();
    }

    /* renamed from: Z */
    public Snackbar mo10896Z(int i, View.OnClickListener onClickListener) {
        return mo10897a0(mo10854v().getText(i), onClickListener);
    }

    /* renamed from: a0 */
    public Snackbar mo10897a0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f10750g.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f10801z = false;
        } else {
            this.f10801z = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View$OnClickListenerC3238a(onClickListener));
        }
        return this;
    }

    /* renamed from: b0 */
    public Snackbar mo10898b0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f10750g.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: s */
    public void mo10852s() {
        super.mo10852s();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: w */
    public int mo10855w() {
        int w = super.mo10855w();
        if (w == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f10800y.getRecommendedTimeoutMillis(w, (this.f10801z ? 4 : 0) | 1 | 2);
        } else if (!this.f10801z || !this.f10800y.isTouchExplorationEnabled()) {
            return w;
        } else {
            return -2;
        }
    }
}
