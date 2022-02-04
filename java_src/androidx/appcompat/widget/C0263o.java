package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.AbstractC0422l;
import p006b.p030g.p039k.AbstractC1012r;

/* renamed from: androidx.appcompat.widget.o */
public class C0263o extends ImageView implements AbstractC1012r, AbstractC0422l {

    /* renamed from: b */
    private final C0218e f1123b;

    /* renamed from: c */
    private final C0261n f1124c;

    public C0263o(Context context) {
        this(context, null);
    }

    public C0263o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0263o(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0218e eVar = new C0218e(this);
        this.f1123b = eVar;
        eVar.mo1386e(attributeSet, i);
        C0261n nVar = new C0261n(this);
        this.f1124c = nVar;
        nVar.mo1604f(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            eVar.mo1383b();
        }
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1600b();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0422l
    public ColorStateList getSupportImageTintList() {
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            return nVar.mo1601c();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0422l
    public PorterDuff.Mode getSupportImageTintMode() {
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            return nVar.mo1602d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1124c.mo1603e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1600b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1600b();
        }
    }

    public void setImageResource(int i) {
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1605g(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1600b();
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f1123b;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0422l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1606h(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0422l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0261n nVar = this.f1124c;
        if (nVar != null) {
            nVar.mo1607i(mode);
        }
    }
}
