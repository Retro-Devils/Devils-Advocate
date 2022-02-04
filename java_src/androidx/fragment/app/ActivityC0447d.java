package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.AbstractC0050c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0348a;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0636s;
import androidx.lifecycle.C0620h;
import androidx.lifecycle.C0635r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p021d.C0839j;
import p006b.p054n.p055a.AbstractC1081a;

/* renamed from: androidx.fragment.app.d */
public class ActivityC0447d extends ComponentActivity implements C0348a.AbstractC0350b, C0348a.AbstractC0352d {

    /* renamed from: i */
    final C0450f f2346i = C0450f.m2392b(new C0448a());

    /* renamed from: j */
    final C0620h f2347j = new C0620h(this);

    /* renamed from: k */
    boolean f2348k;

    /* renamed from: l */
    boolean f2349l;

    /* renamed from: m */
    boolean f2350m = true;

    /* renamed from: n */
    boolean f2351n;

    /* renamed from: o */
    boolean f2352o;

    /* renamed from: p */
    boolean f2353p;

    /* renamed from: q */
    int f2354q;

    /* renamed from: r */
    C0839j<String> f2355r;

    /* renamed from: androidx.fragment.app.d$a */
    class C0448a extends AbstractC0452h<ActivityC0447d> implements AbstractC0636s, AbstractC0050c {
        public C0448a() {
            super(ActivityC0447d.this);
        }

        @Override // androidx.lifecycle.AbstractC0636s
        /* renamed from: Y */
        public C0635r mo139Y() {
            return ActivityC0447d.this.mo139Y();
        }

