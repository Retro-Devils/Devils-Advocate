package com.bumptech.glide.load.p128q.p133h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.p128q.p133h.C1971g;
import com.bumptech.glide.p136n.AbstractC1996a;
import com.bumptech.glide.p144t.C2081j;
import java.nio.ByteBuffer;
import java.util.List;
import p006b.p007a.C0763j;
import p006b.p064s.p065a.p066a.AbstractC1183b;

/* renamed from: com.bumptech.glide.load.q.h.c */
public class C1966c extends Drawable implements C1971g.AbstractC1973b, Animatable {

    /* renamed from: b */
    private final C1967a f7279b;

    /* renamed from: c */
    private boolean f7280c;

    /* renamed from: d */
    private boolean f7281d;

    /* renamed from: e */
    private boolean f7282e;

    /* renamed from: f */
    private boolean f7283f;

    /* renamed from: g */
    private int f7284g;

    /* renamed from: h */
    private int f7285h;

    /* renamed from: i */
    private boolean f7286i;

    /* renamed from: j */
    private Paint f7287j;

    /* renamed from: k */
    private Rect f7288k;

    /* renamed from: l */
    private List<AbstractC1183b> f7289l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.h.c$a */
    public static final class C1967a extends Drawable.ConstantState {

        /* renamed from: a */
        final C1971g f7290a;

        C1967a(C1971g gVar) {
            this.f7290a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C1966c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C1966c(Context context, AbstractC1996a aVar, AbstractC1651m<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        this(new C1967a(new C1971g(ComponentCallbacks2C1610c.m7749c(context), aVar, i, i2, mVar, bitmap)));
    }

    C1966c(C1967a aVar) {
        this.f7283f = true;
        this.f7285h = -1;
        this.f7279b = (C1967a) C2081j.m9432d(aVar);
    }

    /* renamed from: b */
    private Drawable.Callback m8890b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m8891d() {
        if (this.f7288k == null) {
            this.f7288k = new Rect();
        }
        return this.f7288k;
    }

    /* renamed from: h */
    private Paint m8892h() {
        if (this.f7287j == null) {
            this.f7287j = new Paint(2);
        }
        return this.f7287j;
    }

    /* renamed from: j */
    private void m8893j() {
        List<AbstractC1183b> list = this.f7289l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f7289l.get(i).mo5907a(this);
            }
        }
    }

    /* renamed from: l */
    private void m8894l() {
        this.f7284g = 0;
    }

    /* renamed from: n */
    private void m8895n() {
        C2081j.m9429a(!this.f7282e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f7279b.f7290a.mo7606f() != 1) {
            if (!this.f7280c) {
                this.f7280c = true;
                this.f7279b.f7290a.mo7612r(this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    /* renamed from: o */
    private void m8896o() {
        this.f7280c = false;
        this.f7279b.f7290a.mo7613s(this);
    }

    @Override // com.bumptech.glide.load.p128q.p133h.C1971g.AbstractC1973b
    /* renamed from: a */
    public void mo7577a() {
        if (m8890b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo7582g() == mo7581f() - 1) {
            this.f7284g++;
        }
        int i = this.f7285h;
        if (i != -1 && this.f7284g >= i) {
            m8893j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo7578c() {
        return this.f7279b.f7290a.mo7602b();
    }

    public void draw(Canvas canvas) {
        if (!this.f7282e) {
            if (this.f7286i) {
                Gravity.apply(C0763j.f3618I0, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m8891d());
                this.f7286i = false;
            }
            canvas.drawBitmap(this.f7279b.f7290a.mo7603c(), (Rect) null, m8891d(), m8892h());
        }
    }

    /* renamed from: e */
    public Bitmap mo7580e() {
        return this.f7279b.f7290a.mo7605e();
    }

    /* renamed from: f */
    public int mo7581f() {
        return this.f7279b.f7290a.mo7606f();
    }

    /* renamed from: g */
    public int mo7582g() {
        return this.f7279b.f7290a.mo7604d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7279b;
    }

    public int getIntrinsicHeight() {
        return this.f7279b.f7290a.mo7607h();
    }

    public int getIntrinsicWidth() {
        return this.f7279b.f7290a.mo7609k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo7587i() {
        return this.f7279b.f7290a.mo7608j();
    }

    public boolean isRunning() {
        return this.f7280c;
    }

    /* renamed from: k */
    public void mo7589k() {
        this.f7282e = true;
        this.f7279b.f7290a.mo7601a();
    }

    /* renamed from: m */
    public void mo7590m(AbstractC1651m<Bitmap> mVar, Bitmap bitmap) {
        this.f7279b.f7290a.mo7611o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7286i = true;
    }

    public void setAlpha(int i) {
        m8892h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m8892h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C2081j.m9429a(!this.f7282e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f7283f = z;
        if (!z) {
            m8896o();
        } else if (this.f7281d) {
            m8895n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f7281d = true;
        m8894l();
        if (this.f7283f) {
            m8895n();
        }
    }

    public void stop() {
        this.f7281d = false;
        m8896o();
    }
}
