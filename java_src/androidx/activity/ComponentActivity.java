package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.ActivityC0361e;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;
import androidx.lifecycle.AbstractC0636s;
import androidx.lifecycle.C0620h;
import androidx.lifecycle.C0635r;
import androidx.lifecycle.FragmentC0629o;
import androidx.savedstate.AbstractC0749b;
import androidx.savedstate.C0748a;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends ActivityC0361e implements AbstractC0619g, AbstractC0636s, AbstractC0749b, AbstractC0050c {

    /* renamed from: d */
    private final C0620h f83d = new C0620h(this);

    /* renamed from: e */
    private final C0748a f84e = C0748a.m4448a(this);

    /* renamed from: f */
    private C0635r f85f;

    /* renamed from: g */
    private final OnBackPressedDispatcher f86g = new OnBackPressedDispatcher(new RunnableC0045a());

    /* renamed from: h */
    private int f87h;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class RunnableC0045a implements Runnable {
        RunnableC0045a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$b */
    public static final class C0046b {

        /* renamed from: a */
        Object f91a;

        /* renamed from: b */
        C0635r f92b;

        C0046b() {
        }
    }

    public ComponentActivity() {
        if (mo140n() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                mo140n().mo3664a(new AbstractC0617e() {
                    /* class androidx.activity.ComponentActivity.C00432 */

                    @Override // androidx.lifecycle.AbstractC0617e
                    /* renamed from: d */
                    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
                        if (aVar == AbstractC0614d.EnumC0615a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo140n().mo3664a(new AbstractC0617e() {
                /* class androidx.activity.ComponentActivity.C00443 */

                @Override // androidx.lifecycle.AbstractC0617e
                /* renamed from: d */
                public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
                    if (aVar == AbstractC0614d.EnumC0615a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo139Y().mo3687a();
                    }
                }
            });
            if (19 <= i && i <= 23) {
                mo140n().mo3664a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // androidx.lifecycle.AbstractC0636s
    /* renamed from: Y */
    public C0635r mo139Y() {
        if (getApplication() != null) {
            if (this.f85f == null) {
                C0046b bVar = (C0046b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f85f = bVar.f92b;
                }
                if (this.f85f == null) {
                    this.f85f = new C0635r();
                }
            }
            return this.f85f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.lifecycle.AbstractC0619g
    /* renamed from: n */
    public AbstractC0614d mo140n() {
        return this.f83d;
    }

    public void onBackPressed() {
        this.f86g.mo152c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0361e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f84e.mo4511c(bundle);
        FragmentC0629o.m3284e(this);
        int i = this.f87h;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0046b bVar;
        Object y0 = mo147y0();
        C0635r rVar = this.f85f;
        if (rVar == null && (bVar = (C0046b) getLastNonConfigurationInstance()) != null) {
            rVar = bVar.f92b;
        }
        if (rVar == null && y0 == null) {
            return null;
        }
        C0046b bVar2 = new C0046b();
        bVar2.f91a = y0;
        bVar2.f92b = rVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0361e
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0614d n = mo140n();
        if (n instanceof C0620h) {
            ((C0620h) n).mo3670p(AbstractC0614d.EnumC0616b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f84e.mo4512d(bundle);
    }

    @Override // androidx.activity.AbstractC0050c
    /* renamed from: s */
    public final OnBackPressedDispatcher mo145s() {
        return this.f86g;
    }

    @Override // androidx.savedstate.AbstractC0749b
    /* renamed from: t */
    public final SavedStateRegistry mo146t() {
        return this.f84e.mo4510b();
    }

    @Deprecated
    /* renamed from: y0 */
    public Object mo147y0() {
        return null;
    }
}
