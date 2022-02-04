package com.digdroid.alman.dig;

import android.os.Bundle;
import com.digdroid.alman.dig.ActivityC2725t;
import com.digdroid.alman.dig.C2187b0;
import com.digdroid.alman.dig.C2223d0;
import java.util.concurrent.Callable;

public class WidgetActivity extends ActivityC2220c4 {

    /* renamed from: T */
    long f7797T;

    /* renamed from: com.digdroid.alman.dig.WidgetActivity$a */
    class CallableC2160a implements Callable {
        CallableC2160a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            WidgetActivity.this.mo8016j1();
            return null;
        }
    }

    /* renamed from: com.digdroid.alman.dig.WidgetActivity$b */
    class C2161b implements C2223d0.AbstractC2248r {

        /* renamed from: a */
        final /* synthetic */ Callable f7799a;

        /* renamed from: com.digdroid.alman.dig.WidgetActivity$b$a */
        class C2162a implements C2223d0.AbstractC2249s {
            C2162a() {
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: a */
            public void mo7941a() {
                C2161b bVar = C2161b.this;
                new ActivityC2725t.AsyncTaskC2726a(null, bVar.f7799a).execute(new Void[0]);
            }

            @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
            /* renamed from: b */
            public void mo7942b() {
                WidgetActivity.this.finish();
            }
        }

        C2161b(Callable callable) {
            this.f7799a = callable;
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2248r
        /* renamed from: a */
        public void mo7931a() {
            C2223d0.m9876p().mo8215r(WidgetActivity.this, 2, new C2162a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.WidgetActivity$c */
    public class C2163c implements C2187b0.AbstractC2204m {
        C2163c() {
        }

        @Override // com.digdroid.alman.dig.C2187b0.AbstractC2204m
        /* renamed from: a */
        public void mo8018a() {
            WidgetActivity.this.mo9519c1();
            C2219c3 k = C2219c3.m9805k(WidgetActivity.this);
            WidgetActivity widgetActivity = WidgetActivity.this;
            if (widgetActivity.f9272E) {
                C2185a4.m9668F(widgetActivity, "retroarch");
            }
            if (k.mo8197u()) {
                WidgetActivity widgetActivity2 = WidgetActivity.this;
                MyWidget.m9547c(widgetActivity2, widgetActivity2.f7797T);
            }
            System.exit(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo8016j1() {
        if (this.f9270C >= 0) {
            this.f9278z.f7871j = new C2163c();
            this.f7797T = this.f9270C;
            this.f9270C = -1;
            this.f9278z.mo8062x(this, this.f7797T, System.currentTimeMillis() - this.f9269B, this.f9272E);
        } else if (!mo9520d1()) {
            long longExtra = getIntent().getLongExtra("gameid", -1);
            this.f7797T = longExtra;
            this.f9276x.mo8844i(this, longExtra, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c
    public void onCreate(Bundle bundle) {
        C2553q3.m11120f(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_widget);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onResume() {
        super.onResume();
        CallableC2160a aVar = new CallableC2160a();
        C2219c3 k = C2219c3.m9805k(this);
        this.f9275w = k;
        if (k.mo8197u()) {
            new ActivityC2725t.AsyncTaskC2726a(null, aVar).execute(new Void[0]);
        } else {
            C2223d0.m9876p().mo8212l(this, new C2161b(aVar));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.appcompat.app.ActivityC0070c
    public void onStart() {
        super.onStart();
    }
}
