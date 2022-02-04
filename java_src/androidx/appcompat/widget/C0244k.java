package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.C0418i;
import p006b.p007a.C0754a;
import p006b.p030g.p039k.AbstractC1012r;

/* renamed from: androidx.appcompat.widget.k */
public class C0244k extends EditText implements AbstractC1012r {

    /* renamed from: b */
    private final C0218e f1089b;

    /* renamed from: c */
    private final C0297x f1090c;

    /* renamed from: d */
    private final C0295w f1091d;

    public C0244k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.f3565B);
    }

    public C0244k(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0218e eVar = new C0218e(this);
        this.f1089b = eVar;
        eVar.mo1386e(attributeSet, i);
        C0297x xVar = new C0297x(this);
        this.f1090c = xVar;
        xVar.mo1834m(attributeSet, i);
        xVar.mo1824b();
        this.f1091d = new C0295w(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            eVar.mo1383b();
        }
        C0297x xVar = this.f1090c;
        if (xVar != null) {
            xVar.mo1824b();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        C0295w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1091d) == null) ? super.getTextClassifier() : wVar.mo1802a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0247l.m1274a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f1089b;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0297x xVar = this.f1090c;
        if (xVar != null) {
            xVar.mo1838q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0295w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1091d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.mo1803b(textClassifier);
        }
    }
}
