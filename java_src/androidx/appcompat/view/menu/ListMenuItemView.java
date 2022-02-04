package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.appcompat.widget.C0296w0;
import p006b.p007a.C0754a;
import p006b.p007a.C0759f;
import p006b.p007a.C0760g;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

public class ListMenuItemView extends LinearLayout implements AbstractC0147n.AbstractC0148a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private C0134i f431b;

    /* renamed from: c */
    private ImageView f432c;

    /* renamed from: d */
    private RadioButton f433d;

    /* renamed from: e */
    private TextView f434e;

    /* renamed from: f */
    private CheckBox f435f;

    /* renamed from: g */
    private TextView f436g;

    /* renamed from: h */
    private ImageView f437h;

    /* renamed from: i */
    private ImageView f438i;

    /* renamed from: j */
    private LinearLayout f439j;

    /* renamed from: k */
    private Drawable f440k;

    /* renamed from: l */
    private int f441l;

    /* renamed from: m */
    private Context f442m;

    /* renamed from: n */
    private boolean f443n;

    /* renamed from: o */
    private Drawable f444o;

    /* renamed from: p */
    private boolean f445p;

    /* renamed from: q */
    private LayoutInflater f446q;

    /* renamed from: r */
    private boolean f447r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0296w0 v = C0296w0.m1432v(getContext(), attributeSet, C0763j.f3689W1, i, 0);
        this.f440k = v.mo1810g(C0763j.f3699Y1);
        this.f441l = v.mo1817n(C0763j.f3694X1, -1);
        this.f443n = v.mo1804a(C0763j.f3704Z1, false);
        this.f442m = context;
        this.f444o = v.mo1810g(C0763j.f3709a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0754a.dropDownListViewStyle, 0);
        this.f445p = obtainStyledAttributes.hasValue(0);
        v.mo1823w();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m557a(View view) {
        m558b(view, -1);
    }

    /* renamed from: b */
    private void m558b(View view, int i) {
        LinearLayout linearLayout = this.f439j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m559c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0760g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f435f = checkBox;
        m557a(checkBox);
    }

    /* renamed from: f */
    private void m560f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0760g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f432c = imageView;
        m558b(imageView, 0);
    }

    /* renamed from: g */
    private void m561g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0760g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f433d = radioButton;
        m557a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f446q == null) {
            this.f446q = LayoutInflater.from(getContext());
        }
        return this.f446q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f437h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f438i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f438i.getLayoutParams();
            rect.top += this.f438i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n.AbstractC0148a
    /* renamed from: d */
    public boolean mo449d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n.AbstractC0148a
    /* renamed from: e */
    public void mo450e(C0134i iVar, int i) {
        this.f431b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo711i(this));
        setCheckable(iVar.isCheckable());
        mo475h(iVar.mo692A(), iVar.mo696g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n.AbstractC0148a
    public C0134i getItemData() {
        return this.f431b;
    }

    /* renamed from: h */
    public void mo475h(boolean z, char c) {
        int i = (!z || !this.f431b.mo692A()) ? 8 : 0;
        if (i == 0) {
            this.f436g.setText(this.f431b.mo709h());
        }
        if (this.f436g.getVisibility() != i) {
            this.f436g.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C1013s.m5772l0(this, this.f440k);
        TextView textView = (TextView) findViewById(C0759f.title);
        this.f434e = textView;
        int i = this.f441l;
        if (i != -1) {
            textView.setTextAppearance(this.f442m, i);
        }
        this.f436g = (TextView) findViewById(C0759f.shortcut);
        ImageView imageView = (ImageView) findViewById(C0759f.submenuarrow);
        this.f437h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f444o);
        }
        this.f438i = (ImageView) findViewById(C0759f.group_divider);
        this.f439j = (LinearLayout) findViewById(C0759f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f432c != null && this.f443n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f432c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f433d != null || this.f435f != null) {
            if (this.f431b.mo719m()) {
                if (this.f433d == null) {
                    m561g();
                }
                compoundButton2 = this.f433d;
                compoundButton = this.f435f;
            } else {
                if (this.f435f == null) {
                    m559c();
                }
                compoundButton2 = this.f435f;
                compoundButton = this.f433d;
            }
            if (z) {
                compoundButton2.setChecked(this.f431b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f435f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f433d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f431b.mo719m()) {
            if (this.f433d == null) {
                m561g();
            }
            compoundButton = this.f433d;
        } else {
            if (this.f435f == null) {
                m559c();
            }
            compoundButton = this.f435f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f447r = z;
        this.f443n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f438i;
        if (imageView != null) {
            imageView.setVisibility((this.f445p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f431b.mo749z() || this.f447r;
        if (z || this.f443n) {
            ImageView imageView = this.f432c;
            if (imageView != null || drawable != null || this.f443n) {
                if (imageView == null) {
                    m560f();
                }
                if (drawable != null || this.f443n) {
                    ImageView imageView2 = this.f432c;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f432c.getVisibility() != 0) {
                        this.f432c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f432c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f434e.setText(charSequence);
            if (this.f434e.getVisibility() != 0) {
                textView = this.f434e;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f434e.getVisibility() != 8) {
                textView = this.f434e;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
