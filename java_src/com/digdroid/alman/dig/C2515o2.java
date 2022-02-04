package com.digdroid.alman.dig;

import android.app.Activity;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import p069c.p073b.p074a.p108c.p109a.AbstractC1480c;
import p069c.p073b.p074a.p108c.p109a.C1485d;
import p069c.p073b.p074a.p108c.p109a.EnumC1479b;
import p171fr.bmartel.youtubetv.YoutubeTvView;
import p171fr.bmartel.youtubetv.p172g.AbstractC3441b;
import p171fr.bmartel.youtubetv.p173h.C3447e;
import p171fr.bmartel.youtubetv.p173h.EnumC3449g;

/* renamed from: com.digdroid.alman.dig.o2 */
public class C2515o2 implements AbstractC1480c.AbstractC1482b {

    /* renamed from: a */
    private static C2515o2 f8733a;

    /* renamed from: A */
    private boolean f8734A = false;

    /* renamed from: b */
    AbstractC2524g f8735b;

    /* renamed from: c */
    AbstractC2531p1 f8736c;

    /* renamed from: d */
    C2523f f8737d;

    /* renamed from: e */
    View f8738e;

    /* renamed from: f */
    MainActivity f8739f;

    /* renamed from: g */
    int f8740g;

    /* renamed from: h */
    boolean f8741h = true;

    /* renamed from: i */
    private boolean f8742i = false;

    /* renamed from: j */
    private String f8743j = null;

    /* renamed from: k */
    private String f8744k = null;

    /* renamed from: l */
    private String f8745l = null;

    /* renamed from: m */
    private AbstractC1480c f8746m = null;

    /* renamed from: n */
    private YoutubeTvView f8747n = null;

    /* renamed from: o */
    private Handler f8748o = null;

    /* renamed from: p */
    private FrameLayout f8749p;

    /* renamed from: q */
    private RelativeLayout f8750q;

    /* renamed from: r */
    private RelativeLayout f8751r;

    /* renamed from: s */
    private int f8752s;

    /* renamed from: t */
    private int f8753t;

    /* renamed from: u */
    private boolean f8754u = false;

    /* renamed from: v */
    int f8755v = 1000;

    /* renamed from: w */
    private int f8756w = 0;

    /* renamed from: x */
    private int f8757x = 0;

    /* renamed from: y */
    private int f8758y = 8;

    /* renamed from: z */
    boolean f8759z = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o2$a */
    public class RunnableC2516a implements Runnable {
        RunnableC2516a() {
        }

