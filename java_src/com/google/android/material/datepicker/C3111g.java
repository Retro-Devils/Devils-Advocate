package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C0726h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p006b.p030g.p038j.C0957e;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.C1396g;
import p069c.p073b.p074a.p090b.C1397h;
import p069c.p073b.p074a.p090b.C1398i;

/* renamed from: com.google.android.material.datepicker.g */
public final class C3111g<S> extends AbstractC3132m<S> {

    /* renamed from: a0 */
    static final Object f10398a0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: b0 */
    static final Object f10399b0 = "NAVIGATION_PREV_TAG";

    /* renamed from: c0 */
    static final Object f10400c0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: d0 */
    static final Object f10401d0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: e0 */
    private int f10402e0;

    /* renamed from: f0 */
    private AbstractC3108d<S> f10403f0;

    /* renamed from: g0 */
    private C3103a f10404g0;

    /* renamed from: h0 */
    private C3125i f10405h0;

    /* renamed from: i0 */
    private EnumC3122k f10406i0;

    /* renamed from: j0 */
    private C3107c f10407j0;

    /* renamed from: k0 */
    private RecyclerView f10408k0;

    /* renamed from: l0 */
    private RecyclerView f10409l0;

    /* renamed from: m0 */
    private View f10410m0;

    /* renamed from: n0 */
    private View f10411n0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$a */
    public class RunnableC3112a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f10412b;

        RunnableC3112a(int i) {
            this.f10412b = i;
        }

