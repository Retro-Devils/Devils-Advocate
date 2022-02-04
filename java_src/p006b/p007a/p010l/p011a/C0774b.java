package p006b.p007a.p010l.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0398a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.l.a.b */
public class C0774b extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    private AbstractC0777c f3852b;

    /* renamed from: c */
    private Rect f3853c;

    /* renamed from: d */
    private Drawable f3854d;

    /* renamed from: e */
    private Drawable f3855e;

    /* renamed from: f */
    private int f3856f = 255;

    /* renamed from: g */
    private boolean f3857g;

    /* renamed from: h */
    private int f3858h = -1;

    /* renamed from: i */
    private boolean f3859i;

    /* renamed from: j */
    private Runnable f3860j;

    /* renamed from: k */
    private long f3861k;

    /* renamed from: l */
    private long f3862l;

    /* renamed from: m */
    private C0776b f3863m;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.l.a.b$a */
    public class RunnableC0775a implements Runnable {
        RunnableC0775a() {
        }

        public void run() {
            C0774b.this.mo4607a(true);
            C0774b.this.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.l.a.b$b */
    public static class C0776b implements Drawable.Callback {

        /* renamed from: b */
        private Drawable.Callback f3865b;

        C0776b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo4615a() {
            Drawable.Callback callback = this.f3865b;
            this.f3865b = null;
            return callback;
        }

        /* renamed from: b */
        public C0776b mo4616b(Drawable.Callback callback) {
            this.f3865b = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f3865b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f3865b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.l.a.b$c */
    public static abstract class AbstractC0777c extends Drawable.ConstantState {

        /* renamed from: A */
        int f3866A;

        /* renamed from: B */
        int f3867B;

        /* renamed from: C */
        boolean f3868C;

        /* renamed from: D */
        ColorFilter f3869D;

        /* renamed from: E */
        boolean f3870E;

        /* renamed from: F */
        ColorStateList f3871F;

        /* renamed from: G */
        PorterDuff.Mode f3872G;

        /* renamed from: H */
        boolean f3873H;

        /* renamed from: I */
        boolean f3874I;

        /* renamed from: a */
        final C0774b f3875a;

        /* renamed from: b */
        Resources f3876b;

        /* renamed from: c */
        int f3877c = 160;

        /* renamed from: d */
        int f3878d;

        /* renamed from: e */
        int f3879e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f3880f;

        /* renamed from: g */
        Drawable[] f3881g;

        /* renamed from: h */
        int f3882h;

        /* renamed from: i */
        boolean f3883i;

        /* renamed from: j */
        boolean f3884j;

        /* renamed from: k */
        Rect f3885k;

        /* renamed from: l */
        boolean f3886l;

        /* renamed from: m */
        boolean f3887m;

        /* renamed from: n */
        int f3888n;

        /* renamed from: o */
        int f3889o;

        /* renamed from: p */
        int f3890p;

        /* renamed from: q */
        int f3891q;

        /* renamed from: r */
        boolean f3892r;

        /* renamed from: s */
        int f3893s;

        /* renamed from: t */
        boolean f3894t;

        /* renamed from: u */
        boolean f3895u;

        /* renamed from: v */
        boolean f3896v;

        /* renamed from: w */
        boolean f3897w;

        /* renamed from: x */
        boolean f3898x;

        /* renamed from: y */
        boolean f3899y;

        /* renamed from: z */
        int f3900z;

        AbstractC0777c(AbstractC0777c cVar, C0774b bVar, Resources resources) {
            this.f3883i = false;
            this.f3886l = false;
            this.f3898x = true;
            this.f3866A = 0;
            this.f3867B = 0;
            this.f3875a = bVar;
            this.f3876b = resources != null ? resources : cVar != null ? cVar.f3876b : null;
            int f = C0774b.m4558f(resources, cVar != null ? cVar.f3877c : 0);
            this.f3877c = f;
            if (cVar != null) {
                this.f3878d = cVar.f3878d;
                this.f3879e = cVar.f3879e;
                this.f3896v = true;
                this.f3897w = true;
                this.f3883i = cVar.f3883i;
                this.f3886l = cVar.f3886l;
                this.f3898x = cVar.f3898x;
                this.f3899y = cVar.f3899y;
                this.f3900z = cVar.f3900z;
                this.f3866A = cVar.f3866A;
                this.f3867B = cVar.f3867B;
                this.f3868C = cVar.f3868C;
                this.f3869D = cVar.f3869D;
                this.f3870E = cVar.f3870E;
                this.f3871F = cVar.f3871F;
                this.f3872G = cVar.f3872G;
                this.f3873H = cVar.f3873H;
                this.f3874I = cVar.f3874I;
                if (cVar.f3877c == f) {
                    if (cVar.f3884j) {
                        this.f3885k = new Rect(cVar.f3885k);
                        this.f3884j = true;
                    }
                    if (cVar.f3887m) {
                        this.f3888n = cVar.f3888n;
                        this.f3889o = cVar.f3889o;
                        this.f3890p = cVar.f3890p;
                        this.f3891q = cVar.f3891q;
                        this.f3887m = true;
                    }
                }
                if (cVar.f3892r) {
                    this.f3893s = cVar.f3893s;
                    this.f3892r = true;
                }
                if (cVar.f3894t) {
                    this.f3895u = cVar.f3895u;
                    this.f3894t = true;
                }
                Drawable[] drawableArr = cVar.f3881g;
                this.f3881g = new Drawable[drawableArr.length];
                this.f3882h = cVar.f3882h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f3880f;
                this.f3880f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f3882h);
                int i = this.f3882h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f3880f.put(i2, constantState);
                        } else {
                            this.f3881g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f3881g = new Drawable[10];
            this.f3882h = 0;
        }

        /* renamed from: e */
        private void m4567e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f3880f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f3881g[this.f3880f.keyAt(i)] = m4568s(this.f3880f.valueAt(i).newDrawable(this.f3876b));
                }
                this.f3880f = null;
            }
        }

        /* renamed from: s */
        private Drawable m4568s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f3900z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f3875a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo4620a(Drawable drawable) {
            int i = this.f3882h;
            if (i >= this.f3881g.length) {
                mo4635o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f3875a);
            this.f3881g[i] = drawable;
            this.f3882h++;
            this.f3879e = drawable.getChangingConfigurations() | this.f3879e;
            mo4636p();
            this.f3885k = null;
            this.f3884j = false;
            this.f3887m = false;
            this.f3896v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4621b(Resources.Theme theme) {
            if (theme != null) {
                m4567e();
                int i = this.f3882h;
                Drawable[] drawableArr = this.f3881g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f3879e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo4643y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean mo4622c() {
            if (this.f3896v) {
                return this.f3897w;
            }
            m4567e();
            this.f3896v = true;
            int i = this.f3882h;
            Drawable[] drawableArr = this.f3881g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f3897w = false;
                    return false;
                }
            }
            this.f3897w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f3882h;
            Drawable[] drawableArr = this.f3881g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f3880f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4624d() {
            this.f3887m = true;
            m4567e();
            int i = this.f3882h;
            Drawable[] drawableArr = this.f3881g;
            this.f3889o = -1;
            this.f3888n = -1;
            this.f3891q = 0;
            this.f3890p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3888n) {
                    this.f3888n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f3889o) {
                    this.f3889o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3890p) {
                    this.f3890p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f3891q) {
                    this.f3891q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo4625f() {
            return this.f3881g.length;
        }

        /* renamed from: g */
        public final Drawable mo4626g(int i) {
            int indexOfKey;
            Drawable drawable = this.f3881g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f3880f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m4568s(this.f3880f.valueAt(indexOfKey).newDrawable(this.f3876b));
            this.f3881g[i] = s;
            this.f3880f.removeAt(indexOfKey);
            if (this.f3880f.size() == 0) {
                this.f3880f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f3878d | this.f3879e;
        }

        /* renamed from: h */
        public final int mo4628h() {
            return this.f3882h;
        }

        /* renamed from: i */
        public final int mo4629i() {
            if (!this.f3887m) {
                mo4624d();
            }
            return this.f3889o;
        }

        /* renamed from: j */
        public final int mo4630j() {
            if (!this.f3887m) {
                mo4624d();
            }
            return this.f3891q;
        }

        /* renamed from: k */
        public final int mo4631k() {
            if (!this.f3887m) {
                mo4624d();
            }
            return this.f3890p;
        }

        /* renamed from: l */
        public final Rect mo4632l() {
            Rect rect = null;
            if (this.f3883i) {
                return null;
            }
            Rect rect2 = this.f3885k;
            if (rect2 != null || this.f3884j) {
                return rect2;
            }
            m4567e();
            Rect rect3 = new Rect();
            int i = this.f3882h;
            Drawable[] drawableArr = this.f3881g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f3884j = true;
            this.f3885k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo4633m() {
            if (!this.f3887m) {
                mo4624d();
            }
            return this.f3888n;
        }

        /* renamed from: n */
        public final int mo4634n() {
            if (this.f3892r) {
                return this.f3893s;
            }
            m4567e();
            int i = this.f3882h;
            Drawable[] drawableArr = this.f3881g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f3893s = opacity;
            this.f3892r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo4635o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f3881g, 0, drawableArr, 0, i);
            this.f3881g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo4636p() {
            this.f3892r = false;
            this.f3894t = false;
        }

        /* renamed from: q */
        public final boolean mo4637q() {
            return this.f3886l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo4601r();

        /* renamed from: t */
        public final void mo4638t(boolean z) {
            this.f3886l = z;
        }

        /* renamed from: u */
        public final void mo4639u(int i) {
            this.f3866A = i;
        }

        /* renamed from: v */
        public final void mo4640v(int i) {
            this.f3867B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo4641w(int i, int i2) {
            int i3 = this.f3882h;
            Drawable[] drawableArr = this.f3881g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f3900z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo4642x(boolean z) {
            this.f3883i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo4643y(Resources resources) {
            if (resources != null) {
                this.f3876b = resources;
                int f = C0774b.m4558f(resources, this.f3877c);
                int i = this.f3877c;
                this.f3877c = f;
                if (i != f) {
                    this.f3887m = false;
                    this.f3884j = false;
                }
            }
        }
    }

    C0774b() {
    }

    /* renamed from: d */
    private void m4556d(Drawable drawable) {
        if (this.f3863m == null) {
            this.f3863m = new C0776b();
        }
        drawable.setCallback(this.f3863m.mo4616b(drawable.getCallback()));
        try {
            if (this.f3852b.f3866A <= 0 && this.f3857g) {
                drawable.setAlpha(this.f3856f);
            }
            AbstractC0777c cVar = this.f3852b;
            if (cVar.f3870E) {
                drawable.setColorFilter(cVar.f3869D);
            } else {
                if (cVar.f3873H) {
                    C0398a.m1978o(drawable, cVar.f3871F);
                }
                AbstractC0777c cVar2 = this.f3852b;
                if (cVar2.f3874I) {
                    C0398a.m1979p(drawable, cVar2.f3872G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3852b.f3898x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f3852b.f3868C);
            }
            Rect rect = this.f3853c;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f3863m.mo4615a());
        }
    }

    /* renamed from: e */
    private boolean m4557e() {
        return isAutoMirrored() && C0398a.m1969f(this) == 1;
    }

    /* renamed from: f */
    static int m4558f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4607a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p007a.p010l.p011a.C0774b.mo4607a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f3852b.mo4621b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC0777c mo4556b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo4608c() {
        return this.f3858h;
    }

    public boolean canApplyTheme() {
        return this.f3852b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3855e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4609g(int r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p007a.p010l.p011a.C0774b.mo4609g(int):boolean");
    }

    public int getAlpha() {
        return this.f3856f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3852b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f3852b.mo4622c()) {
            return null;
        }
        this.f3852b.f3878d = getChangingConfigurations();
        return this.f3852b;
    }

    public Drawable getCurrent() {
        return this.f3854d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3853c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f3852b.mo4637q()) {
            return this.f3852b.mo4629i();
        }
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f3852b.mo4637q()) {
            return this.f3852b.mo4633m();
        }
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f3852b.mo4637q()) {
            return this.f3852b.mo4630j();
        }
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f3852b.mo4637q()) {
            return this.f3852b.mo4631k();
        }
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f3854d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f3852b.mo4634n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f3852b.mo4632l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f3854d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m4557e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4570h(AbstractC0777c cVar) {
        this.f3852b = cVar;
        int i = this.f3858h;
        if (i >= 0) {
            Drawable g = cVar.mo4626g(i);
            this.f3854d = g;
            if (g != null) {
                m4556d(g);
            }
        }
        this.f3855e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo4611i(Resources resources) {
        this.f3852b.mo4643y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC0777c cVar = this.f3852b;
        if (cVar != null) {
            cVar.mo4636p();
        }
        if (drawable == this.f3854d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f3852b.f3868C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f3855e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3855e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f3854d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3857g) {
                this.f3854d.setAlpha(this.f3856f);
            }
        }
        if (this.f3862l != 0) {
            this.f3862l = 0;
            z = true;
        }
        if (this.f3861k != 0) {
            this.f3861k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f3859i && super.mutate() == this) {
            AbstractC0777c b = mo4556b();
            b.mo4601r();
            mo4570h(b);
            this.f3859i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3855e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3854d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f3852b.mo4641w(i, mo4608c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3855e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f3854d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3855e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f3854d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f3854d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f3857g || this.f3856f != i) {
            this.f3857g = true;
            this.f3856f = i;
            Drawable drawable = this.f3854d;
            if (drawable == null) {
                return;
            }
            if (this.f3861k == 0) {
                drawable.setAlpha(i);
            } else {
                mo4607a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        AbstractC0777c cVar = this.f3852b;
        if (cVar.f3868C != z) {
            cVar.f3868C = z;
            Drawable drawable = this.f3854d;
            if (drawable != null) {
                C0398a.m1973j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0777c cVar = this.f3852b;
        cVar.f3870E = true;
        if (cVar.f3869D != colorFilter) {
            cVar.f3869D = colorFilter;
            Drawable drawable = this.f3854d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        AbstractC0777c cVar = this.f3852b;
        if (cVar.f3898x != z) {
            cVar.f3898x = z;
            Drawable drawable = this.f3854d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            C0398a.m1974k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f3853c;
        if (rect == null) {
            this.f3853c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f3854d;
        if (drawable != null) {
            C0398a.m1975l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        AbstractC0777c cVar = this.f3852b;
        cVar.f3873H = true;
        if (cVar.f3871F != colorStateList) {
            cVar.f3871F = colorStateList;
            C0398a.m1978o(this.f3854d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0777c cVar = this.f3852b;
        cVar.f3874I = true;
        if (cVar.f3872G != mode) {
            cVar.f3872G = mode;
            C0398a.m1979p(this.f3854d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f3855e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f3854d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3854d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
