package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0202b1;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p006b.p021d.C0825b;

/* renamed from: androidx.appcompat.app.e */
public abstract class AbstractC0072e {

    /* renamed from: b */
    private static int f229b = -100;

    /* renamed from: c */
    private static final C0825b<WeakReference<AbstractC0072e>> f230c = new C0825b<>();

    /* renamed from: d */
    private static final Object f231d = new Object();

    AbstractC0072e() {
    }

    /* renamed from: A */
    public static void m269A(boolean z) {
        C0202b1.m1059b(z);
    }

    /* renamed from: c */
    static void m270c(AbstractC0072e eVar) {
        synchronized (f231d) {
            m275y(eVar);
            f230c.add(new WeakReference<>(eVar));
        }
    }

    /* renamed from: g */
    public static AbstractC0072e m271g(Activity activity, AbstractC0071d dVar) {
        return new LayoutInflater$Factory2C0073f(activity, dVar);
    }

    /* renamed from: h */
    public static AbstractC0072e m272h(Dialog dialog, AbstractC0071d dVar) {
        return new LayoutInflater$Factory2C0073f(dialog, dVar);
    }

    /* renamed from: j */
    public static int m273j() {
        return f229b;
    }

    /* renamed from: x */
    static void m274x(AbstractC0072e eVar) {
        synchronized (f231d) {
            m275y(eVar);
        }
    }

    /* renamed from: y */
    private static void m275y(AbstractC0072e eVar) {
        synchronized (f231d) {
            Iterator<WeakReference<AbstractC0072e>> it = f230c.iterator();
            while (it.hasNext()) {
                AbstractC0072e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    public abstract void mo281B(int i);

    /* renamed from: C */
    public abstract void mo282C(View view);

    /* renamed from: D */
    public abstract void mo283D(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: E */
    public abstract void mo284E(Toolbar toolbar);

    /* renamed from: F */
    public void mo285F(int i) {
    }

    /* renamed from: G */
    public abstract void mo286G(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo287d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo288e(Context context) {
    }

    /* renamed from: f */
    public Context mo289f(Context context) {
        mo288e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo290i(int i);

    /* renamed from: k */
    public int mo291k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo292l();

    /* renamed from: m */
    public abstract AbstractC0064a mo293m();

    /* renamed from: n */
    public abstract void mo294n();

    /* renamed from: o */
    public abstract void mo295o();

    /* renamed from: p */
    public abstract void mo296p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo297q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo298r();

    /* renamed from: s */
    public abstract void mo299s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo300t();

    /* renamed from: u */
    public abstract void mo301u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo302v();

    /* renamed from: w */
    public abstract void mo303w();

    /* renamed from: z */
    public abstract boolean mo304z(int i);
}
