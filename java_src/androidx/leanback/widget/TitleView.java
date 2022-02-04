package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.SearchOrbView;
import p006b.p053m.C1069a;
import p006b.p053m.C1074f;
import p006b.p053m.C1076h;

public class TitleView extends FrameLayout {

    /* renamed from: b */
    private ImageView f2786b;

    /* renamed from: c */
    private TextView f2787c;

    /* renamed from: d */
    private SearchOrbView f2788d;

    /* renamed from: e */
    private int f2789e;

    /* renamed from: f */
    private boolean f2790f;

    /* renamed from: g */
    private final AbstractC0603x f2791g;

    /* renamed from: androidx.leanback.widget.TitleView$a */
    class C0547a extends AbstractC0603x {
        C0547a() {
        }
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1069a.browseTitleViewStyle);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2789e = 6;
        this.f2790f = false;
        this.f2791g = new C0547a();
        View inflate = LayoutInflater.from(context).inflate(C1076h.lb_title_view, this);
        this.f2786b = (ImageView) inflate.findViewById(C1074f.title_badge);
        this.f2787c = (TextView) inflate.findViewById(C1074f.title_text);
        this.f2788d = (SearchOrbView) inflate.findViewById(C1074f.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* renamed from: a */
    private void m2787a() {
        if (this.f2786b.getDrawable() != null) {
            this.f2786b.setVisibility(0);
            this.f2787c.setVisibility(8);
            return;
        }
        this.f2786b.setVisibility(8);
        this.f2787c.setVisibility(0);
    }

    /* renamed from: b */
    private void m2788b() {
        int i = 4;
        if (this.f2790f && (this.f2789e & 4) == 4) {
            i = 0;
        }
        this.f2788d.setVisibility(i);
    }

    public Drawable getBadgeDrawable() {
        return this.f2786b.getDrawable();
    }

    public SearchOrbView.C0545c getSearchAffordanceColors() {
        return this.f2788d.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f2788d;
    }

    public CharSequence getTitle() {
        return this.f2787c.getText();
    }

    public AbstractC0603x getTitleViewAdapter() {
        return this.f2791g;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f2786b.setImageDrawable(drawable);
        m2787a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f2790f = onClickListener != null;
        this.f2788d.setOnOrbClickedListener(onClickListener);
        m2788b();
    }

    public void setSearchAffordanceColors(SearchOrbView.C0545c cVar) {
        this.f2788d.setOrbColors(cVar);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2787c.setText(charSequence);
        m2787a();
    }
}
