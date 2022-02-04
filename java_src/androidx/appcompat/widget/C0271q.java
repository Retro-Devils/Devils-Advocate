package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0417h;
import p006b.p007a.C0763j;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.q */
public class C0271q extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1156a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f1157b;

    public C0271q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1344a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1344a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0296w0 v = C0296w0.m1432v(context, attributeSet, C0763j.f3710b2, i, i2);
        int i3 = C0763j.f3720d2;
        if (v.mo1822s(i3)) {
            m1345b(v.mo1804a(i3, false));
        }
        setBackgroundDrawable(v.mo1810g(C0763j.f3715c2));
        v.mo1823w();
    }

    /* renamed from: b */
    private void m1345b(boolean z) {
        if (f1156a) {
            this.f1157b = z;
        } else {
            C0417h.m2090a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1156a && this.f1157b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1156a && this.f1157b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1156a && this.f1157b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
