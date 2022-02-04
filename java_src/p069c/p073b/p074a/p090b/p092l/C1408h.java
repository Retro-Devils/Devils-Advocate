package p069c.p073b.p074a.p090b.p092l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p006b.p021d.C0838i;

/* renamed from: c.b.a.b.l.h */
public class C1408h {

    /* renamed from: a */
    private final C0838i<String, C1409i> f6019a = new C0838i<>();

    /* renamed from: b */
    private final C0838i<String, PropertyValuesHolder[]> f6020b = new C0838i<>();

    /* renamed from: a */
    private static void m7011a(C1408h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo6467h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo6469i(objectAnimator.getPropertyName(), C1409i.m7020b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C1408h m7012b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m7013c(context, resourceId);
    }

    /* renamed from: c */
    public static C1408h m7013c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m7014d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m7014d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C1408h m7014d(List<Animator> list) {
        C1408h hVar = new C1408h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m7011a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: e */
    public C1409i mo6463e(String str) {
        if (mo6466g(str)) {
            return this.f6019a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1408h)) {
            return false;
        }
        return this.f6019a.equals(((C1408h) obj).f6019a);
    }

    /* renamed from: f */
    public long mo6465f() {
        int size = this.f6019a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1409i m = this.f6019a.mo5016m(i);
            j = Math.max(j, m.mo6472c() + m.mo6473d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean mo6466g(String str) {
        return this.f6019a.get(str) != null;
    }

    /* renamed from: h */
    public void mo6467h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f6020b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f6019a.hashCode();
    }

    /* renamed from: i */
    public void mo6469i(String str, C1409i iVar) {
        this.f6019a.put(str, iVar);
    }

    public String toString() {
        return '\n' + C1408h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f6019a + "}\n";
    }
}
