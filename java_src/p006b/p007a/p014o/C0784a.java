package p006b.p007a.p014o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p006b.p007a.C0754a;
import p006b.p007a.C0755b;
import p006b.p007a.C0757d;
import p006b.p007a.C0763j;

/* renamed from: b.a.o.a */
public class C0784a {

    /* renamed from: a */
    private Context f3928a;

    private C0784a(Context context) {
        this.f3928a = context;
    }

    /* renamed from: b */
    public static C0784a m4602b(Context context) {
        return new C0784a(context);
    }

    /* renamed from: a */
    public boolean mo4678a() {
        return this.f3928a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo4679c() {
        return this.f3928a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo4680d() {
        Configuration configuration = this.f3928a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo4681e() {
        return this.f3928a.getResources().getDimensionPixelSize(C0757d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo4682f() {
        TypedArray obtainStyledAttributes = this.f3928a.obtainStyledAttributes(null, C0763j.f3702a, C0754a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0763j.f3747j, 0);
        Resources resources = this.f3928a.getResources();
        if (!mo4683g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0757d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo4683g() {
        return this.f3928a.getResources().getBoolean(C0755b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo4684h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f3928a).hasPermanentMenuKey();
    }
}
