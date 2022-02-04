package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: b */
    private AbstractC0517b f2590b;

    /* renamed from: c */
    private AbstractC0516a f2591c;

    /* renamed from: d */
    private View.OnKeyListener f2592d;

    /* renamed from: androidx.leanback.widget.BrowseFrameLayout$a */
    public interface AbstractC0516a {
        /* renamed from: a */
        boolean mo2965a(int i, Rect rect);

        /* renamed from: b */
        void mo2966b(View view, View view2);
    }

    /* renamed from: androidx.leanback.widget.BrowseFrameLayout$b */
    public interface AbstractC0517b {
        /* renamed from: a */
        View mo2967a(View view, int i);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f2592d;
        return (onKeyListener == null || dispatchKeyEvent) ? dispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    public View focusSearch(View view, int i) {
        View a;
        AbstractC0517b bVar = this.f2590b;
        return (bVar == null || (a = bVar.mo2967a(view, i)) == null) ? super.focusSearch(view, i) : a;
    }

    public AbstractC0516a getOnChildFocusListener() {
        return this.f2591c;
    }

    public AbstractC0517b getOnFocusSearchListener() {
        return this.f2590b;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        AbstractC0516a aVar = this.f2591c;
        if (aVar == null || !aVar.mo2965a(i, rect)) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        AbstractC0516a aVar = this.f2591c;
        if (aVar != null) {
            aVar.mo2966b(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(AbstractC0516a aVar) {
        this.f2591c = aVar;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f2592d = onKeyListener;
    }

    public void setOnFocusSearchListener(AbstractC0517b bVar) {
        this.f2590b = bVar;
    }
}
