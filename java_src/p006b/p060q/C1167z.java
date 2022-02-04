package p006b.p060q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p006b.p030g.p039k.C1013s;

/* renamed from: b.q.z */
class C1167z implements AbstractC1099b0 {

    /* renamed from: a */
    protected C1168a f5206a;

    /* renamed from: b.q.z$a */
    static class C1168a extends ViewGroup {

        /* renamed from: b */
        static Method f5207b;

        /* renamed from: c */
        ViewGroup f5208c;

        /* renamed from: d */
        View f5209d;

        /* renamed from: e */
        ArrayList<Drawable> f5210e = null;

        /* renamed from: f */
        C1167z f5211f;

        /* renamed from: g */
        private boolean f5212g;

        static {
            try {
                Class cls = Integer.TYPE;
                f5207b = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C1168a(Context context, ViewGroup viewGroup, View view, C1167z zVar) {
            super(context);
            this.f5208c = viewGroup;
            this.f5209d = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5211f = zVar;
        }

        /* renamed from: c */
        private void m6392c() {
            if (this.f5212g) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m6393d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5210e;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5212g = true;
                    this.f5208c.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m6394e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f5208c.getLocationOnScreen(iArr2);
            this.f5209d.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo5872a(Drawable drawable) {
            m6392c();
            if (this.f5210e == null) {
                this.f5210e = new ArrayList<>();
            }
            if (!this.f5210e.contains(drawable)) {
                this.f5210e.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo5873b(View view) {
            m6392c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f5208c || viewGroup.getParent() == null || !C1013s.m5736N(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f5208c.getLocationOnScreen(iArr2);
                    C1013s.m5742T(view, iArr[0] - iArr2[0]);
                    C1013s.m5743U(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f5208c.getLocationOnScreen(iArr);
            this.f5209d.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f5209d.getWidth(), this.f5209d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5210e;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5210e.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo5876f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f5210e;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m6393d();
            }
        }

        /* renamed from: g */
        public void mo5877g(View view) {
            super.removeView(view);
            m6393d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5208c == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f5208c instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m6394e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f5210e) != null && arrayList.contains(drawable));
        }
    }

    C1167z(Context context, ViewGroup viewGroup, View view) {
        this.f5206a = new C1168a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C1167z m6388e(View view) {
        ViewGroup f = m6389f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C1168a) {
                return ((C1168a) childAt).f5211f;
            }
        }
        return new C1161u(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m6389f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p006b.p060q.AbstractC1099b0
    /* renamed from: b */
    public void mo5729b(Drawable drawable) {
        this.f5206a.mo5872a(drawable);
    }

    @Override // p006b.p060q.AbstractC1099b0
    /* renamed from: d */
    public void mo5730d(Drawable drawable) {
        this.f5206a.mo5876f(drawable);
    }
}
