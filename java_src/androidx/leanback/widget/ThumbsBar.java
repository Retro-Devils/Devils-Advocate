package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p006b.p053m.C1071c;

public class ThumbsBar extends LinearLayout {

    /* renamed from: b */
    int f2778b;

    /* renamed from: c */
    int f2779c;

    /* renamed from: d */
    int f2780d;

    /* renamed from: e */
    int f2781e;

    /* renamed from: f */
    int f2782f;

    /* renamed from: g */
    int f2783g;

    /* renamed from: h */
    final SparseArray<Bitmap> f2784h;

    /* renamed from: i */
    private boolean f2785i;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2778b = -1;
        this.f2784h = new SparseArray<>();
        this.f2785i = false;
        this.f2779c = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_thumbs_width);
        this.f2780d = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_thumbs_height);
        this.f2782f = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_hero_thumbs_width);
        this.f2781e = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_hero_thumbs_height);
        this.f2783g = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_thumbs_margin);
    }

    /* renamed from: a */
    private int m2783a(int i) {
        int c = m2784c(i - this.f2781e, this.f2779c + this.f2783g);
        if (c < 2) {
            c = 2;
        } else if ((c & 1) != 0) {
            c++;
        }
        return c + 1;
    }

    /* renamed from: c */
    private static int m2784c(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: d */
    private void m2785d() {
        int i;
        while (getChildCount() > this.f2778b) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f2778b) {
            addView(mo3187b(this), new LinearLayout.LayoutParams(this.f2779c, this.f2780d));
        }
        int heroIndex = getHeroIndex();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i2) {
                layoutParams.width = this.f2781e;
                i = this.f2782f;
            } else {
                layoutParams.width = this.f2779c;
                i = this.f2780d;
            }
            layoutParams.height = i;
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo3187b(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i5 = heroIndex - 1; i5 >= 0; i5--) {
            int i6 = width - this.f2783g;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex < this.f2778b) {
                int i7 = width2 + this.f2783g;
                View childAt3 = getChildAt(heroIndex);
                childAt3.layout(i7, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + paddingTop);
                width2 = i7 + childAt3.getMeasuredWidth();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (!this.f2785i && this.f2778b != (a = m2783a(measuredWidth))) {
            this.f2778b = a;
            m2785d();
        }
    }

    public void setNumberOfThumbs(int i) {
        this.f2785i = true;
        this.f2778b = i;
        m2785d();
    }

    public void setThumbSpace(int i) {
        this.f2783g = i;
        requestLayout();
    }
}
