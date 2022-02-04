package com.bumptech.glide.p140r.p141j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C1617h;
import com.bumptech.glide.p140r.AbstractC2039c;
import com.bumptech.glide.p144t.C2081j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.r.j.i */
public abstract class AbstractC2056i<T extends View, Z> extends AbstractC2048a<Z> {

    /* renamed from: b */
    private static boolean f7563b;

    /* renamed from: c */
    private static int f7564c = C1617h.glide_custom_view_target_tag;

    /* renamed from: d */
    protected final T f7565d;

    /* renamed from: e */
    private final C2057a f7566e;

    /* renamed from: f */
    private View.OnAttachStateChangeListener f7567f;

    /* renamed from: g */
    private boolean f7568g;

    /* renamed from: h */
    private boolean f7569h;

    /* renamed from: com.bumptech.glide.r.j.i$a */
    static final class C2057a {

        /* renamed from: a */
        static Integer f7570a;

        /* renamed from: b */
        private final View f7571b;

        /* renamed from: c */
        private final List<AbstractC2054g> f7572c = new ArrayList();

        /* renamed from: d */
        boolean f7573d;

        /* renamed from: e */
        private ViewTreeObserver$OnPreDrawListenerC2058a f7574e;

        /* access modifiers changed from: private */
        /* renamed from: com.bumptech.glide.r.j.i$a$a */
        public static final class ViewTreeObserver$OnPreDrawListenerC2058a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            private final WeakReference<C2057a> f7575b;

            ViewTreeObserver$OnPreDrawListenerC2058a(C2057a aVar) {
                this.f7575b = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2057a aVar = this.f7575b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo7821a();
                return true;
            }
        }

        C2057a(View view) {
            this.f7571b = view;
        }

        /* renamed from: c */
        private static int m9373c(Context context) {
            if (f7570a == null) {
                Display defaultDisplay = ((WindowManager) C2081j.m9432d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f7570a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f7570a.intValue();
        }

        /* renamed from: e */
        private int m9374e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f7573d && this.f7571b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f7571b.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m9373c(this.f7571b.getContext());
        }

        /* renamed from: f */
        private int m9375f() {
            int paddingTop = this.f7571b.getPaddingTop() + this.f7571b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f7571b.getLayoutParams();
            return m9374e(this.f7571b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m9376g() {
            int paddingLeft = this.f7571b.getPaddingLeft() + this.f7571b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f7571b.getLayoutParams();
            return m9374e(this.f7571b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m9377h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m9378i(int i, int i2) {
            return m9377h(i) && m9377h(i2);
        }

        /* renamed from: j */
        private void m9379j(int i, int i2) {
            Iterator it = new ArrayList(this.f7572c).iterator();
            while (it.hasNext()) {
                ((AbstractC2054g) it.next()).mo7807g(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7821a() {
            if (!this.f7572c.isEmpty()) {
                int g = m9376g();
                int f = m9375f();
                if (m9378i(g, f)) {
                    m9379j(g, f);
                    mo7822b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7822b() {
            ViewTreeObserver viewTreeObserver = this.f7571b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f7574e);
            }
            this.f7574e = null;
            this.f7572c.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7823d(AbstractC2054g gVar) {
            int g = m9376g();
            int f = m9375f();
            if (m9378i(g, f)) {
                gVar.mo7807g(g, f);
                return;
            }
            if (!this.f7572c.contains(gVar)) {
                this.f7572c.add(gVar);
            }
            if (this.f7574e == null) {
                ViewTreeObserver viewTreeObserver = this.f7571b.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC2058a aVar = new ViewTreeObserver$OnPreDrawListenerC2058a(this);
                this.f7574e = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo7824k(AbstractC2054g gVar) {
            this.f7572c.remove(gVar);
        }
    }

    public AbstractC2056i(T t) {
        this.f7565d = (T) ((View) C2081j.m9432d(t));
        this.f7566e = new C2057a(t);
    }

    /* renamed from: l */
    private Object m9363l() {
        return this.f7565d.getTag(f7564c);
    }

    /* renamed from: m */
    private void m9364m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7567f;
        if (onAttachStateChangeListener != null && !this.f7569h) {
            this.f7565d.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f7569h = true;
        }
    }

    /* renamed from: n */
    private void m9365n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7567f;
        if (onAttachStateChangeListener != null && this.f7569h) {
            this.f7565d.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f7569h = false;
        }
    }

    /* renamed from: o */
    private void m9366o(Object obj) {
        f7563b = true;
        this.f7565d.setTag(f7564c, obj);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: b */
    public void mo7813b(AbstractC2054g gVar) {
        this.f7566e.mo7824k(gVar);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: c */
    public void mo7809c(Drawable drawable) {
        super.mo7809c(drawable);
        m9364m();
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: g */
    public AbstractC2039c mo7814g() {
        Object l = m9363l();
        if (l == null) {
            return null;
        }
        if (l instanceof AbstractC2039c) {
            return (AbstractC2039c) l;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: h */
    public void mo7615h(Drawable drawable) {
        super.mo7615h(drawable);
        this.f7566e.mo7822b();
        if (!this.f7568g) {
            m9365n();
        }
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: i */
    public void mo7815i(AbstractC2054g gVar) {
        this.f7566e.mo7823d(gVar);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: j */
    public void mo7816j(AbstractC2039c cVar) {
        m9366o(cVar);
    }

    public String toString() {
        return "Target for: " + this.f7565d;
    }
}
