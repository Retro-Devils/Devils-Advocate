package p069c.p073b.p074a.p090b.p092l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: c.b.a.b.l.e */
public class C1405e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f6021a = new C1405e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f6022b = new WeakHashMap<>();

    private C1405e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f6022b.containsKey(drawable)) {
            return this.f6022b.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f6022b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
