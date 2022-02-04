package p006b.p030g.p031d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.d.h */
public class C0910h extends C0909g {
    /* access modifiers changed from: protected */
    @Override // p006b.p030g.p031d.C0909g
    /* renamed from: l */
    public Typeface mo5309l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4544g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4550m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p030g.p031d.C0909g
    /* renamed from: x */
    public Method mo5313x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
