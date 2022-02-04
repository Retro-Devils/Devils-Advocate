package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.AbstractC0420j;
import p006b.p007a.C0754a;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.AbstractC1012r;

/* renamed from: androidx.appcompat.widget.s */
public class C0276s extends RadioButton implements AbstractC0420j, AbstractC1012r {

    /* renamed from: b */
    private final C0232i f1190b;

    /* renamed from: c */
    private final C0218e f1191c;

    /* renamed from: d */
    private final C0297x f1192d;

    public C0276s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.f3566H);
    }

    public C0276s(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0232i iVar = new C0232i(this);
        this.f1190b = iVar;
        iVar.mo1502e(attributeSet, i);
        C0218e eVar = new C0218e(this);
        this.f1191c = eVar;
        eVar.mo1386e(attributeSet, i);
        C0297x xVar = new C0297x(this);
        this.f1192d = xVar;
        xVar.mo1834m(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            eVar.mo1383b();
        }
        C0297x xVar = this.f1192d;
        if (xVar != null) {
            xVar.mo1824b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0232i iVar = this.f1190b;
        return iVar != null ? iVar.mo1499b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0420j
    public ColorStateList getSupportButtonTintList() {
        C0232i iVar = this.f1190b;
        if (iVar != null) {
            return iVar.mo1500c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0232i iVar = this.f1190b;
        if (iVar != null) {
            return iVar.mo1501d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0764a.m4517d(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0232i iVar = this.f1190b;
        if (iVar != null) {
            iVar.mo1503f();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f1191c;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0420j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0232i iVar = this.f1190b;
        if (iVar != null) {
            iVar.mo1504g(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0420j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0232i iVar = this.f1190b;
        if (iVar != null) {
            iVar.mo1505h(mode);
        }
    }
}
