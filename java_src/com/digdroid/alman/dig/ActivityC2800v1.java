package com.digdroid.alman.dig;

import android.os.Bundle;
import androidx.constraintlayout.widget.C0322d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import p006b.p060q.C1151o;

/* renamed from: com.digdroid.alman.dig.v1 */
public class ActivityC2800v1 extends ActivityC2220c4 {
    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity);
        mo8204h1();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        DrawerLayout.C0427e eVar = (DrawerLayout.C0427e) navigationView.getLayoutParams();
        eVar.setMargins(this.f7968P, this.f7969Q, this.f7971S, this.f7970R);
        navigationView.setLayoutParams(eVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.viewport_container);
        C0322d dVar = new C0322d();
        dVar.mo1997f(constraintLayout);
        dVar.mo2001o(R.id.viewport_top, this.f7969Q);
        dVar.mo2002p(R.id.viewport_bottom, this.f7970R);
        dVar.mo2001o(R.id.viewport_left, this.f7968P);
        dVar.mo2002p(R.id.viewport_right, this.f7971S);
        C1151o.m6329a(constraintLayout);
        dVar.mo1994c(constraintLayout);
    }
}
