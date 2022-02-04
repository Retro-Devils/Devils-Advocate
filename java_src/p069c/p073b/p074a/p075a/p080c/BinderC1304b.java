package p069c.p073b.p074a.p075a.p080c;

import android.os.IBinder;
import java.lang.reflect.Field;
import p069c.p073b.p074a.p075a.p080c.AbstractC1302a;

/* renamed from: c.b.a.a.c.b */
public final class BinderC1304b<T> extends AbstractC1302a.AbstractBinderC1303a {

    /* renamed from: a */
    private final T f5570a;

    private BinderC1304b(T t) {
        this.f5570a = t;
    }

    /* renamed from: j */
    public static <T> T m6822j(AbstractC1302a aVar) {
        if (aVar instanceof BinderC1304b) {
            return ((BinderC1304b) aVar).f5570a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    /* renamed from: m */
    public static <T> AbstractC1302a m6823m(T t) {
        return new BinderC1304b(t);
    }
}
