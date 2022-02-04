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
    private AbstractC0777c f3856b;

    /* renamed from: c */
    private Rect f3857c;

    /* renamed from: d */
    private Drawable f3858d;

    /* renamed from: e */
    private Drawable f3859e;

    /* renamed from: f */
    private int f3860f = 255;

    /* renamed from: g */
    private boolean f3861g;

    /* renamed from: h */
    private int f3862h = -1;

    /* renamed from: i */
    private boolean f3863i;

    /* renamed from: j */
    private Runnable f3864j;

    /* renamed from: k */
    private long f3865k;

    /* renamed from: l */
    private long f3866l;

    /* renamed from: m */
    private C0776b f3867m;

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
        private Drawable.Callback f3869b;

        C0776b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo4615a() {
            Drawable.Callback callback = this.f3869b;
            this.f3869b = null;
            return callback;
        }

        /* renamed from: b */
        public C0776b mo4616b(Drawable.Callback callback) {
            this.f3869b = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f3869b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f3869b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.l.a.b$c */
    public static abstract class AbstractC0777c extends Drawable.ConstantState {

        /* renamed from: A */
        int f3870A;

        /* renamed from: B */
        int f3871B;

        /* renamed from: C */
        boolean f3872C;

        /* renamed from: D */
        ColorFilter f3873D;

        /* renamed from: E */
        boolean f3874E;

        /* renamed from: F */
        ColorStateList f3875F;

        /* renamed from: G */
        PorterDuff.Mode f3876G;

        /* renamed from: H */
        boolean f3877H;

        /* renamed from: I */
        boolean f3878I;

        /* renamed from: a */
        final C0774b f3879a;

        /* renamed from: b */
        Resources f3880b;

        /* renamed from: c */
        int f3881c = 160;

        /* renamed from: d */
        int f3882d;

        /* renamed from: e */
        int f3883e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f3884f;

        /* renamed from: g */
        Drawable[] f3885g;

        /* renamed from: h */
        int f3886h;

        /* renamed from: i */
        boolean f3887i;

        /* renamed from: j */
        boolean f3888j;

        /* renamed from: k */
        Rect f3889k;

        /* renamed from: l */
        boolean f3890l;

        /* renamed from: m */
        boolean f3891m;

        /* renamed from: n */
        int f3892n;

        /* renamed from: o */
        int f3893o;

        /* renamed from: p */
        int f3894p;

        /* renamed from: q */
        int f3895q;

        /* renamed from: r */
        boolean f3896r;

        /* renamed from: s */
        int f3897s;

        /* renamed from: t */
        boolean f3898t;

        /* renamed from: u */
        boolean f3899u;

        /* renamed from: v */
        boolean f3900v;

        /* renamed from: w */
        boolean f3901w;

        /* renamed from: x */
        boolean f3902x;

        /* renamed from: y */
        boolean f3903y;

        /* renamed from: z */
        int f3904z;

        AbstractC0777c(AbstractC0777c cVar, C0774b bVar, Resources resources) {
            this.f3887i = false;
            this.f3890l = false;
            this.f3902x = true;
            this.f3870A = 0;
            this.f3871B = 0;
            this.f3879a = bVar;
            this.f3880b = resources != null ? resources : cVar != null ? cVar.f3880b : null;
            int f = C0774b.m4558f(resources, cVar != null ? cVar.f3881c : 0);
            this.f3881c = f;
            if (cVar != null) {
                this.f3882d = cVar.f3882d;
                this.f3883e = cVar.f3883e;
                this.f3900v = true;
                this.f3901w = true;
                this.f3887i = cVar.f3887i;
                this.f3890l = cVar.f3890l;
                this.f3902x = cVar.f3902x;
                this.f3903y = cVar.f3903y;
                this.f3904z = cVar.f3904z;
                this.f3870A = cVar.f3870A;
                this.f3871B = cVar.f3871B;
                this.f3872C = cVar.f3872C;
                this.f3873D = cVar.f3873D;
                this.f3874E = cVar.f3874E;
                this.f3875F = cVar.f3875F;
                this.f3876G = cVar.f3876G;
                this.f3877H = cVar.f3877H;
                this.f3878I = cVar.f3878I;
                if (cVar.f3881c == f) {
                    if (cVar.f3888j) {
                        this.f3889k = new Rect(cVar.f3889k);
                        this.f3888j = true;
                    }
                    if (cVar.f3891m) {
                        this.f3892n = cVar.f3892n;
                        this.f3893o = cVar.f3893o;
                        this.f3894p = cVar.f3894p;
                        this.f3895q = cVar.f3895q;
                        this.f3891m = true;
                    }
                }
                if (cVar.f3896r) {
                    this.f3897s = cVar.f3897s;
                    this.f3896r = true;
                }
                if (cVar.f3898t) {
                    this.f3899u = cVar.f3899u;
                    this.f3898t = true;
                }
                Drawable[] drawableArr = cVar.f3885g;
                this.f3885g = new Drawable[drawableArr.length];
                this.f3886h = cVar.f3886h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f3884f;
                this.f3884f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f3886h);
                int i = this.f3886h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f3884f.put(i2, constantState);
                        } else {
                            this.f3885g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f3885g = new Drawable[10];
            this.f3886h = 0;
        }

        /* renamed from: e */
        private void m4567e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f3884f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f3885g[this.f3884f.keyAt(i)] = m4568s(this.f3884f.valueAt(i).newDrawable(this.f3880b));
                }
                this.f3884f = null;
            }
        }

        /* renamed from: s */
        private Drawable m4568s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f3904z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f3879a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo4620a(Drawable drawable) {
            int i = this.f3886h;
            if (i >= this.f3885g.length) {
                mo4635o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f3879a);
            this.f3885g[i] = drawable;
            this.f3886h++;
            this.f3883e = drawable.getChangingConfigurations() | this.f3883e;
            mo4636p();
            this.f3889k = null;
            this.f3888j = false;
            this.f3891m = false;
            this.f3900v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4621b(Resources.Theme theme) {
            if (theme != null) {
                m4567e();
                int i = this.f3886h;
                Drawable[] drawableArr = this.f3885g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f3883e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo4643y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean mo4622c() {
            if (this.f3900v) {
                return this.f3901w;
            }
            m4567e();
            this.f3900v = true;
            int i = this.f3886h;
            Drawable[] drawableArr = this.f3885g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f3901w = false;
                    return false;
                }
            }
            this.f3901w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f3886h;
            Drawable[] drawableArr = this.f3885g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f3884f.get(i2);
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
            this.f3891m = true;
            m4567e();
            int i = this.f3886h;
            Drawable[] drawableArr = this.f3885g;
            this.f3893o = -1;
            this.f3892n = -1;
            this.f3895q = 0;
            this.f3894p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3892n) {
                    this.f3892n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f3893o) {
                    this.f3893o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3894p) {
                    this.f3894p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f3895q) {
                    this.f3895q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo4625f() {
            return this.f3885g.length;
        }

        /* renamed from: g */
        public final Drawable mo4626g(int i) {
            int indexOfKey;
            Drawable drawable = this.f3885g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f3884f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m4568s(this.f3884f.valueAt(indexOfKey).newDrawable(this.f3880b));
            this.f3885g[i] = s;
            this.f3884f.removeAt(indexOfKey);
            if (this.f3884f.size() == 0) {
                this.f3884f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f3882d | this.f3883e;
        }

        /* renamed from: h */
        public final int mo4628h() {
            return this.f3886h;
        }

        /* renamed from: i */
        public final int mo4629i() {
            if (!this.f3891m) {
                mo4624d();
            }
            return this.f3893o;
        }

        /* renamed from: j */
        public final int mo4630j() {
            if (!this.f3891m) {
                mo4624d();
            }
            return this.f3895q;
        }

        /* renamed from: k */
        public final int mo4631k() {
            if (!this.f3891m) {
                mo4624d();
            }
            return this.f3894p;
        }

        /* renamed from: l */
        public final Rect mo4632l() {
            Rect rect = null;
            if (this.f3887i) {
                return null;
            }
            Rect rect2 = this.f3889k;
            if (rect2 != null || this.f3888j) {
                return rect2;
            }
            m4567e();
            Rect rect3 = new Rect();
            int i = this.f3886h;
            Drawable[] drawableArr = this.f3885g;
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
            this.f3888j = true;
            this.f3889k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo4633m() {
            if (!this.f3891m) {
                mo4624d();
            }
            return this.f3892n;
        }

        /* renamed from: n */
        public final int mo4634n() {
            if (this.f3896r) {
                return this.f3897s;
            }
            m4567e();
            int i = this.f3886h;
            Drawable[] drawableArr = this.f3885g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f3897s = opacity;
            this.f3896r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo4635o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f3885g, 0, drawableArr, 0, i);
            this.f3885g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo4636p() {
            this.f3896r = false;
            this.f3898t = false;
        }

        /* renamed from: q */
        public final boolean mo4637q() {
            return this.f3890l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo4601r();

        /* renamed from: t */
        public final void mo4638t(boolean z) {
            this.f3890l = z;
        }

        /* renamed from: u */
        public final void mo4639u(int i) {
            this.f3870A = i;
        }

        /* renamed from: v */
        public final void mo4640v(int i) {
            this.f3871B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo4641w(int i, int i2) {
            int i3 = this.f3886h;
            Drawable[] drawableArr = this.f3885g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f3904z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo4642x(boolean z) {
            this.f3887i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo4643y(Resources resources) {
            if (resources != null) {
                this.f3880b = resources;
                int f = C0774b.m4558f(resources, this.f3881c);
                int i = this.f3881c;
                this.f3881c = f;
                if (i != f) {
                    this.f3891m = false;
                    this.f3888j = false;
                }
            }
        }
    }

    C0774b() {
    }

    /* renamed from: d */
    private void m4556d(Drawable drawable) {
        if (this.f3867m == null) {
            this.f3867m = new C0776b();
        }
        drawable.setCallback(this.f3867m.mo4616b(drawable.getCallback()));
        try {
            if (this.f3856b.f3870A <= 0 && this.f3861g) {
                drawable.setAlpha(this.f3860f);
            }
            AbstractC0777c cVar = this.f3856b;
            if (cVar.f3874E) {
                drawable.setColorFilter(cVar.f3873D);
            } else {
                if (cVar.f3877H) {
                    C0398a.m1978o(drawable, cVar.f3875F);
                }
                AbstractC0777c cVar2 = this.f3856b;
                if (cVar2.f3878I) {
                    C0398a.m1979p(drawable, cVar2.f3876G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3856b.f3902x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f3856b.f3872C);
            }
            Rect rect = this.f3857c;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f3867m.mo4615a());
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
        this.f3856b.mo4621b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC0777c mo4556b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo4608c() {
        return this.f3862h;
    }

    public boolean canApplyTheme() {
        return this.f3856b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3859e;
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
        return this.f3860f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3856b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f3856b.mo4622c()) {
            return null;
        }
        this.f3856b.f3882d = getChangingConfigurations();
        return this.f3856b;
    }

    public Drawable getCurrent() {
        return this.f3858d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3857c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f3856b.mo4637q()) {
            return this.f3856b.mo4629i();
        }
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f3856b.mo4637q()) {
            return this.f3856b.mo4633m();
        }
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f3856b.mo4637q()) {
            return this.f3856b.mo4630j();
        }
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f3856b.mo4637q()) {
            return this.f3856b.mo4631k();
        }
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f3858d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f3856b.mo4634n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f3856b.mo4632l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f3858d;
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
        this.f3856b = cVar;
        int i = this.f3862h;
        if (i >= 0) {
            Drawable g = cVar.mo4626g(i);
            this.f3858d = g;
            if (g != null) {
                m4556d(g);
            }
        }
        this.f3859e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo4611i(Resources resources) {
        this.f3856b.mo4643y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC0777c cVar = this.f3856b;
        if (cVar != null) {
            cVar.mo4636p();
        }
        if (drawable == this.f3858d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f3856b.f3872C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f3859e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3859e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f3858d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3861g) {
                this.f3858d.setAlpha(this.f3860f);
            }
        }
        if (this.f3866l != 0) {
            this.f3866l = 0;
            z = true;
        }
        if (this.f3865k != 0) {
            this.f3865k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f3863i && super.mutate() == this) {
            AbstractC0777c b = mo4556b();
            b.mo4601r();
            mo4570h(b);
            this.f3863i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3859e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3858d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f3856b.mo4641w(i, mo4608c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3859e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f3858d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3859e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f3858d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f3858d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f3861g || this.f3860f != i) {
            this.f3861g = true;
            this.f3860f = i;
            Drawable drawable = this.f3858d;
            if (drawable == null) {
                return;
            }
            if (this.f3865k == 0) {
                drawable.setAlpha(i);
            } else {
                mo4607a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        AbstractC0777c cVar = this.f3856b;
        if (cVar.f3872C != z) {
            cVar.f3872C = z;
            Drawable drawable = this.f3858d;
            if (drawable != null) {
                C0398a.m1973j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0777c cVar = this.f3856b;
        cVar.f3874E = true;
        if (cVar.f3873D != colorFilter) {
            cVar.f3873D = colorFilter;
            Drawable drawable = this.f3858d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        AbstractC0777c cVar = this.f3856b;
        if (cVar.f3902x != z) {
            cVar.f3902x = z;
            Drawable drawable = this.f3858d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            C0398a.m1974k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f3857c;
        if (rect == null) {
            this.f3857c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f3858d;
        if (drawable != null) {
            C0398a.m1975l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        AbstractC0777c cVar = this.f3856b;
        cVar.f3877H = true;
        if (cVar.f3875F != colorStateList) {
            cVar.f3875F = colorStateList;
            C0398a.m1978o(this.f3858d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0777c cVar = this.f3856b;
        cVar.f3878I = true;
        if (cVar.f3876G != mode) {
            cVar.f3876G = mode;
            C0398a.m1979p(this.f3858d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f3859e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f3858d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3858d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
