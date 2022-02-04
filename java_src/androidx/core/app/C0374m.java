package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0378a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.m */
public final class C0374m implements Iterable<Intent> {

    /* renamed from: b */
    private final ArrayList<Intent> f2053b = new ArrayList<>();

    /* renamed from: c */
    private final Context f2054c;

    /* renamed from: androidx.core.app.m$a */
    public interface AbstractC0375a {
        /* renamed from: k */
        Intent mo261k();
    }

    private C0374m(Context context) {
        this.f2054c = context;
    }

    /* renamed from: d */
    public static C0374m m1855d(Context context) {
        return new C0374m(context);
    }

    /* renamed from: a */
    public C0374m mo2206a(Intent intent) {
        this.f2053b.add(intent);
        return this;
    }

    /* renamed from: b */
    public C0374m mo2207b(Activity activity) {
        Intent k = activity instanceof AbstractC0375a ? ((AbstractC0375a) activity).mo261k() : null;
        if (k == null) {
            k = C0362f.m1799a(activity);
        }
        if (k != null) {
            ComponentName component = k.getComponent();
            if (component == null) {
                component = k.resolveActivity(this.f2054c.getPackageManager());
            }
            mo2208c(component);
            mo2206a(k);
        }
        return this;
    }

    /* renamed from: c */
    public C0374m mo2208c(ComponentName componentName) {
        int size = this.f2053b.size();
        try {
            Context context = this.f2054c;
            while (true) {
                Intent b = C0362f.m1800b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f2053b.add(size, b);
                context = this.f2054c;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public void mo2209e() {
        mo2210f(null);
    }

    /* renamed from: f */
    public void mo2210f(Bundle bundle) {
        if (!this.f2053b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2053b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0378a.m1877g(this.f2054c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2054c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2053b.iterator();
    }
}
