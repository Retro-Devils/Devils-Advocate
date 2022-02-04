package p069c.p073b.p074a.p108c.p109a.p110f;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1499f;

/* renamed from: c.b.a.c.a.f.s */
public final class C1530s {

    /* renamed from: c.b.a.c.a.f.s$a */
    public static final class C1531a extends Exception {
        public C1531a(String str) {
            super(str);
        }

        public C1531a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    private static IBinder m7508a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return (IBinder) cls.getConstructor(IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE).newInstance(iBinder, iBinder2, iBinder3, Boolean.valueOf(z));
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new C1531a(name.length() != 0 ? "Could not find the right constructor for ".concat(name) : new String("Could not find the right constructor for "), e);
        } catch (InvocationTargetException e2) {
            String name2 = cls.getName();
            throw new C1531a(name2.length() != 0 ? "Exception thrown by invoked constructor in ".concat(name2) : new String("Exception thrown by invoked constructor in "), e2);
        } catch (InstantiationException e3) {
            String name3 = cls.getName();
            throw new C1531a(name3.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name3) : new String("Unable to instantiate the dynamic class "), e3);
        } catch (IllegalAccessException e4) {
            String name4 = cls.getName();
            throw new C1531a(name4.length() != 0 ? "Unable to call the default constructor of ".concat(name4) : new String("Unable to call the default constructor of "), e4);
        }
    }

    /* renamed from: b */
    private static IBinder m7509b(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return m7508a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (ClassNotFoundException e) {
            String valueOf = String.valueOf(str);
            throw new C1531a(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "), e);
        }
    }

    /* renamed from: c */
    public static AbstractC1499f m7510c(Activity activity, IBinder iBinder, boolean z) {
        C1494b.m7373a(activity);
        C1494b.m7373a(iBinder);
        Context c = C1534v.m7517c(activity);
        if (c != null) {
            return AbstractC1499f.AbstractBinderC1500a.m7401i(m7509b(c.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", BinderC1529r.m7506j(c).asBinder(), BinderC1529r.m7506j(activity).asBinder(), iBinder, z));
        }
        throw new C1531a("Could not create remote context");
    }
}
