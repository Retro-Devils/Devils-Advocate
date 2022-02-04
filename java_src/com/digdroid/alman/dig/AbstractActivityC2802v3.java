package com.digdroid.alman.dig;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.Toolbar;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.v3 */
public abstract class AbstractActivityC2802v3 extends AbstractActivityC2260e0 {

    /* renamed from: b0 */
    static final String[] f9488b0 = {"back", "home", "mainmenu", "voice", "info", "systems", "genres", "collections", "faves", "played", "allgames", "options", "search", "sort", "random", "pagemenu", "mediapause", "mediaplay", "medianext"};

    /* renamed from: c0 */
    static final int[] f9489c0 = {R.string.back, R.string.home, R.string.main_menu, R.string.voice_search, R.string.info, R.string.systems, R.string.genres, R.string.collections, R.string.favorites, R.string.played_games, R.string.all_games, R.string.options, R.string.search, R.string.sort_menu, R.string.select_random, R.string.page_menu, R.string.media_pause, R.string.media_play, R.string.media_next};

    /* renamed from: d0 */
    static final int[] f9490d0 = {1, 16, 4, 3, 26, 17, 18, 28, 19, 23, 20, 21, 27, 15, 25, 5, 29, 30, 31};

    /* renamed from: e0 */
    LinearLayout f9491e0 = null;

    /* renamed from: f0 */
    LinearLayout f9492f0 = null;

    /* renamed from: g0 */
    boolean[] f9493g0;

    /* renamed from: h0 */
    boolean[] f9494h0;

    /* renamed from: i0 */
    boolean[] f9495i0;

    /* renamed from: j0 */
    boolean[] f9496j0;

    /* renamed from: k0 */
    boolean f9497k0;

    /* renamed from: l0 */
    boolean f9498l0;

    /* renamed from: m0 */
    ImageView[] f9499m0;

    /* renamed from: n0 */
    ImageView f9500n0;

    /* renamed from: o0 */
    ImageView f9501o0;

    /* renamed from: p0 */
    int f9502p0 = 0;

    /* renamed from: q0 */
    int f9503q0 = -1;

    /* renamed from: r0 */
    Toolbar f9504r0;

    /* renamed from: s0 */
    Handler f9505s0 = new Handler();

    /* renamed from: t0 */
    String f9506t0 = "";

    /* renamed from: u0 */
    boolean f9507u0 = false;

    /* renamed from: v0 */
    boolean f9508v0 = false;

    /* renamed from: w0 */
    boolean f9509w0 = false;

    /* renamed from: x0 */
    boolean f9510x0 = false;

    /* renamed from: y0 */
    String f9511y0 = "";

    /* renamed from: com.digdroid.alman.dig.v3$a */
    class View$OnClickListenerC2803a implements View.OnClickListener {
        View$OnClickListenerC2803a() {
        }