        public void run() {
            C3111g.this.f10409l0.mo3237s1(this.f10412b);
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$b */
    class C3113b extends C0962a {
        C3113b() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            cVar.mo5474c0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$c */
    class C3114c extends C3133n {

        /* renamed from: I */
        final /* synthetic */ int f10415I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3114c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f10415I = i2;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: U1 */
        public void mo3736U1(RecyclerView.C0649a0 a0Var, int[] iArr) {
            if (this.f10415I == 0) {
                iArr[0] = C3111g.this.f10409l0.getWidth();
                iArr[1] = C3111g.this.f10409l0.getWidth();
                return;
            }
            iArr[0] = C3111g.this.f10409l0.getHeight();
            iArr[1] = C3111g.this.f10409l0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$d */
    class C3115d implements AbstractC3123l {
        C3115d() {
        }

        @Override // com.google.android.material.datepicker.C3111g.AbstractC3123l
        /* renamed from: a */
        public void mo10427a(long j) {
            if (C3111g.this.f10404g0.mo10393g().mo10405d(j)) {
                C3111g.this.f10403f0.mo10411e(j);
                Iterator<AbstractC3131l<S>> it = C3111g.this.f10456Z.iterator();
                while (it.hasNext()) {
                    it.next().mo10467a((S) C3111g.this.f10403f0.mo10409a());
                }
                C3111g.this.f10409l0.getAdapter().mo4029h();
                if (C3111g.this.f10408k0 != null) {
                    C3111g.this.f10408k0.getAdapter().mo4029h();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$e */
    public class C3116e extends RecyclerView.AbstractC0668n {

        /* renamed from: a */
        private final Calendar f10418a = C3136p.m13082l();

        /* renamed from: b */
        private final Calendar f10419b = C3136p.m13082l();

        C3116e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0668n
        /* renamed from: g */
        public void mo4072g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0649a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof C3137q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C3137q qVar = (C3137q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0957e<Long, Long> eVar : C3111g.this.f10403f0.mo10410c()) {
                    F f = eVar.f4654a;
                    if (!(f == null || eVar.f4655b == null)) {
                        this.f10418a.setTimeInMillis(f.longValue());
                        this.f10419b.setTimeInMillis(eVar.f4655b.longValue());
                        int w = qVar.mo10470w(this.f10418a.get(1));
                        int w2 = qVar.mo10470w(this.f10419b.get(1));
                        View F = gridLayoutManager.mo3728F(w);
                        View F2 = gridLayoutManager.mo3728F(w2);
                        int f3 = w / gridLayoutManager.mo3711f3();
                        int f32 = w2 / gridLayoutManager.mo3711f3();
                        int i = f3;
                        while (i <= f32) {
                            View F3 = gridLayoutManager.mo3728F(gridLayoutManager.mo3711f3() * i);
                            if (F3 != null) {
                                canvas.drawRect((float) (i == f3 ? F.getLeft() + (F.getWidth() / 2) : 0), (float) (F3.getTop() + C3111g.this.f10407j0.f10389d.mo10407c()), (float) (i == f32 ? F2.getLeft() + (F2.getWidth() / 2) : recyclerView.getWidth()), (float) (F3.getBottom() - C3111g.this.f10407j0.f10389d.mo10406b()), C3111g.this.f10407j0.f10393h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$f */
    public class C3117f extends C0962a {
        C3117f() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            C3111g gVar;
            int i;
            super.mo2362g(view, cVar);
            if (C3111g.this.f10411n0.getVisibility() == 0) {
                gVar = C3111g.this;
                i = C1398i.mtrl_picker_toggle_to_year_selection;
            } else {
                gVar = C3111g.this;
                i = C1398i.mtrl_picker_toggle_to_day_selection;
            }
            cVar.mo5489l0(gVar.mo2501D0(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$g */
    public class C3118g extends RecyclerView.AbstractC0678t {

        /* renamed from: a */
        final /* synthetic */ C3128k f10422a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f10423b;

        C3118g(C3128k kVar, MaterialButton materialButton) {
            this.f10422a = kVar;
            this.f10423b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: a */
        public void mo4177a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f10423b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: b */
        public void mo4178b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager D2 = C3111g.this.mo10420D2();
            int h2 = i < 0 ? D2.mo3745h2() : D2.mo3746k2();
            C3111g.this.f10405h0 = this.f10422a.mo10461v(h2);
            this.f10423b.setText(this.f10422a.mo10462w(h2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$h */
    public class View$OnClickListenerC3119h implements View.OnClickListener {
        View$OnClickListenerC3119h() {
        }

        public void onClick(View view) {
            C3111g.this.mo10423H2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$i */
    public class View$OnClickListenerC3120i implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C3128k f10426b;

        View$OnClickListenerC3120i(C3128k kVar) {
            this.f10426b = kVar;
        }

        public void onClick(View view) {
            int h2 = C3111g.this.mo10420D2().mo3745h2() + 1;
            if (h2 < C3111g.this.f10409l0.getAdapter().mo3580c()) {
                C3111g.this.mo10421F2(this.f10426b.mo10461v(h2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$j */
    public class View$OnClickListenerC3121j implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C3128k f10428b;

        View$OnClickListenerC3121j(C3128k kVar) {
            this.f10428b = kVar;
        }

        public void onClick(View view) {
            int k2 = C3111g.this.mo10420D2().mo3746k2() - 1;
            if (k2 >= 0) {
                C3111g.this.mo10421F2(this.f10428b.mo10461v(k2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$k */
    public enum EnumC3122k {
        DAY,
        YEAR
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$l */
    public interface AbstractC3123l {
        /* renamed from: a */
        void mo10427a(long j);
    }

    /* renamed from: C2 */
    static int m13003C2(Context context) {
        return context.getResources().getDimensionPixelSize(C1393d.mtrl_calendar_day_height);
    }

    /* renamed from: E2 */
    private void m13004E2(int i) {
        this.f10409l0.post(new RunnableC3112a(i));
    }

    /* renamed from: w2 */
    private void m13012w2(View view, C3128k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C1395f.month_navigation_fragment_toggle);
        materialButton.setTag(f10401d0);
        C1013s.m5766i0(materialButton, new C3117f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C1395f.month_navigation_previous);
        materialButton2.setTag(f10399b0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C1395f.month_navigation_next);
        materialButton3.setTag(f10400c0);
        this.f10410m0 = view.findViewById(C1395f.mtrl_calendar_year_selector_frame);
        this.f10411n0 = view.findViewById(C1395f.mtrl_calendar_day_selector_frame);
        mo10422G2(EnumC3122k.DAY);
        materialButton.setText(this.f10405h0.mo10438k());
        this.f10409l0.mo3868k(new C3118g(kVar, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC3119h());
        materialButton3.setOnClickListener(new View$OnClickListenerC3120i(kVar));
        materialButton2.setOnClickListener(new View$OnClickListenerC3121j(kVar));
    }

    /* renamed from: x2 */
    private RecyclerView.AbstractC0668n m13013x2() {
        return new C3116e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A2 */
    public C3125i mo10418A2() {
        return this.f10405h0;
    }

    /* renamed from: B2 */
    public AbstractC3108d<S> mo10419B2() {
        return this.f10403f0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D2 */
    public LinearLayoutManager mo10420D2() {
        return (LinearLayoutManager) this.f10409l0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public void mo10421F2(C3125i iVar) {
        RecyclerView recyclerView;
        int i;
        C3128k kVar = (C3128k) this.f10409l0.getAdapter();
        int x = kVar.mo10463x(iVar);
        int x2 = x - kVar.mo10463x(this.f10405h0);
        boolean z = true;
        boolean z2 = Math.abs(x2) > 3;
        if (x2 <= 0) {
            z = false;
        }
        this.f10405h0 = iVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f10409l0;
                i = x + 3;
            }
            m13004E2(x);
        }
        recyclerView = this.f10409l0;
        i = x - 3;
        recyclerView.mo3233k1(i);
        m13004E2(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public void mo10422G2(EnumC3122k kVar) {
        this.f10406i0 = kVar;
        if (kVar == EnumC3122k.YEAR) {
            this.f10408k0.getLayoutManager().mo3360E1(((C3137q) this.f10408k0.getAdapter()).mo10470w(this.f10405h0.f10439e));
            this.f10410m0.setVisibility(0);
            this.f10411n0.setVisibility(8);
        } else if (kVar == EnumC3122k.DAY) {
            this.f10410m0.setVisibility(8);
            this.f10411n0.setVisibility(0);
            mo10421F2(this.f10405h0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public void mo10423H2() {
        EnumC3122k kVar = this.f10406i0;
        EnumC3122k kVar2 = EnumC3122k.YEAR;
        if (kVar == kVar2) {
            mo10422G2(EnumC3122k.DAY);
        } else if (kVar == EnumC3122k.DAY) {
            mo10422G2(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        if (bundle == null) {
            bundle = mo2568h0();
        }
        this.f10402e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10403f0 = (AbstractC3108d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10404g0 = (C3103a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10405h0 = (C3125i) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo2575j0(), this.f10402e0);
        this.f10407j0 = new C3107c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C3125i k = this.f10404g0.mo10398k();
        if (C3124h.m13033u2(contextThemeWrapper)) {
            i2 = C1397h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C1397h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C1395f.mtrl_calendar_days_of_week);
        C1013s.m5766i0(gridView, new C3113b());
        gridView.setAdapter((ListAdapter) new C3110f());
        gridView.setNumColumns(k.f10440f);
        gridView.setEnabled(false);
        this.f10409l0 = (RecyclerView) inflate.findViewById(C1395f.mtrl_calendar_months);
        this.f10409l0.setLayoutManager(new C3114c(mo2575j0(), i, false, i));
        this.f10409l0.setTag(f10398a0);
        C3128k kVar = new C3128k(contextThemeWrapper, this.f10403f0, this.f10404g0, new C3115d());
        this.f10409l0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(C1396g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1395f.mtrl_calendar_year_selector_frame);
        this.f10408k0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10408k0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f10408k0.setAdapter(new C3137q(this));
            this.f10408k0.mo3859h(m13013x2());
        }
        if (inflate.findViewById(C1395f.month_navigation_fragment_toggle) != null) {
            m13012w2(inflate, kVar);
        }
        if (!C3124h.m13033u2(contextThemeWrapper)) {
            new C0726h().mo4477b(this.f10409l0);
        }
        this.f10409l0.mo3233k1(kVar.mo10463x(this.f10405h0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        super.mo2603s1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10402e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10403f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10404g0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10405h0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public C3103a mo10424y2() {
        return this.f10404g0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public C3107c mo10425z2() {
        return this.f10407j0;
    }
}
