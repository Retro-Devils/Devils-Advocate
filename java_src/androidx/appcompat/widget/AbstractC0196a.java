package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p006b.p007a.C0754a;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.AbstractC1032x;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1028w;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
public abstract class AbstractC0196a extends ViewGroup {

    /* renamed from: b */
    protected final C0197a f915b;

    /* renamed from: c */
    protected final Context f916c;

    /* renamed from: d */
    protected ActionMenuView f917d;

    /* renamed from: e */
    protected C0203c f918e;

    /* renamed from: f */
    protected int f919f;

    /* renamed from: g */
    protected C1028w f920g;

    /* renamed from: h */
    private boolean f921h;

    /* renamed from: i */
    private boolean f922i;

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0197a implements AbstractC1032x {

        /* renamed from: a */
        private boolean f923a = false;

        /* renamed from: b */
        int f924b;

        protected C0197a() {
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: a */
        public void mo345a(View view) {
            if (!this.f923a) {
                AbstractC0196a aVar = AbstractC0196a.this;
                aVar.f920g = null;
                AbstractC0196a.super.setVisibility(this.f924b);
            }
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: b */
        public void mo346b(View view) {
            AbstractC0196a.super.setVisibility(0);
            this.f923a = false;
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: c */
        public void mo1307c(View view) {
            this.f923a = true;
        }

        /* renamed from: d */
        public C0197a mo1308d(C1028w wVar, int i) {
            AbstractC0196a.this.f920g = wVar;
            this.f924b = i;
            return this;
        }
    }

    AbstractC0196a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbstractC0196a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f915b = new C0197a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0754a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f916c = context;
        } else {
            this.f916c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    protected static int m1036d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1304c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1305e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C1028w mo902f(int i, long j) {
        C1028w a;
        C1028w wVar = this.f920g;
        if (wVar != null) {
            wVar.mo5579b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a = C1013s.m5753c(this).mo5578a(1.0f);
        } else {
            a = C1013s.m5753c(this).mo5578a(0.0f);
        }
        a.mo5581d(j);
        a.mo5583f(this.f915b.mo1308d(a, i));
        return a;
    }

    public int getAnimatedVisibility() {
        return this.f920g != null ? this.f915b.f924b : getVisibility();
    }

    public int getContentHeight() {
        return this.f919f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0763j.f3706a, C0754a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0763j.f3751j, 0));
        obtainStyledAttributes.recycle();
        C0203c cVar = this.f918e;
        if (cVar != null) {
            cVar.mo1325I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f922i = false;
        }
        if (!this.f922i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f922i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f922i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f921h = false;
        }
        if (!this.f921h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f921h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f921h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1028w wVar = this.f920g;
            if (wVar != null) {
                wVar.mo5579b();
            }
            super.setVisibility(i);
        }
    }
}
