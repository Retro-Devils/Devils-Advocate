package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.AbstractC0636s;
import p006b.p030g.p038j.C0961i;

/* renamed from: androidx.fragment.app.f */
public class C0450f {

    /* renamed from: a */
    private final AbstractC0452h<?> f2357a;

    private C0450f(AbstractC0452h<?> hVar) {
        this.f2357a = hVar;
    }

    /* renamed from: b */
    public static C0450f m2392b(AbstractC0452h<?> hVar) {
        return new C0450f((AbstractC0452h) C0961i.m5495d(hVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo2701a(Fragment fragment) {
        AbstractC0452h<?> hVar = this.f2357a;
        hVar.f2363f.mo2817s(hVar, hVar, fragment);
    }

    /* renamed from: c */
    public void mo2702c() {
        this.f2357a.f2363f.mo2744B();
    }

    /* renamed from: d */
    public void mo2703d(Configuration configuration) {
        this.f2357a.f2363f.mo2746C(configuration);
    }

    /* renamed from: e */
    public boolean mo2704e(MenuItem menuItem) {
        return this.f2357a.f2363f.mo2748D(menuItem);
    }

    /* renamed from: f */
    public void mo2705f() {
        this.f2357a.f2363f.mo2750E();
    }

    /* renamed from: g */
    public boolean mo2706g(Menu menu, MenuInflater menuInflater) {
        return this.f2357a.f2363f.mo2752F(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo2707h() {
        this.f2357a.f2363f.mo2754G();
    }

    /* renamed from: i */
    public void mo2708i() {
        this.f2357a.f2363f.mo2757I();
    }

    /* renamed from: j */
    public void mo2709j(boolean z) {
        this.f2357a.f2363f.mo2759J(z);
    }

    /* renamed from: k */
    public boolean mo2710k(MenuItem menuItem) {
        return this.f2357a.f2363f.mo2785Y(menuItem);
    }

    /* renamed from: l */
    public void mo2711l(Menu menu) {
        this.f2357a.f2363f.mo2786Z(menu);
    }

    /* renamed from: m */
    public void mo2712m() {
        this.f2357a.f2363f.mo2788b0();
    }

    /* renamed from: n */
    public void mo2713n(boolean z) {
        this.f2357a.f2363f.mo2790c0(z);
    }

    /* renamed from: o */
    public boolean mo2714o(Menu menu) {
        return this.f2357a.f2363f.mo2792d0(menu);
    }

    /* renamed from: p */
    public void mo2715p() {
        this.f2357a.f2363f.mo2795f0();
    }

    /* renamed from: q */
    public void mo2716q() {
        this.f2357a.f2363f.mo2797g0();
    }

    /* renamed from: r */
    public void mo2717r() {
        this.f2357a.f2363f.mo2800i0();
    }

    /* renamed from: s */
    public boolean mo2718s() {
        return this.f2357a.f2363f.mo2812o0();
    }

    /* renamed from: t */
    public Fragment mo2719t(String str) {
        return this.f2357a.f2363f.mo2820t0(str);
    }

    /* renamed from: u */
    public AbstractC0453i mo2720u() {
        return this.f2357a.f2363f;
    }

    /* renamed from: v */
    public void mo2721v() {
        this.f2357a.f2363f.mo2779U0();
    }

    /* renamed from: w */
    public View mo2722w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2357a.f2363f.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public void mo2723x(Parcelable parcelable) {
        AbstractC0452h<?> hVar = this.f2357a;
        if (hVar instanceof AbstractC0636s) {
            hVar.f2363f.mo2793d1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: y */
    public Parcelable mo2724y() {
        return this.f2357a.f2363f.mo2796f1();
    }
}
