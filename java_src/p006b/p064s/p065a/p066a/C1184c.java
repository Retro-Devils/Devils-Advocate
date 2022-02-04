package p006b.p064s.p065a.p066a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p005c.C0397g;
import androidx.core.graphics.drawable.C0398a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p006b.p021d.C0823a;

/* renamed from: b.s.a.a.c */
public class C1184c extends AbstractC1193h implements Animatable {

    /* renamed from: c */
    private C1186b f5237c;

    /* renamed from: d */
    private Context f5238d;

    /* renamed from: e */
    private ArgbEvaluator f5239e;

    /* renamed from: f */
    private Animator.AnimatorListener f5240f;

    /* renamed from: g */
    ArrayList<AbstractC1183b> f5241g;

    /* renamed from: h */
    final Drawable.Callback f5242h;

    /* renamed from: b.s.a.a.c$a */
    class C1185a implements Drawable.Callback {
        C1185a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1184c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1184c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1184c.this.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.c$b */
    public static class C1186b extends Drawable.ConstantState {

        /* renamed from: a */
        int f5244a;

        /* renamed from: b */
        C1194i f5245b;

        /* renamed from: c */
        AnimatorSet f5246c;

        /* renamed from: d */
        ArrayList<Animator> f5247d;

        /* renamed from: e */
        C0823a<Animator, String> f5248e;

        public C1186b(Context context, C1186b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5244a = bVar.f5244a;
                C1194i iVar = bVar.f5245b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f5245b = (C1194i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C1194i iVar2 = (C1194i) this.f5245b.mutate();
                    this.f5245b = iVar2;
                    iVar2.setCallback(callback);
                    this.f5245b.setBounds(bVar.f5245b.getBounds());
                    this.f5245b.mo5973h(false);
                }
                ArrayList<Animator> arrayList = bVar.f5247d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5247d = new ArrayList<>(size);
                    this.f5248e = new C0823a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f5247d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f5248e.get(animator);
                        clone.setTarget(this.f5245b.mo5964d(str));
                        this.f5247d.add(clone);
                        this.f5248e.put(clone, str);
                    }
                    mo5950a();
                }
            }
        }

        /* renamed from: a */
        public void mo5950a() {
            if (this.f5246c == null) {
                this.f5246c = new AnimatorSet();
            }
            this.f5246c.playTogether(this.f5247d);
        }

        public int getChangingConfigurations() {
            return this.f5244a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: b.s.a.a.c$c */
    private static class C1187c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5249a;

        public C1187c(Drawable.ConstantState constantState) {
            this.f5249a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5249a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5249a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1184c cVar = new C1184c();
            Drawable newDrawable = this.f5249a.newDrawable();
            cVar.f5254b = newDrawable;
            newDrawable.setCallback(cVar.f5242h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1184c cVar = new C1184c();
            Drawable newDrawable = this.f5249a.newDrawable(resources);
            cVar.f5254b = newDrawable;
            newDrawable.setCallback(cVar.f5242h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1184c cVar = new C1184c();
            Drawable newDrawable = this.f5249a.newDrawable(resources, theme);
            cVar.f5254b = newDrawable;
            newDrawable.setCallback(cVar.f5242h);
            return cVar;
        }
    }

    C1184c() {
        this(null, null, null);
    }

    private C1184c(Context context) {
        this(context, null, null);
    }

    private C1184c(Context context, C1186b bVar, Resources resources) {
        this.f5239e = null;
        this.f5240f = null;
        this.f5241g = null;
        C1185a aVar = new C1185a();
        this.f5242h = aVar;
        this.f5238d = context;
        if (bVar != null) {
            this.f5237c = bVar;
        } else {
            this.f5237c = new C1186b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static C1184c m6429a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1184c cVar = new C1184c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: b */
    private void m6430b(String str, Animator animator) {
        animator.setTarget(this.f5237c.f5245b.mo5964d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m6431c(animator);
        }
        C1186b bVar = this.f5237c;
        if (bVar.f5247d == null) {
            bVar.f5247d = new ArrayList<>();
            this.f5237c.f5248e = new C0823a<>();
        }
        this.f5237c.f5247d.add(animator);
        this.f5237c.f5248e.put(animator, str);
    }

    /* renamed from: c */
    private void m6431c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m6431c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f5239e == null) {
                    this.f5239e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f5239e);
            }
        }
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1964a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            return C0398a.m1965b(drawable);
        }
        return false;
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5237c.f5245b.draw(canvas);
        if (this.f5237c.f5246c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5254b;
        return drawable != null ? C0398a.m1967d(drawable) : this.f5237c.f5245b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5237c.f5244a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5254b;
        return drawable != null ? C0398a.m1968e(drawable) : this.f5237c.f5245b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5254b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1187c(this.f5254b.getConstantState());
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5237c.f5245b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5237c.f5245b.getIntrinsicWidth();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getOpacity() : this.f5237c.f5245b.getOpacity();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1970g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5229e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1194i b = C1194i.m6461b(resources, resourceId, theme);
                        b.mo5973h(false);
                        b.setCallback(this.f5242h);
                        C1194i iVar = this.f5237c.f5245b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f5237c.f5245b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C1182a.f5230f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5238d;
                        if (context != null) {
                            m6430b(string, C1189e.m6443i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f5237c.mo5950a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5254b;
        return drawable != null ? C0398a.m1971h(drawable) : this.f5237c.f5245b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f5254b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5237c.f5246c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.isStateful() : this.f5237c.f5245b.isStateful();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5237c.f5245b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.setLevel(i) : this.f5237c.f5245b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.setState(iArr) : this.f5237c.f5245b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5237c.f5245b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1973j(drawable, z);
        } else {
            this.f5237c.f5245b.setAutoMirrored(z);
        }
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5237c.f5245b.setColorFilter(colorFilter);
        }
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1977n(drawable, i);
        } else {
            this.f5237c.f5245b.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1978o(drawable, colorStateList);
        } else {
            this.f5237c.f5245b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1979p(drawable, mode);
        } else {
            this.f5237c.f5245b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5237c.f5245b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5237c.f5246c.isStarted()) {
            this.f5237c.f5246c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5237c.f5246c.end();
        }
    }
}
