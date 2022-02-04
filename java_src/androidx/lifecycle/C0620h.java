package androidx.lifecycle;

import androidx.lifecycle.AbstractC0614d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p006b.p015b.p016a.p018b.C0804a;
import p006b.p015b.p016a.p018b.C0805b;

/* renamed from: androidx.lifecycle.h */
public class C0620h extends AbstractC0614d {

    /* renamed from: b */
    private C0804a<AbstractC0618f, C0622b> f3033b = new C0804a<>();

    /* renamed from: c */
    private AbstractC0614d.EnumC0616b f3034c;

    /* renamed from: d */
    private final WeakReference<AbstractC0619g> f3035d;

    /* renamed from: e */
    private int f3036e = 0;

    /* renamed from: f */
    private boolean f3037f = false;

    /* renamed from: g */
    private boolean f3038g = false;

    /* renamed from: h */
    private ArrayList<AbstractC0614d.EnumC0616b> f3039h = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.h$a */
    public static /* synthetic */ class C0621a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3040a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3041b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0620h.C0621a.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.h$b */
    public static class C0622b {

        /* renamed from: a */
        AbstractC0614d.EnumC0616b f3042a;

        /* renamed from: b */
        AbstractC0617e f3043b;

        C0622b(AbstractC0618f fVar, AbstractC0614d.EnumC0616b bVar) {
            this.f3043b = C0624j.m3276f(fVar);
            this.f3042a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3671a(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
            AbstractC0614d.EnumC0616b h = C0620h.m3255h(aVar);
            this.f3042a = C0620h.m3257l(this.f3042a, h);
            this.f3043b.mo148d(gVar, aVar);
            this.f3042a = h;
        }
    }

    public C0620h(AbstractC0619g gVar) {
        this.f3035d = new WeakReference<>(gVar);
        this.f3034c = AbstractC0614d.EnumC0616b.INITIALIZED;
    }

    /* renamed from: d */
    private void m3251d(AbstractC0619g gVar) {
        Iterator<Map.Entry<AbstractC0618f, C0622b>> a = this.f3033b.mo4759a();
        while (a.hasNext() && !this.f3038g) {
            Map.Entry<AbstractC0618f, C0622b> next = a.next();
            C0622b value = next.getValue();
            while (value.f3042a.compareTo((Enum) this.f3034c) > 0 && !this.f3038g && this.f3033b.contains(next.getKey())) {
                AbstractC0614d.EnumC0615a f = m3253f(value.f3042a);
                m3260o(m3255h(f));
                value.mo3671a(gVar, f);
                m3259n();
            }
        }
    }

