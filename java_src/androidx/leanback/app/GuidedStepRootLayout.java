package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.widget.C0604y;

class GuidedStepRootLayout extends LinearLayout {

    /* renamed from: b */
    private boolean f2548b = false;

    /* renamed from: c */
    private boolean f2549c = false;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View focusSearch(View view, int i) {
        View focusSearch = super.focusSearch(view, i);
        if ((i != 17 && i != 66) || C0604y.m3194a(this, focusSearch)) {
            return focusSearch;
        }
        if (getLayoutDirection() != 0 ? i != 66 : i != 17) {
            if (!this.f2549c) {
                return view;
            }
        } else if (!this.f2548b) {
            return view;
        }
        return focusSearch;
    }
}
