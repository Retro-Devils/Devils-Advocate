package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p006b.p053m.C1079k;

public class SearchEditText extends C0600w {

    /* renamed from: i */
    private static final String f2733i = SearchEditText.class.getSimpleName();

    /* renamed from: j */
    private AbstractC0542a f2734j;

    /* renamed from: androidx.leanback.widget.SearchEditText$a */
    public interface AbstractC0542a {
        /* renamed from: a */
        void mo3116a();
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1079k.TextAppearance_Leanback_SearchTextEdit);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.leanback.widget.C0600w
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo3137e() {
        super.mo3137e();
    }

    @Override // androidx.leanback.widget.C0600w
    /* renamed from: g */
    public /* bridge */ /* synthetic */ void mo3138g(String str, String str2) {
        super.mo3138g(str, str2);
    }

    @Override // androidx.leanback.widget.C0600w
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyPreIme(i, keyEvent);
        }
        AbstractC0542a aVar = this.f2734j;
        if (aVar == null) {
            return false;
        }
        aVar.mo3116a();
        return false;
    }

    @Override // androidx.leanback.widget.C0600w
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.leanback.widget.C0600w
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(AbstractC0542a aVar) {
        this.f2734j = aVar;
    }
}