        public void onClick(View view) {
            C2219c3 c3Var = AbstractActivityC2802v3.this.f9267w;
            c3Var.mo8155D("icons_toolbar_scale", Math.max(c3Var.mo8183f("icons_toolbar_scale", 10.0f) - 0.25f, 2.0f));
            AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
            v3Var.mo9367H1(v3Var.f9511y0, true);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$b */
    class View$OnClickListenerC2804b implements View.OnClickListener {
        View$OnClickListenerC2804b() {
        }

        public void onClick(View view) {
            C2219c3 c3Var = AbstractActivityC2802v3.this.f9267w;
            c3Var.mo8155D("icons_toolbar_scale", Math.min(c3Var.mo8183f("icons_toolbar_scale", 10.0f) + 0.25f, 20.0f));
            AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
            v3Var.mo9367H1(v3Var.f9511y0, true);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$c */
    class View$OnClickListenerC2805c implements View.OnClickListener {
        View$OnClickListenerC2805c() {
        }

        public void onClick(View view) {
            C2219c3 c3Var = AbstractActivityC2802v3.this.f9267w;
            c3Var.mo8155D("toolbar_icon_spacing", Math.min(c3Var.mo8183f("toolbar_icon_spacing", 0.08f) + 0.02f, 1.0f));
            AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
            v3Var.mo9367H1(v3Var.f9511y0, true);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$d */
    class View$OnClickListenerC2806d implements View.OnClickListener {
        View$OnClickListenerC2806d() {
        }

        public void onClick(View view) {
            C2219c3 c3Var = AbstractActivityC2802v3.this.f9267w;
            c3Var.mo8155D("toolbar_icon_spacing", Math.max(c3Var.mo8183f("toolbar_icon_spacing", 0.08f) - 0.02f, 0.0f));
            AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
            v3Var.mo9367H1(v3Var.f9511y0, true);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$e */
    class View$OnClickListenerC2807e implements View.OnClickListener {
        View$OnClickListenerC2807e() {
        }

        public void onClick(View view) {
            C2219c3 c3Var = AbstractActivityC2802v3.this.f9267w;
            c3Var.mo8155D("toolbar_icons_padding", Math.min(c3Var.mo8183f("toolbar_icons_padding", 0.0f) + 0.02f, 1.0f));
            AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
            v3Var.mo9367H1(v3Var.f9511y0, true);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$f */
    class View$OnClickListenerC2808f implements View.OnClickListener {
        View$OnClickListenerC2808f() {
        }

        public void onClick(View view) {
            C2219c3 c3Var = AbstractActivityC2802v3.this.f9267w;
            c3Var.mo8155D("toolbar_icons_padding", Math.max(c3Var.mo8183f("toolbar_icons_padding", 0.0f) - 0.02f, 0.0f));
            AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
            v3Var.mo9367H1(v3Var.f9511y0, true);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$g */
    class View$OnClickListenerC2809g implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9518b;

        /* renamed from: c */
        final /* synthetic */ View f9519c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f9520d;

        /* renamed from: e */
        final /* synthetic */ LinearLayout f9521e;

        View$OnClickListenerC2809g(AbstractC2531p1 p1Var, View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.f9518b = p1Var;
            this.f9519c = view;
            this.f9520d = linearLayout;
            this.f9521e = linearLayout2;
        }

        public void onClick(View view) {
            this.f9518b.mo8898Z2("none");
            AbstractActivityC2802v3.this.mo9366F1("nont", this.f9519c, this.f9520d, this.f9521e);
            AbstractActivityC2802v3.this.mo8911v(null);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$h */
    class View$OnClickListenerC2810h implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9523b;

        /* renamed from: c */
        final /* synthetic */ View f9524c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f9525d;

        /* renamed from: e */
        final /* synthetic */ LinearLayout f9526e;

        View$OnClickListenerC2810h(AbstractC2531p1 p1Var, View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.f9523b = p1Var;
            this.f9524c = view;
            this.f9525d = linearLayout;
            this.f9526e = linearLayout2;
        }

        public void onClick(View view) {
            this.f9523b.mo8898Z2("default");
            AbstractActivityC2802v3.this.mo9366F1("default", this.f9524c, this.f9525d, this.f9526e);
            AbstractActivityC2802v3.this.mo8911v(null);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$i */
    class View$OnClickListenerC2811i implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9528b;

        /* renamed from: c */
        final /* synthetic */ View f9529c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f9530d;

        /* renamed from: e */
        final /* synthetic */ LinearLayout f9531e;

        View$OnClickListenerC2811i(AbstractC2531p1 p1Var, View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.f9528b = p1Var;
            this.f9529c = view;
            this.f9530d = linearLayout;
            this.f9531e = linearLayout2;
        }

        public void onClick(View view) {
            C2774t3 t3Var = C2553q3.f8891a;
            if (t3Var != null) {
                if (t3Var.f9415s.equals("")) {
                    new DialogInterfaceC0068b.C0069a(AbstractActivityC2802v3.this, C2553q3.m11117c()).mo228h(R.string.no_icons).mo235o(R.string.ok, null).mo221a().show();
                    ((RadioButton) view).setChecked(false);
                    return;
                }
                this.f9528b.mo8898Z2("icons_top");
                AbstractActivityC2802v3.this.mo9366F1("icons_top", this.f9529c, this.f9530d, this.f9531e);
                AbstractActivityC2802v3.this.mo8911v(null);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$j */
    class View$OnClickListenerC2812j implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9533b;

        /* renamed from: c */
        final /* synthetic */ View f9534c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f9535d;

        /* renamed from: e */
        final /* synthetic */ LinearLayout f9536e;

        View$OnClickListenerC2812j(AbstractC2531p1 p1Var, View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.f9533b = p1Var;
            this.f9534c = view;
            this.f9535d = linearLayout;
            this.f9536e = linearLayout2;
        }

        public void onClick(View view) {
            C2774t3 t3Var = C2553q3.f8891a;
            if (t3Var != null) {
                if (t3Var.f9415s.equals("")) {
                    new DialogInterfaceC0068b.C0069a(AbstractActivityC2802v3.this, C2553q3.m11117c()).mo228h(R.string.no_icons).mo235o(R.string.ok, null).mo221a().show();
                    ((RadioButton) view).setChecked(false);
                    return;
                }
                this.f9533b.mo8898Z2("icons_bottom");
                AbstractActivityC2802v3.this.mo9366F1("icons_bottom", this.f9534c, this.f9535d, this.f9536e);
                AbstractActivityC2802v3.this.mo8911v(null);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$k */
    class RunnableC2813k implements Runnable {
        RunnableC2813k() {
        }

        public void run() {
            boolean z;
            AbstractActivityC2802v3 v3Var;
            if (AbstractActivityC2802v3.this.f9267w.mo8198v()) {
                v3Var = AbstractActivityC2802v3.this;
                z = !v3Var.f9509w0;
            } else {
                v3Var = AbstractActivityC2802v3.this;
                z = false;
            }
            v3Var.f9509w0 = z;
            AbstractActivityC2802v3.this.mo9370K1();
            AbstractActivityC2802v3.this.f9505s0.postDelayed(this, 500);
        }
    }

    /* renamed from: com.digdroid.alman.dig.v3$l */
    class DialogInterface$OnClickListenerC2814l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9539b;

        DialogInterface$OnClickListenerC2814l(AbstractC2531p1 p1Var) {
            this.f9539b = p1Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f9539b.mo8111P2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$m */
    public class DialogInterface$OnMultiChoiceClickListenerC2815m implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f9541a;

        DialogInterface$OnMultiChoiceClickListenerC2815m(boolean[] zArr) {
            this.f9541a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f9541a[i] = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$n */
    public class DialogInterface$OnClickListenerC2816n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f9543b;

        /* renamed from: c */
        final /* synthetic */ boolean[] f9544c;

        DialogInterface$OnClickListenerC2816n(int i, boolean[] zArr) {
            this.f9543b = i;
            this.f9544c = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f9543b; i2++) {
                if (this.f9544c[i2]) {
                    z = true;
                }
            }
            if (z) {
                for (int i3 = 0; i3 < this.f9543b; i3++) {
                    AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
                    v3Var.f9495i0[i3] = this.f9544c[i3];
                    C2219c3 c3Var = v3Var.f9267w;
                    c3Var.mo8153B("icon_" + AbstractActivityC2802v3.f9488b0[i3] + "_enabled", this.f9544c[i3]);
                }
                AbstractActivityC2802v3.this.mo8911v(null);
                return;
            }
            new DialogInterfaceC0068b.C0069a(AbstractActivityC2802v3.this, C2553q3.m11117c()).mo228h(R.string.icon_required).mo235o(R.string.ok, null).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$o */
    public class View$OnClickListenerC2817o implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f9546b;

        /* renamed from: c */
        final /* synthetic */ int f9547c;

        View$OnClickListenerC2817o(int i, int i2) {
            this.f9546b = i;
            this.f9547c = i2;
        }

        public void onClick(View view) {
            AbstractActivityC2802v3.this.mo8914G1(false);
            AbstractActivityC2802v3.this.f9502p0 = this.f9546b;
            view.clearFocus();
            AbstractActivityC2802v3.this.mo8945z1(this.f9547c);
            AbstractActivityC2802v3.this.mo8914G1(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$p */
    public class View$OnLongClickListenerC2818p implements View.OnLongClickListener {
        View$OnLongClickListenerC2818p() {
        }

        public boolean onLongClick(View view) {
            if (!AbstractActivityC2802v3.this.mo8912y()) {
                return false;
            }
            AbstractActivityC2802v3.this.mo9371w1();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$q */
    public class View$OnFocusChangeListenerC2819q implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ int f9550a;

        View$OnFocusChangeListenerC2819q(int i) {
            this.f9550a = i;
        }

        public void onFocusChange(View view, boolean z) {
            if (view == null || AbstractActivityC2802v3.this.mo8908l()) {
                return;
            }
            if (!z) {
                AbstractActivityC2802v3 v3Var = AbstractActivityC2802v3.this;
                if (v3Var.f9494h0[this.f9550a]) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(v3Var, R.anim.scale_out_icon);
                    view.startAnimation(loadAnimation);
                    loadAnimation.setFillAfter(true);
                    AbstractActivityC2802v3.this.f9494h0[this.f9550a] = false;
                }
            } else if (AbstractActivityC2802v3.this.mo8913E1()) {
                AbstractActivityC2802v3 v3Var2 = AbstractActivityC2802v3.this;
                boolean[] zArr = v3Var2.f9494h0;
                int i = this.f9550a;
                if (!zArr[i]) {
                    v3Var2.f9502p0 = i;
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(v3Var2, R.anim.scale_in_icon);
                    view.startAnimation(loadAnimation2);
                    loadAnimation2.setFillAfter(true);
                    AbstractActivityC2802v3.this.f9494h0[this.f9550a] = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$r */
    public class View$OnFocusChangeListenerC2820r implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC2820r() {
        }

        public void onFocusChange(View view, boolean z) {
            AbstractActivityC2802v3 v3Var;
            int i;
            if (view != null && !AbstractActivityC2802v3.this.mo8908l()) {
                if (!z) {
                    v3Var = AbstractActivityC2802v3.this;
                    i = R.anim.scale_out_icon;
                } else if (AbstractActivityC2802v3.this.mo8913E1()) {
                    v3Var = AbstractActivityC2802v3.this;
                    i = R.anim.scale_in_icon;
                } else {
                    return;
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(v3Var, i);
                view.startAnimation(loadAnimation);
                loadAnimation.setFillAfter(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$s */
    public class View$OnClickListenerC2821s implements View.OnClickListener {
        View$OnClickListenerC2821s() {
        }

        public void onClick(View view) {
            AbstractActivityC2802v3.this.mo8914G1(false);
            AbstractActivityC2802v3.this.mo8285n1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$t */
    public class View$OnFocusChangeListenerC2822t implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC2822t() {
        }

        public void onFocusChange(View view, boolean z) {
            AbstractActivityC2802v3 v3Var;
            int i;
            if (view != null && !AbstractActivityC2802v3.this.mo8908l()) {
                if (!z) {
                    v3Var = AbstractActivityC2802v3.this;
                    i = R.anim.scale_out_icon;
                } else {
                    v3Var = AbstractActivityC2802v3.this;
                    i = R.anim.scale_in_icon;
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(v3Var, i);
                view.startAnimation(loadAnimation);
                loadAnimation.setFillAfter(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$u */
    public class View$OnClickListenerC2823u implements View.OnClickListener {
        View$OnClickListenerC2823u() {
        }

        public void onClick(View view) {
            AbstractActivityC2802v3.this.mo8914G1(false);
            AbstractActivityC2802v3.this.mo7917L1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v3$v */
    public class RunnableC2824v implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AbstractC2531p1 f9556b;

        RunnableC2824v(AbstractC2531p1 p1Var) {
            this.f9556b = p1Var;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
            if (r13.f9557c.mo9128C1() != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dc, code lost:
            if (r13.f9557c.mo9128C1() == false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
            if (r13.f9556b.mo8248r2() >= 0) goto L_0x00b4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x013d  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01d4 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 522
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.AbstractActivityC2802v3.RunnableC2824v.run():void");
        }
    }

    /* renamed from: A1 */
    public void mo9365A1(String str) {
        LinearLayout linearLayout;
        AbstractC2531p1 k1 = mo8280k1();
        if (k1 != null) {
            if ((str.equals("icons_top") || str.equals("icons_bottom")) && (linearLayout = this.f9491e0) != null) {
                linearLayout.post(new RunnableC2824v(k1));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public abstract boolean mo9127B1();

    /* access modifiers changed from: package-private */
    /* renamed from: C1 */
    public abstract boolean mo9128C1();

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public abstract boolean mo9129D1();

    /* access modifiers changed from: package-private */
    /* renamed from: E1 */
    public abstract boolean mo8913E1();

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public void mo9366F1(String str, View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
        int i = 0;
        boolean z = str.equals("icons_top") || str.equals("icons_bottom");
        linearLayout.setVisibility(z ? 0 : 8);
        view.setVisibility(z ? 0 : 8);
        if (!z) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public abstract void mo8914G1(boolean z);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r4 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        if (r4 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        r4.setVisibility(8);
     */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9367H1(java.lang.String r3, boolean r4) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.AbstractActivityC2802v3.mo9367H1(java.lang.String, boolean):void");
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: I */
    public View mo8904I() {
        LinearLayout linearLayout;
        AbstractC2531p1 k1 = mo8280k1();
        return (k1 == null || k1.mo8409w2().equals("default") || (linearLayout = this.f9491e0) == null) ? this.f9504r0 : linearLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public void mo9368I1(int i) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_layout);
        View childAt = linearLayout.getChildAt(1);
        String str = this.f9511y0;
        str.hashCode();
        if (!str.equals("icons_top")) {
            if (str.equals("icons_bottom") && childAt.getId() != R.id.pager) {
                linearLayout.removeView(this.f9491e0);
                linearLayout.addView(this.f9491e0);
            }
        } else if (childAt.getId() != R.id.icons_top) {
            linearLayout.removeView(this.f9491e0);
            linearLayout.addView(this.f9491e0, 1);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9491e0.getLayoutParams();
        layoutParams.height = i;
        this.f9491e0.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f9492f0.getLayoutParams();
        layoutParams2.gravity = this.f9511y0.equals("icons_top") ? 48 : 80;
        layoutParams2.height = i;
        this.f9492f0.setLayoutParams(layoutParams2);
    }

    /* renamed from: J1 */
    public boolean mo9369J1(boolean z, boolean z2) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (this.f9492f0 == null) {
            return false;
        }
        if (!this.f9511y0.equals("icons_top") && !this.f9511y0.equals("icons_bottom")) {
            return false;
        }
        boolean z3 = this.f9498l0;
        if (z) {
            if (!z3 && (imageView4 = this.f9501o0) != null) {
                this.f9492f0.addView(imageView4, 0);
            }
        } else if (z3 && (imageView3 = this.f9501o0) != null) {
            this.f9492f0.removeView(imageView3);
        }
        this.f9498l0 = z;
        if (!this.f9267w.mo8198v()) {
            if (this.f9497k0 && (imageView2 = this.f9500n0) != null) {
                this.f9492f0.removeView(imageView2);
            }
            this.f9497k0 = false;
        } else {
            if (!this.f9497k0 && (imageView = this.f9500n0) != null) {
                this.f9492f0.addView(imageView);
            }
            if (this.f9500n0 != null) {
                Drawable drawable = getResources().getDrawable(R.drawable.ic_announcements);
                drawable.mutate();
                drawable.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), z2 ? PorterDuff.Mode.SRC_ATOP : PorterDuff.Mode.CLEAR));
                this.f9500n0.setImageDrawable(drawable);
            }
            this.f9497k0 = true;
        }
        this.f9492f0.postInvalidate();
        return true;
    }

    /* renamed from: K1 */
    public void mo9370K1() {
        boolean z = false;
        boolean z2 = this.f9267w.mo8191o() || this.f9267w.mo8186i();
        if (this.f9267w.mo8198v() && this.f9509w0) {
            z = true;
        }
        if (mo9369J1(z2, this.f9509w0)) {
            return;
        }
        if ((!this.f8052T && z2 != this.f9507u0) || z != this.f9508v0) {
            invalidateOptionsMenu();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public abstract void mo7917L1();

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: W */
    public void mo8905W(String str) {
        if (!str.equals(this.f9506t0)) {
            this.f9506t0 = str;
            try {
                Toolbar toolbar = this.f9504r0;
                if (toolbar != null) {
                    toolbar.setTitle(str);
                    if (!this.f8052T) {
                        mo241J0();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: e */
    public void mo8906e() {
        if ((this.f9511y0.equals("icons_top") || this.f9511y0.equals("icons_bottom")) && this.f9491e0 != null) {
            mo8914G1(true);
            int i = this.f9502p0;
            if (i >= 0) {
                boolean[] zArr = this.f9493g0;
                if (i < zArr.length && zArr[i]) {
                    ImageView imageView = this.f9499m0[i];
                    if (imageView != null) {
                        imageView.requestFocus();
                        return;
                    }
                    return;
                }
            }
            this.f9502p0 = -1;
            int i2 = 0;
            while (true) {
                boolean[] zArr2 = this.f9493g0;
                if (i2 >= zArr2.length) {
                    return;
                }
                if (zArr2[i2]) {
                    this.f9502p0 = i2;
                    ImageView imageView2 = this.f9499m0[i2];
                    if (imageView2 != null) {
                        imageView2.requestFocus();
                        return;
                    }
                    return;
                }
                i2++;
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractActivityC2260e0
    /* renamed from: l1 */
    public Toolbar mo8281l1() {
        return this.f9504r0;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2800v1, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f9504r0 = toolbar;
        mo250S0(toolbar);
        String[] strArr = f9488b0;
        this.f9493g0 = new boolean[strArr.length];
        this.f9494h0 = new boolean[strArr.length];
        this.f9495i0 = new boolean[strArr.length];
        this.f9496j0 = new boolean[strArr.length];
        this.f9499m0 = new ImageView[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = f9488b0;
            if (i < strArr2.length) {
                boolean[] zArr = this.f9495i0;
                C2219c3 c3Var = this.f9267w;
                zArr[i] = c3Var.mo8180c("icon_" + strArr2[i] + "_enabled", true);
                this.f9496j0[i] = false;
                this.f9499m0[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onPause() {
        super.onPause();
        this.f9505s0.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onResume() {
        super.onResume();
        this.f9505s0.post(new RunnableC2813k());
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: v */
    public synchronized void mo8911v(String str) {
        mo9367H1(str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void mo9371w1() {
        int length = f9489c0.length;
        String[] strArr = new String[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = getString(f9489c0[i]);
            zArr[i] = this.f9495i0[i];
        }
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c());
        aVar.mo231k(strArr, zArr, new DialogInterface$OnMultiChoiceClickListenerC2815m(zArr));
        aVar.mo235o(R.string.ok, new DialogInterface$OnClickListenerC2816n(length, zArr));
        aVar.mo232l(R.string.cancel, null);
        aVar.mo221a().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo9372x1() {
        AbstractC2531p1 k1 = mo8280k1();
        if (k1 != null) {
            String w2 = k1.mo8409w2();
            View inflate = getLayoutInflater().inflate(R.layout.config_toolbar, (ViewGroup) null);
            C2553q3.m11133s((TextView) inflate.findViewById(R.id.config_toolbar_title));
            C2553q3.m11133s((TextView) inflate.findViewById(R.id.resize));
            TextView textView = (TextView) inflate.findViewById(R.id.horizontal_up);
            C2553q3.m11133s(textView);
            textView.setOnClickListener(new View$OnClickListenerC2803a());
            TextView textView2 = (TextView) inflate.findViewById(R.id.horizontal_down);
            C2553q3.m11133s(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2804b());
            C2553q3.m11133s((TextView) inflate.findViewById(R.id.spacing));
            TextView textView3 = (TextView) inflate.findViewById(R.id.spacing_up);
            C2553q3.m11133s(textView3);
            textView3.setOnClickListener(new View$OnClickListenerC2805c());
            TextView textView4 = (TextView) inflate.findViewById(R.id.spacing_down);
            C2553q3.m11133s(textView4);
            textView4.setOnClickListener(new View$OnClickListenerC2806d());
            C2553q3.m11133s((TextView) inflate.findViewById(R.id.padding));
            TextView textView5 = (TextView) inflate.findViewById(R.id.padding_up);
            C2553q3.m11133s(textView5);
            textView5.setOnClickListener(new View$OnClickListenerC2807e());
            TextView textView6 = (TextView) inflate.findViewById(R.id.padding_down);
            C2553q3.m11133s(textView6);
            textView6.setOnClickListener(new View$OnClickListenerC2808f());
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.icons_config);
            View findViewById = inflate.findViewById(R.id.divider2);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.padding_view);
            mo9366F1(w2, findViewById, linearLayout, linearLayout2);
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.none);
            C2553q3.m11133s(radioButton);
            radioButton.setChecked(w2.equals("none"));
            radioButton.setOnClickListener(new View$OnClickListenerC2809g(k1, findViewById, linearLayout, linearLayout2));
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.default_toolbar);
            C2553q3.m11133s(radioButton2);
            radioButton2.setChecked(w2.equals("default"));
            radioButton2.setOnClickListener(new View$OnClickListenerC2810h(k1, findViewById, linearLayout, linearLayout2));
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(R.id.icons_top);
            C2553q3.m11133s(radioButton3);
            radioButton3.setChecked(w2.equals("icons_top"));
            radioButton3.setOnClickListener(new View$OnClickListenerC2811i(k1, findViewById, linearLayout, linearLayout2));
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(R.id.icons_bottom);
            C2553q3.m11133s(radioButton4);
            radioButton4.setChecked(w2.equals("icons_bottom"));
            radioButton4.setOnClickListener(new View$OnClickListenerC2812j(k1, findViewById, linearLayout, linearLayout2));
            new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo240t(inflate).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2814l(k1)).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo9373y1() {
        if (!C2553q3.f8891a.f9415s.equals("")) {
            File file = new File(C2553q3.f8891a.f9415s);
            if (file.exists()) {
                LayoutInflater layoutInflater = getLayoutInflater();
                int i = 0;
                while (true) {
                    String[] strArr = f9488b0;
                    if (i < strArr.length) {
                        if (new File(file, strArr[i] + ".png").exists()) {
                            ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.toolbar_icon, (ViewGroup) null);
                            this.f9499m0[i] = imageView;
                            imageView.setOnClickListener(new View$OnClickListenerC2817o(i, f9490d0[i]));
                            imageView.setOnLongClickListener(new View$OnLongClickListenerC2818p());
                            imageView.setOnFocusChangeListener(new View$OnFocusChangeListenerC2819q(i));
                        }
                        i++;
                    } else {
                        this.f9500n0 = (ImageView) getLayoutInflater().inflate(R.layout.notification_announcement, (ViewGroup) null);
                        Resources resources = getResources();
                        Drawable drawable = resources.getDrawable(R.drawable.ic_announcements);
                        drawable.mutate();
                        drawable.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.SRC_ATOP));
                        this.f9500n0.setImageDrawable(drawable);
                        this.f9500n0.setOnFocusChangeListener(new View$OnFocusChangeListenerC2820r());
                        this.f9500n0.setOnClickListener(new View$OnClickListenerC2821s());
                        this.f9501o0 = (ImageView) getLayoutInflater().inflate(R.layout.notification_working, (ViewGroup) null);
                        Drawable drawable2 = resources.getDrawable(R.drawable.APKTOOL_DUMMY_97);
                        drawable2.mutate();
                        drawable2.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.SRC_ATOP));
                        this.f9501o0.setImageDrawable(drawable2);
                        this.f9501o0.setOnFocusChangeListener(new View$OnFocusChangeListenerC2822t());
                        this.f9501o0.setOnClickListener(new View$OnClickListenerC2823u());
                        this.f9497k0 = false;
                        this.f9498l0 = false;
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public abstract boolean mo8945z1(int i);
}