    /* renamed from: e */
    private AbstractC0614d.EnumC0616b m3252e(AbstractC0618f fVar) {
        Map.Entry<AbstractC0618f, C0622b> i = this.f3033b.mo4758i(fVar);
        AbstractC0614d.EnumC0616b bVar = null;
        AbstractC0614d.EnumC0616b bVar2 = i != null ? i.getValue().f3042a : null;
        if (!this.f3039h.isEmpty()) {
            ArrayList<AbstractC0614d.EnumC0616b> arrayList = this.f3039h;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m3257l(m3257l(this.f3034c, bVar2), bVar);
    }

    /* renamed from: f */
    private static AbstractC0614d.EnumC0615a m3253f(AbstractC0614d.EnumC0616b bVar) {
        int i = C0621a.f3041b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return AbstractC0614d.EnumC0615a.ON_DESTROY;
        } else {
            if (i == 3) {
                return AbstractC0614d.EnumC0615a.ON_STOP;
            }
            if (i == 4) {
                return AbstractC0614d.EnumC0615a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: b.b.a.b.a<androidx.lifecycle.f, androidx.lifecycle.h$b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private void m3254g(AbstractC0619g gVar) {
        C0805b<K, V>.C0809d d = this.f3033b.mo4761d();
        while (d.hasNext() && !this.f3038g) {
            Map.Entry entry = (Map.Entry) d.next();
            C0622b bVar = (C0622b) entry.getValue();
            while (bVar.f3042a.compareTo((Enum) this.f3034c) < 0 && !this.f3038g && this.f3033b.contains(entry.getKey())) {
                m3260o(bVar.f3042a);
                bVar.mo3671a(gVar, m3262r(bVar.f3042a));
                m3259n();
            }
        }
    }

    /* renamed from: h */
    static AbstractC0614d.EnumC0616b m3255h(AbstractC0614d.EnumC0615a aVar) {
        switch (C0621a.f3040a[aVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0614d.EnumC0616b.CREATED;
            case 3:
            case 4:
                return AbstractC0614d.EnumC0616b.STARTED;
            case 5:
                return AbstractC0614d.EnumC0616b.RESUMED;
            case 6:
                return AbstractC0614d.EnumC0616b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: j */
    private boolean m3256j() {
        if (this.f3033b.size() == 0) {
            return true;
        }
        AbstractC0614d.EnumC0616b bVar = this.f3033b.mo4760b().getValue().f3042a;
        AbstractC0614d.EnumC0616b bVar2 = this.f3033b.mo4762e().getValue().f3042a;
        return bVar == bVar2 && this.f3034c == bVar2;
    }

    /* renamed from: l */
    static AbstractC0614d.EnumC0616b m3257l(AbstractC0614d.EnumC0616b bVar, AbstractC0614d.EnumC0616b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: m */
    private void m3258m(AbstractC0614d.EnumC0616b bVar) {
        if (this.f3034c != bVar) {
            this.f3034c = bVar;
            if (this.f3037f || this.f3036e != 0) {
                this.f3038g = true;
                return;
            }
            this.f3037f = true;
            m3261q();
            this.f3037f = false;
        }
    }

    /* renamed from: n */
    private void m3259n() {
        ArrayList<AbstractC0614d.EnumC0616b> arrayList = this.f3039h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: o */
    private void m3260o(AbstractC0614d.EnumC0616b bVar) {
        this.f3039h.add(bVar);
    }

    /* renamed from: q */
    private void m3261q() {
        AbstractC0619g gVar = this.f3035d.get();
        if (gVar != null) {
            while (true) {
                boolean j = m3256j();
                this.f3038g = false;
                if (!j) {
                    if (this.f3034c.compareTo((Enum) this.f3033b.mo4760b().getValue().f3042a) < 0) {
                        m3251d(gVar);
                    }
                    Map.Entry<AbstractC0618f, C0622b> e = this.f3033b.mo4762e();
                    if (!this.f3038g && e != null && this.f3034c.compareTo((Enum) e.getValue().f3042a) > 0) {
                        m3254g(gVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: r */
    private static AbstractC0614d.EnumC0615a m3262r(AbstractC0614d.EnumC0616b bVar) {
        int i = C0621a.f3041b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0614d.EnumC0615a.ON_START;
            }
            if (i == 3) {
                return AbstractC0614d.EnumC0615a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return AbstractC0614d.EnumC0615a.ON_CREATE;
    }

    @Override // androidx.lifecycle.AbstractC0614d
    /* renamed from: a */
    public void mo3664a(AbstractC0618f fVar) {
        AbstractC0619g gVar;
        AbstractC0614d.EnumC0616b bVar = this.f3034c;
        AbstractC0614d.EnumC0616b bVar2 = AbstractC0614d.EnumC0616b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0614d.EnumC0616b.INITIALIZED;
        }
        C0622b bVar3 = new C0622b(fVar, bVar2);
        if (this.f3033b.mo4756g(fVar, bVar3) == null && (gVar = this.f3035d.get()) != null) {
            boolean z = this.f3036e != 0 || this.f3037f;
            AbstractC0614d.EnumC0616b e = m3252e(fVar);
            this.f3036e++;
            while (bVar3.f3042a.compareTo((Enum) e) < 0 && this.f3033b.contains(fVar)) {
                m3260o(bVar3.f3042a);
                bVar3.mo3671a(gVar, m3262r(bVar3.f3042a));
                m3259n();
                e = m3252e(fVar);
            }
            if (!z) {
                m3261q();
            }
            this.f3036e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0614d
    /* renamed from: b */
    public AbstractC0614d.EnumC0616b mo3665b() {
        return this.f3034c;
    }

    @Override // androidx.lifecycle.AbstractC0614d
    /* renamed from: c */
    public void mo3666c(AbstractC0618f fVar) {
        this.f3033b.mo4757h(fVar);
    }

    /* renamed from: i */
    public void mo3668i(AbstractC0614d.EnumC0615a aVar) {
        m3258m(m3255h(aVar));
    }

    @Deprecated
    /* renamed from: k */
    public void mo3669k(AbstractC0614d.EnumC0616b bVar) {
        mo3670p(bVar);
    }

    /* renamed from: p */
    public void mo3670p(AbstractC0614d.EnumC0616b bVar) {
        m3258m(bVar);
    }
}
