package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p006b.p007a.C0757d;
import p006b.p007a.C0759f;
import p006b.p007a.C0760g;
import p006b.p007a.C0762i;

/* renamed from: androidx.appcompat.widget.a1 */
class C0199a1 {

    /* renamed from: a */
    private final Context f927a;

    /* renamed from: b */
    private final View f928b;

    /* renamed from: c */
    private final TextView f929c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f930d;

    /* renamed from: e */
    private final Rect f931e = new Rect();

    /* renamed from: f */
    private final int[] f932f = new int[2];

    /* renamed from: g */
    private final int[] f933g = new int[2];

    C0199a1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f930d = layoutParams;
        this.f927a = context;
        View inflate = LayoutInflater.from(context).inflate(C0760g.abc_tooltip, (ViewGroup) null);
        this.f928b = inflate;
        this.f929c = (TextView) inflate.findViewById(C0759f.message);
        layoutParams.setTitle(C0199a1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0762i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1044a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f927a.getResources().getDimensionPixelOffset(C0757d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f927a.getResources().getDimensionPixelOffset(C0757d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f927a.getResources().getDimensionPixelOffset(z ? C0757d.tooltip_y_offset_touch : C0757d.tooltip_y_offset_non_touch);
        View b = m1045b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f931e);
        Rect rect = this.f931e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f927a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f931e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f933g);
        view.getLocationOnScreen(this.f932f);
        int[] iArr = this.f932f;
        int i5 = iArr[0];
        int[] iArr2 = this.f933g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f928b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f928b.getMeasuredHeight();
        int[] iArr3 = this.f932f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f931e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* renamed from: b */
    private static View m1045b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1309c() {
        if (mo1310d()) {
            ((WindowManager) this.f927a.getSystemService("window")).removeView(this.f928b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1310d() {
        return this.f928b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1311e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1310d()) {
            mo1309c();
        }
        this.f929c.setText(charSequence);
        m1044a(view, i, i2, z, this.f930d);
        ((WindowManager) this.f927a.getSystemService("window")).addView(this.f928b, this.f930d);
    }
}
