package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.C0562f;
import androidx.leanback.widget.C0576j;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.k */
public class C0578k {

    /* renamed from: a */
    private static Rect f2910a = new Rect();

    /* renamed from: a */
    static int m3093a(View view, C0576j.C0577a aVar, int i) {
        View view2;
        int i2;
        C0562f.C0567e eVar = (C0562f.C0567e) view.getLayoutParams();
        int i3 = aVar.f2904a;
        if (i3 == 0 || (view2 = view.findViewById(i3)) == null) {
            view2 = view;
        }
        int i4 = aVar.f2906c;
        if (i != 0) {
            if (aVar.f2908e) {
                float f = aVar.f2907d;
                if (f == 0.0f) {
                    i4 += view2.getPaddingTop();
                } else if (f == 100.0f) {
                    i4 -= view2.getPaddingBottom();
                }
            }
            if (aVar.f2907d != -1.0f) {
                i4 += (int) ((((float) (view2 == view ? eVar.mo3491l(view2) : view2.getHeight())) * aVar.f2907d) / 100.0f);
            }
            if (view != view2) {
                Rect rect = f2910a;
                rect.top = i4;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                i2 = f2910a.top - eVar.mo3497r();
            } else {
                i2 = i4;
            }
            return aVar.mo3524e() ? i2 + view2.getBaseline() : i2;
        } else if (view.getLayoutDirection() == 1) {
            int s = (view2 == view ? eVar.mo3498s(view2) : view2.getWidth()) - i4;
            if (aVar.f2908e) {
                float f2 = aVar.f2907d;
                if (f2 == 0.0f) {
                    s -= view2.getPaddingRight();
                } else if (f2 == 100.0f) {
                    s += view2.getPaddingLeft();
                }
            }
            if (aVar.f2907d != -1.0f) {
                s -= (int) ((((float) (view2 == view ? eVar.mo3498s(view2) : view2.getWidth())) * aVar.f2907d) / 100.0f);
            }
            if (view == view2) {
                return s;
            }
            Rect rect2 = f2910a;
            rect2.right = s;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect2);
            return f2910a.right + eVar.mo3495p();
        } else {
            if (aVar.f2908e) {
                float f3 = aVar.f2907d;
                if (f3 == 0.0f) {
                    i4 += view2.getPaddingLeft();
                } else if (f3 == 100.0f) {
                    i4 -= view2.getPaddingRight();
                }
            }
            if (aVar.f2907d != -1.0f) {
                i4 += (int) ((((float) (view2 == view ? eVar.mo3498s(view2) : view2.getWidth())) * aVar.f2907d) / 100.0f);
            }
            if (view == view2) {
                return i4;
            }
            Rect rect3 = f2910a;
            rect3.left = i4;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect3);
            return f2910a.left - eVar.mo3493n();
        }
    }
}
