package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p006b.p022e.p026b.p027k.C0858a;
import p006b.p022e.p026b.p027k.C0864e;

public class Barrier extends AbstractC0318b {

    /* renamed from: j */
    private int f1313j;

    /* renamed from: k */
    private int f1314k;

    /* renamed from: l */
    private C0858a f1315l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1570o(p006b.p022e.p026b.p027k.C0864e r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.f1314k = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L_0x0016
            int r7 = r5.f1313j
            if (r7 != r3) goto L_0x0013
        L_0x0010:
            r5.f1314k = r1
            goto L_0x0028
        L_0x0013:
            if (r7 != r2) goto L_0x0028
        L_0x0015:
            goto L_0x001c
        L_0x0016:
            int r7 = r5.f1313j
            if (r8 == 0) goto L_0x0022
            if (r7 != r3) goto L_0x001f
        L_0x001c:
            r5.f1314k = r0
            goto L_0x0028
        L_0x001f:
            if (r7 != r2) goto L_0x0028
            goto L_0x0010
        L_0x0022:
            if (r7 != r3) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            if (r7 != r2) goto L_0x0028
            goto L_0x0015
        L_0x0028:
            boolean r7 = r6 instanceof p006b.p022e.p026b.p027k.C0858a
            if (r7 == 0) goto L_0x0033
            b.e.b.k.a r6 = (p006b.p022e.p026b.p027k.C0858a) r6
            int r7 = r5.f1314k
            r6.mo5131M0(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m1570o(b.e.b.k.e, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0318b
    /* renamed from: g */
    public void mo1919g(AttributeSet attributeSet) {
        super.mo1919g(attributeSet);
        this.f1315l = new C0858a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0333i.f1731a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1794j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0333i.f1787i1) {
                    this.f1315l.mo5130L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0333i.f1800k1) {
                    this.f1315l.mo5132N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1435e = this.f1315l;
        mo1986m();
    }

    public int getMargin() {
        return this.f1315l.mo5128J0();
    }

    public int getType() {
        return this.f1313j;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0318b
    /* renamed from: h */
    public void mo1922h(C0864e eVar, boolean z) {
        m1570o(eVar, this.f1313j, z);
    }

    /* renamed from: n */
    public boolean mo1923n() {
        return this.f1315l.mo5126H0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1315l.mo5130L0(z);
    }

    public void setDpMargin(int i) {
        C0858a aVar = this.f1315l;
        aVar.mo5132N0((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1315l.mo5132N0(i);
    }

    public void setType(int i) {
        this.f1313j = i;
    }
}
