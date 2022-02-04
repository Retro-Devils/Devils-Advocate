package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.i */
public abstract class AbstractC0453i {

    /* renamed from: b */
    static final C0451g f2364b = new C0451g();

    /* renamed from: c */
    private C0451g f2365c = null;

    /* renamed from: androidx.fragment.app.i$a */
    public static abstract class AbstractC0454a {
    }

    /* renamed from: androidx.fragment.app.i$b */
    public interface AbstractC0455b {
        /* renamed from: a */
        void mo2741a();
    }

    /* renamed from: a */
    public abstract AbstractC0477n mo2729a();

    /* renamed from: b */
    public abstract void mo2730b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract boolean mo2731c();

    /* renamed from: d */
    public abstract Fragment mo2732d(String str);

    /* renamed from: e */
    public abstract Fragment mo2733e(Bundle bundle, String str);

    /* renamed from: f */
    public C0451g mo2734f() {
        if (this.f2365c == null) {
            this.f2365c = f2364b;
        }
        return this.f2365c;
    }

    /* renamed from: g */
    public abstract List<Fragment> mo2735g();

    /* renamed from: h */
    public abstract void mo2736h(int i, int i2);

    /* renamed from: i */
    public abstract boolean mo2737i();

    /* renamed from: j */
    public abstract void mo2738j(Bundle bundle, String str, Fragment fragment);

    /* renamed from: k */
    public abstract Fragment.C0440g mo2739k(Fragment fragment);

    /* renamed from: l */
    public void mo2740l(C0451g gVar) {
        this.f2365c = gVar;
    }
}
