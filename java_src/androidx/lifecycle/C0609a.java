package androidx.lifecycle;

import androidx.lifecycle.AbstractC0614d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
class C0609a {

    /* renamed from: a */
    static C0609a f3019a = new C0609a();

    /* renamed from: b */
    private final Map<Class, C0610a> f3020b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f3021c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    public static class C0610a {

        /* renamed from: a */
        final Map<AbstractC0614d.EnumC0615a, List<C0611b>> f3022a = new HashMap();

        /* renamed from: b */
        final Map<C0611b, AbstractC0614d.EnumC0615a> f3023b;

        C0610a(Map<C0611b, AbstractC0614d.EnumC0615a> map) {
            this.f3023b = map;
            for (Map.Entry<C0611b, AbstractC0614d.EnumC0615a> entry : map.entrySet()) {
                AbstractC0614d.EnumC0615a value = entry.getValue();
                List<C0611b> list = this.f3022a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3022a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m3235b(List<C0611b> list, AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3654a(gVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3653a(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar, Object obj) {
            m3235b(this.f3022a.get(aVar), gVar, aVar, obj);
            m3235b(this.f3022a.get(AbstractC0614d.EnumC0615a.ON_ANY), gVar, aVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    public static class C0611b {

        /* renamed from: a */
        final int f3024a;

        /* renamed from: b */
        final Method f3025b;

        C0611b(int i, Method method) {
            this.f3024a = i;
            this.f3025b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3654a(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar, Object obj) {
            try {
                int i = this.f3024a;
                if (i == 0) {
                    this.f3025b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3025b.invoke(obj, gVar);
                } else if (i == 2) {
                    this.f3025b.invoke(obj, gVar, aVar);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0611b.class != obj.getClass()) {
                return false;
            }
            C0611b bVar = (C0611b) obj;
            return this.f3024a == bVar.f3024a && this.f3025b.getName().equals(bVar.f3025b.getName());
        }

        public int hashCode() {
            return (this.f3024a * 31) + this.f3025b.getName().hashCode();
        }
    }

    C0609a() {
    }

    /* renamed from: a */
    private C0610a m3230a(Class cls, Method[] methodArr) {
        int i;
        C0610a c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo3651c(superclass)) == null)) {
            hashMap.putAll(c.f3023b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0611b, AbstractC0614d.EnumC0615a> entry : mo3651c(cls2).f3023b.entrySet()) {
                m3232e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3231b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            AbstractC0628n nVar = (AbstractC0628n) method.getAnnotation(AbstractC0628n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AbstractC0619g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AbstractC0614d.EnumC0615a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0614d.EnumC0615a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == AbstractC0614d.EnumC0615a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m3232e(hashMap, new C0611b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0610a aVar = new C0610a(hashMap);
        this.f3020b.put(cls, aVar);
        this.f3021c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m3231b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m3232e(Map<C0611b, AbstractC0614d.EnumC0615a> map, C0611b bVar, AbstractC0614d.EnumC0615a aVar, Class cls) {
        AbstractC0614d.EnumC0615a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3025b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0610a mo3651c(Class cls) {
        C0610a aVar = this.f3020b.get(cls);
        return aVar != null ? aVar : m3230a(cls, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3652d(Class cls) {
        Boolean bool = this.f3021c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m3231b(cls);
        for (Method method : b) {
            if (((AbstractC0628n) method.getAnnotation(AbstractC0628n.class)) != null) {
                m3230a(cls, b);
                return true;
            }
        }
        this.f3021c.put(cls, Boolean.FALSE);
        return false;
    }
}
