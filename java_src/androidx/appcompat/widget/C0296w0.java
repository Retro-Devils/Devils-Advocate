package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p005c.C0390f;
import p006b.p007a.p008k.p009a.C0764a;

/* renamed from: androidx.appcompat.widget.w0 */
public class C0296w0 {

    /* renamed from: a */
    private final Context f1240a;

    /* renamed from: b */
    private final TypedArray f1241b;

    /* renamed from: c */
    private TypedValue f1242c;

    private C0296w0(Context context, TypedArray typedArray) {
        this.f1240a = context;
        this.f1241b = typedArray;
    }

    /* renamed from: t */
    public static C0296w0 m1430t(Context context, int i, int[] iArr) {
        return new C0296w0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0296w0 m1431u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0296w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0296w0 m1432v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0296w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo1804a(int i, boolean z) {
        return this.f1241b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo1805b(int i, int i2) {
        return this.f1241b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo1806c(int i) {
        int resourceId;
        ColorStateList c;
        return (!this.f1241b.hasValue(i) || (resourceId = this.f1241b.getResourceId(i, 0)) == 0 || (c = C0764a.m4516c(this.f1240a, resourceId)) == null) ? this.f1241b.getColorStateList(i) : c;
    }

    /* renamed from: d */
    public float mo1807d(int i, float f) {
        return this.f1241b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo1808e(int i, int i2) {
        return this.f1241b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo1809f(int i, int i2) {
        return this.f1241b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo1810g(int i) {
        int resourceId;
        return (!this.f1241b.hasValue(i) || (resourceId = this.f1241b.getResourceId(i, 0)) == 0) ? this.f1241b.getDrawable(i) : C0764a.m4517d(this.f1240a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo1811h(int i) {
        int resourceId;
        if (!this.f1241b.hasValue(i) || (resourceId = this.f1241b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0241j.m1243b().mo1547d(this.f1240a, resourceId, true);
    }

    /* renamed from: i */
    public float mo1812i(int i, float f) {
        return this.f1241b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo1813j(int i, int i2, C0390f.AbstractC0391a aVar) {
        int resourceId = this.f1241b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1242c == null) {
            this.f1242c = new TypedValue();
        }
        return C0390f.m1925c(this.f1240a, resourceId, this.f1242c, i2, aVar);
    }

    /* renamed from: k */
    public int mo1814k(int i, int i2) {
        return this.f1241b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo1815l(int i, int i2) {
        return this.f1241b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo1816m(int i, int i2) {
        return this.f1241b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo1817n(int i, int i2) {
        return this.f1241b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo1818o(int i) {
        return this.f1241b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo1819p(int i) {
        return this.f1241b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo1820q(int i) {
        return this.f1241b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo1821r() {
        return this.f1241b;
    }

    /* renamed from: s */
    public boolean mo1822s(int i) {
        return this.f1241b.hasValue(i);
    }

    /* renamed from: w */
    public void mo1823w() {
        this.f1241b.recycle();
    }
}
