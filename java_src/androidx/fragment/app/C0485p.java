package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.p */
class C0485p extends AbstractC0490q {

    /* renamed from: androidx.fragment.app.p$a */
    class C0486a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2521a;

        C0486a(Rect rect) {
            this.f2521a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2521a;
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    class C0487b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2523a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2524b;

        C0487b(View view, ArrayList arrayList) {
            this.f2523a = view;
            this.f2524b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2523a.setVisibility(8);
            int size = this.f2524b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2524b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    class C0488c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2526a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2527b;

        /* renamed from: c */
        final /* synthetic */ Object f2528c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2529d;

        /* renamed from: e */
        final /* synthetic */ Object f2530e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2531f;

        C0488c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2526a = obj;
            this.f2527b = arrayList;
            this.f2528c = obj2;
            this.f2529d = arrayList2;
            this.f2530e = obj3;
            this.f2531f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2526a;
            if (obj != null) {
                C0485p.this.mo2886q(obj, this.f2527b, null);
            }
            Object obj2 = this.f2528c;
            if (obj2 != null) {
                C0485p.this.mo2886q(obj2, this.f2529d, null);
            }
            Object obj3 = this.f2530e;
            if (obj3 != null) {
                C0485p.this.mo2886q(obj3, this.f2531f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$d */
    class C0489d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2533a;

        C0489d(Rect rect) {
            this.f2533a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2533a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2533a;
        }
    }

    C0485p() {
    }

    /* renamed from: B */
    private static boolean m2630B(Transition transition) {
        return !AbstractC0490q.m2650l(transition.getTargetIds()) || !AbstractC0490q.m2650l(transition.getTargetNames()) || !AbstractC0490q.m2650l(transition.getTargetTypes());
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: A */
    public Object mo2877A(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: a */
    public void mo2878a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: b */
    public void mo2879b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2879b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2630B(transition) && AbstractC0490q.m2650l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: c */
    public void mo2880c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: e */
    public boolean mo2881e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: g */
    public Object mo2882g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: m */
    public Object mo2883m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: n */
    public Object mo2884n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: p */
    public void mo2885p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: q */
    public void mo2886q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2886q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2630B(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: r */
    public void mo2887r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0487b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: t */
    public void mo2888t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0488c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: u */
    public void mo2889u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0489d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: v */
    public void mo2890v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo2907k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0486a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: y */
    public void mo2891y(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0490q.m2647d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2879b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0490q
    /* renamed from: z */
    public void mo2892z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2886q(transitionSet, arrayList, arrayList2);
        }
    }
}
