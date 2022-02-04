package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.AbstractC0213c0;
import androidx.appcompat.widget.C0299x0;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0333i;
import java.util.ArrayList;
import p006b.p007a.p014o.Window$CallbackC0797i;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.j */
public class C0102j extends AbstractC0064a {

    /* renamed from: a */
    AbstractC0213c0 f348a;

    /* renamed from: b */
    boolean f349b;

    /* renamed from: c */
    Window.Callback f350c;

    /* renamed from: d */
    private boolean f351d;

    /* renamed from: e */
    private boolean f352e;

    /* renamed from: f */
    private ArrayList<AbstractC0064a.AbstractC0066b> f353f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f354g = new RunnableC0103a();

    /* renamed from: h */
    private final Toolbar.AbstractC0192f f355h;

    /* renamed from: androidx.appcompat.app.j$a */
    class RunnableC0103a implements Runnable {
        RunnableC0103a() {
        }

        public void run() {
            C0102j.this.mo410z();
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    class C0104b implements Toolbar.AbstractC0192f {
        C0104b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.AbstractC0192f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0102j.this.f350c.onMenuItemSelected(0, menuItem);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.j$c */
    public final class C0105c implements AbstractC0145m.AbstractC0146a {

        /* renamed from: b */
        private boolean f358b;

        C0105c() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: b */
        public void mo347b(C0130g gVar, boolean z) {
            if (!this.f358b) {
                this.f358b = true;
                C0102j.this.f348a.mo1350h();
                Window.Callback callback = C0102j.this.f350c;
                if (callback != null) {
                    callback.onPanelClosed(C0333i.f1724Z0, gVar);
                }
                this.f358b = false;
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: c */
        public boolean mo348c(C0130g gVar) {
            Window.Callback callback = C0102j.this.f350c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(C0333i.f1724Z0, gVar);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.j$d */
    public final class C0106d implements C0130g.AbstractC0131a {
        C0106d() {
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: a */
        public boolean mo320a(C0130g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: b */
        public void mo322b(C0130g gVar) {
            C0102j jVar = C0102j.this;
            if (jVar.f350c == null) {
                return;
            }
            if (jVar.f348a.mo1343c()) {
                C0102j.this.f350c.onPanelClosed(C0333i.f1724Z0, gVar);
            } else if (C0102j.this.f350c.onPreparePanel(0, null, gVar)) {
                C0102j.this.f350c.onMenuOpened(C0333i.f1724Z0, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.j$e */
    private class C0107e extends Window$CallbackC0797i {
        public C0107e(Window.Callback callback) {
            super(callback);
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0102j.this.f348a.mo1359q()) : super.onCreatePanelView(i);
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0102j jVar = C0102j.this;
                if (!jVar.f349b) {
                    jVar.f348a.mo1347f();
                    C0102j.this.f349b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0102j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0104b bVar = new C0104b();
        this.f355h = bVar;
        this.f348a = new C0299x0(toolbar, false);
        C0107e eVar = new C0107e(callback);
        this.f350c = eVar;
        this.f348a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f348a.setWindowTitle(charSequence);
    }

    /* renamed from: x */
    private Menu m458x() {
        if (!this.f351d) {
            this.f348a.mo1351i(new C0105c(), new C0106d());
            this.f351d = true;
        }
        return this.f348a.mo1354l();
    }

    /* renamed from: A */
    public void mo408A(int i, int i2) {
        this.f348a.mo1370x((i & i2) | ((i2 ^ -1) & this.f348a.mo1352j()));
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: g */
    public boolean mo192g() {
        return this.f348a.mo1345d();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: h */
    public boolean mo193h() {
        if (!this.f348a.mo1367u()) {
            return false;
        }
        this.f348a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: i */
    public void mo194i(boolean z) {
        if (z != this.f352e) {
            this.f352e = z;
            int size = this.f353f.size();
            for (int i = 0; i < size; i++) {
                this.f353f.get(i).mo209a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: j */
    public int mo195j() {
        return this.f348a.mo1352j();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: k */
    public Context mo196k() {
        return this.f348a.mo1359q();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: l */
    public boolean mo197l() {
        this.f348a.mo1357o().removeCallbacks(this.f354g);
        C1013s.m5750a0(this.f348a.mo1357o(), this.f354g);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: m */
    public void mo198m(Configuration configuration) {
        super.mo198m(configuration);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: n */
    public void mo199n() {
        this.f348a.mo1357o().removeCallbacks(this.f354g);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: o */
    public boolean mo200o(int i, KeyEvent keyEvent) {
        Menu x = m458x();
        if (x == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        x.setQwertyMode(z);
        return x.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: p */
    public boolean mo201p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo202q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: q */
    public boolean mo202q() {
        return this.f348a.mo1346e();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: r */
    public void mo203r(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: s */
    public void mo204s(boolean z) {
        mo408A(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: t */
    public void mo205t(int i) {
        this.f348a.mo1371y(i);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: u */
    public void mo206u(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: v */
    public void mo207v(CharSequence charSequence) {
        this.f348a.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public Window.Callback mo409y() {
        return this.f350c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo410z() {
        Menu x = m458x();
        C0130g gVar = x instanceof C0130g ? (C0130g) x : null;
        if (gVar != null) {
            gVar.mo661h0();
        }
        try {
            x.clear();
            if (!this.f350c.onCreatePanelMenu(0, x) || !this.f350c.onPreparePanel(0, null, x)) {
                x.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo658g0();
            }
        }
    }
}
