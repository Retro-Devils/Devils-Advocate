package p069c.p073b.p074a.p090b.p105x;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: c.b.a.b.x.b */
public class C1446b {

    /* renamed from: a */
    public static final boolean f6096a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f6097b = {16842919};

    /* renamed from: c */
    private static final int[] f6098c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f6099d = {16842908};

    /* renamed from: e */
    private static final int[] f6100e = {16843623};

    /* renamed from: f */
    private static final int[] f6101f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f6102g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f6103h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f6104i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f6105j = {16842913};

    /* renamed from: k */
    private static final int[] f6106k = {16842910, 16842919};

    /* renamed from: l */
    static final String f6107l = C1446b.class.getSimpleName();

    private C1446b() {
    }

    /* renamed from: a */
    public static ColorStateList m7103a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f6106k, 0)) != 0) {
            Log.w(f6107l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m7104b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