        public void run() {
            C2515o2 o2Var = C2515o2.this;
            if (o2Var.f8741h) {
                o2Var.m10877s();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o2$b */
    public class RunnableC2517b implements Runnable {
        RunnableC2517b() {
        }

        public void run() {
            C2515o2 o2Var = C2515o2.this;
            if (o2Var.f8741h && o2Var.f8735b.mo8649b() && C2515o2.this.f8743j != null) {
                if (C2515o2.this.f8745l == null || !C2515o2.this.f8745l.equals(C2515o2.this.f8743j)) {
                    C2515o2.this.f8746m.mo6699c(C2515o2.this.f8743j);
                    return;
                }
                C2515o2.this.mo8871w();
                C2515o2.this.m10878x(0);
                C2515o2.this.f8746m.mo6701e();
                C2515o2.this.f8735b.mo8648a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o2$c */
    public class RunnableC2518c implements Runnable {
        RunnableC2518c() {
        }

        public void run() {
            C2515o2 o2Var = C2515o2.this;
            if (o2Var.f8741h && o2Var.f8735b.mo8649b() && C2515o2.this.f8743j != null) {
                if (C2515o2.this.f8745l == null || !C2515o2.this.f8745l.equals(C2515o2.this.f8743j)) {
                    C2515o2.this.f8747n.mo11451h(C2515o2.this.f8743j);
                } else {
                    C2515o2.this.f8747n.mo11433g();
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o2$d */
    class C2519d implements AbstractC1480c.AbstractC1483c {
        C2519d() {
        }

        @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1483c
        /* renamed from: a */
        public void mo6705a(String str) {
            C2515o2 o2Var = C2515o2.this;
            if (o2Var.f8741h && o2Var.f8735b.mo8649b() && str != null && C2515o2.this.f8743j != null) {
                if (!str.equals(C2515o2.this.f8743j)) {
                    C2515o2.this.f8746m.mo6699c(C2515o2.this.f8743j);
                } else {
                    C2515o2.this.f8746m.mo6701e();
                }
            }
        }

        @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1483c
        /* renamed from: b */
        public void mo6706b() {
            C2515o2.this.f8751r.setVisibility(8);
            C2515o2 o2Var = C2515o2.this;
            if (!o2Var.f8741h || !o2Var.f8735b.mo8649b() || C2515o2.this.f8743j == null) {
                C2515o2.this.f8746m.mo6698b();
                return;
            }
            C2515o2.this.f8735b.mo8648a();
            C2515o2.this.mo8871w();
            C2515o2.this.m10878x(0);
        }

        @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1483c
        /* renamed from: c */
        public void mo6707c() {
            C2515o2.this.f8745l = null;
        }

        @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1483c
        /* renamed from: d */
        public void mo6708d() {
        }

        @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1483c
        /* renamed from: e */
        public void mo6709e() {
        }

        @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1483c
        /* renamed from: f */
        public void mo6710f(AbstractC1480c.EnumC1481a aVar) {
            C2515o2.this.f8751r.setVisibility(8);
            if (aVar == AbstractC1480c.EnumC1481a.NOT_PLAYABLE) {
                C2515o2.this.f8735b.mo8650c();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.o2$e */
    class C2520e implements AbstractC3441b {

        /* renamed from: com.digdroid.alman.dig.o2$e$a */
        class RunnableC2521a implements Runnable {

            /* renamed from: com.digdroid.alman.dig.o2$e$a$a */
            class RunnableC2522a implements Runnable {
                RunnableC2522a() {
                }

                public void run() {
                    C2515o2 o2Var = C2515o2.this;
                    if (o2Var.f8741h) {
                        o2Var.m10878x(0);
                    }
                }
            }

            RunnableC2521a() {
            }

            public void run() {
                C2515o2 o2Var = C2515o2.this;
                if (o2Var.f8741h) {
                    o2Var.f8747n.mo11452k(C2515o2.this.f8750q.getWidth(), C2515o2.this.f8750q.getHeight());
                    C2515o2.this.f8747n.post(new RunnableC2522a());
                }
            }
        }

        C2520e() {
        }

        @Override // p171fr.bmartel.youtubetv.p172g.AbstractC3441b
        /* renamed from: a */
        public void mo8877a(EnumC3449g gVar, long j, float f, float f2, C3447e eVar) {
            C2515o2 o2Var = C2515o2.this;
            if (o2Var.f8741h && gVar == EnumC3449g.PLAYING && o2Var.f8735b.mo8649b() && C2515o2.this.f8743j != null) {
                C2515o2 o2Var2 = C2515o2.this;
                o2Var2.f8745l = o2Var2.f8743j;
                C2515o2.this.f8735b.mo8648a();
                C2515o2.this.mo8871w();
                C2515o2.this.f8750q.post(new RunnableC2521a());
                C2515o2.this.f8751r.setVisibility(8);
            } else if (gVar == EnumC3449g.ENDED) {
                C2515o2.this.f8745l = null;
            }
        }

        @Override // p171fr.bmartel.youtubetv.p172g.AbstractC3441b
        /* renamed from: b */
        public void mo8878b(C3447e eVar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o2$f */
    public class C2523f {

        /* renamed from: a */
        AbstractC2524g f8767a;

        /* renamed from: b */
        int f8768b;

        /* renamed from: c */
        int f8769c;

        /* renamed from: d */
        boolean f8770d = false;

        /* renamed from: e */
        int f8771e = 1000;

        /* renamed from: f */
        boolean f8772f = false;

        /* renamed from: g */
        int f8773g;

        /* renamed from: h */
        int f8774h;

        /* renamed from: i */
        int f8775i;

        /* renamed from: j */
        int f8776j;

        C2523f() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.o2$g */
    public interface AbstractC2524g {
        /* renamed from: a */
        void mo8648a();

        /* renamed from: b */
        boolean mo8649b();

        /* renamed from: c */
        void mo8650c();
    }

    private C2515o2(Activity activity, int i, int i2, int i3, int i4) {
        this.f8739f = (MainActivity) activity;
        ViewStub viewStub = (ViewStub) activity.findViewById(i);
        if (viewStub != null) {
            viewStub.inflate();
        }
        this.f8749p = (FrameLayout) activity.findViewById(i2);
        this.f8752s = i3;
        this.f8753t = i4;
    }

    /* renamed from: m */
    public static synchronized void m10875m() {
        synchronized (C2515o2.class) {
            C2515o2 o2Var = f8733a;
            if (o2Var != null) {
                o2Var.f8741h = false;
                AbstractC1480c cVar = o2Var.f8746m;
                if (cVar != null) {
                    cVar.mo6697a();
                }
                YoutubeTvView youtubeTvView = f8733a.f8747n;
                if (youtubeTvView != null) {
                    youtubeTvView.mo11429b();
                }
                f8733a = null;
            }
        }
    }

    /* renamed from: o */
    public static synchronized C2515o2 m10876o(Activity activity, int i, int i2, int i3, int i4) {
        C2515o2 o2Var;
        synchronized (C2515o2.class) {
            if (f8733a == null) {
                f8733a = new C2515o2(activity, i, i2, i3, i4);
            }
            o2Var = f8733a;
        }
        return o2Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s */
    private void m10877s() {
        Handler handler;
        Runnable cVar;
        m10878x(4);
        this.f8751r.setVisibility(0);
        if (this.f8746m != null) {
            Handler handler2 = this.f8748o;
            if (handler2 == null) {
                this.f8748o = new Handler();
            } else {
                handler2.removeCallbacksAndMessages(null);
            }
            handler = this.f8748o;
            cVar = new RunnableC2517b();
        } else if (this.f8747n != null) {
            Handler handler3 = this.f8748o;
            if (handler3 == null) {
                this.f8748o = new Handler();
            } else {
                handler3.removeCallbacksAndMessages(null);
            }
            handler = this.f8748o;
            cVar = new RunnableC2518c();
        } else if (!this.f8742i) {
            this.f8742i = true;
            this.f8750q.setVisibility(4);
            C1485d r2 = C1485d.m7331r2();
            this.f8739f.mo2668C0().mo2729a().mo2871i(this.f8752s, r2).mo2634e();
            r2.mo6711q2("AIzaSyDGCqzc_ofIxkqj_pcbmg-CaCi0-rIa5-o", this);
            return;
        } else {
            return;
        }
        handler.postDelayed(cVar, (long) this.f8755v);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: x */
    private void m10878x(int i) {
        this.f8758y = i;
        if (this.f8756w == 0) {
            this.f8749p.setVisibility(i);
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1482b
    /* renamed from: a */
    public void mo6703a(AbstractC1480c.AbstractC1484d dVar, EnumC1479b bVar) {
        String str;
        this.f8742i = false;
        this.f8739f.findViewById(R.id.youtube_fragment).setVisibility(8);
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.f8747n == null) {
                m10878x(4);
                YoutubeTvView youtubeTvView = (YoutubeTvView) this.f8739f.findViewById(this.f8753t);
                this.f8747n = youtubeTvView;
                youtubeTvView.setLoop(false);
                this.f8747n.mo11428a(new C2520e());
            }
            if (this.f8741h && this.f8735b.mo8649b() && (str = this.f8743j) != null) {
                this.f8747n.mo11451h(str);
            }
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c.AbstractC1482b
    /* renamed from: b */
    public void mo6704b(AbstractC1480c.AbstractC1484d dVar, AbstractC1480c cVar, boolean z) {
        String str;
        this.f8746m = cVar;
        this.f8742i = false;
        cVar.mo6702f(new C2519d());
        if (this.f8741h && this.f8735b.mo8649b() && (str = this.f8743j) != null) {
            cVar.mo6699c(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8863l(AbstractC2531p1 p1Var) {
        if (this.f8756w == 0 && this.f8757x == 0) {
            this.f8759z = false;
            if (p1Var == this.f8736c) {
                this.f8749p.setVisibility(this.f8758y);
            }
            String str = this.f8744k;
            if (str != null) {
                mo8868t(str);
                this.f8744k = null;
            }
        } else if (!this.f8759z) {
            this.f8759z = true;
            this.f8749p.setVisibility(8);
        }
    }

    /* renamed from: n */
    public C2523f mo8864n() {
        return new C2523f();
    }

    /* renamed from: p */
    public void mo8865p() {
        Handler handler = this.f8748o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        mo8867r();
        m10878x(4);
        this.f8751r.setVisibility(8);
    }

    /* renamed from: q */
    public void mo8866q(AbstractC2531p1 p1Var, int i) {
        this.f8756w = i;
        mo8863l(p1Var);
    }

    /* renamed from: r */
    public void mo8867r() {
        AbstractC1480c cVar = this.f8746m;
        if (cVar != null && cVar.mo6700d()) {
            this.f8746m.mo6698b();
        }
        YoutubeTvView youtubeTvView = this.f8747n;
        if (youtubeTvView != null) {
            youtubeTvView.mo11432f();
        }
    }

    /* renamed from: t */
    public boolean mo8868t(String str) {
        int i;
        String str2;
        mo8865p();
        this.f8734A = (str == null || (str2 = this.f8745l) == null || !str.equals(str2)) ? false : true;
        this.f8743j = str;
        if (str == null || !this.f8735b.mo8649b() || (i = this.f8740g) == 8) {
            return false;
        }
        if (!this.f8754u && i != 1 && i != 9) {
            return false;
        }
        if (this.f8759z) {
            this.f8744k = str;
            return true;
        }
        this.f8750q.post(new RunnableC2516a());
        return true;
    }

    /* renamed from: u */
    public void mo8869u(AbstractC2531p1 p1Var) {
        if (p1Var == this.f8736c) {
            Handler handler = this.f8748o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f8748o = null;
            }
            mo8867r();
            m10878x(8);
            this.f8742i = false;
        }
    }

    /* renamed from: v */
    public void mo8870v(AbstractC2531p1 p1Var, C2523f fVar) {
        this.f8736c = p1Var;
        View F0 = p1Var.mo2505F0();
        this.f8738e = F0;
        this.f8737d = fVar;
        this.f8735b = fVar.f8767a;
        this.f8750q = (RelativeLayout) F0.findViewById(fVar.f8768b);
        this.f8751r = (RelativeLayout) this.f8738e.findViewById(this.f8737d.f8769c);
        mo8872y(this.f8737d.f8770d);
        this.f8755v = this.f8737d.f8771e;
        mo8871w();
    }

    /* renamed from: w */
    public void mo8871w() {
        if (this.f8737d.f8772f && !(this.f8750q.getWidth() == this.f8737d.f8775i && this.f8750q.getHeight() == this.f8737d.f8776j)) {
            this.f8737d.f8772f = false;
        }
        if (!this.f8737d.f8772f) {
            int[] iArr = new int[2];
            this.f8750q.getLocationOnScreen(iArr);
            C2523f fVar = this.f8737d;
            fVar.f8774h = iArr[0];
            fVar.f8773g = iArr[1];
            fVar.f8775i = this.f8750q.getWidth();
            this.f8737d.f8776j = this.f8750q.getHeight();
            this.f8737d.f8772f = true;
        }
        Point i1 = this.f8739f.mo8205i1();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8749p.getLayoutParams();
        C2523f fVar2 = this.f8737d;
        layoutParams.leftMargin = fVar2.f8774h - i1.x;
        layoutParams.topMargin = fVar2.f8773g - i1.y;
        layoutParams.width = fVar2.f8775i;
        layoutParams.height = fVar2.f8776j;
    }

    /* renamed from: y */
    public void mo8872y(boolean z) {
        this.f8754u = z;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f8739f.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        this.f8740g = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting() ? activeNetworkInfo.getType() : 8;
    }

    /* renamed from: z */
    public void mo8873z(AbstractC2531p1 p1Var, int i) {
        this.f8757x = i;
        mo8863l(p1Var);
    }
}
