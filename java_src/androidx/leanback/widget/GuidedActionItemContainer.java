package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class GuidedActionItemContainer extends C0579l {

    /* renamed from: e */
    private boolean f2604e;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2604e = true;
    }

    public View focusSearch(View view, int i) {
        if (this.f2604e || !C0604y.m3194a(this, view)) {
            return super.focusSearch(view, i);
        }
        View focusSearch = super.focusSearch(view, i);
        if (C0604y.m3194a(this, focusSearch)) {
            return focusSearch;
        }
        return null;
    }
}
