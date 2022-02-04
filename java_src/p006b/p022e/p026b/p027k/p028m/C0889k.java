package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import p006b.p022e.p026b.p027k.C0867f;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.k.m.k */
public class C0889k {

    /* renamed from: a */
    public static int f4442a;

    /* renamed from: b */
    public int f4443b = 0;

    /* renamed from: c */
    public boolean f4444c = false;

    /* renamed from: d */
    AbstractC0892m f4445d = null;

    /* renamed from: e */
    AbstractC0892m f4446e = null;

    /* renamed from: f */
    ArrayList<AbstractC0892m> f4447f = new ArrayList<>();

    /* renamed from: g */
    int f4448g = 0;

    /* renamed from: h */
    int f4449h;

    public C0889k(AbstractC0892m mVar, int i) {
        int i2 = f4442a;
        this.f4448g = i2;
        f4442a = i2 + 1;
        this.f4445d = mVar;
        this.f4446e = mVar;
        this.f4449h = i;
    }

    /* renamed from: c */
    private long m5267c(C0882f fVar, long j) {
        AbstractC0892m mVar = fVar.f4421d;
        if (mVar instanceof C0886i) {
            return j;
        }
        int size = fVar.f4428k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC0880d dVar = fVar.f4428k.get(i);
            if (dVar instanceof C0882f) {
                C0882f fVar2 = (C0882f) dVar;
                if (fVar2.f4421d != mVar) {
                    j2 = Math.min(j2, m5267c(fVar2, ((long) fVar2.f4423f) + j));
                }
            }
        }
        if (fVar != mVar.f4461i) {
            return j2;
        }
        long j3 = j - mVar.mo5269j();
        return Math.min(Math.min(j2, m5267c(mVar.f4460h, j3)), j3 - ((long) mVar.f4460h.f4423f));
    }

    /* renamed from: d */
    private long m5268d(C0882f fVar, long j) {
        AbstractC0892m mVar = fVar.f4421d;
        if (mVar instanceof C0886i) {
            return j;
        }
        int size = fVar.f4428k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC0880d dVar = fVar.f4428k.get(i);
            if (dVar instanceof C0882f) {
                C0882f fVar2 = (C0882f) dVar;
                if (fVar2.f4421d != mVar) {
                    j2 = Math.max(j2, m5268d(fVar2, ((long) fVar2.f4423f) + j));
                }
            }
        }
        if (fVar != mVar.f4460h) {
            return j2;
        }
        long j3 = j + mVar.mo5269j();
        return Math.max(Math.max(j2, m5268d(mVar.f4461i, j3)), j3 - ((long) mVar.f4461i.f4423f));
    }

    /* renamed from: a */
    public void mo5287a(AbstractC0892m mVar) {
        this.f4447f.add(mVar);
        this.f4446e = mVar;
    }

    /* renamed from: b */
    public long mo5288b(C0867f fVar, int i) {
        AbstractC0892m mVar;
        long j;
        long j2;
        long j3;
        AbstractC0892m mVar2 = this.f4445d;
        long j4 = 0;
        if (mVar2 instanceof C0879c) {
            if (((C0879c) mVar2).f4458f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar2 instanceof C0887j)) {
                return 0;
            }
        } else if (!(mVar2 instanceof C0890l)) {
            return 0;
        }
        C0882f fVar2 = (i == 0 ? fVar.f4301f : fVar.f4303g).f4460h;
        C0882f fVar3 = (i == 0 ? fVar.f4301f : fVar.f4303g).f4461i;
        boolean contains = mVar2.f4460h.f4429l.contains(fVar2);
        boolean contains2 = this.f4445d.f4461i.f4429l.contains(fVar3);
        long j5 = this.f4445d.mo5269j();
        if (!contains || !contains2) {
            if (contains) {
                C0882f fVar4 = this.f4445d.f4460h;
                j3 = m5268d(fVar4, (long) fVar4.f4423f);
                j2 = ((long) this.f4445d.f4460h.f4423f) + j5;
            } else if (contains2) {
                C0882f fVar5 = this.f4445d.f4461i;
                long c = m5267c(fVar5, (long) fVar5.f4423f);
                j2 = ((long) (-this.f4445d.f4461i.f4423f)) + j5;
                j3 = -c;
            } else {
                AbstractC0892m mVar3 = this.f4445d;
                j = ((long) mVar3.f4460h.f4423f) + mVar3.mo5269j();
                mVar = this.f4445d;
            }
            return Math.max(j3, j2);
        }
        long d = m5268d(this.f4445d.f4460h, 0);
        long c2 = m5267c(this.f4445d.f4461i, 0);
        long j6 = d - j5;
        AbstractC0892m mVar4 = this.f4445d;
        int i2 = mVar4.f4461i.f4423f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = mVar4.f4460h.f4423f;
        long j7 = ((-c2) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float m = mVar4.f4454b.mo5199m(i);
        if (m > 0.0f) {
            j4 = (long) ((((float) j7) / m) + (((float) j6) / (1.0f - m)));
        }
        float f = (float) j4;
        long j8 = ((long) ((f * m) + 0.5f)) + j5 + ((long) ((f * (1.0f - m)) + 0.5f));
        mVar = this.f4445d;
        j = ((long) mVar.f4460h.f4423f) + j8;
        return j - ((long) mVar.f4461i.f4423f);
    }
}
