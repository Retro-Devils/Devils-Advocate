package p006b.p060q;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: b.q.f */
class C1125f {
    /* renamed from: a */
    static <T> ObjectAnimator m6217a(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C1129h(property, path), 0.0f, 1.0f);
    }
}
