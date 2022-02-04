package com.digdroid.alman.dig;

import android.os.Build;
import com.jaredrummler.android.colorpicker.DialogFragmentC3316c;
import com.pes.androidmaterialcolorpickerdialog.AbstractC3339c;
import com.pes.androidmaterialcolorpickerdialog.DialogC3336b;

/* renamed from: com.digdroid.alman.dig.g2 */
class C2326g2 {

    /* renamed from: a */
    ActivityC2455l f8208a;

    /* renamed from: b */
    int f8209b;

    /* renamed from: c */
    int f8210c;

    /* renamed from: d */
    boolean f8211d;

    /* renamed from: e */
    AbstractC2328b f8212e;

    /* renamed from: com.digdroid.alman.dig.g2$a */
    class C2327a implements AbstractC3339c {
        C2327a() {
        }

        @Override // com.pes.androidmaterialcolorpickerdialog.AbstractC3339c
        /* renamed from: a */
        public void mo8463a(int i) {
            C2326g2.this.f8212e.mo8464a(i);
        }
    }

    /* renamed from: com.digdroid.alman.dig.g2$b */
    public interface AbstractC2328b {
        /* renamed from: a */
        void mo8464a(int i);
    }

    public C2326g2(ActivityC2455l lVar, int i, int i2, boolean z, AbstractC2328b bVar) {
        this.f8208a = lVar;
        this.f8209b = i;
        this.f8210c = i2;
        this.f8211d = z;
        this.f8212e = bVar;
    }

    /* renamed from: a */
    public void mo8462a() {
        if (!C2219c3.m9805k(this.f8208a).mo8197u() || Build.VERSION.SDK_INT < 16) {
            this.f8208a.f8577L = this.f8212e;
            DialogFragmentC3316c.m13899j().mo11276c(this.f8210c).mo11277d(this.f8209b).mo11278e(0).mo11275b(false).mo11279f(this.f8211d).mo11280g(this.f8208a);
            return;
        }
        int i = this.f8210c;
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        DialogC3336b bVar = this.f8211d ? new DialogC3336b(this.f8208a, (i >> 24) & 255, i2, i3, i4) : new DialogC3336b(this.f8208a, i2, i3, i4);
        bVar.mo11283i(new C2327a());
        bVar.mo11281e();
        bVar.show();
    }
}
