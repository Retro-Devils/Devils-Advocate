package p006b.p030g.p039k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: b.g.k.b */
public abstract class AbstractC0974b {

    /* renamed from: a */
    private final Context f4680a;

    /* renamed from: b */
    private AbstractC0975a f4681b;

    /* renamed from: c */
    private AbstractC0976b f4682c;

    /* renamed from: b.g.k.b$a */
    public interface AbstractC0975a {
    }

    /* renamed from: b.g.k.b$b */
    public interface AbstractC0976b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0974b(Context context) {
        this.f4680a = context;
    }

    /* renamed from: a */
    public boolean mo806a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo810b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo807c();

    /* renamed from: d */
    public View mo811d(MenuItem menuItem) {
        return mo807c();
    }

    /* renamed from: e */
    public boolean mo808e() {
        return false;
    }

    /* renamed from: f */
    public void mo809f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo812g() {
        return false;
    }

    /* renamed from: h */
    public void mo5444h() {
        this.f4682c = null;
        this.f4681b = null;
    }

    /* renamed from: i */
    public void mo5445i(AbstractC0975a aVar) {
        this.f4681b = aVar;
    }

    /* renamed from: j */
    public void mo813j(AbstractC0976b bVar) {
        if (!(this.f4682c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4682c = bVar;
    }
}
