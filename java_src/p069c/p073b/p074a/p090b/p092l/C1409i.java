package p069c.p073b.p074a.p090b.p092l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: c.b.a.b.l.i */
public class C1409i {

    /* renamed from: a */
    private long f6029a = 0;

    /* renamed from: b */
    private long f6030b = 300;

    /* renamed from: c */
    private TimeInterpolator f6031c = null;

    /* renamed from: d */
    private int f6032d = 0;

    /* renamed from: e */
    private int f6033e = 1;

    public C1409i(long j, long j2) {
        this.f6029a = j;
        this.f6030b = j2;
    }

    public C1409i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f6029a = j;
        this.f6030b = j2;
        this.f6031c = timeInterpolator;
    }

    /* renamed from: b */
    static C1409i m7020b(ValueAnimator valueAnimator) {
        C1409i iVar = new C1409i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m7021f(valueAnimator));
        iVar.f6032d = valueAnimator.getRepeatCount();
        iVar.f6033e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m7021f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C1401a.f6015b : interpolator instanceof AccelerateInterpolator ? C1401a.f6016c : interpolator instanceof DecelerateInterpolator ? C1401a.f6017d : interpolator;
    }

    /* renamed from: a */
    public void mo6471a(Animator animator) {
        animator.setStartDelay(mo6472c());
        animator.setDuration(mo6473d());
        animator.setInterpolator(mo6474e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo6476g());
            valueAnimator.setRepeatMode(mo6477h());
        }
    }

    /* renamed from: c */
    public long mo6472c() {
        return this.f6029a;
    }

    /* renamed from: d */
    public long mo6473d() {
        return this.f6030b;
    }

    /* renamed from: e */
    public TimeInterpolator mo6474e() {
        TimeInterpolator timeInterpolator = this.f6031c;
        return timeInterpolator != null ? timeInterpolator : C1401a.f6015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409i)) {
            return false;
        }
        C1409i iVar = (C1409i) obj;
        if (mo6472c() == iVar.mo6472c() && mo6473d() == iVar.mo6473d() && mo6476g() == iVar.mo6476g() && mo6477h() == iVar.mo6477h()) {
            return mo6474e().getClass().equals(iVar.mo6474e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo6476g() {
        return this.f6032d;
    }

    /* renamed from: h */
    public int mo6477h() {
        return this.f6033e;
    }

    public int hashCode() {
        return (((((((((int) (mo6472c() ^ (mo6472c() >>> 32))) * 31) + ((int) (mo6473d() ^ (mo6473d() >>> 32)))) * 31) + mo6474e().getClass().hashCode()) * 31) + mo6476g()) * 31) + mo6477h();
    }

    public String toString() {
        return '\n' + C1409i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo6472c() + " duration: " + mo6473d() + " interpolator: " + mo6474e().getClass() + " repeatCount: " + mo6476g() + " repeatMode: " + mo6477h() + "}\n";
    }
}
