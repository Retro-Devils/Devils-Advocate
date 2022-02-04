package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0418i;

public class GuidedActionEditText extends EditText {

    /* renamed from: b */
    private AbstractC0573h f2600b;

    /* renamed from: c */
    private AbstractC0572g f2601c;

    /* renamed from: d */
    private final Drawable f2602d;

    /* renamed from: e */
    private final Drawable f2603e;

    /* renamed from: androidx.leanback.widget.GuidedActionEditText$a */
    static final class C0519a extends Drawable {
        C0519a() {
        }

        public void draw(Canvas canvas) {
        }

        public int getOpacity() {
            return -2;
        }

        public boolean getPadding(Rect rect) {
            rect.set(0, 0, 0, 0);
            return true;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2602d = getBackground();
        C0519a aVar = new C0519a();
        this.f2603e = aVar;
        setBackground(aVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        AbstractC0572g gVar = this.f2601c;
        if (gVar != null) {
            gVar.mo3514a(this);
        }
    }

    public int getAutofillType() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        setBackground(z ? this.f2602d : this.f2603e);
        if (!z) {
            setFocusable(false);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AbstractC0573h hVar = this.f2600b;
        boolean a = hVar != null ? hVar.mo3515a(this, i, keyEvent) : false;
        return !a ? super.onKeyPreIme(i, keyEvent) : a;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setImeKeyListener(AbstractC0573h hVar) {
        this.f2600b = hVar;
    }

    public void setOnAutofillListener(AbstractC0572g gVar) {
        this.f2601c = gVar;
    }
}
