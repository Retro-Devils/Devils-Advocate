package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p021d.C0823a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class AbstractC0751a {

    /* renamed from: a */
    protected final C0823a<String, Method> f3552a;

    /* renamed from: b */
    protected final C0823a<String, Method> f3553b;

    /* renamed from: c */
    protected final C0823a<String, Class> f3554c;

    public AbstractC0751a(C0823a<String, Method> aVar, C0823a<String, Method> aVar2, C0823a<String, Class> aVar3) {
        this.f3552a = aVar;
        this.f3553b = aVar2;
        this.f3554c = aVar3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.versionedparcelable.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m4455N(AbstractC0753c cVar) {
        try {
            mo4527I(m4456c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m4456c(Class<? extends AbstractC0753c> cls) {
        Class cls2 = this.f3554c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f3554c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m4457d(String str) {
        Method method = this.f3552a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0751a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0751a.class);
        this.f3552a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m4458e(Class cls) {
        Method method = this.f3553b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m4456c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", cls, AbstractC0751a.class);
        this.f3553b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo4519A(byte[] bArr);

    /* renamed from: B */
    public void mo4520B(byte[] bArr, int i) {
        mo4551w(i);
        mo4519A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo4521C(CharSequence charSequence);

    /* renamed from: D */
    public void mo4522D(CharSequence charSequence, int i) {
        mo4551w(i);
        mo4521C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo4523E(int i);

    /* renamed from: F */
    public void mo4524F(int i, int i2) {
        mo4551w(i2);
        mo4523E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo4525G(Parcelable parcelable);

    /* renamed from: H */
    public void mo4526H(Parcelable parcelable, int i) {
        mo4551w(i);
        mo4525G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo4527I(String str);

    /* renamed from: J */
    public void mo4528J(String str, int i) {
        mo4551w(i);
        mo4527I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends AbstractC0753c> void mo4529K(T t, AbstractC0751a aVar) {
        try {
            m4458e(t.getClass()).invoke(null, t, aVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo4530L(AbstractC0753c cVar) {
        if (cVar == null) {
            mo4527I(null);
            return;
        }
        m4455N(cVar);
        AbstractC0751a b = mo4533b();
        mo4529K(cVar, b);
        b.mo4532a();
    }

    /* renamed from: M */
    public void mo4531M(AbstractC0753c cVar, int i) {
        mo4551w(i);
        mo4530L(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4532a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC0751a mo4533b();

    /* renamed from: f */
    public boolean mo4534f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo4535g();

    /* renamed from: h */
    public boolean mo4536h(boolean z, int i) {
        return !mo4541m(i) ? z : mo4535g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo4537i();

    /* renamed from: j */
    public byte[] mo4538j(byte[] bArr, int i) {
        return !mo4541m(i) ? bArr : mo4537i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo4539k();

    /* renamed from: l */
    public CharSequence mo4540l(CharSequence charSequence, int i) {
        return !mo4541m(i) ? charSequence : mo4539k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo4541m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends AbstractC0753c> T mo4542n(String str, AbstractC0751a aVar) {
        try {
            return (T) ((AbstractC0753c) m4457d(str).invoke(null, aVar));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo4543o();

    /* renamed from: p */
    public int mo4544p(int i, int i2) {
        return !mo4541m(i2) ? i : mo4543o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo4545q();

    /* renamed from: r */
    public <T extends Parcelable> T mo4546r(T t, int i) {
        return !mo4541m(i) ? t : (T) mo4545q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo4547s();

    /* renamed from: t */
    public String mo4548t(String str, int i) {
        return !mo4541m(i) ? str : mo4547s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends AbstractC0753c> T mo4549u() {
        String s = mo4547s();
        if (s == null) {
            return null;
        }
        return (T) mo4542n(s, mo4533b());
    }

    /* renamed from: v */
    public <T extends AbstractC0753c> T mo4550v(T t, int i) {
        return !mo4541m(i) ? t : (T) mo4549u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo4551w(int i);

    /* renamed from: x */
    public void mo4552x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo4553y(boolean z);

    /* renamed from: z */
    public void mo4554z(boolean z, int i) {
        mo4551w(i);
        mo4553y(z);
    }
}
