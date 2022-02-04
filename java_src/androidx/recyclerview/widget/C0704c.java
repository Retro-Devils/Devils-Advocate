package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.recyclerview.widget.c */
public class C0704c extends AbstractC0735m {

    /* renamed from: h */
    private static TimeInterpolator f3394h;

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC0655d0> f3395i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<RecyclerView.AbstractC0655d0> f3396j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0714j> f3397k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C0713i> f3398l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<RecyclerView.AbstractC0655d0>> f3399m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0714j>> f3400n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<ArrayList<C0713i>> f3401o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC0655d0> f3402p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC0655d0> f3403q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC0655d0> f3404r = new ArrayList<>();

    /* renamed from: s */
    ArrayList<RecyclerView.AbstractC0655d0> f3405s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    class RunnableC0705a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3406b;

        RunnableC0705a(ArrayList arrayList) {
            this.f3406b = arrayList;
        }

        public void run() {
            Iterator it = this.f3406b.iterator();
            while (it.hasNext()) {
                C0714j jVar = (C0714j) it.next();
                C0704c.this.mo4373T(jVar.f3440a, jVar.f3441b, jVar.f3442c, jVar.f3443d, jVar.f3444e);
            }
            this.f3406b.clear();
            C0704c.this.f3400n.remove(this.f3406b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    class RunnableC0706b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3408b;

        RunnableC0706b(ArrayList arrayList) {
            this.f3408b = arrayList;
        }

        public void run() {
            Iterator it = this.f3408b.iterator();
            while (it.hasNext()) {
                C0704c.this.mo4372S((C0713i) it.next());
            }
            this.f3408b.clear();
            C0704c.this.f3401o.remove(this.f3408b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    class RunnableC0707c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3410b;

        RunnableC0707c(ArrayList arrayList) {
            this.f3410b = arrayList;
        }

        public void run() {
            Iterator it = this.f3410b.iterator();
            while (it.hasNext()) {
                C0704c.this.mo4371R((RecyclerView.AbstractC0655d0) it.next());
            }
            this.f3410b.clear();
            C0704c.this.f3399m.remove(this.f3410b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    public class C0708d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0655d0 f3412a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3413b;

        /* renamed from: c */
        final /* synthetic */ View f3414c;

        C0708d(RecyclerView.AbstractC0655d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3412a = d0Var;
            this.f3413b = viewPropertyAnimator;
            this.f3414c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3413b.setListener(null);
            this.f3414c.setAlpha(1.0f);
            C0704c.this.mo4466G(this.f3412a);
            C0704c.this.f3404r.remove(this.f3412a);
            C0704c.this.mo4375W();
        }

        public void onAnimationStart(Animator animator) {
            C0704c.this.mo4467H(this.f3412a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    public class C0709e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0655d0 f3416a;

        /* renamed from: b */
        final /* synthetic */ View f3417b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3418c;

        C0709e(RecyclerView.AbstractC0655d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3416a = d0Var;
            this.f3417b = view;
            this.f3418c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3417b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3418c.setListener(null);
            C0704c.this.mo4460A(this.f3416a);
            C0704c.this.f3402p.remove(this.f3416a);
            C0704c.this.mo4375W();
        }

        public void onAnimationStart(Animator animator) {
            C0704c.this.mo4461B(this.f3416a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    public class C0710f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0655d0 f3420a;

        /* renamed from: b */
        final /* synthetic */ int f3421b;

        /* renamed from: c */
        final /* synthetic */ View f3422c;

        /* renamed from: d */
        final /* synthetic */ int f3423d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3424e;

        C0710f(RecyclerView.AbstractC0655d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3420a = d0Var;
            this.f3421b = i;
            this.f3422c = view;
            this.f3423d = i2;
            this.f3424e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3421b != 0) {
                this.f3422c.setTranslationX(0.0f);
            }
            if (this.f3423d != 0) {
                this.f3422c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3424e.setListener(null);
            C0704c.this.mo4464E(this.f3420a);
            C0704c.this.f3403q.remove(this.f3420a);
            C0704c.this.mo4375W();
        }

        public void onAnimationStart(Animator animator) {
            C0704c.this.mo4465F(this.f3420a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    public class C0711g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0713i f3426a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3427b;

        /* renamed from: c */
        final /* synthetic */ View f3428c;

        C0711g(C0713i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3426a = iVar;
            this.f3427b = viewPropertyAnimator;
            this.f3428c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3427b.setListener(null);
            this.f3428c.setAlpha(1.0f);
            this.f3428c.setTranslationX(0.0f);
            this.f3428c.setTranslationY(0.0f);
            C0704c.this.mo4462C(this.f3426a.f3434a, true);
            C0704c.this.f3405s.remove(this.f3426a.f3434a);
            C0704c.this.mo4375W();
        }

        public void onAnimationStart(Animator animator) {
            C0704c.this.mo4463D(this.f3426a.f3434a, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    public class C0712h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0713i f3430a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3431b;

        /* renamed from: c */
        final /* synthetic */ View f3432c;

        C0712h(C0713i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3430a = iVar;
            this.f3431b = viewPropertyAnimator;
            this.f3432c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3431b.setListener(null);
            this.f3432c.setAlpha(1.0f);
            this.f3432c.setTranslationX(0.0f);
            this.f3432c.setTranslationY(0.0f);
            C0704c.this.mo4462C(this.f3430a.f3435b, false);
            C0704c.this.f3405s.remove(this.f3430a.f3435b);
            C0704c.this.mo4375W();
        }

        public void onAnimationStart(Animator animator) {
            C0704c.this.mo4463D(this.f3430a.f3435b, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    public static class C0713i {

        /* renamed from: a */
        public RecyclerView.AbstractC0655d0 f3434a;

        /* renamed from: b */
        public RecyclerView.AbstractC0655d0 f3435b;

        /* renamed from: c */
        public int f3436c;

        /* renamed from: d */
        public int f3437d;

        /* renamed from: e */
        public int f3438e;

        /* renamed from: f */
        public int f3439f;

        private C0713i(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0655d0 d0Var2) {
            this.f3434a = d0Var;
            this.f3435b = d0Var2;
        }

        C0713i(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0655d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f3436c = i;
            this.f3437d = i2;
            this.f3438e = i3;
            this.f3439f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3434a + ", newHolder=" + this.f3435b + ", fromX=" + this.f3436c + ", fromY=" + this.f3437d + ", toX=" + this.f3438e + ", toY=" + this.f3439f + '}';
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    public static class C0714j {

        /* renamed from: a */
        public RecyclerView.AbstractC0655d0 f3440a;

        /* renamed from: b */
        public int f3441b;

        /* renamed from: c */
        public int f3442c;

        /* renamed from: d */
        public int f3443d;

        /* renamed from: e */
        public int f3444e;

        C0714j(RecyclerView.AbstractC0655d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3440a = d0Var;
            this.f3441b = i;
            this.f3442c = i2;
            this.f3443d = i3;
            this.f3444e = i4;
        }
    }

    /* renamed from: U */
    private void m4201U(RecyclerView.AbstractC0655d0 d0Var) {
        View view = d0Var.f3228b;
        ViewPropertyAnimator animate = view.animate();
        this.f3404r.add(d0Var);
        animate.setDuration(mo4057o()).alpha(0.0f).setListener(new C0708d(d0Var, animate, view)).start();
    }

    /* renamed from: X */
    private void m4202X(List<C0713i> list, RecyclerView.AbstractC0655d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0713i iVar = list.get(size);
            if (m4204Z(iVar, d0Var) && iVar.f3434a == null && iVar.f3435b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: Y */
    private void m4203Y(C0713i iVar) {
        RecyclerView.AbstractC0655d0 d0Var = iVar.f3434a;
        if (d0Var != null) {
            m4204Z(iVar, d0Var);
        }
        RecyclerView.AbstractC0655d0 d0Var2 = iVar.f3435b;
        if (d0Var2 != null) {
            m4204Z(iVar, d0Var2);
        }
    }

    /* renamed from: Z */
    private boolean m4204Z(C0713i iVar, RecyclerView.AbstractC0655d0 d0Var) {
        boolean z = false;
        if (iVar.f3435b == d0Var) {
            iVar.f3435b = null;
        } else if (iVar.f3434a != d0Var) {
            return false;
        } else {
            iVar.f3434a = null;
            z = true;
        }
        d0Var.f3228b.setAlpha(1.0f);
        d0Var.f3228b.setTranslationX(0.0f);
        d0Var.f3228b.setTranslationY(0.0f);
        mo4462C(d0Var, z);
        return true;
    }

    /* renamed from: a0 */
    private void m4205a0(RecyclerView.AbstractC0655d0 d0Var) {
        if (f3394h == null) {
            f3394h = new ValueAnimator().getInterpolator();
        }
        d0Var.f3228b.animate().setInterpolator(f3394h);
        mo4052j(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4371R(RecyclerView.AbstractC0655d0 d0Var) {
        View view = d0Var.f3228b;
        ViewPropertyAnimator animate = view.animate();
        this.f3402p.add(d0Var);
        animate.alpha(1.0f).setDuration(mo4054l()).setListener(new C0709e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo4372S(C0713i iVar) {
        RecyclerView.AbstractC0655d0 d0Var = iVar.f3434a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3228b;
        RecyclerView.AbstractC0655d0 d0Var2 = iVar.f3435b;
        if (d0Var2 != null) {
            view = d0Var2.f3228b;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo4055m());
            this.f3405s.add(iVar.f3434a);
            duration.translationX((float) (iVar.f3438e - iVar.f3436c));
            duration.translationY((float) (iVar.f3439f - iVar.f3437d));
            duration.alpha(0.0f).setListener(new C0711g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f3405s.add(iVar.f3435b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4055m()).alpha(1.0f).setListener(new C0712h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo4373T(RecyclerView.AbstractC0655d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3228b;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3403q.add(d0Var);
        animate.setDuration(mo4056n()).setListener(new C0710f(d0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo4374V(List<RecyclerView.AbstractC0655d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3228b.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo4375W() {
        if (!mo4058p()) {
            mo4051i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: g */
    public boolean mo4049g(RecyclerView.AbstractC0655d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4049g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: j */
    public void mo4052j(RecyclerView.AbstractC0655d0 d0Var) {
        View view = d0Var.f3228b;
        view.animate().cancel();
        int size = this.f3397k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3397k.get(size).f3440a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4464E(d0Var);
                this.f3397k.remove(size);
            }
        }
        m4202X(this.f3398l, d0Var);
        if (this.f3395i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo4466G(d0Var);
        }
        if (this.f3396j.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo4460A(d0Var);
        }
        for (int size2 = this.f3401o.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0713i> arrayList = this.f3401o.get(size2);
            m4202X(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3401o.remove(size2);
            }
        }
        for (int size3 = this.f3400n.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0714j> arrayList2 = this.f3400n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3440a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4464E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3400n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3399m.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0655d0> arrayList3 = this.f3399m.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo4460A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3399m.remove(size5);
                }
            }
        }
        this.f3404r.remove(d0Var);
        this.f3402p.remove(d0Var);
        this.f3405s.remove(d0Var);
        this.f3403q.remove(d0Var);
        mo4375W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: k */
    public void mo4053k() {
        int size = this.f3397k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0714j jVar = this.f3397k.get(size);
            View view = jVar.f3440a.f3228b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4464E(jVar.f3440a);
            this.f3397k.remove(size);
        }
        for (int size2 = this.f3395i.size() - 1; size2 >= 0; size2--) {
            mo4466G(this.f3395i.get(size2));
            this.f3395i.remove(size2);
        }
        int size3 = this.f3396j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0655d0 d0Var = this.f3396j.get(size3);
            d0Var.f3228b.setAlpha(1.0f);
            mo4460A(d0Var);
            this.f3396j.remove(size3);
        }
        for (int size4 = this.f3398l.size() - 1; size4 >= 0; size4--) {
            m4203Y(this.f3398l.get(size4));
        }
        this.f3398l.clear();
        if (mo4058p()) {
            for (int size5 = this.f3400n.size() - 1; size5 >= 0; size5--) {
                ArrayList<C0714j> arrayList = this.f3400n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0714j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3440a.f3228b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4464E(jVar2.f3440a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3400n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3399m.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0655d0> arrayList2 = this.f3399m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0655d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.f3228b.setAlpha(1.0f);
                    mo4460A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3399m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3401o.size() - 1; size9 >= 0; size9--) {
                ArrayList<C0713i> arrayList3 = this.f3401o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4203Y(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3401o.remove(arrayList3);
                    }
                }
            }
            mo4374V(this.f3404r);
            mo4374V(this.f3403q);
            mo4374V(this.f3402p);
            mo4374V(this.f3405s);
            mo4051i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: p */
    public boolean mo4058p() {
        return !this.f3396j.isEmpty() || !this.f3398l.isEmpty() || !this.f3397k.isEmpty() || !this.f3395i.isEmpty() || !this.f3403q.isEmpty() || !this.f3404r.isEmpty() || !this.f3402p.isEmpty() || !this.f3405s.isEmpty() || !this.f3400n.isEmpty() || !this.f3399m.isEmpty() || !this.f3401o.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: u */
    public void mo4063u() {
        boolean z = !this.f3395i.isEmpty();
        boolean z2 = !this.f3397k.isEmpty();
        boolean z3 = !this.f3398l.isEmpty();
        boolean z4 = !this.f3396j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC0655d0> it = this.f3395i.iterator();
            while (it.hasNext()) {
                m4201U(it.next());
            }
            this.f3395i.clear();
            if (z2) {
                ArrayList<C0714j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3397k);
                this.f3400n.add(arrayList);
                this.f3397k.clear();
                RunnableC0705a aVar = new RunnableC0705a(arrayList);
                if (z) {
                    C1013s.m5752b0(arrayList.get(0).f3440a.f3228b, aVar, mo4057o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<C0713i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3398l);
                this.f3401o.add(arrayList2);
                this.f3398l.clear();
                RunnableC0706b bVar = new RunnableC0706b(arrayList2);
                if (z) {
                    C1013s.m5752b0(arrayList2.get(0).f3434a.f3228b, bVar, mo4057o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC0655d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3396j);
                this.f3399m.add(arrayList3);
                this.f3396j.clear();
                RunnableC0707c cVar = new RunnableC0707c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4057o() : 0;
                    long n = z2 ? mo4056n() : 0;
                    if (z3) {
                        j = mo4055m();
                    }
                    C1013s.m5752b0(arrayList3.get(0).f3228b, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0735m
    /* renamed from: w */
    public boolean mo4376w(RecyclerView.AbstractC0655d0 d0Var) {
        m4205a0(d0Var);
        d0Var.f3228b.setAlpha(0.0f);
        this.f3396j.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0735m
    /* renamed from: x */
    public boolean mo4377x(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0655d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo4378y(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f3228b.getTranslationX();
        float translationY = d0Var.f3228b.getTranslationY();
        float alpha = d0Var.f3228b.getAlpha();
        m4205a0(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f3228b.setTranslationX(translationX);
        d0Var.f3228b.setTranslationY(translationY);
        d0Var.f3228b.setAlpha(alpha);
        if (d0Var2 != null) {
            m4205a0(d0Var2);
            d0Var2.f3228b.setTranslationX((float) (-i5));
            d0Var2.f3228b.setTranslationY((float) (-i6));
            d0Var2.f3228b.setAlpha(0.0f);
        }
        this.f3398l.add(new C0713i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0735m
    /* renamed from: y */
    public boolean mo4378y(RecyclerView.AbstractC0655d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3228b;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f3228b.getTranslationY());
        m4205a0(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4464E(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3397k.add(new C0714j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0735m
    /* renamed from: z */
    public boolean mo4379z(RecyclerView.AbstractC0655d0 d0Var) {
        m4205a0(d0Var);
        this.f3395i.add(d0Var);
        return true;
    }
}
