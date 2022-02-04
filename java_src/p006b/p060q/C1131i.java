package p006b.p060q;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: b.q.i */
class C1131i {
    /* renamed from: a */
    static PropertyValuesHolder m6229a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C1129h(property, path), 0.0f, 1.0f);
    }
}
