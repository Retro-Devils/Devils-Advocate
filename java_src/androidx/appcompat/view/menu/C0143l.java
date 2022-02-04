package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0145m;
import p006b.p007a.C0757d;
import p006b.p030g.p039k.C0997d;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0143l {

    /* renamed from: a */
    private final Context f611a;

    /* renamed from: b */
    private final C0130g f612b;

    /* renamed from: c */
    private final boolean f613c;

    /* renamed from: d */
    private final int f614d;

    /* renamed from: e */
    private final int f615e;

    /* renamed from: f */
    private View f616f;

    /* renamed from: g */
    private int f617g;

    /* renamed from: h */
    private boolean f618h;

    /* renamed from: i */
    private AbstractC0145m.AbstractC0146a f619i;

    /* renamed from: j */
    private AbstractC0142k f620j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f621k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f622l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0144a implements PopupWindow.OnDismissListener {
        C0144a() {
        }

        public void onDismiss() {
            C0143l.this.mo827e();
        }
    }

    public C0143l(Context context, C0130g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0143l(Context context, C0130g gVar, View view, boolean z, int i, int i2) {
        this.f617g = 8388611;
        this.f622l = new C0144a();
        this.f611a = context;
        this.f612b = gVar;
        this.f616f = view;
        this.f613c = z;
        this.f614d = i;
        this.f615e = i2;
    }

    /* renamed from: a */
    private AbstractC0142k m768a() {
        Display defaultDisplay = ((WindowManager) this.f611a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0142k dVar = Math.min(point.x, point.y) >= this.f611a.getResources().getDimensionPixelSize(C0757d.abc_cascading_menus_min_smallest_width) ? new View$OnKeyListenerC0121d(this.f611a, this.f616f, this.f614d, this.f615e, this.f613c) : new View$OnKeyListenerC0151q(this.f611a, this.f612b, this.f616f, this.f614d, this.f615e, this.f613c);
        dVar.mo572o(this.f612b);
        dVar.mo580x(this.f622l);
        dVar.mo576s(this.f616f);
        dVar.mo550k(this.f619i);
        dVar.mo577u(this.f618h);
        dVar.mo578v(this.f617g);
        return dVar;
    }

    /* renamed from: l */
    private void m769l(int i, int i2, boolean z, boolean z2) {
        AbstractC0142k c = mo825c();
        c.mo581y(z2);
        if (z) {
            if ((C0997d.m5669b(this.f617g, C1013s.m5797y(this.f616f)) & 7) == 5) {
                i -= this.f616f.getWidth();
            }
            c.mo579w(i);
            c.mo582z(i2);
            int i3 = (int) ((this.f611a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo823t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo565a();
    }

    /* renamed from: b */
    public void mo824b() {
        if (mo826d()) {
            this.f620j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0142k mo825c() {
        if (this.f620j == null) {
            this.f620j = m768a();
        }
        return this.f620j;
    }

    /* renamed from: d */
    public boolean mo826d() {
        AbstractC0142k kVar = this.f620j;
        return kVar != null && kVar.mo566c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo827e() {
        this.f620j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f621k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo828f(View view) {
        this.f616f = view;
    }

    /* renamed from: g */
    public void mo829g(boolean z) {
        this.f618h = z;
        AbstractC0142k kVar = this.f620j;
        if (kVar != null) {
            kVar.mo577u(z);
        }
    }

    /* renamed from: h */
    public void mo830h(int i) {
        this.f617g = i;
    }

    /* renamed from: i */
    public void mo831i(PopupWindow.OnDismissListener onDismissListener) {
        this.f621k = onDismissListener;
    }

    /* renamed from: j */
    public void mo832j(AbstractC0145m.AbstractC0146a aVar) {
        this.f619i = aVar;
        AbstractC0142k kVar = this.f620j;
        if (kVar != null) {
            kVar.mo550k(aVar);
        }
    }

    /* renamed from: k */
    public void mo833k() {
        if (!mo834m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo834m() {
        if (mo826d()) {
            return true;
        }
        if (this.f616f == null) {
            return false;
        }
        m769l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo835n(int i, int i2) {
        if (mo826d()) {
            return true;
        }
        if (this.f616f == null) {
            return false;
        }
        m769l(i, i2, true, true);
        return true;
    }
}
