package com.digdroid.alman.dig;

import android.database.Cursor;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C0726h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p069c.p111c.p112a.p113a.p115b.C1537a;
import p069c.p111c.p112a.p113a.p115b.C1538b;
import p069c.p111c.p112a.p113a.p115b.C1541e;
import p069c.p111c.p112a.p113a.p115b.C1545i;
import p069c.p111c.p112a.p113a.p116c.C1546a;

/* renamed from: com.digdroid.alman.dig.e2 */
public class C2267e2 {

    /* renamed from: A */
    boolean f8085A = false;

    /* renamed from: B */
    long f8086B = 0;

    /* renamed from: a */
    AbstractC2286s f8087a;

    /* renamed from: b */
    AbstractC2289v f8088b;

    /* renamed from: c */
    AbstractC2290w f8089c;

    /* renamed from: d */
    AbstractC2291x f8090d = null;

    /* renamed from: e */
    MainActivity f8091e;

    /* renamed from: f */
    GridView f8092f = null;

    /* renamed from: g */
    MyListView f8093g = null;

    /* renamed from: h */
    AbsListView f8094h = null;

    /* renamed from: i */
    MyCarouselView f8095i = null;

    /* renamed from: j */
    MyRecyclerView f8096j = null;

    /* renamed from: k */
    RecyclerView f8097k = null;

    /* renamed from: l */
    LinearLayoutManager f8098l;

    /* renamed from: m */
    C0726h f8099m;

    /* renamed from: n */
    C2453k2 f8100n;

    /* renamed from: o */
    View f8101o = null;

    /* renamed from: p */
    C2219c3 f8102p;

    /* renamed from: q */
    boolean f8103q = false;

    /* renamed from: r */
    ScaleGestureDetector f8104r;

    /* renamed from: s */
    boolean f8105s = false;

    /* renamed from: t */
    boolean f8106t = false;

    /* renamed from: u */
    boolean f8107u = false;

    /* renamed from: v */
    boolean f8108v;

    /* renamed from: w */
    boolean f8109w = false;

    /* renamed from: x */
    int f8110x = 0;

    /* renamed from: y */
    private boolean f8111y = false;

    /* renamed from: z */
    private boolean f8112z = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$a */
    public class C2268a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2289v f8113b;

