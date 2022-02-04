package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.view.menu.AbstractC0145m;
import p006b.p007a.C0760g;

/* renamed from: androidx.appcompat.view.menu.h */
class DialogInterface$OnKeyListenerC0133h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, AbstractC0145m.AbstractC0146a {

    /* renamed from: b */
    private C0130g f563b;

    /* renamed from: c */
    private DialogInterfaceC0068b f564c;

    /* renamed from: d */
    C0127e f565d;

    /* renamed from: e */
    private AbstractC0145m.AbstractC0146a f566e;

    public DialogInterface$OnKeyListenerC0133h(C0130g gVar) {
        this.f563b = gVar;
    }

    /* renamed from: a */
    public void mo687a() {
        DialogInterfaceC0068b bVar = this.f564c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
    /* renamed from: b */
    public void mo347b(C0130g gVar, boolean z) {
        if (z || gVar == this.f563b) {
            mo687a();
        }
        AbstractC0145m.AbstractC0146a aVar = this.f566e;
        if (aVar != null) {
            aVar.mo347b(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
    /* renamed from: c */
    public boolean mo348c(C0130g gVar) {
        AbstractC0145m.AbstractC0146a aVar = this.f566e;
        if (aVar != null) {
            return aVar.mo348c(gVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo688d(IBinder iBinder) {
        C0130g gVar = this.f563b;
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(gVar.mo683w());
        C0127e eVar = new C0127e(aVar.mo222b(), C0760g.abc_list_menu_item_layout);
        this.f565d = eVar;
        eVar.mo550k(this);
        this.f563b.mo645b(this.f565d);
        aVar.mo223c(this.f565d.mo590a(), this);
        View A = gVar.mo611A();
        if (A != null) {
            aVar.mo225e(A);
        } else {
            aVar.mo226f(gVar.mo685y()).mo239s(gVar.mo686z());
        }
        aVar.mo234n(this);
        DialogInterfaceC0068b a = aVar.mo221a();
        this.f564c = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f564c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f564c.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f563b.mo623N((C0134i) this.f565d.mo590a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f565d.mo544b(this.f563b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f564c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f564c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f563b.mo654e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f563b.performShortcut(i, keyEvent, 0);
    }
}
