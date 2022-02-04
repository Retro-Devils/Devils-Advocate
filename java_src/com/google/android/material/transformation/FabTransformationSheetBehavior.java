package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1388a;
import p069c.p073b.p074a.p090b.p092l.C1408h;
import p069c.p073b.p074a.p090b.p092l.C1410j;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f11021i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g0 */
    private void m13806g0(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f11021i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0340f) && (((CoordinatorLayout.C0340f) childAt.getLayoutParams()).mo2121f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f11021i;
                        if (map != null && map.containsKey(childAt)) {
                            i = this.f11021i.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f11021i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C1013s.m5786s0(childAt, i);
                }
            }
            if (!z) {
                this.f11021i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior, com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: H */
    public boolean mo11155H(View view, View view2, boolean z, boolean z2) {
        m13806g0(view2, z);
        return super.mo11155H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    public FabTransformationBehavior.C3295e mo11159e0(Context context, boolean z) {
        int i = z ? C1388a.mtrl_fab_transformation_sheet_expand_spec : C1388a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C3295e eVar = new FabTransformationBehavior.C3295e();
        eVar.f11014a = C1408h.m7013c(context, i);
        eVar.f11015b = new C1410j(17, 0.0f, 0.0f);
        return eVar;
    }
}
