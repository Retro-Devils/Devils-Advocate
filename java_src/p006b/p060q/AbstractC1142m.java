package p006b.p060q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p021d.C0823a;
import p006b.p021d.C0830f;
import p006b.p030g.p039k.C1013s;

/* renamed from: b.q.m */
public abstract class AbstractC1142m implements Cloneable {

    /* renamed from: b */
    private static final int[] f5123b = {2, 1, 3, 4};

    /* renamed from: c */
    private static final AbstractC1127g f5124c = new C1143a();

    /* renamed from: d */
    private static ThreadLocal<C0823a<Animator, C1146d>> f5125d = new ThreadLocal<>();

    /* renamed from: A */
    boolean f5126A = false;

    /* renamed from: B */
    ArrayList<Animator> f5127B = new ArrayList<>();

    /* renamed from: C */
    private int f5128C = 0;

    /* renamed from: D */
    private boolean f5129D = false;

    /* renamed from: E */
    private boolean f5130E = false;

    /* renamed from: F */
    private ArrayList<AbstractC1148f> f5131F = null;

    /* renamed from: G */
    private ArrayList<Animator> f5132G = new ArrayList<>();

    /* renamed from: H */
    AbstractC1154p f5133H;

    /* renamed from: I */
    private AbstractC1147e f5134I;

    /* renamed from: J */
    private C0823a<String, String> f5135J;

    /* renamed from: K */
    private AbstractC1127g f5136K = f5124c;

    /* renamed from: e */
    private String f5137e = getClass().getName();

    /* renamed from: f */
    private long f5138f = -1;

    /* renamed from: g */
    long f5139g = -1;

    /* renamed from: h */
    private TimeInterpolator f5140h = null;

    /* renamed from: i */
    ArrayList<Integer> f5141i = new ArrayList<>();

    /* renamed from: j */
    ArrayList<View> f5142j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<String> f5143k = null;

    /* renamed from: l */
    private ArrayList<Class<?>> f5144l = null;

    /* renamed from: m */
    private ArrayList<Integer> f5145m = null;

    /* renamed from: n */
    private ArrayList<View> f5146n = null;

    /* renamed from: o */
    private ArrayList<Class<?>> f5147o = null;

    /* renamed from: p */
    private ArrayList<String> f5148p = null;

    /* renamed from: q */
    private ArrayList<Integer> f5149q = null;

    /* renamed from: r */
    private ArrayList<View> f5150r = null;

    /* renamed from: s */
    private ArrayList<Class<?>> f5151s = null;

    /* renamed from: t */
    private C1160t f5152t = new C1160t();

    /* renamed from: u */
    private C1160t f5153u = new C1160t();

    /* renamed from: v */
    C1155q f5154v = null;

    /* renamed from: w */
    private int[] f5155w = f5123b;

    /* renamed from: x */
    private ArrayList<C1159s> f5156x;

    /* renamed from: y */
    private ArrayList<C1159s> f5157y;

    /* renamed from: z */
    private ViewGroup f5158z = null;

    /* renamed from: b.q.m$a */
    static class C1143a extends AbstractC1127g {
        C1143a() {
        }

        @Override // p006b.p060q.AbstractC1127g
        /* renamed from: a */
        public Path mo5788a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.q.m$b */
    public class C1144b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0823a f5159a;

