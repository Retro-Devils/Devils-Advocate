package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.appcompat.view.menu.C0127e;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.AbstractC0201b0;
import androidx.appcompat.widget.AbstractC0223f0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0202b1;
import androidx.appcompat.widget.C0214c1;
import androidx.appcompat.widget.C0241j;
import androidx.appcompat.widget.C0296w0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0333i;
import androidx.core.app.C0362f;
import androidx.core.content.C0378a;
import androidx.core.content.p005c.C0390f;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0619g;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p006b.p007a.C0754a;
import p006b.p007a.C0756c;
import p006b.p007a.C0759f;
import p006b.p007a.C0760g;
import p006b.p007a.C0762i;
import p006b.p007a.C0763j;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p007a.p014o.AbstractC0785b;
import p006b.p007a.p014o.C0788d;
import p006b.p007a.p014o.C0790f;
import p006b.p007a.p014o.C0792g;
import p006b.p007a.p014o.Window$CallbackC0797i;
import p006b.p021d.C0838i;
import p006b.p030g.p038j.C0956d;
import p006b.p030g.p039k.AbstractC1010p;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C0998e;
import p006b.p030g.p039k.C1000f;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1028w;
import p006b.p030g.p039k.C1033y;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.f */
public class LayoutInflater$Factory2C0073f extends AbstractC0072e implements C0130g.AbstractC0131a, LayoutInflater.Factory2 {

    /* renamed from: e */
    private static final C0838i<String, Integer> f232e = new C0838i<>();

    /* renamed from: f */
    private static final boolean f233f;

    /* renamed from: g */
    private static final int[] f234g = {16842836};

    /* renamed from: h */
    private static final boolean f235h = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: i */
    private static final boolean f236i;

    /* renamed from: j */
    private static boolean f237j = true;

    /* renamed from: A */
    private boolean f238A;

    /* renamed from: B */
    private boolean f239B;

    /* renamed from: C */
    ViewGroup f240C;

    /* renamed from: D */
    private TextView f241D;

    /* renamed from: E */
    private View f242E;

    /* renamed from: F */
    private boolean f243F;

    /* renamed from: G */
    private boolean f244G;

    /* renamed from: H */
    boolean f245H;

    /* renamed from: I */
    boolean f246I;

    /* renamed from: J */
    boolean f247J;

    /* renamed from: K */
    boolean f248K;

    /* renamed from: L */
    boolean f249L;

    /* renamed from: M */
    private boolean f250M;

    /* renamed from: N */
    private C0095s[] f251N;

    /* renamed from: O */
    private C0095s f252O;

    /* renamed from: P */
    private boolean f253P;

    /* renamed from: Q */
    private boolean f254Q;

    /* renamed from: R */
    private boolean f255R;

    /* renamed from: S */
    private boolean f256S;

    /* renamed from: T */
    boolean f257T;

    /* renamed from: U */
    private int f258U;

    /* renamed from: V */
    private int f259V;

    /* renamed from: W */
    private boolean f260W;

    /* renamed from: X */
    private boolean f261X;

    /* renamed from: Y */
    private AbstractC0087l f262Y;

    /* renamed from: Z */
    private AbstractC0087l f263Z;

    /* renamed from: a0 */
    boolean f264a0;

    /* renamed from: b0 */
    int f265b0;

    /* renamed from: c0 */
    private final Runnable f266c0;

    /* renamed from: d0 */
    private boolean f267d0;

    /* renamed from: e0 */
    private Rect f268e0;

    /* renamed from: f0 */
    private Rect f269f0;

    /* renamed from: g0 */
    private C0099h f270g0;

    /* renamed from: k */
    final Object f271k;

    /* renamed from: l */
    final Context f272l;

    /* renamed from: m */
    Window f273m;

    /* renamed from: n */
    private C0085j f274n;

    /* renamed from: o */
    final AbstractC0071d f275o;

    /* renamed from: p */
    AbstractC0064a f276p;

    /* renamed from: q */
    MenuInflater f277q;

    /* renamed from: r */
    private CharSequence f278r;

    /* renamed from: s */
    private AbstractC0201b0 f279s;

    /* renamed from: t */
    private C0082h f280t;

    /* renamed from: u */
    private C0096t f281u;

    /* renamed from: v */
    AbstractC0785b f282v;

    /* renamed from: w */
    ActionBarContextView f283w;

    /* renamed from: x */
    PopupWindow f284x;

    /* renamed from: y */
    Runnable f285y;

    /* renamed from: z */
    C1028w f286z;

    /* renamed from: androidx.appcompat.app.f$a */
    class C0074a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f287a;

