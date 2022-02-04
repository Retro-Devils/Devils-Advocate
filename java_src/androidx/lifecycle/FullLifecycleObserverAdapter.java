package androidx.lifecycle;

import androidx.lifecycle.AbstractC0614d;

/* access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements AbstractC0617e {

    /* renamed from: a */
    private final AbstractC0612b f2995a;

    /* renamed from: b */
    private final AbstractC0617e f2996b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0606a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2997a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.d$a[] r0 = androidx.lifecycle.AbstractC0614d.EnumC0615a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a = r0
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.f2997a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.AbstractC0614d.EnumC0615a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0606a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(AbstractC0612b bVar, AbstractC0617e eVar) {
        this.f2995a = bVar;
        this.f2996b = eVar;
    }

    @Override // androidx.lifecycle.AbstractC0617e
    /* renamed from: d */
    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
        switch (C0606a.f2997a[aVar.ordinal()]) {
            case 1:
                this.f2995a.mo3659c(gVar);
                break;
            case 2:
                this.f2995a.mo3662g(gVar);
                break;
            case 3:
                this.f2995a.mo3657a(gVar);
                break;
            case 4:
                this.f2995a.mo3660e(gVar);
                break;
            case 5:
                this.f2995a.mo3661f(gVar);
                break;
            case 6:
                this.f2995a.mo3658b(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        AbstractC0617e eVar = this.f2996b;
        if (eVar != null) {
            eVar.mo148d(gVar, aVar);
        }
    }
}
