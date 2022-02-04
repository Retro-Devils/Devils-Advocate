package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p030g.p038j.C0961i;

/* renamed from: androidx.fragment.app.h */
public abstract class AbstractC0452h<E> extends AbstractC0449e {

    /* renamed from: b */
    private final Activity f2359b;

    /* renamed from: c */
    private final Context f2360c;

    /* renamed from: d */
    private final Handler f2361d;

    /* renamed from: e */
    private final int f2362e;

    /* renamed from: f */
    final LayoutInflater$Factory2C0456j f2363f;

    AbstractC0452h(Activity activity, Context context, Handler handler, int i) {
        this.f2363f = new LayoutInflater$Factory2C0456j();
        this.f2359b = activity;
        this.f2360c = (Context) C0961i.m5495d(context, "context == null");
        this.f2361d = (Handler) C0961i.m5495d(handler, "handler == null");
        this.f2362e = i;
    }

    AbstractC0452h(ActivityC0447d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0449e
    /* renamed from: b */
    public View mo2621b(int i) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0449e
    /* renamed from: c */
    public boolean mo2622c() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Activity mo2726d() {
        return this.f2359b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Context mo2727e() {
        return this.f2360c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Handler mo2728f() {
        return this.f2361d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2690g(Fragment fragment) {
    }

    /* renamed from: h */
    public void mo2691h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo2692i();

    /* renamed from: j */
    public LayoutInflater mo2693j() {
        return LayoutInflater.from(this.f2360c);
    }

    /* renamed from: k */
    public int mo2694k() {
        return this.f2362e;
    }

    /* renamed from: l */
    public boolean mo2695l() {
        return true;
    }

    /* renamed from: m */
    public boolean mo2696m(Fragment fragment) {
        return true;
    }

    /* renamed from: o */
    public void mo2697o(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f2360c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: p */
    public void mo2698p() {
    }
}
