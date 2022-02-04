package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;
import java.util.Map;
import p006b.p015b.p016a.p018b.C0805b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C0805b<String, AbstractC0747b> f3544a = new C0805b<>();

    /* renamed from: b */
    private Bundle f3545b;

    /* renamed from: c */
    private boolean f3546c;

    /* renamed from: d */
    boolean f3547d = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface AbstractC0746a {
        /* renamed from: a */
        void mo4508a(AbstractC0749b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface AbstractC0747b {
        /* renamed from: a */
        Bundle mo4509a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo4505a(String str) {
        if (this.f3546c) {
            Bundle bundle = this.f3545b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f3545b.remove(str);
            if (this.f3545b.isEmpty()) {
                this.f3545b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4506b(AbstractC0614d dVar, Bundle bundle) {
        if (!this.f3546c) {
            if (bundle != null) {
                this.f3545b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            dVar.mo3664a(new AbstractC0617e() {
                /* class androidx.savedstate.SavedStateRegistry.C07451 */

                @Override // androidx.lifecycle.AbstractC0617e
                /* renamed from: d */
                public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == AbstractC0614d.EnumC0615a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar == AbstractC0614d.EnumC0615a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f3547d = z;
                }
            });
            this.f3546c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4507c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3545b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0805b<K, V>.C0809d d = this.f3544a.mo4761d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            bundle2.putBundle((String) entry.getKey(), ((AbstractC0747b) entry.getValue()).mo4509a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