        C0074a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f287a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m385a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m385a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f287a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f287a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    class RunnableC0075b implements Runnable {
        RunnableC0075b() {
        }

        public void run() {
            LayoutInflater$Factory2C0073f fVar = LayoutInflater$Factory2C0073f.this;
            if ((fVar.f265b0 & 1) != 0) {
                fVar.mo318W(0);
            }
            LayoutInflater$Factory2C0073f fVar2 = LayoutInflater$Factory2C0073f.this;
            if ((fVar2.f265b0 & 4096) != 0) {
                fVar2.mo318W(C0333i.f1724Z0);
            }
            LayoutInflater$Factory2C0073f fVar3 = LayoutInflater$Factory2C0073f.this;
            fVar3.f264a0 = false;
            fVar3.f265b0 = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$c */
    public class C0076c implements AbstractC1010p {
        C0076c() {
        }

        @Override // p006b.p030g.p039k.AbstractC1010p
        /* renamed from: a */
        public C0964a0 mo340a(View view, C0964a0 a0Var) {
            int h = a0Var.mo5418h();
            int N0 = LayoutInflater$Factory2C0073f.this.mo312N0(a0Var, null);
            if (h != N0) {
                a0Var = a0Var.mo5424n(a0Var.mo5416f(), N0, a0Var.mo5417g(), a0Var.mo5414e());
            }
            return C1013s.m5744V(view, a0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$d */
    public class C0077d implements AbstractC0223f0.AbstractC0224a {
        C0077d() {
        }

        @Override // androidx.appcompat.widget.AbstractC0223f0.AbstractC0224a
        /* renamed from: a */
        public void mo341a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0073f.this.mo312N0(null, rect);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$e */
    public class C0078e implements ContentFrameLayout.AbstractC0167a {
        C0078e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0167a
        /* renamed from: a */
        public void mo342a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0167a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0073f.this.mo316U();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$f */
    public class RunnableC0079f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class C0080a extends C1033y {
            C0080a() {
            }

            @Override // p006b.p030g.p039k.AbstractC1032x
            /* renamed from: a */
            public void mo345a(View view) {
                LayoutInflater$Factory2C0073f.this.f283w.setAlpha(1.0f);
                LayoutInflater$Factory2C0073f.this.f286z.mo5583f(null);
                LayoutInflater$Factory2C0073f.this.f286z = null;
            }

            @Override // p006b.p030g.p039k.C1033y, p006b.p030g.p039k.AbstractC1032x
            /* renamed from: b */
            public void mo346b(View view) {
                LayoutInflater$Factory2C0073f.this.f283w.setVisibility(0);
            }
        }

        RunnableC0079f() {
        }

        public void run() {
            LayoutInflater$Factory2C0073f fVar = LayoutInflater$Factory2C0073f.this;
            fVar.f284x.showAtLocation(fVar.f283w, 55, 0, 0);
            LayoutInflater$Factory2C0073f.this.mo319X();
            if (LayoutInflater$Factory2C0073f.this.mo306F0()) {
                LayoutInflater$Factory2C0073f.this.f283w.setAlpha(0.0f);
                LayoutInflater$Factory2C0073f fVar2 = LayoutInflater$Factory2C0073f.this;
                fVar2.f286z = C1013s.m5753c(fVar2.f283w).mo5578a(1.0f);
                LayoutInflater$Factory2C0073f.this.f286z.mo5583f(new C0080a());
                return;
            }
            LayoutInflater$Factory2C0073f.this.f283w.setAlpha(1.0f);
            LayoutInflater$Factory2C0073f.this.f283w.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$g */
    public class C0081g extends C1033y {
        C0081g() {
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: a */
        public void mo345a(View view) {
            LayoutInflater$Factory2C0073f.this.f283w.setAlpha(1.0f);
            LayoutInflater$Factory2C0073f.this.f286z.mo5583f(null);
            LayoutInflater$Factory2C0073f.this.f286z = null;
        }

        @Override // p006b.p030g.p039k.C1033y, p006b.p030g.p039k.AbstractC1032x
        /* renamed from: b */
        public void mo346b(View view) {
            LayoutInflater$Factory2C0073f.this.f283w.setVisibility(0);
            LayoutInflater$Factory2C0073f.this.f283w.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0073f.this.f283w.getParent() instanceof View) {
                C1013s.m5760f0((View) LayoutInflater$Factory2C0073f.this.f283w.getParent());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$h */
    public final class C0082h implements AbstractC0145m.AbstractC0146a {
        C0082h() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: b */
        public void mo347b(C0130g gVar, boolean z) {
            LayoutInflater$Factory2C0073f.this.mo311N(gVar);
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: c */
        public boolean mo348c(C0130g gVar) {
            Window.Callback h0 = LayoutInflater$Factory2C0073f.this.mo326h0();
            if (h0 == null) {
                return true;
            }
            h0.onMenuOpened(C0333i.f1724Z0, gVar);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$i */
    public class C0083i implements AbstractC0785b.AbstractC0786a {

        /* renamed from: a */
        private AbstractC0785b.AbstractC0786a f296a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        class C0084a extends C1033y {
            C0084a() {
            }

            @Override // p006b.p030g.p039k.AbstractC1032x
            /* renamed from: a */
            public void mo345a(View view) {
                LayoutInflater$Factory2C0073f.this.f283w.setVisibility(8);
                LayoutInflater$Factory2C0073f fVar = LayoutInflater$Factory2C0073f.this;
                PopupWindow popupWindow = fVar.f284x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f283w.getParent() instanceof View) {
                    C1013s.m5760f0((View) LayoutInflater$Factory2C0073f.this.f283w.getParent());
                }
                LayoutInflater$Factory2C0073f.this.f283w.removeAllViews();
                LayoutInflater$Factory2C0073f.this.f286z.mo5583f(null);
                LayoutInflater$Factory2C0073f fVar2 = LayoutInflater$Factory2C0073f.this;
                fVar2.f286z = null;
                C1013s.m5760f0(fVar2.f240C);
            }
        }

        public C0083i(AbstractC0785b.AbstractC0786a aVar) {
            this.f296a = aVar;
        }

        @Override // p006b.p007a.p014o.AbstractC0785b.AbstractC0786a
        /* renamed from: a */
        public boolean mo349a(AbstractC0785b bVar, Menu menu) {
            C1013s.m5760f0(LayoutInflater$Factory2C0073f.this.f240C);
            return this.f296a.mo349a(bVar, menu);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b.AbstractC0786a
        /* renamed from: b */
        public boolean mo350b(AbstractC0785b bVar, MenuItem menuItem) {
            return this.f296a.mo350b(bVar, menuItem);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b.AbstractC0786a
        /* renamed from: c */
        public boolean mo351c(AbstractC0785b bVar, Menu menu) {
            return this.f296a.mo351c(bVar, menu);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b.AbstractC0786a
        /* renamed from: d */
        public void mo352d(AbstractC0785b bVar) {
            this.f296a.mo352d(bVar);
            LayoutInflater$Factory2C0073f fVar = LayoutInflater$Factory2C0073f.this;
            if (fVar.f284x != null) {
                fVar.f273m.getDecorView().removeCallbacks(LayoutInflater$Factory2C0073f.this.f285y);
            }
            LayoutInflater$Factory2C0073f fVar2 = LayoutInflater$Factory2C0073f.this;
            if (fVar2.f283w != null) {
                fVar2.mo319X();
                LayoutInflater$Factory2C0073f fVar3 = LayoutInflater$Factory2C0073f.this;
                fVar3.f286z = C1013s.m5753c(fVar3.f283w).mo5578a(0.0f);
                LayoutInflater$Factory2C0073f.this.f286z.mo5583f(new C0084a());
            }
            LayoutInflater$Factory2C0073f fVar4 = LayoutInflater$Factory2C0073f.this;
            AbstractC0071d dVar = fVar4.f275o;
            if (dVar != null) {
                dVar.mo262l0(fVar4.f282v);
            }
            LayoutInflater$Factory2C0073f fVar5 = LayoutInflater$Factory2C0073f.this;
            fVar5.f282v = null;
            C1013s.m5760f0(fVar5.f240C);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$j */
    public class C0085j extends Window$CallbackC0797i {
        C0085j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final ActionMode mo353b(ActionMode.Callback callback) {
            C0790f.C0791a aVar = new C0790f.C0791a(LayoutInflater$Factory2C0073f.this.f272l, callback);
            AbstractC0785b H0 = LayoutInflater$Factory2C0073f.this.mo308H0(aVar);
            if (H0 != null) {
                return aVar.mo4714e(H0);
            }
            return null;
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0073f.this.mo317V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0073f.this.mo333t0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public void onContentChanged() {
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0130g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0073f.this.mo335w0(i);
            return true;
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0073f.this.mo336x0(i);
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0130g gVar = menu instanceof C0130g ? (C0130g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo655e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo655e0(false);
            }
            return onPreparePanel;
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0130g gVar;
            C0095s f0 = LayoutInflater$Factory2C0073f.this.mo324f0(0, true);
            if (f0 == null || (gVar = f0.f317j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflater$Factory2C0073f.this.mo327o0() ? mo353b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p006b.p007a.p014o.Window$CallbackC0797i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!LayoutInflater$Factory2C0073f.this.mo327o0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo353b(callback);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$k */
    public class C0086k extends AbstractC0087l {

        /* renamed from: c */
        private final PowerManager f300c;

        C0086k(Context context) {
            super();
            this.f300c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0073f.AbstractC0087l
        /* renamed from: b */
        public IntentFilter mo364b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0073f.AbstractC0087l
        /* renamed from: c */
        public int mo365c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f300c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0073f.AbstractC0087l
        /* renamed from: d */
        public void mo366d() {
            LayoutInflater$Factory2C0073f.this.mo307H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$l */
    public abstract class AbstractC0087l {

        /* renamed from: a */
        private BroadcastReceiver f302a;

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.f$l$a */
        public class C0088a extends BroadcastReceiver {
            C0088a() {
            }

            public void onReceive(Context context, Intent intent) {
                AbstractC0087l.this.mo366d();
            }
        }

        AbstractC0087l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo367a() {
            BroadcastReceiver broadcastReceiver = this.f302a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C0073f.this.f272l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f302a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo364b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo365c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo366d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo368e() {
            mo367a();
            IntentFilter b = mo364b();
            if (b != null && b.countActions() != 0) {
                if (this.f302a == null) {
                    this.f302a = new C0088a();
                }
                LayoutInflater$Factory2C0073f.this.f272l.registerReceiver(this.f302a, b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$m */
    public class C0089m extends AbstractC0087l {

        /* renamed from: c */
        private final C0109l f305c;

        C0089m(C0109l lVar) {
            super();
            this.f305c = lVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0073f.AbstractC0087l
        /* renamed from: b */
        public IntentFilter mo364b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0073f.AbstractC0087l
        /* renamed from: c */
        public int mo365c() {
            return this.f305c.mo415d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0073f.AbstractC0087l
        /* renamed from: d */
        public void mo366d() {
            LayoutInflater$Factory2C0073f.this.mo307H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$n */
    public static class C0090n {
        /* renamed from: a */
        static void m412a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$o */
    public static class C0091o {
        /* renamed from: a */
        static void m413a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$p */
    public static class C0092p {
        /* renamed from: a */
        static void m414a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$q */
    private static class C0093q {
        /* renamed from: a */
        static void m415a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$r */
    public class C0094r extends ContentFrameLayout {
        public C0094r(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m416c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0073f.this.mo317V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m416c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflater$Factory2C0073f.this.mo313P(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0764a.m4517d(getContext(), i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.f$s */
    public static final class C0095s {

        /* renamed from: a */
        int f308a;

        /* renamed from: b */
        int f309b;

        /* renamed from: c */
        int f310c;

        /* renamed from: d */
        int f311d;

        /* renamed from: e */
        int f312e;

        /* renamed from: f */
        int f313f;

        /* renamed from: g */
        ViewGroup f314g;

        /* renamed from: h */
        View f315h;

        /* renamed from: i */
        View f316i;

        /* renamed from: j */
        C0130g f317j;

        /* renamed from: k */
        C0127e f318k;

        /* renamed from: l */
        Context f319l;

        /* renamed from: m */
        boolean f320m;

        /* renamed from: n */
        boolean f321n;

        /* renamed from: o */
        boolean f322o;

        /* renamed from: p */
        public boolean f323p;

        /* renamed from: q */
        boolean f324q = false;

        /* renamed from: r */
        boolean f325r;

        /* renamed from: s */
        Bundle f326s;

        C0095s(int i) {
            this.f308a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC0147n mo373a(AbstractC0145m.AbstractC0146a aVar) {
            if (this.f317j == null) {
                return null;
            }
            if (this.f318k == null) {
                C0127e eVar = new C0127e(this.f319l, C0760g.abc_list_menu_item_layout);
                this.f318k = eVar;
                eVar.mo550k(aVar);
                this.f317j.mo645b(this.f318k);
            }
            return this.f318k.mo591c(this.f314g);
        }

        /* renamed from: b */
        public boolean mo374b() {
            if (this.f315h == null) {
                return false;
            }
            return this.f316i != null || this.f318k.mo590a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo375c(C0130g gVar) {
            C0127e eVar;
            C0130g gVar2 = this.f317j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo625Q(this.f318k);
                }
                this.f317j = gVar;
                if (gVar != null && (eVar = this.f318k) != null) {
                    gVar.mo645b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo376d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0754a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0754a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0762i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0788d dVar = new C0788d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f319l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0763j.f3828z0);
            this.f309b = obtainStyledAttributes.getResourceId(C0763j.f3584C0, 0);
            this.f313f = obtainStyledAttributes.getResourceId(C0763j.f3579B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$t */
    public final class C0096t implements AbstractC0145m.AbstractC0146a {
        C0096t() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: b */
        public void mo347b(C0130g gVar, boolean z) {
            C0130g F = gVar.mo615F();
            boolean z2 = F != gVar;
            LayoutInflater$Factory2C0073f fVar = LayoutInflater$Factory2C0073f.this;
            if (z2) {
                gVar = F;
            }
            C0095s a0 = fVar.mo321a0(gVar);
            if (a0 == null) {
                return;
            }
            if (z2) {
                LayoutInflater$Factory2C0073f.this.mo310M(a0.f308a, a0, F);
                LayoutInflater$Factory2C0073f.this.mo314Q(a0, true);
                return;
            }
            LayoutInflater$Factory2C0073f.this.mo314Q(a0, z);
        }

        @Override // androidx.appcompat.view.menu.AbstractC0145m.AbstractC0146a
        /* renamed from: c */
        public boolean mo348c(C0130g gVar) {
            Window.Callback h0;
            if (gVar != gVar.mo615F()) {
                return true;
            }
            LayoutInflater$Factory2C0073f fVar = LayoutInflater$Factory2C0073f.this;
            if (!fVar.f245H || (h0 = fVar.mo326h0()) == null || LayoutInflater$Factory2C0073f.this.f257T) {
                return true;
            }
            h0.onMenuOpened(C0333i.f1724Z0, gVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f233f = z2;
        if (i >= 17) {
            z = true;
        }
        f236i = z;
        if (z2 && !f237j) {
            Thread.setDefaultUncaughtExceptionHandler(new C0074a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    LayoutInflater$Factory2C0073f(Activity activity, AbstractC0071d dVar) {
        this(activity, null, dVar, activity);
    }

    LayoutInflater$Factory2C0073f(Dialog dialog, AbstractC0071d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private LayoutInflater$Factory2C0073f(Context context, Window window, AbstractC0071d dVar, Object obj) {
        C0838i<String, Integer> iVar;
        Integer num;
        ActivityC0070c K0;
        this.f286z = null;
        this.f238A = true;
        this.f258U = -100;
        this.f266c0 = new RunnableC0075b();
        this.f272l = context;
        this.f275o = dVar;
        this.f271k = obj;
        if (this.f258U == -100 && (obj instanceof Dialog) && (K0 = m309K0()) != null) {
            this.f258U = K0.mo242K0().mo291k();
        }
        if (this.f258U == -100 && (num = (iVar = f232e).get(obj.getClass().getName())) != null) {
            this.f258U = num.intValue();
            iVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            m308K(window);
        }
        C0241j.m1245h();
    }

    /* renamed from: B0 */
    private boolean m300B0(C0095s sVar, int i, KeyEvent keyEvent, int i2) {
        C0130g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f320m || m301C0(sVar, keyEvent)) && (gVar = sVar.f317j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f279s == null) {
            mo314Q(sVar, true);
        }
        return z;
    }

    /* renamed from: C0 */
    private boolean m301C0(C0095s sVar, KeyEvent keyEvent) {
        AbstractC0201b0 b0Var;
        AbstractC0201b0 b0Var2;
        AbstractC0201b0 b0Var3;
        if (this.f257T) {
            return false;
        }
        if (sVar.f320m) {
            return true;
        }
        C0095s sVar2 = this.f252O;
        if (!(sVar2 == null || sVar2 == sVar)) {
            mo314Q(sVar2, false);
        }
        Window.Callback h0 = mo326h0();
        if (h0 != null) {
            sVar.f316i = h0.onCreatePanelView(sVar.f308a);
        }
        int i = sVar.f308a;
        boolean z = i == 0 || i == 108;
        if (z && (b0Var3 = this.f279s) != null) {
            b0Var3.mo935f();
        }
        if (sVar.f316i == null && (!z || !(mo305A0() instanceof C0102j))) {
            C0130g gVar = sVar.f317j;
            if (gVar == null || sVar.f325r) {
                if (gVar == null && (!m325l0(sVar) || sVar.f317j == null)) {
                    return false;
                }
                if (z && this.f279s != null) {
                    if (this.f280t == null) {
                        this.f280t = new C0082h();
                    }
                    this.f279s.mo928a(sVar.f317j, this.f280t);
                }
                sVar.f317j.mo661h0();
                if (!h0.onCreatePanelMenu(sVar.f308a, sVar.f317j)) {
                    sVar.mo375c(null);
                    if (z && (b0Var2 = this.f279s) != null) {
                        b0Var2.mo928a(null, this.f280t);
                    }
                    return false;
                }
                sVar.f325r = false;
            }
            sVar.f317j.mo661h0();
            Bundle bundle = sVar.f326s;
            if (bundle != null) {
                sVar.f317j.mo626R(bundle);
                sVar.f326s = null;
            }
            if (!h0.onPreparePanel(0, sVar.f316i, sVar.f317j)) {
                if (z && (b0Var = this.f279s) != null) {
                    b0Var.mo928a(null, this.f280t);
                }
                sVar.f317j.mo658g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f323p = z2;
            sVar.f317j.setQwertyMode(z2);
            sVar.f317j.mo658g0();
        }
        sVar.f320m = true;
        sVar.f321n = false;
        this.f252O = sVar;
        return true;
    }

    /* renamed from: D0 */
    private void m302D0(boolean z) {
        AbstractC0201b0 b0Var = this.f279s;
        if (b0Var == null || !b0Var.mo937g() || (ViewConfiguration.get(this.f272l).hasPermanentMenuKey() && !this.f279s.mo929b())) {
            C0095s f0 = mo324f0(0, true);
            f0.f324q = true;
            mo314Q(f0, false);
            m330z0(f0, null);
            return;
        }
        Window.Callback h0 = mo326h0();
        if (this.f279s.mo930c() && z) {
            this.f279s.mo932d();
            if (!this.f257T) {
                h0.onPanelClosed(C0333i.f1724Z0, mo324f0(0, true).f317j);
            }
        } else if (h0 != null && !this.f257T) {
            if (this.f264a0 && (this.f265b0 & 1) != 0) {
                this.f273m.getDecorView().removeCallbacks(this.f266c0);
                this.f266c0.run();
            }
            C0095s f02 = mo324f0(0, true);
            C0130g gVar = f02.f317j;
            if (gVar != null && !f02.f325r && h0.onPreparePanel(0, f02.f316i, gVar)) {
                h0.onMenuOpened(C0333i.f1724Z0, f02.f317j);
                this.f279s.mo934e();
            }
        }
    }

    /* renamed from: E0 */
    private int m303E0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0333i.f1724Z0;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: G0 */
    private boolean m304G0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f273m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1013s.m5736N((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: I */
    private boolean m305I(boolean z) {
        if (this.f257T) {
            return false;
        }
        int L = m310L();
        boolean L0 = m311L0(mo330p0(this.f272l, L), z);
        if (L == 0) {
            m321e0(this.f272l).mo368e();
        } else {
            AbstractC0087l lVar = this.f262Y;
            if (lVar != null) {
                lVar.mo367a();
            }
        }
        if (L == 3) {
            m320d0(this.f272l).mo368e();
        } else {
            AbstractC0087l lVar2 = this.f263Z;
            if (lVar2 != null) {
                lVar2.mo367a();
            }
        }
        return L0;
    }

    /* renamed from: J */
    private void m306J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f240C.findViewById(16908290);
        View decorView = this.f273m.getDecorView();
        contentFrameLayout.mo1029b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f272l.obtainStyledAttributes(C0763j.f3828z0);
        obtainStyledAttributes.getValue(C0763j.f3629L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0763j.f3634M0, contentFrameLayout.getMinWidthMinor());
        int i = C0763j.f3619J0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C0763j.f3624K0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C0763j.f3609H0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C0763j.f3614I0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: J0 */
    private void m307J0() {
        if (this.f239B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: K */
    private void m308K(Window window) {
        if (this.f273m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0085j)) {
                C0085j jVar = new C0085j(callback);
                this.f274n = jVar;
                window.setCallback(jVar);
                C0296w0 u = C0296w0.m1431u(this.f272l, null, f234g);
                Drawable h = u.mo1811h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo1823w();
                this.f273m = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: K0 */
    private ActivityC0070c m309K0() {
        for (Context context = this.f272l; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0070c) {
                return (ActivityC0070c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: L */
    private int m310L() {
        int i = this.f258U;
        return i != -100 ? i : AbstractC0072e.m273j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m311L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f272l
            r1 = 0
            android.content.res.Configuration r0 = r6.m315R(r0, r7, r1)
            boolean r2 = r6.m327n0()
            android.content.Context r3 = r6.f272l
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f254Q
            if (r8 == 0) goto L_0x0047
            boolean r8 = androidx.appcompat.app.LayoutInflater$Factory2C0073f.f235h
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f255R
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f271k
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f271k
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0348a.m1778j(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m312M0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f271k
            boolean r0 = r8 instanceof androidx.appcompat.app.ActivityC0070c
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.ActivityC0070c) r8
            r8.mo245N0(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0073f.m311L0(int, boolean):boolean");
    }

    /* renamed from: M0 */
    private void m312M0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f272l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0101i.m453a(resources);
        }
        int i3 = this.f259V;
        if (i3 != 0) {
            this.f272l.setTheme(i3);
            if (i2 >= 23) {
                this.f272l.getTheme().applyStyle(this.f259V, true);
            }
        }
        if (z) {
            Object obj = this.f271k;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof AbstractC0619g) {
                    if (!((AbstractC0619g) activity).mo140n().mo3665b().mo3667a(AbstractC0614d.EnumC0616b.STARTED)) {
                        return;
                    }
                } else if (!this.f256S) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: O */
    private void m313O() {
        AbstractC0087l lVar = this.f262Y;
        if (lVar != null) {
            lVar.mo367a();
        }
        AbstractC0087l lVar2 = this.f263Z;
        if (lVar2 != null) {
            lVar2.mo367a();
        }
    }

    /* renamed from: O0 */
    private void m314O0(View view) {
        int i;
        Context context;
        if ((C1013s.m5730H(view) & 8192) != 0) {
            context = this.f272l;
            i = C0756c.abc_decor_view_status_guard_light;
        } else {
            context = this.f272l;
            i = C0756c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(C0378a.m1872b(context, i));
    }

    /* renamed from: R */
    private Configuration m315R(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: S */
    private ViewGroup m316S() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f272l.obtainStyledAttributes(C0763j.f3828z0);
        int i = C0763j.f3594E0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C0763j.f3639N0, false)) {
                mo304z(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo304z(C0333i.f1724Z0);
            }
            if (obtainStyledAttributes.getBoolean(C0763j.f3599F0, false)) {
                mo304z(109);
            }
            if (obtainStyledAttributes.getBoolean(C0763j.f3604G0, false)) {
                mo304z(10);
            }
            this.f248K = obtainStyledAttributes.getBoolean(C0763j.f3574A0, false);
            obtainStyledAttributes.recycle();
            m318Z();
            this.f273m.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f272l);
            if (this.f249L) {
                viewGroup = (ViewGroup) from.inflate(this.f247J ? C0760g.abc_screen_simple_overlay_action_mode : C0760g.abc_screen_simple, (ViewGroup) null);
            } else if (this.f248K) {
                viewGroup = (ViewGroup) from.inflate(C0760g.abc_dialog_title_material, (ViewGroup) null);
                this.f246I = false;
                this.f245H = false;
            } else if (this.f245H) {
                TypedValue typedValue = new TypedValue();
                this.f272l.getTheme().resolveAttribute(C0754a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0788d(this.f272l, typedValue.resourceId) : this.f272l).inflate(C0760g.abc_screen_toolbar, (ViewGroup) null);
                AbstractC0201b0 b0Var = (AbstractC0201b0) viewGroup.findViewById(C0759f.decor_content_parent);
                this.f279s = b0Var;
                b0Var.setWindowCallback(mo326h0());
                if (this.f246I) {
                    this.f279s.mo947k(109);
                }
                if (this.f243F) {
                    this.f279s.mo947k(2);
                }
                if (this.f244G) {
                    this.f279s.mo947k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C1013s.m5790u0(viewGroup, new C0076c());
                } else if (viewGroup instanceof AbstractC0223f0) {
                    ((AbstractC0223f0) viewGroup).setOnFitSystemWindowsListener(new C0077d());
                }
                if (this.f279s == null) {
                    this.f241D = (TextView) viewGroup.findViewById(C0759f.title);
                }
                C0214c1.m1133c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0759f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f273m.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f273m.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0078e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f245H + ", windowActionBarOverlay: " + this.f246I + ", android:windowIsFloating: " + this.f248K + ", windowActionModeOverlay: " + this.f247J + ", windowNoTitle: " + this.f249L + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: Y */
    private void m317Y() {
        if (!this.f239B) {
            this.f240C = m316S();
            CharSequence g0 = mo325g0();
            if (!TextUtils.isEmpty(g0)) {
                AbstractC0201b0 b0Var = this.f279s;
                if (b0Var != null) {
                    b0Var.setWindowTitle(g0);
                } else if (mo305A0() != null) {
                    mo305A0().mo207v(g0);
                } else {
                    TextView textView = this.f241D;
                    if (textView != null) {
                        textView.setText(g0);
                    }
                }
            }
            m306J();
            mo337y0(this.f240C);
            this.f239B = true;
            C0095s f0 = mo324f0(0, false);
            if (this.f257T) {
                return;
            }
            if (f0 == null || f0.f317j == null) {
                m326m0(C0333i.f1724Z0);
            }
        }
    }

    /* renamed from: Z */
    private void m318Z() {
        if (this.f273m == null) {
            Object obj = this.f271k;
            if (obj instanceof Activity) {
                m308K(((Activity) obj).getWindow());
            }
        }
        if (this.f273m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: b0 */
    private static Configuration m319b0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0091o.m413a(configuration, configuration2, configuration3);
            } else if (!C0956d.m5483a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0092p.m414a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0090n.m412a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: d0 */
    private AbstractC0087l m320d0(Context context) {
        if (this.f263Z == null) {
            this.f263Z = new C0086k(context);
        }
        return this.f263Z;
    }

    /* renamed from: e0 */
    private AbstractC0087l m321e0(Context context) {
        if (this.f262Y == null) {
            this.f262Y = new C0089m(C0109l.m484a(context));
        }
        return this.f262Y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m322i0() {
        /*
            r3 = this;
            r3.m317Y()
            boolean r0 = r3.f245H
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f276p
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f271k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f271k
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f246I
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f276p = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f271k
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f276p
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f267d0
            r0.mo203r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0073f.m322i0():void");
    }

    /* renamed from: j0 */
    private boolean m323j0(C0095s sVar) {
        View view = sVar.f316i;
        if (view != null) {
            sVar.f315h = view;
            return true;
        } else if (sVar.f317j == null) {
            return false;
        } else {
            if (this.f281u == null) {
                this.f281u = new C0096t();
            }
            View view2 = (View) sVar.mo373a(this.f281u);
            sVar.f315h = view2;
            return view2 != null;
        }
    }

    /* renamed from: k0 */
    private boolean m324k0(C0095s sVar) {
        sVar.mo376d(mo323c0());
        sVar.f314g = new C0094r(sVar.f319l);
        sVar.f310c = 81;
        return true;
    }

    /* renamed from: l0 */
    private boolean m325l0(C0095s sVar) {
        Context context = this.f272l;
        int i = sVar.f308a;
        if ((i == 0 || i == 108) && this.f279s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0754a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0754a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0754a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0788d dVar = new C0788d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0130g gVar = new C0130g(context);
        gVar.mo630V(this);
        sVar.mo375c(gVar);
        return true;
    }

    /* renamed from: m0 */
    private void m326m0(int i) {
        this.f265b0 = (1 << i) | this.f265b0;
        if (!this.f264a0) {
            C1013s.m5750a0(this.f273m.getDecorView(), this.f266c0);
            this.f264a0 = true;
        }
    }

    /* renamed from: n0 */
    private boolean m327n0() {
        if (!this.f261X && (this.f271k instanceof Activity)) {
            PackageManager packageManager = this.f272l.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f272l, this.f271k.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f260W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f260W = false;
            }
        }
        this.f261X = true;
        return this.f260W;
    }

    /* renamed from: s0 */
    private boolean m328s0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0095s f0 = mo324f0(i, true);
        if (!f0.f322o) {
            return m301C0(f0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m329v0(int r5, android.view.KeyEvent r6) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0073f.m329v0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: z0 */
    private void m330z0(C0095s sVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!sVar.f322o && !this.f257T) {
            if (sVar.f308a == 0) {
                if ((this.f272l.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback h0 = mo326h0();
            if (h0 == null || h0.onMenuOpened(sVar.f308a, sVar.f317j)) {
                WindowManager windowManager = (WindowManager) this.f272l.getSystemService("window");
                if (windowManager != null && m301C0(sVar, keyEvent)) {
                    ViewGroup viewGroup = sVar.f314g;
                    if (viewGroup == null || sVar.f324q) {
                        if (viewGroup == null) {
                            if (!m324k0(sVar) || sVar.f314g == null) {
                                return;
                            }
                        } else if (sVar.f324q && viewGroup.getChildCount() > 0) {
                            sVar.f314g.removeAllViews();
                        }
                        if (!m323j0(sVar) || !sVar.mo374b()) {
                            sVar.f324q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = sVar.f315h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        sVar.f314g.setBackgroundResource(sVar.f309b);
                        ViewParent parent = sVar.f315h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(sVar.f315h);
                        }
                        sVar.f314g.addView(sVar.f315h, layoutParams2);
                        if (!sVar.f315h.hasFocus()) {
                            sVar.f315h.requestFocus();
                        }
                    } else {
                        View view = sVar.f316i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            sVar.f321n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, sVar.f311d, sVar.f312e, 1002, 8519680, -3);
                            layoutParams3.gravity = sVar.f310c;
                            layoutParams3.windowAnimations = sVar.f313f;
                            windowManager.addView(sVar.f314g, layoutParams3);
                            sVar.f322o = true;
                            return;
                        }
                    }
                    i = -2;
                    sVar.f321n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, sVar.f311d, sVar.f312e, 1002, 8519680, -3);
                    layoutParams32.gravity = sVar.f310c;
                    layoutParams32.windowAnimations = sVar.f313f;
                    windowManager.addView(sVar.f314g, layoutParams32);
                    sVar.f322o = true;
                    return;
                }
                return;
            }
            mo314Q(sVar, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public final AbstractC0064a mo305A0() {
        return this.f276p;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: B */
    public void mo281B(int i) {
        m317Y();
        ViewGroup viewGroup = (ViewGroup) this.f240C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f272l).inflate(i, viewGroup);
        this.f274n.mo4733a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: C */
    public void mo282C(View view) {
        m317Y();
        ViewGroup viewGroup = (ViewGroup) this.f240C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f274n.mo4733a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: D */
    public void mo283D(View view, ViewGroup.LayoutParams layoutParams) {
        m317Y();
        ViewGroup viewGroup = (ViewGroup) this.f240C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f274n.mo4733a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: E */
    public void mo284E(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f271k instanceof Activity) {
            AbstractC0064a m = mo293m();
            if (!(m instanceof C0111m)) {
                this.f277q = null;
                if (m != null) {
                    m.mo199n();
                }
                if (toolbar != null) {
                    C0102j jVar = new C0102j(toolbar, mo325g0(), this.f274n);
                    this.f276p = jVar;
                    window = this.f273m;
                    callback = jVar.mo409y();
                } else {
                    this.f276p = null;
                    window = this.f273m;
                    callback = this.f274n;
                }
                window.setCallback(callback);
                mo295o();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: F */
    public void mo285F(int i) {
        this.f259V = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public final boolean mo306F0() {
        ViewGroup viewGroup;
        return this.f239B && (viewGroup = this.f240C) != null && C1013s.m5737O(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: G */
    public final void mo286G(CharSequence charSequence) {
        this.f278r = charSequence;
        AbstractC0201b0 b0Var = this.f279s;
        if (b0Var != null) {
            b0Var.setWindowTitle(charSequence);
        } else if (mo305A0() != null) {
            mo305A0().mo207v(charSequence);
        } else {
            TextView textView = this.f241D;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: H */
    public boolean mo307H() {
        return m305I(true);
    }

    /* renamed from: H0 */
    public AbstractC0785b mo308H0(AbstractC0785b.AbstractC0786a aVar) {
        AbstractC0071d dVar;
        if (aVar != null) {
            AbstractC0785b bVar = this.f282v;
            if (bVar != null) {
                bVar.mo432c();
            }
            C0083i iVar = new C0083i(aVar);
            AbstractC0064a m = mo293m();
            if (m != null) {
                AbstractC0785b w = m.mo208w(iVar);
                this.f282v = w;
                if (!(w == null || (dVar = this.f275o) == null)) {
                    dVar.mo249S(w);
                }
            }
            if (this.f282v == null) {
                this.f282v = mo309I0(iVar);
            }
            return this.f282v;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p006b.p007a.p014o.AbstractC0785b mo309I0(p006b.p007a.p014o.AbstractC0785b.AbstractC0786a r8) {
        /*
        // Method dump skipped, instructions count: 368
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0073f.mo309I0(b.a.o.b$a):b.a.o.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo310M(int i, C0095s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i >= 0) {
                C0095s[] sVarArr = this.f251N;
                if (i < sVarArr.length) {
                    sVar = sVarArr[i];
                }
            }
            if (sVar != null) {
                menu = sVar.f317j;
            }
        }
        if ((sVar == null || sVar.f322o) && !this.f257T) {
            this.f274n.mo4733a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo311N(C0130g gVar) {
        if (!this.f250M) {
            this.f250M = true;
            this.f279s.mo948l();
            Window.Callback h0 = mo326h0();
            if (h0 != null && !this.f257T) {
                h0.onPanelClosed(C0333i.f1724Z0, gVar);
            }
            this.f250M = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public final int mo312N0(C0964a0 a0Var, Rect rect) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        int h = a0Var != null ? a0Var.mo5418h() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f283w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f283w.getLayoutParams();
            boolean z3 = true;
            if (this.f283w.isShown()) {
                if (this.f268e0 == null) {
                    this.f268e0 = new Rect();
                    this.f269f0 = new Rect();
                }
                Rect rect2 = this.f268e0;
                Rect rect3 = this.f269f0;
                if (a0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(a0Var.mo5416f(), a0Var.mo5418h(), a0Var.mo5417g(), a0Var.mo5414e());
                }
                C0214c1.m1131a(this.f240C, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                C0964a0 F = C1013s.m5728F(this.f240C);
                int f = F == null ? 0 : F.mo5416f();
                int g = F == null ? 0 : F.mo5417g();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.f242E != null) {
                    View view = this.f242E;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == f && marginLayoutParams.rightMargin == g))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = f;
                        marginLayoutParams.rightMargin = g;
                        this.f242E.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f272l);
                    this.f242E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = f;
                    layoutParams.rightMargin = g;
                    this.f240C.addView(this.f242E, -1, layoutParams);
                }
                View view3 = this.f242E;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m314O0(this.f242E);
                }
                if (!this.f247J && z3) {
                    h = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f283w.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f242E;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo313P(int i) {
        mo314Q(mo324f0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo314Q(C0095s sVar, boolean z) {
        ViewGroup viewGroup;
        AbstractC0201b0 b0Var;
        if (!z || sVar.f308a != 0 || (b0Var = this.f279s) == null || !b0Var.mo930c()) {
            WindowManager windowManager = (WindowManager) this.f272l.getSystemService("window");
            if (!(windowManager == null || !sVar.f322o || (viewGroup = sVar.f314g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo310M(sVar.f308a, sVar, null);
                }
            }
            sVar.f320m = false;
            sVar.f321n = false;
            sVar.f322o = false;
            sVar.f315h = null;
            sVar.f324q = true;
            if (this.f252O == sVar) {
                this.f252O = null;
                return;
            }
            return;
        }
        mo311N(sVar.f317j);
    }

    /* renamed from: T */
    public View mo315T(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0099h hVar;
        boolean z2 = false;
        if (this.f270g0 == null) {
            String string = this.f272l.obtainStyledAttributes(C0763j.f3828z0).getString(C0763j.f3589D0);
            if (string == null) {
                hVar = new C0099h();
            } else {
                try {
                    this.f270g0 = (C0099h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new C0099h();
                }
            }
            this.f270g0 = hVar;
        }
        boolean z3 = f233f;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m304G0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f270g0.mo406q(view, str, context, attributeSet, z, z3, true, C0202b1.m1060c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo316U() {
        C0130g gVar;
        AbstractC0201b0 b0Var = this.f279s;
        if (b0Var != null) {
            b0Var.mo948l();
        }
        if (this.f284x != null) {
            this.f273m.getDecorView().removeCallbacks(this.f285y);
            if (this.f284x.isShowing()) {
                try {
                    this.f284x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f284x = null;
        }
        mo319X();
        C0095s f0 = mo324f0(0, false);
        if (f0 != null && (gVar = f0.f317j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo317V(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f271k;
        boolean z = true;
        if (((obj instanceof C0998e.AbstractC0999a) || (obj instanceof DialogC0097g)) && (decorView = this.f273m.getDecorView()) != null && C0998e.m5673d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f274n.mo4733a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo332r0(keyCode, keyEvent) : mo334u0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo318W(int i) {
        C0095s f0;
        C0095s f02 = mo324f0(i, true);
        if (f02.f317j != null) {
            Bundle bundle = new Bundle();
            f02.f317j.mo628T(bundle);
            if (bundle.size() > 0) {
                f02.f326s = bundle;
            }
            f02.f317j.mo661h0();
            f02.f317j.clear();
        }
        f02.f325r = true;
        f02.f324q = true;
        if ((i == 108 || i == 0) && this.f279s != null && (f0 = mo324f0(0, false)) != null) {
            f0.f320m = false;
            m301C0(f0, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo319X() {
        C1028w wVar = this.f286z;
        if (wVar != null) {
            wVar.mo5579b();
        }
    }

    @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
    /* renamed from: a */
    public boolean mo320a(C0130g gVar, MenuItem menuItem) {
        C0095s a0;
        Window.Callback h0 = mo326h0();
        if (h0 == null || this.f257T || (a0 = mo321a0(gVar.mo615F())) == null) {
            return false;
        }
        return h0.onMenuItemSelected(a0.f308a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C0095s mo321a0(Menu menu) {
        C0095s[] sVarArr = this.f251N;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0095s sVar = sVarArr[i];
            if (sVar != null && sVar.f317j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
    /* renamed from: b */
    public void mo322b(C0130g gVar) {
        m302D0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final Context mo323c0() {
        AbstractC0064a m = mo293m();
        Context k = m != null ? m.mo196k() : null;
        return k == null ? this.f272l : k;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: d */
    public void mo287d(View view, ViewGroup.LayoutParams layoutParams) {
        m317Y();
        ((ViewGroup) this.f240C.findViewById(16908290)).addView(view, layoutParams);
        this.f274n.mo4733a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: f */
    public Context mo289f(Context context) {
        boolean z = true;
        this.f254Q = true;
        int p0 = mo330p0(context, m310L());
        Configuration configuration = null;
        if (f236i && (context instanceof ContextThemeWrapper)) {
            try {
                C0093q.m415a((ContextThemeWrapper) context, m315R(context, p0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0788d) {
            try {
                ((C0788d) context).mo4688a(m315R(context, p0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f235h) {
            return super.mo289f(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m319b0(configuration2, configuration3);
            }
            Configuration R = m315R(context, p0, configuration);
            C0788d dVar = new C0788d(context, C0762i.Theme_AppCompat_Empty);
            dVar.mo4688a(R);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C0390f.C0394b.m1933a(dVar.getTheme());
            }
            return super.mo289f(dVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public C0095s mo324f0(int i, boolean z) {
        C0095s[] sVarArr = this.f251N;
        if (sVarArr == null || sVarArr.length <= i) {
            C0095s[] sVarArr2 = new C0095s[(i + 1)];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f251N = sVarArr2;
            sVarArr = sVarArr2;
        }
        C0095s sVar = sVarArr[i];
        if (sVar != null) {
            return sVar;
        }
        C0095s sVar2 = new C0095s(i);
        sVarArr[i] = sVar2;
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final CharSequence mo325g0() {
        Object obj = this.f271k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f278r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final Window.Callback mo326h0() {
        return this.f273m.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: i */
    public <T extends View> T mo290i(int i) {
        m317Y();
        return (T) this.f273m.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: k */
    public int mo291k() {
        return this.f258U;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: l */
    public MenuInflater mo292l() {
        if (this.f277q == null) {
            m322i0();
            AbstractC0064a aVar = this.f276p;
            this.f277q = new C0792g(aVar != null ? aVar.mo196k() : this.f272l);
        }
        return this.f277q;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: m */
    public AbstractC0064a mo293m() {
        m322i0();
        return this.f276p;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: n */
    public void mo294n() {
        LayoutInflater from = LayoutInflater.from(this.f272l);
        if (from.getFactory() == null) {
            C1000f.m5678b(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C0073f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: o */
    public void mo295o() {
        AbstractC0064a m = mo293m();
        if (m == null || !m.mo197l()) {
            m326m0(0);
        }
    }

    /* renamed from: o0 */
    public boolean mo327o0() {
        return this.f238A;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo315T(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: p */
    public void mo296p(Configuration configuration) {
        AbstractC0064a m;
        if (this.f245H && this.f239B && (m = mo293m()) != null) {
            m.mo198m(configuration);
        }
        C0241j.m1243b().mo1549g(this.f272l);
        m305I(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public int mo330p0(Context context, int i) {
        AbstractC0087l e0;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        e0 = m320d0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                e0 = m321e0(context);
            }
            return e0.mo365c();
        }
        return i;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: q */
    public void mo297q(Bundle bundle) {
        this.f254Q = true;
        m305I(false);
        m318Z();
        Object obj = this.f271k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0362f.m1801c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0064a A0 = mo305A0();
                if (A0 == null) {
                    this.f267d0 = true;
                } else {
                    A0.mo203r(true);
                }
            }
            AbstractC0072e.m270c(this);
        }
        this.f255R = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean mo331q0() {
        AbstractC0785b bVar = this.f282v;
        if (bVar != null) {
            bVar.mo432c();
            return true;
        }
        AbstractC0064a m = mo293m();
        return m != null && m.mo193h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo298r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f271k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.AbstractC0072e.m274x(r3)
        L_0x0009:
            boolean r0 = r3.f264a0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f273m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f266c0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f256S = r0
            r0 = 1
            r3.f257T = r0
            int r0 = r3.f258U
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f271k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            b.d.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0073f.f232e
            java.lang.Object r1 = r3.f271k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f258U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            b.d.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0073f.f232e
            java.lang.Object r1 = r3.f271k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f276p
            if (r0 == 0) goto L_0x005e
            r0.mo199n()
        L_0x005e:
            r3.m313O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0073f.mo298r():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo332r0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f253P = z;
        } else if (i == 82) {
            m328s0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: s */
    public void mo299s(Bundle bundle) {
        m317Y();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: t */
    public void mo300t() {
        AbstractC0064a m = mo293m();
        if (m != null) {
            m.mo206u(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo333t0(int i, KeyEvent keyEvent) {
        AbstractC0064a m = mo293m();
        if (m != null && m.mo200o(i, keyEvent)) {
            return true;
        }
        C0095s sVar = this.f252O;
        if (sVar == null || !m300B0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f252O == null) {
                C0095s f0 = mo324f0(0, true);
                m301C0(f0, keyEvent);
                boolean B0 = m300B0(f0, keyEvent.getKeyCode(), keyEvent, 1);
                f0.f320m = false;
                if (B0) {
                    return true;
                }
            }
            return false;
        }
        C0095s sVar2 = this.f252O;
        if (sVar2 != null) {
            sVar2.f321n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: u */
    public void mo301u(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo334u0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f253P;
            this.f253P = false;
            C0095s f0 = mo324f0(0, false);
            if (f0 != null && f0.f322o) {
                if (!z) {
                    mo314Q(f0, true);
                }
                return true;
            } else if (mo331q0()) {
                return true;
            }
        } else if (i == 82) {
            m329v0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: v */
    public void mo302v() {
        this.f256S = true;
        mo307H();
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: w */
    public void mo303w() {
        this.f256S = false;
        AbstractC0064a m = mo293m();
        if (m != null) {
            m.mo206u(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo335w0(int i) {
        AbstractC0064a m;
        if (i == 108 && (m = mo293m()) != null) {
            m.mo194i(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo336x0(int i) {
        if (i == 108) {
            AbstractC0064a m = mo293m();
            if (m != null) {
                m.mo194i(false);
            }
        } else if (i == 0) {
            C0095s f0 = mo324f0(i, true);
            if (f0.f322o) {
                mo314Q(f0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo337y0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0072e
    /* renamed from: z */
    public boolean mo304z(int i) {
        int E0 = m303E0(i);
        if (this.f249L && E0 == 108) {
            return false;
        }
        if (this.f245H && E0 == 1) {
            this.f245H = false;
        }
        if (E0 == 1) {
            m307J0();
            this.f249L = true;
            return true;
        } else if (E0 == 2) {
            m307J0();
            this.f243F = true;
            return true;
        } else if (E0 == 5) {
            m307J0();
            this.f244G = true;
            return true;
        } else if (E0 == 10) {
            m307J0();
            this.f247J = true;
            return true;
        } else if (E0 == 108) {
            m307J0();
            this.f245H = true;
            return true;
        } else if (E0 != 109) {
            return this.f273m.requestFeature(E0);
        } else {
            m307J0();
            this.f246I = true;
            return true;
        }
    }
}
