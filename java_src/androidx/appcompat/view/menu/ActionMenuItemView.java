package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0302y;
import androidx.appcompat.widget.C0303y0;
import p006b.p007a.C0763j;

public class ActionMenuItemView extends C0302y implements AbstractC0147n.AbstractC0148a, View.OnClickListener, ActionMenuView.AbstractC0162a {

    /* renamed from: f */
    C0134i f416f;

    /* renamed from: g */
    private CharSequence f417g;

    /* renamed from: h */
    private Drawable f418h;

    /* renamed from: i */
    C0130g.AbstractC0132b f419i;

    /* renamed from: j */
    private AbstractView$OnTouchListenerC0226g0 f420j;

    /* renamed from: k */
    AbstractC0117b f421k;

    /* renamed from: l */
    private boolean f422l;

    /* renamed from: m */
    private boolean f423m;

    /* renamed from: n */
    private int f424n;

    /* renamed from: o */
    private int f425o;

    /* renamed from: p */
    private int f426p;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0116a extends AbstractView$OnTouchListenerC0226g0 {
        public C0116a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
        /* renamed from: b */
        public AbstractC0150p mo466b() {
            AbstractC0117b bVar = ActionMenuItemView.this.f421k;
            if (bVar != null) {
                return bVar.mo468a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
        /* renamed from: c */
        public boolean mo467c() {
            AbstractC0150p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0130g.AbstractC0132b bVar = actionMenuItemView.f419i;
            return bVar != null && bVar.mo469a(actionMenuItemView.f416f) && (b = mo466b()) != null && b.mo566c();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0117b {
        /* renamed from: a */
        public abstract AbstractC0150p mo468a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f422l = m545g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3811v, i, 0);
        this.f424n = obtainStyledAttributes.getDimensionPixelSize(C0763j.f3816w, 0);
        obtainStyledAttributes.recycle();
        this.f426p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f425o = -1;
        setSaveEnabled(false);
    }

    /* renamed from: g */
    private boolean m545g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m546h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f417g);
        if (this.f418h != null && (!this.f416f.mo693B() || (!this.f422l && !this.f423m))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f417g : null);
        CharSequence contentDescription = this.f416f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f416f.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f416f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f416f.getTitle();
            }
            C0303y0.m1525a(this, charSequence);
            return;
        }
        C0303y0.m1525a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0162a
    /* renamed from: a */
    public boolean mo447a() {
        return mo451f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0162a
    /* renamed from: b */
    public boolean mo448b() {
        return mo451f() && this.f416f.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n.AbstractC0148a
    /* renamed from: d */
    public boolean mo449d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n.AbstractC0148a
    /* renamed from: e */
    public void mo450e(C0134i iVar, int i) {
        this.f416f = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo711i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f420j == null) {
            this.f420j = new C0116a();
        }
    }

    /* renamed from: f */
    public boolean mo451f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n.AbstractC0148a
    public C0134i getItemData() {
        return this.f416f;
    }

    public void onClick(View view) {
        C0130g.AbstractC0132b bVar = this.f419i;
        if (bVar != null) {
            bVar.mo469a(this.f416f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f422l = m545g();
        m546h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0302y
    public void onMeasure(int i, int i2) {
        int i3;
        boolean f = mo451f();
        if (f && (i3 = this.f425o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f424n) : this.f424n;
        if (mode != 1073741824 && this.f424n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!f && this.f418h != null) {
            super.setPadding((getMeasuredWidth() - this.f418h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0226g0 g0Var;
        if (!this.f416f.hasSubMenu() || (g0Var = this.f420j) == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f423m != z) {
            this.f423m = z;
            C0134i iVar = this.f416f;
            if (iVar != null) {
                iVar.mo694c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f418h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f426p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m546h();
    }

    public void setItemInvoker(C0130g.AbstractC0132b bVar) {
        this.f419i = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f425o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0117b bVar) {
        this.f421k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f417g = charSequence;
        m546h();
    }
}
