package p069c.p073b.p074a.p108c.p109a.p110f;

import android.os.IBinder;
import java.lang.reflect.Field;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1526q;

/* renamed from: c.b.a.c.a.f.r */
public final class BinderC1529r<T> extends AbstractC1526q.AbstractBinderC1527a {

    /* renamed from: a */
    private final T f6331a;

    private BinderC1529r(T t) {
        this.f6331a = t;
    }

    /* renamed from: j */
    public static <T> AbstractC1526q m7506j(T t) {
        return new BinderC1529r(t);
    }

    /* renamed from: m */
    public static <T> T m7507m(AbstractC1526q qVar) {
        if (qVar instanceof BinderC1529r) {
            return ((BinderC1529r) qVar).f6331a;
        }
        IBinder asBinder = qVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
