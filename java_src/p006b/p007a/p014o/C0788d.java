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
    private int f3935a;

    /* renamed from: b */
    private Resources.Theme f3936b;

    /* renamed from: c */
    private LayoutInflater f3937c;

    /* renamed from: d */
    private Configuration f3938d;

    /* renamed from: e */
    private Resources f3939e;

    public C0788d() {
        super(null);
    }

    public C0788d(Context context, int i) {
        super(context);
        this.f3935a = i;
    }

    public C0788d(Context context, Resources.Theme theme) {
        super(context);
        this.f3936b = theme;
    }

    /* renamed from: b */
    private Resources m4633b() {
        Resources resources;
        if (this.f3939e == null) {
            Configuration configuration = this.f3938d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f3938d);
                this.f3939e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f3939e = resources;
        }
        return this.f3939e;
    }

    /* renamed from: d */
    private void m4634d() {
        boolean z = this.f3936b == null;
        if (z) {
            this.f3936b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3936b.setTo(theme);
            }
        }
        mo4691e(this.f3936b, this.f3935a, z);
    }

    /* renamed from: a */
    public void mo4688a(Configuration configuration) {
        if (this.f3939e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3938d == null) {
            this.f3938d = new Configuration(configuration);
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
        return this.f3935a;
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
        if (this.f3937c == null) {
            this.f3937c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3937c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3936b;
        if (theme != null) {
            return theme;
        }
        if (this.f3935a == 0) {
            this.f3935a = C0762i.Theme_AppCompat_Light;
        }
        m4634d();
        return this.f3936b;
    }

    public void setTheme(int i) {
        if (this.f3935a != i) {
            this.f3935a = i;
            m4634d();
        }
    }
}
