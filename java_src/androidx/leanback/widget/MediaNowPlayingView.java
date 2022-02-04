package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p006b.p053m.C1074f;
import p006b.p053m.C1076h;

public class MediaNowPlayingView extends LinearLayout {

    /* renamed from: b */
    private final ImageView f2620b;

    /* renamed from: c */
    private final ImageView f2621c;

    /* renamed from: d */
    private final ImageView f2622d;

    /* renamed from: e */
    private final ObjectAnimator f2623e;

    /* renamed from: f */
    private final ObjectAnimator f2624f;

    /* renamed from: g */
    private final ObjectAnimator f2625g;

    /* renamed from: h */
    protected final LinearInterpolator f2626h;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f2626h = linearInterpolator;
        LayoutInflater.from(context).inflate(C1076h.lb_playback_now_playing_bars, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(C1074f.bar1);
        this.f2620b = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1074f.bar2);
        this.f2621c = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1074f.bar3);
        this.f2622d = imageView3;
        imageView.setPivotY((float) imageView.getDrawable().getIntrinsicHeight());
        imageView2.setPivotY((float) imageView2.getDrawable().getIntrinsicHeight());
        imageView3.setPivotY((float) imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(imageView);
        setDropScale(imageView2);
        setDropScale(imageView3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.f2623e = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(2320L);
        ofFloat.setInterpolator(linearInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.f2624f = ofFloat2;
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setDuration(2080L);
        ofFloat2.setInterpolator(linearInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f2625g = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setDuration(2000L);
        ofFloat3.setInterpolator(linearInterpolator);
    }

    /* renamed from: a */
    private void m2718a() {
        m2719b(this.f2623e);
        m2719b(this.f2624f);
        m2719b(this.f2625g);
        this.f2620b.setVisibility(0);
        this.f2621c.setVisibility(0);
        this.f2622d.setVisibility(0);
    }

    /* renamed from: b */
    private void m2719b(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    /* renamed from: c */
    private void m2720c() {
        m2721d(this.f2623e, this.f2620b);
        m2721d(this.f2624f, this.f2621c);
        m2721d(this.f2625g, this.f2622d);
        this.f2620b.setVisibility(8);
        this.f2621c.setVisibility(8);
        this.f2622d.setVisibility(8);
    }

    /* renamed from: d */
    private void m2721d(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            setDropScale(view);
        }
    }

    static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m2718a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2720c();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m2720c();
        } else {
            m2718a();
        }
    }
}
