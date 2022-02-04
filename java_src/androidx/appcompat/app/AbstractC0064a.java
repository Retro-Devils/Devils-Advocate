package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p006b.p007a.C0763j;
import p006b.p007a.p014o.AbstractC0785b;

/* renamed from: androidx.appcompat.app.a */
public abstract class AbstractC0064a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0065a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f223a;

        public C0065a(int i, int i2) {
            super(i, i2);
            this.f223a = 0;
            this.f223a = 8388627;
        }

        public C0065a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f223a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3797t);
            this.f223a = obtainStyledAttributes.getInt(C0763j.f3802u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0065a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f223a = 0;
        }

        public C0065a(C0065a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f223a = 0;
            this.f223a = aVar.f223a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface AbstractC0066b {
        /* renamed from: a */
        void mo209a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class AbstractC0067c {
        /* renamed from: a */
        public abstract CharSequence mo210a();

        /* renamed from: b */
        public abstract View mo211b();

        /* renamed from: c */
        public abstract Drawable mo212c();

        /* renamed from: d */
        public abstract CharSequence mo213d();

        /* renamed from: e */
        public abstract void mo214e();
    }

    /* renamed from: g */
    public boolean mo192g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo193h();

    /* renamed from: i */
    public abstract void mo194i(boolean z);

    /* renamed from: j */
    public abstract int mo195j();

    /* renamed from: k */
    public abstract Context mo196k();

    /* renamed from: l */
    public boolean mo197l() {
        return false;
    }

    /* renamed from: m */
    public void mo198m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo199n() {
    }

    /* renamed from: o */
    public abstract boolean mo200o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo201p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo202q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo203r(boolean z);

    /* renamed from: s */
    public abstract void mo204s(boolean z);

    /* renamed from: t */
    public abstract void mo205t(int i);

    /* renamed from: u */
    public abstract void mo206u(boolean z);

    /* renamed from: v */
    public abstract void mo207v(CharSequence charSequence);

    /* renamed from: w */
    public AbstractC0785b mo208w(AbstractC0785b.AbstractC0786a aVar) {
        return null;
    }
}
