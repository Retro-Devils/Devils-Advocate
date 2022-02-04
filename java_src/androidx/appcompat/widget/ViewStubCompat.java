package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p006b.p007a.C0763j;

public final class ViewStubCompat extends View {

    /* renamed from: b */
    private int f910b;

    /* renamed from: c */
    private int f911c;

    /* renamed from: d */
    private WeakReference<View> f912d;

    /* renamed from: e */
    private LayoutInflater f913e;

    /* renamed from: f */
    private AbstractC0195a f914f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface AbstractC0195a {
        /* renamed from: a */
        void mo1303a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f910b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3682V3, i, 0);
        this.f911c = obtainStyledAttributes.getResourceId(C0763j.f3697Y3, -1);
        this.f910b = obtainStyledAttributes.getResourceId(C0763j.f3692X3, 0);
        setId(obtainStyledAttributes.getResourceId(C0763j.f3687W3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo1291a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f910b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f913e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f910b, viewGroup, false);
            int i = this.f911c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f912d = new WeakReference<>(inflate);
            AbstractC0195a aVar = this.f914f;
            if (aVar != null) {
                aVar.mo1303a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f911c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f913e;
    }

    public int getLayoutResource() {
        return this.f910b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f911c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f913e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f910b = i;
    }

    public void setOnInflateListener(AbstractC0195a aVar) {
        this.f914f = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f912d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1291a();
        }
    }
}
