package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0398a;
import androidx.core.widget.C0412c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.i */
public class C0232i {

    /* renamed from: a */
    private final CompoundButton f1032a;

    /* renamed from: b */
    private ColorStateList f1033b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1034c = null;

    /* renamed from: d */
    private boolean f1035d = false;

    /* renamed from: e */
    private boolean f1036e = false;

    /* renamed from: f */
    private boolean f1037f;

    C0232i(CompoundButton compoundButton) {
        this.f1032a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1498a() {
        Drawable a = C0412c.m2077a(this.f1032a);
        if (a == null) {
            return;
        }
        if (this.f1035d || this.f1036e) {
            Drawable mutate = C0398a.m1981r(a).mutate();
            if (this.f1035d) {
                C0398a.m1978o(mutate, this.f1033b);
            }
            if (this.f1036e) {
                C0398a.m1979p(mutate, this.f1034c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1032a.getDrawableState());
            }
            this.f1032a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1499b(int i) {
        Drawable a;
        return (Build.VERSION.SDK_INT >= 17 || (a = C0412c.m2077a(this.f1032a)) == null) ? i : i + a.getIntrinsicWidth();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1500c() {
        return this.f1033b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1501d() {
        return this.f1034c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1502e(android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0232i.mo1502e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1503f() {
        if (this.f1037f) {
            this.f1037f = false;
            return;
        }
        this.f1037f = true;
        mo1498a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1504g(ColorStateList colorStateList) {
        this.f1033b = colorStateList;
        this.f1035d = true;
        mo1498a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1505h(PorterDuff.Mode mode) {
        this.f1034c = mode;
        this.f1036e = true;
        mo1498a();
    }
}
