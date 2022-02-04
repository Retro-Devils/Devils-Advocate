package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
public final class Recreator implements AbstractC0617e {

    /* renamed from: a */
    private final AbstractC0749b f3543a;

    Recreator(AbstractC0749b bVar) {
        this.f3543a = bVar;
    }

    /* renamed from: h */
    private void m4440h(String str) {
        Class cls;
        try {
            try {
                Constructor<? extends U> declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AbstractC0746a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.AbstractC0746a) declaredConstructor.newInstance(new Object[0])).mo4508a(this.f3543a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.AbstractC0617e
    /* renamed from: d */
    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
        if (aVar == AbstractC0614d.EnumC0615a.ON_CREATE) {
            gVar.mo140n().mo3666c(this);
            Bundle a = this.f3543a.mo146t().mo4505a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m4440h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
