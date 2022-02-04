package p006b.p007a.p010l.p011a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0254m0;
import androidx.core.content.p005c.C0397g;
import androidx.core.graphics.drawable.AbstractC0399b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p007a.p010l.p011a.C0774b;
import p006b.p007a.p010l.p011a.C0779d;
import p006b.p007a.p012m.C0782b;
import p006b.p021d.C0830f;
import p006b.p021d.C0839j;
import p006b.p064s.p065a.p066a.C1184c;
import p006b.p064s.p065a.p066a.C1194i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.l.a.a */
public class C0766a extends C0779d implements AbstractC0399b {

    /* renamed from: p */
    private static final String f3841p = C0766a.class.getSimpleName();

    /* renamed from: q */
    private C0769c f3842q;

    /* renamed from: r */
    private AbstractC0773g f3843r;

    /* renamed from: s */
    private int f3844s;

    /* renamed from: t */
    private int f3845t;

    /* renamed from: u */
    private boolean f3846u;

    /* access modifiers changed from: private */
    /* renamed from: b.a.l.a.a$b */
    public static class C0768b extends AbstractC0773g {

        /* renamed from: a */
        private final Animatable f3847a;

        C0768b(Animatable animatable) {
            super();
            this.f3847a = animatable;
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: c */
        public void mo4590c() {
            this.f3847a.start();
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: d */
        public void mo4591d() {
            this.f3847a.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.l.a.a$c */
    public static class C0769c extends C0779d.C0780a {

        /* renamed from: K */
        C0830f<Long> f3848K;

        /* renamed from: L */
        C0839j<Integer> f3849L;

        C0769c(C0769c cVar, C0766a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C0839j<Integer> jVar;
            if (cVar != null) {
                this.f3848K = cVar.f3848K;
                jVar = cVar.f3849L;
            } else {
                this.f3848K = new C0830f<>();
                jVar = new C0839j<>();
            }
            this.f3849L = jVar;
        }

        /* renamed from: D */
        private static long m4535D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo4592B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo4675z(iArr, drawable);
            this.f3849L.mo5034j(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo4593C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo4620a(drawable);
            long D = m4535D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f3848K.mo4911a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f3848K.mo4911a(m4535D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo4594E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f3849L.mo5030f(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo4595F(int[] iArr) {
            int A = super.mo4674A(iArr);
            return A >= 0 ? A : super.mo4674A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo4596G(int i, int i2) {
            return (int) this.f3848K.mo4916f(m4535D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo4597H(int i, int i2) {
            return (this.f3848K.mo4916f(m4535D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo4598I(int i, int i2) {
            return (this.f3848K.mo4916f(m4535D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p006b.p007a.p010l.p011a.C0779d.C0780a
        public Drawable newDrawable() {
            return new C0766a(this, null);
        }

        @Override // p006b.p007a.p010l.p011a.C0779d.C0780a
        public Drawable newDrawable(Resources resources) {
            return new C0766a(this, resources);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p007a.p010l.p011a.C0779d.C0780a, p006b.p007a.p010l.p011a.C0774b.AbstractC0777c
        /* renamed from: r */
        public void mo4601r() {
            this.f3848K = this.f3848K.clone();
            this.f3849L = this.f3849L.clone();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.l.a.a$d */
    public static class C0770d extends AbstractC0773g {

        /* renamed from: a */
        private final C1184c f3850a;

        C0770d(C1184c cVar) {
            super();
            this.f3850a = cVar;
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: c */
        public void mo4590c() {
            this.f3850a.start();
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: d */
        public void mo4591d() {
            this.f3850a.stop();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.l.a.a$e */
    public static class C0771e extends AbstractC0773g {

        /* renamed from: a */
        private final ObjectAnimator f3851a;

        /* renamed from: b */
        private final boolean f3852b;

        C0771e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0772f fVar = new C0772f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo4604a());
            ofInt.setInterpolator(fVar);
            this.f3852b = z2;
            this.f3851a = ofInt;
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: a */
        public boolean mo4602a() {
            return this.f3852b;
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: b */
        public void mo4603b() {
            this.f3851a.reverse();
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: c */
        public void mo4590c() {
            this.f3851a.start();
        }

        @Override // p006b.p007a.p010l.p011a.C0766a.AbstractC0773g
        /* renamed from: d */
        public void mo4591d() {
            this.f3851a.cancel();
        }
    }

    /* renamed from: b.a.l.a.a$f */
    private static class C0772f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f3853a;

        /* renamed from: b */
        private int f3854b;

        /* renamed from: c */
        private int f3855c;

        C0772f(AnimationDrawable animationDrawable, boolean z) {
            mo4605b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4604a() {
            return this.f3855c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4605b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f3854b = numberOfFrames;
            int[] iArr = this.f3853a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f3853a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f3853a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f3855c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f3855c)) + 0.5f);
            int i2 = this.f3854b;
            int[] iArr = this.f3853a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f3855c) : 0.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.l.a.a$g */
    public static abstract class AbstractC0773g {
        private AbstractC0773g() {
        }

        /* renamed from: a */
        public boolean mo4602a() {
            return false;
        }

        /* renamed from: b */
        public void mo4603b() {
        }

        /* renamed from: c */
        public abstract void mo4590c();

        /* renamed from: d */
        public abstract void mo4591d();
    }

    public C0766a() {
        this(null, null);
    }

    C0766a(C0769c cVar, Resources resources) {
        super(null);
        this.f3844s = -1;
        this.f3845t = -1;
        mo4570h(new C0769c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C0766a m4521m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0766a aVar = new C0766a();
            aVar.mo4578n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m4522o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m4524q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m4525r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m4523p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m4524q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C0782b.f3916h);
        int resourceId = k.getResourceId(C0782b.f3917i, 0);
        int resourceId2 = k.getResourceId(C0782b.f3918j, -1);
        Drawable j = resourceId2 > 0 ? C0254m0.m1289h().mo1589j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = mo4673k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("vector") ? C1194i.m6462c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j != null) {
            return this.f3842q.mo4592B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m4525r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C0782b.f3919k);
        int resourceId = k.getResourceId(C0782b.f3922n, -1);
        int resourceId2 = k.getResourceId(C0782b.f3921m, -1);
        int resourceId3 = k.getResourceId(C0782b.f3920l, -1);
        Drawable j = resourceId3 > 0 ? C0254m0.m1289h().mo1589j(context, resourceId3) : null;
        boolean z = k.getBoolean(C0782b.f3923o, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("animated-vector") ? C1184c.m6429a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f3842q.mo4593C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m4526s(int i) {
        int i2;
        int G;
        AbstractC0773g gVar;
        AbstractC0773g gVar2 = this.f3843r;
        if (gVar2 == null) {
            i2 = mo4608c();
        } else if (i == this.f3844s) {
            return true;
        } else {
            if (i != this.f3845t || !gVar2.mo4602a()) {
                i2 = this.f3844s;
                gVar2.mo4591d();
            } else {
                gVar2.mo4603b();
                this.f3844s = this.f3845t;
                this.f3845t = i;
                return true;
            }
        }
        this.f3843r = null;
        this.f3845t = -1;
        this.f3844s = -1;
        C0769c cVar = this.f3842q;
        int E = cVar.mo4594E(i2);
        int E2 = cVar.mo4594E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo4596G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo4598I(E, E2);
        mo4609g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C0771e((AnimationDrawable) current, cVar.mo4597H(E, E2), I);
        } else if (current instanceof C1184c) {
            gVar = new C0770d((C1184c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C0768b((Animatable) current);
            }
            return false;
        }
        gVar.mo4590c();
        this.f3843r = gVar;
        this.f3845t = i2;
        this.f3844s = i;
        return true;
    }

    /* renamed from: t */
    private void m4527t(TypedArray typedArray) {
        C0769c cVar = this.f3842q;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f3882d |= typedArray.getChangingConfigurations();
        }
        cVar.mo4642x(typedArray.getBoolean(C0782b.f3912d, cVar.f3887i));
        cVar.mo4638t(typedArray.getBoolean(C0782b.f3913e, cVar.f3890l));
        cVar.mo4639u(typedArray.getInt(C0782b.f3914f, cVar.f3870A));
        cVar.mo4640v(typedArray.getInt(C0782b.f3915g, cVar.f3871B));
        setDither(typedArray.getBoolean(C0782b.f3910b, cVar.f3902x));
    }

    @Override // p006b.p007a.p010l.p011a.C0779d, p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    @Override // p006b.p007a.p010l.p011a.C0779d, p006b.p007a.p010l.p011a.C0774b
    /* renamed from: h */
    public void mo4570h(C0774b.AbstractC0777c cVar) {
        super.mo4570h(cVar);
        if (cVar instanceof C0769c) {
            this.f3842q = (C0769c) cVar;
        }
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // p006b.p007a.p010l.p011a.C0779d
    public boolean isStateful() {
        return true;
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0773g gVar = this.f3843r;
        if (gVar != null) {
            gVar.mo4591d();
            this.f3843r = null;
            mo4609g(this.f3844s);
            this.f3844s = -1;
            this.f3845t = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0769c mo4574j() {
        return new C0769c(this.f3842q, this, null);
    }

    @Override // p006b.p007a.p010l.p011a.C0779d, p006b.p007a.p010l.p011a.C0774b
    public Drawable mutate() {
        if (!this.f3846u && super.mutate() == this) {
            this.f3842q.mo4601r();
            this.f3846u = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo4578n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C0782b.f3909a);
        setVisible(k.getBoolean(C0782b.f3911c, true), true);
        m4527t(k);
        mo4611i(resources);
        k.recycle();
        m4522o(context, resources, xmlPullParser, attributeSet, theme);
        m4523p();
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p007a.p010l.p011a.C0779d, p006b.p007a.p010l.p011a.C0774b
    public boolean onStateChange(int[] iArr) {
        int F = this.f3842q.mo4595F(iArr);
        boolean z = F != mo4608c() && (m4526s(F) || mo4609g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b, androidx.core.graphics.drawable.AbstractC0399b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b, androidx.core.graphics.drawable.AbstractC0399b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC0773g gVar = this.f3843r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo4590c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p006b.p007a.p010l.p011a.C0774b
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
