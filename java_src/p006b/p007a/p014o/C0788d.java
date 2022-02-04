package p006b.p007a.p014o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p006b.p007a.C0762i;

/* renamed from: b.a.o.d */
public class C0788d extends ContextWrapper {

    /* renamed from: a */
    private int f3931a;

    /* renamed from: b */
    private Resources.Theme f3932b;

    /* renamed from: c */
    private LayoutInflater f3933c;

    /* renamed from: d */
    private Configuration f3934d;

    /* renamed from: e */
    private Resources f3935e;

    public C0788d() {
        super(null);
    }

    public C0788d(Context context, int i) {
        super(context);
        this.f3931a = i;
    }

    public C0788d(Context context, Resources.Theme theme) {
        super(context);
        this.f3932b = theme;
    }

    /* renamed from: b */
    private Resources m4633b() {
        Resources resources;
        if (this.f3935e == null) {
            Configuration configuration = this.f3934d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f3934d);
                this.f3935e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f3935e = resources;
        }
        return this.f3935e;
    }

    /* renamed from: d */
    private void m4634d() {
        boolean z = this.f3932b == null;
        if (z) {
            this.f3932b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3932b.setTo(theme);
            }
        }
        mo4691e(this.f3932b, this.f3931a, z);
    }

    /* renamed from: a */
    public void mo4688a(Configuration configuration) {
        if (this.f3935e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3934d == null) {
            this.f3934d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo4690c() {
        return this.f3931a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo4691e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m4633b();
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3933c == null) {
            this.f3933c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3933c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3932b;
        if (theme != null) {
            return theme;
        }
        if (this.f3931a == 0) {
            this.f3931a = C0762i.Theme_AppCompat_Light;
        }
        m4634d();
        return this.f3932b;
    }

    public void setTheme(int i) {
        if (this.f3931a != i) {
            this.f3931a = i;
            m4634d();
        }
    }
}
