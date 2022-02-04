package com.digdroid.alman.dig;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p006b.p067t.p068a.C1205b;

/* access modifiers changed from: package-private */
public class MyViewPager extends C1205b {

    /* renamed from: m0 */
    C2219c3 f7672m0;

    /* renamed from: n0 */
    AbstractC2120a f7673n0 = null;

    /* renamed from: o0 */
    float f7674o0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MyViewPager$a */
    public interface AbstractC2120a {
        /* renamed from: N */
        boolean mo7950N();
    }

    public MyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7672m0 = C2219c3.m9805k(context.getApplicationContext());
    }

    /* renamed from: Q */
    private boolean m9541Q(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            return (action == 1 || action == 2) && this.f7674o0 - motionEvent.getX() < 0.0f;
        }
        this.f7674o0 = motionEvent.getX();
        return false;
    }

    /* renamed from: P */
    public void mo7949P(AbstractC2120a aVar) {
        this.f7673n0 = aVar;
    }

    @Override // p006b.p067t.p068a.C1205b
    /* renamed from: c */
    public boolean mo6081c(int i) {
        if (!this.f7672m0.mo8180c("allow_paging", true)) {
            return false;
        }
        AbstractC2120a aVar = this.f7673n0;
        if (aVar != null && !aVar.mo7950N()) {
            return false;
        }
        if (i == 17 && this.f7672m0.mo8185h() && getCurrentItem() == 1) {
            return false;
        }
        return super.mo6081c(i);
    }

    @Override // p006b.p067t.p068a.C1205b
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC2120a aVar;
        try {
            if ((!m9541Q(motionEvent) || !this.f7672m0.mo8185h() || getCurrentItem() != 1) && (aVar = this.f7673n0) != null && aVar.mo7950N()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p067t.p068a.C1205b
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception unused) {
        }
    }

    @Override // p006b.p067t.p068a.C1205b
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC2120a aVar;
        if ((!m9541Q(motionEvent) || !this.f7672m0.mo8185h() || getCurrentItem() != 1) && (aVar = this.f7673n0) != null && aVar.mo7950N()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