        @Override // androidx.fragment.app.AbstractC0449e, androidx.fragment.app.AbstractC0452h
        /* renamed from: b */
        public View mo2621b(int i) {
            return ActivityC0447d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC0449e, androidx.fragment.app.AbstractC0452h
        /* renamed from: c */
        public boolean mo2622c() {
            Window window = ActivityC0447d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: g */
        public void mo2690g(Fragment fragment) {
            ActivityC0447d.this.mo2669F0(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: h */
        public void mo2691h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0447d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: j */
        public LayoutInflater mo2693j() {
            return ActivityC0447d.this.getLayoutInflater().cloneInContext(ActivityC0447d.this);
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: k */
        public int mo2694k() {
            Window window = ActivityC0447d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: l */
        public boolean mo2695l() {
            return ActivityC0447d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: m */
        public boolean mo2696m(Fragment fragment) {
            return !ActivityC0447d.this.isFinishing();
        }

        @Override // androidx.lifecycle.AbstractC0619g
        /* renamed from: n */
        public AbstractC0614d mo140n() {
            return ActivityC0447d.this.f2347j;
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: o */
        public void mo2697o(Fragment fragment, Intent intent, int i, Bundle bundle) {
            ActivityC0447d.this.mo2672I0(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.AbstractC0452h
        /* renamed from: p */
        public void mo2698p() {
            ActivityC0447d.this.mo241J0();
        }

        /* renamed from: q */
        public ActivityC0447d mo2692i() {
            return ActivityC0447d.this;
        }

        @Override // androidx.activity.AbstractC0050c
        /* renamed from: s */
        public OnBackPressedDispatcher mo145s() {
            return ActivityC0447d.this.mo145s();
        }
    }

    /* renamed from: A0 */
    static void m2362A0(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: D0 */
    private void m2363D0() {
        do {
        } while (m2364E0(mo2668C0(), AbstractC0614d.EnumC0616b.CREATED));
    }

    /* renamed from: E0 */
    private static boolean m2364E0(AbstractC0453i iVar, AbstractC0614d.EnumC0616b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.mo2735g()) {
            if (fragment != null) {
                if (fragment.mo140n().mo3665b().mo3667a(AbstractC0614d.EnumC0616b.STARTED)) {
                    fragment.f2263U.mo3670p(bVar);
                    z = true;
                }
                if (fragment.mo2596p0() != null) {
                    z |= m2364E0(fragment.mo2572i0(), bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: z0 */
    private int m2365z0(Fragment fragment) {
        if (this.f2355r.mo5036l() < 65534) {
            while (this.f2355r.mo5031g(this.f2354q) >= 0) {
                this.f2354q = (this.f2354q + 1) % 65534;
            }
            int i = this.f2354q;
            this.f2355r.mo5034j(i, fragment.f2272g);
            this.f2354q = (this.f2354q + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public final View mo2667B0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2346i.mo2722w(view, str, context, attributeSet);
    }

    /* renamed from: C0 */
    public AbstractC0453i mo2668C0() {
        return this.f2346i.mo2720u();
    }

    /* renamed from: F0 */
    public void mo2669F0(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: G0 */
    public boolean mo2670G0(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo2671H0() {
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_RESUME);
        this.f2346i.mo2715p();
    }

    /* renamed from: I0 */
    public void mo2672I0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.f2353p = true;
        if (i == -1) {
            try {
                C0348a.m1781m(this, intent, -1, bundle);
            } finally {
                this.f2353p = false;
            }
        } else {
            m2362A0(i);
            C0348a.m1781m(this, intent, ((m2365z0(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f2353p = false;
        }
    }

    @Deprecated
    /* renamed from: J0 */
    public void mo241J0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.C0348a.AbstractC0352d
    /* renamed from: a */
    public final void mo2160a(int i) {
        if (!this.f2351n && i != -1) {
            m2362A0(i);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2348k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2349l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2350m);
        if (getApplication() != null) {
            AbstractC1081a.m6112b(this).mo5712a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2346i.mo2720u().mo2730b(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2346i.mo2721v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String e = this.f2355r.mo5029e(i4);
            this.f2355r.mo5035k(i4);
            if (e == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f2346i.mo2719t(e);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + e);
                return;
            }
            t.mo2527R0(i & 65535, i2, intent);
            return;
        }
        C0348a.AbstractC0351c i5 = C0348a.m1777i();
        if (i5 == null || !i5.mo2159b(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2346i.mo2721v();
        this.f2346i.mo2703d(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e
    public void onCreate(Bundle bundle) {
        this.f2346i.mo2701a(null);
        if (bundle != null) {
            this.f2346i.mo2723x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2354q = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2355r = new C0839j<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f2355r.mo5034j(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f2355r == null) {
            this.f2355r = new C0839j<>();
            this.f2354q = 0;
        }
        super.onCreate(bundle);
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_CREATE);
        this.f2346i.mo2705f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f2346i.mo2706g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View B0 = mo2667B0(view, str, context, attributeSet);
        return B0 == null ? super.onCreateView(view, str, context, attributeSet) : B0;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View B0 = mo2667B0(null, str, context, attributeSet);
        return B0 == null ? super.onCreateView(str, context, attributeSet) : B0;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2346i.mo2707h();
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2346i.mo2708i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2346i.mo2710k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2346i.mo2704e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2346i.mo2709j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2346i.mo2721v();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2346i.mo2711l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2349l = false;
        this.f2346i.mo2712m();
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2346i.mo2713n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2671H0();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? mo2670G0(view, menu) | this.f2346i.mo2714o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.core.app.C0348a.AbstractC0350b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2346i.mo2721v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String e = this.f2355r.mo5029e(i3);
            this.f2355r.mo5035k(i3);
            if (e == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f2346i.mo2719t(e);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + e);
                return;
            }
            t.mo2599q1(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2349l = true;
        this.f2346i.mo2721v();
        this.f2346i.mo2718s();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m2363D0();
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_STOP);
        Parcelable y = this.f2346i.mo2724y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.f2355r.mo5036l() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2354q);
            int[] iArr = new int[this.f2355r.mo5036l()];
            String[] strArr = new String[this.f2355r.mo5036l()];
            for (int i = 0; i < this.f2355r.mo5036l(); i++) {
                iArr[i] = this.f2355r.mo5033i(i);
                strArr[i] = this.f2355r.mo5037m(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2350m = false;
        if (!this.f2348k) {
            this.f2348k = true;
            this.f2346i.mo2702c();
        }
        this.f2346i.mo2721v();
        this.f2346i.mo2718s();
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_START);
        this.f2346i.mo2716q();
    }

    public void onStateNotSaved() {
        this.f2346i.mo2721v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f2350m = true;
        m2363D0();
        this.f2346i.mo2717r();
        this.f2347j.mo3668i(AbstractC0614d.EnumC0615a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f2353p && i != -1) {
            m2362A0(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f2353p && i != -1) {
            m2362A0(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f2352o && i != -1) {
            m2362A0(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f2352o && i != -1) {
            m2362A0(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
