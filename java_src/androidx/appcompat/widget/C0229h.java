package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0418i;
import p006b.p007a.p008k.p009a.C0764a;

/* renamed from: androidx.appcompat.widget.h */
public class C0229h extends CheckedTextView {

    /* renamed from: b */
    private static final int[] f1013b = {16843016};

    /* renamed from: c */
    private final C0297x f1014c;

    public C0229h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0229h(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0297x xVar = new C0297x(this);
        this.f1014c = xVar;
        xVar.mo1834m(attributeSet, i);
        xVar.mo1824b();
        C0296w0 v = C0296w0.m1432v(getContext(), attributeSet, f1013b, i, 0);
        setCheckMarkDrawable(v.mo1810g(0));
        v.mo1823w();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0297x xVar = this.f1014c;
        if (xVar != null) {
            xVar.mo1824b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0247l.m1274a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0764a.m4517d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0297x xVar = this.f1014c;
        if (xVar != null) {
            xVar.mo1838q(context, i);
        }
    }
}
