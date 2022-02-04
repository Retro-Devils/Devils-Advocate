package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0398a;
import androidx.core.widget.C0415f;
import java.lang.reflect.Field;
import p006b.p007a.C0754a;
import p006b.p007a.p010l.p011a.C0778c;
import p006b.p030g.p039k.C1028w;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e0 */
public class C0219e0 extends ListView {

    /* renamed from: b */
    private final Rect f981b = new Rect();

    /* renamed from: c */
    private int f982c = 0;

    /* renamed from: d */
    private int f983d = 0;

    /* renamed from: e */
    private int f984e = 0;

    /* renamed from: f */
    private int f985f = 0;

    /* renamed from: g */
    private int f986g;

    /* renamed from: h */
    private Field f987h;

    /* renamed from: i */
    private C0220a f988i;

    /* renamed from: j */
    private boolean f989j;

    /* renamed from: k */
    private boolean f990k;

    /* renamed from: l */
    private boolean f991l;

    /* renamed from: m */
    private C1028w f992m;

    /* renamed from: n */
    private C0415f f993n;

    /* renamed from: o */
    RunnableC0221b f994o;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e0$a */
    public static class C0220a extends C0778c {

        /* renamed from: c */
        private boolean f995c = true;

        C0220a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1405c(boolean z) {
            this.f995c = z;
        }

        @Override // p006b.p007a.p010l.p011a.C0778c
        public void draw(Canvas canvas) {
            if (this.f995c) {
                super.draw(canvas);
            }
        }

        @Override // p006b.p007a.p010l.p011a.C0778c
        public void setHotspot(float f, float f2) {
            if (this.f995c) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p006b.p007a.p010l.p011a.C0778c
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f995c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p006b.p007a.p010l.p011a.C0778c
        public boolean setState(int[] iArr) {
            if (this.f995c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p006b.p007a.p010l.p011a.C0778c
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f995c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e0$b */
    public class RunnableC0221b implements Runnable {
        RunnableC0221b() {
        }

        /* renamed from: a */
        public void mo1411a() {
            C0219e0 e0Var = C0219e0.this;
            e0Var.f994o = null;
            e0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1412b() {
            C0219e0.this.post(this);
        }

        public void run() {
            C0219e0 e0Var = C0219e0.this;
            e0Var.f994o = null;
            e0Var.drawableStateChanged();
        }
    }

    C0219e0(Context context, boolean z) {
        super(context, null, C0754a.dropDownListViewStyle);
        this.f990k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f987h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1151a() {
        this.f991l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f986g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1028w wVar = this.f992m;
        if (wVar != null) {
            wVar.mo5579b();
            this.f992m = null;
        }
    }

    /* renamed from: b */
    private void m1152b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1153c(Canvas canvas) {
        Drawable selector;
        if (!this.f981b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f981b);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1154f(int i, View view) {
        Rect rect = this.f981b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f982c;
        rect.top -= this.f983d;
        rect.right += this.f984e;
        rect.bottom += this.f985f;
        try {
            boolean z = this.f987h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f987h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1155g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1154f(i, view);
        if (z2) {
            Rect rect = this.f981b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0398a.m1974k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1156h(int i, View view, float f, float f2) {
        m1155g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0398a.m1974k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1157i(View view, int i, float f, float f2) {
        View childAt;
        this.f991l = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f986g;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f986g = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1156h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1158j() {
        return this.f991l;
    }

    /* renamed from: k */
    private void m1159k() {
        Drawable selector = getSelector();
        if (selector != null && m1158j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0220a aVar = this.f988i;
        if (aVar != null) {
            aVar.mo1405c(z);
        }
    }

    /* renamed from: d */
    public int mo1392d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1153c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f994o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1159k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1395e(android.view.MotionEvent r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0219e0.mo1395e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f990k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f990k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f990k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f990k && this.f989j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f994o = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f994o == null) {
            RunnableC0221b bVar = new RunnableC0221b();
            this.f994o = bVar;
            bVar.mo1412b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1159k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f986g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0221b bVar = this.f994o;
        if (bVar != null) {
            bVar.mo1411a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f989j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0220a aVar = drawable != null ? new C0220a(drawable) : null;
        this.f988i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f982c = rect.left;
        this.f983d = rect.top;
        this.f984e = rect.right;
        this.f985f = rect.bottom;
    }
}
