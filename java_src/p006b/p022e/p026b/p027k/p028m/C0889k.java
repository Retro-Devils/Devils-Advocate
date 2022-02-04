package p006b.p022e.p026b.p027k.p028m;

import java.util.ArrayList;
import p006b.p022e.p026b.p027k.C0867f;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.k.m.k */
public class C0889k {

    /* renamed from: a */
    public static int f4446a;

    /* renamed from: b */
    public int f4447b = 0;

    /* renamed from: c */
    public boolean f4448c = false;

    /* renamed from: d */
    AbstractC0892m f4449d = null;

    /* renamed from: e */
    AbstractC0892m f4450e = null;

    /* renamed from: f */
    ArrayList<AbstractC0892m> f4451f = new ArrayList<>();

    /* renamed from: g */
    int f4452g = 0;

    /* renamed from: h */
    int f4453h;

    public C0889k(AbstractC0892m mVar, int i) {
        int i2 = f4446a;
        this.f4452g = i2;
        f4446a = i2 + 1;
        this.f4449d = mVar;
        this.f4450e = mVar;
        this.f4453h = i;
    }

    /* renamed from: c */
    private long m5267c(C0882f fVar, long j) {
        AbstractC0892m mVar = fVar.f4425d;
        if (mVar instanceof C0886i) {
            return j;
        }
        int size = fVar.f4432k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC0880d dVar = fVar.f4432k.get(i);
            if (dVar instanceof C0882f) {
                C0882f fVar2 = (C0882f) dVar;
                if (fVar2.f4425d != mVar) {
                    j2 = Math.min(j2, m5267c(fVar2, ((long) fVar2.f4427f) + j));
                }
            }
        }
        if (fVar != mVar.f4465i) {
            return j2;
        }
        long j3 = j - mVar.mo5269j();
        return Math.min(Math.min(j2, m5267c(mVar.f4464h, j3)), j3 - ((long) mVar.f4464h.f4427f));
    }

    /* renamed from: d */
    private long m5268d(C0882f fVar, long j) {
        AbstractC0892m mVar = fVar.f4425d;
        if (mVar instanceof C0886i) {
            return j;
        }
        int size = fVar.f4432k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC0880d dVar = fVar.f4432k.get(i);
            if (dVar instanceof C0882f) {
                C0882f fVar2 = (C0882f) dVar;
                if (fVar2.f4425d != mVar) {
                    j2 = Math.max(j2, m5268d(fVar2, ((long) fVar2.f4427f) + j));
                }
            }
        }
        if (fVar != mVar.f4464h) {
            return j2;
        }
        long j3 = j + mVar.mo5269j();
        return Math.max(Math.max(j2, m5268d(mVar.f4465i, j3)), j3 - ((long) mVar.f4465i.f4427f));
    }

    /* renamed from: a */
    public void mo5287a(AbstractC0892m mVar) {
        this.f4451f.add(mVar);
        this.f4450e = mVar;
    }

    /* renamed from: b */
    public long mo5288b(C0867f fVar, int i) {
        AbstractC0892m mVar;
        long j;
        long j2;
        long j3;
        AbstractC0892m mVar2 = this.f4449d;
        long j4 = 0;
        if (mVar2 instanceof C0879c) {
            if (((C0879c) mVar2).f4462f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar2 instanceof C0887j)) {
                return 0;
            }
        } else if (!(mVar2 instanceof C0890l)) {
            return 0;
        }
        C0882f fVar2 = (i == 0 ? fVar.f4305f : fVar.f4307g).f4464h;
        C0882f fVar3 = (i == 0 ? fVar.f4305f : fVar.f4307g).f4465i;
        boolean contains = mVar2.f4464h.f4433l.contains(fVar2);
        boolean contains2 = this.f4449d.f4465i.f4433l.contains(fVar3);
        long j5 = this.f4449d.mo5269j();
        if (!contains || !contains2) {
            if (contains) {
                C0882f fVar4 = this.f4449d.f4464h;
                j3 = m5268d(fVar4, (long) fVar4.f4427f);
                j2 = ((long) this.f4449d.f4464h.f4427f) + j5;
            } else if (contains2) {
                C0882f fVar5 = this.f4449d.f4465i;
                long c = m5267c(fVar5, (long) fVar5.f4427f);
                j2 = ((long) (-this.f4449d.f4465i.f4427f)) + j5;
                j3 = -c;
            } else {
                AbstractC0892m mVar3 = this.f4449d;
                j = ((long) mVar3.f4464h.f4427f) + mVar3.mo5269j();
                mVar = this.f4449d;
            }
            return Math.max(j3, j2);
        }
        long d = m5268d(this.f4449d.f4464h, 0);
        long c2 = m5267c(this.f4449d.f4465i, 0);
        long j6 = d - j5;
        AbstractC0892m mVar4 = this.f4449d;
        int i2 = mVar4.f4465i.f4427f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = mVar4.f4464h.f4427f;
        long j7 = ((-c2) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float m = mVar4.f4458b.mo5199m(i);
        if (m > 0.0f) {
            j4 = (long) ((((float) j7) / m) + (((float) j6) / (1.0f - m)));
        }
        float f = (float) j4;
        long j8 = ((long) ((f * m) + 0.5f)) + j5 + ((long) ((f * (1.0f - m)) + 0.5f));
        mVar = this.f4449d;
        j = ((long) mVar.f4464h.f4427f) + j8;
        return j - ((long) mVar.f4465i.f4427f);
    }
}
