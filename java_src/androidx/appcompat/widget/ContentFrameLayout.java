package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p006b.p030g.p039k.C1013s;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    private TypedValue f733b;

    /* renamed from: c */
    private TypedValue f734c;

    /* renamed from: d */
    private TypedValue f735d;

    /* renamed from: e */
    private TypedValue f736e;

    /* renamed from: f */
    private TypedValue f737f;

    /* renamed from: g */
    private TypedValue f738g;

    /* renamed from: h */
    private final Rect f739h;

    /* renamed from: i */
    private AbstractC0167a f740i;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface AbstractC0167a {
        /* renamed from: a */
        void mo342a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f739h = new Rect();
    }

    /* renamed from: a */
    public void mo1028a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void mo1029b(int i, int i2, int i3, int i4) {
        this.f739h.set(i, i2, i3, i4);
        if (C1013s.m5737O(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f737f == null) {
            this.f737f = new TypedValue();
        }
        return this.f737f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f738g == null) {
            this.f738g = new TypedValue();
        }
        return this.f738g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f735d == null) {
            this.f735d = new TypedValue();
        }
        return this.f735d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f736e == null) {
            this.f736e = new TypedValue();
        }
        return this.f736e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f733b == null) {
            this.f733b = new TypedValue();
        }
        return this.f733b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f734c == null) {
            this.f734c = new TypedValue();
        }
        return this.f734c;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0167a aVar = this.f740i;
        if (aVar != null) {
            aVar.mo342a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0167a aVar = this.f740i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(AbstractC0167a aVar) {
        this.f740i = aVar;
    }
}
