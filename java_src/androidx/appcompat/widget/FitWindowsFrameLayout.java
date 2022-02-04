package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AbstractC0223f0;

public class FitWindowsFrameLayout extends FrameLayout implements AbstractC0223f0 {

    /* renamed from: b */
    private AbstractC0223f0.AbstractC0224a f741b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        AbstractC0223f0.AbstractC0224a aVar = this.f741b;
        if (aVar != null) {
            aVar.mo341a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.AbstractC0223f0
    public void setOnFitSystemWindowsListener(AbstractC0223f0.AbstractC0224a aVar) {
        this.f741b = aVar;
    }
}
