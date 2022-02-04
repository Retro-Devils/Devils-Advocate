package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC0597u;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.v */
public final class C0599v extends AbstractC0597u {
    C0599v() {
    }

    /* renamed from: R */
    private int m3177R(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.f2828g; i >= this.f2827f; i--) {
                int i2 = mo3339q(i).f2831a;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.f2826e - 1) {
                    return i;
                }
            }
            return -1;
        }
        for (int i3 = this.f2827f; i3 <= this.f2828g; i3++) {
            int i4 = mo3339q(i3).f2831a;
            if (i4 == this.f2826e - 1) {
                z2 = true;
            } else if (z2 && i4 == 0) {
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c0, code lost:
        if (r13.f2824c != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c6, code lost:
        r10 = r13.f2825d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e5, code lost:
        if (r13.f2824c != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012f, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ff A[LOOP:2: B:77:0x00ff->B:91:0x0123, LOOP_START, PHI: r6 r9 r10 
      PHI: (r6v10 int) = (r6v3 int), (r6v14 int) binds: [B:76:0x00fd, B:91:0x0123] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v7 int) = (r9v5 int), (r9v8 int) binds: [B:76:0x00fd, B:91:0x0123] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v3 int) = (r10v2 int), (r10v5 int) binds: [B:76:0x00fd, B:91:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0131  */
    @Override // androidx.leanback.widget.AbstractC0597u
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3609J(int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 347
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0599v.mo3609J(int, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00be, code lost:
        if (r12.f2824c != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c3, code lost:
        r9 = -r12.f2825d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e0, code lost:
        if (r12.f2824c != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012c, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fc A[LOOP:2: B:77:0x00fc->B:91:0x0120, LOOP_START, PHI: r5 r8 r9 
      PHI: (r5v10 int) = (r5v3 int), (r5v14 int) binds: [B:76:0x00fa, B:91:0x0120] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v7 int) = (r8v5 int), (r8v8 int) binds: [B:76:0x00fa, B:91:0x0120] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v2 int) = (r9v1 int), (r9v4 int) binds: [B:76:0x00fa, B:91:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012e  */
    @Override // androidx.leanback.widget.AbstractC0597u
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3615Q(int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0599v.mo3615Q(int, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public int mo3616S(int i) {
        AbstractC0597u.C0598a N;
        int i2 = this.f2827f;
        if (i2 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f2824c) {
            int b = this.f2823b.mo3350b(i2);
            if (mo3339q(this.f2827f).f2831a == i) {
                return b;
            }
            int i3 = this.f2827f;
            do {
                i3++;
                if (i3 <= mo3611M()) {
                    N = mo3339q(i3);
                    b += N.f2979b;
                }
            } while (N.f2831a != i);
            return b;
        }
        int b2 = this.f2823b.mo3350b(this.f2828g);
        AbstractC0597u.C0598a N2 = mo3339q(this.f2828g);
        if (N2.f2831a != i) {
            int i4 = this.f2828g;
            while (true) {
                i4--;
                if (i4 < mo3610L()) {
                    break;
                }
                b2 -= N2.f2979b;
                N2 = mo3339q(i4);
                if (N2.f2831a == i) {
                    break;
                }
            }
        }
        return b2 + N2.f2980c;
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public int mo3617T(int i) {
        AbstractC0597u.C0598a N;
        int i2 = this.f2827f;
        if (i2 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f2824c) {
            int b = this.f2823b.mo3350b(this.f2828g);
            AbstractC0597u.C0598a N2 = mo3339q(this.f2828g);
            if (N2.f2831a != i) {
                int i3 = this.f2828g;
                while (true) {
                    i3--;
                    if (i3 < mo3610L()) {
                        break;
                    }
                    b -= N2.f2979b;
                    N2 = mo3339q(i3);
                    if (N2.f2831a == i) {
                        break;
                    }
                }
            }
            return b - N2.f2980c;
        }
        int b2 = this.f2823b.mo3350b(i2);
        if (mo3339q(this.f2827f).f2831a == i) {
            return b2;
        }
        int i4 = this.f2827f;
        do {
            i4++;
            if (i4 <= mo3611M()) {
                N = mo3339q(i4);
                b2 += N.f2979b;
            }
        } while (N.f2831a != i);
        return b2;
        return Integer.MAX_VALUE;
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: i */
    public int mo3331i(boolean z, int i, int[] iArr) {
        int i2;
        int b = this.f2823b.mo3350b(i);
        AbstractC0597u.C0598a N = mo3339q(i);
        int i3 = N.f2831a;
        if (this.f2824c) {
            i2 = i3;
            int i4 = i2;
            int i5 = 1;
            int i6 = i + 1;
            int i7 = b;
            while (i5 < this.f2826e && i6 <= this.f2828g) {
                AbstractC0597u.C0598a N2 = mo3339q(i6);
                i7 += N2.f2979b;
                int i8 = N2.f2831a;
                if (i8 != i4) {
                    i5++;
                    if (!z ? i7 >= b : i7 <= b) {
                        i4 = i8;
                    } else {
                        b = i7;
                        i = i6;
                        i2 = i8;
                        i4 = i2;
                    }
                }
                i6++;
            }
        } else {
            int i9 = i - 1;
            int i10 = 1;
            int i11 = i3;
            AbstractC0597u.C0598a aVar = N;
            int i12 = b;
            b = this.f2823b.mo3349a(i) + b;
            i2 = i11;
            while (i10 < this.f2826e && i9 >= this.f2827f) {
                i12 -= aVar.f2979b;
                aVar = mo3339q(i9);
                int i13 = aVar.f2831a;
                if (i13 != i11) {
                    i10++;
                    int a = this.f2823b.mo3349a(i9) + i12;
                    if (!z ? a >= b : a <= b) {
                        i11 = i13;
                    } else {
                        b = a;
                        i = i9;
                        i2 = i13;
                        i11 = i2;
                    }
                }
                i9--;
            }
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return b;
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: k */
    public int mo3333k(boolean z, int i, int[] iArr) {
        int i2;
        int b = this.f2823b.mo3350b(i);
        AbstractC0597u.C0598a N = mo3339q(i);
        int i3 = N.f2831a;
        if (this.f2824c) {
            int i4 = i - 1;
            int i5 = 1;
            i2 = b - this.f2823b.mo3349a(i);
            int i6 = i3;
            while (i5 < this.f2826e && i4 >= this.f2827f) {
                b -= N.f2979b;
                N = mo3339q(i4);
                int i7 = N.f2831a;
                if (i7 != i6) {
                    i5++;
                    int a = b - this.f2823b.mo3349a(i4);
                    if (!z ? a >= i2 : a <= i2) {
                        i6 = i7;
                    } else {
                        i2 = a;
                        i = i4;
                        i3 = i7;
                        i6 = i3;
                    }
                }
                i4--;
            }
        } else {
            int i8 = i3;
            int i9 = i8;
            int i10 = 1;
            int i11 = i + 1;
            int i12 = b;
            while (i10 < this.f2826e && i11 <= this.f2828g) {
                AbstractC0597u.C0598a N2 = mo3339q(i11);
                i12 += N2.f2979b;
                int i13 = N2.f2831a;
                if (i13 != i9) {
                    i10++;
                    if (!z ? i12 >= b : i12 <= b) {
                        i9 = i13;
                    } else {
                        b = i12;
                        i = i11;
                        i8 = i13;
                        i9 = i8;
                    }
                }
                i11++;
            }
            i2 = b;
            i3 = i8;
        }
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i;
        }
        return i2;
    }
}
