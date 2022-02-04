package p069c.p073b.p074a.p090b.p104w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0296w0;
import p006b.p007a.p008k.p009a.C0764a;

/* renamed from: c.b.a.b.w.c */
public class C1437c {
    /* renamed from: a */
    public static ColorStateList m7077a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = C0764a.m4516c(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) ? typedArray.getColorStateList(i) : ColorStateList.valueOf(color) : c;
    }

    /* renamed from: b */
    public static ColorStateList m7078b(Context context, C0296w0 w0Var, int i) {
        int b;
        int n;
        ColorStateList c;
        return (!w0Var.mo1822s(i) || (n = w0Var.mo1817n(i, 0)) == 0 || (c = C0764a.m4516c(context, n)) == null) ? (Build.VERSION.SDK_INT > 15 || (b = w0Var.mo1805b(i, -1)) == -1) ? w0Var.mo1806c(i) : ColorStateList.valueOf(b) : c;
    }

    /* renamed from: c */
    public static int m7079c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m7080d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = C0764a.m4517d(context, resourceId)) == null) ? typedArray.getDrawable(i) : d;
    }

    /* renamed from: e */
    static int m7081e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C1438d m7082f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C1438d(context, resourceId);
    }
}
