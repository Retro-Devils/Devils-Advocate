package com.digdroid.alman.dig;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.digdroid.alman.dig.c4 */
public class ActivityC2220c4 extends ActivityC2455l {

    /* renamed from: M */
    private boolean f7957M = false;

    /* renamed from: N */
    protected int f7958N;

    /* renamed from: O */
    protected int f7959O;

    /* renamed from: P */
    protected int f7960P;

    /* renamed from: Q */
    protected int f7961Q;

    /* renamed from: R */
    protected int f7962R;

    /* renamed from: S */
    protected int f7963S;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.c4$a */
    public class View$OnSystemUiVisibilityChangeListenerC2221a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f7964a;

        View$OnSystemUiVisibilityChangeListenerC2221a(View view) {
            this.f7964a = view;
        }

        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4) == 0 && ActivityC2220c4.this.f9267w.mo8180c("hide_navbar", false)) {
                this.f7964a.setSystemUiVisibility(3846);
            }
        }
    }

    /* renamed from: g */
    public Point mo8203g(boolean z) {
        mo8204h1();
        Point point = new Point(this.f7958N, this.f7959O);
        if (!z) {
            point.y -= C2185a4.m9666D((MainActivity) this);
        }
        return point;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4  */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo8204h1() {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.ActivityC2220c4.mo8204h1():void");
    }

    /* renamed from: i1 */
    public Point mo8205i1() {
        return new Point(this.f7960P, this.f7961Q);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9267w = C2219c3.m9805k(getApplicationContext());
        View decorView = getWindow().getDecorView();
        if (this.f9267w.mo8180c("hide_navbar", false) || this.f9267w.mo8188l("orientation", 0) == 3) {
            decorView.setSystemUiVisibility(3846);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new View$OnSystemUiVisibilityChangeListenerC2221a(decorView));
    }
}
