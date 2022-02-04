package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C0418i;
import p006b.p007a.C0754a;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.AbstractC1012r;

/* renamed from: androidx.appcompat.widget.d */
public class C0215d extends AutoCompleteTextView implements AbstractC1012r {

    /* renamed from: b */
    private static final int[] f968b = {16843126};

    /* renamed from: c */
    private final C0218e f969c;

    /* renamed from: d */
    private final C0297x f970d;

    public C0215d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.f3568p);
    }

    public C0215d(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0296w0 v = C0296w0.m1432v(getContext(), attributeSet, f968b, i, 0);
        if (v.mo1822s(0)) {
            setDropDownBackgroundDrawable(v.mo1810g(0));
        }
        v.mo1823w();
        C0218e eVar = new C0218e(this);
        this.f969c = eVar;
        eVar.mo1386e(attributeSet, i);
        C0297x xVar = new C0297x(this);
        this.f970d = xVar;
        xVar.mo1834m(attributeSet, i);
        xVar.mo1824b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f969c;
        if (eVar != null) {
            eVar.mo1383b();
        }
        C0297x xVar = this.f970d;
        if (xVar != null) {
            xVar.mo1824b();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f969c;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f969c;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0247l.m1274a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f969c;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f969c;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0764a.m4517d(getContext(), i));
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f969c;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f969c;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0297x xVar = this.f970d;
        if (xVar != null) {
            xVar.mo1838q(context, i);
        }
    }
}
