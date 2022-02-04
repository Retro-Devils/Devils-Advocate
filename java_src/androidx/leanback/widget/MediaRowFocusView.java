package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p006b.p053m.C1070b;

class MediaRowFocusView extends View {

    /* renamed from: b */
    private final Paint f2627b;

    /* renamed from: c */
    private final RectF f2628c = new RectF();

    /* renamed from: d */
    private int f2629d;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2627b = m2722a(context);
    }

    /* renamed from: a */
    private Paint m2722a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(C1070b.lb_playback_media_row_highlight_color));
        return paint;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f2629d = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        this.f2628c.set(0.0f, (float) (-height2), (float) getWidth(), (float) (getHeight() + height2));
        RectF rectF = this.f2628c;
        int i = this.f2629d;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f2627b);
    }
}