        C2268a(AbstractC2289v vVar) {
            this.f8113b = vVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f8113b.mo8404a(view, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$b */
    public class C2269b implements C1546a.AbstractC1553g {

        /* renamed from: a */
        final /* synthetic */ AbstractC2289v f8115a;

        C2269b(AbstractC2289v vVar) {
            this.f8115a = vVar;
        }

        @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1553g
        /* renamed from: a */
        public void mo6857a(RecyclerView.AbstractC0658g gVar, View view, int i, int i2) {
            this.f8115a.mo8404a(view, C2267e2.this.f8087a.mo8387l() ? i : C2267e2.this.f8095i.getCurrentPosition());
            if (!C2267e2.this.f8087a.mo8387l() && C2267e2.this.f8095i.getCurrentPosition() != i) {
                MyCarouselView myCarouselView = C2267e2.this.f8095i;
                myCarouselView.mo3233k1(myCarouselView.getCurrentPosition());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$c */
    public class C2270c implements AdapterView.OnItemLongClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC2290w f8117a;

        C2270c(AbstractC2290w wVar) {
            this.f8117a = wVar;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (!C2267e2.this.f8102p.mo8196t()) {
                return this.f8117a.mo8405a(view, i);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$d */
    public class C2271d implements C1546a.AbstractC1554h {

        /* renamed from: a */
        final /* synthetic */ AbstractC2290w f8119a;

        C2271d(AbstractC2290w wVar) {
            this.f8119a = wVar;
        }

        @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1554h
        /* renamed from: a */
        public boolean mo6858a(RecyclerView.AbstractC0658g gVar, View view, int i, int i2) {
            if (!C2267e2.this.f8102p.mo8196t()) {
                return this.f8119a.mo8405a(view, C2267e2.this.f8095i.getCurrentPosition());
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$e */
    public class RunnableC2272e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C2252d2 f8121b;

        RunnableC2272e(C2252d2 d2Var) {
            this.f8121b = d2Var;
        }

        public void run() {
            C2267e2.this.f8095i.setAdapter(this.f8121b.f8049b);
            C2267e2.this.f8095i.mo3233k1(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$f */
    public class RunnableC2273f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C2252d2 f8123b;

        RunnableC2273f(C2252d2 d2Var) {
            this.f8123b = d2Var;
        }

        public void run() {
            C2267e2.this.f8096j.setAdapter(this.f8123b.f8049b);
            C2267e2.this.f8096j.mo3233k1(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$g */
    public class RunnableC2274g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Cursor f8125b;

        RunnableC2274g(Cursor cursor) {
            this.f8125b = cursor;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                com.digdroid.alman.dig.e2 r0 = com.digdroid.alman.dig.C2267e2.this
                int r0 = r0.mo8321f()
                com.digdroid.alman.dig.e2 r1 = com.digdroid.alman.dig.C2267e2.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.f8097k
                r2 = 0
                r1.mo3233k1(r2)
                com.digdroid.alman.dig.e2 r1 = com.digdroid.alman.dig.C2267e2.this
                com.digdroid.alman.dig.MyCarouselView r3 = r1.f8095i
                if (r3 == 0) goto L_0x001b
                androidx.recyclerview.widget.RecyclerView$g r1 = r3.getAdapter()
            L_0x0018:
                com.digdroid.alman.dig.h r1 = (com.digdroid.alman.dig.AbstractC2365h) r1
                goto L_0x0025
            L_0x001b:
                com.digdroid.alman.dig.MyRecyclerView r1 = r1.f8096j
                if (r1 == 0) goto L_0x0024
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.getAdapter()
                goto L_0x0018
            L_0x0024:
                r1 = 0
            L_0x0025:
                android.database.Cursor r3 = r4.f8125b
                r1.mo8523u(r3)
                int r3 = r1.mo3580c()
                if (r0 < r3) goto L_0x003a
                int r0 = r1.mo3580c()
                int r0 = r0 + -1
                int r0 = java.lang.Math.max(r0, r2)
            L_0x003a:
                com.digdroid.alman.dig.e2 r1 = com.digdroid.alman.dig.C2267e2.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.f8097k
                r1.mo3233k1(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2267e2.RunnableC2274g.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$h */
    public class RunnableC2275h implements Runnable {
        RunnableC2275h() {
        }

        public void run() {
            C2267e2 e2Var = C2267e2.this;
            e2Var.f8089c.mo8405a(null, e2Var.mo8321f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$i */
    public class RunnableC2276i implements Runnable {
        RunnableC2276i() {
        }

        public void run() {
            C2267e2 e2Var = C2267e2.this;
            e2Var.f8088b.mo8404a(null, e2Var.mo8321f());
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$j */
    class C2277j implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2286s f8129b;

        /* renamed from: c */
        final /* synthetic */ MainActivity f8130c;

        C2277j(AbstractC2286s sVar, MainActivity mainActivity) {
            this.f8129b = sVar;
            this.f8130c = mainActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (!this.f8129b.mo8387l() && C2267e2.this.mo8324i()) {
                if (C2267e2.this.f8101o != null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f8130c, R.anim.scale_out_tv);
                    C2267e2.this.f8101o.startAnimation(loadAnimation);
                    loadAnimation.setFillAfter(true);
                }
                if (view != null) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f8130c, R.anim.scale_in_tv);
                    view.startAnimation(loadAnimation2);
                    loadAnimation2.setFillAfter(true);
                }
            }
            C2267e2 e2Var = C2267e2.this;
            e2Var.f8101o = view;
            AbstractC2291x xVar = e2Var.f8090d;
            if (xVar != null) {
                xVar.mo8406a(view, i);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$k */
    class C2278k implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2286s f8132b;

        /* renamed from: c */
        final /* synthetic */ MainActivity f8133c;

        C2278k(AbstractC2286s sVar, MainActivity mainActivity) {
            this.f8132b = sVar;
            this.f8133c = mainActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (!this.f8132b.mo8387l()) {
                if (C2267e2.this.f8101o != null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f8133c, R.anim.scale_out_tv);
                    C2267e2.this.f8101o.startAnimation(loadAnimation);
                    loadAnimation.setFillAfter(true);
                }
                if (view != null) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f8133c, R.anim.scale_in_tv);
                    view.startAnimation(loadAnimation2);
                    loadAnimation2.setFillAfter(true);
                }
            }
            C2267e2 e2Var = C2267e2.this;
            e2Var.f8101o = view;
            AbstractC2291x xVar = e2Var.f8090d;
            if (xVar != null) {
                xVar.mo8406a(view, i);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$l */
    class View$OnTouchListenerC2279l implements View.OnTouchListener {
        View$OnTouchListenerC2279l() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ScaleGestureDetector scaleGestureDetector;
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 1) {
                C2267e2 e2Var = C2267e2.this;
                if (e2Var.f8103q) {
                    e2Var.f8103q = false;
                    return true;
                }
            }
            C2219c3 c3Var = C2267e2.this.f8102p;
            if (!(c3Var == null || c3Var.mo8196t() || (scaleGestureDetector = C2267e2.this.f8104r) == null)) {
                scaleGestureDetector.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$m */
    class C2280m implements AbsListView.OnScrollListener {
        C2280m() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            C2267e2.this.f8110x = i;
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            C2267e2 e2Var = C2267e2.this;
            e2Var.f8110x = e2Var.f8094h.getFirstVisiblePosition();
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$n */
    class C2281n extends C1546a.AbstractC1556j {
        C2281n() {
        }

        @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1556j
        /* renamed from: d */
        public void mo6864d(C1546a aVar, int i) {
            C2267e2 e2Var;
            AbstractC2291x xVar;
            super.mo6864d(aVar, i);
            if (i == 0) {
                C2267e2 e2Var2 = C2267e2.this;
                AbstractC2291x xVar2 = e2Var2.f8090d;
                if (xVar2 != null) {
                    xVar2.mo8406a(null, e2Var2.mo8321f());
                }
                C2267e2 e2Var3 = C2267e2.this;
                if (e2Var3.f8109w) {
                    e2Var3.f8109w = false;
                } else if (!e2Var3.f8108v && !e2Var3.f8107u) {
                    e2Var3.mo8328m();
                }
            } else if (i == 2 && (xVar = (e2Var = C2267e2.this).f8090d) != null) {
                xVar.mo8406a(null, e2Var.mo8321f());
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$o */
    class C2282o extends RecyclerView.AbstractC0678t {
        C2282o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: a */
        public void mo4177a(RecyclerView recyclerView, int i) {
            C2267e2 e2Var;
            AbstractC2291x xVar;
            super.mo4177a(C2267e2.this.f8096j, i);
            if (i == 0) {
                C2267e2 e2Var2 = C2267e2.this;
                AbstractC2291x xVar2 = e2Var2.f8090d;
                if (xVar2 != null) {
                    xVar2.mo8406a(null, e2Var2.mo8321f());
                }
                C2267e2 e2Var3 = C2267e2.this;
                if (e2Var3.f8109w) {
                    e2Var3.f8109w = false;
                }
            } else if (i == 2 && (xVar = (e2Var = C2267e2.this).f8090d) != null) {
                xVar.mo8406a(null, e2Var.mo8321f());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$p */
    public class RunnableC2283p implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f8139b;

        /* renamed from: c */
        final /* synthetic */ boolean f8140c;

        RunnableC2283p(int i, boolean z) {
            this.f8139b = i;
            this.f8140c = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                int r0 = r3.f8139b
                com.digdroid.alman.dig.e2 r1 = com.digdroid.alman.dig.C2267e2.this
                com.digdroid.alman.dig.MyCarouselView r2 = r1.f8095i
                if (r2 == 0) goto L_0x000f
                androidx.recyclerview.widget.RecyclerView$g r1 = r2.getAdapter()
            L_0x000c:
                com.digdroid.alman.dig.h r1 = (com.digdroid.alman.dig.AbstractC2365h) r1
                goto L_0x0019
            L_0x000f:
                com.digdroid.alman.dig.MyRecyclerView r1 = r1.f8096j
                if (r1 == 0) goto L_0x0018
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.getAdapter()
                goto L_0x000c
            L_0x0018:
                r1 = 0
            L_0x0019:
                if (r1 == 0) goto L_0x003c
                int r1 = r1.mo3580c()
                if (r0 < r1) goto L_0x0028
                int r1 = r1 + -1
                r0 = 0
                int r0 = java.lang.Math.max(r1, r0)
            L_0x0028:
                boolean r1 = r3.f8140c
                if (r1 == 0) goto L_0x0033
                com.digdroid.alman.dig.e2 r1 = com.digdroid.alman.dig.C2267e2.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.f8097k
                r1.mo3233k1(r0)
            L_0x0033:
                com.digdroid.alman.dig.e2 r1 = com.digdroid.alman.dig.C2267e2.this
                com.digdroid.alman.dig.MyRecyclerView r2 = r1.f8096j
                if (r2 == 0) goto L_0x003c
                r1.mo8316A(r0)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2267e2.RunnableC2283p.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$q */
    public class RunnableC2284q implements Runnable {
        RunnableC2284q() {
        }

        public void run() {
            C2267e2 e2Var = C2267e2.this;
            View c = e2Var.mo8319c(e2Var.f8094h.getSelectedItemPosition() - C2267e2.this.f8094h.getFirstVisiblePosition());
            if (c != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(C2267e2.this.f8091e, R.anim.scale_in_tv);
                c.startAnimation(loadAnimation);
                loadAnimation.setFillAfter(true);
                C2267e2.this.f8101o = c;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$r */
    public class RunnableC2285r implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f8143b;

        RunnableC2285r(int i) {
            this.f8143b = i;
        }

        public void run() {
            View F = C2267e2.this.f8098l.mo3728F(this.f8143b);
            if (F != null) {
                C2267e2 e2Var = C2267e2.this;
                int[] c = e2Var.f8099m.mo4430c(e2Var.f8098l, F);
                if (c[0] != 0 || c[1] != 0) {
                    C2267e2.this.f8096j.mo3878o1(c[0], c[1]);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$s */
    public interface AbstractC2286s {
        /* renamed from: A */
        void mo8359A(float f);

        /* renamed from: B */
        void mo8360B();

        /* renamed from: C */
        void mo8361C(float f);

        /* renamed from: D */
        boolean mo8362D();

        /* renamed from: E */
        float mo8363E();

        /* renamed from: F */
        void mo8364F(float f);

        /* renamed from: G */
        int[] mo8365G();

        /* renamed from: H */
        void mo8366H(float f);

        /* renamed from: I */
        void mo8367I(float f);

        /* renamed from: J */
        void mo8368J(float f);

        /* renamed from: K */
        void mo8369K(float f);

        /* renamed from: L */
        float mo8370L();

        /* renamed from: M */
        float mo8371M();

        /* renamed from: N */
        void mo8372N(float f);

        /* renamed from: O */
        void mo8373O(float f);

        /* renamed from: P */
        double mo8374P();

        /* renamed from: Q */
        String mo8375Q();

        /* renamed from: S */
        float mo8376S();

        /* renamed from: T */
        void mo8377T(float f);

        /* renamed from: U */
        void mo8378U(double d);

        /* renamed from: V */
        float mo8379V();

        /* renamed from: W */
        float mo8380W();

        /* renamed from: e */
        void mo8381e();

        /* renamed from: g */
        Point mo8382g(boolean z);

        /* renamed from: h */
        float mo8383h();

        /* renamed from: i */
        void mo8384i();

        /* renamed from: j */
        void mo8385j();

        /* renamed from: k */
        float mo8386k();

        /* renamed from: l */
        boolean mo8387l();

        /* renamed from: m */
        float mo8388m();

        /* renamed from: o */
        float mo8389o();

        /* renamed from: p */
        float mo8390p();

        /* renamed from: q */
        void mo8391q(float f);

        /* renamed from: r */
        void mo8392r(float f);

        /* renamed from: u */
        void mo8393u(float f);

        /* renamed from: v */
        void mo8394v(float f);

        /* renamed from: x */
        float mo8395x();

        /* renamed from: y */
        float mo8396y();

        /* renamed from: z */
        float mo8397z();
    }

    /* renamed from: com.digdroid.alman.dig.e2$t */
    class C2287t extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C2287t() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector.getCurrentSpanX() > scaleGestureDetector.getCurrentSpanY()) {
                C2267e2.this.mo8330o(scaleGestureDetector.getScaleFactor());
                return true;
            }
            C2267e2.this.mo8331p(scaleGestureDetector.getScaleFactor());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C2267e2.this.f8103q = true;
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.e2$u */
    class C2288u extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C2288u() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (scaleGestureDetector.getCurrentSpanX() > scaleGestureDetector.getCurrentSpanY()) {
                C2267e2.this.mo8330o(scaleFactor);
                return true;
            }
            C2267e2.this.mo8331p(scaleFactor);
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C2267e2.this.f8103q = true;
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$v */
    public interface AbstractC2289v {
        /* renamed from: a */
        void mo8404a(View view, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$w */
    public interface AbstractC2290w {
        /* renamed from: a */
        boolean mo8405a(View view, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.e2$x */
    public interface AbstractC2291x {
        /* renamed from: a */
        void mo8406a(View view, int i);
    }

    public C2267e2(MainActivity mainActivity, View view, String str, AbstractC2286s sVar) {
        MyCarouselView myCarouselView;
        float L;
        this.f8091e = mainActivity;
        this.f8087a = sVar;
        this.f8102p = C2219c3.m9805k(mainActivity);
        if (str.equals("list")) {
            this.f8093g = (MyListView) view.findViewById(R.id.game_list);
            if (sVar.mo8375Q().equals("vertical")) {
                mo8334s();
            }
            this.f8094h = this.f8093g;
            if (!this.f8102p.mo8196t()) {
                this.f8104r = new ScaleGestureDetector(mainActivity, new C2287t());
            }
            this.f8093g.setOnItemSelectedListener(new C2277j(sVar, mainActivity));
        } else if (str.equals("grid")) {
            GridView gridView = (GridView) view.findViewById(R.id.main_grid);
            this.f8092f = gridView;
            this.f8094h = gridView;
            if (!this.f8102p.mo8196t()) {
                this.f8104r = new ScaleGestureDetector(mainActivity, new C2288u());
            }
            this.f8092f.setColumnWidth(Math.round(C2553q3.m11118d((float) sVar.mo8374P())));
            this.f8092f.setVerticalSpacing(Math.round(C2553q3.m11119e(this.f8102p.mo8183f("vertical_spacing", 36.0f))));
            this.f8092f.setOnItemSelectedListener(new C2278k(sVar, mainActivity));
        } else {
            if (str.equals("carousel")) {
                MyCarouselView myCarouselView2 = (MyCarouselView) view.findViewById(R.id.my_recycler_view);
                this.f8095i = myCarouselView2;
                this.f8097k = myCarouselView2;
                C1538b bVar = new C1538b();
                Point g = sVar.mo8382g(false);
                MyCarouselView myCarouselView3 = this.f8095i;
                double d = (double) g.y;
                Double.isNaN(d);
                myCarouselView3.setPadding(0, 0, 0, (int) Math.round(d / 4.5d));
                double d2 = (double) g.y;
                Double.isNaN(d2);
                double d3 = (double) g.x;
                Double.isNaN(d3);
                bVar.mo6835e(Math.min((d2 * 1.1d) / d3, 0.8d));
                this.f8095i.setTransformer(bVar);
                myCarouselView = this.f8095i;
                L = sVar.mo8396y();
            } else if (str.equals("coverflow")) {
                MyCarouselView myCarouselView4 = (MyCarouselView) view.findViewById(R.id.my_recycler_view);
                this.f8095i = myCarouselView4;
                this.f8097k = myCarouselView4;
                this.f8095i.setTransformer(new C1537a());
                myCarouselView = this.f8095i;
                L = sVar.mo8390p();
            } else if (str.equals("wheel")) {
                MyCarouselView myCarouselView5 = (MyCarouselView) view.findViewById(R.id.my_recycler_view);
                this.f8095i = myCarouselView5;
                this.f8097k = myCarouselView5;
                C1545i iVar = new C1545i();
                Point g2 = sVar.mo8382g(false);
                MyCarouselView myCarouselView6 = this.f8095i;
                double d4 = (double) g2.y;
                Double.isNaN(d4);
                myCarouselView6.setPadding(0, 0, 0, (int) Math.round(d4 / 4.5d));
                this.f8095i.setTransformer(iVar);
                myCarouselView = this.f8095i;
                L = sVar.mo8371M();
            } else if (str.equals("linear")) {
                MyCarouselView myCarouselView7 = (MyCarouselView) view.findViewById(R.id.my_recycler_view);
                this.f8095i = myCarouselView7;
                this.f8097k = myCarouselView7;
                this.f8095i.setTransformer(new C1541e());
                myCarouselView = this.f8095i;
                L = sVar.mo8370L();
            } else if (str.equals("vertical")) {
                MyRecyclerView myRecyclerView = (MyRecyclerView) view.findViewById(R.id.game_list);
                this.f8096j = myRecyclerView;
                myRecyclerView.mo7948A1(C2185a4.m9681k(mainActivity));
                this.f8097k = this.f8096j;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mainActivity);
                this.f8098l = linearLayoutManager;
                this.f8096j.setLayoutManager(linearLayoutManager);
                this.f8096j.setHasFixedSize(true);
                while (this.f8096j.getItemDecorationCount() > 0) {
                    this.f8096j.mo3812Z0(0);
                }
                C2453k2 k2Var = new C2453k2(sVar.mo8376S(), sVar.mo8363E(), sVar.mo8365G());
                this.f8100n = k2Var;
                this.f8096j.mo3859h(k2Var);
                this.f8096j.setOnFlingListener(null);
                C0726h hVar = new C0726h();
                this.f8099m = hVar;
                hVar.mo4477b(this.f8096j);
            }
            myCarouselView.setYTranslation(2.0f - L);
        }
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            absListView.setOnTouchListener(new View$OnTouchListenerC2279l());
            this.f8094h.setOnScrollListener(new C2280m());
            return;
        }
        MyCarouselView myCarouselView8 = this.f8095i;
        if (myCarouselView8 != null) {
            myCarouselView8.setGravity(17);
            this.f8095i.setClipChildren(false);
            this.f8095i.setClipToPadding(false);
            this.f8095i.mo6842T1(new C2281n());
        } else {
            MyRecyclerView myRecyclerView2 = this.f8096j;
            if (myRecyclerView2 != null) {
                myRecyclerView2.setClipChildren(false);
                this.f8096j.setClipToPadding(false);
                this.f8096j.setOnScrollListener(new C2282o());
            } else {
                return;
            }
        }
        mo8328m();
    }

    /* renamed from: e */
    public static View m10028e(LayoutInflater layoutInflater, ViewGroup viewGroup, String str) {
        int i;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1984141450:
                if (str.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case 2908512:
                if (str.equals("carousel")) {
                    c = 2;
                    break;
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    c = 3;
                    break;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    c = 4;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 5;
                    break;
                }
                break;
            case 113097563:
                if (str.equals("wheel")) {
                    c = 6;
                    break;
                }
                break;
            case 1980277093:
                if (str.equals("coverflow")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = R.layout.games_vertical;
                break;
            case 1:
            case 2:
            case 6:
            case 7:
                i = R.layout.carousel_layout;
                break;
            case 3:
                i = R.layout.activity_main;
                break;
            case 4:
            case 5:
                i = R.layout.game_list;
                break;
            default:
                return null;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo8316A(int i) {
        MyRecyclerView myRecyclerView = this.f8096j;
        if (myRecyclerView != null) {
            myRecyclerView.post(new RunnableC2285r(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo8317a(float f, float f2) {
        return ((double) f2) >= 1.0d ? Math.min(f + ((f2 - 1.0f) / 2.0f), 2.0f) : Math.max(f + ((1.0f - (1.0f / f2)) / 2.0f), 0.0f);
    }

    /* renamed from: b */
    public synchronized void mo8318b(Cursor cursor) {
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            ((CursorAdapter) absListView.getAdapter()).changeCursor(cursor);
        } else {
            RecyclerView recyclerView = this.f8097k;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC2274g(cursor));
            }
        }
    }

    /* renamed from: c */
    public View mo8319c(int i) {
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            return absListView.getChildAt(i);
        }
        RecyclerView recyclerView = this.f8097k;
        if (recyclerView != null) {
            return recyclerView.getChildAt(i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[SYNTHETIC, Splitter:B:12:0x0026] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8320d(int r4) {
        /*
            r3 = this;
            android.widget.AbsListView r0 = r3.f8094h
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.widget.Adapter r0 = r0.getAdapter()
            com.digdroid.alman.dig.q1 r0 = (com.digdroid.alman.dig.AbstractC2551q1) r0
            if (r0 == 0) goto L_0x0023
            android.database.Cursor r0 = r0.getCursor()
            goto L_0x0024
        L_0x0012:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8097k
            if (r0 == 0) goto L_0x0023
            androidx.recyclerview.widget.RecyclerView$g r0 = r0.getAdapter()
            com.digdroid.alman.dig.h r0 = (com.digdroid.alman.dig.AbstractC2365h) r0
            if (r0 == 0) goto L_0x0023
            android.database.Cursor r0 = r0.mo8525w()
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0039
            boolean r2 = r0.isClosed()     // Catch:{ Exception -> 0x0039 }
            if (r2 != 0) goto L_0x0039
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0039 }
            if (r4 >= r2) goto L_0x0039
            boolean r4 = r0.moveToPosition(r4)     // Catch:{ Exception -> 0x0039 }
            if (r4 == 0) goto L_0x0039
            return r0
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2267e2.mo8320d(int):java.lang.Object");
    }

    /* renamed from: f */
    public int mo8321f() {
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            int selectedItemPosition = absListView.getSelectedItemPosition();
            if (selectedItemPosition != -1) {
                return selectedItemPosition;
            }
        } else {
            MyCarouselView myCarouselView = this.f8095i;
            if (myCarouselView != null) {
                int currentPosition = myCarouselView.getCurrentPosition();
                if (currentPosition < 0) {
                    return 0;
                }
                return currentPosition;
            } else if (this.f8096j == null) {
                return 0;
            } else {
                int h2 = this.f8098l.mo3745h2();
                if (h2 != -1) {
                    int k2 = (this.f8098l.mo3746k2() - h2) + 1;
                    int height = this.f8096j.getHeight() / 2;
                    int i = 0;
                    int i2 = Integer.MAX_VALUE;
                    for (int i3 = 0; i3 < k2; i3++) {
                        View L = this.f8098l.mo4096L(i3);
                        if (L != null) {
                            int abs = Math.abs(L.getTop() - height) + Math.abs(L.getBottom() - height);
                            if (i2 > abs) {
                                i = i3 + h2;
                                i2 = abs;
                            }
                        }
                    }
                    return i;
                }
            }
        }
        return this.f8110x;
    }

    /* renamed from: g */
    public boolean mo8322g(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                switch (i) {
                    case 12:
                        this.f8111y = false;
                        return false;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        if (i2 == 1) {
                            this.f8111y = false;
                            return false;
                        }
                        break;
                }
            } else if (i2 == 0) {
                if (!this.f8111y) {
                    return false;
                }
                this.f8112z = true;
                return true;
            } else if (i2 != 1 || !this.f8112z) {
                return false;
            } else {
                this.f8112z = false;
                if (this.f8096j == null) {
                    mo8328m();
                }
                return true;
            }
        } else if (this.f8097k != null && !this.f8107u && !this.f8108v) {
            if (i2 == 0) {
                if (this.f8086B == 0) {
                    this.f8086B = System.currentTimeMillis();
                }
            } else if (i2 == 1) {
                mo8327l(System.currentTimeMillis() - this.f8086B >= 1000 ? new RunnableC2275h() : new RunnableC2276i());
                this.f8086B = 0;
            }
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        int i3 = 10;
        if (this.f8094h != null) {
            if (mo8325j()) {
                i3 = this.f8092f.getNumColumns() * 10;
            }
            int selectedItemPosition = this.f8094h.getSelectedItemPosition();
            if (i == 8) {
                this.f8111y = true;
                if (!this.f8112z) {
                    return false;
                }
                this.f8094h.setSelection(Math.max(selectedItemPosition - i3, 0));
                return true;
            } else if (i != 9) {
                return false;
            } else {
                this.f8111y = true;
                if (!this.f8112z) {
                    return false;
                }
                AbstractC2551q1 q1Var = (AbstractC2551q1) this.f8094h.getAdapter();
                if (q1Var != null) {
                    this.f8094h.setSelection(Math.min(selectedItemPosition + i3, q1Var.getCount() - 1));
                }
                return true;
            }
        } else {
            MyCarouselView myCarouselView = this.f8095i;
            if (myCarouselView != null) {
                int currentPosition = myCarouselView.getCurrentPosition();
                switch (i) {
                    case 8:
                        this.f8108v = false;
                        boolean z = this.f8105s;
                        this.f8107u = z;
                        if (z) {
                            this.f8087a.mo8381e();
                        }
                        return false;
                    case 9:
                        this.f8107u = false;
                        boolean z2 = this.f8106t;
                        this.f8108v = z2;
                        if (z2) {
                            this.f8087a.mo8381e();
                        }
                        return false;
                    case 10:
                        if (this.f8107u || this.f8108v) {
                            return false;
                        }
                        if (this.f8112z) {
                            int max = Math.max(currentPosition - 10, 0);
                            this.f8095i.mo3233k1(max);
                            AbstractC2291x xVar = this.f8090d;
                            if (xVar != null) {
                                xVar.mo8406a(null, max);
                            }
                        } else if (currentPosition > 0) {
                            int i4 = currentPosition - 1;
                            this.f8095i.mo3237s1(i4);
                            AbstractC2291x xVar2 = this.f8090d;
                            if (xVar2 != null) {
                                xVar2.mo8406a(null, i4);
                            }
                        }
                        this.f8111y = true;
                        return true;
                    case 11:
                        if (this.f8107u || this.f8108v) {
                            return false;
                        }
                        AbstractC2365h hVar = (AbstractC2365h) this.f8095i.getAdapter();
                        if (hVar != null) {
                            int c = hVar.mo3580c();
                            if (this.f8112z) {
                                int min = Math.min(currentPosition + 10, c - 1);
                                this.f8095i.mo3233k1(min);
                                AbstractC2291x xVar3 = this.f8090d;
                                if (xVar3 != null) {
                                    xVar3.mo8406a(null, min);
                                }
                            } else {
                                int i5 = currentPosition + 1;
                                if (i5 < c) {
                                    this.f8095i.mo3237s1(i5);
                                    AbstractC2291x xVar4 = this.f8090d;
                                    if (xVar4 != null) {
                                        xVar4.mo8406a(null, i5);
                                    }
                                }
                            }
                            this.f8111y = true;
                        }
                        return true;
                    case 12:
                        this.f8109w = true;
                        return false;
                }
            } else if (this.f8096j != null) {
                int f = mo8321f();
                switch (i) {
                    case 8:
                        boolean z3 = this.f8108v;
                        this.f8108v = false;
                        if (z3) {
                            mo8328m();
                            return true;
                        } else if (f == 0) {
                            boolean z4 = this.f8105s;
                            this.f8107u = z4;
                            if (z4) {
                                this.f8087a.mo8381e();
                            }
                            return false;
                        } else {
                            this.f8107u = false;
                            if (this.f8112z) {
                                int max2 = Math.max(f - 10, 0);
                                this.f8096j.mo3233k1(max2);
                                mo8316A(max2);
                                AbstractC2291x xVar5 = this.f8090d;
                                if (xVar5 != null) {
                                    xVar5.mo8406a(null, max2);
                                }
                            } else {
                                int i6 = f - 1;
                                mo8316A(i6);
                                AbstractC2291x xVar6 = this.f8090d;
                                if (xVar6 != null) {
                                    xVar6.mo8406a(null, i6);
                                }
                            }
                            this.f8111y = true;
                            return true;
                        }
                    case 9:
                        if (this.f8107u) {
                            this.f8107u = false;
                            mo8328m();
                            return true;
                        }
                        AbstractC2365h hVar2 = (AbstractC2365h) this.f8096j.getAdapter();
                        if (hVar2 == null) {
                            return false;
                        }
                        if (f == hVar2.mo3580c() - 1) {
                            this.f8107u = false;
                            boolean z5 = this.f8106t;
                            this.f8108v = z5;
                            if (z5) {
                                this.f8087a.mo8381e();
                            }
                        } else {
                            this.f8108v = false;
                            this.f8107u = false;
                            int c2 = hVar2.mo3580c();
                            if (this.f8112z) {
                                int min2 = Math.min(f + 10, c2 - 1);
                                this.f8096j.mo3233k1(min2);
                                mo8316A(min2);
                                AbstractC2291x xVar7 = this.f8090d;
                                if (xVar7 != null) {
                                    xVar7.mo8406a(null, min2);
                                }
                            } else {
                                int i7 = f + 1;
                                if (i7 < c2) {
                                    mo8316A(i7);
                                    AbstractC2291x xVar8 = this.f8090d;
                                    if (xVar8 != null) {
                                        xVar8.mo8406a(null, i7);
                                    }
                                }
                            }
                            this.f8111y = true;
                        }
                        return true;
                    case 10:
                        if (!this.f8107u && !this.f8108v && this.f8102p.mo8180c("allow_paging", true)) {
                            this.f8087a.mo8385j();
                        }
                        return true;
                    case 11:
                        if (!this.f8107u && !this.f8108v && this.f8102p.mo8180c("allow_paging", true)) {
                            this.f8087a.mo8384i();
                        }
                        return true;
                    case 12:
                        this.f8109w = true;
                        return false;
                }
            }
            return false;
        }
    }

    /* renamed from: h */
    public void mo8323h() {
        if (mo8324i() && !this.f8087a.mo8387l()) {
            this.f8094h.post(new RunnableC2284q());
        }
    }

    /* renamed from: i */
    public boolean mo8324i() {
        return this.f8092f != null;
    }

    /* renamed from: j */
    public boolean mo8325j() {
        return this.f8092f != null;
    }

    /* renamed from: k */
    public boolean mo8326k() {
        return this.f8103q;
    }

    /* renamed from: l */
    public void mo8327l(Runnable runnable) {
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            absListView.post(runnable);
            return;
        }
        RecyclerView recyclerView = this.f8097k;
        if (recyclerView != null) {
            recyclerView.post(runnable);
        }
    }

    /* renamed from: m */
    public void mo8328m() {
        if (this.f8087a.mo8362D()) {
            AbsListView absListView = this.f8094h;
            if (absListView != null) {
                absListView.requestFocus();
                return;
            }
            RecyclerView recyclerView = this.f8097k;
            if (recyclerView != null) {
                recyclerView.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo8329n(float f, float f2) {
        float f3 = f * f2;
        if (f3 < 0.2f) {
            f3 = 0.2f;
        }
        if (f3 > 10.0f) {
            return 10.0f;
        }
        return f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8330o(float f) {
        String Q = this.f8087a.mo8375Q();
        Q.hashCode();
        char c = 65535;
        switch (Q.hashCode()) {
            case -1984141450:
                if (Q.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (Q.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case 2908512:
                if (Q.equals("carousel")) {
                    c = 2;
                    break;
                }
                break;
            case 3181382:
                if (Q.equals("grid")) {
                    c = 3;
                    break;
                }
                break;
            case 3322014:
                if (Q.equals("list")) {
                    c = 4;
                    break;
                }
                break;
            case 110371416:
                if (Q.equals("title")) {
                    c = 5;
                    break;
                }
                break;
            case 113097563:
                if (Q.equals("wheel")) {
                    c = 6;
                    break;
                }
                break;
            case 1980277093:
                if (Q.equals("coverflow")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                AbstractC2286s sVar = this.f8087a;
                sVar.mo8366H(mo8317a(sVar.mo8376S(), f));
                break;
            case 1:
                AbstractC2286s sVar2 = this.f8087a;
                sVar2.mo8369K(mo8329n(sVar2.mo8379V(), f));
                break;
            case 2:
                AbstractC2286s sVar3 = this.f8087a;
                sVar3.mo8361C(mo8329n(sVar3.mo8397z(), f));
                break;
            case 3:
                this.f8091e.getResources();
                AbstractC2286s sVar4 = this.f8087a;
                double P = sVar4.mo8374P();
                double d = (double) f;
                Double.isNaN(d);
                sVar4.mo8378U(Math.max(P * d, 30.0d));
                this.f8092f.setColumnWidth(Math.round(C2553q3.m11118d((float) this.f8087a.mo8374P())));
                break;
            case 4:
                AbstractC2286s sVar5 = this.f8087a;
                sVar5.mo8373O(mo8329n(sVar5.mo8386k(), f));
                break;
            case 5:
                AbstractC2286s sVar6 = this.f8087a;
                sVar6.mo8359A(mo8329n(sVar6.mo8383h(), f));
                break;
            case 6:
                AbstractC2286s sVar7 = this.f8087a;
                sVar7.mo8391q(mo8329n(sVar7.mo8395x(), f));
                break;
            case 7:
                AbstractC2286s sVar8 = this.f8087a;
                sVar8.mo8393u(mo8329n(sVar8.mo8380W(), f));
                break;
        }
        if (Q.equals("grid")) {
            this.f8092f.invalidate();
            return;
        }
        if (Q.equals("vertical")) {
            this.f8100n.mo8705k(this.f8087a.mo8376S(), this.f8087a.mo8363E());
        }
        this.f8087a.mo8360B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8331p(float f) {
        float a;
        String Q = this.f8087a.mo8375Q();
        Q.hashCode();
        char c = 65535;
        switch (Q.hashCode()) {
            case -1984141450:
                if (Q.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (Q.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case 2908512:
                if (Q.equals("carousel")) {
                    c = 2;
                    break;
                }
                break;
            case 3181382:
                if (Q.equals("grid")) {
                    c = 3;
                    break;
                }
                break;
            case 3322014:
                if (Q.equals("list")) {
                    c = 4;
                    break;
                }
                break;
            case 110371416:
                if (Q.equals("title")) {
                    c = 5;
                    break;
                }
                break;
            case 113097563:
                if (Q.equals("wheel")) {
                    c = 6;
                    break;
                }
                break;
            case 1980277093:
                if (Q.equals("coverflow")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                AbstractC2286s sVar = this.f8087a;
                sVar.mo8377T(mo8329n(sVar.mo8363E(), f));
                break;
            case 1:
                a = mo8317a(this.f8087a.mo8370L(), f);
                this.f8087a.mo8372N(a);
                this.f8095i.setYTranslation(2.0f - a);
                break;
            case 2:
                a = mo8317a(this.f8087a.mo8396y(), f);
                this.f8087a.mo8367I(a);
                this.f8095i.setYTranslation(2.0f - a);
                break;
            case 3:
                this.f8091e.getResources();
                float max = Math.max(Math.min(this.f8102p.mo8183f("vertical_spacing", 36.0f) * f, 100.0f), 0.2f);
                this.f8102p.mo8199w("vertical_spacing", max);
                this.f8092f.setVerticalSpacing(Math.round(C2553q3.m11119e(max)));
                break;
            case 4:
                AbstractC2286s sVar2 = this.f8087a;
                sVar2.mo8364F(mo8329n(sVar2.mo8388m(), f));
                break;
            case 5:
                AbstractC2286s sVar3 = this.f8087a;
                sVar3.mo8368J(mo8329n(sVar3.mo8389o(), f));
                break;
            case 6:
                a = mo8317a(this.f8087a.mo8371M(), f);
                this.f8087a.mo8394v(a);
                this.f8095i.setYTranslation(2.0f - a);
                break;
            case 7:
                a = mo8317a(this.f8087a.mo8390p(), f);
                this.f8087a.mo8392r(a);
                this.f8095i.setYTranslation(2.0f - a);
                break;
        }
        if (Q.equals("grid")) {
            this.f8092f.invalidate();
            return;
        }
        if (Q.equals("vertical")) {
            this.f8100n.mo8705k(this.f8087a.mo8376S(), this.f8087a.mo8363E());
        }
        this.f8087a.mo8360B();
    }

    /* renamed from: q */
    public void mo8332q(C2252d2 d2Var) {
        Runnable fVar;
        if (d2Var != null) {
            AbsListView absListView = this.f8094h;
            if (absListView != null) {
                absListView.setAdapter((ListAdapter) d2Var.f8048a);
                return;
            }
            ViewGroup viewGroup = this.f8095i;
            if (viewGroup != null) {
                fVar = new RunnableC2272e(d2Var);
            } else if (this.f8096j != null) {
                AbstractC2289v vVar = this.f8088b;
                if (vVar != null) {
                    d2Var.f8049b.mo8526x(vVar);
                }
                if (this.f8089c != null && !this.f8102p.mo8196t()) {
                    d2Var.f8049b.mo8528z(this.f8089c);
                }
                viewGroup = this.f8096j;
                fVar = new RunnableC2273f(d2Var);
            } else {
                return;
            }
            viewGroup.post(fVar);
        }
    }

    /* renamed from: r */
    public void mo8333r(String str) {
        AbsListView absListView = this.f8094h;
        if (absListView != null && (absListView instanceof ListView)) {
            ListView listView = (ListView) absListView;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            layoutParams.addRule(13);
            listView.setLayoutParams(layoutParams);
            if (str.equals("icons_bottom")) {
                listView.setPadding(0, C2185a4.m9666D(this.f8091e), 0, 0);
            } else {
                listView.setPadding(0, 0, 0, C2185a4.m9666D(this.f8091e));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8334s() {
        if (this.f8093g != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(Math.round((this.f8087a.mo8376S() * ((float) this.f8087a.mo8382g(false).x)) / 2.0f), 0, 0, 0);
            this.f8093g.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    public void mo8335t(AbstractC2289v vVar) {
        AbstractC2365h hVar;
        this.f8088b = vVar;
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            absListView.setOnItemClickListener(new C2268a(vVar));
            return;
        }
        MyCarouselView myCarouselView = this.f8095i;
        if (myCarouselView != null) {
            myCarouselView.mo6840R1(new C2269b(vVar));
            return;
        }
        MyRecyclerView myRecyclerView = this.f8096j;
        if (myRecyclerView != null && (hVar = (AbstractC2365h) myRecyclerView.getAdapter()) != null) {
            hVar.mo8526x(this.f8088b);
        }
    }

    /* renamed from: u */
    public void mo8336u(AbstractC2290w wVar) {
        AbstractC2365h hVar;
        this.f8089c = wVar;
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            absListView.setOnItemLongClickListener(new C2270c(wVar));
            return;
        }
        MyCarouselView myCarouselView = this.f8095i;
        if (myCarouselView != null) {
            myCarouselView.mo6841S1(new C2271d(wVar));
            return;
        }
        MyRecyclerView myRecyclerView = this.f8096j;
        if (myRecyclerView != null && (hVar = (AbstractC2365h) myRecyclerView.getAdapter()) != null && !this.f8102p.mo8196t()) {
            hVar.mo8528z(wVar);
        }
    }

    /* renamed from: v */
    public void mo8337v(AbstractC2291x xVar) {
        this.f8090d = xVar;
    }

    /* renamed from: w */
    public void mo8338w(int i) {
        mo8339x(i, true);
    }

    /* renamed from: x */
    public void mo8339x(int i, boolean z) {
        AbsListView absListView = this.f8094h;
        if (absListView != null) {
            absListView.setSelection(i);
        } else {
            RecyclerView recyclerView = this.f8097k;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC2283p(i, z));
                this.f8107u = false;
                this.f8108v = false;
            }
        }
        this.f8110x = i;
        AbstractC2291x xVar = this.f8090d;
        if (xVar != null) {
            xVar.mo8406a(null, i);
        }
    }

    /* renamed from: y */
    public void mo8340y(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1372576080:
                if (str.equals("icons_top")) {
                    c = 0;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 1;
                    break;
                }
                break;
            case 1454535408:
                if (str.equals("icons_bottom")) {
                    c = 2;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                this.f8105s = true;
                break;
            case 1:
                this.f8105s = false;
                break;
            case 2:
                this.f8105s = false;
                this.f8106t = true;
                return;
            default:
                return;
        }
        this.f8106t = false;
    }

    /* renamed from: z */
    public void mo8341z(boolean z) {
        if (!z || !this.f8085A) {
            this.f8111y = false;
            this.f8112z = false;
            this.f8086B = 0;
        }
        this.f8085A = z;
    }
}
