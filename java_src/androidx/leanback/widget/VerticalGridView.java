package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p006b.p053m.C1080l;

public class VerticalGridView extends AbstractC0548a {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2793I0.mo3420Z3(1);
        mo3202C1(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo3202C1(Context context, AttributeSet attributeSet) {
        mo3207A1(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4967g0);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(C1080l.f4971i0, 1));
        obtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i) {
        this.f2793I0.mo3427b4(i);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setColumnWidth(TypedArray typedArray) {
        int i = C1080l.f4969h0;
        if (typedArray.peekValue(i) != null) {
            setColumnWidth(typedArray.getLayoutDimension(i, 0));
        }
    }

    public void setNumColumns(int i) {
        this.f2793I0.mo3405V3(i);
        requestLayout();
    }
}
