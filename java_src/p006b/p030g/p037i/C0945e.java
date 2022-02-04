package p006b.p030g.p037i;

import java.util.Locale;

/* renamed from: b.g.i.e */
public final class C0945e {

    /* renamed from: a */
    public static final AbstractC0944d f4639a = new C0950e(null, false);

    /* renamed from: b */
    public static final AbstractC0944d f4640b = new C0950e(null, true);

    /* renamed from: c */
    public static final AbstractC0944d f4641c;

    /* renamed from: d */
    public static final AbstractC0944d f4642d;

    /* renamed from: e */
    public static final AbstractC0944d f4643e = new C0950e(C0946a.f4645a, false);

    /* renamed from: f */
    public static final AbstractC0944d f4644f = C0951f.f4650b;

    /* renamed from: b.g.i.e$a */
    private static class C0946a implements AbstractC0948c {

        /* renamed from: a */
        static final C0946a f4645a = new C0946a(true);

        /* renamed from: b */
        private final boolean f4646b;

        private C0946a(boolean z) {
            this.f4646b = z;
        }

        @Override // p006b.p030g.p037i.C0945e.AbstractC0948c
        /* renamed from: a */
        public int mo5390a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0945e.m5468a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f4646b) {
                        return 1;
                    }
                } else if (this.f4646b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f4646b ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: b.g.i.e$b */
    private static class C0947b implements AbstractC0948c {

        /* renamed from: a */
        static final C0947b f4647a = new C0947b();

        private C0947b() {
        }

        @Override // p006b.p030g.p037i.C0945e.AbstractC0948c
        /* renamed from: a */
        public int mo5390a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0945e.m5469b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.i.e$c */
    public interface AbstractC0948c {
        /* renamed from: a */
        int mo5390a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: b.g.i.e$d */
    private static abstract class AbstractC0949d implements AbstractC0944d {

        /* renamed from: a */
        private final AbstractC0948c f4648a;

        AbstractC0949d(AbstractC0948c cVar) {
            this.f4648a = cVar;
        }

        /* renamed from: c */
        private boolean m5473c(CharSequence charSequence, int i, int i2) {
            int a = this.f4648a.mo5390a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo5391b();
            }
            return false;
        }

        @Override // p006b.p030g.p037i.AbstractC0944d
        /* renamed from: a */
        public boolean mo5389a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f4648a == null ? mo5391b() : m5473c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo5391b();
    }

    /* renamed from: b.g.i.e$e */
    private static class C0950e extends AbstractC0949d {

        /* renamed from: b */
        private final boolean f4649b;

        C0950e(AbstractC0948c cVar, boolean z) {
            super(cVar);
            this.f4649b = z;
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p030g.p037i.C0945e.AbstractC0949d
        /* renamed from: b */
        public boolean mo5391b() {
            return this.f4649b;
        }
    }

    /* renamed from: b.g.i.e$f */
    private static class C0951f extends AbstractC0949d {

        /* renamed from: b */
        static final C0951f f4650b = new C0951f();

        C0951f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p030g.p037i.C0945e.AbstractC0949d
        /* renamed from: b */
        public boolean mo5391b() {
            return C0952f.m5479b(Locale.getDefault()) == 1;
        }
    }

    static {
        C0947b bVar = C0947b.f4647a;
        f4641c = new C0950e(bVar, false);
        f4642d = new C0950e(bVar, true);
    }

    /* renamed from: a */
    static int m5468a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m5469b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