        C1144b(C0823a aVar) {
            this.f5159a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5159a.remove(animator);
            AbstractC1142m.this.f5127B.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            AbstractC1142m.this.f5127B.add(animator);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.q.m$c */
    public class C1145c extends AnimatorListenerAdapter {
        C1145c() {
        }

        public void onAnimationEnd(Animator animator) {
            AbstractC1142m.this.mo5838p();
            animator.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.q.m$d */
    public static class C1146d {

        /* renamed from: a */
        View f5162a;

        /* renamed from: b */
        String f5163b;

        /* renamed from: c */
        C1159s f5164c;

        /* renamed from: d */
        AbstractC1149m0 f5165d;

        /* renamed from: e */
        AbstractC1142m f5166e;

        C1146d(View view, String str, AbstractC1142m mVar, AbstractC1149m0 m0Var, C1159s sVar) {
            this.f5162a = view;
            this.f5163b = str;
            this.f5164c = sVar;
            this.f5165d = m0Var;
            this.f5166e = mVar;
        }
    }

    /* renamed from: b.q.m$e */
    public static abstract class AbstractC1147e {
    }

    /* renamed from: b.q.m$f */
    public interface AbstractC1148f {
        /* renamed from: a */
        void mo5762a(AbstractC1142m mVar);

        /* renamed from: b */
        void mo5763b(AbstractC1142m mVar);

        /* renamed from: c */
        void mo5784c(AbstractC1142m mVar);

        /* renamed from: d */
        void mo5764d(AbstractC1142m mVar);

        /* renamed from: e */
        void mo5765e(AbstractC1142m mVar);
    }

    /* renamed from: H */
    private static boolean m6265H(C1159s sVar, C1159s sVar2, String str) {
        Object obj = sVar.f5185a.get(str);
        Object obj2 = sVar2.f5185a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: I */
    private void m6266I(C0823a<View, C1159s> aVar, C0823a<View, C1159s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo5813G(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo5813G(view)) {
                C1159s sVar = aVar.get(valueAt);
                C1159s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f5156x.add(sVar);
                    this.f5157y.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: J */
    private void m6267J(C0823a<View, C1159s> aVar, C0823a<View, C1159s> aVar2) {
        C1159s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.mo5011i(size);
            if (i != null && mo5813G(i) && (remove = aVar2.remove(i)) != null && mo5813G(remove.f5186b)) {
                this.f5156x.add(aVar.mo5014k(size));
                this.f5157y.add(remove);
            }
        }
    }

    /* renamed from: K */
    private void m6268K(C0823a<View, C1159s> aVar, C0823a<View, C1159s> aVar2, C0830f<View> fVar, C0830f<View> fVar2) {
        View e;
        int l = fVar.mo4922l();
        for (int i = 0; i < l; i++) {
            View m = fVar.mo4923m(i);
            if (m != null && mo5813G(m) && (e = fVar2.mo4915e(fVar.mo4918h(i))) != null && mo5813G(e)) {
                C1159s sVar = aVar.get(m);
                C1159s sVar2 = aVar2.get(e);
                if (!(sVar == null || sVar2 == null)) {
                    this.f5156x.add(sVar);
                    this.f5157y.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(e);
                }
            }
        }
    }

    /* renamed from: L */
    private void m6269L(C0823a<View, C1159s> aVar, C0823a<View, C1159s> aVar2, C0823a<String, View> aVar3, C0823a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.mo5016m(i);
            if (m != null && mo5813G(m) && (view = aVar4.get(aVar3.mo5011i(i))) != null && mo5813G(view)) {
                C1159s sVar = aVar.get(m);
                C1159s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f5156x.add(sVar);
                    this.f5157y.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    private void m6270M(C1160t tVar, C1160t tVar2) {
        C0823a<View, C1159s> aVar = new C0823a<>(tVar.f5188a);
        C0823a<View, C1159s> aVar2 = new C0823a<>(tVar2.f5188a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5155w;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m6267J(aVar, aVar2);
                } else if (i2 == 2) {
                    m6269L(aVar, aVar2, tVar.f5191d, tVar2.f5191d);
                } else if (i2 == 3) {
                    m6266I(aVar, aVar2, tVar.f5189b, tVar2.f5189b);
                } else if (i2 == 4) {
                    m6268K(aVar, aVar2, tVar.f5190c, tVar2.f5190c);
                }
                i++;
            } else {
                m6272c(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: S */
    private void m6271S(Animator animator, C0823a<Animator, C1146d> aVar) {
        if (animator != null) {
            animator.addListener(new C1144b(aVar));
            mo5831e(animator);
        }
    }

    /* renamed from: c */
    private void m6272c(C0823a<View, C1159s> aVar, C0823a<View, C1159s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1159s m = aVar.mo5016m(i);
            if (mo5813G(m.f5186b)) {
                this.f5156x.add(m);
                this.f5157y.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1159s m2 = aVar2.mo5016m(i2);
            if (mo5813G(m2.f5186b)) {
                this.f5157y.add(m2);
                this.f5156x.add(null);
            }
        }
    }

    /* renamed from: d */
    private static void m6273d(C1160t tVar, View view, C1159s sVar) {
        tVar.f5188a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f5189b.indexOfKey(id) >= 0) {
                tVar.f5189b.put(id, null);
            } else {
                tVar.f5189b.put(id, view);
            }
        }
        String G = C1013s.m5729G(view);
        if (G != null) {
            if (tVar.f5191d.containsKey(G)) {
                tVar.f5191d.put(G, null);
            } else {
                tVar.f5191d.put(G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f5190c.mo4917g(itemIdAtPosition) >= 0) {
                    View e = tVar.f5190c.mo4915e(itemIdAtPosition);
                    if (e != null) {
                        C1013s.m5784r0(e, false);
                        tVar.f5190c.mo4919i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C1013s.m5784r0(view, true);
                tVar.f5190c.mo4919i(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: h */
    private void m6274h(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f5145m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f5146n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f5147o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f5147o.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1159s sVar = new C1159s(view);
                        if (z) {
                            mo5733j(sVar);
                        } else {
                            mo5732g(sVar);
                        }
                        sVar.f5187c.add(this);
                        mo5833i(sVar);
                        m6273d(z ? this.f5152t : this.f5153u, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f5149q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f5150r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f5151s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.f5151s.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m6274h(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    private static C0823a<Animator, C1146d> m6275x() {
        C0823a<Animator, C1146d> aVar = f5125d.get();
        if (aVar != null) {
            return aVar;
        }
        C0823a<Animator, C1146d> aVar2 = new C0823a<>();
        f5125d.set(aVar2);
        return aVar2;
    }

    /* renamed from: A */
    public List<String> mo5809A() {
        return this.f5143k;
    }

    /* renamed from: B */
    public List<Class<?>> mo5810B() {
        return this.f5144l;
    }

    /* renamed from: C */
    public List<View> mo5811C() {
        return this.f5142j;
    }

    /* renamed from: D */
    public String[] mo5731D() {
        return null;
    }

    /* renamed from: E */
    public C1159s mo5812E(View view, boolean z) {
        C1155q qVar = this.f5154v;
        if (qVar != null) {
            return qVar.mo5812E(view, z);
        }
        return (z ? this.f5152t : this.f5153u).f5188a.get(view);
    }

    /* renamed from: F */
    public boolean mo5794F(C1159s sVar, C1159s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] D = mo5731D();
        if (D != null) {
            for (String str : D) {
                if (!m6265H(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f5185a.keySet()) {
            if (m6265H(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo5813G(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f5145m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f5146n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f5147o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f5147o.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.f5148p == null || C1013s.m5729G(view) == null || !this.f5148p.contains(C1013s.m5729G(view)))) {
            return false;
        }
        if ((this.f5141i.size() == 0 && this.f5142j.size() == 0 && (((arrayList = this.f5144l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5143k) == null || arrayList2.isEmpty()))) || this.f5141i.contains(Integer.valueOf(id)) || this.f5142j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5143k;
        if (arrayList6 != null && arrayList6.contains(C1013s.m5729G(view))) {
            return true;
        }
        if (this.f5144l != null) {
            for (int i2 = 0; i2 < this.f5144l.size(); i2++) {
                if (this.f5144l.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: N */
    public void mo5814N(View view) {
        if (!this.f5130E) {
            C0823a<Animator, C1146d> x = m6275x();
            int size = x.size();
            AbstractC1149m0 d = C1112c0.m6170d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1146d m = x.mo5016m(i);
                if (m.f5162a != null && d.equals(m.f5165d)) {
                    C1095a.m6135b(x.mo5011i(i));
                }
            }
            ArrayList<AbstractC1148f> arrayList = this.f5131F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5131F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((AbstractC1148f) arrayList2.get(i2)).mo5762a(this);
                }
            }
            this.f5129D = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo5815O(ViewGroup viewGroup) {
        C1146d dVar;
        this.f5156x = new ArrayList<>();
        this.f5157y = new ArrayList<>();
        m6270M(this.f5152t, this.f5153u);
        C0823a<Animator, C1146d> x = m6275x();
        int size = x.size();
        AbstractC1149m0 d = C1112c0.m6170d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = x.mo5011i(i);
            if (!(i2 == null || (dVar = x.get(i2)) == null || dVar.f5162a == null || !d.equals(dVar.f5165d))) {
                C1159s sVar = dVar.f5164c;
                View view = dVar.f5162a;
                C1159s E = mo5812E(view, true);
                C1159s t = mo5842t(view, true);
                if (E == null && t == null) {
                    t = this.f5153u.f5188a.get(view);
                }
                if (!(E == null && t == null) && dVar.f5166e.mo5794F(sVar, t)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        x.remove(i2);
                    }
                }
            }
        }
        mo5837o(viewGroup, this.f5152t, this.f5153u, this.f5156x, this.f5157y);
        mo5819T();
    }

    /* renamed from: P */
    public AbstractC1142m mo5816P(AbstractC1148f fVar) {
        ArrayList<AbstractC1148f> arrayList = this.f5131F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f5131F.size() == 0) {
            this.f5131F = null;
        }
        return this;
    }

    /* renamed from: Q */
    public AbstractC1142m mo5817Q(View view) {
        this.f5142j.remove(view);
        return this;
    }

    /* renamed from: R */
    public void mo5818R(View view) {
        if (this.f5129D) {
            if (!this.f5130E) {
                C0823a<Animator, C1146d> x = m6275x();
                int size = x.size();
                AbstractC1149m0 d = C1112c0.m6170d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1146d m = x.mo5016m(i);
                    if (m.f5162a != null && d.equals(m.f5165d)) {
                        C1095a.m6136c(x.mo5011i(i));
                    }
                }
                ArrayList<AbstractC1148f> arrayList = this.f5131F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5131F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC1148f) arrayList2.get(i2)).mo5763b(this);
                    }
                }
            }
            this.f5129D = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo5819T() {
        mo5827a0();
        C0823a<Animator, C1146d> x = m6275x();
        Iterator<Animator> it = this.f5132G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (x.containsKey(next)) {
                mo5827a0();
                m6271S(next, x);
            }
        }
        this.f5132G.clear();
        mo5838p();
    }

    /* renamed from: U */
    public AbstractC1142m mo5820U(long j) {
        this.f5139g = j;
        return this;
    }

    /* renamed from: V */
    public void mo5821V(AbstractC1147e eVar) {
        this.f5134I = eVar;
    }

    /* renamed from: W */
    public AbstractC1142m mo5822W(TimeInterpolator timeInterpolator) {
        this.f5140h = timeInterpolator;
        return this;
    }

    /* renamed from: X */
    public void mo5823X(AbstractC1127g gVar) {
        if (gVar == null) {
            gVar = f5124c;
        }
        this.f5136K = gVar;
    }

    /* renamed from: Y */
    public void mo5824Y(AbstractC1154p pVar) {
    }

    /* renamed from: Z */
    public AbstractC1142m mo5825Z(long j) {
        this.f5138f = j;
        return this;
    }

    /* renamed from: a */
    public AbstractC1142m mo5826a(AbstractC1148f fVar) {
        if (this.f5131F == null) {
            this.f5131F = new ArrayList<>();
        }
        this.f5131F.add(fVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo5827a0() {
        if (this.f5128C == 0) {
            ArrayList<AbstractC1148f> arrayList = this.f5131F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5131F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC1148f) arrayList2.get(i)).mo5784c(this);
                }
            }
            this.f5130E = false;
        }
        this.f5128C++;
    }

    /* renamed from: b */
    public AbstractC1142m mo5828b(View view) {
        this.f5142j.add(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public String mo5829b0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5139g != -1) {
            str2 = str2 + "dur(" + this.f5139g + ") ";
        }
        if (this.f5138f != -1) {
            str2 = str2 + "dly(" + this.f5138f + ") ";
        }
        if (this.f5140h != null) {
            str2 = str2 + "interp(" + this.f5140h + ") ";
        }
        if (this.f5141i.size() <= 0 && this.f5142j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f5141i.size() > 0) {
            for (int i = 0; i < this.f5141i.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5141i.get(i);
            }
        }
        if (this.f5142j.size() > 0) {
            for (int i2 = 0; i2 < this.f5142j.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5142j.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo5831e(Animator animator) {
        if (animator == null) {
            mo5838p();
            return;
        }
        if (mo5839q() >= 0) {
            animator.setDuration(mo5839q());
        }
        if (mo5847y() >= 0) {
            animator.setStartDelay(mo5847y() + animator.getStartDelay());
        }
        if (mo5841s() != null) {
            animator.setInterpolator(mo5841s());
        }
        animator.addListener(new C1145c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo5832f() {
        for (int size = this.f5127B.size() - 1; size >= 0; size--) {
            this.f5127B.get(size).cancel();
        }
        ArrayList<AbstractC1148f> arrayList = this.f5131F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5131F.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((AbstractC1148f) arrayList2.get(i)).mo5764d(this);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo5732g(C1159s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5833i(C1159s sVar) {
        if (this.f5133H != null && !sVar.f5185a.isEmpty()) {
            throw null;
        }
    }

    /* renamed from: j */
    public abstract void mo5733j(C1159s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5834k(ViewGroup viewGroup, boolean z) {
        C0823a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo5835l(z);
        if ((this.f5141i.size() > 0 || this.f5142j.size() > 0) && (((arrayList = this.f5143k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5144l) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f5141i.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f5141i.get(i).intValue());
                if (findViewById != null) {
                    C1159s sVar = new C1159s(findViewById);
                    if (z) {
                        mo5733j(sVar);
                    } else {
                        mo5732g(sVar);
                    }
                    sVar.f5187c.add(this);
                    mo5833i(sVar);
                    m6273d(z ? this.f5152t : this.f5153u, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f5142j.size(); i2++) {
                View view = this.f5142j.get(i2);
                C1159s sVar2 = new C1159s(view);
                if (z) {
                    mo5733j(sVar2);
                } else {
                    mo5732g(sVar2);
                }
                sVar2.f5187c.add(this);
                mo5833i(sVar2);
                m6273d(z ? this.f5152t : this.f5153u, view, sVar2);
            }
        } else {
            m6274h(viewGroup, z);
        }
        if (!(z || (aVar = this.f5135J) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f5152t.f5191d.remove(this.f5135J.mo5011i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f5152t.f5191d.put(this.f5135J.mo5016m(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5835l(boolean z) {
        C1160t tVar;
        if (z) {
            this.f5152t.f5188a.clear();
            this.f5152t.f5189b.clear();
            tVar = this.f5152t;
        } else {
            this.f5153u.f5188a.clear();
            this.f5153u.f5189b.clear();
            tVar = this.f5153u;
        }
        tVar.f5190c.mo4912b();
    }

    /* renamed from: m */
    public AbstractC1142m clone() {
        try {
            AbstractC1142m mVar = (AbstractC1142m) super.clone();
            mVar.f5132G = new ArrayList<>();
            mVar.f5152t = new C1160t();
            mVar.f5153u = new C1160t();
            mVar.f5156x = null;
            mVar.f5157y = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo5734n(ViewGroup viewGroup, C1159s sVar, C1159s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5837o(ViewGroup viewGroup, C1160t tVar, C1160t tVar2, ArrayList<C1159s> arrayList, ArrayList<C1159s> arrayList2) {
        int i;
        Animator animator;
        C1159s sVar;
        View view;
        C1159s sVar2;
        Animator animator2;
        C0823a<Animator, C1146d> x = m6275x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C1159s sVar3 = arrayList.get(i2);
            C1159s sVar4 = arrayList2.get(i2);
            if (sVar3 != null && !sVar3.f5187c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f5187c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo5794F(sVar3, sVar4)) {
                    Animator n = mo5734n(viewGroup, sVar3, sVar4);
                    if (n != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f5186b;
                            String[] D = mo5731D();
                            if (D != null && D.length > 0) {
                                sVar2 = new C1159s(view2);
                                C1159s sVar5 = tVar2.f5188a.get(view2);
                                if (sVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < D.length) {
                                        sVar2.f5185a.put(D[i3], sVar5.f5185a.get(D[i3]));
                                        i3++;
                                        n = n;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                i = size;
                                int size2 = x.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = n;
                                        break;
                                    }
                                    C1146d dVar = x.get(x.mo5011i(i4));
                                    if (dVar.f5164c != null && dVar.f5162a == view2 && dVar.f5163b.equals(mo5844u()) && dVar.f5164c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                i = size;
                                animator2 = n;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i = size;
                            view = sVar3.f5186b;
                            animator = n;
                            sVar = null;
                        }
                        if (animator == null) {
                            continue;
                        } else if (this.f5133H == null) {
                            x.put(animator, new C1146d(view, mo5844u(), this, C1112c0.m6170d(viewGroup), sVar));
                            this.f5132G.add(animator);
                        } else {
                            throw null;
                        }
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.f5132G.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo5838p() {
        int i = this.f5128C - 1;
        this.f5128C = i;
        if (i == 0) {
            ArrayList<AbstractC1148f> arrayList = this.f5131F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5131F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC1148f) arrayList2.get(i2)).mo5765e(this);
                }
            }
            for (int i3 = 0; i3 < this.f5152t.f5190c.mo4922l(); i3++) {
                View m = this.f5152t.f5190c.mo4923m(i3);
                if (m != null) {
                    C1013s.m5784r0(m, false);
                }
            }
            for (int i4 = 0; i4 < this.f5153u.f5190c.mo4922l(); i4++) {
                View m2 = this.f5153u.f5190c.mo4923m(i4);
                if (m2 != null) {
                    C1013s.m5784r0(m2, false);
                }
            }
            this.f5130E = true;
        }
    }

    /* renamed from: q */
    public long mo5839q() {
        return this.f5139g;
    }

    /* renamed from: r */
    public AbstractC1147e mo5840r() {
        return this.f5134I;
    }

    /* renamed from: s */
    public TimeInterpolator mo5841s() {
        return this.f5140h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C1159s mo5842t(View view, boolean z) {
        C1155q qVar = this.f5154v;
        if (qVar != null) {
            return qVar.mo5842t(view, z);
        }
        ArrayList<C1159s> arrayList = z ? this.f5156x : this.f5157y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1159s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f5186b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f5157y : this.f5156x).get(i);
    }

    public String toString() {
        return mo5829b0("");
    }

    /* renamed from: u */
    public String mo5844u() {
        return this.f5137e;
    }

    /* renamed from: v */
    public AbstractC1127g mo5845v() {
        return this.f5136K;
    }

    /* renamed from: w */
    public AbstractC1154p mo5846w() {
        return this.f5133H;
    }

    /* renamed from: y */
    public long mo5847y() {
        return this.f5138f;
    }

    /* renamed from: z */
    public List<Integer> mo5848z() {
        return this.f5141i;
    }
}
