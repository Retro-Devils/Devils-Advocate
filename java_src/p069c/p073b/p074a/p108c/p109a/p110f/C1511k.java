package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: c.b.a.c.a.f.k */
public final class C1511k extends FrameLayout {

    /* renamed from: b */
    private final ProgressBar f6300b;

    /* renamed from: c */
    private final TextView f6301c;

    public C1511k(Context context) {
        super(context, null, C1534v.m7518d(context));
        C1510j jVar = new C1510j(context);
        setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(context);
        this.f6300b = progressBar;
        progressBar.setVisibility(8);
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        int i = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(context);
        this.f6301c = textView;
        textView.setTextAppearance(context, 16973894);
        textView.setTextColor(-1);
        textView.setVisibility(8);
        textView.setPadding(i, i, i, i);
        textView.setGravity(17);
        textView.setText(jVar.f6290a);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    /* renamed from: a */
    public final void mo6785a() {
        this.f6300b.setVisibility(8);
        this.f6301c.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo6786b() {
        this.f6300b.setVisibility(0);
        this.f6301c.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo6787c() {
        this.f6300b.setVisibility(8);
        this.f6301c.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (((float) size) / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f = (float) size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f = (float) size2;
                    float f2 = ((float) size) / 1.777f;
                    if (f >= f2) {
                        size2 = (int) f2;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size2, i2), 1073741824));
    }
}
