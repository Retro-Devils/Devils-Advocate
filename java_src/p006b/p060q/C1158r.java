package p006b.p060q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* access modifiers changed from: package-private */
/* renamed from: b.q.r */
public class C1158r {

    /* renamed from: a */
    private static final boolean f5189a;

    /* renamed from: b */
    private static final boolean f5190b;

    /* renamed from: c */
    private static final boolean f5191c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f5189a = i >= 19;
        f5190b = i >= 18;
        if (i < 28) {
            z = false;
        }
        f5191c = z;
    }

    /* renamed from: a */
    static View m6371a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C1112c0.m6175i(view, matrix);
        C1112c0.m6176j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b = m6372b(view, matrix, rectF, viewGroup);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m6372b(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p060q.C1158r.m6372b(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* renamed from: c */
    static Animator m6373c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
