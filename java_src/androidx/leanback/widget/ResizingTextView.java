package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.widget.C0418i;
import p006b.p053m.C1080l;

class ResizingTextView extends TextView {

    /* renamed from: b */
    private int f2675b;

    /* renamed from: c */
    private int f2676c;

    /* renamed from: d */
    private boolean f2677d;

    /* renamed from: e */
    private int f2678e;

    /* renamed from: f */
    private int f2679f;

    /* renamed from: g */
    private boolean f2680g;

    /* renamed from: h */
    private boolean f2681h;

    /* renamed from: i */
    private int f2682i;

    /* renamed from: j */
    private float f2683j;

    /* renamed from: k */
    private int f2684k;

    /* renamed from: l */
    private int f2685l;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f2680g = false;
        this.f2681h = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4936P, i, i2);
        try {
            this.f2675b = obtainStyledAttributes.getInt(C1080l.f4938R, 1);
            this.f2676c = obtainStyledAttributes.getDimensionPixelSize(C1080l.f4941U, -1);
            this.f2677d = obtainStyledAttributes.getBoolean(C1080l.f4937Q, false);
            this.f2678e = obtainStyledAttributes.getDimensionPixelOffset(C1080l.f4940T, 0);
            this.f2679f = obtainStyledAttributes.getDimensionPixelOffset(C1080l.f4939S, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m2750a(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }
}
